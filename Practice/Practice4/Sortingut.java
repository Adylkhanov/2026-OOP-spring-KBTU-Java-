package Practice.Practice4;

public class Sortingut {

    public static void countingSort(int[] a) {

        int max = 0;
        for (int i : a)
            if (i > max)
                max = i;

        int[] b = new int[max + 1];

        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }

        System.out.print("Sorted: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i]; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
