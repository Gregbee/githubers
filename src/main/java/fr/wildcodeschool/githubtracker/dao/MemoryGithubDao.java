package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.InMemory;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@InMemory
public class MemoryGithubDao implements IGithubersDao {


    private HashMap<String, Githuber> githubers = new HashMap<>();



    public MemoryGithubDao(){

    }
    @Override
    public List<Githuber> getGithubers() {
        return githubers.values().stream().collect(Collectors.toList());
    }

    @Override
    public void saveGithuber(Githuber githuber) {
        this.githubers.put(githuber.getLogin(), githuber);
    }




}
