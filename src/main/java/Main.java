import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
      double saldo = 1599.99;
      int opcao = 0;
      System.out.println("**************");
      System.out.println("\nNome do cliente: " + nome);
      System.out.println("Tipo conta: " + tipoConta);
      System.out.println("Saldo atual: " + saldo);
      System.out.println("\n**************");

      String menu = "**Digite sua opção **\n" +
        "1 - Consultar saldo\n" +
        "2 - Transferir valor\n" +
        "3 - Receber valor\n" +
        "4 - Sair\n";


      Scanner leitura = new Scanner(System.in);
      
      while(opcao != 4){
        System.out.println(menu);
        opcao = leitura.nextInt();

        if (opcao == 1){
          System.out.println("O saldo atual é: " + saldo);
        } else if (opcao ==2){
          System.out.println("Qual valor deseja transferir?");
          double valor = leitura.nextDouble();
          if (valor > saldo){
            System.out.println("Não há saldo para realizar transferência");
          }else {
            saldo -= valor;
            System.out.println("Transferência realizada com sucesso");
          }
        }else if (opcao == 3){
          System.out.println("Valor recebido: ");
          double valor = leitura.nextDouble();
          saldo += valor;
          System.out.println("Valor recebido com sucesso");
        }else if (opcao != 4){
          System.out.println("Opção inválida");
        }
      }
    }
}
