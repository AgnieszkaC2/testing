public class QuickSortMoj {
    public static void main(String[] args) {
        int tablica[] = {100, 120, 97, 114, 112, 106, 105};
        System.out.println("Tablica przed posortowaniem: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        qs(tablica, 0, tablica.length - 1);

        System.out.println("Tablica po postowaniu: ");
        for (int z = 0; z < tablica.length; z++) {
            System.out.print(tablica[z] + " ");
        }
    }

    private static void qs(int[] zbior, int left, int right) {
        int i, j, x, y;
        i = left;
        j = right;
        x = zbior[(left + right) / 2];

        do {
            while (x > zbior[i] && i < right) i++;
            while (x < zbior[j] && j > left) j--;
            if (i <= j) {
                y = zbior[i];
                zbior[i] = zbior[j];
                zbior[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (j > left) {
            qs(zbior, left, j);
        }
        if (i < right) {
            qs(zbior, i, right);
        }


    }
}





