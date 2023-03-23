import java.util.ArrayList;
import java.util.List;

public class Practice01 {
    public int findNumber(int number){
        List<Integer> list=new ArrayList<>();
        for (int i=1;i<1000000;i++){
            list.add(i);
        }
        for (int i:list){
            if(i==number){
                return i;
            }
        }
        return 0;
    }


    //palindrom mu:true/false
    public boolean isPalindrom(String word){
        String reverse="";
        for (int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        return word.equals(reverse);
    }

    public int factorial(int number) {
        int result;
        if (number<0){
            throw new IllegalArgumentException("Sayı 0 dan küçük olamaz!");
        }else {
            result = 1;

            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }
        return result;
    }

    public  double hypotenuse( double a,double b) {
        double c=Math.sqrt(a*a+b*b);
        return c;
    }


}
