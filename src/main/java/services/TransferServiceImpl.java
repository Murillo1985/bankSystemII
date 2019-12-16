package services;

import agencyProperties.Account;

public class TransferServiceImpl implements TransferService {

    @Override
    public boolean transfer(Account origem, Account destino, double valor) {

        double saldoContaOrigem = origem.getBalance();

        if (checkAccountBalance(origem, valor)) {

            origem.setBalance(saldoContaOrigem - valor);

            double saldoContaDestino = destino.getBalance();
            destino.setBalance(saldoContaDestino + valor);

            return true;
        }

        return false;
    }

    private boolean checkAccountBalance(Account conta, double valor) {
        return conta.getBalance()>=valor;
    }
}
