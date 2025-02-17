package gestion_vehiculos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorFichero {

    File fichero=new File("vehículos.txt");

    public void guardarEnFichero(List <Vehiculo> listaVehiculos){
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero,true))){
            if (listaVehiculos.size()>0){
                for (Vehiculo v: listaVehiculos){
                    bw.write(v.mostrar_info());
                    bw.newLine();
                }
            }
        } catch (IOException IOEx){
            System.out.println("Error al escribir en el fichero" + IOEx.getMessage());
        }


    }

    public void eliminarEnFichero(Vehiculo vehiculo) {
        System.out.println("Eliminando del fichero");

        // Temporary list to store lines that should be kept
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // If the line does not contain the vehicle info, keep it
                if (!linea.contains(vehiculo.mostrar_info())) {
                    lineas.add(linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return;
        }

        // Overwrite the file with the updated list
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();  // Keep correct formatting
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }

        System.out.println("Vehículo eliminado del fichero.");
    }

    public void cargarDesdeFichero(){

        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))){
            String linea= br.readLine();
            while (linea !=null){
                System.out.println(linea);
                linea=br.readLine();
            }

        } catch (IOException IOEx){
            System.out.println("Error al leer el fichero" + IOEx.getMessage());
        }

    }


    public static void main(String[] args) {

        //List <Vehiculo> listaVehiculos= List.of(new Moto(),new Coche());

        //GestorFichero gestor=new GestorFichero();
        //gestor.cargarDesdeFichero();
        //gestor.guardarEnFichero(listaVehiculos);

    }

}
