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

        Account origem = new Account(1, 1);
        Account destino = new Account(1, 2);

        boolean resultadoTransf = transferService.transfer(origem, destino, 100);

        Assert.assertTrue(resultadoTransf);
        Assert.assertTrue(origem.getBalance() == 0.0);
        Assert.assertTrue(destino.getBalance() == 200.0);
    }

    @Test
    public void transfer_betweenTwoAccounts_withoutBalance_returnsFalse() {

        Account origem = new Account(1, 1);
        Account destino = new Account(1, 2);

        boolean resultadoTransf = transferService.transfer(origem, destino, 101);

        Assert.assertFalse(resultadoTransf);
        Assert.assertTrue(origem.getBalance() == 100.0);
        Assert.assertTrue(destino.getBalance() == 100.0);
    }

}
