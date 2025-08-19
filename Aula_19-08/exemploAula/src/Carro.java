public class Carro {

    private String modelo;
    private String cor;
    private int ano;
    private boolean ligado;

    public Carro(String p_modelo, String p_cor, int p_ano){
        this.modelo = p_modelo;
        this.cor = p_cor;
        this.ano = p_ano;
        this.ligado = false;
    }

    public void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("VRUMMMM");
        }
        else {
            System.out.println("O carro já está ligado");
        }
    }

    public void desligar(){
        if (ligado) {
            ligado = false;
            System.out.println("Desligado");
        }
        else {
            System.out.println("O carro já está desligado");
        }
    }

    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public int getAno() { return ano; }
}

