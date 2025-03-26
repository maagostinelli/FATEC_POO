
public class Main {

    public static void main(String[] args) {
        try {
            Obra memorias = new Obra("9864", "Memórias", "Machado de Assis", "Antográfica", 1881, "Obra clássica", "92739");
            Leitor eduardo = new Leitor("9264", "Eduardo", "eduardo@gmail.com", "11956372845", "97436287519");
            Funcionario silvia = new Funcionario("0834", "Silvia", "silvia@gmail.com", "972538761", "82825754319", "bibliotecária");
            Copia um = new Copia("89263", "Emprestada", "Conservada");
            Reserva nova = new Reserva("83645", "12/02/2025", "19/02/2025", "Pendente");
            Emprestimo novo =  new Emprestimo("8234", "22/02/2025", "01/03/2025", "Não", "Não", "Emprestado");
            CategoriaObra memoria = new CategoriaObra("Romance", "9345");

            memorias.mostrar();
            eduardo.mostrar();
            silvia.mostrar();
            um.mostrar();
            nova.mostrar();
            novo.mostrar();
            memoria.mostrar();
            silvia.gerenciaObra(memorias);
            silvia.cadastrar(um);
            silvia.gerenciaLeitor(eduardo);

        }
        catch (Exception err) {
            System.out.println(err.getMessage());
        }
        finally {
            System.out.println("Programa encerrado com sucesso!");
        }
    }
}