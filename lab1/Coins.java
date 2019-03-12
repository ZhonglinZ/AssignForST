package testassign;
import java.util.LinkedHashMap;
import java.util.Map;

public class Coins { //建立一个 Coins类 表示不同面值的数量 <面值，数量>
  public  Map <Integer,  Integer> map  = new LinkedHashMap<Integer,Integer>() ; //按顺序从大到小
  public int sum = 83;
  public Coins() {
	  map.put(50,1);
	  map.put(20,1);
	  map.put(5,2);
	  map.put(1,3);
  }
  public Boolean ifGive( int total) {
	  if(total >83) {
		  return false;
	  }
	  else {
		  while (total > 0) 
		  {
			  for (Integer in : map.keySet()) {
				  if (in ==total && map.get(in)>0)
				  {return true;}
				  else if(in > total ) {
					  continue;
				  }
				  else  { //小于input则可以取出
					  if(map.get(in)>0)
					  {int temp= map.get(in);
					  total= total - in;
					  map.put(in, temp-1);}
					  else {return false;}
				  }			  
		     }		  
		  }
		  return true;
	  }
   }
}
