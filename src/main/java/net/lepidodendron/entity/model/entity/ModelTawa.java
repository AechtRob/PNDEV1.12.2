package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTawa;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTawa extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelTawa() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 10.0F, 4.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1047F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 21, -2.5F, -3.4F, -1.6F, 5, 6, 5, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.0F, 0.3F, 0.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4363F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 50, 78, -1.5F, -1.4F, -1.7F, 3, 7, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.3F, -1.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0472F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 19, 32, -1.0F, 0.0F, -0.4F, 2, 8, 2, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 19, 32, -1.0F, 0.0F, 0.1F, 2, 8, 2, -0.003F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.8F, 1.3F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7243F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 0, -1.0F, 0.0F, -1.7F, 2, 4, 2, -0.004F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.6F, -0.1F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1309F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 14, -1.5F, -0.5434F, -4.3627F, 3, 1, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.0F, 0.3F, 0.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4363F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 50, 78, -1.5F, -1.4F, -1.7F, 3, 7, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.3F, -1.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0472F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 19, 32, -1.0F, 0.0F, -0.4F, 2, 8, 2, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 19, 32, -1.0F, 0.0F, 0.1F, 2, 8, 2, -0.003F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.8F, 1.3F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7243F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 0, -1.0F, 0.0F, -1.7F, 2, 4, 2, -0.004F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.6F, -0.1F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1309F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 14, -1.5F, -0.5434F, -4.3627F, 3, 1, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.hips.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.3F, -7.7F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 58, -0.5F, -0.1435F, -0.0242F, 1, 1, 8, 0.005F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.8F, -4.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 37, -2.5F, -3.1F, -3.4F, 5, 7, 8, 0.005F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.7188F, -1.1401F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 0, -0.5F, -0.5F, -1.5F, 1, 2, 3, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.5F, -1.5F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 71, 0, -2.0F, -2.7F, -2.0F, 4, 6, 5, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.8F, 3.7F, -1.5F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.683F, 0.2926F, -0.1931F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 44, 45, 0.0F, -0.9F, -0.6F, 1, 2, 4, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, -0.3F, 3.3F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.356F, -0.1321F, 0.1946F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 40, 0.0F, -0.1156F, -0.1383F, 1, 1, 4, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.0F, 0.4F, 3.9F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1787F, -0.2148F, -0.0385F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 32, -1.0F, -1.1F, -0.1F, 1, 2, 5, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.8F, 3.7F, -1.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.683F, -0.2926F, 0.1931F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 44, 45, -1.0F, -0.9F, -0.6F, 1, 2, 4, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, -0.3F, 3.3F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.356F, 0.1321F, -0.1946F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 40, -1.0F, -0.1156F, -0.1383F, 1, 1, 4, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.0F, 0.4F, 3.9F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1787F, 0.2148F, 0.0385F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 32, 0.0F, -1.1F, -0.1F, 1, 2, 5, 0.0F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2F, -2.7F);
        this.chest.addChild(neck3);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.7F, -1.3F);
        this.neck3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 32, -0.5F, -2.7F, -2.3F, 1, 1, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 78, 53, -1.5F, -1.9F, -2.3F, 3, 4, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.8F, -3.3F);
        this.neck3.addChild(neck2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6109F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 13, -0.5F, -1.7F, -3.0F, 1, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 12, -1.0F, -1.0F, -3.0F, 2, 3, 5, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.6F, -2.9F);
        this.neck2.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 49, -1.0F, -0.9F, -3.0F, 2, 3, 3, -0.007F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 55, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.8277F, -1.3998F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4014F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 32, -0.001F, 0.1F, -1.4F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 2.7176F, 0.0397F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3578F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 91, -1.0F, -1.9528F, -2.7892F, 1, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.2F, -3.7F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4538F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 14, 0.1F, 0.2766F, -2.9926F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 14, 0.9F, 0.2766F, -2.9926F, 0, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 49, 0.0F, -0.0234F, -2.9926F, 1, 1, 3, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.8F, -1.8F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2967F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 8, -0.8F, 0.5948F, -2.285F, 1, 1, 2, -0.009F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 8, -0.2F, 0.5948F, -2.285F, 1, 1, 2, -0.003F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 4, -0.5F, -0.0052F, -1.985F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.4F, 0.1F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1047F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 6, -1.0F, -0.7F, -1.9F, 2, 1, 1, 0.005F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 21, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.5048F, -1.8792F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0698F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 56, -1.0F, -0.9518F, -0.1223F, 2, 1, 2, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.4F, -4.8F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 0, -0.7F, -0.7F, 0.6F, 0, 1, 3, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 26, -0.8F, -1.0F, -0.1F, 1, 1, 3, -0.007F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 0, -0.7F, -0.5F, -0.8F, 0, 1, 3, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 0, 0.7F, -0.5F, -0.8F, 0, 1, 3, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 0, 0.7F, -0.7F, 0.6F, 0, 1, 3, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 26, -0.2F, -1.0F, -0.1F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0087F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 52, -1.0F, 0.0F, -1.9F, 2, 1, 2, -0.004F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 31, 13, -1.0F, -0.9F, -1.9F, 2, 1, 2, -0.03F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 15, 49, -0.2F, 0.0F, -4.8F, 1, 1, 3, -0.004F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 15, 49, -0.8F, 0.0F, -4.8F, 1, 1, 3, -0.007F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 0, -0.5F, 0.0F, -6.0F, 1, 1, 2, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 0, 0.3F, -0.5F, -6.0F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 0, -0.3F, -0.5F, -6.0F, 0, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.3F, -0.3F, -4.8F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 0, -0.3F, 0.0F, 0.1F, 0, 1, 3, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 0, 0.9F, 0.0F, 0.1F, 0, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.01F, 1.3249F, -1.2627F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.8727F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 14, 0.0F, -0.3F, -0.5F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.6F, -0.6F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0087F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 79, -0.5F, -1.9966F, -0.0616F, 1, 2, 1, -0.008F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.0F, -1.9F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.8901F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 92, -0.5F, -2.0F, 0.0F, 1, 2, 2, -0.004F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2F, 2.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1134F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 40, 65, -2.0F, -1.5F, -1.0F, 4, 4, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.3F, 6.9F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.192F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 76, -1.0F, -0.7047F, -7.0229F, 2, 2, 7, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 33, 78, -0.5F, -2.0007F, -6.9209F, 1, 3, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 62, 56, -1.5F, -1.4F, -1.0F, 3, 3, 9, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 2.9222F, 7.9282F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0524F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 68, -1.0F, -1.9662F, -8.182F, 2, 2, 8, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -2.7599F, 0.0834F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0175F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 65, 69, -1.0F, -0.248F, -0.0376F, 2, 2, 8, 0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.9F, 8.1F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 24, 0, -0.5F, -2.1F, -7.9F, 1, 4, 8, 0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 4.6F, 6.6F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.192F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -0.5F, -3.9F, -8.9F, 1, 4, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0698F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 50, 21, -1.0F, -1.4F, -1.0F, 2, 2, 12, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 45, -2.5F, -0.8F, -0.5F, 5, 1, 11, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 49, -0.5F, -0.3F, -1.0F, 1, 4, 12, -0.006F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 58, 0.0F, -0.3F, -1.0F, 0, 5, 12, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -2.3F, 11.0F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0175F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 44, 47, -1.0F, -1.0F, -11.3F, 2, 6, 11, -0.004F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 0, -0.5F, -3.0F, -11.3F, 1, 4, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.8F, 10.8F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 32, -1.0F, -0.566F, -0.2745F, 2, 2, 14, -0.003F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 0, -3.0F, 0.034F, -0.2745F, 6, 1, 19, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -4.466F, -0.2745F, 1, 10, 21, -0.003F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 29, 21, -1.0F, -2.466F, -0.2745F, 2, 7, 16, -0.007F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.0F;
        this.hips.offsetX = 0.3F;
        this.hips.rotateAngleY = (float)Math.toRadians(225);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.63F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.hips.rotateAngleY = (float) Math.toRadians(90);
        this.hips.offsetY = -0.054F;
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraTawa EntityTawa = (EntityPrehistoricFloraTawa) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck3, this.neck2, this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityTawa.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityTawa.getAnimation() == EntityTawa.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityTawa.isReallyInWater()) {

                if (f3 == 0.0F || !EntityTawa.getIsMoving()) {
                    if (EntityTawa.getAnimation() != EntityTawa.EAT_ANIMATION
                        && EntityTawa.getAnimation() != EntityTawa.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityTawa.getIsFast()) { //Running


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
        EntityPrehistoricFloraTawa ee = (EntityPrehistoricFloraTawa) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
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
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) { //The graze anim
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The noise anim
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTawa entity = (EntityPrehistoricFloraTawa) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 17.75 + (((tickAnim - 40) / 15) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 17.75 + (((tickAnim - 55) / 25) * (0-(17.75)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-3.65-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = -3.65 + (((tickAnim - 40) / 15) * (-3.65-(-3.65)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = -3.65 + (((tickAnim - 55) / 25) * (0-(-3.65)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -29.5 + (((tickAnim - 40) / 15) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -29.5 + (((tickAnim - 55) / 25) * (0-(-29.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 31.5 + (((tickAnim - 40) / 15) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 31.5 + (((tickAnim - 55) / 25) * (0-(31.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -38.5 + (((tickAnim - 40) / 15) * (-38.5-(-38.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -38.5 + (((tickAnim - 55) / 25) * (0-(-38.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 19 + (((tickAnim - 40) / 15) * (19-(19)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 19 + (((tickAnim - 55) / 25) * (0-(19)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -29.5 + (((tickAnim - 40) / 15) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -29.5 + (((tickAnim - 55) / 25) * (0-(-29.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 31.5 + (((tickAnim - 40) / 15) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 31.5 + (((tickAnim - 55) / 25) * (0-(31.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -38.5 + (((tickAnim - 40) / 15) * (-38.5-(-38.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -38.5 + (((tickAnim - 55) / 25) * (0-(-38.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 19 + (((tickAnim - 40) / 15) * (19-(19)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 19 + (((tickAnim - 55) / 25) * (0-(19)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -8.75 + (((tickAnim - 40) / 15) * (-11.25-(-8.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*1 + (((tickAnim - 40) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*1)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -11.25 + (((tickAnim - 55) / 25) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*1 + (((tickAnim - 55) / 25) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -13.5 + (((tickAnim - 40) / 15) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -13.5 + (((tickAnim - 55) / 25) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-26.99502-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-8.4267-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-55.83523-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -26.99502 + (((tickAnim - 40) / 15) * (-26.99502-(-26.99502)));
            yy = -8.4267 + (((tickAnim - 40) / 15) * (-8.4267-(-8.4267)));
            zz = -55.83523 + (((tickAnim - 40) / 15) * (-55.83523-(-55.83523)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -26.99502 + (((tickAnim - 55) / 25) * (0-(-26.99502)));
            yy = -8.4267 + (((tickAnim - 55) / 25) * (0-(-8.4267)));
            zz = -55.83523 + (((tickAnim - 55) / 25) * (0-(-55.83523)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.27555-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (4.64901-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-13.53334-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 6.27555 + (((tickAnim - 40) / 15) * (6.27555-(6.27555)));
            yy = 4.64901 + (((tickAnim - 40) / 15) * (4.64901-(4.64901)));
            zz = -13.53334 + (((tickAnim - 40) / 15) * (-13.53334-(-13.53334)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 6.27555 + (((tickAnim - 55) / 25) * (0-(6.27555)));
            yy = 4.64901 + (((tickAnim - 55) / 25) * (0-(4.64901)));
            zz = -13.53334 + (((tickAnim - 55) / 25) * (0-(-13.53334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-26.99502-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (8.4267-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (55.83523-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -26.99502 + (((tickAnim - 40) / 15) * (-26.99502-(-26.99502)));
            yy = 8.4267 + (((tickAnim - 40) / 15) * (8.4267-(8.4267)));
            zz = 55.83523 + (((tickAnim - 40) / 15) * (55.83523-(55.83523)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -26.99502 + (((tickAnim - 55) / 25) * (0-(-26.99502)));
            yy = 8.4267 + (((tickAnim - 55) / 25) * (0-(8.4267)));
            zz = 55.83523 + (((tickAnim - 55) / 25) * (0-(55.83523)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.27555-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (4.64901-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (13.53334-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 6.27555 + (((tickAnim - 40) / 15) * (6.27555-(6.27555)));
            yy = 4.64901 + (((tickAnim - 40) / 15) * (4.64901-(4.64901)));
            zz = 13.53334 + (((tickAnim - 40) / 15) * (13.53334-(13.53334)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 6.27555 + (((tickAnim - 55) / 25) * (0-(6.27555)));
            yy = 4.64901 + (((tickAnim - 55) / 25) * (0-(4.64901)));
            zz = 13.53334 + (((tickAnim - 55) / 25) * (0-(13.53334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*6-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -9.25 + (((tickAnim - 40) / 15) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*6 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*6)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -9.25 + (((tickAnim - 55) / 25) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*6 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*8-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -10 + (((tickAnim - 40) / 15) * (-10-(-10)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*8 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*8)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -10 + (((tickAnim - 55) / 25) * (0-(-10)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*8 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.375-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0.375 + (((tickAnim - 40) / 15) * (0.375-(0.375)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0.375 + (((tickAnim - 55) / 25) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-180))*8-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -17 + (((tickAnim - 40) / 15) * (-32-(-17)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-180))*8 + (((tickAnim - 40) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-180))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-180))*8)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = -32 + (((tickAnim - 55) / 13) * (10.5-(-32)));
            yy = 0 + (((tickAnim - 55) / 13) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-180))*8 + (((tickAnim - 55) / 13) * (-2.82843-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-180))*8)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 10.5 + (((tickAnim - 68) / 12) * (0-(10.5)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = -2.82843 + (((tickAnim - 68) / 12) * (0-(-2.82843)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = -19.5 + (((tickAnim - 55) / 13) * (-0.25-(-19.5)));
            yy = 0 + (((tickAnim - 55) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 13) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -0.25 + (((tickAnim - 68) / 12) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (28.75-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 28.75 + (((tickAnim - 55) / 13) * (0-(28.75)));
            yy = 0 + (((tickAnim - 55) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 13) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*6-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*6-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*6-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*6 + (((tickAnim - 40) / 15) * (11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*15-(11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*6 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*6 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*6)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*15 + (((tickAnim - 55) / 25) * (0-(11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*6 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+50))*6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*6 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+100))*6-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*6-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*10 + (((tickAnim - 40) / 15) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*10-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+100))*6 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+100))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+100))*6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*6 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*6)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*10 + (((tickAnim - 55) / 25) * (0-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+100))*6 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+100))*6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*6 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+200))*-10-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*6-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-20 + (((tickAnim - 40) / 15) * (15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-30-(15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+200))*-10 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+200))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+200))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*6 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*6)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-30 + (((tickAnim - 55) / 25) * (0-(15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-30)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+200))*-10 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+200))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*6 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-30-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+280))*20-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*20-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-30 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-40-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-30)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+280))*20 + (((tickAnim - 40) / 15) * (2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+280))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+280))*20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*20 + (((tickAnim - 40) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*20)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-40 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-40)));
            yy = 2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+280))*20 + (((tickAnim - 55) / 25) * (0-(2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+280))*20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*20 + (((tickAnim - 55) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-100))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTawa entity = (EntityPrehistoricFloraTawa) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+50))*6-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 2) / 11) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+50))*6 + (((tickAnim - 2) / 11) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+50))*6)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -13.5 + (((tickAnim - 13) / 12) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+100))*7-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 2) / 11) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+100))*7 + (((tickAnim - 2) / 11) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+100))*7)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -0.5 + (((tickAnim - 13) / 12) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+150))*8-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 2) / 11) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+150))*8 + (((tickAnim - 2) / 11) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+150))*8)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 13) / 12) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+250))*5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 2) / 11) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+250))*5 + (((tickAnim - 2) / 11) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1260+250))*5)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -19.5 + (((tickAnim - 13) / 12) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 11) * (0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0.1 + (((tickAnim - 13) / 12) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (22.75-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 22.75 + (((tickAnim - 13) / 12) * (0-(22.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTawa entity = (EntityPrehistoricFloraTawa) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 15) / 25) * (-15-(-15)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -15 + (((tickAnim - 40) / 5) * (14.5-(-15)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 45) / 5) * (0-(14.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.375-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = -5.55 + (((tickAnim - 15) / 25) * (-5.55-(-5.55)));
            zz = 2.375 + (((tickAnim - 15) / 25) * (2.375-(2.375)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -5.55 + (((tickAnim - 40) / 5) * (-2.77-(-5.55)));
            zz = 2.375 + (((tickAnim - 40) / 5) * (0.64-(2.375)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = -2.77 + (((tickAnim - 45) / 5) * (0-(-2.77)));
            zz = 0.64 + (((tickAnim - 45) / 5) * (0-(0.64)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -23 + (((tickAnim - 15) / 25) * (-23-(-23)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -23 + (((tickAnim - 40) / 5) * (-27-(-23)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -27 + (((tickAnim - 45) / 5) * (0-(-27)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 28.5 + (((tickAnim - 15) / 25) * (28.5-(28.5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 28.5 + (((tickAnim - 40) / 10) * (0-(28.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-72.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -72.25 + (((tickAnim - 15) / 25) * (-72.25-(-72.25)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -72.25 + (((tickAnim - 40) / 10) * (0-(-72.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (81.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 81.5 + (((tickAnim - 15) / 25) * (81.5-(81.5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 81.5 + (((tickAnim - 40) / 5) * (35-(81.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 35 + (((tickAnim - 45) / 5) * (0-(35)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.45-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 7) / 8) * (0-(0.525)));
            zz = -0.45 + (((tickAnim - 7) / 8) * (0-(-0.45)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (-0.45-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 45) / 5) * (0-(0.525)));
            zz = -0.45 + (((tickAnim - 45) / 5) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -23 + (((tickAnim - 15) / 25) * (-23-(-23)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -23 + (((tickAnim - 40) / 5) * (-27-(-23)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -27 + (((tickAnim - 45) / 5) * (0-(-27)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 28.5 + (((tickAnim - 15) / 25) * (28.5-(28.5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 28.5 + (((tickAnim - 40) / 10) * (0-(28.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-72.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -72.25 + (((tickAnim - 15) / 25) * (-72.25-(-72.25)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -72.25 + (((tickAnim - 40) / 10) * (0-(-72.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (81.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 81.5 + (((tickAnim - 15) / 25) * (81.5-(81.5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 81.5 + (((tickAnim - 40) / 5) * (35-(81.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 35 + (((tickAnim - 45) / 5) * (0-(35)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.45-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 7) / 8) * (0-(0.525)));
            zz = -0.45 + (((tickAnim - 7) / 8) * (0-(-0.45)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (-0.45-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 45) / 5) * (0-(0.525)));
            zz = -0.45 + (((tickAnim - 45) / 5) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 5.75 + (((tickAnim - 15) / 25) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 5.75 + (((tickAnim - 40) / 5) * (-2.12-(5.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -2.12 + (((tickAnim - 45) / 5) * (0-(-2.12)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 7.75 + (((tickAnim - 15) / 25) * (0-(7.75)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (-13.89-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -13.89 + (((tickAnim - 45) / 5) * (0-(-13.89)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.02619-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.65495-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-19.34452-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 6.02619 + (((tickAnim - 15) / 25) * (6.02619-(6.02619)));
            yy = -11.65495 + (((tickAnim - 15) / 25) * (-11.65495-(-11.65495)));
            zz = -19.34452 + (((tickAnim - 15) / 25) * (-19.34452-(-19.34452)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.02619 + (((tickAnim - 40) / 10) * (0-(6.02619)));
            yy = -11.65495 + (((tickAnim - 40) / 10) * (0-(-11.65495)));
            zz = -19.34452 + (((tickAnim - 40) / 10) * (0-(-19.34452)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -23.5 + (((tickAnim - 15) / 25) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 40) / 10) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-40.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = -40.5 + (((tickAnim - 15) / 25) * (-40.5-(-40.5)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -40.5 + (((tickAnim - 40) / 5) * (-70-(-40.5)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = -70 + (((tickAnim - 45) / 5) * (0-(-70)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.02619-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (11.65495-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (19.34452-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 6.02619 + (((tickAnim - 15) / 25) * (6.02619-(6.02619)));
            yy = 11.65495 + (((tickAnim - 15) / 25) * (11.65495-(11.65495)));
            zz = 19.34452 + (((tickAnim - 15) / 25) * (19.34452-(19.34452)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.02619 + (((tickAnim - 40) / 10) * (0-(6.02619)));
            yy = 11.65495 + (((tickAnim - 40) / 10) * (0-(11.65495)));
            zz = 19.34452 + (((tickAnim - 40) / 10) * (0-(19.34452)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -23.5 + (((tickAnim - 15) / 25) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 40) / 10) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (40.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 40.5 + (((tickAnim - 15) / 25) * (40.5-(40.5)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 40.5 + (((tickAnim - 40) / 5) * (63.25-(40.5)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 63.25 + (((tickAnim - 45) / 5) * (0-(63.25)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 40) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (-19-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 45) / 5) * (0-(-19)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -4.5 + (((tickAnim - 15) / 25) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -4.5 + (((tickAnim - 40) / 5) * (1.25-(-4.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 45) / 5) * (0-(1.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-11.47-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -11.47 + (((tickAnim - 7) / 8) * (-5-(-11.47)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 15) / 25) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5 + (((tickAnim - 40) / 5) * (-11.5-(-5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 45) / 5) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.56526-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.60536-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (1.59725-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -1.56526 + (((tickAnim - 7) / 8) * (20.75-(-1.56526)));
            yy = -1.60536 + (((tickAnim - 7) / 8) * (0-(-1.60536)));
            zz = 1.59725 + (((tickAnim - 7) / 8) * (0-(1.59725)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 20.75 + (((tickAnim - 15) / 25) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 20.75 + (((tickAnim - 40) / 5) * (-5.87-(20.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -5.87 + (((tickAnim - 45) / 5) * (0-(-5.87)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.79-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 2.79 + (((tickAnim - 3) / 4) * (27.58-(2.79)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 27.58 + (((tickAnim - 7) / 8) * (16.5-(27.58)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 16.5 + (((tickAnim - 15) / 25) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 16.5 + (((tickAnim - 40) / 5) * (-5.5-(16.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 45) / 5) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTawa entity = (EntityPrehistoricFloraTawa) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 30) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 38.75 + (((tickAnim - 10) / 10) * (-18.75-(38.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -18.75 + (((tickAnim - 20) / 10) * (38.75-(-18.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 38.75 + (((tickAnim - 30) / 10) * (-18.75-(38.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 40) / 10) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16 + (((tickAnim - 10) / 3) * (19-(16)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19 + (((tickAnim - 13) / 7) * (-19-(19)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -19 + (((tickAnim - 20) / 4) * (6.83-(-19)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 6.83 + (((tickAnim - 24) / 6) * (16-(6.83)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 16 + (((tickAnim - 30) / 3) * (19-(16)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 19 + (((tickAnim - 33) / 7) * (-19-(19)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 40) / 10) * (0-(-19)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -8.5 + (((tickAnim - 10) / 5) * (-51-(-8.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -51 + (((tickAnim - 15) / 2) * (-51-(-51)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -51 + (((tickAnim - 17) / 3) * (0-(-51)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 30) / 5) * (-51-(-8.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -51 + (((tickAnim - 35) / 2) * (-51-(-51)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -51 + (((tickAnim - 37) / 3) * (0-(-51)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
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
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10.31-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -10.31 + (((tickAnim - 3) / 7) * (90.75-(-10.31)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 90.75 + (((tickAnim - 10) / 5) * (104.43937-(90.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.49527-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-2.62499-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 104.43937 + (((tickAnim - 15) / 5) * (37.12875-(104.43937)));
            yy = -0.49527 + (((tickAnim - 15) / 5) * (-0.99054-(-0.49527)));
            zz = -2.62499 + (((tickAnim - 15) / 5) * (-5.24997-(-2.62499)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 37.12875 + (((tickAnim - 20) / 4) * (-10.31-(37.12875)));
            yy = -0.99054 + (((tickAnim - 20) / 4) * (0-(-0.99054)));
            zz = -5.24997 + (((tickAnim - 20) / 4) * (0-(-5.24997)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -10.31 + (((tickAnim - 24) / 6) * (90.75-(-10.31)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 90.75 + (((tickAnim - 30) / 5) * (104.43937-(90.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (-0.49527-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-2.62499-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 104.43937 + (((tickAnim - 35) / 5) * (37.12875-(104.43937)));
            yy = -0.49527 + (((tickAnim - 35) / 5) * (-0.99054-(-0.49527)));
            zz = -2.62499 + (((tickAnim - 35) / 5) * (-5.24997-(-2.62499)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 37.12875 + (((tickAnim - 40) / 10) * (0-(37.12875)));
            yy = -0.99054 + (((tickAnim - 40) / 10) * (0-(-0.99054)));
            zz = -5.24997 + (((tickAnim - 40) / 10) * (0-(-5.24997)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.14-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = -0.875 + (((tickAnim - 3) / 7) * (0-(-0.875)));
            zz = -0.14 + (((tickAnim - 3) / 7) * (-0.575-(-0.14)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (1.455-(0)));
            zz = -0.575 + (((tickAnim - 10) / 5) * (-0.89-(-0.575)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.455 + (((tickAnim - 15) / 5) * (-0.25-(1.455)));
            zz = -0.89 + (((tickAnim - 15) / 5) * (0-(-0.89)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 2) * (0.325-(-0.25)));
            zz = 0 + (((tickAnim - 20) / 2) * (-0.06-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 22) / 2) * (-0.875-(0.325)));
            zz = -0.06 + (((tickAnim - 22) / 2) * (-0.14-(-0.06)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = -0.875 + (((tickAnim - 24) / 6) * (0-(-0.875)));
            zz = -0.14 + (((tickAnim - 24) / 6) * (-0.575-(-0.14)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (1.455-(0)));
            zz = -0.575 + (((tickAnim - 30) / 5) * (-0.89-(-0.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 1.455 + (((tickAnim - 35) / 5) * (-0.25-(1.455)));
            zz = -0.89 + (((tickAnim - 35) / 5) * (0-(-0.89)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 40) / 10) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2 + (((tickAnim - 10) / 10) * (0-(-2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-2-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2 + (((tickAnim - 30) / 10) * (0-(-2)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 10) / 10) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -1.75 + (((tickAnim - 30) / 10) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTawa entity = (EntityPrehistoricFloraTawa) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4.75 + (((tickAnim - 4) / 4) * (11.5-(4.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 11.5 + (((tickAnim - 8) / 4) * (0-(11.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
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
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-1.45-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -1.45 + (((tickAnim - 8) / 4) * (0-(-1.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -17.25 + (((tickAnim - 4) / 4) * (5-(-17.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 8) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.55-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0.55 + (((tickAnim - 4) / 4) * (-0.2-(0.55)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -0.2 + (((tickAnim - 8) / 4) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 4) / 4) * (-38.5-(4)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -38.5 + (((tickAnim - 8) / 4) * (0-(-38.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -6.25 + (((tickAnim - 4) / 4) * (-17.75-(-6.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17.75 + (((tickAnim - 8) / 4) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.5 + (((tickAnim - 4) / 4) * (27.5-(5.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.5 + (((tickAnim - 8) / 3) * (0-(27.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTawa entity = (EntityPrehistoricFloraTawa) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 7) / 8) * (0-(5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 13.5 + (((tickAnim - 7) / 8) * (0-(13.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 22.25 + (((tickAnim - 7) / 8) * (0-(22.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 19.25 + (((tickAnim - 7) / 8) * (0-(19.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -0.225 + (((tickAnim - 7) / 8) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 21 + (((tickAnim - 3) / 4) * (0-(21)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 26.5 + (((tickAnim - 3) / 4) * (0-(26.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTawa entity = (EntityPrehistoricFloraTawa) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-20))*5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-50))*-7), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-50))*-7));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-90))*0.2);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*1.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-120))*1.2);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -31.73846 + (((tickAnim - 0) / 5) * (44.58453-(-31.73846)));
            yy = 1.09347 + (((tickAnim - 0) / 5) * (-7.38542-(1.09347)));
            zz = 0.6445 + (((tickAnim - 0) / 5) * (-1.30962-(0.6445)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 44.58453 + (((tickAnim - 5) / 3) * (0.33875-(44.58453)));
            yy = -7.38542 + (((tickAnim - 5) / 3) * (-9.50312-(-7.38542)));
            zz = -1.30962 + (((tickAnim - 5) / 3) * (0.56408-(-1.30962)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0.33875 + (((tickAnim - 8) / 4) * (-31.73846-(0.33875)));
            yy = -9.50312 + (((tickAnim - 8) / 4) * (1.09347-(-9.50312)));
            zz = 0.56408 + (((tickAnim - 8) / 4) * (0.6445-(0.56408)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -16.5 + (((tickAnim - 0) / 5) * (10.9756-(-16.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.313-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.31864-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 10.9756 + (((tickAnim - 5) / 2) * (26.69686-(10.9756)));
            yy = 0.313 + (((tickAnim - 5) / 2) * (0.22357-(0.313)));
            zz = -0.31864 + (((tickAnim - 5) / 2) * (-0.2276-(-0.31864)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 26.69686 + (((tickAnim - 7) / 5) * (-16.5-(26.69686)));
            yy = 0.22357 + (((tickAnim - 7) / 5) * (0-(0.22357)));
            zz = -0.2276 + (((tickAnim - 7) / 5) * (0-(-0.2276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -7.5 + (((tickAnim - 0) / 1) * (-2.58-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -2.58 + (((tickAnim - 1) / 4) * (-4.75-(-2.58)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.75 + (((tickAnim - 5) / 2) * (-54.29-(-4.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -54.29 + (((tickAnim - 7) / 2) * (-54.29-(-54.29)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -54.29 + (((tickAnim - 9) / 3) * (-7.5-(-54.29)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 67.25 + (((tickAnim - 0) / 1) * (25.4-(67.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 25.4 + (((tickAnim - 1) / 2) * (-0.35-(25.4)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.35 + (((tickAnim - 3) / 2) * (90.75-(-0.35)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 90.75 + (((tickAnim - 5) / 7) * (67.25-(90.75)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 1) * (-0.2-(1.2)));
            zz = -0.575 + (((tickAnim - 0) / 1) * (0-(-0.575)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 1) / 2) * (-0.425-(-0.2)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 3) / 2) * (1.3-(-0.425)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.625-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 1.3 + (((tickAnim - 5) / 7) * (1.2-(1.3)));
            zz = -0.625 + (((tickAnim - 5) / 7) * (-0.575-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 44.58453 + (((tickAnim - 0) / 3) * (5.05617-(44.58453)));
            yy = 7.38542 + (((tickAnim - 0) / 3) * (11.65698-(7.38542)));
            zz = 1.30962 + (((tickAnim - 0) / 3) * (3.41448-(1.30962)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 5.05617 + (((tickAnim - 3) / 3) * (-31.73846-(5.05617)));
            yy = 11.65698 + (((tickAnim - 3) / 3) * (-1.09347-(11.65698)));
            zz = 3.41448 + (((tickAnim - 3) / 3) * (-0.6445-(3.41448)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -31.73846 + (((tickAnim - 6) / 6) * (44.58453-(-31.73846)));
            yy = -1.09347 + (((tickAnim - 6) / 6) * (7.38542-(-1.09347)));
            zz = -0.6445 + (((tickAnim - 6) / 6) * (1.30962-(-0.6445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10.9756 + (((tickAnim - 0) / 2) * (28.44686-(10.9756)));
            yy = 0.313 + (((tickAnim - 0) / 2) * (0.22357-(0.313)));
            zz = -0.31864 + (((tickAnim - 0) / 2) * (-0.2276-(-0.31864)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 28.44686 + (((tickAnim - 2) / 4) * (-18-(28.44686)));
            yy = 0.22357 + (((tickAnim - 2) / 4) * (0-(0.22357)));
            zz = -0.2276 + (((tickAnim - 2) / 4) * (0-(-0.2276)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -18 + (((tickAnim - 6) / 6) * (10.9756-(-18)));
            yy = 0 + (((tickAnim - 6) / 6) * (0.313-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-0.31864-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5 + (((tickAnim - 0) / 2) * (-49.29-(-5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -49.29 + (((tickAnim - 2) / 2) * (-49.29-(-49.29)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -49.29 + (((tickAnim - 4) / 2) * (-7.5-(-49.29)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -7.5 + (((tickAnim - 6) / 1) * (3.61-(-7.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 3.61 + (((tickAnim - 7) / 5) * (-5-(3.61)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 90.75 + (((tickAnim - 0) / 6) * (67.25-(90.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 67.25 + (((tickAnim - 6) / 1) * (31-(67.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 31 + (((tickAnim - 7) / 1) * (3.25-(31)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 3.25 + (((tickAnim - 8) / 4) * (90.75-(3.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 6) * (1.2-(1.3)));
            zz = -0.625 + (((tickAnim - 0) / 6) * (-0.575-(-0.625)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.2 + (((tickAnim - 6) / 1) * (-0.125-(1.2)));
            zz = -0.575 + (((tickAnim - 6) / 1) * (0-(-0.575)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.125 + (((tickAnim - 7) / 1) * (0.45-(-0.125)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 4) * (1.3-(0.45)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.625-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*7), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-60))*7), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-50))*7));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-180))*-7), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(21.25), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-25.75), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(21.25), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-25.75), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-180))*7), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-250))*7), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-13.75), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(5.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-100))*5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-100))*-7), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-100))*7));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*7), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*-7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*7));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-200))*12), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*-17), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*7));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-250))*15), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-250))*-25), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-250))*7));



    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTawa entity = (EntityPrehistoricFloraTawa) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-1);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -21.97796 + (((tickAnim - 0) / 11) * (35-(-21.97796)));
            yy = 1.64535 + (((tickAnim - 0) / 11) * (0-(1.64535)));
            zz = 1.53492 + (((tickAnim - 0) / 11) * (0-(1.53492)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 35 + (((tickAnim - 11) / 5) * (3.75422-(35)));
            yy = 0 + (((tickAnim - 11) / 5) * (-6.76198-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (2.62109-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 3.75422 + (((tickAnim - 16) / 4) * (-21.97796-(3.75422)));
            yy = -6.76198 + (((tickAnim - 16) / 4) * (1.64535-(-6.76198)));
            zz = 2.62109 + (((tickAnim - 16) / 4) * (1.53492-(2.62109)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -13.5 + (((tickAnim - 0) / 11) * (10.9756-(-13.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.313-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.31864-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 10.9756 + (((tickAnim - 11) / 2) * (24.60033-(10.9756)));
            yy = 0.313 + (((tickAnim - 11) / 2) * (0.17073-(0.313)));
            zz = -0.31864 + (((tickAnim - 11) / 2) * (-0.17381-(-0.31864)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 24.60033 + (((tickAnim - 13) / 7) * (-13.5-(24.60033)));
            yy = 0.17073 + (((tickAnim - 13) / 7) * (0-(0.17073)));
            zz = -0.17381 + (((tickAnim - 13) / 7) * (0-(-0.17381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 9 + (((tickAnim - 0) / 11) * (5.25-(9)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5.25 + (((tickAnim - 11) / 4) * (-51.3-(5.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -51.3 + (((tickAnim - 15) / 2) * (-53.95-(-51.3)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -53.95 + (((tickAnim - 17) / 3) * (9-(-53.95)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.75 + (((tickAnim - 0) / 3) * (6.77-(25.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.77 + (((tickAnim - 3) / 3) * (-6.84-(6.77)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -6.84 + (((tickAnim - 6) / 5) * (54-(-6.84)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 54 + (((tickAnim - 11) / 4) * (87.16-(54)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 87.16 + (((tickAnim - 15) / 2) * (89.19-(87.16)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 89.19 + (((tickAnim - 17) / 3) * (25.75-(89.19)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 1) * (1.215-(0.75)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.02-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.215 + (((tickAnim - 1) / 2) * (0.725-(1.215)));
            zz = -0.02 + (((tickAnim - 1) / 2) * (-0.05-(-0.02)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.725 + (((tickAnim - 3) / 3) * (-0.85-(0.725)));
            zz = -0.05 + (((tickAnim - 3) / 3) * (-0.12-(-0.05)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 6) / 5) * (1.55-(-0.85)));
            zz = -0.12 + (((tickAnim - 6) / 5) * (-0.225-(-0.12)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1.55 + (((tickAnim - 11) / 4) * (1.6-(1.55)));
            zz = -0.225 + (((tickAnim - 11) / 4) * (-0.595-(-0.225)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 1.6 + (((tickAnim - 15) / 2) * (1.37-(1.6)));
            zz = -0.595 + (((tickAnim - 15) / 2) * (-0.675-(-0.595)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.37 + (((tickAnim - 17) / 3) * (0.75-(1.37)));
            zz = -0.675 + (((tickAnim - 17) / 3) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 35 + (((tickAnim - 0) / 5) * (3.75422-(35)));
            yy = 0 + (((tickAnim - 0) / 5) * (6.76198-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.62109-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.75422 + (((tickAnim - 5) / 5) * (-21.97796-(3.75422)));
            yy = 6.76198 + (((tickAnim - 5) / 5) * (-1.64535-(6.76198)));
            zz = 2.62109 + (((tickAnim - 5) / 5) * (-1.53492-(2.62109)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.97796 + (((tickAnim - 10) / 10) * (35-(-21.97796)));
            yy = -1.64535 + (((tickAnim - 10) / 10) * (0-(-1.64535)));
            zz = -1.53492 + (((tickAnim - 10) / 10) * (0-(-1.53492)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.9756 + (((tickAnim - 0) / 3) * (24.60033-(10.9756)));
            yy = 0.313 + (((tickAnim - 0) / 3) * (0.17073-(0.313)));
            zz = -0.31864 + (((tickAnim - 0) / 3) * (-0.17381-(-0.31864)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 24.60033 + (((tickAnim - 3) / 7) * (-13.5-(24.60033)));
            yy = 0.17073 + (((tickAnim - 3) / 7) * (0-(0.17073)));
            zz = -0.17381 + (((tickAnim - 3) / 7) * (0-(-0.17381)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.5 + (((tickAnim - 10) / 10) * (10.9756-(-13.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.313-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.31864-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.25 + (((tickAnim - 0) / 4) * (-51.3-(5.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -51.3 + (((tickAnim - 4) / 3) * (-53.95-(-51.3)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -53.95 + (((tickAnim - 7) / 3) * (9-(-53.95)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 10) / 10) * (5.25-(9)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 54 + (((tickAnim - 0) / 4) * (87.16-(54)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 87.16 + (((tickAnim - 4) / 3) * (89.19-(87.16)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 89.19 + (((tickAnim - 7) / 3) * (25.75-(89.19)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25.75 + (((tickAnim - 10) / 3) * (-0.83-(25.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.83 + (((tickAnim - 13) / 3) * (-4.02-(-0.83)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4.02 + (((tickAnim - 16) / 4) * (54-(-4.02)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 4) * (1.6-(1.3)));
            zz = -0.225 + (((tickAnim - 0) / 4) * (-0.595-(-0.225)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.6 + (((tickAnim - 4) / 3) * (1.37-(1.6)));
            zz = -0.595 + (((tickAnim - 4) / 3) * (-0.675-(-0.595)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.37 + (((tickAnim - 7) / 3) * (0.9-(1.37)));
            zz = -0.675 + (((tickAnim - 7) / 3) * (0-(-0.675)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 10) / 1) * (1.415-(0.9)));
            zz = 0 + (((tickAnim - 10) / 1) * (-0.02-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.415 + (((tickAnim - 11) / 2) * (0.045-(1.415)));
            zz = -0.02 + (((tickAnim - 11) / 2) * (-0.07-(-0.02)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.045 + (((tickAnim - 13) / 3) * (-0.775-(0.045)));
            zz = -0.07 + (((tickAnim - 13) / 3) * (-0.13-(-0.07)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.775 + (((tickAnim - 16) / 4) * (1.3-(-0.775)));
            zz = -0.13 + (((tickAnim - 16) / 4) * (-0.225-(-0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-170))*3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+180))*2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*-3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*2));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*2));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*2));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*2));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*2));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+300))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*-2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*-2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+330))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+300))*-8));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTawa e = (EntityPrehistoricFloraTawa) entity;
        animator.update(entity);


    }
}
