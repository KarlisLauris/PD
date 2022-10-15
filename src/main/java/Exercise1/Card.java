package Exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private String number;
    private String owner;
    private int ccv;
    private BigDecimal balance;

    Card(String number, String owner, int ccv, BigDecimal balance) {
        this.number = number;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }
    public abstract void addMoney(BigDecimal amount) throws NotEnoughFundsException;
    public abstract void takeMoney(BigDecimal amount) throws NotEnoughFundsException;

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public int getCcv() {
        return ccv;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
            this.balance = balance;
        }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", owner='" + owner + '\'' +
                ", ccv=" + ccv +
                ", balance=" + balance +
                '}';
    }
}
