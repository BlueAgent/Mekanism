package mekanism.common.item;

import mekanism.api.Coord4D;
import mekanism.common.Mekanism;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPortableTeleporter extends ItemEnergized
{
	public ItemPortableTeleporter()
	{
		super(1000000);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		if(!world.isRemote)
		{
			entityplayer.openGui(Mekanism.instance, 14, world, 0, 0, 0);
		}
		
		return itemstack;
	}

	public static double calculateEnergyCost(Entity entity, Coord4D coords)
	{
		if(coords == null)
		{
			return 0;
		}

		int neededEnergy = 1000;

		if(entity.worldObj.provider.getDimensionId() != coords.dimensionId)
		{
			neededEnergy+=10000;
		}

		int distance = (int)entity.getDistance(coords.getX(), coords.getY(), coords.getZ());

		neededEnergy+=(distance*10);

		return neededEnergy;
	}

	@Override
	public boolean canSend(ItemStack itemStack)
	{
		return false;
	}
}
