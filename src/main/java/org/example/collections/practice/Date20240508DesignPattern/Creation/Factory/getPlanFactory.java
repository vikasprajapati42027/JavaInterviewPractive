package org.example.collections.practice.Date20240508DesignPattern.Creation.Factory;

public class getPlanFactory {

    public Plan getPlan(String Planype)
    {
        if(Planype==null)
        {
            return  null;
        }else if(Planype.equalsIgnoreCase("DomesticPlan"))
        {
            return new DomesticPlan();
        }else if(Planype.equalsIgnoreCase("CommercialPLAN"))
        {
            return new CommercialPlan();
        }else if(Planype.equalsIgnoreCase("InstitutionalPlan"))
        {
            return new InstitutionalPlan();
        }
        return null;

    }
}
