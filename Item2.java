import java.util.*;
class dynamic{
    public static void main(List<Item> args) {
        int num_items= args.size();
        int max_weight=10;
        List<Item> arr= args;
        int[][] weight_vals= new int[num_items][10];
        int[][] value_vals= new int[num_items][10];
        int temp_max_weight=10;
        int d=4;
        int weight=0;
        int value=0;
        for(int i=0;i<num_items;i++){
            System.out.print("Item"+i+": ");
            for(int j=0;j<max_weight;j++){
                d=i;
                temp_max_weight=j;
                weight=0;
                value=0;
                while(d != -1 && weight<= temp_max_weight+ arr.get(d).weight){
                    Item cur_item=arr.get(d);
                    if (temp_max_weight >= (cur_item.weight+weight)){
                        weight+=cur_item.weight;
                        value+=cur_item.value;
        
        }
                d--;
        }
                if( i == 0 ){
                    if(value == 0){
                        System.out.print(value_vals[i][0]+", no ");
                    }
                    else{
                        weight_vals[0][0]= weight;
                        value_vals[0][0]= value;
                        System.out.print(value+", yes ");
                    }
        }
                else if(value < value_vals[i-1][0] || value == 0){
                    weight_vals[i][0] = weight_vals[i-1][0];
                    value_vals[i][0] = value_vals[i-1][0];
                    System.out.print(value_vals[i-1][0]+", no ");
                }
                else{
                    weight_vals[i][0] = weight;
                    value_vals[i][0] = value;
                    System.out.print(value+", yes ");
        }
    }
    System.out.println("\n");
    }  

    }

}
