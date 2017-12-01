package be.vdab.training.domains;

import java.util.Scanner;

public class KeyboardUtility {
    public static int readInt() {

        Scanner keyboard = new Scanner(System.in);
        int myInteger = keyboard.nextInt();
        return myInteger;

    }

    public static StringBuilder readString() {

        Scanner keyboard = new Scanner(System.in);
        String text1 = keyboard.nextLine();
        return new StringBuilder(text1);
    }

    public static StringBuilder readDate() {

        Scanner keyboard = new Scanner(System.in);
        String text2 = keyboard.nextLine();
        return new StringBuilder(text2);

    }
}

