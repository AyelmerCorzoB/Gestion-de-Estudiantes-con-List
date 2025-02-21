package com.gestion_de_estudiantes;
import java.io.Serializable;

public class Estudiante implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Estudiante() {}

    public Estudiante(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    

    @Override
    public String toString(){
        return "Estudiante[name="+name+"]";
    }

}
