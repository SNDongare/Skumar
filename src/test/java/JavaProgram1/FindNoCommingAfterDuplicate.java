package JavaProgram1;

public class FindNoCommingAfterDuplicate {

	public static void main(String[] args) {

		int arr[]= {1,4,2,2,7,5,6,7,2};

		System.out.println(findNumberAfterDuplicate(arr));

	}

	public static Integer findNumberAfterDuplicate(int arr[]) {

		for(int i =0; i<arr.length-1; i++) {

			if(arr[i]==arr[i+1]) {

				if(i+2<arr.length) {
					return arr[i+2];
				}
				else
				{
					return null;
				}
			}
		}
		return null;


	}
}
