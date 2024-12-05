package JavaProgram;

import java.util.Arrays;

public class SortArrayBubbleSort {

	public static void main(String[] args) {
		
		int arr[]= {2,40,70,59,45};
		
		int n = arr.length;
		
		int temp=0;
		
		for(int i=0;i<n;i++) {
			
			for(int j=1;j<n-i;j++) {
				
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		System.out.println("Array after sort is");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		int a[]= {2,40,70,59,45,567,1};
		System.out.println("Array after sort Bu Sort method");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		
	}

}
