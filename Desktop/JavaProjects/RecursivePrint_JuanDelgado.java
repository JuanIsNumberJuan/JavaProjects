//CSC 121

class RecursivePrint_JuanDelgado {
  public static void main (String a[]){
    String sentence = "The quick red fox jumps over the lazy brown dog!";
      RecursivePrint(sentence);
  }

  public static void RecursivePrint(String str){
    String letters = "";
    int x = 0;
    if(str.length()==0){
      System.out.println(letters);
    }
    else{
      if(x < str.length()){
        letters = str.substring(x, x+1);
        System.out.print(letters);
        x++;
        str = str.substring(x,str.length());
        RecursivePrint(str);
      }
    }
  }
}
