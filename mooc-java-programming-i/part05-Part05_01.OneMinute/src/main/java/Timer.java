/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand hundrethOfSecond;

    public Timer() {
        this.seconds = new ClockHand (60);
        this.hundrethOfSecond = new ClockHand (100);
    }

    public void advance() {
        this.hundrethOfSecond.advance();
        
        if (this.hundrethOfSecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return  this.seconds + ":" + this.hundrethOfSecond;
    }
}