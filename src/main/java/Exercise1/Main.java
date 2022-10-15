package Exercise1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws NotEnoughFundsException {
        DebitCard debitCard = new DebitCard("123456789", "John", 123, new BigDecimal(1000));
        CreditCard creditCard = new CreditCard("987654321", "John", 321, new BigDecimal(1000));

        debitCard.addMoney(new BigDecimal(1000));
        creditCard.addMoney(new BigDecimal(1000));

        debitCard.takeMoney(new BigDecimal(1000));
        creditCard.takeMoney(new BigDecimal(1000));
        try{
            debitCard.takeMoney(new BigDecimal(1000));
            creditCard.takeMoney(new BigDecimal(1000));
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(debitCard);
        System.out.println(creditCard);

    }
}