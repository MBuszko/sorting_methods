package sorting;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {

    public QuickSort() {

        System.out.println("----------");
        System.out.println("Quick sort example: ");
        System.out.println("----------");
        int[] tab = {1, -10, 5, 2, -666, -23, 6};
        int min = 0;
        int max = tab.length;
        //random index number generator
        int randomIndex = ThreadLocalRandom.current().nextInt(min, max);
        System.out.println("random index: " + randomIndex);
        //declaring argument that helps swap elements
        int temp = 0;
        if (tab.length != 1 && tab.length != 0) {
            int pivot = tab[randomIndex];
            for (int i = 0; i < randomIndex; i++) {

            }

        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);

        }
    }
}
