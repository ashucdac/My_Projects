package com.src.jooApproach;
public class Speak {
    public static void main(String[] args) {
        Speak s = new GoodSpeak();

          ((Tone)s).up();		// Correct
//        s.up();				// wrong : because up() is not in Speak class
//        ((GoodSpeak)s).up();	// Correct
//        (GoodSpeak)s.up();	// wrong : Syntax not correct
//        ((GoodSpeak)s).up();	// Correct
//        (Tone)(GoodSpeak)s.up(); // wrong : Syntax not correct
//        ((Tone)(GoodSpeak)s).up();
    }
}
class GoodSpeak extends Speak implements Tone{
    public void up(){
        System.out.println("UP UP UP");
    }
}
interface Tone{
    void up();
}