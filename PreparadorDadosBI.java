public class PreparadorDadosBI {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Processamento para Power BI ---");

        // Simulando dados que viriam de um SQL no SGU
        double[] faturas = {1500.50, 2300.00, 450.30, 890.00, 120.00};
        String[] status = {"PAGO", "PENDENTE", "PAGO", "PAGO", "CANCELADO"};

        double totalParaDashboard = 0;
        int faturasContabilizadas = 0;

        // Lógica de Filtro (O que o BI vai consumir)
        for (int i = 0; i < faturas.length; i++) {
            if (status[i].equals("PAGO")) {
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
