import javax.swing.*;

public class mw extends JFrame {

    public  mw(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
    }
    public static void main(String[] args){
        mw mw = new mw();


    }

}
