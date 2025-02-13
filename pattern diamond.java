class sample213{
    public static void main(String[] args) {
        int [] A={2,34,66,1,44};
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0 ; j< A.length; j++){
                if (A[j]>A[j+1]) {
                    int S = A[j];
                    A[j]=A[j+1];
                    A[j+1]=S;
                    
                }
            }

        }
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}