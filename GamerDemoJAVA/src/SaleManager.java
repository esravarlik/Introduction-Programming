public class SaleManager implements  SaleService {
    @Override
    public double sell(Game game, Gamer gamer, Campaign campaign) {

        double total = game.getPrice() * (campaign.getDiscount() /100);
        double discountedPrice = game.getPrice() - total;
        System.out.println("Discounted Price: " + discountedPrice);

        double remainder = gamer.getWallet() - discountedPrice;
        System.out.println("Remainder: " + remainder);
        return remainder;
    }
}
