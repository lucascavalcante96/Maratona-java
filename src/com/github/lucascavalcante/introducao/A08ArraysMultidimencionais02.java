package com.github.lucascavalcante.introducao;

public class A08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {2, 4, 6, 8, 10};
        arrayInt[0] = new int[]{1, 3, 5};
        arrayInt[1] = new int[]{5, 9, 7};
        arrayInt[2] = array;
        for (int[] arrayBase : arrayInt) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Imprimindo o novo Array");
        // inicializando um novo array multidimencional
        int[][] arrayInt2 = {{1,2},{1,2,3}, {1,2,3,4,5,6}};
        for (int[] arrayBase2 : arrayInt2) {
            System.out.println("\n---------");
            for (int num : arrayBase2) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
