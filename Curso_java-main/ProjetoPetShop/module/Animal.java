package module;


public class Animal {
    private String nome;
    private int idade;
    private String especie;
    private String porte;
    private String descricao;

    public Animal(String nome, int idade, String especie, String porte, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.porte = porte;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPorte() {
        return porte;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toCSV() {
        return nome + "," + idade + "," + especie + "," + porte + "," + descricao;
    }

    public static Animal fromCSV(String linha) {
        String[] dados = linha.split(",");
        return new Animal(dados[0], Integer.parseInt(dados[1]), dados[2], dados[3], dados[4]);
    }
}