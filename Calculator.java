public class Calculator {
  public double evaluate(String expression) {
    double sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}