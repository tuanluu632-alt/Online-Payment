package Demo;

import Payments.BankTransferPayment;
import Payments.CreditCardPayment;
import Payments.EWalletPayment;
import Payments.PayPalPayment;
import Payments.PaymentService;

public class Main {
    public static void main(String[] args) {

        PaymentService service =
            new PaymentService(new CreditCardPayment());
        service.pay(500000);

        service.setStrategy(new PayPalPayment());
        service.pay(300000);

        service.setStrategy(new EWalletPayment());
        service.pay(200000);

        service.setStrategy(new BankTransferPayment());
        service.pay(1000000);
    }
}