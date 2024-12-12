package module;
import java.io.*;
import java.util.*;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toCSV() {
        return nome + "," + email + "," + senha;
    }

    public static Usuario fromCSV(String linha) {
        String[] dados = linha.split(",");
        return new Usuario(dados[0], dados[1], dados[2]);
    }

    public static List<Usuario> carregarUsuarios(String caminho) {
        List<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                usuarios.add(Usuario.fromCSV(linha));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar usuários: " + e.getMessage());
        }
        return usuarios;
    }

    public static void salvarUsuarios(List<Usuario> usuarios, String caminho) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
            for (Usuario usuario : usuarios) {
                bw.write(usuario.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar usuários: " + e.getMessage());
        }
    }
}