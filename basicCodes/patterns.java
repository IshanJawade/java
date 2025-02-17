public class patterns {
    public static void main(String args[]){


        

        // inverted half Piramid
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Piramid
        int num = 7; // only accepts odd numbers 
        
        int avg = (num+1) / 2;
    
        int l = avg,r = avg;

        System.out.println(num +" X "+ avg );

        for( int i=1; i <= avg; i++){
            for( int j=1; j <= num; j++){
                System.out.print((j == avg) || (j >= l && j <= r) ? "*" : " ");
            }
            l -=  1; r  +=  1;
            System.out.println();
        }

    }

    void HalfPyramid(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
