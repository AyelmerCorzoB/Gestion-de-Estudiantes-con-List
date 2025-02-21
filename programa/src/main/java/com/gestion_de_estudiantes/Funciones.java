package com.gestion_de_estudiantes;

import java.util.LinkedList;

public class Funciones {
    public static boolean buscarEstudiantes(LinkedList<Estudiante> lista, String nombre) {
        return lista.stream().anyMatch(e -> e.getName().equalsIgnoreCase(nombre));
    }

    public static void mostrarListaEstudiantes(LinkedList<Estudiante> lista) {
        for (Estudiante e : lista) {
            System.out.println(e.getName());
        }
    }
}
