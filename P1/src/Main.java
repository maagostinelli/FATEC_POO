public class Main {
    public static void main(String[] args) {

        Administrador admin = new Administrador("Amanda Gomes", "admin.amanda@email.com", "admin123", 12345);
        Aluno aluno1 = new Aluno("Angelo Queiroz", "angelo.qa@email.com", "gelo321", 67890);
        Professor professor1 = new Professor("Paula Nascimento", "paulanascprof@email.com", "nascid@987", 11223, "08:00-12:00", "Inglês");
        Curso curso1 = new Curso("12444", "Inglês Intermediário B2", "sab, 15h-18h", 520.90);
        Aula aula = new Aula();
        aula.setIdAula(111);
        aula.setData("2023-10-01");
        aula.setConteudo("Introdução ao Curso");
        aula.setMaterialEstudo("link_material_aula01.pdf");

        admin.mostrar();
        aluno1.mostrar();
        professor1.mostrar();

        aluno1.matricular(curso1);

        aluno1.estudaAula(curso1, aula);
        professor1.lecionaCurso(curso1);
    }
}