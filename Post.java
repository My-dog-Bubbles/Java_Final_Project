/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file stores the post information and allows for editing of username and post.
 */

/**
 * Represents a social media post in the application.
 * This class stores information about a post including the username,
 * target username, post date, post content, and social media platform.
 * It provides constructors, getters, and setters to manage post data.
 */
public class Post {

    // hold 
    private String username = "";
    private String enemyUsername = "";
    private int post_date = 0;
    private String post = "";
    private String social_media = "";

    /**
     * Default constructor that initializes all fields to default empty values.
     */
    public Post() {
        this.username = "";
        this.enemyUsername = "";
        this.post_date = 0;
        this.post = "";
        this.social_media = "";
    }

    /**
     * Constructs a Post object with specified values for all fields.
     *
     * @param username the username of the post creator
     * @param enemyUsername the target username of the post
     * @param post_date the date the post was created (as an integer representation)
     * @param post the content of the post
     * @param social_media the social media platform
     */
    public Post(String username, String enemyUsername, int post_date, String post, String social_media) {
        this.username = username;
        this.enemyUsername = enemyUsername;
        this.post_date = post_date;
        this.post = post;
        this.social_media = social_media;
    }

    /**
     * Gets the username of the post creator.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the username of the opps user.
     *
     * @return the enemy username
     */
    public String getEnemyUsername() {
        return enemyUsername;
    }

    /**
     * Gets the post date value.
     *
     * @return the post date as an integer
     */
    public int getPost_Date() {
        return post_date;
    }

    /**
     * Gets the content of the post.
     *
     * @return the post text
     */
    public String getPost() {
        return post;
    }

    /**
     * Gets the social media platform associated with the post.
     *
     * @return the social media platform
     */
    public String getSocialMedia() {
        return social_media;
    }

    /**
     * Sets the username of the post creator.
     *
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the username of the opps user.
     *
     * @param enemyUsername the enemy username to set
     */
    public void setEnemyUsername(String enemyUsername) {
        this.enemyUsername = enemyUsername;
    }

    /**
     * Sets the content of the post.
     *
     * @param post the post text to set
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * Sets the social media platform for the post.
     *
     * @param social_media the platform name to set
     */
    public void setSocialMedia(String social_media) {
        this.social_media = social_media;
    }
}
