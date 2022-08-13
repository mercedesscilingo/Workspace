package MesaClase6DogsForAdoption;

import java.util.Calendar;
import java.util.Date;

public class Dog {
    private boolean adopted;
    private String breed;
    private int yearOfBirth;
    private int weight;
    private boolean chip;
    private boolean hurt;
    private String name;

    //******************CONSTRUCTORS****************

    public Dog(){

    }

    public Dog(boolean adopted, String breed, int yearOfBirth, int weight, boolean chip, boolean hurt, String name) {
        this.adopted = adopted;
        this.breed = breed;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.chip = chip;
        this.hurt = hurt;
        this.name = name;
    }
    //***************GETTERS AND SETTERS**************

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted( boolean adopted ) {
        this.adopted = adopted;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed( String breed ) {
        this.breed = breed;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth( int yearOfBirth ) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight( int weight ) {
        this.weight = weight;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip( boolean chip ) {
        this.chip = chip;
    }

    public boolean isHurt() {
        return hurt;
    }

    public void setHurt( boolean hurt ) {
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    //****************METHODS*******************

    private Integer calculateAge() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR) - this.yearOfBirth;
    }

    public boolean canGetLost() {
        return !chip;
    }

    public int getAge() {
        return calculateAge();
    }

    public boolean getCanBeAdopted() {
        return !hurt && weight > 5;
    }

}
