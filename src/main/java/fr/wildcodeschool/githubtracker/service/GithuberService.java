package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.InMemory;
import fr.wildcodeschool.githubtracker.dao.GithubUtils;
import fr.wildcodeschool.githubtracker.dao.IGithubersDao;
import fr.wildcodeschool.githubtracker.dao.MemoryGithubDao;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class GithuberService {

    private static final String[] initlLogins = {"christellshali", "stepdar", "arnogc33", "mbentejac", "jbourbo", "lucilediague"};

    private IGithubersDao dao;
    @Inject
    private GithubUtils gu;

    @Inject
   public GithuberService(@InMemory() IGithubersDao dao) {
        this.dao = dao;
    }

    public List<Githuber> getAllGithubers(){
         return this.dao.getGithubers();
    }

    public Githuber getGithuber(String login){
        List<Githuber> githubers = this.dao.getGithubers();
        final String finalLogin = login.toLowerCase();

        return githubers.parallelStream()
                .filter((githuber)-> githuber.getLogin().toLowerCase().equals(finalLogin))
                .findAny()
                .orElse(null);
    }

    public void track(String login){
        Githuber githuber = this.gu.parseGithuber(login.toLowerCase());
        if(githuber != null){
            this.dao.saveGithuber(githuber);
        }


    }
    @PostConstruct
    private void init(){
        try{
            for(String login: GithuberService.initlLogins){
                track(login);
            }
        }catch(Exception e){
            e.printStackTrace();
        }



    }
}
