package fr.wildcodeschool.githubtracker.model;

public class Githuber {

    private String name;
    private String email;
    private String login;
    private String avatarUrl;
    private int id;

    public Githuber(String name, String email, String avatarUrl, int id, String login)
    {
        this.setName(name);
        this.setEmail(email);
        this.setAvatarUrl(avatarUrl);
        this.setId(id);
        this.setLogin(login);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
