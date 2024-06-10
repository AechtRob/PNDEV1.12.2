package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPhlegethontia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPhlegethontia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer Upperjawslope_r1;
    private final AdvancedModelRenderer Upperjawfront_r1;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowerjawfront_r1;
    private final AdvancedModelRenderer Lowerjawmiddle_r1;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tailend1;
    private final AdvancedModelRenderer Tailend2;
    private final AdvancedModelRenderer Tailend3;

    private ModelAnimator animator;

    public ModelPhlegethontia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.01F, -2.0F, -21.75F);
        this.root.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 52, -2.0F, -2.0213F, -0.0002F, 4, 4, 12, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body1.addChild(Neck1);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 0, 69, -1.49F, -1.5313F, -10.5002F, 3, 3, 12, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.01F, 0.0F, -10.25F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0223F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 0, 85, -1.51F, -1.5313F, -10.7502F, 3, 3, 12, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.02F, -0.5313F, -9.6502F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, 0.0213F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 19, 88, -2.0F, -1.5F, -4.0F, 4, 3, 4, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, 1.5F, -4.0F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, -0.0213F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 30, 73, -1.5F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.Upperjawslope_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslope_r1.setRotationPoint(0.0F, -2.9F, -1.8F);
        this.Upperjaw.addChild(Upperjawslope_r1);
        this.setRotateAngle(Upperjawslope_r1, 0.1911F, 0.0F, 0.0F);
        this.Upperjawslope_r1.cubeList.add(new ModelBox(Upperjawslope_r1, 19, 69, -0.5F, 0.0F, -3.5F, 1, 2, 4, 0.0F, false));

        this.Upperjawfront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperjaw.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, -0.0637F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 19, 76, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 30, 56, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, 0.8306F, -5.9928F);
        this.Lowerjaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, -0.1485F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 29, 51, -0.5F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Lowerjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Lowerjaw.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, -0.0848F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 36, 50, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.2F, -3.9F);
        this.Lowerjaw.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.2335F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 21, 53, -1.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(-0.01F, -0.0113F, 10.4998F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 35, -2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(-0.01F, 0.01F, 10.5F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 18, -2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(-0.01F, -0.01F, 10.5F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 1, -2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(-0.01F, 0.01F, 10.5F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 31, 84, -2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.01F, -0.01F, 10.5F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 30, 67, -2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-0.01F, 0.01F, 10.5F);
        this.Body6.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 33, 50, -2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 10.75F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0424F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 33, 34, -1.5F, -1.5F, 0.0F, 3, 3, 12, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(-0.01F, 0.01F, 10.75F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0424F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 33, 18, -1.5F, -1.5F, 0.0F, 3, 3, 12, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.01F, -0.01F, 10.75F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 33, 2, -1.5F, -1.5F, 0.0F, 3, 3, 12, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.0213F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 64, 86, -1.0F, -1.0F, 0.0F, 2, 2, 12, 0.0F, false));

        this.Tailend1 = new AdvancedModelRenderer(this);
        this.Tailend1.setRotationPoint(-0.01F, 0.01F, 11.0F);
        this.Tail5.addChild(Tailend1);
        this.setRotateAngle(Tailend1, -0.0213F, 0.0F, 0.0F);
        this.Tailend1.cubeList.add(new ModelBox(Tailend1, 63, 71, -1.0F, -1.0F, 0.0F, 2, 2, 12, 0.0F, false));

        this.Tailend2 = new AdvancedModelRenderer(this);
        this.Tailend2.setRotationPoint(0.0F, 0.0F, 11.5F);
        this.Tailend1.addChild(Tailend2);
        this.setRotateAngle(Tailend2, 0.0213F, 0.0F, 0.0F);
        this.Tailend2.cubeList.add(new ModelBox(Tailend2, 54, 57, -0.5F, -0.5F, 0.0F, 1, 1, 12, 0.0F, false));

        this.Tailend3 = new AdvancedModelRenderer(this);
        this.Tailend3.setRotationPoint(0.01F, -0.01F, 11.5F);
        this.Tailend2.addChild(Tailend3);
        this.setRotateAngle(Tailend3, 0.0213F, 0.0F, 0.0F);
        this.Tailend3.cubeList.add(new ModelBox(Tailend3, 54, 43, -0.5F, -0.5F, 0.0F, 1, 1, 12, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body2, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.5672F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(Head, 0.1086F, -0.3491F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront_r1, -0.1485F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle_r1, -0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(Masseter, -0.2335F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.1745F, -0.3054F, 0.0F);
        this.setRotateAngle(Neck2, -0.1532F, -0.3054F, 0.0F);
        this.setRotateAngle(Tail1, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(Tail2, -0.0424F, 0.4363F, 0.0F);
        this.setRotateAngle(Tail3, 0.0424F, 0.5236F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(Tail5, -0.0213F, 0.6109F, 0.0F);
        this.setRotateAngle(Tailend1, -0.0213F, 0.3927F, 0.0F);
        this.setRotateAngle(Tailend2, 0.0213F, 0.2618F, 0.0F);
        this.setRotateAngle(Tailend3, 0.0213F, 0.3491F, 0.0F);
        this.setRotateAngle(Upperjaw, -0.0213F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront_r1, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslope_r1, 0.1911F, 0.0F, 0.0F);
        this.root.offsetY = 0.32F;
        this.root.render(0.01F);
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

        EntityPrehistoricFloraPhlegethontia Phlegethontia = (EntityPrehistoricFloraPhlegethontia) e;

        this.faceTarget(f3, f4, 16, Neck1);
        this.faceTarget(f3, f4, 16, Neck2);
        this.faceTarget(f3, f4, 16, Head);
        AdvancedModelRenderer[] Tail = {this.Body2, this.Body3, this.Body4, this.Body5, this.Body6, this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tailend1, this.Tailend2, this.Tailend3};
        Phlegethontia.tailBuffer.applyChainSwingBuffer(Tail);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPhlegethontia ee = (EntityPrehistoricFloraPhlegethontia) entitylivingbaseIn;

        //the only animation for this is managed directly by the animation ticker:
        animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

    }

    public void animMove(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPhlegethontia entity = (EntityPrehistoricFloraPhlegethontia) entitylivingbaseIn;

        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }

        int animCycle = 80;
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-1), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+65))*25), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+65))*3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-1), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+30))*-25), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(-1), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+150))*30), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+150))*-3));


        this.setRotateAngle(Body1, Body1.rotateAngleX + (float) Math.toRadians(0), Body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90))*30), Body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90))*-1));
        this.Body1.offsetX = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+90))*10);
        this.Body1.offsetY = (float) Math.toRadians(0);
        this.Body1.offsetZ = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+10))*-0.5);


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+75))*-30), Body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0), Body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+45))*-30), Body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0), Body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-35))*-30), Body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body5, Body5.rotateAngleX + (float) Math.toRadians(0), Body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+120))*30), Body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body6, Body6.rotateAngleX + (float) Math.toRadians(0), Body6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+75))*30), Body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+50))*30), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+190))*-30), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+140))*-30), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+100))*-30), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+75))*-30), Tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tailend1, Tailend1.rotateAngleX + (float) Math.toRadians(0), Tailend1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90+30))*-30), Tailend1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tailend2, Tailend2.rotateAngleX + (float) Math.toRadians(0), Tailend2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-170))*30), Tailend2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tailend3, Tailend3.rotateAngleX + (float) Math.toRadians(0), Tailend3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-210))*30), Tailend3.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Neck1,(float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2,(float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck1,(float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2,(float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
