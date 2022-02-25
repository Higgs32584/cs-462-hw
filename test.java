import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class test {
    public static void main(String args[]) {
        int same=0;
        int dynamic_wins=0;
        int greedy_wins=0;
       for(int j=0;j<100;j++){
        Random rand = new Random();
        int items= rand.nextInt(101)+1;
        List<Item> arr = new ArrayList<Item>();
        for(int i=0;i<items;i++){
        int random= Item.randnum();
        int random2= Item.randnum();
        Item I = new Item(random,random2);
        arr.add(I);
        }
        //Collections.sort(arr);
        int dynamic_vals=dynamic.main(arr);
        int greedy_vals=Greedy.main(arr);
        if(dynamic_vals > greedy_vals){
            dynamic_wins+=1;
        }
        else if(dynamic_vals < greedy_vals){
            greedy_wins+=1;
        }else{
            same+=1;
        }

    }
    System.out.println("Greedy: "+greedy_wins);
    System.out.println("Dynamic: "+dynamic_wins);
    System.out.println("Same: "+same);
    }
}
