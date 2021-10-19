package Week5.LyyraAndCash;

public class CashRegister {                //86.2
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {

        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {      // PAY WITH CASH
        if (cashGiven >= 2.50) {
            this.cashInRegister += 2.50;
            this.economicalSold++;
            return cashGiven - 2.50;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4.00) {
            this.cashInRegister += 4.00;
            this.gourmetSold++;
            return cashGiven - 4.00;
        } else {
            return cashGiven;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {         //86.3
        boolean canPay = card.pay(2.50);

        if (canPay) {
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {           //86.3
        boolean canPay = card.pay(4.00);

        if (canPay) {
            this.gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {       //86.4 - too simple?
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }

    }
}
