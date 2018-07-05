/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system.user;

import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;

/**
 *
 * @author Beamtech
 */
public class Login extends javax.swing.JFrame {
int timeRun=0;
private String  daytime_night,Hour,Minute,second;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        dateTime();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPane = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Animatedpic = new javax.swing.JLabel();
        MinimiseCmd = new javax.swing.JButton();
        CloseCmd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tSecLbel = new javax.swing.JLabel();
        tMinsLbel = new javax.swing.JLabel();
        tHourLbel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        blink1 = new javax.swing.JLabel();
        blink2 = new javax.swing.JLabel();
        dayOfWeeks = new javax.swing.JLabel();
        Pm_AmJlb = new javax.swing.JLabel();
        loginPane = new javax.swing.JPanel();
        LoginLogo = new javax.swing.JLabel();
        usernameJlabel = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        LoginCmd = new javax.swing.JButton();
        passwordJlabel = new javax.swing.JLabel();
        passwordJpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login_page");
        setBackground(new java.awt.Color(0, 204, 0));
        setBounds(new java.awt.Rectangle(0, 0, 400, 300));
        setFocusableWindowState(false);
        setForeground(java.awt.Color.lightGray);
        setLocation(new java.awt.Point(100, 10));
        setMaximumSize(new java.awt.Dimension(1116, 683));
        setMinimumSize(new java.awt.Dimension(198, 83));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(990, 658));
        setResizable(false);
        setSize(new java.awt.Dimension(983, 483));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        headerPane.setBackground(new java.awt.Color(0, 0, 0));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/management/system/user/resources/LOGO.png"))); // NOI18N

        Animatedpic.setForeground(new java.awt.Color(255, 255, 255));
        Animatedpic.setText("appropriate gif");

        MinimiseCmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/management/system/user/resources/mimimize2.png"))); // NOI18N
        MinimiseCmd.setIconTextGap(0);
        MinimiseCmd.setMargin(new java.awt.Insets(0, 0, 0, 0));
        MinimiseCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimiseCmdActionPerformed(evt);
            }
        });

        CloseCmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/management/system/user/resources/close1.png"))); // NOI18N
        CloseCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseCmdActionPerformed(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(9, 168, 231));
        jPanel1.setOpaque(false);

        tSecLbel.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        tSecLbel.setForeground(new java.awt.Color(9, 168, 231));
        tSecLbel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tSecLbel.setText("00");

        tMinsLbel.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        tMinsLbel.setForeground(new java.awt.Color(9, 168, 231));
        tMinsLbel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tMinsLbel.setText("00");

        tHourLbel.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        tHourLbel.setForeground(new java.awt.Color(9, 168, 231));
        tHourLbel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tHourLbel.setText("00");

        dateLabel.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 165, 240));

        blink1.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        blink1.setForeground(new java.awt.Color(9, 168, 231));
        blink1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blink1.setText(":");

        blink2.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        blink2.setForeground(new java.awt.Color(9, 168, 231));
        blink2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blink2.setText(":");

        dayOfWeeks.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        dayOfWeeks.setForeground(new java.awt.Color(0, 165, 240));
        dayOfWeeks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayOfWeeks.setText("dayOfWeek");

        Pm_AmJlb.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        Pm_AmJlb.setForeground(new java.awt.Color(0, 164, 240));
        Pm_AmJlb.setText("PM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dayOfWeeks, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tHourLbel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blink1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tMinsLbel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blink2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tSecLbel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Pm_AmJlb)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tMinsLbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(blink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pm_AmJlb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tSecLbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(blink1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dayOfWeeks, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(tHourLbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerPaneLayout = new javax.swing.GroupLayout(headerPane);
        headerPane.setLayout(headerPaneLayout);
        headerPaneLayout.setHorizontalGroup(
            headerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPaneLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Animatedpic, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MinimiseCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(CloseCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        headerPaneLayout.setVerticalGroup(
            headerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addComponent(Animatedpic, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(headerPaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(headerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPaneLayout.createSequentialGroup()
                        .addComponent(MinimiseCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(headerPaneLayout.createSequentialGroup()
                        .addGroup(headerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CloseCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(headerPane);
        headerPane.setBounds(0, 0, 996, 70);

        loginPane.setBackground(new java.awt.Color(153, 204, 255));
        loginPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginPane.setOpaque(false);
        loginPane.setPreferredSize(new java.awt.Dimension(290, 398));

        LoginLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/management/system/user/resources/select-user.png"))); // NOI18N

        usernameJlabel.setBackground(new java.awt.Color(51, 51, 51));
        usernameJlabel.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        usernameJlabel.setForeground(new java.awt.Color(0, 204, 204));
        usernameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameJlabel.setText("USERNAME");
        usernameJlabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/school/management/system/user/resources/LOGO.png")))); // NOI18N
        usernameJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        usernameJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        usernameJlabel.setOpaque(true);
        usernameJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        usernameTxt.setFont(new java.awt.Font("Urdu Typesetting", 3, 18)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(0, 153, 255));
        usernameTxt.setToolTipText("<html><h4> Enter Username</h4></html>");
        usernameTxt.setMaximumSize(new java.awt.Dimension(180, 35));
        usernameTxt.setMinimumSize(new java.awt.Dimension(180, 35));
        usernameTxt.setPreferredSize(new java.awt.Dimension(180, 35));

        LoginCmd.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        LoginCmd.setForeground(new java.awt.Color(0, 211, 145));
        LoginCmd.setText("log in ");
        LoginCmd.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 1, true)));

        passwordJlabel.setBackground(new java.awt.Color(51, 51, 51));
        passwordJlabel.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        passwordJlabel.setForeground(new java.awt.Color(0, 204, 204));
        passwordJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordJlabel.setText("Password");
        passwordJlabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/school/management/system/user/resources/LOGO.png")))); // NOI18N
        passwordJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        passwordJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        passwordJlabel.setOpaque(true);
        passwordJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        passwordJpass.setText("jPasswordField1");

        javax.swing.GroupLayout loginPaneLayout = new javax.swing.GroupLayout(loginPane);
        loginPane.setLayout(loginPaneLayout);
        loginPaneLayout.setHorizontalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordJpass)
                    .addComponent(LoginLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginCmd)
                .addGap(107, 107, 107))
        );
        loginPaneLayout.setVerticalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(usernameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(passwordJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordJpass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(LoginCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(loginPane);
        loginPane.setBounds(700, 65, 290, 400);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/management/system/user/resources/pexels-photo-1054201.jpeg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(500, 400));
        jLabel6.setMinimumSize(new java.awt.Dimension(700, 550));
        jLabel6.setPreferredSize(new java.awt.Dimension(700, 598));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 67, 700, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseCmdActionPerformed
      System.exit(0);
    }//GEN-LAST:event_CloseCmdActionPerformed

    private void MinimiseCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimiseCmdActionPerformed
      setState(JFrame.ICONIFIED) ;
    }//GEN-LAST:event_MinimiseCmdActionPerformed
// method to create the date and time
    public void dateTime(){
         new Thread(){
          public void run(){
              while(timeRun==0)
              {
                  Calendar cal = new GregorianCalendar();
                  
                  int hour = cal.get(Calendar.HOUR);
                  int minute = cal.get(Calendar.MINUTE);
                  int sec = cal.get(Calendar.SECOND);
                  int AM_PM = cal.get(Calendar.AM_PM);
                 int month = cal.get(Calendar.MONTH);
                 int day = cal.get(Calendar.DAY_OF_MONTH);
                 int year = cal.get(Calendar.YEAR);
                 int dayOfWeek= cal.get(Calendar.DAY_OF_WEEK);
                  if(AM_PM==1){
                     daytime_night ="PM"; 
                  } else {
                      daytime_night = "AM";
                  }
                  if(sec%2==0){
                     blink1.setText(":");
                     blink2.setText(":");
                     dayOfWeeks.setForeground(Color.cyan);
                  }else{
                    blink1.setText("");  
                    blink2.setText("");
                     dayOfWeeks.setForeground(Color.blue);
                  }
                  
                 if(dayOfWeek== 1){
                     dayOfWeeks.setText("Monday");
                }else if(dayOfWeek== 2){
                     dayOfWeeks.setText("Tuesday");
                }else if(dayOfWeek== 3){
                     dayOfWeeks.setText("Wensday");
                }else if(dayOfWeek== 4){
                     dayOfWeeks.setText("Thursday");
                }else if(dayOfWeek== 5){
                     dayOfWeeks.setText("Friday");
                }else if(dayOfWeek== 6){
                     dayOfWeeks.setText("Saturday");
                } else if(dayOfWeek== 7){
                  dayOfWeeks.setText("Sunday");   
                }  
                
//                Hour =( ( hour < 10 ) ? "0"+hour : hour ) + ""; 
                Hour =((hour==0)&&(AM_PM==1)? 12 : ( ( hour < 10 ) ? "0"+hour : hour ))+""; 
                
                Minute = ( ( minute < 10 ) ? "0"+ minute : minute )  + " ";
                second = ( ( sec < 10 ) ? "0"+ sec : sec )  + "";   
               tHourLbel.setText(Hour);
               tMinsLbel.setText(Minute);
               tSecLbel.setText(second);
               Pm_AmJlb.setText(daytime_night);
               dateLabel.setText((day)+" / "+(month+1)+" / "+year+" ");
              }
          }  
        }.start();
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Animatedpic;
    private javax.swing.JButton CloseCmd;
    private javax.swing.JButton LoginCmd;
    private javax.swing.JLabel LoginLogo;
    private javax.swing.JButton MinimiseCmd;
    private javax.swing.JLabel Pm_AmJlb;
    private javax.swing.JLabel blink1;
    private javax.swing.JLabel blink2;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dayOfWeeks;
    private javax.swing.JPanel headerPane;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel loginPane;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel passwordJlabel;
    private javax.swing.JPasswordField passwordJpass;
    private javax.swing.JLabel tHourLbel;
    private javax.swing.JLabel tMinsLbel;
    private javax.swing.JLabel tSecLbel;
    private javax.swing.JLabel usernameJlabel;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
