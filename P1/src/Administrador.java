public class Administrador extends Usuario {
    private int registro;

    public Professor(String nome, String email, Sting senha, int registro) {
        super(nome, email, senha);
        setRegistro(registro);
    }

    public Professor() {
        super();
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public int getRegistro() {
        return registro;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Registro admin: " + getRegistro());
    }
}