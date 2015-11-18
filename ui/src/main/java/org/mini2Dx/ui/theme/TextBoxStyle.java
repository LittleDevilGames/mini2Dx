/**
 * Copyright (c) 2015 See AUTHORS file
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of the mini2Dx nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.mini2Dx.ui.theme;

import org.mini2Dx.core.serialization.annotation.Field;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.NinePatch;

/**
 *
 */
public class TextBoxStyle extends BaseUiElementStyle {
	@Field
	private String normalImage;
	@Field
	private String actionImage;
	@Field
	private String hoverImage;
	@Field
	private String disabledImage;
	@Field
	private String labelStyle;
	
	private NinePatch normalNinePatch, hoverNinePatch, actionNinePatch, disabledNinePatch;
	
	@Override
	public void prepareAssets(AssetManager assetManager) {
		normalNinePatch = new NinePatch(assetManager.get(normalImage, Texture.class), getPaddingLeft(),
				getPaddingRight(), getPaddingTop(), getPaddingBottom());
		hoverNinePatch = new NinePatch(assetManager.get(hoverImage, Texture.class), getPaddingLeft(),
				getPaddingRight(), getPaddingTop(), getPaddingBottom());
		actionNinePatch = new NinePatch(assetManager.get(actionImage, Texture.class), getPaddingLeft(),
				getPaddingRight(), getPaddingTop(), getPaddingBottom());
		disabledNinePatch = new NinePatch(assetManager.get(disabledImage, Texture.class), getPaddingLeft(),
				getPaddingRight(), getPaddingTop(), getPaddingBottom());
	}

	public String getNormalImage() {
		return normalImage;
	}

	public void setNormalImage(String normalImage) {
		this.normalImage = normalImage;
	}

	public String getActionImage() {
		return actionImage;
	}

	public void setActionImage(String activeImage) {
		this.actionImage = activeImage;
	}

	public String getHoverImage() {
		return hoverImage;
	}

	public void setHoverImage(String hoverImage) {
		this.hoverImage = hoverImage;
	}

	public String getDisabledImage() {
		return disabledImage;
	}

	public void setDisabledImage(String disableImage) {
		this.disabledImage = disableImage;
	}

	public String getLabelStyle() {
		return labelStyle;
	}

	public void setLabelStyle(String labelStyle) {
		this.labelStyle = labelStyle;
	}

	public NinePatch getNormalNinePatch() {
		return normalNinePatch;
	}

	public NinePatch getHoverNinePatch() {
		return hoverNinePatch;
	}

	public NinePatch getActionNinePatch() {
		return actionNinePatch;
	}

	public NinePatch getDisabledNinePatch() {
		return disabledNinePatch;
	}
}