package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDracoraptor;
import net.lepidodendron.entity.EntityPrehistoricFloraTrilophosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDracoraptor extends ModelBasePalaeopedia {

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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Feathers;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer thoat;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private ModelAnimator animator;

    public ModelDracoraptor() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 8.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.5F, 1.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 65, -0.5F, -4.2F, -3.6F, 1, 1, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 33, -1.0F, -3.8F, -3.6F, 2, 1, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 52, -2.0F, -3.3F, -3.6F, 4, 6, 6, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.0F, 0.0F, 0.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.48F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 0, -1.5F, -0.3F, -2.0F, 3, 7, 4, 0.004F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.5F, -1.6F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0908F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 37, 66, -1.0F, -0.0196F, -0.4631F, 2, 8, 2, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 28, 65, -1.0F, -0.0196F, 0.1369F, 2, 8, 2, -0.003F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.8F, 1.7F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6109F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 28, 0, -1.0F, -0.1494F, -1.5949F, 2, 4, 2, -0.006F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.1506F, -0.3949F);
        this.leftLeg3.addChild(leftLeg4);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 28, -1.5F, -0.7F, -3.9F, 3, 2, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.0F, 0.0F, 0.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.48F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 0, -1.5F, -0.3F, -2.0F, 3, 7, 4, 0.004F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.5F, -1.6F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0908F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 37, 66, -1.0F, -0.0196F, -0.4631F, 2, 8, 2, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 28, 65, -1.0F, -0.0196F, 0.1369F, 2, 8, 2, -0.003F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.8F, 1.7F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 28, 0, -1.0F, -0.1494F, -1.5949F, 2, 4, 2, -0.006F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.1506F, -0.3949F);
        this.rightLeg3.addChild(rightLeg4);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 28, -1.5F, -0.7F, -3.9F, 3, 2, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -0.7F, 3.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0698F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 56, 44, -1.0F, -1.7803F, -0.2644F, 1, 1, 8, 0.003F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 43, -2.0F, -0.7803F, -1.2644F, 3, 4, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.5F, 0.0197F, 7.7356F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 37, 16, -1.0F, -0.8005F, -1.0218F, 2, 3, 10, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 55, -0.5F, -1.8005F, -0.0218F, 1, 1, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2005F, 8.7782F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0524F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 41, 30, -0.5F, -0.6113F, -0.7689F, 1, 2, 11, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 39, 44, -1.5F, -0.0113F, -0.7689F, 3, 0, 10, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 35, -0.01F, -1.6113F, -0.7689F, 0, 5, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1113F, 9.7311F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2443F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 18, -0.5F, -0.4418F, -0.3455F, 1, 1, 15, -0.003F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -2.5F, 0.0582F, -0.3455F, 5, 0, 17, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 18, 0.0F, -2.4418F, -0.3455F, 0, 6, 18, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -2.1F);
        this.hips.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.7083F, -8.5458F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 21, -0.5F, -0.023F, 0.0515F, 1, 2, 9, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 7, -1.5F, 0.377F, 0.0515F, 3, 2, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.9F, -3.9F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -2.5F, -3.0F, -5.0F, 5, 6, 9, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.6F, -8.3F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.1F, 0.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2356F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 64, -3.0F, -3.7F, -0.7F, 6, 6, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 57, -3.0F, -3.7F, -3.7F, 6, 6, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.5427F, -4.2132F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5934F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 75, -3.0F, -2.0094F, 0.0333F, 6, 2, 3, 0.005F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.1F, -1.1F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 18, -2.0F, -2.5F, -2.6F, 4, 5, 4, 0.0F, false));

        this.Feathers = new AdvancedModelRenderer(this);
        this.Feathers.setRotationPoint(0.0F, -2.3F, -2.6F);
        this.chest.addChild(Feathers);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Feathers.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 75, -3.0F, -0.0285F, -0.1447F, 6, 2, 3, 0.005F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.2F, 4.0F, -1.9F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.7472F, 0.1611F, -0.0674F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 48, 0, -0.5887F, -0.9728F, -0.2471F, 1, 2, 4, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5887F, -0.6728F, 3.5529F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.1345F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 43, 0.0F, -0.2F, 0.1F, 1, 1, 3, -0.003F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.9F, 0.0F, 3.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.2182F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 37, 18, -0.9F, -0.7F, 0.1F, 1, 2, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.2F, 4.0F, -1.9F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.7472F, -0.1611F, 0.0674F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 48, 0, -0.4113F, -0.9728F, -0.2471F, 1, 2, 4, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5887F, -0.6728F, 3.5529F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.1345F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 43, -1.0F, -0.2F, 0.1F, 1, 1, 3, -0.003F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.9F, 0.0F, 3.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.2182F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 37, 18, -0.1F, -0.7F, 0.1F, 1, 2, 3, 0.0F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.6F, -2.6F);
        this.chest.addChild(neck3);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 55, -1.5F, -1.0F, -4.0F, 3, 3, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.7F, -2.5F);
        this.neck3.addChild(neck2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.8F, -3.1F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8116F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 18, -1.0F, -0.0593F, -0.034F, 2, 3, 5, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.3F, -3.4F);
        this.neck2.addChild(neck);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0F, -2.6F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 19, -1.0F, -0.1F, 0.0F, 2, 3, 3, -0.007F, false));

        this.thoat = new AdvancedModelRenderer(this);
        this.thoat.setRotationPoint(0.0F, 2.6357F, -2.4036F);
        this.neck.addChild(thoat);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 1.05F);
        this.thoat.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.288F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 27, -0.5F, -0.5F, -1.5F, 1, 1, 4, -0.007F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 59, 0, -1.0F, 0.0F, -2.6F, 2, 1, 3, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 12, -1.0F, -0.4F, -2.0F, 2, 1, 1, 0.006F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 35, -1.0F, -0.7F, -2.6F, 2, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.6F, 1.5807F, -4.3382F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2793F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 52, 0.0F, -0.92F, 0.1078F, 0, 1, 3, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 52, 1.2F, -0.92F, 0.1078F, 0, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.4F, -3.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.576F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.1F, 0.3178F, -2.5153F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.9F, 0.3178F, -2.5153F, 0, 1, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 28, 0.0F, 0.0178F, -2.5153F, 1, 1, 1, 0.003F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 48, 0.0F, 0.0178F, -2.0153F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.192F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 54, -0.8F, 0.0F, -2.0F, 1, 1, 3, 0.003F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 54, -0.2F, 0.0F, -2.0F, 1, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -0.4F, -3.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 28, -1.0F, 0.0178F, -0.0153F, 1, 1, 1, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.7F, -0.9F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3316F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 18, -0.5F, -0.0023F, -0.0163F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.4F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 12, -1.0F, 0.0F, -3.0F, 2, 1, 3, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 55, -1.0F, -1.7F, -2.0F, 2, 2, 2, -0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.6811F, -5.0484F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1222F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 12, -0.4F, -0.9F, -0.6F, 0, 1, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 12, 0.4F, -0.9F, -0.6F, 0, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 18, -0.5F, -0.6F, -0.6F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.6F, -0.1485F, -4.5803F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0349F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 0, 0.0F, -0.0144F, -0.0387F, 0, 1, 2, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 0, 1.2F, -0.0144F, -0.0387F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 27, -0.8F, 0.0F, -1.8F, 1, 1, 2, -0.005F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 27, -0.2F, 0.0F, -1.8F, 1, 1, 2, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2967F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 43, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.003F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.offsetY = -0.01F;
        this.body.offsetZ = -0.03F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hips.offsetY = 0.295F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.250F;
        this.hips.offsetX = 0.4F;
        this.hips.rotateAngleY = (float)Math.toRadians(240);
        this.hips.rotateAngleX = (float)Math.toRadians(-0);
        this.hips.rotateAngleZ = (float)Math.toRadians(3);
        this.hips.scaleChildren = true;
        float scaler = 0.75F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraDracoraptor EntityMegalosaurus = (EntityPrehistoricFloraDracoraptor) e;
        //this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.jaw, 0.1F, 0.05F, true, 3F, -0.05F, f2, 1F);

                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraDracoraptor ee = (EntityPrehistoricFloraDracoraptor) entitylivingbaseIn;

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
            //moving in water
            //
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracoraptor entity = (EntityPrehistoricFloraDracoraptor) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 6) / 7) * (7.5-(15)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 13) / 17) * (0-(7.5)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 5 + (((tickAnim - 8) / 3) * (-17.5-(5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -17.5 + (((tickAnim - 11) / 19) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9.63794-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-3.21745-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (3.84485-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 9.63794 + (((tickAnim - 6) / 7) * (-0.36206-(9.63794)));
            yy = -3.21745 + (((tickAnim - 6) / 7) * (-3.21745-(-3.21745)));
            zz = 3.84485 + (((tickAnim - 6) / 7) * (3.84485-(3.84485)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -0.36206 + (((tickAnim - 13) / 17) * (0-(-0.36206)));
            yy = -3.21745 + (((tickAnim - 13) / 17) * (0-(-3.21745)));
            zz = 3.84485 + (((tickAnim - 13) / 17) * (0-(3.84485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 7) / 6) * (-14.37-(-2.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -14.37 + (((tickAnim - 13) / 17) * (0-(-14.37)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-2.5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-2.5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
            xx = 15 + (((tickAnim - 6) / 4) * (29.91-(15)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.91 + (((tickAnim - 10) / 3) * (1.17-(29.91)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 1.17 + (((tickAnim - 13) / 17) * (0-(1.17)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracoraptor entity = (EntityPrehistoricFloraDracoraptor) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
 if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-15.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-15.25 + (((tickAnim - 15) / 10) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-15.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-16.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-16.25 + (((tickAnim - 15) / 10) * (3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-16.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-16.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-16.25 + (((tickAnim - 15) / 10) * (3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-16.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10 + (((tickAnim - 15) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10 + (((tickAnim - 25) / 15) * (0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*25 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20-(35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*25)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10 + (((tickAnim - 15) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5 + (((tickAnim - 25) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30 + (((tickAnim - 15) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5 + (((tickAnim - 25) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 35) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 25) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thoat, thoat.rotateAngleX + (float) Math.toRadians(xx), thoat.rotateAngleY + (float) Math.toRadians(yy), thoat.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.thoat.rotationPointX = this.thoat.rotationPointX + (float)(xx);
        this.thoat.rotationPointY = this.thoat.rotationPointY - (float)(yy);
        this.thoat.rotationPointZ = this.thoat.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracoraptor entity = (EntityPrehistoricFloraDracoraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -2.425 + (((tickAnim - 9) / 9) * (-4.47-(-2.425)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -4.47 + (((tickAnim - 18) / 13) * (-4.47-(-4.47)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 31) / 11) * (0-(0)));
            yy = -4.47 + (((tickAnim - 31) / 11) * (-2.425-(-4.47)));
            zz = 0 + (((tickAnim - 31) / 11) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -2.425 + (((tickAnim - 42) / 8) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = -4.5 + (((tickAnim - 19) / 9) * (-4.5-(-4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -4.5 + (((tickAnim - 28) / 22) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0.875 + (((tickAnim - 19) / 9) * (0.875-(0.875)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0.875 + (((tickAnim - 28) / 22) * (0-(0.875)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 5.67 + (((tickAnim - 4) / 8) * (14.84-(5.67)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.84 + (((tickAnim - 12) / 4) * (19.56-(14.84)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19.56 + (((tickAnim - 16) / 3) * (21.5-(19.56)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.55-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -9.55 + (((tickAnim - 4) / 8) * (-24.15-(-9.55)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -24.15 + (((tickAnim - 12) / 4) * (-31.21-(-24.15)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.21 + (((tickAnim - 16) / 3) * (-34.75-(-31.21)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 1) * (0-(0.1)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 3.49 + (((tickAnim - 4) / 15) * (13.75-(3.49)));
            yy = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 4.5 + (((tickAnim - 19) / 9) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 4.5 + (((tickAnim - 28) / 22) * (0-(4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0.875 + (((tickAnim - 19) / 9) * (0.875-(0.875)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0.875 + (((tickAnim - 28) / 22) * (0-(0.875)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 5.67 + (((tickAnim - 4) / 8) * (14.84-(5.67)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.84 + (((tickAnim - 12) / 4) * (19.56-(14.84)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19.56 + (((tickAnim - 16) / 3) * (21.5-(19.56)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.55-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -9.55 + (((tickAnim - 4) / 8) * (-24.15-(-9.55)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -24.15 + (((tickAnim - 12) / 4) * (-31.21-(-24.15)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.21 + (((tickAnim - 16) / 3) * (-34.75-(-31.21)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 1) * (0-(0.1)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 3.49 + (((tickAnim - 4) / 15) * (13.75-(3.49)));
            yy = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 27) / 9) * (-2-(0)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 36) / 14) * (0-(-2)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 19) / 9) * (3-(3)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 3 + (((tickAnim - 28) / 8) * (-1.05-(3)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -1.05 + (((tickAnim - 36) / 7) * (-3.56-(-1.05)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -3.56 + (((tickAnim - 43) / 7) * (0-(-3.56)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.5 + (((tickAnim - 19) / 9) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 8.5 + (((tickAnim - 28) / 8) * (1.27-(8.5)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 1.27 + (((tickAnim - 36) / 7) * (-4.58-(1.27)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.58 + (((tickAnim - 43) / 7) * (0-(-4.58)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -7 + (((tickAnim - 19) / 9) * (-7-(-7)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 28) / 22) * (0-(-7)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.75 + (((tickAnim - 19) / 9) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 28) / 22) * (0-(8.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -26.75 + (((tickAnim - 10) / 20) * (-26.75-(-26.75)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -26.75 + (((tickAnim - 30) / 20) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 12 + (((tickAnim - 10) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 30) / 20) * (0-(12)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -26.75 + (((tickAnim - 10) / 20) * (-26.75-(-26.75)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -26.75 + (((tickAnim - 30) / 20) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 12 + (((tickAnim - 10) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 30) / 20) * (0-(12)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = -7.5 + (((tickAnim - 19) / 10) * (-12.5-(-7.5)));
            yy = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 29) / 9) * (0.42-(-12.5)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.42 + (((tickAnim - 38) / 12) * (0-(0.42)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = -20 + (((tickAnim - 13) / 16) * (-10-(-20)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = -6 + (((tickAnim - 13) / 16) * (0-(-6)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = -10 + (((tickAnim - 29) / 9) * (-23-(-10)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -23 + (((tickAnim - 38) / 12) * (0-(-23)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.55933-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.63358-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.17494-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0.55933 + (((tickAnim - 13) / 16) * (0-(0.55933)));
            yy = -4.63358 + (((tickAnim - 13) / 16) * (0-(-4.63358)));
            zz = -6.17494 + (((tickAnim - 13) / 16) * (0-(-6.17494)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (4.5-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 4.5 + (((tickAnim - 38) / 5) * (6-(4.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 43) / 7) * (0-(6)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracoraptor entity = (EntityPrehistoricFloraDracoraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = -15.25 + (((tickAnim - 0) / 18) * (6.25-(-15.25)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.25 + (((tickAnim - 18) / 15) * (29-(6.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 33) / 17) * (-15.25-(29)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = -0.475 + (((tickAnim - 18) / 32) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -9.25 + (((tickAnim - 0) / 11) * (-2.76-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -2.76 + (((tickAnim - 11) / 7) * (-2-(-2.76)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 18) / 15) * (12.75-(-2)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 12.75 + (((tickAnim - 33) / 9) * (22.06-(12.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 22.06 + (((tickAnim - 42) / 8) * (-9.25-(22.06)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.75 + (((tickAnim - 5) / 6) * (-3.82-(0.75)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -3.82 + (((tickAnim - 11) / 7) * (-1-(-3.82)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1 + (((tickAnim - 18) / 15) * (17-(-1)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 17 + (((tickAnim - 33) / 4) * (-8.94-(17)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -8.94 + (((tickAnim - 37) / 5) * (-41.28-(-8.94)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -41.28 + (((tickAnim - 42) / 8) * (0-(-41.28)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 28.25 + (((tickAnim - 0) / 5) * (14-(28.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 14 + (((tickAnim - 5) / 6) * (8.93-(14)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 8.93 + (((tickAnim - 11) / 3) * (2.59-(8.93)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.59 + (((tickAnim - 14) / 4) * (-2.75-(2.59)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.75 + (((tickAnim - 18) / 2) * (-7.67-(-2.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -7.67 + (((tickAnim - 20) / 4) * (-10.11-(-7.67)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -10.11 + (((tickAnim - 24) / 4) * (-1.92-(-10.11)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -1.92 + (((tickAnim - 28) / 5) * (24.75-(-1.92)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 24.75 + (((tickAnim - 33) / 9) * (35.36-(24.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 35.36 + (((tickAnim - 42) / 4) * (13.72-(35.36)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 13.72 + (((tickAnim - 46) / 4) * (28.25-(13.72)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 0) / 50) * (-2-(-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 0) / 50) * (4-(4)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.28486 + (((tickAnim - 0) / 50) * (-0.28486-(-0.28486)));
            yy = -8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 0) / 50) * (-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = 4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-1 + (((tickAnim - 0) / 50) * (4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-1-(4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.8609 + (((tickAnim - 0) / 50) * (-0.8609-(-0.8609)));
            yy = -18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1 + (((tickAnim - 0) / 50) * (-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1-(-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1)));
            zz = -0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-1 + (((tickAnim - 0) / 50) * (-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-1-(-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2.14987 + (((tickAnim - 0) / 50) * (-2.14987-(-2.14987)));
            yy = 2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 0) / 50) * (2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-1 + (((tickAnim - 0) / 50) * (10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-1-(10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracoraptor entity = (EntityPrehistoricFloraDracoraptor) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 2.5 + (((tickAnim - 10) / 15) * (0-(2.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 35 + (((tickAnim - 15) / 8) * (37-(35)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 37 + (((tickAnim - 23) / 7) * (1.14-(37)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1.14 + (((tickAnim - 30) / 10) * (0-(1.14)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+2))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+2))*1 + (((tickAnim - 10) / 15) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*220+2))*1-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+2))*1)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*220+2))*1 + (((tickAnim - 25) / 14) * (0-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*220+2))*1)));
            yy = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+2))-2 + (((tickAnim - 0) / 39) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+2))-2)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Feathers, Feathers.rotateAngleX + (float) Math.toRadians(xx), Feathers.rotateAngleY + (float) Math.toRadians(yy), Feathers.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 23) / 17) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*220+2))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*220+2))*2 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*220+2))*2)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+2))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+2))*2 + (((tickAnim - 20) / 20) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+2))*2)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+2))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+2))*2 + (((tickAnim - 10) / 30) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+2))*2)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracoraptor entity = (EntityPrehistoricFloraDracoraptor) entitylivingbaseIn;
        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.67-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.67 + (((tickAnim - 10) / 10) * (1.25-(-6.67)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 20) / 10) * (7.5-(1.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 7.5 + (((tickAnim - 30) / 40) * (0-(7.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.2682-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*2 + (((tickAnim - 10) / 30) * (8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700+3.5))*1-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*3 + (((tickAnim - 10) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+3.5))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*3)));
            zz = -0.2682 + (((tickAnim - 10) / 30) * (0-(-0.2682)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700+3.5))*1 + (((tickAnim - 40) / 30) * (0-(8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700+3.5))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+3.5))*1 + (((tickAnim - 40) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+3.5))*1)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 34) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*1 + (((tickAnim - 10) / 24) * (14.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700+3.5))*3-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*1)));
            yy = 0 + (((tickAnim - 10) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 24) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 14.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700+3.5))*3 + (((tickAnim - 34) / 26) * (11.73-(14.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700+3.5))*3)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = 11.73 + (((tickAnim - 60) / 9) * (0-(11.73)));
            yy = 0 + (((tickAnim - 60) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*2-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+3.5))*5-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*2 + (((tickAnim - 30) / 25) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-200))*2-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+3.5))*5 + (((tickAnim - 30) / 25) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+3.5))*5)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-200))*2 + (((tickAnim - 55) / 15) * (0-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-200))*2)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.58-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.58 + (((tickAnim - 8) / 2) * (15-(0.58)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 15 + (((tickAnim - 10) / 4) * (-0.4-(15)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -0.4 + (((tickAnim - 14) / 6) * (2.2-(-0.4)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 2.2 + (((tickAnim - 20) / 17) * (0-(2.2)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (7.5-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 7.5 + (((tickAnim - 39) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (7.5-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 7.5 + (((tickAnim - 45) / 2) * (0-(7.5)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (7.5-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 7.5 + (((tickAnim - 50) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 58) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.90769-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+14000))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.33766-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.90769 + (((tickAnim - 10) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+5))*3-(17.90769)));
            yy = -14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+14000))*2 + (((tickAnim - 10) / 10) * (0-(-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+14000))*2)));
            zz = 3.33766 + (((tickAnim - 10) / 10) * (0-(3.33766)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+5))*3 + (((tickAnim - 20) / 10) * (-16.05-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+5))*3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -16.05 + (((tickAnim - 30) / 6) * (-10-(-16.05)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 70) {
            xx = -10 + (((tickAnim - 36) / 34) * (0-(-10)));
            yy = 0 + (((tickAnim - 36) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+3.5))*3.5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+3.5))*3.5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 10 + (((tickAnim - 30) / 40) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thoat, thoat.rotateAngleX + (float) Math.toRadians(xx), thoat.rotateAngleY + (float) Math.toRadians(yy), thoat.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450+3.5))*1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Feathers, Feathers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400+3.5))*2), Feathers.rotateAngleY + (float) Math.toRadians(0), Feathers.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 10) / 10) * (0-(7.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -7.5 + (((tickAnim - 30) / 40) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 10) / 10) * (0-(7.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -7.5 + (((tickAnim - 30) / 40) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0.05003-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.1966-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.17216-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0.05003 + (((tickAnim - 25) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+3.5))*0.5-(0.05003)));
            yy = -2.1966 + (((tickAnim - 25) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+3.5))*2-(-2.1966)));
            zz = 0.17216 + (((tickAnim - 25) / 20) * (0-(0.17216)));
        }
        else if (tickAnim >= 45 && tickAnim < 70) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+3.5))*0.5 + (((tickAnim - 45) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+3.5))*0.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+3.5))*2 + (((tickAnim - 45) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+3.5))*2)));
            zz = 0 + (((tickAnim - 45) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+3.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+3.5))*2 + (((tickAnim - 25) / 20) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300))*2-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300+3.5))*2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*3 + (((tickAnim - 25) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*3)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 70) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300))*2 + (((tickAnim - 45) / 25) * (0-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*3 + (((tickAnim - 45) / 25) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*3)));
            zz = 0 + (((tickAnim - 45) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900+3.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+35))*4-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900+3.5))*2 + (((tickAnim - 25) / 20) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+3.5))*2-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900+3.5))*2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+35))*4 + (((tickAnim - 25) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+35))*4)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 70) {
            xx = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+3.5))*2 + (((tickAnim - 45) / 25) * (0-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+3.5))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*4 + (((tickAnim - 45) / 25) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+3.5))*4)));
            zz = 0 + (((tickAnim - 45) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900+3.5))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900+3.5))*2 + (((tickAnim - 25) / 20) * (8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900+3.5))*2-(37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900+3.5))*2)));
            yy = 0 + (((tickAnim - 25) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+3.5))*3-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 70) {
            xx = 8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900+3.5))*2 + (((tickAnim - 45) / 25) * (0-(8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900+3.5))*2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+3.5))*3 + (((tickAnim - 45) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400+3.5))*3)));
            zz = 0 + (((tickAnim - 45) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 70) {
            xx = -2.5 + (((tickAnim - 10) / 60) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.75 + (((tickAnim - 10) / 10) * (1.46-(1.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.46 + (((tickAnim - 20) / 10) * (1.92-(1.46)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 1.92 + (((tickAnim - 30) / 40) * (0-(1.92)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.025 + (((tickAnim - 10) / 10) * (-0.05-(0.025)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 20) / 10) * (-0.115-(-0.05)));
            zz = -0.125 + (((tickAnim - 20) / 10) * (0.175-(-0.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            yy = -0.115 + (((tickAnim - 30) / 40) * (0-(-0.115)));
            zz = 0.175 + (((tickAnim - 30) / 40) * (0-(0.175)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 70) {
            xx = -2.5 + (((tickAnim - 10) / 60) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.75 + (((tickAnim - 10) / 10) * (1.46-(1.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.46 + (((tickAnim - 20) / 10) * (1.92-(1.46)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 1.92 + (((tickAnim - 30) / 40) * (0-(1.92)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.025 + (((tickAnim - 10) / 10) * (-0.05-(0.025)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 20) / 10) * (-0.115-(-0.05)));
            zz = -0.125 + (((tickAnim - 20) / 10) * (0.175-(-0.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            yy = -0.115 + (((tickAnim - 30) / 40) * (0-(-0.115)));
            zz = 0.175 + (((tickAnim - 30) / 40) * (0-(0.175)));
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

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDracoraptor entity = (EntityPrehistoricFloraDracoraptor) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*1), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/1.5+30))*-0.6);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)((-1+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*720/1.5+30))*-0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*720/1.5+30))*-1);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -24.75 + (((tickAnim - 0) / 4) * (-15.57952-(-24.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.15693-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.43893-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = -15.57952 + (((tickAnim - 4) / 11) * (15.04292-(-15.57952)));
            yy = -3.15693 + (((tickAnim - 4) / 11) * (-7.4713-(-3.15693)));
            zz = -2.43893 + (((tickAnim - 4) / 11) * (-0.6574-(-2.43893)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 15.04292 + (((tickAnim - 15) / 8) * (-8.7679-(15.04292)));
            yy = -7.4713 + (((tickAnim - 15) / 8) * (-9.1645-(-7.4713)));
            zz = -0.6574 + (((tickAnim - 15) / 8) * (1.22035-(-0.6574)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -8.7679 + (((tickAnim - 23) / 7) * (-24.75-(-8.7679)));
            yy = -9.1645 + (((tickAnim - 23) / 7) * (0-(-9.1645)));
            zz = 1.22035 + (((tickAnim - 23) / 7) * (0-(1.22035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 4) * (0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55 + (((tickAnim - 4) / 4) * (-0.145-(0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.145 + (((tickAnim - 8) / 7) * (-0.475-(-0.145)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.475 + (((tickAnim - 15) / 8) * (0.87-(-0.475)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.87 + (((tickAnim - 23) / 7) * (-0.85-(0.87)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.5 + (((tickAnim - 0) / 4) * (9.03-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.03 + (((tickAnim - 4) / 4) * (15.56-(9.03)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15.56 + (((tickAnim - 8) / 7) * (20-(15.56)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 15) / 4) * (38.2-(20)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 38.2 + (((tickAnim - 19) / 4) * (33.89-(38.2)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 33.89 + (((tickAnim - 23) / 7) * (-7.5-(33.89)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 12.5 + (((tickAnim - 0) / 4) * (4.03-(12.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 4.03 + (((tickAnim - 4) / 11) * (0-(4.03)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-13.61-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -13.61 + (((tickAnim - 19) / 4) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -47.22 + (((tickAnim - 23) / 5) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -25.71 + (((tickAnim - 28) / 2) * (12.5-(-25.71)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (1-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 1 + (((tickAnim - 23) / 7) * (0-(1)));
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
            xx = 18.75 + (((tickAnim - 0) / 3) * (6.5-(18.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 6.5 + (((tickAnim - 3) / 4) * (-7.68343-(6.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (5.77657-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.76462-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -7.68343 + (((tickAnim - 7) / 1) * (-14.83043-(-7.68343)));
            yy = 5.77657 + (((tickAnim - 7) / 1) * (4.97976-(5.77657)));
            zz = 0.76462 + (((tickAnim - 7) / 1) * (0.44995-(0.76462)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14.83043 + (((tickAnim - 8) / 7) * (4.7495-(-14.83043)));
            yy = 4.97976 + (((tickAnim - 8) / 7) * (6.63927-(4.97976)));
            zz = 0.44995 + (((tickAnim - 8) / 7) * (-2.43531-(0.44995)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 4.7495 + (((tickAnim - 15) / 4) * (57.22-(4.7495)));
            yy = 6.63927 + (((tickAnim - 15) / 4) * (0-(6.63927)));
            zz = -2.43531 + (((tickAnim - 15) / 4) * (0-(-2.43531)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 57.22 + (((tickAnim - 19) / 4) * (81.94-(57.22)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 81.94 + (((tickAnim - 23) / 4) * (55.97-(81.94)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 55.97 + (((tickAnim - 27) / 3) * (18.75-(55.97)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 3) / 4) * (0.26-(0.125)));
            zz = -0.15 + (((tickAnim - 3) / 4) * (-0.13-(-0.15)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.26 + (((tickAnim - 7) / 8) * (0-(0.26)));
            zz = -0.13 + (((tickAnim - 7) / 8) * (0-(-0.13)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0.07-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-0.715-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.07 + (((tickAnim - 23) / 7) * (0-(0.07)));
            zz = -0.715 + (((tickAnim - 23) / 7) * (0-(-0.715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.04292 + (((tickAnim - 0) / 8) * (-8.7679-(15.04292)));
            yy = 7.4713 + (((tickAnim - 0) / 8) * (9.1645-(7.4713)));
            zz = 0.6574 + (((tickAnim - 0) / 8) * (-1.22035-(0.6574)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.7679 + (((tickAnim - 8) / 7) * (-27.5-(-8.7679)));
            yy = 9.1645 + (((tickAnim - 8) / 7) * (0-(9.1645)));
            zz = -1.22035 + (((tickAnim - 8) / 7) * (0-(-1.22035)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -27.5 + (((tickAnim - 15) / 4) * (-15.57952-(-27.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (3.15693-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (2.43893-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -15.57952 + (((tickAnim - 19) / 11) * (15.04292-(-15.57952)));
            yy = 3.15693 + (((tickAnim - 19) / 11) * (7.4713-(3.15693)));
            zz = 2.43893 + (((tickAnim - 19) / 11) * (0.6574-(2.43893)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.72-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.72 + (((tickAnim - 8) / 7) * (-1.825-(0.72)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = -1.825 + (((tickAnim - 15) / 4) * (0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55-(-1.825)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55 + (((tickAnim - 19) / 4) * (0.055-(0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.055 + (((tickAnim - 23) / 7) * (0-(0.055)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 0) / 4) * (38.2-(20)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 38.2 + (((tickAnim - 4) / 4) * (36.39-(38.2)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 36.39 + (((tickAnim - 8) / 7) * (-7.5-(36.39)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -7.5 + (((tickAnim - 15) / 4) * (9.03-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9.03 + (((tickAnim - 19) / 4) * (15.56-(9.03)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 15.56 + (((tickAnim - 23) / 7) * (20-(15.56)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3 + (((tickAnim - 19) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 0) / 4) * (-13.61-(10)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -13.61 + (((tickAnim - 4) / 4) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -47.22 + (((tickAnim - 8) / 5) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -25.71 + (((tickAnim - 13) / 2) * (12.5-(-25.71)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 12.5 + (((tickAnim - 15) / 4) * (4.03-(12.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 4.03 + (((tickAnim - 19) / 11) * (10-(4.03)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.95-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0.95 + (((tickAnim - 8) / 11) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.7495 + (((tickAnim - 0) / 4) * (57.22-(4.7495)));
            yy = -6.63927 + (((tickAnim - 0) / 4) * (0-(-6.63927)));
            zz = 2.43531 + (((tickAnim - 0) / 4) * (0-(2.43531)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 57.22 + (((tickAnim - 4) / 4) * (84.44-(57.22)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 84.44 + (((tickAnim - 8) / 4) * (53.47-(84.44)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 53.47 + (((tickAnim - 12) / 3) * (22.5-(53.47)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 22.5 + (((tickAnim - 15) / 4) * (3.52888-(22.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (-2.31965-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (-0.93257-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 3.52888 + (((tickAnim - 19) / 4) * (-16.84854-(3.52888)));
            yy = -2.31965 + (((tickAnim - 19) / 4) * (-2.49911-(-2.31965)));
            zz = -0.93257 + (((tickAnim - 19) / 4) * (-0.06679-(-0.93257)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -16.84854 + (((tickAnim - 23) / 3) * (-14.4359-(-16.84854)));
            yy = -2.49911 + (((tickAnim - 23) / 3) * (-5.95073-(-2.49911)));
            zz = -0.06679 + (((tickAnim - 23) / 3) * (2.18275-(-0.06679)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -14.4359 + (((tickAnim - 26) / 4) * (4.7495-(-14.4359)));
            yy = -5.95073 + (((tickAnim - 26) / 4) * (-6.63927-(-5.95073)));
            zz = 2.18275 + (((tickAnim - 26) / 4) * (2.43531-(2.18275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.975-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = -0.975 + (((tickAnim - 8) / 11) * (0-(-0.975)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.3-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 23) / 7) * (0-(0.3)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-2), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-3));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-50))*-1), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-4), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-3));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-50))*-1), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-4), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-70))*-3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-70))*-4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-70))*-3));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*3), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*2), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-0.0381+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), leftArm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3-4.6314), leftArm.rotateAngleZ + (float) Math.toRadians(-5.23922));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), leftArm2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-100))*1), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-4)), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*-4)));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-0.0381+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), rightArm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-3+4.6314), rightArm.rotateAngleZ + (float) Math.toRadians(5.23922));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), rightArm2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-100))*-1), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-4)), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*-4)));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*4), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDracoraptor entity = (EntityPrehistoricFloraDracoraptor) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/0.75+30))*-1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*720/0.75+30))*-2+2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*720/0.75+30))*-2);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.33724 + (((tickAnim - 0) / 3) * (-25-(-16.33724)));
            yy = -6.98519 + (((tickAnim - 0) / 3) * (0-(-6.98519)));
            zz = 1.31992 + (((tickAnim - 0) / 3) * (0-(1.31992)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -25 + (((tickAnim - 3) / 1) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 3) / 1) * (-3.94898-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-2.05397-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -15.99476 + (((tickAnim - 4) / 3) * (6.05131-(-15.99476)));
            yy = -3.94898 + (((tickAnim - 4) / 3) * (-9.97674-(-3.94898)));
            zz = -2.05397 + (((tickAnim - 4) / 3) * (0.68516-(-2.05397)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 6.05131 + (((tickAnim - 7) / 1) * (15.07673-(6.05131)));
            yy = -9.97674 + (((tickAnim - 7) / 1) * (-9.96156-(-9.97674)));
            zz = 0.68516 + (((tickAnim - 7) / 1) * (-0.88045-(0.68516)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.07673 + (((tickAnim - 8) / 5) * (-7.67448-(15.07673)));
            yy = -9.96156 + (((tickAnim - 8) / 5) * (-13.97038-(-9.96156)));
            zz = -0.88045 + (((tickAnim - 8) / 5) * (2.63984-(-0.88045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.67448 + (((tickAnim - 13) / 2) * (-16.33724-(-7.67448)));
            yy = -13.97038 + (((tickAnim - 13) / 2) * (-6.98519-(-13.97038)));
            zz = 2.63984 + (((tickAnim - 13) / 2) * (1.31992-(2.63984)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-1-(0)));
            zz = -1 + (((tickAnim - 3) / 1) * (-0.56-(-1)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 4) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 4) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 5) / 2) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 5) / 2) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 7) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 7) / 1) * (1-(0.56)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 8) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (0-(1)));
            zz = -0.11 + (((tickAnim - 13) / 2) * (-1-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.08 + (((tickAnim - 0) / 3) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -35 + (((tickAnim - 3) / 1) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -33.72 + (((tickAnim - 4) / 1) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 11.94 + (((tickAnim - 5) / 2) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 34.72 + (((tickAnim - 7) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 22.5 + (((tickAnim - 8) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 56.94 + (((tickAnim - 11) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 55.16 + (((tickAnim - 13) / 1) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 5) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -52.16 + (((tickAnim - 0) / 2) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -24.89 + (((tickAnim - 2) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 19.72 + (((tickAnim - 4) / 1) * (0.56-(19.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0.56 + (((tickAnim - 5) / 2) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -2.22 + (((tickAnim - 7) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 40 + (((tickAnim - 8) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -54.44 + (((tickAnim - 12) / 2) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -50.23 + (((tickAnim - 14) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 58.21 + (((tickAnim - 0) / 3) * (45-(58.21)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 45 + (((tickAnim - 3) / 1) * (30.83-(45)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 30.83 + (((tickAnim - 4) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -9.17 + (((tickAnim - 5) / 2) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 50.41 + (((tickAnim - 7) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 60 + (((tickAnim - 8) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 75.83 + (((tickAnim - 12) / 3) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 15.07673 + (((tickAnim - 0) / 5) * (-7.67448-(15.07673)));
            yy = 9.96156 + (((tickAnim - 0) / 5) * (13.97038-(9.96156)));
            zz = 0.88045 + (((tickAnim - 0) / 5) * (-2.63984-(0.88045)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.67448 + (((tickAnim - 5) / 3) * (-16.33724-(-7.67448)));
            yy = 13.97038 + (((tickAnim - 5) / 3) * (6.98519-(13.97038)));
            zz = -2.63984 + (((tickAnim - 5) / 3) * (-1.31992-(-2.63984)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.33724 + (((tickAnim - 8) / 2) * (-25-(-16.33724)));
            yy = 6.98519 + (((tickAnim - 8) / 2) * (0-(6.98519)));
            zz = -1.31992 + (((tickAnim - 8) / 2) * (0-(-1.31992)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -25 + (((tickAnim - 10) / 2) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 10) / 2) * (3.94898-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (2.05397-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -15.99476 + (((tickAnim - 12) / 2) * (6.05131-(-15.99476)));
            yy = 3.94898 + (((tickAnim - 12) / 2) * (9.97674-(3.94898)));
            zz = 2.05397 + (((tickAnim - 12) / 2) * (-0.68516-(2.05397)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 6.05131 + (((tickAnim - 14) / 1) * (15.07673-(6.05131)));
            yy = 9.97674 + (((tickAnim - 14) / 1) * (9.96156-(9.97674)));
            zz = -0.68516 + (((tickAnim - 14) / 1) * (0.88045-(-0.68516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 0) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 5) * (0-(1)));
            zz = -0.11 + (((tickAnim - 5) / 5) * (-1-(-0.11)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-1-(0)));
            zz = -1 + (((tickAnim - 10) / 2) * (-0.56-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 12) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 12) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 13) / 1) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 13) / 1) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 14) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 14) / 1) * (1-(0.56)));
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
            xx = 22.5 + (((tickAnim - 0) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 56.94 + (((tickAnim - 3) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 55.16 + (((tickAnim - 5) / 3) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.08 + (((tickAnim - 8) / 2) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -35 + (((tickAnim - 10) / 2) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -33.72 + (((tickAnim - 12) / 1) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 11.94 + (((tickAnim - 13) / 1) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 34.72 + (((tickAnim - 14) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 40 + (((tickAnim - 0) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -54.44 + (((tickAnim - 4) / 3) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -50.23 + (((tickAnim - 7) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -52.16 + (((tickAnim - 8) / 1) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -24.89 + (((tickAnim - 9) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 10) / 2) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 19.72 + (((tickAnim - 12) / 1) * (0.56-(19.72)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.56 + (((tickAnim - 13) / 1) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -2.22 + (((tickAnim - 14) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 0) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 75.83 + (((tickAnim - 4) / 4) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 58.21 + (((tickAnim - 8) / 2) * (45-(58.21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 45 + (((tickAnim - 10) / 2) * (30.83-(45)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 30.83 + (((tickAnim - 12) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -9.17 + (((tickAnim - 13) / 1) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 50.41 + (((tickAnim - 14) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-50))*-2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-12), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*-8), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*-9), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*2), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-4.5452+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), leftArm.rotateAngleY + (float) Math.toRadians(-10.91441), leftArm.rotateAngleZ + (float) Math.toRadians(-2.0228+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(0);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(1.5);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(0);


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-4.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), rightArm.rotateAngleY + (float) Math.toRadians(2.43438), rightArm.rotateAngleZ + (float) Math.toRadians(1.2318+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(0);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(0.4);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(0);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*6), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+200))*3), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-11), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*-1), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDracoraptor e = (EntityPrehistoricFloraDracoraptor) entity;
        animator.update(entity);


    }
}
