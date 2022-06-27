/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import todo.model.ListaTarefas;
import todo.model.Tarefa;

@WebServlet(name = "TodoList", urlPatterns = {"/"})
public class TodoList extends HttpServlet {

    private ListaTarefas lista = new ListaTarefas();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        String descricao = req.getParameter("descricao");

        Tarefa tarefa = new Tarefa();

        tarefa.setDescricao(descricao);
        tarefa.setImportante(false);

        if (action == null) {
            action = "read";
        }

        if (action.equals("create")) {
            lista.create(tarefa);
            resp.sendRedirect("/ToDo/");
        } else if (action.equals("read")) {
            List<Tarefa> toDo = lista.read();
            req.setAttribute("toDo", toDo);
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            rd.forward(req, resp);
        }

    }
}
