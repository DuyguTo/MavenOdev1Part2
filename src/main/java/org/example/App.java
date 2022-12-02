package org.example;

import Odev2.Abstarct.BaseCustomerManager;
import Odev2.Concrete.NeroCustomerManager;
import Odev2.Customer;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Applicaton Started!" );

        BaseCustomerManager customerManager = new NeroCustomerManager();

        // Save method examples
        customerManager.Save(new Customer("Ali", "Yilmaz",  LocalDate.of(1985, 1, 17), "15455" ) );
        System.out.println();

        Customer cust1 = new Customer("Duygu", "Yorulmaz",  LocalDate.of(1977, 1, 17), "67543");
        customerManager.Save(cust1);

        //I added this function by mysef, homework part3
        customerManager.Delete(cust1);

        System.out.println();
        customerManager.Delete(new Customer("Sami", "Varmaz",  LocalDate.of(1985, 1, 17), "15455" ) );

    }


}
