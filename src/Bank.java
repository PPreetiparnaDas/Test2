
public class Bank {

	public static void main(String[] args) {
		Account acc1 = new Account("111234545","Rajat Kumar",1000);
		acc1.printAccountDetils();
        acc1.withdraw(500);
        acc1.printAccountDetils();
        acc1.deposit(5000);
        acc1.withdraw(6000);
	}

}
