package Exercício06;

public class teste {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("João", "001");
        FuncionarioEnsinoBasico func2 = new FuncionarioEnsinoBasico("Maria", "002", "Escola Primária");
        FuncionarioEnsinoMedio func3 = new FuncionarioEnsinoMedio("Carlos", "003", "Escola Primária", "Escola Secundária");
        FuncionarioGraduacao func4 = new FuncionarioGraduacao("Ana", "004", "Escola Primária", "Escola Secundária", "Universidade XYZ");

        System.out.println("Funcionário 1: " + func1.getNome() + ", Renda: R$ " + func1.calcularRenda());
        System.out.println("Funcionário 2: " + func2.getNome() + ", Renda: R$ " + func2.calcularRenda());
        System.out.println("Funcionário 3: " + func3.getNome() + ", Renda: R$ " + func3.calcularRenda());
        System.out.println("Funcionário 4: " + func4.getNome() + ", Renda: R$ " + func4.calcularRenda());
    }
}
