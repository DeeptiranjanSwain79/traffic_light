
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;

public class traffic  {
    JFrame f;
    JPanel p1, p2, p3, p4;
    JTextArea east, west, north, south;

    traffic(){
        f = new JFrame("Traffic Signal");
        f.setSize(800, 800);
        f.setLocation(250, 10);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);

        p1 = new JPanel();
        p1.setBounds(0, 0, 300, 300);
        p1.setBackground(Color.GREEN);
        f.add(p1);

        p2 = new JPanel();
        p2.setBounds(500, 0, 300, 300);
        p2.setBackground(Color.GREEN);
        f.add(p2);

        p3 = new JPanel();
        p3.setBounds(0, 500, 300, 300);
        p3.setBackground(Color.GREEN);
        f.add(p3);

        p4 = new JPanel();
        p4.setBounds(500, 500, 300, 300);
        p4.setBackground(Color.GREEN);
        f.add(p4);

        west = new JTextArea();
        west.setBounds(250, 300, 50, 200);
        west.setBackground(Color.RED);
        f.add(west);

        north = new JTextArea();
        north.setBounds(300, 250, 200, 50);
        north.setBackground(Color.RED);
        f.add(north);

        east = new JTextArea();
        east.setBounds(500, 300, 50, 200);
        east.setBackground(Color.RED);
        f.add(east);

        south = new JTextArea();
        south.setBounds(300, 500, 200, 50);
        south.setBackground(Color.RED);
        f.add(south);

        //For white tiles in the black road
        //West
        JTextArea wt1 = new JTextArea();
        wt1.setBounds(0, 390, 100, 20);
        wt1.setBackground(Color.WHITE);
        f.add(wt1);

        JTextArea wt2 = new JTextArea();
        wt2.setBounds(180, 390, 70, 20);
        wt2.setBackground(Color.WHITE);
        f.add(wt2);

        //North
        JTextArea nt1 = new JTextArea();
        nt1.setBounds(390, 0, 20, 100);
        nt1.setBackground(Color.WHITE);
        f.add(nt1);

        JTextArea nt2 = new JTextArea();
        nt2.setBounds(390, 180, 20, 70);
        nt2.setBackground(Color.WHITE);
        f.add(nt2);

        //South
        JTextArea st1 = new JTextArea();
        st1.setBounds(390, 700, 20, 100);
        st1.setBackground(Color.WHITE);
        f.add(st1);

        JTextArea st2 = new JTextArea();
        st2.setBounds(390, 550, 20, 70);
        st2.setBackground(Color.WHITE);
        f.add(st2);

        //East
        JTextArea et1 = new JTextArea();
        et1.setBounds(550, 390, 70, 20);
        et1.setBackground(Color.WHITE);
        f.add(et1);

        JTextArea et2 = new JTextArea();
        et2.setBounds(700, 390, 100, 20);
        et2.setBackground(Color.WHITE);
        f.add(et2);

        f.setVisible(true);


        while(true){
//            For red and green
            north.setBackground(Color.RED);
            east.setBackground(new Color(0, 131, 81));
            try{
//                Thread.sleep(3000);
                Thread.sleep(30000);  // 1000 = 1 second
            }catch (Exception e){e.printStackTrace();}
            //For yellow colour
            east.setBackground(new Color(0, 131, 81));
            south.setBackground(new Color(255, 255, 0));
            try{
//                Thread.sleep(1000);
                Thread.sleep(5000);
            }catch (Exception e){e.printStackTrace();}
            east.setBackground(Color.RED);
            south.setBackground(new Color(0, 131, 81));


            try {
//                Thread.sleep(3000);
                Thread.sleep(30000);
            }catch (Exception e){e.printStackTrace();}
            south.setBackground(new Color(0, 131, 81));
            west.setBackground(new Color(255, 255, 0));
            try{
//                Thread.sleep(1000);
                Thread.sleep(5000);
            }catch (Exception e){e.printStackTrace();}


            south.setBackground(Color.RED);
            west.setBackground(new Color(0, 131, 81));
            try{
//                Thread.sleep(3000);
                Thread.sleep(30000);
            }catch (Exception e){e.printStackTrace();}

            west.setBackground(new Color(0, 131, 81));
            north.setBackground(new Color(255, 255, 0));
            try{
//                Thread.sleep(1000);
                Thread.sleep(5000);
            }catch (Exception e){e.printStackTrace();}

            west.setBackground(Color.RED);
            north.setBackground(new Color(0, 131, 81));
            try {
//                Thread.sleep(3000);
                Thread.sleep(30000);
            }catch (Exception e){e.printStackTrace();}


            east.setBackground(new Color(255, 255, 0));
            try{
//                Thread.sleep(1000);
                Thread.sleep(5000);
            }catch (Exception e){e.printStackTrace();}
        }


    }

    public static void main(String[] args) {
        new traffic();
    }
}
