public class patterns {
    public static void main(String args[]){

        // half piramid
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        // inverted half Piramid
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Piramid
        int num = 7; // only accepts odd numbers 
        int sum = 0;

        for( int t=1 ; t<=num; t++){
            sum = sum+t;
        }
        int avg = sum/num;
    
        int l = avg,r = avg;

        for( int i=1; i <= avg; i++){
            for( int j=1; j <= num; j++){
                System.out.print((j == avg) || (j >= l && j <= r) ? "*" : " ");
            }
            l -=  1; r  +=  1;
            System.out.println();
        }

    }
}
