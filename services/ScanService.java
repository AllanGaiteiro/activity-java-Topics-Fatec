package services;

import java.util.Scanner;

public class ScanService {
    public static Integer requestInteger() {
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        scan.close();
        return num;
    }

    public static Double requestDouble() {
        Scanner scan = new Scanner(System.in);
        Double num = scan.nextDouble();
        scan.close();
        return num;
    }

}
