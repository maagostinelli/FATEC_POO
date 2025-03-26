public class Funcionario {

    private String codigo;
    private String nome;
    private String email;
    private String telefone;
    private String documento;
    private String cargo;
    private Emprestimo cadastro_emprestimo;


    public Funcionario(String codigo, String nome, String email, String telefone, String documento, String cargo) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDocumento(documento);
        setCargo(cargo);
    }

    public Emprestimo getCadastro_emprestimo() {
        return cadastro_emprestimo;
    }

    public void setCadastro_emprestimo(Emprestimo cadastro_emprestimo) {
        this.cadastro_emprestimo = cadastro_emprestimo;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome==null || nome.length()<6) {
            throw new Exception("Nome deve ser completo!");
        } else {
            this.nome = nome;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if(email==null || !email.contains("@")) {
            throw new Exception("Formato de email inválido!");
        } else {
            this.email = email;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void gerenciaObra(Obra obra) {
        System.out.println(this.nome +"gerenciando " + obra.getTitulo());
    }

    public void cadastrar(Copia copia) {
        System.out.println(this.nome + "cadastra " + copia.getExemplar());
    }

    public void gerenciaLeitor( Leitor leitor) {
        System.out.println(this.nome + "gerencia" + leitor.getNome());
    }

    public void mostrar (){
        System.out.println("código:" + getCodigo());
        System.out.println("nome:" + getNome());
        System.out.println("email:" + getEmail());
        System.out.println("telefone:" + getTelefone());
        System.out.println("documento:" + getDocumento());
        System.out.println("cargo:" + getCargo());
    }

}
