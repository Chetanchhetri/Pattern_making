
class pattern{
    public static void main(String args[]) {
        int n = 5;
        for (int i =1 ; i<=n ; i++ ){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");}
                    int s =2*(n-i);
                    for (int k =1;k<=s ;k++) {
                        System.out.print(" ");}
                    for (int j =1 ; j<=i ; j++){
                        System.out.print("*");
                    }
                    System.out.println();}  
                int m = 5; 
                    for (int i =m ; i>=1 ;i--){
                        for (int j = i ; j>=1 ; j--){
                            System.out.print("*");}
                        int s =2*(m-i);
                        for (int k =1;k<=s ;k++) {
                            System.out.print(" ");}
                        for (int j =i; j>=1 ; j--){
                            System.out.print("*");}
                            System.out.println();}
       
}} 