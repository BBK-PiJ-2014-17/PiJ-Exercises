public class BankAccount {

    private final Object LOCK = new Object();
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    //public synchronized void deposit(int money) {
    public void deposit(int money) {

        synchronized (LOCK) {
            balance = balance + money;
        }

    }

    //public synchronized int retrieve(int money) {
    public int retrieve(int money) {

        synchronized (LOCK) {
            int result = 0;
            if (balance > money) {
                result = money;
            } else {
                result = balance;
            }
            balance = balance - result;
            return result;
        }

    }

}
