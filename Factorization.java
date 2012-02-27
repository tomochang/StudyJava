class Factorization {
  public static void main(String args[]){
    String s1 = "test";
    int i1 = Integer.parseInt(args[0]);
    if (i1 >= 0 ){
      for( int i=1; i<=i1 ; i= i + 1 ){
        int resultMod = i1 % i;
        if (i != 1 && i != i1 && resultMod == 0){
          System.out.print(i + " " );
        }
      }
    }else{
      for( int i=-1; i>=i1 ; i= i - 1 ){
        int resultMod = i1 % i;
        if (i != -1 && i != i1 && resultMod == 0){
          System.out.print(i + " " );
        }
      }
    }
    System.out.println("");
  }
}
