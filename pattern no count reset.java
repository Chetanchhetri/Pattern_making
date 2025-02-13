import java.util.*;

class pattern{
    public static void main(String args[]) {
        int n= 5;
        int h =1;
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1; j<=i ; j++){
                if(h==1);{
                System.out.print(h);
                h=0;
                System.out.print(" ");
                }
                else{
                System.out.print(h);
                h=1;
                System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}

    

