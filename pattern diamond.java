class sample213{
    public static void main(String[] args) {
        int n = 5;              // maximum number of star present in 1 line
        int space=((n-1)/2);
        int backspa=n-space;
        int num=1;
        // upper half
        for (int i=0 ; i<((n+1)/2) ;i++){
            for (int j=0 ;j<space;j++){
                System.out.print(" ");          //Add space to the pattern
            }
            for (int star=0 ;star<num ;star++){
                System.out.print("*");          //add * to the pattern
            }
            space-=1;
            num+=2;
            System.out.println();
        }
        //bottom half
        for (int k=0;k<((n+1)/2);k++){
            num-=2;
            for (int spa=0;spa<k;spa++){
                System.out.print(" ");
            }
            for (int sta=0;sta<num ;sta++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
