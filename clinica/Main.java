public class Main {
    public static void main(String[] args) {
        // Criando um paciente
        Paciente paciente = new Paciente("João Silva", "12345678900", "99999-9999", "Masculino", 30);
        paciente.cadastrar();
        
        // Criando um recepcionista
        Recepcionista recepcionista = new Recepcionista("Ana Souza", "88888-8888", "senha123", "98765432100");
        
        // Criando um médico
        Medico medico = new Medico("Dr. Carlos", "77777-7777", "senha456", "CRM12345", "Cardiologia");

        // Criando uma consulta
        Consulta consulta = new Consulta("Dor no peito", "Histórico de pressão alta");
        recepcionista.marcar(consulta);
        
        // Médico realiza a consulta
        medico.realizarConsulta(consulta);
        consulta.realizar();

        // Criando uma receita
        Receita receita = new Receita();
        consulta.adicionarReceita(receita);
        receita.prescrever();

        // Criando um exame
        Exame exame = new Exame("26/03/2025", "Exame de sangue completo");
        consulta.adicionarExame(exame);
        exame.solicitar();
    }
}
