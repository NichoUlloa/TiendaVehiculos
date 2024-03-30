package modelo;

public abstract class Vehiculo {
    // Atributos
    private String marca, modelo, codigoVehiculo;
    private int anioFabricacion, stockVehiculo;
    private double pesoVehiculo, precioVehiculo;

    // Constructor
    public Vehiculo(String marca, String modelo, String codigoVehiculo, int anioFabricacion, int stockVehiculo, double pesoVehiculo, double precioVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigoVehiculo = codigoVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.stockVehiculo = stockVehiculo;
        this.pesoVehiculo = pesoVehiculo;
        this.precioVehiculo = precioVehiculo;
    }

    // Getters y Setters
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

    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }
    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getStockVehiculo() {
        return stockVehiculo;
    }
    public void setStockVehiculo(int stockVehiculo) {
        this.stockVehiculo = stockVehiculo;
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

    // Métodos
    // Metodo calcularVelocidadMaxima
    public abstract double calcularVelocidadMaxima();

    // Método getTipoVehiculo
    public abstract String getTipoVehiculo();


    // Método toString
    @Override
    public String toString() {
        return "Vehiculo: " + getTipoVehiculo() + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Código: " + codigoVehiculo + "\n" +
                "Año de fabricación: " + anioFabricacion + "\n" +
                "Stock: " + stockVehiculo + "\n" +
                "Peso: " + pesoVehiculo + " kg\n" +
                "Precio: " + precioVehiculo + " $\n";
    }
}
