package org.example.mercadopago;

import org.example.utils.Token;

public interface IMercadoPagoPayments {
    Token auhthToken();
    void send();
    void receive();
}
