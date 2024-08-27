package Exercício11;

public class Empresa {
    private Funcionario[] funcionarios;

    public Empresa() {
        funcionarios = new Funcionario[10];

        // Distribuindo os funcionários
        // 10% Gerentes = 1 funcionário
        funcionarios[0] = new Gerente("Gerente1", "001");

        // 20% Supervisores = 2 funcionários
        funcionarios[1] = new Supervisor("Supervisor1", "002");
        funcionarios[2] = new Supervisor("Supervisor2", "003");

        // 70% Vendedores = 7 funcionários
        for (int i = 3; i < 10; i++) {
            funcionarios[i] = new Vendedor("Vendedor" + (i - 2), "00" + (i + 1));
        }
    }

    // Método para calcular os custos totais e por tipo de funcionário
    public void calcularCustos() {
        double custoTotal = 0;
        double custoGerente = 0;
        double custoSupervisor = 0;
        double custoVendedor = 0;

        for (Funcionario func : funcionarios) {
            double renda = func.calcularRenda();
            custoTotal += renda;

            if (func instanceof Gerente) {
                custoGerente += renda;
            } else if (func instanceof Supervisor) {
                custoSupervisor += renda;
            } else if (func instanceof Vendedor) {
                custoVendedor += renda;
            }
        }

        System.out.println("Custo total da empresa: R$ " + custoTotal);
        System.out.println("Custo com Gerentes: R$ " + custoGerente);
        System.out.println("Custo com Supervisores: R$ " + custoSupervisor);
        System.out.println("Custo com Vendedores: R$ " + custoVendedor);
    }

    public void imprimirFuncionarios() {
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.calcularCustos();
        empresa.imprimirFuncionarios(); // Imprime os detalhes de todos os funcionários
    }
}
