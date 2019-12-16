package services;

import agencyProperties.Client;
import com.sun.deploy.util.SessionState;

public class ClientServiceImpl implements ClientService {

    @Override
    public Client register(String nome) {

        validate(nome);

       Client client = new Client(nome);
        return client;
    }

    private void validate(String nome) {
        if(nome.equals("")) {
            throw new RuntimeException("Invalid name");
        }
    }
}
