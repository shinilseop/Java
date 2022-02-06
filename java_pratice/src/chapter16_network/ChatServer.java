package chapter16_network;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ChatServer extends Frame {
    String nickname = "";

    DataOutputStream out;
    DataInputStream in;

    Panel p = new Panel();
    TextArea ta = new TextArea();
    TextField tf = new TextField();

    ChatServer(String nickname) {
        super("Chatting");
        this.nickname = nickname;
        p.setLayout(new BorderLayout());
        p.add(tf, "Center");
        add(ta, "Center");
        add(p, "South");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        EventHandler handler = new EventHandler();
        ta.addFocusListener(handler);
        tf.addFocusListener(handler);
        tf.addActionListener(handler);
        ta.setEditable(false);
        setBounds(200, 200, 300, 200);
        setVisible(true);
        tf.requestFocus();
    }

    void startServer() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(7777);
            ta.setText("서버가 준비되었습니다.");

            socket = serverSocket.accept();
            ta.append("\r\n상대방과 연결되었습니다.");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            while (in != null) {
                try{
                    String msg = in.readUTF();
                    ta.append("\r\n" + msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
/*
(1) . 아래의 로직에 맞게 코드를 작성하시오
1. 7777 . 서비소켓을 생성하여 번 포트와 결합시킨다
2. ta " ." . 에 서버가 준비되었습니다 라고 보여준다
3. . 상대방의 연결을 기다린다
4. ta " ." . 에 상대방과 연결되었습니다 라고 보여준다
ta.append("\r\n" +" .");
5. . 연결된 상대방 소켓의 입력스트림과 출력스트립을 얻어온다
6. null 반복문을 이용해서 입력스트림이 이 아닌 동안
입력스트림으로부터 데이터를 읽어서 변수 에 저장한다 msg .
 */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        args = new String[]{"SERVER"};
        if(args.length != 1) {
            System.out.println("USAGE : java ChatServer NICKNAME");
            System.exit(0);
        }
        ChatServer chatWin = new ChatServer(args[0]);
        chatWin.startServer();
    } // main

    class EventHandler extends FocusAdapter implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String msg = tf.getText();
            if("".equals(msg)) return;

            if (out != null) {
                try{
                    out.writeUTF(nickname + ">" + msg);
                } catch (IOException e) {

                }
            }

            ta.append("\r\n" + nickname +">"+ msg);
            tf.setText("");
        }
        public void focusGained(FocusEvent e) {
            tf.requestFocus();
        }
    } // class EventHandler
}
