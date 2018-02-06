package Objectives;

import java.util.ArrayList;
import java.util.Date;

public class Operations {
    static ArrayList<ReportHolder> holder = new ArrayList();
    public Operations(ReportHolder stackHolder){
        holder.add(stackHolder);
    }

    Operations(){
        
    }
    public ArrayList<ReportHolder> getStacks(){
        return holder;
    }
}
