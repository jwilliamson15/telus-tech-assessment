package fizzbuzz;

interface Rule {
    boolean appliesTo(Integer number);
    String getResult();
}
