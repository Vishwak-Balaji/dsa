public class MaxVal {
    public static void main(String[] args) {
        
    }
    public static int max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for(int [] init : arr){
            for(int element : init){
                if(element>max){
                    max = element;
                }
            }
        }
        return max;
    }
}
