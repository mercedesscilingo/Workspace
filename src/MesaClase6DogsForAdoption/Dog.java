package MesaClase6DogsForAdoption;

import java.util.Calendar;
import java.util.Date;

public class Dog {
    private Boolean adopted;
    private String dogBreed;
    private Integer yearOfBirth;
    private Integer weight;
    private Boolean hasChip;
    private Boolean hurt;
    private String name;
    private Integer age;
    private Boolean canGetLost;
    private Boolean canBeAdopted;

    //Los atributos que no se utilizan, es necesario declararlos?

    //******************CONSTRUCTORS****************

    //Es una buena práctica inicializar atributos en funcion de otros atributos dentro del constructor?
    public Dog(Integer yearOfBirth, Boolean hasChip) {
        this.yearOfBirth = yearOfBirth;
        this.hasChip = hasChip;
        this.age = calculateAge();
        this.canGetLost = !hasChip;
    }

    //Es una buena práctica en constructores alterar el orden de los parametros?
    public Dog(Boolean hurt, Integer weight) {
        this.weight = weight;
        this.hurt = hurt;
        this.canBeAdopted = !hurt && weight > 5;
    }

    //***************GETTERS AND SETTERS**************

    public Integer getAge() {return age;}

    public Boolean getCanGetLost() {return canGetLost;}

    public Boolean getCanBeAdopted() {return canBeAdopted;}

    //****************METHODS*******************

    private Integer calculateAge() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR) - this.yearOfBirth;
    }

}
