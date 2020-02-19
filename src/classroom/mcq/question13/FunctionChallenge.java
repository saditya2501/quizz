package classroom.mcq.question13;

import java.util.function.Function;



public class FunctionChallenge {

    public static void main(String[] args) {
// main method definition

        // method invocation
        Function<Integer, Integer> add = x -> x + 2;

        Function<Integer, Integer> sub = x -> x - 2;

        Function<Integer, Integer> div = x -> x /

        Function<Integer, Integer> func = add.andThen(sub).andThen(div);



        System.out.println(func.apply(2));

    }
}
