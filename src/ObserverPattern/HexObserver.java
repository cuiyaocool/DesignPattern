package ObserverPattern;

public class HexObserver extends Observer{

	public HexObserver(Subject subject) {
		this.subject = subject;
		subject.attatchObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("HexObserver: receive " + Integer.toHexString(subject.getState()));
	}
}
