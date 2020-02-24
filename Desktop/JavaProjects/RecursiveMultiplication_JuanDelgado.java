//CSC 121

class RecursiveMultiplication_JuanDelgado {

  public static void main (String a[]){
    System.out.println("7 * 4 = " + RecursiveMultiplication(7,4));
  }

  public static int RecursiveMultiplication (int x, int y){
    String Nums = "";
    if(x==1){
      System.out.println("" +y);
      return y;
    }
    else{
      System.out.print(y + " + ");
      return y + RecursiveMultiplication(x-1,y);
    }
  }
}
