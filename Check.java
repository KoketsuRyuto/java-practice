class Check {
  public static void main (String[] args) {
    int[] count = {9,8,7,6,5,4,3,2,1};
    int i,j,k;
    j = 0;
    for (i = 1; i < count.length; i++) {
      j = j + count[i];
    }
    while (j > 9) {
      k = j / 10;
      j = k + (j - 10 * k);
    }
    System.out.println(j);
  }
}
