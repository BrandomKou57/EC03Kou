package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;


import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;

    @OneToMany(targetEntity=Instrumentos.class, mappedBy="categoria")
    @OrderBy("nombre ASC")
    private Set<Instrumentos> instrumentos = new HashSet<Instrumentos>();
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Instrumentos> getInstrumentos() {
        return instrumentos;
    }

    public void setCursos(Set<Instrumentos> instrumentos) {
        this.instrumentos = instrumentos;
    }

    @Override
    public String toString() {
        return "Categoria [id=" + id + ", nombre=" + nombre + "]";
    }
    
}