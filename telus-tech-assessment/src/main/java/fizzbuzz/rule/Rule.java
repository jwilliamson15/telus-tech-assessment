package fizzbuzz.rule;

public interface Rule {
    boolean appliesTo(Integer number);
    String getResult();
}
