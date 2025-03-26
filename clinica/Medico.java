public class Medico extends Funcionario {
    private String crm;
    private String especialidade;

    public Medico() {
    }
    public String getCrm() {
        return crm;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public Medico(String nome, String telefone, String senha, String crm, String especialidade) {
        super(nome, telefone, senha);
        setCrm(crm);
        setEspecialidade(especialidade);
    }
}