package modelo;

public class Automovil extends Vehiculo{
    // Atributos
    private int cantidadPuertas;
    private double tamanoMotor, potenciaMotor;

    // Constructor
    public Automovil(String marca, String modelo, String codigoVehiculo, int anioFabricacion, int stockVehiculo, double pesoVehiculo, double precioVehiculo, int cantidadPuertas, double tamanoMotor, double potenciaMotor) {
        super(marca, modelo, codigoVehiculo, anioFabricacion, stockVehiculo, pesoVehiculo, precioVehiculo);
        this.cantidadPuertas = cantidadPuertas;
        this.tamanoMotor = tamanoMotor;
        this.potenciaMotor = potenciaMotor;
    }

    // Getters y Setters
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public double getTamanoMotor() {
        return tamanoMotor;
    }
    public void setTamanoMotor(double tamanoMotor) {
        this.tamanoMotor = tamanoMotor;
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
        return (potenciaMotor / getPesoVehiculo()) * 10;
    }

    // Método getTipoVehiculo
    public String getTipoVehiculo(){
        return "Automovil";
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "Cantidad de puertas: " + cantidadPuertas + "\n" +
                "Tamaño del motor: " + tamanoMotor + " L\n" +
                "Potencia del motor: " + potenciaMotor + " HP\n" +
                "Velocidad máxima: " + calcularVelocidadMaxima() + " km/h\n";
    }
}
