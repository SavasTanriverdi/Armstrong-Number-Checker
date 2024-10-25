import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;
        int n = 0;

        // Basamak sayısını bul
        while (originalNumber != 0) {
            originalNumber /= 10;
            n++;
        }

        originalNumber = number;

        // Her basamağın n. kuvvetini hesapla ve toplama ekle
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, n);
            originalNumber /= 10;
        }

        // Armstrong sayısı olup olmadığını kontrol et
        if (result == number) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }

        scanner.close();
    }
}
