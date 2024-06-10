import java.util.*;

class Coin {
    
    public final static int HEADS = 0;
    public final static int TAILS = 1; 
    
    private int faceup;
    private Random rand;  // Declare Random object

    public Coin(int start) {
        faceup = start;
        rand = new Random();  // Initialize Random object in constructor
    }
    
    public void toss() {
        faceup = rand.nextInt(2);  // Correct syntax for nextInt
    }

    public String result() {
        if (faceup == HEADS) {
            return "Head";
        } else if (faceup == TAILS) {
            return "Tail";
        } else {
            return "Invalid";
        }
    }
}

class DiceRoll{
    public static int no;
    
     Random rand ;
     
     public DiceRoll(){
         
         this.rand = new Random();
     }
     public int role(){
       
        this.no = this.rand.nextInt(6)+1;
        return no;
     }
     
     public static void main(String[] args){
         System.out.println("Select the choice :");
         System.out.println("1 for Dice");
         System.out.println("2 for toss");
         Scanner sc = new Scanner(System.in) ; 
         int choice = sc.nextInt();
         if(choice==2){
         Coin T1 = new Coin(Coin.HEADS);
          T1.toss();
         System.out.println("Faceup: " + T1.result());
         }
         else if(choice == 1){
         
         DiceRoll d = new DiceRoll();
        
         System.out.println("Output1 :"+d.role());
        
         }
         else{
             System.out.println("chosse a vaild option");
         }
     }
}