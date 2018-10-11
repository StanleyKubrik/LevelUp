public class Cycles {
    public String even(int from, int to){
        int count = 0;
        int sum = 0;
        for (int i = from; i < to;){
            if (i % 2 == 0){
                count++;
                sum += i;
                i++;
            } else {
                i++;
            }
        }
        return "Кол-во чётных чисел в диапазоне от 1 до 99: " + count
                + "\nСумма чётных чисел: " + sum;
    }

    public String simpledig(double dig){
        if (dig == 0){
            throw new IllegalArgumentException("Число 0 не является ни простым, ни составным.");
        }
        if (dig > 1 && dig % 1 == 0 ){
            return "Число " + (int) dig + " простое.";
        } else {
            return "Число " + dig + " составное.";
        }
    }

    public int factorial(int dig){
        int fact = 1;
        for (int i = 2; i < dig + 1; i++){
            fact *= i;
        }
        return fact;
    }
}
