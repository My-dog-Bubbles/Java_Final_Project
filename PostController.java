/**
 * Controller class in the MVC pattern that connects the Post model
 * with the PostView.
 * It handles user input, updates the model with post data, and
 * passes information to the view for display.
 */
public class PostController {

    private Post model;
    private PostView view;

    /**
     * Constructs a PostController with the specified model and view.
     *
     * @param model the Post model that stores post data
     * @param view the PostView responsible for displaying output
     */
    public PostController(Post model, PostView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Displays the visual layout for the selected social media platform.
     *
     * @param platform the social media platform to display (e.g., Instagram, TikTok)
     */
    public void choosePlatform(String platform) {
        view.displayPost(platform);
    }

    /**
     * Creates a post by updating the model with user input and sending
     * the formatted data to the view for display.
     *
     * @param user the username of the post creator
     * @param enemyUser the target username being referenced in the post
     * @param posts the content of the post
     * @param platform the social media platform used
     */
    public void createPost(String user, String enemyUser, String posts, String platform) {
        model.setUsername(user);
        String username = model.getUsername();

        model.setEnemyUsername(enemyUser);
        String enemyUsername = model.getEnemyUsername();

        model.setPost(posts);
        String post = model.getPost();

        model.setSocialMedia(platform);
        String socialMedia = model.getSocialMedia();

        // want to add that current time is taken by display post
        view.displayPost(username, enemyUsername, post, model.getPostDate(), socialMedia);
    }
}
