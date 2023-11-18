package com.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Fatura
        Fatura fatura = new Fatura("Aberta", "Pendente", 11, 2023);

        // Criando instâncias de Compra
        Compra compra1 = new Compra("Item 1", "Descrição do Item 1", 50.0, new Date());
        Compra compra2 = new Compra("Item 2", "Descrição do Item 2", 30.0, new Date());
        Compra compra3 = new Compra("Item 3", "Descrição do Item 3", 25.0, new Date());

        // Adicionando as compras à lista de compras da fatura
        fatura.adicionarCompra(compra1);
        fatura.adicionarCompra(compra2);
        fatura.adicionarCompra(compra3);
    }
}