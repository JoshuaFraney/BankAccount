package ssa;

public class Mainline {

	public static void main(String[] args) {
		
		//set up checking account
		Account checking = new Account();
		//set the account id number, account description, and set the initial balance
		checking.accountId = 100;
		checking.description = "My Personal Checking Account";
		checking.balance = 500.00;
		
		
		//print out the initial account details at this time
		String accountUpdate = checking.getDetails();
		System.out.println(checking.getDetails());
		System.out.println("---------------------------------------------------------------------------------------------");
		
		//deposit $200 and print out the account details at this time
		checking.deposit(200.00);
		checking.description = "Depositing $200.00";
		System.out.println(checking.getDetails());
		System.out.println("---------------------------------------------------------------------------------------------");

		//withdraw $600 and print out the account details at this time
		checking.withdraw(600.00);
		checking.description = "Withdrawling $600.00";
		System.out.println(checking.getDetails());
		System.out.println("---------------------------------------------------------------------------------------------");

		//deposit $100 and try to withdraw $300 and print the account details. Cannot withdraw $300 as the balance is only $200
		checking.deposit(100.00);
		checking.withdraw(300.00);
		checking.description = "Depositing $100.00 and attempting to Withdrawal $300.00";
		System.out.println(checking.getDetails());
		System.out.println("--------------------------------------------------------------------------------------------");

		//withdraw $200 and print the account details at this time
		checking.withdraw(200.00);
		checking.description = "Withdrawling $200.00";
		System.out.println(checking.getDetails());
		
		System.out.println("*********************************************************************************************");
		
		//set up the savings account
		Account savings = new Account();
		//set the account id number, account description, and set the initial balance
		savings.accountId = 200;
		savings.description = "My Personal Savings Account";
		savings.balance = 1000.00;
		//print out the initial account details at this time
		System.out.println(savings.getDetails());
		System.out.println("--------------------------------------------------------------------------------------------");
		//withdraw $750 and print the account details at this time
		savings.withdraw(750.00);
		savings.description = "Withdrawling $750.00";
		System.out.println(savings.getDetails());
		System.out.println("--------------------------------------------------------------------------------------------");
		//withdraw $250 and print the account details at this time
		savings.withdraw(250.00);
		savings.description = "Withdrawling $250.00";
		System.out.println(savings.getDetails());
		System.out.println("--------------------------------------------------------------------------------------------");
		//deposit $200 and print the account details at this time
		savings.deposit(200.00);
		savings.description = "Depositing $200.00";
		System.out.println(savings.getDetails());

		System.out.println("*********************************************************************************************");
		//print out final account details
		checking.description = "My Personal Checking Account";
		savings.description = "My Personal Savings Account";
		System.out.println(checking.getDetails() + "\n" + savings.getDetails());
		
		
		//transfer money from one account to another
		double x = 100.00;
		savings.transferTo(checking, 100.00);//to transfer from savings to checking
		//checking.transferTo(savings, x); to transfer from checking to savings
		checking.description = "$100 transferred from Savings";
		savings.description = "$100 transferred to Checking";
	    System.out.println("Checking Account new balance: " + checking.getDetails());
	    System.out.println("Savings Account new balance: " + savings.getDetails());
	}
	

}
