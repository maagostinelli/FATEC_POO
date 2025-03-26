public class Recepcionista extends Funcionario{
    private String cpf;
    public Recepcionista() {

    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Recepcionista(String nome, String telefone, String senha, String cpf) {
        super(nome, telefone, senha);
        setCpf(cpf);
    }
}