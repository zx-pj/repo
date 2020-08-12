public class test02 {
//    3,862,239,538
    public static void main(String[] args) {
        Integer i = 0;
        String s = null;
        while (true){
            i++;
            Double temp = Math.sqrt((double)i);
            if(Math.floor(temp)==temp){
                s+='z';
            }
            if(s.length()==6){
                System.out.println(i);
                break;
            }
        }
    }
}
