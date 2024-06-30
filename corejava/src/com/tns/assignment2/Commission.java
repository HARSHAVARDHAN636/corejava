/*Define a class Commission described as follows:
Data Members: Name, Address, Phone, Sales_amount 
Member methods:
(i) To accept details of the sales employee
(ii) to calculate the commission as follows: Sales_amount >= 100000, commission = 10%; 50000 <= Sales_amount < 100000, commission = 5%; 30000 <= Sales_amount < 50000, commission = 3%; Sales_amount < 30000, no commission.
Write the main method to create an object of a class and call the above member method.*/
package com.tns.assignment2;

public class Commission {
	

	private String name;
	private String address;
	private int phone;
	private int sales_amount;
	private double commission;
	

	
	

public void details() { // to get inputs from the user
	System.out.println("Enter the name:");
	System.out.println("enter the address");
	System.out.println("enter the phone number");
	System.out.println("enter the sales_amount");


}





@Override
public String toString() {
	return "Commission [ name=" + name + ", address=" + address + ", phone=" + phone + ", sales_amount="
			+ sales_amount + ", commission=" + commission + "]";
}




public String getName() {
	return name;
}





public void setName(String name) {
	this.name = name;
}





public String getAddress() {
	return address;
}





public void setAddress(String address) {
	this.address = address;
}





public int getPhone() {
	return phone;
}





public void setPhone(int phone) {
	this.phone = phone;
}





public int getSales_amount() {
	return sales_amount;
}





public void setSales_amount(int sales_amount) {
	this.sales_amount = sales_amount;
}





public double getCommission() {
	return commission;
}





public void setCommission(double commission) {
	this.commission = commission;
}


//method for the commission//
public void commission()
{
	if(sales_amount>=100000)
	{
		commission=(float) (sales_amount*0.10);
		System.out.println("the commission when >100000 is"+commission);
	}
	else if(sales_amount<100000 && sales_amount>=50000)
	{
		commission=(float) (sales_amount*0.05);
		System.out.println("the commision when sales value is between 50000 and 100000 is "+commission);
	}
	else if(sales_amount<50000 && sales_amount>=30000)
	{
		commission=(float) (sales_amount*0.03);
		System.out.println("the commision when sales value is between 50000 and 30000 is "+commission);
	}
	else if (sales_amount<30000)
	{
		commission=0;
		System.out.println("the commission for the sales value less than 30000 is "+commission);
	}
}


}
