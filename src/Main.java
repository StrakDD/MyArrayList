import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new MyArrayList<>();
        arrayList.add("Ky1");
        arrayList.add("Ky2");
        arrayList.add("Ky3");
        arrayList.add("Ky4");


        arrayList.remove("Ky4");

        Iterator<String> it = arrayList.iterator();

        while(it.hasNext()){
            if (it.next().equalsIgnoreCase("ky3")){
                it.remove();
            }
        }

        System.out.println(arrayList);
    }
}
