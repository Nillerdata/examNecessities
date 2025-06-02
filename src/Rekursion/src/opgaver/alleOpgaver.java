package Rekursion.src.opgaver;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.io.File;
import java.util.Collections;

public class alleOpgaver {
    private static int level = 1;

    public static void main(String[] args) {
        //opg 1
//        System.out.println(factorial(6));
        //opg 2
//        System.out.println(power(3,3));
//        System.out.println(power2(3,3));
        //opg 3
//        System.out.println("opgave 3.1 " + product(19,3));
//        System.out.println("opgave 3.2" + productRus(19,3));
        //opg 4
//        System.out.println(reverse("RANSLIRPA"));
        //opg 5
//        System.out.println(sfd(200,150));
        //opg 6
//        System.out.println(domino(6));

//        String path = "C:\\Users\\niels\\Desktop\\skole\\zipfil lektion\\udpakket";
//        ScanDir(path);
//        int n = ScanDirCount("C:\\Users\\niels\\Desktop\\skole\\zipfil lektion\\udpakket");
//        System.out.println("antal mapper " + n);
    }

    //  opgave 1
    public static int factorial(int n) {
        int result = 0;
        if (n == 0) {
            result = 1;
        } else
            result = n * factorial(n - 1);
        return result;
    }

    //opgave 2 -1
    public static int power(int n, int p) {
        int result = 0;

        if (n * p == 1 || p == 0) {
            result = 1;
        } else {
            result = power(n, p - 1) * n;
        }
        return result;
    }

    //opgave 2 - 2
    public static int power2(int n, int p) {
        int result = 0;

        if (n * p == 1 || p == 0) {
            result = 1;
        } else if (p % 2 == 1 && p > 0) {
            result = power2(n, p - 1) * n;
        } else
            result = power2((n * n), p / 2);
        return result;
    }

    //---------------------------------------
    //opgave 3 - 1
    public static int product(int a, int b) {
        int result = 0;

        if (a == 0) {
            result = 0;
        } else
            result = product((a - 1), b) + b;
        return result;
    }

    //opgave 3-2
    public static int productRus(int a, int b) {
        int result = 0;
        if (a == 0) {
            result = 0;
        } else if (a % 2 == 1 && a >= 1) {
            result = productRus(a - 1, b) + b;
        } else result = productRus(a / 2, b+b);
        return result;
    }

    //----------------------------------------
    //opgave 4


    public static String reverse(String s) {
        String result = "";
        if (s.length() <= 1) {
            result = s;
        } else {
            result = s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));

        }
        return result;
    }

    //---------------------------------------
    //opgave 5
    public static int sfd(int a, int b) {
        int result = 0;
        if (b <= a && b % a == 0) {
            result = a;
        } else if (a < b) {
            result = sfd(b, a);
        } else
            result = sfd(b, a % b);
        return result;
    }

    //_--------------------------------------
    //opgave 6
    public static int domino(int n) {
        int result = 0;

        if (n <= 1) {
            return 1;
        } else {
            result = domino(n - 1) + domino(n - 2);
        }
        return result;
    }

    //opg 7
    public static void ScanDir(String path) {
        System.out.println(level + " [DIR] " + path);
        File file = new File(path);

        String[] names = file.list();

        if (names != null) {
            level++;
            for (String name : names) {

                File file2 = new File(path + "/" + name);
                if (file2.isDirectory()) {
                    ScanDir(path + "/" + name);
                }
            }
            level--;
        }
    }

    public static int ScanDirCount(String path) {
        int count = 0;
        File file = new File(path);
        String[] names = file.list();

        if (names != null) {
            for (String name : names) {
                File file2 = new File(path + "/" + name);
                if (file2.isDirectory()) {
                    count++;
                    count += ScanDirCount(path + "/" + name);
                }
            }
        }
        return count;
    }
}



