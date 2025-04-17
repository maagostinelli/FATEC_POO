public class Aluno extends Usuario {
    private int ra;

    public Aluno(String nome, String email, Sting senha, int ra) {
        super(nome, email, senha);
        setRa(ra);
    }

    public Aluno() {
        super();
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    public int getRa() {
        return ra;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RA: " + getRa());
    }

    public void matricular(Curso curso) {
        System.out.println("Aluno " + aluno.getNome() + " matriculado no curso" + curso.getNome());
    }

    public void estudaAula(Curso curso, Tarefa tarefa) {
        System.out.println("Aula " + getConteudo() + " do curso " + curso.getNome());
        System.out.println("Material e tarefa desta aula: " + getMaterialEstudo() + " e " + tarefa.getNumero());
    }
}