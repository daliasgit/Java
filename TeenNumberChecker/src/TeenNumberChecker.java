public class TeenNumberChecker {

    public static boolean hasTeen (int num1, int num2, int num3) {
        if (isTeen(num1) || isTeen(num2) || isTeen(num3)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isTeen(int num4) {
        if(num4 >= 13 && num4 <= 19){
            return true;
        }else{
            return false;
        }
    }
}
