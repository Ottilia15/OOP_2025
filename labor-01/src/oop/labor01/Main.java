package oop.labor01;

public class Main {

    public static void main(String[] args) {

        //0.feladat
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        //1.feladat
        System.out.println("I am Szekely Ottilia and I am from Romania");
        //2.feladat
        String name = "Szekely Ottilia";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        //3.feladat
        String[] result = name.split(" ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        //4.feladat
        System.out.println("Piramis");
        String word = "TREE";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0, i + 1));
        }
        //5.feladat
        double x[] = {7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement(x));

        //6.feladat
        System.out.println("13-as 3.bitje: " + getBit(13, 3));

    }

    public static double maxElement(double array[]) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static byte getBit(int number, int order) {
        return (byte) ((number >> order) & 1);

    }


}
