package Composite;

import java.util.Vector;

/**
 * Created by YuexingYin on 8/2/16.
 */
public abstract class Supervisor extends Employee {
    protected Vector directReport = new Vector();

    public void stateName(){
        super.stateName();
        if(directReport.size() > 0){
            for(int i = 0 ; i < directReport.size() ; i++){
                Employee employee = (Employee) directReport.elementAt(i);
                employee.stateName();
            }
        }
    }

    public void add(Employee employee){
        this.directReport.addElement(employee);
    }
}
