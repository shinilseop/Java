package chapter15_IO;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.Buffer;

public class Exericse15_7 extends Frame {
    String nickname = "";
    TextArea ta = new TextArea();
    Panel p = new Panel();
    TextField tf = new TextField(30);
    Button bSave = new Button("저장");
    Exericse15_7(String nickname) {
        super("Chatting");
        this.nickname = nickname;
        setBounds(200, 100, 300, 200);
        p.setLayout(new FlowLayout());
        p.add(tf);
        p.add(bSave);
        add(ta, "Center");
        add(p, "South");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        bSave.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                FileDialog fileSave = new FileDialog(Exericse15_7.this,
                        "파일저장", FileDialog.SAVE);
                fileSave.setVisible(true);
                String fileName = fileSave.getDirectory()
                        + fileSave.getFile();
                saveAs(fileName);
            }
        });
        EventHandler handler = new EventHandler();
        ta.addFocusListener(handler);
        tf.addFocusListener(handler);
        tf.addActionListener(handler);
        ta.setText("#" + nickname + "님 즐거운 채팅되세요.");
        ta.setEditable(false);
        setResizable(false);
        setVisible(true);
        tf.requestFocus();
    }

    void saveAs(String fileName) {
        String content = ta.getText();
        System.out.println("SAVE");
        System.out.println(content);

        try{
            FileWriter fw = new FileWriter(fileName+".txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // saveAs메서드의 끝
    public static void main(String[] args) {
        args = new String[]{"자바짱"};
        if(args.length != 1) {
            System.out.println("USAGE : java Exericse15_7 NICKNAME");
            System.exit(0);
        }
        new Exericse15_7(args[0]);
    } // main

    class EventHandler extends FocusAdapter implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String msg = tf.getText();
            if("".equals(msg)) return;
            ta.append("\r\n" + nickname +">"+ msg);
            tf.setText("");
        }
        public void focusGained(FocusEvent e) {
            tf.requestFocus();
        }
    } // class EventHandler

}
