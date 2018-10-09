public class CondStatements {

    public String fourth (double x, double y){
        if (x == 0){
            throw new IllegalArgumentException("Координата Y находится на оси");
        }else if (y == 0){
            throw new IllegalArgumentException("Координата X находится на оси");
        } else if (x > 0 && y > 0){
            return "Точка находится в 1-й четверти";
        } else if (x < 0 && y > 0){
            return "Точка находится во 2-й четверти";
        } else if (x < 0 && y < 0){
            return "Точка находится в 3-й четверти";
        } else {
            return "Точка находится в 4-й четверти";
        }
    }

    public String ifa (double a, double b){
        double sum;
        if (a % 2 == 0){
            sum = a * b;
        } else {
            sum = a + b;
        }
        return String.valueOf(sum);
    }

    public String sum3dig (int dig1, int dig2, int dig3){
        int sum = 0;
//        if (dig1 < 0 && dig2 < 0){
//            sum = dig3;
//        } else if (dig2 < 0 && dig3 < 0){
//            sum = dig1;
//        } else if (dig1 < 0 && dig3 < 0){
//            sum = dig2;
//        } else if (dig1 < 0){
//            sum = dig2 + dig3;
//        } else if (dig2 < 0){
//            sum = dig1 + dig3;
//        } else {
//            sum = dig1 + dig2;
//        }
        if (dig1 > 0){
            sum += dig1;
        }
        if (dig2 > 0){
            sum += dig2;
        }
        if (dig3 > 0){
            sum += dig3;
        }
        if (dig1 < 0 && dig2 < 0 && dig3 < 0){
            sum = 0;
        }

        return String.valueOf(sum);
    }

    public String max (int a, int b, int c){
        int res = Math.max(a * b * c, a + b + c) + 3;
        return String.valueOf(res);
    }

    public String grade (int value){
        String str;
        if (value >= 0 && value <= 19){
            str = "F";
        } else if (value >= 20 && value <= 39){
            str = "E";
        } else if (value >= 40 && value <= 59){
            str = "D";
        } else if (value >= 60 && value <= 74){
            str = "C";
        } else if (value >= 75 && value <= 89){
            str = "B";
        } else {
            str = "A";
        }
        return str;
    }
}
