import java.util.Random;
class Start{
  
  public static String[] sortir = {"hjarta", "spadi", "tigull", "lauf"};
  
  public static int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};
  
  public static boolean gengur = false;
  public static String[] notad;
  public static int notadCount = 0;
  
  public static String giveSort(){
    //handahofs tala milli 0 og 3
    int rand = (int)(Math.floor(Math.random()*4));
    
    return sortir[rand];
  }
  
  public static int giveNumber(String sortSpils){
    //handahofs tala milli 0 og 12
    int rand = (int)(Math.floor(Math.random()*13));
    
    
    int num = numbers[rand];
    
    String combo = sortSpils +num;
    
    
    for(int i =0;i<notad.length;i++){
      if(combo != notad[i]){
        gengur = true;
        i = notad.length;
        notad[notadCount] = sortSpils +num;
      }
    }
    
    return num;
    
  }
  
  
  
}