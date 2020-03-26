package final_soru1;

import java.security.SecureRandom;

public class Test {

    public static void main(String[] args) {
        SecureRandom rnd = new SecureRandom();
        Kahve[] K = new Kahve[4];
        for (int i = 0; i < K.length; i++) {
            int rand = rnd.nextInt(10) + 1;
            System.out.println(rand);
            if (rand < 3) {
                K[i] = new Mocha(5, 5, 5);
            }else{
                K[i] = new Latte(3, 3, 3);
            }
        }
        for (Kahve kahve : K) {
            if(kahve instanceof Mocha){
                kahve.component();
            }
        }

    }

}
