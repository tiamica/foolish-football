/*
 * Copyright Samuel Halliday 2009
 * 
 * This file is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 * 
 * This file is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this file.
 * If not, see <http://www.gnu.org/licenses/>.
 */
package uk.me.fommil.ff;

import java.awt.Point;

/**
 * Represents the team tactics, which dictates where each {@link Player} should be
 * based on the location of the ball.
 * 
 * @author Samuel Halliday
 */
public class Tactics {

	/**
	 * @return the tactics associated to the kick off position.
	 */
	public static Tactics getKickOff() {
		return new Tactics();
	}

	/**
	 * @param i
	 * @return
	 */
	public Point getLocation(int i) {
		assert i >= 0 && i < 11;

		return new Point(250, 250);
	}
}