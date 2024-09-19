package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAeger extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer antennaL1;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaR3;
    private final AdvancedModelRenderer antennaL3;
    private final AdvancedModelRenderer antennaR1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer pleopodL;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer pleopodR;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pleopodL2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer pleopodR2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pleopodL3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pleopodR3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pleopodL4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pleopodR4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer pleopodR5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pleopodL5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tailfanL;
    private final AdvancedModelRenderer tailfanR;



    public ModelAeger() {

        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 20.55F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 28, 41, -1.5F, -3.0F, -6.5F, 3, 1, 5, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 32, 32, -1.5F, -6.0F, -7.0F, 3, 3, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 49, 40, -1.5F, -6.0F, -8.0F, 3, 2, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 7, 6, -0.5F, -6.0F, -12.0F, 1, 0, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 9, 9, -1.0F, -6.0F, -9.0F, 2, 0, 1, 0.0F, false));

        this.antennaL1 = new AdvancedModelRenderer(this);
        this.antennaL1.setRotationPoint(0.0F, -4.4F, -7.5F);
        this.bone.addChild(antennaL1);
        this.setRotateAngle(antennaL1, 0.0873F, 0.4363F, 0.0F);
        this.antennaL1.cubeList.add(new ModelBox(antennaL1, 2, 0, -0.75F, 0.0F, -14.0F, 1, 0, 14, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(0.0F, -4.25F, -7.5F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.1309F, 0.2182F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 4, 0, -1.0F, 0.0F, -4.0F, 1, 0, 4, 0.0F, false));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(0.0F, -4.25F, -7.5F);
        this.bone.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.1309F, -0.2182F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 2, 0, 0.0F, 0.0F, -4.0F, 1, 0, 4, 0.0F, false));

        this.antennaR3 = new AdvancedModelRenderer(this);
        this.antennaR3.setRotationPoint(1.0F, -4.05F, -7.5F);
        this.bone.addChild(antennaR3);
        this.setRotateAngle(antennaR3, 0.0873F, 0.0F, 0.0F);
        this.antennaR3.cubeList.add(new ModelBox(antennaR3, 22, 0, -0.25F, 0.0F, -6.0F, 11, 0, 28, 0.0F, false));

        this.antennaL3 = new AdvancedModelRenderer(this);
        this.antennaL3.setRotationPoint(-1.0F, -4.05F, -7.5F);
        this.bone.addChild(antennaL3);
        this.setRotateAngle(antennaL3, 0.0873F, 0.0F, 0.0F);
        this.antennaL3.cubeList.add(new ModelBox(antennaL3, 0, 0, -10.75F, 0.0F, -6.0F, 11, 0, 28, 0.0F, false));

        this.antennaR1 = new AdvancedModelRenderer(this);
        this.antennaR1.setRotationPoint(0.0F, -4.4F, -7.5F);
        this.bone.addChild(antennaR1);
        this.setRotateAngle(antennaR1, 0.0873F, -0.4363F, 0.0F);
        this.antennaR1.cubeList.add(new ModelBox(antennaR1, 0, 0, -0.25F, 0.0F, -14.0F, 1, 0, 14, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(0.75F, -3.65F, -6.75F);
        this.bone.addChild(legR1);
        this.setRotateAngle(legR1, 0.1745F, -0.3927F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 38, 24, 0.0F, -0.5F, -5.0F, 0, 1, 5, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(-0.75F, -3.65F, -6.75F);
        this.bone.addChild(legL1);
        this.setRotateAngle(legL1, 0.1745F, 0.3927F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 38, 23, 0.0F, -0.5F, -5.0F, 0, 1, 5, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(-1.0F, -2.65F, -6.25F);
        this.bone.addChild(legL2);
        this.setRotateAngle(legL2, -0.0873F, 0.0873F, 0.6981F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 12, 0.0F, -0.5F, -10.0F, 0, 8, 10, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(-0.75F, -2.4F, -4.5F);
        this.bone.addChild(legL3);
        this.setRotateAngle(legL3, 0.0436F, 0.1745F, 0.8727F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 21, 0.0F, -0.5F, -9.0F, 0, 10, 9, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(-0.5F, -2.65F, -5.25F);
        this.bone.addChild(legL4);
        this.setRotateAngle(legL4, 0.6545F, 0.1309F, 0.2618F);
        this.legL4.cubeList.add(new ModelBox(legL4, 30, 42, 0.0F, -0.5F, -5.0F, 0, 5, 5, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(0.5F, -2.65F, -5.25F);
        this.bone.addChild(legR4);
        this.setRotateAngle(legR4, 0.6545F, -0.1309F, -0.2618F);
        this.legR4.cubeList.add(new ModelBox(legR4, 10, 42, 0.0F, -0.5F, -5.0F, 0, 5, 5, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(-0.25F, -2.65F, -4.25F);
        this.bone.addChild(legL5);
        this.setRotateAngle(legL5, 0.9599F, 0.0873F, 0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 20, 42, 0.0F, -0.5F, -5.0F, 0, 5, 5, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(-0.75F, -2.65F, -2.25F);
        this.bone.addChild(legL6);
        this.setRotateAngle(legL6, -0.1745F, 0.0F, 0.7418F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 35, 0.0F, -0.5F, -5.0F, 0, 9, 5, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(0.75F, -2.65F, -2.25F);
        this.bone.addChild(legR6);
        this.setRotateAngle(legR6, -0.1745F, 0.0F, -0.7418F);
        this.legR6.cubeList.add(new ModelBox(legR6, 18, 0, 0.0F, -0.5F, -5.0F, 0, 9, 5, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(-0.5F, -2.65F, -1.25F);
        this.bone.addChild(legL7);
        this.setRotateAngle(legL7, 0.4363F, 0.0F, 0.6981F);
        this.legL7.cubeList.add(new ModelBox(legL7, 18, 33, 0.0F, -0.5F, -5.0F, 0, 9, 5, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(0.5F, -2.65F, -1.25F);
        this.bone.addChild(legR7);
        this.setRotateAngle(legR7, 0.4363F, 0.0F, -0.6981F);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 0, 0.0F, -0.5F, -5.0F, 0, 9, 5, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(0.25F, -2.65F, -4.25F);
        this.bone.addChild(legR5);
        this.setRotateAngle(legR5, 0.9599F, -0.0873F, -0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 39, 36, 0.0F, -0.5F, -5.0F, 0, 5, 5, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(0.75F, -2.4F, -4.5F);
        this.bone.addChild(legR3);
        this.setRotateAngle(legR3, 0.0436F, -0.1745F, -0.8727F);
        this.legR3.cubeList.add(new ModelBox(legR3, 20, 19, 0.0F, -0.5F, -9.0F, 0, 10, 9, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(1.0F, -2.65F, -6.25F);
        this.bone.addChild(legR2);
        this.setRotateAngle(legR2, -0.0873F, -0.0873F, -0.6981F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 4, 0.0F, -0.5F, -10.0F, 0, 8, 10, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(0.0F, -4.5F, -7.5F);
        this.bone.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, 0.2182F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 49, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(0.0F, -4.5F, -7.5F);
        this.bone.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, -0.2182F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 48, 43, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.9F, -1.5F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, 0.1309F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 42, 46, -1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

        this.pleopodL = new AdvancedModelRenderer(this);
        this.pleopodL.setRotationPoint(-0.5F, 4.0F, 1.0F);
        this.body1.addChild(pleopodL);
        this.setRotateAngle(pleopodL, 0.0F, 0.0F, 0.2182F);
        this.pleopodL.cubeList.add(new ModelBox(pleopodL, 40, 47, -0.5F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.pleopodL.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 42, -1.0F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.pleopodR = new AdvancedModelRenderer(this);
        this.pleopodR.setRotationPoint(0.5F, 4.0F, 1.0F);
        this.body1.addChild(pleopodR);
        this.setRotateAngle(pleopodR, 0.0F, 0.0F, -0.2182F);
        this.pleopodR.cubeList.add(new ModelBox(pleopodR, 28, 42, -0.5F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.pleopodR.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 38, 0.0F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 44, 30, -0.99F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

        this.pleopodL2 = new AdvancedModelRenderer(this);
        this.pleopodL2.setRotationPoint(-0.5F, 4.0F, 1.0F);
        this.body2.addChild(pleopodL2);
        this.setRotateAngle(pleopodL2, 0.0F, 0.0F, 0.2182F);
        this.pleopodL2.cubeList.add(new ModelBox(pleopodL2, 28, 38, -0.5F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.pleopodL2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 34, -1.0F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.pleopodR2 = new AdvancedModelRenderer(this);
        this.pleopodR2.setRotationPoint(0.5F, 4.0F, 1.0F);
        this.body2.addChild(pleopodR2);
        this.setRotateAngle(pleopodR2, 0.0F, 0.0F, -0.2182F);
        this.pleopodR2.cubeList.add(new ModelBox(pleopodR2, 18, 30, -0.5F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.pleopodR2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 0, 0.0F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 10, 40, -1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

        this.pleopodL3 = new AdvancedModelRenderer(this);
        this.pleopodL3.setRotationPoint(-0.5F, 4.0F, 1.0F);
        this.body3.addChild(pleopodL3);
        this.setRotateAngle(pleopodL3, 0.0F, 0.0F, 0.2182F);
        this.pleopodL3.cubeList.add(new ModelBox(pleopodL3, 12, 10, -0.5F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.pleopodL3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 10, -1.0F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.pleopodR3 = new AdvancedModelRenderer(this);
        this.pleopodR3.setRotationPoint(0.5F, 4.0F, 1.0F);
        this.body3.addChild(pleopodR3);
        this.setRotateAngle(pleopodR3, 0.0F, 0.0F, -0.2182F);
        this.pleopodR3.cubeList.add(new ModelBox(pleopodR3, 2, 0, -0.5F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.pleopodR3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0873F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 20, 20, -0.99F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

        this.pleopodL4 = new AdvancedModelRenderer(this);
        this.pleopodL4.setRotationPoint(-0.5F, 4.0F, 1.0F);
        this.body4.addChild(pleopodL4);
        this.setRotateAngle(pleopodL4, 0.0F, 0.0F, 0.2182F);
        this.pleopodL4.cubeList.add(new ModelBox(pleopodL4, 50, 47, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.pleopodL4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 36, -1.0F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.pleopodR4 = new AdvancedModelRenderer(this);
        this.pleopodR4.setRotationPoint(0.5F, 4.0F, 1.0F);
        this.body4.addChild(pleopodR4);
        this.setRotateAngle(pleopodR4, 0.0F, 0.0F, -0.2182F);
        this.pleopodR4.cubeList.add(new ModelBox(pleopodR4, 50, 28, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.pleopodR4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 43, 0.0F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.0873F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 20, 14, -1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

        this.pleopodR5 = new AdvancedModelRenderer(this);
        this.pleopodR5.setRotationPoint(0.5F, 4.0F, 1.0F);
        this.body5.addChild(pleopodR5);
        this.setRotateAngle(pleopodR5, 0.0F, 0.0F, -0.2182F);
        this.pleopodR5.cubeList.add(new ModelBox(pleopodR5, 0, 49, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.pleopodR5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 6, 0.0F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.pleopodL5 = new AdvancedModelRenderer(this);
        this.pleopodL5.setRotationPoint(-0.5F, 4.0F, 1.0F);
        this.body5.addChild(pleopodL5);
        this.setRotateAngle(pleopodL5, 0.0F, 0.0F, 0.2182F);
        this.pleopodL5.cubeList.add(new ModelBox(pleopodL5, 7, 49, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.pleopodL5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 49, -1.0F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.2182F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 18, 0, -0.99F, 0.0F, 0.0F, 2, 3, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.49F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tailfanL = new AdvancedModelRenderer(this);
        this.tailfanL.setRotationPoint(0.25F, 0.35F, 0.0F);
        this.tail.addChild(tailfanL);
        this.setRotateAngle(tailfanL, -0.1745F, 0.5672F, 0.0F);
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 19, 15, -0.49F, 0.0F, -0.25F, 1, 0, 1, 0.0F, false));
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 19, 14, -0.49F, 0.0F, 3.75F, 1, 0, 1, 0.0F, false));
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 7, 3, -0.99F, 0.0F, 0.75F, 2, 0, 3, 0.0F, false));

        this.tailfanR = new AdvancedModelRenderer(this);
        this.tailfanR.setRotationPoint(-0.25F, 0.35F, 0.0F);
        this.tail.addChild(tailfanR);
        this.setRotateAngle(tailfanR, -0.1745F, -0.5672F, 0.0F);
        this.tailfanR.cubeList.add(new ModelBox(tailfanR, 17, 1, -0.51F, 0.0F, -0.25F, 1, 0, 1, 0.0F, false));
        this.tailfanR.cubeList.add(new ModelBox(tailfanR, 17, 0, -0.51F, 0.0F, 3.75F, 1, 0, 1, 0.0F, false));
        this.tailfanR.cubeList.add(new ModelBox(tailfanR, 7, 0, -1.01F, 0.0F, 0.75F, 2, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(bone, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body4, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body5, -0.1F, 0.0F, 0.0F);
        this.bone.offsetZ = -0.0F;
        this.bone.offsetY = -0.0F;
        this.bone.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = 0.7F;
        this.bone.offsetX = 0.1F;
        this.bone.rotateAngleY = (float) Math.toRadians(210);
        this.bone.rotateAngleX = (float) Math.toRadians(8);
        this.bone.rotateAngleZ = (float) Math.toRadians(-4);
        this.bone.scaleChildren = true;
        float scaler = 0.575F;
        this.bone.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(bone, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
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
        //this.bone.offsetY = 1.25F;

        AdvancedModelRenderer[] Tail = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.4F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(antennaL1, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaR1, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(antennaL1, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaR1, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaL2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
            this.walk(antennaR2, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
            this.flap(antennaL3, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaR3, 0.3F, 0.2F, true, 0f, 0.2f, f2, 1F);

            this.swing(antennaL3, 0.3F, 0.15F, false, -2f, 0f, f2, 1F);
            this.swing(antennaR3, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            float tailVdegree = 0.03F;
            float speedLeg = 1.2F;
            float degreeLeg = 0.45F;
            float degreeFront = (float) Math.toRadians(27.5);

            if(e.isInWater()) {
                this.chainWave(Tail, speed * 0.65F, tailVdegree, -2, f2, 1);
                this.flap(legL1, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
                this.flap(legR1, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
                /*this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
                this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
                this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
                this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);

                this.flap(legL4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
                this.flap(legR4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.flap(legL5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
                this.flap(legR5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
                this.flap(legL6, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
                this.flap(legR6, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
                this.flap(legL7, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
                this.flap(legR7, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
                */


                this.walk(legL1, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
                this.walk(legR1, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
                this.walk(legL2, speedLeg * 0.5F, -degreeFront, false, 0.5F, 0.5F, f2, 0.7F);
                this.walk(legR2, speedLeg * 0.5F, degreeFront, false, 3F, 0.5F, f2, 0.7F);
                this.walk(legL3, speedLeg * 0.5F, -degreeFront, false, 3.0F, 0.5F, f2, 0.7F);
                this.walk(legR3, speedLeg * 0.5F, degreeFront, false, 0.5F, 0.5F, f2, 0.7F);
                this.walk(legL4, speedLeg, -degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.walk(legR4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.walk(legL5, speedLeg, -degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
                this.walk(legR5, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
                this.walk(legL6, speedLeg, -degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
                this.walk(legR6, speedLeg, degreeLeg, false, 3F, 0.5F, f2, 0.7F);
                this.walk(legL7, speedLeg, -degreeLeg, false, 3F, 0.5F, f2, 0.7F);
                this.walk(legR7, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodL, speedLeg, -degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodR, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodL2, speedLeg, -degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodR2, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodL3, speedLeg, -degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodR3, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodL4, speedLeg, -degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodR4, speedLeg, degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodL5, speedLeg, -degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodR5, speedLeg, degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);
            } else {
                this.walk(legL2, speedLeg * 0.2F, -degreeFront, false, 0.5F, 0.5F, f2, 0.7F);
                this.walk(legR2, speedLeg * 0.2F, degreeFront, false, 3F, 0.5F, f2, 0.7F);
                this.walk(legL3, speedLeg * 0.2F, -degreeFront, false, 3.0F, 0.5F, f2, 0.7F);
                this.walk(legR3, speedLeg * 0.2F, degreeFront, false, 0.5F, 0.5F, f2, 0.7F);
                this.walk(legL4, speedLeg * 0.2F, -degreeLeg * 0.2F, false, 1.5F, 0.5F, f2, 0.7F);
                this.walk(legR4, speedLeg * 0.2F, degreeLeg * 0.2F, false, 1.5F, 0.5F, f2, 0.7F);
                this.walk(legL5, speedLeg * 0.2F, -degreeLeg * 0.2F, false, 2.5F, 0.5F, f2, 0.7F);
                this.walk(legR5, speedLeg * 0.2F, degreeLeg * 0.2F, false, 2.5F, 0.5F, f2, 0.7F);
                this.walk(legL6, speedLeg * 0.2F, -degreeLeg * 0.2F, false, 3F, 0.5F, f2, 0.7F);
                this.walk(legR6, speedLeg * 0.2F, degreeLeg * 0.2F, false, 3F, 0.5F, f2, 0.7F);
                this.walk(legL7, speedLeg * 0.2F, -degreeLeg * 0.2F, true, 5.5F, 0.5F, f2, 0.7F);
                this.walk(legR7, speedLeg * 0.2F, degreeLeg * 0.2F, true, 5.5F, 0.5F, f2, 0.7F);
            }

            if (!e.isInWater()) {
                //this.bone.offsetY = 1.25F;
                this.bone.rotateAngleZ = (float)Math.toRadians(90);
                this.antennaL3.rotateAngleZ = (float)Math.toRadians(90);
                this.antennaR3.rotateAngleZ = -(float)Math.toRadians(90);
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(bone, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(bone, -speed, 1F, false, f2, 2);
                }
            }
        }
    }
}
