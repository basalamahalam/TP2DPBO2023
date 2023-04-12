/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Login;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Spesialis extends javax.swing.JPanel {
    private Menu menu;
    private int id;
    /**
     * Creates new form Spesialis
     */
    public Spesialis(int id) {
        initComponents();
        this.id = id;
        ImageIcon img = null;
        try {
            Connection a = Koneksi.getKoneksi();
            Statement s = a.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM spesialis WHERE id_spesialis='"+this.id+"'");
            if(res.next()) {
                labelSpesialis.setText(res.getString("nama_spesialis"));
                labelDeskripsi.setText(res.getString("deskripsi_spesialis"));
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
                String sql = "DELETE FROM spesialis WHERE id_spesialis='"+this.id+"'";
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
        labelSpesialis = new javax.swing.JLabel();
        labelJumlah = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        labelDeskripsi = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        jLabel1.setText("Nama Spesialis :");

        jLabel2.setText("Deskripsi Spesialis :");

        jLabel3.setText("Jumlah Dokter :");

        labelSpesialis.setText("nama");

        labelJumlah.setText("nama");

        labelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelDeskripsi.setText("nama");

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
                .addGap(12, 12, 12)
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(labelJumlah))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(labelDeskripsi))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSpesialis)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelSpesialis))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelDeskripsi))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelJumlah))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonUpdate)
                            .addComponent(jButtonDelete)))
                    .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(null, "Anda Yakin menghapus data tersebut?", "Delete", JOptionPane.YES_NO_OPTION);
        if(value == JOptionPane.YES_OPTION){
            deleteData();
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelDeskripsi;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelJumlah;
    private javax.swing.JLabel labelSpesialis;
    // End of variables declaration//GEN-END:variables
}
