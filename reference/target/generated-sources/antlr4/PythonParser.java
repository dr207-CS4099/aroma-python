// Generated from PythonParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonParser extends PythonParserBase {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, FSTRING_START=3, FSTRING_MIDDLE=4, FSTRING_END=5, 
		FALSE=6, AWAIT=7, ELSE=8, IMPORT=9, PASS=10, NONE=11, BREAK=12, EXCEPT=13, 
		IN=14, RAISE=15, TRUE=16, CLASS=17, FINALLY=18, IS=19, RETURN=20, AND=21, 
		CONTINUE=22, FOR=23, LAMBDA=24, TRY=25, AS=26, DEF=27, FROM=28, NONLOCAL=29, 
		WHILE=30, ASSERT=31, DEL=32, GLOBAL=33, NOT=34, WITH=35, ASYNC=36, ELIF=37, 
		IF=38, OR=39, YIELD=40, LPAR=41, LSQB=42, LBRACE=43, RPAR=44, RSQB=45, 
		RBRACE=46, DOT=47, COLON=48, COMMA=49, SEMI=50, PLUS=51, MINUS=52, STAR=53, 
		SLASH=54, VBAR=55, AMPER=56, LESS=57, GREATER=58, EQUAL=59, PERCENT=60, 
		EQEQUAL=61, NOTEQUAL=62, LESSEQUAL=63, GREATEREQUAL=64, TILDE=65, CIRCUMFLEX=66, 
		LEFTSHIFT=67, RIGHTSHIFT=68, DOUBLESTAR=69, PLUSEQUAL=70, MINEQUAL=71, 
		STAREQUAL=72, SLASHEQUAL=73, PERCENTEQUAL=74, AMPEREQUAL=75, VBAREQUAL=76, 
		CIRCUMFLEXEQUAL=77, LEFTSHIFTEQUAL=78, RIGHTSHIFTEQUAL=79, DOUBLESTAREQUAL=80, 
		DOUBLESLASH=81, DOUBLESLASHEQUAL=82, AT=83, ATEQUAL=84, RARROW=85, ELLIPSIS=86, 
		COLONEQUAL=87, EXCLAMATION=88, NAME=89, NUMBER=90, STRING=91, TYPE_COMMENT=92, 
		NEWLINE=93, COMMENT=94, WS=95, EXPLICIT_LINE_JOINING=96, ERROR_TOKEN=97;
	public static final int
		RULE_file_input = 0, RULE_interactive = 1, RULE_eval = 2, RULE_func_type = 3, 
		RULE_fstring_input = 4, RULE_statements = 5, RULE_statement = 6, RULE_statement_newline = 7, 
		RULE_simple_stmts = 8, RULE_simple_stmt = 9, RULE_compound_stmt = 10, 
		RULE_assignment = 11, RULE_annotated_rhs = 12, RULE_augassign = 13, RULE_return_stmt = 14, 
		RULE_raise_stmt = 15, RULE_global_stmt = 16, RULE_nonlocal_stmt = 17, 
		RULE_del_stmt = 18, RULE_yield_stmt = 19, RULE_assert_stmt = 20, RULE_import_stmt = 21, 
		RULE_import_name = 22, RULE_import_from = 23, RULE_import_from_targets = 24, 
		RULE_import_from_as_names = 25, RULE_import_from_as_name = 26, RULE_dotted_as_names = 27, 
		RULE_dotted_as_name = 28, RULE_dotted_name = 29, RULE_block = 30, RULE_decorators = 31, 
		RULE_class_def = 32, RULE_class_def_raw = 33, RULE_function_def = 34, 
		RULE_function_def_raw = 35, RULE_params = 36, RULE_parameters = 37, RULE_slash_no_default = 38, 
		RULE_slash_with_default = 39, RULE_star_etc = 40, RULE_kwds = 41, RULE_param_no_default = 42, 
		RULE_param_no_default_star_annotation = 43, RULE_param_with_default = 44, 
		RULE_param_maybe_default = 45, RULE_param = 46, RULE_param_star_annotation = 47, 
		RULE_annotation = 48, RULE_star_annotation = 49, RULE_default_assignment = 50, 
		RULE_if_stmt = 51, RULE_elif_stmt = 52, RULE_else_block = 53, RULE_while_stmt = 54, 
		RULE_for_stmt = 55, RULE_with_stmt = 56, RULE_with_item = 57, RULE_try_stmt = 58, 
		RULE_except_block = 59, RULE_except_star_block = 60, RULE_finally_block = 61, 
		RULE_match_stmt = 62, RULE_subject_expr = 63, RULE_case_block = 64, RULE_guard = 65, 
		RULE_patterns = 66, RULE_pattern = 67, RULE_as_pattern = 68, RULE_or_pattern = 69, 
		RULE_closed_pattern = 70, RULE_literal_pattern = 71, RULE_literal_expr = 72, 
		RULE_complex_number = 73, RULE_signed_number = 74, RULE_signed_real_number = 75, 
		RULE_real_number = 76, RULE_imaginary_number = 77, RULE_capture_pattern = 78, 
		RULE_pattern_capture_target = 79, RULE_wildcard_pattern = 80, RULE_value_pattern = 81, 
		RULE_attr = 82, RULE_name_or_attr = 83, RULE_group_pattern = 84, RULE_sequence_pattern = 85, 
		RULE_open_sequence_pattern = 86, RULE_maybe_sequence_pattern = 87, RULE_maybe_star_pattern = 88, 
		RULE_star_pattern = 89, RULE_mapping_pattern = 90, RULE_items_pattern = 91, 
		RULE_key_value_pattern = 92, RULE_double_star_pattern = 93, RULE_class_pattern = 94, 
		RULE_positional_patterns = 95, RULE_keyword_patterns = 96, RULE_keyword_pattern = 97, 
		RULE_type_alias = 98, RULE_type_params = 99, RULE_type_param_seq = 100, 
		RULE_type_param = 101, RULE_type_param_bound = 102, RULE_expressions = 103, 
		RULE_expression = 104, RULE_yield_expr = 105, RULE_star_expressions = 106, 
		RULE_star_expression = 107, RULE_star_named_expressions = 108, RULE_star_named_expression = 109, 
		RULE_assignment_expression = 110, RULE_named_expression = 111, RULE_disjunction = 112, 
		RULE_conjunction = 113, RULE_inversion = 114, RULE_comparison = 115, RULE_compare_op_bitwise_or_pair = 116, 
		RULE_eq_bitwise_or = 117, RULE_noteq_bitwise_or = 118, RULE_lte_bitwise_or = 119, 
		RULE_lt_bitwise_or = 120, RULE_gte_bitwise_or = 121, RULE_gt_bitwise_or = 122, 
		RULE_notin_bitwise_or = 123, RULE_in_bitwise_or = 124, RULE_isnot_bitwise_or = 125, 
		RULE_is_bitwise_or = 126, RULE_bitwise_or = 127, RULE_bitwise_xor = 128, 
		RULE_bitwise_and = 129, RULE_shift_expr = 130, RULE_sum = 131, RULE_term = 132, 
		RULE_factor = 133, RULE_power = 134, RULE_await_primary = 135, RULE_primary = 136, 
		RULE_slices = 137, RULE_slice = 138, RULE_atom = 139, RULE_group = 140, 
		RULE_lambdef = 141, RULE_lambda_params = 142, RULE_lambda_parameters = 143, 
		RULE_lambda_slash_no_default = 144, RULE_lambda_slash_with_default = 145, 
		RULE_lambda_star_etc = 146, RULE_lambda_kwds = 147, RULE_lambda_param_no_default = 148, 
		RULE_lambda_param_with_default = 149, RULE_lambda_param_maybe_default = 150, 
		RULE_lambda_param = 151, RULE_fstring_middle = 152, RULE_fstring_replacement_field = 153, 
		RULE_fstring_conversion = 154, RULE_fstring_full_format_spec = 155, RULE_fstring_format_spec = 156, 
		RULE_fstring = 157, RULE_string = 158, RULE_strings = 159, RULE_list = 160, 
		RULE_tuple = 161, RULE_set = 162, RULE_dict = 163, RULE_double_starred_kvpairs = 164, 
		RULE_double_starred_kvpair = 165, RULE_kvpair = 166, RULE_for_if_clauses = 167, 
		RULE_for_if_clause = 168, RULE_listcomp = 169, RULE_setcomp = 170, RULE_genexp = 171, 
		RULE_dictcomp = 172, RULE_arguments = 173, RULE_args = 174, RULE_kwargs = 175, 
		RULE_starred_expression = 176, RULE_kwarg_or_starred = 177, RULE_kwarg_or_double_starred = 178, 
		RULE_star_targets = 179, RULE_star_targets_list_seq = 180, RULE_star_targets_tuple_seq = 181, 
		RULE_star_target = 182, RULE_target_with_star_atom = 183, RULE_star_atom = 184, 
		RULE_single_target = 185, RULE_single_subscript_attribute_target = 186, 
		RULE_t_primary = 187, RULE_del_targets = 188, RULE_del_target = 189, RULE_del_t_atom = 190, 
		RULE_type_expressions = 191, RULE_func_type_comment = 192, RULE_soft_kw_match = 193, 
		RULE_soft_kw_case = 194, RULE_soft_kw_wildcard = 195, RULE_soft_kw_type = 196;
	public static final String[] ruleNames = {
		"file_input", "interactive", "eval", "func_type", "fstring_input", "statements", 
		"statement", "statement_newline", "simple_stmts", "simple_stmt", "compound_stmt", 
		"assignment", "annotated_rhs", "augassign", "return_stmt", "raise_stmt", 
		"global_stmt", "nonlocal_stmt", "del_stmt", "yield_stmt", "assert_stmt", 
		"import_stmt", "import_name", "import_from", "import_from_targets", "import_from_as_names", 
		"import_from_as_name", "dotted_as_names", "dotted_as_name", "dotted_name", 
		"block", "decorators", "class_def", "class_def_raw", "function_def", "function_def_raw", 
		"params", "parameters", "slash_no_default", "slash_with_default", "star_etc", 
		"kwds", "param_no_default", "param_no_default_star_annotation", "param_with_default", 
		"param_maybe_default", "param", "param_star_annotation", "annotation", 
		"star_annotation", "default_assignment", "if_stmt", "elif_stmt", "else_block", 
		"while_stmt", "for_stmt", "with_stmt", "with_item", "try_stmt", "except_block", 
		"except_star_block", "finally_block", "match_stmt", "subject_expr", "case_block", 
		"guard", "patterns", "pattern", "as_pattern", "or_pattern", "closed_pattern", 
		"literal_pattern", "literal_expr", "complex_number", "signed_number", 
		"signed_real_number", "real_number", "imaginary_number", "capture_pattern", 
		"pattern_capture_target", "wildcard_pattern", "value_pattern", "attr", 
		"name_or_attr", "group_pattern", "sequence_pattern", "open_sequence_pattern", 
		"maybe_sequence_pattern", "maybe_star_pattern", "star_pattern", "mapping_pattern", 
		"items_pattern", "key_value_pattern", "double_star_pattern", "class_pattern", 
		"positional_patterns", "keyword_patterns", "keyword_pattern", "type_alias", 
		"type_params", "type_param_seq", "type_param", "type_param_bound", "expressions", 
		"expression", "yield_expr", "star_expressions", "star_expression", "star_named_expressions", 
		"star_named_expression", "assignment_expression", "named_expression", 
		"disjunction", "conjunction", "inversion", "comparison", "compare_op_bitwise_or_pair", 
		"eq_bitwise_or", "noteq_bitwise_or", "lte_bitwise_or", "lt_bitwise_or", 
		"gte_bitwise_or", "gt_bitwise_or", "notin_bitwise_or", "in_bitwise_or", 
		"isnot_bitwise_or", "is_bitwise_or", "bitwise_or", "bitwise_xor", "bitwise_and", 
		"shift_expr", "sum", "term", "factor", "power", "await_primary", "primary", 
		"slices", "slice", "atom", "group", "lambdef", "lambda_params", "lambda_parameters", 
		"lambda_slash_no_default", "lambda_slash_with_default", "lambda_star_etc", 
		"lambda_kwds", "lambda_param_no_default", "lambda_param_with_default", 
		"lambda_param_maybe_default", "lambda_param", "fstring_middle", "fstring_replacement_field", 
		"fstring_conversion", "fstring_full_format_spec", "fstring_format_spec", 
		"fstring", "string", "strings", "list", "tuple", "set", "dict", "double_starred_kvpairs", 
		"double_starred_kvpair", "kvpair", "for_if_clauses", "for_if_clause", 
		"listcomp", "setcomp", "genexp", "dictcomp", "arguments", "args", "kwargs", 
		"starred_expression", "kwarg_or_starred", "kwarg_or_double_starred", "star_targets", 
		"star_targets_list_seq", "star_targets_tuple_seq", "star_target", "target_with_star_atom", 
		"star_atom", "single_target", "single_subscript_attribute_target", "t_primary", 
		"del_targets", "del_target", "del_t_atom", "type_expressions", "func_type_comment", 
		"soft_kw_match", "soft_kw_case", "soft_kw_wildcard", "soft_kw_type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'False'", "'await'", "'else'", "'import'", 
		"'pass'", "'None'", "'break'", "'except'", "'in'", "'raise'", "'True'", 
		"'class'", "'finally'", "'is'", "'return'", "'and'", "'continue'", "'for'", 
		"'lambda'", "'try'", "'as'", "'def'", "'from'", "'nonlocal'", "'while'", 
		"'assert'", "'del'", "'global'", "'not'", "'with'", "'async'", "'elif'", 
		"'if'", "'or'", "'yield'", "'('", "'['", null, "')'", "']'", null, "'.'", 
		"':'", "','", "';'", "'+'", "'-'", "'*'", "'/'", "'|'", "'&'", "'<'", 
		"'>'", "'='", "'%'", "'=='", "'!='", "'<='", "'>='", "'~'", "'^'", "'<<'", 
		"'>>'", "'**'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", 
		"'^='", "'<<='", "'>>='", "'**='", "'//'", "'//='", "'@'", "'@='", "'->'", 
		"'...'", "':='", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "FSTRING_START", "FSTRING_MIDDLE", "FSTRING_END", 
		"FALSE", "AWAIT", "ELSE", "IMPORT", "PASS", "NONE", "BREAK", "EXCEPT", 
		"IN", "RAISE", "TRUE", "CLASS", "FINALLY", "IS", "RETURN", "AND", "CONTINUE", 
		"FOR", "LAMBDA", "TRY", "AS", "DEF", "FROM", "NONLOCAL", "WHILE", "ASSERT", 
		"DEL", "GLOBAL", "NOT", "WITH", "ASYNC", "ELIF", "IF", "OR", "YIELD", 
		"LPAR", "LSQB", "LBRACE", "RPAR", "RSQB", "RBRACE", "DOT", "COLON", "COMMA", 
		"SEMI", "PLUS", "MINUS", "STAR", "SLASH", "VBAR", "AMPER", "LESS", "GREATER", 
		"EQUAL", "PERCENT", "EQEQUAL", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", 
		"TILDE", "CIRCUMFLEX", "LEFTSHIFT", "RIGHTSHIFT", "DOUBLESTAR", "PLUSEQUAL", 
		"MINEQUAL", "STAREQUAL", "SLASHEQUAL", "PERCENTEQUAL", "AMPEREQUAL", "VBAREQUAL", 
		"CIRCUMFLEXEQUAL", "LEFTSHIFTEQUAL", "RIGHTSHIFTEQUAL", "DOUBLESTAREQUAL", 
		"DOUBLESLASH", "DOUBLESLASHEQUAL", "AT", "ATEQUAL", "RARROW", "ELLIPSIS", 
		"COLONEQUAL", "EXCLAMATION", "NAME", "NUMBER", "STRING", "TYPE_COMMENT", 
		"NEWLINE", "COMMENT", "WS", "EXPLICIT_LINE_JOINING", "ERROR_TOKEN"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFile_input(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(394);
				statements();
				}
				break;
			}
			setState(397);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InteractiveContext extends ParserRuleContext {
		public Statement_newlineContext statement_newline() {
			return getRuleContext(Statement_newlineContext.class,0);
		}
		public InteractiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interactive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInteractive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInteractive(this);
		}
	}

	public final InteractiveContext interactive() throws RecognitionException {
		InteractiveContext _localctx = new InteractiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_interactive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			statement_newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvalContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			expressions();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(402);
				match(NEWLINE);
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_typeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public Type_expressionsContext type_expressions() {
			return getRuleContext(Type_expressionsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public Func_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunc_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunc_type(this);
		}
	}

	public final Func_typeContext func_type() throws RecognitionException {
		Func_typeContext _localctx = new Func_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(LPAR);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (DOUBLESTAR - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				setState(411);
				type_expressions();
				}
			}

			setState(414);
			match(RPAR);
			setState(415);
			match(RARROW);
			setState(416);
			expression();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(417);
				match(NEWLINE);
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fstring_inputContext extends ParserRuleContext {
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Fstring_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstring_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstring_input(this);
		}
	}

	public final Fstring_inputContext fstring_input() throws RecognitionException {
		Fstring_inputContext _localctx = new Fstring_inputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fstring_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			star_expressions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(427);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(430); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				simple_stmts();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_newlineContext extends ParserRuleContext {
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public Statement_newlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStatement_newline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStatement_newline(this);
		}
	}

	public final Statement_newlineContext statement_newline() throws RecognitionException {
		Statement_newlineContext _localctx = new Statement_newlineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement_newline);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				compound_stmt();
				setState(437);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				simple_stmts();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_stmtsContext extends ParserRuleContext {
		public List<Simple_stmtContext> simple_stmt() {
			return getRuleContexts(Simple_stmtContext.class);
		}
		public Simple_stmtContext simple_stmt(int i) {
			return getRuleContext(Simple_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public Simple_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimple_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimple_stmts(this);
		}
	}

	public final Simple_stmtsContext simple_stmts() throws RecognitionException {
		Simple_stmtsContext _localctx = new Simple_stmtsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			simple_stmt();
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(445);
					match(SEMI);
					setState(446);
					simple_stmt();
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(452);
				match(SEMI);
				}
			}

			setState(455);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_stmtContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Type_aliasContext type_alias() {
			return getRuleContext(Type_aliasContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public Yield_stmtContext yield_stmt() {
			return getRuleContext(Yield_stmtContext.class,0);
		}
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public Nonlocal_stmtContext nonlocal_stmt() {
			return getRuleContext(Nonlocal_stmtContext.class,0);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimple_stmt(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_stmt);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				type_alias();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				star_expressions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				return_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				import_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				raise_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				match(PASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(464);
				del_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(465);
				yield_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(466);
				assert_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(467);
				match(BREAK);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(468);
				match(CONTINUE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(469);
				global_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(470);
				nonlocal_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Match_stmtContext match_stmt() {
			return getRuleContext(Match_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compound_stmt);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				function_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				class_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				with_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(477);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(478);
				try_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(479);
				while_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(480);
				match_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Annotated_rhsContext annotated_rhs() {
			return getRuleContext(Annotated_rhsContext.class,0);
		}
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public Single_subscript_attribute_targetContext single_subscript_attribute_target() {
			return getRuleContext(Single_subscript_attribute_targetContext.class,0);
		}
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public List<Star_targetsContext> star_targets() {
			return getRuleContexts(Star_targetsContext.class);
		}
		public Star_targetsContext star_targets(int i) {
			return getRuleContext(Star_targetsContext.class,i);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		int _la;
		try {
			int _alt;
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(NAME);
				setState(484);
				match(COLON);
				setState(485);
				expression();
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(486);
					match(EQUAL);
					setState(487);
					annotated_rhs();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(490);
					match(LPAR);
					setState(491);
					single_target();
					setState(492);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(494);
					single_subscript_attribute_target();
					}
					break;
				}
				setState(497);
				match(COLON);
				setState(498);
				expression();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(499);
					match(EQUAL);
					setState(500);
					annotated_rhs();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(503);
						star_targets();
						setState(504);
						match(EQUAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(508); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(512);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(510);
					yield_expr();
					}
					break;
				case FSTRING_START:
				case FALSE:
				case AWAIT:
				case NONE:
				case TRUE:
				case LAMBDA:
				case NOT:
				case LPAR:
				case LSQB:
				case LBRACE:
				case PLUS:
				case MINUS:
				case STAR:
				case TILDE:
				case ELLIPSIS:
				case NAME:
				case NUMBER:
				case STRING:
					{
					setState(511);
					star_expressions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(514);
					match(TYPE_COMMENT);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				single_target();
				setState(518);
				augassign();
				setState(521);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(519);
					yield_expr();
					}
					break;
				case FSTRING_START:
				case FALSE:
				case AWAIT:
				case NONE:
				case TRUE:
				case LAMBDA:
				case NOT:
				case LPAR:
				case LSQB:
				case LBRACE:
				case PLUS:
				case MINUS:
				case STAR:
				case TILDE:
				case ELLIPSIS:
				case NAME:
				case NUMBER:
				case STRING:
					{
					setState(520);
					star_expressions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotated_rhsContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Annotated_rhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotated_rhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnotated_rhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnotated_rhs(this);
		}
	}

	public final Annotated_rhsContext annotated_rhs() throws RecognitionException {
		Annotated_rhsContext _localctx = new Annotated_rhsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_annotated_rhs);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				yield_expr();
				}
				break;
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				star_expressions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AugassignContext extends ParserRuleContext {
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugassign(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PLUSEQUAL - 70)) | (1L << (MINEQUAL - 70)) | (1L << (STAREQUAL - 70)) | (1L << (SLASHEQUAL - 70)) | (1L << (PERCENTEQUAL - 70)) | (1L << (AMPEREQUAL - 70)) | (1L << (VBAREQUAL - 70)) | (1L << (CIRCUMFLEXEQUAL - 70)) | (1L << (LEFTSHIFTEQUAL - 70)) | (1L << (RIGHTSHIFTEQUAL - 70)) | (1L << (DOUBLESTAREQUAL - 70)) | (1L << (DOUBLESLASHEQUAL - 70)) | (1L << (ATEQUAL - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(RETURN);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				setState(532);
				star_expressions();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_stmtContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRaise_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRaise_stmt(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_raise_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(RAISE);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				setState(536);
				expression();
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(537);
					match(FROM);
					setState(538);
					expression();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_stmtContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGlobal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGlobal_stmt(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(GLOBAL);
			setState(544);
			match(NAME);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(545);
				match(COMMA);
				setState(546);
				match(NAME);
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonlocal_stmtContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Nonlocal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNonlocal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNonlocal_stmt(this);
		}
	}

	public final Nonlocal_stmtContext nonlocal_stmt() throws RecognitionException {
		Nonlocal_stmtContext _localctx = new Nonlocal_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nonlocal_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(NONLOCAL);
			setState(553);
			match(NAME);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(554);
				match(COMMA);
				setState(555);
				match(NAME);
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Del_stmtContext extends ParserRuleContext {
		public Del_targetsContext del_targets() {
			return getRuleContext(Del_targetsContext.class,0);
		}
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDel_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDel_stmt(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(DEL);
			setState(562);
			del_targets();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Yield_stmtContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Yield_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYield_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYield_stmt(this);
		}
	}

	public final Yield_stmtContext yield_stmt() throws RecognitionException {
		Yield_stmtContext _localctx = new Yield_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_yield_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			yield_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assert_stmtContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Assert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssert_stmt(this);
		}
	}

	public final Assert_stmtContext assert_stmt() throws RecognitionException {
		Assert_stmtContext _localctx = new Assert_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(ASSERT);
			setState(567);
			expression();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(568);
				match(COMMA);
				setState(569);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_stmtContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_stmt(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_import_stmt);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				import_from();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_nameContext extends ParserRuleContext {
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_name(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(IMPORT);
			setState(577);
			dotted_as_names();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_fromContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public Import_from_targetsContext import_from_targets() {
			return getRuleContext(Import_from_targetsContext.class,0);
		}
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_from(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_import_from);
		int _la;
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(FROM);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==ELLIPSIS) {
					{
					{
					setState(580);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
				dotted_name(0);
				setState(587);
				match(IMPORT);
				setState(588);
				import_from_targets();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(FROM);
				setState(592); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(591);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(594); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT || _la==ELLIPSIS );
				setState(596);
				match(IMPORT);
				setState(597);
				import_from_targets();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_from_targetsContext extends ParserRuleContext {
		public Import_from_as_namesContext import_from_as_names() {
			return getRuleContext(Import_from_as_namesContext.class,0);
		}
		public Import_from_targetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_targets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_from_targets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_from_targets(this);
		}
	}

	public final Import_from_targetsContext import_from_targets() throws RecognitionException {
		Import_from_targetsContext _localctx = new Import_from_targetsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_import_from_targets);
		int _la;
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				match(LPAR);
				setState(601);
				import_from_as_names();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(602);
					match(COMMA);
					}
				}

				setState(605);
				match(RPAR);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				import_from_as_names();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_from_as_namesContext extends ParserRuleContext {
		public List<Import_from_as_nameContext> import_from_as_name() {
			return getRuleContexts(Import_from_as_nameContext.class);
		}
		public Import_from_as_nameContext import_from_as_name(int i) {
			return getRuleContext(Import_from_as_nameContext.class,i);
		}
		public Import_from_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_from_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_from_as_names(this);
		}
	}

	public final Import_from_as_namesContext import_from_as_names() throws RecognitionException {
		Import_from_as_namesContext _localctx = new Import_from_as_namesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_import_from_as_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			import_from_as_name();
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(612);
					match(COMMA);
					setState(613);
					import_from_as_name();
					}
					} 
				}
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_from_as_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Import_from_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_from_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_from_as_name(this);
		}
	}

	public final Import_from_as_nameContext import_from_as_name() throws RecognitionException {
		Import_from_as_nameContext _localctx = new Import_from_as_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_import_from_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(NAME);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(620);
				match(AS);
				setState(621);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_as_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDotted_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDotted_as_names(this);
		}
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dotted_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			dotted_as_name();
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(625);
				match(COMMA);
				setState(626);
				dotted_as_name();
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDotted_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDotted_as_name(this);
		}
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			dotted_name(0);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(633);
				match(AS);
				setState(634);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDotted_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDotted_name(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		return dotted_name(0);
	}

	private Dotted_nameContext dotted_name(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, _parentState);
		Dotted_nameContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_dotted_name, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(638);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dotted_nameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dotted_name);
					setState(640);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(641);
					match(DOT);
					setState(642);
					match(NAME);
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block);
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(NEWLINE);
				setState(649);
				match(INDENT);
				setState(650);
				statements();
				setState(651);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				simple_stmts();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorsContext extends ParserRuleContext {
		public List<Named_expressionContext> named_expression() {
			return getRuleContexts(Named_expressionContext.class);
		}
		public Named_expressionContext named_expression(int i) {
			return getRuleContext(Named_expressionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public DecoratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecorators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecorators(this);
		}
	}

	public final DecoratorsContext decorators() throws RecognitionException {
		DecoratorsContext _localctx = new DecoratorsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(656);
				match(AT);
				setState(657);
				named_expression();
				setState(658);
				match(NEWLINE);
				}
				}
				setState(662); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public Class_def_rawContext class_def_raw() {
			return getRuleContext(Class_def_rawContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_class_def);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				decorators();
				setState(665);
				class_def_raw();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				class_def_raw();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_def_rawContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Type_paramsContext type_params() {
			return getRuleContext(Type_paramsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Class_def_rawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def_raw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClass_def_raw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClass_def_raw(this);
		}
	}

	public final Class_def_rawContext class_def_raw() throws RecognitionException {
		Class_def_rawContext _localctx = new Class_def_rawContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_class_def_raw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(CLASS);
			setState(671);
			match(NAME);
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQB) {
				{
				setState(672);
				type_params();
				}
			}

			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(675);
				match(LPAR);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (DOUBLESTAR - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(676);
					arguments();
					}
				}

				setState(679);
				match(RPAR);
				}
			}

			setState(682);
			match(COLON);
			setState(683);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public Function_def_rawContext function_def_raw() {
			return getRuleContext(Function_def_rawContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_def);
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				decorators();
				setState(686);
				function_def_raw();
				}
				break;
			case DEF:
			case ASYNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				function_def_raw();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_def_rawContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Type_paramsContext type_params() {
			return getRuleContext(Type_paramsContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Func_type_commentContext func_type_comment() {
			return getRuleContext(Func_type_commentContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public Function_def_rawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def_raw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunction_def_raw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunction_def_raw(this);
		}
	}

	public final Function_def_rawContext function_def_raw() throws RecognitionException {
		Function_def_rawContext _localctx = new Function_def_rawContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_def_raw);
		int _la;
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(DEF);
				setState(692);
				match(NAME);
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQB) {
					{
					setState(693);
					type_params();
					}
				}

				setState(696);
				match(LPAR);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (STAR - 53)) | (1L << (DOUBLESTAR - 53)) | (1L << (NAME - 53)))) != 0)) {
					{
					setState(697);
					params();
					}
				}

				setState(700);
				match(RPAR);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(701);
					match(RARROW);
					setState(702);
					expression();
					}
				}

				setState(705);
				match(COLON);
				setState(707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(706);
					func_type_comment();
					}
					break;
				}
				setState(709);
				block();
				}
				break;
			case ASYNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(ASYNC);
				setState(711);
				match(DEF);
				setState(712);
				match(NAME);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQB) {
					{
					setState(713);
					type_params();
					}
				}

				setState(716);
				match(LPAR);
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (STAR - 53)) | (1L << (DOUBLESTAR - 53)) | (1L << (NAME - 53)))) != 0)) {
					{
					setState(717);
					params();
					}
				}

				setState(720);
				match(RPAR);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(721);
					match(RARROW);
					setState(722);
					expression();
					}
				}

				setState(725);
				match(COLON);
				setState(727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(726);
					func_type_comment();
					}
					break;
				}
				setState(729);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Slash_no_defaultContext slash_no_default() {
			return getRuleContext(Slash_no_defaultContext.class,0);
		}
		public List<Param_no_defaultContext> param_no_default() {
			return getRuleContexts(Param_no_defaultContext.class);
		}
		public Param_no_defaultContext param_no_default(int i) {
			return getRuleContext(Param_no_defaultContext.class,i);
		}
		public List<Param_with_defaultContext> param_with_default() {
			return getRuleContexts(Param_with_defaultContext.class);
		}
		public Param_with_defaultContext param_with_default(int i) {
			return getRuleContext(Param_with_defaultContext.class,i);
		}
		public Star_etcContext star_etc() {
			return getRuleContext(Star_etcContext.class,0);
		}
		public Slash_with_defaultContext slash_with_default() {
			return getRuleContext(Slash_with_defaultContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameters);
		int _la;
		try {
			int _alt;
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				slash_no_default();
				setState(738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(735);
						param_no_default();
						}
						} 
					}
					setState(740);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(741);
					param_with_default();
					}
					}
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(747);
					star_etc();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				slash_with_default();
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(751);
					param_with_default();
					}
					}
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(757);
					star_etc();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(761); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(760);
						param_no_default();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(763); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(765);
					param_with_default();
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(771);
					star_etc();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(774);
					param_with_default();
					}
					}
					setState(777); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(779);
					star_etc();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(782);
				star_etc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slash_no_defaultContext extends ParserRuleContext {
		public List<Param_no_defaultContext> param_no_default() {
			return getRuleContexts(Param_no_defaultContext.class);
		}
		public Param_no_defaultContext param_no_default(int i) {
			return getRuleContext(Param_no_defaultContext.class,i);
		}
		public Slash_no_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash_no_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSlash_no_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSlash_no_default(this);
		}
	}

	public final Slash_no_defaultContext slash_no_default() throws RecognitionException {
		Slash_no_defaultContext _localctx = new Slash_no_defaultContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_slash_no_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(785);
				param_no_default();
				}
				}
				setState(788); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(790);
			match(SLASH);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(791);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slash_with_defaultContext extends ParserRuleContext {
		public List<Param_no_defaultContext> param_no_default() {
			return getRuleContexts(Param_no_defaultContext.class);
		}
		public Param_no_defaultContext param_no_default(int i) {
			return getRuleContext(Param_no_defaultContext.class,i);
		}
		public List<Param_with_defaultContext> param_with_default() {
			return getRuleContexts(Param_with_defaultContext.class);
		}
		public Param_with_defaultContext param_with_default(int i) {
			return getRuleContext(Param_with_defaultContext.class,i);
		}
		public Slash_with_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash_with_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSlash_with_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSlash_with_default(this);
		}
	}

	public final Slash_with_defaultContext slash_with_default() throws RecognitionException {
		Slash_with_defaultContext _localctx = new Slash_with_defaultContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_slash_with_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(794);
					param_no_default();
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(801); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(800);
				param_with_default();
				}
				}
				setState(803); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(805);
			match(SLASH);
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(806);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_etcContext extends ParserRuleContext {
		public Param_no_defaultContext param_no_default() {
			return getRuleContext(Param_no_defaultContext.class,0);
		}
		public List<Param_maybe_defaultContext> param_maybe_default() {
			return getRuleContexts(Param_maybe_defaultContext.class);
		}
		public Param_maybe_defaultContext param_maybe_default(int i) {
			return getRuleContext(Param_maybe_defaultContext.class,i);
		}
		public KwdsContext kwds() {
			return getRuleContext(KwdsContext.class,0);
		}
		public Param_no_default_star_annotationContext param_no_default_star_annotation() {
			return getRuleContext(Param_no_default_star_annotationContext.class,0);
		}
		public Star_etcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_etc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_etc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_etc(this);
		}
	}

	public final Star_etcContext star_etc() throws RecognitionException {
		Star_etcContext _localctx = new Star_etcContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_star_etc);
		int _la;
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				match(STAR);
				setState(810);
				param_no_default();
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(811);
					param_maybe_default();
					}
					}
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(817);
					kwds();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				match(STAR);
				setState(821);
				param_no_default_star_annotation();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(822);
					param_maybe_default();
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(828);
					kwds();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				match(STAR);
				setState(832);
				match(COMMA);
				setState(834); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(833);
					param_maybe_default();
					}
					}
					setState(836); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(838);
					kwds();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(841);
				kwds();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwdsContext extends ParserRuleContext {
		public Param_no_defaultContext param_no_default() {
			return getRuleContext(Param_no_defaultContext.class,0);
		}
		public KwdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKwds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKwds(this);
		}
	}

	public final KwdsContext kwds() throws RecognitionException {
		KwdsContext _localctx = new KwdsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_kwds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(DOUBLESTAR);
			setState(845);
			param_no_default();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_no_defaultContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Param_no_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_no_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam_no_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam_no_default(this);
		}
	}

	public final Param_no_defaultContext param_no_default() throws RecognitionException {
		Param_no_defaultContext _localctx = new Param_no_defaultContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_param_no_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			param();
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(848);
				match(COMMA);
				}
			}

			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_COMMENT) {
				{
				setState(851);
				match(TYPE_COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_no_default_star_annotationContext extends ParserRuleContext {
		public Param_star_annotationContext param_star_annotation() {
			return getRuleContext(Param_star_annotationContext.class,0);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Param_no_default_star_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_no_default_star_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam_no_default_star_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam_no_default_star_annotation(this);
		}
	}

	public final Param_no_default_star_annotationContext param_no_default_star_annotation() throws RecognitionException {
		Param_no_default_star_annotationContext _localctx = new Param_no_default_star_annotationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_param_no_default_star_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			param_star_annotation();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(855);
				match(COMMA);
				}
			}

			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_COMMENT) {
				{
				setState(858);
				match(TYPE_COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_with_defaultContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Param_with_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_with_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam_with_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam_with_default(this);
		}
	}

	public final Param_with_defaultContext param_with_default() throws RecognitionException {
		Param_with_defaultContext _localctx = new Param_with_defaultContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_param_with_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			param();
			setState(862);
			default_assignment();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(863);
				match(COMMA);
				}
			}

			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_COMMENT) {
				{
				setState(866);
				match(TYPE_COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_maybe_defaultContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Param_maybe_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_maybe_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam_maybe_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam_maybe_default(this);
		}
	}

	public final Param_maybe_defaultContext param_maybe_default() throws RecognitionException {
		Param_maybe_defaultContext _localctx = new Param_maybe_defaultContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_param_maybe_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			param();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(870);
				default_assignment();
				}
			}

			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(873);
				match(COMMA);
				}
			}

			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_COMMENT) {
				{
				setState(876);
				match(TYPE_COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(NAME);
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(880);
				annotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_star_annotationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Star_annotationContext star_annotation() {
			return getRuleContext(Star_annotationContext.class,0);
		}
		public Param_star_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_star_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam_star_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam_star_annotation(this);
		}
	}

	public final Param_star_annotationContext param_star_annotation() throws RecognitionException {
		Param_star_annotationContext _localctx = new Param_star_annotationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_param_star_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(NAME);
			setState(884);
			star_annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(COLON);
			setState(887);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_annotationContext extends ParserRuleContext {
		public Star_expressionContext star_expression() {
			return getRuleContext(Star_expressionContext.class,0);
		}
		public Star_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_annotation(this);
		}
	}

	public final Star_annotationContext star_annotation() throws RecognitionException {
		Star_annotationContext _localctx = new Star_annotationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_star_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(COLON);
			setState(890);
			star_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_assignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDefault_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDefault_assignment(this);
		}
	}

	public final Default_assignmentContext default_assignment() throws RecognitionException {
		Default_assignmentContext _localctx = new Default_assignmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_default_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(EQUAL);
			setState(893);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_stmtContext elif_stmt() {
			return getRuleContext(Elif_stmtContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(IF);
			setState(896);
			named_expression();
			setState(897);
			match(COLON);
			setState(898);
			block();
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(899);
				elif_stmt();
				}
				break;
			case 2:
				{
				setState(901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(900);
					else_block();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elif_stmtContext extends ParserRuleContext {
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_stmtContext elif_stmt() {
			return getRuleContext(Elif_stmtContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Elif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElif_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElif_stmt(this);
		}
	}

	public final Elif_stmtContext elif_stmt() throws RecognitionException {
		Elif_stmtContext _localctx = new Elif_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elif_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(ELIF);
			setState(906);
			named_expression();
			setState(907);
			match(COLON);
			setState(908);
			block();
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(909);
				elif_stmt();
				}
				break;
			case 2:
				{
				setState(911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(910);
					else_block();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(ELSE);
			setState(916);
			match(COLON);
			setState(917);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(WHILE);
			setState(920);
			named_expression();
			setState(921);
			match(COLON);
			setState(922);
			block();
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(923);
				else_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public Star_targetsContext star_targets() {
			return getRuleContext(Star_targetsContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(926);
				match(ASYNC);
				}
			}

			setState(929);
			match(FOR);
			setState(930);
			star_targets();
			setState(931);
			match(IN);
			setState(932);
			star_expressions();
			setState(933);
			match(COLON);
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(934);
				match(TYPE_COMMENT);
				}
				break;
			}
			setState(937);
			block();
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(938);
				else_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_stmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<With_itemContext> with_item() {
			return getRuleContexts(With_itemContext.class);
		}
		public With_itemContext with_item(int i) {
			return getRuleContext(With_itemContext.class,i);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public With_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWith_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWith_stmt(this);
		}
	}

	public final With_stmtContext with_stmt() throws RecognitionException {
		With_stmtContext _localctx = new With_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_with_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(941);
				match(ASYNC);
				}
			}

			setState(944);
			match(WITH);
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(945);
				match(LPAR);
				setState(946);
				with_item();
				setState(951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(947);
						match(COMMA);
						setState(948);
						with_item();
						}
						} 
					}
					setState(953);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(954);
					match(COMMA);
					}
				}

				setState(957);
				match(RPAR);
				setState(958);
				match(COLON);
				}
				break;
			case 2:
				{
				setState(960);
				with_item();
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(961);
					match(COMMA);
					setState(962);
					with_item();
					}
					}
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(968);
				match(COLON);
				setState(970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(969);
					match(TYPE_COMMENT);
					}
					break;
				}
				}
				break;
			}
			setState(974);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Star_targetContext star_target() {
			return getRuleContext(Star_targetContext.class,0);
		}
		public With_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWith_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWith_item(this);
		}
	}

	public final With_itemContext with_item() throws RecognitionException {
		With_itemContext _localctx = new With_itemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_with_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			expression();
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(977);
				match(AS);
				setState(978);
				star_target();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_stmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_blockContext finally_block() {
			return getRuleContext(Finally_blockContext.class,0);
		}
		public List<Except_blockContext> except_block() {
			return getRuleContexts(Except_blockContext.class);
		}
		public Except_blockContext except_block(int i) {
			return getRuleContext(Except_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public List<Except_star_blockContext> except_star_block() {
			return getRuleContexts(Except_star_blockContext.class);
		}
		public Except_star_blockContext except_star_block(int i) {
			return getRuleContext(Except_star_blockContext.class,i);
		}
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTry_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTry_stmt(this);
		}
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_try_stmt);
		try {
			int _alt;
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				match(TRY);
				setState(982);
				match(COLON);
				setState(983);
				block();
				setState(984);
				finally_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(TRY);
				setState(987);
				match(COLON);
				setState(988);
				block();
				setState(990); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(989);
						except_block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(992); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(995);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(994);
					else_block();
					}
					break;
				}
				setState(998);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(997);
					finally_block();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
				match(TRY);
				setState(1001);
				match(COLON);
				setState(1002);
				block();
				setState(1004); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1003);
						except_star_block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1006); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1008);
					else_block();
					}
					break;
				}
				setState(1012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1011);
					finally_block();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Except_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Except_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExcept_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExcept_block(this);
		}
	}

	public final Except_blockContext except_block() throws RecognitionException {
		Except_blockContext _localctx = new Except_blockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_except_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(EXCEPT);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				setState(1017);
				expression();
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1018);
					match(AS);
					setState(1019);
					match(NAME);
					}
				}

				}
			}

			setState(1024);
			match(COLON);
			setState(1025);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Except_star_blockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Except_star_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_star_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExcept_star_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExcept_star_block(this);
		}
	}

	public final Except_star_blockContext except_star_block() throws RecognitionException {
		Except_star_blockContext _localctx = new Except_star_blockContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_except_star_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(EXCEPT);
			setState(1028);
			match(STAR);
			setState(1029);
			expression();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1030);
				match(AS);
				setState(1031);
				match(NAME);
				}
			}

			setState(1034);
			match(COLON);
			setState(1035);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFinally_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFinally_block(this);
		}
	}

	public final Finally_blockContext finally_block() throws RecognitionException {
		Finally_blockContext _localctx = new Finally_blockContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_finally_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(FINALLY);
			setState(1038);
			match(COLON);
			setState(1039);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_stmtContext extends ParserRuleContext {
		public Soft_kw_matchContext soft_kw_match() {
			return getRuleContext(Soft_kw_matchContext.class,0);
		}
		public Subject_exprContext subject_expr() {
			return getRuleContext(Subject_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public Match_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMatch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMatch_stmt(this);
		}
	}

	public final Match_stmtContext match_stmt() throws RecognitionException {
		Match_stmtContext _localctx = new Match_stmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_match_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			soft_kw_match();
			setState(1042);
			subject_expr();
			setState(1043);
			match(COLON);
			setState(1044);
			match(NEWLINE);
			setState(1045);
			match(INDENT);
			setState(1047); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1046);
					case_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1049); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1051);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subject_exprContext extends ParserRuleContext {
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public Star_named_expressionsContext star_named_expressions() {
			return getRuleContext(Star_named_expressionsContext.class,0);
		}
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public Subject_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubject_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubject_expr(this);
		}
	}

	public final Subject_exprContext subject_expr() throws RecognitionException {
		Subject_exprContext _localctx = new Subject_exprContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_subject_expr);
		int _la;
		try {
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				star_named_expression();
				setState(1054);
				match(COMMA);
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(1055);
					star_named_expressions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				named_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_blockContext extends ParserRuleContext {
		public Soft_kw_caseContext soft_kw_case() {
			return getRuleContext(Soft_kw_caseContext.class,0);
		}
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCase_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCase_block(this);
		}
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_case_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			soft_kw_case();
			setState(1062);
			patterns();
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1063);
				guard();
				}
			}

			setState(1066);
			match(COLON);
			setState(1067);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardContext extends ParserRuleContext {
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGuard(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(IF);
			setState(1070);
			named_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternsContext extends ParserRuleContext {
		public Open_sequence_patternContext open_sequence_pattern() {
			return getRuleContext(Open_sequence_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPatterns(this);
		}
	}

	public final PatternsContext patterns() throws RecognitionException {
		PatternsContext _localctx = new PatternsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_patterns);
		try {
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				open_sequence_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public As_patternContext as_pattern() {
			return getRuleContext(As_patternContext.class,0);
		}
		public Or_patternContext or_pattern() {
			return getRuleContext(Or_patternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_pattern);
		try {
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				as_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				or_pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_patternContext extends ParserRuleContext {
		public Or_patternContext or_pattern() {
			return getRuleContext(Or_patternContext.class,0);
		}
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public As_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAs_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAs_pattern(this);
		}
	}

	public final As_patternContext as_pattern() throws RecognitionException {
		As_patternContext _localctx = new As_patternContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_as_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			or_pattern();
			setState(1081);
			match(AS);
			setState(1082);
			pattern_capture_target();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_patternContext extends ParserRuleContext {
		public List<Closed_patternContext> closed_pattern() {
			return getRuleContexts(Closed_patternContext.class);
		}
		public Closed_patternContext closed_pattern(int i) {
			return getRuleContext(Closed_patternContext.class,i);
		}
		public Or_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOr_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOr_pattern(this);
		}
	}

	public final Or_patternContext or_pattern() throws RecognitionException {
		Or_patternContext _localctx = new Or_patternContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_or_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			closed_pattern();
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VBAR) {
				{
				{
				setState(1085);
				match(VBAR);
				setState(1086);
				closed_pattern();
				}
				}
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closed_patternContext extends ParserRuleContext {
		public Literal_patternContext literal_pattern() {
			return getRuleContext(Literal_patternContext.class,0);
		}
		public Capture_patternContext capture_pattern() {
			return getRuleContext(Capture_patternContext.class,0);
		}
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Value_patternContext value_pattern() {
			return getRuleContext(Value_patternContext.class,0);
		}
		public Group_patternContext group_pattern() {
			return getRuleContext(Group_patternContext.class,0);
		}
		public Sequence_patternContext sequence_pattern() {
			return getRuleContext(Sequence_patternContext.class,0);
		}
		public Mapping_patternContext mapping_pattern() {
			return getRuleContext(Mapping_patternContext.class,0);
		}
		public Class_patternContext class_pattern() {
			return getRuleContext(Class_patternContext.class,0);
		}
		public Closed_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closed_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClosed_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClosed_pattern(this);
		}
	}

	public final Closed_patternContext closed_pattern() throws RecognitionException {
		Closed_patternContext _localctx = new Closed_patternContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_closed_pattern);
		try {
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				literal_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				capture_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
				wildcard_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1095);
				value_pattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1096);
				group_pattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1097);
				sequence_pattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1098);
				mapping_pattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1099);
				class_pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_patternContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Complex_numberContext complex_number() {
			return getRuleContext(Complex_numberContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public Literal_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLiteral_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLiteral_pattern(this);
		}
	}

	public final Literal_patternContext literal_pattern() throws RecognitionException {
		Literal_patternContext _localctx = new Literal_patternContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_literal_pattern);
		try {
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				complex_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				strings();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1105);
				match(NONE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1106);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1107);
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_exprContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Complex_numberContext complex_number() {
			return getRuleContext(Complex_numberContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public Literal_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLiteral_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLiteral_expr(this);
		}
	}

	public final Literal_exprContext literal_expr() throws RecognitionException {
		Literal_exprContext _localctx = new Literal_exprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_literal_expr);
		try {
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				complex_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				strings();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1113);
				match(NONE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1114);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1115);
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_numberContext extends ParserRuleContext {
		public Signed_real_numberContext signed_real_number() {
			return getRuleContext(Signed_real_numberContext.class,0);
		}
		public Imaginary_numberContext imaginary_number() {
			return getRuleContext(Imaginary_numberContext.class,0);
		}
		public Complex_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComplex_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComplex_number(this);
		}
	}

	public final Complex_numberContext complex_number() throws RecognitionException {
		Complex_numberContext _localctx = new Complex_numberContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_complex_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			signed_real_number();
			setState(1119);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1120);
			imaginary_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSigned_number(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(1122);
				match(MINUS);
				}
			}

			setState(1125);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_real_numberContext extends ParserRuleContext {
		public Real_numberContext real_number() {
			return getRuleContext(Real_numberContext.class,0);
		}
		public Signed_real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSigned_real_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSigned_real_number(this);
		}
	}

	public final Signed_real_numberContext signed_real_number() throws RecognitionException {
		Signed_real_numberContext _localctx = new Signed_real_numberContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_signed_real_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(1127);
				match(MINUS);
				}
			}

			setState(1130);
			real_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public Real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReal_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReal_number(this);
		}
	}

	public final Real_numberContext real_number() throws RecognitionException {
		Real_numberContext _localctx = new Real_numberContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_real_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Imaginary_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public Imaginary_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imaginary_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImaginary_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImaginary_number(this);
		}
	}

	public final Imaginary_numberContext imaginary_number() throws RecognitionException {
		Imaginary_numberContext _localctx = new Imaginary_numberContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_imaginary_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_patternContext extends ParserRuleContext {
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public Capture_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCapture_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCapture_pattern(this);
		}
	}

	public final Capture_patternContext capture_pattern() throws RecognitionException {
		Capture_patternContext _localctx = new Capture_patternContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_capture_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			pattern_capture_target();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_capture_targetContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Pattern_capture_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_capture_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPattern_capture_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPattern_capture_target(this);
		}
	}

	public final Pattern_capture_targetContext pattern_capture_target() throws RecognitionException {
		Pattern_capture_targetContext _localctx = new Pattern_capture_targetContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_pattern_capture_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			if (!(self.isnotEqualCurrentTokenText("_"))) throw new FailedPredicateException(this, "self.isnotEqualCurrentTokenText(\"_\")");
			setState(1139);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wildcard_patternContext extends ParserRuleContext {
		public Soft_kw_wildcardContext soft_kw_wildcard() {
			return getRuleContext(Soft_kw_wildcardContext.class,0);
		}
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWildcard_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWildcard_pattern(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			soft_kw_wildcard();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_patternContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Value_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterValue_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitValue_pattern(this);
		}
	}

	public final Value_patternContext value_pattern() throws RecognitionException {
		Value_patternContext _localctx = new Value_patternContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_value_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			attr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(NAME);
			setState(1148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1146);
				match(DOT);
				setState(1147);
				match(NAME);
				}
				}
				setState(1150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_or_attrContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Name_or_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_or_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterName_or_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitName_or_attr(this);
		}
	}

	public final Name_or_attrContext name_or_attr() throws RecognitionException {
		Name_or_attrContext _localctx = new Name_or_attrContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_name_or_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(NAME);
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1153);
				match(DOT);
				setState(1154);
				match(NAME);
				}
				}
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Group_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGroup_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGroup_pattern(this);
		}
	}

	public final Group_patternContext group_pattern() throws RecognitionException {
		Group_patternContext _localctx = new Group_patternContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_group_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(LPAR);
			setState(1161);
			pattern();
			setState(1162);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_patternContext extends ParserRuleContext {
		public Maybe_sequence_patternContext maybe_sequence_pattern() {
			return getRuleContext(Maybe_sequence_patternContext.class,0);
		}
		public Open_sequence_patternContext open_sequence_pattern() {
			return getRuleContext(Open_sequence_patternContext.class,0);
		}
		public Sequence_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSequence_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSequence_pattern(this);
		}
	}

	public final Sequence_patternContext sequence_pattern() throws RecognitionException {
		Sequence_patternContext _localctx = new Sequence_patternContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_sequence_pattern);
		try {
			setState(1174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSQB:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				match(LSQB);
				setState(1166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1165);
					maybe_sequence_pattern();
					}
					break;
				}
				setState(1168);
				match(RSQB);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				match(LPAR);
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1170);
					open_sequence_pattern();
					}
					break;
				}
				setState(1173);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_sequence_patternContext extends ParserRuleContext {
		public Maybe_star_patternContext maybe_star_pattern() {
			return getRuleContext(Maybe_star_patternContext.class,0);
		}
		public Maybe_sequence_patternContext maybe_sequence_pattern() {
			return getRuleContext(Maybe_sequence_patternContext.class,0);
		}
		public Open_sequence_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_sequence_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOpen_sequence_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOpen_sequence_pattern(this);
		}
	}

	public final Open_sequence_patternContext open_sequence_pattern() throws RecognitionException {
		Open_sequence_patternContext _localctx = new Open_sequence_patternContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_open_sequence_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			maybe_star_pattern();
			setState(1177);
			match(COMMA);
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1178);
				maybe_sequence_pattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Maybe_sequence_patternContext extends ParserRuleContext {
		public List<Maybe_star_patternContext> maybe_star_pattern() {
			return getRuleContexts(Maybe_star_patternContext.class);
		}
		public Maybe_star_patternContext maybe_star_pattern(int i) {
			return getRuleContext(Maybe_star_patternContext.class,i);
		}
		public Maybe_sequence_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_sequence_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMaybe_sequence_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMaybe_sequence_pattern(this);
		}
	}

	public final Maybe_sequence_patternContext maybe_sequence_pattern() throws RecognitionException {
		Maybe_sequence_patternContext _localctx = new Maybe_sequence_patternContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_maybe_sequence_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			maybe_star_pattern();
			setState(1186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1182);
					match(COMMA);
					setState(1183);
					maybe_star_pattern();
					}
					} 
				}
				setState(1188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1189);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Maybe_star_patternContext extends ParserRuleContext {
		public Star_patternContext star_pattern() {
			return getRuleContext(Star_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Maybe_star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_star_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMaybe_star_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMaybe_star_pattern(this);
		}
	}

	public final Maybe_star_patternContext maybe_star_pattern() throws RecognitionException {
		Maybe_star_patternContext _localctx = new Maybe_star_patternContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_maybe_star_pattern);
		try {
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				star_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
				pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_patternContext extends ParserRuleContext {
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_pattern(this);
		}
	}

	public final Star_patternContext star_pattern() throws RecognitionException {
		Star_patternContext _localctx = new Star_patternContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_star_pattern);
		try {
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196);
				match(STAR);
				setState(1197);
				pattern_capture_target();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1198);
				match(STAR);
				setState(1199);
				wildcard_pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mapping_patternContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public Double_star_patternContext double_star_pattern() {
			return getRuleContext(Double_star_patternContext.class,0);
		}
		public Items_patternContext items_pattern() {
			return getRuleContext(Items_patternContext.class,0);
		}
		public Mapping_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMapping_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMapping_pattern(this);
		}
	}

	public final Mapping_patternContext mapping_pattern() throws RecognitionException {
		Mapping_patternContext _localctx = new Mapping_patternContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_mapping_pattern);
		int _la;
		try {
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				match(LBRACE);
				setState(1203);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1204);
				match(LBRACE);
				setState(1205);
				double_star_pattern();
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1206);
					match(COMMA);
					}
				}

				setState(1209);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1211);
				match(LBRACE);
				setState(1212);
				items_pattern();
				setState(1215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1213);
					match(COMMA);
					setState(1214);
					double_star_pattern();
					}
					break;
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1217);
					match(COMMA);
					}
				}

				setState(1220);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Items_patternContext extends ParserRuleContext {
		public List<Key_value_patternContext> key_value_pattern() {
			return getRuleContexts(Key_value_patternContext.class);
		}
		public Key_value_patternContext key_value_pattern(int i) {
			return getRuleContext(Key_value_patternContext.class,i);
		}
		public Items_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterItems_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitItems_pattern(this);
		}
	}

	public final Items_patternContext items_pattern() throws RecognitionException {
		Items_patternContext _localctx = new Items_patternContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_items_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			key_value_pattern();
			setState(1229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1225);
					match(COMMA);
					setState(1226);
					key_value_pattern();
					}
					} 
				}
				setState(1231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_value_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Literal_exprContext literal_expr() {
			return getRuleContext(Literal_exprContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Key_value_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKey_value_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKey_value_pattern(this);
		}
	}

	public final Key_value_patternContext key_value_pattern() throws RecognitionException {
		Key_value_patternContext _localctx = new Key_value_patternContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_key_value_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FSTRING_START:
			case FALSE:
			case NONE:
			case TRUE:
			case MINUS:
			case NUMBER:
			case STRING:
				{
				setState(1232);
				literal_expr();
				}
				break;
			case NAME:
				{
				setState(1233);
				attr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1236);
			match(COLON);
			setState(1237);
			pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_star_patternContext extends ParserRuleContext {
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public Double_star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_star_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDouble_star_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDouble_star_pattern(this);
		}
	}

	public final Double_star_patternContext double_star_pattern() throws RecognitionException {
		Double_star_patternContext _localctx = new Double_star_patternContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_double_star_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(DOUBLESTAR);
			setState(1240);
			pattern_capture_target();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_patternContext extends ParserRuleContext {
		public Name_or_attrContext name_or_attr() {
			return getRuleContext(Name_or_attrContext.class,0);
		}
		public Positional_patternsContext positional_patterns() {
			return getRuleContext(Positional_patternsContext.class,0);
		}
		public Keyword_patternsContext keyword_patterns() {
			return getRuleContext(Keyword_patternsContext.class,0);
		}
		public Class_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClass_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClass_pattern(this);
		}
	}

	public final Class_patternContext class_pattern() throws RecognitionException {
		Class_patternContext _localctx = new Class_patternContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_class_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			name_or_attr();
			setState(1243);
			match(LPAR);
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1244);
					positional_patterns();
					setState(1247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						setState(1245);
						match(COMMA);
						setState(1246);
						keyword_patterns();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(1249);
					keyword_patterns();
					}
					break;
				}
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1252);
					match(COMMA);
					}
				}

				}
				break;
			}
			setState(1257);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Positional_patternsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public Positional_patternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positional_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPositional_patterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPositional_patterns(this);
		}
	}

	public final Positional_patternsContext positional_patterns() throws RecognitionException {
		Positional_patternsContext _localctx = new Positional_patternsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_positional_patterns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			pattern();
			setState(1264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1260);
					match(COMMA);
					setState(1261);
					pattern();
					}
					} 
				}
				setState(1266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyword_patternsContext extends ParserRuleContext {
		public List<Keyword_patternContext> keyword_pattern() {
			return getRuleContexts(Keyword_patternContext.class);
		}
		public Keyword_patternContext keyword_pattern(int i) {
			return getRuleContext(Keyword_patternContext.class,i);
		}
		public Keyword_patternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKeyword_patterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKeyword_patterns(this);
		}
	}

	public final Keyword_patternsContext keyword_patterns() throws RecognitionException {
		Keyword_patternsContext _localctx = new Keyword_patternsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_keyword_patterns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			keyword_pattern();
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1268);
					match(COMMA);
					setState(1269);
					keyword_pattern();
					}
					} 
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyword_patternContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Keyword_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKeyword_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKeyword_pattern(this);
		}
	}

	public final Keyword_patternContext keyword_pattern() throws RecognitionException {
		Keyword_patternContext _localctx = new Keyword_patternContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_keyword_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(NAME);
			setState(1276);
			match(EQUAL);
			setState(1277);
			pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_aliasContext extends ParserRuleContext {
		public Soft_kw_typeContext soft_kw_type() {
			return getRuleContext(Soft_kw_typeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_paramsContext type_params() {
			return getRuleContext(Type_paramsContext.class,0);
		}
		public Type_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterType_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitType_alias(this);
		}
	}

	public final Type_aliasContext type_alias() throws RecognitionException {
		Type_aliasContext _localctx = new Type_aliasContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_type_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			soft_kw_type();
			setState(1280);
			match(NAME);
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQB) {
				{
				setState(1281);
				type_params();
				}
			}

			setState(1284);
			match(EQUAL);
			setState(1285);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_paramsContext extends ParserRuleContext {
		public Type_param_seqContext type_param_seq() {
			return getRuleContext(Type_param_seqContext.class,0);
		}
		public Type_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterType_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitType_params(this);
		}
	}

	public final Type_paramsContext type_params() throws RecognitionException {
		Type_paramsContext _localctx = new Type_paramsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_type_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			match(LSQB);
			setState(1288);
			type_param_seq();
			setState(1289);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_param_seqContext extends ParserRuleContext {
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public Type_param_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterType_param_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitType_param_seq(this);
		}
	}

	public final Type_param_seqContext type_param_seq() throws RecognitionException {
		Type_param_seqContext _localctx = new Type_param_seqContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_type_param_seq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			type_param();
			setState(1296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1292);
					match(COMMA);
					setState(1293);
					type_param();
					}
					} 
				}
				setState(1298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1299);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_paramContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Type_param_boundContext type_param_bound() {
			return getRuleContext(Type_param_boundContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterType_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitType_param(this);
		}
	}

	public final Type_paramContext type_param() throws RecognitionException {
		Type_paramContext _localctx = new Type_paramContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_type_param);
		int _la;
		try {
			setState(1318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				match(NAME);
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1303);
					type_param_bound();
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(STAR);
				setState(1307);
				match(NAME);
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1308);
					match(COLON);
					setState(1309);
					expression();
					}
				}

				}
				break;
			case DOUBLESTAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1312);
				match(DOUBLESTAR);
				setState(1313);
				match(NAME);
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1314);
					match(COLON);
					setState(1315);
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_param_boundContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_param_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterType_param_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitType_param_bound(this);
		}
	}

	public final Type_param_boundContext type_param_bound() throws RecognitionException {
		Type_param_boundContext _localctx = new Type_param_boundContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_type_param_bound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			match(COLON);
			setState(1321);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_expressions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			expression();
			setState(1328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1324);
					match(COMMA);
					setState(1325);
					expression();
					}
					} 
				}
				setState(1330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1331);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdefContext lambdef() {
			return getRuleContext(LambdefContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_expression);
		int _la;
		try {
			setState(1343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case NOT:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1334);
				disjunction();
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1335);
					match(IF);
					setState(1336);
					disjunction();
					setState(1337);
					match(ELSE);
					setState(1338);
					expression();
					}
				}

				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				lambdef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Yield_exprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYield_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYield_expr(this);
		}
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_yield_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			match(YIELD);
			setState(1351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				{
				setState(1346);
				match(FROM);
				setState(1347);
				expression();
				}
				break;
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case LPAR:
			case LSQB:
			case LBRACE:
			case RPAR:
			case RBRACE:
			case COLON:
			case SEMI:
			case PLUS:
			case MINUS:
			case STAR:
			case EQUAL:
			case TILDE:
			case ELLIPSIS:
			case EXCLAMATION:
			case NAME:
			case NUMBER:
			case STRING:
			case TYPE_COMMENT:
			case NEWLINE:
				{
				setState(1349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(1348);
					star_expressions();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_expressionsContext extends ParserRuleContext {
		public List<Star_expressionContext> star_expression() {
			return getRuleContexts(Star_expressionContext.class);
		}
		public Star_expressionContext star_expression(int i) {
			return getRuleContext(Star_expressionContext.class,i);
		}
		public Star_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_expressions(this);
		}
	}

	public final Star_expressionsContext star_expressions() throws RecognitionException {
		Star_expressionsContext _localctx = new Star_expressionsContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_star_expressions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			star_expression();
			setState(1358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1354);
					match(COMMA);
					setState(1355);
					star_expression();
					}
					} 
				}
				setState(1360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1361);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_expressionContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Star_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_expression(this);
		}
	}

	public final Star_expressionContext star_expression() throws RecognitionException {
		Star_expressionContext _localctx = new Star_expressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_star_expression);
		try {
			setState(1367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1364);
				match(STAR);
				setState(1365);
				bitwise_or(0);
				}
				break;
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_named_expressionsContext extends ParserRuleContext {
		public List<Star_named_expressionContext> star_named_expression() {
			return getRuleContexts(Star_named_expressionContext.class);
		}
		public Star_named_expressionContext star_named_expression(int i) {
			return getRuleContext(Star_named_expressionContext.class,i);
		}
		public Star_named_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_named_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_named_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_named_expressions(this);
		}
	}

	public final Star_named_expressionsContext star_named_expressions() throws RecognitionException {
		Star_named_expressionsContext _localctx = new Star_named_expressionsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_star_named_expressions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			star_named_expression();
			setState(1374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1370);
					match(COMMA);
					setState(1371);
					star_named_expression();
					}
					} 
				}
				setState(1376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1377);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_named_expressionContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public Star_named_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_named_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_named_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_named_expression(this);
		}
	}

	public final Star_named_expressionContext star_named_expression() throws RecognitionException {
		Star_named_expressionContext _localctx = new Star_named_expressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_star_named_expression);
		try {
			setState(1383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1380);
				match(STAR);
				setState(1381);
				bitwise_or(0);
				}
				break;
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				named_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(NAME);
			setState(1386);
			match(COLONEQUAL);
			setState(1387);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Named_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Named_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNamed_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNamed_expression(this);
		}
	}

	public final Named_expressionContext named_expression() throws RecognitionException {
		Named_expressionContext _localctx = new Named_expressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_named_expression);
		try {
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1389);
				assignment_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1390);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			conjunction();
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1394);
				match(OR);
				setState(1395);
				conjunction();
				}
				}
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public List<InversionContext> inversion() {
			return getRuleContexts(InversionContext.class);
		}
		public InversionContext inversion(int i) {
			return getRuleContext(InversionContext.class,i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			inversion();
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1402);
				match(AND);
				setState(1403);
				inversion();
				}
				}
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InversionContext extends ParserRuleContext {
		public InversionContext inversion() {
			return getRuleContext(InversionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public InversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInversion(this);
		}
	}

	public final InversionContext inversion() throws RecognitionException {
		InversionContext _localctx = new InversionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_inversion);
		try {
			setState(1412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				match(NOT);
				setState(1410);
				inversion();
				}
				break;
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1411);
				comparison();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public List<Compare_op_bitwise_or_pairContext> compare_op_bitwise_or_pair() {
			return getRuleContexts(Compare_op_bitwise_or_pairContext.class);
		}
		public Compare_op_bitwise_or_pairContext compare_op_bitwise_or_pair(int i) {
			return getRuleContext(Compare_op_bitwise_or_pairContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			bitwise_or(0);
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (IN - 14)) | (1L << (IS - 14)) | (1L << (NOT - 14)) | (1L << (LESS - 14)) | (1L << (GREATER - 14)) | (1L << (EQEQUAL - 14)) | (1L << (NOTEQUAL - 14)) | (1L << (LESSEQUAL - 14)) | (1L << (GREATEREQUAL - 14)))) != 0)) {
				{
				{
				setState(1415);
				compare_op_bitwise_or_pair();
				}
				}
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compare_op_bitwise_or_pairContext extends ParserRuleContext {
		public Eq_bitwise_orContext eq_bitwise_or() {
			return getRuleContext(Eq_bitwise_orContext.class,0);
		}
		public Noteq_bitwise_orContext noteq_bitwise_or() {
			return getRuleContext(Noteq_bitwise_orContext.class,0);
		}
		public Lte_bitwise_orContext lte_bitwise_or() {
			return getRuleContext(Lte_bitwise_orContext.class,0);
		}
		public Lt_bitwise_orContext lt_bitwise_or() {
			return getRuleContext(Lt_bitwise_orContext.class,0);
		}
		public Gte_bitwise_orContext gte_bitwise_or() {
			return getRuleContext(Gte_bitwise_orContext.class,0);
		}
		public Gt_bitwise_orContext gt_bitwise_or() {
			return getRuleContext(Gt_bitwise_orContext.class,0);
		}
		public Notin_bitwise_orContext notin_bitwise_or() {
			return getRuleContext(Notin_bitwise_orContext.class,0);
		}
		public In_bitwise_orContext in_bitwise_or() {
			return getRuleContext(In_bitwise_orContext.class,0);
		}
		public Isnot_bitwise_orContext isnot_bitwise_or() {
			return getRuleContext(Isnot_bitwise_orContext.class,0);
		}
		public Is_bitwise_orContext is_bitwise_or() {
			return getRuleContext(Is_bitwise_orContext.class,0);
		}
		public Compare_op_bitwise_or_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op_bitwise_or_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompare_op_bitwise_or_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompare_op_bitwise_or_pair(this);
		}
	}

	public final Compare_op_bitwise_or_pairContext compare_op_bitwise_or_pair() throws RecognitionException {
		Compare_op_bitwise_or_pairContext _localctx = new Compare_op_bitwise_or_pairContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_compare_op_bitwise_or_pair);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				eq_bitwise_or();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1422);
				noteq_bitwise_or();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1423);
				lte_bitwise_or();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1424);
				lt_bitwise_or();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1425);
				gte_bitwise_or();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1426);
				gt_bitwise_or();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1427);
				notin_bitwise_or();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1428);
				in_bitwise_or();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1429);
				isnot_bitwise_or();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1430);
				is_bitwise_or();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Eq_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEq_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEq_bitwise_or(this);
		}
	}

	public final Eq_bitwise_orContext eq_bitwise_or() throws RecognitionException {
		Eq_bitwise_orContext _localctx = new Eq_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_eq_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(EQEQUAL);
			setState(1434);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Noteq_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Noteq_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteq_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNoteq_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNoteq_bitwise_or(this);
		}
	}

	public final Noteq_bitwise_orContext noteq_bitwise_or() throws RecognitionException {
		Noteq_bitwise_orContext _localctx = new Noteq_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_noteq_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1436);
			match(NOTEQUAL);
			}
			setState(1437);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lte_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Lte_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lte_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLte_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLte_bitwise_or(this);
		}
	}

	public final Lte_bitwise_orContext lte_bitwise_or() throws RecognitionException {
		Lte_bitwise_orContext _localctx = new Lte_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_lte_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			match(LESSEQUAL);
			setState(1440);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lt_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Lt_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLt_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLt_bitwise_or(this);
		}
	}

	public final Lt_bitwise_orContext lt_bitwise_or() throws RecognitionException {
		Lt_bitwise_orContext _localctx = new Lt_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_lt_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(LESS);
			setState(1443);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gte_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Gte_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gte_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGte_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGte_bitwise_or(this);
		}
	}

	public final Gte_bitwise_orContext gte_bitwise_or() throws RecognitionException {
		Gte_bitwise_orContext _localctx = new Gte_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_gte_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(GREATEREQUAL);
			setState(1446);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gt_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Gt_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGt_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGt_bitwise_or(this);
		}
	}

	public final Gt_bitwise_orContext gt_bitwise_or() throws RecognitionException {
		Gt_bitwise_orContext _localctx = new Gt_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_gt_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(GREATER);
			setState(1449);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Notin_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Notin_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notin_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotin_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotin_bitwise_or(this);
		}
	}

	public final Notin_bitwise_orContext notin_bitwise_or() throws RecognitionException {
		Notin_bitwise_orContext _localctx = new Notin_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_notin_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(NOT);
			setState(1452);
			match(IN);
			setState(1453);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public In_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIn_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIn_bitwise_or(this);
		}
	}

	public final In_bitwise_orContext in_bitwise_or() throws RecognitionException {
		In_bitwise_orContext _localctx = new In_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_in_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(IN);
			setState(1456);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Isnot_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Isnot_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isnot_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIsnot_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIsnot_bitwise_or(this);
		}
	}

	public final Isnot_bitwise_orContext isnot_bitwise_or() throws RecognitionException {
		Isnot_bitwise_orContext _localctx = new Isnot_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_isnot_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(IS);
			setState(1459);
			match(NOT);
			setState(1460);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Is_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIs_bitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIs_bitwise_or(this);
		}
	}

	public final Is_bitwise_orContext is_bitwise_or() throws RecognitionException {
		Is_bitwise_orContext _localctx = new Is_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_is_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(IS);
			setState(1463);
			bitwise_or(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_orContext extends ParserRuleContext {
		public Bitwise_xorContext bitwise_xor() {
			return getRuleContext(Bitwise_xorContext.class,0);
		}
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwise_or(this);
		}
	}

	public final Bitwise_orContext bitwise_or() throws RecognitionException {
		return bitwise_or(0);
	}

	private Bitwise_orContext bitwise_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_orContext _localctx = new Bitwise_orContext(_ctx, _parentState);
		Bitwise_orContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_bitwise_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1466);
			bitwise_xor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_orContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_or);
					setState(1468);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1469);
					match(VBAR);
					setState(1470);
					bitwise_xor(0);
					}
					} 
				}
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bitwise_xorContext extends ParserRuleContext {
		public Bitwise_andContext bitwise_and() {
			return getRuleContext(Bitwise_andContext.class,0);
		}
		public Bitwise_xorContext bitwise_xor() {
			return getRuleContext(Bitwise_xorContext.class,0);
		}
		public Bitwise_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwise_xor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwise_xor(this);
		}
	}

	public final Bitwise_xorContext bitwise_xor() throws RecognitionException {
		return bitwise_xor(0);
	}

	private Bitwise_xorContext bitwise_xor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_xorContext _localctx = new Bitwise_xorContext(_ctx, _parentState);
		Bitwise_xorContext _prevctx = _localctx;
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_bitwise_xor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1477);
			bitwise_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_xorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_xor);
					setState(1479);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1480);
					match(CIRCUMFLEX);
					setState(1481);
					bitwise_and(0);
					}
					} 
				}
				setState(1486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bitwise_andContext extends ParserRuleContext {
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public Bitwise_andContext bitwise_and() {
			return getRuleContext(Bitwise_andContext.class,0);
		}
		public Bitwise_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwise_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwise_and(this);
		}
	}

	public final Bitwise_andContext bitwise_and() throws RecognitionException {
		return bitwise_and(0);
	}

	private Bitwise_andContext bitwise_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_andContext _localctx = new Bitwise_andContext(_ctx, _parentState);
		Bitwise_andContext _prevctx = _localctx;
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_bitwise_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1488);
			shift_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_andContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_and);
					setState(1490);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1491);
					match(AMPER);
					setState(1492);
					shift_expr(0);
					}
					} 
				}
				setState(1497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Shift_exprContext extends ParserRuleContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitShift_expr(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		return shift_expr(0);
	}

	private Shift_exprContext shift_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, _parentState);
		Shift_exprContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_shift_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1499);
			sum(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Shift_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shift_expr);
					setState(1501);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1502);
					_la = _input.LA(1);
					if ( !(_la==LEFTSHIFT || _la==RIGHTSHIFT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1503);
					sum(0);
					}
					} 
				}
				setState(1508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SumContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		return sum(0);
	}

	private SumContext sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumContext _localctx = new SumContext(_ctx, _parentState);
		SumContext _prevctx = _localctx;
		int _startState = 262;
		enterRecursionRule(_localctx, 262, RULE_sum, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1510);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sum);
					setState(1512);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1513);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1514);
					term(0);
					}
					} 
				}
				setState(1519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1521);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(1528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(1523);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1524);
					_la = _input.LA(1);
					if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (STAR - 53)) | (1L << (SLASH - 53)) | (1L << (PERCENT - 53)) | (1L << (DOUBLESLASH - 53)) | (1L << (AT - 53)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1525);
					factor();
					}
					} 
				}
				setState(1530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_factor);
		try {
			setState(1538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				match(PLUS);
				setState(1532);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1533);
				match(MINUS);
				setState(1534);
				factor();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535);
				match(TILDE);
				setState(1536);
				factor();
				}
				break;
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LPAR:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1537);
				power();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public Await_primaryContext await_primary() {
			return getRuleContext(Await_primaryContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			await_primary();
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1541);
				match(DOUBLESTAR);
				setState(1542);
				factor();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Await_primaryContext extends ParserRuleContext {
		public TerminalNode AWAIT() { return getToken(PythonParser.AWAIT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Await_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_await_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAwait_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAwait_primary(this);
		}
	}

	public final Await_primaryContext await_primary() throws RecognitionException {
		Await_primaryContext _localctx = new Await_primaryContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_await_primary);
		try {
			setState(1548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1545);
				match(AWAIT);
				setState(1546);
				primary(0);
				}
				break;
			case FSTRING_START:
			case FALSE:
			case NONE:
			case TRUE:
			case LPAR:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1547);
				primary(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		return primary(0);
	}

	private PrimaryContext primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryContext _localctx = new PrimaryContext(_ctx, _parentState);
		PrimaryContext _prevctx = _localctx;
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1551);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(1570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primary);
					setState(1553);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1566);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1554);
						match(DOT);
						setState(1555);
						match(NAME);
						}
						break;
					case 2:
						{
						setState(1556);
						genexp();
						}
						break;
					case 3:
						{
						setState(1557);
						match(LPAR);
						setState(1559);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (DOUBLESTAR - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
							{
							setState(1558);
							arguments();
							}
						}

						setState(1561);
						match(RPAR);
						}
						break;
					case 4:
						{
						setState(1562);
						match(LSQB);
						setState(1563);
						slices();
						setState(1564);
						match(RSQB);
						}
						break;
					}
					}
					} 
				}
				setState(1572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SlicesContext extends ParserRuleContext {
		public List<SliceContext> slice() {
			return getRuleContexts(SliceContext.class);
		}
		public SliceContext slice(int i) {
			return getRuleContext(SliceContext.class,i);
		}
		public List<Starred_expressionContext> starred_expression() {
			return getRuleContexts(Starred_expressionContext.class);
		}
		public Starred_expressionContext starred_expression(int i) {
			return getRuleContext(Starred_expressionContext.class,i);
		}
		public SlicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSlices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSlices(this);
		}
	}

	public final SlicesContext slices() throws RecognitionException {
		SlicesContext _localctx = new SlicesContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_slices);
		int _la;
		try {
			int _alt;
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1573);
				slice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FSTRING_START:
				case FALSE:
				case AWAIT:
				case NONE:
				case TRUE:
				case LAMBDA:
				case NOT:
				case LPAR:
				case LSQB:
				case LBRACE:
				case COLON:
				case PLUS:
				case MINUS:
				case TILDE:
				case ELLIPSIS:
				case NAME:
				case NUMBER:
				case STRING:
					{
					setState(1574);
					slice();
					}
					break;
				case STAR:
					{
					setState(1575);
					starred_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1578);
						match(COMMA);
						setState(1581);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case FSTRING_START:
						case FALSE:
						case AWAIT:
						case NONE:
						case TRUE:
						case LAMBDA:
						case NOT:
						case LPAR:
						case LSQB:
						case LBRACE:
						case COLON:
						case PLUS:
						case MINUS:
						case TILDE:
						case ELLIPSIS:
						case NAME:
						case NUMBER:
						case STRING:
							{
							setState(1579);
							slice();
							}
							break;
						case STAR:
							{
							setState(1580);
							starred_expression();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(1587);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				setState(1589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1588);
					match(COMMA);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SliceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSlice(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_slice);
		int _la;
		try {
			setState(1607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(1593);
					expression();
					}
				}

				setState(1596);
				match(COLON);
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(1597);
					expression();
					}
				}

				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1600);
					match(COLON);
					setState(1602);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
						{
						setState(1601);
						expression();
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1606);
				named_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListcompContext listcomp() {
			return getRuleContext(ListcompContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public DictcompContext dictcomp() {
			return getRuleContext(DictcompContext.class,0);
		}
		public SetcompContext setcomp() {
			return getRuleContext(SetcompContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_atom);
		try {
			setState(1631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				match(NAME);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1611);
				match(FALSE);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1612);
				match(NONE);
				}
				break;
			case FSTRING_START:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(1613);
				strings();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1614);
				match(NUMBER);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(1618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1615);
					tuple();
					}
					break;
				case 2:
					{
					setState(1616);
					group();
					}
					break;
				case 3:
					{
					setState(1617);
					genexp();
					}
					break;
				}
				}
				break;
			case LSQB:
				enterOuterAlt(_localctx, 8);
				{
				setState(1622);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1620);
					list();
					}
					break;
				case 2:
					{
					setState(1621);
					listcomp();
					}
					break;
				}
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1624);
					dict();
					}
					break;
				case 2:
					{
					setState(1625);
					set();
					}
					break;
				case 3:
					{
					setState(1626);
					dictcomp();
					}
					break;
				case 4:
					{
					setState(1627);
					setcomp();
					}
					break;
				}
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1630);
				match(ELLIPSIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(LPAR);
			setState(1636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(1634);
				yield_expr();
				}
				break;
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				{
				setState(1635);
				named_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1638);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdefContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Lambda_paramsContext lambda_params() {
			return getRuleContext(Lambda_paramsContext.class,0);
		}
		public LambdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdef(this);
		}
	}

	public final LambdefContext lambdef() throws RecognitionException {
		LambdefContext _localctx = new LambdefContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_lambdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(LAMBDA);
			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (STAR - 53)) | (1L << (DOUBLESTAR - 53)) | (1L << (NAME - 53)))) != 0)) {
				{
				setState(1641);
				lambda_params();
				}
			}

			setState(1644);
			match(COLON);
			setState(1645);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_paramsContext extends ParserRuleContext {
		public Lambda_parametersContext lambda_parameters() {
			return getRuleContext(Lambda_parametersContext.class,0);
		}
		public Lambda_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_params(this);
		}
	}

	public final Lambda_paramsContext lambda_params() throws RecognitionException {
		Lambda_paramsContext _localctx = new Lambda_paramsContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_lambda_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			lambda_parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_parametersContext extends ParserRuleContext {
		public Lambda_slash_no_defaultContext lambda_slash_no_default() {
			return getRuleContext(Lambda_slash_no_defaultContext.class,0);
		}
		public List<Lambda_param_no_defaultContext> lambda_param_no_default() {
			return getRuleContexts(Lambda_param_no_defaultContext.class);
		}
		public Lambda_param_no_defaultContext lambda_param_no_default(int i) {
			return getRuleContext(Lambda_param_no_defaultContext.class,i);
		}
		public List<Lambda_param_with_defaultContext> lambda_param_with_default() {
			return getRuleContexts(Lambda_param_with_defaultContext.class);
		}
		public Lambda_param_with_defaultContext lambda_param_with_default(int i) {
			return getRuleContext(Lambda_param_with_defaultContext.class,i);
		}
		public Lambda_star_etcContext lambda_star_etc() {
			return getRuleContext(Lambda_star_etcContext.class,0);
		}
		public Lambda_slash_with_defaultContext lambda_slash_with_default() {
			return getRuleContext(Lambda_slash_with_defaultContext.class,0);
		}
		public Lambda_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_parameters(this);
		}
	}

	public final Lambda_parametersContext lambda_parameters() throws RecognitionException {
		Lambda_parametersContext _localctx = new Lambda_parametersContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_lambda_parameters);
		int _la;
		try {
			int _alt;
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1649);
				lambda_slash_no_default();
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1650);
						lambda_param_no_default();
						}
						} 
					}
					setState(1655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				}
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1656);
					lambda_param_with_default();
					}
					}
					setState(1661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1662);
					lambda_star_etc();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
				lambda_slash_with_default();
				setState(1669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1666);
					lambda_param_with_default();
					}
					}
					setState(1671);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1672);
					lambda_star_etc();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1676); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1675);
						lambda_param_no_default();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1678); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1680);
					lambda_param_with_default();
					}
					}
					setState(1685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1686);
					lambda_star_etc();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1690); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1689);
					lambda_param_with_default();
					}
					}
					setState(1692); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1694);
					lambda_star_etc();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1697);
				lambda_star_etc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_slash_no_defaultContext extends ParserRuleContext {
		public List<Lambda_param_no_defaultContext> lambda_param_no_default() {
			return getRuleContexts(Lambda_param_no_defaultContext.class);
		}
		public Lambda_param_no_defaultContext lambda_param_no_default(int i) {
			return getRuleContext(Lambda_param_no_defaultContext.class,i);
		}
		public Lambda_slash_no_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_slash_no_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_slash_no_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_slash_no_default(this);
		}
	}

	public final Lambda_slash_no_defaultContext lambda_slash_no_default() throws RecognitionException {
		Lambda_slash_no_defaultContext _localctx = new Lambda_slash_no_defaultContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_lambda_slash_no_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1700);
				lambda_param_no_default();
				}
				}
				setState(1703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(1705);
			match(SLASH);
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1706);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_slash_with_defaultContext extends ParserRuleContext {
		public List<Lambda_param_no_defaultContext> lambda_param_no_default() {
			return getRuleContexts(Lambda_param_no_defaultContext.class);
		}
		public Lambda_param_no_defaultContext lambda_param_no_default(int i) {
			return getRuleContext(Lambda_param_no_defaultContext.class,i);
		}
		public List<Lambda_param_with_defaultContext> lambda_param_with_default() {
			return getRuleContexts(Lambda_param_with_defaultContext.class);
		}
		public Lambda_param_with_defaultContext lambda_param_with_default(int i) {
			return getRuleContext(Lambda_param_with_defaultContext.class,i);
		}
		public Lambda_slash_with_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_slash_with_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_slash_with_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_slash_with_default(this);
		}
	}

	public final Lambda_slash_with_defaultContext lambda_slash_with_default() throws RecognitionException {
		Lambda_slash_with_defaultContext _localctx = new Lambda_slash_with_defaultContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_lambda_slash_with_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1709);
					lambda_param_no_default();
					}
					} 
				}
				setState(1714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			setState(1716); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1715);
				lambda_param_with_default();
				}
				}
				setState(1718); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(1720);
			match(SLASH);
			setState(1722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1721);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_star_etcContext extends ParserRuleContext {
		public Lambda_param_no_defaultContext lambda_param_no_default() {
			return getRuleContext(Lambda_param_no_defaultContext.class,0);
		}
		public List<Lambda_param_maybe_defaultContext> lambda_param_maybe_default() {
			return getRuleContexts(Lambda_param_maybe_defaultContext.class);
		}
		public Lambda_param_maybe_defaultContext lambda_param_maybe_default(int i) {
			return getRuleContext(Lambda_param_maybe_defaultContext.class,i);
		}
		public Lambda_kwdsContext lambda_kwds() {
			return getRuleContext(Lambda_kwdsContext.class,0);
		}
		public Lambda_star_etcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_star_etc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_star_etc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_star_etc(this);
		}
	}

	public final Lambda_star_etcContext lambda_star_etc() throws RecognitionException {
		Lambda_star_etcContext _localctx = new Lambda_star_etcContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_lambda_star_etc);
		int _la;
		try {
			setState(1746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1724);
				match(STAR);
				setState(1725);
				lambda_param_no_default();
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1726);
					lambda_param_maybe_default();
					}
					}
					setState(1731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(1732);
					lambda_kwds();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1735);
				match(STAR);
				setState(1736);
				match(COMMA);
				setState(1738); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1737);
					lambda_param_maybe_default();
					}
					}
					setState(1740); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(1742);
					lambda_kwds();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1745);
				lambda_kwds();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_kwdsContext extends ParserRuleContext {
		public Lambda_param_no_defaultContext lambda_param_no_default() {
			return getRuleContext(Lambda_param_no_defaultContext.class,0);
		}
		public Lambda_kwdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_kwds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_kwds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_kwds(this);
		}
	}

	public final Lambda_kwdsContext lambda_kwds() throws RecognitionException {
		Lambda_kwdsContext _localctx = new Lambda_kwdsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_lambda_kwds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(DOUBLESTAR);
			setState(1749);
			lambda_param_no_default();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_param_no_defaultContext extends ParserRuleContext {
		public Lambda_paramContext lambda_param() {
			return getRuleContext(Lambda_paramContext.class,0);
		}
		public Lambda_param_no_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_param_no_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_param_no_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_param_no_default(this);
		}
	}

	public final Lambda_param_no_defaultContext lambda_param_no_default() throws RecognitionException {
		Lambda_param_no_defaultContext _localctx = new Lambda_param_no_defaultContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_lambda_param_no_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			lambda_param();
			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1752);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_param_with_defaultContext extends ParserRuleContext {
		public Lambda_paramContext lambda_param() {
			return getRuleContext(Lambda_paramContext.class,0);
		}
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public Lambda_param_with_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_param_with_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_param_with_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_param_with_default(this);
		}
	}

	public final Lambda_param_with_defaultContext lambda_param_with_default() throws RecognitionException {
		Lambda_param_with_defaultContext _localctx = new Lambda_param_with_defaultContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_lambda_param_with_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			lambda_param();
			setState(1756);
			default_assignment();
			setState(1758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1757);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_param_maybe_defaultContext extends ParserRuleContext {
		public Lambda_paramContext lambda_param() {
			return getRuleContext(Lambda_paramContext.class,0);
		}
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public Lambda_param_maybe_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_param_maybe_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_param_maybe_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_param_maybe_default(this);
		}
	}

	public final Lambda_param_maybe_defaultContext lambda_param_maybe_default() throws RecognitionException {
		Lambda_param_maybe_defaultContext _localctx = new Lambda_param_maybe_defaultContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_lambda_param_maybe_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			lambda_param();
			setState(1762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1761);
				default_assignment();
				}
			}

			setState(1765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1764);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_paramContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Lambda_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambda_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambda_param(this);
		}
	}

	public final Lambda_paramContext lambda_param() throws RecognitionException {
		Lambda_paramContext _localctx = new Lambda_paramContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_lambda_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fstring_middleContext extends ParserRuleContext {
		public Fstring_replacement_fieldContext fstring_replacement_field() {
			return getRuleContext(Fstring_replacement_fieldContext.class,0);
		}
		public TerminalNode FSTRING_MIDDLE() { return getToken(PythonParser.FSTRING_MIDDLE, 0); }
		public Fstring_middleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring_middle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstring_middle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstring_middle(this);
		}
	}

	public final Fstring_middleContext fstring_middle() throws RecognitionException {
		Fstring_middleContext _localctx = new Fstring_middleContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_fstring_middle);
		try {
			setState(1771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1769);
				fstring_replacement_field();
				}
				break;
			case FSTRING_MIDDLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1770);
				match(FSTRING_MIDDLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fstring_replacement_fieldContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Fstring_conversionContext fstring_conversion() {
			return getRuleContext(Fstring_conversionContext.class,0);
		}
		public Fstring_full_format_specContext fstring_full_format_spec() {
			return getRuleContext(Fstring_full_format_specContext.class,0);
		}
		public Fstring_replacement_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring_replacement_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstring_replacement_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstring_replacement_field(this);
		}
	}

	public final Fstring_replacement_fieldContext fstring_replacement_field() throws RecognitionException {
		Fstring_replacement_fieldContext _localctx = new Fstring_replacement_fieldContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_fstring_replacement_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(LBRACE);
			setState(1776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(1774);
				yield_expr();
				}
				break;
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				{
				setState(1775);
				star_expressions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1778);
				match(EQUAL);
				}
			}

			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATION) {
				{
				setState(1781);
				fstring_conversion();
				}
			}

			setState(1785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1784);
				fstring_full_format_spec();
				}
			}

			setState(1787);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fstring_conversionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Fstring_conversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstring_conversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstring_conversion(this);
		}
	}

	public final Fstring_conversionContext fstring_conversion() throws RecognitionException {
		Fstring_conversionContext _localctx = new Fstring_conversionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_fstring_conversion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			match(EXCLAMATION);
			setState(1790);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fstring_full_format_specContext extends ParserRuleContext {
		public List<Fstring_format_specContext> fstring_format_spec() {
			return getRuleContexts(Fstring_format_specContext.class);
		}
		public Fstring_format_specContext fstring_format_spec(int i) {
			return getRuleContext(Fstring_format_specContext.class,i);
		}
		public Fstring_full_format_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring_full_format_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstring_full_format_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstring_full_format_spec(this);
		}
	}

	public final Fstring_full_format_specContext fstring_full_format_spec() throws RecognitionException {
		Fstring_full_format_specContext _localctx = new Fstring_full_format_specContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_fstring_full_format_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			match(COLON);
			setState(1796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FSTRING_MIDDLE || _la==LBRACE) {
				{
				{
				setState(1793);
				fstring_format_spec();
				}
				}
				setState(1798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fstring_format_specContext extends ParserRuleContext {
		public TerminalNode FSTRING_MIDDLE() { return getToken(PythonParser.FSTRING_MIDDLE, 0); }
		public Fstring_replacement_fieldContext fstring_replacement_field() {
			return getRuleContext(Fstring_replacement_fieldContext.class,0);
		}
		public Fstring_format_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring_format_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstring_format_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstring_format_spec(this);
		}
	}

	public final Fstring_format_specContext fstring_format_spec() throws RecognitionException {
		Fstring_format_specContext _localctx = new Fstring_format_specContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_fstring_format_spec);
		try {
			setState(1801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FSTRING_MIDDLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1799);
				match(FSTRING_MIDDLE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1800);
				fstring_replacement_field();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FstringContext extends ParserRuleContext {
		public TerminalNode FSTRING_START() { return getToken(PythonParser.FSTRING_START, 0); }
		public TerminalNode FSTRING_END() { return getToken(PythonParser.FSTRING_END, 0); }
		public List<Fstring_middleContext> fstring_middle() {
			return getRuleContexts(Fstring_middleContext.class);
		}
		public Fstring_middleContext fstring_middle(int i) {
			return getRuleContext(Fstring_middleContext.class,i);
		}
		public FstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstring(this);
		}
	}

	public final FstringContext fstring() throws RecognitionException {
		FstringContext _localctx = new FstringContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_fstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			match(FSTRING_START);
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FSTRING_MIDDLE || _la==LBRACE) {
				{
				{
				setState(1804);
				fstring_middle();
				}
				}
				setState(1809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1810);
			match(FSTRING_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringsContext extends ParserRuleContext {
		public List<FstringContext> fstring() {
			return getRuleContexts(FstringContext.class);
		}
		public FstringContext fstring(int i) {
			return getRuleContext(FstringContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStrings(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_strings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1816); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1816);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FSTRING_START:
						{
						setState(1814);
						fstring();
						}
						break;
					case STRING:
						{
						setState(1815);
						string();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1818); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public Star_named_expressionsContext star_named_expressions() {
			return getRuleContext(Star_named_expressionsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(LSQB);
			setState(1822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				setState(1821);
				star_named_expressions();
				}
			}

			setState(1824);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleContext extends ParserRuleContext {
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public Star_named_expressionsContext star_named_expressions() {
			return getRuleContext(Star_named_expressionsContext.class,0);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTuple(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			match(LPAR);
			setState(1832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				setState(1827);
				star_named_expression();
				setState(1828);
				match(COMMA);
				setState(1830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(1829);
					star_named_expressions();
					}
				}

				}
			}

			setState(1834);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public Star_named_expressionsContext star_named_expressions() {
			return getRuleContext(Star_named_expressionsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			match(LBRACE);
			setState(1837);
			star_named_expressions();
			setState(1838);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public Double_starred_kvpairsContext double_starred_kvpairs() {
			return getRuleContext(Double_starred_kvpairsContext.class,0);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDict(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			match(LBRACE);
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (DOUBLESTAR - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				setState(1841);
				double_starred_kvpairs();
				}
			}

			setState(1844);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_starred_kvpairsContext extends ParserRuleContext {
		public List<Double_starred_kvpairContext> double_starred_kvpair() {
			return getRuleContexts(Double_starred_kvpairContext.class);
		}
		public Double_starred_kvpairContext double_starred_kvpair(int i) {
			return getRuleContext(Double_starred_kvpairContext.class,i);
		}
		public Double_starred_kvpairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_starred_kvpairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDouble_starred_kvpairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDouble_starred_kvpairs(this);
		}
	}

	public final Double_starred_kvpairsContext double_starred_kvpairs() throws RecognitionException {
		Double_starred_kvpairsContext _localctx = new Double_starred_kvpairsContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_double_starred_kvpairs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			double_starred_kvpair();
			setState(1851);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1847);
					match(COMMA);
					setState(1848);
					double_starred_kvpair();
					}
					} 
				}
				setState(1853);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1854);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_starred_kvpairContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public KvpairContext kvpair() {
			return getRuleContext(KvpairContext.class,0);
		}
		public Double_starred_kvpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_starred_kvpair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDouble_starred_kvpair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDouble_starred_kvpair(this);
		}
	}

	public final Double_starred_kvpairContext double_starred_kvpair() throws RecognitionException {
		Double_starred_kvpairContext _localctx = new Double_starred_kvpairContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_double_starred_kvpair);
		try {
			setState(1860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLESTAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1857);
				match(DOUBLESTAR);
				setState(1858);
				bitwise_or(0);
				}
				break;
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1859);
				kvpair();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KvpairContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public KvpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvpair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKvpair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKvpair(this);
		}
	}

	public final KvpairContext kvpair() throws RecognitionException {
		KvpairContext _localctx = new KvpairContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_kvpair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			expression();
			setState(1863);
			match(COLON);
			setState(1864);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_if_clausesContext extends ParserRuleContext {
		public List<For_if_clauseContext> for_if_clause() {
			return getRuleContexts(For_if_clauseContext.class);
		}
		public For_if_clauseContext for_if_clause(int i) {
			return getRuleContext(For_if_clauseContext.class,i);
		}
		public For_if_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_if_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor_if_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor_if_clauses(this);
		}
	}

	public final For_if_clausesContext for_if_clauses() throws RecognitionException {
		For_if_clausesContext _localctx = new For_if_clausesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_for_if_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1866);
				for_if_clause();
				}
				}
				setState(1869); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FOR || _la==ASYNC );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_if_clauseContext extends ParserRuleContext {
		public Star_targetsContext star_targets() {
			return getRuleContext(Star_targetsContext.class,0);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public For_if_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_if_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor_if_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor_if_clause(this);
		}
	}

	public final For_if_clauseContext for_if_clause() throws RecognitionException {
		For_if_clauseContext _localctx = new For_if_clauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_for_if_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1871);
				match(ASYNC);
				}
			}

			setState(1874);
			match(FOR);
			setState(1875);
			star_targets();
			setState(1876);
			match(IN);
			setState(1877);
			disjunction();
			setState(1882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(1878);
				match(IF);
				setState(1879);
				disjunction();
				}
				}
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListcompContext extends ParserRuleContext {
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public ListcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListcomp(this);
		}
	}

	public final ListcompContext listcomp() throws RecognitionException {
		ListcompContext _localctx = new ListcompContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_listcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			match(LSQB);
			setState(1886);
			named_expression();
			setState(1887);
			for_if_clauses();
			setState(1888);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetcompContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public SetcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSetcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSetcomp(this);
		}
	}

	public final SetcompContext setcomp() throws RecognitionException {
		SetcompContext _localctx = new SetcompContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_setcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			match(LBRACE);
			setState(1891);
			named_expression();
			setState(1892);
			for_if_clauses();
			setState(1893);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenexpContext extends ParserRuleContext {
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGenexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGenexp(this);
		}
	}

	public final GenexpContext genexp() throws RecognitionException {
		GenexpContext _localctx = new GenexpContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_genexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			match(LPAR);
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1896);
				assignment_expression();
				}
				break;
			case 2:
				{
				setState(1897);
				expression();
				}
				break;
			}
			setState(1900);
			for_if_clauses();
			setState(1901);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictcompContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public KvpairContext kvpair() {
			return getRuleContext(KvpairContext.class,0);
		}
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public DictcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictcomp(this);
		}
	}

	public final DictcompContext dictcomp() throws RecognitionException {
		DictcompContext _localctx = new DictcompContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_dictcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(LBRACE);
			setState(1904);
			kvpair();
			setState(1905);
			for_if_clauses();
			setState(1906);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			args();
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1909);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<Starred_expressionContext> starred_expression() {
			return getRuleContexts(Starred_expressionContext.class);
		}
		public Starred_expressionContext starred_expression(int i) {
			return getRuleContext(Starred_expressionContext.class,i);
		}
		public KwargsContext kwargs() {
			return getRuleContext(KwargsContext.class,0);
		}
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_args);
		try {
			int _alt;
			setState(1937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1917);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(1912);
					starred_expression();
					}
					break;
				case FSTRING_START:
				case FALSE:
				case AWAIT:
				case NONE:
				case TRUE:
				case LAMBDA:
				case NOT:
				case LPAR:
				case LSQB:
				case LBRACE:
				case PLUS:
				case MINUS:
				case TILDE:
				case ELLIPSIS:
				case NAME:
				case NUMBER:
				case STRING:
					{
					setState(1915);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
					case 1:
						{
						setState(1913);
						assignment_expression();
						}
						break;
					case 2:
						{
						setState(1914);
						expression();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1919);
						match(COMMA);
						setState(1925);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STAR:
							{
							setState(1920);
							starred_expression();
							}
							break;
						case FSTRING_START:
						case FALSE:
						case AWAIT:
						case NONE:
						case TRUE:
						case LAMBDA:
						case NOT:
						case LPAR:
						case LSQB:
						case LBRACE:
						case PLUS:
						case MINUS:
						case TILDE:
						case ELLIPSIS:
						case NAME:
						case NUMBER:
						case STRING:
							{
							setState(1923);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
							case 1:
								{
								setState(1921);
								assignment_expression();
								}
								break;
							case 2:
								{
								setState(1922);
								expression();
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(1931);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
				}
				setState(1934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1932);
					match(COMMA);
					setState(1933);
					kwargs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936);
				kwargs();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwargsContext extends ParserRuleContext {
		public List<Kwarg_or_starredContext> kwarg_or_starred() {
			return getRuleContexts(Kwarg_or_starredContext.class);
		}
		public Kwarg_or_starredContext kwarg_or_starred(int i) {
			return getRuleContext(Kwarg_or_starredContext.class,i);
		}
		public List<Kwarg_or_double_starredContext> kwarg_or_double_starred() {
			return getRuleContexts(Kwarg_or_double_starredContext.class);
		}
		public Kwarg_or_double_starredContext kwarg_or_double_starred(int i) {
			return getRuleContext(Kwarg_or_double_starredContext.class,i);
		}
		public KwargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKwargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKwargs(this);
		}
	}

	public final KwargsContext kwargs() throws RecognitionException {
		KwargsContext _localctx = new KwargsContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_kwargs);
		try {
			int _alt;
			setState(1966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				kwarg_or_starred();
				setState(1944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1940);
						match(COMMA);
						setState(1941);
						kwarg_or_starred();
						}
						} 
					}
					setState(1946);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
				}
				setState(1956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1947);
					match(COMMA);
					setState(1948);
					kwarg_or_double_starred();
					setState(1953);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1949);
							match(COMMA);
							setState(1950);
							kwarg_or_double_starred();
							}
							} 
						}
						setState(1955);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1958);
				kwarg_or_double_starred();
				setState(1963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1959);
						match(COMMA);
						setState(1960);
						kwarg_or_double_starred();
						}
						} 
					}
					setState(1965);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Starred_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Starred_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starred_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarred_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarred_expression(this);
		}
	}

	public final Starred_expressionContext starred_expression() throws RecognitionException {
		Starred_expressionContext _localctx = new Starred_expressionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_starred_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(STAR);
			setState(1969);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kwarg_or_starredContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Starred_expressionContext starred_expression() {
			return getRuleContext(Starred_expressionContext.class,0);
		}
		public Kwarg_or_starredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwarg_or_starred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKwarg_or_starred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKwarg_or_starred(this);
		}
	}

	public final Kwarg_or_starredContext kwarg_or_starred() throws RecognitionException {
		Kwarg_or_starredContext _localctx = new Kwarg_or_starredContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_kwarg_or_starred);
		try {
			setState(1975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1971);
				match(NAME);
				setState(1972);
				match(EQUAL);
				setState(1973);
				expression();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974);
				starred_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kwarg_or_double_starredContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Kwarg_or_double_starredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwarg_or_double_starred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKwarg_or_double_starred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKwarg_or_double_starred(this);
		}
	}

	public final Kwarg_or_double_starredContext kwarg_or_double_starred() throws RecognitionException {
		Kwarg_or_double_starredContext _localctx = new Kwarg_or_double_starredContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_kwarg_or_double_starred);
		try {
			setState(1982);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1977);
				match(NAME);
				setState(1978);
				match(EQUAL);
				setState(1979);
				expression();
				}
				break;
			case DOUBLESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1980);
				match(DOUBLESTAR);
				setState(1981);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_targetsContext extends ParserRuleContext {
		public List<Star_targetContext> star_target() {
			return getRuleContexts(Star_targetContext.class);
		}
		public Star_targetContext star_target(int i) {
			return getRuleContext(Star_targetContext.class,i);
		}
		public Star_targetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_targets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_targets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_targets(this);
		}
	}

	public final Star_targetsContext star_targets() throws RecognitionException {
		Star_targetsContext _localctx = new Star_targetsContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_star_targets);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			star_target();
			setState(1989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1985);
					match(COMMA);
					setState(1986);
					star_target();
					}
					} 
				}
				setState(1991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			}
			setState(1993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1992);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_targets_list_seqContext extends ParserRuleContext {
		public List<Star_targetContext> star_target() {
			return getRuleContexts(Star_targetContext.class);
		}
		public Star_targetContext star_target(int i) {
			return getRuleContext(Star_targetContext.class,i);
		}
		public Star_targets_list_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_targets_list_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_targets_list_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_targets_list_seq(this);
		}
	}

	public final Star_targets_list_seqContext star_targets_list_seq() throws RecognitionException {
		Star_targets_list_seqContext _localctx = new Star_targets_list_seqContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_star_targets_list_seq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			star_target();
			setState(1998); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1996);
					match(COMMA);
					setState(1997);
					star_target();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2000); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2002);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_targets_tuple_seqContext extends ParserRuleContext {
		public List<Star_targetContext> star_target() {
			return getRuleContexts(Star_targetContext.class);
		}
		public Star_targetContext star_target(int i) {
			return getRuleContext(Star_targetContext.class,i);
		}
		public Star_targets_tuple_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_targets_tuple_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_targets_tuple_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_targets_tuple_seq(this);
		}
	}

	public final Star_targets_tuple_seqContext star_targets_tuple_seq() throws RecognitionException {
		Star_targets_tuple_seqContext _localctx = new Star_targets_tuple_seqContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_star_targets_tuple_seq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			star_target();
			setState(2016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(2006);
				match(COMMA);
				}
				break;
			case 2:
				{
				setState(2009); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2007);
						match(COMMA);
						setState(2008);
						star_target();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2011); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2013);
					match(COMMA);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_targetContext extends ParserRuleContext {
		public Star_targetContext star_target() {
			return getRuleContext(Star_targetContext.class,0);
		}
		public Target_with_star_atomContext target_with_star_atom() {
			return getRuleContext(Target_with_star_atomContext.class,0);
		}
		public Star_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_target(this);
		}
	}

	public final Star_targetContext star_target() throws RecognitionException {
		Star_targetContext _localctx = new Star_targetContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_star_target);
		try {
			setState(2021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2018);
				match(STAR);
				{
				setState(2019);
				star_target();
				}
				}
				break;
			case FSTRING_START:
			case FALSE:
			case NONE:
			case TRUE:
			case LPAR:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2020);
				target_with_star_atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_with_star_atomContext extends ParserRuleContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public Star_atomContext star_atom() {
			return getRuleContext(Star_atomContext.class,0);
		}
		public Target_with_star_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_with_star_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTarget_with_star_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTarget_with_star_atom(this);
		}
	}

	public final Target_with_star_atomContext target_with_star_atom() throws RecognitionException {
		Target_with_star_atomContext _localctx = new Target_with_star_atomContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_target_with_star_atom);
		try {
			setState(2033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2023);
				t_primary(0);
				setState(2030);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(2024);
					match(DOT);
					setState(2025);
					match(NAME);
					}
					break;
				case LSQB:
					{
					setState(2026);
					match(LSQB);
					setState(2027);
					slices();
					setState(2028);
					match(RSQB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2032);
				star_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_atomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Target_with_star_atomContext target_with_star_atom() {
			return getRuleContext(Target_with_star_atomContext.class,0);
		}
		public Star_targets_tuple_seqContext star_targets_tuple_seq() {
			return getRuleContext(Star_targets_tuple_seqContext.class,0);
		}
		public Star_targets_list_seqContext star_targets_list_seq() {
			return getRuleContext(Star_targets_list_seqContext.class,0);
		}
		public Star_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_atom(this);
		}
	}

	public final Star_atomContext star_atom() throws RecognitionException {
		Star_atomContext _localctx = new Star_atomContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_star_atom);
		int _la;
		try {
			setState(2050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2035);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2036);
				match(LPAR);
				setState(2037);
				target_with_star_atom();
				setState(2038);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2040);
				match(LPAR);
				setState(2042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << NONE) | (1L << TRUE) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << STAR))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ELLIPSIS - 86)) | (1L << (NAME - 86)) | (1L << (NUMBER - 86)) | (1L << (STRING - 86)))) != 0)) {
					{
					setState(2041);
					star_targets_tuple_seq();
					}
				}

				setState(2044);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2045);
				match(LSQB);
				setState(2047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << NONE) | (1L << TRUE) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << STAR))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ELLIPSIS - 86)) | (1L << (NAME - 86)) | (1L << (NUMBER - 86)) | (1L << (STRING - 86)))) != 0)) {
					{
					setState(2046);
					star_targets_list_seq();
					}
				}

				setState(2049);
				match(RSQB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_targetContext extends ParserRuleContext {
		public Single_subscript_attribute_targetContext single_subscript_attribute_target() {
			return getRuleContext(Single_subscript_attribute_targetContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public Single_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingle_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingle_target(this);
		}
	}

	public final Single_targetContext single_target() throws RecognitionException {
		Single_targetContext _localctx = new Single_targetContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_single_target);
		try {
			setState(2058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				single_subscript_attribute_target();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2054);
				match(LPAR);
				setState(2055);
				single_target();
				setState(2056);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_subscript_attribute_targetContext extends ParserRuleContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public Single_subscript_attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_subscript_attribute_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingle_subscript_attribute_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingle_subscript_attribute_target(this);
		}
	}

	public final Single_subscript_attribute_targetContext single_subscript_attribute_target() throws RecognitionException {
		Single_subscript_attribute_targetContext _localctx = new Single_subscript_attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_single_subscript_attribute_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			t_primary(0);
			setState(2067);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(2061);
				match(DOT);
				setState(2062);
				match(NAME);
				}
				break;
			case LSQB:
				{
				setState(2063);
				match(LSQB);
				setState(2064);
				slices();
				setState(2065);
				match(RSQB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_primaryContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public T_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterT_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitT_primary(this);
		}
	}

	public final T_primaryContext t_primary() throws RecognitionException {
		return t_primary(0);
	}

	private T_primaryContext t_primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		T_primaryContext _localctx = new T_primaryContext(_ctx, _parentState);
		T_primaryContext _prevctx = _localctx;
		int _startState = 374;
		enterRecursionRule(_localctx, 374, RULE_t_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2070);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(2089);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new T_primaryContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_t_primary);
					setState(2072);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2085);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
					case 1:
						{
						setState(2073);
						match(DOT);
						setState(2074);
						match(NAME);
						}
						break;
					case 2:
						{
						setState(2075);
						match(LSQB);
						setState(2076);
						slices();
						setState(2077);
						match(RSQB);
						}
						break;
					case 3:
						{
						setState(2079);
						genexp();
						}
						break;
					case 4:
						{
						setState(2080);
						match(LPAR);
						setState(2082);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TILDE - 65)) | (1L << (DOUBLESTAR - 65)) | (1L << (ELLIPSIS - 65)) | (1L << (NAME - 65)) | (1L << (NUMBER - 65)) | (1L << (STRING - 65)))) != 0)) {
							{
							setState(2081);
							arguments();
							}
						}

						setState(2084);
						match(RPAR);
						}
						break;
					}
					}
					} 
				}
				setState(2091);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Del_targetsContext extends ParserRuleContext {
		public List<Del_targetContext> del_target() {
			return getRuleContexts(Del_targetContext.class);
		}
		public Del_targetContext del_target(int i) {
			return getRuleContext(Del_targetContext.class,i);
		}
		public Del_targetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_targets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDel_targets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDel_targets(this);
		}
	}

	public final Del_targetsContext del_targets() throws RecognitionException {
		Del_targetsContext _localctx = new Del_targetsContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_del_targets);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			del_target();
			setState(2097);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2093);
					match(COMMA);
					setState(2094);
					del_target();
					}
					} 
				}
				setState(2099);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			setState(2101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2100);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Del_targetContext extends ParserRuleContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public Del_t_atomContext del_t_atom() {
			return getRuleContext(Del_t_atomContext.class,0);
		}
		public Del_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDel_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDel_target(this);
		}
	}

	public final Del_targetContext del_target() throws RecognitionException {
		Del_targetContext _localctx = new Del_targetContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_del_target);
		try {
			setState(2113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2103);
				t_primary(0);
				setState(2110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(2104);
					match(DOT);
					setState(2105);
					match(NAME);
					}
					break;
				case LSQB:
					{
					setState(2106);
					match(LSQB);
					setState(2107);
					slices();
					setState(2108);
					match(RSQB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2112);
				del_t_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Del_t_atomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Del_targetContext del_target() {
			return getRuleContext(Del_targetContext.class,0);
		}
		public Del_targetsContext del_targets() {
			return getRuleContext(Del_targetsContext.class,0);
		}
		public Del_t_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_t_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDel_t_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDel_t_atom(this);
		}
	}

	public final Del_t_atomContext del_t_atom() throws RecognitionException {
		Del_t_atomContext _localctx = new Del_t_atomContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_del_t_atom);
		int _la;
		try {
			setState(2130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2115);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2116);
				match(LPAR);
				setState(2117);
				del_target();
				setState(2118);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2120);
				match(LPAR);
				setState(2122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << NONE) | (1L << TRUE) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ELLIPSIS - 86)) | (1L << (NAME - 86)) | (1L << (NUMBER - 86)) | (1L << (STRING - 86)))) != 0)) {
					{
					setState(2121);
					del_targets();
					}
				}

				setState(2124);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2125);
				match(LSQB);
				setState(2127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FSTRING_START) | (1L << FALSE) | (1L << NONE) | (1L << TRUE) | (1L << LPAR) | (1L << LSQB) | (1L << LBRACE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ELLIPSIS - 86)) | (1L << (NAME - 86)) | (1L << (NUMBER - 86)) | (1L << (STRING - 86)))) != 0)) {
					{
					setState(2126);
					del_targets();
					}
				}

				setState(2129);
				match(RSQB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_expressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Type_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterType_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitType_expressions(this);
		}
	}

	public final Type_expressionsContext type_expressions() throws RecognitionException {
		Type_expressionsContext _localctx = new Type_expressionsContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_type_expressions);
		int _la;
		try {
			int _alt;
			setState(2163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FSTRING_START:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(2132);
				expression();
				setState(2137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2133);
						match(COMMA);
						setState(2134);
						expression();
						}
						} 
					}
					setState(2139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
				}
				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2140);
					match(COMMA);
					setState(2150);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(2141);
						match(STAR);
						setState(2142);
						expression();
						setState(2146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(2143);
							match(COMMA);
							setState(2144);
							match(DOUBLESTAR);
							setState(2145);
							expression();
							}
						}

						}
						break;
					case DOUBLESTAR:
						{
						setState(2148);
						match(DOUBLESTAR);
						setState(2149);
						expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2154);
				match(STAR);
				setState(2155);
				expression();
				setState(2159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2156);
					match(COMMA);
					setState(2157);
					match(DOUBLESTAR);
					setState(2158);
					expression();
					}
				}

				}
				break;
			case DOUBLESTAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(2161);
				match(DOUBLESTAR);
				setState(2162);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_type_commentContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Func_type_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunc_type_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunc_type_comment(this);
		}
	}

	public final Func_type_commentContext func_type_comment() throws RecognitionException {
		Func_type_commentContext _localctx = new Func_type_commentContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_func_type_comment);
		try {
			setState(2168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2165);
				match(NEWLINE);
				setState(2166);
				match(TYPE_COMMENT);
				}
				break;
			case TYPE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2167);
				match(TYPE_COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Soft_kw_matchContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Soft_kw_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soft_kw_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSoft_kw_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSoft_kw_match(this);
		}
	}

	public final Soft_kw_matchContext soft_kw_match() throws RecognitionException {
		Soft_kw_matchContext _localctx = new Soft_kw_matchContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_soft_kw_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			if (!(self.isEqualCurrentTokenText("match"))) throw new FailedPredicateException(this, "self.isEqualCurrentTokenText(\"match\")");
			setState(2171);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Soft_kw_caseContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Soft_kw_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soft_kw_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSoft_kw_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSoft_kw_case(this);
		}
	}

	public final Soft_kw_caseContext soft_kw_case() throws RecognitionException {
		Soft_kw_caseContext _localctx = new Soft_kw_caseContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_soft_kw_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			if (!(self.isEqualCurrentTokenText("case"))) throw new FailedPredicateException(this, "self.isEqualCurrentTokenText(\"case\")");
			setState(2174);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Soft_kw_wildcardContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Soft_kw_wildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soft_kw_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSoft_kw_wildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSoft_kw_wildcard(this);
		}
	}

	public final Soft_kw_wildcardContext soft_kw_wildcard() throws RecognitionException {
		Soft_kw_wildcardContext _localctx = new Soft_kw_wildcardContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_soft_kw_wildcard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2176);
			if (!(self.isEqualCurrentTokenText("_"))) throw new FailedPredicateException(this, "self.isEqualCurrentTokenText(\"_\")");
			setState(2177);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Soft_kw_typeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Soft_kw_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soft_kw_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSoft_kw_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSoft_kw_type(this);
		}
	}

	public final Soft_kw_typeContext soft_kw_type() throws RecognitionException {
		Soft_kw_typeContext _localctx = new Soft_kw_typeContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_soft_kw_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			if (!(self.isEqualCurrentTokenText("type"))) throw new FailedPredicateException(this, "self.isEqualCurrentTokenText(\"type\")");
			setState(2180);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return dotted_name_sempred((Dotted_nameContext)_localctx, predIndex);
		case 79:
			return pattern_capture_target_sempred((Pattern_capture_targetContext)_localctx, predIndex);
		case 127:
			return bitwise_or_sempred((Bitwise_orContext)_localctx, predIndex);
		case 128:
			return bitwise_xor_sempred((Bitwise_xorContext)_localctx, predIndex);
		case 129:
			return bitwise_and_sempred((Bitwise_andContext)_localctx, predIndex);
		case 130:
			return shift_expr_sempred((Shift_exprContext)_localctx, predIndex);
		case 131:
			return sum_sempred((SumContext)_localctx, predIndex);
		case 132:
			return term_sempred((TermContext)_localctx, predIndex);
		case 136:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 187:
			return t_primary_sempred((T_primaryContext)_localctx, predIndex);
		case 193:
			return soft_kw_match_sempred((Soft_kw_matchContext)_localctx, predIndex);
		case 194:
			return soft_kw_case_sempred((Soft_kw_caseContext)_localctx, predIndex);
		case 195:
			return soft_kw_wildcard_sempred((Soft_kw_wildcardContext)_localctx, predIndex);
		case 196:
			return soft_kw_type_sempred((Soft_kw_typeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dotted_name_sempred(Dotted_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean pattern_capture_target_sempred(Pattern_capture_targetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return self.isnotEqualCurrentTokenText("_");
		}
		return true;
	}
	private boolean bitwise_or_sempred(Bitwise_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_xor_sempred(Bitwise_xorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_and_sempred(Bitwise_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean shift_expr_sempred(Shift_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sum_sempred(SumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_primary_sempred(T_primaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean soft_kw_match_sempred(Soft_kw_matchContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return self.isEqualCurrentTokenText("match");
		}
		return true;
	}
	private boolean soft_kw_case_sempred(Soft_kw_caseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return self.isEqualCurrentTokenText("case");
		}
		return true;
	}
	private boolean soft_kw_wildcard_sempred(Soft_kw_wildcardContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return self.isEqualCurrentTokenText("_");
		}
		return true;
	}
	private boolean soft_kw_type_sempred(Soft_kw_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return self.isEqualCurrentTokenText("type");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3c\u0889\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\3\2\5\2\u018e\n\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\7\4\u0196\n\4\f\4\16\4\u0199\13\4\3\4\3\4\3\5\3\5\5\5\u019f"+
		"\n\5\3\5\3\5\3\5\3\5\7\5\u01a5\n\5\f\5\16\5\u01a8\13\5\3\5\3\5\3\6\3\6"+
		"\3\7\6\7\u01af\n\7\r\7\16\7\u01b0\3\b\3\b\5\b\u01b5\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u01bd\n\t\3\n\3\n\3\n\7\n\u01c2\n\n\f\n\16\n\u01c5\13\n"+
		"\3\n\5\n\u01c8\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u01da\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u01e4\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u01eb\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u01f2\n\r\3\r\3\r\3\r\3\r\5\r\u01f8\n\r\3\r\3\r\3\r\6\r\u01fd\n"+
		"\r\r\r\16\r\u01fe\3\r\3\r\5\r\u0203\n\r\3\r\5\r\u0206\n\r\3\r\3\r\3\r"+
		"\3\r\5\r\u020c\n\r\5\r\u020e\n\r\3\16\3\16\5\16\u0212\n\16\3\17\3\17\3"+
		"\20\3\20\5\20\u0218\n\20\3\21\3\21\3\21\3\21\5\21\u021e\n\21\5\21\u0220"+
		"\n\21\3\22\3\22\3\22\3\22\7\22\u0226\n\22\f\22\16\22\u0229\13\22\3\23"+
		"\3\23\3\23\3\23\7\23\u022f\n\23\f\23\16\23\u0232\13\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u023d\n\26\3\27\3\27\5\27\u0241\n"+
		"\27\3\30\3\30\3\30\3\31\3\31\7\31\u0248\n\31\f\31\16\31\u024b\13\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\6\31\u0253\n\31\r\31\16\31\u0254\3\31\3\31"+
		"\5\31\u0259\n\31\3\32\3\32\3\32\5\32\u025e\n\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0264\n\32\3\33\3\33\3\33\7\33\u0269\n\33\f\33\16\33\u026c\13\33\3"+
		"\34\3\34\3\34\5\34\u0271\n\34\3\35\3\35\3\35\7\35\u0276\n\35\f\35\16\35"+
		"\u0279\13\35\3\36\3\36\3\36\5\36\u027e\n\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\7\37\u0286\n\37\f\37\16\37\u0289\13\37\3 \3 \3 \3 \3 \3 \5 \u0291"+
		"\n \3!\3!\3!\3!\6!\u0297\n!\r!\16!\u0298\3\"\3\"\3\"\3\"\5\"\u029f\n\""+
		"\3#\3#\3#\5#\u02a4\n#\3#\3#\5#\u02a8\n#\3#\5#\u02ab\n#\3#\3#\3#\3$\3$"+
		"\3$\3$\5$\u02b4\n$\3%\3%\3%\5%\u02b9\n%\3%\3%\5%\u02bd\n%\3%\3%\3%\5%"+
		"\u02c2\n%\3%\3%\5%\u02c6\n%\3%\3%\3%\3%\3%\5%\u02cd\n%\3%\3%\5%\u02d1"+
		"\n%\3%\3%\3%\5%\u02d6\n%\3%\3%\5%\u02da\n%\3%\5%\u02dd\n%\3&\3&\3\'\3"+
		"\'\7\'\u02e3\n\'\f\'\16\'\u02e6\13\'\3\'\7\'\u02e9\n\'\f\'\16\'\u02ec"+
		"\13\'\3\'\5\'\u02ef\n\'\3\'\3\'\7\'\u02f3\n\'\f\'\16\'\u02f6\13\'\3\'"+
		"\5\'\u02f9\n\'\3\'\6\'\u02fc\n\'\r\'\16\'\u02fd\3\'\7\'\u0301\n\'\f\'"+
		"\16\'\u0304\13\'\3\'\5\'\u0307\n\'\3\'\6\'\u030a\n\'\r\'\16\'\u030b\3"+
		"\'\5\'\u030f\n\'\3\'\5\'\u0312\n\'\3(\6(\u0315\n(\r(\16(\u0316\3(\3(\5"+
		"(\u031b\n(\3)\7)\u031e\n)\f)\16)\u0321\13)\3)\6)\u0324\n)\r)\16)\u0325"+
		"\3)\3)\5)\u032a\n)\3*\3*\3*\7*\u032f\n*\f*\16*\u0332\13*\3*\5*\u0335\n"+
		"*\3*\3*\3*\7*\u033a\n*\f*\16*\u033d\13*\3*\5*\u0340\n*\3*\3*\3*\6*\u0345"+
		"\n*\r*\16*\u0346\3*\5*\u034a\n*\3*\5*\u034d\n*\3+\3+\3+\3,\3,\5,\u0354"+
		"\n,\3,\5,\u0357\n,\3-\3-\5-\u035b\n-\3-\5-\u035e\n-\3.\3.\3.\5.\u0363"+
		"\n.\3.\5.\u0366\n.\3/\3/\5/\u036a\n/\3/\5/\u036d\n/\3/\5/\u0370\n/\3\60"+
		"\3\60\5\60\u0374\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0388\n\65\5\65\u038a\n"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0392\n\66\5\66\u0394\n\66\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\58\u039f\n8\39\59\u03a2\n9\39\39\39\39"+
		"\39\39\59\u03aa\n9\39\39\59\u03ae\n9\3:\5:\u03b1\n:\3:\3:\3:\3:\3:\7:"+
		"\u03b8\n:\f:\16:\u03bb\13:\3:\5:\u03be\n:\3:\3:\3:\3:\3:\3:\7:\u03c6\n"+
		":\f:\16:\u03c9\13:\3:\3:\5:\u03cd\n:\5:\u03cf\n:\3:\3:\3;\3;\3;\5;\u03d6"+
		"\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\6<\u03e1\n<\r<\16<\u03e2\3<\5<\u03e6\n"+
		"<\3<\5<\u03e9\n<\3<\3<\3<\3<\6<\u03ef\n<\r<\16<\u03f0\3<\5<\u03f4\n<\3"+
		"<\5<\u03f7\n<\5<\u03f9\n<\3=\3=\3=\3=\5=\u03ff\n=\5=\u0401\n=\3=\3=\3"+
		"=\3>\3>\3>\3>\3>\5>\u040b\n>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\6"+
		"@\u041a\n@\r@\16@\u041b\3@\3@\3A\3A\3A\5A\u0423\nA\3A\5A\u0426\nA\3B\3"+
		"B\3B\5B\u042b\nB\3B\3B\3B\3C\3C\3C\3D\3D\5D\u0435\nD\3E\3E\5E\u0439\n"+
		"E\3F\3F\3F\3F\3G\3G\3G\7G\u0442\nG\fG\16G\u0445\13G\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\5H\u044f\nH\3I\3I\3I\3I\3I\3I\5I\u0457\nI\3J\3J\3J\3J\3J\3J\5J"+
		"\u045f\nJ\3K\3K\3K\3K\3L\5L\u0466\nL\3L\3L\3M\5M\u046b\nM\3M\3M\3N\3N"+
		"\3O\3O\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\6T\u047f\nT\rT\16T\u0480\3"+
		"U\3U\3U\7U\u0486\nU\fU\16U\u0489\13U\3V\3V\3V\3V\3W\3W\5W\u0491\nW\3W"+
		"\3W\3W\5W\u0496\nW\3W\5W\u0499\nW\3X\3X\3X\5X\u049e\nX\3Y\3Y\3Y\7Y\u04a3"+
		"\nY\fY\16Y\u04a6\13Y\3Y\5Y\u04a9\nY\3Z\3Z\5Z\u04ad\nZ\3[\3[\3[\3[\5[\u04b3"+
		"\n[\3\\\3\\\3\\\3\\\3\\\5\\\u04ba\n\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u04c2"+
		"\n\\\3\\\5\\\u04c5\n\\\3\\\3\\\5\\\u04c9\n\\\3]\3]\3]\7]\u04ce\n]\f]\16"+
		"]\u04d1\13]\3^\3^\5^\u04d5\n^\3^\3^\3^\3_\3_\3_\3`\3`\3`\3`\3`\5`\u04e2"+
		"\n`\3`\5`\u04e5\n`\3`\5`\u04e8\n`\5`\u04ea\n`\3`\3`\3a\3a\3a\7a\u04f1"+
		"\na\fa\16a\u04f4\13a\3b\3b\3b\7b\u04f9\nb\fb\16b\u04fc\13b\3c\3c\3c\3"+
		"c\3d\3d\3d\5d\u0505\nd\3d\3d\3d\3e\3e\3e\3e\3f\3f\3f\7f\u0511\nf\ff\16"+
		"f\u0514\13f\3f\5f\u0517\nf\3g\3g\5g\u051b\ng\3g\3g\3g\3g\5g\u0521\ng\3"+
		"g\3g\3g\3g\5g\u0527\ng\5g\u0529\ng\3h\3h\3h\3i\3i\3i\7i\u0531\ni\fi\16"+
		"i\u0534\13i\3i\5i\u0537\ni\3j\3j\3j\3j\3j\3j\5j\u053f\nj\3j\5j\u0542\n"+
		"j\3k\3k\3k\3k\5k\u0548\nk\5k\u054a\nk\3l\3l\3l\7l\u054f\nl\fl\16l\u0552"+
		"\13l\3l\5l\u0555\nl\3m\3m\3m\5m\u055a\nm\3n\3n\3n\7n\u055f\nn\fn\16n\u0562"+
		"\13n\3n\5n\u0565\nn\3o\3o\3o\5o\u056a\no\3p\3p\3p\3p\3q\3q\5q\u0572\n"+
		"q\3r\3r\3r\7r\u0577\nr\fr\16r\u057a\13r\3s\3s\3s\7s\u057f\ns\fs\16s\u0582"+
		"\13s\3t\3t\3t\5t\u0587\nt\3u\3u\7u\u058b\nu\fu\16u\u058e\13u\3v\3v\3v"+
		"\3v\3v\3v\3v\3v\3v\3v\5v\u059a\nv\3w\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3z"+
		"\3{\3{\3{\3|\3|\3|\3}\3}\3}\3}\3~\3~\3~\3\177\3\177\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081"+
		"\u05c2\n\u0081\f\u0081\16\u0081\u05c5\13\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\7\u0082\u05cd\n\u0082\f\u0082\16\u0082\u05d0"+
		"\13\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u05d8"+
		"\n\u0083\f\u0083\16\u0083\u05db\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\7\u0084\u05e3\n\u0084\f\u0084\16\u0084\u05e6\13\u0084"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u05ee\n\u0085"+
		"\f\u0085\16\u0085\u05f1\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\7\u0086\u05f9\n\u0086\f\u0086\16\u0086\u05fc\13\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0605\n\u0087"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u060a\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u060f\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u061a\n\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\5\u008a\u0621\n\u008a\7\u008a\u0623\n\u008a\f\u008a\16"+
		"\u008a\u0626\13\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u062b\n\u008b\3"+
		"\u008b\3\u008b\3\u008b\5\u008b\u0630\n\u008b\7\u008b\u0632\n\u008b\f\u008b"+
		"\16\u008b\u0635\13\u008b\3\u008b\5\u008b\u0638\n\u008b\5\u008b\u063a\n"+
		"\u008b\3\u008c\5\u008c\u063d\n\u008c\3\u008c\3\u008c\5\u008c\u0641\n\u008c"+
		"\3\u008c\3\u008c\5\u008c\u0645\n\u008c\5\u008c\u0647\n\u008c\3\u008c\5"+
		"\u008c\u064a\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\5\u008d\u0655\n\u008d\3\u008d\3\u008d\5\u008d\u0659"+
		"\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u065f\n\u008d\3\u008d"+
		"\5\u008d\u0662\n\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u0667\n\u008e\3"+
		"\u008e\3\u008e\3\u008f\3\u008f\5\u008f\u066d\n\u008f\3\u008f\3\u008f\3"+
		"\u008f\3\u0090\3\u0090\3\u0091\3\u0091\7\u0091\u0676\n\u0091\f\u0091\16"+
		"\u0091\u0679\13\u0091\3\u0091\7\u0091\u067c\n\u0091\f\u0091\16\u0091\u067f"+
		"\13\u0091\3\u0091\5\u0091\u0682\n\u0091\3\u0091\3\u0091\7\u0091\u0686"+
		"\n\u0091\f\u0091\16\u0091\u0689\13\u0091\3\u0091\5\u0091\u068c\n\u0091"+
		"\3\u0091\6\u0091\u068f\n\u0091\r\u0091\16\u0091\u0690\3\u0091\7\u0091"+
		"\u0694\n\u0091\f\u0091\16\u0091\u0697\13\u0091\3\u0091\5\u0091\u069a\n"+
		"\u0091\3\u0091\6\u0091\u069d\n\u0091\r\u0091\16\u0091\u069e\3\u0091\5"+
		"\u0091\u06a2\n\u0091\3\u0091\5\u0091\u06a5\n\u0091\3\u0092\6\u0092\u06a8"+
		"\n\u0092\r\u0092\16\u0092\u06a9\3\u0092\3\u0092\5\u0092\u06ae\n\u0092"+
		"\3\u0093\7\u0093\u06b1\n\u0093\f\u0093\16\u0093\u06b4\13\u0093\3\u0093"+
		"\6\u0093\u06b7\n\u0093\r\u0093\16\u0093\u06b8\3\u0093\3\u0093\5\u0093"+
		"\u06bd\n\u0093\3\u0094\3\u0094\3\u0094\7\u0094\u06c2\n\u0094\f\u0094\16"+
		"\u0094\u06c5\13\u0094\3\u0094\5\u0094\u06c8\n\u0094\3\u0094\3\u0094\3"+
		"\u0094\6\u0094\u06cd\n\u0094\r\u0094\16\u0094\u06ce\3\u0094\5\u0094\u06d2"+
		"\n\u0094\3\u0094\5\u0094\u06d5\n\u0094\3\u0095\3\u0095\3\u0095\3\u0096"+
		"\3\u0096\5\u0096\u06dc\n\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u06e1\n"+
		"\u0097\3\u0098\3\u0098\5\u0098\u06e5\n\u0098\3\u0098\5\u0098\u06e8\n\u0098"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\5\u009a\u06ee\n\u009a\3\u009b\3\u009b"+
		"\3\u009b\5\u009b\u06f3\n\u009b\3\u009b\5\u009b\u06f6\n\u009b\3\u009b\5"+
		"\u009b\u06f9\n\u009b\3\u009b\5\u009b\u06fc\n\u009b\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\3\u009c\3\u009d\3\u009d\7\u009d\u0705\n\u009d\f\u009d\16\u009d"+
		"\u0708\13\u009d\3\u009e\3\u009e\5\u009e\u070c\n\u009e\3\u009f\3\u009f"+
		"\7\u009f\u0710\n\u009f\f\u009f\16\u009f\u0713\13\u009f\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a1\3\u00a1\6\u00a1\u071b\n\u00a1\r\u00a1\16\u00a1"+
		"\u071c\3\u00a2\3\u00a2\5\u00a2\u0721\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a3\5\u00a3\u0729\n\u00a3\5\u00a3\u072b\n\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u0735"+
		"\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u073c\n\u00a6"+
		"\f\u00a6\16\u00a6\u073f\13\u00a6\3\u00a6\5\u00a6\u0742\n\u00a6\3\u00a7"+
		"\3\u00a7\3\u00a7\5\u00a7\u0747\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a9\6\u00a9\u074e\n\u00a9\r\u00a9\16\u00a9\u074f\3\u00aa\5\u00aa"+
		"\u0753\n\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa"+
		"\u075b\n\u00aa\f\u00aa\16\u00aa\u075e\13\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\5\u00ad\u076d\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\5\u00af\u0779\n\u00af\3\u00b0"+
		"\3\u00b0\3\u00b0\5\u00b0\u077e\n\u00b0\5\u00b0\u0780\n\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\5\u00b0\u0786\n\u00b0\5\u00b0\u0788\n\u00b0\7\u00b0"+
		"\u078a\n\u00b0\f\u00b0\16\u00b0\u078d\13\u00b0\3\u00b0\3\u00b0\5\u00b0"+
		"\u0791\n\u00b0\3\u00b0\5\u00b0\u0794\n\u00b0\3\u00b1\3\u00b1\3\u00b1\7"+
		"\u00b1\u0799\n\u00b1\f\u00b1\16\u00b1\u079c\13\u00b1\3\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\7\u00b1\u07a2\n\u00b1\f\u00b1\16\u00b1\u07a5\13\u00b1\5"+
		"\u00b1\u07a7\n\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u07ac\n\u00b1\f\u00b1"+
		"\16\u00b1\u07af\13\u00b1\5\u00b1\u07b1\n\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u07ba\n\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u07c1\n\u00b4\3\u00b5\3\u00b5\3\u00b5"+
		"\7\u00b5\u07c6\n\u00b5\f\u00b5\16\u00b5\u07c9\13\u00b5\3\u00b5\5\u00b5"+
		"\u07cc\n\u00b5\3\u00b6\3\u00b6\3\u00b6\6\u00b6\u07d1\n\u00b6\r\u00b6\16"+
		"\u00b6\u07d2\3\u00b6\5\u00b6\u07d6\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\6\u00b7\u07dc\n\u00b7\r\u00b7\16\u00b7\u07dd\3\u00b7\5\u00b7\u07e1\n"+
		"\u00b7\5\u00b7\u07e3\n\u00b7\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u07e8\n\u00b8"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07f1"+
		"\n\u00b9\3\u00b9\5\u00b9\u07f4\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u07fd\n\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\5\u00ba\u0802\n\u00ba\3\u00ba\5\u00ba\u0805\n\u00ba\3\u00bb\3\u00bb\3"+
		"\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u080d\n\u00bb\3\u00bc\3\u00bc\3"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0816\n\u00bc\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0825\n\u00bd\3\u00bd\5\u00bd\u0828\n"+
		"\u00bd\7\u00bd\u082a\n\u00bd\f\u00bd\16\u00bd\u082d\13\u00bd\3\u00be\3"+
		"\u00be\3\u00be\7\u00be\u0832\n\u00be\f\u00be\16\u00be\u0835\13\u00be\3"+
		"\u00be\5\u00be\u0838\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3"+
		"\u00bf\3\u00bf\5\u00bf\u0841\n\u00bf\3\u00bf\5\u00bf\u0844\n\u00bf\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u084d\n\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0852\n\u00c0\3\u00c0\5\u00c0\u0855\n"+
		"\u00c0\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u085a\n\u00c1\f\u00c1\16\u00c1"+
		"\u085d\13\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u0865\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u0869\n\u00c1\5\u00c1\u086b\n\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0872\n\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u0876\n\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u087b\n"+
		"\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\2\13<\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u0112\u0178\u00c7\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\2\7\5\2HRTTVV\4\2\61\61XX\3\2\65\66\3\2EF\6\2\678>>SSUU\2\u0936\2\u018d"+
		"\3\2\2\2\4\u0191\3\2\2\2\6\u0193\3\2\2\2\b\u019c\3\2\2\2\n\u01ab\3\2\2"+
		"\2\f\u01ae\3\2\2\2\16\u01b4\3\2\2\2\20\u01bc\3\2\2\2\22\u01be\3\2\2\2"+
		"\24\u01d9\3\2\2\2\26\u01e3\3\2\2\2\30\u020d\3\2\2\2\32\u0211\3\2\2\2\34"+
		"\u0213\3\2\2\2\36\u0215\3\2\2\2 \u0219\3\2\2\2\"\u0221\3\2\2\2$\u022a"+
		"\3\2\2\2&\u0233\3\2\2\2(\u0236\3\2\2\2*\u0238\3\2\2\2,\u0240\3\2\2\2."+
		"\u0242\3\2\2\2\60\u0258\3\2\2\2\62\u0263\3\2\2\2\64\u0265\3\2\2\2\66\u026d"+
		"\3\2\2\28\u0272\3\2\2\2:\u027a\3\2\2\2<\u027f\3\2\2\2>\u0290\3\2\2\2@"+
		"\u0296\3\2\2\2B\u029e\3\2\2\2D\u02a0\3\2\2\2F\u02b3\3\2\2\2H\u02dc\3\2"+
		"\2\2J\u02de\3\2\2\2L\u0311\3\2\2\2N\u0314\3\2\2\2P\u031f\3\2\2\2R\u034c"+
		"\3\2\2\2T\u034e\3\2\2\2V\u0351\3\2\2\2X\u0358\3\2\2\2Z\u035f\3\2\2\2\\"+
		"\u0367\3\2\2\2^\u0371\3\2\2\2`\u0375\3\2\2\2b\u0378\3\2\2\2d\u037b\3\2"+
		"\2\2f\u037e\3\2\2\2h\u0381\3\2\2\2j\u038b\3\2\2\2l\u0395\3\2\2\2n\u0399"+
		"\3\2\2\2p\u03a1\3\2\2\2r\u03b0\3\2\2\2t\u03d2\3\2\2\2v\u03f8\3\2\2\2x"+
		"\u03fa\3\2\2\2z\u0405\3\2\2\2|\u040f\3\2\2\2~\u0413\3\2\2\2\u0080\u0425"+
		"\3\2\2\2\u0082\u0427\3\2\2\2\u0084\u042f\3\2\2\2\u0086\u0434\3\2\2\2\u0088"+
		"\u0438\3\2\2\2\u008a\u043a\3\2\2\2\u008c\u043e\3\2\2\2\u008e\u044e\3\2"+
		"\2\2\u0090\u0456\3\2\2\2\u0092\u045e\3\2\2\2\u0094\u0460\3\2\2\2\u0096"+
		"\u0465\3\2\2\2\u0098\u046a\3\2\2\2\u009a\u046e\3\2\2\2\u009c\u0470\3\2"+
		"\2\2\u009e\u0472\3\2\2\2\u00a0\u0474\3\2\2\2\u00a2\u0477\3\2\2\2\u00a4"+
		"\u0479\3\2\2\2\u00a6\u047b\3\2\2\2\u00a8\u0482\3\2\2\2\u00aa\u048a\3\2"+
		"\2\2\u00ac\u0498\3\2\2\2\u00ae\u049a\3\2\2\2\u00b0\u049f\3\2\2\2\u00b2"+
		"\u04ac\3\2\2\2\u00b4\u04b2\3\2\2\2\u00b6\u04c8\3\2\2\2\u00b8\u04ca\3\2"+
		"\2\2\u00ba\u04d4\3\2\2\2\u00bc\u04d9\3\2\2\2\u00be\u04dc\3\2\2\2\u00c0"+
		"\u04ed\3\2\2\2\u00c2\u04f5\3\2\2\2\u00c4\u04fd\3\2\2\2\u00c6\u0501\3\2"+
		"\2\2\u00c8\u0509\3\2\2\2\u00ca\u050d\3\2\2\2\u00cc\u0528\3\2\2\2\u00ce"+
		"\u052a\3\2\2\2\u00d0\u052d\3\2\2\2\u00d2\u0541\3\2\2\2\u00d4\u0543\3\2"+
		"\2\2\u00d6\u054b\3\2\2\2\u00d8\u0559\3\2\2\2\u00da\u055b\3\2\2\2\u00dc"+
		"\u0569\3\2\2\2\u00de\u056b\3\2\2\2\u00e0\u0571\3\2\2\2\u00e2\u0573\3\2"+
		"\2\2\u00e4\u057b\3\2\2\2\u00e6\u0586\3\2\2\2\u00e8\u0588\3\2\2\2\u00ea"+
		"\u0599\3\2\2\2\u00ec\u059b\3\2\2\2\u00ee\u059e\3\2\2\2\u00f0\u05a1\3\2"+
		"\2\2\u00f2\u05a4\3\2\2\2\u00f4\u05a7\3\2\2\2\u00f6\u05aa\3\2\2\2\u00f8"+
		"\u05ad\3\2\2\2\u00fa\u05b1\3\2\2\2\u00fc\u05b4\3\2\2\2\u00fe\u05b8\3\2"+
		"\2\2\u0100\u05bb\3\2\2\2\u0102\u05c6\3\2\2\2\u0104\u05d1\3\2\2\2\u0106"+
		"\u05dc\3\2\2\2\u0108\u05e7\3\2\2\2\u010a\u05f2\3\2\2\2\u010c\u0604\3\2"+
		"\2\2\u010e\u0606\3\2\2\2\u0110\u060e\3\2\2\2\u0112\u0610\3\2\2\2\u0114"+
		"\u0639\3\2\2\2\u0116\u0649\3\2\2\2\u0118\u0661\3\2\2\2\u011a\u0663\3\2"+
		"\2\2\u011c\u066a\3\2\2\2\u011e\u0671\3\2\2\2\u0120\u06a4\3\2\2\2\u0122"+
		"\u06a7\3\2\2\2\u0124\u06b2\3\2\2\2\u0126\u06d4\3\2\2\2\u0128\u06d6\3\2"+
		"\2\2\u012a\u06d9\3\2\2\2\u012c\u06dd\3\2\2\2\u012e\u06e2\3\2\2\2\u0130"+
		"\u06e9\3\2\2\2\u0132\u06ed\3\2\2\2\u0134\u06ef\3\2\2\2\u0136\u06ff\3\2"+
		"\2\2\u0138\u0702\3\2\2\2\u013a\u070b\3\2\2\2\u013c\u070d\3\2\2\2\u013e"+
		"\u0716\3\2\2\2\u0140\u071a\3\2\2\2\u0142\u071e\3\2\2\2\u0144\u0724\3\2"+
		"\2\2\u0146\u072e\3\2\2\2\u0148\u0732\3\2\2\2\u014a\u0738\3\2\2\2\u014c"+
		"\u0746\3\2\2\2\u014e\u0748\3\2\2\2\u0150\u074d\3\2\2\2\u0152\u0752\3\2"+
		"\2\2\u0154\u075f\3\2\2\2\u0156\u0764\3\2\2\2\u0158\u0769\3\2\2\2\u015a"+
		"\u0771\3\2\2\2\u015c\u0776\3\2\2\2\u015e\u0793\3\2\2\2\u0160\u07b0\3\2"+
		"\2\2\u0162\u07b2\3\2\2\2\u0164\u07b9\3\2\2\2\u0166\u07c0\3\2\2\2\u0168"+
		"\u07c2\3\2\2\2\u016a\u07cd\3\2\2\2\u016c\u07d7\3\2\2\2\u016e\u07e7\3\2"+
		"\2\2\u0170\u07f3\3\2\2\2\u0172\u0804\3\2\2\2\u0174\u080c\3\2\2\2\u0176"+
		"\u080e\3\2\2\2\u0178\u0817\3\2\2\2\u017a\u082e\3\2\2\2\u017c\u0843\3\2"+
		"\2\2\u017e\u0854\3\2\2\2\u0180\u0875\3\2\2\2\u0182\u087a\3\2\2\2\u0184"+
		"\u087c\3\2\2\2\u0186\u087f\3\2\2\2\u0188\u0882\3\2\2\2\u018a\u0885\3\2"+
		"\2\2\u018c\u018e\5\f\7\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0190\7\2\2\3\u0190\3\3\2\2\2\u0191\u0192\5\20\t"+
		"\2\u0192\5\3\2\2\2\u0193\u0197\5\u00d0i\2\u0194\u0196\7_\2\2\u0195\u0194"+
		"\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\2\2\3\u019b\7\3\2\2\2"+
		"\u019c\u019e\7+\2\2\u019d\u019f\5\u0180\u00c1\2\u019e\u019d\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\7.\2\2\u01a1\u01a2\7W\2"+
		"\2\u01a2\u01a6\5\u00d2j\2\u01a3\u01a5\7_\2\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\2\2\3\u01aa\t\3\2\2\2\u01ab\u01ac"+
		"\5\u00d6l\2\u01ac\13\3\2\2\2\u01ad\u01af\5\16\b\2\u01ae\u01ad\3\2\2\2"+
		"\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\r\3"+
		"\2\2\2\u01b2\u01b5\5\26\f\2\u01b3\u01b5\5\22\n\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\17\3\2\2\2\u01b6\u01b7\5\26\f\2\u01b7\u01b8\7_\2"+
		"\2\u01b8\u01bd\3\2\2\2\u01b9\u01bd\5\22\n\2\u01ba\u01bd\7_\2\2\u01bb\u01bd"+
		"\7\2\2\3\u01bc\u01b6\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\21\3\2\2\2\u01be\u01c3\5\24\13\2\u01bf\u01c0\7\64"+
		"\2\2\u01c0\u01c2\5\24\13\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6\u01c8\7\64\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ca\7_\2\2\u01ca\23\3\2\2\2\u01cb\u01da\5\30\r"+
		"\2\u01cc\u01da\5\u00c6d\2\u01cd\u01da\5\u00d6l\2\u01ce\u01da\5\36\20\2"+
		"\u01cf\u01da\5,\27\2\u01d0\u01da\5 \21\2\u01d1\u01da\7\f\2\2\u01d2\u01da"+
		"\5&\24\2\u01d3\u01da\5(\25\2\u01d4\u01da\5*\26\2\u01d5\u01da\7\16\2\2"+
		"\u01d6\u01da\7\30\2\2\u01d7\u01da\5\"\22\2\u01d8\u01da\5$\23\2\u01d9\u01cb"+
		"\3\2\2\2\u01d9\u01cc\3\2\2\2\u01d9\u01cd\3\2\2\2\u01d9\u01ce\3\2\2\2\u01d9"+
		"\u01cf\3\2\2\2\u01d9\u01d0\3\2\2\2\u01d9\u01d1\3\2\2\2\u01d9\u01d2\3\2"+
		"\2\2\u01d9\u01d3\3\2\2\2\u01d9\u01d4\3\2\2\2\u01d9\u01d5\3\2\2\2\u01d9"+
		"\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da\25\3\2\2"+
		"\2\u01db\u01e4\5F$\2\u01dc\u01e4\5h\65\2\u01dd\u01e4\5B\"\2\u01de\u01e4"+
		"\5r:\2\u01df\u01e4\5p9\2\u01e0\u01e4\5v<\2\u01e1\u01e4\5n8\2\u01e2\u01e4"+
		"\5~@\2\u01e3\u01db\3\2\2\2\u01e3\u01dc\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3"+
		"\u01de\3\2\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e3\u01e2\3\2\2\2\u01e4\27\3\2\2\2\u01e5\u01e6\7[\2\2\u01e6\u01e7"+
		"\7\62\2\2\u01e7\u01ea\5\u00d2j\2\u01e8\u01e9\7=\2\2\u01e9\u01eb\5\32\16"+
		"\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u020e\3\2\2\2\u01ec\u01ed"+
		"\7+\2\2\u01ed\u01ee\5\u0174\u00bb\2\u01ee\u01ef\7.\2\2\u01ef\u01f2\3\2"+
		"\2\2\u01f0\u01f2\5\u0176\u00bc\2\u01f1\u01ec\3\2\2\2\u01f1\u01f0\3\2\2"+
		"\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7\62\2\2\u01f4\u01f7\5\u00d2j\2\u01f5"+
		"\u01f6\7=\2\2\u01f6\u01f8\5\32\16\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3"+
		"\2\2\2\u01f8\u020e\3\2\2\2\u01f9\u01fa\5\u0168\u00b5\2\u01fa\u01fb\7="+
		"\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u0203\5\u00d4"+
		"k\2\u0201\u0203\5\u00d6l\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203"+
		"\u0205\3\2\2\2\u0204\u0206\7^\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u020e\3\2\2\2\u0207\u0208\5\u0174\u00bb\2\u0208\u020b\5\34"+
		"\17\2\u0209\u020c\5\u00d4k\2\u020a\u020c\5\u00d6l\2\u020b\u0209\3\2\2"+
		"\2\u020b\u020a\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u01e5\3\2\2\2\u020d\u01f1"+
		"\3\2\2\2\u020d\u01fc\3\2\2\2\u020d\u0207\3\2\2\2\u020e\31\3\2\2\2\u020f"+
		"\u0212\5\u00d4k\2\u0210\u0212\5\u00d6l\2\u0211\u020f\3\2\2\2\u0211\u0210"+
		"\3\2\2\2\u0212\33\3\2\2\2\u0213\u0214\t\2\2\2\u0214\35\3\2\2\2\u0215\u0217"+
		"\7\26\2\2\u0216\u0218\5\u00d6l\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218\37\3\2\2\2\u0219\u021f\7\21\2\2\u021a\u021d\5\u00d2j\2\u021b"+
		"\u021c\7\36\2\2\u021c\u021e\5\u00d2j\2\u021d\u021b\3\2\2\2\u021d\u021e"+
		"\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021a\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"!\3\2\2\2\u0221\u0222\7#\2\2\u0222\u0227\7[\2\2\u0223\u0224\7\63\2\2\u0224"+
		"\u0226\7[\2\2\u0225\u0223\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228#\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b"+
		"\7\37\2\2\u022b\u0230\7[\2\2\u022c\u022d\7\63\2\2\u022d\u022f\7[\2\2\u022e"+
		"\u022c\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231%\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\7\"\2\2\u0234\u0235"+
		"\5\u017a\u00be\2\u0235\'\3\2\2\2\u0236\u0237\5\u00d4k\2\u0237)\3\2\2\2"+
		"\u0238\u0239\7!\2\2\u0239\u023c\5\u00d2j\2\u023a\u023b\7\63\2\2\u023b"+
		"\u023d\5\u00d2j\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d+\3\2\2"+
		"\2\u023e\u0241\5.\30\2\u023f\u0241\5\60\31\2\u0240\u023e\3\2\2\2\u0240"+
		"\u023f\3\2\2\2\u0241-\3\2\2\2\u0242\u0243\7\13\2\2\u0243\u0244\58\35\2"+
		"\u0244/\3\2\2\2\u0245\u0249\7\36\2\2\u0246\u0248\t\3\2\2\u0247\u0246\3"+
		"\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\5<\37\2\u024d\u024e\7\13"+
		"\2\2\u024e\u024f\5\62\32\2\u024f\u0259\3\2\2\2\u0250\u0252\7\36\2\2\u0251"+
		"\u0253\t\3\2\2\u0252\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0252\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\7\13\2\2\u0257"+
		"\u0259\5\62\32\2\u0258\u0245\3\2\2\2\u0258\u0250\3\2\2\2\u0259\61\3\2"+
		"\2\2\u025a\u025b\7+\2\2\u025b\u025d\5\64\33\2\u025c\u025e\7\63\2\2\u025d"+
		"\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7."+
		"\2\2\u0260\u0264\3\2\2\2\u0261\u0264\5\64\33\2\u0262\u0264\7\67\2\2\u0263"+
		"\u025a\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264\63\3\2\2"+
		"\2\u0265\u026a\5\66\34\2\u0266\u0267\7\63\2\2\u0267\u0269\5\66\34\2\u0268"+
		"\u0266\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\65\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u0270\7[\2\2\u026e\u026f"+
		"\7\34\2\2\u026f\u0271\7[\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\67\3\2\2\2\u0272\u0277\5:\36\2\u0273\u0274\7\63\2\2\u0274\u0276\5:\36"+
		"\2\u0275\u0273\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u02789\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027d\5<\37\2\u027b"+
		"\u027c\7\34\2\2\u027c\u027e\7[\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e;\3\2\2\2\u027f\u0280\b\37\1\2\u0280\u0281\7[\2\2\u0281\u0287"+
		"\3\2\2\2\u0282\u0283\f\4\2\2\u0283\u0284\7\61\2\2\u0284\u0286\7[\2\2\u0285"+
		"\u0282\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288=\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028b\7_\2\2\u028b\u028c"+
		"\7\3\2\2\u028c\u028d\5\f\7\2\u028d\u028e\7\4\2\2\u028e\u0291\3\2\2\2\u028f"+
		"\u0291\5\22\n\2\u0290\u028a\3\2\2\2\u0290\u028f\3\2\2\2\u0291?\3\2\2\2"+
		"\u0292\u0293\7U\2\2\u0293\u0294\5\u00e0q\2\u0294\u0295\7_\2\2\u0295\u0297"+
		"\3\2\2\2\u0296\u0292\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0296\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299A\3\2\2\2\u029a\u029b\5@!\2\u029b\u029c\5D#\2\u029c"+
		"\u029f\3\2\2\2\u029d\u029f\5D#\2\u029e\u029a\3\2\2\2\u029e\u029d\3\2\2"+
		"\2\u029fC\3\2\2\2\u02a0\u02a1\7\23\2\2\u02a1\u02a3\7[\2\2\u02a2\u02a4"+
		"\5\u00c8e\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02aa\3\2\2"+
		"\2\u02a5\u02a7\7+\2\2\u02a6\u02a8\5\u015c\u00af\2\u02a7\u02a6\3\2\2\2"+
		"\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\7.\2\2\u02aa\u02a5"+
		"\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\7\62\2\2"+
		"\u02ad\u02ae\5> \2\u02aeE\3\2\2\2\u02af\u02b0\5@!\2\u02b0\u02b1\5H%\2"+
		"\u02b1\u02b4\3\2\2\2\u02b2\u02b4\5H%\2\u02b3\u02af\3\2\2\2\u02b3\u02b2"+
		"\3\2\2\2\u02b4G\3\2\2\2\u02b5\u02b6\7\35\2\2\u02b6\u02b8\7[\2\2\u02b7"+
		"\u02b9\5\u00c8e\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02ba\u02bc\7+\2\2\u02bb\u02bd\5J&\2\u02bc\u02bb\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c1\7.\2\2\u02bf\u02c0\7W\2"+
		"\2\u02c0\u02c2\5\u00d2j\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c5\7\62\2\2\u02c4\u02c6\5\u0182\u00c2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02dd\5>"+
		" \2\u02c8\u02c9\7&\2\2\u02c9\u02ca\7\35\2\2\u02ca\u02cc\7[\2\2\u02cb\u02cd"+
		"\5\u00c8e\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2"+
		"\2\u02ce\u02d0\7+\2\2\u02cf\u02d1\5J&\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d5\7.\2\2\u02d3\u02d4\7W\2\2\u02d4"+
		"\u02d6\5\u00d2j\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7"+
		"\3\2\2\2\u02d7\u02d9\7\62\2\2\u02d8\u02da\5\u0182\u00c2\2\u02d9\u02d8"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\5> \2\u02dc"+
		"\u02b5\3\2\2\2\u02dc\u02c8\3\2\2\2\u02ddI\3\2\2\2\u02de\u02df\5L\'\2\u02df"+
		"K\3\2\2\2\u02e0\u02e4\5N(\2\u02e1\u02e3\5V,\2\u02e2\u02e1\3\2\2\2\u02e3"+
		"\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02ea\3\2"+
		"\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e9\5Z.\2\u02e8\u02e7\3\2\2\2\u02e9\u02ec"+
		"\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ed\u02ef\5R*\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2"+
		"\2\u02ef\u0312\3\2\2\2\u02f0\u02f4\5P)\2\u02f1\u02f3\5Z.\2\u02f2\u02f1"+
		"\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f9\5R*\2\u02f8\u02f7\3\2\2"+
		"\2\u02f8\u02f9\3\2\2\2\u02f9\u0312\3\2\2\2\u02fa\u02fc\5V,\2\u02fb\u02fa"+
		"\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u0302\3\2\2\2\u02ff\u0301\5Z.\2\u0300\u02ff\3\2\2\2\u0301\u0304\3\2\2"+
		"\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302"+
		"\3\2\2\2\u0305\u0307\5R*\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0312\3\2\2\2\u0308\u030a\5Z.\2\u0309\u0308\3\2\2\2\u030a\u030b\3\2\2"+
		"\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030f"+
		"\5R*\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0312\3\2\2\2\u0310"+
		"\u0312\5R*\2\u0311\u02e0\3\2\2\2\u0311\u02f0\3\2\2\2\u0311\u02fb\3\2\2"+
		"\2\u0311\u0309\3\2\2\2\u0311\u0310\3\2\2\2\u0312M\3\2\2\2\u0313\u0315"+
		"\5V,\2\u0314\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0314\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\78\2\2\u0319\u031b\7\63"+
		"\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031bO\3\2\2\2\u031c\u031e"+
		"\5V,\2\u031d\u031c\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0324\5Z"+
		".\2\u0323\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\78\2\2\u0328\u032a\7\63"+
		"\2\2\u0329\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032aQ\3\2\2\2\u032b\u032c"+
		"\7\67\2\2\u032c\u0330\5V,\2\u032d\u032f\5\\/\2\u032e\u032d\3\2\2\2\u032f"+
		"\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0334\3\2"+
		"\2\2\u0332\u0330\3\2\2\2\u0333\u0335\5T+\2\u0334\u0333\3\2\2\2\u0334\u0335"+
		"\3\2\2\2\u0335\u034d\3\2\2\2\u0336\u0337\7\67\2\2\u0337\u033b\5X-\2\u0338"+
		"\u033a\5\\/\2\u0339\u0338\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2"+
		"\2\2\u033b\u033c\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033e"+
		"\u0340\5T+\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u034d\3\2\2"+
		"\2\u0341\u0342\7\67\2\2\u0342\u0344\7\63\2\2\u0343\u0345\5\\/\2\u0344"+
		"\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2"+
		"\2\2\u0347\u0349\3\2\2\2\u0348\u034a\5T+\2\u0349\u0348\3\2\2\2\u0349\u034a"+
		"\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u034d\5T+\2\u034c\u032b\3\2\2\2\u034c"+
		"\u0336\3\2\2\2\u034c\u0341\3\2\2\2\u034c\u034b\3\2\2\2\u034dS\3\2\2\2"+
		"\u034e\u034f\7G\2\2\u034f\u0350\5V,\2\u0350U\3\2\2\2\u0351\u0353\5^\60"+
		"\2\u0352\u0354\7\63\2\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0356\3\2\2\2\u0355\u0357\7^\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2"+
		"\2\2\u0357W\3\2\2\2\u0358\u035a\5`\61\2\u0359\u035b\7\63\2\2\u035a\u0359"+
		"\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u035e\7^\2\2\u035d"+
		"\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035eY\3\2\2\2\u035f\u0360\5^\60\2"+
		"\u0360\u0362\5f\64\2\u0361\u0363\7\63\2\2\u0362\u0361\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0366\7^\2\2\u0365\u0364\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366[\3\2\2\2\u0367\u0369\5^\60\2\u0368\u036a\5f\64\2"+
		"\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u036d"+
		"\7\63\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2\2\2"+
		"\u036e\u0370\7^\2\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370]\3\2"+
		"\2\2\u0371\u0373\7[\2\2\u0372\u0374\5b\62\2\u0373\u0372\3\2\2\2\u0373"+
		"\u0374\3\2\2\2\u0374_\3\2\2\2\u0375\u0376\7[\2\2\u0376\u0377\5d\63\2\u0377"+
		"a\3\2\2\2\u0378\u0379\7\62\2\2\u0379\u037a\5\u00d2j\2\u037ac\3\2\2\2\u037b"+
		"\u037c\7\62\2\2\u037c\u037d\5\u00d8m\2\u037de\3\2\2\2\u037e\u037f\7=\2"+
		"\2\u037f\u0380\5\u00d2j\2\u0380g\3\2\2\2\u0381\u0382\7(\2\2\u0382\u0383"+
		"\5\u00e0q\2\u0383\u0384\7\62\2\2\u0384\u0389\5> \2\u0385\u038a\5j\66\2"+
		"\u0386\u0388\5l\67\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038a"+
		"\3\2\2\2\u0389\u0385\3\2\2\2\u0389\u0387\3\2\2\2\u038ai\3\2\2\2\u038b"+
		"\u038c\7\'\2\2\u038c\u038d\5\u00e0q\2\u038d\u038e\7\62\2\2\u038e\u0393"+
		"\5> \2\u038f\u0394\5j\66\2\u0390\u0392\5l\67\2\u0391\u0390\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u038f\3\2\2\2\u0393\u0391\3\2"+
		"\2\2\u0394k\3\2\2\2\u0395\u0396\7\n\2\2\u0396\u0397\7\62\2\2\u0397\u0398"+
		"\5> \2\u0398m\3\2\2\2\u0399\u039a\7 \2\2\u039a\u039b\5\u00e0q\2\u039b"+
		"\u039c\7\62\2\2\u039c\u039e\5> \2\u039d\u039f\5l\67\2\u039e\u039d\3\2"+
		"\2\2\u039e\u039f\3\2\2\2\u039fo\3\2\2\2\u03a0\u03a2\7&\2\2\u03a1\u03a0"+
		"\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\7\31\2\2"+
		"\u03a4\u03a5\5\u0168\u00b5\2\u03a5\u03a6\7\20\2\2\u03a6\u03a7\5\u00d6"+
		"l\2\u03a7\u03a9\7\62\2\2\u03a8\u03aa\7^\2\2\u03a9\u03a8\3\2\2\2\u03a9"+
		"\u03aa\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad\5> \2\u03ac\u03ae\5l\67"+
		"\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03aeq\3\2\2\2\u03af\u03b1"+
		"\7&\2\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03ce\7%\2\2\u03b3\u03b4\7+\2\2\u03b4\u03b9\5t;\2\u03b5\u03b6\7\63\2"+
		"\2\u03b6\u03b8\5t;\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7"+
		"\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc"+
		"\u03be\7\63\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3"+
		"\2\2\2\u03bf\u03c0\7.\2\2\u03c0\u03c1\7\62\2\2\u03c1\u03cf\3\2\2\2\u03c2"+
		"\u03c7\5t;\2\u03c3\u03c4\7\63\2\2\u03c4\u03c6\5t;\2\u03c5\u03c3\3\2\2"+
		"\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca"+
		"\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03cc\7\62\2\2\u03cb\u03cd\7^\2\2\u03cc"+
		"\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03b3\3\2"+
		"\2\2\u03ce\u03c2\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\5> \2\u03d1s"+
		"\3\2\2\2\u03d2\u03d5\5\u00d2j\2\u03d3\u03d4\7\34\2\2\u03d4\u03d6\5\u016e"+
		"\u00b8\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6u\3\2\2\2\u03d7"+
		"\u03d8\7\33\2\2\u03d8\u03d9\7\62\2\2\u03d9\u03da\5> \2\u03da\u03db\5|"+
		"?\2\u03db\u03f9\3\2\2\2\u03dc\u03dd\7\33\2\2\u03dd\u03de\7\62\2\2\u03de"+
		"\u03e0\5> \2\u03df\u03e1\5x=\2\u03e0\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2"+
		"\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e5\3\2\2\2\u03e4\u03e6"+
		"\5l\67\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7"+
		"\u03e9\5|?\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03f9\3\2\2"+
		"\2\u03ea\u03eb\7\33\2\2\u03eb\u03ec\7\62\2\2\u03ec\u03ee\5> \2\u03ed\u03ef"+
		"\5z>\2\u03ee\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u03f3\3\2\2\2\u03f2\u03f4\5l\67\2\u03f3\u03f2\3\2"+
		"\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f7\5|?\2\u03f6\u03f5"+
		"\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03d7\3\2\2\2\u03f8"+
		"\u03dc\3\2\2\2\u03f8\u03ea\3\2\2\2\u03f9w\3\2\2\2\u03fa\u0400\7\17\2\2"+
		"\u03fb\u03fe\5\u00d2j\2\u03fc\u03fd\7\34\2\2\u03fd\u03ff\7[\2\2\u03fe"+
		"\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400\u03fb\3\2"+
		"\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\7\62\2\2\u0403"+
		"\u0404\5> \2\u0404y\3\2\2\2\u0405\u0406\7\17\2\2\u0406\u0407\7\67\2\2"+
		"\u0407\u040a\5\u00d2j\2\u0408\u0409\7\34\2\2\u0409\u040b\7[\2\2\u040a"+
		"\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\7\62"+
		"\2\2\u040d\u040e\5> \2\u040e{\3\2\2\2\u040f\u0410\7\24\2\2\u0410\u0411"+
		"\7\62\2\2\u0411\u0412\5> \2\u0412}\3\2\2\2\u0413\u0414\5\u0184\u00c3\2"+
		"\u0414\u0415\5\u0080A\2\u0415\u0416\7\62\2\2\u0416\u0417\7_\2\2\u0417"+
		"\u0419\7\3\2\2\u0418\u041a\5\u0082B\2\u0419\u0418\3\2\2\2\u041a\u041b"+
		"\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u041e\7\4\2\2\u041e\177\3\2\2\2\u041f\u0420\5\u00dco\2\u0420\u0422\7"+
		"\63\2\2\u0421\u0423\5\u00dan\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2"+
		"\u0423\u0426\3\2\2\2\u0424\u0426\5\u00e0q\2\u0425\u041f\3\2\2\2\u0425"+
		"\u0424\3\2\2\2\u0426\u0081\3\2\2\2\u0427\u0428\5\u0186\u00c4\2\u0428\u042a"+
		"\5\u0086D\2\u0429\u042b\5\u0084C\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2"+
		"\2\2\u042b\u042c\3\2\2\2\u042c\u042d\7\62\2\2\u042d\u042e\5> \2\u042e"+
		"\u0083\3\2\2\2\u042f\u0430\7(\2\2\u0430\u0431\5\u00e0q\2\u0431\u0085\3"+
		"\2\2\2\u0432\u0435\5\u00aeX\2\u0433\u0435\5\u0088E\2\u0434\u0432\3\2\2"+
		"\2\u0434\u0433\3\2\2\2\u0435\u0087\3\2\2\2\u0436\u0439\5\u008aF\2\u0437"+
		"\u0439\5\u008cG\2\u0438\u0436\3\2\2\2\u0438\u0437\3\2\2\2\u0439\u0089"+
		"\3\2\2\2\u043a\u043b\5\u008cG\2\u043b\u043c\7\34\2\2\u043c\u043d\5\u00a0"+
		"Q\2\u043d\u008b\3\2\2\2\u043e\u0443\5\u008eH\2\u043f\u0440\79\2\2\u0440"+
		"\u0442\5\u008eH\2\u0441\u043f\3\2\2\2\u0442\u0445\3\2\2\2\u0443\u0441"+
		"\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u008d\3\2\2\2\u0445\u0443\3\2\2\2\u0446"+
		"\u044f\5\u0090I\2\u0447\u044f\5\u009eP\2\u0448\u044f\5\u00a2R\2\u0449"+
		"\u044f\5\u00a4S\2\u044a\u044f\5\u00aaV\2\u044b\u044f\5\u00acW\2\u044c"+
		"\u044f\5\u00b6\\\2\u044d\u044f\5\u00be`\2\u044e\u0446\3\2\2\2\u044e\u0447"+
		"\3\2\2\2\u044e\u0448\3\2\2\2\u044e\u0449\3\2\2\2\u044e\u044a\3\2\2\2\u044e"+
		"\u044b\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044d\3\2\2\2\u044f\u008f\3\2"+
		"\2\2\u0450\u0457\5\u0096L\2\u0451\u0457\5\u0094K\2\u0452\u0457\5\u0140"+
		"\u00a1\2\u0453\u0457\7\r\2\2\u0454\u0457\7\22\2\2\u0455\u0457\7\b\2\2"+
		"\u0456\u0450\3\2\2\2\u0456\u0451\3\2\2\2\u0456\u0452\3\2\2\2\u0456\u0453"+
		"\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0455\3\2\2\2\u0457\u0091\3\2\2\2\u0458"+
		"\u045f\5\u0096L\2\u0459\u045f\5\u0094K\2\u045a\u045f\5\u0140\u00a1\2\u045b"+
		"\u045f\7\r\2\2\u045c\u045f\7\22\2\2\u045d\u045f\7\b\2\2\u045e\u0458\3"+
		"\2\2\2\u045e\u0459\3\2\2\2\u045e\u045a\3\2\2\2\u045e\u045b\3\2\2\2\u045e"+
		"\u045c\3\2\2\2\u045e\u045d\3\2\2\2\u045f\u0093\3\2\2\2\u0460\u0461\5\u0098"+
		"M\2\u0461\u0462\t\4\2\2\u0462\u0463\5\u009cO\2\u0463\u0095\3\2\2\2\u0464"+
		"\u0466\7\66\2\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3"+
		"\2\2\2\u0467\u0468\7\\\2\2\u0468\u0097\3\2\2\2\u0469\u046b\7\66\2\2\u046a"+
		"\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\5\u009a"+
		"N\2\u046d\u0099\3\2\2\2\u046e\u046f\7\\\2\2\u046f\u009b\3\2\2\2\u0470"+
		"\u0471\7\\\2\2\u0471\u009d\3\2\2\2\u0472\u0473\5\u00a0Q\2\u0473\u009f"+
		"\3\2\2\2\u0474\u0475\6Q\3\2\u0475\u0476\7[\2\2\u0476\u00a1\3\2\2\2\u0477"+
		"\u0478\5\u0188\u00c5\2\u0478\u00a3\3\2\2\2\u0479\u047a\5\u00a6T\2\u047a"+
		"\u00a5\3\2\2\2\u047b\u047e\7[\2\2\u047c\u047d\7\61\2\2\u047d\u047f\7["+
		"\2\2\u047e\u047c\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u047e\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481\u00a7\3\2\2\2\u0482\u0487\7[\2\2\u0483\u0484\7\61"+
		"\2\2\u0484\u0486\7[\2\2\u0485\u0483\3\2\2\2\u0486\u0489\3\2\2\2\u0487"+
		"\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u00a9\3\2\2\2\u0489\u0487\3\2"+
		"\2\2\u048a\u048b\7+\2\2\u048b\u048c\5\u0088E\2\u048c\u048d\7.\2\2\u048d"+
		"\u00ab\3\2\2\2\u048e\u0490\7,\2\2\u048f\u0491\5\u00b0Y\2\u0490\u048f\3"+
		"\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0499\7/\2\2\u0493"+
		"\u0495\7+\2\2\u0494\u0496\5\u00aeX\2\u0495\u0494\3\2\2\2\u0495\u0496\3"+
		"\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\7.\2\2\u0498\u048e\3\2\2\2\u0498"+
		"\u0493\3\2\2\2\u0499\u00ad\3\2\2\2\u049a\u049b\5\u00b2Z\2\u049b\u049d"+
		"\7\63\2\2\u049c\u049e\5\u00b0Y\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2"+
		"\2\u049e\u00af\3\2\2\2\u049f\u04a4\5\u00b2Z\2\u04a0\u04a1\7\63\2\2\u04a1"+
		"\u04a3\5\u00b2Z\2\u04a2\u04a0\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a2"+
		"\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a7"+
		"\u04a9\7\63\2\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u00b1\3"+
		"\2\2\2\u04aa\u04ad\5\u00b4[\2\u04ab\u04ad\5\u0088E\2\u04ac\u04aa\3\2\2"+
		"\2\u04ac\u04ab\3\2\2\2\u04ad\u00b3\3\2\2\2\u04ae\u04af\7\67\2\2\u04af"+
		"\u04b3\5\u00a0Q\2\u04b0\u04b1\7\67\2\2\u04b1\u04b3\5\u00a2R\2\u04b2\u04ae"+
		"\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u00b5\3\2\2\2\u04b4\u04b5\7-\2\2\u04b5"+
		"\u04c9\7\60\2\2\u04b6\u04b7\7-\2\2\u04b7\u04b9\5\u00bc_\2\u04b8\u04ba"+
		"\7\63\2\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\3\2\2\2"+
		"\u04bb\u04bc\7\60\2\2\u04bc\u04c9\3\2\2\2\u04bd\u04be\7-\2\2\u04be\u04c1"+
		"\5\u00b8]\2\u04bf\u04c0\7\63\2\2\u04c0\u04c2\5\u00bc_\2\u04c1\u04bf\3"+
		"\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04c5\7\63\2\2\u04c4"+
		"\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7\60"+
		"\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04b4\3\2\2\2\u04c8\u04b6\3\2\2\2\u04c8"+
		"\u04bd\3\2\2\2\u04c9\u00b7\3\2\2\2\u04ca\u04cf\5\u00ba^\2\u04cb\u04cc"+
		"\7\63\2\2\u04cc\u04ce\5\u00ba^\2\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2"+
		"\2\u04cf\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u00b9\3\2\2\2\u04d1\u04cf"+
		"\3\2\2\2\u04d2\u04d5\5\u0092J\2\u04d3\u04d5\5\u00a6T\2\u04d4\u04d2\3\2"+
		"\2\2\u04d4\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\7\62\2\2\u04d7"+
		"\u04d8\5\u0088E\2\u04d8\u00bb\3\2\2\2\u04d9\u04da\7G\2\2\u04da\u04db\5"+
		"\u00a0Q\2\u04db\u00bd\3\2\2\2\u04dc\u04dd\5\u00a8U\2\u04dd\u04e9\7+\2"+
		"\2\u04de\u04e1\5\u00c0a\2\u04df\u04e0\7\63\2\2\u04e0\u04e2\5\u00c2b\2"+
		"\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e5"+
		"\5\u00c2b\2\u04e4\u04de\3\2\2\2\u04e4\u04e3\3\2\2\2\u04e5\u04e7\3\2\2"+
		"\2\u04e6\u04e8\7\63\2\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8"+
		"\u04ea\3\2\2\2\u04e9\u04e4\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2"+
		"\2\2\u04eb\u04ec\7.\2\2\u04ec\u00bf\3\2\2\2\u04ed\u04f2\5\u0088E\2\u04ee"+
		"\u04ef\7\63\2\2\u04ef\u04f1\5\u0088E\2\u04f0\u04ee\3\2\2\2\u04f1\u04f4"+
		"\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u00c1\3\2\2\2\u04f4"+
		"\u04f2\3\2\2\2\u04f5\u04fa\5\u00c4c\2\u04f6\u04f7\7\63\2\2\u04f7\u04f9"+
		"\5\u00c4c\2\u04f8\u04f6\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2"+
		"\2\u04fa\u04fb\3\2\2\2\u04fb\u00c3\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u04fe"+
		"\7[\2\2\u04fe\u04ff\7=\2\2\u04ff\u0500\5\u0088E\2\u0500\u00c5\3\2\2\2"+
		"\u0501\u0502\5\u018a\u00c6\2\u0502\u0504\7[\2\2\u0503\u0505\5\u00c8e\2"+
		"\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507"+
		"\7=\2\2\u0507\u0508\5\u00d2j\2\u0508\u00c7\3\2\2\2\u0509\u050a\7,\2\2"+
		"\u050a\u050b\5\u00caf\2\u050b\u050c\7/\2\2\u050c\u00c9\3\2\2\2\u050d\u0512"+
		"\5\u00ccg\2\u050e\u050f\7\63\2\2\u050f\u0511\5\u00ccg\2\u0510\u050e\3"+
		"\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513"+
		"\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0515\u0517\7\63\2\2\u0516\u0515\3"+
		"\2\2\2\u0516\u0517\3\2\2\2\u0517\u00cb\3\2\2\2\u0518\u051a\7[\2\2\u0519"+
		"\u051b\5\u00ceh\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u0529"+
		"\3\2\2\2\u051c\u051d\7\67\2\2\u051d\u0520\7[\2\2\u051e\u051f\7\62\2\2"+
		"\u051f\u0521\5\u00d2j\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521"+
		"\u0529\3\2\2\2\u0522\u0523\7G\2\2\u0523\u0526\7[\2\2\u0524\u0525\7\62"+
		"\2\2\u0525\u0527\5\u00d2j\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"\u0529\3\2\2\2\u0528\u0518\3\2\2\2\u0528\u051c\3\2\2\2\u0528\u0522\3\2"+
		"\2\2\u0529\u00cd\3\2\2\2\u052a\u052b\7\62\2\2\u052b\u052c\5\u00d2j\2\u052c"+
		"\u00cf\3\2\2\2\u052d\u0532\5\u00d2j\2\u052e\u052f\7\63\2\2\u052f\u0531"+
		"\5\u00d2j\2\u0530\u052e\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530\3\2\2"+
		"\2\u0532\u0533\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0535\u0537"+
		"\7\63\2\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u00d1\3\2\2\2"+
		"\u0538\u053e\5\u00e2r\2\u0539\u053a\7(\2\2\u053a\u053b\5\u00e2r\2\u053b"+
		"\u053c\7\n\2\2\u053c\u053d\5\u00d2j\2\u053d\u053f\3\2\2\2\u053e\u0539"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u0542\5\u011c\u008f"+
		"\2\u0541\u0538\3\2\2\2\u0541\u0540\3\2\2\2\u0542\u00d3\3\2\2\2\u0543\u0549"+
		"\7*\2\2\u0544\u0545\7\36\2\2\u0545\u054a\5\u00d2j\2\u0546\u0548\5\u00d6"+
		"l\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054a\3\2\2\2\u0549"+
		"\u0544\3\2\2\2\u0549\u0547\3\2\2\2\u054a\u00d5\3\2\2\2\u054b\u0550\5\u00d8"+
		"m\2\u054c\u054d\7\63\2\2\u054d\u054f\5\u00d8m\2\u054e\u054c\3\2\2\2\u054f"+
		"\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0554\3\2"+
		"\2\2\u0552\u0550\3\2\2\2\u0553\u0555\7\63\2\2\u0554\u0553\3\2\2\2\u0554"+
		"\u0555\3\2\2\2\u0555\u00d7\3\2\2\2\u0556\u0557\7\67\2\2\u0557\u055a\5"+
		"\u0100\u0081\2\u0558\u055a\5\u00d2j\2\u0559\u0556\3\2\2\2\u0559\u0558"+
		"\3\2\2\2\u055a\u00d9\3\2\2\2\u055b\u0560\5\u00dco\2\u055c\u055d\7\63\2"+
		"\2\u055d\u055f\5\u00dco\2\u055e\u055c\3\2\2\2\u055f\u0562\3\2\2\2\u0560"+
		"\u055e\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2"+
		"\2\2\u0563\u0565\7\63\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565"+
		"\u00db\3\2\2\2\u0566\u0567\7\67\2\2\u0567\u056a\5\u0100\u0081\2\u0568"+
		"\u056a\5\u00e0q\2\u0569\u0566\3\2\2\2\u0569\u0568\3\2\2\2\u056a\u00dd"+
		"\3\2\2\2\u056b\u056c\7[\2\2\u056c\u056d\7Y\2\2\u056d\u056e\5\u00d2j\2"+
		"\u056e\u00df\3\2\2\2\u056f\u0572\5\u00dep\2\u0570\u0572\5\u00d2j\2\u0571"+
		"\u056f\3\2\2\2\u0571\u0570\3\2\2\2\u0572\u00e1\3\2\2\2\u0573\u0578\5\u00e4"+
		"s\2\u0574\u0575\7)\2\2\u0575\u0577\5\u00e4s\2\u0576\u0574\3\2\2\2\u0577"+
		"\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u00e3\3\2"+
		"\2\2\u057a\u0578\3\2\2\2\u057b\u0580\5\u00e6t\2\u057c\u057d\7\27\2\2\u057d"+
		"\u057f\5\u00e6t\2\u057e\u057c\3\2\2\2\u057f\u0582\3\2\2\2\u0580\u057e"+
		"\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u00e5\3\2\2\2\u0582\u0580\3\2\2\2\u0583"+
		"\u0584\7$\2\2\u0584\u0587\5\u00e6t\2\u0585\u0587\5\u00e8u\2\u0586\u0583"+
		"\3\2\2\2\u0586\u0585\3\2\2\2\u0587\u00e7\3\2\2\2\u0588\u058c\5\u0100\u0081"+
		"\2\u0589\u058b\5\u00eav\2\u058a\u0589\3\2\2\2\u058b\u058e\3\2\2\2\u058c"+
		"\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u00e9\3\2\2\2\u058e\u058c\3\2"+
		"\2\2\u058f\u059a\5\u00ecw\2\u0590\u059a\5\u00eex\2\u0591\u059a\5\u00f0"+
		"y\2\u0592\u059a\5\u00f2z\2\u0593\u059a\5\u00f4{\2\u0594\u059a\5\u00f6"+
		"|\2\u0595\u059a\5\u00f8}\2\u0596\u059a\5\u00fa~\2\u0597\u059a\5\u00fc"+
		"\177\2\u0598\u059a\5\u00fe\u0080\2\u0599\u058f\3\2\2\2\u0599\u0590\3\2"+
		"\2\2\u0599\u0591\3\2\2\2\u0599\u0592\3\2\2\2\u0599\u0593\3\2\2\2\u0599"+
		"\u0594\3\2\2\2\u0599\u0595\3\2\2\2\u0599\u0596\3\2\2\2\u0599\u0597\3\2"+
		"\2\2\u0599\u0598\3\2\2\2\u059a\u00eb\3\2\2\2\u059b\u059c\7?\2\2\u059c"+
		"\u059d\5\u0100\u0081\2\u059d\u00ed\3\2\2\2\u059e\u059f\7@\2\2\u059f\u05a0"+
		"\5\u0100\u0081\2\u05a0\u00ef\3\2\2\2\u05a1\u05a2\7A\2\2\u05a2\u05a3\5"+
		"\u0100\u0081\2\u05a3\u00f1\3\2\2\2\u05a4\u05a5\7;\2\2\u05a5\u05a6\5\u0100"+
		"\u0081\2\u05a6\u00f3\3\2\2\2\u05a7\u05a8\7B\2\2\u05a8\u05a9\5\u0100\u0081"+
		"\2\u05a9\u00f5\3\2\2\2\u05aa\u05ab\7<\2\2\u05ab\u05ac\5\u0100\u0081\2"+
		"\u05ac\u00f7\3\2\2\2\u05ad\u05ae\7$\2\2\u05ae\u05af\7\20\2\2\u05af\u05b0"+
		"\5\u0100\u0081\2\u05b0\u00f9\3\2\2\2\u05b1\u05b2\7\20\2\2\u05b2\u05b3"+
		"\5\u0100\u0081\2\u05b3\u00fb\3\2\2\2\u05b4\u05b5\7\25\2\2\u05b5\u05b6"+
		"\7$\2\2\u05b6\u05b7\5\u0100\u0081\2\u05b7\u00fd\3\2\2\2\u05b8\u05b9\7"+
		"\25\2\2\u05b9\u05ba\5\u0100\u0081\2\u05ba\u00ff\3\2\2\2\u05bb\u05bc\b"+
		"\u0081\1\2\u05bc\u05bd\5\u0102\u0082\2\u05bd\u05c3\3\2\2\2\u05be\u05bf"+
		"\f\4\2\2\u05bf\u05c0\79\2\2\u05c0\u05c2\5\u0102\u0082\2\u05c1\u05be\3"+
		"\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u0101\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6\u05c7\b\u0082\1\2\u05c7\u05c8"+
		"\5\u0104\u0083\2\u05c8\u05ce\3\2\2\2\u05c9\u05ca\f\4\2\2\u05ca\u05cb\7"+
		"D\2\2\u05cb\u05cd\5\u0104\u0083\2\u05cc\u05c9\3\2\2\2\u05cd\u05d0\3\2"+
		"\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u0103\3\2\2\2\u05d0"+
		"\u05ce\3\2\2\2\u05d1\u05d2\b\u0083\1\2\u05d2\u05d3\5\u0106\u0084\2\u05d3"+
		"\u05d9\3\2\2\2\u05d4\u05d5\f\4\2\2\u05d5\u05d6\7:\2\2\u05d6\u05d8\5\u0106"+
		"\u0084\2\u05d7\u05d4\3\2\2\2\u05d8\u05db\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9"+
		"\u05da\3\2\2\2\u05da\u0105\3\2\2\2\u05db\u05d9\3\2\2\2\u05dc\u05dd\b\u0084"+
		"\1\2\u05dd\u05de\5\u0108\u0085\2\u05de\u05e4\3\2\2\2\u05df\u05e0\f\4\2"+
		"\2\u05e0\u05e1\t\5\2\2\u05e1\u05e3\5\u0108\u0085\2\u05e2\u05df\3\2\2\2"+
		"\u05e3\u05e6\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u0107"+
		"\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e7\u05e8\b\u0085\1\2\u05e8\u05e9\5\u010a"+
		"\u0086\2\u05e9\u05ef\3\2\2\2\u05ea\u05eb\f\4\2\2\u05eb\u05ec\t\4\2\2\u05ec"+
		"\u05ee\5\u010a\u0086\2\u05ed\u05ea\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05ed"+
		"\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u0109\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f2"+
		"\u05f3\b\u0086\1\2\u05f3\u05f4\5\u010c\u0087\2\u05f4\u05fa\3\2\2\2\u05f5"+
		"\u05f6\f\4\2\2\u05f6\u05f7\t\6\2\2\u05f7\u05f9\5\u010c\u0087\2\u05f8\u05f5"+
		"\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u010b\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u05fe\7\65\2\2\u05fe\u0605\5"+
		"\u010c\u0087\2\u05ff\u0600\7\66\2\2\u0600\u0605\5\u010c\u0087\2\u0601"+
		"\u0602\7C\2\2\u0602\u0605\5\u010c\u0087\2\u0603\u0605\5\u010e\u0088\2"+
		"\u0604\u05fd\3\2\2\2\u0604\u05ff\3\2\2\2\u0604\u0601\3\2\2\2\u0604\u0603"+
		"\3\2\2\2\u0605\u010d\3\2\2\2\u0606\u0609\5\u0110\u0089\2\u0607\u0608\7"+
		"G\2\2\u0608\u060a\5\u010c\u0087\2\u0609\u0607\3\2\2\2\u0609\u060a\3\2"+
		"\2\2\u060a\u010f\3\2\2\2\u060b\u060c\7\t\2\2\u060c\u060f\5\u0112\u008a"+
		"\2\u060d\u060f\5\u0112\u008a\2\u060e\u060b\3\2\2\2\u060e\u060d\3\2\2\2"+
		"\u060f\u0111\3\2\2\2\u0610\u0611\b\u008a\1\2\u0611\u0612\5\u0118\u008d"+
		"\2\u0612\u0624\3\2\2\2\u0613\u0620\f\4\2\2\u0614\u0615\7\61\2\2\u0615"+
		"\u0621\7[\2\2\u0616\u0621\5\u0158\u00ad\2\u0617\u0619\7+\2\2\u0618\u061a"+
		"\5\u015c\u00af\2\u0619\u0618\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\3"+
		"\2\2\2\u061b\u0621\7.\2\2\u061c\u061d\7,\2\2\u061d\u061e\5\u0114\u008b"+
		"\2\u061e\u061f\7/\2\2\u061f\u0621\3\2\2\2\u0620\u0614\3\2\2\2\u0620\u0616"+
		"\3\2\2\2\u0620\u0617\3\2\2\2\u0620\u061c\3\2\2\2\u0621\u0623\3\2\2\2\u0622"+
		"\u0613\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0622\3\2\2\2\u0624\u0625\3\2"+
		"\2\2\u0625\u0113\3\2\2\2\u0626\u0624\3\2\2\2\u0627\u063a\5\u0116\u008c"+
		"\2\u0628\u062b\5\u0116\u008c\2\u0629\u062b\5\u0162\u00b2\2\u062a\u0628"+
		"\3\2\2\2\u062a\u0629\3\2\2\2\u062b\u0633\3\2\2\2\u062c\u062f\7\63\2\2"+
		"\u062d\u0630\5\u0116\u008c\2\u062e\u0630\5\u0162\u00b2\2\u062f\u062d\3"+
		"\2\2\2\u062f\u062e\3\2\2\2\u0630\u0632\3\2\2\2\u0631\u062c\3\2\2\2\u0632"+
		"\u0635\3\2\2\2\u0633\u0631\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0637\3\2"+
		"\2\2\u0635\u0633\3\2\2\2\u0636\u0638\7\63\2\2\u0637\u0636\3\2\2\2\u0637"+
		"\u0638\3\2\2\2\u0638\u063a\3\2\2\2\u0639\u0627\3\2\2\2\u0639\u062a\3\2"+
		"\2\2\u063a\u0115\3\2\2\2\u063b\u063d\5\u00d2j\2\u063c\u063b\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0640\7\62\2\2\u063f\u0641\5"+
		"\u00d2j\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0646\3\2\2\2"+
		"\u0642\u0644\7\62\2\2\u0643\u0645\5\u00d2j\2\u0644\u0643\3\2\2\2\u0644"+
		"\u0645\3\2\2\2\u0645\u0647\3\2\2\2\u0646\u0642\3\2\2\2\u0646\u0647\3\2"+
		"\2\2\u0647\u064a\3\2\2\2\u0648\u064a\5\u00e0q\2\u0649\u063c\3\2\2\2\u0649"+
		"\u0648\3\2\2\2\u064a\u0117\3\2\2\2\u064b\u0662\7[\2\2\u064c\u0662\7\22"+
		"\2\2\u064d\u0662\7\b\2\2\u064e\u0662\7\r\2\2\u064f\u0662\5\u0140\u00a1"+
		"\2\u0650\u0662\7\\\2\2\u0651\u0655\5\u0144\u00a3\2\u0652\u0655\5\u011a"+
		"\u008e\2\u0653\u0655\5\u0158\u00ad\2\u0654\u0651\3\2\2\2\u0654\u0652\3"+
		"\2\2\2\u0654\u0653\3\2\2\2\u0655\u0662\3\2\2\2\u0656\u0659\5\u0142\u00a2"+
		"\2\u0657\u0659\5\u0154\u00ab\2\u0658\u0656\3\2\2\2\u0658\u0657\3\2\2\2"+
		"\u0659\u0662\3\2\2\2\u065a\u065f\5\u0148\u00a5\2\u065b\u065f\5\u0146\u00a4"+
		"\2\u065c\u065f\5\u015a\u00ae\2\u065d\u065f\5\u0156\u00ac\2\u065e\u065a"+
		"\3\2\2\2\u065e\u065b\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065d\3\2\2\2\u065f"+
		"\u0662\3\2\2\2\u0660\u0662\7X\2\2\u0661\u064b\3\2\2\2\u0661\u064c\3\2"+
		"\2\2\u0661\u064d\3\2\2\2\u0661\u064e\3\2\2\2\u0661\u064f\3\2\2\2\u0661"+
		"\u0650\3\2\2\2\u0661\u0654\3\2\2\2\u0661\u0658\3\2\2\2\u0661\u065e\3\2"+
		"\2\2\u0661\u0660\3\2\2\2\u0662\u0119\3\2\2\2\u0663\u0666\7+\2\2\u0664"+
		"\u0667\5\u00d4k\2\u0665\u0667\5\u00e0q\2\u0666\u0664\3\2\2\2\u0666\u0665"+
		"\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\7.\2\2\u0669\u011b\3\2\2\2\u066a"+
		"\u066c\7\32\2\2\u066b\u066d\5\u011e\u0090\2\u066c\u066b\3\2\2\2\u066c"+
		"\u066d\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f\7\62\2\2\u066f\u0670\5"+
		"\u00d2j\2\u0670\u011d\3\2\2\2\u0671\u0672\5\u0120\u0091\2\u0672\u011f"+
		"\3\2\2\2\u0673\u0677\5\u0122\u0092\2\u0674\u0676\5\u012a\u0096\2\u0675"+
		"\u0674\3\2\2\2\u0676\u0679\3\2\2\2\u0677\u0675\3\2\2\2\u0677\u0678\3\2"+
		"\2\2\u0678\u067d\3\2\2\2\u0679\u0677\3\2\2\2\u067a\u067c\5\u012c\u0097"+
		"\2\u067b\u067a\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e"+
		"\3\2\2\2\u067e\u0681\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0682\5\u0126\u0094"+
		"\2\u0681\u0680\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u06a5\3\2\2\2\u0683\u0687"+
		"\5\u0124\u0093\2\u0684\u0686\5\u012c\u0097\2\u0685\u0684\3\2\2\2\u0686"+
		"\u0689\3\2\2\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068b\3\2"+
		"\2\2\u0689\u0687\3\2\2\2\u068a\u068c\5\u0126\u0094\2\u068b\u068a\3\2\2"+
		"\2\u068b\u068c\3\2\2\2\u068c\u06a5\3\2\2\2\u068d\u068f\5\u012a\u0096\2"+
		"\u068e\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u068e\3\2\2\2\u0690\u0691"+
		"\3\2\2\2\u0691\u0695\3\2\2\2\u0692\u0694\5\u012c\u0097\2\u0693\u0692\3"+
		"\2\2\2\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696"+
		"\u0699\3\2\2\2\u0697\u0695\3\2\2\2\u0698\u069a\5\u0126\u0094\2\u0699\u0698"+
		"\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u06a5\3\2\2\2\u069b\u069d\5\u012c\u0097"+
		"\2\u069c\u069b\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u069c\3\2\2\2\u069e\u069f"+
		"\3\2\2\2\u069f\u06a1\3\2\2\2\u06a0\u06a2\5\u0126\u0094\2\u06a1\u06a0\3"+
		"\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a5\5\u0126\u0094"+
		"\2\u06a4\u0673\3\2\2\2\u06a4\u0683\3\2\2\2\u06a4\u068e\3\2\2\2\u06a4\u069c"+
		"\3\2\2\2\u06a4\u06a3\3\2\2\2\u06a5\u0121\3\2\2\2\u06a6\u06a8\5\u012a\u0096"+
		"\2\u06a7\u06a6\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06a7\3\2\2\2\u06a9\u06aa"+
		"\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ad\78\2\2\u06ac\u06ae\7\63\2\2\u06ad"+
		"\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u0123\3\2\2\2\u06af\u06b1\5\u012a"+
		"\u0096\2\u06b0\u06af\3\2\2\2\u06b1\u06b4\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b2"+
		"\u06b3\3\2\2\2\u06b3\u06b6\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b5\u06b7\5\u012c"+
		"\u0097\2\u06b6\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8"+
		"\u06b9\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bc\78\2\2\u06bb\u06bd\7\63"+
		"\2\2\u06bc\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u0125\3\2\2\2\u06be"+
		"\u06bf\7\67\2\2\u06bf\u06c3\5\u012a\u0096\2\u06c0\u06c2\5\u012e\u0098"+
		"\2\u06c1\u06c0\3\2\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4"+
		"\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c6\u06c8\5\u0128\u0095"+
		"\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06d5\3\2\2\2\u06c9\u06ca"+
		"\7\67\2\2\u06ca\u06cc\7\63\2\2\u06cb\u06cd\5\u012e\u0098\2\u06cc\u06cb"+
		"\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cc\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf"+
		"\u06d1\3\2\2\2\u06d0\u06d2\5\u0128\u0095\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2"+
		"\3\2\2\2\u06d2\u06d5\3\2\2\2\u06d3\u06d5\5\u0128\u0095\2\u06d4\u06be\3"+
		"\2\2\2\u06d4\u06c9\3\2\2\2\u06d4\u06d3\3\2\2\2\u06d5\u0127\3\2\2\2\u06d6"+
		"\u06d7\7G\2\2\u06d7\u06d8\5\u012a\u0096\2\u06d8\u0129\3\2\2\2\u06d9\u06db"+
		"\5\u0130\u0099\2\u06da\u06dc\7\63\2\2\u06db\u06da\3\2\2\2\u06db\u06dc"+
		"\3\2\2\2\u06dc\u012b\3\2\2\2\u06dd\u06de\5\u0130\u0099\2\u06de\u06e0\5"+
		"f\64\2\u06df\u06e1\7\63\2\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1"+
		"\u012d\3\2\2\2\u06e2\u06e4\5\u0130\u0099\2\u06e3\u06e5\5f\64\2\u06e4\u06e3"+
		"\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e7\3\2\2\2\u06e6\u06e8\7\63\2\2"+
		"\u06e7\u06e6\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u012f\3\2\2\2\u06e9\u06ea"+
		"\7[\2\2\u06ea\u0131\3\2\2\2\u06eb\u06ee\5\u0134\u009b\2\u06ec\u06ee\7"+
		"\6\2\2\u06ed\u06eb\3\2\2\2\u06ed\u06ec\3\2\2\2\u06ee\u0133\3\2\2\2\u06ef"+
		"\u06f2\7-\2\2\u06f0\u06f3\5\u00d4k\2\u06f1\u06f3\5\u00d6l\2\u06f2\u06f0"+
		"\3\2\2\2\u06f2\u06f1\3\2\2\2\u06f3\u06f5\3\2\2\2\u06f4\u06f6\7=\2\2\u06f5"+
		"\u06f4\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f8\3\2\2\2\u06f7\u06f9\5\u0136"+
		"\u009c\2\u06f8\u06f7\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\3\2\2\2\u06fa"+
		"\u06fc\5\u0138\u009d\2\u06fb\u06fa\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fd"+
		"\3\2\2\2\u06fd\u06fe\7\60\2\2\u06fe\u0135\3\2\2\2\u06ff\u0700\7Z\2\2\u0700"+
		"\u0701\7[\2\2\u0701\u0137\3\2\2\2\u0702\u0706\7\62\2\2\u0703\u0705\5\u013a"+
		"\u009e\2\u0704\u0703\3\2\2\2\u0705\u0708\3\2\2\2\u0706\u0704\3\2\2\2\u0706"+
		"\u0707\3\2\2\2\u0707\u0139\3\2\2\2\u0708\u0706\3\2\2\2\u0709\u070c\7\6"+
		"\2\2\u070a\u070c\5\u0134\u009b\2\u070b\u0709\3\2\2\2\u070b\u070a\3\2\2"+
		"\2\u070c\u013b\3\2\2\2\u070d\u0711\7\5\2\2\u070e\u0710\5\u0132\u009a\2"+
		"\u070f\u070e\3\2\2\2\u0710\u0713\3\2\2\2\u0711\u070f\3\2\2\2\u0711\u0712"+
		"\3\2\2\2\u0712\u0714\3\2\2\2\u0713\u0711\3\2\2\2\u0714\u0715\7\7\2\2\u0715"+
		"\u013d\3\2\2\2\u0716\u0717\7]\2\2\u0717\u013f\3\2\2\2\u0718\u071b\5\u013c"+
		"\u009f\2\u0719\u071b\5\u013e\u00a0\2\u071a\u0718\3\2\2\2\u071a\u0719\3"+
		"\2\2\2\u071b\u071c\3\2\2\2\u071c\u071a\3\2\2\2\u071c\u071d\3\2\2\2\u071d"+
		"\u0141\3\2\2\2\u071e\u0720\7,\2\2\u071f\u0721\5\u00dan\2\u0720\u071f\3"+
		"\2\2\2\u0720\u0721\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723\7/\2\2\u0723"+
		"\u0143\3\2\2\2\u0724\u072a\7+\2\2\u0725\u0726\5\u00dco\2\u0726\u0728\7"+
		"\63\2\2\u0727\u0729\5\u00dan\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2"+
		"\u0729\u072b\3\2\2\2\u072a\u0725\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072c"+
		"\3\2\2\2\u072c\u072d\7.\2\2\u072d\u0145\3\2\2\2\u072e\u072f\7-\2\2\u072f"+
		"\u0730\5\u00dan\2\u0730\u0731\7\60\2\2\u0731\u0147\3\2\2\2\u0732\u0734"+
		"\7-\2\2\u0733\u0735\5\u014a\u00a6\2\u0734\u0733\3\2\2\2\u0734\u0735\3"+
		"\2\2\2\u0735\u0736\3\2\2\2\u0736\u0737\7\60\2\2\u0737\u0149\3\2\2\2\u0738"+
		"\u073d\5\u014c\u00a7\2\u0739\u073a\7\63\2\2\u073a\u073c\5\u014c\u00a7"+
		"\2\u073b\u0739\3\2\2\2\u073c\u073f\3\2\2\2\u073d\u073b\3\2\2\2\u073d\u073e"+
		"\3\2\2\2\u073e\u0741\3\2\2\2\u073f\u073d\3\2\2\2\u0740\u0742\7\63\2\2"+
		"\u0741\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u014b\3\2\2\2\u0743\u0744"+
		"\7G\2\2\u0744\u0747\5\u0100\u0081\2\u0745\u0747\5\u014e\u00a8\2\u0746"+
		"\u0743\3\2\2\2\u0746\u0745\3\2\2\2\u0747\u014d\3\2\2\2\u0748\u0749\5\u00d2"+
		"j\2\u0749\u074a\7\62\2\2\u074a\u074b\5\u00d2j\2\u074b\u014f\3\2\2\2\u074c"+
		"\u074e\5\u0152\u00aa\2\u074d\u074c\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u074d"+
		"\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0151\3\2\2\2\u0751\u0753\7&\2\2\u0752"+
		"\u0751\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\7\31"+
		"\2\2\u0755\u0756\5\u0168\u00b5\2\u0756\u0757\7\20\2\2\u0757\u075c\5\u00e2"+
		"r\2\u0758\u0759\7(\2\2\u0759\u075b\5\u00e2r\2\u075a\u0758\3\2\2\2\u075b"+
		"\u075e\3\2\2\2\u075c\u075a\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0153\3\2"+
		"\2\2\u075e\u075c\3\2\2\2\u075f\u0760\7,\2\2\u0760\u0761\5\u00e0q\2\u0761"+
		"\u0762\5\u0150\u00a9\2\u0762\u0763\7/\2\2\u0763\u0155\3\2\2\2\u0764\u0765"+
		"\7-\2\2\u0765\u0766\5\u00e0q\2\u0766\u0767\5\u0150\u00a9\2\u0767\u0768"+
		"\7\60\2\2\u0768\u0157\3\2\2\2\u0769\u076c\7+\2\2\u076a\u076d\5\u00dep"+
		"\2\u076b\u076d\5\u00d2j\2\u076c\u076a\3\2\2\2\u076c\u076b\3\2\2\2\u076d"+
		"\u076e\3\2\2\2\u076e\u076f\5\u0150\u00a9\2\u076f\u0770\7.\2\2\u0770\u0159"+
		"\3\2\2\2\u0771\u0772\7-\2\2\u0772\u0773\5\u014e\u00a8\2\u0773\u0774\5"+
		"\u0150\u00a9\2\u0774\u0775\7\60\2\2\u0775\u015b\3\2\2\2\u0776\u0778\5"+
		"\u015e\u00b0\2\u0777\u0779\7\63\2\2\u0778\u0777\3\2\2\2\u0778\u0779\3"+
		"\2\2\2\u0779\u015d\3\2\2\2\u077a\u0780\5\u0162\u00b2\2\u077b\u077e\5\u00de"+
		"p\2\u077c\u077e\5\u00d2j\2\u077d\u077b\3\2\2\2\u077d\u077c\3\2\2\2\u077e"+
		"\u0780\3\2\2\2\u077f\u077a\3\2\2\2\u077f\u077d\3\2\2\2\u0780\u078b\3\2"+
		"\2\2\u0781\u0787\7\63\2\2\u0782\u0788\5\u0162\u00b2\2\u0783\u0786\5\u00de"+
		"p\2\u0784\u0786\5\u00d2j\2\u0785\u0783\3\2\2\2\u0785\u0784\3\2\2\2\u0786"+
		"\u0788\3\2\2\2\u0787\u0782\3\2\2\2\u0787\u0785\3\2\2\2\u0788\u078a\3\2"+
		"\2\2\u0789\u0781\3\2\2\2\u078a\u078d\3\2\2\2\u078b\u0789\3\2\2\2\u078b"+
		"\u078c\3\2\2\2\u078c\u0790\3\2\2\2\u078d\u078b\3\2\2\2\u078e\u078f\7\63"+
		"\2\2\u078f\u0791\5\u0160\u00b1\2\u0790\u078e\3\2\2\2\u0790\u0791\3\2\2"+
		"\2\u0791\u0794\3\2\2\2\u0792\u0794\5\u0160\u00b1\2\u0793\u077f\3\2\2\2"+
		"\u0793\u0792\3\2\2\2\u0794\u015f\3\2\2\2\u0795\u079a\5\u0164\u00b3\2\u0796"+
		"\u0797\7\63\2\2\u0797\u0799\5\u0164\u00b3\2\u0798\u0796\3\2\2\2\u0799"+
		"\u079c\3\2\2\2\u079a\u0798\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u07a6\3\2"+
		"\2\2\u079c\u079a\3\2\2\2\u079d\u079e\7\63\2\2\u079e\u07a3\5\u0166\u00b4"+
		"\2\u079f\u07a0\7\63\2\2\u07a0\u07a2\5\u0166\u00b4\2\u07a1\u079f\3\2\2"+
		"\2\u07a2\u07a5\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a7"+
		"\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a6\u079d\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7"+
		"\u07b1\3\2\2\2\u07a8\u07ad\5\u0166\u00b4\2\u07a9\u07aa\7\63\2\2\u07aa"+
		"\u07ac\5\u0166\u00b4\2\u07ab\u07a9\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad\u07ab"+
		"\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b1\3\2\2\2\u07af\u07ad\3\2\2\2\u07b0"+
		"\u0795\3\2\2\2\u07b0\u07a8\3\2\2\2\u07b1\u0161\3\2\2\2\u07b2\u07b3\7\67"+
		"\2\2\u07b3\u07b4\5\u00d2j\2\u07b4\u0163\3\2\2\2\u07b5\u07b6\7[\2\2\u07b6"+
		"\u07b7\7=\2\2\u07b7\u07ba\5\u00d2j\2\u07b8\u07ba\5\u0162\u00b2\2\u07b9"+
		"\u07b5\3\2\2\2\u07b9\u07b8\3\2\2\2\u07ba\u0165\3\2\2\2\u07bb\u07bc\7["+
		"\2\2\u07bc\u07bd\7=\2\2\u07bd\u07c1\5\u00d2j\2\u07be\u07bf\7G\2\2\u07bf"+
		"\u07c1\5\u00d2j\2\u07c0\u07bb\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1\u0167"+
		"\3\2\2\2\u07c2\u07c7\5\u016e\u00b8\2\u07c3\u07c4\7\63\2\2\u07c4\u07c6"+
		"\5\u016e\u00b8\2\u07c5\u07c3\3\2\2\2\u07c6\u07c9\3\2\2\2\u07c7\u07c5\3"+
		"\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07cb\3\2\2\2\u07c9\u07c7\3\2\2\2\u07ca"+
		"\u07cc\7\63\2\2\u07cb\u07ca\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u0169\3"+
		"\2\2\2\u07cd\u07d0\5\u016e\u00b8\2\u07ce\u07cf\7\63\2\2\u07cf\u07d1\5"+
		"\u016e\u00b8\2\u07d0\u07ce\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d0\3\2"+
		"\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d5\3\2\2\2\u07d4\u07d6\7\63\2\2\u07d5"+
		"\u07d4\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u016b\3\2\2\2\u07d7\u07e2\5\u016e"+
		"\u00b8\2\u07d8\u07e3\7\63\2\2\u07d9\u07da\7\63\2\2\u07da\u07dc\5\u016e"+
		"\u00b8\2\u07db\u07d9\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07db\3\2\2\2\u07dd"+
		"\u07de\3\2\2\2\u07de\u07e0\3\2\2\2\u07df\u07e1\7\63\2\2\u07e0\u07df\3"+
		"\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e3\3\2\2\2\u07e2\u07d8\3\2\2\2\u07e2"+
		"\u07db\3\2\2\2\u07e3\u016d\3\2\2\2\u07e4\u07e5\7\67\2\2\u07e5\u07e8\5"+
		"\u016e\u00b8\2\u07e6\u07e8\5\u0170\u00b9\2\u07e7\u07e4\3\2\2\2\u07e7\u07e6"+
		"\3\2\2\2\u07e8\u016f\3\2\2\2\u07e9\u07f0\5\u0178\u00bd\2\u07ea\u07eb\7"+
		"\61\2\2\u07eb\u07f1\7[\2\2\u07ec\u07ed\7,\2\2\u07ed\u07ee\5\u0114\u008b"+
		"\2\u07ee\u07ef\7/\2\2\u07ef\u07f1\3\2\2\2\u07f0\u07ea\3\2\2\2\u07f0\u07ec"+
		"\3\2\2\2\u07f1\u07f4\3\2\2\2\u07f2\u07f4\5\u0172\u00ba\2\u07f3\u07e9\3"+
		"\2\2\2\u07f3\u07f2\3\2\2\2\u07f4\u0171\3\2\2\2\u07f5\u0805\7[\2\2\u07f6"+
		"\u07f7\7+\2\2\u07f7\u07f8\5\u0170\u00b9\2\u07f8\u07f9\7.\2\2\u07f9\u0805"+
		"\3\2\2\2\u07fa\u07fc\7+\2\2\u07fb\u07fd\5\u016c\u00b7\2\u07fc\u07fb\3"+
		"\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u0805\7.\2\2\u07ff"+
		"\u0801\7,\2\2\u0800\u0802\5\u016a\u00b6\2\u0801\u0800\3\2\2\2\u0801\u0802"+
		"\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0805\7/\2\2\u0804\u07f5\3\2\2\2\u0804"+
		"\u07f6\3\2\2\2\u0804\u07fa\3\2\2\2\u0804\u07ff\3\2\2\2\u0805\u0173\3\2"+
		"\2\2\u0806\u080d\5\u0176\u00bc\2\u0807\u080d\7[\2\2\u0808\u0809\7+\2\2"+
		"\u0809\u080a\5\u0174\u00bb\2\u080a\u080b\7.\2\2\u080b\u080d\3\2\2\2\u080c"+
		"\u0806\3\2\2\2\u080c\u0807\3\2\2\2\u080c\u0808\3\2\2\2\u080d\u0175\3\2"+
		"\2\2\u080e\u0815\5\u0178\u00bd\2\u080f\u0810\7\61\2\2\u0810\u0816\7[\2"+
		"\2\u0811\u0812\7,\2\2\u0812\u0813\5\u0114\u008b\2\u0813\u0814\7/\2\2\u0814"+
		"\u0816\3\2\2\2\u0815\u080f\3\2\2\2\u0815\u0811\3\2\2\2\u0816\u0177\3\2"+
		"\2\2\u0817\u0818\b\u00bd\1\2\u0818\u0819\5\u0118\u008d\2\u0819\u082b\3"+
		"\2\2\2\u081a\u0827\f\4\2\2\u081b\u081c\7\61\2\2\u081c\u0828\7[\2\2\u081d"+
		"\u081e\7,\2\2\u081e\u081f\5\u0114\u008b\2\u081f\u0820\7/\2\2\u0820\u0828"+
		"\3\2\2\2\u0821\u0828\5\u0158\u00ad\2\u0822\u0824\7+\2\2\u0823\u0825\5"+
		"\u015c\u00af\2\u0824\u0823\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0826\3\2"+
		"\2\2\u0826\u0828\7.\2\2\u0827\u081b\3\2\2\2\u0827\u081d\3\2\2\2\u0827"+
		"\u0821\3\2\2\2\u0827\u0822\3\2\2\2\u0828\u082a\3\2\2\2\u0829\u081a\3\2"+
		"\2\2\u082a\u082d\3\2\2\2\u082b\u0829\3\2\2\2\u082b\u082c\3\2\2\2\u082c"+
		"\u0179\3\2\2\2\u082d\u082b\3\2\2\2\u082e\u0833\5\u017c\u00bf\2\u082f\u0830"+
		"\7\63\2\2\u0830\u0832\5\u017c\u00bf\2\u0831\u082f\3\2\2\2\u0832\u0835"+
		"\3\2\2\2\u0833\u0831\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0837\3\2\2\2\u0835"+
		"\u0833\3\2\2\2\u0836\u0838\7\63\2\2\u0837\u0836\3\2\2\2\u0837\u0838\3"+
		"\2\2\2\u0838\u017b\3\2\2\2\u0839\u0840\5\u0178\u00bd\2\u083a\u083b\7\61"+
		"\2\2\u083b\u0841\7[\2\2\u083c\u083d\7,\2\2\u083d\u083e\5\u0114\u008b\2"+
		"\u083e\u083f\7/\2\2\u083f\u0841\3\2\2\2\u0840\u083a\3\2\2\2\u0840\u083c"+
		"\3\2\2\2\u0841\u0844\3\2\2\2\u0842\u0844\5\u017e\u00c0\2\u0843\u0839\3"+
		"\2\2\2\u0843\u0842\3\2\2\2\u0844\u017d\3\2\2\2\u0845\u0855\7[\2\2\u0846"+
		"\u0847\7+\2\2\u0847\u0848\5\u017c\u00bf\2\u0848\u0849\7.\2\2\u0849\u0855"+
		"\3\2\2\2\u084a\u084c\7+\2\2\u084b\u084d\5\u017a\u00be\2\u084c\u084b\3"+
		"\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u0855\7.\2\2\u084f"+
		"\u0851\7,\2\2\u0850\u0852\5\u017a\u00be\2\u0851\u0850\3\2\2\2\u0851\u0852"+
		"\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0855\7/\2\2\u0854\u0845\3\2\2\2\u0854"+
		"\u0846\3\2\2\2\u0854\u084a\3\2\2\2\u0854\u084f\3\2\2\2\u0855\u017f\3\2"+
		"\2\2\u0856\u085b\5\u00d2j\2\u0857\u0858\7\63\2\2\u0858\u085a\5\u00d2j"+
		"\2\u0859\u0857\3\2\2\2\u085a\u085d\3\2\2\2\u085b\u0859\3\2\2\2\u085b\u085c"+
		"\3\2\2\2\u085c\u086a\3\2\2\2\u085d\u085b\3\2\2\2\u085e\u0868\7\63\2\2"+
		"\u085f\u0860\7\67\2\2\u0860\u0864\5\u00d2j\2\u0861\u0862\7\63\2\2\u0862"+
		"\u0863\7G\2\2\u0863\u0865\5\u00d2j\2\u0864\u0861\3\2\2\2\u0864\u0865\3"+
		"\2\2\2\u0865\u0869\3\2\2\2\u0866\u0867\7G\2\2\u0867\u0869\5\u00d2j\2\u0868"+
		"\u085f\3\2\2\2\u0868\u0866\3\2\2\2\u0869\u086b\3\2\2\2\u086a\u085e\3\2"+
		"\2\2\u086a\u086b\3\2\2\2\u086b\u0876\3\2\2\2\u086c\u086d\7\67\2\2\u086d"+
		"\u0871\5\u00d2j\2\u086e\u086f\7\63\2\2\u086f\u0870\7G\2\2\u0870\u0872"+
		"\5\u00d2j\2\u0871\u086e\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0876\3\2\2"+
		"\2\u0873\u0874\7G\2\2\u0874\u0876\5\u00d2j\2\u0875\u0856\3\2\2\2\u0875"+
		"\u086c\3\2\2\2\u0875\u0873\3\2\2\2\u0876\u0181\3\2\2\2\u0877\u0878\7_"+
		"\2\2\u0878\u087b\7^\2\2\u0879\u087b\7^\2\2\u087a\u0877\3\2\2\2\u087a\u0879"+
		"\3\2\2\2\u087b\u0183\3\2\2\2\u087c\u087d\6\u00c3\f\2\u087d\u087e\7[\2"+
		"\2\u087e\u0185\3\2\2\2\u087f\u0880\6\u00c4\r\2\u0880\u0881\7[\2\2\u0881"+
		"\u0187\3\2\2\2\u0882\u0883\6\u00c5\16\2\u0883\u0884\7[\2\2\u0884\u0189"+
		"\3\2\2\2\u0885\u0886\6\u00c6\17\2\u0886\u0887\7[\2\2\u0887\u018b\3\2\2"+
		"\2\u0125\u018d\u0197\u019e\u01a6\u01b0\u01b4\u01bc\u01c3\u01c7\u01d9\u01e3"+
		"\u01ea\u01f1\u01f7\u01fe\u0202\u0205\u020b\u020d\u0211\u0217\u021d\u021f"+
		"\u0227\u0230\u023c\u0240\u0249\u0254\u0258\u025d\u0263\u026a\u0270\u0277"+
		"\u027d\u0287\u0290\u0298\u029e\u02a3\u02a7\u02aa\u02b3\u02b8\u02bc\u02c1"+
		"\u02c5\u02cc\u02d0\u02d5\u02d9\u02dc\u02e4\u02ea\u02ee\u02f4\u02f8\u02fd"+
		"\u0302\u0306\u030b\u030e\u0311\u0316\u031a\u031f\u0325\u0329\u0330\u0334"+
		"\u033b\u033f\u0346\u0349\u034c\u0353\u0356\u035a\u035d\u0362\u0365\u0369"+
		"\u036c\u036f\u0373\u0387\u0389\u0391\u0393\u039e\u03a1\u03a9\u03ad\u03b0"+
		"\u03b9\u03bd\u03c7\u03cc\u03ce\u03d5\u03e2\u03e5\u03e8\u03f0\u03f3\u03f6"+
		"\u03f8\u03fe\u0400\u040a\u041b\u0422\u0425\u042a\u0434\u0438\u0443\u044e"+
		"\u0456\u045e\u0465\u046a\u0480\u0487\u0490\u0495\u0498\u049d\u04a4\u04a8"+
		"\u04ac\u04b2\u04b9\u04c1\u04c4\u04c8\u04cf\u04d4\u04e1\u04e4\u04e7\u04e9"+
		"\u04f2\u04fa\u0504\u0512\u0516\u051a\u0520\u0526\u0528\u0532\u0536\u053e"+
		"\u0541\u0547\u0549\u0550\u0554\u0559\u0560\u0564\u0569\u0571\u0578\u0580"+
		"\u0586\u058c\u0599\u05c3\u05ce\u05d9\u05e4\u05ef\u05fa\u0604\u0609\u060e"+
		"\u0619\u0620\u0624\u062a\u062f\u0633\u0637\u0639\u063c\u0640\u0644\u0646"+
		"\u0649\u0654\u0658\u065e\u0661\u0666\u066c\u0677\u067d\u0681\u0687\u068b"+
		"\u0690\u0695\u0699\u069e\u06a1\u06a4\u06a9\u06ad\u06b2\u06b8\u06bc\u06c3"+
		"\u06c7\u06ce\u06d1\u06d4\u06db\u06e0\u06e4\u06e7\u06ed\u06f2\u06f5\u06f8"+
		"\u06fb\u0706\u070b\u0711\u071a\u071c\u0720\u0728\u072a\u0734\u073d\u0741"+
		"\u0746\u074f\u0752\u075c\u076c\u0778\u077d\u077f\u0785\u0787\u078b\u0790"+
		"\u0793\u079a\u07a3\u07a6\u07ad\u07b0\u07b9\u07c0\u07c7\u07cb\u07d2\u07d5"+
		"\u07dd\u07e0\u07e2\u07e7\u07f0\u07f3\u07fc\u0801\u0804\u080c\u0815\u0824"+
		"\u0827\u082b\u0833\u0837\u0840\u0843\u084c\u0851\u0854\u085b\u0864\u0868"+
		"\u086a\u0871\u0875\u087a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}