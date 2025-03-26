public class Categoria {
    private String codigo;
    private String nome;

    public Categoria(String codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
    }

    public Categoria() {

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

    public void mostrar() {
        System.out.println("=========Categoria===========");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
    }
}
