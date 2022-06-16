import java.util.List;

import models.Gender;
import models.People;
import services.PeopleService;

public class PeopleApp {
    public static void main(String[] args) {
        /*
         * 4. Tem-se um conjunto de dados contendo a altura e o sexo (masculino,
         * feminino) de 50 pessoas. Fazer um algoritmo que calcule e escreva:
         * - a maior e a menor altura do grupo;
         * - a média de altura das mulheres;
         * - o número de homens;
         */
        // opitei por randomizar pq não entendi se era pra colocar os dados ou não
        List<People> peoples = PeopleService.randomPeopleList(50);
        System.out.println(peoples.toString());
        // a maior e a menor altura do grupo;
        PeopleService.higher(peoples);
        PeopleService.smaller(peoples);

        // a média de altura das mulheres;
        PeopleService.averageHeight(peoples, Gender.WOMAN);

        // o número de homens;
        PeopleService.filterForGender(peoples, Gender.MAN);
    }

}
