public class Emprestimo {

    private String codigo;
    private String dataEmprestimo;
    private String dataPrevisto;
    private String dataDevolvido;
    private String multa;
    private String situacao;

    public Emprestimo(String codigo, String dataEmprestimo, String dataPrevisto, String dataDevolvido, String multa, String situacao) throws Exception {
        setCodigo(codigo);
        setDataEmprestimo(dataEmprestimo);
        setDataPrevisto(dataPrevisto);
        setDataDevolvido(dataDevolvido);
        setMulta(multa);
        setSituacao(situacao);

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

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) throws Exception {
        if(dataEmprestimo==null) {
            throw new Exception("Data de emprestimo obrigatória!");
        } else {
            this.dataEmprestimo = dataEmprestimo;
        }
    }

    public String getDataPrevisto() {
        return dataPrevisto;
    }

    public void setDataPrevisto(String dataPrevisto) {
        this.dataPrevisto = dataPrevisto;
    }

    public String getDataDevolvido() {
        return dataDevolvido;
    }

    public void setDataDevolvido(String dataDevolvido) {
        this.dataDevolvido = dataDevolvido;
    }

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


    public void mostrar() {
        System.out.println("Código:" + getCodigo());
        System.out.println("Data Empréstimo:" + getDataEmprestimo());
        System.out.println("Data Previsto:" + getDataPrevisto());
        System.out.println("Data Devolvido:" + getDataDevolvido());
        System.out.println("Multa:" + getMulta());
        System.out.println("Situação:" + getSituacao());
    }
}
