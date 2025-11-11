package com.mycompany.praticasoo;

/**
 * Classe que representa um Item de Pedido.
 * 
 * GRASP - High Cohesion: Esta classe possui alta coesão pois agrupa
 * apenas informações relacionadas a um item específico de um pedido
 * (produto e quantidade). Responsabilidades bem definidas e relacionadas.
 */
public class OrderItem {
    private Product product;
    private int quantity;
    
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
    
    @Override
    public String toString() {
        return String.format("OrderItem[product=%s, quantity=%d, subtotal=%.2f]", 
                           product.getName(), quantity, getSubtotal());
    }
}
