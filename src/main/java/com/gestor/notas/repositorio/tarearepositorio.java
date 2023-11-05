package com.gestor.notas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gestor.notas.modelo.tarea;

@Repository
public interface tarearepositorio extends JpaRepository <tarea, Integer> {
}
