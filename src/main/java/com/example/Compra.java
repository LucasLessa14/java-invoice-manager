package com.example;

import java.util.Date;

public class Compra {
    private String titulo;
    private String descricao;
    private double valor;
    private Date data;

    // Construtor
    public Compra(String titulo, String descricao, double valor, Date data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    // Métodos getters e setters para os atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Titulo: ").append(titulo).append("\n");
        stringBuilder.append("Descricao: ").append(descricao).append("\n");
        stringBuilder.append("Valor: ").append(valor).append("\n");
        stringBuilder.append("Data: ").append(dateFormat.format(data)).append("\n");

        return stringBuilder.toString();
    }
}
