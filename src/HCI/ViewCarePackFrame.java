package HCI;

import Classes.Carepack;
import control.exceptions.NonexistentEntityException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Joynal Abedin 10-Jul-2013
 */
public class ViewCarePackFrame extends javax.swing.JFrame
{

    FileService Load;

    /**
     * Creates new form ViewCarePackFrame
     */
    public ViewCarePackFrame()
    {
        initComponents();
        setTitle(
                "Simple Legal System                     View a client carePack here");
        this.setIconImage(new ImageIcon("legal.gif").getImage());
        // centre the user interface on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2,
                (screenSize.height - getHeight()) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        HeadingLabel = new javax.swing.JLabel();
        BackToMainWindwojButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IdNojTextField1 = new javax.swing.JTextField();
        FindjButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        IdViewTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NamejTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DescriptionjTextField1 = new javax.swing.JTextField();
        SavejButton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeadingLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HeadingLabel.setText("Add more docs to a CarePack here");

        BackToMainWindwojButton.setText("Back To Main Window");
        BackToMainWindwojButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackToMainWindwojButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter CarePack ID");

        FindjButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FindjButton1.setText("Find");
        FindjButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FindjButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("CarePack ID");

        jLabel3.setText("Name");

        jLabel4.setText("Descriptions");

        SavejButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SavejButton1.setText("Save doc");
        SavejButton1.setActionCommand("Save docs");
        SavejButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SavejButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Add or Edit Carepack Docs");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 161, Short.MAX_VALUE)
                .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(215, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdViewTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackToMainWindwojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SavejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescriptionjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IdNojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FindjButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(HeadingLabel)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdNojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindjButton1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IdViewTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(NamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(DescriptionjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SavejButton1)
                .addGap(52, 52, 52)
                .addComponent(BackToMainWindwojButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMainWindwojButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackToMainWindwojButtonActionPerformed
    {//GEN-HEADEREND:event_BackToMainWindwojButtonActionPerformed
        MainWindowFrame frame = new MainWindowFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackToMainWindwojButtonActionPerformed

    private void FindjButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FindjButton1ActionPerformed
    {//GEN-HEADEREND:event_FindjButton1ActionPerformed

        
        
        int id = Integer.parseInt(IdNojTextField1.getText());
        

//        try
//        {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "slSystemPU");
        EntityManager em = emf.createEntityManager();

        Carepack pack = em.find(Carepack.class, id);




        IdViewTextField1.setText(String.valueOf(pack.getCarePackid()));
        NamejTextField1.setText(pack.getName());
        DescriptionjTextField1.setText(pack.getDescription());

        em.close();
        
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
             
    }//GEN-LAST:event_FindjButton1ActionPerformed


    
    private void SavejButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SavejButton1ActionPerformed
    {//GEN-HEADEREND:event_SavejButton1ActionPerformed


            int id = Integer.parseInt(IdNojTextField1.getText());
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                    "slSystemPU");
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();
            Carepack pack;
            pack = em.getReference(Carepack.class, id);

            em.merge(pack);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null,
                    " The new Docs " + NamejTextField1.getText().toUpperCase() + " is saved successfully ");
            em.close();


    }//GEN-LAST:event_SavejButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        AddCareDocFrame frame =new AddCareDocFrame(this, rootPaneCheckingEnabled);
        frame.setModal(rootPaneCheckingEnabled);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ViewCarePackFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ViewCarePackFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ViewCarePackFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ViewCarePackFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ViewCarePackFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMainWindwojButton;
    private javax.swing.JTextField DescriptionjTextField1;
    private javax.swing.JButton FindjButton1;
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JTextField IdNojTextField1;
    private javax.swing.JTextField IdViewTextField1;
    private javax.swing.JTextField NamejTextField1;
    private javax.swing.JButton SavejButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
