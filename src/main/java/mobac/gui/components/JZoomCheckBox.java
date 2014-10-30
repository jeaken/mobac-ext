/*******************************************************************************
 * Copyright (c) MOBAC developers
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package mobac.gui.components;

import javax.swing.JCheckBox;

import mobac.utilities.I18nUtils;

public class JZoomCheckBox extends JCheckBox {

	private static final long serialVersionUID = 1L;
	
	private final int zoomLevel;

	public JZoomCheckBox(int zoomLevel) {
		super();
		this.zoomLevel = zoomLevel;
		setToolTipText(String.format(I18nUtils.localizedStringForKey("lp_zoom_number_tips"),zoomLevel));
	}

	public int getZoomLevel() {
		return zoomLevel;
	}

	
}
