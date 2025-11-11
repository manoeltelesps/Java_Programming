package com.mycompany.praticasoo;

/**
 * Classe principal que demonstra a aplicação dos princípios GRASP.
 * 
 * Este sistema implementa os seguintes padrões GRASP:
 * 
 * 1. CREATOR PATTERN:
 *    - Aplicado em: Order.addItem()
 *    - Justificativa: Order cria OrderItems porque contém e usa diretamente esses objetos
 * 
 * 2. CONTROLLER PATTERN:
 *    - Aplicado em: OrderController (toda a classe)
 *    - Justificativa: OrderController coordena o fluxo de operações do sistema
 * 
 * 3. HIGH COHESION:
 *    - Aplicado em: Todas as classes (Product, OrderItem, Order, OrderController)
 *    - Justificativa: Cada classe possui responsabilidades bem definidas e relacionadas
 * 
 * 4. LOW COUPLING:
 *    - Aplicado em: Toda a arquitetura
 *    - Justificativa: Classes desacopladas, dependências mínimas entre componentes
 * 
 * @author manoeltelesps
 */
public class PraticasOO {

    public static void main(String[] args) {
        System.out.println("=== Sistema de Gerenciamento de Pedidos ===\n");
        System.out.println("Demonstração dos Princípios GRASP\n");
        
        // Criando produtos (exemplo de dados)
        Product produto1 = new Product("P001", "Notebook", 2500.00);
        Product produto2 = new Product("P002", "Mouse", 50.00);
        Product produto3 = new Product("P003", "Teclado", 150.00);
        
        // CONTROLLER PATTERN: Usando OrderController para coordenar operações
        OrderController controller = new OrderController();
        
        // Controller cria o pedido (aplicação do padrão Controller)
        Order pedido = controller.createOrder("ORD-001");
        
        System.out.println();
        
        // Controller coordena a adição de itens (aplicação do padrão Controller)
        // Internamente, Order.addItem() aplica o padrão Creator ao criar OrderItems
        controller.addItemToOrder(pedido, produto1, 1);
        controller.addItemToOrder(pedido, produto2, 2);
        controller.addItemToOrder(pedido, produto3, 1);
        
        System.out.println();
        
        // Controller processa o pedido (aplicação do padrão Controller)
        controller.processOrder(pedido);
        
        System.out.println("\n=== Fim da Demonstração ===");
    }
}
