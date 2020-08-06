/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author TuNombre
 */
public class libro {
   private int idlibro;
    private String titulo;
    private String editorial;
    private float precio;
    private int cantidad;
    private String estado;
    private int  idautor;
    
    public  libro(){
    
    }

    public libro(int idlibro, String titulo, String editorial, float precio, int cantidad, String estado, int idautor) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
        this.idautor = idautor;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }
    
}
