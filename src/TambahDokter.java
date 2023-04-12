/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ACER
 */
public class TambahDokter extends javax.swing.JFrame {

    public String absolutepath;
    public String absolutename;
    public String gender;
    public String status;
    public String nama;
    public String spesialis;
    /**
     * Creates new form TambahDokter
     */
    public TambahDokter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonAktif = new javax.swing.JRadioButton();
        jRadioButtonTidakAktif = new javax.swing.JRadioButton();
        jButtonCari = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        labelGambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama Dokter");

        jTextField1.setText("Masukkan Nama");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Jenis Kelamin");

        jRadioButtonMale.setText("Laki - Laki");

        jRadioButtonFemale.setText("Perempuan");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        jLabel3.setText("Spesialis");

        jTextField2.setText("Masukkan Nama");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Status");

        jRadioButtonAktif.setText("Aktif");
        jRadioButtonAktif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAktifActionPerformed(evt);
            }
        });

        jRadioButtonTidakAktif.setText("Tidak Aktif");
        jRadioButtonTidakAktif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTidakAktifActionPerformed(evt);
            }
        });

        jButtonCari.setText("Browse");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });

        jLabel5.setText("Gambar");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        labelGambar.setBackground(new java.awt.Color(153, 255, 153));
        labelGambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonFemale))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(labelGambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCari)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonAktif)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonTidakAktif)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSave)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jRadioButtonFemale))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButtonAktif)
                            .addComponent(jRadioButtonTidakAktif)))
                    .addComponent(labelGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCari)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButtonSave)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButtonTidakAktifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTidakAktifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTidakAktifActionPerformed

    private void jRadioButtonAktifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAktifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAktifActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        nama = jTextField1.getText();
        spesialis = jTextField2.getText();
        InputStream images = null;
        
        if(jRadioButtonMale.isSelected()){
            gender = "Laki - Laki";
        }
        else if(jRadioButtonFemale.isSelected()){
            gender = "Perempuan";
        }
        
        if(jRadioButtonAktif.isSelected()){
            status = "Aktif";
        }
        else if(jRadioButtonTidakAktif.isSelected()){
            status = "Tidak Aktif";
        }
        
//        if(nama.isEmpty() || spesialis.isEmpty() || status.isEmpty() || gender.isEmpty()){
            try{
                    images = new FileInputStream(new File(absolutepath));
                    Connection c = Koneksi.getKoneksi();
                    String sql = "INSERT INTO dokter (nama, jenis_kelamin, nama_spesialis, status, image_name, image_path, image_BLOB) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement p = c.prepareStatement(sql);
                    p.setString(1, nama);
                    p.setString(2, gender);
                    p.setString(3, spesialis);
                    p.setString(4, status);
                    p.setString(5, absolutename);
                    p.setString(6, absolutepath);
                    p.setBlob(7, images);
                    p.executeUpdate();
                    p.close();
                    JOptionPane.showMessageDialog(null, "Data Berhasil disimpan!");
                }catch(Exception ex){
                    System.out.println(ex);
                    System.out.println("data tidak berhasil diinput!");
                }finally{
                    this.dispose();
                    Menu a = new Menu();
                    a.setVisible(true);
                }
//        }
//        else{
//            System.out.println("nama atau spesialis tidak boleh kosong");
//        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        // TODO add your handling code here:
        String path = "D:\\TUGAS DOKUMEN PROJECT\\TUGAS DAN DATA KULIAH\\Sem 4\\DPBO\\KlinikTongFang\\img";
        JFileChooser imageFileChooser = new JFileChooser(path);
        imageFileChooser.setDialogTitle("Pilih Gambar ");
        
        //pilih gambar
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("IMAGES", "png", "jpg");
        imageFileChooser.setFileFilter(imageFilter);
        int imageChooser = imageFileChooser.showOpenDialog(null);
        
        if(imageChooser == JFileChooser.APPROVE_OPTION){
            File imageFile = imageFileChooser.getSelectedFile();
            absolutepath = imageFile.getAbsolutePath();
            absolutename = imageFile.getName();
            ImageIcon imageicon = new ImageIcon(absolutepath);
            
            //resize gambar
            Image imageResize = imageicon.getImage().getScaledInstance(labelGambar.getWidth(), labelGambar.getHeight(), Image.SCALE_SMOOTH);
            labelGambar.setIcon(new ImageIcon(imageResize));
        }
    }//GEN-LAST:event_jButtonCariActionPerformed

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
            java.util.logging.Logger.getLogger(TambahDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButtonAktif;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonTidakAktif;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelGambar;
    // End of variables declaration//GEN-END:variables
}
