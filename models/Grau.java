package models;
public class Grau {
    private Double celsius;
    private Double fahrenheit;

    public Grau(Double num, GrauType type) {
        this.celsius = type == GrauType.FARENHEIT ? this.fahrenheitForCelsius(num) : num;
        this.fahrenheit = type == GrauType.CELSIUS ? this.celsiusForFahrenheit(num) : num;
    }

    private Double fahrenheitForCelsius(Double num) {
        return (num  - 32) * 5/9;
    }

    private Double celsiusForFahrenheit(Double num){
        return (num * 9/5) + 32;

    }

    @Override
    public String toString() {
        return "Grau [celsius=" + celsius + " °C, fahrenheit=" + fahrenheit + "°F]";
    }

    public Double getCelsius() {
        return celsius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

}
