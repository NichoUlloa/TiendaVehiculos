package modelo;

public class Motocicleta extends Vehiculo{

    //atributos
    private String suspension;
    private int cantidadPuertas;
    private double potencia;

    //constructor
    public Motocicleta(String marca, String modelo, int anioFabricacion, double pesoVehiculo, double precioVehiculo, int stockVehiculo, double potenciaVehiculo, String codigoVehiculo, String suspension, int cantidadPuertas, double potencia) {
        super(marca, modelo, anioFabricacion, pesoVehiculo, precioVehiculo, stockVehiculo, potenciaVehiculo, codigoVehiculo);
        this.suspension = suspension;
        this.cantidadPuertas = cantidadPuertas;
        this.potencia = potencia;
    }

    //getters y setters
    public String getSuspension() {
        return suspension;
    }
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double calcularVelocidadMaxima(){
        return (potencia * 2 / getPesoVehiculo()) * 20;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "suspension=" + suspension + ", cantidadPuertas=" + cantidadPuertas + ", potencia=" + potencia + '}';
    }
}
