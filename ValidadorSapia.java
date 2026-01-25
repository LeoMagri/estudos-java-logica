public class ValidadorSapia {
    public static void main(String[] args) {
        // Simulando dados que vieram do SQL (ID da Guia, Valor, Status de Carência)
        String[] guias = {"25874099", "25763512", "21987092"};
        double[] valores = {150.00, 2500.00, 80.00};
        boolean[] carenciaCumprida = {true, false, true};

        System.out.println("--- Iniciando Auditoria via Regra Sapia ---");

        for (int i = 0; i < guias.length; i++) {
            // Regra: Se o valor for > 2000 e a carência não estiver cumprida, glosar.
            if (valores[i] > 2000 && !carenciaCumprida[i]) {
                System.out.println("GUIA " + guias[i] + ": [GLOSA AUTOMÁTICA] - Valor alto em período de carência.");
            } else {
                System.out.println("GUIA " + guias[i] + ": [LIBERADA] - Conforme regras de intercâmbio.");
            }
        }
    }
}
