package Task2;

public class Transaction {
    private String uuid;
    private long sum;
    private Account account;

    public Transaction(String uuid, long sum, Account account) {
        this.uuid = uuid;
        this.sum = sum;
        this.account = account;
    }

    public String getUuid() {
        return uuid;
    }

    public long getSum() {
        return sum;
    }

    public Account getAccount() {
        return account;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    // TODO: добавить геттеры и сеттеры
}
