/**
 * Classe que representa um piano
 * Implementa a interface InstrumentoMusical
 * Exercício avançado sobre abstração com interfaces
 * 
 * @author Professor Samuel Novais
 */
public class Piano implements InstrumentoMusical {
    private String marca;
    private String tipo; // Acústico, Digital, Elétrico
    private int numeroTeclas;
    private boolean afinado;
    private boolean tocando;
    private int volume;
    
    /**
     * Construtor da classe Piano
     * @param marca Marca do piano
     * @param tipo Tipo do piano (Acústico, Digital, Elétrico)
     * @param numeroTeclas Número de teclas do piano
     */
    public Piano(String marca, String tipo, int numeroTeclas) {
        this.marca = marca;
        this.tipo = tipo;
        this.numeroTeclas = numeroTeclas;
        this.afinado = false;
        this.tocando = false;
        this.volume = 5; // Volume médio (1-10)
    }
    
    /**
     * Implementação do método tocar da interface
     */
    @Override
    public void tocar() {
        if (afinado) {
            tocando = true;
            System.out.println("♪ Tocando o piano " + marca + " ♪");
            System.out.println("Melodia fluindo pelas " + numeroTeclas + " teclas...");
            System.out.println("Volume: " + volume + "/10");
        } else {
            System.out.println("O piano precisa ser afinado antes de tocar!");
        }
    }
    
    /**
     * Implementação do método afinar da interface
     */
    @Override
    public void afinar() {
        System.out.println("Afinando o piano " + marca + "...");
        if (tipo.equals("Acústico")) {
            System.out.println("Ajustando a tensão das cordas internas...");
            System.out.println("Verificando martelos e abafadores...");
        } else {
            System.out.println("Calibrando sistema eletrônico...");
            System.out.println("Ajustando frequências digitais...");
        }
        this.afinado = true;
        System.out.println("Piano afinado com sucesso!");
    }
    
    /**
     * Implementação do método pararDeTocar da interface
     */
    @Override
    public void pararDeTocar() {
        if (tocando) {
            tocando = false;
            System.out.println("Parando de tocar o piano. As teclas estão em silêncio...");
        } else {
            System.out.println("O piano já estava em silêncio.");
        }
    }
    
    /**
     * Método específico para tocar nota
     * @param nota Nome da nota a ser tocada
     */
    public void tocarNota(String nota) {
        if (afinado) {
            System.out.println("Tocando a nota " + nota + " no piano");
        } else {
            System.out.println("Afine o piano antes de tocar notas!");
        }
    }
    
    /**
     * Método específico para tocar escala
     * @param escala Nome da escala a ser tocada
     */
    public void tocarEscala(String escala) {
        if (afinado) {
            System.out.println("Tocando a escala de " + escala + " no piano");
            System.out.println("Subindo e descendo as teclas melodiosamente...");
        } else {
            System.out.println("Afine o piano antes de tocar escalas!");
        }
    }
    
    /**
     * Método específico para ajustar volume
     * @param novoVolume Novo volume (1-10)
     */
    public void ajustarVolume(int novoVolume) {
        if (novoVolume >= 1 && novoVolume <= 10) {
            this.volume = novoVolume;
            System.out.println("Volume ajustado para: " + volume + "/10");
        } else {
            System.out.println("Volume deve estar entre 1 e 10.");
        }
    }
    
    /**
     * Método específico para usar pedal (apenas para pianos acústicos)
     */
    public void usarPedal() {
        if (tipo.equals("Acústico")) {
            System.out.println("Usando o pedal do piano para sustentar as notas...");
        } else {
            System.out.println("Este tipo de piano não possui pedal físico.");
        }
    }
    
    /**
     * Sobrescrita do método exibirTipo da interface
     */
    @Override
    public void exibirTipo() {
        System.out.println("Este é um piano " + tipo + " da marca " + marca);
    }
    
    /**
     * Método para exibir informações completas do piano
     */
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO PIANO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de teclas: " + numeroTeclas);
        System.out.println("Afinado: " + (afinado ? "Sim" : "Não"));
        System.out.println("Tocando: " + (tocando ? "Sim" : "Não"));
        System.out.println("Volume: " + volume + "/10");
        System.out.println("============================");
    }
    
    // Getters e Setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getNumeroTeclas() {
        return numeroTeclas;
    }
    
    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }
    
    public boolean isAfinado() {
        return afinado;
    }
    
    public boolean isTocando() {
        return tocando;
    }
    
    public int getVolume() {
        return volume;
    }
}

