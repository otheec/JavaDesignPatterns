package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class AccountView extends JFrame implements Observer {
    private BankAccount model;
    private JTextField balanceField, depositField, withdrawField;
    private JButton depositButton, withdrawButton, resetButton;

    public AccountView(BankAccount model) {
        this.model = model;
        model.addObserver(this);

        setTitle("Bankovní účet");
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // UI komponenty
        add(new JLabel("Account Balance:"));
        balanceField = new JTextField();
        balanceField.setEditable(false);
        add(balanceField);

        add(new JLabel("Deposit Amount:"));
        depositField = new JTextField();
        add(depositField);

        add(new JLabel("Withdraw Amount:"));
        withdrawField = new JTextField();
        add(withdrawField);

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        resetButton = new JButton("Reset");

        add(depositButton);
        add(withdrawButton);
        add(resetButton);

        // Action listeners
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(depositField.getText());
                    model.deposit(amount);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Neplatná částka!", "Chyba", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(withdrawField.getText());
                    model.withdraw(amount);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Neplatná částka!", "Chyba", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.reset();
                depositField.setText("");
                withdrawField.setText("");
            }
        });

        update(model, null);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        balanceField.setText(String.format("%.2f Kč", model.getBalance()));
    }

}
