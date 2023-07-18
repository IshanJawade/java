public class ifElse {

    public static void main(String args[]){
        
        int time = (int) (Math.random()* 25) ;

        // Tradition Method
        if (time < 18) {
            System.out.println("Current time is "+ time +" Good day.");
        } else {
            System.out.println("Current time is "+ time + " Good evening.");
        }

        // New improved OP method
        System.out.println( (time < 18) ? "Good Day" : "Good Evening" );
    }
}
