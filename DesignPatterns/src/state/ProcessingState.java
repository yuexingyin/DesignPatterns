package state;


/**
 * Created by YuexingYin on 7/26/16.
 */
public class ProcessingState implements State{

    private AdmissionInterface admissionInterface;

    public ProcessingState(AdmissionInterface admissionInterface){
        this.admissionInterface = admissionInterface;
    }

    @Override
    public String receiveApplication() {
        return "Received Already";
    }

    @Override
    public String qualifyApplicant(double gpa) {
        return "Passed";
    }

    @Override
    public String admitStudent() {
        return "Admitted";
    }
}
