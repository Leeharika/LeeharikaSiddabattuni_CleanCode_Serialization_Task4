package io.epam.task.CleanCode;
import java.util.Scanner;
import java.io.IOException;
public class App 
{	
	static
	{
		Scanner scannerReferenceVariable=new Scanner(System.in);
		int choiceOfStandard,area;
		boolean fullyAutomated;
    	SimpleAndCompoundInterest obj=new SimpleAndCompoundInterest(10000,2,3);
    	obj.calculateSimpleInterest();
    	obj.calculateCompoundInterest();
    	System.out.format("%s","\nEnter material standard\n1.House with standard material\n2.House with above standard material\n3.House with high standard material\n");
    	choiceOfStandard=scannerReferenceVariable.nextInt();
    	System.out.format("\nEnter area:\n");
    	area=scannerReferenceVariable.nextInt();
    	System.out.format("\nDo you want fully automated house?\nEnter true or false:\n");
    	fullyAutomated=scannerReferenceVariable.nextBoolean();
    	if (fullyAutomated==true)
    	{
    		choiceOfStandard=4;
    	}
    	HouseConstruction hc=new HouseConstruction(area,choiceOfStandard);
    	System.out.format("%s",hc.calculateConstructionCost());
		scannerReferenceVariable.close();
		
	}
    public static void main( String[] args ) throws IOException
    {	
    	
    }
}
