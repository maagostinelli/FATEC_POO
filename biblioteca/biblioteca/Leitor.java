public class Leitor {

    private String codigo;
    private String nome;
    private String email;
    private String telefone;
    private String documento;
    private Emprestimo emprestimo;
    private Reserva reserva;

    public Leitor(String codigo, String nome, String email, String telefone, String documento) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDocumento(documento);
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) throws Exception {
        if(documento==null || documento.length()<11) {
            throw new Exception("CPF obrigatório! Documento deve ter 11 caracteres.");
        } else {
            this.documento = documento;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception{
        if(email==null || !email.contains("@")) {
            throw new Exception("Formato de email inválido");
        } else {
            this.email = email;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome==null || nome.length()<6) {
            throw new Exception("Deve nome deve ser completo!");
        }
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void mostrar (){
        System.out.println("código:" + getCodigo());
        System.out.println("nome:" + getNome());
        System.out.println("email:" + getEmail());
        System.out.println("telefone:" + getTelefone());
        System.out.println("documento:" + getDocumento());
    }
}
