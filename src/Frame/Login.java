/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
import AppPackage.AnimationClass;
import java.awt.Color;

/**
 *
 * @author Chente
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplIngreso.setBackground(new java.awt.Color(204, 204, 0));
        jplIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jplIngreso.setForeground(new java.awt.Color(204, 204, 0));
        jplIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("USER:");
        jplIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("PASSWORD:");
        jplIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario-hombre.png"))); // NOI18N
        jplIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 70, 110));

        jTextField2.setText("Ingrese usuario");
        jplIngreso.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 150, -1));
        jplIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 220, 20));
        jplIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 210, 20));

        jPasswordField1.setText("jPasswordField1");
        jplIngreso.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        jplIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bloquear.png"))); // NOI18N
        jplIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Opciones");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jplIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setText("ACCEDER");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jplIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 140, 50));

        getContentPane().add(jplIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setForeground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baloncesto.png"))); // NOI18N
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 70));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/habilidades.png"))); // NOI18N
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 80, 70));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bank.png"))); // NOI18N
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 80, 70));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/betting.png"))); // NOI18N
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 80, 70));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel11MouseMoved(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 80, 70));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poker-full.png"))); // NOI18N
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel12MouseMoved(evt);
            }
        });
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 80, 70));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugador-de-futbol-americano.png"))); // NOI18N
        jLabel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel13MouseMoved(evt);
            }
        });
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 80, 70));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/juego-de-futbol.png"))); // NOI18N
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel14MouseMoved(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 80, 70));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/liga-europea-de-la-uefa.png"))); // NOI18N
        jLabel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel15MouseMoved(evt);
            }
        });
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, 70));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/football.png"))); // NOI18N
        jLabel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel16MouseMoved(evt);
            }
        });
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 80, 70));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/basketball-player-scoring.png"))); // NOI18N
        jLabel17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel17MouseMoved(evt);
            }
        });
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 80, 70));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugador-de-baloncesto.png"))); // NOI18N
        jLabel18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel18MouseMoved(evt);
            }
        });
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 80, 70));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png"))); // NOI18N
        jLabel19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel19MouseMoved(evt);
            }
        });
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 70));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grafico-de-estadisticas-de-futbol.png"))); // NOI18N
        jLabel20.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel20MouseMoved(evt);
            }
        });
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, 70));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exito.png"))); // NOI18N
        jLabel21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel21MouseMoved(evt);
            }
        });
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 80, 70));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Users");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("UserPayment");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("UserTransaction");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("PlayerStats");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("UserBet");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("UserTean");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Bets");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Sports");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Matchts");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Leagues");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Teams");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Players");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("UserPlayers");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("MatchStats");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("TeamStats");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 750, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked

        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseMoved

        // TODO add your handling code here:
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel19MouseMoved

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        // TODO add your handling code here:
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        // TODO add your handling code here:
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseMoved
        // TODO add your handling code here:
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel11MouseMoved

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
        // TODO add your handling code here:
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseMoved
        // TODO add your handling code here:
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel12MouseMoved

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseMoved
        // TODO add your handling code here:
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel13MouseMoved

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
         jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
        // TODO add your handling code here:
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel14MouseMoved

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseMoved
        // TODO add your handling code here:
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel15MouseMoved

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseMoved
        // TODO add your handling code here:
         jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        
    }//GEN-LAST:event_jLabel16MouseMoved

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel17MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseMoved
        // TODO add your handling code here:
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel17MouseMoved

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
          jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseMoved
        // TODO add your handling code here:
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel18MouseMoved

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        // TODO add your handling code here:
         jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel20MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseMoved
        // TODO add your handling code here:
         jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel20MouseMoved

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:
         jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel21MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseMoved
        // TODO add your handling code here:
         jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel21MouseMoved

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        // TODO add your handling code here:
         jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,0)));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
       new FrameUsers().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        new FrameUsersTransaction().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked
                         
    
   

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jplIngreso;
    // End of variables declaration//GEN-END:variables
}
