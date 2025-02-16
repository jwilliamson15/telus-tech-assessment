package fizzbuzz.rules;

public class FizzRule implements Rule {
    @Override
    public boolean appliesTo(Integer number) {
        return number % 3 == 0;
    }

    @Override
    public String getResult() {
        return "Fizz";
    }
}
