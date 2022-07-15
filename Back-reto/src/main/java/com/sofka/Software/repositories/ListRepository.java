package com.sofka.Software.repositories;

import com.sofka.Software.models.ListModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.swing.*;

/**
 *
 * Implementa JpaRepository en lugar de CrudRepository !!Important¡¡¡¡
 * */
public interface ListRepository extends JpaRepository<ListModel, Long> {
}
 // se implementa jpa repository desp de extends xq es mejor para la paginacion