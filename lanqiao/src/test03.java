public class test03 {
    public static void main(String[] args) {
        int i=2;
        int count=0;
        while (true){
            int flag = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    flag+=1;
                }
            }
            if(flag==2){
                count+=1;
            }
            if(count==2019){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
