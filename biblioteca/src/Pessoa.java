public class Pessoa {
    private String codigo;
    private String nome;
    private String email;
    private String telefone;
    private String documento;

    public Pessoa(String codigo, String nome, String email, String telefone, String documento) {
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDocumento(documento);
    }

    public Pessoa() {

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public void mostrar() {
        System.out.println("=========Pessoa===========");
        System.out.println("código:" + getCodigo());
        System.out.println("nome:" + getNome());
        System.out.println("email:" + getEmail());
        System.out.println("telefone:" + getTelefone());
        System.out.println("documento:" + getDocumento());

    }
}
