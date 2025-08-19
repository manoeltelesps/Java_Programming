
public class Main {
    public static void main(String[] args) {

        Pessoa kenas = new Pessoa();
        Pessoa luqueta = new Pessoa("Queta", 1, 1.80, "111.111.111.-11");

        Carro quetaCarro = new Carro("Mobi", "Rosa", 2001);
        Carro meuCarro = new Carro("Hilux", "Cinza", 2026);

        System.out.println("\nDetalhes:");
        System.out.println("Queta tem um " + quetaCarro.getModelo() + " " + quetaCarro.getCor() + " de " + quetaCarro.getAno());
        System.out.println("Eu tenho uma " + meuCarro.getModelo() + " " + meuCarro.getCor() + " de " + meuCarro.getAno());

        quetaCarro.ligar();
        }
    }