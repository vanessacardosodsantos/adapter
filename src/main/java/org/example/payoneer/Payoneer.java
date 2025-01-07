package org.example.payoneer;

import org.example.utils.Token;

public class Payoneer implements IPayoneerPayments {
    private Token token;

    @Override
    public Token auhthToken() {
        this.token = auhthToken();
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Payoneer");

    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payoneer");
    }
}
