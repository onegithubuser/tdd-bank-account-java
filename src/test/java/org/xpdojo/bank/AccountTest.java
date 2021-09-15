package org.xpdojo.bank;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;


public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();

        account.deposit(100);

        Assert.assertEquals(account.balance, 100);
    }

    @Test
    public void depositTwoAmountsAndIncreaseTheBalanceToTheSum() {
        Account account = new Account();
        int firstAmount = 100;
        int secondAmount = 20;

        account.deposit(firstAmount);
        account.deposit(secondAmount);

        Assert.assertEquals(account.balance, firstAmount + secondAmount);
    }
}
