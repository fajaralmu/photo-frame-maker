/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.kafila.framedphoto.gui;

import id.sch.kafila.framedphoto.util.ImageUtil;
import id.sch.kafila.framedphoto.util.MyDialog;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Republic Of Gamers
 */
public class PhotoChooser extends javax.swing.JFrame {

    private final JFileChooser imageChooser = new JFileChooser();
    private final JFileChooser folderChooser = new JFileChooser();

    private File userImageFile;
    private File frameImageFile;

    private BufferedImage userImageData;
    private BufferedImage frameImageData;
    
    private String saveToPath;

    /**
     * Creates new form PhotoChooser
     */
    public PhotoChooser() {
        initComponents();
        setTitle("Frame Maker");
        folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnChoose = new javax.swing.JButton();
        txtPhotoPath = new javax.swing.JTextField();
        labelSelectedImage = new javax.swing.JLabel();
        labelSelectedFrameImage = new javax.swing.JLabel();
        btnChooseFrame = new javax.swing.JButton();
        btnSUbmit = new javax.swing.JButton();
        btnChooseSaveLocation = new javax.swing.JButton();
        txtSaveTo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        btnChoose.setText("Select  Photo");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        txtPhotoPath.setText("Photo path");

        labelSelectedImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelSelectedFrameImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnChooseFrame.setText("Select Frame");
        btnChooseFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFrameActionPerformed(evt);
            }
        });

        btnSUbmit.setText("Process");
        btnSUbmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUbmitActionPerformed(evt);
            }
        });

        btnChooseSaveLocation.setText("Save Location");
        btnChooseSaveLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseSaveLocationActionPerformed(evt);
            }
        });

        txtSaveTo.setText("Save to:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnChoose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChooseFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelSelectedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSelectedFrameImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSUbmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChooseSaveLocation))
                    .addComponent(txtSaveTo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChoose)
                    .addComponent(btnChooseFrame)
                    .addComponent(btnSUbmit)
                    .addComponent(btnChooseSaveLocation))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaveTo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSelectedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSelectedFrameImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        handleFileChooser(imageChooser, (File file) -> {
            try {
                userImageFile = file;
                System.out.println("FILE PATH:" + file.getCanonicalPath());

                String filePath = file.getCanonicalPath();
                txtPhotoPath.setText(filePath);

                showSelectedImage();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    }//GEN-LAST:event_btnChooseActionPerformed

    private Icon getImageIcon(BufferedImage imageData) {
        ImageIcon imageIcon = new ImageIcon(imageData);
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back
        return imageIcon;
    }

    private void submit() {
        try {
            ImageUtil.combineFrame(userImageFile, frameImageFile, saveToPath);
        } catch (Exception ex) {
           MyDialog.error(ex.getMessage());
        }
    }

    static interface FileChooserHandler {

        public void handle(File file);
    }

    private void handleFileChooser(JFileChooser chooser, FileChooserHandler handler) {
        int returnVal = chooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            handler.handle(file);

        } else {
            System.out.println("Open command cancelled by user.");
        }
    }

    private void btnChooseFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFrameActionPerformed
        handleFileChooser(imageChooser, (File file) -> {
            try {
                frameImageFile = file;
                System.out.println("FRAME FILE PATH:" + file.getCanonicalPath());

                String filePath = file.getCanonicalPath();
                txtPhotoPath.setText(filePath);

                showSelectedFrameImage();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    }//GEN-LAST:event_btnChooseFrameActionPerformed

    private void btnChooseSaveLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseSaveLocationActionPerformed
        handleFileChooser(folderChooser, (File file) -> {
            try {
                String folderPath = file.getCanonicalPath();
                txtSaveTo.setText(folderPath);
                saveToPath = folderPath;
            } catch (IOException ex) {
                Logger.getLogger(PhotoChooser.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_btnChooseSaveLocationActionPerformed

    private void btnSUbmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUbmitActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_btnSUbmitActionPerformed

    private void showSelectedFrameImage() {
        if (null == frameImageFile) {
            MyDialog.error("frameFile is null!");
            return;
        }
        try {
            frameImageData = ImageIO.read(frameImageFile);
            labelSelectedFrameImage.setIcon(getImageIcon(frameImageData));
        } catch (IOException ex) {

            Logger.getLogger(PhotoChooser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showSelectedImage() {
        if (null == userImageFile) {
            MyDialog.error("imageFile is null!");
            return;
        }
        try {
            userImageData = ImageIO.read(userImageFile);
            labelSelectedImage.setIcon(getImageIcon(userImageData));
        } catch (IOException ex) {

            Logger.getLogger(PhotoChooser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhotoChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhotoChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhotoChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhotoChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhotoChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnChooseFrame;
    private javax.swing.JButton btnChooseSaveLocation;
    private javax.swing.JButton btnSUbmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSelectedFrameImage;
    private javax.swing.JLabel labelSelectedImage;
    private javax.swing.JTextField txtPhotoPath;
    private javax.swing.JTextField txtSaveTo;
    // End of variables declaration//GEN-END:variables
}
