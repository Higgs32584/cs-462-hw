import java.util.*;
class dynamic{
    public static int main(List<Item> args) {
        int num_items= args.size();
        int max_weight=10;
        List<Item> arr= args;
        int[][] weight_vals= new int[num_items][max_weight];
        int[][] value_vals= new int[num_items][max_weight];
        int temp_max_weight=10;
        int d=0;
        int weight=0;
        int value=0;
        for(int i=0;i<num_items;i++){
            //System.out.print("Item"+i+": ");
            for(int j=0;j<max_weight;j++){
                d=i;
                temp_max_weight=j+1;
                weight=0;
                value=0;
                while(d != -1){
                    Item cur_item=arr.get(d);
                    if (temp_max_weight >= (cur_item.weight+weight)){
                        weight+=cur_item.weight;
                        value+=cur_item.value;
                    }
                d--;
        }
                if( i == 0){
                    weight_vals[0][j]= weight;
                    value_vals[0][j]= value;
                        //System.out.print(value+", yes|");
                }
                else if(value < value_vals[i-1][j]){
                    weight_vals[i][j] = weight_vals[i-1][j];
                    value_vals[i][j] = value_vals[i-1][j];
                    //System.out.print(value_vals[i][j]+", no|");
                }
                else{
                    weight_vals[i][j] = weight;
                    value_vals[i][j] = value;
                    //System.out.print(value+", yes|");
                }
    }
    //System.out.println("\n");
    }
    num_items-=1;
    max_weight-=1;
    return value_vals[num_items][max_weight];
    }

}
