/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file uses the MVC to allow the user to play the game Let's shit post. This is where user input is collected.
 */

import java.util.*;

/**
 * Entry point for the "Let's Shit Post" application.
 * This class handles user interaction through the console, collects input,
 * and connects the PostController and ScoreController to execute the game
 * using an MVC design pattern.
 */
public class Main {

    /**
     * Starts the application, gathers user input, and processes a post
     * along with a score evaluation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // game start
        System.out.println("WELCOME TO SHIT POST!!!");
        System.out.println("This game allows you to let off steam without the digital foot print or hurting people's feelings.");

        PostController post1 = new PostController(new Post(), new PostView());
        ScoreController score1 = new ScoreController(new Score(), new ScoreView());

        String platform = "";

        // get the user info so I can make post object
        try (Scanner keyboard = new Scanner(System.in)) {
            while (true) {
                System.out.print("What platform would you like to use (Instagram / TikTok)?: ");
                platform = keyboard.nextLine();
                if (platform.equalsIgnoreCase("instagram") || platform.equalsIgnoreCase("tiktok")) {
                    break;
                }
                System.out.println("Invalid platform. Please enter Instagram or TikTok only.");
            }

            post1.choosePlatform(platform);

            System.out.print("What is your username?: ");
            String username = keyboard.nextLine();

            System.out.print("What would you like to say?: ");
            String post = keyboard.nextLine();

            System.out.print("Who would you like to talk to?: ");
            String op = keyboard.nextLine();

            post1.createPost(username, op, post, platform);
            score1.showScore(username, post);
        }
    }
}/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file uses the MVC to allow the user to play the game Let's shit post. This is where the user input is gotten.
 */

import java.util.*;

/**
 * Main entry point for the "Let's Shit Post" application.
 * This program demonstrates an MVC-style structure where the user selects a
 * social media platform, enters a username, target user, and message, and
 * then generates a "shit post" along with a score evaluation.
 */
public class Main {

    /**
     * Runs the application, collects user input from the console,
     * and passes data to the controller classes.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // game intro
        System.out.println("WELCOME TO SHIT POST!!!");
        System.out.println("This game allows you to let off steam without the digital foot print and hurting people feelings.");
        System.out.println("You can choose the social media platform and the person you are shit talking online. ");

        PostController post1 = new PostController(new Post(), new PostView());
        ScoreController score1 = new ScoreController(new Score(), new ScoreView());

        // get the user info so I can make post object
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What platform would you like to use?: ");
        String platform = keyboard.next();
        post1.choosePlatform(platform);

        System.out.print("What is your username?: ");
        String username = keyboard.next();

        System.out.print("What would you like to say?: ");
        String post = keyboard.next();

        System.out.print("Who would you like to shit talk?: ");
        String op = keyboard.next();

        post1.choosePlatform(username, op, post, platform);
        score1.showScore(username, post);
    }
}
