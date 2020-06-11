package sortingassignment.sortingservices;

import java.util.ArrayList;
import sortingassignment.models.Tshirt;


public class TshirtBubbleSort {

    public void bubbleSort(ArrayList<Tshirt> a, int typeOfSort) {
        Tshirt temp;
        if (typeOfSort == 1) {  //sort size
            for (int i = 0; i < a.size(); i++) {

                int flag = 0;
                for (int j = 0; j < a.size() - 1 - i; j++) {
                    if (a.get(j).getSize().ordinal() > a.get(j + 1).getSize().ordinal()) {
                        temp = a.get(j);
                        a.set(j, a.get(j + 1));
                        a.set(j + 1, temp);
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    break;
                }
            }
        }
        else if (typeOfSort == 2) {  //sort color
            for (int i = 0; i < a.size(); i++) {

                int flag = 0;
                for (int j = 0; j < a.size() - 1 - i; j++) {
                    if (a.get(j).getColor().ordinal() > a.get(j + 1).getColor().ordinal()) {
                        temp = a.get(j);
                        a.set(j, a.get(j + 1));
                        a.set(j + 1, temp);

                        flag = 1;
                    }
                }

                if (flag == 0) {
                    break;
                }
            }
        }
        else if (typeOfSort == 3) {  //sort fabric
            for (int i = 0; i < a.size(); i++) {

                int flag = 0;
                for (int j = 0; j < a.size() - 1 - i; j++) {
                    if (a.get(j).getFabric().ordinal() > a.get(j + 1).getFabric().ordinal()) {
                        temp = a.get(j);
                        a.set(j, a.get(j + 1));
                        a.set(j + 1, temp);
                        flag = 1;
                    }
                }

                if (flag == 0) {
                    break;
                }
            }
        }

    }

}
