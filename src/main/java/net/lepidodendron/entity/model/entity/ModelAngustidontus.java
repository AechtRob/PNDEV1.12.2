package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAngustidontus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAngustidontus extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer antennaR3;
    private final AdvancedModelRenderer antennaL3;
    private final AdvancedModelRenderer antennaR1;
    private final AdvancedModelRenderer antennaL1;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armsR;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armsL;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer armR4;
    private final AdvancedModelRenderer armL4;
    private final AdvancedModelRenderer armR5;
    private final AdvancedModelRenderer armL5;
    private final AdvancedModelRenderer armR6;
    private final AdvancedModelRenderer armL6;
    private final AdvancedModelRenderer armR7;
    private final AdvancedModelRenderer armL7;
    private final AdvancedModelRenderer armR8;
    private final AdvancedModelRenderer armL8;

    private ModelAnimator animator;

    public ModelAngustidontus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 22.55F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 26, -1.5F, -5.9F, -4.65F, 3, 3, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, -2.5F, -6.35F, -7.25F, 5, 0, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -3.0F, -6.35F, -6.25F, 6, 6, 11, 0.0F, false));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-1.25F, -3.75F, -5.5F);
        this.bone.addChild(antennaR2);
        this.setRotateAngle(antennaR2, -0.1745F, 0.0436F, -1.2654F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 0, 9, 0.0F, -2.5F, -8.0F, 0, 4, 8, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(1.25F, -3.75F, -5.5F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, -0.1745F, -0.0436F, 1.2654F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 9, 0.0F, -2.5F, -8.0F, 0, 4, 8, 0.0F, true));

        this.antennaR3 = new AdvancedModelRenderer(this);
        this.antennaR3.setRotationPoint(-0.5F, -2.25F, -6.5F);
        this.bone.addChild(antennaR3);
        this.setRotateAngle(antennaR3, 0.0F, 0.1745F, 0.0F);
        this.antennaR3.cubeList.add(new ModelBox(antennaR3, 0, 26, -2.0F, 0.0F, -5.5F, 2, 0, 7, 0.0F, false));

        this.antennaL3 = new AdvancedModelRenderer(this);
        this.antennaL3.setRotationPoint(0.5F, -2.25F, -6.5F);
        this.bone.addChild(antennaL3);
        this.setRotateAngle(antennaL3, 0.0F, -0.1745F, 0.0F);
        this.antennaL3.cubeList.add(new ModelBox(antennaL3, 0, 26, 0.0F, 0.0F, -5.5F, 2, 0, 7, 0.0F, true));

        this.antennaR1 = new AdvancedModelRenderer(this);
        this.antennaR1.setRotationPoint(-1.25F, -3.4F, -5.0F);
        this.bone.addChild(antennaR1);
        this.setRotateAngle(antennaR1, 0.3054F, 0.3491F, 0.5236F);
        this.antennaR1.cubeList.add(new ModelBox(antennaR1, 0, 0, -0.25F, 0.0F, -22.0F, 0, 4, 22, 0.0F, false));

        this.antennaL1 = new AdvancedModelRenderer(this);
        this.antennaL1.setRotationPoint(1.25F, -3.4F, -5.0F);
        this.bone.addChild(antennaL1);
        this.setRotateAngle(antennaL1, 0.3054F, -0.3491F, -0.5236F);
        this.antennaL1.cubeList.add(new ModelBox(antennaL1, 0, 0, 0.25F, 0.0F, -22.0F, 0, 4, 22, 0.0F, true));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-0.5F, -4.25F, -5.5F);
        this.bone.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.2182F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 0, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(0.5F, -4.25F, -5.5F);
        this.bone.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.2182F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 0, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.9F, -1.5F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 23, 0, -2.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 34, -2.49F, 0.0F, 0.0F, 5, 5, 2, 0.015F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, 5.0F, 1.0F);
        this.body2.addChild(legR);
        this.setRotateAngle(legR, -0.3491F, -0.1745F, 0.4363F);
        this.legR.cubeList.add(new ModelBox(legR, 18, 31, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, 5.0F, 1.0F);
        this.body2.addChild(legL);
        this.setRotateAngle(legL, -0.3491F, 0.1745F, -0.4363F);
        this.legL.cubeList.add(new ModelBox(legL, 18, 31, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 25, 33, -2.49F, 0.0F, 0.0F, 5, 5, 2, 0.01F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, 5.0F, 1.0F);
        this.body3.addChild(legR2);
        this.setRotateAngle(legR2, -0.3491F, -0.1745F, 0.4363F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 27, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, 5.0F, 1.0F);
        this.body3.addChild(legL2);
        this.setRotateAngle(legL2, -0.3491F, 0.1745F, -0.4363F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 27, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0436F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 32, 15, -2.49F, 0.0F, 0.0F, 5, 5, 2, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, 5.0F, 1.0F);
        this.body4.addChild(legR3);
        this.setRotateAngle(legR3, -0.3491F, -0.1745F, 0.4363F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 23, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, 5.0F, 1.0F);
        this.body4.addChild(legL3);
        this.setRotateAngle(legL3, -0.3491F, 0.1745F, -0.4363F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 23, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.0436F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 37, 38, -2.49F, 0.0F, 0.0F, 5, 4, 2, -0.01F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, 4.0F, 1.0F);
        this.body5.addChild(legR4);
        this.setRotateAngle(legR4, -0.3491F, -0.2182F, 0.4363F);
        this.legR4.cubeList.add(new ModelBox(legR4, 22, 14, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, 4.0F, 1.0F);
        this.body5.addChild(legL4);
        this.setRotateAngle(legL4, -0.3491F, 0.2182F, -0.4363F);
        this.legL4.cubeList.add(new ModelBox(legL4, 22, 14, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.05F, 2.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0436F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 27, 26, -1.99F, 0.0F, -0.5F, 4, 4, 3, 0.01F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 4.0F, 1.0F);
        this.body6.addChild(legR5);
        this.setRotateAngle(legR5, -0.3491F, -0.1745F, 0.4363F);
        this.legR5.cubeList.add(new ModelBox(legR5, 16, 14, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, 4.0F, 1.0F);
        this.body6.addChild(legL5);
        this.setRotateAngle(legL5, -0.3491F, 0.1745F, -0.4363F);
        this.legL5.cubeList.add(new ModelBox(legL5, 16, 14, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 37, 0, -1.99F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.75F, 3.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 4, -0.99F, -0.5F, 0.0F, 2, 2, 3, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 34, 10, -0.49F, 0.0F, 3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 1.7F, 0.0F);
        this.body8.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, 0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.01F, -0.9F, -0.25F, 2, 0, 7, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, 1.7F, 0.0F);
        this.body8.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.2182F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, -2.01F, -1.1F, -0.25F, 2, 0, 6, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, 1.7F, 0.0F);
        this.body8.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5236F, -0.2618F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.01F, -0.9F, -0.25F, 2, 0, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 1.7F, 0.0F);
        this.body8.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2618F, -0.2182F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 0, 0.01F, -1.1F, -0.25F, 2, 0, 6, 0.0F, false));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-1.25F, -2.5F, -4.0F);
        this.bone.addChild(armR);
        this.setRotateAngle(armR, -1.1781F, 0.0873F, 0.4363F);
        this.armR.cubeList.add(new ModelBox(armR, 18, 36, 0.0F, 0.0F, -1.0F, 0, 7, 2, 0.0F, false));

        this.armsR = new AdvancedModelRenderer(this);
        this.armsR.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.armR.addChild(armsR);
        this.setRotateAngle(armsR, 0.3927F, 0.0F, 0.0F);
        this.armsR.cubeList.add(new ModelBox(armsR, 14, 32, 0.01F, 0.0F, -0.5F, 0, 9, 2, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(1.25F, -2.5F, -4.0F);
        this.bone.addChild(armL);
        this.setRotateAngle(armL, -1.1781F, -0.0873F, -0.4363F);
        this.armL.cubeList.add(new ModelBox(armL, 18, 36, 0.0F, 0.0F, -1.0F, 0, 7, 2, 0.0F, true));

        this.armsL = new AdvancedModelRenderer(this);
        this.armsL.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.armL.addChild(armsL);
        this.setRotateAngle(armsL, 0.3927F, 0.0F, 0.0F);
        this.armsL.cubeList.add(new ModelBox(armsL, 14, 32, -0.01F, 0.0F, -0.5F, 0, 9, 2, 0.0F, true));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-1.0F, -2.5F, -3.5F);
        this.bone.addChild(armR2);
        this.setRotateAngle(armR2, -0.7854F, -0.1745F, 0.4363F);
        this.armR2.cubeList.add(new ModelBox(armR2, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(1.0F, -2.5F, -3.5F);
        this.bone.addChild(armL2);
        this.setRotateAngle(armL2, -0.7854F, 0.1745F, -0.4363F);
        this.armL2.cubeList.add(new ModelBox(armL2, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, true));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(-1.0F, -2.5F, -2.5F);
        this.bone.addChild(armR3);
        this.setRotateAngle(armR3, -0.6109F, -0.1745F, 0.3927F);
        this.armR3.cubeList.add(new ModelBox(armR3, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(1.0F, -2.5F, -2.5F);
        this.bone.addChild(armL3);
        this.setRotateAngle(armL3, -0.6109F, 0.1745F, -0.3927F);
        this.armL3.cubeList.add(new ModelBox(armL3, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, true));

        this.armR4 = new AdvancedModelRenderer(this);
        this.armR4.setRotationPoint(-1.0F, -2.75F, -1.5F);
        this.bone.addChild(armR4);
        this.setRotateAngle(armR4, -0.5236F, -0.1745F, 0.3491F);
        this.armR4.cubeList.add(new ModelBox(armR4, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL4 = new AdvancedModelRenderer(this);
        this.armL4.setRotationPoint(1.0F, -2.75F, -1.5F);
        this.bone.addChild(armL4);
        this.setRotateAngle(armL4, -0.5236F, 0.1745F, -0.3491F);
        this.armL4.cubeList.add(new ModelBox(armL4, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, true));

        this.armR5 = new AdvancedModelRenderer(this);
        this.armR5.setRotationPoint(-1.0F, -2.0F, -0.75F);
        this.bone.addChild(armR5);
        this.setRotateAngle(armR5, -0.2618F, -0.1745F, 0.6109F);
        this.armR5.cubeList.add(new ModelBox(armR5, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL5 = new AdvancedModelRenderer(this);
        this.armL5.setRotationPoint(1.0F, -2.0F, -0.75F);
        this.bone.addChild(armL5);
        this.setRotateAngle(armL5, -0.2618F, 0.1745F, -0.6109F);
        this.armL5.cubeList.add(new ModelBox(armL5, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, true));

        this.armR6 = new AdvancedModelRenderer(this);
        this.armR6.setRotationPoint(-1.0F, -2.0F, 0.0F);
        this.bone.addChild(armR6);
        this.setRotateAngle(armR6, -0.1309F, -0.1745F, 0.5672F);
        this.armR6.cubeList.add(new ModelBox(armR6, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL6 = new AdvancedModelRenderer(this);
        this.armL6.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.bone.addChild(armL6);
        this.setRotateAngle(armL6, -0.1309F, 0.1745F, -0.5672F);
        this.armL6.cubeList.add(new ModelBox(armL6, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, true));

        this.armR7 = new AdvancedModelRenderer(this);
        this.armR7.setRotationPoint(-1.0F, -2.0F, 0.75F);
        this.bone.addChild(armR7);
        this.setRotateAngle(armR7, -0.0436F, -0.1745F, 0.5236F);
        this.armR7.cubeList.add(new ModelBox(armR7, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL7 = new AdvancedModelRenderer(this);
        this.armL7.setRotationPoint(1.0F, -2.0F, 0.75F);
        this.bone.addChild(armL7);
        this.setRotateAngle(armL7, -0.0436F, 0.1745F, -0.5236F);
        this.armL7.cubeList.add(new ModelBox(armL7, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, true));

        this.armR8 = new AdvancedModelRenderer(this);
        this.armR8.setRotationPoint(-1.0F, -2.0F, 1.5F);
        this.bone.addChild(armR8);
        this.setRotateAngle(armR8, 0.0873F, -0.1745F, 0.48F);
        this.armR8.cubeList.add(new ModelBox(armR8, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL8 = new AdvancedModelRenderer(this);
        this.armL8.setRotationPoint(1.0F, -2.0F, 1.5F);
        this.bone.addChild(armL8);
        this.setRotateAngle(armL8, 0.0873F, 0.1745F, -0.48F);
        this.armL8.cubeList.add(new ModelBox(armL8, 11, 24, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bone.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.bone.offsetZ = -0.15F;
        this.bone.offsetY = -0.13F;
        this.bone.render(0.018f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        //this.body.offsetY = 0F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }

        EntityPrehistoricFloraAngustidontus ee = (EntityPrehistoricFloraAngustidontus) e;

        AdvancedModelRenderer[] bodyF = {this.body2, this.body3, this.body4, this.body5};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
                this.walk(armL, 0.3F, -0.3F, false, 0f, 0f, f2, 1F);
                this.walk(armR, 0.3F, -0.3F, false, 0f, 0f, f2, 1F);
            }


            float degreeFin = 0.25F;
            this.walk(antennaL1, 0.5F, -degreeFin, true, 0.0F, -0.5F, f2, 0.7F);
            this.walk(antennaR1, 0.5F, -degreeFin, true, 0.0F, -0.5F, f2, 0.7F);
            this.walk(antennaL2, 0.5F, -degreeFin * 0.5F, true, -0.0F, -0.5F, f2, 0.7F);
            this.walk(antennaR2, 0.5F, -degreeFin * 0.5F, true, -0.0F, -0.5F, f2, 0.7F);
            this.walk(antennaL3, 0.5F, -degreeFin * 0.5F, true, 1.0F, -0.5F, f2, 0.7F);
            this.walk(antennaR3, 0.5F, -degreeFin * 0.5F, true, 1.0F, -0.5F, f2, 0.7F);

            this.flap(armL2, 0.9F, -degreeFin, false, -1.0f, -0, f2, 0.7F);
            this.flap(armR2, 0.9F, degreeFin, false, -1.0f, 0, f2, 0.7F);
            this.flap(armL3, 0.9F, -degreeFin, false, -0.5f, -0, f2, 0.7F);
            this.flap(armR3, 0.9F, degreeFin, false, -0.5f, 0, f2, 0.7F);
            this.flap(armL4, 0.9F, -degreeFin, false, 0, -0, f2, 0.7F);
            this.flap(armR4, 0.9F, degreeFin, false, 0, 0, f2, 0.7F);
            this.flap(armL5, 0.9F, -degreeFin, false, 0.5F, -0, f2, 0.7F);
            this.flap(armR5, 0.9F, degreeFin, false, 0.5F, 0, f2, 0.7F);
            this.flap(armL6, 0.9F, -degreeFin, false, 1.0F, -0, f2, 0.7F);
            this.flap(armR6, 0.9F, degreeFin, false, 1.0F, 0, f2, 0.7F);
            this.flap(armL7, 0.9F, -degreeFin, false, 1.5F, -0, f2, 0.7F);
            this.flap(armR7, 0.9F, degreeFin, false, 1.5F, 0, f2, 0.7F);
            this.flap(armL8, 0.9F, -degreeFin, false, 2.0F, -0, f2, 0.7F);
            this.flap(armR8, 0.9F, degreeFin, false, 2.0F, 0, f2, 0.7F);
            this.flap(legL, 0.9F, -degreeFin, false, 2.5F, -0, f2, 0.7F);
            this.flap(legR, 0.9F, degreeFin, false, 2.5F, 0, f2, 0.7F);
            this.flap(legL2, 0.9F, -degreeFin, false, 3.0F, -0, f2, 0.7F);
            this.flap(legR2, 0.9F, degreeFin, false, 3.0F, 0, f2, 0.7F);
            this.flap(legL3, 0.9F, -degreeFin, false, 3.5F, -0, f2, 0.7F);
            this.flap(legR3, 0.9F, degreeFin, false, 3.5F, 0, f2, 0.7F);
            this.flap(legL4, 0.9F, -degreeFin, false, 4.0F, -0, f2, 0.7F);
            this.flap(legR4, 0.9F, degreeFin, false, 4.0F, 0, f2, 0.7F);
            this.flap(legL5, 0.9F, -degreeFin, false, 4.5F, -0, f2, 0.7F);
            this.flap(legR5, 0.9F, degreeFin, false, 4.5F, 0, f2, 0.7F);

            this.walk(armL2, 0.9F, -degreeFin * 0.5F, true, -1.0F, -0.5F, f2, 0.7F);
            this.walk(armR2, 0.9F, degreeFin * 0.5F, false, -1.0F, 0.5F, f2, 0.7F);
            this.walk(armL3, 0.9F, -degreeFin * 0.5F, true, -0.5F, -0.5F, f2, 0.7F);
            this.walk(armR3, 0.9F, degreeFin * 0.5F, false, -0.5F, 0.5F, f2, 0.7F);
            this.walk(armL4, 0.9F, -degreeFin * 0.5F, true, 0, -0.5F, f2, 0.7F);
            this.walk(armR4, 0.9F, degreeFin * 0.5F, false, 0, 0.5F, f2, 0.7F);
            this.walk(armL5, 0.9F, -degreeFin * 0.5F, true, 0.5F, -0.5F, f2, 0.7F);
            this.walk(armR5, 0.9F, degreeFin * 0.5F, false, 0.5F, 0.5F, f2, 0.7F);
            this.walk(armL6, 0.9F, -degreeFin * 0.5F, true, 1.0F, -0.5F, f2, 0.7F);
            this.walk(armR6, 0.9F, degreeFin * 0.5F, false, 1.0F, 0.5F, f2, 0.7F);
            this.walk(armL7, 0.9F, -degreeFin * 0.5F, true, 1.5F, -0.5F, f2, 0.7F);
            this.walk(armR7, 0.9F, degreeFin * 0.5F, false, 1.5F, 0.5F, f2, 0.7F);
            this.walk(armL8, 0.9F, -degreeFin * 0.5F, true, 2.0F, -0.5F, f2, 0.7F);
            this.walk(armR8, 0.9F, degreeFin * 0.5F, false, 2.0F, 0.5F, f2, 0.7F);
            this.walk(legL, 0.9F, -degreeFin * 0.5F, true, 2.5F, -0.5F, f2, 0.7F);
            this.walk(legR, 0.9F, degreeFin * 0.5F, false, 2.5F, 0.5F, f2, 0.7F);
            this.walk(legL2, 0.9F, -degreeFin * 0.5F, true, 3.0F, -0.5F, f2, 0.7F);
            this.walk(legR2, 0.9F, degreeFin * 0.5F, false, 3.0F, 0.5F, f2, 0.7F);
            this.walk(legL3, 0.9F, -degreeFin * 0.5F, true, 3.5F, -0.5F, f2, 0.7F);
            this.walk(legR3, 0.9F, degreeFin * 0.5F, false, 3.5F, 0.5F, f2, 0.7F);
            this.walk(legL4, 0.9F, -degreeFin * 0.5F, true, 4.0F, -0.5F, f2, 0.7F);
            this.walk(legR4, 0.9F, degreeFin * 0.5F, false, 4.0F, 0.5F, f2, 0.7F);
            this.walk(legL5, 0.9F, -degreeFin * 0.5F, true, 4.5F, -0.5F, f2, 0.7F);
            this.walk(legR5, 0.9F, degreeFin * 0.5F, false, 4.5F, 0.5F, f2, 0.7F);

            this.chainSwing(bodyF, 0.2F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.28F, 0.18f, -3, f2, 0.6F);

            if (!e.isInWater()) {
                //this.body.offsetY = 0F;
                this.bob(bone, -speed * 1.5F, 2.5F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(bone, -speed, 0.25F, false, f2, 2);
                } else {
                    this.bob(bone, -speed, 0.5F, false, f2, 2);
                }
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        //Duration 40

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(15);
        animator.rotate(this.armL, -(float) Math.toRadians(77.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR, -(float) Math.toRadians(77.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(3);
        animator.rotate(this.armL, (float) Math.toRadians(77.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armsL, (float) Math.toRadians(-87.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armL, (float) Math.toRadians(77.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armsR, (float) Math.toRadians(-87.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(12);
    }
}
