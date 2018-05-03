package fr.wildcodeschool.githubtracker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)


public class Githuber {

    private String name;
    private String email;
    private String login;
    private String avatar_url;
    private int id;

    @JsonCreator
    public Githuber(@JsonProperty("name") String name,
                    @JsonProperty("email") String email,
                    @JsonProperty("avatar_url") String avatar_url,
                    @JsonProperty("id") int id,
                    @JsonProperty("login") String login
    )
    {
        this.setName(name);
        this.setEmail(email);
        this.setAvatar_url(avatar_url);
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

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return new StringBuilder().append(this.name).append(" - ").append(this.login).append(" - ").append(this.email).toString();
    }
}
