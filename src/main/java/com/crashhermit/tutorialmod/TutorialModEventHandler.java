package com.crashhermit.tutorialmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by joshua on 2/13/17.
 */
public class TutorialModEventHandler {

    @SubscribeEvent
    public void entityJoinWorld(EntityJoinWorldEvent event){
        if(event.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntity();
            player.inventory.addItemStackToInventory(new ItemStack(Items.IRON_SHOVEL));
        }
    }

    @SubscribeEvent
    public void livingDrops(LivingDropsEvent event) {

    }



}
