import java.util.Objects;

public class BookBinders extends Price{
    private double ap;//السعر الذي يحدده المؤلف

    public BookBinders(int id, String name, String contentbook, double peparprice, int papernumber, double incapsolion, double ap) {
        super(id, name, contentbook, peparprice, papernumber, incapsolion);
        this.ap = ap;
    }
/**هذه الداله تقوم باستدعاء الداله الموجوده في كلاس price وتنفذها باضافة السعر الذي يحدده المؤلف
     */
    public double calculateprice()
    {
        return super.calculateprice()+ap;
    }

    public double getAp() {
        return ap;
    }

    public void setAp(double ap) {
        this.ap = ap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BookBinders that = (BookBinders) o;
        return Double.compare(that.ap, ap) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ap);
    }

    @Override
    public String toString() {
        return "BookBinders{" +
                "ap=" + ap +
                '}';
    }
}
