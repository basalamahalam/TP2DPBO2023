/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Login;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Dokter extends javax.swing.JPanel {
    private int id;
    private Menu menu;
    /**
     * Creates new form Card
     */
    public Dokter(int id){
        initComponents();
        this.id = id;
        ImageIcon img = null;
        this.menu = new Menu();
        try {
            Connection a = Koneksi.getKoneksi();
            Statement s = a.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM dokter WHERE id_dokter='"+this.id+"'");
            if(res.next()) {
                labelNama.setText(res.getString("nama"));
                labelGender.setText(res.getString("jenis_kelamin"));
                labelSpesialis.setText(res.getString("nama_spesialis"));
                labelStatus.setText(res.getString("status"));
                img = new ImageIcon("D:\\TUGAS DOKUMEN PROJECT\\TUGAS DAN DATA KULIAH\\Sem 4\\DPBO\\KlinikTongFang\\img\\" + (res.getString("image_name")));
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        if(img != null){
            Image image = img.getImage().getScaledInstance(100, 130, Image.SCALE_SMOOTH);
            labelFoto.setIcon(new ImageIcon(image));
        }
        else{
            labelFoto.setText("Images not Found");
        }
    }
    
    public void deleteData(){
        // Delete Data in Database
        try {
            Connection c = Koneksi.getKoneksi();
                String sql = "DELETE FROM dokter WHERE id_dokter='"+this.id+"'";
                PreparedStatement p = c.prepareStatement(sql);
                p.executeUpdate();
                p.close();
                refreshData();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        }catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Data Gagal dihapus!");
        }
    }
    
    private void refreshData(){
        menu.setPanelDokter();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelSpesialis = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        jLabel1.setText("Nama :");

        jLabel2.setText("Jenis Kelamin :");

        jLabel3.setText("Spesialis  :");

        jLabel4.setText("Status :");

        labelNama.setText("Nama");

        labelGender.setText("Gender");

        labelSpesialis.setText("Spesialis");

        labelStatus.setText("Status");

        labelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNama))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelGender))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelSpesialis))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelStatus)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelNama))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelGender))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(labelSpesialis))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(labelStatus))
                                .addGap(0, 33, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonUpdate)
                                    .addComponent(jButtonDelete)))))
                    .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(null, "Anda Yakin menghapus data tersebut?", "Delete", JOptionPane.YES_NO_OPTION);
        if(value == JOptionPane.YES_OPTION){
            deleteData();
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelSpesialis;
    private javax.swing.JLabel labelStatus;
    // End of variables declaration//GEN-END:variables
}
