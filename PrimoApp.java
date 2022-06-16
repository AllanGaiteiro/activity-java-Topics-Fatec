
import models.NumberInteger;
import models.Scan;

// 1.Fazer um algoritmo que receba um valor e defina se o valor recebido é
// primo.
public class PrimoApp {
    public static void main(String[] args) {
        NumberInteger number = new NumberInteger(Scan.requestInteger());
        System.out.println("number " + number.getNum() + (number.getIsCousin() ? " is " : " isn't ") + "primo");
    }

}
