public class pel {
    public static void main(String[] args) {
        int n = 111;
        int rev = 0;
        int num = n;
        while(n!=0){
         int digit = n%10;
         rev = rev*10 +digit;
         n/=10;


        

    }
    System.out.println(rev);
    if(num==rev){
        System.out.println("yes it is a pallendrome");
    }
    else{
        System.out.println("loda bhemchod");
    }
    }
    
}
