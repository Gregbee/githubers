package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/githubers"})
public class GithuberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Githuber> githubers = new ArrayList<Githuber>();

        githubers.add(new Githuber(
                "Alex", "a@h.fr",
                "https://www.fillmurray.com/g/200/300", 1, "axel")
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

        req.setAttribute("githubers", githubers);
        req.getRequestDispatcher("/githubers.jsp").forward(req,resp);
    }
}
