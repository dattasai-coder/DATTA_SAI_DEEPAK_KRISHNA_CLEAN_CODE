package maths;

public class SICI {
	public double si(double principleAmount,double NoofYears,double Interest)
	{
		double simpleInterest=(principleAmount * NoofYears * Interest)/100;
		return simpleInterest ;
	}
	public double ci(double principleAmount,double NoofYears,double Interest)
	{
	    double compoundInterest=principleAmount * Math.pow(1.0+Interest/100.0,NoofYears) - principleAmount;
		return compoundInterest ;
	}
}
