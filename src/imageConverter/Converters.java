package imageConverter;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Converters {

    public static void jpgToBMP(File s) {
        String f = s.getAbsolutePath();
        if (f.length() < 4 || !f.substring(f.length() - 4, f.length()).equals(".jpg")) {
            f = f + ".jpg";
        }
        try {
            File input = new File(f);
            BufferedImage image = ImageIO.read(input);
            File output = new File(f.substring(0, f.length() - 4) + ".bmp");
            System.out.println(output.toString());
            ImageIO.write(image, "bmp", output);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(MyFrame.getFrames()[0], e.getMessage() + ", file is not a .jpg file");
        }
    }

    public static void pngToBMP(File s) {
        String f = s.getAbsolutePath();
        if (f.length() < 4 || !f.substring(f.length() - 4, f.length()).equals(".png")) {
            f = f + ".png";
        }
        try {
            File input = new File(f);
            BufferedImage image = ImageIO.read(input);
            File output = new File(f.substring(0, f.length() - 4) + ".bmp");
            System.out.println(output.toString());
            ImageIO.write(image, "bmp", output);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(MyFrame.getFrames()[0], e.getMessage() + ", file is not a .png file");
        }
    }

    public static void jpgToPng(File s) {
        String f = s.getAbsolutePath();
        if (f.length() < 4 || !f.substring(f.length() - 4, f.length()).equals(".jpg")) {
            f = f + ".jpg";
        }
        try {
            File input = new File(f);
            BufferedImage image = ImageIO.read(input);
            File output = new File(f.substring(0, f.length() - 4) + ".png");
            System.out.println(output.toString());
            ImageIO.write(image, "png", output);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(MyFrame.getFrames()[0], e.getMessage() + ", file is not a .jpg file");
        }
    }

    public static void pngToJpg(File s) {
        String f = s.getAbsolutePath();
        if (f.length() < 4 || !f.substring(f.length() - 4, f.length()).equals(".png")) {
            f = f + ".png";
        }
        try {
            File input = new File(f);
            BufferedImage image = ImageIO.read(input);
            File output = new File(f.substring(0, f.length() - 4) + ".jpg");
            System.out.println(output.toString());
            ImageIO.write(image, "jpg", output);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(MyFrame.getFrames()[0], e.getMessage() + ", file is not a .png file");
        }
    }
/*
    public static void pngToIco(File s){
        String f = s.getAbsolutePath();
        if (f.length() < 4 || !f.substring(f.length() - 4, f.length()).equals(".png")) {
            f = f + ".png";
        }
        try {
            File input = new File(f);
            BufferedImage image = ImageIO.read(input);
            File output = new File(f.substring(0, f.length() - 4) + ".ico");
            System.out.println(output.toString());
            ImageIO.write(image, "ico", output);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(MyFrame.getFrames()[0], e.getMessage() + ", file is not a .png file");
        }
    }

    public static void jpgToIco(File s){
        String f = s.getAbsolutePath();
        if (f.length() < 4 || !f.substring(f.length() - 4, f.length()).equals(".jpg")) {
            f = f + ".jpg";
        }
        try {
            File input = new File(f);
            BufferedImage image = ImageIO.read(input);
            File output = new File(f.substring(0, f.length() - 4) + ".ico");
            System.out.println(output.toString());
            ImageIO.write(image, "ico", output);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(MyFrame.getFrames()[0], e.getMessage() + ", file is not a .jpg file");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }*/
}
