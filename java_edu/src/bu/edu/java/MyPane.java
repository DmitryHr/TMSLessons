package bu.edu.java;

import javax.swing.*;

public class MyPane extends JOptionPane {
    static void  showMyMessage(String text, String title){
        showMessageDialog(null, text, title, PLAIN_MESSAGE, new ImageIcon("/mnt/WorkDisk/odd.png"));
    }

    static void showMyMessage(String text){
        showMyMessage(text, "Сообщение");
    }

    static int getInteger(String text){
        String res;
        res = showInputDialog(null, text, "Число (по умолчанию 10)", QUESTION_MESSAGE);
        if(res == null){
            return 10;
        }
        else{return Integer.parseInt(res);}
    }


}
