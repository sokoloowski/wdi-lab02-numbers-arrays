package lab2;

public class Main {
    public static void main(String[] args) {
        // if/else
        if (3 <= 1) {
            System.out.println("3 > 1");
        } else {
            System.out.println("3 <= 1");
        }

        // while
        int i = 0;
        while (i < 10) {
            System.out.println("Wartosc i w petli: " + i);
            i++;
        }

        // operacje na liczbach
        System.out.println("Zadanie 1:");
        zadanie1();
        System.out.println();

        System.out.println("Zadanie 2:");
        zadanie2();
        System.out.println();

        System.out.println("Zadanie 3:");
        zadanie3();
        System.out.println();

        // sortowanie
        int[] arr = {34, 55, 66, 1, 6, 12, 56, 59, 5};

        int[] sorted4 = zadanie4(arr);
        System.out.println("Zadanie 4:");
        for (int num : sorted4) {
            System.out.println(num);
        }
        System.out.println();

        System.out.println("Zadanie 5:");
        int[] sorted5 = zadanie5(arr);
        for (int num : sorted5) {
            System.out.println(num);
        }
        System.out.println();

        System.out.println("Zadanie 6:");
        int[] sorted6 = zadanie6(arr);
        for (int num : sorted6) {
            System.out.println(num);
        }
        System.out.println();

        System.out.println("Nieposortowana tablica:");
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void zadanie1() {
        for (int i = 100; i <= 999; i++) {
            int l3 = i % 10;
            int l2 = (i % 100) / 10;
            int l1 = i / 100;
            if (i == (Math.pow(l1, 3) + Math.pow(l2, 3) + Math.pow(l3, 3))) {
                System.out.println(i);
            }
        }
    }

    public static void zadanie2() {
        for (int i = 10; i <= 99; i++) {
            int l2 = i % 10;
            int l1 = i / 10;
            if ((Math.pow(i, 3) * 2) % (l1 + l2) == 0) {
                System.out.println(i);
            }
        }
    }

    public static void zadanie3() {
        for (int i = 1000; i <= 9999; i++) {
            int l4 = i % 10;
            int l3 = (i % 100) / 10;
            int l2 = (i % 1000) / 100;
            int l1 = i / 1000;
            if (l1 == l4 && l2 == l3) {
                System.out.println(i);
            }
        }
    }

    public static int[] zadanie4(int[] array) {
        int[] arr = array.clone();
        int n = arr.length - 1;
        while (n > 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            n--;
        }
        return arr;
    }

    public static int[] zadanie5(int[] array) {
        int[] arr = array.clone();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] zadanie6(int[] array) {
        int[] arr = array.clone();
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;
            }
        }
        return arr;
    }
}