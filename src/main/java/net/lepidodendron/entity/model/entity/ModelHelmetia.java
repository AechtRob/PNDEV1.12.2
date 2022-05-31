package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelHelmetia extends AdvancedModelBase {
    private final AdvancedModelRenderer Helmetia;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Antennae1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Antennae2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer LLeg6;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer RLeg6;
    private final AdvancedModelRenderer cube_r24;

    public ModelHelmetia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Helmetia = new AdvancedModelRenderer(this);
        this.Helmetia.setRotationPoint(0.0F, 22.75F, 1.0F);
        this.Helmetia.cubeList.add(new ModelBox(Helmetia, 0, 0, -1.5F, -1.0F, -4.5F, 3, 2, 9, 0.0F, false));
        this.Helmetia.cubeList.add(new ModelBox(Helmetia, 0, 3, -0.5F, -0.25F, -6.75F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 10.0F, 5.5F);
        this.Helmetia.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, 1.5F, -9.75F, -4.0F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 10.0F, 5.5F);
        this.Helmetia.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 11, -1.5F, 1.1F, -15.2F, 3, 1, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2F, 2.05F, 1.3F);
        this.Helmetia.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2084F, 0.0651F, -0.3423F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 18, -4.25F, -3.95F, -9.0F, 5, 0, 5, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, 3.0F, 3.5F);
        this.Helmetia.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 26, -5.25F, -3.95F, -7.0F, 6, 0, 6, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.2F, 3.15F, 2.5F);
        this.Helmetia.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2502F, -0.0779F, -0.3393F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 11, -4.25F, -3.95F, -1.05F, 5, 0, 6, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.05F, 1.3F);
        this.Helmetia.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 2, 3, -0.5F, -4.0F, -7.0F, 1, 0, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.15F, 2.5F);
        this.Helmetia.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 11, -0.5F, -4.0F, -1.05F, 1, 0, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.2F, 3.0F, 3.5F);
        this.Helmetia.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 26, -0.75F, -3.95F, -7.0F, 6, 0, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.2F, 3.15F, 2.5F);
        this.Helmetia.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2502F, 0.0779F, 0.3393F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 11, -0.75F, -3.95F, -1.05F, 5, 0, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.2F, 2.05F, 1.3F);
        this.Helmetia.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2084F, -0.0651F, 0.3423F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 18, -0.75F, -3.95F, -9.0F, 5, 0, 5, 0.0F, false));

        this.Antennae1 = new AdvancedModelRenderer(this);
        this.Antennae1.setRotationPoint(0.25F, 0.35F, -6.75F);
        this.Helmetia.addChild(Antennae1);

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.25F, -0.1F, 0.25F);
        this.Antennae1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3927F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.25F, 0.0F, -3.25F, 2, 0, 3, 0.0F, true));

        this.Antennae2 = new AdvancedModelRenderer(this);
        this.Antennae2.setRotationPoint(-0.25F, 0.35F, -6.75F);
        this.Helmetia.addChild(Antennae2);

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.25F, -0.1F, 0.25F);
        this.Antennae2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -2.25F, 0.0F, -3.25F, 2, 0, 3, 0.0F, false));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(1.5F, 0.5F, -4.0F);
        this.Helmetia.addChild(LLeg1);

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, 9.5F, 7.5F);
        this.LLeg1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.2618F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 7, -0.6F, -9.7F, -8.0F, 3, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(1.5F, 0.5F, -2.0F);
        this.Helmetia.addChild(LLeg2);

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0F, 9.5F, 7.5F);
        this.LLeg2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.2618F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 7, -0.6F, -9.7F, -8.0F, 3, 0, 1, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(1.5F, 0.5F, 0.0F);
        this.Helmetia.addChild(LLeg3);

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, 9.5F, 7.5F);
        this.LLeg3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.2618F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 7, -0.6F, -9.7F, -8.0F, 3, 0, 1, 0.0F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(1.5F, 0.5F, 2.0F);
        this.Helmetia.addChild(LLeg4);

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.0F, 9.5F, 7.5F);
        this.LLeg4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.2618F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 7, -0.6F, -9.7F, -8.0F, 3, 0, 1, 0.0F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(1.5F, 0.75F, 4.0F);
        this.Helmetia.addChild(LLeg5);

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.0F, 9.5F, 1.5F);
        this.LLeg5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.2618F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, -0.6F, -9.7F, -2.0F, 2, 0, 1, 0.0F, false));

        this.LLeg6 = new AdvancedModelRenderer(this);
        this.LLeg6.setRotationPoint(0.5F, 0.75F, 5.5F);
        this.Helmetia.addChild(LLeg6);

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.0F, 9.5F, 1.5F);
        this.LLeg6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.2618F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 8, -0.6F, -9.7F, -2.0F, 2, 0, 1, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-1.5F, 0.5F, -4.0F);
        this.Helmetia.addChild(RLeg1);

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.0F, 9.5F, 7.5F);
        this.RLeg1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.2618F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 7, -2.4F, -9.7F, -8.0F, 3, 0, 1, 0.0F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-1.5F, 0.5F, -2.0F);
        this.Helmetia.addChild(RLeg2);

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.0F, 9.5F, 7.5F);
        this.RLeg2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.2618F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 7, -2.4F, -9.7F, -8.0F, 3, 0, 1, 0.0F, true));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-1.5F, 0.5F, 0.0F);
        this.Helmetia.addChild(RLeg3);

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.0F, 9.5F, 7.5F);
        this.RLeg3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.2618F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 7, -2.4F, -9.7F, -8.0F, 3, 0, 1, 0.0F, true));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-1.5F, 0.5F, 2.0F);
        this.Helmetia.addChild(RLeg4);

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0F, 9.5F, 7.5F);
        this.RLeg4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.2618F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 7, -2.4F, -9.7F, -8.0F, 3, 0, 1, 0.0F, true));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(-1.5F, 0.75F, 4.0F);
        this.Helmetia.addChild(RLeg5);

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.0F, 9.5F, 1.5F);
        this.RLeg5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.2618F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 8, -1.4F, -9.7F, -2.0F, 2, 0, 1, 0.0F, true));

        this.RLeg6 = new AdvancedModelRenderer(this);
        this.RLeg6.setRotationPoint(-0.5F, 0.75F, 5.5F);
        this.Helmetia.addChild(RLeg6);

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.0F, 9.5F, 1.5F);
        this.RLeg6.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.2618F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 8, -1.4F, -9.7F, -2.0F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Helmetia.render(f5 * 0.24F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Helmetia.render(0.02F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Helmetia.offsetY = 1.128F;

        boolean isAtBottom = false;

        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5, this.LLeg6};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3, this.RLeg4, this.RLeg5, this.RLeg6};

        if (isAtBottom) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.2F, 0.2F, -3, f2, 1);
            this.flap(LLeg1, 0.5F, -0.5F, false, 0, -0.25F, f2, 0.3F);
            this.flap(RLeg1, 0.5F, 0.5F, false, 0, 0.25F, f2, 0.3F);
            this.flap(LLeg2, 0.5F, -0.5F, false, 1.0F, -0.25F, f2, 0.3F);
            this.flap(RLeg2, 0.5F, 0.5F, false, 1.0F, 0.25F, f2, 0.3F);
            this.flap(LLeg3, 0.5F, -0.5F, false, 2.0F, -0.25F, f2, 0.3F);
            this.flap(RLeg3, 0.5F, 0.5F, false, 2.0F, 0.25F, f2, 0.3F);
            this.flap(LLeg4, 0.5F, -0.5F, false, 3.0F, -0.25F, f2, 0.3F);
            this.flap(RLeg4, 0.5F, 0.5F, false, 3.0F, 0.25F, f2, 0.3F);
            this.flap(LLeg5, 0.5F, -0.5F, false, 4.0F, -0.25F, f2, 0.3F);
            this.flap(RLeg5, 0.5F, 0.5F, false, 4.0F, 0.25F, f2, 0.3F);
            this.flap(LLeg6, 0.5F, -0.5F, false, 5.0F, -0.25F, f2, 0.3F);
            this.flap(RLeg6, 0.5F, 0.5F, false, 5.0F, 0.25F, f2, 0.3F);
            this.bob(Helmetia, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(LLeg1, 0.2F, -0.5F, false, 0, -0.25F, f2, 0.3F);
            this.flap(RLeg1, 0.2F, 0.5F, false, 0, 0.25F, f2, 0.3F);
            this.flap(LLeg2, 0.2F, -0.5F, false, 1.0F, -0.25F, f2, 0.3F);
            this.flap(RLeg2, 0.2F, 0.5F, false, 1.0F, 0.25F, f2, 0.3F);
            this.flap(LLeg3, 0.2F, -0.5F, false, 2.0F, -0.25F, f2, 0.3F);
            this.flap(RLeg3, 0.2F, 0.5F, false, 2.0F, 0.25F, f2, 0.3F);
            this.flap(LLeg4, 0.2F, -0.5F, false, 3.0F, -0.25F, f2, 0.3F);
            this.flap(RLeg4, 0.2F, 0.5F, false, 3.0F, 0.25F, f2, 0.3F);
            this.flap(LLeg5, 0.2F, -0.5F, false, 4.0F, -0.25F, f2, 0.3F);
            this.flap(RLeg5, 0.2F, 0.5F, false, 4.0F, 0.25F, f2, 0.3F);
            this.bob(Helmetia, 0.2F, 0.1F, false, f2, 1);
        }

        this.swing(Antennae1, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(Antennae2, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);
        this.flap(Antennae1, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.8F);
        this.flap(Antennae2, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.8F);

    }
}
