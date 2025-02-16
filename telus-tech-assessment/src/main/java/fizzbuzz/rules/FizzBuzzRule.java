package fizzbuzz.rules;

public class FizzBuzzRule implements Rule {
    @Override
    public boolean appliesTo(Integer number) {
        return (number % 3 == 0) &&  (number % 5 == 0);
    }

    @Override
    public String getResult() {
        return "FizzBuzz";
    }
}
