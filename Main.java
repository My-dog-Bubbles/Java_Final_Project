/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file uses the MVC to allow the use to play the game Let's shit post. This is where the user input is gotten.
*/

import java.util.*

// output for everything
public class Main(){
    // game intro
    System.out.println("WELCOME TO SHIT POST!!!");
        System.out.println("This game allows you to let off steam without the digital foot print and hurting people feelings.");
        System.out.println("You can choose the social media platform and the person you are shit talking online. ");

        Post post1 = new Post(); 
        Score score1 = new Score();

        // get the user info so I can make post object
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What platform would you like to use?: ");
        String platform = keyboard.next();

        post1.choosePlatform(platform);

        System.out.print("What is your username?: ");
        String username = keyboard.next();

        post1.choosePlatform(username, platform);

        System.out.print("Who is the person you want to shit talk too?: ");
        String op = keyboard.next();

        post1.choosePlatform(username, op, platform);

        System.out.print("What would you like to say?: ");
        String post = keyboard.next();

        post1.choosePlatform(username, op, post, platform);
        score1.displayScore(username,post);
} 