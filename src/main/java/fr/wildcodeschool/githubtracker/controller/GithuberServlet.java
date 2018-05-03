package fr.wildcodeschool.githubtracker.controller;


import fr.wildcodeschool.githubtracker.model.Githuber;
import fr.wildcodeschool.githubtracker.service.GithuberService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/githubers"})
public class GithuberServlet extends HttpServlet {

    @Inject
    private GithuberService gts;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Githuber> githubers = gts.getAllGithubers();


        req.setAttribute("githubers", githubers);
        req.getRequestDispatcher("/githubers.jsp").forward(req,resp);
    }
}
