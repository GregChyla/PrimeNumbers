import java.util.Scanner;

//Simple prime numbers generator
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 1;

        System.out.println("This is a simple prime number generator");
        System.out.println("Enter max limit of numbers and press enter:");

        maxNumber = scanner.nextInt();
        GeneratePrime genPrime = new GeneratePrime();
        System.out.println(genPrime.generatePrime(maxNumber));
    }
}