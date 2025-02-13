import java.util.*;

class pattern{
    public static void main(String args[]) {
        int n= 5;
        int h =1;
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1; j<=i ; j++){
                System.out.print(h);
                System.out.print(" ");
                h++;
            }
            System.out.println();
        }
    }
}

    

