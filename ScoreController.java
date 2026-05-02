/* 
Name: Angel Carmichael
Date: 04/29/26

Description: This file controls scoring logic for evaluating how "shitty"
a user's post is based on keyword detection.
 */

/**
 * Controller class in the MVC pattern responsible for calculating and
 * displaying a "shittiness" score for a post.
 * It analyzes post content, assigns a score based on keyword matches,
 * and sends the result to the ScoreView for display.
 */
public class ScoreController {

    private Score model;
    private ScoreView view;

    /**
     * Constructs a ScoreController with the given model and view.
     *
     * @param model the Score model storing score-related data
     * @param view the ScoreView responsible for displaying results
     */
    public ScoreController(Score model, ScoreView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Calculates and displays the score for a user's post.
     *
     * @param user the username associated with the post
     * @param post the post content to be evaluated
     */
    public void showScore(String user, String post) {
        String title = "";
        int score = getScore(post);

        model.setUsername(user);
        String username = model.getUsername();

        if (score >= 50) {
            title = "PRO HATER";
        } else if (score < 6) {
            title = "You can be meaner . . . No one is watching -_-";
        } else {
            title = "You are a hater! But you can be meaner";
        }

        view.displayScore(username, score, title);
    }

    /**
     * Calculates a "shittiness" score based on keyword matches in a post.
     * Each word in the post is compared against a predefined list of
     * negative or insulting words. Each match increases the score by 1.
     *
     * @param post the post content to analyze
     * @return the calculated score based on keyword matches
     */
    public int getScore(String post) {
        int score = 0;

        String[] shittines = {
            "abrasive", "abusive", "antagonistic", "apathetic", "arrogant", "annoying", "asshole", "ass",
            "belligerent", "bitter", "brash", "brutal", "bad", "bitch", "butt", "bum", "bastared", "bullshit",
            "callous", "caustic", "cold", "combative", "contemptuous", "condescending", "crass", "cruel", "cutting", "cunt", "crap","cock",
            "dang", "deceitful", "deceptive", "demeaning", "dick", "damn", "dammit", "dammed", "dickhead", "dicking",
            "egocentric", "egotistical", "envious",
            "fierce", "foul", "frustrating", "fuck", "fucker","fucking", "fag", "fucked", "fat",
            "gruff", "gay", "gag", "gloryhole", "goddamn", "godddamn", "goddammit", "goddammned",
            "harsh", "hateful", "hostile", "hurtful", "hater", "hole", "hell", "horseshit", "hate",
            "ignorant", "impatient", "inconsiderate", "insensitive", "insolent", "insulting", "intimidating",
            "judgmental", "jackass", "jacking",
            "knavish", "know-it-all", "kill", "kys",
            "leering", "loathsome", "loutish",
            "malicious", "manipulative", "mean", "merciless", "mocking", "miserable",
            "nasty", "negative", "narcissistic", "naughty",
            "obnoxious", "obstinate", "offensive", "oppressive", "overbearing",
            "petty", "pessimistic", "provocative", "pussy", "prick", "piss",
            "quarrelsome", "quibbling", "quick-tempered", "quack",
            "resentful", "rude", "ruthless", "retard",
            "sarcastic", "snide", "spiteful", "stern", "stubborn", "superior", "slut", "sucker", "shit", "spatic", "smelly",
            "thoughtless", "toxic", "tyrannical", "twat",
            "uncooperative", "unfriendly", "ungrateful", "unkind", "unreasonable", "ugly",
            "vengeful", "venomous", "vicious", "vindictive",
            "wary", "wicked", "wrathful", "wanker",
            "xenophobic",
            "yappy", "yelling",
            "zombie-like"
        };

        String[] words = post.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase().replaceAll("[^a-z]", "");

            for (int j = 0; j < shittines.length; j++) {
                if (word.equals(shittines[j])) {
                    score++;
                    break;
                }
            }
        }

        return score;
    }
}
