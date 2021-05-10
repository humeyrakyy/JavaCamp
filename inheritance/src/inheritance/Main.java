package inheritance;


public class Main {

	
	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();	
		engin.customerNumber= " 12345 ";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber= " 78910 ";
        
        UnionCustomer abc= new UnionCustomer();
        abc.customerNumber= " 99999 "; 
        
        
       CustomerManager customerManager = new CustomerManager();

       Customer[] customers = {engin, abc, hepsiBurada,};
        
       customerManager.addMultiple(customers);
       
       
       //customerManager.add(hepsiBurada);
       //customerManager.add(engin);
       //customerManager.add(abc);

       
	}

}
