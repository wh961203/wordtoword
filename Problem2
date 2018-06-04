import java.util.*;
public class Problem2{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();//the numer of words
    System.out.print(N+" ");
    
    String [] w = new String[N];//set an array that has N words in it 
    int K = 0;
    String p =" ";//for the first word.
    String n =" ";//for the second word.
    String z =" ";
    boolean keep =true;//pc decide doing the true one or the false one.
    
    //set a new list and add the words which can adds in it.
    
    //add the words in to the string array.
    for(int i=0;i<N;i++){
      w[i]=in.next();
      System.out.print(w[i]+" ");
      p=w[0];
    }
    K=in.nextInt();//how many words we need in to the words game.
    System.out.println(K);    
    System.out.println(p);
    

    
    for(int i =1;i<N;i++){
      n=w[i];
      //System.out.print(n+" ");
      if((p.charAt(p.length()-1)) == n.charAt(0)){
        p=n;
        System.out.print(p+" ");
      }
        //if same, the statement will be true.  
        //if not same, the statement will be false.                           
    }
 }
  
}
