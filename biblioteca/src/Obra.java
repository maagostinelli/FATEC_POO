import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Obra {
    private String codigo;
    private String titulo;
    private String autor;
    private String editora;
    private String ano;
    private String descritivo;
    private String isbn;
    private CategoriaObra2 categoria;
    private java.util.List<Copia> copias = new ArrayList<Copia>();

    public Obra (String codigo, String titulo, String autor, String editora, String ano, String descritivo, String isbn) throws Exception {
        setCodigo(codigo);
        setTitulo(titulo);
        setAutor(autor);
        setEditora(editora);
        setAno(ano);
        setIsbn(isbn);
        setDescritivo(descritivo);

    }

    public CategoriaObra2 getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaObra2 categoria) {
        this.categoria = categoria;
    }

    public List<Copia> getCopias() {
        return copias;
    }

    public void setCopias(List<Copia> copias) {
        this.copias = copias;
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
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
        System.out.println("=========Obra===========");
        System.out.println("codigo:" + getCodigo());
        System.out.println("titulo:" + getTitulo());
        System.out.println("autor:" + getAutor());
        System.out.println("editora:" + getEditora());
        System.out.println("ano:" + getAno());
        System.out.println("descritivo:" + getDescritivo());
        System.out.println("isbn:" + getIsbn());
    }

}