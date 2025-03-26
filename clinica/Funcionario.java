public class Funcionario {
    private String nome;
    private String telefone;
    private String senha;

    public Funcionario(String nome, String telefone, String senha) {
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
    }
    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return "********";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void mostrar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
    }

}