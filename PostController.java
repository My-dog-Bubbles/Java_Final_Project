/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file 
*/

import java.util.*

public class PostController(){
    private Post model;
    private PostView view;

    public PostController(Post model, PostView view){
        this.model;
        this.view;
    }
    public void choosePlatform(String user = "bland", String enemyUser = "opperson", String posts = "type here", String platform){
        model.setUsername(user);
        String username = model.getUsername();

        model.setUsername(posts);
        String post = model.getUsername();

        model.setSocial_media(platform);
        String socialMedia = model.getSocial_media();


        // want to add that current time is taken by display post
        view.displayPost(username, enemyUser, post, platform);
    }
}