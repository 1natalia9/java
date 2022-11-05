import java.io.IOException;
import java.util.ArrayList;



public class test {
    public static void main(String[] args) throws IOException {

        int[] data = {12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};
        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < data.length; i++) list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }
        System.out.println(even);
        System.out.println(odd);
    }

}