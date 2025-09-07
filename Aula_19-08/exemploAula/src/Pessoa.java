public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private String cpf;

    //Construtor com Parametros
    public Pessoa(String p_nome, int p_idade, double p_altura, String p_cpf){
        this.setNome(p_nome);
        this.idade = p_idade;
        this.altura = p_altura;
        this.cpf = p_cpf;
    }

    //Construtor padrão
    public Pessoa (){
    }

    public void apresentar(){
        System.out.println("Meu nome é" + this.getNome() + ", prazer");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
