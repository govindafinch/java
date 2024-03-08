import java.util.*;
public class Classroom {
    //swap 2 number
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
        list.add(2,9);
        System.out.println(list);
         //get operation
         int element  = list.get(2);
         System.out.println(element);
         //remove operation
         list.remove(3);
         System.out.println(list);
         //set element at index
         list.set(3, 10);
         System.out.println(list);
         //contains element
         System.out.println(list.contains(3));
         System.out.println(list.contains(10));
         size of arraylist
         System.out.println(list.size());
         for(int i=0;i<list.size();i++){
             System.out.print(list.get(i)+" ");
         }
         System.out.println();
        print reverse of an arraylist 
         
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        

        //find maximum in an arraylist
         
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if (max <list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("maximum element ="+max);
        

        //swap 2 number
         
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int idx1 =1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
        

        //sorted arraylist
         
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);//asending
        System.out.println(list);
        //desending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        

        //multidimensional arraylist
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        //nested loop
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

    }
}
