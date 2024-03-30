package principal;
import modelo.*;

public class Main {
    public static void main(String[] args) {
        inicilizar();

    }

    public static void inicilizar() {
        // Crear una tienda de vehículos
        TiendaVehiculos tienda = new TiendaVehiculos("Vehículos S.A.", "Av. Siempre Viva 123");
        System.out.println(tienda.getNombreTienda());
        System.out.println(tienda.getDireccionTienda());

        // Crear una motocicleta
        Motocicleta moto1 = new Motocicleta("Yamaha", "R15", "YAMR15", 2021, 10, 150, 5000000, "Monoshock", 0, 15);
        tienda.agregarVehiculo(moto1);
        Motocicleta moto2 = new Motocicleta("Honda", "CBR 250", "HONCBR250", 2021, 5, 150, 7000000, "Telescópica", 0, 25);
        tienda.agregarVehiculo(moto2);
        Motocicleta moto3 = new Motocicleta("Kawasaki", "Ninja 400", "KAWNIN400", 2021, 3, 150, 10000000, "Monoshock", 0, 45);
        tienda.agregarVehiculo(moto3);

        // Crear un automóvil
        Automovil auto1 = new Automovil("Toyota", "Corolla", "TOYCOR", 2021, 5, 1200, 15000000, 4, 1.8, 140);
        tienda.agregarVehiculo(auto1);
        Automovil auto2 = new Automovil("Suzuki", "Swift", "SUZSWI", 2021, 3, 1000, 10000000, 5, 1.4, 100);
        tienda.agregarVehiculo(auto2);
        Automovil auto3 = new Automovil("Chevrolet", "Spark", "CHESPA", 2021, 2, 800, 8000000, 5, 1.0, 80);
        tienda.agregarVehiculo(auto3);

        // Crear una bicicleta
        Bicicleta bici1 = new Bicicleta("Trek", "Marlin 5", "TREKM5", 2021, 3, 12, 500000, "MTB", 29, 21);
        tienda.agregarVehiculo(bici1);
        Bicicleta bici2 = new Bicicleta("Specialized", "Rockhopper", "SPECRH", 2021, 2, 13, 700000, "MTB", 29, 24);
        tienda.agregarVehiculo(bici2);
        Bicicleta bici3 = new Bicicleta("Giant", "ATX", "GIAATX", 2021, 1, 14, 800000, "MTB", 29, 27);
        tienda.agregarVehiculo(bici3);

        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan", "Pérez", "12345678-9", "Calle Falsa 123", "Efectivo");
        tienda.registrarCliente(cliente1);
        Cliente cliente2 = new Cliente("María", "González", "98765432-1", "Av. Siempre Viva 123", "Tarjeta de crédito");
        tienda.registrarCliente(cliente2);
        Cliente cliente3 = new Cliente("Pedro", "Ramírez", "12312312-3", "Calle Falsa 123", "Efectivo");
        tienda.registrarCliente(cliente3);

        // Metodo mostrarCatalogoVehiculos
        System.out.println("Catálogo de vehículos:");
        System.out.println(tienda.mostrarCatalogoVehiculos());

        // Metodo buscarVehiculoModelo
        System.out.println("Buscar vehículo por modelo:");
        System.out.println(tienda.buscarVehiculoModelo("R15"));

        // Metodo buscarVehiculoTipo
        System.out.println("Buscar vehículo por tipo:");
        System.out.println(tienda.buscarVehiculoTipo("Motocicleta"));

        // Metodo buscarVehiculoMarca
        System.out.println("Buscar vehículo por marca:");
        System.out.println(tienda.buscarVehiculoMarca("Toyota"));

        // Metodo agregarVehiculoAlCarrito
        System.out.println("Agregar vehículos al carrito de compras:");
        tienda.agregarVehiculoAlCarrito(cliente1, moto1);
        tienda.agregarVehiculoAlCarrito(cliente1, auto1);

        // Metodo mostrarCarritoCompras
        System.out.println("\nCarrito de compras de Juan Pérez:");
        tienda.mostrarCarritoCompras(cliente1);

        // Metodo eliminarVehiculoDelCarrito
        System.out.println("Eliminar vehículo del carrito de compras:");
        tienda.eliminarVehiculoDelCarrito(cliente1, moto1);
        tienda.mostrarCarritoCompras(cliente1);

        //metodo realizarCompra
        System.out.println("Realizar compra:");
        tienda.realizarCompra(cliente1, "Efectivo", "Calle Falsa 123");

        // Metodo mostrarCatalogoVehiculos después de la compra de un vehículo para verificar que se actualice el stock
        System.out.println("\nCatálogo de vehículos después de la compra:");
        System.out.println(tienda.mostrarCatalogoVehiculos());
    }
}
