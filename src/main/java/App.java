import agencyProperties.Account;
import jdk.nashorn.internal.ir.CallNode;
import services.TransferService;
import services.TransferServiceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Account murilloAccount = new Account(1, 1);
        Account arthurAccount = new Account(1, 2);
        Account anaAccount = new Account(1, 3);

        List<Account> database = new ArrayList<>();
        database.add(murilloAccount);
        database.add(arthurAccount);
        database.add(anaAccount);

        /*
        System.out.println("Murillo Balance Before ->" + murilloAccount.getBalance());
        System.out.println("Arthur Balance Before ->" + arthurAccount.getBalance());

        boolean transferResult = murilloAccount.transfer(50.0, arthurAccount);
        System.out.println("Transfer result->" + transferResult);

        System.out.println("Murillo Balance After ->" + murilloAccount.getBalance());
        System.out.println("Arthur Balance After ->" + arthurAccount.getBalance());
        */

        //
        //faz pelo menos uma vez(menu), até opção sair

        Scanner scanner = new Scanner(System.in);
        TransferService transferService = new TransferServiceImpl();
        String option = "";
        do {
            System.out.println("Spectacular APP");

            System.out.println("Numero Conta a debitar:");
            //ler stdin
            int origin = scanner.nextInt();
            Account checkoutAccount = findAccountByNumber(database, origin);

            System.out.println("Numero Conta a creditar:");
            int destination = scanner.nextInt();
            Account destinationAccount = findAccountByNumber(database, destination);

            System.out.println("Montante:");
            double ammount = scanner.nextDouble();

            //faz transferencia
            transferService.transfer(checkoutAccount, destinationAccount, ammount);
            //imprime relatorio
            System.out.println("Saldo origem: " + checkoutAccount.getBalance());

            System.out.println("Saldo destino: " + destinationAccount.getBalance());

            System.out.println("q para sair");
            option = scanner.next();

        } while (!option.equals("q"));

        System.out.println("Bye Bye...");
    }

    private static Account findAccountByNumber(List<Account> database, int origin) {

        for (Account account : database) {
            if (account.getNumber() == origin) {
                return account;
            }
        }
        return null;
    }
}
