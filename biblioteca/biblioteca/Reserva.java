public class Reserva {

    private String codigo;
    private String dataReserva;
    private String dataPrevista;
    private String situacao;

    public Reserva(String codigo, String dataReserva, String dataPrevista, String situacao) throws Exception {
        setCodigo(codigo);
        setDataReserva(dataReserva);
        setDataPrevista(dataPrevista);
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

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) throws Exception {
        if(dataReserva==null) {
            throw new Exception("Data reserva obrigatória!");
        } else {
            this.dataReserva = dataReserva;
        }
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void mostrar () {
        System.out.println("código:" + getCodigo());
        System.out.println("Data Reserva:" + getDataReserva());
        System.out.println("Data Prevista:" + getDataPrevista());
        System.out.println("Situação:" + getSituacao());
    }
}
