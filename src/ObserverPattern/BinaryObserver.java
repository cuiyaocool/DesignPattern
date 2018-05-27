package ObserverPattern;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.attatchObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("BinaryObserver receive " + Integer.toBinaryString(subject.getState()));
	}
}
