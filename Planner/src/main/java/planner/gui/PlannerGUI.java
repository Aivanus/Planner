/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planner.gui;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import planner.logic.CreateTask;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Renderer;
import javax.swing.table.TableCellEditor;
import planner.domain.Day;
import planner.domain.Task;

public class PlannerGUI extends javax.swing.JFrame {

    private List<Task> tasks;
    private Color currentColor;
    private CreateTask ct;

    /**
     * Creates new form PlannerGUI
     */
    public PlannerGUI() {
        initComponents();
        this.tasks = new ArrayList<>();
        this.ct = new CreateTask(nameTextField, timeStartTextField, TimeEndTextField, dayComboBox, currentColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        dayLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox();
        timeStartTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TimeEndTextField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        colorChooser = new javax.swing.JButton();
        chosenColor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        schedule = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planner");
        setPreferredSize(new java.awt.Dimension(1400, 600));
        setResizable(false);

        nameLabel.setLabelFor(nameTextField);
        nameLabel.setText("Name");

        nameTextField.setText("New Task");

        dayLabel.setLabelFor(dayComboBox);
        dayLabel.setText("Day");

        timeLabel.setLabelFor(timeStartTextField);
        timeLabel.setText("Time");

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel(Day.values()));
        dayComboBox.setToolTipText("");

        timeStartTextField.setText("00");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");

        TimeEndTextField.setText("00");

        createButton.setText("OK");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jButton1.setText("For testing purposes only");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        colorChooser.setText("Color");
        colorChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorChooserActionPerformed(evt);
            }
        });

        chosenColor.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dayComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(timeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeStartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimeEndTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chosenColor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dayLabel, nameLabel, timeLabel});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TimeEndTextField, timeStartTextField});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chosenColor, colorChooser});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLabel)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(timeStartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TimeEndTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorChooser)
                    .addComponent(chosenColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dayLabel, nameLabel, timeLabel});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TimeEndTextField, timeStartTextField});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dayComboBox, nameTextField});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chosenColor, colorChooser});

        schedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"00", null, null, null, null, null, null, null},
                {"01", null, null, null, null, null, null, null},
                {"02", null, null, null, null, null, null, null},
                {"03", null, null, null, null, null, null, null},
                {"04", null, null, null, null, null, null, null},
                {"05", null, null, null, null, null, null, null},
                {"06", null, null, null, null, null, null, null},
                {"07", null, null, null, null, null, null, null},
                {"08", null, null, null, null, null, null, null},
                {"09", null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null},
                {"16", null, null, null, null, null, null, null},
                {"17", null, null, null, null, null, null, null},
                {"18", null, null, null, null, null, null, null},
                {"19", null, null, null, null, null, null, null},
                {"20", null, null, null, null, null, null, null},
                {"21", null, null, null, null, null, null, null},
                {"22", null, null, null, null, null, null, null},
                {"23", null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        schedule.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        schedule.setEnabled(false);
        schedule.setRowSelectionAllowed(false);
        schedule.setShowHorizontalLines(false);
        schedule.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(schedule);
        if (schedule.getColumnModel().getColumnCount() > 0) {
            schedule.getColumnModel().getColumn(0).setResizable(false);
            schedule.getColumnModel().getColumn(0).setPreferredWidth(15);
            schedule.getColumnModel().getColumn(1).setResizable(false);
            schedule.getColumnModel().getColumn(2).setResizable(false);
            schedule.getColumnModel().getColumn(3).setResizable(false);
            schedule.getColumnModel().getColumn(4).setResizable(false);
            schedule.getColumnModel().getColumn(5).setResizable(false);
            schedule.getColumnModel().getColumn(6).setResizable(false);
            schedule.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
       // CreateTask ct = new CreateTask(nameTextField, timeStartTextField, TimeEndTextField, dayComboBox, currentColor);//voisi tehfä private CreateTask, jottei tarvitsisi luoda sitä täällä aina
        ct.setColor(currentColor);
        Task task = ct.createTask();

        if (task != null) {
            updateCell(task);
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Check your inputs!", "Invalid input",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        schedule.setDefaultRenderer(String.class, new ColorRenderer());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void colorChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorChooserActionPerformed
        JColorChooser tcc = new JColorChooser();
        tcc.setPreviewPanel(new JPanel());
        currentColor = JColorChooser.showDialog(new JDialog(), "Color", currentColor);
        chosenColor.setForeground(currentColor);
        chosenColor.setBackground(currentColor);

//        chosenColor.repaint();
    }//GEN-LAST:event_colorChooserActionPerformed

    private void updateCell(Task task) {
        String name = task.getName();
        int time = task.getStartTime();
        int day = task.getDay();
//        schedule.getColumnModel().getColumn(day).setCellRenderer(new ColorRenderer());

        for (int i = 0; i < task.getDuration(); i++) {
            schedule.setValueAt(task, time + i, day);
        }

        //schedule.setValueAt(name, time, day);
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
            java.util.logging.Logger.getLogger(PlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlannerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TimeEndTextField;
    private javax.swing.JLabel chosenColor;
    private javax.swing.JButton colorChooser;
    private javax.swing.JButton createButton;
    private javax.swing.JComboBox dayComboBox;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable schedule;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField timeStartTextField;
    // End of variables declaration//GEN-END:variables
}
