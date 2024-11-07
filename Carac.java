public class Carac
{  char carac;
 public Carac(char carac)
	{ this.carac=carac;

 	}
  public Carac()
	{ carac=' ';

 	}
  public boolean estvoyelle() { 
    return "aeiouAEIOU".indexOf(this.carac) != -1;
   }
public static void main(String [] args){
 Carac car1 =new Carac('a');
 System.out.println(car1.carac+" est une voyelle "+car1.estvoyelle());
   
}
}
 
      