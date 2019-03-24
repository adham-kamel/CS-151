
public class BankAccount implements Comparable<BankAccount>{
	
	private double balance;
	private double[] accounts;
	
	BankAccount(double[] accounts){
		this.accounts = accounts;
	}
	
	BankAccount(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double[] sortArray(){
		double[] sortedArray = new double[accounts.length];
		double temp;
		for (int i = 0; i < accounts.length; i++){
			for (int j = i; j < accounts.length; j++){
				if (accounts[i] > accounts [j]){
					temp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = temp;
					sortedArray = accounts;
				}
			}
		}
		return sortedArray;
	}

	@Override
	public int compareTo(BankAccount that) {
		if (this.balance > that.balance){
			return 1;
		}
		else if (this.balance < that.balance){
			return -1;
		}
		else{
			return 0;
		}
	}

}
