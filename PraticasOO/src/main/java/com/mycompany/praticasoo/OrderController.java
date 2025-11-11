package com.mycompany.praticasoo;

/**
 * Classe que controla o fluxo de operações relacionadas a pedidos.
 * 
 * GRASP - Controller Pattern:
 * Esta classe aplica o padrão Controller porque:
 * 1. Representa o sistema ou um caso de uso (gerenciamento de pedidos)
 * 2. Coordena as operações do sistema relacionadas a pedidos
 * 3. Atua como intermediário entre a camada de apresentação (main) e a camada de domínio
 * 4. Centraliza a lógica de controle do fluxo de criação e processamento de pedidos
 * 
 * O Controller recebe eventos do sistema (criação de pedido, adição de itens)
 * e delega as operações apropriadas para as classes de domínio, mantendo
 * a separação de responsabilidades.
 * 
 * GRASP - Low Coupling:
 * Esta classe mantém baixo acoplamento porque:
 * - Não conhece detalhes de implementação das classes de domínio
 * - Usa apenas interfaces públicas (métodos públicos)
 * - Pode ser modificada sem afetar as classes de domínio
 * - As classes de domínio não dependem do Controller
 */
public class OrderController {
    
    /**
     * Método que aplica o padrão Controller.
     * Coordena a criação de um novo pedido no sistema.
     */
    public Order createOrder(String orderId) {
        System.out.println("Controller: Criando novo pedido " + orderId);
        // Controller delega a criação do objeto Order para a própria classe Order
        // mantendo baixo acoplamento
        return new Order(orderId);
    }
    
    /**
     * Método que aplica o padrão Controller.
     * Coordena a adição de itens a um pedido existente.
     */
    public void addItemToOrder(Order order, Product product, int quantity) {
        System.out.println("Controller: Adicionando item ao pedido " + order.getOrderId());
        // Controller coordena a operação, mas delega a lógica de negócio para Order
        // Isso mantém a separação de responsabilidades
        order.addItem(product, quantity);
    }
    
    /**
     * Método que aplica o padrão Controller.
     * Coordena o processamento e finalização de um pedido.
     */
    public void processOrder(Order order) {
        System.out.println("\nController: Processando pedido " + order.getOrderId());
        System.out.println(order);
        System.out.println("Controller: Pedido processado com sucesso!");
    }
}

