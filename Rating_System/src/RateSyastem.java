/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class RateSyastem extends javax.swing.JFrame {

    /**
     * Creates new form RateSyastem
     */
    public RateSyastem() {
        initComponents();
        connect();
        question();
    }

    Connection con;
    PreparedStatement pst;
    
    public final void connect(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/rate","root","");
            JOptionPane.showMessageDialog(this,"Connected");
            
        }
        catch(ClassNotFoundException | SQLException e){
            
        }
    }
    
    
    public void question(){
        String query = "select * from guide";
        Statement stat = null;
        ResultSet rs;
        
        try{
            stat = con.createStatement();
            rs = stat.executeQuery(query);
            
            int id =1;
            while (rs.next()){
                if (id == 1) jLabel1.setText(rs.getString(2));
                if (id == 2) jLabel2.setText(rs.getString(2));
                if (id == 3) jLabel3.setText(rs.getString(2));
                id+=1;
            }
        
        }catch(SQLException e){
        e.printStackTrace();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        asd = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r10 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r15 = new javax.swing.JRadioButton();
        r14 = new javax.swing.JRadioButton();
        r13 = new javax.swing.JRadioButton();
        r12 = new javax.swing.JRadioButton();
        r11 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setText("Rate this Guide");

        asd.setText("Guide rating");

        jLabel1.setText("jLabel6");

        jLabel2.setText("jLabel6");

        jLabel3.setText("jLabel6");

        buttonGroup1.add(r1);
        r1.setText("1");

        buttonGroup1.add(r2);
        r2.setText("2");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r3);
        r3.setText("3");

        buttonGroup1.add(r5);
        r5.setText("5");

        buttonGroup1.add(r4);
        r4.setText("4");

        buttonGroup2.add(r10);
        r10.setText("5");

        buttonGroup2.add(r9);
        r9.setText("4");

        buttonGroup2.add(r8);
        r8.setText("3");

        buttonGroup2.add(r7);
        r7.setText("2");
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        buttonGroup2.add(r6);
        r6.setText("1");

        buttonGroup3.add(r15);
        r15.setText("5");

        buttonGroup3.add(r14);
        r14.setText("4");

        buttonGroup3.add(r13);
        r13.setText("3");

        buttonGroup3.add(r12);
        r12.setText("2");
        r12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r12ActionPerformed(evt);
            }
        });

        buttonGroup3.add(r11);
        r11.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r6)
                        .addGap(18, 18, 18)
                        .addComponent(r7)
                        .addGap(18, 18, 18)
                        .addComponent(r8)
                        .addGap(18, 18, 18)
                        .addComponent(r9)
                        .addGap(18, 18, 18)
                        .addComponent(r10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r1)
                        .addGap(18, 18, 18)
                        .addComponent(r2)
                        .addGap(18, 18, 18)
                        .addComponent(r3)
                        .addGap(18, 18, 18)
                        .addComponent(r4)
                        .addGap(18, 18, 18)
                        .addComponent(r5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r11)
                        .addGap(18, 18, 18)
                        .addComponent(r12)
                        .addGap(18, 18, 18)
                        .addComponent(r13)
                        .addGap(18, 18, 18)
                        .addComponent(r14)
                        .addGap(18, 18, 18)
                        .addComponent(r15)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(r1)
                    .addComponent(r2)
                    .addComponent(r3)
                    .addComponent(r5)
                    .addComponent(r4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6)
                    .addComponent(r7)
                    .addComponent(r8)
                    .addComponent(r10)
                    .addComponent(r9)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r11)
                    .addComponent(r12)
                    .addComponent(r13)
                    .addComponent(r15)
                    .addComponent(r14)
                    .addComponent(jLabel3))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1.setText("Rate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(104, 104, 104))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(asd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asd)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r7ActionPerformed

    private void r12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r12ActionPerformed

    
    double value1;
    double value2;
    double value3;
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(buttonGroup1.getSelection() !=null){
            if(r1.isSelected()){
                value1 = 1;
            }else if(r2.isSelected()){
               value1=2;
            }else if(r3.isSelected()){
               value1=3;
            }else if(r4.isSelected()){
               value1=4;
            }else if(r5.isSelected()){
               value1=5;
            }
        }
        
        if(buttonGroup2.getSelection() !=null){
            if(r6.isSelected()){
                value2 = 1;
            }else if(r7.isSelected()){
               value2=2;
            }else if(r8.isSelected()){
               value2=3;
            }else if(r9.isSelected()){
               value2=4;
            }else if(r10.isSelected()){
               value2=5;
            }
        }
        
        if(buttonGroup3.getSelection() !=null){
            if(r11.isSelected()){
                value3 = 1;
            }else if(r12.isSelected()){
               value3=2;
            }else if(r13.isSelected()){
               value3=3;
            }else if(r14.isSelected()){
               value3=4;
            }else if(r15.isSelected()){
               value3=5;
            }
        }
        
        double tot = value1 + value2 + value3;
        double avg = tot/3;
        
        txtname.getText()= toString(double(avg));
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RateSyastem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RateSyastem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RateSyastem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RateSyastem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RateSyastem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r13;
    private javax.swing.JRadioButton r14;
    private javax.swing.JRadioButton r15;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

    private String toString(double avg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
