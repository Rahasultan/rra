import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class GUI  {



    /**
     * Created by students on 06/11/22.
     */
        Control c;
        private JPanel mainPanel;
        private JButton addButton;
        private JButton viewButton;
        private JButton searchButton;
        private JButton saveButton;
        private JPanel allCards;
        private JPanel c1;
        private JPanel c2;
        private JPanel c3;
        private JTextField t1;
        private JTextField t2;
        private JTextField t3;
        private JTextField t4;
        private JButton addEmployeeButton;
        private JTextArea textArea1;
        private JTextField textField5;
        private JButton searchEmployeeButton;
        private JTextArea textArea2;

        public GUI() {
            c= new Control();
            c.readBookBandersFile();
            textArea1.setText(fillAll());
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    allCards.removeAll();
                    allCards.add(c1);
                    allCards.repaint();
                    allCards.revalidate();
                }
            });
            viewButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    allCards.removeAll();
                    allCards.add(c2);
                    allCards.repaint();
                    allCards.revalidate();
                    fillAll();

                }
            });

            searchButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    allCards.removeAll();
                    allCards.add(c3);
                    allCards.repaint();
                    allCards.revalidate();
                }
            });
            addEmployeeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i=Integer.parseInt(t1.getText());
                    String n=t2.getText();
                    String con=t3.getText();
                    double peparp= Double.parseDouble(t4.getText());
                    Label t5 = new Label();
                    int papern=Integer.parseInt(t5.getText());
                    Label t6 = new Label();
                    double incapsolion= Double.parseDouble(t6.getText());
                    boolean added =  c.addBookBinders(i, n, con, peparp, papern,incapsolion);
                    if (added)
                    {
                        JOptionPane.showMessageDialog(null,"Added Successfully");
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                        t6.setText("");
                        textArea1.setText(fillAll());


                    }
                    else
                        JOptionPane.showMessageDialog(null,"Somr thing went Wrong");


                }
            });
            searchEmployeeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i= Integer.parseInt(textField5.getText());
                   BookBinders x=c.searchForBookBinders(i);
                    if (x!=null)
                        textArea2.setText(x.toString());
                    else textArea2.setText("not found");
                }
            });
            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean saved= c.writeBookBanders();
                    if (saved)
                        JOptionPane.showMessageDialog(null,"Saved Successfully");

                }
            });
        }
        public String fillAll()
        {
            allCards.removeAll();
            allCards.add(c2);
            allCards.repaint();
            allCards.revalidate();
            String s="ID Name Year Annual price\n";
            ArrayList<BookBinders> all= c.getAll();
            for (BookBinders x:all) {
                if (x!=null)
                    s=s+x+"\n";

            }
            //textArea1.setText(s);
            return s;
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("GUI");
            frame.setContentPane(new GUI().mainPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // frame.pack();
            frame.setSize(4000,4000);
            frame.setLocation(4000,4000);
            frame.setVisible(true);
        }
    }



