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

    public static void sum3dig (int dig1, int dig2, int dig3){
        int sum;
        if (dig1 < 0 && dig2 < 0){
            sum = dig3;
        } else if (dig2 < 0 && dig3 < 0){
            sum = dig1;
        } else if (dig1 < 0 && dig3 < 0){
            sum = dig2;
        } else if (dig1 < 0){
            sum = dig2 + dig3;
        } else if (dig2 < 0){
            sum = dig1 + dig3;
        } else {
            sum = dig1 + dig2;
        }
        System.out.println(sum);
    }

    public static void max (int a, int b, int c){
        int res = Math.max(a * b * c, a + b + c) + 3;
        System.out.println(res);
    }
}
