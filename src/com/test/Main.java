package com.test;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        float banyakInputan, total = 0, kali = 1;
        float rata;
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        System.out.println("Program inputan angka");
        System.out.print("Masukkan banyak angka yang akan diinputkan : ");
        banyakInputan = inputUser.nextInt();
        System.out.println("Masukkan angka");
        float[] inputan = new float[(int) banyakInputan];
        for (int i = 0; i < banyakInputan; i++) {
            System.out.print("Inputan " + (i + 1) + " : ");
            inputan[i] = inputUser.nextInt();
            total += inputan[i];
            kali *= inputan[i] ;
        }

        System.out.println();
        printArray(inputan);
        Arrays.sort(inputan);
        System.out.println("Hasil Urutan = " + Arrays.toString(inputan));
        System.out.println("Totalnya adalah : " + total);

        rata = total / banyakInputan;
        System.out.println("Rata Ratanya adalah : " + rata);

        float median;
        if (banyakInputan % 2 == 1) {
            median = inputan[(int) ((banyakInputan + 1) / 2 - 1)];
        } else {
            median = (inputan[(int) (banyakInputan / 2 - 1)] + inputan[(int) (banyakInputan / 2)])/2;
        }

        System.out.println("Mediannya adalah : " + median);
        System.out.println("Hasil kalinya adalah : " + kali);
    }

    private static void printArray(float[] dataArray) {
        System.out.println("Data = " + Arrays.toString(dataArray));
    }
}
