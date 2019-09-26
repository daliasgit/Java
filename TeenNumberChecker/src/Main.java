import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        boolean TeenNum = TeenNumberChecker.hasTeen(22, 23, 34);
        boolean Teen = TeenNumberChecker.isTeen(13);
        System.out.println(TeenNum);
        System.out.println(Teen);
    }

}
