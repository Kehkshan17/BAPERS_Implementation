/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import model.database.Controller;
import model.database.I_Bapers;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.regex.Pattern;

/**
 *
 * @author kehkshan and Manpreet
 */
public class GetPayment extends javax.swing.JPanel {

    I_Bapers bapers = new Controller();
    private GUI f;
    private JPanel lastPanel;

    /**
     * Creates new form GetPayment
     */
    public GetPayment(int width, int height, int job_id, double amount, I_Bapers bapers, GUI f) {
        initComponents(width, height, job_id, amount, bapers, f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(int width, int height, int job_id, double amount, I_Bapers bapers, GUI f) {

        this.f = f;
        this.lastPanel = f.getCurrentPanel();
        f.setCurrentPanel(this);
        date_input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        amount_input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cash_payment_button = new javax.swing.JButton();
        card_payment_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sign_out_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(157, 195, 230));
        setPreferredSize(new java.awt.Dimension(800, 500));

        date_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date_input.setText("YYYY-MM-DD");
        date_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                date_input_inputFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 23, 71));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");

        amount_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amount_input.setPreferredSize(new java.awt.Dimension(99, 26));
        amount_input.setEditable(false);
        amount_input.setText(String.valueOf(amount));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 23, 71));
        jLabel2.setText("Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 23, 71));
        jLabel3.setText("Amount");

        cash_payment_button.setBackground(new java.awt.Color(1, 23, 71));
        cash_payment_button.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        cash_payment_button.setForeground(new java.awt.Color(157, 195, 230));
        cash_payment_button.setText("Cash Payment");
        cash_payment_button.setBorderPainted(false);
        cash_payment_button.setFocusPainted(false);
        cash_payment_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cash_payment_buttonMouseClicked(evt, job_id);
            }
        });

        card_payment_button.setBackground(new java.awt.Color(1, 23, 71));
        card_payment_button.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        card_payment_button.setForeground(new java.awt.Color(157, 195, 230));
        card_payment_button.setText("Card Payment");
        card_payment_button.setBorderPainted(false);
        card_payment_button.setFocusPainted(false);
        card_payment_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_payment_buttonMouseClicked(evt, job_id);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 23, 71));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bapers");

        sign_out_button.setBackground(new java.awt.Color(1, 23, 71));
        sign_out_button.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        sign_out_button.setForeground(new java.awt.Color(157, 195, 230));
        sign_out_button.setText("Sign Out");
        sign_out_button.setBorderPainted(false);
        sign_out_button.setFocusPainted(false);

        back_button.setBackground(new java.awt.Color(1, 23, 71));
        back_button.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        back_button.setForeground(new java.awt.Color(157, 195, 230));
        back_button.setText("Back");
        back_button.setBorderPainted(false);
        back_button.setFocusPainted(false);
        back_button.setMaximumSize(new java.awt.Dimension(107, 29));
        back_button.setMinimumSize(new java.awt.Dimension(107, 29));
        back_button.setPreferredSize(new java.awt.Dimension(107, 29));
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(cash_payment_button, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(card_payment_button, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(131, 131, 131)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(date_input)
                                    .addComponent(amount_input, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sign_out_button)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sign_out_button))))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(date_input, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(amount_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cash_payment_button)
                    .addComponent(card_payment_button))
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void date_input_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_completion_deadline_inputFocusGained
        date_input.setText("");
    }

    private void card_payment_buttonMouseClicked(MouseEvent evt, int job_ID){
        Pattern pattern = Pattern.compile("^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$");
        if(!date_input.getText().isEmpty()){
            if(pattern.matcher(date_input.getText()).matches()){
                f.cardPayment(Double.parseDouble(amount_input.getText()), Date.valueOf(date_input.getText()), job_ID);
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(
                        this,
                        "Incorrect date format!",
                        "BAPERS", JOptionPane.ERROR_MESSAGE
                );
            }
        }
        else {
            JOptionPane.showMessageDialog(
                    this,
                    "Please fill out the fields.",
                    "BAPERS", JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void cash_payment_buttonMouseClicked(MouseEvent evt, int job_ID){
        Pattern pattern = Pattern.compile("^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$");
        if(!date_input.getText().isEmpty()){
            if(pattern.matcher(date_input.getText()).matches()){
                int id = bapers.createPayment("Cash", Double.parseDouble(amount_input.getText()), Date.valueOf(date_input.getText()), job_ID);
                f.generateInvoice(id);
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(
                        this,
                        "Incorrect date format!",
                        "BAPERS", JOptionPane.ERROR_MESSAGE
                );
            }
        }
        else{
            JOptionPane.showMessageDialog(
                    this,
                    "Please fill out the fields.",
                    "BAPERS", JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        f.setLastPanel(lastPanel);
        f.getLastPanel().setVisible(true);
        f.remove(f.getCurrentPanel());
        f.setCurrentPanel(lastPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount_input;
    private javax.swing.JButton back_button;
    private javax.swing.JButton card_payment_button;
    private javax.swing.JButton cash_payment_button;
    private javax.swing.JTextField date_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sign_out_button;
    // End of variables declaration//GEN-END:variables
}
