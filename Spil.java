class Spil{

  private int stokkur;
  private int posIn;
  private String img;
  private boolean isTop;
  
  private String sort;
  private int number;
  
  public static int getPosIn(){
	  return posIn;
  }
  
  public Spil(){
    while(!Start.gengur){
    String sort = Start.giveSort();
    int number = Start.giveNumber(sort);
    }
  }
  
  
}

int a = 4;
Spil b = new Spil();
b.getPosIn();
