/*
 * MIT License
 *
 * Copyright (c) 2018 msemu
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

package com.msemu.world.enums;

import lombok.Getter;

/**
 * Created by Weber on 2018/5/12.
 */
public enum ForceAtomType {
    DEMON_FORCE_LOCAL(0x0),
    BLANCCARTE_BOTH(0x1),
    FLYING_SWORD_BOTH(0x2),
    SOUL_SEEKER_BOTH(0x3),
    SOUL_SEEKER_RECREATE(0x4),
    AEGIS_BOTH(0x5),
    AEGIS_ACTIVE_BOTH(0x6),
    TRIFLING_WHIM_BOTH(0x7),
    STORM_BRINGER_BOTH(0x8),
    ZERO_FORCE_LOCAL(0x9),
    QUIVER_CAT_RIDGE_BOTH(0xA),
    MARK_OF_ASSASSIN_BOTH(0xB),
    MESO_EXPLOSION_BOTH(0xC),
    POSSESSION_BOTH(0xD),
    EVENT_POINT_LOCAL(0xE),
    SHADOW_BAT_BOTH(0xF),
    SHADOW_BAT_BOUND_BOTH(0x10),
    NON_TARGET_BOTH(0x11),
    TYPING_GAME_BOTH(0x12),
    SSF_SHOOTING_BOTH(0x13),
    HORMING(0x14),
    NON_TARGET_SIKSIN_BOTH(0x15),
    TELEKINESIS_BOTH(0x16),
    MAGIC_WRECKAGE(0x17),
    ADV_MAGIC_WRECKAGE(0x18),
    AUTO_SOUL_SEEKER_BOTH(0x19),
    AUTO_SOUL_SEEKER_RECREATE(0x1A),
    TYPE_1B(0x1B),
    TYPE_1C(0x1C),
    TYPE_1D(0x1D),
    TYPE_1E(0x1E),
    TYPE_1F(0x1F),
    TYPE_20(0x20),
    TYPE_21(0x21),
    TYPE_22(0x22),
    TYPE_23(0x23),
    NUM(0x24),;
    @Getter
    private int value;

    ForceAtomType(int value) {
        this.value = value;
    }

    public static ForceAtomType getByValue(int value) {
        for (ForceAtomType atom : values()) {
            if (atom.getValue() == value)
                return atom;
        }
        return null;
    }
}


/***
 * enum $5F81539201B99E2EB48DE536F154806F
 * {
 * FORCEATOM_TYPE_DEMONFORCE_LOCAL = 0x0,
 * FORCEATOM_TYPE_BLANCCARTE_BOTH = 0x1,
 * FORCEATOM_TYPE_FLYINGSWORD_BOTH = 0x2,
 * FORCEATOM_TYPE_SOULSEEKER_BOTH = 0x3,
 * FORCEATOM_TYPE_SOULSEEKER_RECREATE = 0x4,
 * FORCEATOM_TYPE_AEGIS_BOTH = 0x5,
 * FORCEATOM_TYPE_AEGISACTIVE_BOTH = 0x6,
 * FORCEATOM_TYPE_TRIFLINGWHIM_BOTH = 0x7,
 * FORCEATOM_TYPE_STORMBRINGER_BOTH = 0x8,
 * FORCEATOM_TYPE_ZEROFORCE_LOCAL = 0x9,
 * FORCEATOM_TYPE_QUIVERCATRIDGE_BOTH = 0xA,
 * FORCEATOM_TYPE_MARKOFASSASSIN_BOTH = 0xB,
 * FORCEATOM_TYPE_MESOEXPLOSION_BOTH = 0xC,
 * FORCEATOM_TYPE_POSSESSION_BOTH = 0xD,
 * FORCEATOM_TYPE_EVENTPOINT_LOCAL = 0xE,
 * FORCEATOM_TYPE_SHADOW_BAT_BOTH = 0xF,
 * FORCEATOM_TYPE_SHADOW_BAT_BOUND_BOTH = 0x10,
 * FORCEATOM_TYPE_NONTARGET_BOTH = 0x11,
 * FORCEATOM_TYPE_TYPINGGAME_BOTH = 0x12,
 * FORCEATOM_TYPE_SSFSHOOTING_BOTH = 0x13,
 * FORCEATOM_TYPE_HORMING = 0x14,
 * FORCEATOM_TYPE_NONTARGET_SIKSIN_BOTH = 0x15,
 * FORCEATOM_TYPE_TELEKINESIS_BOTH = 0x16,
 * FORCEATOM_TYPE_MAGIC_WRECKAGE = 0x17,
 * FORCEATOM_TYPE_ADV_MAGIC_WRECKAGE = 0x18,
 * FORCEATOM_TYPE_AUTO_SOULSEEKER_BOTH = 0x19,
 * FORCEATOM_TYPE_AUTO_SOULSEEKER_RECREATE = 0x1A,
 * FORCEATOM_TYPE_NUM = 0x1B,
 * };
 **/