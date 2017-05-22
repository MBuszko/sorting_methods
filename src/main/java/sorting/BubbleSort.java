package sorting;

public class BubbleSort {
    public BubbleSort() {

        System.out.println("----------");
        System.out.println("Bubble sort example: ");
        System.out.println("----------");
        int[] tab = {5, -666, 23, -6, 4, 1, 2};
        if (isAlready(tab)) {
            for (int j = 0; j < tab.length; j++) {
                for (int i = 0; i < tab.length - 1; i++) {
                    if (tab[i] > tab[i + 1]) {
                        int temporaryIndex = tab[i];
                        tab[i] = tab[i + 1];
                        tab[i + 1] = temporaryIndex;
                    }
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }


    }

    //checking if list is already sorted
    public static boolean isAlready(int[] x) {
        boolean value = false;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] < x[i + 1]) {
                value = true;
            }
        }
        return value;

    }
}
