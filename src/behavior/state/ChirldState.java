package behavior.state;

public class ChirldState extends State {
    @Override
    public void doSomething() {
        System.out.println("小孩子，玩耍吧");
        human.state = new OldState();
        human.state.setHuman(human);
    }
}
