import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr ={
            {1,2,3,4},
            {55,66,77,88},
            {32,54,65,6},
            {87,78,35,23}
        };
        int target = 65;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int []search(int [][] nums,int target){
        if(nums.length<=0){
            return new int []{-1,-1};
        }
        for(int row =0;row<nums.length;row++){
            for(int col =0;col<nums[row].length;col++){
                if(nums[row][col] == target){
                    return new int []{row,col};
                }
            }
        }
        return new int []{-1,-1};
    }


}
