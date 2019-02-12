package Programowanie_II_D1;

public class Human {

        private String firstName;
        private String lastName;
        private int height;
        private int age;
        private Gender gender;
        private HairColor hairColor;
        private EyeColor eyeColor;

    public Human(String firstName, String lastName, int height, int age, Gender gender, EyeColor eyeColor, HairColor hairColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.age = age;
        this.gender = gender;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", gender=" + gender +
                ", hairColor=" + hairColor +
                ", eyeColor=" + eyeColor +
                '}';
    }
}


