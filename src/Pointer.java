
public class Pointer {
	
	public static void changeRValue(StringBuffer sb){
	    sb = new StringBuffer("helllllo"); /*attempt to assign the reference
	                                        to a new object*/
	}	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 StringBuffer sb = new StringBuffer("hi");     //Create a new string buffer
		    changeRValue(sb);                             //Call changeRValue
		    System.out.println(sb.toString());            //Prints "hi" not "hello"
		
		
	}

}
