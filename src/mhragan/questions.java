
package mhragan;

import java.awt.Color;
import javax.swing.JOptionPane;


public class questions extends javax.swing.JFrame {

    
    public questions() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        head_panel = new javax.swing.JPanel();
        head_Label = new javax.swing.JLabel();
        exit_Label1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head_panel.setBackground(new java.awt.Color(122, 72, 240));

        head_Label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        head_Label.setForeground(new java.awt.Color(204, 204, 204));
        head_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head_Label.setText("أسرة الشهداء");

        javax.swing.GroupLayout head_panelLayout = new javax.swing.GroupLayout(head_panel);
        head_panel.setLayout(head_panelLayout);
        head_panelLayout.setHorizontalGroup(
            head_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, head_panelLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(head_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        head_panelLayout.setVerticalGroup(
            head_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, head_panelLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(head_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(head_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 740, 90));

        exit_Label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit_Label1.setText(" X");
        exit_Label1.setToolTipText("");
        exit_Label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_Label1MouseClicked(evt);
            }
        });
        jPanel1.add(exit_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("-");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 20, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("كم سنة عاشها ادم ؟");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("940");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("920");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton3.setText("930");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("من هو اول جبار ذٌكر في الكتاب المقدس ؟");

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton4.setText("نمرود");

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton5.setText("جليات");

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton6.setText("شمشون");

        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jButton1.setText("submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("كم عدد الاسفار التاريخية في الكتاب المقدس ؟");

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton7.setText("16");

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton8.setText("17");

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton9.setText("18");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("من هو اول ملك على شعب اسرائيل ؟");

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton10.setText("داود");

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton11.setText("موسي");

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton12.setText("شاول");

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("من هو اول من سجد لملك لملوك ؟");

        jRadioButton13.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton13.setText("الرعاة");

        jRadioButton14.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton14.setText("المجوس");

        jRadioButton15.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton15.setText("يوحنا المعمدان");

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("من هو اول شهيد من الاثنى عشر رسول ؟");

        jRadioButton16.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton16.setText("بطرس الرسول");

        jRadioButton17.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton17.setText("يوحنا الرسول");

        jRadioButton18.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton18.setText("يعقوب الرسول");

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("من هو اول من راى الفادى بعد اتمام الفداء ؟");

        jRadioButton19.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton19.setText("السيدة العذراء");

        jRadioButton20.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton20.setText("مريم المجدلية");

        jRadioButton21.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton21.setText("يوحنا الحبيب");

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("في اليوم الاول خلق الله ؟");

        jRadioButton22.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton22.setText("السماء");

        jRadioButton23.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton23.setText("الليل و النهار");

        jRadioButton24.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton24.setText("الارض");

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("من هو اول انسان كان يعمل راعى غنم ؟");

        jRadioButton25.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton25.setText("هابيل");

        jRadioButton26.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton26.setText("قايين");

        jRadioButton27.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(jRadioButton27);
        jRadioButton27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton27.setText("ادم");

        jLabel11.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("من هو الذى لقب بناظر الاله الانجيلى ؟");

        jRadioButton28.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup10.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton28.setText("متى");

        jRadioButton29.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup10.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton29.setText("مرقس");

        jRadioButton30.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup10.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton30.setText("لوقا");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jRadioButton21)
                .addGap(122, 122, 122)
                .addComponent(jRadioButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton19)
                .addGap(140, 140, 140))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jRadioButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton17)
                .addGap(139, 139, 139)
                .addComponent(jRadioButton16)
                .addGap(142, 142, 142))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jRadioButton24)
                .addGap(155, 155, 155)
                .addComponent(jRadioButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton22)
                .addGap(166, 166, 166))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jRadioButton6)
                        .addGap(138, 138, 138)
                        .addComponent(jRadioButton5)
                        .addGap(165, 165, 165)
                        .addComponent(jRadioButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jRadioButton27)
                        .addGap(174, 174, 174)
                        .addComponent(jRadioButton26)
                        .addGap(175, 175, 175)
                        .addComponent(jRadioButton25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jRadioButton3)
                        .addGap(163, 163, 163)
                        .addComponent(jRadioButton2)
                        .addGap(172, 172, 172)
                        .addComponent(jRadioButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jRadioButton12)
                        .addGap(157, 157, 157)
                        .addComponent(jRadioButton11)
                        .addGap(172, 172, 172)
                        .addComponent(jRadioButton10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jRadioButton15)
                        .addGap(116, 116, 116)
                        .addComponent(jRadioButton14)
                        .addGap(169, 169, 169)
                        .addComponent(jRadioButton13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jRadioButton30)
                        .addGap(174, 174, 174)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton29)
                                .addGap(176, 176, 176)
                                .addComponent(jRadioButton28)))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton8)
                .addGap(181, 181, 181)
                .addComponent(jRadioButton7)
                .addGap(185, 185, 185))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15))
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton16))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton19))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton24)
                    .addComponent(jRadioButton23)
                    .addComponent(jRadioButton22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton26)
                    .addComponent(jRadioButton25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton30)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton28))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 740, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit_Label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_Label1MouseClicked
         this.setVisible(false);
         mhrgan m = new mhrgan();
         m.setVisible(true);
    }//GEN-LAST:event_exit_Label1MouseClicked

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        this.setState(mhrgan.ICONIFIED);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int x=0;
        
        if(jRadioButton2.isSelected())
        x++;if(jRadioButton4.isSelected())
        x++;if(jRadioButton7.isSelected())
        x++;if(jRadioButton12.isSelected())
        x++;if(jRadioButton15.isSelected())
        x++;if(jRadioButton18.isSelected())
        x++;if(jRadioButton20.isSelected())
        x++;if(jRadioButton23.isSelected())
        x++;if(jRadioButton25.isSelected())
        x++;if(jRadioButton29.isSelected())
        x++;
        JOptionPane.showMessageDialog(this,"Your Score is "+ x+"/10");
    }//GEN-LAST:event_jButton1MouseClicked

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel exit_Label1;
    private javax.swing.JLabel head_Label;
    private javax.swing.JPanel head_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
