import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class test {
    public static void main(String args[]) {
        Random rand = new Random();
        int items= rand.nextInt(101)+1;
        List<Item> arr= new ArrayList<Item>();
        for(int i=0;i<items;i++){
        int random= Item.randnum();
        int random2= Item.randnum();
        Item I = new Item(random,random2);
        arr.add(I);
        }
        dynamic.main(arr);
        System.out.println(items);
    }
}
