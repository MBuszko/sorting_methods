package sorting;


public class SelectionSort {

    public SelectionSort() {

        int[] tab = {1, -10, 5, 2, -666, -23, 6};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 1 + i; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
