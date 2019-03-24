import java.util.*;
public class BankAccountTester {

	public static void main(String[] args){
		double[] accounts = new double[4];
		BankAccount one = new BankAccount(10.75);
		BankAccount two = new BankAccount(1);
		BankAccount three = new BankAccount(100.2);
		BankAccount four = new BankAccount(11);
		accounts[0] = one.getBalance();
		accounts[1] = two.getBalance();
		accounts[2] = three.getBalance();
		accounts[3] = four.getBalance();
		BankAccount bank = new BankAccount(accounts);
		bank.sortArray();
		for (int i = 0; i < accounts.length; i++){
			if (i < accounts.length - 1)
				System.out.print(accounts[i] + ", ");
			else
				System.out.println(accounts[i]);
		}
	}
}
