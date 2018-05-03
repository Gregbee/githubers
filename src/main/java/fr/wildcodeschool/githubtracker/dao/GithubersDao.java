package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Scope;
import java.util.ArrayList;
import java.util.List;


public class GithubersDao implements IGithubersDao  {


    @Override
    public List<Githuber> getGithubers() {

        List<Githuber> githubers = new ArrayList<Githuber>();

        githubers.add(new Githuber(
                "Alex", "a@h.fr",
                "https://www.fillmurray.com/g/200/300", 1, "xela")
        );
        githubers.add(new Githuber(
                "Barabara", "a@h.fr",
                "https://www.fillmurray.com/g/200/300", 2, "arabar")
        );
        githubers.add(new Githuber(
                "Criss", "a@h.fr",
                "https://www.fillmurray.com/g/200/300", 3, "ssirc")
        );
        githubers.add(new Githuber(
                "David", "a@h.fr",
                "https://www.fillmurray.com/g/200/300", 4, "divad")
        );
        githubers.add(new Githuber(
                "Elodie", "a@h.fr",
                "https://www.fillmurray.com/g/200/300", 5, "eidole")
        );
        return githubers;
    }

    @Override
    public void saveGithuber(Githuber githuber) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

}
