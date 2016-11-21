/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011-2016 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.keywordsearch;

/**
 * A panel that is contained in NewKeywordDialog used when the user wants to add
 * a new keyword to a list via the options panel. This panel allows the user to
 * indicate whether they want the keyword to be an exact match, a substring, or
 * a regular expression.
 */
class NewKeywordPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewKeywordPanel
     */
    public NewKeywordPanel() {
        initComponents();
    }

    /**
     * @return the text for the new keyword
     */
    String getKeywordText() {
        return keywordTextField.getText();
    }

    /**
     * @return true if the regular expression radio button is selected
     */
    boolean isKeywordRegex() {
        return regexButton.isSelected();
    }

    /**
     * @return true if the exact match radio button is selected
     */
    boolean isKeywordExact() {
        return exactButton.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        keywordTypeButtonGroup = new javax.swing.ButtonGroup();
        keywordTextField = new javax.swing.JTextField();
        exactButton = new javax.swing.JRadioButton();
        substringButton = new javax.swing.JRadioButton();
        regexButton = new javax.swing.JRadioButton();
        newKeywordLabel = new javax.swing.JLabel();

        keywordTextField.setText(org.openide.util.NbBundle.getMessage(NewKeywordPanel.class, "NewKeywordPanel.keywordTextField.text")); // NOI18N
        keywordTextField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                keywordTextFieldAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        keywordTypeButtonGroup.add(exactButton);
        exactButton.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(exactButton, org.openide.util.NbBundle.getMessage(NewKeywordPanel.class, "NewKeywordPanel.exactButton.text")); // NOI18N

        keywordTypeButtonGroup.add(substringButton);
        org.openide.awt.Mnemonics.setLocalizedText(substringButton, org.openide.util.NbBundle.getMessage(NewKeywordPanel.class, "NewKeywordPanel.substringButton.text")); // NOI18N

        keywordTypeButtonGroup.add(regexButton);
        org.openide.awt.Mnemonics.setLocalizedText(regexButton, org.openide.util.NbBundle.getMessage(NewKeywordPanel.class, "NewKeywordPanel.regexButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(newKeywordLabel, org.openide.util.NbBundle.getMessage(NewKeywordPanel.class, "NewKeywordPanel.newKeywordLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exactButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(substringButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regexButton))
                    .addComponent(newKeywordLabel)
                    .addComponent(keywordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newKeywordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keywordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exactButton)
                    .addComponent(substringButton)
                    .addComponent(regexButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void keywordTextFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_keywordTextFieldAncestorAdded
        evt.getComponent().requestFocusInWindow();
    }//GEN-LAST:event_keywordTextFieldAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton exactButton;
    private javax.swing.JTextField keywordTextField;
    private javax.swing.ButtonGroup keywordTypeButtonGroup;
    private javax.swing.JLabel newKeywordLabel;
    private javax.swing.JRadioButton regexButton;
    private javax.swing.JRadioButton substringButton;
    // End of variables declaration//GEN-END:variables
}
