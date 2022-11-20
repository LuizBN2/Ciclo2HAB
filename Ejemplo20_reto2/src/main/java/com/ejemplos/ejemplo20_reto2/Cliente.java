
package com.ejemplos.ejemplo20_reto2;

public class Cliente {
    //atributos
    private String nombreCompleto;
    private String documentoIdentidad;
    private int totalAPagar;
    private String fechaCompra;
    private String numeroFactura;
    //nuevo atributo
    private String generoCliente;
    
    //constructor

    public Cliente(String nombreCompleto, String documentoIdentidad, int totalAPagar, String fechaCompra, String numeroFactura, String generoCliente) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.totalAPagar = totalAPagar;
        this.fechaCompra = fechaCompra;
        this.numeroFactura = numeroFactura;
        this.generoCliente = generoCliente;
    }
    
    //getters

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }
    
    //setters

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }
      
    
}
