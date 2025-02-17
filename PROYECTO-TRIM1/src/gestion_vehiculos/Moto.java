package gestion_vehiculos;

public class Moto extends Vehiculo{

    private int cilindrada;

    public Moto() {
        super();
    }

    public Moto(String matricula, String marca, String modelo, double velocidad_maxima, int cilindrada) {
        this.setMatricula(matricula);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVelocidad_maxima(velocidad_maxima);
        this.setCilindrada(cilindrada);
    }


    @Override
    public String mostrar_info() {
        String info="";
        info+="---------------------------\n";
        info+="MOTO\n";
        info+="Matricula: "+this.getMatricula()+"\n";
        info+="Marca: "+this.getMarca()+"\n";
        info+="Modelo: "+this.getModelo()+"\n";
        info+="Velocidad Maxima: "+this.getVelocidad_maxima()+" km/h\n";
        info+="Cilindrada: "+this.cilindrada+"\n";
        return info;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
