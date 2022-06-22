package managment;

public class Budget {
    private int money;

    public Budget(int money) {
        this.money = money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void removeMoney(int money){
        this.setMoney(this.getMoney()-money);
    }

    public int getMoney() {
        return money;
    }
}