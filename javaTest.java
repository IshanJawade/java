class javaTest{
    
    public static void main(String args[]){
        // Piramid
        int num = 61; // only accepts odd numbers 
        int sum = 0;

        for( int t=1 ; t<=num; t++){
            sum = sum+t;
        }
        int avg = sum/num;
    
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

}