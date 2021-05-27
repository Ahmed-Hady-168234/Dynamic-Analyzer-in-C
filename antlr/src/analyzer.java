import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class analyzer extends C_grammarBaseListener{
    int numCompoundStatement = 0;

    int numFunction = 0;  /*function*/
    int numLabeled = 0;   /*cases (in switch)*/
    //int numSelection=0; /*selection (if,else,switch)*/
    int numIf = 0;        /*if, else*/
    int numSwitch = 0;    /*switch*/
    int numIteration = 0; /*loop (for,while,do while)*/
    @Override public void enterCompoundStatement(C_grammarParser.CompoundStatementContext ctx) {
        ++numCompoundStatement;
        //System.out.println("enterCompoundStatement" + ++scopesIn);
    }

    @Override public void enterStatement(C_grammarParser.StatementContext ctx) {
       // ++numStatement;
        //System.out.println("enterStatement"+ ++numStatement);
    }

    @Override public void exitCompoundStatement(C_grammarParser.CompoundStatementContext ctx) {
       // scopesOut++;
        //System.out.println("OUT"+scopesOut);

    }


    @Override public void enterLabeledStatement(C_grammarParser.LabeledStatementContext ctx) {

        numLabeled++;
        //System.out.println("case in"+ numCases);
        //numCompoundStatement++;
    }


    @Override public void exitLabeledStatement(C_grammarParser.LabeledStatementContext ctx) {
        //System.out.println("exitLabeledStatement");
    }

//    @Override public void enterSelectionStatement(C_grammarParser.SelectionStatementContext ctx) {
//        numSelection++;
//        //System.out.println("enterSelectionStatement");
//    }

    @Override public void enterIfStatement(C_grammarParser.IfStatementContext ctx) {

        System.out.println("Num of chlids"+ctx.getChildCount());
        for (int i = 0 ; i < ctx.getChildCount(); ++i){
            var chlid = ctx.getChild(i);
            System.out.println(chlid);
        }
        System.out.println("Btngan ==========> " + ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine());
//        System.out.println("Btngan symbol ==========> " + ((TerminalNodeImpl)ctx.getChild(5)).symbol.getText());
        if(ctx.getChildCount() >= 6) {
            System.out.println("There is else");
            System.out.println("Btngan ==========> " + ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine());
            numIf++;
        } else {
            System.out.println("There is no else");
            System.out.println("Btngan ==========> " + ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine());


        }

        numIf++;
    }

    @Override public void enterSwitch(C_grammarParser.SwitchContext ctx) {
        numSwitch++;
    }
   // @Override public void exitSelectionStatement(C_grammarParser.SelectionStatementContext ctx) {//System.out.println("exitSelectionStatement");  }




    @Override public void enterFunctionDefinition(C_grammarParser.FunctionDefinitionContext ctx) {
        System.out.println("Fun in");
        numFunction++;
    }

    @Override public void enterIterationStatement(C_grammarParser.IterationStatementContext ctx) {
        numIteration++;
    }


    @Override public void exitCompilationUnit(C_grammarParser.CompilationUnitContext ctx) {
        //        System.out.println("enterCompoundStatement" +(numCompoundStatement+numLabeled));
//        System.out.println("enterStatement"+ numStatement);
//        System.out.println("enterLabeledStatement"+ numLabeled);
//        System.out.println("Fun out");
        System.out.println((numFunction + numLabeled + numIf + numSwitch + numIteration));
        System.out.println("////");
        System.out.println("Num of functions     =" + numFunction);
        System.out.println("Num of cases,default =" + numLabeled);
        System.out.println("Num of if, else      =" + numIf);
        System.out.println("Num of Switch        =" + numSwitch);
        System.out.println("Num if loops         =" + numIteration);
//        int numFunction = 0;/*function*/
//        int numLabeled = 0;/*cases (in switch)*/
//        int numSelection=0; /*selection (if,else,switch)*/
//        int numIteration = 0;/*loop (for,while,do while)*/
    }
}
