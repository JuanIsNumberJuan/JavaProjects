//CSC 121

class StringReverser_JuanDelgado {
  public static void main (String a[]){
    String sentence1 = "Taco Cat";
    String sentence2 = "A nut for a jar of tuna";
    System.out.println(sentence2);
    StringReverser(sentence2);
    System.out.println("\n");
  }
  public static void StringReverser(String str){
    String backwords = "";
    int x = 0;
    if(str.length()==0){
      System.out.println(backwords);
    }
    else{
        backwords = str.substring(str.length()-x-1, str.length()-x);
        x++;
        System.out.print(backwords);
        str = str.substring(0, str.length()-x);
        StringReverser(str);
    }
  }
}
