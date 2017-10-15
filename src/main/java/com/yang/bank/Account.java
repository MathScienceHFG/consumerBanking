package com.yang.bank;

/**定义了账户的数据结构及操作
 * @author dongquan yang
 * @version 1.0.0
 * @see com.yang.bank.Account#banlance
 */
public class Account {
    private double banlance =0;

    /**存钱操作
     * @param amount
     */
    public void deposit(double amount){
        banlance+=amount;
    }

    /**取钱操作
     * @param amount 需要取出的钱
     * @return 如果余额小于amount返回false，否则返回true
     */
    public boolean withdraw(double  amount) {
        if (banlance>amount){
            banlance-=amount;
            return true;
        }
        return false;
    }

    /**查询余额
     * @return 当前余额
     */
    public double getBanlance() {
        return banlance;
    }
}
