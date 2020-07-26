package io.epam.task.CleanCode;
public class HouseConstruction {
	int area;
	int materialStandard;
	boolean fullyAutomated;
	HouseConstruction(int area,int materialStandard)
	{
		this.area=area;
		this.materialStandard=materialStandard;
	}
	String calculateConstructionCost()
	{
		switch(materialStandard)
		{
			case 1:return("Construction cost of house : "+area*1200);
			case 2:return("Construction cost of house : "+area*1500);
			case 3:return("Construction cost of house : "+area*1800);
			case 4:return("Construction cost of house : "+area*2500);
			default:return("Invalid choice of Standard");
		}			
	}
}
