import java.math.BigInteger;

import java.math.BigInteger;

public class yanzheng {
    public static boolean check(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if((n/i)*i==n){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]=new int [2019];
        boolean is[]=new boolean[100000];
        int p=0;
        for(int i=2;i<is.length;i++){
            if(is[i])continue;
            else if(check(i)){
                arr[p]=i;
                p++;
                if(p==2019)break;
                for(int j=i;j<is.length;j+=i){
                    is[j]=true;
                }
            }
        }
        System.out.println(arr[2018]);
    }
}
