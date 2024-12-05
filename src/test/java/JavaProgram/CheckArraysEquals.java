package JavaProgram;

public class CheckArraysEquals {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		//Approach1 By using the Arrays Equal Method
		/*
		 * boolean status = Arrays.equals(a1, a2);
		 * 
		 * if(status==true) { System.out.println("The Arrays Are Equals"); } else {
		 * System.out.println("The Arrays arre not equals"); }
		 */
		
		
		
		//Apprach 2 
		boolean status=true;
		if(a1.length==a2.length) {
			
			for(int i=0;i<a1.length;i++) 
			{
				if(a1[i]!=a2[i])
				{
					status=false;
				}
			}
		}
		else
		{
			status=false;
			
		}
		
		if(status==true) {
			System.out.println("The Arrays Are Equals");
		}
		else
		{
			System.out.println("The Arrays arre not equals");
		}
		
	}

}
