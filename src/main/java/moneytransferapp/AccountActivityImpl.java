package moneytransferapp;

import io.temporal.activity.Activity;

// @@@SNIPSTART money-transfer-project-template-java-activity-implementation
public class AccountActivityImpl implements AccountActivity {

    @Override
    public void withdraw(String accountId, String referenceId, double amount) {

        int x = 0;

        try {
            while (x < 4) {
                Activity.getExecutionContext().heartbeat("ok");
                Thread.sleep(5000);
                x++;
            }
        } catch (Exception e) {
            System.out.println("error");
        }


        System.out.printf(
                "\nWithdrawing $%f from account %s. ReferenceId: %s\n",
                amount, accountId, referenceId
        );
    }

    @Override
    public void deposit(String accountId, String referenceId, double amount) {

        System.out.printf(
                "\nDepositing $%f into account %s. ReferenceId: %s\n",
                amount, accountId, referenceId
        );
        // Uncomment the following line to simulate an Activity error.
        // throw new RuntimeException("simulated");
    }
}
// @@@SNIPEND
