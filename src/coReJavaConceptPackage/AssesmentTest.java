package coReJavaConceptPackage;

import java.util.*;

public class AssesmentTest {

	public static void main(String[] args) {
		List<Object>al = new ArrayList<Object>();
		al.add(new CrazyAir(2000));
		al.add(new CrazyAir(3000));
//Collections.sort(al, new FligSearch());
		for(Object obj:al){
			 if(obj instanceof CrazyAir)
	    	   {
	    		   CrazyAir obj1=(CrazyAir)obj;
	    		   System.out.println(obj1.getPrice());
	    	   } 
	    	   else if(obj instanceof ToughJet)
	    	   {
	    		   ToughJet obj1=(ToughJet)obj;
	    		   System.out.println(Math.round(obj1.getBasePrice()+(obj1.getBasePrice()*obj1.tax)/100-obj1.getDiscount()));
	    	   }
		}
		
		
		Collections.sort(al, new Comparator(){
		       public int compare(Object o1, Object o2) {
		    	   int fare1=0,fare2=0;
		    	   if(o1 instanceof CrazyAir)
		    	   {
		    		   CrazyAir obj=(CrazyAir)o1;
		    		   fare1=obj.getPrice();
		    	   } 
		    	   else if(o1 instanceof ToughJet)
		    	   {
		    		   ToughJet obj=(ToughJet)o1;
		    		   fare1=(int)Math.round(obj.getBasePrice()+(obj.getBasePrice()*obj.tax)/100-obj.getDiscount());
		    	   }
		    	   if(o2 instanceof CrazyAir)
		    	   {
		    		   CrazyAir obj=(CrazyAir)o2;
		    		   fare2=obj.getPrice();
		    	   } 
		    	   else if(o2 instanceof ToughJet)
		    	   {
		    		   ToughJet obj=(ToughJet)o2;
		    		   fare2=(int)Math.round(obj.getBasePrice()+(obj.getBasePrice()*obj.tax)/100-obj.getDiscount());
		    	   } 
		    	   System.out.println("fare1 :"+fare1);
		    	   System.out.println("fare2 :"+fare2);
		           if((fare1-fare2)>=0)
		        	   	return 1;
		           else  return 0;
		           
		           // it can also return 0, and 1
		        }  });

		for(Object obj:al){
			 if(obj instanceof CrazyAir)
	    	   {
	    		   CrazyAir obj1=(CrazyAir)obj;
	    		   System.out.println(obj1.getPrice());
	    	   } 
	    	   else if(obj instanceof ToughJet)
	    	   {
	    		   ToughJet obj1=(ToughJet)obj;
	    		   System.out.println(Math.round(obj1.getBasePrice()+(obj1.getBasePrice()*obj1.tax)/100-obj1.getDiscount()));
	    	   }
		}
	}
	
}
