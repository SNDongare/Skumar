package JavaProgram;

public class MinElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {100,43,56,67,780};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Minnimum value of any array is: "+min);
	}

}
