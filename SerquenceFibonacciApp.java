
import services.ActivityService;
import services.ScanService;

// 2. Fazer uma algoritmo que receba uma valor e crie a sequencia de fibonacci;
// o limite da sequencia deverá ser o valor recebido.
public class SerquenceFibonacciApp {
    public static void main(String[] args) {
        ActivityService.fibonacci(ScanService.requestInteger());
    }

}