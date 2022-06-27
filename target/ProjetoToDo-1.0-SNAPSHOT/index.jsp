<%-- 
    Document   : index
    Created on : 25 de jun de 2022, 17:01:43
    Author     : jhon4
--%>

<%@page import="java.util.List"%>
<%@page import="todo.model.Tarefa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TO DO Dinamico</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>TO DO Dinamico</h1>

        <h2>Lista de tarefas web dinamica</h2>
        <h3>Insira suas tarefas na lista abaixo e controle o que precisa fazer</h3>
        
        <ul>
            <c:forEach var="tarefa" items="${toDo}">
                <li><c:out value="${tarefa.descricao}" /></li>
            </c:forEach>
        </ul>

        <hr/>

        <form action="/ToDo/">
            <input id="descricao" name="descricao" placeholder="Insira aqui sua tarefa"/>
            <input type = "checkbox" id ="importante" name ="importante" value ="importante"/>
            <label for = "importante"> Prioridade? </label>
            <input type="hidden" naem="action" value="create"/>
            <button type="submit"> Salvar </button>
        </form>
    </body>
</html>
