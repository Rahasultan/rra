import java.util.Objects;

public final class  PaperPrice extends BookBinders{
    private double Papersize;
    private double Pperprice;

    public PaperPrice(int id, String name, String contentbook, double peparprice, int papernumber, double incapsolion, double ap, double papersize, double pperprice) {
        super(id, name, contentbook, peparprice, papernumber, incapsolion, ap);
        Papersize = papersize;
        Pperprice = pperprice;
    }

/**الداله تقوم بحساب سعر الورقه
     */
    public double calculatePrice()
    {
        return Pperprice* Papersize;
    }

    public double getPapersize() {
        return Papersize;
    }

    public void setPapersize(double papersize) {
        Papersize = papersize;
    }

    public double getPperprice() {
        return Pperprice;
    }

    public void setPperprice(double pperprice) {
        Pperprice = pperprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaperPrice that = (PaperPrice) o;
        return Double.compare(that.Papersize, Papersize) == 0 && Double.compare(that.Pperprice, Pperprice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Papersize, Pperprice);
    }
}
