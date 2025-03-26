public class Main2 {

    public static void main(String[] args) {
        Funcionario2 f1 = new Funcionario2();
        f1.setCodigo("123456");
        f1.setNome("Mariana");
        f1.setEmail("mariana@gmail.com");
        f1.setTelefone("945684521");
        f1.setDocumento("12345678999");
        f1.setCargo("bibliotecária");

        Leitor2 l1 = new Leitor2();
        l1.setCodigo("789654");
        l1.setNome("Julia");
        l1.setEmail("julia@gmail.com");
        l1.setTelefone("987546302");
        l1.setDocumento("98745632155");

        CategoriaLeitor2 cl1 = new CategoriaLeitor2();
        cl1.setCodigo("960443");
        cl1.setNome("Aluno");
        cl1.setDias(7);

        CategoriaObra2 co1 = new CategoriaObra2();
        co1.setCodigo("960543");
        co1.setNome("Romance");

        f1.mostrar();
        l1.mostrar();
        cl1.mostrar();
        co1.mostrar();
    }
}
