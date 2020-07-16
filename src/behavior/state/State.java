package behavior.state;

public abstract class State {
    protected Human human;

    public abstract void doSomething();

    public void setHuman(Human human) {
        this.human = human;
    }
}
