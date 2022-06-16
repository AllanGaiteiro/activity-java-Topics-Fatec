package models;

public class People {
    private Gender gender;
    private Double height;
    public People(Gender gender, Double height) {
        this.gender = gender;
        this.height = height;
    }
    public Gender getGender() {
        return gender;
    }
    public Double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "People [gender=" + gender + ", height= " + height + "]\n";
    }
}
