package state;

/**
 * Created by YuexingYin on 7/26/16.
 */
public interface AdmissionInterface {
    public static final double GPA = 3.0;

    public void receiveApplication();
    public void qualifyApplicant(double gpa);
    public void admitStudent();

    public State getState();
    public void setState(State state);
}
