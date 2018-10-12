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
        return "Кол-во чётных чисел в диапазоне от " + from + " до " + to +": " + count
                + "\nСумма чётных чисел: " + sum;
    }

    public String simpledig(double dig){
        if (dig < 0){
            throw new IllegalArgumentException("Простое число отрицательным быть не может!");
        }
        if (dig == 0){
            throw new IllegalArgumentException("Число 0 не является ни простым, ни составным.");
        }
        if (dig > 1 && dig % 1 == 0 ){
            return "Число " + (int) dig + " простое.";
        } else {
            return "Число " + dig + " составное.";
        }
    }

    public String factorial(int dig){
        int fact = 1;
        if (dig < 0){
            throw new IllegalArgumentException("Факториала отрицательного числа не существует!");
        }
        if (dig == 0){
            fact = 1;
        }
        for (int i = 2; i < dig + 1; i++){
            fact *= i;
        }
        return "Факториал числа " + dig + ": " + fact;
    }

    public String sumalldig(int number){
        if (number == 0){
            throw new IllegalArgumentException("Недопустимое значение 0");
        }
        int sum = 0;
        int snumber = number;
        while (number != 0){
            sum += (number % 10);
            number /= 10;
        }
        return "Сумма цифр числа " + snumber + ": " + sum;
    }

    public void mirror(int number){
        while (number != 0){
            System.out.print(number % 10);
            number /= 10;
        }
    }
}
