/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mulkan0576;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ENE
 */
public class ObjekWisata extends javax.swing.JFrame {
    private boolean databaru;
    private final koneksi koneksi = new koneksi();

    /**
     * Creates new form ObjekWisata
     */
    public ObjekWisata() {
        initComponents();
        getData();
        databaru = true;
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NamaWisata = new javax.swing.JTextField();
        AlamatWisata = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Deskripsi = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        JamOperasional = new javax.swing.JTextField();
        TarifMasuk = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        IdWisata = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nama Wisata");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Alamat Wisata");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Wisata", "Alamat", "Jam Operasional", "Deskripsi", "Tarif Masuk"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 362, 630, 99));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Jam Operasional");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Deskripsi Singkat");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Tarif Masuk");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("/ Rombongan");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));
        jPanel1.add(NamaWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 180, -1));
        jPanel1.add(AlamatWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 180, -1));

        Deskripsi.setColumns(20);
        Deskripsi.setRows(5);
        jScrollPane1.setViewportView(Deskripsi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("OBJEK WISATA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));
        jPanel1.add(JamOperasional, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 180, -1));
        jPanel1.add(TarifMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 180, -1));

        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 80, -1));

        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 80, -1));

        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 80, -1));

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 80, -1));

        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 80, -1));
        jPanel1.add(IdWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 180, -1));

        jLabel2.setText("ID Wisata");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 660, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        if (databaru) {
            try {
                String sql = "INSERT INTO wisata VALUES('%s', '%s', '%s', '%s', '%s', '%s')";
            
                sql = String.format(
                    sql,
                    IdWisata.getText(),
                    NamaWisata.getText(),
                    AlamatWisata.getText(),
                    JamOperasional.getText(),
                    Deskripsi.getText(),
                    TarifMasuk.getText()
                );
                
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Data Sukses Disimpan");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + ex);
            }
        } else {
            try {
                String sql = "UPDATE wisata SET nama_wisata='%s', alamat_wisata='%s', jam_operasional='%s', deskripsi_wisata='%s', tarif_masuk='%s' WHERE id_wisata='%s'";
            
                sql = String.format(
                    sql,
                    NamaWisata.getText(),
                    AlamatWisata.getText(),
                    JamOperasional.getText(),
                    Deskripsi.getText(),
                    TarifMasuk.getText(),
                    IdWisata.getText()
                );
                
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Data Sukses Di Edit");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data Gagal Di Edit" + ex);
            }
        }
        
        getData();
    }//GEN-LAST:event_SimpanActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        //Tombol untuk Clear inputan
        databaru = true;
        
        IdWisata.setText("");
        NamaWisata.setText("");
        AlamatWisata.setText("");
        JamOperasional.setText("");
        Deskripsi.setText("");
        TarifMasuk.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        try {
            databaru = false;
            
            int row = jTable1.getSelectedRow();
            String Id_Wisata = jTable1.getModel().getValueAt(row, 0).toString();
            
            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet sql = stm.executeQuery("SELECT * FROM wisata WHERE id_wisata='" +Id_Wisata+ "'");
            
            if (sql.next()) {
                IdWisata.setText(sql.getString("id_wisata"));
                NamaWisata.setText(sql.getString("nama_wisata"));
                AlamatWisata.setText(sql.getString("alamat_wisata"));
                JamOperasional.setText(sql.getString("jam_operasional"));
                Deskripsi.setText(sql.getString("deskripsi_wisata"));
                TarifMasuk.setText(sql.getString("tarif_masuk"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjekWisata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        
        try {
            String sql = "DELETE FROM wisata WHERE id_wisata='"+IdWisata.getText()+"'";
            
            Connection conn = koneksi.getKoneksi();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data Sukses Di Hapus");
            
            ClearActionPerformed(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus" + ex);
        }
        
        getData();
    }//GEN-LAST:event_HapusActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        // Update Data
        try {
                String sql = "UPDATE wisata SET nama_wisata='%s', alamat_wisata='%s', jam_operasional='%s', deskripsi_wisata='%s', tarif_masuk='%s' WHERE id_wisata='%s'";
            
                sql = String.format(
                    sql,
                    NamaWisata.getText(),
                    AlamatWisata.getText(),
                    JamOperasional.getText(),
                    Deskripsi.getText(),
                    TarifMasuk.getText(),
                    IdWisata.getText()
                );
                
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Data Sukses Di Edit");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data Gagal Di Edit" + ex);
            }
        
        getData();
    }//GEN-LAST:event_UpdateActionPerformed

    private void getData(){
        try {
            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery("select * from wisata");
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            //Reset Tabel
            model.setRowCount(0);
            
            while(result.next()){
                String id_wisata = result.getString("id_wisata");
                String nama_wisata = result.getString("nama_wisata");
                String alamat_wisata = result.getString("alamat_wisata");
                String jam_operasional = result.getString("jam_operasional");
                String deskripsi_wisata = result.getString("deskripsi_wisata");
                String tarif_masuk = result.getString("tarif_masuk");
                
                model.addRow(new Object[]{id_wisata, nama_wisata, alamat_wisata, jam_operasional, deskripsi_wisata, tarif_masuk});
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ObjekWisata.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ObjekWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjekWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjekWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjekWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObjekWisata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatWisata;
    private javax.swing.JButton Clear;
    private javax.swing.JTextArea Deskripsi;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField IdWisata;
    private javax.swing.JTextField JamOperasional;
    private javax.swing.JTextField NamaWisata;
    private javax.swing.JButton Simpan;
    private javax.swing.JTextField TarifMasuk;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}