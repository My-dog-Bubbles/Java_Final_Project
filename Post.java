/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file store the post information and allows for editing of username and post.
*/

import java.util.*


public class Post {

    // hold 
    private String username = "";
    private int post_date = 0;
    private String post = "";
    private String social_media = "";  

    // constructor for Post class
    public Post(tring username, Int post_date){
        this.username = username;
        this.post_date = post_date;
        this.post = post;
        this.social_media = social_media;
    }

    // getters for all the feilds
    public String getUsername(){
        return username;
    }

    public Int getPost_Date(){
        return post_date;
    }

    public String getPost(){
        return post;
    } 

    public String getSocial_media(){
        return social_media;
    }

    // allows the value to change Username, Post, an Social_media
    public void setUsername(String username){
        this.username = username;
    }

    public void setPost(String post){
        this.post = post;
    }

    public void setSocial_media(String social_media){
        this.social_media = social_media;
    }
}