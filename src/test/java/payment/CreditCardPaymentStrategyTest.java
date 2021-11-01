package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CreditCardPaymentStrategyTest {
    CreditCardPaymentStrategy pay = new CreditCardPaymentStrategy();

    @Test
    void pay() {
        assertEquals("The price of your order 5.0 by Credit Card", pay.pay(5.0));
    }
}