public class Consulta {
    private String motivo;
    private String historico;

    // Construtor
    public Consulta(String motivo, String historico) {
        SetMotivo(motivo);
        SetHistorico(historico);
    }

    public String getMotivo() { 
        return motivo; 
    }
    public void setMotivo(String motivo) { 
        this.motivo = motivo;
    }

    public String getHistorico() { 
        return historico; 
    }
    public void setHistorico(String historico) { 
        this.historico = historico; 
    }

    public void marcar() {
        System.out.println("Consulta marcada para: " + motivo);
    }

    public void cancelar() {
        System.out.println("Consulta cancelada.");
    }

    public void consultar() {
        System.out.println("Consulta em andamento...");
    }

    public void realizar() {
        System.out.println("Consulta realizada com sucesso!");
    }

    public void atualizar() {
        System.out.println("Informações da consulta atualizadas.");
    }

}
