/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class BirdManager {
    
    private ArrayList<Bird> birds;
    
    public BirdManager() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName) {
        birds.add(new Bird (name, latinName));
    }
    
    public void addObservationToBird(String name) {
        for (Bird bird : birds){
            if (bird.getName().equals(name)){
                bird.addObservation();
            }
        }
    }
      
    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void printOneBird(String name) {
        for (Bird bird : birds){
            if (bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
}
