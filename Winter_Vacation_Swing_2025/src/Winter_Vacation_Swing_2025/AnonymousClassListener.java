package Winter_Vacation_Swing_2025;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AnonymousClassListener extends JFrame {
    JButton btn = new JButton("Action");

    public AnonymousClassListener() {
        setTitle("Action 이벤트 리스터 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if (b.getText().equals("Action")) {
                    b.setText("액션");
                } else {
                    b.setText("Action");
                }
                setTitle(b.getText());
            }
        });

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousClassListener();
    }
}
