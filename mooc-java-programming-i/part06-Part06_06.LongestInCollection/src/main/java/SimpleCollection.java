
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String longest(){
        String longest = "";
        if (elements.size() == 0){
            return null;
        }
        for (String line : elements){
            if (longest.length() < line.length()){
                longest = line;
            }
        }
        return longest;
    }
}
