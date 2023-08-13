import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;

public class ColorChanger extends JFrame{
    public ColorChanger() {
	super("ColorChanger");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	setLayout(new GridLayout(0, 2));
	for (int i = 1; i <= 4; i++) {
	    JButton temp = new JButton("Button " + i);
	    temp.addActionListener(e -> {
		JButton source = (JButton) e.getSource();
		setTitle("Color changed by " + source.getText());
		temp.setForeground(Color.RED);
	    });
	    add(temp);
	}
	
	
	setSize(500, 100);
	setVisible(true);
    }
    
    public static void main(String[] args) {
	new ColorChanger();
    }
}
