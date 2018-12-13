/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

/**
 *
 * @author robert.bingaman
 */
public class Array {
    static String[] madden; 
        
    public static void main(String[] args){
        madden = new String[5];
        madden[0] = "Madden 19";
        madden[1] = "Madden 18";
        madden[2] = "Madden 17";
        madden[3] = "Madden 2004";
        madden[4] = "Madden 2009";

        printArray();
        
    }
    
    public static void printArray(){
        int i = 0;
        int arraySize = madden.length;
            System.out.println("***** Extract array value and store it *****");
        while(i<arraySize){
            System.out.println("Madden game at array at index " + i + ": " + madden[i]);  
            i = i + 1;
        
        }
    }
    
    
}
