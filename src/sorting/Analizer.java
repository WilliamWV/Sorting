
package sorting;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Analizer:
 * GUI used build to easily sorting algorithm comparisons
 * @author wwvargas
 */
public class Analizer extends javax.swing.JFrame {

    /**
     * Creates new form Analizer
     */
    public Analizer() {
        initComponents();
        this.setTitle("SortAnalizer");
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        chooseAlg = new javax.swing.JComboBox<>();
        Accesses = new java.awt.Label();
        Comp = new java.awt.Label();
        Swaps = new java.awt.Label();
        Rec_Iter = new java.awt.Label();
        TLabel = new java.awt.Label();
        Title = new java.awt.Label();
        AnalizeButton = new javax.swing.JButton();
        StateLabel = new javax.swing.JLabel();
        AccessesLabel = new javax.swing.JLabel();
        CompLabel = new javax.swing.JLabel();
        SwapsLabel = new javax.swing.JLabel();
        RecLabel = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        RandomCheck = new javax.swing.JRadioButton();
        LowVariationCheck = new javax.swing.JRadioButton();
        AscendingCheck = new javax.swing.JRadioButton();
        DescendingCheck = new javax.swing.JRadioButton();
        OrgLabel = new java.awt.Label();
        SizeField = new javax.swing.JTextField();
        SizeLabel = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        chooseAlg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose an algorithm", "Bubblesort", "Countingsort", "Heapsort", "Insertionsort", "Mergesort", "Quicksort", "Randomized-Quicksort", "Optimized-Quicksort", "Radixsort", "SelectionSort", "ShellSort" }));

        Accesses.setAlignment(java.awt.Label.RIGHT);
        Accesses.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Accesses.setText("Accesses");

        Comp.setAlignment(java.awt.Label.RIGHT);
        Comp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Comp.setText("Comparisons");

        Swaps.setAlignment(java.awt.Label.RIGHT);
        Swaps.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Swaps.setText("Swaps");

        Rec_Iter.setAlignment(java.awt.Label.RIGHT);
        Rec_Iter.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Rec_Iter.setText("Recursions/Iterations");

        TLabel.setAlignment(java.awt.Label.RIGHT);
        TLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TLabel.setText("Time");

        Title.setAlignment(java.awt.Label.CENTER);
        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Title.setForeground(new java.awt.Color(51, 0, 153));
        Title.setText("Sort Analizer");

        AnalizeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        AnalizeButton.setForeground(new java.awt.Color(0, 102, 51));
        AnalizeButton.setText("Analize");
        AnalizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizeButtonActionPerformed(evt);
            }
        });

        StateLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        StateLabel.setForeground(new java.awt.Color(0, 102, 0));
        StateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StateLabel.setText("Ready");

        AccessesLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        CompLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        SwapsLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        RecLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        TimeLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        RandomCheck.setText("Random");
        RandomCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomCheckActionPerformed(evt);
            }
        });

        LowVariationCheck.setText("Low variation");
        LowVariationCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowVariationCheckActionPerformed(evt);
            }
        });

        AscendingCheck.setText("Ascending");
        AscendingCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AscendingCheckActionPerformed(evt);
            }
        });

        DescendingCheck.setText("Descending");
        DescendingCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescendingCheckActionPerformed(evt);
            }
        });

        OrgLabel.setAlignment(java.awt.Label.CENTER);
        OrgLabel.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        OrgLabel.setText("Array organization:");

        SizeField.setBackground(new java.awt.Color(250, 250, 250));
        SizeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SizeFieldFocusGained(evt);
            }
        });

        SizeLabel.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        SizeLabel.setText("Array size:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OrgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RandomCheck)
                                .addGap(16, 16, 16))
                            .addComponent(DescendingCheck))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AscendingCheck)
                                .addGap(14, 14, 14))
                            .addComponent(LowVariationCheck, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(AnalizeButton)
                        .addGap(18, 18, 18)
                        .addComponent(chooseAlg, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(StateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Accesses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Comp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rec_Iter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Swaps, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(RecLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SwapsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AccessesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CompLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(79, 79, 79)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(OrgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RandomCheck)
                    .addComponent(AscendingCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescendingCheck)
                    .addComponent(LowVariationCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseAlg)
                    .addComponent(AnalizeButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccessesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accesses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CompLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SwapsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Swaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RecLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rec_Iter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(StateLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private final int RANDOM = 0;
    private final int ASCENDING = 1;
    private final int DESCENDING = 2;
    private final int LOWVARIATION = 3;
    private final int NONEABLE = -1;
    private final int NOCHOOSED = 0;
    private final int BUBBLE = 1;
    private final int COUNTING = 2;
    private final int HEAP = 3;
    private final int INSERTION = 4;
    private final int MERGE = 5;
    private final int QUICK = 6;
    private final int RQUICK = 7;
    private final int OQUICK = 8;
    private final int RADIX = 9;
    private final int SELECTION = 10;
    private final int SHELL = 11;
    
    
    
    private void AnalizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizeButtonActionPerformed
        StateLabel.setText("Ready");
        StateLabel.setForeground(new Color(0, 102, 0));
        int alg = chooseAlg.getSelectedIndex();
        int organization = this.getAble();
        int size = 0;
        long[] stats = new long[4];
        long start, end;
        Util u = new Util();
        this.clearStats();
        try{
            size = Integer.parseInt(SizeField.getText());
            if(size<1||size>10000000)
                throw new NumberFormatException("out of bounds");
        }catch (NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Insert a valid numerical value in range [1, 10000000]", 
                        "Unknown size", JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        int tester[] = new int[size];
        switch(organization){
            case NONEABLE:
                JOptionPane.showMessageDialog(null, "Choose a configuration to the array", 
                        "NO configuration choosed", JOptionPane.ERROR_MESSAGE);
                return;
            case RANDOM:
                tester = u.generateRandomArray(size);
                break;
                
            case ASCENDING:
                tester = u.generateAscendingArray(size);
                break;
                
            case DESCENDING:
                tester = u.generateDescendingArray(size);
                break;
                
            case LOWVARIATION:
                tester = u.generateLowVariantArray(size);
                break;
        }
        /**detecção do algoritmo*/
        switch(alg){
            case NOCHOOSED:
                
                //no chooses
                JOptionPane.showMessageDialog(null, "Choose an algorithm to analize", 
                        "NO algorithm choosed", JOptionPane.ERROR_MESSAGE);
                return;
            case BUBBLE:
                BubbleSort bs = new BubbleSort(tester);
                start = System.currentTimeMillis();
                bs.Sort();
                end = System.currentTimeMillis();
                this.setStats(end-start, bs);
                
                break;
            case COUNTING:
                
                CountingSort cs = new CountingSort(tester);
                start = System.currentTimeMillis();
                cs.Sort();
                end = System.currentTimeMillis();
                this.setStats(end-start, cs);
                
                break;
            case HEAP:
                HeapSort hs = new HeapSort(tester);
                start = System.currentTimeMillis();
                hs.Sort();
                end = System.currentTimeMillis();
                this.setStats(end-start, hs);
                
                break;
            case INSERTION:
                InsertionSort is = new InsertionSort(tester);
                start = System.currentTimeMillis();
                is.Sort();
                end = System.currentTimeMillis();
                this.setStats(end-start, is);
                
                break;
            case MERGE:
                MergeSort ms = new MergeSort(tester);
                start = System.currentTimeMillis();
                ms.Sort();
                end = System.currentTimeMillis();
                this.setStats(end-start, ms);
                
                break;
            case QUICK:
                if((organization == ASCENDING||organization == DESCENDING) && size>10000){
                    JOptionPane.showMessageDialog(null, "Quicksort have it worst case when the array is sorte. With more then 10000 elements it may cause errors", 
                        "QuickSort error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                QuickSort qs = new QuickSort(tester);
                start = System.currentTimeMillis();
                qs.Sort();
                end = System.currentTimeMillis();
                this.setStats(end-start, qs);
                
                break;
            case RQUICK:
                QuickSort qsr = new QuickSort(tester);
                start = System.currentTimeMillis();
                qsr.QuickSort_R();
                end = System.currentTimeMillis();
                this.setStats(end-start, qsr);
                
                break;
            case OQUICK:
                QuickSort qso = new QuickSort(tester);
                start = System.currentTimeMillis();
                qso.O_QuickSort();
                end = System.currentTimeMillis();
                this.setStats(end-start, qso);
                
                break;
            case RADIX:
                RadixSort rs = new RadixSort(tester);
                start = System.currentTimeMillis();
                rs.Sort();
                end = System.currentTimeMillis();
                this.setStats(end-start, rs);
                
                break;
            case SELECTION:
                SelectionSort ses = new SelectionSort(tester);
                start = System.currentTimeMillis();
                ses.Sort();
                end = System.currentTimeMillis();
                this.setStats(end-start, ses);
                
                //bubble
                break;
            case SHELL:
                ShellSort ss = new ShellSort(tester);
                start = System.currentTimeMillis();
                ss.Sort();                
                end = System.currentTimeMillis();
                this.setStats(end-start, ss);
                //bubble
                break;
        }
        
        if(u.isSorted(tester)){
            StateLabel.setText("Success!!");
            StateLabel.setForeground(new Color(0, 102, 0));
        }
        else{
            StateLabel.setText("ERROR!! Sorting Failed - Fix it");
            StateLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_AnalizeButtonActionPerformed
    private void clearStats(){
        AccessesLabel.setText("");
        CompLabel.setText("");
        SwapsLabel.setText("");
        RecLabel.setText("");
        TimeLabel.setText("");
           
    }
    
    private void setStats(long time, Sorter s){
        long[] stats = s.getStats();
        //stats[0] = accesses
        AccessesLabel.setText(Long.toString(stats[0]));
        //stats[1] = comparisons
        CompLabel.setText(Long.toString(stats[1]));
        //stats[2] = swaps
        SwapsLabel.setText(Long.toString(stats[2]));
        //stats[3] = recursions/iterations
        RecLabel.setText(Long.toString(stats[3]));
        
        TimeLabel.setText(Long.toString(time)+" ms");
        
    }
    private void RandomCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomCheckActionPerformed
        eraseConfiguration(1);
        //random
    }//GEN-LAST:event_RandomCheckActionPerformed

    private void AscendingCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AscendingCheckActionPerformed
        //ascending
        eraseConfiguration(3);
    }//GEN-LAST:event_AscendingCheckActionPerformed

    private void DescendingCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescendingCheckActionPerformed
        // descending
        eraseConfiguration(4);
    }//GEN-LAST:event_DescendingCheckActionPerformed

    private void LowVariationCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LowVariationCheckActionPerformed
        eraseConfiguration(2);
        //low variation
    }//GEN-LAST:event_LowVariationCheckActionPerformed

    private void SizeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SizeFieldFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SizeFieldFocusGained
    
    private void eraseConfiguration(int except){
        if(except!=1)
            RandomCheck.setSelected(false);
        if(except!=2)
            LowVariationCheck.setSelected(false);
        if(except!=3)
            AscendingCheck.setSelected(false);
        if(except!=4)
            DescendingCheck.setSelected(false);
        
    }
    
    private int getAble(){
        if(RandomCheck.isSelected()){
            return RANDOM;
            
        }
        if(LowVariationCheck.isSelected()){
            return LOWVARIATION;
        }
        if(AscendingCheck.isSelected()){
            return ASCENDING;
        }
        if(DescendingCheck.isSelected()){
            return DESCENDING;
        }
        return NONEABLE;
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
            java.util.logging.Logger.getLogger(Analizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Accesses;
    private javax.swing.JLabel AccessesLabel;
    private javax.swing.JButton AnalizeButton;
    private javax.swing.JRadioButton AscendingCheck;
    private java.awt.Label Comp;
    private javax.swing.JLabel CompLabel;
    private javax.swing.JRadioButton DescendingCheck;
    private javax.swing.JRadioButton LowVariationCheck;
    private java.awt.Label OrgLabel;
    private javax.swing.JRadioButton RandomCheck;
    private javax.swing.JLabel RecLabel;
    private java.awt.Label Rec_Iter;
    private javax.swing.JTextField SizeField;
    private java.awt.Label SizeLabel;
    private javax.swing.JLabel StateLabel;
    private java.awt.Label Swaps;
    private javax.swing.JLabel SwapsLabel;
    private java.awt.Label TLabel;
    private javax.swing.JLabel TimeLabel;
    private java.awt.Label Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JComboBox<String> chooseAlg;
    // End of variables declaration//GEN-END:variables
}
