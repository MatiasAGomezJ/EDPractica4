/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDPractica4;

/**
 *
 * @author Juan Llado
 */
public abstract class Persona {
    
    private Perro perro;
    private Gato gato;
    private String nombre;
    private String DNI;
    private int edad;

    public Persona(String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + '}';
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @author MatiasAGomezJ
     * @param raza
     * @param nombre
     * @param edad
     */
    public void conseguirPerro(String raza, String nombre, int edad) {
        perro = new Perro(raza, nombre, edad);
    }

    /**
     * @author MatiasAGomezJ
     * @return Información del perro
     */
    public String getPerro() {
        return perro.toString();
    }
}
