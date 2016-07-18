package HCI;

import javax.swing.JOptionPane;
import Classes.Client;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.DefaultComboBoxModel;
import java.util.List;
import control.ClientJpaController;
import java.io.File;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

/**
 * @author Joynal Abedin 22-May-2013
 */
public class AddClientFrame extends javax.swing.JFrame
{

    List list;
    Client clientObj;
    ClientJpaController control;
    //  ClientfolderJpaController folderControl;

    /**
     * Creates new form addClient
     */
    public AddClientFrame()
    {
        setTitle(
                "Simple Legal Practice System                                                     Add a new client here");

        initComponents();
        // SaveButton.setEnabled(false);
        // centre the user interface on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2,
                (screenSize.height - getHeight()) / 2);

        String[] comboName =
        {
            "Please select one",
            "Conveyancing", "Civil", "Criminal", "Family", "Immigration", "Litigation"
        };
        DefaultComboBoxModel model = new DefaultComboBoxModel(comboName);
        CarePackComboBox.setModel(model);
    }
    /*
     -----------------------------------------------------------------
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        FirstNamejLabel = new javax.swing.JLabel();
        LastNamejLabel = new javax.swing.JLabel();
        StreetjLabel = new javax.swing.JLabel();
        TownjLabel = new javax.swing.JLabel();
        CityjLabel = new javax.swing.JLabel();
        PostCodejLabel = new javax.swing.JLabel();
        MobilejLabel = new javax.swing.JLabel();
        HomeTeljLabel = new javax.swing.JLabel();
        EmailjLabel = new javax.swing.JLabel();
        FirstNamejTextField = new javax.swing.JTextField();
        LastNamejTextField = new javax.swing.JTextField();
        StreetjTextField = new javax.swing.JTextField();
        TownjTextField = new javax.swing.JTextField();
        CityjTextField = new javax.swing.JTextField();
        PostCodejTextField = new javax.swing.JTextField();
        MobilejTextField = new javax.swing.JTextField();
        HomeTeljTextField = new javax.swing.JTextField();
        EmailjTextField = new javax.swing.JTextField();
        AttachCarePackLabel = new javax.swing.JLabel();
        CarePackComboBox = new javax.swing.JComboBox();
        ClientFolderjLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FolderNamejTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        categoryInfoLabel = new javax.swing.JLabel();
        SavejButton = new javax.swing.JButton();
        CanceljButton = new javax.swing.JButton();
        CategoryResultjLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FirstNamejLabel.setText("First Name");

        LastNamejLabel.setText("Last Name");

        StreetjLabel.setText("Street");

        TownjLabel.setText("Town");

        CityjLabel.setText("City");

        PostCodejLabel.setText("Post Code");

        MobilejLabel.setText("Mobile");

        HomeTeljLabel.setText("Home Tel");

        EmailjLabel.setText("Email");

        FirstNamejTextField.setToolTipText("Enter a first name");
        FirstNamejTextField.setName("FirstName"); // NOI18N
        FirstNamejTextField.setPreferredSize(new java.awt.Dimension(100, 20));

        AttachCarePackLabel.setText("Attach a CarePack");

        CarePackComboBox.setMaximumRowCount(6);
        CarePackComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CarePackComboBoxActionPerformed(evt);
            }
        });

        ClientFolderjLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ClientFolderjLabel.setText("Please do a search first to check the client existence");

        jLabel1.setText("Enter folder name");

        FolderNamejTextField1.setToolTipText("Enter a folder name");

        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        categoryInfoLabel.setText("Please note: This client will belong to: ");

        SavejButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SavejButton.setText("Save");
        SavejButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SavejButtonActionPerformed(evt);
            }
        });

        CanceljButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CanceljButton.setText("Cancel");
        CanceljButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CanceljButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Add Docs");
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
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNamejLabel)
                                    .addComponent(StreetjLabel)
                                    .addComponent(CityjLabel)
                                    .addComponent(EmailjLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StreetjTextField)
                                    .addComponent(FirstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CityjTextField)
                                    .addComponent(EmailjTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MobilejLabel)
                                .addGap(18, 18, 18)
                                .addComponent(MobilejTextField)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LastNamejLabel)
                                            .addComponent(TownjLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TownjTextField)
                                            .addComponent(LastNamejTextField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PostCodejLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(PostCodejTextField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(HomeTeljLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(HomeTeljTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FolderNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(467, 467, 467)
                                .addComponent(CanceljButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SavejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AttachCarePackLabel)
                                .addGap(18, 18, 18)
                                .addComponent(CarePackComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(categoryInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CategoryResultjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 77, Short.MAX_VALUE))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(ClientFolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CityjLabel, EmailjLabel, FirstNamejLabel, HomeTeljLabel, LastNamejLabel, MobilejLabel, PostCodejLabel, StreetjLabel, TownjLabel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CityjTextField, EmailjTextField, FirstNamejTextField, FolderNamejTextField1, HomeTeljTextField, LastNamejTextField, MobilejTextField, PostCodejTextField, StreetjTextField, TownjTextField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CanceljButton, SavejButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ClientFolderjLabel)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNamejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TownjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TownjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PostCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PostCodejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HomeTeljLabel)
                                .addComponent(MobilejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HomeTeljTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNamejLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FirstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(StreetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StreetjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CityjLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MobilejLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailjLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FolderNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CarePackComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AttachCarePackLabel))
                        .addGap(31, 31, 31)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CategoryResultjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SavejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CanceljButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoryInfoLabel)
                        .addGap(63, 63, 63)))
                .addGap(156, 156, 156))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CityjLabel, EmailjLabel, FirstNamejLabel, HomeTeljLabel, LastNamejLabel, MobilejLabel, PostCodejLabel, StreetjLabel, TownjLabel, jLabel1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CityjTextField, EmailjTextField, FirstNamejTextField, FolderNamejTextField1, HomeTeljTextField, LastNamejTextField, MobilejTextField, PostCodejTextField, StreetjTextField, TownjTextField});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CanceljButton, SavejButton});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CategoryResultjLabel, categoryInfoLabel});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SavejButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SavejButtonActionPerformed
    {//GEN-HEADEREND:event_SavejButtonActionPerformed
        /* 16       

         // TODO add your handling code here:
         //     SaveButton.setEnabled(false);         
         int confirm = JOptionPane.showConfirmDialog(null,
         "Do you want to save this client: "
         + FirstNamejTextField.getText().toUpperCase() + "  ",
         "CONFIRMATION", JOptionPane.YES_NO_OPTION);
         if (confirm == JOptionPane.YES_OPTION)
         {

         EntityManagerFactory emf = Persistence.createEntityManagerFactory(
         "slSystemPU");
         EntityManager em = emf.createEntityManager();
        
         em.getTransaction().begin();
            
         /*
         Creating a new folder with a given name
         */
        /*16           try{
         Clientfolder createFolder = new Clientfolder( FolderNamejTextField1.getText());
               
         em.persist(createFolder);
         //  System.out.println(createFolder.getFolderId());
          
          
         //       list = em.createQuery("SELECT c FROM ClientFolder c WHERE c.folderName LIKE :folder_Name")
         //     .setParameter("folder_name", FolderNamejTextField1.getText()).getResultList();
         //            System.out.println( createFolder.getFolderId());
         /*16        
                  
         }catch(Exception e){
         e.printStackTrace();
         }
            
         //            list = em.createQuery("SELECT c FROM Clientfolder c WHERE c.folderName = :folderName")
         //            .setParameter("folder_name", FolderNamejTextField1.getText()).getResultList();
         //            for(Object c: list){
         //                Clientfolder findF = (Clientfolder) c;
         //              System.out.println( findF.getFolderName()+findF.getFolderId());
         //            }

         clientObj = new Client(FirstNamejTextField.getText().trim(),
         LastNamejTextField.getText().trim(), StreetjTextField.getText().trim(),
         TownjTextField.getText().trim(), CityjTextField.getText().trim(),
         PostCodejTextField.getText().trim(), MobilejTextField.getText().trim(), HomeTeljTextField.getText().trim(),
         EmailjTextField.getText().trim(),null, null);

                

         /*
         Referencing a carePack ID
         */
        /*
         Carepack carePackCarePackid = clientObj.getCarePackCarePackid();
         if (carePackCarePackid != null && carePackCarePackid.getName().equalsIgnoreCase(
         jComboBox.getSelectedItem().toString()))
         {
         carePackCarePackid = em.getReference(
         carePackCarePackid.getClass(),
         carePackCarePackid.getCarePackid());
         clientObj.setCarePackCarePackid(carePackCarePackid);
         }
         /*
         /*
         Add this client to a category
         */
        /*
         Category createCategory = new Category(0,
         jComboBox.getSelectedItem().toString());
         em.persist(createCategory);
         clientObj.setCategory(createCategory);
         */

        /* 16           
         em.persist(clientObj);
                
         em.getTransaction().commit();

         JOptionPane.showMessageDialog(null,
         " The new client: " + FirstNamejTextField.getText().toUpperCase() + " is saved successfully ");

         em.close();
         MainWindowFrame frame = new MainWindowFrame();
         frame.setVisible(true);
         this.setVisible(false);

         }
         if (confirm == JOptionPane.NO_OPTION)
         {
         MainWindowFrame frame = new MainWindowFrame();
         frame.setVisible(true);
         this.setVisible(false);
         }
         16    */
        add();
        SavejButton.enable(false);
    }//GEN-LAST:event_SavejButtonActionPerformed

    private void add()
    {

        clientObj = new Client();
        String firstName = FirstNamejTextField.getText().trim();
        if (firstName.equals(""))
        {
            JOptionPane.showMessageDialog(this, "First Name required");
            FirstNamejTextField.requestFocus();
            return;
        }
        String lstName = LastNamejTextField.getText().trim();
        if (lstName.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Last Name required");
            LastNamejTextField.requestFocus();
            return;
        }

        clientObj.setFirstName(firstName);
        clientObj.setLastName(lstName);
        clientObj.setStreet(StreetjTextField.getText().trim().toUpperCase());
        clientObj.setTown(TownjTextField.getText().trim().toUpperCase());
        clientObj.setCity(CityjTextField.getText().trim().toUpperCase());
        clientObj.setPostCode(PostCodejTextField.getText().trim().toUpperCase());
        clientObj.setMobile(MobilejTextField.getText().trim());
        clientObj.setHomeTel(HomeTeljTextField.getText().trim());
        clientObj.setEmail(EmailjTextField.getText().trim());
        String name = FolderNamejTextField1.getText().trim();
        if (name.equals(""))
        {
            JOptionPane.showMessageDialog(null,
                    "Folder name is empty!! \nYou must enter a folder name",
                    "\nInput Error", JOptionPane.ERROR_MESSAGE);
            FolderNamejTextField1.requestFocus();
            return;
        }



        ctrl.ClientController.getClientJpaController().create(clientObj);




        JOptionPane.showMessageDialog(null,
                " The new client: " + clientObj.getFirstName().toUpperCase() + " is saved successfully ");

          MainWindowFrame frame = new MainWindowFrame();
          frame.setVisible(true);
          dispose();
        
    }

    private void CanceljButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CanceljButtonActionPerformed
    {//GEN-HEADEREND:event_CanceljButtonActionPerformed
        MainWindowFrame frame = new MainWindowFrame();
        frame.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_CanceljButtonActionPerformed

    private void CarePackComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CarePackComboBoxActionPerformed
    {//GEN-HEADEREND:event_CarePackComboBoxActionPerformed
        // TODO add your handling code here:
        categorySelection();
    }//GEN-LAST:event_CarePackComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        AddClientDocFrame frame = new AddClientDocFrame(this,
                rootPaneCheckingEnabled);
        frame.setModal(rootPaneCheckingEnabled);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categorySelection()
    {
        CategoryResultjLabel.setText(
                "' " + CarePackComboBox.getSelectedItem() + " '" + "  category");
        //  System.out.println(CarePackComboBox.getSelectedItem());
    }

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
            java.util.logging.Logger.getLogger(AddClientFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AddClientFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AddClientFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AddClientFrame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AddClientFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AttachCarePackLabel;
    private javax.swing.JButton CanceljButton;
    private javax.swing.JComboBox CarePackComboBox;
    private javax.swing.JLabel CategoryResultjLabel;
    private javax.swing.JLabel CityjLabel;
    private javax.swing.JTextField CityjTextField;
    private javax.swing.JLabel ClientFolderjLabel;
    private javax.swing.JLabel EmailjLabel;
    private javax.swing.JTextField EmailjTextField;
    private javax.swing.JLabel FirstNamejLabel;
    private javax.swing.JTextField FirstNamejTextField;
    private javax.swing.JTextField FolderNamejTextField1;
    private javax.swing.JLabel HomeTeljLabel;
    private javax.swing.JTextField HomeTeljTextField;
    private javax.swing.JLabel LastNamejLabel;
    private javax.swing.JTextField LastNamejTextField;
    private javax.swing.JLabel MobilejLabel;
    private javax.swing.JTextField MobilejTextField;
    private javax.swing.JLabel PostCodejLabel;
    private javax.swing.JTextField PostCodejTextField;
    private javax.swing.JButton SavejButton;
    private javax.swing.JLabel StreetjLabel;
    private javax.swing.JTextField StreetjTextField;
    private javax.swing.JLabel TownjLabel;
    private javax.swing.JTextField TownjTextField;
    private javax.swing.JLabel categoryInfoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
