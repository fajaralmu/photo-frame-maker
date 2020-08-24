/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.kafila.framedphoto.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Republic Of Gamers
 */
public class ImageUtil {

    static final int PAPER_WIDTH = 1080;
    static final int PAPER_HEIGHT = 1080;
    static final Random RANDOM = new Random();

    public static BufferedImage getImage(URL imageUrl) {

        System.out.println("get image from url: " + imageUrl.getPath());

        try {
            BufferedImage image = ImageIO.read(imageUrl);
            return image;
        } catch (Exception e) {
            System.out.println("Error getting image with path: " + imageUrl.getPath());
            e.printStackTrace();
            return null;
        }
    }

    public static void combineFrame(File userImageFile, File frameImageFile, String saveToPath) throws Exception {
        BufferedImage userImage = ImageIO.read(userImageFile);
        BufferedImage frameImage = ImageIO.read(frameImageFile);

        BufferedImage result = new BufferedImage(PAPER_WIDTH, PAPER_HEIGHT, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2d = result.createGraphics();
        //draw background 
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, PAPER_WIDTH, PAPER_HEIGHT);
        //draw user image
        g2d.drawImage(userImage, 0, 0, PAPER_WIDTH, PAPER_HEIGHT, null);
        //draw frame
        g2d.drawImage(frameImage, 0, 0, PAPER_WIDTH, PAPER_HEIGHT, null);

        //end
        writeImageToFile(result, saveToPath + "/FRAME_" + RANDOM.nextInt(1000) + ".png", "png");

    }

    public static void writeImageToFile(BufferedImage image, String fullFilePath, String extension) {
        try {
            File output = new File(fullFilePath);
            ImageIO.write(image, extension, output);
            System.out.println("Writing to file: " + output.getCanonicalPath() + " successfully");
        } catch (IOException ex) {
            Logger.getLogger(ImageUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
