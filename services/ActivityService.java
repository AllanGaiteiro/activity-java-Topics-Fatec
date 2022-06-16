package services;
import java.util.ArrayList;
import java.util.List;

import models.Grau;
import models.GrauType;

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

    public static void tabelGraus(Double min, Double max, GrauType type) {
        // Double num = this.requestDouble();
        List<Grau> celsius = new ArrayList<Grau>();
        Double celsiuMin = Math.ceil(new Grau(min, type).getCelsius());
        Double celsiuMax = Math.floor(new Grau(max, type).getCelsius());

        celsius.add(new Grau(celsiuMin, GrauType.CELSIUS));
        while (celsius.get(celsius.size() - 1).getCelsius() < celsiuMax) {
            Double nextCelsiu = celsius.get(celsius.size() - 1).getCelsius() + 1.0;
            celsius.add(new Grau(nextCelsiu, GrauType.CELSIUS));
        }

        System.out.println(celsius.toString());
    }
}