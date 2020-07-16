package behavior.state;

public class Human {
    public State state;

    public void doSomething() {
        this.state.doSomething();
    }

    public void setState(State s) {
        state = s;
    }
}
