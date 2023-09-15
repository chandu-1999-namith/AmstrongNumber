package chandu;


	import java.util.Scanner;
	public class AmstrongNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();
	        
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	    
	    // Function to check if a number is an Armstrong number
	    public static boolean isArmstrong(int num) {
	        int originalNumber, remainder, result = 0;
	        
	        originalNumber = num;
	        
	        while (originalNumber != 0) {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3); // Change 3 to the number of digits in the number
	            originalNumber /= 10;
	        }
	        
	        return result == num;
	    }
	}


