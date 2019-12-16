import agencyProperties.Client;
import org.junit.Assert;
import org.junit.Test;
import services.ClientService;
import services.ClientServiceImpl;

public class ClientServiceTest {

    ClientService clientService = new ClientServiceImpl();

    @Test
    public void client_registerNew_returnsClient () {

        Client newClient = clientService.register("Arthur");

        Assert.assertEquals("Arthur", newClient.getName());
    }

    @Test(expected = RuntimeException.class)
    public void client_registerNew_emptyName_throwsException () {

        clientService.register("");
    }
}
