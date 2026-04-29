/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file 
 */

public class ScoreController {

    private Score model;
    private ScoreView view;

    private int score = 0;

    public ScoreController(Score model, ScoreView view) {
        this.model = model;
        this.view = view;
    }

    public void showScore(String user, String post) {
        String username = model.getUsername();
        int score = this.getScore(post);
        view.displayScore(username, score);
    }

    public int getScore(String post) {
        String[] shittines = {"arse", "arsehead", "arsehole", "ass", "asshole",
            "bastard", "bitch", "bitchass", "bitch-ass", "bloody", "bollocks", "brotherfucker", "bugger", "bullshit",
            "chigga", "child-fucker", "chin chong", "cock", "cocksucker", "coonass", "crap", "cunt",
            "dammit", "damn", "damned", "dick", "dick-head", "dickhead", "dumb", "dumb-ass", "dumbass", "dyke",
            "fag", "faggot", "father-fucker", "fatherfucker", "fuck", "fucked", "fucker", "fucking",
            "gay", "goddammit", "goddamn", "goddamned", "goddamnit", "godsdamn",
            "hell", "horseshit",
            "jack-ass", "jackass",
            "kike",
            "mother-fucker", "motherfucker",
            "nigga", "nigger",
            "pedo", "pigfucker", "pig-fucker", "piss off", "prick", "pussy",
            "shit", "shite", "sister-fucker", "sister-fucker", "slut", "spastic",
            "tranny", "twat",
            "wanker", "Wetback", "Whore"};

        // add one point to the score for each time one of the curse word is in the post
        // loops though each word
        for (String postWord : post.split("\\s+")) {
            postWord = postWord.toLowerCase().replaceAll("[^a-z]", ""); // remove punctuation and make lowercase
            for (String word : shittines) {
                // add 1 to score each time to word apperars 
                if (word.equals(postWord)) {
                    score += 1;
                }
            }
        }
        return score;
    }
}
