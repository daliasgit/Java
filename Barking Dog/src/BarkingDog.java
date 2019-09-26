public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && hourOfDay < 8 || hourOfDay > 22) {

             if (barking == true && hourOfDay < 0 || hourOfDay > 23){
                return false;

            }

            return true;
        } else {
            return false;
        }
    }
}
