public class GestorChamados {
    public static void main(String[] args) {
        // Dados que poderiam vir do seu SELECT no banco
        String tipoProblema = "FATURAMENTO";
        String nivelSuporte = "N2";
        String prioridade;

        // A Lógica do "Motor de Regras"
        if (tipoProblema.equals("FATURAMENTO") && nivelSuporte.equals("N2")) {
            prioridade = "CRÍTICA - Resolver em 2h";
        } else if (tipoProblema.equals("SGU")) {
            prioridade = "MÉDIA - Resolver em 24h";
        } else {
            prioridade = "BAIXA - Prazo de 72h";
        }

        System.out.println("Chamado analisado: " + tipoProblema);
        System.out.println("Resultado da Triagem: " + prioridade);
    }
}
