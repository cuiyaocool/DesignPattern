package behavior.state;

public class OldState extends State {
    @Override
    public void doSomething() {
        System.out.println("老人,多休息");
        human.state = new ChirldState();
        human.state.setHuman(human);
    }

}
