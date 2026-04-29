/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file 
 */

public class PostController {

    private Post model;
    private PostView view;

    public PostController(Post model, PostView view) {
        this.model = model;
        this.view = view;
    }

    public void choosePlatform(String platform) {
        choosePlatform("bland", "opperson", "type here", platform);
    }

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
