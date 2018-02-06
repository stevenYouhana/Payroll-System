package Workers;

import Positions.Subordinate;
import java.util.ArrayList;

//this class is used to hold and return the Person types lists
public class PersonOperations implements Runnable {
    private static ArrayList<IPersonalisable> personList= new ArrayList(28);// use for reporting
    private static ArrayList<SalariedPerson> salariedWorkers = new ArrayList(23);
    private static ArrayList<ContractorPerson> contractWorkers = new ArrayList(5);
    private static ArrayList<Manager> managers = new ArrayList();
    static Subordinate[] subordinates;
    
    public static void addSalariedWorker(SalariedPerson salariedPerson){
        salariedWorkers.add(salariedPerson);
    }
    public static void addContractorWorker(ContractorPerson contractorPerson){
        contractWorkers.add(contractorPerson);
    }  
    public ArrayList getPersonList(){
        return personList;
    }
    
    public IPersonalisable getPersonList(int i){
        return personList.get(i);
    }
    public IPersonalisable getPerson(String personName){
        int i = 0;
        for(IPersonalisable person : personList){
            i++;
            if(person.getPersonFullName().equals(personName)){
                 break;   
            }
        }
        return personList.get(i-1);
    }

    public ArrayList getSalariedWorkers(){
        return salariedWorkers;
    }
    public SalariedPerson getSalariedWorkers(int i){     
        return salariedWorkers.get(i);
    }
 
    public ArrayList<Manager> getManagers(){
        return managers;
    }
    public Manager getManagers(String managerName){
        for(Manager manager : managers){
            if(manager.getManagerName() == managerName){
                return manager;
            }
        }
        return null;
    }
    public Manager getAManager(int i){
        return managers.get(i);
    }
 

    public ArrayList getContractWorkers(){
        return contractWorkers;
    }
    public ContractorPerson getContractor(int i){
        return contractWorkers.get(i);
    }
    public ContractorPerson getContractor(String person){
        String ret;
        for(ContractorPerson contractor : contractWorkers){
            if(contractor.getPersonFullName().equals(person)){
                return contractor;
            }
        }
        return null;
    }

    @Override
    public void run() {
 
    }

}
