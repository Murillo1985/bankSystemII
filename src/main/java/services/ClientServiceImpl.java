package services;

import agencyProperties.Client;



public class ClientServiceImpl implements ClientService {

    @Override
    public Client register(String name, String nif, String profession) {

        validate(name, nif, profession);

       Client client = new Client(name, nif, profession);
        return client;
    }

    private void validate(String name, String nif, String profession) {
        if(name.equals("")) {
            throw new RuntimeException("Invalid name,");
        }
    }
}
