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
public class autor {
    private int idautor;
    private String nombre;
    private String apellido;
    private int f_nacimiento;
    private int nacionalidad;
    private String edad;
    
    public autor(){
    }

    public autor(int idautor, String nombre, String apellido, int f_nacimiento, int nacionalidad, String edad) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.f_nacimiento = f_nacimiento;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(int f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public int getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
}
