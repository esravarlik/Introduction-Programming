import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(1,"ESRA","VARLIK",
                LocalDate.of(1998,10,16),"3**********",1000);

        GamerManager gamerManager= new GamerManager(new MernisAdapter());
        gamerManager.add(gamer);
        gamerManager.update(gamer);

        System.out.println("**********     *     **********");

        Game game1 = new Game(1,"Valorant",100);
        Game game2 = new Game(2,"League of Legends",90);

        GameManager gameManager = new GameManager();
        gameManager.add(game1);
        gameManager.add(game2);

        System.out.println("**********     *     **********");

        Campaign newYearSale = new Campaign("New Year Sale",LocalDate.of(2021,11,23),
                LocalDate.of(2022,01,07),50);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(newYearSale);
        System.out.println("**********     *     **********");

        SaleManager saleManager = new SaleManager();
        saleManager.sell(game2,gamer,newYearSale);
        System.out.println("*Finish*");
    }
}
