import java.util.Random;


public class Coin{
    
    public final static int Heads = 0 ;
    public final static int tail = 1 ; 
    
    private int faceup ;
    
    public Coin(int start){
        faceup = start ;
    }
    
    public void toss() {
        Random rand = new Random();
        faceup = rand.nextInt(2);
    }
    public String result(){
        if(faceup == Heads){
            return " Head";
        }
        else if( faceup == tail){
            return " tail";
        }
        else{
            return "invalid";
        }
    }
    public static void main (String[] args){
        Coin T1 = new Coin(Coin.Heads);
        System.out.println("starting :"+T1.result());
        //for(int i = 0 ; i < 10 ; i ++){
        T1.toss();
        System.out.println("faceup " +T1.result());
       // }
    }
}
