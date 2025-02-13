import java.util.*;

class pattern{
    public static void main(String args[]) {
        int n= 5;
        int h =1;
        for (int i = 1 ; i<=n ; i++){
            for (int j = 5; j>=i ; j--){
                System.out.print(h);
                h++;
            }
            System.out.println();
        }
    }
}
