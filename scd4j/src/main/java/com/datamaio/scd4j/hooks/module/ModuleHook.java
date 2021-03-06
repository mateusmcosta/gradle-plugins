/**
 * The MIT License (MIT)
 *
 * Copyright (C) 2014 scd4j scd4j.tools@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.datamaio.scd4j.hooks.module;

import com.datamaio.scd4j.hooks.HookPreResult;
import com.datamaio.scd4j.hooks.Hook;
import com.datamaio.scd4j.hooks.HookEvaluator;

/**
 * This class is the super class for all Module Hook Scripts<br>
 * This provides some helpful methods and functions
 *
 * @author Fernando Rubbo
 */
public abstract class ModuleHook extends Hook {
	protected String moduleDir;
	
	/**
	 * Sets a permanent/persistent property.<br>
	 * 
	 * @see #setPermanentProperty(String, Object)
	 */
    public void set(final String key, final Object value){
    	setPermanentProperty(key, value);
	}
	
	// ------ methods used by the framework only ----
	
	@Override
	protected final void validateReturningAction(HookPreResult hookPreResult) {
		if(!hookPreResult.isValidForModuleHook()){
			throw new RuntimeException("Module.hook has returned the invalid action '" + hookPreResult 
					+ "' at pre{...} script! Please, read HookPreResult javadoc for more information.");
		}
	}
	
    /** Used only by {@link HookEvaluator} to set variables */
	void setModuleDir(String moduleDir) {
		this.moduleDir = moduleDir;
	}	
}