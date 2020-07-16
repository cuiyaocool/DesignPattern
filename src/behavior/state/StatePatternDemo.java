package behavior.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        Human human = new Human();
        human.state = new ChirldState();
        human.state.setHuman(human);
        human.doSomething();
        human.doSomething();
        human.doSomething();
    }
}
