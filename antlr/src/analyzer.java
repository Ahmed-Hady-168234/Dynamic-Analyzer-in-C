import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.io.FileInputStream;

public class analyzer extends C_grammarBaseListener{


    int numFunction = 0;  /*function*/
    int numLabeled = 0;   /*cases (in switch)*/
    int numIf = 0;        /*if, else*/
    int numSwitch = 0;    /*switch*/
    int numIteration = 0; /*loop (for,while,do while)*/

    @Override public void enterDeclaration(C_grammarParser.DeclarationContext ctx)
    {
        System.out.println("================ enterDeclaration =====================");
//        System.out.println(ctx.getText());
        for (var child :
                ctx.children) {
            System.out.println(child.getText());
        }
        System.out.println("=====================================");
    }
//    @Override public void enterExpression(C_grammarParser.ExpressionContext ctx)
//    {
//        System.out.println("================ enterAssignmentExpression =====================");
////        System.out.println(ctx.getText());
//        for (var child :
//                ctx.children) {
//            System.out.println(child.getText());
//        }
//        System.out.println("=====================================");
//    }

    @Override public void enterLabeledStatement(C_grammarParser.LabeledStatementContext ctx) {

        numLabeled++;
        System.out.println("================ enterLabeledStatement =====================");
//        System.out.println(ctx.getText());
        for (var child :
                ctx.children) {
            System.out.println(child.getText());
        }
        System.out.println("=====================================");
    }

    @Override public void enterIfStatement(C_grammarParser.IfStatementContext ctx) {
        if(ctx.getChildCount() >= 6) {
            numIf++;
            //write in file x.txt    & t.c y.c x.txt
            var elseParseTree = ((C_grammarParser.StatementContext)ctx.getChild(6)).children.get(0);
            if(elseParseTree.getChildCount() >= 6)
                numIf--;
            
        }
        numIf++;

        System.out.println("================ enterIfStatement =====================");
//        System.out.println(ctx.getText());
        for (var child :
                ctx.children) {
            System.out.println(child.getText());
        }
        System.out.println("=====================================");
    }

    @Override public void enterSwitch(C_grammarParser.SwitchContext ctx) {

        numSwitch++;
        System.out.println("================= enterSwitch ====================");
//        System.out.println(ctx.getText());
        for (var child :
                ctx.children) {
            System.out.println(child.getText());
        }
        System.out.println("=====================================");
    }

    @Override public void enterFunctionDefinition(C_grammarParser.FunctionDefinitionContext ctx) {
        numFunction++;
        System.out.println("================ enterFunctionDefinition =====================");
//        System.out.println(ctx.getText());
        for (var child :
                ctx.children) {
            System.out.println(child.getText());
        }
        System.out.println("=====================================");
    }

    @Override public void enterIterationStatement(C_grammarParser.IterationStatementContext ctx) {
        numIteration++;
        System.out.println("================ enterIterationStatement =====================");
//        System.out.println(ctx.getText());
        for (var child :
                ctx.children) {
            System.out.println(child.getText());
        }
        System.out.println("=====================================");
    }


    @Override public void exitCompilationUnit(C_grammarParser.CompilationUnitContext ctx) {
        System.out.println("================ exitCompilationUnit =====================");
//        System.out.println(ctx.getText());
        for (var child :
                ctx.children) {
            System.out.println(child.getText());
        }
        System.out.println("=====================================");
        System.out.println((numFunction + numLabeled + numIf + numSwitch + numIteration));
        System.out.println("////");
        System.out.println("Num of functions     =" + numFunction);
        System.out.println("Num of cases,default =" + numLabeled);
        System.out.println("Num of if, else      =" + numIf);
        System.out.println("Num of Switch        =" + numSwitch);
        System.out.println("Num of loops         =" + numIteration);
    }
}
