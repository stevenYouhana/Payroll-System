
package java1project;
import Frames.*;
import Objectives.DateHolder;
import javax.swing.JFrame;
import Workers.*;
import Positions.*;
import java.util.ArrayList;
/**
 *
 * @author Steven
 */
public class Java1Project {
    
    public static void main(String[] args) {
        //TESTING
        Manager manager = new Manager();
        DateHolder dateHolder = new DateHolder();
        
        SalariedPerson vBell = new ProjectManager("Victoria", "Bell","11/01/1978", PayCycle.FORTNIGHTELY, "30/01/1978");
        SalariedPerson aBlack = new SystemAdministrator("Andrew", "Black","15/04/1976", PayCycle.MONTHLY, "5/05/2013");
        SalariedPerson aSampson = new ProgramDeveloper("Andrew", "Sampson","9/04/1984", PayCycle.FORTNIGHTELY, "4/07/2010");
        SalariedPerson kHudson = new BranchManager("Kate", "hudson","13/07/1981", PayCycle.MONTHLY, "11/03/2013");
        SalariedPerson sGreen = new BranchManager("Scarlet", "Green","20/03/1980", PayCycle.MONTHLY, "10/05/2013");
        SalariedPerson aGreen = new BranchManager("Amanda", "Green","5/04/1979", PayCycle.MONTHLY, "14/10/2014");
        SalariedPerson aSimpson = new SeniorProgramDeveloper("Ashley", "Simpson","12/05/1984", PayCycle.MONTHLY, "15/06/2010");
        SalariedPerson cWhite = new SystemAnalyst("Carol", "White","20/10/1975", PayCycle.MONTHLY, "10/01/2014");
        ContractorPerson eTang = new Tester("Elena", "Tang","11/02/1969");
        ContractorPerson tGreen = new Tester("Tessa", "Green","31/10/1958"); 
        SalariedPerson dGalloway = new ProgramDeveloper("David", "Galloway","6/12/1981", PayCycle.MONTHLY, "5/11/2012");
        SalariedPerson bTurner = new SystemAnalyst("Brad", "Turner","22/11/1988", PayCycle.MONTHLY, "26/05/2014");
        ContractorPerson dChad = new Tester("David", "Chad","9/06/2014");
        SalariedPerson bJohn = new AdministrationManager("Bill", "Johns","13/04/1981", PayCycle.MONTHLY, "10/05/2012");
        SalariedPerson eWhite = new FinancialAdministrator("Eric", "White","21/05/1984", PayCycle.FORTNIGHTELY, "10/4/2011");
        SalariedPerson jSmith = new HROfficer("Julia", "Smith","17/02/1973", PayCycle.MONTHLY, "13/06/2010");
        SalariedPerson mBrown = new SalesManager("Michael", "Brown","25/12/1985", PayCycle.FORTNIGHTELY, "21/07/2012");
        SalariedPerson aDillon = new ProgramDeveloper("Alex", "Dillon","10/03/1989", PayCycle.FORTNIGHTELY, "14/09/2014");
        SalariedPerson pGordon= new Receptionist("Pete", "Gordon","30/09/1983", PayCycle.FORTNIGHTELY, "10/05/2010");
        SalariedPerson cHond = new ProgramDeveloper("Charlotte", "Hond","1/07/1988", PayCycle.FORTNIGHTELY, "28/02/2012");
        SalariedPerson jDowman = new SystemAdministrator("Joanne", "Dowman","13/12/1980", PayCycle.FORTNIGHTELY, "7/07/2014");
        ContractorPerson hChan = new SalesConsultant("Helen", "Chan","11/01/1991");
        SalariedPerson cBennet = new ProjectManager("Christine", "Bennet","16/06/1982", PayCycle.FORTNIGHTELY, "11/06/2011");
        SalariedPerson mPerry = new SystemAdministrator("Michael", "Perry","12/11/1977", PayCycle.FORTNIGHTELY, "01/03/2014");
        SalariedPerson jNorton = new SeniorProgramDeveloper("John", "Norton","17/07/1980", PayCycle.MONTHLY, "10/09/2010");
        SalariedPerson aBlank = new SystemAnalyst("Andrew", "Blank","15/09/1981", PayCycle.MONTHLY, "19/08/2014");
        ContractorPerson jCarol = new Tester("James", "Carol","24/03/1978");
        SalariedPerson jMint = new CEO("James","Mint","28/12/1977",PayCycle.MONTHLY,"10/01/2010");
        
//        
        
//        SalariedPerson marv = new AdministrationManager("marv","Mah","17/04/1990",PayCycle.FORTNIGHTELY,"10/07/2017");
//        SalariedPerson lee = new FinancialAdministrator("lee","Eazy","17/04/1990",PayCycle.MONTHLY,"10/07/2017");
//        SalariedPerson luke = new AdministrationManager("luke","Lue","17/04/1990",PayCycle.FORTNIGHTELY,"10/07/2017");  
//        ContractorPerson James = new Tester("James","Lee","21/2/1988");
//        SalariedPerson Sam = new CEO("Sam","Will","4/7/1978",PayCycle.FORTNIGHTELY,"3/2/2012");
//        
        
        //set first date
        dateHolder.run();
        manager.run();
//---------------------------------------------------

        //FRAMES
        Operations ops = new Operations();
        ops.setMainFrame();
        
        Workers.PersonOperations pOps = new Workers.PersonOperations();
        
    }
    
}
