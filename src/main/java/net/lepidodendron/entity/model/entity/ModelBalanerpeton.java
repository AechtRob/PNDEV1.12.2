package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBalanerpeton;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBalanerpeton extends AdvancedModelBaseExtended {
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
        this.textureWidth = 45;
        this.textureHeight = 40;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 23.6F, 0.0F);


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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        EntityPrehistoricFloraBalanerpeton Balanerpeton = (EntityPrehistoricFloraBalanerpeton) e;

        this.faceTarget(f3, f4, 7, head);

        float speed = 0.3F;
        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.body, this.chest};

        AdvancedModelRenderer[] LeftArm = {this.upperarmleft, this.upperarmleft2};
        AdvancedModelRenderer[] RightArm = {this.upperarmright, this.upperarmright2};

        AdvancedModelRenderer[] LeftLeg = {this.upperlegleft, this.lowerlegleft};
        AdvancedModelRenderer[] RightLeg = {this.upperlegright, this.lowerlegright};

        if (!Balanerpeton.isReallyInWater()) {
            //Land animation:
            this.chainWave(Tail, speed * 0.5F, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.5F, 0.12F, -3, f2, 0.8F);

            //System.err.println("Blinking: " + Balanerpeton.getBlinking());


            this.jaw.rotateAngleX = -0.2F;
            this.walk(this.jaw, speed * 0.2F, 0.1F,false, 0F,0.5F, f2, 0.6F);

            if (f3 == 0.0F || !Balanerpeton.getIsMoving()) { //Not moving
                return;
            }

            this.flap(upperlegleft, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
            this.swing(upperlegleft, speed, -0.5F, true, -1, 1F, f2, 0.5F);
            this.walk(lowerlegleft, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
            this.flap(lowerlegleft, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
            this.flap(footleft, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
            this.walk(footleft, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
            this.swing(footleft, speed, 0.2F, false, 3, 0F, f2, 0.5F);

            this.flap(upperlegright, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(upperlegright, speed, 0.5F, true, 2, -1F, f2, 0.5F);
            this.walk(lowerlegright, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
            this.flap(lowerlegright, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
            this.flap(footright, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
            this.walk(footright, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
            this.swing(footright, speed, -0.2F, false, 6, 0F, f2, 0.5F);

            this.flap(upperarmleft, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
            this.swing(upperarmleft, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
            this.walk(upperarmleft2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
            this.flap(lowerarmleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
            this.walk(lowerarmleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
            this.swing(lowerarmleft, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

            this.flap(upperarmright, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
            this.swing(upperarmright, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
            this.walk(upperarmright2, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
            this.flap(lowerarmright, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
            this.walk(lowerarmright, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
            this.swing(lowerarmright, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        }
        else {
            //Swimming animation:
            speed = speed * 1.2F;

            this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r10, 0.0F, -0.0436F, 0.0F);
            this.setRotateAngle(cube_r11, 0.0F, -0.3927F, 0.0F);
            this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.0F, 0.3927F, 0.0F);
            this.setRotateAngle(cube_r14, 0.0F, 0.0436F, 0.0F);
            this.setRotateAngle(cube_r15, 0.0F, -0.3927F, 0.0F);
            this.setRotateAngle(cube_r16, 0.0F, -0.0436F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
            this.setRotateAngle(cube_r3, 0.0F, -0.0611F, 0.0F);
            this.setRotateAngle(cube_r4, 0.0F, 0.0611F, 0.0F);
            this.setRotateAngle(cube_r5, -0.0218F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0F, 0.0436F, 0.0F);
            this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
            this.setRotateAngle(cube_r8, 0.1309F, 0.1309F, -0.1745F);
            this.setRotateAngle(cube_r9, 0.1309F, -0.1309F, 0.1745F);
            this.setRotateAngle(footleft, 0.547F, -0.5194F, -0.1099F);
            this.setRotateAngle(footright, 0.547F, 0.5194F, 0.1099F);
            this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(lowerarmleft, 0.0F, 0.7854F, -0.7418F);
            this.setRotateAngle(lowerarmright, 0.0F, -0.7854F, 0.7418F);
            this.setRotateAngle(lowerlegleft, -0.0436F, -0.829F, 0.1745F);
            this.setRotateAngle(lowerlegright, -0.0436F, 0.829F, -0.1745F);
            this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(upperarmleft, 0.0F, -0.7854F, 0.1745F);
            this.setRotateAngle(upperarmleft2, 0.8259F, -0.0473F, -0.0022F);
            this.setRotateAngle(upperarmright, 0.0F, 0.7854F, -0.1745F);
            this.setRotateAngle(upperarmright2, 0.8259F, 0.0473F, 0.0022F);
            this.setRotateAngle(upperlegleft, -0.1525F, -0.698F, 0.4521F);
            this.setRotateAngle(upperlegright, -0.1525F, 0.698F, -0.4521F);

            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                return;
            }


            this.chainSwingExtended(LeftArm, speed, -0.2F,0F,3.0F, f2, 0.7F);
            this.chainSwingExtended(RightArm, speed, 0.2F,0F,0, f2, 0.7F);

            this.chainSwingExtended(LeftLeg, speed, 0.2F,0F,3.0F, f2, 0.7F);
            this.chainSwingExtended(RightLeg, speed , -0.2F,0F,0, f2, 0.7F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 1.2F, 0.3F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);


        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBalanerpeton e = (EntityPrehistoricFloraBalanerpeton) entity;
        animator.update(entity);
        this.resetToDefaultPose();
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
