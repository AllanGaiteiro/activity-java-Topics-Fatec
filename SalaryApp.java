import models.Salary;
import services.ScanService;

public class SalaryApp {
    public static void main(String[] args) {
        /*
         * 5. Baseado na tabela de Cálculo de Imposto de Renda abaixo, crie um programa
         * que receba o valor do salário bruto do usuário e informe a alíquota aplicada
         * e o valor da parcela a deduzir do Imposto de Renda para o valor inserido.
         * 
         * BASE DE CÁLCULO - ALÍQUOTA - DEDUÇÃO
         * Até 1.903,98 - Isento – R$ 0,00
         * De 1.903,98 até 2.826,65 - 7,5% - R$ 142,80
         * De 2.826,65 até 3.751,05 - 15% - R$ 345,80
         * De 3.751,05 até 4.664,68 - 22,5% - R$ 636,13
         * Acima de 4.664,68 - 27,5 - R$ 869,36
         */

        Salary salary = new Salary(ScanService.requestDouble());
        System.out.println(salary.toString());
    }
}
