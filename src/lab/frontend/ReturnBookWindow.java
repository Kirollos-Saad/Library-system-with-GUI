/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab.frontend;

import java.time.LocalDate;
import java.time.ZoneId;
import lab.backend.LibrarianRole;
import javax.swing.JOptionPane;
import lab.backend.IdNotFoundException;

/**
 *
 * @author User
 */
public class ReturnBookWindow extends javax.swing.JFrame implements Node {

    private Node parent;

    public ReturnBookWindow(Node parent) {
        initComponents();
        this.setTitle("Return Book");
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        studentId = new javax.swing.JTextField();
        bookId = new javax.swing.JTextField();
        returnDate = new com.toedter.calendar.JDateChooser();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Id");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 255, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book Id");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 255, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Return Date");
        jLabel3.setOpaque(true);

        studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdActionPerformed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(0, 0, 0));
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("Return");
        returnButton.setOpaque(true);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentId)
                    .addComponent(bookId)
                    .addComponent(returnDate, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentId, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bookId)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(returnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdActionPerformed

    private boolean isFieldEmpty() {

        //String.valueOf(borrowDate.getDate()).isBlank() --> didnot Work.
        if (bookId.getText().isBlank() || studentId.getText().isBlank() || returnDate.getDate() == null) {
            return true;
        }

        return false;
    }

    private void clear() {
        studentId.setText("");
        bookId.setText("");
        returnDate.setDate(null);
    }

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:

        //first: check if some fields are empty.
        if (isFieldEmpty()) {
            JOptionPane.showMessageDialog(null, "Some fields are empty");
            clear();
            return;
        }

        //check: if no bookID or studentID is found.
        //Record should be deleted from the list of borrowing operations.
        String studentID = studentId.getText();
        String bookID = bookId.getText();

        //this.setVisible(false);
        LibrarianRoleWindow parentFrame = (LibrarianRoleWindow) parent;
        //parentFrame.setVisible(true);

        LocalDate returnDateTime = LocalDate.ofInstant(returnDate.getDate().toInstant(), ZoneId.systemDefault());
        try {
            double result = parentFrame.getLbRole().returnBook(studentID, bookID, returnDateTime);
            if (result == -1) {
                JOptionPane.showMessageDialog(null, "No Book ID with bookid = " + bookID + " is found "
                        + " or No studentID with studentid = " + studentID + " is found.");
                clear();
                return;
            }

            JOptionPane.showMessageDialog(null, "The student with id = " + studentID + " should pay a return fee of "
                    + result + " US dollars for the book with id " + bookID);

            //Need to be before every return.
            clear();
        } catch (IdNotFoundException infe) {//useless try catch

        }

    }//GEN-LAST:event_returnButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

        clear();
        this.setVisible(false);
        LibrarianRoleWindow parentFrame = (LibrarianRoleWindow) parent;
        parentFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton returnButton;
    private com.toedter.calendar.JDateChooser returnDate;
    private javax.swing.JTextField studentId;
    // End of variables declaration//GEN-END:variables

    @Override
    public Node getNodeParent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean hasNodeParent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
