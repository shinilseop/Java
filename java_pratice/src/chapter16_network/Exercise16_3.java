package chapter16_network;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Exercise16_3 extends Frame {
    TextField tf = new TextField();
    TextArea ta = new TextArea();
    Exercise16_3(String title) {
        super(title);
        add(tf, "North");
        add(ta, "Center");
        tf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                displaySource();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setBounds(500, 200, 500, 300);
        setVisible(true);
    }
    void displaySource() {
        URL url = null;
        BufferedReader input = null;
        String address = tf.getText().trim();
        String line = "";
        ta.setText("");
        try {
            if(!address.startsWith("http://"))
                address = "http://"+address;

            url = new URL(address);
            URLConnection conn = url.openConnection();
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            String content = "";
            while ((line = input.readLine()) != null) {
                content += line+"\n";
            }
            ta.setText(content);

            input.close();
        } catch(Exception e) {
            ta.setText("유효하지 않은 URL입니다.");
        }
    } // displaySource()
    public static void main(String[] args) {
        Exercise16_3 mainWin = new Exercise16_3("Source Viewer");
    }

}
