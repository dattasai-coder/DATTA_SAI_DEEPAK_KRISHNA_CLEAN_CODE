package maths;

public class HouseRent 
{
	public double houseRent(String standard,double area)
	{
		int costRequiredForMaterials;
		if(standard.equals("sm"))
		{
			costRequiredForMaterials=1200;
		}
		else if(standard.equals("asm"))
		{
			costRequiredForMaterials=1500;			
		}
		else if(standard.equals("hsm"))
		{
			costRequiredForMaterials=1800;			
		}
		else
		{
			costRequiredForMaterials=2500;			
		}
		double constructionCost=area*costRequiredForMaterials;
		return constructionCost;
		
	}
}