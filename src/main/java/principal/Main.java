package principal;

import modelo.*;

public class Main {
    public static void main(String[] args) {

        Vehiculo[] catalogo = new Vehiculo[3];
        catalogo[0] = new Automovil("Toyota", "Corolla", 2022, 1500, 25000, 10, 150, "TOY123", 4, 2.0, 150);
        catalogo[1] = new Motocicleta("Honda", "CBR", 2021, 200, 12000, 5, 80, "HON456", "Deportiva", 0, 80);
        catalogo[2] = new Bicicleta("Trek", "X-Caliber", 2020, 15, 1000, 15, 0, "TRE789", "Aluminio", 200, 21);

        Cliente[] clientes = new Cliente[2];
        clientes[0] = new Cliente("Juan", "Pérez", "12345678-9", "Calle 123", "Tarjeta de crédito");
        clientes[1] = new Cliente("María", "González", "98765432-1", "Avenida 456", "Transferencia bancaria");

        TiendaVehiculos tienda = new TiendaVehiculos("Mi Tienda de Vehículos", "Calle Principal", catalogo, clientes);

        tienda.registrarCliente("Juan", "Pérez", "12345678-9", "Calle 123", "Tarjeta de crédito");

        tienda.agregarVehiculo(new Bicicleta("Trek", "X-Caliber", 2020, 15, 1000, 15, 0, "TRE789", "Aluminio", 200, 21));

        tienda.agregarVehiculo(new Automovil("Toyota", "Yaris", 2022, 1200, 20000, 5, 120, "TOY124", 4, 1.8, 120));

        tienda.mostrarDetalleVehiculo("TOY123");

        Cliente clienteEjemplo = clientes[0]; // Seleccionamos un cliente
        clienteEjemplo.agregarVehiculoCarrito(catalogo[0]); // Agregamos un automóvil al carrito del cliente
        clienteEjemplo.agregarVehiculoCarrito(catalogo[1]); // Agregamos una motocicleta al carrito del cliente

        String codigoVehiculoVenta = "TRE789";
        String runClienteVenta = "12345678-9";
        String direccionEnvioVenta = "Calle 123";
        String metodoPagoVenta = "Tarjeta de crédito";

        tienda.realizarVenta(codigoVehiculoVenta, runClienteVenta, direccionEnvioVenta, metodoPagoVenta);

    }

}

