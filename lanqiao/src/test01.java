import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test01 {
    public static void main(String[] args) {
        Double a = 1.0;
        Double b = 2.0;
        Double c = 9.0;
        Double d = 0.0;
        System.out.println(a*a*a+b*b*b+c*c*c+d*d*d);
        List<BigInteger> list = new ArrayList<>();
        String s = null;
        for (Integer i = 1; i<=2019; i++){
            s = i.toString();
            if(s.contains("1")||s.contains("0")||s.contains("2")||s.contains("9")){
                BigInteger I = new BigInteger(s);
                list.add(I.pow(3));
            }
        }
        BigInteger zero = BigInteger.ZERO;

        for (BigInteger temp : list) {
            zero = zero.add(temp);
        }
        System.out.println(zero);
    }
}
