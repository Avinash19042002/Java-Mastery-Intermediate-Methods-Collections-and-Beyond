import java.util.Random;
public class AssessmentTest1 {
//    public static long randomTenDigitNumber(){
//        long num=0L;
//        long x=1L;
//
//        Random random = new Random();
//        int randDig;
//        for(int i=0;i<10;i++){
//            randDig=random.nextInt(10);
//            if(i==9)
//                while(randDig==0)randDig=random.nextInt(10);
//
//            num=num+x*randDig;
//            x*=10;
//        }
//        return num;
//    }

    //Another Method
    public static long randomTenDigitNumber(){
        long min=1000000000L;
        long max=9999999999L;
        Random random = new Random();
        long randNum=min+(long)(random.nextDouble()*(max-min+1));
        return randNum;
    }

    public static void main(String[] args) {
        System.out.println("Generated Random Number is: " +randomTenDigitNumber());
    }
}
