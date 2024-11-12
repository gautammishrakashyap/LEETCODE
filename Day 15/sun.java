public class sun{
    public static void main(String[] args) {
        int n[] ={2,3,4,5,6,7};
        int max = n[0];
        for(int i =0; i< n.length; i++){
            if(n[i]> max){
                max = n[i];
            }
        }
        System.out.println(max);
    }
    
}
