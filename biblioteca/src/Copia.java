public class Copia {

    private String codigo;
    private String situacao;
    private String descritivo;

    public Copia(String codigo, String situacao, String descritivo) throws Exception {
        setCodigo(codigo);
        setSituacao(situacao);
        setDescritivo(descritivo);
    }

    public Copia() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {
        if(codigo==null || codigo.length()<6) {
            throw new Exception("Código deve ter no mínimo 6 digitos!");
        } else {
            this.codigo = codigo;
        }
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception {
        if(descritivo==null) {
            throw new Exception("Descritivo obrigatório.");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void mostrar (){
        System.out.println("=========Cópia===========");
        System.out.println("código:" + getCodigo());
        System.out.println("situação:" + getSituacao());
        System.out.println("descritivo:" + getDescritivo());
    }
}