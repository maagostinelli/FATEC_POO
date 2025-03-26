public class Procedimento {
    private data;
    private descritivo;

    public Procedimento(String data, String descritivo) {
        setData(data);
        setDescritivo(descritivo);
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void Consultar() {
        System.out.println("Procedimento marcado para: " + data + " - " + descritivo);
    }
}