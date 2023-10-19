
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
public class Room {
    private ArrayList <Person> people;
    public Room (){
        this.people = new ArrayList();
    }
    public void add(Person person){
        people.add(person);
    }
    public boolean isEmpty(){
        return people.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return people;
    }
    public Person shortest(){

        if (people.size() == 0){
            return null;
        }
        Person shortest = people.get(0);
        for (Person person : people){
            if (shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if (people.size() == 0){
            return null;
        }
        Person taken = this.shortest();
        people.remove(taken);
        return taken;
    }
}
