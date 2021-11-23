public class GamerManager implements GamerService{
    public GamerManager(MernisAdapter mernisAdapter) {

    }
    GamerCheckService gamerCheckService;

    public GamerManager(GamerCheckManager gamerCheckService) {
        this.gamerCheckService = (GamerCheckService) gamerCheckService;

    }
    @Override
    public void add(Gamer gamer){
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " added.");
    }

    @Override
    public void delete(Gamer gamer){
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " deleted.");
    }

    @Override
    public void update(Gamer gamer){
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " updated.");
    }
}
