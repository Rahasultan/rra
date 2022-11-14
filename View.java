//import java.util.Scanner;
//public class View {
//
//    Control c;
//        Scanner in;
//
//        public View() {
//            c= new Control();
//            in= new Scanner(System.in);
//        }
//        public void start()
//        {
//            System.out.println("___________________________________");
//            System.out.println("    welcome to the publishing house ");
//            System.out.println("___________________________________");
//            while (true)
//            {
//                System.out.println("1: Add New BookBanders\t\t2:View All BookBanders\n" +
//                        "3:Search for BookBanders\t\t0: Exit");
//                int choice=in.nextInt();
//                switch (choice)
//                {
//                    case  1:add();break;
//                    case 2:view();break;
//                    case 3:find();break;
//                    case 0:System.exit(0);
//                }
//            }
//        }
//        public void add()
//        {
//            System.out.println("ID NAME     public BookBinders( id,  name,  contentbook,  peparprice,  papernumber,  incapsolion,  ap \n");
//            int i=in.nextInt();
//            String papernumber=in.next();
//            String name=in.next();
//            String contentbook=in.next();
//            double peparprice=in.nextDouble();
//            double incapsolion=in.nextDouble();
//            double ap=in.nextDouble();
//            boolean added=   c.addBookBinders(i,papernumber,name,contentbook,peparprice,incapsolion,ap);
//            if (added)
//                System.out.println("added successfully");
//            else
//                System.out.println("too much students");
//
//        }
//        public void view()
//        {
//            Student[]all=c.viewAllStudente();
//            System.out.println("ID First Name Last Name Registeration Year");
//
//            for (int i = 0; i <all.length ; i++) {
//                if (all[i]!=null)
//            /*System.out.println(all[i].getId()+"\t"
//            +all[i].getfName()+"\t"+all[i].getlName()
//            +"\t"+all[i].getRegistrationYear());*/.
//                System.out.println(all[i]);
//            }
//
//        }
//        public void find()
//        {
//            System.out.println("input Student ID");
//            int id=in.nextInt();
//            Student s= c.searchForStudent(id);
//            if (s!=null)
//            {
//                System.out.println("ID First Name Last Name Registeration Year");
//                System.out.println(s.getId()+"\t"
//                        +s.getfName()+"\t"+s.getlName()
//                        +"\t"+s.getRegistrationYear());
//            }
//            else
//                System.out.println("no book with this ID");
//        }
//    }
//
//}
