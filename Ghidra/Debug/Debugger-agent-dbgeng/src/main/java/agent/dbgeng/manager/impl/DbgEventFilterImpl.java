/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package agent.dbgeng.manager.impl;

import agent.dbgeng.manager.DbgEventFilter;

public class DbgEventFilterImpl implements DbgEventFilter {
	protected final String text;
	protected final String cmd;
	protected int executionOption;
	protected int continueOption;

	public DbgEventFilterImpl(String text, String cmd, int executionOption, int continueOption) {
		this.text = text;
		this.cmd = cmd;
		this.setExecutionOption(executionOption);
		this.setContinueOption(continueOption);
	}

	@Override
	public String getName() {
		return text;
	}

	@Override
	public String getCmd() {
		return cmd;
	}

	@Override
	public int getExecutionOption() {
		return executionOption;
	}

	@Override
	public void setExecutionOption(int executionOption) {
		this.executionOption = executionOption;
	}

	@Override
	public int getContinueOption() {
		return continueOption;
	}

	@Override
	public void setContinueOption(int continueOption) {
		this.continueOption = continueOption;
	}

}
