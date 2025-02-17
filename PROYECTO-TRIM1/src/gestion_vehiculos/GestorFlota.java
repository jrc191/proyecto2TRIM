package gestion_vehiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorFlota {

    final static Scanner sc=new Scanner(System.in);

    public void mostrar_flota(List <Vehiculo> listaVehiculos){
        System.out.println("\n---------------------------");
        System.out.println("Mostrar Flota");
        System.out.println("---------------------------");

        if (listaVehiculos.isEmpty()){
            System.out.println("No hay vehiculos en la Flota");
            System.out.println("---------------------------\n");
        }
        else {
            System.out.println("Vehiculos en la Flota");
            for (Vehiculo v: listaVehiculos){
                System.out.println(v.mostrar_info());
            }
            System.out.println("---------------------------");
            System.out.println("Fin de Mostrar Flota");
            System.out.println("---------------------------\n");
        }


    }

    public void add_flota(List <Vehiculo> listaVehiculos){

        int opcion=0;
        sc.nextLine();

        while (opcion!=3){
            menu_add();
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    listaVehiculos.add(new Moto());
                    break;
                case 2:
                    listaVehiculos.add(new Coche());
                    break;
                case 3:
                    System.out.println("Fin de Guardar Flota");
                    break;
                default:
                    System.out.println("No existe la opcion especificada");
                    break;

            }
            sc.nextLine();
        }

        GestorFichero gestor=new GestorFichero();
        gestor.guardarEnFichero(listaVehiculos);
        System.out.println("---------------------------");
        System.out.println("Fin de Guardar Flota");
        System.out.println("---------------------------");
    }

    /*public void eliminar_flota(List <Vehiculo> listaVehiculos, GestorFichero gestorFichero){
        System.out.println("Eliminando de la Flota");
        System.out.println("---------------------------");
        System.out.println("¿Qué desea eliminar?");
        System.out.println("1. MOTO");
        System.out.println("2. COCHE");
        System.out.println("3. SALIR");
        System.out.println("---------------------------");
        int opcion=sc.nextInt();
        switch (opcion){
            case 1:

                break;
            case 2:
                listaVehiculos.remove(1);
                break;
            case 3:
        }
    }
    */


    private static void menu_add() {
        System.out.println("\n---------------------------");
        System.out.println("Añadiendo a la Flota");
        System.out.println("---------------------------\n");
        System.out.println("¿Qué desea Añadir?");
        System.out.println("1. MOTO");
        System.out.println("2. COCHE");
        System.out.println("3. SALIR");
        System.out.println("---------------------------");
    }

    public static void menu(){
        System.out.println("1. Mostrar Flota");
        System.out.println("2. Guardar Flota");
        System.out.println("4. Salir");
    }

    public static void main(String[] args) {
        List <Vehiculo> listaVehiculos= new ArrayList<>();

        GestorFlota gestor=new GestorFlota();
        GestorFichero gestorFichero=new GestorFichero();
        
        
        
        int opcion=0;

        while (opcion!=4){
        	
        	System.out.println("GESTIÓN DE LA FLOTA");
        	System.out.println("---------------------------");
        	
            menu();
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    gestor.mostrar_flota(listaVehiculos);
                    break;
                case 2:
                    gestor.add_flota(listaVehiculos);
                    //gestorFichero.guardarEnFichero(listaVehiculos);
                    break;
                case 3:
                    //gestor.eliminar_flota(listaVehiculos, gestorFichero);
                    //gestorFichero.guardarEnFichero(listaVehiculos);
                    break;
                case 4:
                    System.out.println("Fin de la aplicacion");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }

            sc.nextLine();

        }




    }

}
