
import java.util.*;
public class Problem2 {

    static public boolean isEqual(String a, String b){
      //determine the last letter of the first word is same as the last letter of the second word or not.
        if (a.charAt(a.length()-1) == b.charAt(0)){
            return true;//same.
        }
        return false;//not same.
    }
    static public boolean has (String a, String[] out){
      //check the word a has included in the output array or not.
        for (int i=0; i<out.length; i++){
            if (out[i] == a){
                return true;//the word a is in the output array. 
            }
        }
        return false;//the word a is not in the output array.
    }


    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();//the number of words 

        String[] array = new String[N];//the string array has N words
        int K = 0;
        int currentSize = 0;
        //add the words into the array.
        for (int i = 0; i < N; i++) {
            array[i] = in.next();
        }
        //creat a output array with K words
        K = in.nextInt();
        String [] out = new String[K];

        //System.out.print(N + " ");
        //for (int i = 0; i < N; i++) {
           // System.out.print(array[i] + " ");
        //}//be sure the words is same as the problem input
        //System.out.print(K + " ");


       // System.out.println("\n");
        String current = array[0];
        //we have to use the current word as the first word.
        
        int count = 0;
        while (count != N-1){
            count = 0;
            for (int i = 1; i<N; i++){

                if(isEqual(current, array[i])&& !has(array[i], out)){
                  //the last letter of the last word is same as the first letter of the next word and 
                  //the next word is not include into the output array
                    out[currentSize] = array[i];
                  //add the next word into the output array
                    current = array[i];
                  //use the current word as the next word 
                    currentSize++;
                    count = N-1;
                }else{
                    count ++;
                }
            }
        }

        if (currentSize+1 < K){
          //the words game can work.
            System.out.println("IMPOSSIBLE");
        }else{
          //print the first word and the words in output .
            System.out.println(array[0]+" ");
            for (int j = 0; j<K-1; j++){
                System.out.println(out[j]);
            }
        }
    }
}
