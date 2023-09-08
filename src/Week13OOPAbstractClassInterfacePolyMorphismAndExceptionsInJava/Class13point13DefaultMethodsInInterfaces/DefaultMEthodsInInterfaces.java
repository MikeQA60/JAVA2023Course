package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point13DefaultMethodsInInterfaces;

public class DefaultMEthodsInInterfaces {
    public static void main(String[] args) {
        BankingTransaction withdrawal = new WithdrawalTransaction();
        BankingTransaction deposit = new DepositTransaction();

        //runtime polymorphism
        withdrawal.execute();
        withdrawal.logTransaction();


        deposit.execute();;
        deposit.logTransaction();
    }
}

interface BankingTransaction {
    void execute();
    default void logTransaction() {
        System.out.println("Logging transaction ....");
    }

}

class WithdrawalTransaction implements BankingTransaction {
    @Override
    public void execute() {
        System.out.println("Performing withdrawal transaction");

    }
}


class DepositTransaction implements BankingTransaction {
    @Override
    public void execute() {
        System.out.println("Performing deposit transaction");

    }

    @Override
    public void logTransaction() {

    }
}
