public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber,int secondNumber ,int thirdNumber) {
        if((firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19)
                || (thirdNumber >= 13 && thirdNumber <= 19))
        {
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int age){
        if(age >= 13 && age <= 19){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
      boolean a =  hasTeen(22,13,25);
      boolean b = isTeen(12);
        System.out.println(a);
        System.out.println(b);
    }
}
