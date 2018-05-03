package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import java.net.MalformedURLException;
import java.util.List;

public interface IGithubersDao {

    List<Githuber> getGithubers();
    void saveGithuber(Githuber githuber);


}

