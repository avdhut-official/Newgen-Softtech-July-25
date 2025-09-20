package basicsofjava;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is a Java Class. System defined class.
		//String is immutable. Original will be as is.
		
		String str=new String();
		str="HeLlo tHeRe i m here m";
		
		System.out.println("Uppper Case : "+str.toUpperCase());
		System.out.println("Lower Case : "+str.toLowerCase());
		System.out.println("Length : "+str.length());
		System.out.println("Character at location : "+str.charAt(21));
		System.out.println(str.concat(" ok fine"));
		System.out.println("Length Update : "+str.length());
		System.out.println(str);
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('e',8));
		
		String str_e=new String();
		str_e="HeLLo tHeRe i m here m";
		
		System.out.println(str.equals(str_e)); //boolean
		System.out.println(str.equalsIgnoreCase(str_e));
		
		System.out.println(str.compareTo(str_e)); //integer
		
		String str3=new String("Ajay");
		String str4=new String("Ajinkya");
		
		System.out.println(str3.compareTo(str4)); //integer
		
	}
}




