package org.example.mercadopago;

import org.example.utils.Token;

public class MercadoPago implements IMercadoPagoPayments {
    private Token token;
    @Override
    public Token auhthToken() {
        this.token = auhthToken();
        return new Token();

    }

    @Override
    public void send() {
        System.out.println("Enviando pagamentos via Mercado Pago");
    }

    @Override
    public void receive() {
        System.out.println("Recebendo pagamentos via Mercado Pago");
    }
}
