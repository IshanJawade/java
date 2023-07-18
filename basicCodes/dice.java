public class dice {    
    public static void main(String args[]){
        
        int dice = 0;
        int cnt = 0;
        
        while ( dice != 6){
            dice = (int) (Math.random() * 6) + 1;
            System.out.println(dice);
            cnt++;
        }
        System.out.println("we got 6 on the dice in [ " + cnt + " ] tries.");
    }

}