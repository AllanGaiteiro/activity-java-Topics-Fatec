package services;
import java.util.ArrayList;
import java.util.List;

public class ActivityService {

    public static void fibonacci(Integer num) {
        List<Integer> fi = new ArrayList<Integer>();
        fi.add(0);
        fi.add(1);

        while (num > fi.get(fi.size() - 2) + fi.get(fi.size() - 1)) {
            fi.add(fi.get(fi.size() - 2) + fi.get(fi.size() - 1));
        }
        System.out.println(fi);
    }

}