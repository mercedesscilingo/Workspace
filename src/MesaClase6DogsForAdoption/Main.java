package MesaClase6DogsForAdoption;


public class Main {


    public static void main(String[] args) {

        Dog d1 = new Dog(2015, true);

        Dog d2 = new Dog (false, 6);

        System.out.println(d1.getAge());
        System.out.println(d1.getCanGetLost());
        System.out.println(d2.getCanBeAdopted());

    }
}
