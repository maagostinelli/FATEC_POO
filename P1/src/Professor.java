public class Professor extends Usuario {
    private int registro;
    private String horario;
    private String disciplina;

    public Professor(String nome, String email, Sting senha, int registro, String horario, String disciplina) {
        super(nome, email, senha);
        setRegistro(registro);
        setHorario(horario);
        setDisciplina(disciplina);
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

    public void setHorario(int horario) {
        this.horario = horario;
    }
    public int getHorario() {
        return horario;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }
    public int getDisciplina() {
        return disciplina;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Registro prof: " + getRegistro());
    }

    public void lecionaCurso(Curso curso) {
        System.out.println("Professor " + getNome() + " leciona o curso: " + curso.getNome());
    }
}