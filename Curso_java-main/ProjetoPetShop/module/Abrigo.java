package module;
import java.io.*;
import java.util.*;


public class Abrigo {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String horarioFuncionamento;
    private List<Animal> animais;
    private List<Usuario> usuarios;
    private List<Pedido> pedidosAdocao;

    public Abrigo(String nome, String endereco, String email, String telefone, String horarioFuncionamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.horarioFuncionamento = horarioFuncionamento;
        this.animais = new ArrayList<>();
        this.usuarios = Usuario.carregarUsuarios("file/usuarios.txt");
        this.pedidosAdocao = new ArrayList<>();
        carregarAnimais();
        carregarPedidos();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        Usuario.salvarUsuarios(usuarios, "file/usuarios.txt");
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        salvarAnimais();
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public List<Pedido> getPedidosAdocao() {
        return pedidosAdocao;
    }

    public void registrarPedido(Pedido pedido) {
        pedidosAdocao.add(pedido);
        salvarPedidos();
    }

    public Animal buscarAnimalPorNome(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nome)) {
                return animal;
            }
        }
        return null;
    }

    private void carregarAnimais() {
        try (BufferedReader br = new BufferedReader(new FileReader("file/animais.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                animais.add(Animal.fromCSV(linha));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar animais: " + e.getMessage());
        }
    }

    private void salvarAnimais() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file/animais.txt"))) {
            for (Animal animal : animais) {
                bw.write(animal.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar animais: " + e.getMessage());
        }
    }

    private void carregarPedidos() {
        try (BufferedReader br = new BufferedReader(new FileReader("file/pedidos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                pedidosAdocao.add(Pedido.fromCSV(linha));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar pedidos: " + e.getMessage());
        }
    }

    private void salvarPedidos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file/pedidos.txt"))) {
            for (Pedido pedido : pedidosAdocao) {
                bw.write(pedido.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar pedidos: " + e.getMessage());
        }
    }
}