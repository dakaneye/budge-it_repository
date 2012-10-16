package sdacanay.cs48.budge_it;

import android.annotation.SuppressLint;



@SuppressLint("UseValueOf")
public class Transaction {

	/**
	 * @param args
	 */


	Transaction(float amount, int date, String title) {
		this.amount=amount;
		this.date=date;
		this.title=title;
	}
	
	Transaction(float amount, int date)
	{
		this.amount=amount;
		this.date=date;
		Integer i = new Integer(date);
		this.title="mytransaction"+i;
	}
	float getAmount(){
		return this.amount;
	}
	void setAmount(float amount){
		this.amount=amount;
	}
	
	int getDate(){
		return this.date;
	}
	
	String getTitle(){
		return this.title;
	}
	void setTitle(String title){
		this.title = title;
	}
	
	private
		float amount;
		int date;
		String title;
		

}

