import java.util.Map;
import java.util.TreeMap;

/**
 * A phone directory holds a list of names with a phone number for
 * each name.  It is possible to find the number associated with
 * a given name, and to specify the phone number for a given name.
 * (This version of the class uses a TreeMap to store the data.)
 */
public class PhoneDirectoryWithTreeMap {


    private final TreeMap<String,String> data;

    public PhoneDirectoryWithTreeMap() {
        data = new TreeMap<>();
    }


    public String getNumber( String name ) {
        return data.get(name);
    }


    public void putNumber( String name, String number ) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        data.put(name,number);
    }


    public void print() {
        for ( Map.Entry<String,String> entry : data.entrySet() )
            System.out.println( entry.getKey() + ":  " + entry.getValue() );
    }

}


