import java.util.*;

class pattern{
    public static void main(String args[]) {
        int n = 5;
        for( int i = 1 ; i<=n ; i++){
            int w = n-i;
            for (int q = 0 ; q<w ; q++){
                System.out.print(" ");
            }
            for (int k=i ; k<=5 ;k--){
                if (k==0){
                    break;}
                else{
                    System.out.print(k);}
                }
            for (int o = 2; o<=i ;o++){
                System.out.print(o);
            }
            for (int a =0 ; a<w ; a++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }}