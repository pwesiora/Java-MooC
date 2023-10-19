
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Stack {
    
    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public void add(String value){
        list.add(value);
    }
    public ArrayList<String> values(){
        return list;
    }
    public String take(){
        String top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
}
