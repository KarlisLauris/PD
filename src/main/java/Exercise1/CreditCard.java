package Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
     private static final BigDecimal LOW_FUNDS = new BigDecimal(100);
    CreditCard(String number, String owner, int ccv, BigDecimal balance) {
        super(number, owner, ccv, balance);
    }
    @Override
    public void addMoney(BigDecimal amount) {
        BigDecimal newBalance = getBalance().add(amount);
        setBalance(newBalance);
    }
    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        BigDecimal newBalance = getBalance().subtract(amount);
        if (newBalance.compareTo(LOW_FUNDS) < 0) {
            throw new NotEnoughFundsException("Warning: Low funds");
        }
        setBalance(newBalance);

    }

}
