import sys
from antlr4 import * #antlr4-python3-runtime==4.13.1 antlr4-tools==0.2.1
from PythonLexer import PythonLexer
from PythonParser import PythonParser
# from VisitorInterp import VisitorInterp

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = ExprLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ExprParser(stream)
    tree = parser.start_()

if __name__ == '__main__':
    main(sys.argv)