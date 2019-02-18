class InsertionSort {

  public static void main(String[] args) {
    int[] A = {5,2,4,6,1,3} ;
    for (int j = 1; j < 6; j++ ) {
      int key = A[j] ;
      int i = j-1 ;
      while (i>=0 && A[i]> key) {
        A[i+1] = A[i] ;
        i = i-1 ;
      }
      A[i+1] = key ;
    }
    int x = 0 ;
    while ( x < A.length) {
      System.out.println("The elements of sorted list are: " + A[x]) ;
      x++ ;
    }
  }
}
