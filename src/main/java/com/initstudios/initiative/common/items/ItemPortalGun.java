package com.initstudios.initiative.common.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemPortalGun extends Item
{
    public ItemPortalGun()
    {
        super();

        maxStackSize = 1;
        setMaxDamage(0);

    }

    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player)
    {
        return false;
    }

    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
        return true;
    }

    public EnumActionResult onItemUseFirst(EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand)
    {
        return EnumActionResult.SUCCESS;
    }

    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.BOW;
    }

    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 2147483647;
    }
}
