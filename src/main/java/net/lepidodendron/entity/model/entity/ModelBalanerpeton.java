package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBalanerpeton;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBalanerpeton extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer upperlegright;
    private final AdvancedModelRenderer lowerlegright;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer upperlegleft;
    private final AdvancedModelRenderer lowerlegleft;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer upperarmright;
    private final AdvancedModelRenderer lowerarmleft;
    private final AdvancedModelRenderer upperarmright2;
    private final AdvancedModelRenderer upperarmleft;
    private final AdvancedModelRenderer lowerarmright;
    private final AdvancedModelRenderer upperarmleft2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    private ModelAnimator animator;

    public ModelBalanerpeton() {
        this.textureWidth = 38;
        this.textureHeight = 38;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 23.6F, -3.0F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -1.0F, 8.0F);
        this.base.addChild(hip);
        this.hip.cubeList.add(new ModelBox(hip, 24, 0, -1.5F, -1.0F, -2.0F, 3, 2, 3, 0.0F, false));

        this.upperlegright = new AdvancedModelRenderer(this);
        this.upperlegright.setRotationPoint(-1.5F, 0.0F, -1.0F);
        this.hip.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.0873F, 0.3054F, -0.4363F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 14, 3, -2.0F, -0.55F, -0.75F, 3, 1, 1, 0.01F, false));
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 0, 6, -2.0F, -0.55F, -0.05F, 3, 1, 1, 0.0F, false));

        this.lowerlegright = new AdvancedModelRenderer(this);
        this.lowerlegright.setRotationPoint(-1.6F, 0.0F, 0.15F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, -0.0436F, 0.829F, -0.1745F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 8, 25, -2.0F, -0.5F, -0.4F, 2, 1, 1, -0.02F, false));
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 20, 0, -2.0F, -0.5F, -0.65F, 2, 1, 1, -0.01F, false));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.3927F, 0.0F, 0.3491F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.0F, -7.5F);
        this.footright.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 0, -4.25F, 0.0F, 4.75F, 3, 0, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -3, 33, -4.25F, 0.025F, 4.75F, 3, 0, 3, 0.0F, false));

        this.upperlegleft = new AdvancedModelRenderer(this);
        this.upperlegleft.setRotationPoint(1.5F, 0.0F, -1.0F);
        this.hip.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.0873F, -0.3054F, 0.4363F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 14, 3, -1.0F, -0.55F, -0.75F, 3, 1, 1, 0.01F, true));
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 0, 6, -1.0F, -0.55F, -0.05F, 3, 1, 1, 0.0F, true));

        this.lowerlegleft = new AdvancedModelRenderer(this);
        this.lowerlegleft.setRotationPoint(1.6F, 0.0F, 0.15F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, -0.0436F, -0.829F, 0.1745F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 8, 25, 0.0F, -0.5F, -0.4F, 2, 1, 1, -0.02F, true));
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 20, 0, 0.0F, -0.5F, -0.65F, 2, 1, 1, -0.01F, true));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.3927F, 0.0F, -0.3491F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.0F, -7.5F);
        this.footleft.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -3, 33, 1.25F, 0.025F, 4.75F, 3, 0, 3, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 0, 1.25F, 0.0F, 4.75F, 3, 0, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.75F, 0.75F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 24, -1.0F, -0.2F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 3.75F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 24, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 5, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 3.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 19, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.0F, -7.5F, 3, 2, 8, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, 1.0F, 0.25F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0611F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 2, -1.0F, -2.0F, -7.75F, 1, 2, 8, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, 1.0F, 0.25F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0611F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 2, 0.0F, -2.0F, -7.75F, 1, 2, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0218F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -1.5F, -0.075F, -7.225F, 3, 1, 8, -0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 19, -2.0F, -0.85F, -3.0F, 4, 2, 3, 0.015F, false));
        this.chest.cubeList.add(new ModelBox(chest, 23, 12, -1.5F, -1.25F, -3.0F, 3, 2, 3, 0.0F, false));

        this.upperarmright = new AdvancedModelRenderer(this);
        this.upperarmright.setRotationPoint(-2.0F, 0.0F, -1.25F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, 0.0F, -0.4363F, -0.1745F);
        this.upperarmright.cubeList.add(new ModelBox(upperarmright, 0, 16, -2.0F, -0.55F, -0.75F, 3, 1, 1, 0.01F, false));
        this.upperarmright.cubeList.add(new ModelBox(upperarmright, 14, 5, -2.0F, -0.55F, -0.25F, 3, 1, 1, 0.0F, false));

        this.lowerarmleft = new AdvancedModelRenderer(this);
        this.lowerarmleft.setRotationPoint(-1.6F, 0.0F, 0.15F);
        this.upperarmright.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, 0.0F, -0.6981F, -0.7418F);
        this.lowerarmleft.cubeList.add(new ModelBox(lowerarmleft, 14, 25, -2.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.upperarmright2 = new AdvancedModelRenderer(this);
        this.upperarmright2.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.lowerarmleft.addChild(upperarmright2);
        this.setRotateAngle(upperarmright2, 0.5847F, 0.0F, 0.7156F);
        this.upperarmright2.cubeList.add(new ModelBox(upperarmright2, -3, 30, -2.0F, 0.025F, -1.5F, 2, 0, 3, 0.0F, false));
        this.upperarmright2.cubeList.add(new ModelBox(upperarmright2, 0, 0, -2.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.upperarmleft = new AdvancedModelRenderer(this);
        this.upperarmleft.setRotationPoint(2.0F, 0.0F, -1.25F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, 0.0F, 0.4363F, 0.1745F);
        this.upperarmleft.cubeList.add(new ModelBox(upperarmleft, 0, 16, -1.0F, -0.55F, -0.75F, 3, 1, 1, 0.01F, true));
        this.upperarmleft.cubeList.add(new ModelBox(upperarmleft, 14, 5, -1.0F, -0.55F, -0.25F, 3, 1, 1, 0.0F, true));

        this.lowerarmright = new AdvancedModelRenderer(this);
        this.lowerarmright.setRotationPoint(1.6F, 0.0F, 0.15F);
        this.upperarmleft.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, 0.0F, 0.6981F, 0.7418F);
        this.lowerarmright.cubeList.add(new ModelBox(lowerarmright, 14, 25, 0.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.upperarmleft2 = new AdvancedModelRenderer(this);
        this.upperarmleft2.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.lowerarmright.addChild(upperarmleft2);
        this.setRotateAngle(upperarmleft2, 0.5847F, 0.0F, -0.7156F);
        this.upperarmleft2.cubeList.add(new ModelBox(upperarmleft2, 0, 0, 0.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));
        this.upperarmleft2.cubeList.add(new ModelBox(upperarmleft2, -3, 30, 0.0F, 0.025F, -1.5F, 2, 0, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.chest.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 17, 18, -1.0F, -1.0F, -4.6F, 2, 1, 5, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 10, -1.0F, -1.25F, -1.625F, 2, 1, 2, 0.015F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.0F, -4.6F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0436F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 13, -1.0F, -1.0F, 2.75F, 2, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 0.0F, -4.6F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 27, -2.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -0.75F, -3.5F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.1309F, -0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 19, -0.675F, -0.35F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.75F, -3.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, -0.1309F, 0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 19, -0.325F, -0.35F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.0F, -4.6F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0436F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 13, -1.0F, -1.0F, 2.75F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.0F, -4.6F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3927F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 27, 0.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, -4.6F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 17, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 12, -1.0F, 0.0F, -4.5F, 2, 1, 5, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 1.0F, -4.5F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 24, -2.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 1.0F, -4.5F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0436F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 3, -1.0F, -1.0F, 2.75F, 2, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 1.0F, -4.5F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3927F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 24, 0.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 1.0F, -4.5F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.0436F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 3, -1.0F, -1.0F, 2.75F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBalanerpeton ee = (EntityPrehistoricFloraBalanerpeton) entitylivingbaseIn;
        if (ee.isReallyInWater()) {
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            if (ee.getIsFast()) {
                animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
    }
    
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBalanerpeton entity = (EntityPrehistoricFloraBalanerpeton) entitylivingbaseIn;
        int animCycle = 20;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*20), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*5));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-220))*1.5);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60+30))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100+60))*15));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+205))*5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-230))*10), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+190))*10), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))));


        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(20), upperlegright.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), upperlegright.rotateAngleZ + (float) Math.toRadians(-20));


        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(0), lowerlegright.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-50))*10), lowerlegright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), footright.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), footright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(20), upperlegleft.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), upperlegleft.rotateAngleZ + (float) Math.toRadians(20));


        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(0), lowerlegleft.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), lowerlegleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), footleft.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), footleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(70), upperarmright.rotateAngleY + (float) Math.toRadians(90-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmright.rotateAngleZ + (float) Math.toRadians(10));


        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(70), upperarmleft.rotateAngleY + (float) Math.toRadians(-90-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmleft.rotateAngleZ + (float) Math.toRadians(-10));


        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(0), lowerarmleft.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), lowerarmleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperarmright2, upperarmright2.rotateAngleX + (float) Math.toRadians(0), upperarmright2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), upperarmright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(0), lowerarmright.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), lowerarmright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperarmleft2, upperarmleft2.rotateAngleX + (float) Math.toRadians(0), upperarmleft2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), upperarmleft2.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBalanerpeton entity = (EntityPrehistoricFloraBalanerpeton) entitylivingbaseIn;
        int animCycle = 5;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-10), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25))*20), base.rotateAngleZ + (float) Math.toRadians(0));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-180))*4);
        this.base.rotationPointY = this.base.rotationPointY - (float)(2.3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.25-90))*0.25);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-100))*20), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-100))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(7.5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-190))*30), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-190))*10));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(15), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-250))*40), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-250))*20));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(7.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+160))*30), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(5), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+220))*30), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+370))*28), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 52.47179 + (((tickAnim - 0) / 2) * (-10.04095-(52.47179)));
            yy = 15.55029 + (((tickAnim - 0) / 2) * (-55.00443-(15.55029)));
            zz = 2.63684 + (((tickAnim - 0) / 2) * (18.4033-(2.63684)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10.04095 + (((tickAnim - 2) / 1) * (32.86595-(-10.04095)));
            yy = -55.00443 + (((tickAnim - 2) / 1) * (-69.49032-(-55.00443)));
            zz = 18.4033 + (((tickAnim - 2) / 1) * (-29.25227-(18.4033)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 32.86595 + (((tickAnim - 3) / 2) * (52.47179-(32.86595)));
            yy = -69.49032 + (((tickAnim - 3) / 2) * (15.55029-(-69.49032)));
            zz = -29.25227 + (((tickAnim - 3) / 2) * (2.63684-(-29.25227)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 90 + (((tickAnim - 0) / 1) * (87.43288-(90)));
            yy = 0 + (((tickAnim - 0) / 1) * (30.36677-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (37.39748-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 87.43288 + (((tickAnim - 1) / 2) * (17.5-(87.43288)));
            yy = 30.36677 + (((tickAnim - 1) / 2) * (0-(30.36677)));
            zz = 37.39748 + (((tickAnim - 1) / 2) * (7.5-(37.39748)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 3) / 0) * (19.16667-(17.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 7.5 + (((tickAnim - 3) / 0) * (5-(7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 19.16667 + (((tickAnim - 3) / 1) * (14.58333-(19.16667)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 5 + (((tickAnim - 3) / 1) * (2.5-(5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 14.58333 + (((tickAnim - 4) / 1) * (90-(14.58333)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 2.5 + (((tickAnim - 4) / 1) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.86595 + (((tickAnim - 0) / 3) * (52.47179-(32.86595)));
            yy = 69.49032 + (((tickAnim - 0) / 3) * (-15.55029-(69.49032)));
            zz = 29.25227 + (((tickAnim - 0) / 3) * (-2.63684-(29.25227)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 52.47179 + (((tickAnim - 3) / 1) * (-10.04095-(52.47179)));
            yy = -15.55029 + (((tickAnim - 3) / 1) * (55.00443-(-15.55029)));
            zz = -2.63684 + (((tickAnim - 3) / 1) * (-18.4033-(-2.63684)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -10.04095 + (((tickAnim - 4) / 1) * (32.86595-(-10.04095)));
            yy = 55.00443 + (((tickAnim - 4) / 1) * (69.49032-(55.00443)));
            zz = -18.4033 + (((tickAnim - 4) / 1) * (29.25227-(-18.4033)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 17.5 + (((tickAnim - 0) / 1) * (19.16667-(17.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -7.5 + (((tickAnim - 0) / 1) * (-5-(-7.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 19.16667 + (((tickAnim - 1) / 1) * (14.58333-(19.16667)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 1) / 1) * (-2.5-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 14.58333 + (((tickAnim - 2) / 1) * (90-(14.58333)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 2) / 1) * (0-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 90 + (((tickAnim - 3) / 0) * (87.43288-(90)));
            yy = 0 + (((tickAnim - 3) / 0) * (-30.36677-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-37.39748-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 87.43288 + (((tickAnim - 3) / 2) * (17.5-(87.43288)));
            yy = -30.36677 + (((tickAnim - 3) / 2) * (0-(-30.36677)));
            zz = -37.39748 + (((tickAnim - 3) / 2) * (-7.5-(-37.39748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31.78321 + (((tickAnim - 0) / 3) * (139.43625-(31.78321)));
            yy = -13.00929 + (((tickAnim - 0) / 3) * (48.49692-(-13.00929)));
            zz = -23.07632 + (((tickAnim - 0) / 3) * (-2.61401-(-23.07632)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 139.43625 + (((tickAnim - 3) / 1) * (23.0726-(139.43625)));
            yy = 48.49692 + (((tickAnim - 3) / 1) * (-11.83099-(48.49692)));
            zz = -2.61401 + (((tickAnim - 3) / 1) * (46.75154-(-2.61401)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 23.0726 + (((tickAnim - 4) / 1) * (31.78321-(23.0726)));
            yy = -11.83099 + (((tickAnim - 4) / 1) * (-13.00929-(-11.83099)));
            zz = 46.75154 + (((tickAnim - 4) / 1) * (-23.07632-(46.75154)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -3.87828 + (((tickAnim - 0) / 2) * (-60.21679-(-3.87828)));
            yy = -8.05953 + (((tickAnim - 0) / 2) * (-7.81222-(-8.05953)));
            zz = 12.33142 + (((tickAnim - 0) / 2) * (43.40868-(12.33142)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -60.21679 + (((tickAnim - 2) / 1) * (-44.14541-(-60.21679)));
            yy = -7.81222 + (((tickAnim - 2) / 1) * (-4.37562-(-7.81222)));
            zz = 43.40868 + (((tickAnim - 2) / 1) * (-67.09214-(43.40868)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -44.14541 + (((tickAnim - 3) / 1) * (-46.32477-(-44.14541)));
            yy = -4.37562 + (((tickAnim - 3) / 1) * (6.48822-(-4.37562)));
            zz = -67.09214 + (((tickAnim - 3) / 1) * (-77.77744-(-67.09214)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -46.32477 + (((tickAnim - 4) / 1) * (-3.87828-(-46.32477)));
            yy = 6.48822 + (((tickAnim - 4) / 1) * (-8.05953-(6.48822)));
            zz = -77.77744 + (((tickAnim - 4) / 1) * (12.33142-(-77.77744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright2, upperarmright2.rotateAngleX + (float) Math.toRadians(xx), upperarmright2.rotateAngleY + (float) Math.toRadians(yy), upperarmright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 139.43625 + (((tickAnim - 0) / 2) * (23.0726-(139.43625)));
            yy = -48.49692 + (((tickAnim - 0) / 2) * (11.83099-(-48.49692)));
            zz = 2.61401 + (((tickAnim - 0) / 2) * (-46.75154-(2.61401)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.0726 + (((tickAnim - 2) / 1) * (31.78321-(23.0726)));
            yy = 11.83099 + (((tickAnim - 2) / 1) * (13.00929-(11.83099)));
            zz = -46.75154 + (((tickAnim - 2) / 1) * (23.07632-(-46.75154)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 31.78321 + (((tickAnim - 3) / 2) * (139.43625-(31.78321)));
            yy = 13.00929 + (((tickAnim - 3) / 2) * (-48.49692-(13.00929)));
            zz = 23.07632 + (((tickAnim - 3) / 2) * (2.61401-(23.07632)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -44.14541 + (((tickAnim - 0) / 2) * (-46.32477-(-44.14541)));
            yy = 4.37562 + (((tickAnim - 0) / 2) * (-6.48822-(4.37562)));
            zz = 67.09214 + (((tickAnim - 0) / 2) * (77.77744-(67.09214)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -46.32477 + (((tickAnim - 2) / 1) * (-3.87828-(-46.32477)));
            yy = -6.48822 + (((tickAnim - 2) / 1) * (8.05953-(-6.48822)));
            zz = 77.77744 + (((tickAnim - 2) / 1) * (-12.33142-(77.77744)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -3.87828 + (((tickAnim - 3) / 1) * (-60.21679-(-3.87828)));
            yy = 8.05953 + (((tickAnim - 3) / 1) * (7.81222-(8.05953)));
            zz = -12.33142 + (((tickAnim - 3) / 1) * (-43.40868-(-12.33142)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -60.21679 + (((tickAnim - 4) / 1) * (-44.14541-(-60.21679)));
            yy = 7.81222 + (((tickAnim - 4) / 1) * (4.37562-(7.81222)));
            zz = -43.40868 + (((tickAnim - 4) / 1) * (67.09214-(-43.40868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft2, upperarmleft2.rotateAngleX + (float) Math.toRadians(xx), upperarmleft2.rotateAngleY + (float) Math.toRadians(yy), upperarmleft2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBalanerpeton entity = (EntityPrehistoricFloraBalanerpeton) entitylivingbaseIn;
        int animCycle = 20;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*10), base.rotateAngleZ + (float) Math.toRadians(0));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-180))*2);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-190))*15), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-190))*10));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-250))*20), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-250))*20));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+160))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+220))*15), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+370))*14), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 4.62389 + (((tickAnim - 0) / 6) * (-19.3427-(4.62389)));
            yy = -9.07786 + (((tickAnim - 0) / 6) * (-48.7097-(-9.07786)));
            zz = 3.48379 + (((tickAnim - 0) / 6) * (49.04842-(3.48379)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -19.3427 + (((tickAnim - 6) / 4) * (43.92015-(-19.3427)));
            yy = -48.7097 + (((tickAnim - 6) / 4) * (-73.97501-(-48.7097)));
            zz = 49.04842 + (((tickAnim - 6) / 4) * (-16.06413-(49.04842)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 43.92015 + (((tickAnim - 10) / 3) * (30.35055-(43.92015)));
            yy = -73.97501 + (((tickAnim - 10) / 3) * (-51.82869-(-73.97501)));
            zz = -16.06413 + (((tickAnim - 10) / 3) * (-6.14004-(-16.06413)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 30.35055 + (((tickAnim - 13) / 2) * (19.78492-(30.35055)));
            yy = -51.82869 + (((tickAnim - 13) / 2) * (-27.48208-(-51.82869)));
            zz = -6.14004 + (((tickAnim - 13) / 2) * (-1.61798-(-6.14004)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 19.78492 + (((tickAnim - 15) / 5) * (4.62389-(19.78492)));
            yy = -27.48208 + (((tickAnim - 15) / 5) * (-9.07786-(-27.48208)));
            zz = -1.61798 + (((tickAnim - 15) / 5) * (3.48379-(-1.61798)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -9.84623 + (((tickAnim - 0) / 6) * (0-(-9.84623)));
            yy = 7.90731 + (((tickAnim - 0) / 6) * (35-(7.90731)));
            zz = -8.20379 + (((tickAnim - 0) / 6) * (0-(-8.20379)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 35 + (((tickAnim - 6) / 4) * (0-(35)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (2.29891-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-1.93076-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (1.81836-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.29891 + (((tickAnim - 15) / 5) * (-9.84623-(2.29891)));
            yy = -1.93076 + (((tickAnim - 15) / 5) * (7.90731-(-1.93076)));
            zz = 1.81836 + (((tickAnim - 15) / 5) * (-8.20379-(1.81836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -22.5782 + (((tickAnim - 0) / 6) * (64.25144-(-22.5782)));
            yy = -58.38456 + (((tickAnim - 0) / 6) * (9.44456-(-58.38456)));
            zz = 43.02639 + (((tickAnim - 0) / 6) * (-12.40102-(43.02639)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 64.25144 + (((tickAnim - 6) / 4) * (-1.55041-(64.25144)));
            yy = 9.44456 + (((tickAnim - 6) / 4) * (15.91533-(9.44456)));
            zz = -12.40102 + (((tickAnim - 6) / 4) * (-7.3541-(-12.40102)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -1.55041 + (((tickAnim - 10) / 5) * (-7.85591-(-1.55041)));
            yy = 15.91533 + (((tickAnim - 10) / 5) * (-20.95532-(15.91533)));
            zz = -7.3541 + (((tickAnim - 10) / 5) * (10.12173-(-7.3541)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.85591 + (((tickAnim - 15) / 5) * (-22.5782-(-7.85591)));
            yy = -20.95532 + (((tickAnim - 15) / 5) * (-58.38456-(-20.95532)));
            zz = 10.12173 + (((tickAnim - 15) / 5) * (43.02639-(10.12173)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.92015 + (((tickAnim - 0) / 3) * (30.35055-(43.92015)));
            yy = 73.97501 + (((tickAnim - 0) / 3) * (51.82869-(73.97501)));
            zz = 16.06413 + (((tickAnim - 0) / 3) * (6.14004-(16.06413)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30.35055 + (((tickAnim - 3) / 2) * (19.78492-(30.35055)));
            yy = 51.82869 + (((tickAnim - 3) / 2) * (27.48208-(51.82869)));
            zz = 6.14004 + (((tickAnim - 3) / 2) * (1.61798-(6.14004)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.78492 + (((tickAnim - 5) / 5) * (4.62389-(19.78492)));
            yy = 27.48208 + (((tickAnim - 5) / 5) * (9.07786-(27.48208)));
            zz = 1.61798 + (((tickAnim - 5) / 5) * (-3.48379-(1.61798)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 4.62389 + (((tickAnim - 10) / 6) * (-19.3427-(4.62389)));
            yy = 9.07786 + (((tickAnim - 10) / 6) * (48.7097-(9.07786)));
            zz = -3.48379 + (((tickAnim - 10) / 6) * (-49.04842-(-3.48379)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -19.3427 + (((tickAnim - 16) / 4) * (43.92015-(-19.3427)));
            yy = 48.7097 + (((tickAnim - 16) / 4) * (73.97501-(48.7097)));
            zz = -49.04842 + (((tickAnim - 16) / 4) * (16.06413-(-49.04842)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.29891-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.93076-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.81836-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.29891 + (((tickAnim - 5) / 5) * (-9.84623-(2.29891)));
            yy = 1.93076 + (((tickAnim - 5) / 5) * (-7.90731-(1.93076)));
            zz = -1.81836 + (((tickAnim - 5) / 5) * (8.20379-(-1.81836)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -9.84623 + (((tickAnim - 10) / 6) * (0-(-9.84623)));
            yy = -7.90731 + (((tickAnim - 10) / 6) * (-35-(-7.90731)));
            zz = 8.20379 + (((tickAnim - 10) / 6) * (0-(8.20379)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -35 + (((tickAnim - 16) / 4) * (0-(-35)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.55041 + (((tickAnim - 0) / 5) * (-7.85591-(-1.55041)));
            yy = -15.91533 + (((tickAnim - 0) / 5) * (20.95532-(-15.91533)));
            zz = 7.3541 + (((tickAnim - 0) / 5) * (-10.12173-(7.3541)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.85591 + (((tickAnim - 5) / 5) * (-22.5782-(-7.85591)));
            yy = 20.95532 + (((tickAnim - 5) / 5) * (58.38456-(20.95532)));
            zz = -10.12173 + (((tickAnim - 5) / 5) * (-43.02639-(-10.12173)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -22.5782 + (((tickAnim - 10) / 6) * (64.25144-(-22.5782)));
            yy = 58.38456 + (((tickAnim - 10) / 6) * (-9.44456-(58.38456)));
            zz = -43.02639 + (((tickAnim - 10) / 6) * (12.40102-(-43.02639)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 64.25144 + (((tickAnim - 16) / 4) * (-1.55041-(64.25144)));
            yy = -9.44456 + (((tickAnim - 16) / 4) * (-15.91533-(-9.44456)));
            zz = 12.40102 + (((tickAnim - 16) / 4) * (7.3541-(12.40102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-7.42038-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (17.44798-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (1.72015-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -7.42038 + (((tickAnim - 1) / 1) * (-9.33706-(-7.42038)));
            yy = 17.44798 + (((tickAnim - 1) / 1) * (34.42247-(17.44798)));
            zz = 1.72015 + (((tickAnim - 1) / 1) * (-0.31363-(1.72015)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -9.33706 + (((tickAnim - 2) / 1) * (-6.25374-(-9.33706)));
            yy = 34.42247 + (((tickAnim - 2) / 1) * (51.39697-(34.42247)));
            zz = -0.31363 + (((tickAnim - 2) / 1) * (-2.34741-(-0.31363)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -6.25374 + (((tickAnim - 3) / 0) * (-8.33832-(-6.25374)));
            yy = 51.39697 + (((tickAnim - 3) / 0) * (68.52929-(51.39697)));
            zz = -2.34741 + (((tickAnim - 3) / 0) * (-3.12989-(-2.34741)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -8.33832 + (((tickAnim - 3) / 1) * (-5.42289-(-8.33832)));
            yy = 68.52929 + (((tickAnim - 3) / 1) * (85.66161-(68.52929)));
            zz = -3.12989 + (((tickAnim - 3) / 1) * (-3.91236-(-3.12989)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5.42289 + (((tickAnim - 4) / 1) * (2.49253-(-5.42289)));
            yy = 85.66161 + (((tickAnim - 4) / 1) * (102.79394-(85.66161)));
            zz = -3.91236 + (((tickAnim - 4) / 1) * (-4.69483-(-3.91236)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 2.49253 + (((tickAnim - 5) / 1) * (8.91391-(2.49253)));
            yy = 102.79394 + (((tickAnim - 5) / 1) * (100.01182-(102.79394)));
            zz = -4.69483 + (((tickAnim - 5) / 1) * (10.65687-(-4.69483)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.91391 + (((tickAnim - 6) / 2) * (29.25667-(8.91391)));
            yy = 100.01182 + (((tickAnim - 6) / 2) * (94.4476-(100.01182)));
            zz = 10.65687 + (((tickAnim - 6) / 2) * (41.36028-(10.65687)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 29.25667 + (((tickAnim - 8) / 0) * (32.15882-(29.25667)));
            yy = 94.4476 + (((tickAnim - 8) / 0) * (88.51605-(94.4476)));
            zz = 41.36028 + (((tickAnim - 8) / 0) * (47.6814-(41.36028)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.15882 + (((tickAnim - 8) / 2) * (52.96312-(32.15882)));
            yy = 88.51605 + (((tickAnim - 8) / 2) * (76.65296-(88.51605)));
            zz = 47.6814 + (((tickAnim - 8) / 2) * (60.32364-(47.6814)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 52.96312 + (((tickAnim - 10) / 5) * (34.50697-(52.96312)));
            yy = 76.65296 + (((tickAnim - 10) / 5) * (7.31211-(76.65296)));
            zz = 60.32364 + (((tickAnim - 10) / 5) * (53.73454-(60.32364)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 34.50697 + (((tickAnim - 15) / 3) * (9.8238-(34.50697)));
            yy = 7.31211 + (((tickAnim - 15) / 3) * (-0.47976-(7.31211)));
            zz = 53.73454 + (((tickAnim - 15) / 3) * (45.41626-(53.73454)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 9.8238 + (((tickAnim - 18) / 1) * (-1.7254-(9.8238)));
            yy = -0.47976 + (((tickAnim - 18) / 1) * (-0.15992-(-0.47976)));
            zz = 45.41626 + (((tickAnim - 18) / 1) * (15.13875-(45.41626)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -1.7254 + (((tickAnim - 19) / 1) * (0-(-1.7254)));
            yy = -0.15992 + (((tickAnim - 19) / 1) * (0-(-0.15992)));
            zz = 15.13875 + (((tickAnim - 19) / 1) * (0-(15.13875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (36.03654-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-19.88946-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-44.27436-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 36.03654 + (((tickAnim - 3) / 2) * (78.05121-(36.03654)));
            yy = -19.88946 + (((tickAnim - 3) / 2) * (-19.42276-(-19.88946)));
            zz = -44.27436 + (((tickAnim - 3) / 2) * (-99.60664-(-44.27436)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 78.05121 + (((tickAnim - 5) / 5) * (-30.4855-(78.05121)));
            yy = -19.42276 + (((tickAnim - 5) / 5) * (1.57558-(-19.42276)));
            zz = -99.60664 + (((tickAnim - 5) / 5) * (-19.00491-(-99.60664)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.4855 + (((tickAnim - 10) / 10) * (0-(-30.4855)));
            yy = 1.57558 + (((tickAnim - 10) / 10) * (0-(1.57558)));
            zz = -19.00491 + (((tickAnim - 10) / 10) * (0-(-19.00491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.402-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-10.96826-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-8.6872-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 19.402 + (((tickAnim - 3) / 2) * (52.26526-(19.402)));
            yy = -10.96826 + (((tickAnim - 3) / 2) * (-25.42411-(-10.96826)));
            zz = -8.6872 + (((tickAnim - 3) / 2) * (-45.15912-(-8.6872)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 52.26526 + (((tickAnim - 5) / 3) * (56.98487-(52.26526)));
            yy = -25.42411 + (((tickAnim - 5) / 3) * (-37.08083-(-25.42411)));
            zz = -45.15912 + (((tickAnim - 5) / 3) * (-58.43678-(-45.15912)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 56.98487 + (((tickAnim - 8) / 2) * (85.33446-(56.98487)));
            yy = -37.08083 + (((tickAnim - 8) / 2) * (-30.74348-(-37.08083)));
            zz = -58.43678 + (((tickAnim - 8) / 2) * (-106.51025-(-58.43678)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 85.33446 + (((tickAnim - 10) / 5) * (25.03217-(85.33446)));
            yy = -30.74348 + (((tickAnim - 10) / 5) * (28.62434-(-30.74348)));
            zz = -106.51025 + (((tickAnim - 10) / 5) * (-80.07606-(-106.51025)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 25.03217 + (((tickAnim - 15) / 5) * (0-(25.03217)));
            yy = 28.62434 + (((tickAnim - 15) / 5) * (0-(28.62434)));
            zz = -80.07606 + (((tickAnim - 15) / 5) * (0-(-80.07606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright2, upperarmright2.rotateAngleX + (float) Math.toRadians(xx), upperarmright2.rotateAngleY + (float) Math.toRadians(yy), upperarmright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 52.96312 + (((tickAnim - 0) / 5) * (34.50697-(52.96312)));
            yy = -76.65296 + (((tickAnim - 0) / 5) * (-7.31211-(-76.65296)));
            zz = -60.32364 + (((tickAnim - 0) / 5) * (-53.73454-(-60.32364)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 34.50697 + (((tickAnim - 5) / 3) * (9.8238-(34.50697)));
            yy = -7.31211 + (((tickAnim - 5) / 3) * (0.47976-(-7.31211)));
            zz = -53.73454 + (((tickAnim - 5) / 3) * (-45.41626-(-53.73454)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.8238 + (((tickAnim - 8) / 1) * (-1.7254-(9.8238)));
            yy = 0.47976 + (((tickAnim - 8) / 1) * (0.15992-(0.47976)));
            zz = -45.41626 + (((tickAnim - 8) / 1) * (-15.13875-(-45.41626)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -1.7254 + (((tickAnim - 9) / 1) * (0-(-1.7254)));
            yy = 0.15992 + (((tickAnim - 9) / 1) * (0-(0.15992)));
            zz = -15.13875 + (((tickAnim - 9) / 1) * (0-(-15.13875)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (-7.42038-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (-17.44798-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (-1.72015-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -7.42038 + (((tickAnim - 11) / 1) * (-9.33706-(-7.42038)));
            yy = -17.44798 + (((tickAnim - 11) / 1) * (-34.42247-(-17.44798)));
            zz = -1.72015 + (((tickAnim - 11) / 1) * (0.31363-(-1.72015)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -9.33706 + (((tickAnim - 12) / 1) * (-6.25374-(-9.33706)));
            yy = -34.42247 + (((tickAnim - 12) / 1) * (-51.39697-(-34.42247)));
            zz = 0.31363 + (((tickAnim - 12) / 1) * (2.34741-(0.31363)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -6.25374 + (((tickAnim - 13) / 0) * (-8.33832-(-6.25374)));
            yy = -51.39697 + (((tickAnim - 13) / 0) * (-68.52929-(-51.39697)));
            zz = 2.34741 + (((tickAnim - 13) / 0) * (3.12989-(2.34741)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -8.33832 + (((tickAnim - 13) / 1) * (-5.42289-(-8.33832)));
            yy = -68.52929 + (((tickAnim - 13) / 1) * (-85.66161-(-68.52929)));
            zz = 3.12989 + (((tickAnim - 13) / 1) * (3.91236-(3.12989)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -5.42289 + (((tickAnim - 14) / 1) * (2.49253-(-5.42289)));
            yy = -85.66161 + (((tickAnim - 14) / 1) * (-102.79394-(-85.66161)));
            zz = 3.91236 + (((tickAnim - 14) / 1) * (4.69483-(3.91236)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 2.49253 + (((tickAnim - 15) / 1) * (8.91391-(2.49253)));
            yy = -102.79394 + (((tickAnim - 15) / 1) * (-100.01182-(-102.79394)));
            zz = 4.69483 + (((tickAnim - 15) / 1) * (-10.65687-(4.69483)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 8.91391 + (((tickAnim - 16) / 2) * (29.25667-(8.91391)));
            yy = -100.01182 + (((tickAnim - 16) / 2) * (-94.4476-(-100.01182)));
            zz = -10.65687 + (((tickAnim - 16) / 2) * (-41.36028-(-10.65687)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 29.25667 + (((tickAnim - 18) / 0) * (32.15882-(29.25667)));
            yy = -94.4476 + (((tickAnim - 18) / 0) * (-88.51605-(-94.4476)));
            zz = -41.36028 + (((tickAnim - 18) / 0) * (-47.6814-(-41.36028)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 32.15882 + (((tickAnim - 18) / 2) * (52.96312-(32.15882)));
            yy = -88.51605 + (((tickAnim - 18) / 2) * (-76.65296-(-88.51605)));
            zz = -47.6814 + (((tickAnim - 18) / 2) * (-60.32364-(-47.6814)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -30.4855 + (((tickAnim - 0) / 10) * (0-(-30.4855)));
            yy = -1.57558 + (((tickAnim - 0) / 10) * (0-(-1.57558)));
            zz = 19.00491 + (((tickAnim - 0) / 10) * (0-(19.00491)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (36.03654-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (19.88946-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (44.27436-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 36.03654 + (((tickAnim - 13) / 2) * (78.05121-(36.03654)));
            yy = 19.88946 + (((tickAnim - 13) / 2) * (19.42276-(19.88946)));
            zz = 44.27436 + (((tickAnim - 13) / 2) * (99.60664-(44.27436)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 78.05121 + (((tickAnim - 15) / 5) * (-30.4855-(78.05121)));
            yy = 19.42276 + (((tickAnim - 15) / 5) * (-1.57558-(19.42276)));
            zz = 99.60664 + (((tickAnim - 15) / 5) * (19.00491-(99.60664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 85.33446 + (((tickAnim - 0) / 5) * (25.03217-(85.33446)));
            yy = 30.74348 + (((tickAnim - 0) / 5) * (-28.62434-(30.74348)));
            zz = 106.51025 + (((tickAnim - 0) / 5) * (80.07606-(106.51025)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.03217 + (((tickAnim - 5) / 5) * (0-(25.03217)));
            yy = -28.62434 + (((tickAnim - 5) / 5) * (0-(-28.62434)));
            zz = 80.07606 + (((tickAnim - 5) / 5) * (0-(80.07606)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (19.402-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (10.96826-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (8.6872-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 19.402 + (((tickAnim - 13) / 2) * (52.26526-(19.402)));
            yy = 10.96826 + (((tickAnim - 13) / 2) * (25.42411-(10.96826)));
            zz = 8.6872 + (((tickAnim - 13) / 2) * (45.15912-(8.6872)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 52.26526 + (((tickAnim - 15) / 3) * (56.98487-(52.26526)));
            yy = 25.42411 + (((tickAnim - 15) / 3) * (37.08083-(25.42411)));
            zz = 45.15912 + (((tickAnim - 15) / 3) * (58.43678-(45.15912)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 56.98487 + (((tickAnim - 18) / 2) * (85.33446-(56.98487)));
            yy = 37.08083 + (((tickAnim - 18) / 2) * (30.74348-(37.08083)));
            zz = 58.43678 + (((tickAnim - 18) / 2) * (106.51025-(58.43678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft2, upperarmleft2.rotateAngleX + (float) Math.toRadians(xx), upperarmleft2.rotateAngleY + (float) Math.toRadians(yy), upperarmleft2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraBalanerpeton Balanerpeton = (EntityPrehistoricFloraBalanerpeton) e;

        this.faceTarget(f3, f4, 7, head);

//        float speed = 0.3F;
//        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
//        AdvancedModelRenderer[] Torso = {this.body, this.chest};
//
//        AdvancedModelRenderer[] LeftArm = {this.upperarmleft, this.upperarmleft2};
//        AdvancedModelRenderer[] RightArm = {this.upperarmright, this.upperarmright2};
//
//        AdvancedModelRenderer[] LeftLeg = {this.upperlegleft, this.lowerlegleft};
//        AdvancedModelRenderer[] RightLeg = {this.upperlegright, this.lowerlegright};
//
//        if (!Balanerpeton.isReallyInWater()) {
//            //Land animation:
//            this.chainWave(Tail, speed * 0.5F, 0.05F, -3, f2, 1);
//            this.chainSwing(Tail, speed * 0.5F, 0.12F, -3, f2, 0.8F);
//
//            //System.err.println("Blinking: " + Balanerpeton.getBlinking());
//
//
//            this.jaw.rotateAngleX = -0.2F;
//            this.walk(this.jaw, speed * 0.2F, 0.1F,false, 0F,0.5F, f2, 0.6F);
//
//            if (f3 == 0.0F || !Balanerpeton.getIsMoving()) { //Not moving
//                return;
//            }
//
//            this.flap(upperlegleft, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
//            this.swing(upperlegleft, speed, -0.5F, true, -1, 1F, f2, 0.5F);
//            this.walk(lowerlegleft, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
//            this.flap(lowerlegleft, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
//            this.flap(footleft, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
//            this.walk(footleft, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
//            this.swing(footleft, speed, 0.2F, false, 3, 0F, f2, 0.5F);
//
//            this.flap(upperlegright, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
//            this.swing(upperlegright, speed, 0.5F, true, 2, -1F, f2, 0.5F);
//            this.walk(lowerlegright, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
//            this.flap(lowerlegright, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
//            this.flap(footright, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
//            this.walk(footright, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
//            this.swing(footright, speed, -0.2F, false, 6, 0F, f2, 0.5F);
//
//            this.flap(upperarmleft, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
//            this.swing(upperarmleft, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
//            this.walk(upperarmleft2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
//            this.flap(lowerarmleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
//            this.walk(lowerarmleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
//            this.swing(lowerarmleft, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);
//
//            this.flap(upperarmright, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
//            this.swing(upperarmright, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
//            this.walk(upperarmright2, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
//            this.flap(lowerarmright, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
//            this.walk(lowerarmright, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
//            this.swing(lowerarmright, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);
//
//        }
//        else {
//            //Swimming animation:
//            speed = speed * 1.2F;
//
//            this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
//            this.setRotateAngle(cube_r10, 0.0F, -0.0436F, 0.0F);
//            this.setRotateAngle(cube_r11, 0.0F, -0.3927F, 0.0F);
//            this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r13, 0.0F, 0.3927F, 0.0F);
//            this.setRotateAngle(cube_r14, 0.0F, 0.0436F, 0.0F);
//            this.setRotateAngle(cube_r15, 0.0F, -0.3927F, 0.0F);
//            this.setRotateAngle(cube_r16, 0.0F, -0.0436F, 0.0F);
//            this.setRotateAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
//            this.setRotateAngle(cube_r3, 0.0F, -0.0611F, 0.0F);
//            this.setRotateAngle(cube_r4, 0.0F, 0.0611F, 0.0F);
//            this.setRotateAngle(cube_r5, -0.0218F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r6, 0.0F, 0.0436F, 0.0F);
//            this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
//            this.setRotateAngle(cube_r8, 0.1309F, 0.1309F, -0.1745F);
//            this.setRotateAngle(cube_r9, 0.1309F, -0.1309F, 0.1745F);
//            this.setRotateAngle(footleft, 0.547F, -0.5194F, -0.1099F);
//            this.setRotateAngle(footright, 0.547F, 0.5194F, 0.1099F);
//            this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
//            this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(lowerarmleft, 0.0F, 0.7854F, -0.7418F);
//            this.setRotateAngle(lowerarmright, 0.0F, -0.7854F, 0.7418F);
//            this.setRotateAngle(lowerlegleft, -0.0436F, -0.829F, 0.1745F);
//            this.setRotateAngle(lowerlegright, -0.0436F, 0.829F, -0.1745F);
//            this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
//            this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
//            this.setRotateAngle(upperarmleft, 0.0F, -0.7854F, 0.1745F);
//            this.setRotateAngle(upperarmleft2, 0.8259F, -0.0473F, -0.0022F);
//            this.setRotateAngle(upperarmright, 0.0F, 0.7854F, -0.1745F);
//            this.setRotateAngle(upperarmright2, 0.8259F, 0.0473F, 0.0022F);
//            this.setRotateAngle(upperlegleft, -0.1525F, -0.698F, 0.4521F);
//            this.setRotateAngle(upperlegright, -0.1525F, 0.698F, -0.4521F);
//
//            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
//            if (f3 == 0.0F) {
//                return;
//            }
//
//
//            this.chainSwingExtended(LeftArm, speed, -0.2F,0F,3.0F, f2, 0.7F);
//            this.chainSwingExtended(RightArm, speed, 0.2F,0F,0, f2, 0.7F);
//
//            this.chainSwingExtended(LeftLeg, speed, 0.2F,0F,3.0F, f2, 0.7F);
//            this.chainSwingExtended(RightLeg, speed , -0.2F,0F,0, f2, 0.7F);
//
//            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
//            this.chainSwing(Tail, speed * 1.2F, 0.3F, -3, f2, 0.8F);
//            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
//
//            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
//            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);
//
//
//        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBalanerpeton e = (EntityPrehistoricFloraBalanerpeton) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
