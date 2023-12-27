import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;
import org.json.JSONArray;
import org.json.JSONObject;

public class ConvertPy {
  private static final int MAX_DEPTH = 1000;
  
  Vocabulary vocab;
  // ArrayList<String> identifiersRuleNames =//
  //     new ArrayList<String>(
  //         Arrays.asList(
  //             "IDENTIFIER",
  //             "localVar",
  //             "CHAR_LITERAL",
  //             "STRING_LITERAL",
  //             "BOOL_LITERAL",
  //             "NULL_LITERAL",
  //             "DECIMAL_LITERAL",
  //             // "DECIMAL_INTEGER",
  //             "HEX_LITERAL",
  //             // "HEX_INTEGER",
  //             "OCT_LITERAL",
  //             // "OCT_INTEGER",
  //             "BINARY_LITERAL",
  //             // "BINARY_INTEGER",
  //             "FLOAT_LITERAL",
  //             // "FLOAT_NUMBER",
  //             "HEX_FLOAT_LITERAL",
              
              // "NAME"));
    ArrayList<String> identifiersRuleNames =
      new ArrayList<String>(
          Arrays.asList(
              "IDENTIFIER",
              "localVar",
              "CHAR_LITERAL",
              "STRING_LITERAL",
              "BOOL_LITERAL",
              "NULL_LITERAL",
              // "DECIMAL_LITERAL",
              "DECIMAL_INTEGER",
              // "HEX_LITERAL",
              "HEX_INTEGER",
              // "OCT_LITERAL",
              "OCT_INTEGER",
              // "BINARY_LITERAL",
              "BINARY_INTEGER",
              // "FLOAT_LITERAL",
              "FLOAT_NUMBER",
              // "HEX_FLOAT_LITERAL",
              "NAME"
              ));


  ArrayList<String> localVarContexts =
      new ArrayList<String>(
          // Arrays.asList("variableDeclaratorId", "primary", "catchClause", "lambdaParameters");
        Arrays.asList("atom"));
  List<String> ruleNames = null;

  private void setRuleNames(Parser recog) {
    String[] ruleNames = recog != null ? recog.getRuleNames() : null;
    this.ruleNames = ruleNames != null ? Arrays.asList(ruleNames) : null;
  }

  public String getRuleName(Tree t) {
    int ruleIndex = ((RuleNode) t).getRuleContext().getRuleIndex();
    return ruleNames.get(ruleIndex);
  }

  public void openWriter(String file) throws FileNotFoundException {
    writer = new PrintWriter(file);
  }

  public void closeWriter() {
    writer.close();
  }

  private int totalFiles = 0;
  private int successFullFiles = 0;
  private int totalMethods = 0;

  public void serializeFile(String f, String startSymbol) {
    try {
      long t1, t2, t3;

      t1 = System.currentTimeMillis();
      totalFiles++;
      Class classDefinition;
      Class[] type;
      Object[] obj;

      thisFileName = f;
      stackDepth = 0;
      Lexer lexer = new PythonLexer(new ANTLRFileStream(f));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      vocab = lexer.getVocabulary();
      
      Parser parser = new PythonParser(tokens);
      parser.setErrorHandler(new BailErrorStrategy());

      Method method = parser.getClass().getMethod(startSymbol);
      ParserRuleContext t = (ParserRuleContext) method.invoke(parser);
      System.out.println(tokens.getText());
      System.out.println(t.toStringTree(parser));
      parser.setBuildParseTree(false);
      setRuleNames(parser);

      t2 = System.currentTimeMillis();

      JSONArray tree = getSerializedTree(t, tokens);
      if (tree.length() == 2) {
        tree = tree.getJSONArray(1);
      }
      successFullFiles++;

      t3 = System.currentTimeMillis();
      System.out.println("Parsing, Processing times: " + (t2 - t1) + ", " + (t3 - t2));
      System.out.println(
          "Total processed files, Successfully processed file, total methods: "
              + totalFiles
              + ", "
              + successFullFiles
              + ", "
              + totalMethods
              + ", "
              + thisFileName);
      //            System.out.println(tree.toString(4));
    } catch (Exception e) {
      System.out.println(
          "Total processed files, Successfully processed file, total methods: "
              + totalFiles
              + ", "
              + successFullFiles
              + ", "
              + totalMethods
              + ", "
              + thisFileName);
      System.err.println("Parser Exception: " + e);
      e.printStackTrace(); // so we can get the stack trace
    }
  }

  private String getLeadingOrTrailing(ParseTree tree, CommonTokenStream tokens, boolean isBefore) {
    int lastIndexOfToken;
    StringBuilder builder = new StringBuilder("");
    lastIndexOfToken = ((TerminalNodeImpl) tree).getSymbol().getTokenIndex();
    List<Token> ws = null;
    int HIDDEN = 1;
    if (lastIndexOfToken < 0) {
      return "";
    }
    if (isBefore) {
      ws = tokens.getHiddenTokensToLeft(lastIndexOfToken, HIDDEN);
    } else if (lastIndexOfToken >= 0 || lastIndexOfToken == -2) {
      ws = tokens.getHiddenTokensToRight(lastIndexOfToken, HIDDEN);
    }

    if (ws != null) {
      for (Token wst : ws) {
        builder.append(wst.getText());
      }
    }
    return builder.toString();
  }

  private boolean childHasLeaf;
  private String thisClassName;
  private String thisMethodName;
  private String thisFileName;
  private int beginLine, endLine;
  private PrintWriter writer;
  private int stackDepth = 0;

  private void setClassName(String thisRuleName, RuleContext t, int i) {
    // using the parent, as our class name is nested within NAME
    System.out.println("setting class");
    if (thisRuleName.equals("class_def_raw") && i > 0) {
      ParseTree prev = t.getChild(i - 1);
      ParseTree curr = t.getChild(i);
      System.out.println(curr);
      if (prev instanceof TerminalNodeImpl
          && curr instanceof TerminalNodeImpl
          && prev.getText().equals("class")) {
        Token thisToken = ((TerminalNodeImpl) curr).getSymbol();
        String ruleName = vocab.getDisplayName(thisToken.getType());

        if (ruleName.equals("NAME")) {
          thisClassName = thisToken.getText();
          System.out.println("Processing Class: " + thisClassName);
        }
      }
    }
  }

  // private void setMethodName(String thisRuleName, RuleContext t) {
  //     if (thisRuleName.equals("methodDeclaration")) {
  //         //System.out.println("Processing Method: " + t.getText());
  //         this.thisMethodName = t.getChild(1).getText();
  //         //System.out.println("*********"+this.thisMethodName);
  //     }
  //
  // }

  private void dumpMethodAst(String thisRuleName, JSONArray simpleTree) {
    // System.out.println("dumpMethod");
    // System.out.println(thisClassName);
    // System.out.println(thisRuleName);
    if (thisClassName != null && thisRuleName.equals("function_def_raw")) {
    // if(thisClassName != null){
      if (simpleTree.length() == 2) {
        try {
          simpleTree = simpleTree.getJSONArray(1);
        } catch (Exception e) {
          //                    System.err.println(simpleTree);
          //                    e.printStackTrace();
          //                    System.out.println("In " + thisFileName + ":" + thisClassName + ":" + thisMethodName+":"+beginLine);
          return;
        }
      }
      JSONObject tmp = new JSONObject();
      tmp.put("path", thisFileName);
      tmp.put("class", thisClassName);
      tmp.put("method", thisMethodName);
      tmp.put("beginline", beginLine);
      tmp.put("endline", endLine);
      tmp.put("ast", simpleTree);
      writer.println(tmp);
      writer.flush();
      System.out.println(tmp);
      totalMethods++;
      System.out.println("Logged " + thisFileName + ":" + thisClassName + ":" + thisMethodName);
    }
  }

  private JSONArray getSerializedTree(RuleContext t, CommonTokenStream tokens) {
    stackDepth++;
    int n = t.getChildCount();
    boolean hasLeaf = false;
    if (n == 0 || stackDepth > MAX_DEPTH) {
      childHasLeaf = false;
      stackDepth--;
      return null;
    }
    String thisRuleName = getRuleName(t);
    String oldClassName = null;
    String oldMethodName = null;
    int oldBeginLine = 0;

    if (thisRuleName.equals("class_def_raw")) {
      System.out.println("in this");
      oldClassName = thisClassName;
    }
    if (thisRuleName.equals("func_def_raw")) {
      oldMethodName = thisMethodName;
      // System.out.println(t.getChild(1).getText());
      thisMethodName = t.getChild(1).getText();
      // oldBeginLine = beginLine;
      // beginLine = ((TerminalNodeImpl) t.getChild(1)).getSymbol().getLine();
    }

    JSONArray simpleTree = new JSONArray();
    simpleTree.put("");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      ParseTree tree = t.getChild(i);
      if (tree instanceof TerminalNodeImpl) {
        String s = tree.getText();
        // System.out.println("s is <" + tree.getPayload() + ">");
        if (!s.equals("<EOF>")) {
          Token thisToken = ((TerminalNodeImpl) tree).getSymbol();
          String ruleName = vocab.getDisplayName(thisToken.getType());
          
          System.out.println("---------");
          System.out.println(thisRuleName);
          System.out.println("rule name is " + ruleName);

          String ws1 = getLeadingOrTrailing(tree, tokens, true);
          String ws2 = getLeadingOrTrailing(tree, tokens, false);

          JSONObject tok = new JSONObject();
          tok.put("token", s);
          tok.put("leading", ws1);
          tok.put("trailing", ws2);
          boolean isLeaf;
          // System.out.println(s);
          // System.out.println(ruleName);
          // System.out.println(thisRuleName);
          if (identifiersRuleNames.contains(ruleName)) {
            System.out.println("found");
            if (localVarContexts.contains(thisRuleName)) {
              System.out.println("localVarContexts");
              tok.put("var", true);
              System.out.println(s);
            }
            isLeaf = true;
            sb.append("#");
            hasLeaf = true;
            setClassName(thisRuleName, t, i);
          } else {
            isLeaf = false;
            sb.append(s);
          }
          if (isLeaf) tok.put("leaf", isLeaf);
          tok.put("line", thisToken.getLine());
          endLine = thisToken.getLine();
          simpleTree.put(tok);
        }
      } else {
        // passing through i, as this is the position in the parent tree (used for class definitions etc)
        JSONArray child = getSerializedTree((RuleContext) tree, tokens);
        // System.out.println("child is " + child);
        if (child != null && child.length() > 0) {
          if (child.length() == 2) {
            simpleTree.put(child.get(1));
            sb.append(child.get(0));
            hasLeaf = hasLeaf || childHasLeaf;

          } else if (!childHasLeaf
            // TODO do we need to check "{}" in python? 
              && !child.get(0).equals("{}")) { // see the while(m.find()){} query
            sb.append(child.get(0));
           
            for (int j = 1; j < child.length(); j++) {
              simpleTree.put(child.get(j));
            }

          } else {
            sb.append("#");
            hasLeaf = true;
            simpleTree.put(child);
          }
        }
      }
    }
    simpleTree.put(0, sb.toString());
    childHasLeaf = hasLeaf;
    // System.out.println(sb.toString());
    dumpMethodAst(thisRuleName, simpleTree);

    if (thisRuleName.equals("class_def_raw")) {
      thisClassName = oldClassName;
    }
    if (thisRuleName.equals("func_def_raw")) {
      thisMethodName = oldMethodName;
      beginLine = oldBeginLine;
    }

    stackDepth--;
    return simpleTree;
  }

  public static void main(String args[]) throws IOException {
    ConvertPy p = new ConvertPy();
    p.openWriter(args[1]);
    if (Files.isRegularFile(new File(args[2]).toPath())) {
      p.serializeFile(args[2], args[0]);
    } else {
      Files.walk(Paths.get(args[2]))
          .filter(path -> !Files.isDirectory(path) && path.toString().endsWith(".py"))
          .forEach(path -> p.serializeFile(path.normalize().toString(), args[0]));
    }
    p.closeWriter();
  }
}
