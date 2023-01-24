
import java.util.Random;

/* **********************************************************
 * Programmer:    Rob Sveinson
 * Class:        CS20S
 * 
 * Assignment:    A2 Sorting and Searching
 *
 * Description:    class to do some standard array work, load and print to name
                two
 **************************************************************/
 
 // import files here as needed
  
 public class ArrayFunctions
 {  // begin class

    // *********** class constants **********

    // ********** instance variable **********
     
     int maximumSize = 0;
     int actualSize = 0;
     
     int[] list = new int[maximumSize];

    // ********** constructors ***********

     public ArrayFunctions(int maxSize){
         actualSize = maxSize;
     } // end constructor
     
    // ********** accessors **********
     
     public void printList(int[] list, int len){
         for(int i = 0; i < len; i++)
             System.out.println(i + ". " + list[i]);
     } // end print array

    // ********** mutators **********
     
     public int loadList(int[] list){
        Random rnd = new Random();
        
        // load the array with random numbers 
        
        for(int i = 0; i < actualSize; i++){
            list[i] = rnd.nextInt(100)+1;
        } // end for i 
        
         return actualSize;
     } // end loadLIst
     
     
    public void bubbleSort(int[] list){
        
        for (int i = 0; i < list.length - 1; i++){
            
            for (int j = 0; j < list.length - i - 1; j++){
                if (list[j] > list[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    final int TEMP = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = TEMP;
                }
            }// end for
        }// end for
    }// end bubbleSort
    
    public void selectionSort(int[] list){
        
        
        for(int i = 0; i < list.length-1; i++){
        // for finding smallest number
        for(int j = i + 1; j<list.length; j++){
        if(list[j] < list[i]){
         // swapping indexs
         final int TEMP = list[j];
         list[j] = list[i];
         list[i] = TEMP;
        
        }// end if
        }//end for loop
        
        }
    
    }// end selectionSort

        
    public void swap(int[] list, int m, int n){
        String nl = System.lineSeparator();
        System.out.println(nl +"----- print the array in descend row lengths with sapped elements -----");

        final int TEMP = list[m];
        list[m] = list[n];
        list[n] = TEMP;

        }// end of swap
     
 
 }  // end class