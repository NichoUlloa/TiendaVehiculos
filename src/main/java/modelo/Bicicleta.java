package modelo;

public class Bicicleta extends Vehiculo{
    // Atributos
    private String materialConstruccion;
    private int numeroVelocidades;
    private double fuerzaPedaleo;

    // Constructor
    public Bicicleta(String marca, String modelo, String codigoVehiculo, int anioFabricacion, int stockVehiculo, double pesoVehiculo, double precioVehiculo, String materialConstruccion, int numeroVelocidades, double fuerzaPedaleo) {
        super(marca, modelo, codigoVehiculo, anioFabricacion, stockVehiculo, pesoVehiculo, precioVehiculo);
        this.materialConstruccion = materialConstruccion;
        this.numeroVelocidades = numeroVelocidades;
        this.fuerzaPedaleo = fuerzaPedaleo;
    }

    // Getters y Setters
    public String getMaterialConstruccion() {
        return materialConstruccion;
    }
    public void setMaterialConstruccion(String materialConstruccion) {
        this.materialConstruccion = materialConstruccion;
    }

    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }
    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }

    public double getFuerzaPedaleo() {
        return fuerzaPedaleo;
    }
    public void setFuerzaPedaleo(double fuerzaPedaleo) {
        this.fuerzaPedaleo = fuerzaPedaleo;
    }

    // Métodos
    // Método calcularVelocidadMaxima
    public double calcularVelocidadMaxima(){
        return ((fuerzaPedaleo / getPesoVehiculo()) * 100) + 10;
    }

    // Método getTipoVehiculo
    public String getTipoVehiculo(){
        return "Bicicleta";
    }


    // Método toString
    @Override
    public String toString() {
        return super.toString() + "Material de construcción: " + materialConstruccion + "\n" +
                "Número de velocidades: " + numeroVelocidades + "\n" +
                "Fuerza de pedaleo: " + fuerzaPedaleo + " N\n" +
                "Velocidad máxima: " + calcularVelocidadMaxima() + " km/h\n";
    }
}
