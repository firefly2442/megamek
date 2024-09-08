/*
 * Copyright (c) 2005 - Ben Mazur (bmazur@sev.org)
 * Copyright (c) 2022 - The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MegaMek.
 *
 * MegaMek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MegaMek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MegaMek. If not, see <http://www.gnu.org/licenses/>.
 */
package megamek.common.weapons.lrms;

import megamek.common.SimpleTechLevel;

/**
 * @author Sebastian Brocks
 */
public class CLStreakLRM4OS extends StreakLRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 5240577239366457930L;

    /**
     *
     */
    public CLStreakLRM4OS() {
        super();
        name = "Streak LRM 4 (OS)";
        setInternalName("CLStreakLRM4OS");
        addLookupName("Clan Streak LRM-4 (OS)");
        addLookupName("Clan Streak LRM 4 (OS)");
        heat = 0;
        rackSize = 4;
        shortRange = 7;
        mediumRange = 14;
        longRange = 21;
        extremeRange = 28;
        tonnage = 2.1;
        criticals = 1;
        bv = 68;
        cost = 60000;
        // Per Herb all ProtoMech launcher use the ProtoMech Chassis progression.
        //But LRM Tech Base and Avail Ratings.
        rulesRefs = "327, TO";
        flags = flags.or(F_NO_FIRES).or(F_ONESHOT).andNot(F_AERO_WEAPON).andNot(F_BA_WEAPON)
        		.andNot(F_MEK_WEAPON).andNot(F_TANK_WEAPON).andNot(F_PROTO_WEAPON).andNot(F_ARTEMIS_COMPATIBLE);
        techAdvancement.setTechBase(TECH_BASE_CLAN).setTechRating(RATING_F)
            .setAvailability(RATING_X, RATING_X, RATING_F, RATING_E)
            .setClanAdvancement(3057, 3079, 3088).setClanApproximate(false, true, false)
            .setPrototypeFactions(F_CCY).setProductionFactions(F_CJF)
            .setStaticTechLevel(SimpleTechLevel.EXPERIMENTAL);
    }
}
