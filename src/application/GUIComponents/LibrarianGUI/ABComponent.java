package application.GUIComponents.LibrarianGUI;

import application.DataClasses.Books;
import application.DataClasses.TuitionCenter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ABComponent extends JPanel implements ActionListener, TuitionCenter {

    private JButton add;
    private JLabel idLabel;
    private JLabel nameLabel;
    private JTextField id;
    private JTextField nameField;

    public ABComponent() {
        idLabel = new JLabel("ID");
        id = new JTextField("ID");
        nameLabel = new JLabel("Name");
        nameField = new JTextField("Book-Name");
        add = new JButton("Add Book");

        setLayout(new GridLayout(0, 2, 30, 20));

        add(idLabel);
        add(id);
        add(nameLabel);
        add(nameField);
        add(add);

        add.addActionListener(this::actionPerformed);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!nameField.getText().isBlank() && !id.getText().isBlank()){
            System.out.println(id.getText()+" "+nameField.getText());
            books.add(new Books(id.getText(), nameField.getText()));
        }
    }
}
