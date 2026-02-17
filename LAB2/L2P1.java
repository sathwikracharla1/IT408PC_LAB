import java.util.Scanner;

class L2P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements into array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Prime numbers in the array:");
        for (int x : a) {
            if (x <= 1) continue;

            boolean isPrime = true;

            for (int j = 2; j <= x / 2; j++) {
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(x + " ");
            }
        }
    }
}
