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
public class Room {
    int roomNumber;//number for the room object
    int numBeds;//number of beds in the hotel room
    boolean tv;//if the room has a TV it will be true, if false, no TV
    String bedType;//indicates Queen or King bed
    int maxCapacity;//maximum capacity of the room
    double price;
    public static Scanner userInputScanner = new Scanner(System.in);//scanner object
    
    public void setNumber(int number){//create a method to set the number for the room object
        roomNumber = number;//setting the room number
    }//close method
    
    public int getNumber(Room anyRoom){//create a method to display the room number in the hotel
        return roomNumber;//returns the number of the room        
    }//close method
    
    public void setBeds(int beds){//create a method to set number of beds in a room object
        numBeds = beds;//setting the number of beds
    }//close method
    
    public int getBeds(Room anyRoom){//method to display number of beds in a room
        return numBeds;//returns the number of beds
    }//close method
    
    public void setTV(boolean TV){//create a method to set whether the room has a TV or not
        tv = TV;//setting if there is a TV or not
    }//close method
    
    public boolean hasTV(Room anyRoom){//method to display if a room has a tv
        return tv;//returns true if there is a TV
    }//close method
    
    public void setCap(int people){//create a method to set the maximum capacity of the room object
        maxCapacity = people;//setting the maximum number of occupants for a room
        
    }//close method
    
    public int getCap(Room anyRoom){//method to display maximum capacity of room
        return maxCapacity;//returns the maximum number of occupants for the room
        
    }//close method
    
    public void setSize(String size){//create a method to set whether the room has Queen or King beds
        bedType = size;//text to display "Queen" or "King" beds
        
    }//close method
    
    public String getSize(Room anyRoom){//create a method to display what size beds are in a room object
        return bedType;//returns text to display what size beds are in the room
    }//close method
    
    public void setPrice(double dollars){//create a method to set price of a hotel room
        price = dollars;//setting the price of the room object
    }//close method
    
    public double getPrice(Room anyRoom){//create a method to return price of the hotel room object
        return price;//returns the price of the hotel room
    }//close method
}