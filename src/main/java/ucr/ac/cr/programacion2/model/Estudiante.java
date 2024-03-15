/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.programacion2.model;

/**
 *
 * @author Core i5
 */
public class Estudiante {
    private String id;
    private String name;

    public Estudiante(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Estudiante() {
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
