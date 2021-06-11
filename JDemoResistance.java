import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDemoResistance {
	JTextField txtDisplay;
    JButton jbtLabel1, jbtLabel2, jbtLabel3, jbtLabel4, jbtLabel5;
    JPanel panelButton;
    public JDemoResistance(){
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        txtDisplay = new JTextField("Choose a complaint");
        txtDisplay.setEditable(false);
        container.add(txtDisplay, BorderLayout.NORTH);

        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(3, 2));
        jbtLabel1 = new JButton("Too expensive");
        jbtLabel2 = new JButton("Bad quality");

        panelButton.add(jbtLabel1);
        panelButton.add(jbtLabel2);

        container.add(panelButton, BorderLayout.CENTER);

        jbtLabel1.addActionListener(this);
        jbtLabel2.addActionListener(this);
    }
}
