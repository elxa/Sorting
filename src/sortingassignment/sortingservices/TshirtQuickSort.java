package sortingassignment.sortingservices;

import java.util.ArrayList;
import sortingassignment.models.Tshirt;


public class TshirtQuickSort {

    public void quickSortRecursion(ArrayList<Tshirt> arr, int low, int high, int typeOfSort) {
        // typeofSort = 1, Size
        // typeofSort = 2, Color
        // typeofSort = 3, Fabric
        // order = 1, ASC
        // order = 2, DESC        
        int pi = partition(arr, low, high, typeOfSort);
        if (low < pi - 1) {
            quickSortRecursion(arr, low, pi - 1, typeOfSort);
        }
        if (pi < high) {
            quickSortRecursion(arr, pi, high, typeOfSort);
        }
    }

    public int partition(ArrayList<Tshirt> arr, int low, int high, int typeOfSort) {

        int mid = (low + high) / 2;
        Tshirt pivot = arr.get(mid);

        if (typeOfSort == 1) {
            int p = pivot.getSize().ordinal();

            while (low <= high) {
                while (arr.get(low).getSize().ordinal() < p) {
                    low++;
                }
                while (arr.get(high).getSize().ordinal() > p) {
                    high--;
                }

                if (low <= high) {
                    Tshirt temp = arr.get(low);
                    arr.set(low, arr.get(high));
                    arr.set(high, temp);

                    low++;
                    high--;
                }
            }
            return low;

        }
        else if (typeOfSort == 2) { //sort color
            int p = pivot.getColor().ordinal();

            while (low <= high) {
                while (arr.get(low).getColor().ordinal() < p) {
                    low++;
                }
                while (arr.get(high).getColor().ordinal() > p) {
                    high--;
                }

                if (low <= high) {
                    Tshirt temp = arr.get(low);
                    arr.set(low, arr.get(high));
                    arr.set(high, temp);

                    low++;
                    high--;
                }
            }
            return low;

        }
        else if (typeOfSort == 3) { //sort fabric
            int p = pivot.getFabric().ordinal();

            while (low <= high) {
                while (arr.get(low).getFabric().ordinal() < p) {
                    low++;
                }
                while (arr.get(high).getFabric().ordinal() > p) {
                    high--;
                }

                if (low <= high) {
                    Tshirt temp = arr.get(low);
                    arr.set(low, arr.get(high));
                    arr.set(high, temp);

                    low++;
                    high--;
                }
            }
            return low;

        }
        return 0;

    }
}
