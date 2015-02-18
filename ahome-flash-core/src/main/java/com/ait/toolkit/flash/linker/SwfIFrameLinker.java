/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.flash.linker;

import java.io.IOException;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.ArtifactSet;
import com.google.gwt.core.ext.linker.CompilationResult;
import com.google.gwt.core.ext.linker.LinkerOrder;
import com.google.gwt.core.ext.linker.LinkerOrder.Order;
import com.google.gwt.core.ext.linker.impl.PermutationsUtil;
import com.google.gwt.core.linker.IFrameLinker;
import com.google.gwt.util.tools.Utility;

@LinkerOrder(Order.PRIMARY)
public class SwfIFrameLinker extends IFrameLinker {

    @Override
    public String getDescription() {
        return "Flash (" + super.getDescription() + " with support for injected SWF \"scripts\")";
    }

    /**
     * Generate a selection script. The selection information should previously
     * have been scanned using
     * {@link PermutationsUtil#setupPermutationsMap(ArtifactSet)}.
     */
    @Override
    protected String fillSelectionScriptTemplate(StringBuffer selectionScript, TreeLogger logger,
                    LinkerContext context, ArtifactSet artifacts, CompilationResult result)
                    throws UnableToCompleteException {
        String computeScriptBase;
        String processMetas;
        try {
            computeScriptBase = Utility.getFileFromClassPath(COMPUTE_SCRIPT_BASE_JS);
            processMetas = Utility.getFileFromClassPath(PROCESS_METAS_JS);
        } catch (IOException e) {
            logger.log(TreeLogger.ERROR, "Unable to read selection script template", e);
            throw new UnableToCompleteException();
        }
        replaceAll(selectionScript, "__COMPUTE_SCRIPT_BASE__", computeScriptBase);
        replaceAll(selectionScript, "__PROCESS_METAS__", processMetas);

        selectionScript = InjectionUtil.injectResources(selectionScript, artifacts);
        permutationsUtil.addPermutationsJs(selectionScript, logger, context);

        replaceAll(selectionScript, "__MODULE_FUNC__", context.getModuleFunctionName());
        replaceAll(selectionScript, "__MODULE_NAME__", context.getModuleName());
        replaceAll(selectionScript, "__HOSTED_FILENAME__", getHostedFilename());

        return selectionScript.toString();
    }

}
