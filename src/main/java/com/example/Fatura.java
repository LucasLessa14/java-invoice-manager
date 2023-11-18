package com.example;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private Compra compra;
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
        this.compra = compra;
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Estado da Fatura: ").append(estado).append("\n");
        stringBuilder.append("Status da Fatura: ").append(status).append("\n");
        stringBuilder.append("Mês de Referência: ").append(mesReferencia).append("\n");
        stringBuilder.append("Ano de Referência: ").append(anoReferencia).append("\n");
        stringBuilder.append("Valor Total da Fatura: ").append(valorTotal).append("\n");

        stringBuilder.append("\nCompras na Fatura:\n");
        for (Compra compra : listaCompras) {
            stringBuilder.append("Titulo: ").append(compra.getTitulo()).append("\n");
            stringBuilder.append("Descricao: ").append(compra.getDescricao()).append("\n");
            stringBuilder.append("Valor: ").append(compra.getValor()).append("\n");
            stringBuilder.append("Data: ").append(compra.getData()).append("\n");
            stringBuilder.append("---------------------\n");
        }

        return stringBuilder.toString();
    }

    // Método emitirBoleto: que printa uma lista com as compras
    public void emitirBoleto() {
        // Chamando o método toString() da classe Compra
        String detalhesCompra = compra.toString();
        
        // Agora você pode usar detalhesCompra como necessário
        System.out.println("Boleto emitido com base na compra: " + detalhesCompra);
    }

    // Método calculaTotal: varre as compras e soma os valores
}
