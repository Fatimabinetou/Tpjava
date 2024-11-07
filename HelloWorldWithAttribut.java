public class HelloWorldWithAttribut{ 
  String machaine;
  public void Hello(){ 
         System.out.println(this.machaine);
	}
 	 
	public static void main(String[] args){  
      HelloWorldWithAttribut s = new HelloWorldWithAttribut();
      s.machaine="Salut";
      s.Hello();
   }
}