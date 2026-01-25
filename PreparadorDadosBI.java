public class PreparadorDadosBI {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Processamento para Power BI ---");

        // Simulação de dados que viriam de um SQL no SGU (Números de faturas e seus respectivos status)
        double[] faturas = {22345682, 22345684, 22345689, 22325682, 21345692};
        String[] status = {"INTEGRADA", "PENDENTE", "INTEGRADA", "INTEGRADA", "NAO INTEGRADA"};

        double totalIntegrada = 0;
        double totalPendente = 0;
        double totalNaoIntegrada = 0;
        int faturasContabilizadas = 0;

        // Lógica de Filtro (O que o BI vai consumir)
        for (int i = 0; i < faturas.length; i++) {
            if (status[i].equals("INTEGRADA")) {
                totalIntegrada += faturas[i];
                faturasContabilizadas++;
                System.out.println("Fatura " + (i+1) + ": Status INTEGRADA - Processada.");
            }
            else if (status[i]. equals("PENDENTE")) {
                totalPendente += faturas[i];
                    faturasContabilizadas++;
                System.out.println("Fatura " + (i+1) + ": Status PENDENTE - Enviada para revisão.");
            }
            else if (status[i].equals("NAO INTEGRADA")) {
                totalNaoIntegrada += faturas[i];
                    faturasContabilizadas++;
                System.out.println("Fatura " + (i+1) + ": Status NAO INTEGRADA - Nao Processada.");
            }
        }

        System.out.println("\n--- Resumo Final ---");
        System.out.println("Total Integrado: R$ " + totalIntegrada);
        System.out.println("Total Pendentes: R$ " + totalPendente);
        System.out.println("Total Nao Integrada: R$ " + totalNaoIntegrada);
        System.out.println("Qtd Total de Faturas no Gráfico: " + faturasContabilizadas);
    }
}
