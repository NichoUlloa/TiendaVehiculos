package modelo;

public abstract class Vehiculo {
    //atributos
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double pesoVehiculo;
    private double precioVehiculo;
    private int stockVehiculo;
    private String codigoVehiculo;

    //constructor
    public Vehiculo(String marca, String modelo, int anioFabricacion, double pesoVehiculo, double precioVehiculo, int stockVehiculo, double potenciaVehiculo, String codigoVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.pesoVehiculo = pesoVehiculo;
        this.precioVehiculo = precioVehiculo;
        this.stockVehiculo = stockVehiculo;
        this.codigoVehiculo = codigoVehiculo;
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public double getPesoVehiculo() {
        return pesoVehiculo;
    }
    public double getPrecioVehiculo() {
        return precioVehiculo;
    }
    public int getStockVehiculo() {
        return stockVehiculo;
    }
    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public void setPesoVehiculo(double pesoVehiculo) {
        this.pesoVehiculo = pesoVehiculo;
    }
    public void setPrecioVehiculo(double precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }
    public void setStockVehiculo(int stockVehiculo) {
        this.stockVehiculo = stockVehiculo;
    }
    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    //metodos

    public abstract calcularVelocidadMaxima();

    public abstract  String toString();

}
