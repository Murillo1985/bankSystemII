import agencyProperties.Account;
import jdk.nashorn.internal.ir.CallNode;
import org.junit.Assert;
import org.junit.Test;
import services.TransferService;
import services.TransferServiceImpl;

public class TransferServiceTest {

    TransferService transferService = new TransferServiceImpl();

    @Test
    public void transfer_betweenTwoAccounts_withBalance_returnsTrue() {

        Account checkoutAccount = new Account(1, 1);
        Account destinyAccount = new Account(1, 2);

        boolean transferResult = transferService.transfer(checkoutAccount, destinyAccount, 100);

        Assert.assertTrue(transferResult);
        Assert.assertTrue(checkoutAccount.getBalance() == 0.0);
        Assert.assertTrue(destinyAccount.getBalance() == 200.0);
    }

    @Test
    public void transfer_betweenTwoAccounts_withoutBalance_returnsFalse() {

        Account checkoutAccount = new Account(1, 1);
        Account destinyAccount = new Account(1, 2);

        boolean transferResult = transferService.transfer(checkoutAccount, destinyAccount, 101);

        Assert.assertFalse(transferResult);
        Assert.assertTrue(checkoutAccount.getBalance() == 100.0);
        Assert.assertTrue(destinyAccount.getBalance() == 100.0);
    }

}
