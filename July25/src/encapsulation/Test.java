package encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank d1=new Bank();
		d1.setAccountno(25846660);
		int acc=d1.getAccountno();
		System.out.println("Account No - "+acc);
		
		d1.setBalance(250000);
		int bal=d1.getBalance();
		System.out.println("Balance - "+bal);
	}

}
