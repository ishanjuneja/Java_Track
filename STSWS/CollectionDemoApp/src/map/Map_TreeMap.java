package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_TreeMap {
	private static final Integer ONE=new Integer(1);
	public static void main(String[] args) {
		// Set up testing data
				 // Set up test data
		        String name[] = {
		            new String("Sohan"),
		            new String("Shailee"),
		            new String("Bharat"),
		            new String("Pawan"),
		            new String("Sachin"),
		            new String("Bharat")
		        };
				
		        //Create HashMap object
		        Map m=new HashMap();
		      
		        
		        //Initialize Frequency table with data
		        for(int i=0; i<name.length;i++){        	
		        	Integer freq=(Integer)m.get(name[i]);  
		        	System.out.println("frequency of :"+name[i]+" is : "+(freq==null?ONE:new Integer(freq.intValue()+1)));
		        	//Adding an Entry to HashMap
		        	m.put(name[i], (freq==null?ONE:new Integer(freq.intValue()+1)));
		        }
		        
		        //Display the size of the Map Object
		        System.out.println(m.size()+ " distinct word detected");
		        
		        System.out.println("Display of HashMap object : "+m);

	}

}
