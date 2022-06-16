package services;

import java.util.ArrayList;
import java.util.List;

import models.Gender;
import models.People;

public class PeopleService {
    public static People create(Gender gender, Double height) {
        return new People(gender, height);
    }

    public static void higher(List<People> peoples) {
        peoples.sort((s1, s2) -> s1.getHeight() > s2.getHeight() ? -1 : 1);
        System.out.printf("A maior altura do grupo: %.2f m. \n", peoples.get(0).getHeight());
    }

    public static void smaller(List<People> peoples) {
        peoples.sort((s1, s2) -> s1.getHeight() > s2.getHeight() ? 1 : -1);
        System.out.printf("A menor altura do grupo: %.2f m. \n", peoples.get(0).getHeight());
    }

    public static void averageHeight(List<People> peoples, Gender gender) {
        String genderStr = gender == Gender.MAN ? "homens" : "mulheres";
        List<People> womans = peoples.stream().filter((op) -> op.getGender() == Gender.WOMAN).toList();
        Double somaH = womans.stream().mapToDouble(op -> op.getHeight()).sum();
        System.out.printf("A média de altura (" + genderStr + "): %.2f m. \n", somaH / womans.size());
    }

    public static void filterForGender(List<People> peoples, Gender gender) {
        String genderStr = gender == Gender.MAN ? "homens" : "mulheres";
        System.out.println(
                "O número de " + genderStr + " é de "
                        + peoples.stream().filter((op) -> op.getGender() != gender).toList().size());
    }

    public static List<People> randomPeopleList(Integer size) {
        List<People> peoples = new ArrayList<People>();
        for (Integer i = 0; i < size; i++) {
            Gender gender = (Math.random() * 2) <= 1 ? Gender.MAN : Gender.WOMAN;
            Double heigth = (Math.random() * 3.0);
            People people = create(gender, heigth);
            peoples.add(people);
        }
        return peoples;
    }
}
