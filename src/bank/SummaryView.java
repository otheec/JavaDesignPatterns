package bank;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class SummaryView extends JFrame implements Observer {
    private BankAccount model;
    private JTextField totalDepositsField, totalWithdrawalsField;

    public SummaryView(BankAccount model) {
        this.model = model;
        model.addObserver(this);

        setTitle("Statistiky účtu");
        setSize(300, 150);
        setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Celkové vklady:"));
        totalDepositsField = new JTextField();
        totalDepositsField.setEditable(false);
        add(totalDepositsField);

        add(new JLabel("Celkové výběry:"));
        totalWithdrawalsField = new JTextField();
        totalWithdrawalsField.setEditable(false);
        add(totalWithdrawalsField);

        update(model, null);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        totalDepositsField.setText(String.format("%.2f Kč", model.getTotalDeposits()));
        totalWithdrawalsField.setText(String.format("%.2f Kč", model.getTotalWithdrawals()));
    }
}
