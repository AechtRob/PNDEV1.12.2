package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelThylacares extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer gillright;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer gillleft;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer gillright2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer gillleft2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer gillright3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer gillleft3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer gillright4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer gillleft4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer gillright5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer gillleft5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer gillright6;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer gillleft6;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer gillright7;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer gillleft7;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer gillright8;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer gillleft8;
    private final AdvancedModelRenderer cube_r23;

    public ModelThylacares() {
        this.textureWidth = 40;
        this.textureHeight = 48;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.0F, -1.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, 0.0F, 0.0F, 3, 9, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -12.0F, -1.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -1.5F, 0.0F, -6.0F, 3, 8, 6, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.base.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 22, 7, -1.0F, -1.75F, 1.0F, 2, 3, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 14, -1.0F, -1.75F, -6.0F, 2, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 17, -1.0F, -1.75F, -5.0F, 2, 4, 6, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.1F, 0.7F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 27, -1.0F, -0.25F, 0.0F, 2, 2, 4, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.5F, 4.9F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 33, -1.0F, -0.25F, 0.0F, 2, 3, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.6F, -3.625F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 0, -1.0F, -0.25F, -1.0F, 2, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.75F, -6.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, -0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 14, 0.0F, -0.25F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.75F, -6.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 14, -1.0F, -0.25F, -1.0F, 1, 1, 1, 0.0F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.25F, 1.75F, -5.0F);
        this.body.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.2618F, 0.2618F, 0.0F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 30, 27, 0.0F, -1.5F, -4.5F, 0, 2, 5, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.25F, 1.75F, -5.0F);
        this.body.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.2618F, -0.2618F, 0.0F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 30, 27, 0.0F, -1.5F, -4.5F, 0, 2, 5, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.5F, 2.5F, -2.75F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.2182F, 0.0F, 0.0873F);
        this.legright.cubeList.add(new ModelBox(legright, 20, 33, 0.0F, -0.25F, -1.0F, 0, 3, 2, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.5F, 2.5F, -2.75F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.2182F, 0.0F, -0.0873F);
        this.legleft.cubeList.add(new ModelBox(legleft, 20, 33, 0.0F, -0.25F, -1.0F, 0, 3, 2, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.65F, 2.5F, -2.25F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 0.6545F, 0.0F, 0.1745F);
        this.legright2.cubeList.add(new ModelBox(legright2, 8, 33, 0.0F, -0.5F, -2.0F, 0, 4, 3, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.65F, 2.5F, -2.25F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.6545F, 0.0F, -0.1745F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 8, 33, 0.0F, -0.5F, -2.0F, 0, 4, 3, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.9F, 2.75F, -1.25F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.8727F, 0.0F, 0.1745F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 33, 0.0F, -0.5F, -3.0F, 0, 4, 4, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.9F, 2.75F, -1.25F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.8727F, 0.0F, -0.1745F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 33, 0.0F, -0.5F, -3.0F, 0, 4, 4, 0.0F, true));

        this.gillright = new AdvancedModelRenderer(this);
        this.gillright.setRotationPoint(-0.5F, 2.35F, 1.95F);
        this.body.addChild(gillright);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillright.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6109F, 0.6981F, 0.5236F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 14, -0.5F, -0.65F, 0.0F, 1, 3, 0, 0.0F, false));

        this.gillleft = new AdvancedModelRenderer(this);
        this.gillleft.setRotationPoint(0.5F, 2.35F, 1.95F);
        this.body.addChild(gillleft);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillleft.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6109F, -0.6981F, -0.5236F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 14, -0.5F, -0.65F, 0.0F, 1, 3, 0, 0.0F, true));

        this.gillright2 = new AdvancedModelRenderer(this);
        this.gillright2.setRotationPoint(-0.5F, 2.1F, 2.7F);
        this.body.addChild(gillright2);
        this.setRotateAngle(gillright2, 0.1745F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillright2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6109F, 0.6981F, 0.5236F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 33, -0.5F, -0.65F, 0.0F, 1, 3, 0, 0.0F, false));

        this.gillleft2 = new AdvancedModelRenderer(this);
        this.gillleft2.setRotationPoint(0.5F, 2.1F, 2.7F);
        this.body.addChild(gillleft2);
        this.setRotateAngle(gillleft2, 0.1745F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillleft2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6109F, -0.6981F, -0.5236F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 33, -0.5F, -0.65F, 0.0F, 1, 3, 0, 0.0F, true));

        this.gillright3 = new AdvancedModelRenderer(this);
        this.gillright3.setRotationPoint(-0.5F, 1.85F, 3.45F);
        this.body.addChild(gillright3);
        this.setRotateAngle(gillright3, 0.3491F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillright3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6109F, 0.6981F, 0.5236F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 33, -0.5F, -0.75F, 0.0F, 1, 3, 0, 0.0F, false));

        this.gillleft3 = new AdvancedModelRenderer(this);
        this.gillleft3.setRotationPoint(0.5F, 1.85F, 3.45F);
        this.body.addChild(gillleft3);
        this.setRotateAngle(gillleft3, 0.3491F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillleft3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6109F, -0.6981F, -0.5236F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 33, -0.5F, -0.75F, 0.0F, 1, 3, 0, 0.0F, true));

        this.gillright4 = new AdvancedModelRenderer(this);
        this.gillright4.setRotationPoint(-0.5F, 1.6F, 4.2F);
        this.body.addChild(gillright4);
        this.setRotateAngle(gillright4, 0.48F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillright4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.6109F, 0.6981F, 0.5236F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 33, -0.5F, -1.15F, 0.0F, 1, 3, 0, 0.0F, false));

        this.gillleft4 = new AdvancedModelRenderer(this);
        this.gillleft4.setRotationPoint(0.5F, 1.6F, 4.2F);
        this.body.addChild(gillleft4);
        this.setRotateAngle(gillleft4, 0.48F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillleft4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6109F, -0.6981F, -0.5236F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 33, -0.5F, -1.15F, 0.0F, 1, 3, 0, 0.0F, true));

        this.gillright5 = new AdvancedModelRenderer(this);
        this.gillright5.setRotationPoint(-0.5F, 1.25F, 4.95F);
        this.body.addChild(gillright5);
        this.setRotateAngle(gillright5, 0.7418F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillright5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6109F, 0.6981F, 0.5236F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 7, -0.5F, -1.4F, 0.0F, 1, 3, 0, 0.0F, false));

        this.gillleft5 = new AdvancedModelRenderer(this);
        this.gillleft5.setRotationPoint(0.5F, 1.25F, 4.95F);
        this.body.addChild(gillleft5);
        this.setRotateAngle(gillleft5, 0.7418F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillleft5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6109F, -0.6981F, -0.5236F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 7, -0.5F, -1.4F, 0.0F, 1, 3, 0, 0.0F, true));

        this.gillright6 = new AdvancedModelRenderer(this);
        this.gillright6.setRotationPoint(-0.5F, 0.6F, 5.2F);
        this.body.addChild(gillright6);
        this.setRotateAngle(gillright6, 0.9599F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillright6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.6109F, 0.6981F, 0.5236F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 10, -0.5F, -0.4F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillleft6 = new AdvancedModelRenderer(this);
        this.gillleft6.setRotationPoint(0.5F, 0.6F, 5.2F);
        this.body.addChild(gillleft6);
        this.setRotateAngle(gillleft6, 0.9599F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillleft6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.6109F, -0.6981F, -0.5236F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 10, -0.5F, -0.4F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillright7 = new AdvancedModelRenderer(this);
        this.gillright7.setRotationPoint(-0.5F, -0.2F, 5.2F);
        this.body.addChild(gillright7);
        this.setRotateAngle(gillright7, 1.0472F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillright7.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6109F, 0.6981F, 0.5236F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 12, -0.5F, -0.4F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillleft7 = new AdvancedModelRenderer(this);
        this.gillleft7.setRotationPoint(0.5F, -0.2F, 5.2F);
        this.body.addChild(gillleft7);
        this.setRotateAngle(gillleft7, 1.0472F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillleft7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6109F, -0.6981F, -0.5236F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 12, -0.5F, -0.4F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillright8 = new AdvancedModelRenderer(this);
        this.gillright8.setRotationPoint(-0.5F, -1.0F, 5.2F);
        this.body.addChild(gillright8);
        this.setRotateAngle(gillright8, 1.1345F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillright8.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6109F, 0.6981F, 0.5236F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 14, -0.5F, -0.4F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillleft8 = new AdvancedModelRenderer(this);
        this.gillleft8.setRotationPoint(0.5F, -1.0F, 5.2F);
        this.body.addChild(gillleft8);
        this.setRotateAngle(gillleft8, 1.1345F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gillleft8.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6109F, -0.6981F, -0.5236F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 34, 14, -0.5F, -0.4F, 0.0F, 1, 2, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5 );
    }
    public void renderStaticDisplayCase(float f) {
        this.base.offsetZ = -0.05F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
        this.base.offsetY = -0.08F;
        this.base.offsetZ = -0.01F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -2.0F;
        this.base.offsetX = -1.338F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.63F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

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


        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(antennaleft, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaright, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(antennaleft, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaright, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);



            float tailVdegree = 0.12F;
            float tailHdegree = 0.3F;
//            this.chainWave(Tail, speed*0.5F, tailVdegree, 2, f2, 1);


            float speedLeg = 1.1F;
            float degreeLeg = -0.1F;
            this.flap(legleft, speedLeg, -degreeLeg, false, 0, -0.0F, f2, 0.7F);
            this.flap(legright, speedLeg, degreeLeg, false, 0, 0.0F, f2, 0.7F);
            this.flap(legleft2, speedLeg, -degreeLeg, false, 0.5F, -0.0F, f2, 0.7F);
            this.flap(legright2, speedLeg, degreeLeg, false, 0.5F, 0.0F, f2, 0.7F);
            this.flap(legleft3, speedLeg, -degreeLeg, false, 1.0F, -0.0F, f2, 0.7F);
            this.flap(legright3, speedLeg, degreeLeg, false, 1.0F, 0.0F, f2, 0.7F);
            this.flap(gillleft, speedLeg, -degreeLeg, false, 1.5F, -0.0F, f2, 0.7F);
            this.flap(gillright, speedLeg, degreeLeg, false, 1.5F, 0.0F, f2, 0.7F);
            this.flap(gillleft2, speedLeg, -degreeLeg, false, 2.0F, -0.0F, f2, 0.7F);
            this.flap(gillright2, speedLeg, degreeLeg, false, 2.0F, 0.0F, f2, 0.7F);
            this.flap(gillleft3, speedLeg, -degreeLeg, false, 2.5F, -0.0F, f2, 0.7F);
            this.flap(gillright3, speedLeg, degreeLeg, false, 2.5F, 0.0F, f2, 0.7F);
            this.flap(gillleft4, speedLeg, -degreeLeg, false, 3.0F, -0.0F, f2, 0.7F);
            this.flap(gillright4, speedLeg, degreeLeg, false, 3.0F, 0.0F, f2, 0.7F);
            this.flap(gillleft5, speedLeg, -degreeLeg, false, 3.5F, -0.0F, f2, 0.7F);
            this.flap(gillright5, speedLeg, degreeLeg, false, 3.5F, 0.0F, f2, 0.7F);
            this.flap(gillleft6, speedLeg, -degreeLeg, false, 4.0F, -0.0F, f2, 0.7F);
            this.flap(gillright6, speedLeg, degreeLeg, false, 4.0F, 0F, f2, 0.7F);
            this.flap(gillleft7, speedLeg, -degreeLeg, false, 4.5F, -0.0F, f2, 0.7F);
            this.flap(gillright7, speedLeg, degreeLeg, false, 4.5F, 0.0F, f2, 0.7F);
            this.flap(gillleft8, speedLeg, -degreeLeg, false, 5.0F, -0.0F, f2, 0.7F);
            this.flap(gillright8, speedLeg, degreeLeg, false, 5.0F, 0.0F, f2, 0.7F);
            if (!e.isInWater()) {
//                this.base.offsetY = 0.4F;
                this.base.rotateAngleZ = (float) Math.toRadians(90);
            }


                if (f3 == 0.0F) {
                    this.bob(base, -speed, 0.3F, false, f2, 2);

                }
                else
                {
                    this.bob(base, -speed, 1F, false, f2, 2);
                }

        }
    }
}
