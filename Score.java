/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file scores the user’s post based on how “shitty” it is. 
 */

/**
 * Represents a score evaluation for a user's post.
 * This class stores the username and post content and is intended to be
 * used for calculating or displaying a "shittiness" score in the game.
 */
public class Score {

    private String username;
    private String post;

    /**
     * Default constructor that initializes fields with empty values.
     */
    public Score() {
        this.post = "";
        this.username = "";
    }

    /**
     * Constructs a Score object with a specified username and post.
     *
     * @param username the username associated with the score
     * @param post the post content being evaluated
     */
    public Score(String username, String post) {
        this.username = username;
        this.post = post;
    }

    /**
     * Gets the username associated with this score.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the post content being evaluated.
     *
     * @return the post text
     */
    public String getPost() {
        return post;
    }

    /**
     * Sets the username associated with this score.
     *
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the post content to be evaluated.
     *
     * @param post the post text to set
     */
    public void setPost(String post) {
        this.post = post;
    }
}
