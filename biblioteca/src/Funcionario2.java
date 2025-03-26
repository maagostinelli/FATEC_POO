public class Funcionario2 extends Pessoa {
    private String cargo;

    public Funcionario2() {

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario2(String codigo, String nome, String email, String telefone, String documento, String cargo) {
        super(codigo, nome, email, telefone, documento);
        setCargo(cargo);
    }
}
