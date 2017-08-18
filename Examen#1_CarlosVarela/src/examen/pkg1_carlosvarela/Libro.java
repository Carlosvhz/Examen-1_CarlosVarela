/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_carlosvarela;

import java.util.Date;

/**
 *
 * @author carlo
 */
public class Libro {
    
    private String titulo, Descripcion, genero, autor, edicion;
    private Date fecha_edicion;
    private int num_copias, puntaje;

    public Libro() {
    }

    
    public Libro(String titulo, String Descripcion, String genero, String autor, String edicion, Date fecha_edicion, int num_copias, int puntaje) {
        this.titulo = titulo;
        this.Descripcion = Descripcion;
        this.genero = genero;
        this.autor = autor;
        this.edicion = edicion;
        this.fecha_edicion = fecha_edicion;
        this.num_copias = num_copias;
        this.puntaje = puntaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Date getFecha_edicion() {
        return fecha_edicion;
    }

    public void setFecha_edicion(Date fecha_edicion) {
        this.fecha_edicion = fecha_edicion;
    }

    public int getNum_copias() {
        return num_copias;
    }

    public void setNum_copias(int num_copias) {
        this.num_copias = num_copias;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", Descripcion=" + Descripcion + ", genero=" + genero + ", autor=" + autor + ", edicion=" + edicion + ", fecha_edicion=" + fecha_edicion + ", num_copias=" + num_copias + ", puntaje=" + puntaje + '}';
    }
    
    
}
