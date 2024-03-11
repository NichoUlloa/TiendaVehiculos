package modelo;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String  apellido;
    private String run;
    private String direccion;
    private String metodoPago;
    private ArrayList<Vehiculo> carritoCompras;

    public Cliente(String nombre, String apellido, String run, String direccion, String metodoPago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.direccion = direccion;
        this.metodoPago = metodoPago;
        this.carritoCompras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRun() {
        return run;
    }
    public void setRun(String run) {
        this.run = run;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public ArrayList<Vehiculo> getCarritoCompras() {
        return carritoCompras;
    }
    public void setCarritoCompras(ArrayList<Vehiculo> carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    public ArrayList<Vehiculo> buscarVehiculo(String marca, String modelo, String tipo){
        ArrayList<Vehiculo> vehiculosEncontrados = new ArrayList<>();
        for (Vehiculo vehiculo : carritoCompras) {
            if (vehiculo.getMarca().equals(marca) || vehiculo.getModelo().equals(modelo) || vehiculo.getClass().getSimpleName().equals(tipo)) {
                vehiculosEncontrados.add(vehiculo);
            }
        }
        return vehiculosEncontrados;
    }

    public double agregarVehiculoCarrito(Vehiculo vehiculo){
        if (verificarStock(vehiculo)) {
            carritoCompras.add(vehiculo);
            return calcularSubtotal();
        }
        return 0;
    }

    public boolean verificarStock(Vehiculo vehiculo){
        for (Vehiculo vehiculoCatalogo : carritoCompras) {
            if (vehiculoCatalogo.getCodigoVehiculo().equals(vehiculo.getCodigoVehiculo())) {
                if (vehiculoCatalogo.getStockVehiculo() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public double calcularSubtotal(){
        double subtotal = 0;
        for (Vehiculo vehiculo : carritoCompras) {
            subtotal += vehiculo.getPrecioVehiculo();
        }
        return subtotal;
    }
}
