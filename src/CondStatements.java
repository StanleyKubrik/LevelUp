public class CondStatements {
    public static void fourth (double x, double y){
        if (x > 0 && y > 0){
            System.out.println("Точка находится в 1-й четверти");
        } else if (x < 0 && y > 0){
            System.out.println("Точка находится во 2-й четверти");
        } else if (x < 0 && y < 0){
            System.out.println("Точка находится в 3-й четверти");
        } else {
            System.out.println("Точка находится в 4-й четверти");
        }
    }

    public static void ifa (double a, double b){
        double sum;
        if (a % 2 == 0){
            sum = a * b;
        } else {
            sum = a + b;
        }
        System.out.println(sum);
    }
}
