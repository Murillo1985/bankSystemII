package services;

import agencyProperties.Account;

public interface TransferService {

    boolean transfer(Account origem, Account destino, double valor);

}
