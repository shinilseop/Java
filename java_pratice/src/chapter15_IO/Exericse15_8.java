package chapter15_IO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Exericse15_8 extends Frame {
    Button first = new Button("<<");
    Button prev = new Button("<");
    Button next = new Button(">");
    Button last = new Button(">>");
    Panel buttons = new Panel();
    TextArea ta = new TextArea();
    ArrayList wordList = new ArrayList();
    final String WORD_FILE = "word_data.txt";
    final String CR_LF = System.getProperty("line.separator");
    int pos = 0;
    Exericse15_8(String title) {
        super(title);
        buttons.add(first);
        buttons.add(prev);
        buttons.add(next);
        buttons.add(last);
        add("South", buttons);
        add("Center", ta);
        EventHandler handler = new EventHandler();
        addWindowListener(handler);
        first.addActionListener(handler);
        prev.addActionListener(handler);
        next.addActionListener(handler);
        last.addActionListener(handler);
        loadFile(WORD_FILE);
        setBackground(Color.BLACK);
        setSize(300, 200);
        setLocation(200, 200);
        setResizable(true);
        setVisible(true);
        showFirst();
    }
    void showFirst() {
        pos = 0;
        display(pos);
    }

    void showPrevious() {
        pos = (pos > 0) ? --pos : 0;
        display(pos);
    }
    void showNext() {
        int size = wordList.size();
        pos = (pos < size-1) ? ++pos : size-1;
        display(pos);
    }
    void showLast() {
        pos = wordList.size()-1;
        display(pos);
    }
    void display(int pos) { // pos . 위치에 있는 라인의 내용을 보여준다
        String tmp =  (String) wordList.get(pos);
        StringTokenizer st = new StringTokenizer(tmp, "|");

        StringBuffer content = new StringBuffer(tmp.length());
        while (st.hasMoreTokens()) {
            content.append(st.nextToken()).append(CR_LF);
        }
        ta.setText(content.toString());
/*
(1) . 아래의 로직에 맞게 코드를 작성하시오
1. wordList pos . 에서 번째의 위치에 있는 데이터를 읽어온다
2. StringTokenizer ‘|’ . 를 이용해서 를 구분자로 자른다
3. Token (CR_LF) StringBuffer .(append) 잘라진 에 개행문자 를 붙여서 에 붙인다
4. StringBuffer TextArea . 의 내용을 뽑아서 에 보여준다
*/
    }
    void loadFile(String fileName) {
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            while ((line = br.readLine()) != null) {
                wordList.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("데이터 파일을 읽을 수 없습니다.");
            System.exit(1);
        }
    }
    public static void main(String args[]) {
        Exericse15_8 mainWin = new Exericse15_8("Word Study");
    }
    class EventHandler extends WindowAdapter implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            Button b = (Button)ae.getSource();
            if(b==first) {
                showFirst();
            } else if(b==prev) {
                showPrevious();
            } else if(b==next) {
                showNext();
            } else if(b==last) {
                showLast();
            }
        }
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    } // class EventHandler
}
