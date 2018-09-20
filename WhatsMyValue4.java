/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackage;

/**
 *
 * @author robert.bingaman
 */
public class WhatsMyValue4 {
    public static void main(String[] args){
        int australia = 10;
        int chile = 5;
        boolean ecuador = false;
        chile = australia + chile;
        System.out.println("Australia before call: " + australia);
        System.out.println("Ecuador before if: " + ecuador);
        if(!ecuador){
            doSimpleMath(australia);                               
        }//close if
        System.out.println("Chile: " + chile);
        System.out.println("Ecuador after if: " + ecuador);             
    }//close main
    public static void doSimpleMath(int numToFlip){
        int result = (numToFlip * -1) +15;
        System.out.println("Result: " + result);
    }//close doSimpleMath
    
}// close class
