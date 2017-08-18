/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_carlosvarela;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author carlo
 */
public class Usuario {
    
    private String nombre, contraseña, correo, nombre_completo, genero_fav;
    private Date fecha;
    private int num_telefono;
    private ArrayList<Libro> Mislibros = new ArrayList();
    private ArrayList amigos = new ArrayList();

    public Usuario() {
    }

    
    public Usuario(String nombre, String contraseña, String correo, String nombre_completo, String genero_fav, Date fecha, int num_telefono) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
        this.nombre_completo = nombre_completo;
        this.genero_fav = genero_fav;
        this.fecha = fecha;
        this.num_telefono = num_telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getGenero_fav() {
        return genero_fav;
    }

    public void setGenero_fav(String genero_fav) {
        this.genero_fav = genero_fav;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(int num_telefono) {
        this.num_telefono = num_telefono;
    }

    public ArrayList<Libro> getMislibros() {
        return Mislibros;
    }

    public void setMislibros(ArrayList<Libro> Mislibros) {
        this.Mislibros = Mislibros;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }
    
    
}
