public class Pagamento {
    private int id;
    private float valor;
    private String formaPagamento;
    private String status

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getValor() {
        return valor;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setStatus(String status) {
        this.formaStatus = status;
    }
    public String getStatus() {
        return status;
    }

}