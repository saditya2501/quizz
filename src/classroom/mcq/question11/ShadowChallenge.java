package classroom.mcq.question11;

public class ShadowChallenge {
    private static long number = 100;



    public static void main(String[] args) {

        long number = 50;

        System.out.println(ShadowChallenge.number + number + 20);

        System.out.println(new ShadowChallenge().number + ShadowChallenge.number);

    }

}
