/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file stores the post information and allows for editing of username and post.
 */

import java.util.Date;

/**
 * Represents a social media post in the application.
 * This class stores all data related to a post, including the username,
 * target user (enemy username), post content, social media platform,
 * and the timestamp when the post object was created.
 */
public class Post {

    // hold 
    private String username;
    private String enemyUsername;
    private Date postDate;
    private String post;
    private String socialMedia;

    /**
     * Default constructor that initializes all fields with empty values
     * and sets the post date to the current system time.
     */
    public Post() {
        this.username = "";
        this.enemyUsername = "";
        this.postDate = new Date();
        this.post = "";
        this.socialMedia = "";
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
     * Gets the username of the target (enemy) user.
     *
     * @return the enemy username
     */
    public String getEnemyUsername() {
        return enemyUsername;
    }

    /**
     * Gets the date and time the post was created.
     *
     * @return the post creation date
     */
    public Date getPostDate() {
        return postDate;
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
        return socialMedia;
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
     * Sets the username of the target (enemy) user.
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
     * @param socialMedia the platform name to set
     */
    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }
}
