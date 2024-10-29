
public class Account {
	   String accountNumber ;
	   String accountName;
	   double accountBalance;
	   
	   //Use to Initialize a new account Object
	   Account(String accn,String accName,double amount){
		   accountNumber =accn;
		   accountName =accName;
		   accountBalance = amount;
	   }
	   
	   void deposit(double amount) {
		   if(amount>0)
    	   {
		      accountBalance = accountBalance + amount;
		      System.out.println("Amount Rs."+amount+" added successfully");
		      checkBalance();
    	   }else {
    		   System.out.println("Error: Invalid Amount");
    	   }
	   }
	
       void withdraw(double amount) {
    	   if(amount>0)
    	   {
	    	   if(amount <= accountBalance) {
	    		   accountBalance = accountBalance - amount;
	        	   System.out.println("Amount Rs."+ amount +"widtdrwal successfully");
	        	   checkBalance();
	    	   }else {
	    		   System.out.println("Error: Insufficient Fund");
	    	   }
    	   }
    	   else {
    		   System.out.println("Error: Invalid Amount");
    	   }
	   }
	
	   void checkBalance() {
		   System.out.println("Your account balance is "+accountBalance);
	   }
	   
	   void printAccountDetils() {
		   System.out.println("A/C No :"+accountNumber);
		   System.out.println("A/C Name :"+accountName);
		   System.out.println("Balance :"+accountBalance);
	   }
}
