
import services.ActivityService;
import models.GrauType;

//3. Fazer um algoritmo que calcule e escreva uma tabela de centígrados em função de graus Farenheit, que variam de 50 a 150 de 1 em 1.
public class TemperatureConverter {
    public static void main(String[] args) {
        ActivityService.tabelGraus(50.0, 150.0, GrauType.FARENHEIT);
    }


}