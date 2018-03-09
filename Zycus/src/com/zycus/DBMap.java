package com.zycus;
import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.Serializer;
import java.util.Map;
 
public class DBMap {
 
    public static void readMapFromDisk() {
        //use DBMaker to create a DB object of HashMap stored on disk
        //provide location
    	DB db = DBMaker.newFileDB("/tmp/testMapDB.db").make();
        		
        		
 
        //use the DB object to open the "myMap" HashMap
        Map<String, String> map = db.hashMap("myMap", Serializer.STRING, Serializer.STRING).createOrOpen();
 
        //read from map
        for (int i = 0; i < 1000; i++) {
            System.out.println(map.get("key" + i));
        }
 
        //close to protect from data corruption
        db.close();
    }
 
}
//package com.zycus;
//
//import java.util.HashMap;
//import org.mapdb.*;
//import org.mapdb.Serializer;
//public class DBMap
//{
//    public static void main(String [] args)
//    {
//        HashMap<Double, String> hmap = new HashMap<Double, String>();
//        //Adding elements to HashMap
//        
//        DB db = DBMaker.fileDB("/tmp/testMapDB.db").make();
//        
//
//        try {
//	        for(Double i=0.0; i < 10000000000000.0; i++){
//	        	hmap.put(i, "AZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZzBAZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZzBAZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZzBAZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZzBAZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZzBAZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZzBAZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZzBAZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZzB");    	
//	        }
//        }
//        catch (OutOfMemoryError e){
//        	
//        	System.out.println("This is exception");
//        	System.out.println(e.getMessage());
//        }
//        System.out.println("This should raise exception");
////        //FOR LOOP
////        System.out.println("For Loop:");
////        for (Map.Entry me : hmap.entrySet()) {
////          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
////        }
////
////        //WHILE LOOP & ITERATOR
////        System.out.println("While Loop:");
////        Iterator iterator = hmap.entrySet().iterator();
////        while (iterator.hasNext()) {
////             Map.Entry me2 = (Map.Entry) iterator.next();
////          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
////        } 
//    }
//}