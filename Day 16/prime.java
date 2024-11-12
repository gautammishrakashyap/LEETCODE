public class prime {
    public static void main(String[] args) {
        int n = 172;
        boolean isprime = true;
        

        if(n<2){
            isprime =false;

        }
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
            
        }
        if(isprime){
            System.out.println("prime h bhaiya");
        }
        else{
            System.out.println("koi nahii janat h iss jug mey kapi sankat mochan naam teharo");
        }

    }
    
}
