package com.sofka.Software.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

//le saque el unique a el boolean y al name para que se pueda repetir ese tipo de columna
@Data
@Entity
@Table(name = "listaTarea")
public class ListTaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(nullable = false)
    private Boolean completed; /// le saque el unique para que no se pueda repetir la columna
    @Column(nullable = false)
    private String name;

    /**
     * relacion muchos a uno , implementa la relacion con la clase primaria lista
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "listTask_id", nullable = false)

    @JsonBackReference
    private ListModel listaid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListModel getListaid() {
        return listaid;
    }

    public void setListaid(ListModel listaid) {
        this.listaid = listaid;
    }
}
