package modelo;

public class Automovil extends Vehiculo{
    private int cantidadPuertas;
    private double tamanoMotor;
    private double potencia;

    public Automovil(String marca, String modelo, int anioFabricacion, double pesoVehiculo, double precioVehiculo, int stockVehiculo, double potenciaVehiculo, String codigoVehiculo, int cantidadPuertas, double tamanoMotor, double potencia) {
        super(marca, modelo, anioFabricacion, pesoVehiculo, precioVehiculo, stockVehiculo, potenciaVehiculo, codigoVehiculo);
        this.cantidadPuertas = cantidadPuertas;
        this.tamanoMotor = tamanoMotor;
        this.potencia = potencia;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    public double getTamanoMotor() {
        return tamanoMotor;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    public void setTamanoMotor(double tamanoMotor) {
        this.tamanoMotor = tamanoMotor;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double calcularVelocidadMaxima(){
        return (potencia / getPesoVehiculo()) * 10;
    }

    @Override
    public String toString() {
        return "Automovil{" + "cantidadPuertas=" + cantidadPuertas + ", tamanoMotor=" + tamanoMotor + ", potencia=" + potencia + '}';
    }

}
