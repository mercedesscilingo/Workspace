package MesaClase6DogsForAdoption;


public class Main {


    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.setYearOfBirth( 2015 );
        d1.setChip( true );
        d1.setHurt( false );
        d1.setWeight( 50 );

        System.out.println( d1.getAge() );
        System.out.println( d1.canGetLost() );
        System.out.println( d1.getCanBeAdopted() );

    }
}
