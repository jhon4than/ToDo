package todo.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created on : 25 de jun de 2022, 17:01:43
   Author     : jhon4
 */
public class ListaTarefas {
    
    private List<Tarefa> listTarefas = new ArrayList<>();
    
    public ListaTarefas() {
    }
    
    public void create(Tarefa tarefa){
        listTarefas.add(tarefa);
    }
    
    public List<Tarefa> read(){
        return listTarefas;
    }
    
}
