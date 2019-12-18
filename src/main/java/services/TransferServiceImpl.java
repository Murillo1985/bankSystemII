package services;

import agencyProperties.Account;

public class TransferServiceImpl implements TransferService {

    @Override
    public boolean transfer(Account checkoutAccount, Account destinyAccount, double value) {

        double checkoutAccountBalance = checkoutAccount.getBalance();

        if (checkAccountBalance(checkoutAccount, value)) {

            checkoutAccount.setBalance(checkoutAccountBalance - value);

            double destinyAccountBalance = destinyAccount.getBalance();
            destinyAccount.setBalance(destinyAccountBalance + value);

            return true;
        }

        return false;
    }

    private boolean checkAccountBalance(Account account, double value) {
        return account.getBalance()>=value;
    }
}
