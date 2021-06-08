# Dynamic-Analyzer-in-C
This is the Compiler's course project Dynamic Analyzer in C using Antlr




##### Contributers:
> * Ahmed Hady: [@Ahmed-Hady-168234]( https://github.com/Ahmed-Hady-168234 )
> * Ahmed Hafez: [@Ahmed-Hafez]( https://github.com/Ahmed-Hafez )
> * Yasser Mohamed
> * Rama Njm aldeen

Input: c program file
Output: html file contains the c code coloring the lines which have been ran in green 
        and the lines which NOT have been ran in red
        

This is a antlr c grammar code's Link: https://github.com/antlr/grammars-v4/blob/master/c/C.g4

Steps involved 

        /*Step 1*/
        /**Run the C_grammar file using ANTLR*/

        /*Step 2*/
        /**Get the code from the input file and put it in codeLines array*/
      

        /*Step 3*/
        /**Add flags to each line of code that could be run to detect whether it have been visited or not
         * the new code is added to the String code*/
       

        /*Step 4*/
        /**Create file to run the new code(used to run the code with flags)*/
       
        /*Step 5*/
        /**Compile and run the new file(which contains the code + flags)*/
       
      
        /*Step 6*/
        /**Get the values of the flags(added by the c program after we injected some lines to create and write in this file ) from values.txt*/
      
        /*Step 7*/
        /**Handle the flags of the lines that addFlagsToInputCode() couldn't handle after the runing*/
        
        /*Step 8*/
        /**Produce the HTML final file*/

        /*Step 9*/
        /**Run the produced html file*/
