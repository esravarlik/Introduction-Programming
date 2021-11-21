import mernisReference.EVSKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService{
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {

        EVSKPSPublicSoap client = new EVSKPSPublicSoap();
            return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
        }
    }
