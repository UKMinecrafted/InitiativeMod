/*
    Copyright (C) 2018-2019 Init Studios. All rights reserved.

    This document is the property of Init Studios.
    It is considered confidential and proprietary.

    This document may not be reproduced or transmitted in any form,
    in whole or in part, without the express written permission of
    Init Studios.
 */

package com.initstudios.initiative.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BorealisHull extends BlockBase {

    public BorealisHull(Material material) {
        super(material);
        setSoundType(SoundType.STONE);
        setHardness(5F);
        setResistance(10F);
        this.setHarvestLevel("pickaxe", 2);
    }
}