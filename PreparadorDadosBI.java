public class PreparadorDadosBI {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Processamento para Power BI ---");

        // Simulacao de dados que viriam de um SQL no SGU
        double[] faturas = {22345682, 22345684, 22345689, 22325682, 21345692};
        String[] status = {"INTEGRADA", "PENDENTE", "INTEGRADA", "INTEGRADA", "NAO INTEGRADA"};

        double totalParaDashboard = 0;
        int faturasContabilizadas = 0;

        // Lógica de Filtro (O que o BI vai consumir)
        for (int i = 0; i < faturas.length; i++) {
            if (status[i].equals("INTEGRADA")) {
                totalParaDashboard += faturas[i];
                faturasContabilizadas++;
                System.out.println("Fatura " + (i+1) + ": R$ " + faturas[i] + " [Enviada para o BI]");
            }
        }

        System.out.println("\n--- Resumo Final ---");
        System.out.println("Total Processado: R$ " + totalParaDashboard);
        System.out.println("Qtd Faturas no Gráfico: " + faturasContabilizadas);
    }
}
