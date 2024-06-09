package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGigantspinosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGigantspinosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended hips;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended plate3;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended leftLeg;
    private final AdvancedModelRendererExtended leftLeg2;
    private final AdvancedModelRendererExtended leftLeg3;
    private final AdvancedModelRendererExtended leftLeg4;
    private final AdvancedModelRendererExtended rightLeg;
    private final AdvancedModelRendererExtended rightLeg2;
    private final AdvancedModelRendererExtended rightLeg3;
    private final AdvancedModelRendererExtended rightLeg4;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended plate4;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended plate5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended tailspike;
    private final AdvancedModelRendererExtended tailspike2;
    private final AdvancedModelRendererExtended tailspike5;
    private final AdvancedModelRendererExtended tailspike6;
    private final AdvancedModelRendererExtended tailspike3;
    private final AdvancedModelRendererExtended tailspike4;
    private final AdvancedModelRendererExtended tailspike7;
    private final AdvancedModelRendererExtended tailspike8;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended plate10;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended plate11;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended plate;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended plate2;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended leftArm;
    private final AdvancedModelRendererExtended leftArm2;
    private final AdvancedModelRendererExtended leftArm3;
    private final AdvancedModelRendererExtended rightArm;
    private final AdvancedModelRendererExtended rightArm2;
    private final AdvancedModelRendererExtended rightArm3;
    private final AdvancedModelRendererExtended Leftlegspike;
    private final AdvancedModelRendererExtended spike;
    private final AdvancedModelRendererExtended spike2;
    private final AdvancedModelRendererExtended spike3;
    private final AdvancedModelRendererExtended babyfrontspike;
    private final AdvancedModelRendererExtended babyfrontspike2;
    private final AdvancedModelRendererExtended babyfrontspike3;
    private final AdvancedModelRendererExtended babyfrontspike4;
    private final AdvancedModelRendererExtended Rightlegspike;
    private final AdvancedModelRendererExtended spike4;
    private final AdvancedModelRendererExtended spike5;
    private final AdvancedModelRendererExtended spike6;
    private final AdvancedModelRendererExtended babyfrontspike5;
    private final AdvancedModelRendererExtended babyfrontspike6;
    private final AdvancedModelRendererExtended babyfrontspike7;
    private final AdvancedModelRendererExtended babyfrontspike8;
    private final AdvancedModelRendererExtended plate7;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended plate6;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended cube_r33;
    private ModelAnimator animator;

    public ModelGigantspinosaurus() {
        this.textureWidth = 105;
        this.textureHeight = 105;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRendererExtended(this);
        this.hips.setRotationPoint(0.0F, -22.9F, 11.8F);
        this.root.addChild(hips);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -4.25F, -5.25F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 43, -5.5F, 0.0F, 0.325F, 11, 13, 9, 0.0F, false));

        this.plate3 = new AdvancedModelRendererExtended(this);
        this.plate3.setRotationPoint(3.0F, -4.3616F, 0.9352F);
        this.hips.addChild(plate3);
        this.setRotateAngle(plate3, -0.1309F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-6.0F, -0.6026F, 1.5639F);
        this.plate3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2836F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 89, -0.5F, -0.2374F, -1.9585F, 1, 2, 2, -0.01F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 93, 24, -0.5F, -2.2124F, -0.9585F, 1, 2, 1, -0.001F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 89, 5.5F, -0.2374F, -1.9585F, 1, 2, 2, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 93, 24, 5.5F, -2.2124F, -0.9585F, 1, 2, 1, -0.001F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-6.0F, -0.4026F, -1.2361F);
        this.plate3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7898F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 63, 80, -0.5F, -5.4596F, -0.0893F, 1, 7, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 63, 80, 5.5F, -5.4596F, -0.0893F, 1, 7, 1, 0.0F, false));

        this.leftLeg = new AdvancedModelRendererExtended(this);
        this.leftLeg.setRotationPoint(5.75F, 2.5F, -0.25F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1309F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 52, -3.5F, -2.6819F, -3.4754F, 6, 12, 7, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRendererExtended(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.7681F, -1.9754F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1745F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 72, -3.0F, 0.3245F, -0.7909F, 5, 7, 5, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRendererExtended(this);
        this.leftLeg3.setRotationPoint(-0.5F, 6.3245F, 1.7091F);
        this.leftLeg2.addChild(leftLeg3);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 78, -2.5F, 0.0F, -2.5F, 5, 5, 5, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRendererExtended(this);
        this.leftLeg4.setRotationPoint(0.5F, 4.75F, 0.75F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.0436F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 70, 59, -3.5F, 0.0F, -5.25F, 6, 2, 7, 0.0F, false));

        this.rightLeg = new AdvancedModelRendererExtended(this);
        this.rightLeg.setRotationPoint(-5.75F, 2.5F, -0.25F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1309F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 52, -2.5F, -2.6819F, -3.4754F, 6, 12, 7, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRendererExtended(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.7681F, -1.9754F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1745F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 72, -2.0F, 0.3245F, -0.7909F, 5, 7, 5, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRendererExtended(this);
        this.rightLeg3.setRotationPoint(0.5F, 6.3245F, 1.7091F);
        this.rightLeg2.addChild(rightLeg3);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 78, -2.5F, 0.0F, -2.5F, 5, 5, 5, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRendererExtended(this);
        this.rightLeg4.setRotationPoint(-0.5F, 4.75F, 0.75F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.0436F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 70, 59, -2.5F, 0.0F, -5.25F, 6, 2, 7, 0.0F, true));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(-0.5F, -3.75F, 3.25F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 21, 66, -3.5F, 0.0218F, -0.7495F, 8, 9, 6, 0.0F, false));

        this.plate4 = new AdvancedModelRendererExtended(this);
        this.plate4.setRotationPoint(3.0F, 0.0134F, 2.4852F);
        this.tail1.addChild(plate4);
        this.setRotateAngle(plate4, 0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-5.0F, -0.6026F, 1.5639F);
        this.plate4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2836F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 15, -0.5F, -0.2374F, -1.9585F, 1, 2, 2, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 93, 20, -0.5F, -2.0374F, -0.9585F, 1, 2, 1, 0.01F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 15, 4.5F, -0.2374F, -1.9585F, 1, 2, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 93, 20, 4.5F, -2.0374F, -0.9585F, 1, 2, 1, 0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-5.0F, -0.4026F, -1.2361F);
        this.plate4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.8247F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 90, -0.5F, -3.4596F, -0.0893F, 1, 4, 1, 0.001F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 90, 4.5F, -3.4596F, -0.0893F, 1, 4, 1, 0.001F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.5218F, 5.2505F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 53, 0, -2.5F, 0.0F, -2.0F, 6, 7, 8, 0.0F, false));

        this.plate5 = new AdvancedModelRendererExtended(this);
        this.plate5.setRotationPoint(2.5F, 0.8666F, 0.7597F);
        this.tail2.addChild(plate5);
        this.setRotateAngle(plate5, 0.0436F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-4.0F, -0.6026F, 1.5639F);
        this.plate5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2836F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 66, -0.5F, -0.2374F, -1.9585F, 1, 1, 2, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 93, 0, -0.5F, -2.0624F, -0.9585F, 1, 2, 1, 0.01F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 66, 3.5F, -0.2374F, -1.9585F, 1, 1, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 93, 0, 3.5F, -2.0624F, -0.9585F, 1, 2, 1, 0.01F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-4.0F, -0.4026F, -1.2361F);
        this.plate5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.8247F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 39, -0.5F, -3.4596F, -0.0893F, 1, 3, 1, 0.001F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 39, 3.5F, -3.4596F, -0.0893F, 1, 3, 1, 0.001F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 50, 66, -1.5F, 0.0F, -1.0F, 4, 5, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 68, 39, -1.0F, 0.0F, -1.0F, 3, 3, 9, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 42, 80, -0.5F, -0.0764F, 0.0152F, 2, 2, 8, 0.0F, false));

        this.tailspike = new AdvancedModelRendererExtended(this);
        this.tailspike.setRotationPoint(0.8F, 0.9236F, 1.2152F);
        this.tail5.addChild(tailspike);
        this.setRotateAngle(tailspike, -0.517F, 0.0869F, 0.8933F);
        this.tailspike.cubeList.add(new ModelBox(tailspike, 77, 52, -0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.tailspike2 = new AdvancedModelRendererExtended(this);
        this.tailspike2.setRotationPoint(-0.5F, 14.25F, -14.5F);
        this.tailspike.addChild(tailspike2);
        this.tailspike2.cubeList.add(new ModelBox(tailspike2, 19, 90, 0.0F, -21.25F, 14.0F, 1, 4, 1, 0.0F, false));
        this.tailspike2.cubeList.add(new ModelBox(tailspike2, 16, 72, 0.0F, -17.25F, 14.0F, 1, 3, 1, -0.01F, false));

        this.tailspike5 = new AdvancedModelRendererExtended(this);
        this.tailspike5.setRotationPoint(0.2F, 0.9236F, 1.2152F);
        this.tail5.addChild(tailspike5);
        this.setRotateAngle(tailspike5, -0.517F, -0.0869F, -0.8933F);
        this.tailspike5.cubeList.add(new ModelBox(tailspike5, 77, 52, -0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F, true));

        this.tailspike6 = new AdvancedModelRendererExtended(this);
        this.tailspike6.setRotationPoint(0.5F, 14.25F, -14.5F);
        this.tailspike5.addChild(tailspike6);
        this.tailspike6.cubeList.add(new ModelBox(tailspike6, 19, 90, -1.0F, -21.25F, 14.0F, 1, 4, 1, 0.0F, true));
        this.tailspike6.cubeList.add(new ModelBox(tailspike6, 16, 72, -1.0F, -17.25F, 14.0F, 1, 3, 1, -0.01F, true));

        this.tailspike3 = new AdvancedModelRendererExtended(this);
        this.tailspike3.setRotationPoint(0.575F, 0.9236F, 5.7902F);
        this.tail5.addChild(tailspike3);
        this.setRotateAngle(tailspike3, -0.7459F, 0.274F, 1.0267F);
        this.tailspike3.cubeList.add(new ModelBox(tailspike3, 74, 0, -0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.tailspike4 = new AdvancedModelRendererExtended(this);
        this.tailspike4.setRotationPoint(-0.5F, 14.25F, -14.5F);
        this.tailspike3.addChild(tailspike4);
        this.tailspike4.cubeList.add(new ModelBox(tailspike4, 14, 89, 0.0F, -21.25F, 14.0F, 1, 4, 1, 0.0F, false));
        this.tailspike4.cubeList.add(new ModelBox(tailspike4, 0, 72, 0.0F, -17.25F, 14.0F, 1, 3, 1, -0.01F, false));

        this.tailspike7 = new AdvancedModelRendererExtended(this);
        this.tailspike7.setRotationPoint(0.425F, 0.9236F, 5.7902F);
        this.tail5.addChild(tailspike7);
        this.setRotateAngle(tailspike7, -0.7459F, -0.274F, -1.0267F);
        this.tailspike7.cubeList.add(new ModelBox(tailspike7, 74, 0, -0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F, true));

        this.tailspike8 = new AdvancedModelRendererExtended(this);
        this.tailspike8.setRotationPoint(0.5F, 14.25F, -14.5F);
        this.tailspike7.addChild(tailspike8);
        this.tailspike8.cubeList.add(new ModelBox(tailspike8, 14, 89, -1.0F, -21.25F, 14.0F, 1, 4, 1, 0.0F, true));
        this.tailspike8.cubeList.add(new ModelBox(tailspike8, 0, 72, -1.0F, -17.25F, 14.0F, 1, 3, 1, -0.01F, true));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -4.5F, -4.25F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.5F, -0.0067F, -12.3053F, 13, 16, 13, 0.0F, false));

        this.plate10 = new AdvancedModelRendererExtended(this);
        this.plate10.setRotationPoint(3.0F, -0.8817F, -10.8553F);
        this.body.addChild(plate10);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.plate10.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 91, -0.5F, -1.825F, -0.6F, 1, 3, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 91, 5.5F, -1.825F, -0.6F, 1, 3, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-6.0F, 0.0F, 1.0F);
        this.plate10.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 91, -0.5F, -0.625F, -1.475F, 1, 2, 1, -0.001F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 81, 28, -0.5F, -1.625F, -0.575F, 1, 3, 1, -0.01F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 91, 5.5F, -0.625F, -1.475F, 1, 2, 1, -0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 81, 28, 5.5F, -1.625F, -0.575F, 1, 3, 1, -0.01F, false));

        this.plate11 = new AdvancedModelRendererExtended(this);
        this.plate11.setRotationPoint(-0.5F, -1.6067F, -9.0553F);
        this.body.addChild(plate11);


        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-2.5F, 1.0257F, 2.3056F);
        this.plate11.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2531F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 63, 89, -0.5F, -2.4848F, -0.6736F, 1, 4, 1, -0.001F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 63, 89, 5.5F, -2.4848F, -0.6736F, 1, 4, 1, -0.001F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.plate11.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 62, -4.0F, 0.125F, 1.55F, 1, 2, 1, -0.01F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 90, -4.0F, -1.875F, 0.775F, 1, 4, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 62, 2.0F, 0.125F, 1.55F, 1, 2, 1, -0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 90, 2.0F, -1.875F, 0.775F, 1, 4, 1, 0.0F, false));

        this.plate = new AdvancedModelRendererExtended(this);
        this.plate.setRotationPoint(3.0F, -2.0642F, -4.0009F);
        this.body.addChild(plate);
        this.plate.cubeList.add(new ModelBox(plate, 0, 52, -0.5F, -0.1F, -0.75F, 1, 4, 2, 0.01F, false));
        this.plate.cubeList.add(new ModelBox(plate, 0, 52, -6.5F, -0.1F, -0.75F, 1, 4, 2, 0.01F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.plate.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2662F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 7, -0.5F, -1.15F, 0.225F, 1, 1, 1, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 7, 5.5F, -1.15F, 0.225F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-6.0F, -0.25F, -0.675F);
        this.plate.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.8683F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 93, 48, -0.5F, -2.0171F, -0.0039F, 1, 2, 1, 0.001F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 93, 48, 5.5F, -2.0171F, -0.0039F, 1, 2, 1, 0.001F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-6.0F, 1.0F, -1.4F);
        this.plate.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5847F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 81, 0, -0.5F, -0.4596F, 0.9107F, 1, 2, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 91, -0.5F, -1.4596F, -0.0893F, 1, 3, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 81, 0, 5.5F, -0.4596F, 0.9107F, 1, 2, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 91, 5.5F, -1.4596F, -0.0893F, 1, 3, 1, 0.0F, false));

        this.plate2 = new AdvancedModelRendererExtended(this);
        this.plate2.setRotationPoint(3.0F, -1.0392F, -0.2009F);
        this.body.addChild(plate2);


        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(-6.0F, 0.8F, 1.4F);
        this.plate2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2836F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 89, -0.5F, -0.2374F, -1.9585F, 1, 2, 2, -0.01F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 93, 52, -0.5F, -2.2124F, -0.9335F, 1, 2, 1, -0.001F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 89, 5.5F, -0.2374F, -1.9585F, 1, 2, 2, -0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 93, 52, 5.5F, -2.2124F, -0.9335F, 1, 2, 1, -0.001F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(-6.0F, 1.0F, -1.4F);
        this.plate2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.7898F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 55, 80, -0.5F, -5.4596F, -0.0893F, 1, 6, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 55, 80, 5.5F, -5.4596F, -0.0893F, 1, 6, 1, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 7.2894F, -11.1505F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1309F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 30, -5.5F, -2.8556F, -9.81F, 11, 10, 11, -0.01F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -2.2918F, -9.5886F);
        this.chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 44, 21, -4.5F, -0.5076F, 0.207F, 9, 8, 9, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(-0.5F, -2.3466F, -9.7005F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0873F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 72, 16, -2.0F, -0.009F, -3.1095F, 5, 6, 5, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 43, 91, 1.6F, -3.009F, -1.1095F, 0, 3, 2, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 43, 91, -0.6F, -3.009F, -1.1095F, 0, 3, 2, 0.0F, true));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.241F, -2.6095F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 81, 28, -1.5F, 0.0F, -4.0F, 4, 5, 5, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 90, 56, 1.7F, -3.0F, -1.8F, 0, 3, 2, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 38, 89, 1.6F, -2.5F, -4.3F, 0, 3, 2, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 38, 89, -0.6F, -2.5F, -4.3F, 0, 3, 2, 0.0F, true));
        this.neck2.cubeList.add(new ModelBox(neck2, 90, 56, -0.7F, -3.0F, -1.8F, 0, 3, 2, 0.0F, true));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.25F, -4.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2618F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 84, 39, -1.0F, 0.0F, -3.0F, 3, 3, 5, -0.02F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 0, -0.5F, 2.0F, -2.0F, 2, 2, 4, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 58, 91, 1.5F, -1.9F, -2.9F, 0, 2, 2, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 58, 91, -0.5F, -1.9F, -2.9F, 0, 2, 2, 0.0F, true));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(1.0F, 0.0F, -3.15F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 36, -2.0F, 0.0F, -1.65F, 3, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 84, 52, -1.5F, 1.0F, -3.4F, 2, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 86, 93, 0.25F, 1.25F, -3.15F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 86, 93, -1.25F, 1.25F, -3.15F, 0, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 0.25F, -3.4F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 35, -1.0F, 0.0577F, -3.28F, 1, 1, 4, -0.01F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, -1.65F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 68, 43, -1.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(-1.675F, 0.7588F, -1.9224F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 68, 80, 0.125F, -0.4F, -0.65F, 1, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 68, 80, 1.225F, -0.4F, -0.65F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(-0.5F, 1.0F, -3.4F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 66, -0.5F, 0.0F, -3.15F, 1, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(-0.5F, 2.0F, 0.35F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 64, 39, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 68, 16, -1.0F, -1.75F, -2.0F, 2, 2, 2, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 73, 91, 0.99F, -1.75F, -3.25F, 0, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 68, 91, -0.99F, -1.75F, -3.25F, 0, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 68, 91, -0.94F, -1.75F, -3.25F, 0, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 68, 91, 0.94F, -1.75F, -3.25F, 0, 2, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.0F, -0.1195F, -3.7256F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 30, -0.5F, 0.0183F, -2.9638F, 1, 1, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, 2.683F, 0.0652F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0524F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 30, -1.0F, -1.94F, -0.0439F, 2, 2, 3, -0.03F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.0F, 1.5995F, -2.5218F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3927F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 40, 7, -1.0F, -1.9326F, -0.1625F, 2, 2, 3, -0.02F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(0.0F, 0.8656F, -3.1313F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3927F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 89, 82, -0.5F, -0.5F, -1.05F, 1, 1, 2, -0.02F, false));

        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(-0.5F, 1.0F, -1.75F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 86, 93, -0.25F, -1.25F, -1.8F, 0, 1, 2, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 86, 93, 1.25F, -1.25F, -1.8F, 0, 1, 2, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 84, 78, -0.5F, -1.0F, -2.05F, 2, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(0.75F, -0.25F, -3.0F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4363F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 3, 98, 0.205F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 3, 98, -1.705F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -1.73F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 0, 0.23F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftArm = new AdvancedModelRendererExtended(this);
        this.leftArm.setRotationPoint(4.25F, 5.7944F, -6.11F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.6037F, 0.0998F, -0.1434F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 70, 78, -1.5F, -1.1F, -2.0F, 4, 7, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRendererExtended(this);
        this.leftArm2.setRotationPoint(0.0F, 5.5F, 1.65F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6934F, 0.0279F, 0.1341F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 82, 0, -0.8884F, -0.8325F, -3.3761F, 3, 10, 4, 0.0F, false));

        this.leftArm3 = new AdvancedModelRendererExtended(this);
        this.leftArm3.setRotationPoint(0.1116F, 7.3675F, -0.2261F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0873F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 21, 82, -1.5F, 0.1768F, -4.1708F, 4, 2, 5, 0.0F, false));

        this.rightArm = new AdvancedModelRendererExtended(this);
        this.rightArm.setRotationPoint(-4.25F, 5.7944F, -6.11F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.6037F, -0.0998F, 0.1434F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 70, 78, -2.5F, -1.1F, -2.0F, 4, 7, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRendererExtended(this);
        this.rightArm2.setRotationPoint(0.0F, 5.5F, 1.65F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6934F, -0.0279F, -0.1341F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 82, 0, -2.1116F, -0.8325F, -3.3761F, 3, 10, 4, 0.0F, true));

        this.rightArm3 = new AdvancedModelRendererExtended(this);
        this.rightArm3.setRotationPoint(-0.1116F, 7.3675F, -0.2261F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0873F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 21, 82, -2.5F, 0.1768F, -4.1708F, 4, 2, 5, 0.0F, true));

        this.Leftlegspike = new AdvancedModelRendererExtended(this);
        this.Leftlegspike.setRotationPoint(4.75F, -4.1056F, -4.41F);
        this.chest.addChild(Leftlegspike);
        this.setRotateAngle(Leftlegspike, 0.3523F, 0.0439F, -0.6803F);
        this.Leftlegspike.cubeList.add(new ModelBox(Leftlegspike, 75, 69, -3.0F, 0.0F, -2.5F, 6, 3, 5, 0.0F, false));

        this.spike = new AdvancedModelRendererExtended(this);
        this.spike.setRotationPoint(2.75F, 1.0F, -0.5F);
        this.Leftlegspike.addChild(spike);
        this.setRotateAngle(spike, 0.0F, -0.3927F, 0.0F);
        this.spike.cubeList.add(new ModelBox(spike, 40, 0, -0.75F, -0.5F, -1.5F, 6, 2, 4, 0.0F, false));

        this.spike2 = new AdvancedModelRendererExtended(this);
        this.spike2.setRotationPoint(5.975F, 0.5F, 0.3F);
        this.spike.addChild(spike2);
        this.setRotateAngle(spike2, 0.0F, -0.3927F, 0.0F);
        this.spike2.cubeList.add(new ModelBox(spike2, 45, 39, -2.0F, -0.5F, -1.0F, 7, 1, 2, 0.0F, false));

        this.spike3 = new AdvancedModelRendererExtended(this);
        this.spike3.setRotationPoint(6.0F, 0.0F, -0.6F);
        this.spike2.addChild(spike3);
        this.setRotateAngle(spike3, 0.0F, -0.2182F, 0.0F);
        this.spike3.cubeList.add(new ModelBox(spike3, 53, 16, -1.175F, -0.5F, -0.125F, 6, 1, 1, -0.01F, false));

        this.babyfrontspike = new AdvancedModelRendererExtended(this);
        this.babyfrontspike.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.Leftlegspike.addChild(babyfrontspike);
        this.setRotateAngle(babyfrontspike, 0.0315F, -0.071F, 0.0278F);
        this.babyfrontspike.cubeList.add(new ModelBox(babyfrontspike, 85, 87, -3.0F, 0.0F, -2.5F, 4, 3, 4, 0.0F, false));

        this.babyfrontspike2 = new AdvancedModelRendererExtended(this);
        this.babyfrontspike2.setRotationPoint(0.75F, 1.0F, -0.65F);
        this.babyfrontspike.addChild(babyfrontspike2);
        this.setRotateAngle(babyfrontspike2, 0.0F, -0.3927F, 0.0F);
        this.babyfrontspike2.cubeList.add(new ModelBox(babyfrontspike2, 20, 52, -0.75F, -0.5F, -1.5F, 4, 2, 3, 0.0F, false));

        this.babyfrontspike3 = new AdvancedModelRendererExtended(this);
        this.babyfrontspike3.setRotationPoint(4.375F, 0.5F, 0.375F);
        this.babyfrontspike2.addChild(babyfrontspike3);
        this.setRotateAngle(babyfrontspike3, 0.0F, -0.3927F, 0.0F);
        this.babyfrontspike3.cubeList.add(new ModelBox(babyfrontspike3, 0, 7, -2.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));

        this.babyfrontspike4 = new AdvancedModelRendererExtended(this);
        this.babyfrontspike4.setRotationPoint(2.925F, 0.0F, -0.6F);
        this.babyfrontspike3.addChild(babyfrontspike4);
        this.setRotateAngle(babyfrontspike4, 0.0F, -0.2182F, 0.0F);
        this.babyfrontspike4.cubeList.add(new ModelBox(babyfrontspike4, 67, 69, -1.175F, -0.5F, -0.125F, 4, 1, 1, -0.01F, false));

        this.Rightlegspike = new AdvancedModelRendererExtended(this);
        this.Rightlegspike.setRotationPoint(-4.75F, -4.1056F, -4.41F);
        this.chest.addChild(Rightlegspike);
        this.setRotateAngle(Rightlegspike, 0.3523F, -0.0439F, 0.6803F);
        this.Rightlegspike.cubeList.add(new ModelBox(Rightlegspike, 75, 69, -3.0F, 0.0F, -2.5F, 6, 3, 5, 0.0F, true));

        this.spike4 = new AdvancedModelRendererExtended(this);
        this.spike4.setRotationPoint(-2.75F, 1.0F, -0.5F);
        this.Rightlegspike.addChild(spike4);
        this.setRotateAngle(spike4, 0.0F, 0.3927F, 0.0F);
        this.spike4.cubeList.add(new ModelBox(spike4, 40, 0, -5.25F, -0.5F, -1.5F, 6, 2, 4, 0.0F, true));

        this.spike5 = new AdvancedModelRendererExtended(this);
        this.spike5.setRotationPoint(-5.975F, 0.5F, 0.3F);
        this.spike4.addChild(spike5);
        this.setRotateAngle(spike5, 0.0F, 0.3927F, 0.0F);
        this.spike5.cubeList.add(new ModelBox(spike5, 45, 39, -5.0F, -0.5F, -1.0F, 7, 1, 2, 0.0F, true));

        this.spike6 = new AdvancedModelRendererExtended(this);
        this.spike6.setRotationPoint(-6.0F, 0.0F, -0.6F);
        this.spike5.addChild(spike6);
        this.setRotateAngle(spike6, 0.0F, 0.2182F, 0.0F);
        this.spike6.cubeList.add(new ModelBox(spike6, 53, 16, -4.825F, -0.5F, -0.125F, 6, 1, 1, -0.01F, true));

        this.babyfrontspike5 = new AdvancedModelRendererExtended(this);
        this.babyfrontspike5.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.Rightlegspike.addChild(babyfrontspike5);
        this.setRotateAngle(babyfrontspike5, 0.0315F, 0.071F, -0.0278F);
        this.babyfrontspike5.cubeList.add(new ModelBox(babyfrontspike5, 85, 87, -1.0F, 0.0F, -2.5F, 4, 3, 4, 0.0F, true));

        this.babyfrontspike6 = new AdvancedModelRendererExtended(this);
        this.babyfrontspike6.setRotationPoint(-0.75F, 1.0F, -0.65F);
        this.babyfrontspike5.addChild(babyfrontspike6);
        this.setRotateAngle(babyfrontspike6, 0.0F, 0.3927F, 0.0F);
        this.babyfrontspike6.cubeList.add(new ModelBox(babyfrontspike6, 20, 52, -3.25F, -0.5F, -1.5F, 4, 2, 3, 0.0F, true));

        this.babyfrontspike7 = new AdvancedModelRendererExtended(this);
        this.babyfrontspike7.setRotationPoint(-4.375F, 0.5F, 0.375F);
        this.babyfrontspike6.addChild(babyfrontspike7);
        this.setRotateAngle(babyfrontspike7, 0.0F, 0.3927F, 0.0F);
        this.babyfrontspike7.cubeList.add(new ModelBox(babyfrontspike7, 0, 7, -2.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, true));

        this.babyfrontspike8 = new AdvancedModelRendererExtended(this);
        this.babyfrontspike8.setRotationPoint(-2.925F, 0.0F, -0.6F);
        this.babyfrontspike7.addChild(babyfrontspike8);
        this.setRotateAngle(babyfrontspike8, 0.0F, 0.2182F, 0.0F);
        this.babyfrontspike8.cubeList.add(new ModelBox(babyfrontspike8, 67, 69, -2.825F, -0.5F, -0.125F, 4, 1, 1, -0.01F, true));

        this.plate7 = new AdvancedModelRendererExtended(this);
        this.plate7.setRotationPoint(1.75F, -5.7034F, -7.6709F);
        this.chest.addChild(plate7);
        this.setRotateAngle(plate7, -0.2182F, 0.0F, 0.0F);


        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(-3.5F, 0.206F, 1.4528F);
        this.plate7.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.6545F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 35, 82, -0.5F, -1.4F, -0.4F, 1, 3, 1, -0.01F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 35, 82, 3.0F, -1.4F, -0.4F, 1, 3, 1, -0.01F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.plate7.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2618F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 40, 82, -0.5F, -0.925F, -0.65F, 1, 3, 2, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 40, 82, 3.0F, -0.925F, -0.65F, 1, 3, 2, 0.0F, false));

        this.plate6 = new AdvancedModelRendererExtended(this);
        this.plate6.setRotationPoint(0.0F, -8.0813F, -3.6793F);
        this.chest.addChild(plate6);
        this.setRotateAngle(plate6, -0.1745F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(-2.5F, 0.875F, -0.275F);
        this.plate6.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.48F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 21, 82, -0.5F, -0.975F, 0.55F, 1, 3, 1, -0.01F, true));

        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.plate6.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 27, 58, -3.0F, -0.625F, -1.275F, 1, 4, 2, 0.0F, true));

        this.cube_r32 = new AdvancedModelRendererExtended(this);
        this.cube_r32.setRotationPoint(2.5F, 0.875F, -0.275F);
        this.plate6.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.48F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 21, 82, -0.5F, -0.975F, 0.55F, 1, 3, 1, -0.01F, false));

        this.cube_r33 = new AdvancedModelRendererExtended(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.plate6.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 27, 58, 2.0F, -0.625F, -1.275F, 1, 4, 2, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tailspike7, -0.7459F, -0.274F, -1.0267F);
        this.setRotateAngle(tailspike5, -0.517F, -0.0869F, -0.8933F);
        this.setRotateAngle(tailspike3, -0.7459F, 0.274F, 1.0267F);
        this.setRotateAngle(tailspike, -0.517F, 0.0869F, 0.8933F);
        this.setRotateAngle(tail5, 0.2618F, 0.1309F, 0.0F);
        this.setRotateAngle(tail4, 0.3491F, 0.0873F, 0.0F);
        this.setRotateAngle(tail3, 0.2618F, 0.0873F, 0.0F);
        this.setRotateAngle(tail2, 0.2618F, 0.0436F, 0.0F);
        this.setRotateAngle(tail1, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(spike6, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(spike5, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(spike4, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(spike3, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(spike2, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(spike, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(plate7, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(plate6, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(plate5, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(plate4, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(plate3, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.3491F, -0.1745F, 0.0F);
        this.setRotateAngle(neck2, -0.2182F, -0.0436F, 0.0F);
        this.setRotateAngle(neck1, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(babyfrontspike2, 0.3523F, -0.0439F, 0.6803F);
        this.setRotateAngle(babyfrontspike, 0.3523F, 0.0439F, -0.6803F);
        this.setRotateAngle(rightArm3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm2, -1.4788F, -0.0279F, -0.1341F);
        this.setRotateAngle(rightArm, 0.7782F, -0.0998F, 0.1434F);
        this.setRotateAngle(leftArm3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm2, -1.4788F, 0.0279F, 0.1341F);
        this.setRotateAngle(leftArm, 0.7782F, 0.0998F, -0.1434F);
        this.setRotateAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.8247F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2836F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.8247F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.2836F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.7898F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.2836F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.7898F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.2836F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.8683F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.2662F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.3054F, -0.0873F, 0.0F);
        this.setRotateAngle(rightLeg3, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(babyfrontspike8, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(babyfrontspike7, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(babyfrontspike6, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(babyfrontspike5, 0.3523F, -0.0439F, 0.6803F);
        this.setRotateAngle(babyfrontspike4, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(babyfrontspike3, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(babyfrontspike2, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(babyfrontspike, 0.3523F, 0.0439F, -0.6803F);
        this.hips.offsetY = 0.09F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.main.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraGigantspinosaurus kentrosaurus = (EntityPrehistoricFloraGigantspinosaurus) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        kentrosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (kentrosaurus.getAnimation() == kentrosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!kentrosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !kentrosaurus.getIsMoving()) {
                    if (kentrosaurus.getAnimation() != kentrosaurus.EAT_ANIMATION
                        && kentrosaurus.getAnimation() != kentrosaurus.DRINK_ANIMATION
                        && kentrosaurus.getAnimation() != kentrosaurus.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (kentrosaurus.getAnimation() != kentrosaurus.ATTACK_ANIMATION) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (kentrosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGigantspinosaurus ee = (EntityPrehistoricFloraGigantspinosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGigantspinosaurus entity = (EntityPrehistoricFloraGigantspinosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 20 + (((tickAnim - 13) / 13) * (20-(20)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 20 + (((tickAnim - 26) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 13) / 13) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -10 + (((tickAnim - 26) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(0);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(0);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -27.5 + (((tickAnim - 13) / 13) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -27.5 + (((tickAnim - 26) / 10) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 17.5 + (((tickAnim - 13) / 13) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 17.5 + (((tickAnim - 26) / 10) * (0-(17.5)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 7) * (0.2-(0.3)));
            zz = -0.4 + (((tickAnim - 6) / 7) * (-0.6-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = 0.2 + (((tickAnim - 13) / 13) * (0.2-(0.2)));
            zz = -0.6 + (((tickAnim - 13) / 13) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 26) / 5) * (0.3-(0.2)));
            zz = -0.6 + (((tickAnim - 26) / 5) * (-0.4-(-0.6)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 31) / 5) * (0-(0.3)));
            zz = -0.4 + (((tickAnim - 31) / 5) * (0-(-0.4)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (20-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 20 + (((tickAnim - 20) / 13) * (-15-(20)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 33) / 7) * (0-(-15)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 13) / 10) * (20-(25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 20 + (((tickAnim - 23) / 8) * (-5-(20)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 31) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 25 + (((tickAnim - 10) / 9) * (20-(25)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 19) / 11) * (0-(20)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-15-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -15 + (((tickAnim - 18) / 7) * (25-(-15)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 25 + (((tickAnim - 25) / 8) * (15-(25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 15 + (((tickAnim - 33) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 10 + (((tickAnim - 43) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 48) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (25-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 25 + (((tickAnim - 19) / 3) * (0-(25)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (15-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 30) / 3) * (5-(15)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 33) / 2) * (5-(5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 35) / 3) * (20-(5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 38) / 2) * (5-(20)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 40) / 3) * (5-(5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 5 + (((tickAnim - 43) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 45) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            yy = -0.5 + (((tickAnim - 26) / 24) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 13) / 13) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -10 + (((tickAnim - 26) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -30 + (((tickAnim - 13) / 13) * (-30-(-30)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -30 + (((tickAnim - 26) / 10) * (0-(-30)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 20 + (((tickAnim - 13) / 13) * (20-(20)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 20 + (((tickAnim - 26) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 7) * (0-(0.3)));
            zz = -0.4 + (((tickAnim - 6) / 7) * (-0.6-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = -0.6 + (((tickAnim - 13) / 13) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 5) * (0.3-(0)));
            zz = -0.6 + (((tickAnim - 26) / 5) * (-0.4-(-0.6)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 31) / 5) * (0-(0.3)));
            zz = -0.4 + (((tickAnim - 31) / 5) * (0-(-0.4)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGigantspinosaurus entity = (EntityPrehistoricFloraGigantspinosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 8) / 5) * (25-(20)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 13) / 7) * (0-(25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 20 + (((tickAnim - 8) / 8) * (25-(20)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 16) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 6) / 7) * (20-(15)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 13) / 7) * (0-(20)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 8) / 8) * (5-(15)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 16) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 6) / 4) * (20-(15)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.125-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.65 + (((tickAnim - 10) / 3) * (0-(-0.65)));
            zz = -0.125 + (((tickAnim - 10) / 3) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGigantspinosaurus entity = (EntityPrehistoricFloraGigantspinosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 3) * (-17.59639-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 3) * (4.90361-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -17.59639 + (((tickAnim - 13) / 1) * (-33.36525-(-17.59639)));
            yy = 4.90361 + (((tickAnim - 13) / 1) * (1.63475-(4.90361)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -33.36525 + (((tickAnim - 14) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(-33.36525)));
            yy = 1.63475 + (((tickAnim - 14) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(1.63475)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 22) / 6) * (-13.2435-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 22) / 6) * (2.71804-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -13.2435 + (((tickAnim - 28) / 5) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(-13.2435)));
            yy = 2.71804 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(2.71804)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*0.5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*0.5)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+80))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+80))*-50 + (((tickAnim - 10) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+80))*-50)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 10) / 10) * (-17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*1 + (((tickAnim - 20) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*1)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = -17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*6 + (((tickAnim - 20) / 13) * (1.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1-(-17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*6)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 1.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 33) / 7) * (0-(1.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-10))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-10))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-10))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-15 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*30 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1 + (((tickAnim - 10) / 10) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2 + (((tickAnim - 20) / 2) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-1-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-1 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-1)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-60 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-60)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 10) * (-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30 + (((tickAnim - 20) / 2) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30-(-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*20-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*20 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*20)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.42928-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 5) * (1.58966-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 5) * (0.46966-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.42928 + (((tickAnim - 15) / 5) * (0-(0.42928)));
            yy = 1.58966 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*50-(1.58966)));
            zz = 0.46966 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-5-(0.46966)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*50 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-5)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.01047-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (-7.4361+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (-0.9777+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.01047 + (((tickAnim - 10) / 5) * (-0.54492-(-0.01047)));
            yy = -7.4361+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-10.53366-(-7.4361+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
            zz = -0.9777+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-5.41284-(-0.9777+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.54492 + (((tickAnim - 15) / 5) * (0-(-0.54492)));
            yy = -10.53366 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50-(-10.53366)));
            zz = -5.41284 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5-(-5.41284)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.01836-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (-12.488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (-0.5466+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.01836 + (((tickAnim - 10) / 5) * (-0.31464-(0.01836)));
            yy = -12.488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-9.52801-(-12.488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
            zz = -0.5466+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-2.81176-(-0.5466+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.31464 + (((tickAnim - 15) / 3) * (1.83721-(-0.31464)));
            yy = -9.52801 + (((tickAnim - 15) / 3) * (21.62164-(-9.52801)));
            zz = -2.81176 + (((tickAnim - 15) / 3) * (1.74603-(-2.81176)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.83721 + (((tickAnim - 18) / 2) * (9.8017-(1.83721)));
            yy = 21.62164 + (((tickAnim - 18) / 2) * (-1.2961+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60-(21.62164)));
            zz = 1.74603 + (((tickAnim - 18) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*8.934-(1.74603)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 9.8017 + (((tickAnim - 20) / 2) * (0-(9.8017)));
            yy = -1.2961+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60-(-1.2961+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*8.934 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*8.934)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*-5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.05187-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 7) * (10.33194-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 7) * (2.02753-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.05187 + (((tickAnim - 7) / 3) * (0.01836-(0.05187)));
            yy = 10.33194 + (((tickAnim - 7) / 3) * (-12.4881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(10.33194)));
            zz = 2.02753 + (((tickAnim - 7) / 3) * (-0.5465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(2.02753)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.01836 + (((tickAnim - 10) / 5) * (-1.76638-(0.01836)));
            yy = -12.4881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-6.12607-(-12.4881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
            zz = -0.5465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (12.70321-(-0.5465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.76638 + (((tickAnim - 15) / 3) * (-1.72567-(-1.76638)));
            yy = -6.12607 + (((tickAnim - 15) / 3) * (-6.90301-(-6.12607)));
            zz = 12.70321 + (((tickAnim - 15) / 3) * (8.5836-(12.70321)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.72567 + (((tickAnim - 18) / 2) * (9.67328-(-1.72567)));
            yy = -6.90301 + (((tickAnim - 18) / 2) * (-1.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70-(-6.90301)));
            zz = 8.5836 + (((tickAnim - 18) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*12.7294-(8.5836)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 9.67328 + (((tickAnim - 20) / 2) * (0-(9.67328)));
            yy = -1.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70-(-1.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*12.7294 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*12.7294)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0.03646-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70 + (((tickAnim - 22) / 4) * (10.64089-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*-5 + (((tickAnim - 22) / 4) * (1.69756-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*-5)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0.03646 + (((tickAnim - 26) / 7) * (0-(0.03646)));
            yy = 10.64089 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*-10-(10.64089)));
            zz = 1.69756 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*5-(1.69756)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.3983-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 7) * (11.08282-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 7) * (0.92819-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.3983 + (((tickAnim - 7) / 3) * (-0.47923-(-0.3983)));
            yy = 11.08282 + (((tickAnim - 7) / 3) * (-22.1506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(11.08282)));
            zz = 0.92819 + (((tickAnim - 7) / 3) * (4.0025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(0.92819)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.47923 + (((tickAnim - 10) / 5) * (-0.01488-(-0.47923)));
            yy = -22.1506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-15.21767-(-22.1506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
            zz = 4.0025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (7.49842-(4.0025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.01488 + (((tickAnim - 15) / 3) * (-0.07602-(-0.01488)));
            yy = -15.21767 + (((tickAnim - 15) / 3) * (-15.51425-(-15.21767)));
            zz = 7.49842 + (((tickAnim - 15) / 3) * (7.56935-(7.49842)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.07602 + (((tickAnim - 18) / 2) * (7.55447-(-0.07602)));
            yy = -15.51425 + (((tickAnim - 18) / 2) * (1.6388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80-(-15.51425)));
            zz = 7.56935 + (((tickAnim - 18) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*11.7056-(7.56935)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 7.55447 + (((tickAnim - 20) / 2) * (0-(7.55447)));
            yy = 1.6388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80-(1.6388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*11.7056 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*11.7056)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0.11215-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80 + (((tickAnim - 22) / 4) * (10.85356-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*-5 + (((tickAnim - 22) / 4) * (-2.42895-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*-5)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0.11215 + (((tickAnim - 26) / 7) * (0-(0.11215)));
            yy = 10.85356 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*-10-(10.85356)));
            zz = -2.42895 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*5-(-2.42895)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*42.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*42.5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*42.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*30 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*30)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2.5 + (((tickAnim - 20) / 5) * (-3-(2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -3 + (((tickAnim - 25) / 8) * (20-(-3)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 20 + (((tickAnim - 33) / 2) * (-20-(20)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 35) / 5) * (2.5-(-20)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+10))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+10))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+10))*20)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+70))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+70))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+70))*-10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+20))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+20))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+20))*20)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-30)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+80))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+80))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+80))*-10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+90))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*20)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+90))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+90))*-30)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-30)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-30 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*1 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*1)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-60 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-60)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 10) * (-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30 + (((tickAnim - 20) / 2) * (-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30-(-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-20-(-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-20 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-20)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*30 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*30)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-0.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-0.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-0.5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-0.5)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftlegspike.rotationPointX = this.Leftlegspike.rotationPointX + (float)(xx);
        this.Leftlegspike.rotationPointY = this.Leftlegspike.rotationPointY - (float)(yy);
        this.Leftlegspike.rotationPointZ = this.Leftlegspike.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-0.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-0.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*0.5)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-0.5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-0.5)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightlegspike.rotationPointX = this.Rightlegspike.rotationPointX + (float)(xx);
        this.Rightlegspike.rotationPointY = this.Rightlegspike.rotationPointY - (float)(yy);
        this.Rightlegspike.rotationPointZ = this.Rightlegspike.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGigantspinosaurus entity = (EntityPrehistoricFloraGigantspinosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -10.5 + (((tickAnim - 18) / 14) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -10.5 + (((tickAnim - 32) / 18) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5.9-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = -5.9 + (((tickAnim - 18) / 14) * (-5.9-(-5.9)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -5.9 + (((tickAnim - 32) / 18) * (0-(-5.9)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-23-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = -23 + (((tickAnim - 18) / 14) * (-23-(-23)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -23 + (((tickAnim - 32) / 18) * (0-(-23)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 1.7 + (((tickAnim - 18) / 14) * (1.7-(1.7)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 1.7 + (((tickAnim - 32) / 18) * (0-(1.7)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (48.38209-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (4.68755-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.88017-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 48.38209 + (((tickAnim - 18) / 14) * (48.38209-(48.38209)));
            yy = 4.68755 + (((tickAnim - 18) / 14) * (4.68755-(4.68755)));
            zz = -2.88017 + (((tickAnim - 18) / 14) * (-2.88017-(-2.88017)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 48.38209 + (((tickAnim - 32) / 18) * (0-(48.38209)));
            yy = 4.68755 + (((tickAnim - 32) / 18) * (0-(4.68755)));
            zz = -2.88017 + (((tickAnim - 32) / 18) * (0-(-2.88017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -20.5 + (((tickAnim - 18) / 14) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -20.5 + (((tickAnim - 32) / 18) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -18 + (((tickAnim - 18) / 14) * (-18-(-18)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 32) / 18) * (0-(-18)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.29-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.29 + (((tickAnim - 3) / 5) * (0.54-(0.29)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.54 + (((tickAnim - 8) / 5) * (0.57-(0.54)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.57 + (((tickAnim - 13) / 5) * (0.4-(0.57)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 0.4 + (((tickAnim - 18) / 14) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 32) / 4) * (0.57-(0.4)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            yy = 0.57 + (((tickAnim - 36) / 5) * (0.54-(0.57)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            yy = 0.54 + (((tickAnim - 41) / 5) * (0.29-(0.54)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0.29 + (((tickAnim - 46) / 4) * (0-(0.29)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (23-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 23 + (((tickAnim - 18) / 14) * (23-(23)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 23 + (((tickAnim - 32) / 18) * (0-(23)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 1.7 + (((tickAnim - 18) / 14) * (1.7-(1.7)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 1.7 + (((tickAnim - 32) / 18) * (0-(1.7)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (48.38209-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4.6875-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.8802-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 48.38209 + (((tickAnim - 18) / 14) * (48.38209-(48.38209)));
            yy = -4.6875 + (((tickAnim - 18) / 14) * (-4.6875-(-4.6875)));
            zz = 2.8802 + (((tickAnim - 18) / 14) * (2.8802-(2.8802)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 48.38209 + (((tickAnim - 32) / 18) * (0-(48.38209)));
            yy = -4.6875 + (((tickAnim - 32) / 18) * (0-(-4.6875)));
            zz = 2.8802 + (((tickAnim - 32) / 18) * (0-(2.8802)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -22.25 + (((tickAnim - 18) / 14) * (-22.25-(-22.25)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -22.25 + (((tickAnim - 32) / 18) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -18 + (((tickAnim - 18) / 14) * (-18-(-18)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 32) / 18) * (0-(-18)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.29-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.29 + (((tickAnim - 3) / 5) * (0.54-(0.29)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.54 + (((tickAnim - 8) / 5) * (0.57-(0.54)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.57 + (((tickAnim - 13) / 5) * (0.4-(0.57)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 0.4 + (((tickAnim - 18) / 14) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 32) / 4) * (0.57-(0.4)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            yy = 0.57 + (((tickAnim - 36) / 5) * (0.54-(0.57)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            yy = 0.54 + (((tickAnim - 41) / 5) * (0.29-(0.54)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0.29 + (((tickAnim - 46) / 4) * (0-(0.29)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 13.75 + (((tickAnim - 18) / 14) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 32) / 18) * (0-(13.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 29.75 + (((tickAnim - 10) / 8) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 29.75 + (((tickAnim - 18) / 14) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 29.75 + (((tickAnim - 32) / 6) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 29.75 + (((tickAnim - 38) / 12) * (0-(29.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-39-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -39 + (((tickAnim - 10) / 8) * (-12.37621-(-39)));
            yy = 0 + (((tickAnim - 10) / 8) * (2.96224-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (2.30307-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -12.37621 + (((tickAnim - 18) / 14) * (-12.37621-(-12.37621)));
            yy = 2.96224 + (((tickAnim - 18) / 14) * (2.96224-(2.96224)));
            zz = 2.30307 + (((tickAnim - 18) / 14) * (2.30307-(2.30307)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -12.37621 + (((tickAnim - 32) / 6) * (-39-(-12.37621)));
            yy = 2.96224 + (((tickAnim - 32) / 6) * (0-(2.96224)));
            zz = 2.30307 + (((tickAnim - 32) / 6) * (0-(2.30307)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -39 + (((tickAnim - 38) / 12) * (0-(-39)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.35-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -0.075 + (((tickAnim - 18) / 14) * (-0.075-(-0.075)));
            yy = 0.5 + (((tickAnim - 18) / 14) * (0.5-(0.5)));
            zz = 0.35 + (((tickAnim - 18) / 14) * (0.35-(0.35)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.075 + (((tickAnim - 32) / 18) * (0-(-0.075)));
            yy = 0.5 + (((tickAnim - 32) / 18) * (0-(0.5)));
            zz = 0.35 + (((tickAnim - 32) / 18) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 22.25 + (((tickAnim - 10) / 8) * (-6.5-(22.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -6.5 + (((tickAnim - 18) / 14) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -6.5 + (((tickAnim - 32) / 6) * (22.25-(-6.5)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 22.25 + (((tickAnim - 38) / 12) * (0-(22.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 18) * (0-(0.1)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 18) * (0.1-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 29.75 + (((tickAnim - 18) / 14) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 29.75 + (((tickAnim - 32) / 18) * (0-(29.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-12.37621-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.9622-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.30307-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -12.37621 + (((tickAnim - 18) / 14) * (-12.37621-(-12.37621)));
            yy = -2.9622 + (((tickAnim - 18) / 14) * (-2.9622-(-2.9622)));
            zz = 2.30307 + (((tickAnim - 18) / 14) * (2.30307-(2.30307)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -12.37621 + (((tickAnim - 32) / 18) * (0-(-12.37621)));
            yy = -2.9622 + (((tickAnim - 32) / 18) * (0-(-2.9622)));
            zz = 2.30307 + (((tickAnim - 32) / 18) * (0-(2.30307)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.35-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -0.075 + (((tickAnim - 18) / 14) * (-0.075-(-0.075)));
            yy = 0.5 + (((tickAnim - 18) / 14) * (0.5-(0.5)));
            zz = 0.35 + (((tickAnim - 18) / 14) * (0.35-(0.35)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.075 + (((tickAnim - 32) / 18) * (0-(-0.075)));
            yy = 0.5 + (((tickAnim - 32) / 18) * (0-(0.5)));
            zz = 0.35 + (((tickAnim - 32) / 18) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -6.5 + (((tickAnim - 18) / 14) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = -2 + (((tickAnim - 18) / 14) * (-2-(-2)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 32) / 18) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = -2 + (((tickAnim - 32) / 18) * (0-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 18) * (0-(0.175)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 18) * (0.175-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGigantspinosaurus entity = (EntityPrehistoricFloraGigantspinosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -8.5 + (((tickAnim - 0) / 23) * (25-(-8.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 25 + (((tickAnim - 23) / 14) * (-26.01-(25)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -26.01 + (((tickAnim - 37) / 13) * (-8.5-(-26.01)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -3.75 + (((tickAnim - 0) / 23) * (25.25-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 25.25 + (((tickAnim - 23) / 14) * (44-(25.25)));
            yy = 0 + (((tickAnim - 23) / 14) * (2.5-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (2.5-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 44 + (((tickAnim - 37) / 13) * (-3.75-(44)));
            yy = 2.5 + (((tickAnim - 37) / 13) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 37) / 13) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 3) * (-0.045-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.045 + (((tickAnim - 3) / 5) * (-0.27-(-0.045)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = -0.27 + (((tickAnim - 8) / 15) * (0-(-0.27)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5.25 + (((tickAnim - 8) / 5) * (-8.58-(-5.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -8.58 + (((tickAnim - 13) / 10) * (-2.25-(-8.58)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -2.25 + (((tickAnim - 23) / 14) * (-2.5-(-2.25)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 37) / 13) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 11.5 + (((tickAnim - 0) / 8) * (-2.08-(11.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -2.08 + (((tickAnim - 8) / 5) * (-1.52-(-2.08)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -1.52 + (((tickAnim - 13) / 10) * (13.75-(-1.52)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 13.75 + (((tickAnim - 23) / 20) * (-18.13-(13.75)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -18.13 + (((tickAnim - 43) / 7) * (11.5-(-18.13)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*-5));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-8.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -8.25 + (((tickAnim - 15) / 20) * (-8.25-(-8.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -8.25 + (((tickAnim - 35) / 15) * (0-(-8.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-12-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -12 + (((tickAnim - 15) / 20) * (-12-(-12)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -12 + (((tickAnim - 35) / 15) * (0-(-12)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-15.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (4.5-(0)));
            yy = -15.25 + (((tickAnim - 15) / 20) * (-15.25-(-15.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 35) / 15) * (0-(4.5)));
            yy = -15.25 + (((tickAnim - 35) / 15) * (0-(-15.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (2.23009-(0)));
            yy = -6 + (((tickAnim - 15) / 20) * (-6-(-6)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.23009 + (((tickAnim - 35) / 15) * (0-(2.23009)));
            yy = -6 + (((tickAnim - 35) / 15) * (0-(-6)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGigantspinosaurus entity = (EntityPrehistoricFloraGigantspinosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -7.5 + (((tickAnim - 13) / 8) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -7.5 + (((tickAnim - 21) / 12) * (5-(-7.5)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 33) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -5 + (((tickAnim - 13) / 6) * (-5.0547-(-5)));
            yy = 0 + (((tickAnim - 13) / 6) * (4.82922-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (-1.29717-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = -5.0547 + (((tickAnim - 19) / 10) * (0.18348-(-5.0547)));
            yy = 4.82922 + (((tickAnim - 19) / 10) * (-5.94229-(4.82922)));
            zz = -1.29717 + (((tickAnim - 19) / 10) * (0.88642-(-1.29717)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0.18348 + (((tickAnim - 29) / 4) * (2.5-(0.18348)));
            yy = -5.94229 + (((tickAnim - 29) / 4) * (0-(-5.94229)));
            zz = 0.88642 + (((tickAnim - 29) / 4) * (0-(0.88642)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 33) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -5 + (((tickAnim - 13) / 6) * (3.20114-(-5)));
            yy = 0 + (((tickAnim - 13) / 6) * (10.82156-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (2.78058-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 3.20114 + (((tickAnim - 19) / 10) * (1.85671-(3.20114)));
            yy = 10.82156 + (((tickAnim - 19) / 10) * (-17.3439-(10.82156)));
            zz = 2.78058 + (((tickAnim - 19) / 10) * (0.72036-(2.78058)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 1.85671 + (((tickAnim - 29) / 4) * (0-(1.85671)));
            yy = -17.3439 + (((tickAnim - 29) / 4) * (-12.5-(-17.3439)));
            zz = 0.72036 + (((tickAnim - 29) / 4) * (0-(0.72036)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -12.5 + (((tickAnim - 33) / 7) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 10 + (((tickAnim - 11) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (2.5-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 2.5 + (((tickAnim - 23) / 6) * (-11-(2.5)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -11 + (((tickAnim - 29) / 1) * (-5-(-11)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 30) / 3) * (6.67-(-5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 6.67 + (((tickAnim - 33) / 1) * (5-(6.67)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 5 + (((tickAnim - 34) / 3) * (7.5-(5)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 37) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (15-(0)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = 15 + (((tickAnim - 21) / 8) * (15-(15)));
            yy = 0 + (((tickAnim - 21) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 8) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 29) / 4) * (0-(15)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
         EntityPrehistoricFloraGigantspinosaurus entity = (EntityPrehistoricFloraGigantspinosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-2), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3));

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 0) / 20) * (14.89191-(-17.5)));
            yy = -5 + (((tickAnim - 0) / 20) * (2.39542-(-5)));
            zz = -5 + (((tickAnim - 0) / 20) * (-3.3797-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.89191 + (((tickAnim - 20) / 10) * (-31.25-(14.89191)));
            yy = 2.39542 + (((tickAnim - 20) / 10) * (-2.5-(2.39542)));
            zz = -3.3797 + (((tickAnim - 20) / 10) * (0-(-3.3797)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -31.25 + (((tickAnim - 30) / 10) * (-17.5-(-31.25)));
            yy = -2.5 + (((tickAnim - 30) / 10) * (-5-(-2.5)));
            zz = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 2) * (-1.04-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -1.04 + (((tickAnim - 2) / 1) * (-0.6-(-1.04)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 2) * (-1.04-(-0.6)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -1.04 + (((tickAnim - 5) / 2) * (-0.9-(-1.04)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.9 + (((tickAnim - 7) / 1) * (-1.04-(-0.9)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -1.04 + (((tickAnim - 8) / 2) * (-0.6-(-1.04)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 10) / 2) * (-1.04-(-0.6)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -1.04 + (((tickAnim - 12) / 1) * (-0.6-(-1.04)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 13) / 7) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 4 + (((tickAnim - 0) / 20) * (25-(4)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 25 + (((tickAnim - 20) / 10) * (44-(25)));
            yy = -5 + (((tickAnim - 20) / 10) * (2.5-(-5)));
            zz = 0 + (((tickAnim - 20) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 44 + (((tickAnim - 30) / 10) * (4-(44)));
            yy = 2.5 + (((tickAnim - 30) / 10) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 30) / 10) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.01-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.01 + (((tickAnim - 3) / 4) * (-0.115-(0.01)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.115 + (((tickAnim - 7) / 3) * (-0.875-(-0.115)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.49836 + (((tickAnim - 0) / 3) * (9.7097-(14.49836)));
            yy = 0.69677 + (((tickAnim - 0) / 3) * (1.64587-(0.69677)));
            zz = 3.91294 + (((tickAnim - 0) / 3) * (1.0329-(3.91294)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 9.7097 + (((tickAnim - 3) / 3) * (3.13046-(9.7097)));
            yy = 1.64587 + (((tickAnim - 3) / 3) * (1.41015-(1.64587)));
            zz = 1.0329 + (((tickAnim - 3) / 3) * (-1.93294-(1.0329)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 3.13046 + (((tickAnim - 6) / 4) * (-8.77666-(3.13046)));
            yy = 1.41015 + (((tickAnim - 6) / 4) * (1.22487-(1.41015)));
            zz = -1.93294 + (((tickAnim - 6) / 4) * (-1.67898-(-1.93294)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.77666 + (((tickAnim - 10) / 10) * (5.25-(-8.77666)));
            yy = 1.22487 + (((tickAnim - 10) / 10) * (0-(1.22487)));
            zz = -1.67898 + (((tickAnim - 10) / 10) * (0-(-1.67898)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.25 + (((tickAnim - 20) / 10) * (20.61536-(5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.47822-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (1.34504-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 20.61536 + (((tickAnim - 30) / 8) * (-3.69175-(20.61536)));
            yy = 0.47822 + (((tickAnim - 30) / 8) * (0.91007-(0.47822)));
            zz = 1.34504 + (((tickAnim - 30) / 8) * (0.23432-(1.34504)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -3.69175 + (((tickAnim - 38) / 2) * (14.49836-(-3.69175)));
            yy = 0.91007 + (((tickAnim - 38) / 2) * (0.69677-(0.91007)));
            zz = 0.23432 + (((tickAnim - 38) / 2) * (3.91294-(0.23432)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 3) * (0.58-(0.375)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.58 + (((tickAnim - 3) / 7) * (0.43-(0.58)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.43 + (((tickAnim - 10) / 4) * (0.575-(0.43)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.575 + (((tickAnim - 14) / 6) * (0-(0.575)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 0) / 6) * (-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 6) * (-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 0) / 6) * (-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = -0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 6) / 13) * (-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 6) / 13) * (-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 6) / 13) * (-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 19) / 5) * (-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 19) / 5) * (-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 19) / 5) * (2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 24) / 8) * (-3.35325-(-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 24) / 8) * (-4.59467-(-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 24) / 8) * (0.91332-(2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.35325 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-3.35325)));
            yy = -4.59467 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-4.59467)));
            zz = 0.91332 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0.91332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*7.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*10), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 0) / 4) * (-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999)));
        }
        else if (tickAnim >= 4 && tickAnim < 40) {
            xx = -0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 4) / 36) * (-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*-3.051), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-2.878), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-2.0062));

        if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 27.5 + (((tickAnim - 0) / 6) * (-6.25-(27.5)));
            yy = 10 + (((tickAnim - 0) / 6) * (10-(10)));
            zz = -10 + (((tickAnim - 0) / 6) * (-10-(-10)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.25 + (((tickAnim - 6) / 2) * (-17.5-(-6.25)));
            yy = 10 + (((tickAnim - 6) / 2) * (10-(10)));
            zz = -10 + (((tickAnim - 6) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17.5 + (((tickAnim - 8) / 4) * (-22.5-(-17.5)));
            yy = 10 + (((tickAnim - 8) / 4) * (0-(10)));
            zz = -10 + (((tickAnim - 8) / 4) * (-5-(-10)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 12) / 8) * (10-(-22.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = -5 + (((tickAnim - 12) / 8) * (-2.5-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 20) / 6) * (17.75-(10)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = -2.5 + (((tickAnim - 20) / 6) * (-0.75-(-2.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 17.75 + (((tickAnim - 26) / 2) * (17.5-(17.75)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = -0.75 + (((tickAnim - 26) / 2) * (0-(-0.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 28) / 7) * (32.5-(17.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 32.5 + (((tickAnim - 35) / 5) * (27.5-(32.5)));
            yy = 2.5 + (((tickAnim - 35) / 5) * (10-(2.5)));
            zz = -2.5 + (((tickAnim - 35) / 5) * (-10-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 12) / 4) * (-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.25)));
            zz = 0 + (((tickAnim - 12) / 4) * (-0.25-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 16) / 4) * (-1.2-(-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = -0.25 + (((tickAnim - 16) / 4) * (-0.5-(-0.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -1.2 + (((tickAnim - 20) / 4) * (-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25-(-1.2)));
            zz = -0.5 + (((tickAnim - 20) / 4) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25 + (((tickAnim - 24) / 4) * (-1.3-(-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25)));
            zz = -0.25 + (((tickAnim - 24) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -1.3 + (((tickAnim - 28) / 4) * (-0.6-(-1.3)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = -0.6 + (((tickAnim - 32) / 3) * (-0.5-(-0.6)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 35) / 5) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -56.0482 + (((tickAnim - 0) / 5) * (-56.12249-(-56.0482)));
            yy = 1.69871 + (((tickAnim - 0) / 5) * (-0.72162-(1.69871)));
            zz = -2.10316 + (((tickAnim - 0) / 5) * (-2.21221-(-2.10316)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -56.12249 + (((tickAnim - 5) / 7) * (-15.21694-(-56.12249)));
            yy = -0.72162 + (((tickAnim - 5) / 7) * (2.69952-(-0.72162)));
            zz = -2.21221 + (((tickAnim - 5) / 7) * (0.7854-(-2.21221)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -15.21694 + (((tickAnim - 12) / 4) * (-21.46178-(-15.21694)));
            yy = 2.69952 + (((tickAnim - 12) / 4) * (2.31367-(2.69952)));
            zz = 0.7854 + (((tickAnim - 12) / 4) * (-0.66643-(0.7854)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -21.46178 + (((tickAnim - 16) / 4) * (-21.20662-(-21.46178)));
            yy = 2.31367 + (((tickAnim - 16) / 4) * (1.92782-(2.31367)));
            zz = -0.66643 + (((tickAnim - 16) / 4) * (-2.11825-(-0.66643)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -21.20662 + (((tickAnim - 20) / 6) * (-17.61198-(-21.20662)));
            yy = 1.92782 + (((tickAnim - 20) / 6) * (0.57834-(1.92782)));
            zz = -2.11825 + (((tickAnim - 20) / 6) * (-0.63547-(-2.11825)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -17.61198 + (((tickAnim - 26) / 2) * (-12.5-(-17.61198)));
            yy = 0.57834 + (((tickAnim - 26) / 2) * (0-(0.57834)));
            zz = -0.63547 + (((tickAnim - 26) / 2) * (0-(-0.63547)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 28) / 7) * (-25.18327-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (3.5637-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0.23014-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -25.18327 + (((tickAnim - 35) / 5) * (-56.0482-(-25.18327)));
            yy = 3.5637 + (((tickAnim - 35) / 5) * (1.69871-(3.5637)));
            zz = 0.23014 + (((tickAnim - 35) / 5) * (-2.10316-(0.23014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 16) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 28.75 + (((tickAnim - 0) / 8) * (21-(28.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 21 + (((tickAnim - 8) / 4) * (33.46783-(21)));
            yy = 0 + (((tickAnim - 8) / 4) * (-1.38475-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (2.66155-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 33.46783 + (((tickAnim - 12) / 8) * (10.98436-(33.46783)));
            yy = -1.38475 + (((tickAnim - 12) / 8) * (-0.75155-(-1.38475)));
            zz = 2.66155 + (((tickAnim - 12) / 8) * (2.38443-(2.66155)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 10.98436 + (((tickAnim - 20) / 6) * (2.54531-(10.98436)));
            yy = -0.75155 + (((tickAnim - 20) / 6) * (-0.22546-(-0.75155)));
            zz = 2.38443 + (((tickAnim - 20) / 6) * (0.71533-(2.38443)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 2.54531 + (((tickAnim - 26) / 2) * (-2.5-(2.54531)));
            yy = -0.22546 + (((tickAnim - 26) / 2) * (0-(-0.22546)));
            zz = 0.71533 + (((tickAnim - 26) / 2) * (0-(0.71533)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 28) / 7) * (15.5-(-2.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 15.5 + (((tickAnim - 35) / 5) * (28.75-(15.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 4) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 26) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*6), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 0) / 8) * (15-(10)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 2.5 + (((tickAnim - 0) / 8) * (0-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 8) / 7) * (27.5-(15)));
            yy = 0 + (((tickAnim - 8) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (2.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 15) / 5) * (27.5-(27.5)));
            yy = -2.5 + (((tickAnim - 15) / 5) * (-10-(-2.5)));
            zz = 2.5 + (((tickAnim - 15) / 5) * (10-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 27.5 + (((tickAnim - 20) / 8) * (-22.5-(27.5)));
            yy = -10 + (((tickAnim - 20) / 8) * (-10-(-10)));
            zz = 10 + (((tickAnim - 20) / 8) * (10-(10)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -22.5 + (((tickAnim - 28) / 4) * (-12-(-22.5)));
            yy = -10 + (((tickAnim - 28) / 4) * (0-(-10)));
            zz = 10 + (((tickAnim - 28) / 4) * (5-(10)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 32) / 8) * (10-(-12)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 5 + (((tickAnim - 32) / 8) * (2.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 2) * (-1.23-(-0.9)));
            zz = -0.5 + (((tickAnim - 0) / 2) * (-0.4-(-0.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -1.23 + (((tickAnim - 2) / 2) * (-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25-(-1.23)));
            zz = -0.4 + (((tickAnim - 2) / 2) * (-0.25-(-0.4)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25 + (((tickAnim - 4) / 3) * (-1.21-(-1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25)));
            zz = -0.25 + (((tickAnim - 4) / 3) * (-0.1-(-0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -1.21 + (((tickAnim - 7) / 1) * (-1.3-(-1.21)));
            zz = -0.1 + (((tickAnim - 7) / 1) * (0-(-0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -1.3 + (((tickAnim - 8) / 2) * (-0.65-(-1.3)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.65 + (((tickAnim - 10) / 5) * (-0.3-(-0.65)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 15) / 5) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 32) / 1) * (-0.25-(-0.4)));
            zz = 0 + (((tickAnim - 32) / 1) * (-0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 33) / 3) * (-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.25)));
            zz = -0.1 + (((tickAnim - 33) / 3) * (-0.25-(-0.1)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = -0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 36) / 2) * (-0.61-(-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = -0.25 + (((tickAnim - 36) / 2) * (-0.35-(-0.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.61 + (((tickAnim - 38) / 2) * (-0.9-(-0.61)));
            zz = -0.35 + (((tickAnim - 38) / 2) * (-0.5-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12.58426 + (((tickAnim - 0) / 8) * (2.5-(-12.58426)));
            yy = -1.16329 + (((tickAnim - 0) / 8) * (0-(-1.16329)));
            zz = -0.2855 + (((tickAnim - 0) / 8) * (0-(-0.2855)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.5 + (((tickAnim - 8) / 7) * (-20.17873-(2.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (-3.75693-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.33153-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -20.17873 + (((tickAnim - 15) / 1) * (-26.64782-(-20.17873)));
            yy = -3.75693 + (((tickAnim - 15) / 1) * (-3.63642-(-3.75693)));
            zz = -0.33153 + (((tickAnim - 15) / 1) * (0.62082-(-0.33153)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -26.64782 + (((tickAnim - 16) / 4) * (-58.74987-(-26.64782)));
            yy = -3.63642 + (((tickAnim - 16) / 4) * (-3.28469-(-3.63642)));
            zz = 0.62082 + (((tickAnim - 16) / 4) * (2.44489-(0.62082)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -58.74987 + (((tickAnim - 20) / 4) * (-58.37537-(-58.74987)));
            yy = -3.28469 + (((tickAnim - 20) / 4) * (-0.94768-(-3.28469)));
            zz = 2.44489 + (((tickAnim - 20) / 4) * (1.18031-(2.44489)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -58.37537 + (((tickAnim - 24) / 4) * (-25.17367-(-58.37537)));
            yy = -0.94768 + (((tickAnim - 24) / 4) * (1.5984-(-0.94768)));
            zz = 1.18031 + (((tickAnim - 24) / 4) * (2.399-(1.18031)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -25.17367 + (((tickAnim - 28) / 4) * (-16.21678-(-25.17367)));
            yy = 1.5984 + (((tickAnim - 28) / 4) * (-2.66269-(1.5984)));
            zz = 2.399 + (((tickAnim - 28) / 4) * (-0.76204-(2.399)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -16.21678 + (((tickAnim - 32) / 8) * (-12.58426-(-16.21678)));
            yy = -2.66269 + (((tickAnim - 32) / 8) * (-1.16329-(-2.66269)));
            zz = -0.76204 + (((tickAnim - 32) / 8) * (-0.2855-(-0.76204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 8) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 24) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.4972 + (((tickAnim - 0) / 4) * (-5.31659-(2.4972)));
            yy = 0.342 + (((tickAnim - 0) / 4) * (0.18155-(0.342)));
            zz = -0.9397 + (((tickAnim - 0) / 4) * (-0.97202-(-0.9397)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -5.31659 + (((tickAnim - 4) / 3) * (-12.10056-(-5.31659)));
            yy = 0.18155 + (((tickAnim - 4) / 3) * (0.0684-(0.18155)));
            zz = -0.97202 + (((tickAnim - 4) / 3) * (-0.18794-(-0.97202)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -12.10056 + (((tickAnim - 7) / 1) * (-12-(-12.10056)));
            yy = 0.0684 + (((tickAnim - 7) / 1) * (0-(0.0684)));
            zz = -0.18794 + (((tickAnim - 7) / 1) * (0-(-0.18794)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 8) / 2) * (2.25-(-12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 10) / 2) * (8.17-(2.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.17 + (((tickAnim - 12) / 3) * (28.75-(8.17)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 28.75 + (((tickAnim - 15) / 5) * (28.75-(28.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 28.75 + (((tickAnim - 20) / 8) * (-4.75-(28.75)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -4.75 + (((tickAnim - 28) / 4) * (24.97476-(-4.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (1.02565-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (-2.81938-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 24.97476 + (((tickAnim - 32) / 8) * (2.4972-(24.97476)));
            yy = 1.02565 + (((tickAnim - 32) / 8) * (0.342-(1.02565)));
            zz = -2.81938 + (((tickAnim - 32) / 8) * (-0.9397-(-2.81938)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -5 + (((tickAnim - 0) / 20) * (5-(-5)));
            zz = -5 + (((tickAnim - 0) / 20) * (5-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 5 + (((tickAnim - 20) / 20) * (-5-(5)));
            zz = 5 + (((tickAnim - 20) / 20) * (-5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlegspike, Leftlegspike.rotateAngleX + (float) Math.toRadians(xx), Leftlegspike.rotateAngleY + (float) Math.toRadians(yy), Leftlegspike.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -5 + (((tickAnim - 0) / 20) * (5-(-5)));
            zz = -5 + (((tickAnim - 0) / 20) * (5-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 5 + (((tickAnim - 20) / 20) * (-5-(5)));
            zz = 5 + (((tickAnim - 20) / 20) * (-5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlegspike, Rightlegspike.rotateAngleX + (float) Math.toRadians(xx), Rightlegspike.rotateAngleY + (float) Math.toRadians(yy), Rightlegspike.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.5 + (((tickAnim - 20) / 10) * (-2.5-(-10.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 30) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 14.93144 + (((tickAnim - 0) / 10) * (-31.25-(14.93144)));
            yy = 6.36203 + (((tickAnim - 0) / 10) * (-2.5-(6.36203)));
            zz = -2.86231 + (((tickAnim - 0) / 10) * (0-(-2.86231)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -31.25 + (((tickAnim - 10) / 10) * (-17.5-(-31.25)));
            yy = -2.5 + (((tickAnim - 10) / 10) * (5-(-2.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -17.5 + (((tickAnim - 20) / 20) * (14.93144-(-17.5)));
            yy = 5 + (((tickAnim - 20) / 20) * (6.36203-(5)));
            zz = 5 + (((tickAnim - 20) / 20) * (-2.86231-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 20) / 2) * (-1.04-(-0.9)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -1.04 + (((tickAnim - 22) / 1) * (-0.6-(-1.04)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 23) / 2) * (-1.04-(-0.6)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -1.04 + (((tickAnim - 25) / 2) * (-0.9-(-1.04)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = -0.9 + (((tickAnim - 27) / 1) * (-1.04-(-0.9)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -1.04 + (((tickAnim - 28) / 2) * (-0.6-(-1.04)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 30) / 2) * (-1.04-(-0.6)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -1.04 + (((tickAnim - 32) / 1) * (-0.6-(-1.04)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 33) / 7) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 0) / 10) * (44-(25)));
            yy = 5 + (((tickAnim - 0) / 10) * (2.5-(5)));
            zz = 5 + (((tickAnim - 0) / 10) * (2.5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 44 + (((tickAnim - 10) / 10) * (4-(44)));
            yy = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 4 + (((tickAnim - 20) / 20) * (25-(4)));
            yy = 0 + (((tickAnim - 20) / 20) * (5-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0.01-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.01 + (((tickAnim - 23) / 4) * (-0.115-(0.01)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -0.115 + (((tickAnim - 27) / 3) * (-0.875-(-0.115)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 30) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -10.5 + (((tickAnim - 0) / 10) * (-2.5-(-10.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 10) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5.25 + (((tickAnim - 0) / 10) * (20.61536-(5.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.47822-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.34504-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 20.61536 + (((tickAnim - 10) / 8) * (-3.69175-(20.61536)));
            yy = 0.47822 + (((tickAnim - 10) / 8) * (0.91007-(0.47822)));
            zz = 1.34504 + (((tickAnim - 10) / 8) * (0.23432-(1.34504)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -3.69175 + (((tickAnim - 18) / 2) * (14.32835-(-3.69175)));
            yy = 0.91007 + (((tickAnim - 18) / 2) * (2.14352-(0.91007)));
            zz = 0.23432 + (((tickAnim - 18) / 2) * (-2.93821-(0.23432)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 14.32835 + (((tickAnim - 20) / 3) * (9.57835-(14.32835)));
            yy = 2.14352 + (((tickAnim - 20) / 3) * (2.14352-(2.14352)));
            zz = -2.93821 + (((tickAnim - 20) / 3) * (-2.93821-(-2.93821)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 9.57835 + (((tickAnim - 23) / 3) * (3.13046-(9.57835)));
            yy = 2.14352 + (((tickAnim - 23) / 3) * (1.41015-(2.14352)));
            zz = -2.93821 + (((tickAnim - 23) / 3) * (-1.93294-(-2.93821)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 3.13046 + (((tickAnim - 26) / 4) * (-8.77666-(3.13046)));
            yy = 1.41015 + (((tickAnim - 26) / 4) * (1.22487-(1.41015)));
            zz = -1.93294 + (((tickAnim - 26) / 4) * (-1.67898-(-1.93294)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -8.77666 + (((tickAnim - 30) / 10) * (5.25-(-8.77666)));
            yy = 1.22487 + (((tickAnim - 30) / 10) * (0-(1.22487)));
            zz = -1.67898 + (((tickAnim - 30) / 10) * (0-(-1.67898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 20) / 3) * (0.58-(0.375)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.58 + (((tickAnim - 23) / 7) * (0.43-(0.58)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0.43 + (((tickAnim - 30) / 4) * (0.575-(0.43)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.575 + (((tickAnim - 34) / 6) * (0-(0.575)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGigantspinosaurus entity = (EntityPrehistoricFloraGigantspinosaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 0) / 8) * (14.88821-(-17.5)));
            yy = -5 + (((tickAnim - 0) / 8) * (-1.57138-(-5)));
            zz = -5 + (((tickAnim - 0) / 8) * (-3.89411-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 14.88821 + (((tickAnim - 8) / 4) * (-31.22912-(14.88821)));
            yy = -1.57138 + (((tickAnim - 8) / 4) * (0.11634-(-1.57138)));
            zz = -3.89411 + (((tickAnim - 8) / 4) * (0.46493-(-3.89411)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -31.22912 + (((tickAnim - 12) / 3) * (-17.5-(-31.22912)));
            yy = 0.11634 + (((tickAnim - 12) / 3) * (-5-(0.11634)));
            zz = 0.46493 + (((tickAnim - 12) / 3) * (-5-(0.46493)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 1) * (-0.275-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 1) / 1) * (-0.14-(-0.275)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.14 + (((tickAnim - 2) / 1) * (-0.275-(-0.14)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 1) * (-0.35-(-0.275)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 4) / 1) * (-0.6-(-0.35)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.6 + (((tickAnim - 5) / 3) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-10))*3), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 0) / 8) * (24.85041-(4)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.69453-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.99133-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24.85041 + (((tickAnim - 8) / 4) * (44-(24.85041)));
            yy = 0.69453 + (((tickAnim - 8) / 4) * (2.5-(0.69453)));
            zz = 1.99133 + (((tickAnim - 8) / 4) * (2.5-(1.99133)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 44 + (((tickAnim - 12) / 3) * (4-(44)));
            yy = 2.5 + (((tickAnim - 12) / 3) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 12) / 3) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.01-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 1) / 2) * (-0.115-(0.01)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.115 + (((tickAnim - 3) / 1) * (-0.875-(-0.115)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.875 + (((tickAnim - 4) / 4) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.05623 + (((tickAnim - 0) / 1) * (8.26273-(14.05623)));
            yy = 1.14032 + (((tickAnim - 0) / 1) * (1.34323-(1.14032)));
            zz = 5.00201 + (((tickAnim - 0) / 1) * (3.56824-(5.00201)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 8.26273 + (((tickAnim - 1) / 2) * (-8.77666-(8.26273)));
            yy = 1.34323 + (((tickAnim - 1) / 2) * (1.22487-(1.34323)));
            zz = 3.56824 + (((tickAnim - 1) / 2) * (-1.67898-(3.56824)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -8.77666 + (((tickAnim - 3) / 4) * (5.25-(-8.77666)));
            yy = 1.22487 + (((tickAnim - 3) / 4) * (0-(1.22487)));
            zz = -1.67898 + (((tickAnim - 3) / 4) * (0-(-1.67898)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5.25 + (((tickAnim - 7) / 1) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 5.25 + (((tickAnim - 8) / 4) * (20.61536-(5.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.47822-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (1.34504-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 20.61536 + (((tickAnim - 12) / 3) * (14.05623-(20.61536)));
            yy = 0.47822 + (((tickAnim - 12) / 3) * (1.14032-(0.47822)));
            zz = 1.34504 + (((tickAnim - 12) / 3) * (5.00201-(1.34504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.255 + (((tickAnim - 0) / 7) * (0-(0.255)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.255-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+10))*-3), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 0) / 2) * (25.83333-(15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25.83333 + (((tickAnim - 2) / 1) * (27.5-(25.83333)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (32.5-(27.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (10-(0)));
            zz = -5 + (((tickAnim - 3) / 2) * (-10-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 5) / 3) * (-17.5-(32.5)));
            yy = 10 + (((tickAnim - 5) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 5) / 3) * (-15-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (-25-(-17.5)));
            yy = 10 + (((tickAnim - 8) / 2) * (5-(10)));
            zz = -15 + (((tickAnim - 8) / 2) * (-10-(-15)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -25 + (((tickAnim - 10) / 1) * (-12.5-(-25)));
            yy = 5 + (((tickAnim - 10) / 1) * (3.33333-(5)));
            zz = -10 + (((tickAnim - 10) / 1) * (-8.33333-(-10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.5 + (((tickAnim - 11) / 2) * (-2.5-(-12.5)));
            yy = 3.33333 + (((tickAnim - 11) / 2) * (0-(3.33333)));
            zz = -8.33333 + (((tickAnim - 11) / 2) * (-5-(-8.33333)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 13) / 2) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 13) / 2) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 1) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.4)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 11) / 1) * (-0.28-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 12) / 1) * (-0.5-(-0.28)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 0) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 13) / 2) * (0-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 3) * (0-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (-60.05965-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.4239-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-2.46453-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -60.05965 + (((tickAnim - 5) / 3) * (-32.22845-(-60.05965)));
            yy = -0.4239 + (((tickAnim - 5) / 3) * (-0.36445-(-0.4239)));
            zz = -2.46453 + (((tickAnim - 5) / 3) * (-1.77222-(-2.46453)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.22845 + (((tickAnim - 8) / 2) * (0.04703-(-32.22845)));
            yy = -0.36445 + (((tickAnim - 8) / 2) * (-0.55262-(-0.36445)));
            zz = -1.77222 + (((tickAnim - 8) / 2) * (2.71402-(-1.77222)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.04703 + (((tickAnim - 10) / 1) * (-9.96865-(0.04703)));
            yy = -0.55262 + (((tickAnim - 10) / 1) * (-0.36842-(-0.55262)));
            zz = 2.71402 + (((tickAnim - 10) / 1) * (1.80935-(2.71402)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -9.96865 + (((tickAnim - 11) / 2) * (-15-(-9.96865)));
            yy = -0.36842 + (((tickAnim - 11) / 2) * (0-(-0.36842)));
            zz = 1.80935 + (((tickAnim - 11) / 2) * (0-(1.80935)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15 + (((tickAnim - 13) / 2) * (-5-(-15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 0) / 3) * (29.25-(15)));
            yy = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 29.25 + (((tickAnim - 3) / 2) * (33.5-(29.25)));
            yy = 5 + (((tickAnim - 3) / 2) * (0-(5)));
            zz = 5 + (((tickAnim - 3) / 2) * (0-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 33.5 + (((tickAnim - 5) / 3) * (-1.25-(33.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.25 + (((tickAnim - 8) / 2) * (25-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 10) / 3) * (17.5-(25)));
            yy = -2.5 + (((tickAnim - 10) / 3) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 3) * (5-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 13) / 2) * (15-(17.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-10), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-3), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-3));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-3), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*-3), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*5), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-3), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (-22.5-(-17.5)));
            yy = -10 + (((tickAnim - 0) / 3) * (-5-(-10)));
            zz = 15 + (((tickAnim - 0) / 3) * (10-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-2.5-(-22.5)));
            yy = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            zz = 10 + (((tickAnim - 3) / 2) * (5-(10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 3) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 8) / 0) * (25-(15)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 0) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (22.5-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 2) * (5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 10) / 3) * (32.5-(22.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (-10-(0)));
            zz = 5 + (((tickAnim - 10) / 3) * (10-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 13) / 2) * (-17.5-(32.5)));
            yy = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
            zz = 10 + (((tickAnim - 13) / 2) * (15-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 0) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.25)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 3) / 2) * (-0.8-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.8 + (((tickAnim - 5) / 1) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.8)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 6) / 2) * (0.2-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 2) * (0-(0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.22845 + (((tickAnim - 0) / 3) * (-7.45297-(-32.22845)));
            yy = 0.36445 + (((tickAnim - 0) / 3) * (0.55262-(0.36445)));
            zz = 1.77222 + (((tickAnim - 0) / 3) * (-2.71402-(1.77222)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.45297 + (((tickAnim - 3) / 2) * (-15-(-7.45297)));
            yy = 0.55262 + (((tickAnim - 3) / 2) * (0-(0.55262)));
            zz = -2.71402 + (((tickAnim - 3) / 2) * (0-(-2.71402)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 5) / 3) * (0-(-15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 0) * (-3.33333-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -3.33333 + (((tickAnim - 8) / 2) * (0-(-3.33333)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 10) / 3) * (-60.05965-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.4239-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (2.46453-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -60.05965 + (((tickAnim - 13) / 2) * (-32.22845-(-60.05965)));
            yy = 0.4239 + (((tickAnim - 13) / 2) * (0.36445-(0.4239)));
            zz = 2.46453 + (((tickAnim - 13) / 2) * (1.77222-(2.46453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33.5 + (((tickAnim - 0) / 3) * (30-(33.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30 + (((tickAnim - 3) / 2) * (17.5-(30)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 3) / 2) * (-5-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 5) / 3) * (15-(17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 8) / 2) * (16-(15)));
            yy = 0 + (((tickAnim - 8) / 2) * (-5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16 + (((tickAnim - 10) / 3) * (43.75-(16)));
            yy = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
            zz = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 43.75 + (((tickAnim - 13) / 2) * (33.5-(43.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -5 + (((tickAnim - 0) / 8) * (5-(-5)));
            zz = -5 + (((tickAnim - 0) / 8) * (5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 5 + (((tickAnim - 8) / 7) * (-5-(5)));
            zz = 5 + (((tickAnim - 8) / 7) * (-5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlegspike, Leftlegspike.rotateAngleX + (float) Math.toRadians(xx), Leftlegspike.rotateAngleY + (float) Math.toRadians(yy), Leftlegspike.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -5 + (((tickAnim - 0) / 8) * (5-(-5)));
            zz = -5 + (((tickAnim - 0) / 8) * (5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 5 + (((tickAnim - 8) / 7) * (-5-(5)));
            zz = 5 + (((tickAnim - 8) / 7) * (-5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlegspike, Rightlegspike.rotateAngleX + (float) Math.toRadians(xx), Rightlegspike.rotateAngleY + (float) Math.toRadians(yy), Rightlegspike.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -10.5 + (((tickAnim - 8) / 4) * (-2.5-(-10.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 12) / 3) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.93144 + (((tickAnim - 0) / 3) * (-31.22912-(14.93144)));
            yy = 6.36203 + (((tickAnim - 0) / 3) * (0.11634-(6.36203)));
            zz = -2.86231 + (((tickAnim - 0) / 3) * (0.46493-(-2.86231)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -31.22912 + (((tickAnim - 3) / 5) * (-17.5-(-31.22912)));
            yy = 0.11634 + (((tickAnim - 3) / 5) * (5-(0.11634)));
            zz = 0.46493 + (((tickAnim - 3) / 5) * (5-(0.46493)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -17.5 + (((tickAnim - 8) / 7) * (14.93144-(-17.5)));
            yy = 5 + (((tickAnim - 8) / 7) * (6.36203-(5)));
            zz = 5 + (((tickAnim - 8) / 7) * (-2.86231-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -0.9 + (((tickAnim - 8) / 0) * (-0.275-(-0.9)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 8) / 1) * (-0.14-(-0.275)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.14 + (((tickAnim - 9) / 1) * (-0.275-(-0.14)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 2) * (-0.35-(-0.275)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 12) / 1) * (-0.6-(-0.35)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 13) / 2) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (44-(25)));
            yy = 5 + (((tickAnim - 0) / 3) * (2.5-(5)));
            zz = 5 + (((tickAnim - 0) / 3) * (2.5-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 44 + (((tickAnim - 3) / 5) * (4-(44)));
            yy = 2.5 + (((tickAnim - 3) / 5) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 3) / 5) * (0-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4 + (((tickAnim - 8) / 7) * (25-(4)));
            yy = 0 + (((tickAnim - 8) / 7) * (5-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0.01-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 8) / 2) * (-0.115-(0.01)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.115 + (((tickAnim - 10) / 2) * (-0.875-(-0.115)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.875 + (((tickAnim - 12) / 3) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.5 + (((tickAnim - 0) / 3) * (-2.5-(-10.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 3) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5.25 + (((tickAnim - 0) / 3) * (20.61536-(5.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.47822-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.34504-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 20.61536 + (((tickAnim - 3) / 4) * (-3.69175-(20.61536)));
            yy = 0.47822 + (((tickAnim - 3) / 4) * (0.91007-(0.47822)));
            zz = 1.34504 + (((tickAnim - 3) / 4) * (0.23432-(1.34504)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -3.69175 + (((tickAnim - 7) / 1) * (14.32835-(-3.69175)));
            yy = 0.91007 + (((tickAnim - 7) / 1) * (2.14352-(0.91007)));
            zz = 0.23432 + (((tickAnim - 7) / 1) * (-2.93821-(0.23432)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 14.32835 + (((tickAnim - 8) / 0) * (9.57835-(14.32835)));
            yy = 2.14352 + (((tickAnim - 8) / 0) * (2.14352-(2.14352)));
            zz = -2.93821 + (((tickAnim - 8) / 0) * (-2.93821-(-2.93821)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.57835 + (((tickAnim - 8) / 1) * (3.13046-(9.57835)));
            yy = 2.14352 + (((tickAnim - 8) / 1) * (1.41015-(2.14352)));
            zz = -2.93821 + (((tickAnim - 8) / 1) * (-1.93294-(-2.93821)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 3.13046 + (((tickAnim - 9) / 3) * (-8.77666-(3.13046)));
            yy = 1.41015 + (((tickAnim - 9) / 3) * (1.22487-(1.41015)));
            zz = -1.93294 + (((tickAnim - 9) / 3) * (-1.67898-(-1.93294)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.77666 + (((tickAnim - 12) / 3) * (5.25-(-8.77666)));
            yy = 1.22487 + (((tickAnim - 12) / 3) * (0-(1.22487)));
            zz = -1.67898 + (((tickAnim - 12) / 3) * (0-(-1.67898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 0) * (0.58-(0.375)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.58 + (((tickAnim - 8) / 7) * (0-(0.58)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);

    }

   

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGigantspinosaurus e = (EntityPrehistoricFloraGigantspinosaurus) entity;
        animator.update(entity);


    }
}
