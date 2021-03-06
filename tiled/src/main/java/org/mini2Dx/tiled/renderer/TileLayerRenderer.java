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
package org.mini2Dx.tiled.renderer;

import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.tiled.TileLayer;

/**
 * A common interface for {@link TileLayer} rendering implementations
 */
public interface TileLayerRenderer {
	/**
	 * Renders a {@link TileLayer}
	 * @param g The {@link Graphics} context
	 * @param layer The {@link TileLayer} to render
	 * @param renderX The screen x coordinate to render at
	 * @param renderY The screen y coordinate to render at
	 * @param startTileX The tile x coordinate to start at
	 * @param startTileY The tile y coordinate to start at
	 * @param widthInTiles The width to render in tiles
	 * @param heightInTiles The height to render in tiles
	 */
	public void drawLayer(Graphics g, TileLayer layer, int renderX,
			int renderY, int startTileX, int startTileY, int widthInTiles, int heightInTiles);
	
	public void dispose();
}
