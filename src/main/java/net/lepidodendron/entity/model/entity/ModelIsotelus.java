package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelIsotelus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Lleg2;
    private final AdvancedModelRenderer Rleg3;
    private final AdvancedModelRenderer Rleg2;
    private final AdvancedModelRenderer Lleg1;
    private final AdvancedModelRenderer Rleg1;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer Lleg3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer Rleg4;
    private final AdvancedModelRenderer Lleg4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer Lleg5;
    private final AdvancedModelRenderer Rleg5;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer Lleg6;
    private final AdvancedModelRenderer Rleg6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer Lleg7;
    private final AdvancedModelRenderer Rleg7;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Lleg9;
    private final AdvancedModelRenderer Rleg9;
    private final AdvancedModelRenderer Rleg8;
    private final AdvancedModelRenderer Lleg8;

    public ModelIsotelus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -2.0F);

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 29, 10, -6.0F, -1.0F, -2.0F, 12, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 39, -2.0F, -1.01F, -8.0F, 4, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 35, -2.0F, -2.03F, -7.01F, 4, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 23, 0, -5.0F, -2.03F, -4.01F, 10, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 10, -6.25F, -0.25F, -1.0F, 1, 0, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 15, 5.25F, -0.25F, -1.0F, 1, 0, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 10, -0.5F, -2.02F, -6.5F, 4, 2, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 36, 0.25F, -1.0F, -7.0F, 4, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 35, -3.5F, -2.02F, -6.5F, 4, 2, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 39, -4.25F, -1.0F, -7.0F, 4, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.2217F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 18, -0.75F, -1.01F, -6.25F, 4, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.2217F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 35, -3.25F, -1.01F, -6.25F, 4, 1, 2, 0.0F, false));

        this.Lleg2 = new AdvancedModelRenderer(this);
        this.Lleg2.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.head.addChild(Lleg2);
        this.setRotateAngle(Lleg2, 0.0F, 0.0F, 0.1745F);
        this.Lleg2.cubeList.add(new ModelBox(Lleg2, 26, 47, 0.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Rleg3 = new AdvancedModelRenderer(this);
        this.Rleg3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.head.addChild(Rleg3);
        this.setRotateAngle(Rleg3, 0.0F, 0.0F, -0.1745F);
        this.Rleg3.cubeList.add(new ModelBox(Rleg3, 16, 47, -5.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Rleg2 = new AdvancedModelRenderer(this);
        this.Rleg2.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.head.addChild(Rleg2);
        this.setRotateAngle(Rleg2, 0.0F, 0.0F, -0.1745F);
        this.Rleg2.cubeList.add(new ModelBox(Rleg2, 16, 47, -5.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Lleg1 = new AdvancedModelRenderer(this);
        this.Lleg1.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.head.addChild(Lleg1);
        this.setRotateAngle(Lleg1, 0.0F, 0.0F, 0.1745F);
        this.Lleg1.cubeList.add(new ModelBox(Lleg1, 26, 47, 0.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Rleg1 = new AdvancedModelRenderer(this);
        this.Rleg1.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.head.addChild(Rleg1);
        this.setRotateAngle(Rleg1, 0.0F, 0.0F, -0.1745F);
        this.Rleg1.cubeList.add(new ModelBox(Rleg1, 16, 47, -5.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.0F, 0.0F, -7.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 5, -6.0F, 0.01F, -5.0F, 6, 0, 5, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, 0.0F, -7.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 0, 0.0F, 0.01F, -5.0F, 6, 0, 5, 0.0F, false));

        this.Lleg3 = new AdvancedModelRenderer(this);
        this.Lleg3.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.head.addChild(Lleg3);
        this.setRotateAngle(Lleg3, 0.0F, 0.0F, 0.1745F);
        this.Lleg3.cubeList.add(new ModelBox(Lleg3, 26, 47, 0.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.head.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 6, 23, -3.0F, -0.51F, 0.01F, 6, 2, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 27, 27, -5.5F, 0.24F, 0.0F, 11, 1, 2, 0.0F, false));

        this.Rleg4 = new AdvancedModelRenderer(this);
        this.Rleg4.setRotationPoint(-1.0F, 1.5F, 2.0F);
        this.body2.addChild(Rleg4);
        this.setRotateAngle(Rleg4, 0.0F, 0.0F, -0.1745F);
        this.Rleg4.cubeList.add(new ModelBox(Rleg4, 16, 47, -5.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Lleg4 = new AdvancedModelRenderer(this);
        this.Lleg4.setRotationPoint(1.0F, 1.5F, 2.0F);
        this.body2.addChild(Lleg4);
        this.setRotateAngle(Lleg4, 0.0F, 0.0F, 0.1745F);
        this.Lleg4.cubeList.add(new ModelBox(Lleg4, 26, 47, 0.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 6, 23, -2.99F, -0.5F, 0.01F, 6, 2, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 27, 27, -5.49F, 0.25F, 0.0F, 11, 1, 2, 0.0F, false));

        this.Lleg5 = new AdvancedModelRenderer(this);
        this.Lleg5.setRotationPoint(1.0F, 1.5F, 2.0F);
        this.body3.addChild(Lleg5);
        this.setRotateAngle(Lleg5, 0.0F, 0.0F, 0.1745F);
        this.Lleg5.cubeList.add(new ModelBox(Lleg5, 26, 47, 0.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Rleg5 = new AdvancedModelRenderer(this);
        this.Rleg5.setRotationPoint(-1.0F, 1.5F, 2.0F);
        this.body3.addChild(Rleg5);
        this.setRotateAngle(Rleg5, 0.0F, 0.0F, -0.1745F);
        this.Rleg5.cubeList.add(new ModelBox(Rleg5, 16, 47, -5.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 6, 23, -3.0F, -0.51F, 0.01F, 6, 2, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 27, 27, -5.5F, 0.24F, 0.0F, 11, 1, 2, 0.0F, false));

        this.Lleg6 = new AdvancedModelRenderer(this);
        this.Lleg6.setRotationPoint(1.0F, 1.5F, 2.0F);
        this.body4.addChild(Lleg6);
        this.setRotateAngle(Lleg6, 0.0F, 0.0F, 0.1745F);
        this.Lleg6.cubeList.add(new ModelBox(Lleg6, 26, 47, 0.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Rleg6 = new AdvancedModelRenderer(this);
        this.Rleg6.setRotationPoint(-1.0F, 1.5F, 2.0F);
        this.body4.addChild(Rleg6);
        this.setRotateAngle(Rleg6, 0.0F, 0.0F, -0.1745F);
        this.Rleg6.cubeList.add(new ModelBox(Rleg6, 16, 47, -5.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 6, 23, -2.99F, -0.5F, 0.01F, 6, 2, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 27, 27, -5.49F, 0.25F, 0.0F, 11, 1, 2, 0.0F, false));

        this.Lleg7 = new AdvancedModelRenderer(this);
        this.Lleg7.setRotationPoint(1.0F, 1.5F, 2.0F);
        this.body5.addChild(Lleg7);
        this.setRotateAngle(Lleg7, 0.0F, 0.0F, 0.1745F);
        this.Lleg7.cubeList.add(new ModelBox(Lleg7, 26, 47, 0.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Rleg7 = new AdvancedModelRenderer(this);
        this.Rleg7.setRotationPoint(-1.0F, 1.5F, 2.0F);
        this.body5.addChild(Rleg7);
        this.setRotateAngle(Rleg7, 0.0F, 0.0F, -0.1745F);
        this.Rleg7.cubeList.add(new ModelBox(Rleg7, 16, 47, -5.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.body5.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 29, 6, -6.0F, -1.01F, 0.0F, 12, 2, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 27, -2.5F, -1.01F, 2.0F, 5, 2, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, -10.0F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -1.0472F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 13, 7.25F, -2.0F, 8.0F, 7, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, -10.0F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.0472F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 30, -14.25F, -2.0F, 8.0F, 7, 2, 3, 0.0F, false));

        this.Lleg9 = new AdvancedModelRenderer(this);
        this.Lleg9.setRotationPoint(1.0F, 1.0F, 4.0F);
        this.tail.addChild(Lleg9);
        this.setRotateAngle(Lleg9, 0.0F, 0.0F, 0.1745F);
        this.Lleg9.cubeList.add(new ModelBox(Lleg9, 26, 47, 0.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Rleg9 = new AdvancedModelRenderer(this);
        this.Rleg9.setRotationPoint(-1.0F, 1.0F, 4.0F);
        this.tail.addChild(Rleg9);
        this.setRotateAngle(Rleg9, 0.0F, 0.0F, -0.1745F);
        this.Rleg9.cubeList.add(new ModelBox(Rleg9, 16, 47, -5.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Rleg8 = new AdvancedModelRenderer(this);
        this.Rleg8.setRotationPoint(-1.0F, 1.0F, 2.0F);
        this.tail.addChild(Rleg8);
        this.setRotateAngle(Rleg8, 0.0F, 0.0F, -0.1745F);
        this.Rleg8.cubeList.add(new ModelBox(Rleg8, 16, 47, -5.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        this.Lleg8 = new AdvancedModelRenderer(this);
        this.Lleg8.setRotationPoint(1.0F, 1.0F, 2.0F);
        this.tail.addChild(Lleg8);
        this.setRotateAngle(Lleg8, 0.0F, 0.0F, 0.1745F);
        this.Lleg8.cubeList.add(new ModelBox(Lleg8, 26, 47, 0.0F, 0.01F, -1.0F, 5, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.55F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.offsetZ = -0.09F;
        this.body.render(0.037F);
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
        this.body.offsetY = 0.65F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.Lleg1, this.Lleg2, this.Lleg3, this.Lleg4, this.Lleg5, this.Lleg6, this.Lleg7, this.Lleg8, this.Lleg9};
        AdvancedModelRenderer[] legsR = {this.Rleg1, this.Rleg2, this.Rleg3, this.Rleg4, this.Rleg5, this.Rleg6, this.Rleg7, this.Rleg8, this.Rleg9};
        AdvancedModelRenderer[] bodyF = {this.body2, this.body3, this.body4, this.body5};

        if (isAtBottom) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(Lleg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(Rleg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(Lleg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg9, 0.5F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg9, 0.5F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 1.0F);
            this.chainWave(bodyF, 0.1F, 0.0f, -3, f2, 0F);
            this.bob(body, 0.0F, 0.0F, false, f2, 1);
        } else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(Lleg1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(Rleg1, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(Lleg2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg6, 0.2F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg6, 0.2F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg7, 0.2F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg7, 0.2F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg8, 0.2F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg8, 0.2F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
            this.flap(Lleg9, 0.2F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(Rleg9, 0.2F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.05F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.5F, 0.07f, -3, f2, 0.8F);
            this.bob(body, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(antennaL, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
