package JavaProgram1;

public class FindNoOfRepeatationsInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,10,20};
		
		int searchNo=20;
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(searchNo==a[i]) {
				count++;
			}
			
			
		}
		
		System.out.println("The no of repetation of search no is: "+count);

	}

}
