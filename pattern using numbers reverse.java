import java.util.*;

class pattern{
    public static void main(String args[]) {
        int n= 5;
        for (int i = 1 ; i<=n ; i++){
            int h =1;
            for (int j = 5; j>=i ; j--){
                System.out.print(h);
                h++;
            }
            System.out.println();
        }
    }
}
