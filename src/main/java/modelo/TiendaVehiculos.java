package modelo;

public class TiendaVehiculos {
    String nombreTienda;
    String direccionTienda;
    Vehiculo[] catalogoVehiculos;
    Cliente[] listaClientes;

    public TiendaVehiculos(String nombreTienda, String direccionTienda, Vehiculo[] catalogoVehiculos, Cliente[] listaClientes) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.catalogoVehiculos = catalogoVehiculos;
        this.listaClientes = listaClientes;
    }

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

    public Vehiculo[] getCatalogoVehiculos() {
        return catalogoVehiculos;
    }
    public void setCatalogoVehiculos(Vehiculo[] catalogoVehiculos) {
        this.catalogoVehiculos = catalogoVehiculos;
    }

    public Cliente[] getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(Cliente[] listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        for (int i = 0; i < catalogoVehiculos.length; i++) {
            if (catalogoVehiculos[i] == null) {
                catalogoVehiculos[i] = vehiculo;
                break;
            }
        }
    }

    public void eliminarVehiculo(String codigoVehiculo){
        for (int i = 0; i < catalogoVehiculos.length; i++) {
            if (catalogoVehiculos[i] != null) {
                if (catalogoVehiculos[i].getCodigoVehiculo().equals(codigoVehiculo)) {
                    catalogoVehiculos[i] = null;
                    break;
                }
            }
        }
    }

    public void mostrarCatalogoVehiculos(){
        for (int i = 0; i < catalogoVehiculos.length; i++) {
            if (catalogoVehiculos[i] != null) {
                System.out.println(catalogoVehiculos[i].toString());
            }
        }
    }

    public void registrarCliente(String run, String nombre, String apellido, String direccion, String metodoPago){
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] == null) {
                listaClientes[i] = new Cliente(run, nombre, apellido, direccion, metodoPago);
                break;
            }
        }
    }

    public void realizarVenta(String codigoVehiculo, String run, String direccion, String metodoPago){
        Cliente cliente = null;
        Vehiculo vehiculo = null;
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null) {
                if (listaClientes[i].getRun().equals(run)) {
                    cliente = listaClientes[i];
                    break;
                }
            }
        }
        for (int i = 0; i < catalogoVehiculos.length; i++) {
            if (catalogoVehiculos[i] != null) {
                if (catalogoVehiculos[i].getCodigoVehiculo().equals(codigoVehiculo)) {
                    vehiculo = catalogoVehiculos[i];
                    break;
                }
            }
        }
        if (cliente != null && vehiculo != null) {
            if (cliente.verificarStock(vehiculo)) {
                cliente.agregarVehiculoCarrito(vehiculo);
                System.out.println("Venta realizada con éxito");
                System.out.println("Subtotal: " + cliente.calcularSubtotal());
            } else {
                System.out.println("Vehiculo no disponible");
            }
        } else {
            System.out.println("Cliente o vehiculo no encontrado");
        }
    }

    public void mostrarDetalleVehiculo(String codigoVehiculo){
        for (int i = 0; i < catalogoVehiculos.length; i++) {
            if (catalogoVehiculos[i] != null) {
                if (catalogoVehiculos[i].getCodigoVehiculo().equals(codigoVehiculo)) {
                    System.out.println(catalogoVehiculos[i].toString());
                    return;
                }
            }
        }
        System.out.println("Vehiculo no encontrado");
    }

    @Override
    public String toString() {
        return "TiendaVehiculos{" + "nombreTienda=" + nombreTienda + ", direccionTienda=" + direccionTienda + '}';
    }
}
