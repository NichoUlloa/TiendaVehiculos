package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TiendaVehiculos {
    // Atributos
    private String nombreTienda, direccionTienda;
    private List<Vehiculo> catalogoVehiculos;
    private List<Cliente> listaClientes;
    //carritoCompras
    private List<Vehiculo> carritoCompras = new ArrayList<>();

    // Constructor
    public TiendaVehiculos(String nombreTienda, String direccionTienda) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.catalogoVehiculos = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public List<Vehiculo> getCatalogoVehiculos() {
        return catalogoVehiculos;
    }

    public void setCatalogoVehiculos(List<Vehiculo> catalogoVehiculos) {
        this.catalogoVehiculos = catalogoVehiculos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Vehiculo> getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(List<Vehiculo> carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    // Métodos

    // Método registrarCliente
    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    // Método eliminarCliente
    public void eliminarCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    // Método buscarCliente en la lista de clientes, si no se encuentra retorna mensaje de no se encontró
    public Cliente buscarCliente(String runCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getRunCliente().equals(runCliente)) {
                return cliente;
            }
        }
        return null;
    }

    // Metodo agregarVehiculo
    public void agregarVehiculo(Vehiculo vehiculo) {
        catalogoVehiculos.add(vehiculo);
    }

    // Método eliminarVehiculo
    public void eliminarVehiculo(Vehiculo vehiculo) {
        catalogoVehiculos.remove(vehiculo);
    }


    // Método buscarVehiculoMarca
    public Vehiculo buscarVehiculoMarca(String marca) {
        for (Vehiculo vehiculo : catalogoVehiculos) {
            if (vehiculo.getMarca().equals(marca)) {
                return vehiculo;
            }
        }
        return null;
    }

    // Método buscarVehiculoModelo
    public Vehiculo buscarVehiculoModelo(String modelo) {
        for (Vehiculo vehiculo : catalogoVehiculos) {
            if (vehiculo.getModelo().equals(modelo)) {
                return vehiculo;
            }
        }
        return null;
    }

    // Método buscarVehiculoTipo
    public Vehiculo buscarVehiculoTipo(String tipo) {
        for (Vehiculo vehiculo : catalogoVehiculos) {
            if (vehiculo.getTipoVehiculo().equals(tipo)) {
                return vehiculo;
            }
        }
        return null;
    }


    // Metodo mostrarCatalogoVehiculos
    public String mostrarCatalogoVehiculos() {
        String catalogo = "";
        for (Vehiculo vehiculo : catalogoVehiculos) {
            catalogo += vehiculo.toString() + "\n";
        }
        return catalogo;
    }

    // Metodo agregarVehiculoAlCarrito
    public void agregarVehiculoAlCarrito(Cliente cliente, Vehiculo vehiculo) {
        carritoCompras.add(vehiculo);
    }

    // Metodo eliminarVehiculoDelCarrito
    public void eliminarVehiculoDelCarrito(Cliente cliente, Vehiculo vehiculo) {
        carritoCompras.remove(vehiculo);
    }

    // Método mostrarCarritoCompras
    public void mostrarCarritoCompras(Cliente cliente) {
        System.out.println("Carrito de Compras:");
        for (Vehiculo vehiculo : carritoCompras) {
            System.out.println(vehiculo.toString());
        }
    }

    // Método realizarCompra entregando el total de la compra, la dirección de envío y el método de pago por parametro igual se ingresa el tipo de vehiculo
    public void realizarCompra(Cliente cliente, String metodoPago, String direccionEnvio) {
        double totalCompra = 0;
        for (Vehiculo vehiculo : carritoCompras) {
            totalCompra += vehiculo.getPrecioVehiculo();
        }
        System.out.println("Total de la compra: " + totalCompra);
        System.out.println("Dirección de envío: " + direccionEnvio);
        System.out.println("Método de pago: " + metodoPago);
        // mostrar lo que se compró
        System.out.println("Vehículos comprados:");
        for (Vehiculo vehiculo : carritoCompras) {
            System.out.println(vehiculo.toString());
        }
        for (Vehiculo vehiculo : carritoCompras) {
            vehiculo.setStockVehiculo(vehiculo.getStockVehiculo() - 1);
        }
        carritoCompras.clear();
    }
}