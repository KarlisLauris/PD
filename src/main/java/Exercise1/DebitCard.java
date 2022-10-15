package Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
private static final BigDecimal TOO_MUCH_MONEY = new BigDecimal(10000);
    DebitCard(String number, String owner, int ccv, BigDecimal balance) {
        super(number, owner, ccv, balance);
    }
    @Override
    public void addMoney(BigDecimal amount) throws NotEnoughFundsException {
        BigDecimal newBalance = getBalance().add(amount);
        setBalance(newBalance);
        if (newBalance.compareTo(TOO_MUCH_MONEY) > 0) {
            throw new NotEnoughFundsException("Warning: Too much money");
        }
    }
    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        BigDecimal newBalance = getBalance().subtract(amount);
        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Warning: Not enough funds");
        }
        setBalance(newBalance);
    }

}
