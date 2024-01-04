import javax.swing.*;

// building ticket booking system
//what we need
//    person name email mob no source destiny date of journy birth coach seat no dob gender
public class Main {
    public static void main(String[] args) {
//        create JFrame to design frame
        JFrame frame=new JFrame("HOTEL MANAGEMENT SYATEM");
//       to provideframe size
//        to display the lables and text field
        JLabel namelb = new JLabel("Name: ");
        JTextField nametf = new JTextField();

        JLabel emaillb = new JLabel("Email: ");
        JTextField emailtf = new JTextField();

        JLabel mobnolb = new JLabel("Mobile No: ");
        JTextField mobnotf = new JTextField();

        JLabel arivallb = new JLabel("arival date: ");
        JTextField arivaltf = new JTextField();

        JLabel departlb = new JLabel("departure date: ");
        JTextField departtf = new JTextField();

        JLabel florpreflb = new JLabel("Flour Preference: ");
        JTextField florpreftf = new JTextField();

        JLabel agelb = new JLabel("Age: ");
        JTextField ageltf= new JTextField();

        JLabel amountlb = new JLabel("amount: ");
        JTextField amounttf= new JTextField();

//        to add button
        JButton bookTicketBtn= new JButton("Book Now");
        JButton cancelbtn= new JButton("Clear");
        JButton clearbtn= new JButton("Cancel");
// set size of components and position in the frame
//        left side
        namelb.setBounds(20,30,100,30);
        nametf.setBounds(120,30,150,30);

        emaillb.setBounds(20,70,100,30);
        emailtf.setBounds(120,70,150,30);

        mobnolb.setBounds(20,110,100,30);
        mobnotf.setBounds(120,110,150,30);

        agelb.setBounds(20,150,100,30);
        ageltf.setBounds(120,150,150,30);
//right side
        arivallb.setBounds(300,30,200,30);
        arivaltf.setBounds(420,30,150,30);

        departlb.setBounds(300,70,200,30);
        departtf.setBounds(420,70,150,30);

        florpreflb.setBounds(300,110,200,30);
        florpreftf.setBounds(420,110,150,30);

        amountlb.setBounds(300,150,200,30);
        amounttf.setBounds(420,150,150,30);

        //to add button
        bookTicketBtn.setBounds(100,200,120,30);
        cancelbtn.setBounds(250,200,120,30);
        clearbtn.setBounds(400,200,120,30);
//to add components on frame
//        on left side
        frame.add(namelb);
        frame.add(nametf);
        frame.add(emaillb);
        frame.add(emailtf);
        frame.add(mobnolb);
        frame.add(mobnotf);
        frame.add(agelb);
        frame.add(ageltf);

//        on right side
        frame.add(arivallb);
        frame.add(arivaltf);
        frame.add(departlb);
        frame.add(departtf);
        frame.add(florpreflb);
        frame.add(florpreftf);
        frame.add(amountlb);
        frame.add(amounttf);
//        for button
        frame.add(bookTicketBtn);
        frame.add(cancelbtn);
        frame.add(clearbtn);





        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(700, 300);
        frame.setVisible(true);
    }
}