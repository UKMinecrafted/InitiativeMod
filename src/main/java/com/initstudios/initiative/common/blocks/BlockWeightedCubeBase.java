/*
    Copyright (C) 2018-2019 Init Studios. All rights reserved.

    This document is the property of Init Studios.
    It is considered confidential and proprietary.

    This document may not be reproduced or transmitted in any form,
    in whole or in part, without the express written permission of
    Init Studios.
 */

package com.initstudios.initiative.common.blocks;

import com.initstudios.initiative.util.IHaveItem;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * This class contains base properties for weighted cubes. If you're making a weighted cube of any kind,
 * excluding cubes that have special properties. Those may be set in a new class that is not extending from this one,
 * but rather the class {@link BlockFalling}. This will provide your cube with falling capabilities, which will be required
 * for cube dispensers. This class doubles a template for building these custom classes. Add your new code in between the constructor
 * and the registerModels method.
 * If your new class does extend from this one, falling capabilities will be absent from your new weighted cube.
 *
 * @author iBuyMountainDew (Dewy)
 */
public class BlockWeightedCubeBase extends BlockFalling implements IHaveItem
{
    public BlockWeightedCubeBase(String name, Material material) {

        super(material);

        setSoundType(SoundType.METAL);
        setHardness(6.0F);
        setResistance(35F);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItem() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
