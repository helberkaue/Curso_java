package module;


public class Pedido {
    private String nomeAdotante;
    private Animal animalAdotado;
    private String dataAdocao;

    public Pedido(String nomeAdotante, Animal animalAdotado, String dataAdocao) {
        this.nomeAdotante = nomeAdotante;
        this.animalAdotado = animalAdotado;
        this.dataAdocao = dataAdocao;
    }

    public String getNomeAdotante() {
        return nomeAdotante;
    }

    public Animal getAnimalAdotado() {
        return animalAdotado;
    }

    public String getDataAdocao() {
        return dataAdocao;
    }

    public String toCSV() {
        return nomeAdotante + "," + animalAdotado.getNome() + "," + dataAdocao;
    }

    public static Pedido fromCSV(String linha) {
        String[] dados = linha.split(",");
        Animal animal = new Animal(dados[1], 0, "", "", ""); // Simples instância apenas para representar
        return new Pedido(dados[0], animal, dados[2]);
    }
}