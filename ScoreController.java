/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file 
*/

import java.util.*
// you have to import the file into controller

public class ScoreController(){
    private Score model;
    private ScoreView view;

    public PostController(Score model, ScoreView view){
        this.model;
        this.view;
    }

    public void showScore(String username, String post){
        String username = model.getUsername();
        String score = model.getScore(post);
        view.displayScore(username, score);
    }    
}