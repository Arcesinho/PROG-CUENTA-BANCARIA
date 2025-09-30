import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        BankAccount cuenta = new BankAccount(0);
        System.out.println("Hola, que quieres hacer?\n1:Añadir dinero \n2: Retirar dinero \n3: Salir");
        Scanner sc1 = new Scanner(System.in);
        int op = -1;

        while (op != 3){
            System.out.println("Hola, que quieres hacer?\n1:Añadir dinero \n2: Retirar dinero \n3: Salir");
            op = sc1.nextInt();
            if (op == 1){
                System.out.println("Introduce el importe a añadir: ");
                Scanner sc2 = new Scanner(System.in);
                double amount = sc2.nextDouble();
                cuenta.addBalance(amount);
                System.out.println("Este es tu nuevo balance: " + cuenta.getBalance());
            }
            if (op == 2){
                System.out.println("Introduce el importe a retirar: ");
                Scanner sc3 = new Scanner(System.in);
                double amount = sc3.nextDouble();
                cuenta.subBalance(amount);
                System.out.println("Este es tu nuevo balance: " + cuenta.getBalance());
            }
        }


    }
}
