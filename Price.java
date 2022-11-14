import java.util.Objects;

public class Price extends Book {
    private double peparprice;//سعرالورقة
    private int papernumber;//عدد الورق
    private double incapsolion;

    public Price(int id, String name, String contentbook, double peparprice, int papernumber,double incapsolion) {
        super(id, name, contentbook);
        this.peparprice = peparprice;
        this.papernumber = papernumber;
        this.incapsolion=incapsolion;
    }
    /**هذه الداله تقوم بضرب عدد الورق في سعر الورقه
     */

    public double calculateprice(){
        return papernumber*peparprice+incapsolion;
    }


    public double getPeparprice() {
        return peparprice;
    }

    public void setPeparprice(double peparprice) {
        this.peparprice = peparprice;
    }

    public int getPapernumber() {
        return papernumber;
    }

    public void setPapernumber(int papernumber) {
        this.papernumber = papernumber;
    }

    public double getIncapsolion() {
        return incapsolion;
    }

    public void setIncapsolion(double incapsolion) {
        this.incapsolion = incapsolion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Price price = (Price) o;
        return Double.compare(price.peparprice, peparprice) == 0 && papernumber == price.papernumber && Double.compare(price.incapsolion, incapsolion) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), peparprice, papernumber, incapsolion);
    }
}


