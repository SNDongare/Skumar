package JavaProgram1;

public class ArmstrongNumber {

	public static void main(String[] args) {
// Armstrong number is a number that is equal to the sum of cubes of its digits
		
		int num = 153;
        int sum = 0;
        int res;
        int temp;
        temp = num;
        
        while (num > 0) {
            res = num % 10;
            num = num / 10;
            sum = sum + (res * res * res);
        }

        if (temp == sum) {
            System.out.println("The number is an Armstrong number: " + sum);
        } else {
            System.out.println("The given number is not an Armstrong number: " + sum);
        }
    }
}


