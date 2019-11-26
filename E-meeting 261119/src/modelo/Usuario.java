

package modelo;

//import java.util.ArrayList;


public class Usuario {
    private String nome;
    private String email;
    private String funçao;
    private String cpf;
    private String senha;
    
    public Usuario() {
    }
    
    /*public Usuario( String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }*/


    public Usuario(String nome, String email, String funçao, String cpf, String senha) {
        this.nome = nome;
        this.email = email;
        this.funçao = funçao;
        this.cpf = cpf;
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

    public String getFunçao() {
        return funçao;
    }

    public void setFunçao(String funçao) {
        this.funçao = funçao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", email=" + email + ", fun\u00e7ao=" + funçao + ", cpf=" + cpf + ", senha=" + senha + '}';
    }
    
    //ArrayList<Usuario> cadastros = new ArrayList<>();

    
}
