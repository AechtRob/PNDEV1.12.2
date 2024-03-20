package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOrcanopterus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelOrcanopterus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tergite2;
    private final AdvancedModelRenderer tergite3;
    private final AdvancedModelRenderer tergite4;
    private final AdvancedModelRenderer tergite5;
    private final AdvancedModelRenderer tergite6;
    private final AdvancedModelRenderer tergite7;
    private final AdvancedModelRenderer tergite8;
    private final AdvancedModelRenderer tergite9;
    private final AdvancedModelRenderer tergite10;
    private final AdvancedModelRenderer tergite11;
    private final AdvancedModelRenderer tergite12;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR5_2;
    private final AdvancedModelRenderer legR5_3;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL5_2;
    private final AdvancedModelRenderer legL5_3;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer cheliceraL;

    private ModelAnimator animator;


    public ModelOrcanopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.5F, -1.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -0.5F, -3.0F, 7, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 5, 19, -1.5F, -0.5F, -6.5F, 3, 1, 4, -0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 19, -3.5F, 0.0F, 0.0F, 7, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 27, 17, -2.5F, -0.5F, 0.0F, 5, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 31, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.1F, -2.9F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0631F, -0.3435F, -0.1855F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 13, -1.8567F, -1.0F, -1.0487F, 2, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.9F, 2.4F, -4.4F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 18, -0.413F, -3.0F, -0.4836F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.5F, 3.5F, -3.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 21, -1.9918F, -4.0F, -4.0167F, 2, 1, 4, 0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.6F, 1.5F, -4.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0631F, 0.3435F, 0.1855F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 13, -1.1385F, -1.2307F, -0.2203F, 2, 1, 5, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.9F, 2.4F, -4.4F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 18, -0.587F, -3.0F, -0.4836F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 12, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.5F, 3.5F, -3.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 21, -0.0082F, -4.0F, -4.0167F, 2, 1, 4, 0.001F, false));

        this.tergite2 = new AdvancedModelRenderer(this);
        this.tergite2.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.body.addChild(tergite2);
        this.tergite2.cubeList.add(new ModelBox(tergite2, 17, 0, -3.0F, -1.0F, 0.0F, 6, 1, 2, 0.0F, false));
        this.tergite2.cubeList.add(new ModelBox(tergite2, 0, 10, -4.0F, -0.5F, 0.0F, 8, 1, 2, 0.0F, false));

        this.tergite3 = new AdvancedModelRenderer(this);
        this.tergite3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite2.addChild(tergite3);
        this.tergite3.cubeList.add(new ModelBox(tergite3, 18, 3, -3.0F, -1.0F, 0.0F, 6, 1, 2, 0.0F, false));
        this.tergite3.cubeList.add(new ModelBox(tergite3, 0, 7, -4.0F, -0.5F, 0.0F, 8, 1, 2, 0.0F, false));

        this.tergite4 = new AdvancedModelRenderer(this);
        this.tergite4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite3.addChild(tergite4);
        this.tergite4.cubeList.add(new ModelBox(tergite4, 18, 6, -3.0F, -0.9F, 0.0F, 6, 1, 2, 0.0F, false));
        this.tergite4.cubeList.add(new ModelBox(tergite4, 0, 4, -4.0F, -0.5F, 0.0F, 8, 1, 2, 0.0F, false));

        this.tergite5 = new AdvancedModelRenderer(this);
        this.tergite5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite4.addChild(tergite5);
        this.tergite5.cubeList.add(new ModelBox(tergite5, 0, 24, -2.5F, -0.8F, 0.0F, 5, 1, 2, 0.0F, false));
        this.tergite5.cubeList.add(new ModelBox(tergite5, 0, 13, -3.5F, -0.5F, 0.0F, 7, 1, 2, 0.0F, false));

        this.tergite6 = new AdvancedModelRenderer(this);
        this.tergite6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite5.addChild(tergite6);
        this.tergite6.cubeList.add(new ModelBox(tergite6, 22, 26, -2.0F, -0.7F, 0.0F, 4, 1, 2, 0.0F, false));
        this.tergite6.cubeList.add(new ModelBox(tergite6, 18, 9, -3.0F, -0.5F, 0.0F, 6, 1, 2, 0.0F, false));

        this.tergite7 = new AdvancedModelRenderer(this);
        this.tergite7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite6.addChild(tergite7);
        this.tergite7.cubeList.add(new ModelBox(tergite7, 30, 31, -1.5F, -0.6F, 0.0F, 3, 1, 1, 0.0F, false));
        this.tergite7.cubeList.add(new ModelBox(tergite7, 11, 29, -2.5F, -0.5F, 0.0F, 5, 1, 1, 0.0F, false));

        this.tergite8 = new AdvancedModelRenderer(this);
        this.tergite8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tergite7.addChild(tergite8);
        this.tergite8.cubeList.add(new ModelBox(tergite8, 0, 27, -2.0F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));

        this.tergite9 = new AdvancedModelRenderer(this);
        this.tergite9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite8.addChild(tergite9);
        this.tergite9.cubeList.add(new ModelBox(tergite9, 30, 21, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.tergite10 = new AdvancedModelRenderer(this);
        this.tergite10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite9.addChild(tergite10);
        this.tergite10.cubeList.add(new ModelBox(tergite10, 30, 12, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.tergite11 = new AdvancedModelRenderer(this);
        this.tergite11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite10.addChild(tergite11);
        this.tergite11.cubeList.add(new ModelBox(tergite11, 0, 30, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.tergite12 = new AdvancedModelRenderer(this);
        this.tergite12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite11.addChild(tergite12);
        this.tergite12.cubeList.add(new ModelBox(tergite12, 21, 29, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite12.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 14, 19, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 0, 16, -1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 0, 0, -0.5F, 0.0F, 5.0F, 1, 0, 1, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.7F, 1.0F, -4.0F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.9599F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 9, 16, -3.0118F, -0.5F, -0.5299F, 3, 1, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.4F, 1.0F, -3.4F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.6981F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 21, -2.9958F, -0.5F, -0.4872F, 3, 1, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.8F, 1.0F, -2.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.4363F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 31, 0, -4.0667F, -0.5F, -0.5161F, 4, 1, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.0F, 1.0F, -1.7F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, -0.0873F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 29, 29, -4.0336F, -0.5F, -0.499F, 4, 1, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-2.1F, 1.0F, -0.5F);
        this.body.addChild(legR5);
        this.legR5.cubeList.add(new ModelBox(legR5, 10, 31, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legR5_2 = new AdvancedModelRenderer(this);
        this.legR5_2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.legR5.addChild(legR5_2);
        this.legR5_2.cubeList.add(new ModelBox(legR5_2, 12, 25, -4.0F, -0.5F, -0.7F, 4, 1, 2, 0.001F, false));

        this.legR5_3 = new AdvancedModelRenderer(this);
        this.legR5_3.setRotationPoint(-4.0F, 0.0F, -0.5F);
        this.legR5_2.addChild(legR5_3);
        this.legR5_3.cubeList.add(new ModelBox(legR5_3, 0, 16, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.7F, 1.0F, -4.0F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.9599F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 9, 16, 0.0118F, -0.5F, -0.5299F, 3, 1, 1, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.4F, 1.0F, -3.4F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.6981F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 21, -0.0042F, -0.5F, -0.4872F, 3, 1, 1, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.8F, 1.0F, -2.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.4363F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 31, 0, 0.0667F, -0.5F, -0.5161F, 4, 1, 1, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.0F, 1.0F, -1.7F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0873F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 29, 29, 0.0336F, -0.5F, -0.499F, 4, 1, 1, 0.0F, true));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(2.1F, 1.0F, -0.5F);
        this.body.addChild(legL5);
        this.legL5.cubeList.add(new ModelBox(legL5, 10, 31, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legL5_2 = new AdvancedModelRenderer(this);
        this.legL5_2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.legL5.addChild(legL5_2);
        this.legL5_2.cubeList.add(new ModelBox(legL5_2, 12, 25, 0.0F, -0.5F, -0.7F, 4, 1, 2, 0.001F, true));

        this.legL5_3 = new AdvancedModelRenderer(this);
        this.legL5_3.setRotationPoint(4.0F, 0.0F, -0.5F);
        this.legL5_2.addChild(legL5_3);
        this.legL5_3.cubeList.add(new ModelBox(legL5_3, 0, 16, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(-0.5F, 0.7F, -5.0F);
        this.body.addChild(cheliceraR);
        this.setRotateAngle(cheliceraR, 0.0F, -1.309F, 0.0F);
        this.cheliceraR.cubeList.add(new ModelBox(cheliceraR, 32, 2, -1.0906F, -0.7F, -0.556F, 2, 1, 1, 0.0F, false));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.5F, 0.7F, -5.0F);
        this.body.addChild(cheliceraL);
        this.setRotateAngle(cheliceraL, 0.0F, 1.309F, 0.0F);
        this.cheliceraL.cubeList.add(new ModelBox(cheliceraL, 32, 2, -0.9094F, -0.7F, -0.556F, 2, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
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
        //this.resetToDefaultPose();
       // this.body.offsetZ = 0.4F;
        //this.body.offsetY = -0.2F;
        this.body.offsetZ = -0.35F;


        AdvancedModelRenderer[] fishBody = {this.tergite2, this.tergite3, this.tergite4, this.tergite5, this.tergite6, this.tergite7, this.tergite8, this.tergite9, this.tergite10, this.tergite11, this.tergite12, this.telson};
        AdvancedModelRenderer[] fishTail = {this.tergite12, this.telson};



        //mouthparts:
        this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraOrcanopterus slimon = (EntityPrehistoricFloraOrcanopterus) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetY = 0.2F;
                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraOrcanopterus ee = (EntityPrehistoricFloraOrcanopterus) entitylivingbaseIn;
        //Swimming pose:
        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
                    //Walk pose:
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    if ((ee.getAnimation() != ee.SWIM_ANIMATION)) {
                        if (ee.getIsFast()) {
                            animFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                        } else {
                            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                        }
                    }
                }
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    if (ee.isReallySwimming()) {
                        //Swim static pose:
                        animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    } else {
                        //Walk static pose:
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                }
            }
        }
    }

    public void animFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOrcanopterus entity = (EntityPrehistoricFloraOrcanopterus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+50))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(1.15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+100))/4);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(tergite2, tergite2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2), tergite2.rotateAngleY + (float) Math.toRadians(0), tergite2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite3, tergite3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+10))*3), tergite3.rotateAngleY + (float) Math.toRadians(0), tergite3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite4, tergite4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-10))*4), tergite4.rotateAngleY + (float) Math.toRadians(0), tergite4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite5, tergite5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-30))*4), tergite5.rotateAngleY + (float) Math.toRadians(0), tergite5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite6, tergite6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-50))*4), tergite6.rotateAngleY + (float) Math.toRadians(0), tergite6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite7, tergite7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-70))*4), tergite7.rotateAngleY + (float) Math.toRadians(0), tergite7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite8, tergite8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-90))*5), tergite8.rotateAngleY + (float) Math.toRadians(0), tergite8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite9, tergite9.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-110))*6), tergite9.rotateAngleY + (float) Math.toRadians(0), tergite9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite10, tergite10.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-130))*7), tergite10.rotateAngleY + (float) Math.toRadians(0), tergite10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite11, tergite11.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-150))*8), tergite11.rotateAngleY + (float) Math.toRadians(0), tergite11.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite12, tergite12.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-170))*9), tergite12.rotateAngleY + (float) Math.toRadians(0), tergite12.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-190))*10), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legR1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2), legR1.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*2));


        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legR2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legR2.rotateAngleZ + (float) Math.toRadians(-12.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2));


        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legR3.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legR3.rotateAngleZ + (float) Math.toRadians(-25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2));

        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+230))*25), legR5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+180))*35), legR5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*25));


        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+240))*25), legR5_2.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*50), legR5_2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+280))*25));


        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legL1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2), legL1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*2));


        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legL2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legL2.rotateAngleZ + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2));


        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legL3.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legL3.rotateAngleZ + (float) Math.toRadians(25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2));

        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+230))*25), legL5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+180))*35), legL5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*25));


        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+240))*25), legL5_2.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*50), legL5_2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+280))*25));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraOrcanopterus entity = (EntityPrehistoricFloraOrcanopterus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90))), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+60))*0.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(1.15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+30))*0.25);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(tergite2, tergite2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20))*0.5), tergite2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+70))*0.5), tergite2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite3, tergite3.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-40))*0.5), tergite3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+50))*0.5), tergite3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite4, tergite4.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-60))*0.5), tergite4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+30))*0.5), tergite4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite5, tergite5.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-80))*0.5), tergite5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+10))*0.5), tergite5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite6, tergite6.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-100))*0.5), tergite6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-10))*0.5), tergite6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite7, tergite7.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-120))*0.5), tergite7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-30))*0.5), tergite7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite8, tergite8.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-140))*0.5), tergite8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-50))*0.5), tergite8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite9, tergite9.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-160))), tergite9.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-70))), tergite9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite10, tergite10.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-180))), tergite10.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-90))), tergite10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite11, tergite11.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-200))), tergite11.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-110))), tergite11.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite12, tergite12.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-220))), tergite12.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-130))), tergite12.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-240))), telson.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-150))), telson.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 6.64116 + (((tickAnim - 0) / 5) * (0.77911-(6.64116)));
            yy = 9.66854 + (((tickAnim - 0) / 5) * (-0.7344-(9.66854)));
            zz = -13.2251 + (((tickAnim - 0) / 5) * (-3.50461-(-13.2251)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.77911 + (((tickAnim - 5) / 5) * (16.53916-(0.77911)));
            yy = -0.7344 + (((tickAnim - 5) / 5) * (-9.51183-(-0.7344)));
            zz = -3.50461 + (((tickAnim - 5) / 5) * (-20.03704-(-3.50461)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.53916 + (((tickAnim - 10) / 10) * (6.64116-(16.53916)));
            yy = -9.51183 + (((tickAnim - 10) / 10) * (9.66854-(-9.51183)));
            zz = -20.03704 + (((tickAnim - 10) / 10) * (-13.2251-(-20.03704)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 6.64116 + (((tickAnim - 20) / 5) * (0.77911-(6.64116)));
            yy = 9.66854 + (((tickAnim - 20) / 5) * (-0.7344-(9.66854)));
            zz = -13.2251 + (((tickAnim - 20) / 5) * (-3.50461-(-13.2251)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0.77911 + (((tickAnim - 25) / 5) * (16.53916-(0.77911)));
            yy = -0.7344 + (((tickAnim - 25) / 5) * (-9.51183-(-0.7344)));
            zz = -3.50461 + (((tickAnim - 25) / 5) * (-20.03704-(-3.50461)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 16.53916 + (((tickAnim - 30) / 10) * (6.64116-(16.53916)));
            yy = -9.51183 + (((tickAnim - 30) / 10) * (9.66854-(-9.51183)));
            zz = -20.03704 + (((tickAnim - 30) / 10) * (-13.2251-(-20.03704)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(xx), legR1.rotateAngleY + (float) Math.toRadians(yy), legR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.69 + (((tickAnim - 0) / 3) * (9.44246-(1.69)));
            yy = -3.44 + (((tickAnim - 0) / 3) * (-9.65714-(-3.44)));
            zz = -5.88 + (((tickAnim - 0) / 3) * (-15.50734-(-5.88)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 9.44246 + (((tickAnim - 3) / 10) * (3.10854-(9.44246)));
            yy = -9.65714 + (((tickAnim - 3) / 10) * (9.71253-(-9.65714)));
            zz = -15.50734 + (((tickAnim - 3) / 10) * (-12.7865-(-15.50734)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3.10854 + (((tickAnim - 13) / 5) * (-2.18449-(3.10854)));
            yy = 9.71253 + (((tickAnim - 13) / 5) * (-0.33112-(9.71253)));
            zz = -12.7865 + (((tickAnim - 13) / 5) * (-1.06023-(-12.7865)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -2.18449 + (((tickAnim - 18) / 5) * (9.44246-(-2.18449)));
            yy = -0.33112 + (((tickAnim - 18) / 5) * (-9.65714-(-0.33112)));
            zz = -1.06023 + (((tickAnim - 18) / 5) * (-15.50734-(-1.06023)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 9.44246 + (((tickAnim - 23) / 10) * (3.10854-(9.44246)));
            yy = -9.65714 + (((tickAnim - 23) / 10) * (9.71253-(-9.65714)));
            zz = -15.50734 + (((tickAnim - 23) / 10) * (-12.7865-(-15.50734)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 3.10854 + (((tickAnim - 33) / 5) * (-2.18449-(3.10854)));
            yy = 9.71253 + (((tickAnim - 33) / 5) * (-0.33112-(9.71253)));
            zz = -12.7865 + (((tickAnim - 33) / 5) * (-1.06023-(-12.7865)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.18449 + (((tickAnim - 38) / 2) * (1.69-(-2.18449)));
            yy = -0.33112 + (((tickAnim - 38) / 2) * (-3.44-(-0.33112)));
            zz = -1.06023 + (((tickAnim - 38) / 2) * (-5.88-(-1.06023)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.76 + (((tickAnim - 0) / 2) * (-1.37707-(-0.76)));
            yy = 6.56 + (((tickAnim - 0) / 2) * (9.83545-(6.56)));
            zz = -9.72 + (((tickAnim - 0) / 2) * (-9.68685-(-9.72)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -1.37707 + (((tickAnim - 2) / 5) * (-3.0051-(-1.37707)));
            yy = 9.83545 + (((tickAnim - 2) / 5) * (0.16659-(9.83545)));
            zz = -9.68685 + (((tickAnim - 2) / 5) * (-1.51142-(-9.68685)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -3.0051 + (((tickAnim - 7) / 5) * (2.34412-(-3.0051)));
            yy = 0.16659 + (((tickAnim - 7) / 5) * (-9.83294-(0.16659)));
            zz = -1.51142 + (((tickAnim - 7) / 5) * (-9.87391-(-1.51142)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 2.34412 + (((tickAnim - 12) / 10) * (-1.37707-(2.34412)));
            yy = -9.83294 + (((tickAnim - 12) / 10) * (9.83545-(-9.83294)));
            zz = -9.87391 + (((tickAnim - 12) / 10) * (-9.68685-(-9.87391)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -1.37707 + (((tickAnim - 22) / 5) * (-3.0051-(-1.37707)));
            yy = 9.83545 + (((tickAnim - 22) / 5) * (0.16659-(9.83545)));
            zz = -9.68685 + (((tickAnim - 22) / 5) * (-1.51142-(-9.68685)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -3.0051 + (((tickAnim - 27) / 5) * (2.34412-(-3.0051)));
            yy = 0.16659 + (((tickAnim - 27) / 5) * (-9.83294-(0.16659)));
            zz = -1.51142 + (((tickAnim - 27) / 5) * (-9.87391-(-1.51142)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 2.34412 + (((tickAnim - 32) / 8) * (-0.76-(2.34412)));
            yy = -9.83294 + (((tickAnim - 32) / 8) * (6.56-(-9.83294)));
            zz = -9.87391 + (((tickAnim - 32) / 8) * (-9.72-(-9.87391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.75877 + (((tickAnim - 0) / 5) * (-1.20238-(-3.75877)));
            yy = 0.44243 + (((tickAnim - 0) / 5) * (-9.79933-(0.44243)));
            zz = -3.64923 + (((tickAnim - 0) / 5) * (-10.62813-(-3.64923)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -1.20238 + (((tickAnim - 5) / 10) * (-5.06046-(-1.20238)));
            yy = -9.79933 + (((tickAnim - 5) / 10) * (9.78152-(-9.79933)));
            zz = -10.62813 + (((tickAnim - 5) / 10) * (-11.69559-(-10.62813)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5.06046 + (((tickAnim - 15) / 5) * (-3.75877-(-5.06046)));
            yy = 9.78152 + (((tickAnim - 15) / 5) * (0.44243-(9.78152)));
            zz = -11.69559 + (((tickAnim - 15) / 5) * (-3.64923-(-11.69559)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -3.75877 + (((tickAnim - 20) / 5) * (-1.20238-(-3.75877)));
            yy = 0.44243 + (((tickAnim - 20) / 5) * (-9.79933-(0.44243)));
            zz = -3.64923 + (((tickAnim - 20) / 5) * (-10.62813-(-3.64923)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -1.20238 + (((tickAnim - 25) / 10) * (-5.06046-(-1.20238)));
            yy = -9.79933 + (((tickAnim - 25) / 10) * (9.78152-(-9.79933)));
            zz = -10.62813 + (((tickAnim - 25) / 10) * (-11.69559-(-10.62813)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.06046 + (((tickAnim - 35) / 5) * (-3.75877-(-5.06046)));
            yy = 9.78152 + (((tickAnim - 35) / 5) * (0.44243-(9.78152)));
            zz = -11.69559 + (((tickAnim - 35) / 5) * (-3.64923-(-11.69559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))), legR5.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))), legR5.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 16.53916 + (((tickAnim - 0) / 10) * (6.64116-(16.53916)));
            yy = 9.51183 + (((tickAnim - 0) / 10) * (-9.66854-(9.51183)));
            zz = 20.03704 + (((tickAnim - 0) / 10) * (13.2251-(20.03704)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 6.64116 + (((tickAnim - 10) / 5) * (0.77911-(6.64116)));
            yy = -9.66854 + (((tickAnim - 10) / 5) * (0.7344-(-9.66854)));
            zz = 13.2251 + (((tickAnim - 10) / 5) * (3.50461-(13.2251)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.77911 + (((tickAnim - 15) / 5) * (16.53916-(0.77911)));
            yy = 0.7344 + (((tickAnim - 15) / 5) * (9.51183-(0.7344)));
            zz = 3.50461 + (((tickAnim - 15) / 5) * (20.03704-(3.50461)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16.53916 + (((tickAnim - 20) / 10) * (6.64116-(16.53916)));
            yy = 9.51183 + (((tickAnim - 20) / 10) * (-9.66854-(9.51183)));
            zz = 20.03704 + (((tickAnim - 20) / 10) * (13.2251-(20.03704)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 6.64116 + (((tickAnim - 30) / 5) * (0.77911-(6.64116)));
            yy = -9.66854 + (((tickAnim - 30) / 5) * (0.7344-(-9.66854)));
            zz = 13.2251 + (((tickAnim - 30) / 5) * (3.50461-(13.2251)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.77911 + (((tickAnim - 35) / 5) * (16.53916-(0.77911)));
            yy = 0.7344 + (((tickAnim - 35) / 5) * (9.51183-(0.7344)));
            zz = 3.50461 + (((tickAnim - 35) / 5) * (20.03704-(3.50461)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(xx), legL1.rotateAngleY + (float) Math.toRadians(yy), legL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5.22 + (((tickAnim - 0) / 3) * (3.10854-(5.22)));
            yy = -3.26 + (((tickAnim - 0) / 3) * (-9.71253-(-3.26)));
            zz = 13.69 + (((tickAnim - 0) / 3) * (12.7865-(13.69)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.10854 + (((tickAnim - 3) / 5) * (-2.18449-(3.10854)));
            yy = -9.71253 + (((tickAnim - 3) / 5) * (0.33112-(-9.71253)));
            zz = 12.7865 + (((tickAnim - 3) / 5) * (1.06023-(12.7865)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -2.18449 + (((tickAnim - 8) / 5) * (9.44246-(-2.18449)));
            yy = 0.33112 + (((tickAnim - 8) / 5) * (9.65714-(0.33112)));
            zz = 1.06023 + (((tickAnim - 8) / 5) * (15.50734-(1.06023)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 9.44246 + (((tickAnim - 13) / 10) * (3.10854-(9.44246)));
            yy = 9.65714 + (((tickAnim - 13) / 10) * (-9.71253-(9.65714)));
            zz = 15.50734 + (((tickAnim - 13) / 10) * (12.7865-(15.50734)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 3.10854 + (((tickAnim - 23) / 5) * (-2.18449-(3.10854)));
            yy = -9.71253 + (((tickAnim - 23) / 5) * (0.33112-(-9.71253)));
            zz = 12.7865 + (((tickAnim - 23) / 5) * (1.06023-(12.7865)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -2.18449 + (((tickAnim - 28) / 5) * (9.44246-(-2.18449)));
            yy = 0.33112 + (((tickAnim - 28) / 5) * (9.65714-(0.33112)));
            zz = 1.06023 + (((tickAnim - 28) / 5) * (15.50734-(1.06023)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 9.44246 + (((tickAnim - 33) / 7) * (5.22-(9.44246)));
            yy = 9.65714 + (((tickAnim - 33) / 7) * (-3.26-(9.65714)));
            zz = 15.50734 + (((tickAnim - 33) / 7) * (13.69-(15.50734)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.56 + (((tickAnim - 0) / 2) * (2.34412-(0.56)));
            yy = 6.5 + (((tickAnim - 0) / 2) * (9.83294-(6.5)));
            zz = 7.09 + (((tickAnim - 0) / 2) * (9.87391-(7.09)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 2.34412 + (((tickAnim - 2) / 10) * (-1.37707-(2.34412)));
            yy = 9.83294 + (((tickAnim - 2) / 10) * (-9.83545-(9.83294)));
            zz = 9.87391 + (((tickAnim - 2) / 10) * (9.68685-(9.87391)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -1.37707 + (((tickAnim - 12) / 5) * (-3.0051-(-1.37707)));
            yy = -9.83545 + (((tickAnim - 12) / 5) * (-0.16659-(-9.83545)));
            zz = 9.68685 + (((tickAnim - 12) / 5) * (1.51142-(9.68685)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -3.0051 + (((tickAnim - 17) / 5) * (2.34412-(-3.0051)));
            yy = -0.16659 + (((tickAnim - 17) / 5) * (9.83294-(-0.16659)));
            zz = 1.51142 + (((tickAnim - 17) / 5) * (9.87391-(1.51142)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 2.34412 + (((tickAnim - 22) / 10) * (-1.37707-(2.34412)));
            yy = 9.83294 + (((tickAnim - 22) / 10) * (-9.83545-(9.83294)));
            zz = 9.87391 + (((tickAnim - 22) / 10) * (9.68685-(9.87391)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -1.37707 + (((tickAnim - 32) / 5) * (-3.0051-(-1.37707)));
            yy = -9.83545 + (((tickAnim - 32) / 5) * (-0.16659-(-9.83545)));
            zz = 9.68685 + (((tickAnim - 32) / 5) * (1.51142-(9.68685)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -3.0051 + (((tickAnim - 37) / 3) * (0.56-(-3.0051)));
            yy = -0.16659 + (((tickAnim - 37) / 3) * (6.5-(-0.16659)));
            zz = 1.51142 + (((tickAnim - 37) / 3) * (7.09-(1.51142)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.13 + (((tickAnim - 0) / 5) * (-5.06046-(-3.13)));
            yy = 0.01 + (((tickAnim - 0) / 5) * (-9.78152-(0.01)));
            zz = 11.16 + (((tickAnim - 0) / 5) * (11.69559-(11.16)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.06046 + (((tickAnim - 5) / 5) * (-3.75877-(-5.06046)));
            yy = -9.78152 + (((tickAnim - 5) / 5) * (-0.44243-(-9.78152)));
            zz = 11.69559 + (((tickAnim - 5) / 5) * (3.64923-(11.69559)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.75877 + (((tickAnim - 10) / 5) * (-1.20238-(-3.75877)));
            yy = -0.44243 + (((tickAnim - 10) / 5) * (9.79933-(-0.44243)));
            zz = 3.64923 + (((tickAnim - 10) / 5) * (10.62813-(3.64923)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -1.20238 + (((tickAnim - 15) / 10) * (-5.06046-(-1.20238)));
            yy = 9.79933 + (((tickAnim - 15) / 10) * (-9.78152-(9.79933)));
            zz = 10.62813 + (((tickAnim - 15) / 10) * (11.69559-(10.62813)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -5.06046 + (((tickAnim - 25) / 5) * (-3.75877-(-5.06046)));
            yy = -9.78152 + (((tickAnim - 25) / 5) * (-0.44243-(-9.78152)));
            zz = 11.69559 + (((tickAnim - 25) / 5) * (3.64923-(11.69559)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -3.75877 + (((tickAnim - 30) / 5) * (-1.20238-(-3.75877)));
            yy = -0.44243 + (((tickAnim - 30) / 5) * (9.79933-(-0.44243)));
            zz = 3.64923 + (((tickAnim - 30) / 5) * (10.62813-(3.64923)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -1.20238 + (((tickAnim - 35) / 5) * (-3.13-(-1.20238)));
            yy = 9.79933 + (((tickAnim - 35) / 5) * (0.01-(9.79933)));
            zz = 10.62813 + (((tickAnim - 35) / 5) * (11.16-(10.62813)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))), legL5.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))), legL5.rotateAngleZ + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))));

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraOrcanopterus entity = (EntityPrehistoricFloraOrcanopterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(1.15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+100))/4);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(tergite2, tergite2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2), tergite2.rotateAngleY + (float) Math.toRadians(0), tergite2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite3, tergite3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+10))*3), tergite3.rotateAngleY + (float) Math.toRadians(0), tergite3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite4, tergite4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-10))*4), tergite4.rotateAngleY + (float) Math.toRadians(0), tergite4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite5, tergite5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-30))*4), tergite5.rotateAngleY + (float) Math.toRadians(0), tergite5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite6, tergite6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-50))*4), tergite6.rotateAngleY + (float) Math.toRadians(0), tergite6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite7, tergite7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-70))*4), tergite7.rotateAngleY + (float) Math.toRadians(0), tergite7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite8, tergite8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*5), tergite8.rotateAngleY + (float) Math.toRadians(0), tergite8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite9, tergite9.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*6), tergite9.rotateAngleY + (float) Math.toRadians(0), tergite9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite10, tergite10.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-130))*7), tergite10.rotateAngleY + (float) Math.toRadians(0), tergite10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite11, tergite11.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-150))*8), tergite11.rotateAngleY + (float) Math.toRadians(0), tergite11.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite12, tergite12.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-170))*9), tergite12.rotateAngleY + (float) Math.toRadians(0), tergite12.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-190))*10), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legR1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2), legR1.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*2));


        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legR2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legR2.rotateAngleZ + (float) Math.toRadians(-12.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2));


        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legR3.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legR3.rotateAngleZ + (float) Math.toRadians(-25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2));


        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*2), legR4.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legR4.rotateAngleZ + (float) Math.toRadians(-50-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2));


        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+230))*25), legR5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*35), legR5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*25));


        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+240))*25), legR5_2.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*50), legR5_2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+280))*25));


        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legL1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2), legL1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*2));


        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legL2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legL2.rotateAngleZ + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2));


        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legL3.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legL3.rotateAngleZ + (float) Math.toRadians(25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2));


        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*2), legL4.rotateAngleY + (float) Math.toRadians(-40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legL4.rotateAngleZ + (float) Math.toRadians(50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2));


        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+230))*25), legL5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*35), legL5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*25));


        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+240))*25), legL5_2.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*50), legL5_2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+280))*25));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOrcanopterus e = (EntityPrehistoricFloraOrcanopterus) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
