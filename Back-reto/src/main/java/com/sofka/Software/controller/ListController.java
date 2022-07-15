package com.sofka.Software.controller;

import com.sofka.Software.models.ListModel;
import com.sofka.Software.services.ListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
@RestController
public class ListController {
    @Autowired
    private ListService listService;

    //get
    @GetMapping(value = "/listas")
    public Iterable<ListModel> list() {
        return listService.list();
    }

    //post
    @PostMapping(value = "/task")
    public ListModel createList(@RequestBody ListModel lista) {
        return listService.createList(lista);
    }

    //delete
    @DeleteMapping(value = "/task/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        listService.deleteTask(id);
    }
}
// esta funcion esta bien