
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        items = new ArrayList();
        this.maxWeight = maxWeight;
    }
    public int totalWeight (){
        int currentWeight = 0;
        for (Item item : items){
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    public void addItem(Item item){
        if (totalWeight () + item.getWeight() <= this.maxWeight){
            items.add(item);           
        }
    }
    public void printItems(){
        for (Item item : items){
            System.out.println(item);
        }
    }
    public Item heaviestItem (){

        if (items.size() == 0){
            return null;
        }
        Item heaviest = items.get(0);
        for (Item item : items){
            if (heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
    public String toString(){
        if (items.size() == 0){
            return "no items (0 kg)";
        } else if (items.size() == 1){
            return "1 item (" + totalWeight () + " kg)";
        }
        return items.size() + " items (" + totalWeight () + " kg)";
    }
    
}
