package day3;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {
	
	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		
		for(int i=0;i<3;i++){
	// 2. ask the user for a sentence
		String sentence;
	sentence = JOptionPane.showInputDialog("Make a sentence.");
	// 3. call the speak met
speak(sentence);
	// 4. repeat steps 2 and 3 a lot of times

	
	
		}
	}
	
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
	}

}
