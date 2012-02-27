class TernaryOperatorDemo {
  public static void main(String args[]){
    int i1 = Integer.parseInt(args[0]);
    int resultMod = i1 % 2;
    System.out.println((resultMod == 0) ? "Even" : "Odd" );
  }
}
