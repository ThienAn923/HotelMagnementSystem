
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author halap
 */
public class ThemPhong extends javax.swing.JFrame {

    /**
     * Creates new form TaoPhong
     */
    public ThemPhong() {
        initComponents();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement", "root", "");
            Statement st = (Statement) con.createStatement();
            
            ArrayList<String> tmp = new ArrayList<String>();
            
            String trangThai = "SELECT MaTrangThai, TenTrangThai FROM trangthai";
            String tangSQL = "SELECT IDTang FROM tang";
            String khuvucSQL = "SELECT IDKhuVuc FROM khuvuc";
            String loaiSQL = "SELECT IDLoai, tenLoai FROM loaiphong";
            
            
            // Set combo box cua trang thai
            ResultSet ttRS = st.executeQuery(trangThai);
            tmp.add("Chọn Trạng Thái");  
            while (ttRS.next()) {
                String maTT = ttRS.getString(1);
                String tenTT = ttRS.getString(2);
                String full = maTT.concat(" - " + tenTT);
                tmp.add(full);
            }
            String[] dsTT = tmp.toArray(new String[0]); // chuyen array list sang array binh thuong
            trangthai.setModel(new DefaultComboBoxModel(dsTT)); // set model cua combo box
            tmp.clear(); // xoa het array list
            
            
            
            // Set combo box cua tang
            ResultSet tangRS = st.executeQuery(tangSQL);
            tmp.add("Chọn Tầng");  
            while (tangRS.next()) {
                String tangNum = tangRS.getString(1);
                tmp.add(tangNum);
            }
            String[] dsTang = tmp.toArray(new String[0]); // chuyen array list sang array binh thuong
            tang.setModel(new DefaultComboBoxModel(dsTang)); // set model cua combo box
            tmp.clear(); // xoa het array list
            
            
            
            // Set combo box cua khu vuc
            ResultSet khuvucRS = st.executeQuery(khuvucSQL);
            tmp.add("Chọn Khu Vực");
            while (khuvucRS.next()) {
                String IDKV = khuvucRS.getString(1);
                tmp.add(IDKV);
            }
            String[] dsKV = tmp.toArray(new String[0]); // chuyen array list sang array binh thuong
            khuvuc.setModel(new DefaultComboBoxModel(dsKV)); // set model cua combo box
            tmp.clear(); // xoa het array list
            
            
            
            // Set combo box cua loai phong
            ResultSet loaiRS = st.executeQuery(loaiSQL);
            tmp.add("Chọn Loại Phòng");
            while (loaiRS.next()) {
                String IDLP = loaiRS.getString(1);
                String tenLoai = loaiRS.getString(2);
                String full = IDLP.concat(" - " + tenLoai);
                tmp.add(full);
            }
            String[] dsLoai = tmp.toArray(new String[0]); // chuyen array list sang array binh thuong
            loai.setModel(new DefaultComboBoxModel(dsLoai));
            tmp.clear(); // xoa het array list
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidphong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttenphong = new javax.swing.JTextField();
        txtgiaphong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmota = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        themmoi = new javax.swing.JButton();
        datlai = new javax.swing.JButton();
        trangthai = new javax.swing.JComboBox<>();
        loai = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        tang = new javax.swing.JComboBox<>();
        khuvuc = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(61, 192, 96));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thêm Phòng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("ID Phòng*");

        txtidphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidphongActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Tên Phòng*");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Giá Phòng*");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Trạng Thái*");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Mô Tả*");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Tầng*");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Khu Vực*");

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Loại*");

        themmoi.setBackground(new java.awt.Color(61, 192, 96));
        themmoi.setForeground(new java.awt.Color(255, 255, 255));
        themmoi.setText("Thêm mới");
        themmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themmoiActionPerformed(evt);
            }
        });

        datlai.setBackground(new java.awt.Color(61, 192, 96));
        datlai.setForeground(new java.awt.Color(255, 255, 255));
        datlai.setText("Reset");
        datlai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datlaiActionPerformed(evt);
            }
        });

        trangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Trạng Thái" }));
        trangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trangthaiActionPerformed(evt);
            }
        });

        loai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Loại Phòng", "LP001 - Giường Đơn", "LP002 - Giường Đôi", "LP003 - Phòng Thường", "Phòng Superior", "Phòng Deluxe", "Phòng Suite", "Phòng Gia Đình", " ", " " }));

        jButton3.setBackground(new java.awt.Color(61, 192, 96));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Auto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Tầng" }));

        khuvuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Khu Vực" }));
        khuvuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khuvucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtidphong, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgiaphong, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(themmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttenphong, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(loai, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datlai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tang, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(khuvuc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidphong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtgiaphong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttenphong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(khuvuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datlai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(themmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidphongActionPerformed

    private void datlaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datlaiActionPerformed
       txtidphong.setText("");
       txttenphong.setText("");
       txtgiaphong.setText("");
       txtmota.setText("");
       tang.setSelectedIndex(0);
       khuvuc.setSelectedIndex(0);
       loai.setSelectedIndex(0);
       trangthai.setSelectedIndex(0);
    }//GEN-LAST:event_datlaiActionPerformed

    private void themmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themmoiActionPerformed
        // them phong
        if (!txtgiaphong.getText().matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "Hãy nhập đúng định dạng giá");
            return;
        } else if (!txttenphong.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hãy nhập tên phòng");
            return;
        } else if (tang.getSelectedItem().toString().equals("Chọn Tầng")) {
            JOptionPane.showMessageDialog(null, "Hãy chọn tầng");
            return;
        } else if (khuvuc.getSelectedItem().toString().equals("Chọn Khu Vực")) {
            JOptionPane.showMessageDialog(null, "Hãy chọn khu vực");
            return;
        } else if (loai.getSelectedItem().toString().equals("Chọn Loại Phòng")) {
            JOptionPane.showMessageDialog(null, "Hãy chọn loại phòng");
            return;
        } else if (trangthai.getSelectedItem().toString().equals("Chọn Trạng Thái")) {
            JOptionPane.showMessageDialog(null, "Hãy chọn trạng thái");
            return;
        } 

        String loaiP = loai.getSelectedItem().toString().substring(0, 5); // lay ID loai phong
        String tt = trangthai.getSelectedItem().toString().substring(0, 5); // lay ma trang thai

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement", "root", "");
            Statement st = (Statement) con.createStatement();
            
            System.out.println("Connection Successful");
            String sql = "INSERT INTO phong(IDPhong, tenPhong, trangThaiPhong, giaPhong, IDTang, IDKhuVuc, IDLoai, moTaPhong)" + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, txtidphong.getText());
            ps.setString(2, txttenphong.getText());
            ps.setString(3, tt);
            ps.setString(4, txtgiaphong.getText());
            ps.setString(5, tang.getSelectedItem().toString());
            ps.setString(6, khuvuc.getSelectedItem().toString());
            ps.setString(7, loaiP);
            ps.setString(8, txtmota.getText());
            ps.execute();
            
            st.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Thành công");
        } catch (Exception e) {
            System.out.println(e);
            if (e.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Phòng đã tồn tại");
            }
        }
    }//GEN-LAST:event_themmoiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Auto
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement", "root", "");
            Statement st = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            String query = "SELECT IDPhong FROM Phong ORDER BY IDPhong";
            ResultSet rs = st.executeQuery(query);
            
            rs.last();
            String lastID = rs.getString(1);
            // tim ID cuoi cung trong csdl
            
            String newIDnum, ID = "P00", ID2 = "P0", ID3 = "P", newID="";
            
            int last = Integer.parseInt(lastID.substring(2, 4));
            last++;
            newIDnum = Integer.toString(last);
            System.out.println(newIDnum);

            switch (newIDnum.length()) {
                case 1:
                    newID = ID.concat(newIDnum);
                    System.out.println(newID);
                    break;
                case 2:
                    newID = ID2.concat(newIDnum);
                    System.out.println(newID);
                    break;
                case 3:
                    newID = ID3.concat(newIDnum);
                    System.out.println(newID);
                    break;
            }
            
            txtidphong.setText(newID);
                  
            st.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void khuvucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khuvucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_khuvucActionPerformed

    private void trangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trangthaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trangthaiActionPerformed

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
            java.util.logging.Logger.getLogger(ThemPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datlai;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> khuvuc;
    private javax.swing.JComboBox<String> loai;
    private javax.swing.JComboBox<String> tang;
    private javax.swing.JButton themmoi;
    private javax.swing.JComboBox<String> trangthai;
    private javax.swing.JTextField txtgiaphong;
    private javax.swing.JTextField txtidphong;
    private javax.swing.JTextField txtmota;
    private javax.swing.JTextField txttenphong;
    // End of variables declaration//GEN-END:variables
}