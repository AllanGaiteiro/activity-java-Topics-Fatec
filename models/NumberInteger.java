package models;

// numeros inteiro
public class NumberInteger {
    private Integer num; // numero
    private Boolean isEven; // par
    private Boolean isOdd; //ímpar
    private Boolean isCousin; //é primo

    public NumberInteger(Integer num) {
        this.num = num;
        this.isEven = num % 2 == 0;
        this.isOdd = !this.isEven;
        this.setIsCousin(num);
    }

    // get and set
    public Integer getNum() {
        return num;
    }
    public Boolean getIsEven() {
        return isEven;
    }
    public Boolean getIsOdd() {
        return isOdd;
    }
    public Boolean getIsCousin() {
        return isCousin;
    }
    private void setIsCousin(Integer num) {
        Integer divisible = 0;
        if(this.isOdd){
            Integer i = 1;
            while (i <= num) {
                if (num % i == 0) {
                    divisible++;
                }
                i++;
            }
        } 
        this.isCousin = divisible == 2;
    }
}
