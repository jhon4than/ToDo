/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo.model;

/**
 *
 * @author jhon4
 */
public class Tarefa {
    
    private String descricao;
    private Boolean importante;

    public Tarefa() {
    }

    public Tarefa(String descricao, Boolean importante) {
        this.descricao = descricao;
        this.importante = importante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String tarefa) {
        this.descricao = tarefa;
    }

    public Boolean isImportante() {
        return importante;
    }

    public void setImportante(Boolean importante) {
        this.importante = importante;
    }
    
}