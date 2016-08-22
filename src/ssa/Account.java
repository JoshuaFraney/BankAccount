package ssa;

import java.text.DecimalFormat;

// A bank account
	class Account {
		
	  int accountId; // unique identifier for the account
	  String description; // a user defined name for the account
	  double balance; // the amount in the account.
	  
		//format the decimals to 2 decimal places
		DecimalFormat df = new DecimalFormat("####0.00");

	  // returns the account info as a string
	  String getDetails()  {
		  return "Account ID is " + accountId + ", Description is " + description 
	      + ", and Current Balance is $" + df.format(balance); 
	  }
	  // deposit into the account
	  double deposit(double amount) {
	    balance += amount;
	    return balance;
	  }
	  // withdraw from the account, but cannot go negative
	  double withdraw(double amount) {
	    if(amount > balance) {
	      System.out.println("Insufficient funds! Unable to complete the requested withdrawal.");
	    } else {
	      balance -= amount;
	    }
	    return balance;
	}
	  
	  public void transferTo(Account bank, double x) {
		    if (x <= this.balance) {
		        withdraw(x);
		        bank.deposit(x);
		        System.out.println("\nTransfer succesful. Transfered: $" + df.format(x));
		    } else { //does not need to be else if, because if not <=, it MUST be >.
		        System.out.println("\nTransfer failed, Insufficient Balance!");
		    }
		}
	}