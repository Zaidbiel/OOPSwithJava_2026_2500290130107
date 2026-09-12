import java.util.*;

public class PredefinedExecution {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] arr = {1, 2, 3, 4};
            int i, b;
        
            System.out.print("Enter array index: ");
            i = sc.nextInt();
            System.out.print("Enter divisor: ");
            b = sc.nextInt();
            
            System.out.println("Array value: " + arr[i]);
            System.out.println("Division result: " + (arr[i] / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Math Error: Cannot divide by zero.");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Array Error: Invalid index provided.");
        }
        catch (InputMismatchException e) {
            System.out.println("Input Error: Please enter valid integers only.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            sc.close();
            System.out.println("Program closed and resources cleaned up.");
        }
    }
}
