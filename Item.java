import java.util.Random;
import java.util.*;
class Item implements Comparable<Item>{
    public int weight;
    public int value;
    public double density;
    public Item(int weight,int value){
        this.weight=weight;
        this.value=value;
        density= (double)value/(double)weight;
    }


    public static int randnum(){
        Random rand = new Random();
        int int_random = rand.nextInt(7)+ 1;
        return int_random;
    }
   public int compareTo(Item i){
        if(this.density == i.density)
                return 0;
         if (this.density > i.density){
                return 1;
         }
         return -1;
    }
   @Override
   public String toString(){
   return "Density: "+density+"Weight: "+weight+"Value:" + value;

   }


    public static void main(String args[]) {
        List<Item> arr= new ArrayList<Item>();
        for(int i=0;i<5;i++){
        int random= randnum();
        int random2= randnum();
        Item I = new Item(random,random2);
        arr.add(I);
        }
        Collections.sort(arr);
        //Items allowed
        int max_weight=10;
        int d=4;
        int weight=0;
        int value=0;
        while(d != -1 && weight<= max_weight+ arr.get(d).weight){
         Item i=arr.get(d);
        if (max_weight >= (i.weight+weight)){
        weight+=i.weight;
        value+=i.value;
        System.out.println("Selected Item : " +d + " Value: "+ i.value+" Weight: "+i.weight+ "\n");

        }
        else{
        System.out.println("Item : " +d + " Value: "+ i.value+" Weight: "+i.weight+ "Was NOT Selected\n");
        }
        d--;
        }
        System.out.println("Final Weight"+weight);
        System.out.println("Final Value "+value);

    }

}
