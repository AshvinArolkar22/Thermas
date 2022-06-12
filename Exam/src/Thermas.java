public class Thermas {
	String brand;
	double liquid;
	String liq_name;
	double liq;
	double liq2;
	
	Thermas(String brand,double liquid,String liq_name,double liq,double liq2)
	{
		this.brand=brand;
		this.liquid=liquid;
		this.liq_name=liq_name;
		this.liq=liq;
		this.liq2=liq2;
	}
	double addLiquid(double liq)
	{
		liquid=liquid+liq;
		return liquid;
	}
	double PourLiquid(double liq)
	{
		liquid=liquid-liq2;
		return liquid;
	}
	void display()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Liquid: "+liq_name);
		System.out.println("Liquid: "+liq+" litres");
		System.out.println("After poured: "+liq2+" litres");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermas u1=new Thermas("Godrej",0,"Orange Juice",0.5,0.25);
		u1.addLiquid(0.5);
		u1.PourLiquid(0.25);
		u1.display();

	}

}
