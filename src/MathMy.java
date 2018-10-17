class MathMy {
    static int max(int numberA, int numberB, int numberC, int numberD){
        return Math.max(Math.max(numberA, numberB), Math.max(numberC, numberD));
    }

    static int sqrt(int value){
        int low = 0;
        int high = value + 1;
        while (high - low > 1){
            int mid = (low + high) / 2;
            if (mid * mid <= value){
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
