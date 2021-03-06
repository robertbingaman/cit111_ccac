/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author robert.bingaman
 */
public class ReservationSystem {
    public static Scanner userInputScanner = new Scanner(System.in);//create scanner object for user interaction
    static Reservation[] reservations;//create an array to store reservations in
    static Room room1;//create a variable called room1
    static Room room2;//create a variable called room2
    static Room room3;//create a variable called room3
    static Room room4;//create a variable called room4   
    static int i = -1;//counter to use to determine if program can handle any additional reservations or not
    static boolean runprogram = true;//create a variable of type boolean to keep the switch running until the user decides to exit the program.
    
    public static void main(String[] args){//open main method
        createRooms();//instantiate all of the room objects that will be used in this program
        reservations = new Reservation[20];//instantiate the array to store reservations in (maximum 20 for this exercise)
        System.out.println("Welcome to the Bing Hotel, what would you like to do?");
        while (runprogram){
            displayMenu();
            switch(userInputScanner.nextInt()){//switch statement to interact with program menu options
                case 1: //first menu option to look up details on the rooms in the hotel
                    roominfo();//method used to see room details. 
                    break;
                case 2: 
                    createReservation();//method to create a reservation
                    break;
                case 3: 
                    System.out.println("Please enter your reservation number and hit enter.");//displays message to user to enter reservation number
                    viewReservationDetails(userInputScanner.nextInt());//method to display information about the reservation when given the users reservation number
                    break;
                case 4:
                    System.out.println("Please enter your reservation number and hit enter.");//displays message to user to enter reservation number
                    cancelReservation(userInputScanner.nextInt());//method to remove array member from memory
                    break;
                case 5:
                    runprogram = false;//changing runprogram variable to end while loop and stop running
                    break;
            }//close switch
        }
        System.out.println("Thank you for being a valued customer at Bing Hotel! See you soon!");//final message as program ends
        
                
    }//close main method
    
    public static void displayRoomStats(Room anyRoom){
        System.out.println("Room "+ anyRoom.getNumber(anyRoom)+" has " + anyRoom.getBeds(anyRoom) + " "+anyRoom.getSize(anyRoom)+" bed(s) and a maximum capacity of "+anyRoom.getCap(anyRoom)+".");//display attributes of the room object in the form of text strings.
        if(anyRoom.hasTV(anyRoom)){//change message based on whether the room has  TV or not
            System.out.println("Additionally, room " + anyRoom.getNumber(anyRoom)+" has a TV and costs $" + anyRoom.getPrice(anyRoom)+" per night (plus tax).");
        }//close if 
        else {//message if the room does not have a TV
            System.out.println("Additionally, room " + anyRoom.getNumber(anyRoom)+" does not have a TV and costs $" + anyRoom.getPrice(anyRoom)+" per night (plus tax).");
        }//close else
    }//close method
    
    public static void createReservation(){//method to create a new reservation
        System.out.println("********Creating Reservation*********");
        boolean roomsize = true;//create a boolean variable to do a while loop testing capacity of the room vs the reservation's number of guests
        i = i +1;
        if (i<reservations.length){//if statement to determine if the array can handle any more reservations or not
            reservations[i] = new Reservation();//instantiate a new reservation and store it in array at bin "i"
            reservations[i].createResNum();//establishing the reservation number for our new reservation
        }else{
            System.out.println("We cannot handle any more reservations at this time, sorry.");//message displayed if booking system is maxed out at more than 20 reservations
        }
        System.out.println("How many guests will be staying in the room? Please type the number and hit enter.");//user interaction to get number of guests on the reservation
        reservations[i].setGuests(userInputScanner.nextInt());//setting the number of guests on the reservation object
        System.out.println("Which room would you like to reserve?");        
        while(roomsize){//while loop to test number of guests in a room is appropriate
            reservations[i].setRoom(roomselector());//setting the room on the reservation object with the room selector method
            if (reservations[i].room.maxCapacity<reservations[i].getGuests()) {//test to ensure that the room selected is not over capacity with reservation  
                System.out.println("You have too many guests for this room, please make another room selection.");//message to the user telling them the room is too small and to make another selection
            } else {//open else of the if test
                System.out.println("That room will work!");//message to user to indicate the the room will work for their group
                roomsize = false;//change the variable to end the while loop
            }//close else
        }//close while loop
        System.out.println("What date would you like your reservation to be for? Please type your date in the format MM/DD/YYYY and hit enter.");//prompting the user how to enter the date of the reservation
        reservations[i].setDate(LocalDate.parse(userInputScanner.next(), DateTimeFormatter.ofPattern("MM/dd/yyyy")));//setting the date variable on the reservation
        System.out.println("Great, you have made your reservation!");//message to the user after all variables of the reservatino have been defined
        System.out.println("Your reservation number is: " +reservations[i].getResNum()+". Please keep this information for your records.");//displaying the reservation number back to the user     
        System.out.println("****************************");
    }//close createReservation method
    
    public static void createRooms(){
        room1 = new Room(); //instantiate a new room object called room1
        room1.setNumber(101);//setting room number to 101
        room1.setBeds(1);//setting 1 bed
        room1.setCap(2);//setting max capacity of 2 people
        room1.setPrice(99.99);//setting price of $99.99
        room1.setSize("King");//setting the 1 bed to King size
        room1.setTV(true);//setting that the room has a TV
        
        room2 = new Room(); //instantiate a new room object called room2
        room2.setNumber(102);//setting room number to 102
        room2.setBeds(2);//setting 2 beds
        room2.setCap(4);//setting max capacity of 4 people
        room2.setPrice(99.99);//setting price of $99.99
        room2.setSize("Queen");//setting the 2 beds to Queen size
        room2.setTV(true);//setting that the room has a TV
        
        room3 = new Room(); //instantiate a new room object called room3
        room3.setNumber(103);//setting room number to 103
        room3.setBeds(2);//setting 2 beds
        room3.setCap(4);//setting max capacity of 4 people
        room3.setPrice(89.99);//setting price of $99.99
        room3.setSize("Queen");//setting the 2 beds to Queen size
        room3.setTV(false);//setting that the room does not have a TV
        
        room4 = new Room(); //instantiate a new room object called room4
        room4.setNumber(104);//setting room number to 104
        room4.setBeds(1);//setting 1 bed
        room4.setCap(2);//setting max capacity of 2 people
        room4.setPrice(89.99);//setting price of $99.99
        room4.setSize("King");//setting the 1 bed to King size
        room4.setTV(false);//setting that the room does not have a TV
    }
    
    public static void displayMenu(){
        System.out.println("Please select from the menu below by pressing the corresponding number and hitting enter:");//instructing user to select from the menu listed below
        System.out.println("1 - View details on hotel rooms");//menu option 1 which will correspond to switch option 1 to view hotel room information
        System.out.println("2 - Create a new reservation");//menu option 2 which will create a new reservation
        System.out.println("3 - Check reservation details");//menu option 3 which will return details about someone's reservation
        System.out.println("4 - Cancel reservation");//menu option 4 which will allow the user to cancel their reservation
        System.out.println("5 - Leave Hotel");//menu option 5 which will exit the program
    }
    
    public static void roominfo(){
        System.out.println("Here at the Bing Hotel, we have 4 rooms. Which room would you like to hear more information about? Please type a number from 1 to 4 and hit enter.");
        switch(userInputScanner.nextInt()){//switch statement to select a room
            case 1:
                displayRoomStats(room1);//display room stats for room #1
                break;
            case 2:
                displayRoomStats(room2);//display room stats for room #2
                break;
            case 3:
                displayRoomStats(room3);//display room stats for room #3
                break;
            case 4: 
                displayRoomStats(room4);//display room stats for room #4
                break;
            default:
                System.out.println("Sorry I did not understand that, you are being redirected back to the main menu.");//default case if the user does not select 1 through 4. 
                break;            
        }//close switch
    }//close room info method
    
    public static Room roomselector(){//method to select a room for the reservation.
        Room roomselection = null;//creating a variable to send back to the main method with a room object after method is finished running
        boolean selector = true;//boolean variable to run a while loop
        while(selector){//while loop so that the user must select a valid option before returning the data to the main method
            switch(userInputScanner.nextInt()) {//switch to select a room using a single digit
                case 1:
                    roomselection = room1;//assigning room 1 as the selection to the local variable to return to the main method
                    selector = false;//changing the boolean variable to false to end this loop since the selection is valid
                    break;
                case 2:
                    roomselection = room2;//assigning room 2 as the selection to the local variable to return to the main method
                    selector = false;//changing the boolean variable to false to end this loop since the selection is valid
                    break;
                case 3:
                    roomselection = room3;//assigning room 3 as the selection to the local variable to return to the main method
                    selector = false;//changing the boolean variable to false to end this loop since the selection is valid
                    break;
                case 4:
                    roomselection = room4;//assigning room 4 as the selection to the local variable to return to the main method
                    selector = false;//changing the boolean variable to false to end this loop since the selection is valid
                    break;
                default:
                    System.out.println("Sorry, I could not detect that selection, please try again selecting rooms 1 - 4 by typing the corresponding number and hitting enter.");//error message, prompting user to make a correct selection
                    break;
            }//close switch  
        }//close while loop
        return roomselection;//returning room selection back to the main method
    }//close method
    
    public static void viewReservationDetails(int t){//create method to display information about the reservation
        if(reservations[t-1] == null){//checking to see if reservation exists so program does not break. Reservation number will always be 1 integer higher than location on array.
            System.out.println("Sorry, this reservation does not exist in our system.");//error message to the user if an object for the reservation number does not exist
            System.out.println("****Sending you back to the main menu****");//message instructing user that they are being redirected back to the main menu
        } else {//commands if the reservation object does exist
            System.out.println("*********Reservation Summary*************");//output for displaying reservation summary
            System.out.println("Reservation number " + reservations[t-1].getResNum()+" is for "+reservations[t-1].getDate()+".");//displaying the reservation number and date for the reservation. Reservation number is always int + 1 in relation to the bin in the array of reservation objects.
            System.out.println("This reservation is for room " + reservations[t-1].room.getNumber(reservations[t-1].room)+ " and is for " + reservations[t-1].getGuests()+ " guests.");//displaying the room and number of guests on the reservation. Reservation number is always int + 1 in relation to the bin in the array of reservation objects.
            System.out.println("The cost of the reservation is $" + reservations[t-1].room.getPrice(reservations[t-1].room)+ " before taxes and fees.");//displaying the price of the reservation before taxes and fees. Reservation number is always int + 1 in relation to the bin in the array of reservation objects.
            System.out.println("You can view more about our rooms from the main menu.");//telling the user that they can find more information about the room from the main menu. Reservation number is always int + 1 in relation to the bin in the array of reservation objects.
            System.out.println("*****************************************************");
        }//close else
    }//close method
    
    public static void cancelReservation(int t){//method to clear bin on array that contains reservation object
        if(reservations[t-1] == null){//checking to see if reservation exists so program does not break. Reservation number will always be 1 integer higher than location on array.
            System.out.println("Sorry, this reservation does not exist in our system.");//error message to the user if the reservation object tied to that reservation number does not exist
            System.out.println("****Sending you back to the main menu****");//message instructing user that they are being redirected back to the main menu
        } else {//commands if the reservation object does exist
            reservations[t-1] = null;//making the locaion on the area(and hence the object) null and cleared from memory
            System.out.println("Reservation number " + t + " has been canceled. We hope to have you back soon!");//message to the user
        }//close else
    }//close method
}//close class