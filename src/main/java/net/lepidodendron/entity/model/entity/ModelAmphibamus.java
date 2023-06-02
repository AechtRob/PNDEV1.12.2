package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmphibamus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelAmphibamus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer upperlegright;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer lowerlegright;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer upperlegleft;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer lowerlegleft;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer upperarmright;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer lowerarmright;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer handright;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer upperarmleft;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer lowerarmleft;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer handleft;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeR2;

    private ModelAnimator animator;

    public ModelAmphibamus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 22.775F, -1.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.5F, 4.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 12, -1.0F, 0.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.upperlegright = new AdvancedModelRenderer(this);
        this.upperlegright.setRotationPoint(-1.0F, 0.25F, 4.5F);
        this.hips.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.2269F, -0.1309F, -0.0436F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.upperlegright.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -0.5F, -1.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.lowerlegright = new AdvancedModelRenderer(this);
        this.lowerlegright.setRotationPoint(-2.5F, 0.1F, -0.25F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.0436F, 1.6144F, -0.0436F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.lowerlegright.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 17, -0.5F, -0.5F, -1.0F, 1, 2, 1, -0.01F, false));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(-2.0F, 0.25F, 0.0F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.1309F, -1.0472F, 0.3927F);
        this.footright.cubeList.add(new ModelBox(footright, 0, 0, -2.0F, 0.0F, -1.75F, 2, 0, 3, 0.0F, false));

        this.upperlegleft = new AdvancedModelRenderer(this);
        this.upperlegleft.setRotationPoint(1.0F, 0.25F, 4.5F);
        this.hips.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.2269F, 0.1309F, 0.0436F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.upperlegleft.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.5F, -1.0F, -1.0F, 1, 3, 1, 0.0F, true));

        this.lowerlegleft = new AdvancedModelRenderer(this);
        this.lowerlegleft.setRotationPoint(2.5F, 0.1F, -0.25F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.0436F, -1.6144F, 0.0436F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.lowerlegleft.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 17, -0.5F, -0.5F, -1.0F, 1, 2, 1, -0.01F, true));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(2.0F, 0.25F, 0.0F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.1309F, 1.0472F, -0.3927F);
        this.footleft.cubeList.add(new ModelBox(footleft, 0, 0, 0.0F, 0.0F, -1.75F, 2, 0, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.2094F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.0F, -1.5F);
        this.tail1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 7, 0.5F, -0.75F, 1.5F, 0, 2, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 11, 0.0F, -0.25F, 1.5F, 1, 1, 3, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, 2.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.75F, -1.5F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.5F, -0.25F, 6.5F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, 0.49F, -0.75F, 1.5F, 0, 2, 5, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 17, 0.0F, -0.25F, 1.5F, 1, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, 2.35F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.0F, -5.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.5F, -0.65F, -0.75F, 4, 3, 7, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.75F, -5.5F);
        this.body.addChild(chest);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.25F, 0.5F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 17, -1.0F, -0.4F, -2.0F, 3, 2, 2, 0.0F, false));

        this.upperarmright = new AdvancedModelRenderer(this);
        this.upperarmright.setRotationPoint(-1.5F, 1.0F, -0.5F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, -0.0262F, 0.829F, -0.3054F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.upperarmright.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 24, -0.75F, -0.5F, -0.5F, 1, 2, 1, 0.01F, false));

        this.lowerarmright = new AdvancedModelRenderer(this);
        this.lowerarmright.setRotationPoint(-1.5F, 0.25F, 0.0F);
        this.upperarmright.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, 0.0F, -1.7453F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.lowerarmright.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 1.5708F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 0, -1.0F, -0.6F, -0.5F, 1, 2, 1, 0.0F, false));

        this.handright = new AdvancedModelRenderer(this);
        this.handright.setRotationPoint(-1.75F, 0.25F, 0.0F);
        this.lowerarmright.addChild(handright);
        this.setRotateAngle(handright, 0.2618F, -0.48F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.handright.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.6545F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 3, -1.0F, -0.475F, -1.75F, 2, 0, 3, 0.0F, false));

        this.upperarmleft = new AdvancedModelRenderer(this);
        this.upperarmleft.setRotationPoint(1.5F, 1.0F, -0.5F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, -0.0262F, -0.829F, 0.3054F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.upperarmleft.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -1.5708F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 24, -0.25F, -0.5F, -0.5F, 1, 2, 1, 0.01F, true));

        this.lowerarmleft = new AdvancedModelRenderer(this);
        this.lowerarmleft.setRotationPoint(1.5F, 0.25F, 0.0F);
        this.upperarmleft.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, 0.0F, 1.7453F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.lowerarmleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -1.5708F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 0, 0.0F, -0.6F, -0.5F, 1, 2, 1, 0.0F, true));

        this.handleft = new AdvancedModelRenderer(this);
        this.handleft.setRotationPoint(1.75F, 0.25F, 0.0F);
        this.lowerarmleft.addChild(handleft);
        this.setRotateAngle(handleft, 0.2618F, 0.48F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.5F, 0.5F);
        this.handleft.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.6545F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 3, -1.0F, -0.475F, -1.75F, 2, 0, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -1.25F);
        this.chest.addChild(head);


        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.4F, 0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 20, -1.0F, -0.0067F, -4.5527F, 2, 1, 2, -0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 10, -1.5F, -0.0017F, -3.1527F, 3, 1, 4, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.975F, 4.5F, -3.75F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -1.117F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 4, -0.6876F, -4.4967F, -0.3751F, 2, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.975F, 4.5F, -3.75F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -1.4835F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 4, 1.0065F, -4.5167F, -0.8022F, 3, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.975F, 4.5F, -3.75F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.117F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 4, -1.3124F, -4.4967F, -0.3751F, 2, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.975F, 4.5F, -3.75F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 1.4835F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 4, -4.0065F, -4.5167F, -0.8022F, 3, 1, 2, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.25F, -0.25F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 20, 21, -1.0F, -0.7567F, -4.0527F, 2, 1, 2, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 15, 0, -1.5F, -0.7767F, -2.6527F, 3, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 3.75F, -3.25F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -1.117F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 23, -0.6876F, -4.4967F, -0.3751F, 2, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 3.75F, -3.25F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -1.4835F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 17, 1.0065F, -4.5167F, -0.8022F, 3, 1, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 3.75F, -3.25F);
        this.upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 1.4835F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 17, -4.0065F, -4.5167F, -0.8022F, 3, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 3.75F, -3.25F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 1.117F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 23, -1.3124F, -4.4967F, -0.3751F, 2, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 3.75F, -3.25F);
        this.upperjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 8, -1.5F, -5.01F, 1.85F, 3, 1, 2, 0.01F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 21, -1.0F, -5.01F, 0.35F, 2, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 3.75F, -3.25F);
        this.upperjaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5672F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 15, -1.0F, -4.1869F, 1.7805F, 2, 1, 1, -0.01F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-0.5F, -1.225F, -1.25F);
        this.upperjaw.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, -0.2618F, 0.2618F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 22, -1.0692F, 0.003F, -1.6361F, 1, 1, 2, 0.0F, false));

        this.eyeR2 = new AdvancedModelRenderer(this);
        this.eyeR2.setRotationPoint(0.5F, -1.225F, -1.25F);
        this.upperjaw.addChild(eyeR2);
        this.setRotateAngle(eyeR2, 0.0F, 0.2618F, -0.2618F);
        this.eyeR2.cubeList.add(new ModelBox(eyeR2, 0, 22, 0.0692F, 0.003F, -1.6361F, 1, 1, 2, 0.0F, true));
        
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
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.base.offsetZ = 0.1F;
        this.base.render(0.1F);
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
        //this.body.offsetY = 1.2F;

        EntityPrehistoricFloraAmphibamus Amphibamus = (EntityPrehistoricFloraAmphibamus) e;

        this.faceTarget(f3, f4, 2, chest);

        float speed = 0.4F;
        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2};
        AdvancedModelRenderer[] Torso = {this.body, this.chest};

        AdvancedModelRenderer[] LeftArm = {this.upperarmleft, this.lowerarmleft};
        AdvancedModelRenderer[] RightArm = {this.upperarmright, this.lowerarmright};

        AdvancedModelRenderer[] LeftLeg = {this.upperlegleft, this.lowerlegleft};
        AdvancedModelRenderer[] RightLeg = {this.upperlegright, this.lowerlegright};

        if (!Amphibamus.isReallyInWater()) {
            //Land animation:
            this.chainWave(Tail, speed * (0.1F), 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * (0.1F), 0.12F, -3, f2, 0.8F);


            this.walk(this.upperjaw, speed * 0.2F, 2F,true, 0F,0.1F, f2, 0.1F);



            if (f3 == 0.0F || !Amphibamus.getIsMoving()) { //Not moving
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
            this.walk(lowerarmleft, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
            this.flap(handleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
            this.walk(handleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
            this.swing(handleft, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

            this.flap(upperarmleft, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
            this.swing(upperarmleft, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
            this.walk(lowerarmright, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
            this.flap(handright, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
            this.walk(handright, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
            this.swing(handright, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);



        }
        else {
            //Swimming animation:
            speed = speed * 1.2F;

            this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
            this.setRotateAngle(cube_r11, 0.0F, 0.0F, -1.5708F);
            this.setRotateAngle(cube_r12, 0.0F, -0.6545F, 0.0F);
            this.setRotateAngle(cube_r13, 0.0F, 0.0F, 1.5708F);
            this.setRotateAngle(cube_r14, 0.0F, 0.0F, 1.5708F);
            this.setRotateAngle(cube_r15, 0.0F, 0.6545F, 0.0F);
            this.setRotateAngle(cube_r16, 0.0F, -1.117F, 0.0F);
            this.setRotateAngle(cube_r17, 0.0F, -1.4835F, 0.0F);
            this.setRotateAngle(cube_r18, 0.0F, 1.117F, 0.0F);
            this.setRotateAngle(cube_r19, 0.0F, 1.4835F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
            this.setRotateAngle(cube_r20, 0.0F, -1.117F, 0.0F);
            this.setRotateAngle(cube_r21, 0.0F, -1.4835F, 0.0F);
            this.setRotateAngle(cube_r22, 0.0F, 1.4835F, 0.0F);
            this.setRotateAngle(cube_r23, 0.0F, 1.117F, 0.0F);
            this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r25, 0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
            this.setRotateAngle(cube_r4, 0.0F, 0.0F, 1.5708F);
            this.setRotateAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
            this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(eyeR, 0.0F, -0.2618F, 0.2618F);
            this.setRotateAngle(eyeR2, 0.0F, 0.2618F, -0.2618F);
            this.setRotateAngle(footleft, 1.3836F, 0.2338F, -0.0296F);
            this.setRotateAngle(footright, 1.3836F, -0.2338F, 0.0296F);
            this.setRotateAngle(handleft, 0.7411F, 0.1196F, 0.3152F);
            this.setRotateAngle(handright, 0.7411F, -0.1196F, -0.3152F);
            this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(lowerarmleft, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(lowerarmright, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(lowerlegleft, -0.0025F, -0.6981F, 0.0888F);
            this.setRotateAngle(lowerlegright, -0.0025F, 0.6981F, -0.0888F);
            this.setRotateAngle(tail1, 0.2094F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(upperarmleft, -0.0329F, -1.0035F, 0.3139F);
            this.setRotateAngle(upperarmright, -0.0329F, 1.0035F, -0.3139F);
            this.setRotateAngle(upperlegleft, -0.4269F, -1.002F, 0.4398F);
            this.setRotateAngle(upperlegright, -0.4269F, 1.002F, -0.4398F);

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


        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAmphibamus e = (EntityPrehistoricFloraAmphibamus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-1F);
        animator.rotate(this.upperjaw, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-1F);
        animator.rotate(this.upperjaw, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
