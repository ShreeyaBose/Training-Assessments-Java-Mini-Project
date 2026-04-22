import java.util.*;

class InSufficientFundsException extends Exception {
    public InSufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private double bal;
    private String accountHolder;
    private ArrayList<Double> history=new ArrayList<>();

    public Account(String name,double bal) {
        this.accountHolder=name;
        this.bal=bal;
    }

    public void deposit(double amt) {
        bal+=amt;
        addTransaction(amt);
        System.out.println("Deposited: "+amt);
    }

    public void withdraw(double amt) throws InSufficientFundsException {
        processTransaction(amt);
        bal-=amt;
        addTransaction(-amt);
        System.out.println("Withdrawn: "+amt);
    }

    public void processTransaction(double amt) throws InSufficientFundsException {
        if (amt<0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amt>bal) {
            throw new InSufficientFundsException("Not enough balance!");
        }
    }

    private void addTransaction(double amt) {
        if (history.size()==5) {
            history.remove(0);
        }
        history.add(amt);
    }

    public void printMiniStatement() {
        System.out.println("\nLast 5 Transactions:");
        for (double t : history) {
            if (t >= 0) {
                System.out.println("Deposit: " + t);
            } 
            else {
                System.out.println("Withdraw: " + (-t));
            }
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: "+bal);
    }
}

public class FinSafeApp {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("Shreeya",1000);
        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.History 4.Balance 5.Exit");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount: ");
                        double dep=sc.nextDouble();
                        acc.deposit(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        double wit=sc.nextDouble();
                        acc.withdraw(wit);
                        break;
                    case 3:
                        acc.printMiniStatement();
                        break;
                    case 4:
                        acc.showBalance();
                        break;

                    case 5:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}