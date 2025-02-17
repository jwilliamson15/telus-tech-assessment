package fizzbuzz;

import fizzbuzz.rule.BuzzRule;
import fizzbuzz.rule.FizzBuzzRule;
import fizzbuzz.rule.FizzRule;
import fizzbuzz.rule.Rule;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    private static final List<Integer> first100IntegerNumbers = IntStream.range(1, 101)
            .boxed()
            .collect(Collectors.toList());

    static List<Rule> rules = List.of(
            new FizzBuzzRule(),
            new FizzRule(),
            new BuzzRule());

    public static void main(String[] args) {
        for(Integer integer: first100IntegerNumbers) {
            System.out.println(playFizzBuzz(integer));
        }
    }

    static String playFizzBuzz(Integer integer) {
        return rules.stream()
                .filter(rule -> rule.appliesTo(integer))
                .findFirst()
                .map(Rule::getResult)
                .orElse(String.valueOf(integer));
    }
}
