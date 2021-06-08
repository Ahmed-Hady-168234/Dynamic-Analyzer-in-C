import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import javax.crypto.spec.PSource;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Locale;

public class analyzer extends C_grammarBaseListener{


    static int numOfFunctions = 0;  /*function*/
    int numLabeled = 0;   /*cases (in switch)*/
    int numOfIf = 0;        /*if, else*/
    int numSwitch = 0;    /*switch*/
    int numIteration = 0; /*loop (for,while,do while)*/


    @Override public void enterLabeledStatement(C_grammarParser.LabeledStatementContext ctx) {

        numLabeled++;
//        System.out.println("================ enterLabeledStatement =====================");
////        System.out.println(ctx.getText());
//        for (var child :
//                ctx.children) {
//            System.out.println(child.getText());
//        }
//        System.out.println("=====================================");
    }

    @Override public void enterIfStatement(C_grammarParser.IfStatementContext ctx) {
        if(ctx.getChildCount() >= 6) {

            //write in file x.txt    & t.c y.c x.txt
            var elseParseTree = ((C_grammarParser.StatementContext)ctx.getChild(6)).children.get(0);
            //if(elseParseTree.getChildCount() >= 6)
                //numIf--;
            int count = ctx.getChild(4).getChild(0).getChildCount();


/** In case if with no braces*/
            if (count !=3){
                /** save the startLine */
                testing.ifStartStop[numOfIf][0] = ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine();

                /** save the endLine */
                testing.ifStartStop[numOfIf][1] = (((C_grammarParser.StatementContext)ctx.getChild(4))).stop.getLine();

                numOfIf++;

            }else{
                /** save the startLine */
                testing.ifStartStop[numOfIf][0] = ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine();

                /** save the leftBrace line */
                testing.ifStartStop[numOfIf][1] = (((C_grammarParser.StatementContext)ctx.getChild(4))).start.getLine();

                numOfIf++;
            }

            String s = ctx.getChild(6).getChild(0).getChild(0).getText();
/** In case else with no braces*/
            if(s.equals("{") == false && s.equals("if") == false){
                System.out.println("this is with braces ");
                /** Save the startLine */
                int x = testing.ifStartStop[numOfIf][0] = (((TerminalNodeImpl)ctx.getChild(5))).symbol.getLine();

                /** Save the endLine */
                int y = testing.ifStartStop[numOfIf][1] = (((C_grammarParser.StatementContext)ctx.getChild(6))).stop.getLine();

                System.out.println("start end "+ testing.ifStartStop[numOfIf][0]+
                        testing.ifStartStop[numOfIf][1]);

                numOfIf++;
            }else{/** In case else with braces*/
                System.out.println("this is with braces ");
                /** Save the startLine */
                int x = testing.ifStartStop[numOfIf][0] = (((TerminalNodeImpl)ctx.getChild(5))).symbol.getLine();

                /** Save the endLine */
                int y = testing.ifStartStop[numOfIf][1] = (((C_grammarParser.StatementContext)ctx.getChild(6))).stop.getLine();

                System.out.println("start end "+ testing.ifStartStop[numOfIf][0]+
                        testing.ifStartStop[numOfIf][1]);

                numOfIf++;
            }
            System.out.println("else end "+((C_grammarParser.StatementContext)ctx.getChild(6)).stop.getLine());
            System.out.println("\n\nthe child count = "+count+" Line = "+"\n\n");
            }



//        System.out.println("================ enterIfStatement =====================");
////        System.out.println(ctx.getText());
//        for (var child :
//                ctx.children) {
//            System.out.println(child.getText());
//        }
//        System.out.println("=====================================");
    }

    @Override public void enterSwitch(C_grammarParser.SwitchContext ctx) {


//        System.out.println("================= enterSwitch ====================");
////        System.out.println(ctx.getText());
//        for (var child :
//                ctx.children) {
//            System.out.println(child.getText());
//        }
//        System.out.println("=====================================");
        testing.switchStart[numSwitch] = ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine();
        numSwitch++;
    }

    @Override public void enterFunctionDefinition(C_grammarParser.FunctionDefinitionContext ctx) {

        //int count = ctx.getChild(4).getChild(0).getChildCount();
        //int lineNum = ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine();
        testing.funStartStop[numOfFunctions][0]=ctx.getStart().getLine();
        testing.funStartStop[numOfFunctions][1]=(((C_grammarParser.CompoundStatementContext)ctx.getChild(2))).start.getLine();
        testing.funStartStop[numOfFunctions][2]=ctx.getStop().getLine();

        System.out.println("test in function start  "+testing.funStartStop[numOfFunctions][0]);
        System.out.println("test in function left brace   "+testing.funStartStop[numOfFunctions][1]);
        System.out.println("test in function Right brace   "+testing.funStartStop[numOfFunctions][2]);

        numOfFunctions++;

        if (ctx.getChild(1).getText().contains("main")) {
            testing.mainFunLeftBrace = (((C_grammarParser.CompoundStatementContext)ctx.getChild(2))).start.getLine();
            testing.mainFunRightBrace = (((C_grammarParser.CompoundStatementContext)ctx.getChild(2))).stop.getLine();
        }

    }


    @Override public void enterIterationStatement(C_grammarParser.IterationStatementContext ctx) {

        String s = ctx.getChild(0).getText();


        if (s.equals("do") == false)
        {
            int count = ctx.getChild(4).getChild(0).getChildCount();
            if (count != 3) {
                /** save the startLine */
                testing.loopStartStop[numIteration][0] = ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine();

                /** save the endLine */
                testing.loopStartStop[numIteration ][1] = (((C_grammarParser.StatementContext)ctx.getChild(4))).stop.getLine();

                numIteration++;
            }
        }
//        System.out.println("================ enterIterationStatement =====================");
////        System.out.println(ctx.getText());
//        for (var child :
//                ctx.children) {
//            System.out.println(child.getText());
//        }
//        System.out.println("=====================================");
    }


    @Override public void exitCompilationUnit(C_grammarParser.CompilationUnitContext ctx) {
//        System.out.println("================ exitCompilationUnit =====================");
////        System.out.println(ctx.getText());
//        for (var child :
//                ctx.children) {
//            System.out.println(child.getText());
//        }
        System.out.println("=====================================");
        System.out.println((numOfFunctions + numLabeled + numOfIf + numSwitch + numIteration));
        System.out.println("////");
        System.out.println("Num of functions     =" + numOfFunctions);
        System.out.println("Num of cases,default =" + numLabeled);
        System.out.println("Num of if, else      =" + numOfIf);
        System.out.println("Num of Switch        =" + numSwitch);
        System.out.println("Num of loops         =" + numIteration);

        for (int i = 0; i <numOfFunctions; i++) {
            System.out.println("start "+testing.funStartStop[i][0]+"\tStop "+ testing.funStartStop[i][1]);
        }
    }
}
