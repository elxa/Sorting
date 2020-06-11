package sortingassignment;

import elegxoi.ElegxoiMetablhtwn;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sortingassignment.models.Tshirt;
import sortingassignment.sortingservices.BucketSort;
import sortingassignment.sortingservices.TshirtBubbleSort;
import sortingassignment.sortingservices.TshirtBubbleSortDesc;
import sortingassignment.sortingservices.TshirtQuickSort;
import sortingassignment.sortingservices.TshirtQuickSortDesc;

public class SortingAssignment {

    List<Tshirt> tshirts;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();
        int noOfShirts = 5;
        int divisor = 1;
        ArrayList<Tshirt> orig_mytshirts = generateTShirts(noOfShirts);
        ArrayList<Tshirt> mytshirts = new ArrayList<>(orig_mytshirts);

        System.out.println("*****************************Bucket Sort*****************************************************");
        BucketSort bus = new BucketSort(mytshirts, 1, 2);
        ArrayList<Tshirt> ss = bus.sort(mytshirts, 1, 2);
        showTShirts(ss);

        System.out.println("*************************Make your choise********************************");
        System.out.println("Give the sorting method 1)QuickSort 2)BubbleSort");
        int choise = 0;
        choise = em.ElegxosGiaIntMetablhth(choise);
        while (choise < 1 || choise > 2) {
            System.out.println("Wrong choise retry");
            choise = Integer.parseInt(scan.nextLine());
        }

        switch (choise) {
            case 1:
                System.out.println("*************************QuickSort********************************");
                System.out.println("Give 1)For ascending order 2) For Descending order");
                int choiseTypeOrder = 0;
                choiseTypeOrder = em.ElegxosGiaIntMetablhth(choiseTypeOrder);
                while (choiseTypeOrder < 1 || choiseTypeOrder > 2) {
                    System.out.println("Wrong choise retry");
                    choiseTypeOrder = Integer.parseInt(scan.nextLine());
                }

                if (choiseTypeOrder == 1) {
                    TshirtQuickSort qs = new TshirtQuickSort();
                    System.out.println("********************Ascending order**************************************");
                    System.out.println("Give for sorting 1)size 2)colour 3)fabric ");
                    int sortchoise = 0;
                    sortchoise = em.ElegxosGiaIntMetablhth(sortchoise);
                    while (sortchoise < 1 || sortchoise > 3) {
                        System.out.println("Wrong choise retry");
                        sortchoise = Integer.parseInt(scan.nextLine());
                    }
                    System.out.println(sortchoise);

                    qs.quickSortRecursion(mytshirts, 0, mytshirts.size() - 1, sortchoise);
                    showTShirts(mytshirts);

                } else {
                    TshirtQuickSortDesc dqs = new TshirtQuickSortDesc();
                    System.out.println("********************Descending order**************************************");
                    System.out.println("Give for sorting 1)size 2)colour 3)fabric ");
                    int sortchoise = 0;
                    sortchoise = em.ElegxosGiaIntMetablhth(sortchoise);
                    while (sortchoise < 1 || sortchoise > 3) {
                        System.out.println("Wrong choise retry");
                        sortchoise = Integer.parseInt(scan.nextLine());
                    }

                    dqs.quickSortRecursion(mytshirts, 0, mytshirts.size() - 1, sortchoise);
                    showTShirts(mytshirts);
                }
                break;

            case 2:
                System.out.println("*************************BubbleSort********************************");
                TshirtBubbleSort bs = new TshirtBubbleSort();
                System.out.println("Give 1)For ascending order 2) For Descending order");
                int choiseTypeOrder2 = 0;
                choiseTypeOrder2 = em.ElegxosGiaIntMetablhth(choiseTypeOrder2);
                while (choiseTypeOrder2 < 1 || choiseTypeOrder2 > 2) {
                    System.out.println("Wrong choise retry");
                    choiseTypeOrder = Integer.parseInt(scan.nextLine());
                }

                if (choiseTypeOrder2 == 1) {
                    TshirtQuickSort qs = new TshirtQuickSort();
                    System.out.println("********************Ascending order**************************************");
                    System.out.println("Give for sorting 1)size 2)colour 3)fabric ");
                    int sortchoise2 = 0;
                    sortchoise2 = em.ElegxosGiaIntMetablhth(sortchoise2);
                    while (sortchoise2 < 1 || sortchoise2 > 3) {
                        System.out.println("Wrong choise retry");
                        sortchoise2 = Integer.parseInt(scan.nextLine());
                    }

                    bs.bubbleSort(mytshirts, sortchoise2);
                    showTShirts(mytshirts);

                } else {
                    TshirtBubbleSortDesc bsd = new TshirtBubbleSortDesc();
                    System.out.println("********************Descending order**************************************");
                    System.out.println("Give for sorting 1)size 2)colour 3)fabric ");
                    int sortchoise = 0;
                    sortchoise = em.ElegxosGiaIntMetablhth(sortchoise);
                    while (sortchoise < 1 || sortchoise > 3) {
                        System.out.println("Wrong choise retry");
                        sortchoise = Integer.parseInt(scan.nextLine());
                    }
                    bsd.bubbleSort(mytshirts, sortchoise);
                    showTShirts(mytshirts);
                }
                break;

        }

    }

    public static ArrayList<Tshirt> generateTShirts(int quantity) {
        ArrayList<Tshirt> tshirts = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            tshirts.add(new Tshirt());
        }
        return tshirts;
    }

    public static void showTShirts(ArrayList<Tshirt> mytshirts) {
        System.out.println("****Printing items of the List****");
        for (Tshirt shirt : mytshirts) {
            System.out.println(
                    "Name: " + shirt.getName()
                    + " Size: " + shirt.getSize()
                    + " Color: " + shirt.getColor()
                    + " Fabric: " + shirt.getFabric());
        }
    }
}
