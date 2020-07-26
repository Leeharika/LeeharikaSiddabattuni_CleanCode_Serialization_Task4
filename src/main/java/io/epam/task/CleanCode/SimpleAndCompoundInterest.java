package io.epam.task.CleanCode;
public class SimpleAndCompoundInterest 
{
	double principleAmount;
	double rateOfInterest;
	double timeInYears;
	SimpleAndCompoundInterest(double principleAmount,double timeInYears,double rateOfInterest)
	{
		this.principleAmount=principleAmount;
		this.timeInYears=timeInYears;
		this.rateOfInterest=rateOfInterest;
	}
	void calculateSimpleInterest()
	{
		double SimpleInterest=(principleAmount*timeInYears*rateOfInterest)/100;
		System.out.format("%s","Simple Interest = ");
		System.out.format("%f",SimpleInterest);
	}
	void calculateCompoundInterest()
	{
		double CompoundInterest = principleAmount*(Math.pow((1 + rateOfInterest / 100),timeInYears))-principleAmount;
		System.out.format("\n%s","Compound Interest = ");
		System.out.format("%f",CompoundInterest);
	}
	
}
