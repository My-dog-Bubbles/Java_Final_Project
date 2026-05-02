/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file creates a visual for each of the social media platforms. It also creates a basic display for the post view. 
 */

import java.util.*;

/**
 * View class in the MVC pattern responsible for rendering social media-style
 * post layouts.
 * This class generates ASCII-based representations of different platforms
 * (Instagram and TikTok) and formats post content for display.
 */
public class PostView {

    /**
     * Displays a static platform layout without post content.
     *
     * @param platform the social media platform to display (Instagram or TikTok)
     */
    public void displayPost(String platform) {
        if ("Instagram".equalsIgnoreCase(platform)) {
            System.out.println("+-------------------------------------------+");
            System.out.println("|   [-----] Blank                           |");
            System.out.println("|   | @U@ |                                 |");
            System.out.println("|   [-----]                                 |");
            System.out.println("+-------------------------------------------+");
            System.out.println("|    ________        __        \\ | /       |");
            System.out.println("|   /  _  _  \\      /  D     --  O  --     |");
            System.out.println("|  |   _  _   |    /  /        / | \\       |");
            System.out.println("| _|  |+||+|  |_  /  /                      |");
            System.out.println("||_     --     _|/  /                       |");
            System.out.println("|  |  ______  | /  /                        |");
            System.out.println("|  \\__________//  /                         |");
            System.out.println("|   ____[]____/  /                          |");
            System.out.println("|  /         __ /                           |");
            System.out.println("| / /|      |                               |");
            System.out.println("| \\ \\|      |                               |");
            System.out.println("|  \\ |      |                               |");
            System.out.println("+-------------------------------------------+");
            System.out.println("| Blank: Caillou sees the sun!!             |");
            System.out.println("|                                           |");
            System.out.println("|                                           |");
            System.out.println("|                                           |");
            System.out.println("|                                           |");
            System.out.println("|                                           |");
            System.out.println("+-------------------------------------------+");
        } else if ("Tiktok".equalsIgnoreCase(platform)) {
            System.out.println("+-------------------------------------------+");
            System.out.println("|     _________                             |");
            System.out.println("|    /     __ _|            _________       |");
            System.out.println("|    |   _/    \\           /  _   _  \\      |");
            System.out.println("|    |  |_     []         _| (+) (+) |_     |");
            System.out.println("|  _ |  |_       \\       |_     _     _|    |");
            System.out.println("| / \\/  |        )         |  \\___/  |      |");
            System.out.println("||_____/ \\_______)         |_________|      |");
            System.out.println("|                                           |");
            System.out.println("|       'Are They Floating?'                |");
            System.out.println("|                                  (like)   |");
            System.out.println("|                                 (comment) |");
            System.out.println("| @The_Opps                        (share)  |");
            System.out.println("|                                           |");
            System.out.println("| #Magic #viral                             |");
            System.out.println("|___________________________________________|");
            System.out.println("|                  [ + ]                    |");
            System.out.println("+-------------------------------------------+");
        }
    }

    /**
     * Displays a formatted post including username, target user,
     * post content, timestamp, and platform layout.
     *
     * @param username the user who created the post
     * @param enemyUser the target user being referenced
     * @param post the content of the post
     * @param postDate the date the post was created
     * @param platform the social media platform (Instagram or TikTok)
     */
    public void displayPost(String username, String enemyUser, String post, Date postDate, String platform) {
        if ("Instagram".equalsIgnoreCase(platform)) {
            System.out.println("+-------------------------------------------+");
            System.out.println("|  [-----]                                  |");
            System.out.println("|  | @U@ | " + String.format("%-20.20s", enemyUser) + "                                 |");
            System.out.println("|  [-----]                                  |");
            System.out.println("+-------------------------------------------+");
            System.out.println("|    ________         __                    |");
            System.out.println("|   /  _  _ \\        /  D                   |");
            System.out.println("+-------------------------------------------+");
            System.out.println("|                ----------                 |");
            System.out.println("|                 Comments                  |");
            System.out.println("|                                           |");
            System.out.println("|   [-----]  " + String.format("%-20.20s", enemyUser) + "|");
            System.out.println("|   | @U@ |                                 |");
            System.out.println("|   [-----]    ");

            for (String line : wrap(post, 25).split("\n")) {
                System.out.println("|              " + String.format("%-25.25s", line) + "|");
            }
            System.out.println("|                                           |");
            System.out.println("|                                           |");
            System.out.println("|                                           |");
            System.out.println("|                                           |");
            System.out.println("+-------------------------------------------+");
        }

        if ("Tiktok".equalsIgnoreCase(platform)) {
            System.out.println("+-------------------------------------------+");
            System.out.println("|     _________                             |");
            System.out.println("|    /     __ _|              _________     |");
            System.out.println("|    |   _/   \\              /  _   _ \\     |");
            System.out.println("|    |  |_     []           _| (+) (+) |_   |");
            System.out.println("|    |  |       \\          |_     _     _|  |");
            System.out.println("+-------------------------------------------+");
            System.out.println("|                                           |");
            System.out.println("|               1  Comments                 |");
            System.out.println("|                                           |");
            System.out.println("|   [-----]  " + String.format("%-20.20s", enemyUser) + "|");
            System.out.println("|   | @U@ |                                 |");
            System.out.println("|   [-----]                                 |");

            for (String line : wrap(post, 25).split("\n")) {
                System.out.println("|         " + String.format("%-25.25s", line) + "|");
            }

            System.out.println("|    " + String.format("%-10.10s", postDate) + "  Likes:0   Reply                   |");
            System.out.println("|                                           |");
            System.out.println("|                                           |");
            System.out.println("|                                           |");
            System.out.println("+-------------------------------------------+");
        }
    }

    /**
     * Wraps a string into multiple lines of a given width.
     *
     * @param text the text to wrap
     * @param width the maximum number of characters per line
     * @return the wrapped string with newline characters
     */
    public static String wrap(String text, int width) {
        String result = "";
        for (int i = 0; i < text.length(); i += width) {
            result += text.substring(i, Math.min(i + width, text.length())) + "\n";
        }
        return result;
    }
}
