import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

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

        JLabel roomno = new JLabel();
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

        roomno.setBounds(50,200,200,30);
        //to add button
        bookTicketBtn.setBounds(100,300,120,30);
        cancelbtn.setBounds(250,300,120,30);
        clearbtn.setBounds(400,300,120,30);
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
        frame.add(roomno);


//        for button
        frame.add(bookTicketBtn);
        frame.add(cancelbtn);
        frame.add(clearbtn);

        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Clear button clicked!");
                nametf.setText("");
                emailtf.setText("");
                mobnotf.setText("");
                ageltf.setText("");
                arivaltf.setText("");
                departtf.setText("");

                florpreftf.setText("");
                amounttf.setText("");
            }
        });
////for exit btn
        cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

//    for book btn
        bookTicketBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add the validation of form can't be empty
                if (nametf.getText().toString().isEmpty() ||
                        emailtf.getText().toString().isEmpty() ||
                        mobnotf.getText().toString().isEmpty() ||
                        ageltf.getText().toString().isEmpty() ||
                        arivaltf.getText().toString().isEmpty() ||
                        departtf.getText().toString().isEmpty() ||
                        florpreftf.getText().toString().isEmpty() ||

                        amounttf.getText().toString().isEmpty())

                {
                    roomno.setText("Please fill the details");
                }
                else {
                    String url="jdbc:mysql://localhost:3306/hotemmanagesyatem";
                    String username = "root";
                    String password = "";
                    try {
                        Connection connection = DriverManager.getConnection(url, username, password);
                        String sql = "insert into roominfo"
                                + " values (null, ?, ?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement preparedStmt = connection.prepareStatement(sql);
                        preparedStmt.setString (1, nametf.getText().toString());
                        preparedStmt.setString (2, emailtf.getText().toString());
                        preparedStmt.setString   (3, mobnotf.getText().toString());
                        preparedStmt.setString(4, ageltf.getText().toString());
                        preparedStmt.setString    (5, arivaltf.getText().toString());
                        preparedStmt.setString    (6, departtf.getText().toString());
                        preparedStmt.setString    (7, florpreftf.getText().toString());
                        preparedStmt.setString    (8, amounttf.getText().toString());
                        preparedStmt.execute();
                        System.out.println("Db connected");
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex+ "not Connected");
                    }

                    Random random = new Random();
                    int id = random.nextInt(999999);
                    roomno.setText("Your booking is confirmed and bookind id " + id);
                }


            }
        });



        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(700, 400);
        frame.setVisible(true);
    }
}