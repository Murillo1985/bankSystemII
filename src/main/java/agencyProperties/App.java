package agencyProperties;

public class App {

    public static void main(String[] args) {

        Account murilloAccount = new Account(1, 1);
        Account arthurAccount = new Account(1, 1);
        System.out.println("Murillo Balance Before ->" + murilloAccount.getBalance());
        System.out.println("Arthur Balance Before ->" + arthurAccount.getBalance());

        boolean transferResult = murilloAccount.transfer(50.0, arthurAccount);
        System.out.println("Transfer result->" + transferResult);

        System.out.println("Murillo Balance After ->" + murilloAccount.getBalance());
        System.out.println("Arthur Balance After ->" + arthurAccount.getBalance());


    }
}
