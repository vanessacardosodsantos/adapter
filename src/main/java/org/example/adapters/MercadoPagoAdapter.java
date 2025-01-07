package org.example.adapters;

import org.example.mercadopago.MercadoPago;
import org.example.paypal.IPayPalPayments;
import org.example.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Mercado Pago utilizando os métodos padrões do Paypal");
    }

    @Override
    public Token auhthToken() {
        this.token = auhthToken();
        return new Token();
    }

    @Override
    public void paypalPayments() {
        this.mercadoPago.send();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receive();
    }
}
