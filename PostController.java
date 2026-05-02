/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file handles the control logic for creating and managing posts
using the MVC design pattern. It connects the Post model with the PostView.
 */

/**
 * Controller class in the MVC pattern that manages interaction between
 * the Post model and the PostView.
 * It processes user input, updates the model, and sends data to the view
 * for display.
 */
public class PostController {

    private Post model;
    private PostView view;

    /**
     * Constructs a PostController with a given model and view.
     *
     * @param model the Post model containing post data
     * @param view the PostView responsible for displaying post data
     */
    public PostController(Post model, PostView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Default method to set a placeholder post when no user input is provided.
     *
     * @param platform the social media platform being used
     */
    public void choosePlatform(String platform) {
        choosePlatform("bland", "opperson", "type here", platform);
    }

    /**
     * Sets post data in the model and sends it to the view for display.
     *
     * @param user the username of the post creator
     * @param enemyUser the target username
     * @param posts the content of the post
     * @param platform the social media platform
     */
    public void choosePlatform(String user, String enemyUser, String posts, String platform) {
        model.setUsername(user);
        String username = model.getUsername();

        model.setEnemyUsername(enemyUser);
        String enemyUsername = model.getEnemyUsername();

        model.setPost(posts);
        String post = model.getPost();

        model.setSocialMedia(platform);
        String socialMedia = model.getSocialMedia();

        // want to add that current time is taken by display post
        view.displayPost(username, enemyUser, post, socialMedia);
    }
}
