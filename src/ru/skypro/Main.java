package ru.skypro;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + ": ");
            if (i % 3 == 0) {
                System.out.println(i + " :ping");
            }
            if (i % 5 == 0) {
                System.out.println(i + " :pong");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ":ping pong ");
            }
            System.out.println();
            int a = 0;
            int b = 1;
            for (int y = 0; y <= 4; y++) {
                System.out.print(a + " " + b + " ");
                a = a + b;
                b = b + a;
            }
        }
    }
}



