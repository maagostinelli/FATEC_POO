public class CategoriaObra {
        private String codigo;
        private String tipo;
        private Obra obra;


    public CategoriaObra(String tipo, String codigo) throws Exception {
        setTipo(tipo);
        setCodigo(codigo);
    }

    public String getCodigo() {
        return;
    }

    public void setCodigo(String codigo) throws Exception {
        if(codigo==null || codigo.length()<6) {
            throw new Exception("Código deve ter no mínimo 6 digitos!");
        } else {
            this.codigo = codigo;
        }
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws Exception {
        if(tipo==null || tipo.length()<4) {
            throw new Exception("Tipo deve ter no mínimo 4 digitos!");
        } else {
            this.tipo = tipo;
        }
    }

    public void mostrar () {
        System.out.println("Tipo:" + getTipo());
        System.out.println("Código:" + getCodigo());
    }

}
