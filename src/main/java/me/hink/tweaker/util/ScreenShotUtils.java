/*
 * Copyright (c) 2017 h1nk
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

package me.hink.tweaker.util;

import me.hink.tweaker.config.TConfig;
import me.hink.tweaker.util.naming.NamePatternFormatter;

import static me.hink.tweaker.config.TConfig.Category.SCREENSHOTS;
import static me.hink.tweaker.config.TConfig.config;

/**
 * TODO
 *
 * @author	<a href="https://github.com/h1nk">h1nk</a>
 * @since	0.0.1
 */
public class ScreenShotUtils {
	public static String formScreenShotName() {
		String name = TConfig.customScreenShotName;

		if (!config.get(SCREENSHOTS.getCategory(), "", true).getBoolean()) {
			name = NamePatternFormatter.format(name);
		} else if (!config.get(SCREENSHOTS.getCategory(), "", "%uuid").getString().equals(null)) {
			name = NamePatternFormatter.format(name);
		}

		name = NamePatternFormatter.format(name);
		name += ".png";

//		return "test";
		return name;
	}

	public static void saveHighResScreenShot() {

	}
}
