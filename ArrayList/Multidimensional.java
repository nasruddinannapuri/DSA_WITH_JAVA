package ArrayList;

import java.util.ArrayList;

public class Multidimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        /*ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); 
        list2.add(4);
        mainList.add(list2);
        for(int i = 0; i<mainList.size();i++){
            ArrayList<Integer> curr = mainList.get(i);
            for(int j = 0; j<curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }*/

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);mainList.add(list2); mainList.add(list3);
        list2.remove(1);
        list2.remove(3);
        for(int i = 0; i<mainList.size(); i++){
            ArrayList<Integer> curr = mainList.get(i);
            for(int j = 0; j<curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }




    }
    
}
