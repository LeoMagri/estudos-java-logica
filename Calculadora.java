public class CalculadoraFinanceira {
    public static void main(String[] args) {
        // Dados de entrada
        double valorParcial = 1510.53;
        double percentagemParcial = 30.0;
        
        // Regra de negócio: (Valor / Percentagem) * 100
        double valorTotal = (valorParcial / percentagemParcial) * 100;
        
        System.out.println("--- Relatório de Cálculo ---");
        System.out.println("Valor informado: " + valorParcial + " (referente a " + percentagemParcial + "%)");
        System.out.println("O valor total (100%) é: " + valorTotal);
    }
}
