package sdacanay.cs48.budge_it;

import java.util.ArrayList;

public class Budget {

	Budget(float budget){
		this.budget=budget;
		this.balance=budget;
	}
	/**
	 * @param args
	 */
	
	/* getBalance() will get the user's monthly "balance" by subtracting transactions
	 * from the initial budget that was set
	 */
	float getBalance(){
		return this.balance;

	}
	void addTransaction(float amount, int date){
		Trans.add(0, new Transaction(amount,date));
		this.balance-=amount;
	}
	/*getPercentage() will return a decimal percentage of what's left in your monthly 
	 * budget
	 */
	float getPercentage(){
		return this.balance/this.budget;
	}
	
	/*
	 * setBudget(float budget) will be used in setting the initial monthly budget
	 */
	void setBudget(float budget){
		this.budget = budget;
	}
	
	/*
	 * gives access to monthly budget
	 */
	float getBudget(){
		return this.budget;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private
		ArrayList<Transaction> Trans = new ArrayList<Transaction>();
		float balance;
		float budget;
		

	
	
	
}
