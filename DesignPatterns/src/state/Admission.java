package state;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class Admission implements AdmissionInterface {

    private State state;

    public Admission(){
        state = new WaitingState(this);
    }
    @Override
    public void receiveApplication() {
        System.out.print(state.receiveApplication());
    }

    @Override
    public void qualifyApplicant(double gpa) {
        System.out.print(state.qualifyApplicant(gpa));
    }

    @Override
    public void admitStudent() {
        System.out.print(state.admitStudent());
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }
}
