package compa.excep;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class ExcTest {
    public static void main (String[] args) throws MidiUnavailableException{
        ExcTest mt = new ExcTest();
        mt.play();
    }

    public void play() throws MidiUnavailableException{

            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("we got a sequnec");

            System.out.println("bummer");


    }
}
