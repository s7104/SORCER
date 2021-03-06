/*
 * Copyright 2010 the original author or authors.
 * Copyright 2010 SorcerSoft.org.
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

package sorcer.util.html;

public class Checkbox extends Button {
	public Checkbox(String value) {
		super(value);
	}

	public Checkbox(String value, String name) {
		super(value, name);
	}

	public String getType() {
		return new String("checkbox");
	}

	public void setChecked(boolean state) {
		checked = state;
	}

	public boolean isChecked() {
		return checked;
	}

	private boolean checked = false;
}
