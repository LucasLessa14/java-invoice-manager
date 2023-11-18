package com.example;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private String estado;
    private String status;
    private int mesReferencia;
    private int anoReferencia;
    private List<Compra> listaCompras;
    private double valorTotal;

    // Construtor
    public Fatura(String estado, String status, int mesReferencia, int anoReferencia) {
        this.estado = estado;
        this.status = status;
        this.mesReferencia = mesReferencia;
        this.anoReferencia = anoReferencia;
        this.listaCompras = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    // Métodos getters e setters para os atributos
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(int mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public int getAnoReferencia() {
        return anoReferencia;
    }

    public void setAnoReferencia(int anoReferencia) {
        this.anoReferencia = anoReferencia;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Métodos
    public void adicionarCompra(Compra compra) {
        listaCompras.add(compra);
        valorTotal += compra.getValor(); // Atualiza o valor total da fatura
    }

    // Método emitirBoleto: que printa uma lista com as compras

    // Método calculaTotal: varre as compras e soma os valores
}
