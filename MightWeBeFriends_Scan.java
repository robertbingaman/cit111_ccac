package mightwebefriends;

import java.util.Scanner;

/**
 * This is an introduction to Java class exercise to help me determine if a user would be a compatible friend with me.
 * @author Robert Bingaman
 */
public class MightWeBeFriends_Scan {

    static int musiclisten;
    static int watchsports;
    static int popradio;
    static int craftbeer;
    static int sleephours;
    static int friendscore = 15;

    public static void main(String[] args) {
        System.out.println("Do you enjoy watching sports? (0 for no, 1 for yes)");
        Scanner userInputScanner = new Scanner(System.in);//only need to "make" the scanner once. Like buying a drill from Lowe's, do not need to purchase a new drill every time you drill a new hole. 
        watchsports = userInputScanner.nextInt();
        if (watchsports == 1) {
            friendscore = friendscore + 25;
            System.out.println("Great! I do too, I think we may be able to be friends.");
        } else {
            friendscore = friendscore - 10;
            System.out.println("That's unfortunate, I really enjoy sports, but we may still be able to be friends...");
        }
        System.out.println("Do you enjoy listening to music? (0 for no, 1 for yes)");
        musiclisten = userInputScanner.nextInt();
        if (musiclisten == 1) {
            friendscore = friendscore + 10;
            System.out.println("Great! Music is very important to me, but I need to make sure it's the right kind of music...");
            System.out.println("Do you listen to pop radio? (0 for no, 1 for yes)");
            popradio = userInputScanner.nextInt();
            if (popradio == 0) {
                friendscore = friendscore + 15;
                System.out.println("Correct answer! I like most genres of music aside from modern pop music.");
            } else {
                friendscore = friendscore - 35;
                System.out.println("Oh no, I really do not like modern pop music. I think this could tank our potential friendship...");
            }
        } else {
            friendscore = friendscore - 25;
            System.out.println("Wow, you don't like music?!? I have great concerns about our potential friendship.");
        }
        System.out.println("Do you drink craft beer? (0 for no, 1 for yes)");
        craftbeer = userInputScanner.nextInt();
        if (craftbeer == 1) {
            friendscore = friendscore + 50;
            System.out.println("I LOVE CRAFT BEER!!! I feel like you get to know people best after sharing a beer.");
        } else {
            System.out.println("That's fine, we can still have a lot of fun without drinking!");
        }
        System.out.println("How many hours of sleep do you average per night? (enter the nearest whole number)");
        sleephours = userInputScanner.nextInt();
        friendscore = friendscore + sleephours;
        if (friendscore >= 30) {
            System.out.println("With your impressive score of " + friendscore + " we can be friends");
        } else {
            System.out.println("Sorry, your score of " + friendscore + " leads me to believe we would dislike each other; we cannot be friends.");
        }
    }//close main method    
}//close class
