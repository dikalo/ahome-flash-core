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

package com.ait.toolkit.flash.core.client.ui;

import com.ait.toolkit.flash.core.client.utils.factories.KeyboardFactory;

/**
 * The Keyboard class is used to build an interface that can be controlled by a
 * user with a standard keyboard. You can use the methods and properties of the
 * Keyboard class without using a constructor. The properties of the Keyboard
 * class are constants representing the keys that are most commonly used to
 * control games.
 */
public final class Keyboard {

    /** The Constant BACKSPACE. */
    public static final int BACKSPACE = 8;

    /** The Constant CAPS_LOCK. */
    public static final int CAPS_LOCK = 20;

    /** The Constant DELETE. */
    public static final int DELETE = 46;

    /** The Constant DOWN. */
    public static final int DOWN = 40;

    /** The Constant END. */
    public static final int END = 35;

    /** The Constant ENTER. */
    public static final int ENTER = 13;

    /** The Constant ESCAPE. */
    public static final int ESCAPE = 27;

    /** The Constant F1. */
    public static final int F1 = 112;

    /** The Constant F10. */
    public static final int F10 = 121;

    /** The Constant F11. */
    public static final int F11 = 122;

    /** The Constant F12. */
    public static final int F12 = 123;

    /** The Constant F13. */
    public static final int F13 = 124;

    /** The Constant F14. */
    public static final int F14 = 125;

    /** The Constant F15. */
    public static final int F15 = 126;

    /** The Constant F2. */
    public static final int F2 = 113;

    /** The Constant F3. */
    public static final int F3 = 114;

    /** The Constant F4. */
    public static final int F4 = 115;

    /** The Constant F5. */
    public static final int F5 = 116;

    /** The Constant F6. */
    public static final int F6 = 117;

    /** The Constant F7. */
    public static final int F7 = 118;

    /** The Constant F8. */
    public static final int F8 = 119;

    /** The Constant F9. */
    public static final int F9 = 120;

    /** The Constant G. */
    public static final int G = 71;

    /** The Constant HOME. */
    public static final int HOME = 36;

    /** The Constant INSERT. */
    public static final int INSERT = 45;

    /** The Constant LEFT. */
    public static final int LEFT = 37;

    /** The Constant NUMPAD_0. */
    public static final int NUMPAD_0 = 96;

    /** The Constant NUMPAD_1. */
    public static final int NUMPAD_1 = 97;

    /** The Constant NUMPAD_2. */
    public static final int NUMPAD_2 = 98;

    /** The Constant NUMPAD_3. */
    public static final int NUMPAD_3 = 99;

    /** The Constant NUMPAD_4. */
    public static final int NUMPAD_4 = 100;

    /** The Constant NUMPAD_5. */
    public static final int NUMPAD_5 = 101;

    /** The Constant NUMPAD_6. */
    public static final int NUMPAD_6 = 102;

    /** The Constant NUMPAD_7. */
    public static final int NUMPAD_7 = 103;

    /** The Constant NUMPAD_8. */
    public static final int NUMPAD_8 = 104;

    /** The Constant NUMPAD_9. */
    public static final int NUMPAD_9 = 105;

    /** The Constant NUMPAD_ADD. */
    public static final int NUMPAD_ADD = 107;

    /** The Constant NUMPAD_DECIMAL. */
    public static final int NUMPAD_DECIMAL = 110;

    /** The Constant NUMPAD_DIVIDE. */
    public static final int NUMPAD_DIVIDE = 111;

    /** The Constant NUMPAD_ENTER. */
    public static final int NUMPAD_ENTER = 108;

    /** The Constant NUMPAD_MUTLIPLY. */
    public static final int NUMPAD_MUTLIPLY = 106;

    /** The Constant NUMPAD_SUBSTRACT. */
    public static final int NUMPAD_SUBSTRACT = 109;

    /** The Constant PAGE_DOWN. */
    public static final int PAGE_DOWN = 34;

    /** The Constant PAGE_UP. */
    public static final int PAGE_UP = 33;

    /** The Constant SHIFT. */
    public static final int SHIFT = 16;

    /** The Constant SPACE. */
    public static final int SPACE = 32;

    /** The Constant TAB. */
    public static final int TAB = 9;

    /** The Constant UP. */
    public static final int UP = 38;

    /**
     * Instantiates a new keyboard.
     */
    private Keyboard() {
    }

    /**
     * Checks if is caps lock active.
     * 
     * @return true, if is caps lock active
     */
    public static final boolean isCapsLockActive() {
        return KeyboardFactory.get().isCapsLockActivated();
    }

    /**
     * Checks if is num lock active.
     * 
     * @return true, if is num lock active
     */
    public static final boolean isNumLockActive() {
        return KeyboardFactory.get().isNumlockActivated();
    }

    /**
     * Checks for virtual keyboard.
     * 
     * @return true, if successful
     */
    public static final boolean hasVirtualKeyboard() {
        return KeyboardFactory.get().hasVirtualKeyBoard();
    }

    /**
     * Gets the physical keyboard type.
     * 
     * @return the physical keyboard type
     */
    public static final String getPhysicalKeyboardType() {
        return KeyboardFactory.get().getPhysicalKeyboardType();
    }

    /**
     * Checks if is accessible.
     * 
     * @return true, if is accessible
     */
    public static final boolean isAccessible() {
        return KeyboardFactory.get().isAccessible();
    }

}
