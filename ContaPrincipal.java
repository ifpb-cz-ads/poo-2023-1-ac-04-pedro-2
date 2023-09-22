import java.util.Scanner;

public class ContaPrincipal{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    int op;
    Conta conta = new Conta();
    do {
        System.out.println("---------MENU---------");
        System.out.println("Digite a opcão desejada");
        System.out.println("Digite 1 para despositar");
        System.out.println("Digite 2 para Sacar");
        op = sc.nextInt();
        switch (op) {
            case 0:{
                System.out.println("Tudo certo! Até mais!");
                break;
            }
            case 1:{
                System.out.println("Informe o valor para deposito: ");
                float valor=sc.nextFloat();
                conta.depositar(valor);
                break;
            }
            case 2:{
                System.out.println("informe o valor para saque: ");
                float valor=sc.nextFloat();
                if (conta.sacar(valor)) {
                    System.out.println("Sacado com sucesso!");
                }
                else{
                    System.out.println("Saldo insuficiente");
                }
                break;
            }
            default:
            System.out.println("Informe os numeros 1, 2 ou 0");
                break;
        }        
    }while(op != 0);

    System.out.println("Programa encerrado!");
}
}
