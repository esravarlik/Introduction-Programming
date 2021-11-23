import mernisReference.HDGKPSPublicSoap;

public class MernisAdapter implements GamerCheckService{

    @Override
    public boolean CheckIfRealPerson(Gamer gamer) throws Exception {

        HDGKPSPublicSoap client = new HDGKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(),
                gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
    }
}

