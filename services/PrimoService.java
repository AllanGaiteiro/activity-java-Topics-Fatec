package services;
import models.Activity;
import models.NumberInteger;

// 1.Fazer um algoritmo que receba um valor e defina se o valor recebido é
// primo.
public class PrimoService {
    public static void main(String[] args) {
        NumberInteger number = new NumberInteger(Activity.requestInteger());
        System.out.println("number " + number.getNum() + (number.getIsCousin() ? " is " : " isn't ") + "primo");
    }

}
