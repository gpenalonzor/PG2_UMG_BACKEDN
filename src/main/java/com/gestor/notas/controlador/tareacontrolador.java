package com.gestor.notas.controlador;

import com.gestor.notas.excepciones.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gestor.notas.repositorio.tarearepositorio;
import com.gestor.notas.modelo.tarea;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
//@CrossOrigin(origins = "http://localhost:4200/" )
public class tareacontrolador {

    @Autowired
    private tarearepositorio repositorio;

    //este metodo es el que nos obtiene y lista los datos de las tareas
    @GetMapping("/tareas")
    public List<tarea> listarTodosLasTareas() {
        return repositorio.findAll();
    }

    //este metodo es el que guarda una nueva tarea
    @PostMapping ("/tareas")
    public tarea GuardarTarea(@RequestBody tarea Tarea){
        return repositorio.save(Tarea);
    }

    @GetMapping("/tareas/{id}")
    public ResponseEntity<tarea> obtenertareaporid (@PathVariable int id){
        tarea Tarea = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No se encontro la tarea con id : "+ id));
                return ResponseEntity.ok(Tarea);
    }

    @PutMapping ("/tareas/{id}")
    public ResponseEntity<tarea> actualizartarea (@PathVariable int id , @RequestBody tarea detallestarea){
        tarea Tarea = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No se encontro la tarea con id : "+ id));

        Tarea.setIda(detallestarea.getIda());
        Tarea.setCatedratico(detallestarea.getCatedratico());
        Tarea.setGrado(detallestarea.getGrado());
        Tarea.setSeccion(detallestarea.getSeccion());
        Tarea.setDescripcion(detallestarea.getDescripcion());
        Tarea.setPuntuacion(detallestarea.getPuntuacion());
        Tarea.setFecha_entrega(detallestarea.getFecha_entrega());


        tarea tareaupdate = repositorio.save(Tarea);
        return ResponseEntity.ok(tareaupdate);

    }

}
