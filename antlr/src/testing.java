import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class testing {
    public static void main(String[] args)throws Exception
    {
        String inputFile = "t.c";
        FileInputStream is = new FileInputStream(inputFile);
        ANTLRInputStream   input = new ANTLRInputStream(is);
        C_grammarLexer lexer = new C_grammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        C_grammarParser parser = new C_grammarParser(tokens);

        //ParseTree tree = parser.nestedParenthesesBlock();

        //ParseTree tree = parser.compoundStatement();
        //
        //ParseTree tree = parser.statement();
        //ParseTree tree = parser.functionDefinition();
        ParseTree tree = parser.compilationUnit();
        //System.out.println(tree.toStringTree(parser));
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();

        parseTreeWalker.walk(new analyzer(),tree);
    }
}
