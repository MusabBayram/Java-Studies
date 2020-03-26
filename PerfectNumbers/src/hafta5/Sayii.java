/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta5;

/**
 *
 * @author Musab
 */
public class Sayii {
     private double num;
     public static int counter;

        public Sayii(double num) {
            this.num = num;
            counter++;
        }

        public double getNum() {
            return num;
        }

        public void setNum(double num) {
            this.num = num;
        }
    public boolean tamSayi()
    {
        int tamsayihali;
        tamsayihali = (int)num;
        if(num==tamsayihali)
        {
            System.out.println("girilen numara tamsayidir");
        }
        else
            System.out.println("girilen numara tamsayi degildir");
         return true;
        //return num == (int)num;
    }
    /**
     * pozitif bölenlerin toplamı
     * @return toplam
     */
    public int sumofpositivedivisors()
        {
            int toplam=0;
            for (int i = 1; i < num; i++) 
            {
                if(num%i==0)
                    toplam+=i;
            }
            System.out.println("bolenlerin toplami: "+toplam);
            if(toplam==num)
            {
                System.out.println("girilen sayi mukemmel sayidir");
            }
            else
                System.out.println("girilen sayi mukemmel sayi degildir");
            return toplam;
        }
}
