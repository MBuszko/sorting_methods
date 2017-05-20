package sorting;


public class SelectionSort {

    public SelectionSort() {

        System.out.println("----------");
        System.out.println("Selection sort example: ");
        System.out.println("----------");
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

        System.out.println("----------");
        System.out.println("Advanced selection sort example: ");
        System.out.println("----------");

        peopleToSort person1 = new peopleToSort("Nowak", 32);
        peopleToSort person2 = new peopleToSort("Kowalski", 32);
        peopleToSort person3 = new peopleToSort("Nowak", 44);
        peopleToSort person4 = new peopleToSort("Cartman", 23);
        peopleToSort person5 = new peopleToSort("McShit", 67);
        peopleToSort[] tab2 = {person1, person2, person3, person4, person5};


        for (int i = 0; i < tab2.length; i++) {
            for (int j = 1 + i; j < tab2.length; j++) {
                if (tab2[i].age > tab2[j].age) {
                    peopleToSort temp = tab2[i];
                    tab2[i] = tab2[j];
                    tab2[j] = temp;
                }
            }
        }

        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i].age);
        }
    }
}

class peopleToSort {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;

    public peopleToSort(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

