package com.mycompany.praticasoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um Pedido no sistema.
 * 
 * GRASP - Creator Pattern:
 * Esta classe aplica o padrão Creator porque:
 * 1. Order contém/agrega OrderItems (através da lista items)
 * 2. Order usa diretamente OrderItems em seus métodos
 * 3. Order possui os dados necessários para criar OrderItems (produto e quantidade)
 * 
 * Portanto, Order é a classe mais apropriada para criar instâncias de OrderItem,
 * seguindo o princípio de que quem contém ou usa diretamente deve criar.
 * 
 * GRASP - High Cohesion:
 * Esta classe possui alta coesão pois todas as responsabilidades estão
 * relacionadas ao gerenciamento de um pedido: adicionar itens, calcular total,
 * e manter o estado do pedido.
 */
public class Order {
    private String orderId;
    private List<OrderItem> items;
    
    public Order(String orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }
    
    /**
     * Método que aplica o padrão Creator.
     * Order cria OrderItems porque:
     * - Order contém a lista de OrderItems
     * - Order usa OrderItems diretamente
     * - Order possui o contexto necessário (produto e quantidade)
     */
    public void addItem(Product product, int quantity) {
        // Creator Pattern aplicado aqui:
        // Order cria instâncias de OrderItem porque contém e usa diretamente esses objetos
        OrderItem item = new OrderItem(product, quantity);
        items.add(item);
        System.out.println("Item adicionado: " + item);
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public List<OrderItem> getItems() {
        return new ArrayList<>(items); // Retorna cópia para proteger encapsulamento
    }
    
    public double calculateTotal() {
        return items.stream()
                   .mapToDouble(OrderItem::getSubtotal)
                   .sum();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Order[id=%s]\n", orderId));
        sb.append("Items:\n");
        for (OrderItem item : items) {
            sb.append("  - ").append(item).append("\n");
        }
        sb.append(String.format("Total: %.2f", calculateTotal()));
        return sb.toString();
    }
}

