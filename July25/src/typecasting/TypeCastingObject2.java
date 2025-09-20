package typecasting;

public class TypeCastingObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ex-1
		Object o=new String("Avdhut");		
		StringBuffer sb=(StringBuffer)o;	//Rule-1, Rule-2,Rule-3
		
		//Ex-2
		String str=new String("Avdhut");
		StringBuffer sb=(String)str;		//Rule-1-failed
		
		Object z=new Integer(5);
	}

}
