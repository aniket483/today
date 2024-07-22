package practiceday6;
@FunctionalInterface
interface Instrument{
	void play();
}
public class Instrument1 {
	public static void main(String[] args) {
		Instrument piano =()->System.out.println("Piano is playing tan tan tan tan");
		Instrument flute=()->System.out.println("Flute is playing toot toot toot toot");
		Instrument guitar=()->System.out.println("Guitar is playing tin tin tin");
		Instrument[] ins=new Instrument[10];
		for(int i=0;i<10;i++) {
			int rand=(int)(Math.random()*((3-1)+1));
			if(rand==1) {
				ins[i]=piano;
			}
			else if(rand==2) {
				ins[i]=flute;
			}
			else {
				ins[i]=guitar;
			}
			ins[i].play();
		}
		
		
	}

}
