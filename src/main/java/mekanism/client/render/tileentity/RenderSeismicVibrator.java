package mekanism.client.render.tileentity;

import mekanism.client.model.ModelSeismicVibrator;
import mekanism.common.Mekanism;
import mekanism.common.tile.TileEntitySeismicVibrator;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSeismicVibrator extends TileEntitySpecialRenderer<TileEntitySeismicVibrator>
{
	private ModelSeismicVibrator model = new ModelSeismicVibrator();

	@Override
	public void renderTileEntityAt(TileEntitySeismicVibrator tileEntity, double x, double y, double z, float partialTick, int destroyStage)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 1.5F);

		bindTexture(MekanismUtils.getResource(ResourceType.RENDER, "SeismicVibrator" + (tileEntity.isActive ? "On" : "") + ".png"));

		switch(tileEntity.facing.ordinal()) /*TODO: switch the enum*/
		{
			case 2: GL11.glRotatef(0, 0.0F, 1.0F, 0.0F); break;
			case 3: GL11.glRotatef(180, 0.0F, 1.0F, 0.0F); break;
			case 4: GL11.glRotatef(90, 0.0F, 1.0F, 0.0F); break;
			case 5: GL11.glRotatef(270, 0.0F, 1.0F, 0.0F); break;
		}
		
		if(!Mekanism.proxy.isPaused())
		{
			float rate = 0.01F;
			
			if(!tileEntity.getActive() && tileEntity.clientPiston > 0)
			{
				if(tileEntity.clientPiston < 1)
				{
					tileEntity.clientPiston = 1 + (1-tileEntity.clientPiston);
				}
				
				tileEntity.clientPiston = Math.min(2, tileEntity.clientPiston+rate)%2;
			}
			else if(tileEntity.getActive())
			{
				tileEntity.clientPiston = Math.min(2, tileEntity.clientPiston+rate)%2;
			}
		}
		
		float actualRate = tileEntity.clientPiston < 1 ? tileEntity.clientPiston : 2-tileEntity.clientPiston;

		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		model.renderWithPiston(actualRate, 0.0625F);
		GL11.glPopMatrix();
	}
}
