package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPederpes;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPederpes extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended main;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body_r1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended upperhead;
    private final AdvancedModelRendererExtended headU2_r1;
    private final AdvancedModelRendererExtended headU1_r1;
    private final AdvancedModelRendererExtended lowerhead;
    private final AdvancedModelRendererExtended throat2_r1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail1_r1;
    private final AdvancedModelRendererExtended legBL;
    private final AdvancedModelRendererExtended legBL1;
    private final AdvancedModelRendererExtended footBL1;
    private final AdvancedModelRendererExtended legBR;
    private final AdvancedModelRendererExtended legBR1;
    private final AdvancedModelRendererExtended footBR1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail2_r1;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail3fin_r1;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail4fin_r1;
    private final AdvancedModelRendererExtended tail4_r1;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended tail5fin_r1;
    private final AdvancedModelRendererExtended tail5_r1;
    private final AdvancedModelRendererExtended legFL;
    private final AdvancedModelRendererExtended legFL1;
    private final AdvancedModelRendererExtended footFL1;
    private final AdvancedModelRendererExtended legFR;
    private final AdvancedModelRendererExtended legFR1;
    private final AdvancedModelRendererExtended footFR1;

    private ModelAnimator animator;

    public ModelPederpes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRendererExtended(this);
        this.main.setRotationPoint(0.0F, 23.0F, -6.0F);


        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(body);


        this.body_r1 = new AdvancedModelRendererExtended(this);
        this.body_r1.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.body.addChild(body_r1);
        this.setRotateAngle(body_r1, -0.1309F, 0.0F, 0.0F);
        this.body_r1.cubeList.add(new ModelBox(body_r1, 0, 0, -3.5F, 0.0F, 0.0F, 7, 6, 9, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 18, 21, -3.0F, -7.0F, -3.3F, 6, 5, 4, 0.0F, false));

        this.upperhead = new AdvancedModelRendererExtended(this);
        this.upperhead.setRotationPoint(0.0F, -5.0F, -3.0F);
        this.head.addChild(upperhead);
        this.setRotateAngle(upperhead, -0.0436F, 0.0F, 0.0F);
        this.upperhead.cubeList.add(new ModelBox(upperhead, 23, 0, -1.99F, 0.01F, -3.5F, 4, 1, 6, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 32, 7, -1.499F, 0.0F, -6.0F, 3, 1, 3, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 0, 15, 1.01F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 0, 15, -2.01F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));

        this.headU2_r1 = new AdvancedModelRendererExtended(this);
        this.headU2_r1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.upperhead.addChild(headU2_r1);
        this.setRotateAngle(headU2_r1, 0.4363F, 0.0F, 0.0F);
        this.headU2_r1.cubeList.add(new ModelBox(headU2_r1, 38, 25, -1.5F, 0.1F, -2.1F, 3, 1, 2, 0.0F, false));

        this.headU1_r1 = new AdvancedModelRendererExtended(this);
        this.headU1_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.upperhead.addChild(headU1_r1);
        this.setRotateAngle(headU1_r1, 0.3054F, 0.0F, 0.0F);
        this.headU1_r1.cubeList.add(new ModelBox(headU1_r1, 31, 30, -2.0F, -0.2F, -4.25F, 4, 2, 4, 0.0F, false));

        this.lowerhead = new AdvancedModelRendererExtended(this);
        this.lowerhead.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.head.addChild(lowerhead);
        this.setRotateAngle(lowerhead, -0.0436F, 0.0F, 0.0F);
        this.lowerhead.cubeList.add(new ModelBox(lowerhead, 13, 30, -1.999F, -1.0F, -3.6F, 4, 1, 5, 0.0F, false));
        this.lowerhead.cubeList.add(new ModelBox(lowerhead, 0, 38, -1.5F, -0.99F, -6.05F, 3, 1, 3, 0.0F, false));

        this.throat2_r1 = new AdvancedModelRendererExtended(this);
        this.throat2_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.lowerhead.addChild(throat2_r1);
        this.setRotateAngle(throat2_r1, -0.1745F, 0.0F, 0.0F);
        this.throat2_r1.cubeList.add(new ModelBox(throat2_r1, 0, 43, -1.51F, -0.951F, -6.0F, 3, 1, 3, 0.0F, false));
        this.throat2_r1.cubeList.add(new ModelBox(throat2_r1, 0, 33, -2.0F, -0.95F, -3.6F, 4, 1, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -5.0F, 8.9F);
        this.body.addChild(tail1);


        this.tail1_r1 = new AdvancedModelRendererExtended(this);
        this.tail1_r1.setRotationPoint(0.0F, 0.0F, -0.4F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, -0.0873F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 0, 15, -3.0F, 0.0F, 0.0F, 6, 5, 5, 0.0F, false));

        this.legBR = new AdvancedModelRendererExtended(this);
        this.legBR.setRotationPoint(-3.0305F, 2.99F, 1.9824F);
        this.tail1.addChild(legBR);
        this.setRotateAngle(legBR, 0.0F, -0.4363F, 0.0F);
        this.legBR.cubeList.add(new ModelBox(legBR, 37, 0, -2.5F, 0.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.legBR1 = new AdvancedModelRendererExtended(this);
        this.legBR1.setRotationPoint(-2.5F, 0.01F, 0.0F);
        this.legBR.addChild(legBR1);
        this.setRotateAngle(legBR1, 0.0F, 0.0F, -1.3526F);
        this.legBR1.cubeList.add(new ModelBox(legBR1, 0, 0, -2.0F, -0.01F, -0.99F, 2, 2, 2, 0.0F, true));

        this.footBR1 = new AdvancedModelRendererExtended(this);
        this.footBR1.setRotationPoint(-2.5F, 1.0F, 0.0F);
        this.legBR1.addChild(footBR1);
        this.setRotateAngle(footBR1, 0.2618F, 0.0F, -0.2182F);
        this.footBR1.cubeList.add(new ModelBox(footBR1, 23, 0, -0.25F, -2.01F, -1.0F, 1, 3, 2, 0.0F, true));

        this.legBL = new AdvancedModelRendererExtended(this);
        this.legBL.setRotationPoint(3.0305F, 2.99F, 1.9824F);
        this.tail1.addChild(legBL);
        this.setRotateAngle(legBL, 0.0F, 0.4363F, 0.0F);
        this.legBL.cubeList.add(new ModelBox(legBL, 37, 0, -0.5F, 0.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.legBL1 = new AdvancedModelRendererExtended(this);
        this.legBL1.setRotationPoint(2.5F, 0.01F, 0.0F);
        this.legBL.addChild(legBL1);
        this.setRotateAngle(legBL1, 0.0F, 0.0F, 1.3526F);
        this.legBL1.cubeList.add(new ModelBox(legBL1, 0, 0, 0.0F, -0.01F, -0.99F, 2, 2, 2, 0.0F, false));

        this.footBL1 = new AdvancedModelRendererExtended(this);
        this.footBL1.setRotationPoint(2.5F, 1.0F, 0.0F);
        this.legBL1.addChild(footBL1);
        this.setRotateAngle(footBL1, 0.2618F, 0.0F, 0.2182F);
        this.footBL1.cubeList.add(new ModelBox(footBL1, 23, 0, -0.75F, -2.01F, -1.0F, 1, 3, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 4.6F);
        this.tail1.addChild(tail2);


        this.tail2_r1 = new AdvancedModelRendererExtended(this);
        this.tail2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.0873F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 28, 11, -2.5F, 0.0F, -0.25F, 5, 4, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 3.5F);
        this.tail2.addChild(tail3);


        this.tail3fin_r1 = new AdvancedModelRendererExtended(this);
        this.tail3fin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(tail3fin_r1);
        this.setRotateAngle(tail3fin_r1, -0.0873F, 0.0F, 0.0F);
        this.tail3fin_r1.cubeList.add(new ModelBox(tail3fin_r1, 17, 10, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));
        this.tail3fin_r1.cubeList.add(new ModelBox(tail3fin_r1, 0, 25, -2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.tail3.addChild(tail4);


        this.tail4fin_r1 = new AdvancedModelRendererExtended(this);
        this.tail4fin_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.tail4.addChild(tail4fin_r1);
        this.setRotateAngle(tail4fin_r1, -0.0873F, 0.0F, 0.0F);
        this.tail4fin_r1.cubeList.add(new ModelBox(tail4fin_r1, 0, 0, -0.01F, -1.25F, 0.5F, 0, 2, 4, 0.0F, false));

        this.tail4_r1 = new AdvancedModelRendererExtended(this);
        this.tail4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, -0.0873F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 34, 19, -1.5F, 0.0F, -0.5F, 3, 2, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail4.addChild(tail5);


        this.tail5fin_r1 = new AdvancedModelRendererExtended(this);
        this.tail5fin_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.tail5.addChild(tail5fin_r1);
        this.setRotateAngle(tail5fin_r1, -0.0873F, 0.0F, 0.0F);
        this.tail5fin_r1.cubeList.add(new ModelBox(tail5fin_r1, 22, 13, 0.0F, -0.5F, 0.75F, 0, 2, 6, 0.0F, false));

        this.tail5_r1 = new AdvancedModelRendererExtended(this);
        this.tail5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail5.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, -0.0873F, 0.0F, 0.0F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 33, 36, -0.5F, 1.0F, -0.25F, 1, 1, 4, 0.0F, false));

        this.legFR = new AdvancedModelRendererExtended(this);
        this.legFR.setRotationPoint(-2.307F, -1.8087F, 1.4017F);
        this.body.addChild(legFR);
        this.setRotateAngle(legFR, -0.3927F, -0.6545F, 0.0F);
        this.legFR.cubeList.add(new ModelBox(legFR, 23, 36, -2.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, true));

        this.legFR1 = new AdvancedModelRendererExtended(this);
        this.legFR1.setRotationPoint(-2.0F, -1.0F, 1.5F);
        this.legFR.addChild(legFR1);
        this.setRotateAngle(legFR1, -1.1345F, 0.0F, 0.0F);
        this.legFR1.cubeList.add(new ModelBox(legFR1, 0, 0, -0.01F, 0.0F, 0.0F, 2, 2, 2, 0.0F, true));

        this.footFR1 = new AdvancedModelRendererExtended(this);
        this.footFR1.setRotationPoint(1.5F, 1.0F, 2.0F);
        this.legFR1.addChild(footFR1);
        this.setRotateAngle(footFR1, 0.0F, 0.0F, -0.4363F);
        this.footFR1.cubeList.add(new ModelBox(footFR1, 0, 6, -2.51F, -1.25F, 0.0F, 3, 2, 1, 0.0F, true));

        this.legFL = new AdvancedModelRendererExtended(this);
        this.legFL.setRotationPoint(2.307F, -1.8087F, 1.4017F);
        this.body.addChild(legFL);
        this.setRotateAngle(legFL, -0.3927F, 0.6545F, 0.0F);
        this.legFL.cubeList.add(new ModelBox(legFL, 23, 36, 0.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.legFL1 = new AdvancedModelRendererExtended(this);
        this.legFL1.setRotationPoint(2.0F, -1.0F, 1.5F);
        this.legFL.addChild(legFL1);
        this.setRotateAngle(legFL1, -1.1345F, 0.0F, 0.0F);
        this.legFL1.cubeList.add(new ModelBox(legFL1, 0, 0, -1.99F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.footFL1 = new AdvancedModelRendererExtended(this);
        this.footFL1.setRotationPoint(-1.5F, 1.0F, 2.0F);
        this.legFL1.addChild(footFL1);
        this.setRotateAngle(footFL1, 0.0F, 0.0F, 0.4363F);
        this.footFL1.cubeList.add(new ModelBox(footFL1, 0, 6, -0.49F, -1.25F, 0.0F, 3, 2, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5 * 0.3f);
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
        this.main.offsetY = 1.05F;

        EntityPrehistoricFloraPederpes Pederpes = (EntityPrehistoricFloraPederpes) e;

        this.faceTarget(f3, f4, 6, head);

        float speed = 0.385F;
        if (Pederpes.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Torso = {this.head, this.body};

        if (!Pederpes.isReallyInWater()) {

            if (f3 == 0.0F || !Pederpes.getIsMoving()) { //Not moving
                return;
            }

            this.flap(legBL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(legBL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(legBL1, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(footBL1, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(legBR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(legBR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(legBR1, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(footBR1, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(legFL, speed, 0.35F, false, 3, -0.1F, f2, 0.5F);
            //this.swing(legFL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(legFL1, speed, -0.4F, false, 4, 0.15F, f2, 0.8F);
            this.walk(footFL1, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(legFR, speed, -0.35F, false, 0, 0.1F, f2, 0.5F);
            //this.swing(legFR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(legFR1, speed, -0.4F, false, 1, 0.15F, f2, 0.8F);
            this.walk(footFR1, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.08F, -0.16, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.08F, -0.16, f2, 0.7F);
            this.bob(body, speed*2, 0.11F, false, f2, 1F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.45), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 2F;

            //Feet:
            this.footFL1.rotateAngleY = (float) Math.toRadians(-50);
            this.footFR1.rotateAngleY = (float) Math.toRadians(50);
            this.footBL1.rotateAngleZ = (float) Math.toRadians(-50);
            this.footBR1.rotateAngleZ = (float) Math.toRadians(50);

            this.legFL.rotateAngleX= (float) Math.toRadians(40);
            this.legFR.rotateAngleX= (float) Math.toRadians(-40);
            this.legBL.rotateAngleZ= (float) Math.toRadians(25);
            this.legBR.rotateAngleZ= (float) Math.toRadians(-25);

            this.legBL1.rotateAngleX= (float) Math.toRadians(17.5);
            this.legBR1.rotateAngleX= (float) Math.toRadians(-17.5);

            AdvancedModelRenderer[] BackL = {this.legBL1, this.footBL1};
            AdvancedModelRenderer[] BackR = {this.legBR1, this.footBR1};

            this.flap(legBL, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(legBR, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F,  f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(legFL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(legFL, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(legFL1, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(footFL1, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(legFR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(legFR, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(legFR1, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(footFR1, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.3F, -0.16, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.16, f2, 0.7F);
        }
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPederpes e = (EntityPrehistoricFloraPederpes) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.upperhead, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerhead, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.upperhead, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerhead, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
