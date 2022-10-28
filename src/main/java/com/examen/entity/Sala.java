package com.examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*le digo a sprint que esto es entity y no una clase normal*/
@Table(name = "salas")
public class Sala implements Serializable {/*así se mapea la tabla que está en la DB
                                           "Serializable" --> convierte los bites en una forma legble*/

    @Id/*defino la PK*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*indca que es auto incremental*/
    private long id;/*LONG porque la PK en la tabla auto incrementada*/
    private int capacidad;
    private int numSala;
    private String pelicula;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    

}

