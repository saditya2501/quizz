package classroom.mcq.question9;

public class ConstructorChallenge {
    String name;



    ConstructorChallenge(String name) {

        this.name = name;

    }



    ConstructorChallenge() {

        this(getName(1));

    }



    ConstructorChallenge(int i) {

        this(getName(2));

    }



    ConstructorChallenge(Object i) {

        this(getName((Integer) i));

    }



    public static void main(String[] args) {



        // ## REPLACE ##
//a
     /*   ConstructorChallenge firstGod = new ConstructorChallenge();
        ConstructorChallenge secondGod = new ConstructorChallenge(BigDecimal.valueOf(0));
        ConstructorChallenge thirdGod = new ConstructorChallenge(Long.valueOf(4));
*/
     //b
        /*
        ConstructorChallenge firstGod = new ConstructorChallenge(1);
        ConstructorChallenge secondGod = new ConstructorChallenge(0);
        ConstructorChallenge thirdGod = new ConstructorChallenge(Integer.valueOf(4));
        */
     //c
        ConstructorChallenge firstGod = new ConstructorChallenge();
        ConstructorChallenge secondGod = new ConstructorChallenge("Kratos");
        ConstructorChallenge thirdGod = new ConstructorChallenge(Integer.valueOf(4));


       //d
        /*
        ConstructorChallenge firstGod = new ConstructorChallenge(Integer.valueOf(1));
        ConstructorChallenge secondGod = new ConstructorChallenge(Integer.valueOf(0));
        ConstructorChallenge thirdGod = new ConstructorChallenge(Integer.valueOf(4));
        */
        System.out.println(firstGod.name + " ");


        System.out.println(secondGod.name + " ");

        System.out.println(thirdGod.name + " ");

    }



    static String getName(int index) {

        String name = new String[]{"Kratos", "Zeus", "Poseidon", "Hades", "Athena"}[index];

        return name;

    }

}
