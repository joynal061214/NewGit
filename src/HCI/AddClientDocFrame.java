/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HCI;

import Classes.Docs;
import control.exceptions.NonexistentEntityException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Vector;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * @author Joynal Abedin  20-Jun-2013
 */
public class AddClientDocFrame extends javax.swing.JDialog {

    List list;

    int nMode = 1; //Save Mode
    int nClientID=0;
    int nDocID=0;
    Docs d;
    
    /**
     * Creates new form AddClientDocFrame
     */
    public AddClientDocFrame(java.awt.Frame parent, boolean modal) {
      
        super(parent, modal);
        setTitle("AddClientDocFrame");
        initComponents();
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

        jLabel9 = new javax.swing.JLabel();
        txtFileLocation = new javax.swing.JTextField();
        txtMime = new javax.swing.JTextField();
        OpenFilejButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        SavejButton = new javax.swing.JButton();
        txtAbout = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ClientIDjTextField = new javax.swing.JTextField();
        FNameLebel = new javax.swing.JLabel();
        ClearFieldsjButton = new javax.swing.JButton();
        queryButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EditjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFileName = new javax.swing.JTextField();
        NewjButton = new javax.swing.JButton();
        EditOpenFilejButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setText("Document Location");

        txtFileLocation.setEditable(false);
        txtFileLocation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtFileLocationActionPerformed(evt);
            }
        });

        txtMime.setEditable(false);

        OpenFilejButton1.setText("LocateFile");
        OpenFilejButton1.setActionCommand("");
        OpenFilejButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                OpenFilejButton1ActionPerformed(evt);
            }
        });

        jLabel21.setText("Mime Type");
        jLabel21.setToolTipText("");

        SavejButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SavejButton.setText("Save");
        SavejButton.setEnabled(false);
        SavejButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SavejButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("About");

        FNameLebel.setText("Client ID:");

        ClearFieldsjButton.setText("Clear fields");
        ClearFieldsjButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ClearFieldsjButtonActionPerformed(evt);
            }
        });

        queryButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        queryButton.setText("Query");
        queryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                queryButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(jTable1);

        EditjButton1.setText("Edit");
        EditjButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("File Name:");

        NewjButton.setText("New");
        NewjButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewjButtonActionPerformed(evt);
            }
        });

        EditOpenFilejButton1.setText("OpenFile");
        EditOpenFilejButton1.setActionCommand("");
        EditOpenFilejButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditOpenFilejButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FNameLebel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClientIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                                .addComponent(ClearFieldsjButton)
                                .addGap(32, 32, 32)
                                .addComponent(queryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SavejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFileLocation, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAbout, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtMime)
                                            .addComponent(txtFileName))))
                                .addGap(53, 53, 53)
                                .addComponent(OpenFilejButton1)))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditOpenFilejButton1)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FNameLebel)
                    .addComponent(ClearFieldsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(NewjButton)
                        .addGap(18, 18, 18)
                        .addComponent(EditjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(EditOpenFilejButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFileLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenFilejButton1)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(SavejButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFileLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileLocationActionPerformed

    private void OpenFilejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFilejButton1ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        try {
            txtFileLocation.setText(chooser.getSelectedFile().toString());
            txtMime.setText(txtFileLocation.getText().substring(txtFileLocation.getText().lastIndexOf('.')+1));
            txtFileName.setText(txtFileLocation.getText().substring(txtFileLocation.getText().lastIndexOf('\\')+1));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_OpenFilejButton1ActionPerformed

    private void SavejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavejButtonActionPerformed

        
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("slSystemPU");
         EntityManager em = emf.createEntityManager();
        
         em.getTransaction().begin();
        
        Docs clientdoc = new Docs();
        
        if(nMode==1)
            clientdoc = new Docs();
        else
            clientdoc=em.find(Docs.class, nDocID);
            

        clientdoc.setAbout(txtAbout.getText().trim());
   
        FileService load1 = new FileService();

        try
        {
            File saveFile1 = new File(txtFileLocation.getText());

            if (saveFile1.isFile())
            {
                clientdoc.setDoc(load1.readImageOldWay(saveFile1));
                clientdoc.setMime(txtMime.getText());
                clientdoc.setFileName(txtFileName.getText().trim());
            }

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        if(nMode==1)
        {
        clientdoc.setClientID(nClientID);
        Query strQry = em.createNativeQuery("SELECT Max(DocID) FROM docs");  
        nDocID = (int)strQry.getSingleResult();
        clientdoc.setDocID(nDocID+1);
        em.persist(clientdoc);              
         em.getTransaction().commit();     
         JOptionPane.showMessageDialog(null, "Client doc added successfully ");
        }
        else
        {
                    
         em.getTransaction().commit();

         JOptionPane.showMessageDialog(null, "Client doc updated successfully ");
        }
         
         SavejButton.setEnabled(false);
         txtFileLocation.setText("");
         txtMime.setText("");
         txtFileName.setText("");
         
         SearchClientDocs();
        
         
    }//GEN-LAST:event_SavejButtonActionPerformed

    private void ClearFieldsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearFieldsjButtonActionPerformed
        // TODO add your handling code here:
        ClientIDjTextField.setText("");
        //   PostcodejTextField.setText("");

        jLabel9.setText("");
    }//GEN-LAST:event_ClearFieldsjButtonActionPerformed

    private void queryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButtonActionPerformed
        // TODO add your handling code here:

        SearchClientDocs();
    }//GEN-LAST:event_queryButtonActionPerformed
    
    
   void SearchClientDocs()
   {
       d = new Docs();
         nClientID=Integer.parseInt(ClientIDjTextField.getText());
        String str = "";

        if (ClientIDjTextField.getText() != str)
        {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                    "slSystemPU");
            EntityManager em = emf.createEntityManager();


list = em.createQuery("SELECT d FROM Docs d WHERE d.clientID = " + ClientIDjTextField.getText()).getResultList();

            for (Object o : list)
            {
               displayTable(list);
            }
            
            if (nClientID != d.getClientID()) {
                JOptionPane.showMessageDialog(null,"No documents found with this Client ID ");
            }

            em.close();
        }        
     
   }
    
    
    private void EditjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditjButton1ActionPerformed
        // TODO add your handling code here:
        nMode=2;
        nDocID=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        
        if(jTable1.getRowCount()>0)
        {        
              
        
        try
        {
            findbyId(nDocID);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
                
        }
    }//GEN-LAST:event_EditjButton1ActionPerformed

    private void NewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewjButtonActionPerformed
        // TODO add your handling code here:
        nMode=1; //save mode
        SavejButton.setEnabled(true);
    }//GEN-LAST:event_NewjButtonActionPerformed

    private void EditOpenFilejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditOpenFilejButton1ActionPerformed
           
        d = new Docs();
       nDocID=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()); 
       //  nDocID=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),d.getDocID()).toString());
  
 //   String  nClientID= ClientIDjTextField.getText();
    
        if (nDocID < 1 ); 
            {
                JOptionPane.showMessageDialog(this,
                        "This is not a valid selection ! \nNo client found");
            }
         
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "slSystemPU");
        EntityManager em = emf.createEntityManager();

        Docs doc = em.getReference(Docs.class, nDocID);
        
        JFileChooser fr = new JFileChooser();
        FileSystemView fw = fr.getFileSystemView();

        String FilePathWithName=fw.getDefaultDirectory() + "\\" + doc.getFileName() + "." + doc.getMime();

        File outfile = null;
        outfile = new File(FilePathWithName);

        try
        {
            writeFile(outfile, doc.getDoc());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            Runtime rt = Runtime.getRuntime();
            rt.exec("cmd /c start " + ResolveWhiteSpace(FilePathWithName));

        } catch (Exception e) {
            System.out.println("Error opening file: " + e.getMessage());
            e.printStackTrace();
        }
        
    
        
        em.close();
    

    }//GEN-LAST:event_EditOpenFilejButton1ActionPerformed

    public String ResolveWhiteSpace(String FileName) {

        String FileName2 = FileName;
        for (int x = 0; x < FileName.length(); x++) {
            if (FileName.charAt(x) == ' ') {
                FileName2 = FileName.substring(0, x) + "\"" + FileName.substring(x, FileName.length()) + "\"";
                break;
            }
        }
        return FileName2;
    }
    
    public void writeFile(File file, byte[] data) throws IOException
 {
   OutputStream fo = new FileOutputStream(file);
   fo.write(data);
   fo.flush();
   fo.close();
 }    
   

    
private void findbyId(Integer id) throws NonexistentEntityException
    {
//     int idNo = Integer.parseInt(NojTextField.getText());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "slSystemPU");
        EntityManager em = emf.createEntityManager();

        Docs doc;
        try
        {
            doc = em.getReference(Docs.class, id);


            if (id < 1)
            {
                JOptionPane.showMessageDialog(this,
                        "This is not a valid number ! \nNo client found");
            }
       }
        catch (EntityNotFoundException enfe)
        {
            throw new NonexistentEntityException(
                    "The client with id " + id + " no longer exists.",
                    enfe);
        }

        txtAbout.setText(doc.getAbout());
        txtMime.setText(doc.getMime());
        txtFileName.setText(doc.getFileName());


        em.close();
        SavejButton.setEnabled(true);
    }    
    
    
    
    
    public void displayTable(List resultList)
    {

        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Client ID");
        tableHeaders.add("Doc ID");
        tableHeaders.add("Doc Name");
        tableHeaders.add("Doc data");
        tableHeaders.add("Mime type");

        for (Object o : resultList)
        {
            Docs doc = (Docs) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(doc.getClientID());
            oneRow.add(doc.getDocID());
            oneRow.add(doc.getAbout());
            oneRow.add(doc.getDoc());
            oneRow.add(doc.getMime());
            //oneRow.add(doc.getFileName());
            
            tableData.add(oneRow);
        }
        TableModel model = new DefaultTableModel(tableData, tableHeaders);

        jTable1.setModel(model);
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
            java.util.logging.Logger.getLogger(AddClientDocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClientDocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClientDocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClientDocFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddClientDocFrame dialog = new AddClientDocFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearFieldsjButton;
    private javax.swing.JTextField ClientIDjTextField;
    private javax.swing.JButton EditOpenFilejButton1;
    private javax.swing.JButton EditjButton1;
    private javax.swing.JLabel FNameLebel;
    private javax.swing.JButton NewjButton;
    private javax.swing.JButton OpenFilejButton1;
    private javax.swing.JButton SavejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton queryButton;
    private javax.swing.JTextField txtAbout;
    private javax.swing.JTextField txtFileLocation;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextField txtMime;
    // End of variables declaration//GEN-END:variables
}
