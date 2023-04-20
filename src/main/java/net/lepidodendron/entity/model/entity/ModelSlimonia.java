package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProteroctopus;
import net.lepidodendron.entity.EntityPrehistoricFloraSlimonia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelSlimonia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tergite1;
    private final AdvancedModelRenderer tergite2_3;
    private final AdvancedModelRenderer tergite4_5;
    private final AdvancedModelRenderer tergite6;
    private final AdvancedModelRenderer tergite7;
    private final AdvancedModelRenderer tergite8;
    private final AdvancedModelRenderer tergite9;
    private final AdvancedModelRenderer tergite10;
    private final AdvancedModelRenderer tergite11;
    private final AdvancedModelRenderer tergite12;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL5_2;
    private final AdvancedModelRenderer legL5_3;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR5_2;
    private final AdvancedModelRenderer legR5_3;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer cube_r3;

    private ModelAnimator animator;


    public ModelSlimonia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.0F, 3.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -1.0F, -8.0F, 8, 2, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 12, -1.5F, 0.7F, -6.0F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 2.0F, -1.45F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -3.0F, -2.0F, -1.0F, 7, 2, 3, 0.0F, false));

        this.tergite1 = new AdvancedModelRenderer(this);
        this.tergite1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(tergite1);
        this.tergite1.cubeList.add(new ModelBox(tergite1, 22, 23, -4.5F, -1.0F, 0.0F, 9, 2, 2, 0.0F, false));

        this.tergite2_3 = new AdvancedModelRenderer(this);
        this.tergite2_3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite1.addChild(tergite2_3);
        this.tergite2_3.cubeList.add(new ModelBox(tergite2_3, 0, 10, -5.5F, -1.0F, 0.0F, 11, 2, 4, 0.0F, false));

        this.tergite4_5 = new AdvancedModelRenderer(this);
        this.tergite4_5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergite2_3.addChild(tergite4_5);
        this.tergite4_5.cubeList.add(new ModelBox(tergite4_5, 0, 16, -5.5F, -1.0F, 0.0F, 11, 2, 4, 0.0F, false));

        this.tergite6 = new AdvancedModelRenderer(this);
        this.tergite6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergite4_5.addChild(tergite6);
        this.tergite6.cubeList.add(new ModelBox(tergite6, 0, 22, -4.5F, -1.0F, 0.0F, 9, 2, 2, 0.0F, false));

        this.tergite7 = new AdvancedModelRenderer(this);
        this.tergite7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite6.addChild(tergite7);
        this.tergite7.cubeList.add(new ModelBox(tergite7, 18, 30, -3.5F, -1.0F, 0.0F, 7, 2, 2, 0.0F, false));

        this.tergite8 = new AdvancedModelRenderer(this);
        this.tergite8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite7.addChild(tergite8);
        this.tergite8.cubeList.add(new ModelBox(tergite8, 32, 18, -2.5F, -1.0F, 0.0F, 5, 2, 2, 0.0F, false));

        this.tergite9 = new AdvancedModelRenderer(this);
        this.tergite9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite8.addChild(tergite9);
        this.tergite9.cubeList.add(new ModelBox(tergite9, 14, 34, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.tergite10 = new AdvancedModelRenderer(this);
        this.tergite10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite9.addChild(tergite10);
        this.tergite10.cubeList.add(new ModelBox(tergite10, 34, 0, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.tergite11 = new AdvancedModelRenderer(this);
        this.tergite11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite10.addChild(tergite11);
        this.tergite11.cubeList.add(new ModelBox(tergite11, 0, 33, -2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.tergite12 = new AdvancedModelRenderer(this);
        this.tergite12.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergite11.addChild(tergite12);
        this.tergite12.cubeList.add(new ModelBox(tergite12, 30, 6, -2.0F, -1.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergite12.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 20, 12, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 16, 0, -2.5F, 0.0F, 0.0F, 5, 0, 8, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.4F, 1.5F, -5.4F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0873F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 31, 0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.4F, 1.5F, -3.2F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0873F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 31, -8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.4F, 1.5F, -4.3F);
        this.body.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 31, -8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.4F, 1.5F, -5.4F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.0873F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 31, -8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.4F, 1.5F, -4.3F);
        this.body.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 31, 0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.4F, 1.5F, -3.2F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.0873F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 31, 0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(3.5F, 1.5F, -1.0F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.3927F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 26, 34, 0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.legL5_2 = new AdvancedModelRenderer(this);
        this.legL5_2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.legL5.addChild(legL5_2);
        this.setRotateAngle(legL5_2, 0.0F, -0.7854F, 0.0F);
        this.legL5_2.cubeList.add(new ModelBox(legL5_2, 20, 27, 0.0F, -0.5F, -1.0F, 8, 1, 2, 0.001F, false));

        this.legL5_3 = new AdvancedModelRenderer(this);
        this.legL5_3.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.legL5_2.addChild(legL5_3);
        this.legL5_3.cubeList.add(new ModelBox(legL5_3, 4, 2, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-3.5F, 1.5F, -1.0F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.3927F, 0.0F);
        this.legR5.cubeList.add(new ModelBox(legR5, 26, 34, -3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.legR5_2 = new AdvancedModelRenderer(this);
        this.legR5_2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.legR5.addChild(legR5_2);
        this.setRotateAngle(legR5_2, 0.0F, 0.7854F, 0.0F);
        this.legR5_2.cubeList.add(new ModelBox(legR5_2, 20, 27, -8.0F, -0.5F, -1.0F, 8, 1, 2, 0.001F, true));

        this.legR5_3 = new AdvancedModelRenderer(this);
        this.legR5_3.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.legR5_2.addChild(legR5_3);
        this.legR5_3.cubeList.add(new ModelBox(legR5_3, 4, 2, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.2F, 0.75F, -6.0F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.3927F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 0, 0.0F, 0.5F, -2.0F, 3, 0, 2, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.2F, 0.75F, -6.0F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.3927F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 0, -3.0F, 0.5F, -2.0F, 3, 0, 2, 0.0F, true));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.4F, 1.45F, -5.7F);
        this.body.addChild(cheliceraL);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cheliceraL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -1, 5, -0.5F, 0.0F, -1.5F, 2, 0, 2, 0.0F, true));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(-0.4F, 1.45F, -5.7F);
        this.body.addChild(cheliceraR);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cheliceraR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, -1, 5, -1.5F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
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
       // this.body.offsetY = 0.4F;

        float speedMultiplier = 1F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speedMultiplier = 1.75F;
        }
        AdvancedModelRenderer[] fishBody = {this.tergite1, this.tergite2_3, this.tergite4_5, this.tergite6, this.tergite7, this.tergite8, this.tergite9, this.tergite10, this.tergite11, this.tergite12, this.telson};
        AdvancedModelRenderer[] fishTail = {this.tergite12, this.telson};
        AdvancedModelRenderer[] fishfinL = {this.legL5, this.legL5_2, this.legL5_3};
        AdvancedModelRenderer[] fishfinR = {this.legR5, this.legR5_2, this.legR5_3};


        //mouthparts:
        this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.4F * speedMultiplier;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.2F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraSlimonia slimon = (EntityPrehistoricFloraSlimonia) e;


        if (!e.isInWater()) {
            speed = 0.7F;
        }


        if (!slimon.isReallySwimming()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F * speedMultiplier;
            tailHdegree = 0.4F;
            tailSwing = 0.25F;
            paddleVdegree = 0.1F;
            //this.l5L.defaultRotationY = 0F;
            //this.l5R.defaultRotationY = 0F;

            //walking pose
            //this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
            //this.setRotateAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
            //this.setRotateAngle(cube_r3, 0.0F, -0.5236F, 0.0F);
            //this.setRotateAngle(legL1, 0.0F, 0.3927F, 0.0F);
            //this.setRotateAngle(legL2, 0.0F, 0.2618F, 0.4363F);
            //this.setRotateAngle(legL3, 0.0F, 0.0F, 0.4363F);
//            this.setRotateAngle(legL4, 0.0F, -0.2618F, 0.4363F);
//            this.setRotateAngle(legL5_2, 0.0F, -0.7854F, 0.0F);
//            this.setRotateAngle(legL5, 0.0F, -0.3927F, 0.0F);
//            this.setRotateAngle(legR1, 0.0F, -0.3927F, 0.0F);
//            this.setRotateAngle(legR2, 0.0F, -0.2618F, -0.4363F);
//            this.setRotateAngle(legR3, 0.0F, 0.0F, -0.4363F);
//            this.setRotateAngle(legR4, 0.0F, 0.2618F, -0.4363F);
//            this.setRotateAngle(legR5_2, 0.0F, 0.7854F, 0.0F);
//            this.setRotateAngle(legR5, 0.0F, 0.3927F, 0.0F);

        }
        else {
            this.legL2.rotateAngleZ = 0.3F;
            this.legL3.rotateAngleZ = 0.3F;
            this.legL4.rotateAngleZ = 0.3F;

            this.legR2.rotateAngleZ = -0.3F;
            this.legR3.rotateAngleZ = -0.3F;
            this.legR4.rotateAngleZ = -0.3F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
            this.chainSwing(fishTail, speed, 0.1F, -0.6F, f2, 0.6F);
            this.chainWave(fishTail, speed, 0.1F, -0.6F, f2, 0.6F);

            this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

           // this.flap(clawbaseL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
            //this.flap(clawbaseR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

           // this.swing(clawL, 0.4F, 0.2F, false, 0, -0.1F, f2, 0.8F);
            //this.swing(clawR, 0.4F, -0.2F, false, 0, 0.1F, f2, 0.8F);

            this.flap(legL1, speed, 0.2F, false, -3F, 0.5F, f2, 1F);
            this.flap(legR1, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
            this.swing(legL1, speed , 0.2F, false, 0F, 0.4F, f2, 0.8F);
            this.swing(legR1, speed , 0.2F, true, 0F, 0.4F, f2, 0.8F);
            this.flap(legL2, speed, 0.2F, false, -3F, 0.5F, f2, 1F);
            this.flap(legR2, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
            this.swing(legL2, speed , 0.2F, false, 0F, 0.4F, f2, 0.8F);
            this.swing(legR2, speed , 0.2F, true, 0F, 0.4F, f2, 0.8F);
            this.flap(legL3, speed, 0.2F, false, -3F, 0.5F, f2, 1F);
            this.flap(legR3, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
            this.swing(legL3, speed , 0.2F, false, 0F, 0.4F, f2, 0.8F);
            this.swing(legR3, speed , 0.2F, true, 0F, 0.4F, f2, 0.8F);
            this.flap(legL4, speed, 0.2F, false, -3F, 0.5F, f2, 1F);
            this.flap(legR4, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
            this.swing(legL4, speed , 0.2F, false, -3F, 0.4F, f2, 0.8F);
            this.swing(legR4, speed , 0.2F, true, 0F, 0.4F, f2, 0.8F);

            if (e.isInWater()) {//in water
                if (slimon.isReallySwimming()) { //Swimming
                    this.swing(legL2, speed, 0.15F, false, 3F, 0.4F, f2, 1F);
                    this.swing(legL3, speed , 0.15F, false, 0F, 0.4F, f2, 1F);
                    this.swing(legL4, speed, 0.15F, false, 3F, 0.4F, f2, 1F);
                    this.swing(legR2, speed , 0.15F, true, 0F, 0.4F, f2, 1F);
                    this.swing(legR3, speed, 0.15F, true, 3F, 0.4F, f2, 1F);
                    this.swing(legR4, speed , 0.15F, true, 0F, 0.4F, f2, 1F);
                } else { //Walking
                    if (slimon.getIsMoving()) {
                        this.flap(legL1, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                        this.flap(legR1, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                        this.swing(legL1, speed , 0.2F, false, 0F, 0.4F, f2, 0.8F);
                        this.swing(legR1, speed , 0.2F, true, 0F, 0.4F, f2, 0.8F);
                        this.flap(legL2, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                        this.flap(legR2, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                        this.swing(legL2, speed , 0.2F, false, 0F, 0.4F, f2, 0.8F);
                        this.swing(legR2, speed , 0.2F, true, 0F, 0.4F, f2, 0.8F);
                        this.flap(legL3, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                        this.flap(legR3, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                        this.swing(legL3, speed , 0.2F, false, 0F, 0.4F, f2, 0.8F);
                        this.swing(legR3, speed , 0.2F, true, 0F, 0.4F, f2, 0.8F);
                        this.flap(legL4, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                        this.flap(legR4, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                        this.swing(legL4, speed , 0.2F, false, 0F, 0.4F, f2, 0.8F);
                        this.swing(legR4, speed , 0.2F, true, 0F, 0.4F, f2, 0.8F);
                    }
                }
            }

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (slimon.isReallySwimming()) {
                this.bob(body, -speed * 0.5F, 0.5F, false, f2, 0.8F);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.2F;
                this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.1F, -2, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
    }
}
