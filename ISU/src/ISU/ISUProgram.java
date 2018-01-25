package ISU;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

//A military tomagotchi simulator//
//////////////////////////////////

public class ISUProgram extends javax.swing.JFrame {
    //Variables
    ArrayList list;
    ListIterator li;
    int cStaff, tStaff, GMP;
    MotherBase S;

     //Default constructor
    public ISUProgram() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        cStaff = 0;
        tStaff = 0;
        GMP = 2200;
        lblGMP.setText("$" + GMP);
    }

   //Updates each label
    private void Update() {
        lbltStaff.setText("" + tStaff);
        lblcStaff.setText("" + cStaff);
        lblName.setText("" + S.getName());
        lblRank.setText("" + S.getRank());
        lblFA.setText("" + S.getFA());
        lblHP.setText("" + S.getHP());
        lblMorale.setText("" + S.getMorale());
        lblGMP.setText("$" + GMP);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblname = new javax.swing.JLabel();
        lbldesc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnfirst = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblcStaff = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbltStaff = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRank = new javax.swing.JLabel();
        lbldesc1 = new javax.swing.JLabel();
        lblHP = new javax.swing.JLabel();
        lbldesc2 = new javax.swing.JLabel();
        lblMorale = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblGMP = new javax.swing.JLabel();
        lblFA = new javax.swing.JLabel();
        lbldesc3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuprogram = new javax.swing.JMenu();
        mnushowall = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        mnuinsert = new javax.swing.JMenu();
        mnuBuyStealth = new javax.swing.JMenuItem();
        mnuBuySnipe = new javax.swing.JMenuItem();
        mnuedit = new javax.swing.JMenu();
        mnuDischarge = new javax.swing.JMenuItem();
        mnuOp = new javax.swing.JMenu();
        mnuEat = new javax.swing.JMenuItem();
        mnuTrain = new javax.swing.JMenuItem();
        mnuMission = new javax.swing.JMenuItem();
        mnuResearchS = new javax.swing.JMenuItem();
        mnuResearchRF = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblname.setText("Name");
        getContentPane().add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 16, -1, -1));

        lbldesc.setText("Rank");
        getContentPane().add(lbldesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnback.setText("<");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnfirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnnext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlast)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btnnext)
                    .addComponent(btnlast)
                    .addComponent(btnfirst))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 383, -1, 48));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Staff Member");

        jLabel2.setText("Total Staff");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblcStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcStaff.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcStaff)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbltStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltStaff.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltStaff, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(115, 115, 115))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 326, -1, 39));

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, 20));

        lblRank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRank.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 89, 153, 20));

        lbldesc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldesc1.setText("HP");
        getContentPane().add(lbldesc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 22, -1));

        lblHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 187, 153, 30));

        lbldesc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldesc2.setText("Morale");
        getContentPane().add(lbldesc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        lblMorale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMorale.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblMorale, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 239, 153, 30));

        jLabel3.setText("GMP:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 302, -1, -1));

        jLabel4.setText("Resources");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 273, -1, -1));

        lblGMP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblGMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 302, 70, 20));

        lblFA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 131, 153, 30));

        lbldesc3.setText("Fighting Ability");
        getContentPane().add(lbldesc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 80, -1));

        mnuprogram.setText("Program");

        mnushowall.setText("Show All Staff Members");
        mnushowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnushowallActionPerformed(evt);
            }
        });
        mnuprogram.add(mnushowall);

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        mnuprogram.add(mnuexit);

        jMenuBar1.add(mnuprogram);

        mnuinsert.setText("Purchase Staff");

        mnuBuyStealth.setText("Purchase Stealth Operator -$1000 GMP");
        mnuBuyStealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBuyStealthActionPerformed(evt);
            }
        });
        mnuinsert.add(mnuBuyStealth);

        mnuBuySnipe.setText("Purchase Sniper Operator - $1200 GMP");
        mnuBuySnipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBuySnipeActionPerformed(evt);
            }
        });
        mnuinsert.add(mnuBuySnipe);

        jMenuBar1.add(mnuinsert);

        mnuedit.setText("Discharge");

        mnuDischarge.setText("Discharge Staff Member");
        mnuDischarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDischargeActionPerformed(evt);
            }
        });
        mnuedit.add(mnuDischarge);

        jMenuBar1.add(mnuedit);

        mnuOp.setText("Operations");

        mnuEat.setText("Eat at Mess Hall");
        mnuEat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEatActionPerformed(evt);
            }
        });
        mnuOp.add(mnuEat);

        mnuTrain.setText("Train Staff Member");
        mnuTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTrainActionPerformed(evt);
            }
        });
        mnuOp.add(mnuTrain);

        mnuMission.setText("Send on Mission");
        mnuMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMissionActionPerformed(evt);
            }
        });
        mnuOp.add(mnuMission);

        mnuResearchS.setText("Research Stealth - STEALTH ONLY");
        mnuResearchS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuResearchSActionPerformed(evt);
            }
        });
        mnuOp.add(mnuResearchS);

        mnuResearchRF.setText("Research Range finding - SNIPER ONLY");
        mnuResearchRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuResearchRFActionPerformed(evt);
            }
        });
        mnuOp.add(mnuResearchRF);

        jMenuBar1.add(mnuOp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnushowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowallActionPerformed
        String result = "";
        for (int x = 0; x < list.size(); x++) {
            S = (MotherBase) list.get(x);
            result += "Staff Member# " + (x + 1) + ":\n" + S.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, result);
        //Gathers Name & Rank of each Staff Member in List and displays it
    }//GEN-LAST:event_mnushowallActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
        //Exits program
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnuDischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDischargeActionPerformed
        //Removes a Staff Member
        if (cStaff == 0) {
            return;
        } //if current Staff is 0, don't remove
        li.next();
        li.remove();
        tStaff--;
        lbltStaff.setText("" + tStaff);
        if (tStaff == 0) {
            lblName.setText("");
            lblRank.setText("");
            lblFA.setText("");
            lblHP.setText("");
            lblMorale.setText("");
            cStaff = 0;
            lblcStaff.setText("n/a");
            return;
        } else if (cStaff > 1) {
            S = (MotherBase) li.previous();
            cStaff--;
            lblcStaff.setText("" + cStaff);
        } else {
            li.next();
            S = (MotherBase) li.previous();
        }
        Update(); //Call to update labels after any change to a member
    }//GEN-LAST:event_mnuDischargeActionPerformed

    private void mnuBuyStealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBuyStealthActionPerformed
        //Buying A Stealth Operator
        if (GMP >= 1000) { //Checks for sufficient funds
            String nm = JOptionPane.showInputDialog(this, "Enter First Name", "");
            S = new Stealth(nm); //Tells it it's a stealth
            if (tStaff > 0) {
                li.next();
            }
            li.add(S);
            li.previous();
            cStaff++;
            tStaff++;
            GMP -= 1000; //deduct cost
            Update(); //upate
            JOptionPane.showMessageDialog(this, "Staff Purchased");
        } else {
            JOptionPane.showMessageDialog(this, "Insufficient Funds"); //If gmp is below set amount
        }
    }//GEN-LAST:event_mnuBuyStealthActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        //Goes to first member in list
        if (cStaff == 1) {
            return;
        }
        while (li.hasPrevious()) {
            S = (MotherBase) li.previous();
        }

        cStaff = 1;
        Update();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        //Go back one in list
        if (cStaff == 1) {
            return;
        }
        cStaff--;
        lblcStaff.setText("" + cStaff);

        S = (MotherBase) li.previous();
        Update();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        //Go to next staff member
        if (cStaff == tStaff) {
            return;
        }
        cStaff++;
        lblcStaff.setText("" + cStaff);
        li.next();
        li.next();
        S = (MotherBase) li.previous();
        Update();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        //Goes to last staff member in list
        if (cStaff == tStaff) {
            return;
        }
        while (li.hasNext()) {
            li.next();
        }
        S = (MotherBase) li.previous();
        cStaff = tStaff;
        Update();
    }//GEN-LAST:event_btnlastActionPerformed

    private void mnuBuySnipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBuySnipeActionPerformed
        //Buying sniper operator, mostly same as stealth
        if (GMP >= 1200) {//cost
            String nm = JOptionPane.showInputDialog(this, "Enter First Name", "");
            S = new Sniper(nm); //Tell it it's a sniper
            if (tStaff > 0) {
                li.next();
            }
            li.add(S);
            li.previous();
            cStaff++;
            tStaff++;
            GMP -= 1200;
            Update();
            JOptionPane.showMessageDialog(this, "Staff Purchased");
        } else {
            JOptionPane.showMessageDialog(this, "Insufficient Funds");
        }
    }//GEN-LAST:event_mnuBuySnipeActionPerformed

    private void mnuEatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEatActionPerformed
        S.Eat(); //Calls Eating action
        JOptionPane.showMessageDialog(this, S.Name + " goes to the Mess Hall & Eats...\nMorale Up!\nHP Up!"); //Displays message telling what levelled up
        Update();
    }//GEN-LAST:event_mnuEatActionPerformed

    private void mnuTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTrainActionPerformed
        S.Train(); //Same as above
        JOptionPane.showMessageDialog(this, S.Name + " Trains to improve their fighting skills\nMorale Up!\nFighting Ability Up!");
        Update();
    }//GEN-LAST:event_mnuTrainActionPerformed

    private void mnuMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMissionActionPerformed
        S.Mission(); //Sending staff on missions
        if (S.WinLose == 1) { //If they win, They level up
            JOptionPane.showMessageDialog(this, S.Name + " Completed the mission successfully!\nFighting Ability Up!\nMorale Up");
            Update();
        } else if (S.WinLose == 2) {//If they lose, they get hurt
            JOptionPane.showMessageDialog(this, S.Name + " Has Failed the mission...\nMorale Down.\nHP Down.");
            Update();
            if (S.HP == 0) { //If their hp reaches 0, they die, and are then removed just as if being discharged
                JOptionPane.showMessageDialog(this, "Staff Member " + S.Name + " Has Died");
                if (cStaff == 0) {
                    return;
                }
                li.next();
                li.remove();
                tStaff--;
                lbltStaff.setText("" + tStaff);
                if (tStaff == 0) {
                    lblName.setText("");
                    lblRank.setText("");
                    lblFA.setText("");
                    lblHP.setText("");
                    lblMorale.setText("");
                    cStaff = 0;
                    lblcStaff.setText("n/a");
                    return;
                } else if (cStaff > 1) {
                    S = (MotherBase) li.previous();
                    cStaff--;
                    lblcStaff.setText("" + cStaff);
                } else {
                    li.next();
                    S = (MotherBase) li.previous();
                }
                Update();
            }

        }
    }//GEN-LAST:event_mnuMissionActionPerformed

    private void mnuResearchSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuResearchSActionPerformed
        try { //Could not get to call rigt //Calls mehod exclusive to Stealth
            //S.SRnD();
            //JOptionPane.showMessageDialog(this, "Staff Member " + S.Name + " Researches Stealth Tactics\n Stealth Skill: " + Stealth.geSRnD());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Staff Member " + S.Name + " Is not A Stealth Class.");
        }
    }//GEN-LAST:event_mnuResearchSActionPerformed

    private void mnuResearchRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuResearchRFActionPerformed
        try { //Same as above
            S = new Sniper();
            //S.RangeFinding();
            //JOptionPane.showMessageDialog(this, "Staff Member " + S.Name + " Researches Range Finding\n Range Finding Skill: " + Sniper.getRF());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Staff Member " + S.Name + " Is not A Sniper Class.");
        }
    }//GEN-LAST:event_mnuResearchRFActionPerformed

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
            java.util.logging.Logger.getLogger(ISUProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISUProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISUProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISUProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISUProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblFA;
    private javax.swing.JLabel lblGMP;
    private javax.swing.JLabel lblHP;
    private javax.swing.JLabel lblMorale;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRank;
    private javax.swing.JLabel lblcStaff;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JLabel lbldesc1;
    private javax.swing.JLabel lbldesc2;
    private javax.swing.JLabel lbldesc3;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbltStaff;
    private javax.swing.JMenuItem mnuBuySnipe;
    private javax.swing.JMenuItem mnuBuyStealth;
    private javax.swing.JMenuItem mnuDischarge;
    private javax.swing.JMenuItem mnuEat;
    private javax.swing.JMenuItem mnuMission;
    private javax.swing.JMenu mnuOp;
    private javax.swing.JMenuItem mnuResearchRF;
    private javax.swing.JMenuItem mnuResearchS;
    private javax.swing.JMenuItem mnuTrain;
    private javax.swing.JMenu mnuedit;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenu mnuinsert;
    private javax.swing.JMenu mnuprogram;
    private javax.swing.JMenuItem mnushowall;
    // End of variables declaration//GEN-END:variables
}
