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



    /**
     *@brief <b>enterIfStatement<b>
     *@details This function is called by the grammar whenever if statement grammar is entered
     *_______________________________________________________________
     */
    @Override public void enterIfStatement(C_grammarParser.IfStatementContext ctx) {
        if(ctx.getChildCount() >= 6) {

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

                /** Save the startLine */
                testing.ifStartStop[numOfIf][0] = (((TerminalNodeImpl)ctx.getChild(5))).symbol.getLine();

                /** Save the endLine */
                testing.ifStartStop[numOfIf][1] = (((C_grammarParser.StatementContext)ctx.getChild(6))).stop.getLine();


                numOfIf++;
            }else if(s.equals("if") == false){/** In case else with braces*/

                /** Save the startLine */
                testing.ifStartStop[numOfIf][0] = (((TerminalNodeImpl)ctx.getChild(5))).symbol.getLine();

                /** Save the endLine */
                testing.ifStartStop[numOfIf][1] = (((C_grammarParser.StatementContext)ctx.getChild(6))).stop.getLine();

                numOfIf++;
            }

            }

    }

    /**
     *@brief <b>enterSwitch<b>
     *@details This function is called by the grammar whenever switch statement grammar is entered
     *_______________________________________________________________
     */
    @Override public void enterSwitch(C_grammarParser.SwitchContext ctx) {
        testing.switchStart[numSwitch] = ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine();
        numSwitch++;
    }

    /**
     *@brief <b>enterFunctionDefinition<b>
     *@details  This function is called by the grammar whenever function definition grammar is entered
     *_______________________________________________________________
     */
    @Override public void enterFunctionDefinition(C_grammarParser.FunctionDefinitionContext ctx) {

        //int count = ctx.getChild(4).getChild(0).getChildCount();
        //int lineNum = ((TerminalNodeImpl)ctx.getChild(0)).symbol.getLine();
        testing.funStartStop[numOfFunctions][0]=ctx.getStart().getLine();
        testing.funStartStop[numOfFunctions][1]=(((C_grammarParser.CompoundStatementContext)ctx.getChild(2))).start.getLine();
        testing.funStartStop[numOfFunctions][2]=ctx.getStop().getLine();

        numOfFunctions++;

        if (ctx.getChild(1).getText().contains("main")) {
            testing.mainFunLeftBrace = (((C_grammarParser.CompoundStatementContext)ctx.getChild(2))).start.getLine();
            testing.mainFunRightBrace = (((C_grammarParser.CompoundStatementContext)ctx.getChild(2))).stop.getLine();

        }

    }


    /**
     *@brief <b>enterIterationStatement<b>
     *@details This function is called by the grammar whenever iteration statement grammar is entered
     *_______________________________________________________________
     */
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
    }


}
