package compa.excep;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class Test {
    public static void main(String[] args){
        Test mt = new Test();
        mt.play();
    }

    public void play(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("we got a sequnec");
        }catch(MidiUnavailableException ex){
            System.out.println("bummer");
        }
     ;
    }
}
