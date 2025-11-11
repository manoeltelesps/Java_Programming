package com.mycompany.praticasoo;

/**
 * Classe que representa um Produto no sistema.
 * 
 * GRASP - High Cohesion: Esta classe possui alta coesão pois concentra
 * apenas responsabilidades relacionadas à representação de um produto
 * (identificação, nome, preço). Todas as operações estão relacionadas
 * ao mesmo conceito de domínio.
 */
public class Product {
    private String id;
    private String name;
    private double price;
    
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return String.format("Product[id=%s, name=%s, price=%.2f]", id, name, price);
    }
}
