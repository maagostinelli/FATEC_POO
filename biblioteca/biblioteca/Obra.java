public class Obra {
    private String codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int ano;
    private String descritivo;
    private String isbn;
    private Reserva livro;

    public Obra (String codigo, String titulo, String autor, String editora, int ano, String descritivo, String isbn) throws Exception {
        setCodigo(codigo);
        setTitulo(titulo);
        setAutor(autor);
        setEditora(editora);
        setAno(ano);
        setIsbn(isbn);
        setDescritivo(descritivo);
    }

    public Reserva getLivro() {
        return livro;
    }

    public void setLivro(Reserva livro) {
        this.livro = livro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) throws Exception {
        if(isbn==null) {
            throw new Exception("ISBN é obrigatório!");
        } else {
            this.isbn = isbn;
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception {
        if(titulo==null) {
            throw new Exception("Título é obrigatório!");
        } else {
            this.titulo = titulo;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void mostrar (){
        System.out.println("codigo:" + getCodigo());
        System.out.println("titulo:" + getTitulo());
        System.out.println("autor:" + getAutor());
        System.out.println("editora:" + getEditora());
        System.out.println("ano:" + getAno());
        System.out.println("descritivo:" + getDescritivo());
        System.out.println("isbn:" + getIsbn());
    }

}
