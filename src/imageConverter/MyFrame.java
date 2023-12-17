package imageConverter;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton pngToJPGButton;
    JButton jpgToPNGButton;
    JButton pngToBMPButton;
    JButton jpgToBMPButton;
    //JButton pngToICOButton;
    //JButton jpgtoICOButton;


    MyFrame() {
        JFrame frame = new JFrame();

        //-----------------TEXT PANES------------

        //------------------BOTONES----------------------------
        pngToJPGButton = new JButton("PNG a JPG");
        pngToJPGButton.setBounds(35, 50, 100, 40);
        pngToJPGButton.setBackground(Color.lightGray);
        pngToJPGButton.setForeground(Color.blue);

        jpgToPNGButton = new JButton("JPG a PNG");
        jpgToPNGButton.setBounds(140, 50, 100, 40);
        jpgToPNGButton.setBackground(Color.lightGray);
        jpgToPNGButton.setForeground(Color.blue);

        pngToBMPButton = new JButton("PNG a BMP");
        pngToBMPButton.setBounds(245, 50, 100, 40);
        pngToBMPButton.setBackground(Color.lightGray);
        pngToBMPButton.setForeground(Color.blue);

        jpgToBMPButton = new JButton("JPG a BMP");
        jpgToBMPButton.setBounds(350, 50, 100, 40);
        jpgToBMPButton.setBackground(Color.lightGray);
        jpgToBMPButton.setForeground(Color.blue);

       /* pngToICOButton = new JButton("PNG a ICO");
        pngToICOButton.setBounds(50,100,100,40);
        jpgtoICOButton = new JButton("JPG a ICO");
        jpgtoICOButton.setBounds(150,100,100,40);*/


        //------------------FRAME----------------------
        frame.setTitle("IMAGE CONVERTER");
        frame.setIconImage(getAppIcon());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(pngToBMPButton);
        frame.add(jpgToBMPButton);
        frame.add(pngToJPGButton);
        frame.add(jpgToPNGButton);
        //frame.add(pngToICOButton);
        //frame.add(jpgtoICOButton);

        //-------------------LAYOUT----------------------
        frame.setSize(500, 180);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        //--------------------ACCIONES------------------
        pngToJPGButton.addActionListener(this);
        jpgToPNGButton.addActionListener(this);
        pngToBMPButton.addActionListener(this);
        jpgToBMPButton.addActionListener(this);
        //pngToICOButton.addActionListener(this);
        //jpgtoICOButton.addActionListener(this);
    }

    private Image getAppIcon(){
        ImageIcon icon = new ImageIcon("./Assets/img.png");
        return icon.getImage().getScaledInstance(32,32,Image.SCALE_SMOOTH);
    }


    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == pngToJPGButton) {
            JFileChooser fileChooser = new JFileChooser();
            try {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PNG", "png");
                fileChooser.setFileFilter(filter);
                fileChooser.showOpenDialog(fileChooser);
                File f = fileChooser.getSelectedFile();
                Converters.pngToJpg(f);
            } catch (Exception e) {
                System.err.println(e.getMessage());

            }
        }
        if (evt.getSource() == jpgToPNGButton) {
            JFileChooser fileChooser = new JFileChooser();
            try {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JPG", "jpg");
                fileChooser.setFileFilter(filter);
                fileChooser.showOpenDialog(fileChooser);
                File f = fileChooser.getSelectedFile();
                Converters.jpgToPng(f);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        if (evt.getSource() == pngToBMPButton) {
            JFileChooser fileChooser = new JFileChooser();
            try {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PNG", "png");
                fileChooser.setFileFilter(filter);
                fileChooser.showOpenDialog(fileChooser);
                File f = fileChooser.getSelectedFile();
                Converters.pngToBMP(f);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        if (evt.getSource() == jpgToBMPButton) {
            JFileChooser fileChooser = new JFileChooser();
            try {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JPG", "jpg");
                fileChooser.setFileFilter(filter);
                fileChooser.showOpenDialog(fileChooser);
                File f = fileChooser.getSelectedFile();
                Converters.jpgToBMP(f);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        /*if(evt.getSource() == pngToICOButton){
            JFileChooser fileChooser = new JFileChooser();
            try {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos png", "png");
                fileChooser.setFileFilter(filter);
                fileChooser.showOpenDialog(fileChooser);
                File f = fileChooser.getSelectedFile();
                Converters.pngToIco(f);
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        if(evt.getSource() == jpgtoICOButton){
            JFileChooser fileChooser = new JFileChooser();
            try {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JPG", "jpg");
                fileChooser.setFileFilter(filter);
                fileChooser.showOpenDialog(fileChooser);
                File f = fileChooser.getSelectedFile();
                Converters.jpgToIco(f);
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }*/
    }
}
