package Rekursion.src.rekursion;

public class EksemplerUndervisning1 {
    public static int fac(int n) {
        int result = 0;
        if (n == 0) {
            result = 1;
        } else {
            result = n * fac(n - 1);
        }
        return result;
    }

    public static int fib(int n) {
        int result = 0;
        if (n <= 1) {
            result = n;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        return result;
    }

    public static int facItr(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result = i * result;
        }
        return result;
    }

    public static int fibItr1(int n) {
        if (n >= 2) {
            int[] fib = new int[n+1];
            fib[0] = 0;
            fib[1] = 1;
            int i = 2;
            while (i <= n) {
                fib[i] = fib[i - 2] + fib[i - 1];
                i++;
            }
            return fib[n];
        } else {
            return n;
        }
    }

    public static int fibItr2(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        int i = 0;
        while (i < n) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
            i++;
        }
        return f0;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            System.out.println("Den rekursive fak " + i + "  er  " + fac(i));
            System.out.println("Den iterative fak " + i + "  er  " + facItr(i));
        }
        for (int i = 0; i <= 20; i++) {
            System.out.println("Den rekursive fib " + i + "  er  " + fib(i));
            System.out.println("Den iterative fib " + i + "  er  " + fibItr1(i));
            System.out.println("Den iterative fib " + i + "  er  " + fibItr2(i));
        }

    }

}
