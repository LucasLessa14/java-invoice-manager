package com.example;

import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Fatura
        Fatura fatura = new Fatura("Aberta", "Pendente", 11, 2023);

        // Criando instâncias de Compra
        Compra compra1 = new Compra("Item 1", "Descrição do Item 1", 50.0, new Date(), "Categoria A");
        Compra compra2 = new Compra("Item 2", "Descrição do Item 2", 30.0, new Date(), "Categoria B");
        Compra compra3 = new Compra("Item 3", "Descrição do Item 3", 25.0, new Date(), "Categoria A");
        Compra compra4 = new Compra("Item 4", "Descrição do Item 4", 40.0, new Date(), "Categoria B");
        Compra compra5 = new Compra("Item 5", "Descrição do Item 5", 35.0, new Date(), "Categoria A");

        
        // Adicionando as compras à lista de compras da fatura
        fatura.adicionarCompra(compra1);
        fatura.adicionarCompra(compra2);
        fatura.adicionarCompra(compra3);
        fatura.adicionarCompra(compra4);
        fatura.adicionarCompra(compra5);
        
     // Imprima o total por categoria
        Map<String, Double> totalPorCategoria = fatura.calcularTotalPorCategoria();
        System.out.println("Total por Categoria: " + totalPorCategoria);
    }
}