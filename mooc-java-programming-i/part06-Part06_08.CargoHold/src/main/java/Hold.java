
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
public class Hold {
    private ArrayList<Suitcase> suitcaseHold;
    private int maximumHold;

    public Hold(int maximumHold) {
        suitcaseHold = new ArrayList();
        this.maximumHold = maximumHold;
    }
    public int totalWeight (){
        int currentWeight = 0;
        for (Suitcase suitcase : suitcaseHold){
            currentWeight += suitcase.totalWeight();
        }
        return currentWeight;
    }
    public void addSuitcase(Suitcase suitcase){
        if (totalWeight () + suitcase.totalWeight() <= this.maximumHold){
            suitcaseHold.add(suitcase);           
        }
    }
    public void printItems(){
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : suitcaseHold){
            suitcase.printItems();
        }
    }
    public String toString(){
        if (suitcaseHold.size() == 0){
            return "no suitcases (0 kg)";
        } else if (suitcaseHold.size() == 1){
            return "1 suitcase (" + totalWeight () + " kg)";
        }
        return suitcaseHold.size() + " suitcases (" + totalWeight () + " kg)";
    }
}
