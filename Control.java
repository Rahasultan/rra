import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {

    private ArrayList<BookBinders> all;
    Scanner in = new Scanner(System.in);
    private double ap;
    private double peparp;
    private int i;


    public Control() {
        all = new ArrayList<>();

    }

    public boolean addBookBinders(int i, String n, String con, double peparp, int papern, double incapsolion) {
        double app = 0;
        Price p = new BookBinders(i, n, con, peparp, papern, incapsolion,app);
        all.add((BookBinders) p);
        return true;
    }

    public boolean addBookBinders(String n, String con, double y, int papern, double incapsolion, double c, double x) {
        BookBinders p = new BookBinders(i, n, con, peparp, papern, ap, incapsolion);
        all.add(p);
        return true;

    }

    public boolean addBookBinders(String n, String con, double peparp, int papern, double ap, double papers) {
        double incapsolion=0;
        BookBinders p = new PaperPrice(i, n, con, peparp, papern, incapsolion, ap, papers, peparp);
        all.add(p);
        return true;
    }

    public ArrayList<BookBinders> getAll() {
        return all;
    }

    public BookBinders searchForBookBinders(int id) {
        boolean found = false;
        int i = 0;
        while (!found && i < all.size()) {
            if (all.get(i) != null) {
                if (all.get(i).getId() == id)
                    found = true;
                else i++;
            } else i++;
        }
        if (i < all.size())
            return all.get(i);
        else return null;
    }

    public boolean delete(BookBinders b) {
        for (int i = 0; i < all.size(); i++) {
            if(all.get(i)==b)
            {
                all.remove(b);
                return true;
            }
        }
        return false;
    }
    public void readBookBandersFile() {
        try {
            Scanner in = new Scanner(new File("C:\\Users\\User\\Desktop\\f.txt"));
            while (in.hasNext()) {
                int i= in.nextInt();
                String n=in.next();
                String con=in.next();
                int y=in.nextInt();
                int papern=in.nextInt();
                double app=in.nextDouble();
                double incapsolion=in.nextDouble();
                addBookBinders(n,con,y,papern,app,incapsolion   );

            }
            in.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error in reding file " + e.getMessage());
        }
    }
        public boolean writeBookBanders ()
        {
                try {
            PrintWriter writer = new PrintWriter(new File("C:\\Users\\User\\Desktop\\f.txt"));

            for (BookBinders x : all) {

                writer.write(x.getId() + " " + x.getName() + " " + x.getContentbook() + " " + ((Price) x).getPeparprice() + " " + ((Price) x).getPapernumber() + "\n");
            }
            writer.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }
    public  void   view()
    {
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
    }
}