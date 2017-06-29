package coReJavaConceptPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 

public class MyArrayListSort {

     

    public static void main(String a[]){

         

        List<Object> list = new ArrayList<Object>();
        list.add(new CrazyAir(1000));
        list.add(new CrazyAir(2525));
        list.add(new CrazyAir(1111));
        list.add(new ToughJet(5,10,500));
        list.add(new ToughJet(3,10,300));
        

       

        Collections.sort(list,new SortFlightList());

        System.out.println("Sorted list entries: ");

        for(Object e:list){

            System.out.println(e);

        }

    }

}

 

class SortFlightList implements Comparator<Object>{

 

    @Override

    public int compare(Object e1, Object e2) {
    	CrazyAir e11=null;
    	CrazyAir e12=null;
    	ToughJet e21=null;
    	ToughJet e22=null;
    	if(e1 instanceof CrazyAir )
    	  e11=(CrazyAir)e1;
    	else if(e1 instanceof ToughJet )
    	  e21=(ToughJet)e1;
    	if(e2 instanceof CrazyAir )
   		  e12=(CrazyAir)e2;
    	else if(e2 instanceof ToughJet )
   	      e22=(ToughJet)e2;
    	
    	
        if((e11==null?e21.getBasePrice()+(e21.getBasePrice()*(e21.getTax()/100))-(e21.getBasePrice()*(e21.getDiscount()/100)):e11.getPrice()) > (e22==null?e12.getPrice():e22.getBasePrice()+(e22.getBasePrice()*(e22.getTax()/100))-(e22.getBasePrice()*(e22.getDiscount()/100)))){
            return 1;

        } else {
            return -1;
        }

    }

}

 



