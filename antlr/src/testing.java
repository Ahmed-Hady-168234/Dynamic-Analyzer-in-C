import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class testing {
    /**funStartStop array 2d contains the function start line[x][0] and leftBrace line[x][1] and rightBrace line[x][2] */
    public static int funStartStop[][]=new int[10000][3];

    /**ifStartStop array 2d contains the if statement start[x][0] and end[x][1] lines (in case it have no braces)*/
    public static int ifStartStop[][]=new int[10000][2];

    /**ifStartStop array 2d contains the loop(for, while only) start[x][0] and end[x][1] lines (in case it have no braces)*/
    public static int loopStartStop[][]=new int[10000][2];

    /**switchStart array 1d contains the switch start line*/
    public static int switchStart[]=new int[10000];

    /**Contain the line number of the left brace of the main function*/
    public static int mainFunLeftBrace;

    /**Contain the line number of the right brace of the main function*/
    public static int mainFunRightBrace;

    /**Array to put the input code in it*/
    public static String[] codeLines;

    /**Array to put the code after adding flags in it*/
    public static String code;

    /**Variable used to count the number of code lines in the program*/
    public static int lineNumber = 1;

    /**Array which will contain the flags values */
    public static int finalFlag[];

    /**Object used with the files to read*/
    public static Scanner myReader;

    /**
     *@brief <b>main<b>
     *_______________________________________________________________
     */
    public static void main(String[] args)throws Exception
    {
        String inputFile  = "t.c";          /**Input c file Name*/
        String valuesFile = "values.txt";   /**Values file name (will contain flags values)*/
        String processingFile = "x.c";      /**The c file in that contains the original code + flags*/
        FileInputStream is = null;          /**Used with files*/
        String progPath = "D:\\Ahmed Hady\\college\\Second Term\\Compilers\\Project\\Dynamic-Analyzer-in-C\\antlr"; /**path of the program*/
        String gccPath = "C:\\MinGW\\bin";  /**The compiler path*/
        String htmlFileName = "output.html";/**The html file name*/

        /*Step 1*/
        /**Run the C_grammar file using ANTLR*/
        runAntlr(inputFile, is);

        /*Step 2*/
        /**Get the code from the input file and put it in codeLines array*/
        getInputCode(inputFile  ,is);
        code = "";

        /*Step 3*/
        /**Add flags to each line of code that could be run to detect whether it have been visited or not
         * the new code is added to the String code*/
        addFlagsToInputCode(valuesFile);

        /*Step 4*/
        /**Create file to run the new code(used to run the code with flags)*/
        createFileToRun(processingFile);

        /*Step 5*/
        /**Compile and run the new file(which contains the code + flags)*/
        runNewFile(processingFile,progPath,gccPath);

        /*Array used to put the flags values in it*/
        System.out.println(lineNumber);
        finalFlag = new int[lineNumber+5];

        /*Step 6*/
        /**Get the values of the flags(added by the c program after we injected some lines to create and write in this file ) from values.txt*/
        getFlagsValues(valuesFile);

        /*Step 7*/
        /**Handle the flags of the lines that addFlagsToInputCode() couldn't handle after the runing*/
        handleDeadLines();

        /*Step 8*/
        /**Produce the HTML final file*/
        produceHtmlFile(inputFile,htmlFileName);


        /*Step 9*/
        /**Run the produced html file*/
        runHtmlFile(progPath, htmlFileName);

    }


    /**
     *@brief <b>Step 1 runAntlr<b>
     *@details This function Runs the C_grammar file using ANTLR
     *@param Input <b>inputFile</b> String contains the input file name with extension
     *
     * @param Input <b>is</b>used to put the FileInputStream in it
     *_______________________________________________________________
     */
    public static void runAntlr(String inputFile,FileInputStream is) throws Exception {
        is = new FileInputStream(inputFile);
        ANTLRInputStream   input = new ANTLRInputStream(is);
        C_grammarLexer lexer = new C_grammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        C_grammarParser parser = new C_grammarParser(tokens);

        ParseTree tree = parser.compilationUnit();
        //System.out.println(tree.toStringTree(parser));
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new analyzer(),tree);

    }

    /**
     *@brief <b>Step 2 getInputCode<b>
     *@details This function gets the code from the input file and put it in codeLines array
     *@param Input <b>inputFile</b> String contains the input file name with extension
     * @param Input <b>is</b>used to put the FileInputStream in it
     *_______________________________________________________________
     */
    public static void getInputCode(String inputFile,FileInputStream is)throws Exception{
        is = new FileInputStream(inputFile);
        byte[] buffer = new byte[is.available()];
        is.read(buffer);
        code = new String(buffer);
        codeLines = code.split("\r\n");
    }

    /**
     *@brief <b>Step 3 addFlagsToInputCode<b>
     *@details This function Add flags to each line of code that could be run to detect whether it have been visited or not
     *       * the new code is added to the String "code"
     *@param input <b>valuesFile</b> String contains the values file name with extension
     *_______________________________________________________________
     */
    public static void addFlagsToInputCode( String valuesFile){
        for(int i = 0; i < codeLines.length; i++, lineNumber++){

            /**Make anything before the first function high*/
            if (i < funStartStop[0][0]){
                code += codeLines[i] +"\r\n";
            }else {
                Pattern detectCaseStartPattern = Pattern.compile("[\s\t\r\n]*case.*:[\s\t\r\n]*");
                Matcher detectCaseStartPatternMatcher = detectCaseStartPattern.matcher(codeLines[i]);

                Pattern detectLabelStartPattern = Pattern.compile("[\s\t\r\n]*.*:[\s\t\r\n]*");
                Matcher detectLabelStartPatternMatcher = detectLabelStartPattern.matcher(codeLines[i]);

                if (codeLines[i].contains(";")) {
                    Pattern detectForPattern = Pattern.compile("[s\t\n]*for\\(.+;.*;.*\\)");
                    Matcher detectForMatcher = detectForPattern.matcher(codeLines[i]);
                    //                                                   Type        space      varName     space     = space      value       space     ;
                    Pattern detectDeclarationPattern = Pattern.compile("[^\s\t\r\n]+[\s\t\r\n]+[^\s\t\r\n]+[\s\t\r\n]*=[\s\t\r\n]*[^\s\t\r\n]+[\s\t\r\n]*;");
                    Matcher detectDeclarationMatcher = detectDeclarationPattern.matcher(codeLines[i]);
                    Pattern detectKeywordsPattern = Pattern.compile("[\s\t\r\n]*(return|continue|break|goto)");
                    Matcher detectKeywordsMatcher = detectKeywordsPattern.matcher(codeLines[i]);

                    Pattern detectEnteringScopePattern = Pattern.compile("[\s\t\r\n]*\\{[\s\t\r\n]*");
                    Matcher detectEnteringScopeMatcher = detectEnteringScopePattern.matcher(codeLines[i]);


                    if (detectEnteringScopeMatcher.find()) {
                        code += codeLines[i] + "flag[" + lineNumber + "] = 1;\r\n";
                    } else if (detectForMatcher.find()) {
                        code += codeLines[i] + "\r\n";
                    } else {
                        if (detectDeclarationMatcher.find()) {/**Detects declaration*/
                            code += codeLines[i] + "flag[" + lineNumber + "] = 1;" + "\r\n";
                        } else if (detectKeywordsMatcher.find()) {/**Detects return, continue, break and goto*/
                            if (codeLines[i].contains("return") && mainFunLeftBrace<=i && mainFunRightBrace>=i){
                                code += "flag[" + lineNumber + "] = 1;"+
                                        "for(i_file_counter__ = 0;i_file_counter__<"+codeLines.length+";i_file_counter__++){fprintf(fptr,\"%d\\n\",flag[i_file_counter__]);}fclose(fptr);"
                                        + codeLines[i] + "\r\n";
                            }else {
                                code += "flag[" + lineNumber + "] = 1;"+ codeLines[i] + "\r\n";
                            }
                        } else {
                            String lineSegments[] = codeLines[i].split(";");
                            for (int j = 0; j < lineSegments.length; j++) {
                                code += lineSegments[j] + ",";
                            }
                            code += "flag[" + lineNumber + "] = 1;\r\n";
                        }
                    }
                }else if (detectCaseStartPatternMatcher.find()) {/**Detect start of the case (in switch)*/
                    code += codeLines[i] + "flag[" + lineNumber + "] = 1;" + "\r\n";

                } else if (codeLines[i].contains("}")) {/**Detects any rgiht brace*/
                    code += "flag[" + lineNumber + "] = 1;" + codeLines[i] + "\r\n";
                }else if(detectLabelStartPatternMatcher.find() == true && detectCaseStartPatternMatcher.find() == false){
                    code += codeLines[i]+"flag[" + lineNumber + "] = 1;" + "\r\n";
                }else if(false){

                } else {
                    Pattern detectEnteringScopePattern = Pattern.compile("[\s\t\r\n]*\\{[\s\t\r\n]*");
                    Matcher detectEnteringScopeMatcher = detectEnteringScopePattern.matcher(codeLines[i]);
                    if (detectEnteringScopeMatcher.find()) {
                        code += codeLines[i] + "flag[" + lineNumber + "] = 1;\r\n";
                    }
                    else {
                        code += codeLines[i] + "\r\n";
                    }

                }
            }
            int x = ifStartStop[1][0];
            if(lineNumber == mainFunLeftBrace){
                code += "int i_file_counter__;FILE *fptr;fptr = fopen(\""+valuesFile+"\",\"w\");";
            }
        }
        //System.out.println("\n\n\n\n"+code);
        code = "int flag[" + lineNumber + "];\r\n#include <stdlib.h> \r\n" + code;
    }

    /**
     *@brief <b>Step 4 createFileToRun<b>
     *@details This function Creates file to run the new code(used to run the code with flags)
     *@param input <b>processingFile</b> String contains the processing file name with extension
     *_______________________________________________________________
     */
    public static void createFileToRun(String processingFile) throws Exception{
        File targetFile = new File(processingFile);
        OutputStream outStream = new FileOutputStream(targetFile);
        outStream.write(code.getBytes());

    }

    /**
     *@brief <b>Step 5 runNewFile<b>
     *@details Compile and run the new file(which contains the code + flags)
     *@param input <b>processingFile</b> String contains the processing file name with extension
     *@param input <b>progPath</b> String contains the program path
     *@param input <b>gccPath</b> String contains the gcc compiler path
     *_______________________________________________________________
     */
    public static void runNewFile(String processingFile,String progPath,String gccPath) throws Exception{
        String command = "cmd.exe /c gcc.exe \""+progPath + "\\" +processingFile+"\" -o \""+progPath+"\\output.exe\"";
        File dir = new File(gccPath);
        Process newFileCompile = Runtime.getRuntime().exec(command,null,dir);

        /**Compile The new created file*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(newFileCompile.getInputStream()));
        reader.readLine();
        newFileCompile.destroy();

        /**Run the output file (.exe)*/
        Process newFileRun = Runtime.getRuntime().exec("cmd /c output.exe",null, new File(progPath));
        reader = new BufferedReader(new InputStreamReader(newFileRun.getInputStream()));
        reader.readLine();
        newFileRun.destroy();
    }

    /**
     *@brief <b>Step 6 getFlagsValues<b>
     *@details This function Gets the values of the flags(added by the c program after we injected some lines to create and write in this file ) from values.txt
     *@param input <b>valuesFile</b> String contains the values file name with extension
     *_______________________________________________________________
     */
    public static void getFlagsValues(String valuesFile)throws Exception{
        File finalValuesFile = new File(valuesFile);
        finalValuesFile.createNewFile();

        File myObj = new File(valuesFile);
        myReader = new Scanner(myObj);
        int j = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            finalFlag[j] = Integer.parseInt(data);
            j++;
        }
        myReader.close();
    }

    /**
     *@brief <b>Step 7 handleDeadLines<b>
     *@details Handle the flags of the lines that addFlagsToInputCode() couldn't handle after the runing
     *@see enterIfStatement()
     *@see enterSwitch()
     *@see enterFunctionDefinition()
     *@see enterIterationStatement()
     *_______________________________________________________________
     */
    public static void handleDeadLines(){

        int switchStartPtr   = 0;
        int funStartStopPtr   = 0;
        int ifStartStopPtr    = 0;
        int loopStartStopPtr  = 0;
        int funLeftBraceLine  = funStartStop[funStartStopPtr][1];
        int funRightBraceLine = funStartStop [funStartStopPtr][2];

        for (int i = 0 ; i <= lineNumber ; i++) {

/*******The next lines are used to detect the part before the functions(includes, defines, structs, ....., etc ) ********/
            if (funStartStop[0][0]+1>i)//To make the part before the functions high
            {
                finalFlag[i] = 1;
            }

/*******The next lines are used to detect the function's start, leftBrace and rightBrace Lines ********/
            /**if the current line(i) is the function's start line*/
            if (funStartStop[funStartStopPtr][0] == i &&
                    /**And if the flag of the left brace of the function is high*/
                    finalFlag[ funLeftBraceLine ]== 1){

                /**Make the flag of the fun start line high*/
                finalFlag[i] = 1;
            }

            /**Did we reach the function's right brace ? */
            if ( funRightBraceLine == i) {

                /**Point to the next fun*/
                funStartStopPtr++;
            }

/*******The next line are used to detect if there is a if statement with no braces ********/
            /**If the current line is within the if(that have no braces) start end scope*/
            if (ifStartStop[ifStartStopPtr][0] <= i && ifStartStop[ifStartStopPtr][1] >= i ){
                /**And if the flag of the if child is high*/
                if (finalFlag [ifStartStop[ifStartStopPtr][1]] == 1) {

                    /**Make the current line flag's high*/
                    finalFlag[i] = 1;
                }
            }else if(ifStartStop[ifStartStopPtr][1] < i){
                /**Lets move the pointer to point to the next if (that doesn't have braces)*/
                ifStartStopPtr++;
            }
/*******The next line are used to detect the start line of the switch statement ********/
            if (switchStart[switchStartPtr] == i){

                /**the switch start line(just the start line) is high or low dependes on the previous line*/
                finalFlag[i] = finalFlag[i-1];

                /**Let the ptr move to the next switch*/
                switchStartPtr++;
            }


/*******The next line are used to detect the loop(for, while only) with no braces ********/
            /**If the current line is within the loop(that have no braces) start end scope*/
            if (loopStartStop[loopStartStopPtr][0] <= i && loopStartStop[loopStartStopPtr][1] >= i ){
                /**And if the flag of the if child is high*/
                if (finalFlag [loopStartStop[loopStartStopPtr][1]] == 1) {

                    /**Make the current line flag's high*/
                    finalFlag[i] = 1;
                }
            }else if(loopStartStop[loopStartStopPtr][1] < i){
                /**Lets move the pointer to point to the next if (that doesn't have braces)*/
                loopStartStopPtr++;
            }
        }
    }

    /**
     *@brief <b>Step 8 produceHtmlFile<b>
     *@details Produce the HTML final file
     *@param input <b>inputFile</b> String contains the input file name with extension
     *@param input <b>htmlFileName</b> String contains the html file name with extension
     *_______________________________________________________________
     */
    public static void produceHtmlFile(String inputFile, String htmlFileName)throws Exception{
        File getInputLines = new File(inputFile);
        myReader = new Scanner(getInputLines);

        File finalHtmlFile = new File(htmlFileName);
        finalHtmlFile.createNewFile();
        FileWriter myWriter = new FileWriter(htmlFileName);
        myWriter.write("<html><body>\r\n");
        for (int i = 1; i <lineNumber; i++) {
            myWriter.write("");
            if (myReader.hasNextLine()) {
                String inputLine = myReader.nextLine();
                inputLine = inputLine.replace("<", "&lt");
                inputLine = inputLine.replace(">", "&gt");
                if (finalFlag[i] == 0){/**red*/

                    myWriter.write("<p style=\"color:red;\">"+ inputLine +"</p>\r\n");
                }else if(finalFlag[i] == 1) {/**green*/
                    myWriter.write("<p style=\"color:green;\">"+ inputLine +"</p>\r\n");
                }
            }

        }

        myReader.close();

        myWriter.write("</body></html>");
        myWriter.close();
    }


    /**
     *@brief <b>Step 9 runHtmlFile<b>
     *@details Run the produced html file
     *@param input <b>progPath</b> String contains the program path
     *@param input <b>htmlFileName</b> String contains the html file name with extension
     *_______________________________________________________________
     */
    public static void runHtmlFile(String progPath,String htmlFileName) throws Exception{

        /**Run the html file (.exe)*/
        Process newFileRun = Runtime.getRuntime().exec("cmd /c "+htmlFileName+" ",null, new File(progPath));
        BufferedReader reader = new BufferedReader(new InputStreamReader(newFileRun.getInputStream()));
        reader.readLine();
        newFileRun.destroy();
    }
}
