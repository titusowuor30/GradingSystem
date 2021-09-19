
package gradingsystem;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Studentdetails extends javax.swing.JFrame {
    ConnectDb db;
    ResultSet rs=null;
    PreparedStatement pr=null;
    Connection con=null;
 Studentdetails() {
        initComponents();
        db.getConnection();
    }
//disable fields
 public void disableFields(){
     String form=formcombo.getSelectedItem().toString();
     if(form.equals("Form 3")||form.equals("Form 4")){
         if(bio.getText() !="" && phy.getText() !="" && chem.getText() !="" && geo.getText() !=""){
             hist.setVisible(false);
             cre.setVisible(false);
         }
     }
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        adm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        formcombo = new javax.swing.JComboBox<>();
        math = new javax.swing.JTextField();
        eng = new javax.swing.JTextField();
        kis = new javax.swing.JTextField();
        chem = new javax.swing.JTextField();
        phy = new javax.swing.JTextField();
        bus = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        hist = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        agri = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        geo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("tab2", jScrollPane2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Full Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ADM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Form");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("math");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("eng");

        fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        adm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("kis");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("phy");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("chem");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("bus");

        formcombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        formcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Form 1", "Form 2", "Form 3", "Form 4" }));
        formcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formcomboActionPerformed(evt);
            }
        });

        math.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        math.setText("0");

        eng.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eng.setText("0");

        kis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kis.setText("0");

        chem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chem.setText("0");
        chem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemActionPerformed(evt);
            }
        });
        chem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chemKeyReleased(evt);
            }
        });

        phy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phy.setText("0");
        phy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phyKeyReleased(evt);
            }
        });

        bus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bus.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("hist");

        hist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hist.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("agri");

        agri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agri.setText("0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("cre");

        cre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cre.setText("0");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("bio");

        bio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bio.setText("0");
        bio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bioKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("geo");

        geo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        geo.setText("0");
        geo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                geoKeyReleased(evt);
            }
        });

        jButton1.setText("Add marks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit marks");

        jButton3.setText("Rank students");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("view charts");

        jButton5.setText("print results");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fname)
                            .addComponent(adm)
                            .addComponent(formcombo, 0, 153, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(eng))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(25, 25, 25)
                                .addComponent(kis)))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(phy, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(geo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hist, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cre)
                                    .addComponent(agri))))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(kis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(chem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(phy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(formcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(hist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(agri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(geo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(bio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formcomboActionPerformed

    private void chemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chemActionPerformed

    private void bioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bioKeyReleased

    private void chemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_chemKeyReleased

    private void phyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_phyKeyReleased

    private void geoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_geoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_geoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int total=0;
       int points=0;
       double avg=0.0;
       String mytotal=math.getText()+eng.getText()+kis.getText()+bio.getText()+chem.getText()+phy.getText()
               +geo.getText()+hist.getText()+cre.getText()+bus.getText()+agri.getText();
       total=Integer.parseInt(mytotal);
       String form=formcombo.getSelectedItem().toString();
       if(form.equals("Form 1") || form.equals("Form 2")){
           avg=Double.parseDouble((total/12));
       }else{
           avg=Double.parseDouble((total/8));
       }
       //points
       //sciences
       if(Integer.parseInt(math.getText())>=70 || Integer.parseInt(bio.getText())>=70 || Integer.parseInt(chem.getText())>=70 || Integer.parseInt(phy.getText()) >=70){
         points=12;  
       }else if(Integer.parseInt(math.getText())>=65 || Integer.parseInt(bio.getText())>=65 || Integer.parseInt(chem.getText())>=65 || Integer.parseInt(phy.getText()) >=65){
         points=11;  
       }else if(Integer.parseInt(math.getText())>=60 || Integer.parseInt(bio.getText())>=60 || Integer.parseInt(chem.getText())>=60 || Integer.parseInt(phy.getText()) >=60){
         points=10;  
       }else if(Integer.parseInt(math.getText())>=55 || Integer.parseInt(bio.getText())>=55 || Integer.parseInt(chem.getText())>=55 || Integer.parseInt(phy.getText()) >=55){
         points=9;  
       }else if(Integer.parseInt(math.getText())>=50 || Integer.parseInt(bio.getText())>=50 || Integer.parseInt(chem.getText())>=50 || Integer.parseInt(phy.getText()) >=50){
         points=8;  
       }else if(Integer.parseInt(math.getText())>=45 || Integer.parseInt(bio.getText())>=45 || Integer.parseInt(chem.getText())>=45 || Integer.parseInt(phy.getText()) >=45){
         points=7;  
       }else if(Integer.parseInt(math.getText())>=40 || Integer.parseInt(bio.getText())>=40 || Integer.parseInt(chem.getText())>=40 || Integer.parseInt(phy.getText()) >=40){
         points=6;  
       }else if(Integer.parseInt(math.getText())>=35 || Integer.parseInt(bio.getText())>=35 || Integer.parseInt(chem.getText())>=35 || Integer.parseInt(phy.getText()) >=35){
         points=5;  
       }else if(Integer.parseInt(math.getText())>=30 || Integer.parseInt(bio.getText())>=30 || Integer.parseInt(chem.getText())>=30 || Integer.parseInt(phy.getText()) >=30){
         points=4;  
       }else if(Integer.parseInt(math.getText())>=25 || Integer.parseInt(bio.getText())>=25 || Integer.parseInt(chem.getText())>=25 || Integer.parseInt(phy.getText()) >=25){
         points=3;  
       }else if(Integer.parseInt(math.getText())>=20 || Integer.parseInt(bio.getText())>=20 || Integer.parseInt(chem.getText())>=20 || Integer.parseInt(phy.getText()) >=20){
         points=2;  
       }else{
           points=1;
       }
       //humaninities
       if(Integer.parseInt(geo.getText())>=80 || Integer.parseInt(hist.getText())>=80 || Integer.parseInt(cre.getText())>=80){
         points=12;  
       }else if(Integer.parseInt(geo.getText())>=75 || Integer.parseInt(hist.getText())>=75 || Integer.parseInt(cre.getText())>=75){
         points=11;  
       }else if(Integer.parseInt(math.getText())>=70 || Integer.parseInt(bio.getText())>=70 || Integer.parseInt(cre.getText())>=70){
         points=10;  
       }else if(Integer.parseInt(math.getText())>=65 || Integer.parseInt(hist.getText())>=65 || Integer.parseInt(cre.getText())>=65){  
           points=9;  
       }else if(Integer.parseInt(math.getText())>=60 || Integer.parseInt(hist.getText())>=60 || Integer.parseInt(cre.getText())>=60){  
           points=8;  
       }else if(Integer.parseInt(math.getText())>=55 || Integer.parseInt(hist.getText())>=55 || Integer.parseInt(cre.getText())>=55){  
           points=7;  
       }else if(Integer.parseInt(math.getText())>=50 || Integer.parseInt(hist.getText())>=50 || Integer.parseInt(cre.getText())>=50){  
           points=6;  
       }else if(Integer.parseInt(math.getText())>=45 || Integer.parseInt(hist.getText())>=45 || Integer.parseInt(cre.getText())>=45){  
           points=5;  
       }else if(Integer.parseInt(math.getText())>=40 || Integer.parseInt(hist.getText())>=40 || Integer.parseInt(cre.getText())>=40){  
           points=4;  
       }else if(Integer.parseInt(math.getText())>=35 || Integer.parseInt(hist.getText())>=35 || Integer.parseInt(cre.getText())>=35){  
           points=3;  
       }else if(Integer.parseInt(math.getText())>=30 || Integer.parseInt(hist.getText())>=30 || Integer.parseInt(cre.getText())>=30){  
           points=2;  
       }else {
           points=1;
       }
        //languages
       if(Integer.parseInt(eng.getText())>=75 || Integer.parseInt(kis.getText())>=75){
         points=12;  
       }else if(Integer.parseInt(eng.getText())>=70 || Integer.parseInt(kis.getText())>=70){
         points=11;  
       }else if(Integer.parseInt(eng.getText())>=65 || Integer.parseInt(kis.getText())>=65){
         points=10;  
       }else if(Integer.parseInt(eng.getText())>=60 || Integer.parseInt(kis.getText())>=60){
         points=9;  
       }else if(Integer.parseInt(eng.getText())>=55 || Integer.parseInt(kis.getText())>=55){
         points=8;  
       }else if(Integer.parseInt(eng.getText())>=50 || Integer.parseInt(kis.getText())>=50){
         points=7;  
       }else if(Integer.parseInt(eng.getText())>=45 || Integer.parseInt(kis.getText())>=45){
         points=6;  
       }else if(Integer.parseInt(eng.getText())>=40 || Integer.parseInt(kis.getText())>=40){
         points=5;  
       }else if(Integer.parseInt(eng.getText())>=35 || Integer.parseInt(kis.getText())>=35){
         points=4;  
       }else if(Integer.parseInt(eng.getText())>=30 || Integer.parseInt(kis.getText())>=30){
         points=3;  
       }else if(Integer.parseInt(eng.getText())>=25 || Integer.parseInt(kis.getText())>=25){
         points=2;  
       }else {
           points=1;
       }
       //applied
       if(Integer.parseInt(bus.getText())>=75 || Integer.parseInt(agri.getText())>=75){
         points=12;  
       }else if(Integer.parseInt(bus.getText())>=70 || Integer.parseInt(agri.getText())>=70){
         points=11;  
       }else if(Integer.parseInt(bus.getText())>=65 || Integer.parseInt(agri.getText())>=65){
         points=10;  
       }else if(Integer.parseInt(bus.getText())>=60 || Integer.parseInt(agri.getText())>=60){
         points=9;  
       }else if(Integer.parseInt(bus.getText())>=55 || Integer.parseInt(agri.getText())>=55){
         points=8;  
       }else if(Integer.parseInt(bus.getText())>=50 || Integer.parseInt(agri.getText())>=50){
         points=7;  
       }else if(Integer.parseInt(bus.getText())>=45 || Integer.parseInt(agri.getText())>=45){
         points=6;  
       }else if(Integer.parseInt(bus.getText())>=40 || Integer.parseInt(agri.getText())>=40){
         points=5;  
       }else if(Integer.parseInt(bus.getText())>=35 || Integer.parseInt(agri.getText())>=35){
         points=4;  
       }else if(Integer.parseInt(bus.getText())>=30 || Integer.parseInt(agri.getText())>=30){
         points=3;  
       }else if(Integer.parseInt(bus.getText())>=25 || Integer.parseInt(agri.getText())>=25){
         points=2;  
       }else {
           points=1;
       }
        try {
            con=db.getConnection();
            pr=con.prepareStatement("INSERT INTO StudentData(fullname,adm,form,math,eng,kis,bio,chem,phy,geo,hist,cre,bus,agri,total,points,avg,rank)"
                    + "VALUES('"+fname.getText()+"','"+adm.getText()+"','"+formcombo.getSelectedItem().toString()+"',"+Integer.parseInt(math.getText())+""
                            + ","+Integer.parseInt(eng.getText())+","+Integer.parseInt(kis.getText())+","+Integer.parseInt(bio.getText())+""
                                    + ","+Integer.parseInt(chem.getText())+","+Integer.parseInt(phy.getText())+","+Integer.parseInt(geo.getText())+""
                                            + ","+Integer.parseInt(hist.getText())+","+Integer.parseInt(cre.getText())+","+Integer.parseInt(bus.getText())+""
                                                    + ","+Integer.parseInt(agri.getText())+",0,0,0.0,0)");
            pr.executeUpdate();
             JOptionPane.showMessageDialog(null, "Entry added");
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         //List<String> students = new ArrayList<String>();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Studentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adm;
    private javax.swing.JTextField agri;
    private javax.swing.JTextField bio;
    private javax.swing.JTextField bus;
    private javax.swing.JTextField chem;
    private javax.swing.JTextField cre;
    private javax.swing.JTextField eng;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> formcombo;
    private javax.swing.JTextField geo;
    private javax.swing.JTextField hist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField kis;
    private javax.swing.JTextField math;
    private javax.swing.JTextField phy;
    // End of variables declaration//GEN-END:variables
}
