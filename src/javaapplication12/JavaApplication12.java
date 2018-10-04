package javaapplication12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaApplication12 {

    public static void main(String[] args) {
        //   do while
        DateFormat dateFormat = new SimpleDateFormat("E, dd M Y");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("#----------------#");
        int a = 5;
        do {
            System.out.println("a = " + a);
            a++;
        } while (a < 10);
        System.out.println("#----------------#");
//    latihan cetak angka 1-100 yang ganjil saja
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
//        cara lain
        for (int i = 1; i <= 100; i++) {
            do {
                System.out.print(i + ", ");
                i += 2;
            } while (i < 100);
//        cara lain
            System.out.println("");
            int c = 0;
            do {
                if (c % 2 == 1) {
                    System.out.print(c + ", ");
                }
                c++;
            } while (c <= 100);
        }
        System.out.println("");
        System.out.println("#----------------#");
//    latihan cetak angka 1-100 yang ganjil saja
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
//        cara lain tapi yang bukan kelipatan 15
        int d = 0;
        do {
            if (d % 2 == 1 && d % 5 == 0 && d % 15 != 0) {
                System.out.print(d + ", ");
            }
            d++;
        } while (d <= 100);
        System.out.println("");
        System.out.println("#----------------#");
        //        loop bersarang
        int jmlLoop = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("jumlah loop = " + jmlLoop);
                jmlLoop++;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("#----------------#");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 11; j++) {
                if (j <= i || j >= 10 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
