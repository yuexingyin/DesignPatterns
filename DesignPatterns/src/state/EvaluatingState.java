package state;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class EvaluatingState implements State{

    private AdmissionInterface admissionInterface;

    public EvaluatingState(AdmissionInterface admissionInterface){
        this.admissionInterface = admissionInterface;
    }
    @Override
    public String receiveApplication() {
        return "Received already";
    }

    @Override
    public String qualifyApplicant(double gpa) {
        if(gpa >= admissionInterface.GPA){
            admissionInterface.setState(new ProcessingState(admissionInterface));
            return "accepted";
        }else {
            return "denied";
        }
    }

    @Override
    public String admitStudent() {
        return "Haven't been passed";
    }
}
