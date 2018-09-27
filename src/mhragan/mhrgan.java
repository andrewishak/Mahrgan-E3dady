
package mhragan;


public class mhrgan extends javax.swing.JFrame {

    public mhrgan() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
        list_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1_1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1_2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1_3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        head_panel = new javax.swing.JPanel();
        head_Label = new javax.swing.JLabel();
        exit_Label1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("osrt elshohda2");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setName("main_fram"); // NOI18N
        setUndecorated(true);

        panel_main.setBackground(new java.awt.Color(255, 255, 255));
        panel_main.setAutoscrolls(true);
        panel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_panel.setBackground(new java.awt.Color(54, 33, 89));
        list_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(85, 65, 118));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mhragan/images/icons8_To_Do_40px_2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel1_1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1_1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_1.setText("كتاب مقدس");
        jLabel1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 70, 20));

        list_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, -1));

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mhragan/images/icons8_To_Do_40px_2.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel1_2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1_2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_2.setText("عقيدة");
        jLabel1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 70, 20));

        list_panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, -1));

        jPanel3.setBackground(new java.awt.Color(85, 65, 118));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mhragan/images/icons8_Puzzled_40px.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel1_3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1_3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_3.setText("تاريخ كنيسة");
        jLabel1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 70, 20));

        list_panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("__________________");
        list_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 40));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("كنيسة السيدة العذراء بمدينة النور");
        list_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 40));

        panel_main.add(list_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 200, 580));

        head_panel.setBackground(new java.awt.Color(122, 72, 240));

        head_Label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        head_Label.setForeground(new java.awt.Color(204, 204, 204));
        head_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head_Label.setText("أسرة الشهداء");

        javax.swing.GroupLayout head_panelLayout = new javax.swing.GroupLayout(head_panel);
        head_panel.setLayout(head_panelLayout);
        head_panelLayout.setHorizontalGroup(
            head_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_panelLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(head_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        head_panelLayout.setVerticalGroup(
            head_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(head_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panel_main.add(head_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 790, 130));

        exit_Label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit_Label1.setText(" X");
        exit_Label1.setToolTipText("");
        exit_Label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_Label1MouseClicked(evt);
            }
        });
        panel_main.add(exit_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("-");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        panel_main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 20, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit_Label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_Label1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_Label1MouseClicked

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
               this.setState(mhrgan.ICONIFIED);        
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_2MouseClicked
         questions_32eda q3=new questions_32eda();
       q3.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel1_2MouseClicked

    private void jLabel1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_1MouseClicked
       questions q=new questions();
       q.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel1_1MouseClicked

    private void jLabel1_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_3MouseClicked
        
        tare5 t=new tare5();
        t.setVisible(true);   
         this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1_3MouseClicked

    
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
            java.util.logging.Logger.getLogger(mhrgan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mhrgan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mhrgan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mhrgan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mhrgan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit_Label1;
    private javax.swing.JLabel head_Label;
    private javax.swing.JPanel head_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_1;
    private javax.swing.JLabel jLabel1_2;
    private javax.swing.JLabel jLabel1_3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel list_panel;
    private javax.swing.JPanel panel_main;
    // End of variables declaration//GEN-END:variables
}
