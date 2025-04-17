public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        setNome(nome);
        setEmail(email);
        setSenha(senha);
    }

    public Usuario() {}

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return "********";
    }

    public void mostrar() {
        System.out.println("-----Usuário-----");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
    }
}