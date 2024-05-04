package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.BDesafioDeProjeto;
import java.util.Scanner;
import java.util.Locale;

public class SimulandoUmaContaBancariaAtravesDoTerminalConsole {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, bem vindo ao Banco Din-Din, para Criar sua conta precisamos de algumas informações! ");
        System.out.println("Por favor, digite o seu Nome Completo " );
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência desejado ! ex:067-8 ");
        String numeroAgencia = scanner.next();
        System.out.println(" precione ENTER Para continuar !" );

        System.out.println("Por favor, digite o número da conta desejado ! ex: 08710970 ");
        int numeroConta = scanner.nextInt();
        System.out.println(" precione ENTER Para continuar !" );

        System.out.println("Por favor, digite o valor disponivel para Deposito ! ");
        double saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso !!! Parabens seus dados ja estao disponivel para consulta ");
        System.out.println("\n \nOlá " + nomeCliente + " \nagência = " +  numeroAgencia + " conta = " + numeroConta +
                "\nseu saldo é no valor de = " + "$" + saldo + "\njá está disponível para saque.");

    }
}
