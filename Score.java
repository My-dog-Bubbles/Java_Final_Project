/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file scores the users score of how shitty their post was. 
*/

import java.util.*

// shows the score page info
public class Score{
    // how are we going to test the shittiness of a post. 

    //
    private int score = 0;
    private String username = "";

    public Score(score, username){
        this.score = score;
        this.username = username;
    }

    pubilc int get_score(){
        String[] shittines = ["arse", "arsehead", "arsehole", "ass", "asshole", 
                                "bastard", "bitch", "bloody", "bollocks", "brotherfucker", "bugger", "bullshit", 
                                "chigga", "child-fucker", "cock", "cocksucker", "crap", "cunt", 
                                "dammit", "damn", "damned", "dick", "dick-head", "dickhead", "dumb", "dumb-ass", "dumbass", "dyke", "da"
                                "fag", "faggot", "father-fucker", "fatherfucker", "fuck", "fucked", "fucker", "fucking", 
                                "goddammit", "goddamn", "goddamned", "goddamnit", "godsdamn", 
                                "hell", "horseshit", 
                                "jack-ass", "jackass", 
                                "kike", 
                                "mother fucker", "mother-fucker", "motherfucker", 
                                "nigga", "nigger", 
                                "pigfucker", "piss off", "prick", "pussy", 
                                "shit", "shite", "sisterfuck", "sisterfucker", "slut", "spastic", 
                                "tranny", "twat"
                                "wanker"]

        // add one point to the score for each time one of the curse word is in the post

        // loops though each word
        for (word in shittines){
            // add 1 to score each time to word apperars 
            for (word in get_post()){
                score =+ score;
            }
        }
        return score;
    }

    public String get_username(){
        return username;
    }
}