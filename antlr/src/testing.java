import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//        File targetFile = new File("x.c");
//
//        OutputStream outStream = new FileOutputStream(targetFile);
//        outStream.write(buffer);

//        is = new FileInputStream(inputFile);
//        byte[] buffer = new byte[is.available()];
//        is.read(buffer);
//        String code = new String(buffer);
//        String[] codeLines = code.split("\r\n");
//        code = "";
//        int lineNumber = 1;
//        for(int i = 0; i < codeLines.length; i++, lineNumber++){
//            if(codeLines[i].contains(";")){
//                Pattern detectForPattern = Pattern.compile("[s\t\n]*for(.+)");
//                Matcher detectForMatcher = detectForPattern.matcher(codeLines[i]);
//                //                                                   Type        space      varName     space     = space      value       space     ;
//                Pattern detectDeclarationPattern = Pattern.compile("[^\s\t\r\n]+[\s\t\r\n]+[^\s\t\r\n]+[\s\t\r\n]*=[\s\t\r\n]*[^\s\t\r\n]+[\s\t\r\n]*;");
//                Matcher detectDeclarationMatcher = detectDeclarationPattern.matcher(codeLines[i]);
//                Pattern detectKeywordsPattern = Pattern.compile("[\s\t\r\n]*(return|continue|break|goto)");
//                Matcher detectKeywordsMatcher = detectKeywordsPattern.matcher(codeLines[i]);
//                if(detectForMatcher.find()){
//                    code += codeLines[i] + "\r\n";
//                }
//                else {
//                    if(detectDeclarationMatcher.find()) {
//                        code += codeLines[i] + "flag[" + lineNumber + "] = 1;" + "\r\n";
//                    } else if (detectKeywordsMatcher.find()){
//                        code += "flag[" + lineNumber + "] = 1;" + codeLines[i] + "\r\n";
//                    }else {
//                        String lineSegments[] = codeLines[i].split(";");
//                        for(int j = 0; j < lineSegments.length; j++){
//                            code += lineSegments[j] + ",";
//                        }
//                        code += "flag[" + lineNumber + "] = 1;\r\n";
//                    }
//                }
//            } else {
//                Pattern detectEnteringScopePattern = Pattern.compile("[\s\t\r\n]*\\{[\s\t\r\n]*");
//                Matcher detectEnteringScopeMatcher = detectEnteringScopePattern.matcher(codeLines[i]);
//                if(detectEnteringScopeMatcher.find()){
//                    code += codeLines[i] + "flag[" + lineNumber + "] = 1;\r\n";
//                } else {
//                    code += codeLines[i] + "\r\n";
//                }
//            }
//        }
//        code = "int flag[" + lineNumber + "];\r\n" + code;
////        System.out.println(code);
//
//        File targetFile = new File("x.c");
//
//        OutputStream outStream = new FileOutputStream(targetFile);
//        outStream.write(code.getBytes());






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
