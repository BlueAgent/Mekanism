package mekanism.client.jei.chemical;

import javax.annotation.Nullable;
import mekanism.api.gas.Gas;
import mekanism.api.gas.GasStack;
import mezz.jei.api.gui.drawable.IDrawable;
import net.minecraftforge.fluids.FluidAttributes;

public class GasStackRenderer extends ChemicalStackRenderer<Gas, GasStack> {

    public GasStackRenderer() {
        this(FluidAttributes.BUCKET_VOLUME, TooltipMode.ITEM_LIST, TEX_WIDTH, TEX_HEIGHT, null);
    }

    public GasStackRenderer(int capacityMb, boolean showCapacity, int width, int height, @Nullable IDrawable overlay) {
        this(capacityMb, showCapacity ? TooltipMode.SHOW_AMOUNT_AND_CAPACITY : TooltipMode.SHOW_AMOUNT, width, height, overlay);
    }

    public GasStackRenderer(int capacityMb, TooltipMode tooltipMode, int width, int height, @Nullable IDrawable overlay) {
        super(capacityMb, tooltipMode, width, height, overlay);
    }
}