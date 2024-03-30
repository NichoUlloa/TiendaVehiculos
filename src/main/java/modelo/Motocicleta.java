package modelo;

public class Motocicleta extends Vehiculo{
    // Atributos
    private String suspension;
    private int cantidadPuertas;
    private double potenciaMotor;

    // Constructor
    public Motocicleta(String marca, String modelo, String codigoVehiculo, int anioFabricacion, int stockVehiculo, double pesoVehiculo, double precioVehiculo, String suspension, int cantidadPuertas, double potenciaMotor) {
        super(marca, modelo, codigoVehiculo, anioFabricacion, stockVehiculo, pesoVehiculo, precioVehiculo);
        this.suspension = suspension;
        this.cantidadPuertas = cantidadPuertas;
        this.potenciaMotor = potenciaMotor;
    }

    // Getters y Setters
    public String getSuspension() {
        return suspension;
    }
    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }
    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    // Métodos
    // Método calcularVelocidadMaxima
    public double calcularVelocidadMaxima(){
        return (potenciaMotor * 2 / getPesoVehiculo()) * 20;
    }

    // Método getTipoVehiculo
    public String getTipoVehiculo(){
        return "Motocicleta";
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "Suspensión: " + suspension + "\n" +
                "Cantidad de puertas: " + cantidadPuertas + "\n" +
                "Potencia del motor: " + potenciaMotor + " HP\n" +
                "Velocidad máxima: " + calcularVelocidadMaxima() + " km/h\n";
    }
}
