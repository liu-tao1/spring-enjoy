package com.enjoy.example.syn;

/**
 * 账户操作类
 *
 * @author liutao
 * @since 2020/7/24
 */
public class AccountOperator implements Runnable {
    private Account account;

    public AccountOperator(Account account) {
        this.account = account;
    }

    public void run() {
        synchronized (account) {
            account.deposit(500);
            account.withdraw(500);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }

    public static void main(String[] args) {
        Account account = new Account("zhang san", 10000.0f);
        AccountOperator accountOperator = new AccountOperator(account);

        final int THREAD_NUM = 5;
        Thread threads[] = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            threads[i] = new Thread(accountOperator, "Thread" + i);
            threads[i].start();
        }
        /**
         * Thread0:10000.0
         * Thread4:10000.0
         * Thread3:10000.0
         * Thread2:10000.0
         * Thread1:10000.0
         */
    }
}
