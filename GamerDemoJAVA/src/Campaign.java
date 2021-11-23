import java.time.LocalDate;

public class Campaign {

    private String campaignName;
    private LocalDate startDate;
    private LocalDate finishDate;
    private double discount;

    public Campaign(){

    }

    public Campaign(String campaignName,LocalDate startDate, LocalDate finishDate,int discount){

        super();
        this.campaignName = campaignName;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.setDiscount(discount);
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return finishDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.finishDate = endDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
