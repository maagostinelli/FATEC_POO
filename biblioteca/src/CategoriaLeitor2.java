public class CategoriaLeitor2 extends Categoria {
    private int dias;

    public CategoriaLeitor2(String codigo, String nome, int dias) {
        super(codigo, nome);
        setDias(dias);
    }

    public CategoriaLeitor2() {
        super();
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
