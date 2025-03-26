public class Agenda {
    private String data;
    private String hora;

    public Agenda(String data, String hora) {
        setData(data);
        setHora(hora);
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public void consultar() {
        System.out.println("Consulta marcada para: " + data + " às " + hora);
    }
}