package state;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class Client {
    public static void main(String [] args){
        Admission admission = new Admission();
        admission.receiveApplication();
        admission.qualifyApplicant(3.5);
        admission.admitStudent();
    }
}
