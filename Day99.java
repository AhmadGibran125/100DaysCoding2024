package Coding100day;

import java.util.Scanner;

public class Day99 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kalkulator Sederhana");

        double a = in.nextDouble();

        char op = in.next().charAt(0);

        double b = in.nextDouble();

        double hasil = 0;
        switch (op) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Tidak Dapat dibagi dengan 0");
                    return;
                } else {
                    hasil = a / b;
                }
                break;
            case '%':
                    hasil = (a / b)*100;
                    System.out.println(hasil+"%");
                    return;
               
            default:
                System.out.print("Errorrrrrr");
                return;
        }
        char has = in.next().charAt(0);
        switch (has) {
            case '=':
                System.out.println(hasil);
                break;
            default:
                System.out.println("Hanya Melakukan sekali operator saja");
                return;
        }
        in.close();
    }
}
