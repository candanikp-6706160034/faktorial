import javafx.scene.Scene;

import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int angka = in.nextInt();
        int mulai = 2;

        for (int i = angka-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < mulai ; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i != 0) mulai += 2;
        }

        for (int i = 0; i < angka ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < mulai; j++) {
                System.out.print("*");
            }
            System.out.println();
            mulai -= 2;
        }
    }
}