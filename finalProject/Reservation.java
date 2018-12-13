/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

import java.util.Scanner;

/**
 *
 * @author robert.bingaman
 */
public class Reservation {
    public static Scanner userInputScanner = new Scanner(System.in);//create scanner object for user interaction
    java.time.LocalDate date;//create a variable of type local date to match a date to the reservation
    static int resNum;//create a variable of type of int for the reservation number identifier
    Room room;//create a variable of type room to match a room to the reservation
    int guests;//create a variable of type int to store the number of guests on th reservation
    static int lastResNum = 0;//create a variable to help sequence reservation numbers in class createResNum()
    
    public void createResNum(){//create method to set reservation number
        resNum = lastResNum + 1;//generate a reservation number one higher than the last reservation number
        lastResNum = resNum;//redefine the latest reservation number
    }//close method
    
    public int getResNum(){//create method to return reservation number by inputting an array member
        return resNum;//returning reservation number        
    }//close method
    
    public void setGuests(int a){//create method to set number of guests on reservation
        boolean setting = true;//boolean variable to use in a while loop 
        while(setting){//while loop to to restrict number of people on a reservation to 4 (max capacity of any room)
            guests = a;//defining the number of guests
            if(a>4){//if statement to test if there are more than 4 guests on the reservation
                System.out.println("Sorry we do not have any rooms that can handle more than 4 guests. Please select fewer guests.");//error message to guest to indicate to select a fewer number of guests
                a = userInputScanner.nextInt();
            } else{//open else
                setting = false;//changing boolean variable to end while loop
            }//close else
        }//close while loop
    }//close method
    
    public int getGuests(){//create method to return number of guests on the reservation object
        return guests;//returning the number of guests on the reservation
    }//close method
    
    public void setDate(java.time.LocalDate a){//create method to store date of the reservation
        date = a;//storing the date in the date variable of the Reservation object
    }//close method
    
    public java.time.LocalDate getDate(){//create method to return date of the reservation
        return date;//returning the date of the reservation object
    }//close method
    
    public void setRoom(Room a){//create method to set room object on the reservation
        room = a;//defining the room for the reservation
    }//close method
    
    public Room getRoom(){//create method to return room on the reservation
        return room;//returning the room object on the reservation
    }//close method
}