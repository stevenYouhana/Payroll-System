package Workers;
import Positions.Subordinate;
//manager will have a list of workers
//manager could also have a manager
public class Manager implements Runnable {
    String managerName;
    double bonusFund = 5000;
    PersonOperations ops = new PersonOperations();
    Subordinate subordinate;
    
    public Manager(String managerName){
        this.managerName = managerName;
        addManager(this);
        //matchSubordinates();
        
    }
    public Manager(){
        
    }
    
    int getListSize(String managerName){
        int size = 0;
        for(int i=0; i<ops.getPersonList().size(); i++){
            if(ops.getPersonList(i).getManagerName() == managerName){
                size++;
            }
        }
        return size;
    }
    public void addManager(Manager manager){
        ops.getManagers().add(manager);
    }
    public String getManagerName(){
        return managerName;
    }
    public double getBonusFund(){
        return bonusFund;
    }
    public void updateBonusFund(double takeOut){
        bonusFund -= takeOut;
    }
    @Override
    public String toString(){
        return managerName;
    }

    @Override
    public void run() {  
        Manager AGreen = new Manager("Amanda Green");
        Manager ASimpson = new Manager("Ashley Simpson");
        Manager BJohns = new Manager("Bill Johns");
        Manager CHond = new Manager("Charlotte Hond");
        Manager JMint = new Manager("James Mint");
        Manager JSmith = new Manager("Julia Smith");
        Manager KHudson = new Manager("Kate Hudson");
        Manager MBrown = new Manager("Michael Brown");
        Manager VBell = new Manager("Victoria Bell");
    }
    
}
