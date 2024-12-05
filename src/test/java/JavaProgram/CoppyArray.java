package JavaProgram;

public class CoppyArray {

	public static void main(String[] args) {

		int arr1[]= {1,3,5,7,9};
		
		int arr2[]= new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println("The elements of second array is: ");
		
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}

	}

}
