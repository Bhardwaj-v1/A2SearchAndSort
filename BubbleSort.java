/********************************************************************
 * Programmer:    sveinson
 * Class:  CS20S
 *
 * Assignment: circle OOP example
 *
 * Description: example: using oop to create a class for circles
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class BubbleSort {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;        // string data input from keyboard
        String strout;        // processed info string to be output
        String bannerOut;        // string to print banner to message dialogs

        String prompt;        // prompt for use in input dialogs

        String delim = "[ :]+";    // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        
        int[] list = new int[20];
        // new line character for file writing
        
    // ***** create objects *******
        ArrayFunctions af = new ArrayFunctions(20);
        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
        
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
    // ********** Print output Banner **********

        printBanner();      // call printBanner method
        fileBanner(fout);       // call fileBanner method
        bannerOut = windowBanner();
            
    // ************************ get input **********************
/* input will now come from an external file so there
        will not normally be a need for a prompt
    
        prompt = "Enter your prompt text here. \n";    
        prompt += "you may need to add additional lines\n";
        prompt += "or delete some of these prompt lines.\n\n";

        strin = JOptionPane.showInputDialog(bannerOut + prompt);     
*/
        // read a line of data from the external text file

    // ************************ processing ***************************
        
    System.out.println("printing unsorted list");
    af.loadList(list);
    af.printList(list,20);
    
    System.out.println("printing sorted list");
    af.bubbleSort(list);
    
 af.printList(list,20);
    // ************************ print output ****************************
    

    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
    
//****************** static methods ***************

 /***********************************************************
    *   Purpose: Create a banner string that can be used to 
    *           print the banner to a message dialog or the console
    *           window
    *   Interface:  no parameters
    *   Returns:    no return
    * **************************************************************/
    public static String windowBanner(){
        String bannerOut = "";
        
        bannerOut = "*******************************************\n";
        bannerOut += "Name:        your name here\n";
        bannerOut += "Class:        CS20S\n";
        bannerOut += "Assignment:    Circle OOP example\n";
        bannerOut += "*******************************************\n\n"; 
        
        return bannerOut;
    } // end bannerOut

    /***********************************************************
    *   Purpose: print a banner to the console window
    *   Interface:  no parameters
    *   Returns:    no return
    * **************************************************************/    
    public static void printBanner(){
        System.out.println("*******************************************");
        System.out.println("Name:        sveinson");
        System.out.println("Class:        CS20S");
        System.out.println("Assignment:    Circle OOP example");
        System.out.println("*******************************************");        
    } // end print banner
    
 
    /***********************************************************
    *   Purpose: prints a banner to the output file
    *   Interface:  print writer fout
    *   Returns:    no return
    * **************************************************************/
    public static void fileBanner(PrintWriter fout){
         fout.println("*******************************************");
        fout.println("Name:        sveinson");
        fout.println("Class:        CS20S");
        fout.println("Assignment:    Ax Qy");
        fout.println("*******************************************");       
    } // end bannerOut

}  // end class
