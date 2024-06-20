package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelMimetaster extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Rswimleg5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Rswimleg4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Rswimleg3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Rswimleg2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Rswimleg1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Lswimleg5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Lswimleg4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Lswimleg3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Lswimleg2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Lswimleg1;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leg2R;
    private final AdvancedModelRenderer leg2L;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer sponge;


    public ModelMimetaster() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 15, 20, -1.5F, -3.0F, -4.0F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 24, -1.0F, -2.35F, 3.75F, 2, 1, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 24, -1.0F, -2.35F, 3.5F, 2, 1, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 23, -1.0F, -2.35F, 3.25F, 2, 1, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -1.0F, -2.35F, 3.0F, 2, 1, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -1.0F, -2.35F, 2.75F, 2, 1, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -1.0F, -2.35F, 2.5F, 2, 1, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 12, -1.0F, -2.35F, 2.25F, 2, 1, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 25, -0.5F, -2.35F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 24, -1.0F, -2.25F, -4.1F, 2, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0472F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, -8.25F, -2.7F, -2.5F, 8, 0, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.0472F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 6, 0.25F, -2.7F, -2.5F, 8, 0, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1309F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 9, 1.5F, -2.7F, -4.0F, 7, 0, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 6, -0.5F, -2.75F, -10.25F, 3, 0, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 13, -2.5F, -2.75F, -10.25F, 3, 0, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1309F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 16, -8.5F, -2.7F, -4.0F, 7, 0, 3, 0.0F, false));

        this.Rswimleg5 = new AdvancedModelRenderer(this);
        this.Rswimleg5.setRotationPoint(-0.5F, -1.75F, 1.25F);
        this.body.addChild(Rswimleg5);
        this.setRotateAngle(Rswimleg5, 0.0F, 0.8727F, 0.0F);
        this.Rswimleg5.cubeList.add(new ModelBox(Rswimleg5, 0, 6, -2.0F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rswimleg5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 31, -3.0F, -0.2F, 0.1F, 3, 2, 0, 0.0F, false));

        this.Rswimleg4 = new AdvancedModelRenderer(this);
        this.Rswimleg4.setRotationPoint(-0.5F, -1.75F, 1.0F);
        this.body.addChild(Rswimleg4);
        this.setRotateAngle(Rswimleg4, 0.0F, 0.6981F, 0.0F);
        this.Rswimleg4.cubeList.add(new ModelBox(Rswimleg4, 16, 30, -3.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rswimleg4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 12, -3.0F, -0.2F, 0.1F, 3, 2, 0, 0.0F, false));

        this.Rswimleg3 = new AdvancedModelRenderer(this);
        this.Rswimleg3.setRotationPoint(-0.5F, -1.75F, 0.75F);
        this.body.addChild(Rswimleg3);
        this.setRotateAngle(Rswimleg3, 0.0F, 0.4363F, 0.0F);
        this.Rswimleg3.cubeList.add(new ModelBox(Rswimleg3, 22, 30, -3.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rswimleg3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3491F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 3, -4.0F, -0.2F, 0.1F, 4, 2, 0, 0.0F, false));

        this.Rswimleg2 = new AdvancedModelRenderer(this);
        this.Rswimleg2.setRotationPoint(-0.5F, -1.75F, 0.5F);
        this.body.addChild(Rswimleg2);
        this.setRotateAngle(Rswimleg2, 0.0F, 0.1309F, 0.0F);
        this.Rswimleg2.cubeList.add(new ModelBox(Rswimleg2, 14, 25, -4.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rswimleg2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 28, -4.0F, -0.2F, 0.1F, 4, 2, 0, 0.0F, false));

        this.Rswimleg1 = new AdvancedModelRenderer(this);
        this.Rswimleg1.setRotationPoint(-0.5F, -1.75F, 0.25F);
        this.body.addChild(Rswimleg1);
        this.setRotateAngle(Rswimleg1, 0.0F, -0.1745F, 0.0F);
        this.Rswimleg1.cubeList.add(new ModelBox(Rswimleg1, 25, 20, -4.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rswimleg1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 28, -4.0F, -0.2F, 0.1F, 4, 2, 0, 0.0F, false));

        this.Lswimleg5 = new AdvancedModelRenderer(this);
        this.Lswimleg5.setRotationPoint(0.5F, -1.75F, 1.25F);
        this.body.addChild(Lswimleg5);
        this.setRotateAngle(Lswimleg5, 0.0F, -0.8727F, 0.0F);
        this.Lswimleg5.cubeList.add(new ModelBox(Lswimleg5, 0, 9, 0.0F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lswimleg5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 14, 0.0F, -0.2F, 0.1F, 3, 2, 0, 0.0F, false));

        this.Lswimleg4 = new AdvancedModelRenderer(this);
        this.Lswimleg4.setRotationPoint(0.5F, -1.75F, 1.0F);
        this.body.addChild(Lswimleg4);
        this.setRotateAngle(Lswimleg4, 0.0F, -0.6981F, 0.0F);
        this.Lswimleg4.cubeList.add(new ModelBox(Lswimleg4, 30, 25, 0.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lswimleg4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 16, 0.0F, -0.2F, 0.1F, 3, 2, 0, 0.0F, false));

        this.Lswimleg3 = new AdvancedModelRenderer(this);
        this.Lswimleg3.setRotationPoint(0.5F, -1.75F, 0.75F);
        this.body.addChild(Lswimleg3);
        this.setRotateAngle(Lswimleg3, 0.0F, -0.4363F, 0.0F);
        this.Lswimleg3.cubeList.add(new ModelBox(Lswimleg3, 28, 30, 0.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lswimleg3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 29, 0.0F, -0.2F, 0.1F, 4, 2, 0, 0.0F, false));

        this.Lswimleg2 = new AdvancedModelRenderer(this);
        this.Lswimleg2.setRotationPoint(0.5F, -1.75F, 0.5F);
        this.body.addChild(Lswimleg2);
        this.setRotateAngle(Lswimleg2, 0.0F, -0.1309F, 0.0F);
        this.Lswimleg2.cubeList.add(new ModelBox(Lswimleg2, 22, 25, 0.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lswimleg2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3491F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 23, 0.0F, -0.2F, 0.1F, 4, 2, 0, 0.0F, false));

        this.Lswimleg1 = new AdvancedModelRenderer(this);
        this.Lswimleg1.setRotationPoint(0.5F, -1.75F, 0.25F);
        this.body.addChild(Lswimleg1);
        this.setRotateAngle(Lswimleg1, 0.0F, 0.1745F, 0.0F);
        this.Lswimleg1.cubeList.add(new ModelBox(Lswimleg1, 27, 0, 0.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lswimleg1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 30, 0.0F, -0.2F, 0.1F, 4, 2, 0, 0.0F, false));

        this.leg2R = new AdvancedModelRenderer(this);
        this.leg2R.setRotationPoint(-1.0F, -1.75F, -1.0F);
        this.body.addChild(leg2R);
        this.setRotateAngle(leg2R, 0.0F, -0.4363F, -0.2618F);
        this.leg2R.cubeList.add(new ModelBox(leg2R, 0, 6, -6.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, false));

        this.leg2L = new AdvancedModelRenderer(this);
        this.leg2L.setRotationPoint(1.0F, -1.75F, -1.0F);
        this.body.addChild(leg2L);
        this.setRotateAngle(leg2L, 0.0F, 0.4363F, 0.2618F);
        this.leg2L.cubeList.add(new ModelBox(leg2L, 0, 11, 0.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.5F, -2.3F, -2.0F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.2618F, 0.1309F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 19, 0.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(6.5F, 0.0F, 0.0F);
        this.legL1.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -1.2217F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 0, 0.0F, 0.01F, -0.5F, 12, 0, 3, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.5F, -2.3F, -2.0F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.2618F, -0.1309F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 23, -7.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-6.5F, 0.0F, 0.0F);
        this.legR1.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 1.2217F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 3, -12.0F, 0.01F, -0.5F, 12, 0, 3, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.1F, -1.75F, -4.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.1745F, -0.8727F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 19, 12, 0.0F, -0.01F, -4.0F, 4, 0, 4, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.1F, -1.75F, -4.0F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.1745F, 0.8727F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 19, 16, -4.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(1.0F, -3.0F, -3.0F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.8727F, -1.0472F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 0, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-1.0F, -3.0F, -3.0F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.8727F, 1.0472F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 3, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.sponge = new AdvancedModelRenderer(this);
        this.sponge.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(sponge);
        this.sponge.cubeList.add(new ModelBox(sponge, 0, 33, -7.0F, -3.1F, -8.0F, 14, 0, 14, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.22F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {

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
        this.body.offsetY = 1.15F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        this.eyeL.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.eyeL.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.eyeR.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.eyeR.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;

        AdvancedModelRenderer[] armsL = {this.legL1, this.legL2};
        AdvancedModelRenderer[] armsR = {this.legR1, this.legR2};
        AdvancedModelRenderer[] legsL = {this.leg2L};
        AdvancedModelRenderer[] legsR = {this.leg2R};

        float move = 1;
        if (f3 == 0) { move = 0; }
        if (isAtBottom) {move = move * 0.33F;}
        //swim legs:
        float speedLeg = 1.5F * move;
        float degreeLeg = 0.3F * move;
        float weightLeg = -0.5F * move;
        this.flap(Lswimleg1, speedLeg, -degreeLeg, false, 0, -weightLeg, f2, 0.7F);
        this.flap(Rswimleg1, speedLeg, degreeLeg, false, 0, weightLeg, f2, 0.7F);
        this.flap(Lswimleg2, speedLeg, -degreeLeg, false, 0.5F, -weightLeg, f2, 0.7F);
        this.flap(Rswimleg2, speedLeg, degreeLeg, false, 0.5F, weightLeg, f2, 0.7F);
        this.flap(Lswimleg3, speedLeg, -degreeLeg, false, 1.0F, -weightLeg, f2, 0.7F);
        this.flap(Rswimleg3, speedLeg, degreeLeg, false, 1.0F, weightLeg, f2, 0.7F);
        this.flap(Lswimleg4, speedLeg, -degreeLeg, false, 1.5F, -weightLeg, f2, 0.7F);
        this.flap(Rswimleg4, speedLeg, degreeLeg, false, 1.5F, weightLeg, f2, 0.7F);
        this.flap(Lswimleg5, speedLeg, -degreeLeg, false, 2.0F, -weightLeg, f2, 0.7F);
        this.flap(Rswimleg5, speedLeg, degreeLeg, false, 2.0F, weightLeg, f2, 0.7F);

        if (isAtBottom) {
            this.bob(body, 0.5F, 0.02F, true, f2, 0.5F);
            if (f3 != 0) {
                this.chainSwing(armsL, 0.35F, -0.2F, 1, f2, 0.6F);
                this.chainSwing(armsR, 0.35F, 0.2F, 1, f2, 0.6F);
                this.chainWave(legsL, 0.30F, 0.4F, -3, f2, 1);
                this.chainWave(legsR, 0.30F, 0.4F, -3, f2, 1);
            }
            else {
                this.chainSwing(armsL, 0.2F, -0.1F, 1, f2, 0.4F);
                this.chainSwing(armsR, 0.2F, 0.1F, 1, f2, 0.4F);
                this.chainWave(legsL, 0.25F, 0.13F, -3, f2, 0.5F);
                this.chainWave(legsR, 0.25F, 0.13F, -3, f2, 0.5F);
            }
        }
        else { //is Swimming
            this.bob(body, 0.22F, 0.16F, false, f2, 0.8F);
            this.chainSwing(armsL, 0.4F, -0.25F, 1, f2, 0.6F);
            this.chainSwing(armsR, 0.4F, 0.25F, 1, f2, 0.6F);
            this.chainWave(legsL, 0.35F, 0.4F, -3, f2, 1);
            this.chainWave(legsR, 0.35F, 0.4F, -3, f2, 1);
            this.flap(legL1, 0.25F, -0.2F, false, 2.0F, -0.2F, f2, 0.3F);
            this.flap(legR1, 0.25F, 0.2F, false, 2.0F, 0.2F, f2, 0.3F);
        }

        this.swing(antennaL, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.4F, 0.2F, false, 0.5F, 0.1F, f2, 0.8F);
        this.walk(antennaL, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
        this.walk(antennaR, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);

    }
}
