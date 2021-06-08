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

    public static int mainFunLeftBrace;
    public static int mainFunRightBrace;

    public static void main(String[] args)throws Exception
    {
        String inputFile  = "t.c";
        String valuesFile = "values.txt";
        String processingFile = "x.c";
        FileInputStream is = new FileInputStream(inputFile);
        ANTLRInputStream   input = new ANTLRInputStream(is);
        C_grammarLexer lexer = new C_grammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        C_grammarParser parser = new C_grammarParser(tokens);

        ParseTree tree = parser.compilationUnit();
        //System.out.println(tree.toStringTree(parser));
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new analyzer(),tree);

//        byte[] buffer = new byte[is.available()];
//        is.read(buffer);
//        int flagCounter = 0;
//        int numOfFlags = 0;
//        String code = new String(buffer);
//        String[] codeLines = code.split(";\s*\r\n");
//        numOfFlags += codeLines.length - 1;
//        code = "";
//        for (int i = 0;i< codeLines.length - 1; i++, flagCounter++) {
//            code = code.concat(codeLines[i] + ", flag[" + flagCounter + "] = true;\n");
//        }
//        code = code.concat(codeLines[codeLines.length - 1]);
//
//        codeLines = code.split("\\{");
//        numOfFlags += codeLines.length - 1;
//        code = "";
//        for (int i = 0; i< codeLines.length - 1; i++, flagCounter++) {
//            code = code.concat(codeLines[i] + "{ flag[" + flagCounter + "] = true;");
//        }
//        code = code.concat(codeLines[codeLines.length - 1]);
//
//        System.out.println(code);
//
//        File targetFile = new File(processingFile);
//
//        OutputStream outStream = new FileOutputStream(targetFile);
//        outStream.write(buffer);

        //////////////////////////////////////
        is = new FileInputStream(inputFile);
        byte[] buffer = new byte[is.available()];
        is.read(buffer);
        String code = new String(buffer);
        String[] codeLines = code.split("\r\n");
        code = "";
        int lineNumber = 1;



            for(int i = 0; i < codeLines.length; i++, lineNumber++){
            if (i < funStartStop[0][0]){
                code += codeLines[i] +"\r\n";
            }else {
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
                } else if (codeLines[i].contains(":")) {
                    code += codeLines[i] + "flag[" + lineNumber + "] = 1;" + "\r\n";

                } else if (codeLines[i].contains("}")) {
                    code += "flag[" + lineNumber + "] = 1;" + codeLines[i] + "\r\n";
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

            if(lineNumber == mainFunLeftBrace){
                code += "int i_file_counter__;FILE *fptr;fptr = fopen(\""+valuesFile+"\",\"w\");";
            }
        }
        //System.out.println("\n\n\n\n"+code);
        code = "int flag[" + lineNumber + "];\r\n#include <stdlib.h> \r\n" + code;
//        System.out.println(code);

        File targetFile = new File(processingFile);

        OutputStream outStream = new FileOutputStream(targetFile);
        outStream.write(code.getBytes());
        System.out.println("file output "+code);
///////////////////////////////////////////////////////////////
        String progPath = "E:\\GitHub Projects\\Dynamic-Analyzer-in-C\\antlr";
        String gccPath = "C:\\MinGW\\bin";
        String command = "cmd.exe /c gcc.exe \""+progPath + "\\" +processingFile+"\" -o \""+progPath+"\\output.exe\"";
        File dir = new File(gccPath);
        Process processCompile = Runtime.getRuntime().exec(command,null,dir);

        BufferedReader reader = new BufferedReader(new InputStreamReader(processCompile.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        //processCompile = Runtime.getRuntime().exec("cmd.exe /c dir",null, new File("D:\\Ahmed Hady\\college\\Second Term\\Compilers\\Project\\Dynamic-Analyzer-in-C\\antlr"));
        processCompile.destroy();
        System.out.println("--------------------------------------------------------------------------------------");
        Process processRun = Runtime.getRuntime().exec("cmd /c output.exe",null, new File(progPath));
        reader = new BufferedReader(new InputStreamReader(processRun.getInputStream()));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        processRun.destroy();
        //reader.close();

///////////////////////////////////////////////////////////////
        int finalFlag[] = new int[lineNumber];
        System.out.println();
        /**Get the values from values.txt*/
        System.out.println("///////////////////////////////////////////////\n");

        File finalValuesFile = new File(valuesFile);
        finalValuesFile.createNewFile();

        File myObj = new File(valuesFile);
        Scanner myReader = new Scanner(myObj);
        int j = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            finalFlag[j] = Integer.parseInt(data);
            System.out.println(j +"  "+ finalFlag[j]);
            j++;
        }
        System.out.println("hhhh");
        myReader.close();
            System.out.println("\n///////////////////////////////////////////////\n");
///////////////////////////////////////////////////////////////

        int switchStartPtr   = 0;
        int funStartStopPtr   = 0;
        int ifStartStopPtr    = 0;
        int loopStartStopPtr  = 0;
        int funLeftBraceLine  = funStartStop[funStartStopPtr][1];
        int funRightBraceLine = funStartStop [funStartStopPtr][2];

        //finalFlag[5] = finalFlag[40] = finalFlag[45] = finalFlag[51] = 1;

        for (int i = 0 ; i <= lineNumber ; i++) {

/*******The next line are used to detect the part before the functions(includes, defines, structs, ....., etc ) ********/
            if (funStartStop[0][0]+1>i)//to get the part before the functions
            {
                finalFlag[i] = 1;
            }

/*******The next line are used to detect the function's start, leftBrace and rightBrace Lines ********/
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
        System.out.println("///////////////////");
        for (int i = 0; i < lineNumber; i++) {
            System.out.println(i + " "+ finalFlag[i]);
        }


///////////////////////////////////////////////////////////////////
        File getInputLines = new File(inputFile);
        myReader = new Scanner(getInputLines);


        System.out.println("hhhhgggg");


        String htmlFileName = "output.html";
        File finalHtmlFile = new File(htmlFileName);
        finalHtmlFile.createNewFile();
        FileWriter myWriter = new FileWriter(htmlFileName);
        myWriter.write("<html><body>\r\n");
        for (int i = 1; i <lineNumber; i++) {
            myWriter.write("");
            if (myReader.hasNextLine()) {
                String inputLine = myReader.nextLine();
                System.out.println(inputLine);
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
///////////////////////////////////////////////////////////////////
//        File dir = new File("src");
//        Process process = Runtime.getRuntime().exec("cmd.exe /c gcc ",null,dir);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        List<Integer> flags = new ArrayList<>();
//        String line;
//        while ((line = reader.readLine()) != null) {
//            flags.add(Integer.parseInt(line));
//        }
//        process.destroy();
//        reader.close();

        System.out.println();
//        numOfFlags += codeLines.length - 1;
//        code = "";
//        for (int i = 0;i< codeLines.length - 1; i++, flagCounter++) {
//            code = code.concat(codeLines[i] + ", flag[" + flagCounter + "] = true;\n");
//        }
//        code = code.concat(codeLines[codeLines.length - 1]);


    }
}
