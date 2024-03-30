package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    // Atributos
    private String nombreCliente, apellidoCliente, runCliente, direccionCliente, metodoPagoCliente;

    // Constructor
    public Cliente(String nombreCliente, String apellidoCliente, String runCliente, String direccionCliente, String metodoPagoCliente) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.runCliente = runCliente;
        this.direccionCliente = direccionCliente;
        this.metodoPagoCliente = metodoPagoCliente;
    }

    // Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getRunCliente() {
        return runCliente;
    }
    public void setRunCliente(String runCliente) {
        this.runCliente = runCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getMetodoPagoCliente() {
        return metodoPagoCliente;
    }
    public void setMetodoPagoCliente(String metodoPagoCliente) {
        this.metodoPagoCliente = metodoPagoCliente;
    }

}
