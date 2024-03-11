package modelo;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double pesoVehiculo;
    private double precioVehiculo;
    private int stockVehiculo;
    private String codigoVehiculo;

    public Vehiculo(String marca, String modelo, int anioFabricacion, double pesoVehiculo, double precioVehiculo, int stockVehiculo, double potenciaVehiculo, String codigoVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.pesoVehiculo = pesoVehiculo;
        this.precioVehiculo = precioVehiculo;
        this.stockVehiculo = stockVehiculo;
        this.codigoVehiculo = codigoVehiculo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPesoVehiculo() {
        return pesoVehiculo;
    }
    public void setPesoVehiculo(double pesoVehiculo) {
        this.pesoVehiculo = pesoVehiculo;
    }

    public double getPrecioVehiculo() {
        return precioVehiculo;
    }
    public void setPrecioVehiculo(double precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }

    public int getStockVehiculo() {
        return stockVehiculo;
    }
    public void setStockVehiculo(int stockVehiculo) {
        this.stockVehiculo = stockVehiculo;
    }

    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }
    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }


    public abstract double calcularVelocidadMaxima();

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + ", pesoVehiculo=" + pesoVehiculo + ", precioVehiculo=" + precioVehiculo + ", stockVehiculo=" + stockVehiculo + ", codigoVehiculo=" + codigoVehiculo + '}';
    }
}
