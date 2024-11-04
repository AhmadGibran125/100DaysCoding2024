package Coding100day;

public class Day64 {

    public static void main(String[] args) {
        luarLOOP:
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop Luar " + i);

            tengahLOOP:
            for (int j = 0; j < 5; j++) {
                System.out.println("Loop Tengah " + j);

                dalamLOOP:
                for (int k = 0; k < 5; k++) {
                    System.out.println("Loop Dalam " + k);
                    if (k == 3) {
                        System.out.println("loop Dalam selesai");
                        break luarLOOP;
                    }
                    if (k == 3) {
                        System.out.println(" ");
                        break tengahLOOP;
                    }
                }
            }
        }
    }
}
