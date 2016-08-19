package state;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class WaitingState implements State {

    private AdmissionInterface admissionInterface;

    public WaitingState(AdmissionInterface admissionInterface){
        this.admissionInterface = admissionInterface;
    }
    @Override
    public String receiveApplication() {
        admissionInterface.setState(new EvaluatingState(admissionInterface));
        return "Receive the application";
    }

    @Override
    public String qualifyApplicant(double gpa) {
        return "Must receive the application first";
    }

    @Override
    public String admitStudent() {
        return "Must receive the application first";
    }


}
