
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class JokeManager {
    private ArrayList<String> list;
    public JokeManager() {
        list = new ArrayList();
    }
    
    public void addJoke(String joke){
        list.add(joke);
    }
    public void printJokes(){
        for (int i = 0; i < list.size(); i++){
            System.out.println(i+1 + ": " + list.get(i));           
        }
    }
    public String drawJoke(){
        if(list.size() == 0){
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(list.size());
            return list.get(index);
            }
        }
    }

