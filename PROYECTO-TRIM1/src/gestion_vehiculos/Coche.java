package gestion_vehiculos;

public class Coche extends Vehiculo{

    private int numero_puertas;

    public Coche() {
        super();
    }

    public Coche(String matricula, String marca, String modelo, double velocidad_maxima, int numero_puertas) {
        this.setMatricula(matricula);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVelocidad_maxima(velocidad_maxima);
        this.setNumero_puertas(numero_puertas);
    }
    
    @Override
    public String mostrar_info() {
        String info="";
        info+="---------------------------\n";
        info+="COCHE\n";
        info+="Matricula: "+this.getMatricula()+"\n";
        info+="Marca: "+this.getMarca()+"\n";
        info+="Modelo: "+this.getModelo()+"\n";
        info+="Velocidad Maxima: "+this.getVelocidad_maxima()+" km/h\n";
        info+="Numero de Puertas: "+this.numero_puertas+"\n";
        info+="---------------------------\n";
        return info;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }
}


