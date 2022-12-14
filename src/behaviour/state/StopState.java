package behaviour.state;

public class StopState implements State{
    @Override
    public void doAction(StateContext context) {
        System.out.println("player is in stop state...");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }

}
