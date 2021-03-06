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

package me.hink.tweaker.binds;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;

import net.minecraftforge.fml.client.registry.ClientRegistry;

/**
 * A helper class for all the keybinds this mod registers.
 *
 * @author	<a href="https://github.com/h1nk">h1nk</a>
 * @since	0.0.1
 */
public class KeyBindings {
	public static KeyBinding viewPerspective3;
	public static KeyBinding toggleDebugCamera;
	public static KeyBinding muteSound;

	public static KeyBinding viewPanPerspective;

	public static void register() {
		viewPerspective3 = new KeyBinding("View Perspective 3", Keyboard.KEY_F6, "key.categories.misc");
		toggleDebugCamera = new KeyBinding("Toggle Debug Camera", Keyboard.KEY_NONE, "key.categories.misc");
		muteSound = new KeyBinding("Toggle Mute Sound", Keyboard.KEY_NUMPADENTER, "key.categories.misc");

		viewPanPerspective = new KeyBinding("View Perspective", Keyboard.KEY_LMENU, "");

		ClientRegistry.registerKeyBinding(viewPerspective3);
		ClientRegistry.registerKeyBinding(toggleDebugCamera);
		ClientRegistry.registerKeyBinding(muteSound);

		ClientRegistry.registerKeyBinding(viewPanPerspective);
	}
}
