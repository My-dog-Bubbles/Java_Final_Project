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
                                "bastard", "bitch", "bitchass", "bitch-ass", "bloody", "bollocks", "brotherfucker", "bugger", "bullshit", 
                                "chigga", "child-fucker", "chin chong", "cock", "cocksucker", "coonass", "crap", "cunt", 
                                "dammit", "damn", "damned", "dick", "dick-head", "dickhead", "dumb", "dumb-ass", "dumbass", "dyke", "da"
                                "fag", "faggot", "father-fucker", "fatherfucker", "fuck", "fucked", "fucker", "fucking", 
                                "gay", "goddammit", "goddamn", "goddamned", "goddamnit", "godsdamn", 
                                "hell", "horseshit", 
                                "jack-ass", "jackass", 
                                "kike", 
                                "mother-fucker", "motherfucker", 
                                "nigga", "nigger", 
                                "pedo", "pigfucker", "pig-fucker", "piss off", "prick", "pussy", 
                                "shit", "shite", "sister-fucker", "sister-fucker", "slut", "spastic", 
                                "tranny", "twat"
                                "wanker", "Wetback", "Whore"]

        // add one point to the score for each time one of the curse word is in the post

        // loops though each word
        for (word in shittines){
            // add 1 to score each time to word apperars 
            for (word in get_post()){
                score += score;
            }
        }
        return score;
    }

    public String get_username(){
        return username;
    }
}