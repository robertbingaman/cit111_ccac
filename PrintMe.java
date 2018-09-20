package firstpackage;

/**
 * Sample class to demo printing text to console and looping 
 * @author Robert Bingaman
 */
public class PrintMe {
    public static void main (String[] args) {
        // make a variable of type integer
        int numloops = 11;
        // create a counter for our loops
        int counter = 0;
        while(counter < numloops){
            System.out.println("hello world");
            // compute value on right of =, store on left of =
            counter = counter + 1;
        } // close while loop
    } // closes method (methods do things)
} // closes class
