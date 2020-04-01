package behavior.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		
		Subject subject = new Subject();
		HexObserver hexObserver = new HexObserver(subject);
		BinaryObserver binaryObserver = new BinaryObserver(subject);
		System.out.println("ObserverPatternDemo:");
		subject.setState(2);
	}
}
