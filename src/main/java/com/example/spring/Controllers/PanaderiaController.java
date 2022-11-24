package com.example.spring.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.Models.Panes;
import com.example.spring.Services.PanaderiaDb;

@CrossOrigin
@RestController
public class PanaderiaController {

    @CrossOrigin
    @GetMapping("/panaderia/all")
    public List<Panes> ObtenerTodosPanes(){
        return new PanaderiaDb().ObtenerPanes();
    }
    
}
