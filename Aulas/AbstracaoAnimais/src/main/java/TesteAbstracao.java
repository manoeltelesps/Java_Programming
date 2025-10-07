/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Samuel Novais
 */
public class TesteAbstracao {

    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DE ABSTRAÇÃO EM JAVA ===\n");
        
        // Testando classes abstratas com formas geométricas
        testarFormasGeometricas();
        
       
        // Testando classes abstratas com animais
        //testarAnimais();

        
        // Testando interfaces com instrumentos musicais
        //testarInstrumentosMusicais();

        
        // Demonstrando polimorfismo
       // demonstrarPolimorfismo();
    }
    
      /**
     * Método para testar formas geométricas (classes abstratas)
     */
    public static void testarFormasGeometricas() {
        System.out.println("=== TESTANDO FORMAS GEOMÉTRICAS ===");
        
        // Criando um círculo
        Circulo circulo = new Circulo("Azul", 10.0, 15.0, 5.0);
        circulo.exibirInformacoes();
        circulo.mover(20.0, 25.0);
        circulo.redimensionar(7.0);
        
        System.out.println();
        
        // Criando um retângulo
        Retangulo retangulo = new Retangulo("Vermelho", 0.0, 0.0, 8.0, 6.0);
        retangulo.exibirInformacoes();
        retangulo.alterarCor("Verde");
        retangulo.redimensionar(10.0, 10.0);
        System.out.println("É quadrado? " + retangulo.ehQuadrado());
    }
    
    /**
     * Método para testar animais (classes abstratas)
     */
    public static void testarAnimais() {
        System.out.println("=== TESTANDO ANIMAIS ===");
        
        // Criando um cachorro
        Cachorro cachorro = new Cachorro("Rex", 3, 25.5, "Labrador");
        cachorro.exibirInformacoes();
        cachorro.emitirSom();
        cachorro.mover();
        cachorro.latir();
        cachorro.buscarObjeto("bolinha");
        cachorro.adestrar();
        cachorro.darPata();
        
        System.out.println();
        
        // Criando um gato
        Gato gato = new Gato("Mimi", 2, 4.2, "Cinza");
        gato.exibirInformacoes();
        gato.emitirSom();
        gato.mover();
        gato.ronronar();
        gato.arranhar("sofá");
        gato.cacar("rato");
    }
    
    /**
     * Método para testar instrumentos musicais (interfaces)
     */
    public static void testarInstrumentosMusicais() {
        System.out.println("=== TESTANDO INSTRUMENTOS MUSICAIS ===");
        
        // Criando um violão
        Violao violao = new Violao("Yamaha", "Clássico");
        violao.exibirInformacoes();
        violao.exibirTipo();
        violao.tocar(); // Tentativa sem afinar
        violao.afinar();
        violao.tocar();
        violao.tocarAcorde("Dó Maior");
        violao.fazerDedilhado();
        violao.pararDeTocar();
        
        System.out.println();
        
        // Criando um piano
        Piano piano = new Piano("Steinway", "Acústico", 88);
        piano.exibirInformacoes();
        piano.exibirTipo();
        piano.afinar();
        piano.ajustarVolume(8);
        piano.tocar();
        piano.tocarNota("Lá");
        piano.tocarEscala("Dó Maior");
        piano.usarPedal();
        piano.pararDeTocar();
        
        System.out.println();
        
        // Usando método estático da interface
        InstrumentoMusical.criarMelodia();
    }
    
    /**
     * Método para demonstrar polimorfismo
     */
    public static void demonstrarPolimorfismo() {
        System.out.println("=== DEMONSTRANDO POLIMORFISMO ===");
        
        // Polimorfismo com formas geométricas
        System.out.println("--- Polimorfismo com Formas ---");
        Forma[] formas = {
            new Circulo("Amarelo", 0, 0, 3),
            new Retangulo("Roxo", 5, 5, 4, 6),
            new Circulo("Rosa", 10, 10, 2.5)
        };
        
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            forma.mover(forma.getPosicaoX() + 1, forma.getPosicaoY() + 1);
            System.out.println();
        }
        
        // Polimorfismo com animais
        System.out.println("--- Polimorfismo com Animais ---");
        Animal[] animais = {
            new Cachorro("Buddy", 5, 30.0, "Golden Retriever"),
            new Gato("Whiskers", 3, 5.5, "Laranja"),
            new Cachorro("Luna", 2, 15.0, "Poodle")
        };
        
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            animal.comer("ração");
            System.out.println();
        }
        
        // Polimorfismo com instrumentos musicais
        System.out.println("--- Polimorfismo com Instrumentos ---");
        InstrumentoMusical[] instrumentos = {
            new Violao("Fender", "Folk"),
            new Piano("Casio", "Digital", 61),
            new Violao("Gibson", "Elétrico")
        };
        
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.exibirTipo();
            instrumento.afinar();
            instrumento.tocar();
            instrumento.pararDeTocar();
            System.out.println();
        }
    }
    
}
