package modelo;

public class Bicicleta extends Vehiculo{
    private String materialConstruccion;
    private double fuerzaPedaleo;
    private int numeroVelocidades;

    public Bicicleta(String marca, String modelo, int anioFabricacion, double pesoVehiculo, double precioVehiculo, int stockVehiculo, double potenciaVehiculo, String codigoVehiculo, String materialConstruccion, double fuerzaPedaleo, int numeroVelocidades) {
        super(marca, modelo, anioFabricacion, pesoVehiculo, precioVehiculo, stockVehiculo, potenciaVehiculo, codigoVehiculo);
        this.materialConstruccion = materialConstruccion;
        this.fuerzaPedaleo = fuerzaPedaleo;
        this.numeroVelocidades = numeroVelocidades;
    }

    public String getMaterialConstruccion() {
        return materialConstruccion;
    }
    public void setMaterialConstruccion(String materialConstruccion) {
        this.materialConstruccion = materialConstruccion;
    }

    public double getFuerzaPedaleo() {
        return fuerzaPedaleo;
    }
    public void setFuerzaPedaleo(int fuerzaPedaleo) {
        this.fuerzaPedaleo = fuerzaPedaleo;
    }

    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }
    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }

    public double calcularVelocidadMaxima(){
           return ((fuerzaPedaleo / getPesoVehiculo()) * 100) + 10;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "materialConstruccion=" + materialConstruccion + ", fuerzaPedaleo=" + fuerzaPedaleo + ", numeroVelocidades=" + numeroVelocidades + '}';
    }

}
