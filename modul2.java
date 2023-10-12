
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adinda puspitasari
 */
public class modul2 extends javax.swing.JFrame {

    /**
     * Creates new form modul2
     */
    public modul2() {
        initComponents();
        eTarif.setText("10000");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        labelJumlah = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelTarif = new javax.swing.JLabel();
        labelBruto = new javax.swing.JLabel();
        labelBersih = new javax.swing.JLabel();
        bBruto = new javax.swing.JButton();
        bBersih = new javax.swing.JButton();
        eJumlah = new javax.swing.JTextField();
        eTarif = new javax.swing.JTextField();
        eBersih = new javax.swing.JTextField();
        eBruto = new javax.swing.JTextField();
        bKeluar = new javax.swing.JButton();
        eReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelJumlah.setText("Jumlah Jam Kerja 1 Minggu");
        getContentPane().add(labelJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("GAJI KARYAWAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        labelTarif.setText("Tarif Perjam");
        getContentPane().add(labelTarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        labelBruto.setText("Gaji Bruto");
        getContentPane().add(labelBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        labelBersih.setText("Gaji Bersih");
        getContentPane().add(labelBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        bBruto.setText("Hitung Gaji Bruto");
        bBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBrutoActionPerformed(evt);
            }
        });
        getContentPane().add(bBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        bBersih.setText("Hitung Gaji Bersih");
        bBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBersihActionPerformed(evt);
            }
        });
        getContentPane().add(bBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        getContentPane().add(eJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, -1));
        getContentPane().add(eTarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 90, -1));

        eBersih.setText(" ");
        getContentPane().add(eBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 90, -1));
        getContentPane().add(eBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 90, -1));

        bKeluar.setText("KELUAR");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(bKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        eReset.setText("RESET");
        eReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eResetActionPerformed(evt);
            }
        });
        getContentPane().add(eReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gojo (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBrutoActionPerformed

     double gajiBruto;

// Validasi input untuk jamKerja
String jamKerjaStr = eJumlah.getText();
if (jamKerjaStr.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Jam kerja harus diisi.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
} else {
    double jamKerja = Double.parseDouble(jamKerjaStr);

    if (jamKerja < 0) {
        // Tampilkan pesan kesalahan jika angka negatif
        JOptionPane.showMessageDialog(this, "Jam kerja harus bilangan positif.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
    } else {
        String tarifStr = eTarif.getText();
        if (tarifStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tarif harus diisi.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else {
            double tarif = Double.parseDouble(tarifStr);

            if (jamKerja <= 40) {
                gajiBruto = jamKerja * tarif;
            } else {
                double jamLembur = jamKerja - 40;
                gajiBruto = (40 * tarif) + (jamLembur * (1.5 * tarif));
            }

            // Set nilai gaji bruto ke komponen teks eGajiBruto
            eBruto.setText(String.valueOf(gajiBruto));
        }
    }
}
      
    }//GEN-LAST:event_bBrutoActionPerformed

    private void bBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBersihActionPerformed
        double gajiBruto = Double.parseDouble(eBruto.getText());

        // Hitung potongan pajak (10% dari gaji bruto)
        double potonganPajak = 0.10 * gajiBruto;

        // Hitung gaji bersih (gaji bruto - potongan pajak)
        double gajiBersih = gajiBruto - potonganPajak;

        // Set nilai gaji bersih ke komponen teks eGajibersih
        eBersih.setText(String.valueOf(gajiBersih));


    }//GEN-LAST:event_bBersihActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        JOptionPane.showMessageDialog(null, "THANK YOU");
        System.exit(0);
    }//GEN-LAST:event_bKeluarActionPerformed

    private void eResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eResetActionPerformed
        eJumlah.setText("");
        eTarif.setText("");
        eBruto.setText("");
        eBersih.setText("");
    }//GEN-LAST:event_eResetActionPerformed

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
            java.util.logging.Logger.getLogger(modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBersih;
    private javax.swing.JButton bBruto;
    private javax.swing.JButton bKeluar;
    private javax.swing.JTextField eBersih;
    private javax.swing.JTextField eBruto;
    private javax.swing.JTextField eJumlah;
    private javax.swing.JButton eReset;
    private javax.swing.JTextField eTarif;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelBersih;
    private javax.swing.JLabel labelBruto;
    private javax.swing.JLabel labelJumlah;
    private javax.swing.JLabel labelTarif;
    // End of variables declaration//GEN-END:variables
}
