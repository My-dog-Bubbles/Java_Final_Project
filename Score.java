/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file scores the users score of how shitty their post was. 
 */
public class Score {
    // how are we going to test the shittiness of a post. 

    //
    private String username = "";
    private String post = "";

    public Score() {
        this.post = "";
        this.username = "";
    }

    public Score(String post, String username) {
        this.post = post;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPost() {
        return post;
    }
}
