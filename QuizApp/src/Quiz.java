
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.AbstractButton;




public class Quiz extends javax.swing.JFrame{
    
//Arrays for questions, answers and answers submitted by user
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    
    public static int timer = 15;  //timer for each question
    public static int ans_given = 0;
    public static int count = 0; //for keeping count of question
    public static int score = 0; //to store score
    String name; 
    
    public Quiz(String name) {
        this.name=name;
                
        initComponents();
        submit.setEnabled(false);//submit will be disabled until we reach last question
        
        questions[0][0] = "Number of States in India is";
        questions[0][1] = "22";
        questions[0][2] = "27";
        questions[0][3] = "28";
        questions[0][4] = "29";

        questions[1][0] = "Number of Union Territories in India";
        questions[1][1] = "8";
        questions[1][2] = "9";
        questions[1][3] = "7";
        questions[1][4] = "6";

        questions[2][0] = "What is the name of Indian National Aquatic Animal?";
        questions[2][1] = "River Dolphin";
        questions[2][2] = "Green Frog";
        questions[2][3] = "Crocodile";
        questions[2][4] = "Star Fish";

        questions[3][0] = "Population Census is conducted in India after how many years?";
        questions[3][1] = "12";
        questions[3][2] = "8";
        questions[3][3] = "10";
        questions[3][4] = "7";

        questions[4][0] = "Which city is known as Diamond City of India?";
        questions[4][1] = "Delhi";
        questions[4][2] = "Chennai";
        questions[4][3] = "Nagpur";
        questions[4][4] = "Surat";

        questions[5][0] = "Kargam is a folk dance of which state?";
        questions[5][1] = "Kerala";
        questions[5][2] = "Tamil Nadu";
        questions[5][3] = "Nagaland";
        questions[5][4] = "Manipur";

        questions[6][0] = "Which is the longest river in India?";
        questions[6][1] = "Ganga";
        questions[6][2] = "Sutlaj";
        questions[6][3] = "Godavari";
        questions[6][4] = "Yamuna";

        questions[7][0] = "Which is the most populated state in India?";
        questions[7][1] = "Maharashtra";
        questions[7][2] = "Uttar Pradesh";
        questions[7][3] = "West Bengal";
        questions[7][4] = "Tamil Nadu";

        questions[8][0] = "Which of the following state has smallest coastline?";
        questions[8][1] = "Goa";
        questions[8][2] = "Kerala";
        questions[8][3] = "Gujarat";
        questions[8][4] = "West Bengal";

        questions[9][0] = "How many languages does the Indian constitution recognise?";
        questions[9][1] = "22";
        questions[9][2] = "35";
        questions[9][3] = "47";
        questions[9][4] = "66";
        
        answers[0][1] = "28";
        answers[1][1] = "8";
        answers[2][1] = "River Dolphin";
        answers[3][1] = "10";
        answers[4][1] = "Surat";
        answers[5][1] = "Tamil Nadu";
        answers[6][1] = "Ganga";
        answers[7][1] = "Uttar Pradesh";
        answers[8][1] = "Goa";
        answers[9][1] = "22";
        
        start(0); //starting from first question
        setVisible(true);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        qno = new javax.swing.JLabel();
        que = new javax.swing.JLabel();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        lifeline = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quz1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        qno.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        qno.setForeground(new java.awt.Color(255, 255, 255));

        que.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        que.setForeground(new java.awt.Color(255, 255, 255));
        que.setText("jLabel2");

        buttonGroup1.add(opt1);
        opt1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        opt1.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(opt2);
        opt2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        opt2.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(opt3);
        opt3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        opt3.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(opt4);
        opt4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        opt4.setForeground(new java.awt.Color(255, 255, 255));

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        lifeline.setText("50-50");
        lifeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lifelineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(que, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(opt1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(opt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(next)
                            .addComponent(submit)
                            .addComponent(lifeline))
                        .addGap(101, 101, 101))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(que)
                    .addComponent(qno))
                .addGap(24, 24, 24)
                .addComponent(opt1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(opt2)
                    .addComponent(next))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opt3)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opt4)
                            .addComponent(lifeline)))
                    .addComponent(submit))
                .addGap(0, 58, Short.MAX_VALUE))
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

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            //for every selected option calculate score
            if (buttonGroup1.getSelection() == null) {
               useranswers[count][0] = "";
               marks(useranswers[count][0],answers[count][1]);
            } else {
                useranswers[count][0] = buttonGroup1.getSelection().getActionCommand();
                marks(useranswers[count][0],answers[count][1]);
            }
            
            if (count == 8) {
                next.setEnabled(false);
                
            }
            
            count++;
            start(count);
    }//GEN-LAST:event_nextActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
            
            ///new score(s, d);
            if (buttonGroup1.getSelection() == null) {
               useranswers[count][0] = "";
               marks(useranswers[count][0],answers[count][1]);
            } else {
                useranswers[count][0] = buttonGroup1.getSelection().getActionCommand();
                marks(useranswers[count][0],answers[count][1]);
            }
            
            new score(name,score).setVisible(true);
            
    }//GEN-LAST:event_submitActionPerformed

    private void lifelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lifelineActionPerformed
        // TODO add your handling code here:
        if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
    }//GEN-LAST:event_lifelineActionPerformed

    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 300, 250);
        } else {
            g.drawString("Times up!!", 400, 250);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (buttonGroup1.getSelection() == null) {
                   useranswers[count][0] = "";
                   marks(useranswers[count][0],answers[count][1]);
                } else {
                    useranswers[count][0] =buttonGroup1.getSelection().getActionCommand();
                    marks(useranswers[count][0],answers[count][1]);
                }
                
                setVisible(false);
                new score(name, score).setVisible(true);
            } else { // next button
                if (buttonGroup1.getSelection() == null) {
                   useranswers[count][0] = "";
                   marks(useranswers[count][0],answers[count][1]);
                } else {
                    useranswers[count][0] = buttonGroup1.getSelection().getActionCommand();
                    marks(useranswers[count][0],answers[count][1]);
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    
    //Calculate marks
    static void marks(String a,String b){
        if(a.equals(b)){
            score+=10;
        }
    }
    
    //Function to start the contest    
    void start(int count){
        qno.setText(""+(count+1)+".");
        que.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        if(count==9){
                submit.setEnabled(true); //enable submit on last question.
            }
        
        buttonGroup1.clearSelection();
    }
    public static void main(String args[]) {
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });*/
        new Quiz("User").setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lifeline;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JLabel qno;
    private javax.swing.JLabel que;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
