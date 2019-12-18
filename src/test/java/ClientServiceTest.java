import agencyProperties.Client;

import org.junit.Assert;
import org.junit.Test;
import services.ClientService;
import services.ClientServiceImpl;

public class ClientServiceTest {

    ClientService clientService = new ClientServiceImpl();

    @Test
    public void client_registerNewName_NewNif_NewProfession_returnsClient () {

        Client newClient = clientService.register("Arthur", "333333333", "Programmer");

        Assert.assertEquals("Arthur", newClient.getName());
        Assert.assertEquals("333333333", newClient.getNif());
        Assert.assertEquals("Programmer", newClient.getProfession());
    }
    
    @Test
    public void client_registerNewName_And_NewNif_returnsClient () {

        Client newClient = clientService.register("Arthur", "333333333", "Programmer");

        Assert.assertEquals("Arthur", newClient.getName());
        Assert.assertEquals("333333333", newClient.getNif());
    }
      
        
    @Test(expected = RuntimeException.class)
    public void client_registerNew_emptyName_throwsException () {

        clientService.register("", "333333333", "Programmer");
    }
    
    @Test(expected = RuntimeException.class)
    public void client_registerNew_emptyNif_throwsException () {

        clientService.register("Arthur", "", "Programmer");
    }
    
    @Test(expected = RuntimeException.class)
    public void client_registerNew_emptyProfession_throwsException () {

        clientService.register("Arthur", "333333333", "");
    }
    
}
