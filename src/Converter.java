public class Converter {
    public static void grvkg(int gramm){
        int kg = gramm / 1000;
        System.out.println("В " + gramm + " грамм" + kg + " кг.");
    }

    public static void kgvtn(double kg){
        double tonna = kg / 1000;
        System.out.println(kg + " кг это " + tonna + " тонн.");
    }

    public static void tnvunc(double tonna){
        double unc = tonna * 35274;
        System.out.println(tonna + " тонн это " + unc + " унций.");
    }

    public static void cvf(float c){
        float f = (c * 9/5) + 32;
        System.out.println(c + " градусов по Цельсию это " + f + " градусов по Фаренгейту.");
    }

    public static void kvc(double k){
        double c = k - 272.15;
        System.out.println("В " + k + " градусах по Кельвину " + c + " градусов по Цельсию.");
    }
}
