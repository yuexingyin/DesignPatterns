package state;

/**
 * Created by YuexingYin on 7/26/16.
 */
public interface State {
    public String receiveApplication();
    public String qualifyApplicant(double gpa);
    public String admitStudent();
}
