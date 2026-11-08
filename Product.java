//author - Bukho Macozoma

public class Product{
    //variables and datatypes that will store our products
    private String p1 ;  
    private String p2 ; 
    private String p3 ; 
    private String p4 ; 
    
   //products constructor
  public Product(String p1 ,String p2,String p3 ,String p4){
      this.p1 = p1 ;  
      this.p2 = p2 ;
      this.p3 = p3 ;
      this.p4 = p4 ;
  }
    //method getting instances
  public String getP1(){ 
      return p1 ; 
  }
  public String getP2(){
      return p2 ; 
  }
  public String getP3(){
      return p3 ; 
  }
  public String getP4(){
      return p4 ; 
  }
}
//oder class
 class Order{
  // variables and datatypes that will store our ordernumbers
   String orderNum1 ; 
   String orderNum2 ; 
   String orderNum3 ;
   String orderNum4 ; 
  public Order(){ 
   }
 }
 //Prices class
  class Prices{
     // variables and datatypes that will store our product prices
      double price1 ;
      double price2 ; 
      double price3; 
      double price4;
      ////Constructor for Price class
      public Prices(double price1 ,double price2 , double price3 , double price4 ){
         this.price1 = price1;
         this.price2 = price2 ;
         this.price3 = price3 ;
         this.price4 = price4 ;
      }
  }
 
