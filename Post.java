public class Post {
    private String username = "";
    private int post_date = 0;
    private String post = "";
    private String social_media = "";  

    public Post(tring username, Int post_date){
        this.username = username;
        this.post_date = post_date;
        this.post = post;
        this.social_media = social_media;
    }

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