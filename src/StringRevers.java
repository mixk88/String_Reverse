import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author mv_kuznetsov
 */
public class StringRevers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input string");
        String string = reader.readLine();
        ArrayList<Integer> repeats = new ArrayList();
        repeats.add(1000);
        repeats.add(10000);
        repeats.add(100000);
        ArrayList<Long> time = new ArrayList();

        String rev = null;

        for (Integer rep : repeats){
            long startTm = System.currentTimeMillis();
            for (int i = 0; i <= rep; i++){
                rev = revers(string);
            }
            long endTm = System.currentTimeMillis();
            time.add(endTm - startTm);
        }

        System.out.println(rev);
        for (Long tm : time){
            System.out.println("Execution time is " + tm + "ms");
        }

    }

    public static String revers(String str){

        int strLenght = str.length();
        String reversString = "";
        for (int i = 0; i < str.length(); i++){
            reversString = str.charAt(i) + reversString;
        }
        return reversString;

        //String reversString = new StringBuffer(str).reverse().toString(); //метод с использованием ыстроенных средств java (StringBuffer)
    }

}