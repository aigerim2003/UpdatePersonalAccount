public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {
        try {
            PersonalAccount pa = new PersonalAccount(9000, "Aiperi");
            pa.deposit(9000);
            pa.deposit(9000);
            pa.withdraw(2000);
            pa.withdraw(2000);
            System.out.println(pa.getBalance());
            pa.printTransactionHistory();
        } catch (InsufficientBalanceException e){
            System.out.println("Error:" + e.getMessage());
        }

    }
}