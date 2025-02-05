package com.sofka.Software.controller;

import com.sofka.Software.models.ListTaskModel;
import com.sofka.Software.services.ListTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"} )
@RestController
public class ListTaskController {
    @Autowired
    private ListTaskService listTaskService;

    @GetMapping(path = "/listTasks")
    public Iterable<ListTaskModel> list(){
        return listTaskService.list();
    }

    @PostMapping(path = "/listTask")
    public ListTaskModel createListTask(@RequestBody ListTaskModel listTask){
        return listTaskService.createListTask(listTask);
    }

    @PutMapping(path = "/listTask/{id}")
    public ListTaskModel updatelistTask(@RequestBody ListTaskModel listTask, @PathVariable(value="id") Long id ) {
       return listTaskService.updateListTask(id, listTask);//retornamos
    }

    /**
     *
     * Revisa si esto que propongo está bien o no, si no está bien ¿Como lo solucionas?
     */

     @DeleteMapping(path = "/listTask/{id}")
     public void deletelistTask(@PathVariable(value = "id")Long id){
         listTaskService.deleteListTask(id); //value en el path
    }
}
