package mekanism.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import javax.annotation.Nonnull;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class ModelSolarNeutronActivator extends Model {

    private static final ResourceLocation ACTIVATOR_TEXTURE = MekanismUtils.getResource(ResourceType.RENDER, "solar_neutron_activator.png");
    private final RenderType RENDER_TYPE = getRenderType(ACTIVATOR_TEXTURE);

    private final ModelRenderer pole;
    private final ModelRenderer panel3;
    private final ModelRenderer port;
    private final ModelRenderer panel1;
    private final ModelRenderer panel2;
    private final ModelRenderer panelBase;
    private final ModelRenderer panelBraceLeft2;
    private final ModelRenderer panelBraceRight2;
    private final ModelRenderer panelBraceLeft1;
    private final ModelRenderer panelBraceRight1;
    private final ModelRenderer panelBrace;
    private final ModelRenderer bridge;
    private final ModelRenderer platform;
    private final ModelRenderer hole2;
    private final ModelRenderer hole4;
    private final ModelRenderer hole1;
    private final ModelRenderer hole3;
    private final ModelRenderer brace2;
    private final ModelRenderer tube2c;
    private final ModelRenderer tube1b;
    private final ModelRenderer tube1c;
    private final ModelRenderer tube2b;
    private final ModelRenderer tube2a;
    private final ModelRenderer tube1a;
    private final ModelRenderer conduit;
    private final ModelRenderer brace1;
    private final ModelRenderer tank;
    private final ModelRenderer laser;
    private final ModelRenderer base;
    private final ModelRenderer support1;
    private final ModelRenderer support2;
    private final ModelRenderer support3;
    private final ModelRenderer support4;
    private final ModelRenderer support5;
    private final ModelRenderer support6;
    private final ModelRenderer support7;
    private final ModelRenderer support8;
    private final ModelRenderer support9;
    private final ModelRenderer support10;
    private final ModelRenderer support11;
    private final ModelRenderer support12;
    private final ModelRenderer support13;
    private final ModelRenderer support14;
    private final ModelRenderer support15;
    private final ModelRenderer support16;
    private final ModelRenderer portConnector;
    private final ModelRenderer laserBeamToggle;

    public ModelSolarNeutronActivator() {
        super(RenderType::entityCutout);
        textureWidth = 128;
        textureHeight = 64;

        pole = new ModelRenderer(this, 116, 0);
        pole.addBox(0F, 0F, 0F, 4, 15, 2, false);
        pole.setRotationPoint(-2F, -5F, 6F);
        pole.setTextureSize(128, 64);
        pole.mirror = true;
        setRotation(pole, 0F, 0F, 0F);
        panel3 = new ModelRenderer(this, 84, 32);
        panel3.addBox(-6F, 0F, -16F, 6, 1, 16, false);
        panel3.setRotationPoint(-2.75F, -4.95F, 8F);
        panel3.setTextureSize(128, 64);
        panel3.mirror = true;
        //TODO
        setRotation(panel3, -0.1082104F, 0.0279253F, 0.2617994F);
        port = new ModelRenderer(this, 0, 45);
        port.addBox(0F, 0F, 0F, 8, 8, 1, false);
        port.setRotationPoint(-4F, 12F, -8.01F);
        port.setTextureSize(128, 64);
        port.mirror = true;
        setRotation(port, 0F, 0F, 0F);
        panel1 = new ModelRenderer(this, 84, 32);
        panel1.mirror = true;
        panel1.addBox(0F, 0F, -16F, 6, 1, 16, false);
        panel1.setRotationPoint(2.75F, -4.95F, 8F);
        panel1.setTextureSize(128, 64);
        setRotation(panel1, -0.1082104F, -0.0279253F, -0.2617994F);
        panel2 = new ModelRenderer(this, 84, 15);
        panel2.addBox(0F, 0F, -16F, 6, 1, 16, false);
        panel2.setRotationPoint(-3F, -5F, 8F);
        panel2.setTextureSize(128, 64);
        panel2.mirror = true;
        setRotation(panel2, -0.1047198F, 0F, 0F);
        panelBase = new ModelRenderer(this, 28, 45);
        panelBase.addBox(0F, 1F, -16F, 6, 1, 14, false);
        panelBase.setRotationPoint(-3F, -5F, 9F);
        panelBase.setTextureSize(128, 64);
        panelBase.mirror = true;
        setRotation(panelBase, -0.1047198F, 0F, 0F);
        panelBraceLeft2 = new ModelRenderer(this, 64, 15);
        panelBraceLeft2.addBox(-4F, 0.5F, -5F, 5, 1, 2, false);
        panelBraceLeft2.setRotationPoint(-3F, -5F, 9F);
        panelBraceLeft2.setTextureSize(128, 64);
        panelBraceLeft2.mirror = true;
        setRotation(panelBraceLeft2, -0.1047198F, 0F, 0.2505517F);
        panelBraceRight2 = new ModelRenderer(this, 64, 15);
        panelBraceRight2.addBox(-1F, 0.5F, -5F, 5, 1, 2, false);
        panelBraceRight2.setRotationPoint(3F, -5F, 9F);
        panelBraceRight2.setTextureSize(128, 64);
        panelBraceRight2.mirror = true;
        setRotation(panelBraceRight2, -0.1047198F, 0F, -0.2555938F);
        panelBraceLeft1 = new ModelRenderer(this, 64, 15);
        panelBraceLeft1.addBox(-4F, 0.5F, -15F, 5, 1, 2, false);
        panelBraceLeft1.setRotationPoint(-3F, -5F, 9F);
        panelBraceLeft1.setTextureSize(128, 64);
        panelBraceLeft1.mirror = true;
        setRotation(panelBraceLeft1, -0.1047198F, 0F, 0.2505517F);
        panelBraceRight1 = new ModelRenderer(this, 64, 15);
        panelBraceRight1.addBox(-1F, 0.5F, -15F, 5, 1, 2, false);
        panelBraceRight1.setRotationPoint(3F, -5F, 9F);
        panelBraceRight1.setTextureSize(128, 64);
        panelBraceRight1.mirror = true;
        setRotation(panelBraceRight1, -0.1047198F, 0F, -0.2555938F);
        panelBrace = new ModelRenderer(this, 56, 18);
        panelBrace.addBox(0F, 1.2F, -10F, 2, 2, 9, false);
        panelBrace.setRotationPoint(-1F, -5F, 8F);
        panelBrace.setTextureSize(128, 64);
        panelBrace.mirror = true;
        setRotation(panelBrace, -0.1047198F, 0F, 0F);
        bridge = new ModelRenderer(this, 65, 1);
        bridge.addBox(0F, 0F, 0F, 12, 1, 13, false);
        bridge.setRotationPoint(-6F, 19F, -6F);
        bridge.setTextureSize(128, 64);
        bridge.mirror = true;
        setRotation(bridge, 0F, 0F, 0F);
        platform = new ModelRenderer(this, 18, 45);
        platform.addBox(-2.5F, 1F, -2.5F, 6, 3, 6, false);
        platform.setRotationPoint(-0.5F, 8F, -2.5F);
        platform.setTextureSize(128, 64);
        platform.mirror = true;
        setRotation(platform, -0.1047198F, 0F, 0F);
        hole2 = new ModelRenderer(this, 0, 6);
        hole2.addBox(1F, 0F, 0F, 1, 2, 1, false);
        hole2.setRotationPoint(-0.5F, 8F, -2.5F);
        hole2.setTextureSize(128, 64);
        hole2.mirror = true;
        setRotation(hole2, -0.1047198F, 0F, 0F);
        hole4 = new ModelRenderer(this, 0, 3);
        hole4.addBox(-1F, 0F, 1F, 3, 2, 1, false);
        hole4.setRotationPoint(-0.5F, 8F, -2.5F);
        hole4.setTextureSize(128, 64);
        hole4.mirror = true;
        setRotation(hole4, -0.1047198F, 0F, 0F);
        hole1 = new ModelRenderer(this, 0, 3);
        hole1.addBox(-1F, 0F, -1F, 3, 2, 1, false);
        hole1.setRotationPoint(-0.5F, 8F, -2.5F);
        hole1.setTextureSize(128, 64);
        hole1.mirror = true;
        setRotation(hole1, -0.1047198F, 0F, 0F);
        hole3 = new ModelRenderer(this, 0, 6);
        hole3.addBox(-1F, 0F, 0F, 1, 2, 1, false);
        hole3.setRotationPoint(-0.5F, 8F, -2.5F);
        hole3.setTextureSize(128, 64);
        hole3.mirror = true;
        setRotation(hole3, -0.1047198F, 0F, 0F);
        brace2 = new ModelRenderer(this, 0, 11);
        brace2.addBox(0F, 0F, 0F, 1, 1, 2, false);
        brace2.setRotationPoint(1F, 9.5F, -7.1F);
        brace2.setTextureSize(128, 64);
        brace2.mirror = true;
        setRotation(brace2, 0.1745329F, 0F, 0F);
        tube2c = new ModelRenderer(this, 0, 9);
        tube2c.addBox(0F, 0F, 0F, 1, 1, 1, false);
        tube2c.setRotationPoint(2F, 9F, 4F);
        tube2c.setTextureSize(128, 64);
        tube2c.mirror = true;
        setRotation(tube2c, 0F, 0F, 0F);
        tube1b = new ModelRenderer(this, 0, 14);
        tube1b.addBox(0F, 0F, 0F, 6, 1, 1, false);
        tube1b.setRotationPoint(-3F, 8F, 2F);
        tube1b.setTextureSize(128, 64);
        tube1b.mirror = true;
        setRotation(tube1b, 0F, 0F, 0F);
        tube1c = new ModelRenderer(this, 0, 9);
        tube1c.addBox(0F, 0F, 0F, 1, 1, 1, false);
        tube1c.setRotationPoint(2F, 9F, 2F);
        tube1c.setTextureSize(128, 64);
        tube1c.mirror = true;
        setRotation(tube1c, 0F, 0F, 0F);
        tube2b = new ModelRenderer(this, 0, 14);
        tube2b.addBox(0F, 0F, 0F, 6, 1, 1, false);
        tube2b.setRotationPoint(-3F, 8F, 4F);
        tube2b.setTextureSize(128, 64);
        tube2b.mirror = true;
        setRotation(tube2b, 0F, 0F, 0F);
        tube2a = new ModelRenderer(this, 0, 9);
        tube2a.addBox(0F, 0F, 0F, 1, 1, 1, false);
        tube2a.setRotationPoint(-3F, 9F, 4F);
        tube2a.setTextureSize(128, 64);
        tube2a.mirror = true;
        setRotation(tube2a, 0F, 0F, 0F);
        tube1a = new ModelRenderer(this, 0, 9);
        tube1a.addBox(0F, 0F, 0F, 1, 1, 1, false);
        tube1a.setRotationPoint(-3F, 9F, 2F);
        tube1a.setTextureSize(128, 64);
        tube1a.mirror = true;
        setRotation(tube1a, 0F, 0F, 0F);
        conduit = new ModelRenderer(this, 48, 0);
        conduit.addBox(0F, 0F, 0F, 2, 1, 7, false);
        conduit.setRotationPoint(-1F, 9.5F, -1F);
        conduit.setTextureSize(128, 64);
        conduit.mirror = true;
        setRotation(conduit, 0F, 0F, 0F);
        brace1 = new ModelRenderer(this, 0, 11);
        brace1.addBox(0F, 0F, 0F, 1, 1, 2, false);
        brace1.setRotationPoint(-2F, 9.5F, -7.1F);
        brace1.setTextureSize(128, 64);
        brace1.mirror = true;
        setRotation(brace1, 0.1745329F, 0F, 0F);
        tank = new ModelRenderer(this, 0, 0);
        tank.addBox(0F, 0F, 0F, 16, 9, 16, false);
        tank.setRotationPoint(-8F, 10F, -8F);
        tank.setTextureSize(128, 64);
        tank.mirror = true;
        setRotation(tank, 0F, 0F, 0F);
        laser = new ModelRenderer(this, 4, 0);
        laser.addBox(0.5F, 2.1F, -9F, 1, 2, 1, false);
        laser.setRotationPoint(-1F, -5F, 8F);
        laser.setTextureSize(128, 64);
        laser.mirror = true;
        setRotation(laser, -0.1117011F, 0F, 0F);
        base = new ModelRenderer(this, 0, 25);
        base.addBox(0F, 0F, 0F, 16, 4, 16, false);
        base.setRotationPoint(-8F, 20F, -8F);
        base.setTextureSize(128, 64);
        base.mirror = true;
        setRotation(base, 0F, 0F, 0F);
        support1 = new ModelRenderer(this, 0, 0);
        support1.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support1.setRotationPoint(6.5F, 19F, -7.5F);
        support1.setTextureSize(128, 64);
        support1.mirror = true;
        setRotation(support1, 0F, 0F, 0F);
        support2 = new ModelRenderer(this, 0, 0);
        support2.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support2.setRotationPoint(6.5F, 19F, 6.5F);
        support2.setTextureSize(128, 64);
        support2.mirror = true;
        setRotation(support2, 0F, 0F, 0F);
        support3 = new ModelRenderer(this, 0, 0);
        support3.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support3.setRotationPoint(6.5F, 19F, -5.5F);
        support3.setTextureSize(128, 64);
        support3.mirror = true;
        setRotation(support3, 0F, 0F, 0F);
        support4 = new ModelRenderer(this, 0, 0);
        support4.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support4.setRotationPoint(6.5F, 19F, -3.5F);
        support4.setTextureSize(128, 64);
        support4.mirror = true;
        setRotation(support4, 0F, 0F, 0F);
        support5 = new ModelRenderer(this, 0, 0);
        support5.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support5.setRotationPoint(6.5F, 19F, -1.5F);
        support5.setTextureSize(128, 64);
        support5.mirror = true;
        setRotation(support5, 0F, 0F, 0F);
        support6 = new ModelRenderer(this, 0, 0);
        support6.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support6.setRotationPoint(6.5F, 19F, 0.5F);
        support6.setTextureSize(128, 64);
        support6.mirror = true;
        setRotation(support6, 0F, 0F, 0F);
        support7 = new ModelRenderer(this, 0, 0);
        support7.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support7.setRotationPoint(6.5F, 19F, 2.5F);
        support7.setTextureSize(128, 64);
        support7.mirror = true;
        setRotation(support7, 0F, 0F, 0F);
        support8 = new ModelRenderer(this, 0, 0);
        support8.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support8.setRotationPoint(6.5F, 19F, 4.5F);
        support8.setTextureSize(128, 64);
        support8.mirror = true;
        setRotation(support8, 0F, 0F, 0F);
        support9 = new ModelRenderer(this, 0, 0);
        support9.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support9.setRotationPoint(-7.5F, 19F, 6.5F);
        support9.setTextureSize(128, 64);
        support9.mirror = true;
        setRotation(support9, 0F, 0F, 0F);
        support10 = new ModelRenderer(this, 0, 0);
        support10.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support10.setRotationPoint(-7.5F, 19F, 4.5F);
        support10.setTextureSize(128, 64);
        support10.mirror = true;
        setRotation(support10, 0F, 0F, 0F);
        support11 = new ModelRenderer(this, 0, 0);
        support11.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support11.setRotationPoint(-7.5F, 19F, 2.5F);
        support11.setTextureSize(128, 64);
        support11.mirror = true;
        setRotation(support11, 0F, 0F, 0F);
        support12 = new ModelRenderer(this, 0, 0);
        support12.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support12.setRotationPoint(-7.5F, 19F, 0.5F);
        support12.setTextureSize(128, 64);
        support12.mirror = true;
        setRotation(support12, 0F, 0F, 0F);
        support13 = new ModelRenderer(this, 0, 0);
        support13.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support13.setRotationPoint(-7.5F, 19F, -1.5F);
        support13.setTextureSize(128, 64);
        support13.mirror = true;
        setRotation(support13, 0F, 0F, 0F);
        support14 = new ModelRenderer(this, 0, 0);
        support14.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support14.setRotationPoint(-7.5F, 19F, -3.5F);
        support14.setTextureSize(128, 64);
        support14.mirror = true;
        setRotation(support14, 0F, 0F, 0F);
        support15 = new ModelRenderer(this, 0, 0);
        support15.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support15.setRotationPoint(-7.5F, 19F, -5.5F);
        support15.setTextureSize(128, 64);
        support15.mirror = true;
        setRotation(support15, 0F, 0F, 0F);
        support16 = new ModelRenderer(this, 0, 0);
        support16.addBox(0F, 0F, 0F, 1, 1, 1, false);
        support16.setRotationPoint(-7.5F, 19F, -7.5F);
        support16.setTextureSize(128, 64);
        support16.mirror = true;
        setRotation(support16, 0F, 0F, 0F);
        portConnector = new ModelRenderer(this, 0, 14);
        portConnector.addBox(0F, 0F, 0F, 6, 1, 1, false);
        portConnector.setRotationPoint(-3F, 19F, -7.01F);
        portConnector.setTextureSize(128, 64);
        portConnector.mirror = true;
        setRotation(portConnector, 0F, 0F, 0F);
        laserBeamToggle = new ModelRenderer(this, 12, 0);
        laserBeamToggle.addBox(0.5F, 4.1F, -9F, 1, 11, 1, false);
        laserBeamToggle.setRotationPoint(-1F, -5F, 8F);
        laserBeamToggle.setTextureSize(128, 64);
        laserBeamToggle.mirror = true;
        setRotation(laserBeamToggle, -0.1117011F, 0F, 0F);
    }

    public void render(@Nonnull MatrixStack matrix, @Nonnull IRenderTypeBuffer renderer, int light, int overlayLight) {
        render(matrix, renderer.getBuffer(RENDER_TYPE), light, overlayLight, 1, 1, 1, 1);
    }

    @Override
    public void render(@Nonnull MatrixStack matrix, @Nonnull IVertexBuilder vertexBuilder, int light, int overlayLight, float red, float green, float blue, float alpha) {
        pole.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        panel3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        port.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        panel1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        panel2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        panelBase.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        panelBraceLeft2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        panelBraceRight2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        panelBraceLeft1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        panelBraceRight1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        panelBrace.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bridge.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        platform.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        hole2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        hole4.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        hole1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        hole3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        brace2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tube2c.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tube1b.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tube1c.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tube2b.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tube2a.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tube1a.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        conduit.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        brace1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        tank.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        laser.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        base.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support4.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support5.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support6.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support7.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support8.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support9.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support10.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support11.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support12.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support13.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support14.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support15.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        support16.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        portConnector.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        laserBeamToggle.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}