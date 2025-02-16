package fizzbuzz.rules;

public interface Rule {
    boolean appliesTo(Integer number);
    String getResult();
}
