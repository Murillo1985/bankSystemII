package services;

import agencyProperties.Account;

public interface TransferService {

    boolean transfer(Account checkoutAccount, Account destinyAccount, double value);

}
