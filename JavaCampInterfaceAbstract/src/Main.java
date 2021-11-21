import mernisReference.EVSKPSPublicSoap;
import java.util.Date;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerNeroManager =new NeroCustomerManager();
        System.out.println("NERO");
        customerNeroManager.save(new Customer("3**********","Esra","VARLIK", LocalDate.of(1998,10,16),1));

        BaseCustomerManager customerStarbucksManager =new StarbucksCustomerManager(new MernisServiceAdapter());
        System.out.println("STARBUCKS");
        customerStarbucksManager.save(new Customer("1**********","Ü******","*****K",LocalDate.of(2004,2,1),1));
    }
}
