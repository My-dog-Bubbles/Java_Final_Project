/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file handles displaying the final score screen for the user.
 */

/**
 * View class in the MVC pattern responsible for displaying the
 * final score output to the console.
 * It formats and prints the user's username, score, and title
 * in a structured visual layout.
 */
public class ScoreView {

    /**
     * Displays the final score screen for the user.
     *
     * @param username the name of the player
     * @param score the calculated "shittiness" score
     * @param title the rank/title assigned based on the score
     */
    public void displayScore(String username, int score, String title) {
        System.out.println("+------------------------------------------------------------+");
        System.out.println("|                                                            |");
        System.out.println(String.format("|%-60s|", title));
        System.out.println("|                                                            |");
        System.out.println("|                                                            |");
        System.out.println(String.format("|%-60s|", "Player: " + username));
        System.out.println("|                                                            |");
        System.out.println(String.format("|%-60s|", "Score: " + score));
        System.out.println("|                                                            |");
        System.out.println("|                                                            |");
        System.out.println("+------------------------------------------------------------+");
    }
}
