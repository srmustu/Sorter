import java.util.Scanner;
import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Dizinin boyutunu kullanıcıdan al
            System.out.print("Dizinin boyutu n: ");
            int n = scanner.nextInt();

            int[] array = new int[n];

            // Dizinin elemanlarını kullanıcıdan al
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". Elemanı: ");
                array[i] = scanner.nextInt();
            }

            // Diziyi küçükten büyüğe sırala
            Arrays.sort(array);

            // Sıralanmış diziyi yazdır
            System.out.print("Sıralama: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }

}
