package classroom.mcq.question10;
import java.util.Arrays;

import java.util.List;



public class ListChallenge {

    public static void main(String[] args) {

        final List<String> soldiers = Arrays.asList("Tyrion", "Arya", "John");



        if (soldiers.size() > 3) {

            soldiers.add("Cersei");

        } else {

            soldiers.add("Bran");

        }



        System.out.println(soldiers);

    }

}