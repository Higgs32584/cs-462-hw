import java.util.Random;

import javax.sound.midi.SysexMessage;

import java.util.*;
class Item2 implements Comparable<Item2>{
    public int weight;
    public int value;
    public double density;
    public Item2(int weight,int value){
        this.weight=weight;
        this.value=value;
        density= (double)value/(double)weight;
    }


    public static int randnum(){
        Random rand = new Random();
        int int_random = rand.nextInt(7)+ 1;
        return int_random;
    }
   public int compareTo(Item2 i){
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
        Random rand= new Random();
        int num_items= rand.nextInt(101)+1;
        int max_weight=10;
        List<Item2> arr= new ArrayList<Item2>();
        for(int i=0;i<num_items;i++){
        int random= randnum();
        int random2= randnum();
        Item2 I = new Item2(random,random2);
        arr.add(I);
        }
        int[][] weight_vals= new int[num_items][10];
        int[][] value_vals= new int[num_items][10];
        int temp_max_weight=10;
        int d=4;
        int weight=0;
        int value=0;
        for(int i=0;i<num_items;i++){
            System.out.println("Item"+i+": ");
            for(int j=0;j<max_weight;j++){
                d=i;
                temp_max_weight=j;
                weight=0;
                value=0;
                System.out.print("Item: "+i+"|");
                while(d != -1 && weight<= temp_max_weight+ arr.get(d).weight){
                    Item2 cur_item=arr.get(d);
                    if (temp_max_weight >= (cur_item.weight+weight)){
                        weight+=cur_item.weight;
                        value+=cur_item.value;
        
        }
                d--;
        }
                if( i == 0){
                    weight_vals[0][0]= weight;
                    value_vals[0][0]= value;
                    System.out.print(value+", yes");
        }
                else if(value < value_vals[i-1][0]){
                    weight_vals[i][0] = weight_vals[i-1][0];
                    value_vals[i][0] = value_vals[i-1][0];
                    System.out.print(value_vals[i-1][0]+", no");
                }
                else{
                    weight_vals[i][0] = weight;
                    value_vals[i][0] = value;
                    System.out.print(value+", yes");
        }
    }
    }  

    }

}
