/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mulkan0576;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ENE
 */
public class Costumer extends javax.swing.JFrame {
    
    private boolean databaru;
    private final koneksi koneksi = new koneksi();
    public String tgl_beli, tgl_wisata;
    DefaultTableModel tabModel;
    ResultSet rsCostumer=null;

    /**
     * Creates new form Costumer
     */
    public Costumer() {
        initComponents();
        dataComboBox1();
        dataComboBox2();
        tampil_data();
        databaru = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    public void dataComboBox1(){
        try {
            Connection conn = koneksi.getKoneksi();
            String query = "SELECT * FROM wisata";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                jComboBox1.addItem(rs.getString("nama_wisata"));
            }
            
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (SQLException e) {
        }
    }
    
    public void dataComboBox2(){
        try {
            Connection conn = koneksi.getKoneksi();
            String query = "SELECT * FROM pemandu";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                jComboBox2.addItem(rs.getString("nama_pemandu"));
            }
            
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (SQLException e) {
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        IdCostumer = new javax.swing.JTextField();
        NamaCostumer = new javax.swing.JTextField();
        NoTelp = new javax.swing.JTextField();
        TanggalBeli = new com.toedter.calendar.JDateChooser();
        TanggalWisata = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CariData = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("COSTUMER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("ID Costumer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Nama Costumer");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("No. Telpon");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Pembelian");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal Berwisata");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nama Wisata");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Nama Pemandu");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, -1));

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 120, -1));

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, -1));

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 120, -1));

        jButton5.setText("PRINT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, -1));

        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 120, -1));
        jPanel1.add(IdCostumer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, -1));
        jPanel1.add(NamaCostumer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, -1));
        jPanel1.add(NoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, -1));

        TanggalBeli.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TanggalBeliPropertyChange(evt);
            }
        });
        jPanel1.add(TanggalBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, -1));

        TanggalWisata.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TanggalWisataPropertyChange(evt);
            }
        });
        jPanel1.add(TanggalWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, -1));

        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 130, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "No Telpon", "Tanggal Beli", "Tanggal Berwisata", "Nama Wisata", "Nama Pemandu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 550, 370));

        CariData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariDataActionPerformed(evt);
            }
        });
        CariData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CariDataKeyReleased(evt);
            }
        });
        jPanel1.add(CariData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 240, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("Cari Data : Id Costumer Or Nama Costumer");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 870, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //Exit
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TanggalBeliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TanggalBeliPropertyChange
        // TODO add your handling code here:
        if (TanggalBeli.getDate()!=null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            tgl_beli=format.format (TanggalBeli.getDate());
        }
    }//GEN-LAST:event_TanggalBeliPropertyChange

    private void TanggalWisataPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TanggalWisataPropertyChange
        // TODO add your handling code here:
        if (TanggalWisata.getDate()!=null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            tgl_wisata=format.format (TanggalWisata.getDate());
        }
    }//GEN-LAST:event_TanggalWisataPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Simpan Data
        if (databaru) {
            try{
                String sql="insert into costumer values('"
                    +IdCostumer.getText()+"','"
                    +NamaCostumer.getText()+"','"
                    +NoTelp.getText()+"','"
                    +tgl_beli+"','"
                    +tgl_wisata+"','"
                    +jComboBox1.getSelectedItem()+"','"
                    +jComboBox2.getSelectedItem()+"')";
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil disimpan");
                tampil_data();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Gagal disimpan");
                System.out.println(e.getMessage());
            }
        }
        
        tampil_data();
        clearData();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Update Data
        try{
            Connection conn = koneksi.getKoneksi();
            String sql = "UPDATE costumer SET nama_costumer='%s', notelp_costumer='%s', tgl_pembelian='%s', tgl_berwisata='%s', nama_wisata='%s', nama_pemandu='%s' WHERE id_costumer='%s'";
            
                sql = String.format(
                    sql,
                    NamaCostumer.getText(),
                    NoTelp.getText(),
                    tgl_beli,
                    tgl_wisata,
                    jComboBox1.getSelectedItem(),
                    jComboBox2.getSelectedItem(),
                    IdCostumer.getText()
                );
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data berhasil di Update");
            tampil_data();
            clearData();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Proses Edit data Gagal");
            System.out.println(e.getMessage());
        }
        
        tampil_data();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // Clear Data
        clearData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Hapus Data
        try {
            String sql = "DELETE FROM costumer WHERE id_costumer='"+IdCostumer.getText()+"'";
            
            Connection conn = koneksi.getKoneksi();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data Sukses Di Hapus");
            
            clearData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus" + ex);
        }
        
        tampil_data();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            databaru = false;
            
            int row = jTable1.getSelectedRow();
            String Id_Costumer = jTable1.getModel().getValueAt(row, 0).toString();
            
            Connection conn = koneksi.getKoneksi();
            String sql = "Select * from costumer where id_costumer='"+Id_Costumer+"'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            
            if (rs.next()) {
                IdCostumer.setText(rs.getString(1));
                NamaCostumer.setText(rs.getString(2));
                NoTelp.setText(rs.getString(3));
                TanggalBeli.setDate(rs.getDate(4));
                TanggalWisata.setDate(rs.getDate(5));
                jComboBox1.setSelectedItem(rs.getString(6));
                jComboBox2.setSelectedItem(rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjekWisata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void CariDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CariDataKeyReleased
        // TODO add your handling code here:
        //cari Data
         String key=CariData.getText();
        System.out.println(key);  
        
        if(key!=""){
            cariData(key);
        }else{
            tampil_data();
        }
    }//GEN-LAST:event_CariDataKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //Cetak Data
         try {
            File namafile = new File("src/laporan/LaporanCostumer.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksi.getKoneksi());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void CariDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariDataActionPerformed

    
    public void clearData() {
        IdCostumer.setText("");
        NamaCostumer.setText("");
        NoTelp.setText("");
        TanggalBeli.setDate(null);
        TanggalWisata.setDate(null);
        jComboBox1.setSelectedItem("");
        jComboBox2.setSelectedItem("");
        IdCostumer.requestFocus();
    }
    
    private void cariData(String key){
        try{
            Object[] judul_kolom = {"ID", "NAMA", "No Telpon", "Tanggal Beli", "Tanggal Berwisata", "Nama Wisatae", "Nama Pemandu"};
            tabModel = new DefaultTableModel(null,judul_kolom);
            jTable1.setModel(tabModel);
            
            Connection conn= koneksi.getKoneksi();
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            rsCostumer=stt.executeQuery("SELECT * from costumer WHERE id_costumer LIKE '%"+key+"%' OR nama_costumer LIKE '%"+key+"%'");  
            while(rsCostumer.next()){
                Object[] data={
                    rsCostumer.getString("id_costumer"),
                    rsCostumer.getString("nama_costumer"),
                    rsCostumer.getString("notelp_costumer"),
                    rsCostumer.getString("tgl_pembelian"),
                    rsCostumer.getString("tgl_berwisata"),
                    rsCostumer.getString("nama_wisata"),         
                    rsCostumer.getString("nama_pemandu")         
                };
               tabModel.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
    }
    
    public void tampil_data(){
        DefaultTableModel tabel=new DefaultTableModel();
        tabel.addColumn("ID");
        tabel.addColumn("NAMA");
        tabel.addColumn("No Telpon");
        tabel.addColumn("Tanggal Beli");
        tabel.addColumn("Tanggal Berwisata");
        tabel.addColumn("Nama Wisata");
        tabel.addColumn("Nama Pemandu");
        try {
            Connection conn = koneksi.getKoneksi();
            String sql="select *from costumer";
            PreparedStatement pst =conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7)});
            }
        jTable1.setModel(tabel);
        } catch (Exception ex){
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
            java.util.logging.Logger.getLogger(Costumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Costumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Costumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Costumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Costumer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CariData;
    private javax.swing.JTextField IdCostumer;
    private javax.swing.JTextField NamaCostumer;
    private javax.swing.JTextField NoTelp;
    private com.toedter.calendar.JDateChooser TanggalBeli;
    private com.toedter.calendar.JDateChooser TanggalWisata;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}