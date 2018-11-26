/*
 * Autopsy Forensic Browser
 *
 * Copyright 2018 Basis Technology Corp.
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
package org.sleuthkit.autopsy.othercasessearch;

import java.awt.event.ActionEvent;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;
import org.sleuthkit.autopsy.casemodule.Case;
import org.sleuthkit.autopsy.centralrepository.datamodel.EamDb;
import org.sleuthkit.autopsy.othercasessearch.Bundle;

/**
 * Action for accessing the Search Other Cases dialog.
 */
@ActionID(category = "Tools", id = "org.sleuthkit.autopsy.othercasessearch.OtherCasesSearchAction")
@ActionRegistration(displayName = "#CTL_OtherCasesSearchAction=Search Other Cases", lazy = false)
@ActionReference(path = "Menu/Tools", position = 104)
@NbBundle.Messages({"CTL_OtherCasesSearchAction=Search Other Cases"})
public class OtherCasesSearchAction extends CallableSystemAction {

    @Override
    public boolean isEnabled() {
        return EamDb.isEnabled() && Case.isCaseOpen();
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        performAction();
    }

    @Override
    public void performAction() {
        OtherCasesSearchDialog dialog = new OtherCasesSearchDialog();
        dialog.display();
    }

    @NbBundle.Messages({
        "OtherCasesSearchAction.getName.text=Search Other Cases"})
    @Override
    public String getName() {
        return Bundle.OtherCasesSearchAction_getName_text();
    }

    @Override
    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }
    
}