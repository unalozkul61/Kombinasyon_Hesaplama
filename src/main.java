import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n , r  ;
        System.out.print("N değerini giriniz : ");
         n = input.nextInt();
        System.out.print(" R değerini giriniz : ");
        r = input.nextInt();

        if (n<r)
        {
            System.out.println(" N sayısı R sayısından  büyük olmalıdır. Lütfen  N değeri giriniz :  ");
            n = input.nextInt();
            KombinasyonHesapla(n,r);
        }else {
            KombinasyonHesapla(n,r);
        }
    }
    private static void KombinasyonHesapla(int n , int r ) {
        int faktoriyel_1 = 1 ;
        int faktoriyel_2 = 1 ;
        int faktoriyel_3 = 1 ;
        int fark = n-r ;

        for (int i = 1 ; i <=n; i++){
            faktoriyel_1= faktoriyel_1 * i;

        }
        System.out.println("N sayısının faktoriyeli : " + faktoriyel_1);
         for (int j = 1 ; j<=r; j++) {
             faktoriyel_2 = faktoriyel_2*j;

         }
        System.out.println("R sayısının faktoriyeli : " + faktoriyel_2);
          for (int k = 1 ; k <= fark; k++){
              faktoriyel_3 = faktoriyel_3* k ;

          }
        System.out.println(" (N-R ) nin faktoriyeli : " + faktoriyel_3);
         int  carpım = faktoriyel_2*faktoriyel_3;
         int kombinasyon = faktoriyel_1 / carpım;

        System.out.println(n + " sayısının " + r +" li  "+" kombinasyonu = " + kombinasyon);

    }
}
