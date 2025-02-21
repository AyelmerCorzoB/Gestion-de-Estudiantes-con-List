package com.gestion_de_estudiantes;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            LinkedList<Estudiante> ListaEstudiantes = new LinkedList<>();
            int cantidadEstudiantes;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Ingresa la cantidad de estudiantes que deseas registrar (Max 30): ");
                cantidadEstudiantes = sc.nextInt();
            } while (cantidadEstudiantes >= 30);
            System.out.println("La cantidad de estudiantes es: " + cantidadEstudiantes);
    
            sc.nextLine();
    
            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
                String nombreEstudiante = sc.nextLine();
                ListaEstudiantes.add(new Estudiante(nombreEstudiante));
            }
    
            ListaEstudiantes.sort(Comparator.comparing(Estudiante::getName));
            System.out.println("Lista de estudiantes ordenados de (A-Z)");
            Funciones.mostrarListaEstudiantes(ListaEstudiantes);
    
            System.out.print("Ingresa el nombre del estudiante que deseas buscar: ");
            String nombreABuscar = sc.nextLine();
            boolean existe = Funciones.buscarEstudiantes(ListaEstudiantes, nombreABuscar);
            if (existe) {
                System.out.println("El estudiante " + nombreABuscar + " está en la lista.");
            } else {
                System.out.println("El estudiante " + nombreABuscar + " no está en la lista.");
            }
        }
    
        
}