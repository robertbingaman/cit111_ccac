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
public class WhatsMyValue1 {
    static public void main(String[] args) {
        int saturn = 100;
        int mars = 20;
        int comet = saturn / mars;
        mars = comet * 10;
        saturn = mars % 10;
        System.out.println("Saturn: "+ saturn);
        System.out.println("Mars " + mars);
        System.out.println("Comet " + comet);
    } //close main    
     

        
} // close class
