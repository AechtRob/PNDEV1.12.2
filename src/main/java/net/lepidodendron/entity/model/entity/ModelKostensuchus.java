package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKostensuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKostensuchus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private ModelAnimator animator;

    public ModelKostensuchus() {
        this.textureWidth = 97;
        this.textureHeight = 97;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 17.0F, 9.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -7.25F, 3.8F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 13, -0.5F, -1.45F, -3.5F, 4, 1, 6, -0.006F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 18, -2.0F, -0.5F, -3.5F, 7, 7, 6, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.75F, -7.25F, 2.3F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1745F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 21, 58, -1.5F, -0.5F, -1.75F, 3, 8, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.5F, -1.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6109F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 77, 0, -1.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.5933F, 2.0864F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.4189F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 77, 11, -1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 0.9451F, -2.5858F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 1.5708F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 87, 64, -2.0F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.75F, -7.25F, 2.3F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1745F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 21, 58, -1.5F, -0.5F, -1.75F, 3, 8, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.5F, -1.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6109F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 77, 0, -1.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.5933F, 2.0864F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.4189F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 77, 11, -1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 0.9451F, -2.5858F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.5708F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 87, 64, -2.0F, -3.0F, -1.0F, 4, 3, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.4198F, 5.5386F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3491F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 33, 0, -3.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 55, 58, -1.5F, -0.95F, 0.025F, 3, 1, 6, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.15F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 46, -2.5F, 0.0F, 0.0F, 5, 5, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 69, 48, -1.0F, -1.0F, 0.0F, 2, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0107F, 5.2491F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 46, 46, -2.0F, 0.05F, 0.0F, 4, 4, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 58, 0, -1.0F, -0.925F, 0.0F, 2, 1, 7, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1255F, 5.9891F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 66, -1.5F, 0.0F, 0.0F, 3, 3, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 75, 21, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2182F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 53, 66, -1.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 74, 56, -0.5F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 36, 66, -0.5F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 79, 28, 0.0F, -1.0F, 1.0F, 0, 1, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.7103F, 1.0154F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 18, -4.0F, -0.5397F, -6.0154F, 8, 8, 6, -0.03F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.24F, -5.2049F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 32, -3.0F, -0.025F, -0.85F, 6, 1, 6, -0.003F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.2397F, -5.1154F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -4.0F, -0.3F, -8.0F, 8, 9, 8, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -1.225F, -6.95F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0262F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 33, -1.0F, -0.025F, -1.0F, 6, 1, 8, 0.003F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.9917F, -6.9118F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 29, 32, -3.5F, -2.0F, -5.25F, 7, 8, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.9692F, -3.1199F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2051F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 58, -2.5F, 0.0F, 0.0F, 5, 3, 4, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.25F, 1.8065F, -3.4809F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3491F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 75, -1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 5.4435F, 1.2309F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7418F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 13, 78, -1.0F, 0.0F, -3.0F, 2, 7, 3, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 6.2533F, -1.3928F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3491F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 70, 73, -1.5F, 0.0F, -4.0F, 3, 1, 5, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.25F, 1.8065F, -3.4809F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3491F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 75, -1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 5.4435F, 1.2309F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7418F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 13, 78, -1.0F, 0.0F, -3.0F, 2, 7, 3, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 6.2533F, -1.3928F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3491F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 70, 73, -1.5F, 0.0F, -4.0F, 3, 1, 5, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.7665F, -2.6774F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 43, -3.0F, 0.0F, -6.025F, 6, 7, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.4082F, -2.8962F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 66, -3.0F, 0.0F, 0.0F, 5, 3, 3, 0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -2.4544F, -2.8075F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3185F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 40, -3.0F, 0.0F, -4.1F, 4, 3, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1015F, -5.0445F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0175F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 56, 21, -2.5F, -0.0337F, -3.5001F, 5, 4, 4, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.8495F, -3.6918F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2269F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 40, -2.0F, 0.0F, 0.0F, 4, 2, 3, -0.013F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0742F, -0.7144F, -3.6389F);
        this.neck2.addChild(head);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0541F, 3.0527F, -6.3043F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.088F, -0.1304F, -0.0115F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 66, 0.025F, -1.7F, 1.75F, 0, 2, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 79, 80, -0.075F, -2.0F, 0.0F, 2, 2, 4, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.1849F, 3.2205F, -5.514F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2572F, -0.2434F, 0.0484F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 61, 82, 0.0F, -0.8F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0395F, 3.2594F, -6.7818F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0739F, -0.1389F, 0.0939F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 75, 28, 0.1F, -0.1F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0395F, 3.2594F, -6.7818F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0429F, -0.1304F, -0.0115F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 56, 88, 0.1F, -0.5F, -2.0F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 69, 9, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.003F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5492F, 2.7984F, -10.2845F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.9024F, -0.0083F, -0.0028F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 53, 88, -0.025F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.485F, 2.9837F, -9.8475F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2121F, -0.7734F, 0.4523F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 75, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.5742F, 2.3056F, -2.1862F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 86, 0.6F, -0.5F, -1.375F, 0, 2, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 86, 4.4F, -0.5F, -1.375F, 0, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.0742F, 3.1157F, -9.4362F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.5795F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 29, 78, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.4008F, 2.7984F, -10.2845F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.9024F, 0.0083F, 0.0028F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 53, 88, 0.025F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.0742F, 1.8501F, -10.0672F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.3352F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 78, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.006F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.0742F, 1.1777F, -9.327F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.7374F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 43, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0742F, 1.7911F, -6.2248F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1265F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 85, 0.5F, -1.0F, -3.0F, 1, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5742F, 0.0602F, -3.5782F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0044F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 13, -0.5F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5742F, -0.1944F, -2.6112F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2574F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 82, -0.5F, 0.0F, -4.0F, 2, 2, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.7807F, 3.1706F, -8.763F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1359F, -0.8712F, 0.0335F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 48, 88, 0.0F, -1.0F, -1.7F, 1, 1, 1, -0.01F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 84, 18, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.0655F, 2.0528F, -6.3051F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2189F, -0.1304F, -0.0115F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 64, 75, -0.05F, 0.075F, -0.725F, 1, 1, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0703F, 1.9854F, -9.154F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0831F, -0.3054F, -0.0014F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 61, 86, -0.15F, -0.5F, 0.075F, 2, 1, 3, -0.01F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.5742F, 3.0557F, -2.3383F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1302F, -0.0344F, -0.0114F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 24, 82, -0.075F, -2.325F, -0.5F, 2, 2, 4, 0.003F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.6323F, 3.1706F, -8.763F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1359F, 0.8712F, -0.0335F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 48, 88, -1.0F, -1.0F, -1.7F, 1, 1, 1, -0.01F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 84, 18, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.3366F, 2.9837F, -9.8475F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2121F, 0.7734F, -0.4523F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 75, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.8911F, 3.2594F, -6.7818F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0429F, 0.1304F, 0.0115F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 88, -0.1F, -0.5F, -2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 69, 9, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.0365F, 3.2205F, -5.514F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2572F, 0.2434F, -0.0484F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 61, 82, 0.0F, -0.8F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.8911F, 3.2594F, -6.7818F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0739F, 0.1389F, -0.0939F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 75, 28, -0.1F, -0.1F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.9171F, 2.0528F, -6.3051F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2189F, 0.1304F, 0.0115F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 64, 75, -0.95F, 0.075F, -0.725F, 1, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.624F, 0.2342F, -4.441F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2319F, -0.2499F, -0.2923F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 87, 74, 0.025F, 0.075F, -0.025F, 1, 2, 2, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.4258F, 3.0557F, -2.3383F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1302F, 0.0344F, 0.0114F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 82, -1.925F, -2.325F, -0.5F, 2, 2, 4, 0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.9057F, 3.0527F, -6.3043F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.088F, 0.1304F, 0.0115F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 17, 66, -0.025F, -1.7F, 1.75F, 0, 2, 1, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 79, 80, -1.925F, -2.0F, 0.0F, 2, 2, 4, 0.003F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.0742F, 3.0557F, -2.3383F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0044F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 86, 48, -1.0F, -1.0F, -6.5F, 2, 1, 3, -0.003F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 49, 75, -1.5F, -2.0F, -3.825F, 3, 2, 4, -0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.9219F, 1.9854F, -9.154F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0831F, 0.3054F, 0.0014F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 61, 86, -1.85F, -0.5F, 0.075F, 2, 1, 3, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.4755F, 0.2342F, -4.441F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.2319F, 0.2499F, 0.2923F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 87, 74, -1.025F, 0.075F, -0.025F, 1, 2, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.4258F, -0.1944F, 0.5138F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 34, 75, -3.5F, 0.0F, -3.0F, 4, 3, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0742F, 2.5731F, 0.3246F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 71, -2.0F, -0.0174F, -3.5108F, 4, 2, 4, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 82, -1.5F, 0.6265F, -8.8627F, 3, 1, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 2.719F, -4.2084F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0785F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 33, 13, -2.0F, -1.0F, -0.4F, 3, 1, 3, -0.003F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 2.4051F, -8.1961F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0785F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 64, 80, -1.0F, -1.0F, 0.0F, 3, 1, 4, -0.006F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 2.4051F, -8.1961F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.4058F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 77, 18, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 2.0104F, -9.1149F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.4756F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 88, 6, -0.5F, -1.0F, -1.6F, 1, 1, 1, -0.01F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 86, 53, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 0.6756F, -5.063F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0131F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 86, 87, -1.0F, 0.0F, -4.8F, 1, 1, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.6265F, -5.8627F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0785F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 58, 9, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.003F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, -0.0174F, -3.5108F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.3927F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 37, 87, -2.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.4619F, 0.9185F, -9.2101F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0073F, -0.8909F, -0.0393F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 88, 3, 0.0F, -0.5F, -1.4F, 1, 1, 1, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 88, 0, 0.0F, -0.5F, -1.0F, 1, 1, 1, 0.003F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-2.0275F, 1.4196F, -5.2492F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0047F, -0.171F, -0.0344F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 86, 42, -0.1F, -1.0F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-2.625F, -0.3174F, -2.6629F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2645F, -0.1767F, -0.0241F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 87, 69, -0.075F, 0.0F, -3.0F, 1, 1, 3, 0.003F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-2.625F, -0.3174F, -2.6629F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0007F, -0.0344F, -0.0114F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 86, 36, -0.075F, 0.0F, 0.0F, 1, 1, 4, 0.003F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(2.625F, -0.3174F, -2.6629F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0007F, 0.0344F, 0.0114F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 86, 36, -0.925F, 0.0F, 0.0F, 1, 1, 4, 0.003F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(1.4619F, 0.9185F, -9.2101F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0073F, 0.8909F, 0.0393F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 88, 3, -1.0F, -0.5F, -1.4F, 1, 1, 1, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 88, 0, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.8854F, 0.4342F, -9.4006F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.2678F, -0.8157F, -0.15F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 14, 89, 0.4F, -0.2F, -0.7F, 0, 1, 1, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-1.5638F, 0.4194F, -8.7197F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0115F, -0.1707F, -0.0743F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 11, 89, 0.275F, -0.75F, -0.25F, 0, 1, 1, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.6922F, 0.6634F, -6.4589F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0483F, -0.171F, -0.0344F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 79, 87, 0.0F, -0.5F, -1.3F, 0, 1, 3, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.6922F, 0.6634F, -6.4589F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0483F, 0.171F, 0.0344F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 79, 87, 0.0F, -0.5F, -1.3F, 0, 1, 3, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.8854F, 0.4342F, -9.4006F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.2678F, 0.8157F, 0.15F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 14, 89, -0.4F, -0.2F, -0.7F, 0, 1, 1, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(1.5638F, 0.4194F, -8.7197F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0115F, 0.1707F, 0.0743F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 11, 89, -0.275F, -0.75F, -0.25F, 0, 1, 1, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(2.0275F, 1.4196F, -5.2492F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0047F, 0.171F, 0.0344F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 86, 42, -0.9F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(2.625F, -0.3174F, -2.6629F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.2645F, 0.1767F, 0.0241F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 87, 69, -0.925F, 0.0F, -3.0F, 1, 1, 3, 0.003F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(-0.5F, 2.8276F, -2.6676F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.3491F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 0, 56, -1.5F, -3.0F, 0.0F, 4, 3, 6, -0.01F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(-0.0742F, 0.634F, -3.1649F);
        this.head.addChild(eyes);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(1.4078F, -0.0086F, -0.2483F);
        this.eyes.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1776F, 0.2608F, 0.0233F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 79, 36, -0.6F, -0.45F, -0.275F, 1, 1, 1, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-1.4078F, -0.0086F, -0.2483F);
        this.eyes.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1776F, -0.2608F, -0.0233F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 79, 36, -0.4F, -0.45F, -0.275F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.11F;
        this.main.render(0.01F);
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
        this.main.offsetY = 0.6F;
        this.main.offsetX = 0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(240);
        this.main.rotateAngleX = (float)Math.toRadians(-0);
        this.main.rotateAngleZ = (float)Math.toRadians(3);
        this.main.scaleChildren = true;
        float scaler = 0.45F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraKostensuchus EntityMegalosaurus = (EntityPrehistoricFloraKostensuchus) e;
//        this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

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
        EntityPrehistoricFloraKostensuchus ee = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //threat
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.BASK_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.YAWN_ANIMATION) {
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 600;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -19 + (((tickAnim - 24) / 1) * (28.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*50-(-19)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 28.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*50 + (((tickAnim - 25) / 25) * (0-(28.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*50)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 579) {
            xx = 0 + (((tickAnim - 560) / 19) * (5.25-(0)));
            yy = 0 + (((tickAnim - 560) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 19) * (0-(0)));
        }
        else if (tickAnim >= 579 && tickAnim < 600) {
            xx = 5.25 + (((tickAnim - 579) / 21) * (0-(5.25)));
            yy = 0 + (((tickAnim - 579) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 579) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-3.075-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.525-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = -3.075 + (((tickAnim - 24) / 26) * (-6.295-(-3.075)));
            zz = 0.525 + (((tickAnim - 24) / 26) * (1.425-(0.525)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = -6.295 + (((tickAnim - 50) / 510) * (-6.295-(-6.295)));
            zz = 1.425 + (((tickAnim - 50) / 510) * (1.425-(1.425)));
        }
        else if (tickAnim >= 560 && tickAnim < 579) {
            xx = 0 + (((tickAnim - 560) / 19) * (0-(0)));
            yy = -6.295 + (((tickAnim - 560) / 19) * (-2.655-(-6.295)));
            zz = 1.425 + (((tickAnim - 560) / 19) * (0.74-(1.425)));
        }
        else if (tickAnim >= 579 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 579) / 21) * (0-(0)));
            yy = -2.655 + (((tickAnim - 579) / 21) * (0-(-2.655)));
            zz = 0.74 + (((tickAnim - 579) / 21) * (0-(0.74)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-14.2704-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-13.2073-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-3.748-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -14.2704 + (((tickAnim - 25) / 25) * (-37.3416-(-14.2704)));
            yy = -13.2073 + (((tickAnim - 25) / 25) * (-20.7721-(-13.2073)));
            zz = -3.748 + (((tickAnim - 25) / 25) * (-1.8448-(-3.748)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -37.3416 + (((tickAnim - 50) / 510) * (-37.3416-(-37.3416)));
            yy = -20.7721 + (((tickAnim - 50) / 510) * (-20.7721-(-20.7721)));
            zz = -1.8448 + (((tickAnim - 50) / 510) * (-1.8448-(-1.8448)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = -37.3416 + (((tickAnim - 560) / 20) * (-23.8572-(-37.3416)));
            yy = -20.7721 + (((tickAnim - 560) / 20) * (-10.3476-(-20.7721)));
            zz = -1.8448 + (((tickAnim - 560) / 20) * (-1.2686-(-1.8448)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -23.8572 + (((tickAnim - 580) / 20) * (0-(-23.8572)));
            yy = -10.3476 + (((tickAnim - 580) / 20) * (0-(-10.3476)));
            zz = -1.2686 + (((tickAnim - 580) / 20) * (0-(-1.2686)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = -0.925 + (((tickAnim - 50) / 510) * (-0.925-(-0.925)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = -0.925 + (((tickAnim - 560) / 40) * (0-(-0.925)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (44-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 44 + (((tickAnim - 25) / 25) * (86.25-(44)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 86.25 + (((tickAnim - 50) / 510) * (86.25-(86.25)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = 86.25 + (((tickAnim - 560) / 20) * (39.87-(86.25)));
            yy = 0 + (((tickAnim - 560) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 20) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 39.87 + (((tickAnim - 580) / 20) * (0-(39.87)));
            yy = 0 + (((tickAnim - 580) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 580) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (1.425-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = -1.5 + (((tickAnim - 50) / 510) * (-1.5-(-1.5)));
            zz = 1.425 + (((tickAnim - 50) / 510) * (1.425-(1.425)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = -1.5 + (((tickAnim - 560) / 40) * (0-(-1.5)));
            zz = 1.425 + (((tickAnim - 560) / 40) * (0-(1.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -11 + (((tickAnim - 25) / 25) * (-49.9949-(-11)));
            yy = 0 + (((tickAnim - 25) / 25) * (1.3512-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (1.1686-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -49.9949 + (((tickAnim - 50) / 510) * (-49.9949-(-49.9949)));
            yy = 1.3512 + (((tickAnim - 50) / 510) * (1.3512-(1.3512)));
            zz = 1.1686 + (((tickAnim - 50) / 510) * (1.1686-(1.1686)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = -49.9949 + (((tickAnim - 560) / 20) * (-23.0974-(-49.9949)));
            yy = 1.3512 + (((tickAnim - 560) / 20) * (0.6756-(1.3512)));
            zz = 1.1686 + (((tickAnim - 560) / 20) * (0.5843-(1.1686)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -23.0974 + (((tickAnim - 580) / 20) * (0-(-23.0974)));
            yy = 0.6756 + (((tickAnim - 580) / 20) * (0-(0.6756)));
            zz = 0.5843 + (((tickAnim - 580) / 20) * (0-(0.5843)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.3-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0.25 + (((tickAnim - 25) / 25) * (0.325-(0.25)));
            zz = 0.3 + (((tickAnim - 25) / 25) * (0.3-(0.3)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0.325 + (((tickAnim - 50) / 510) * (0.325-(0.325)));
            zz = 0.3 + (((tickAnim - 50) / 510) * (0.3-(0.3)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0.325 + (((tickAnim - 560) / 40) * (0-(0.325)));
            zz = 0.3 + (((tickAnim - 560) / 40) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-14.2704-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (13.2073-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (3.748-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -14.2704 + (((tickAnim - 25) / 25) * (-37.3416-(-14.2704)));
            yy = 13.2073 + (((tickAnim - 25) / 25) * (20.7721-(13.2073)));
            zz = 3.748 + (((tickAnim - 25) / 25) * (1.8448-(3.748)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -37.3416 + (((tickAnim - 50) / 510) * (-37.3416-(-37.3416)));
            yy = 20.7721 + (((tickAnim - 50) / 510) * (20.7721-(20.7721)));
            zz = 1.8448 + (((tickAnim - 50) / 510) * (1.8448-(1.8448)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = -37.3416 + (((tickAnim - 560) / 20) * (-23.8572-(-37.3416)));
            yy = 20.7721 + (((tickAnim - 560) / 20) * (10.3476-(20.7721)));
            zz = 1.8448 + (((tickAnim - 560) / 20) * (1.2686-(1.8448)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -23.8572 + (((tickAnim - 580) / 20) * (0-(-23.8572)));
            yy = 10.3476 + (((tickAnim - 580) / 20) * (0-(10.3476)));
            zz = 1.2686 + (((tickAnim - 580) / 20) * (0-(1.2686)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = -0.925 + (((tickAnim - 50) / 510) * (-0.925-(-0.925)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = -0.925 + (((tickAnim - 560) / 40) * (0-(-0.925)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (44-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 44 + (((tickAnim - 25) / 25) * (86.25-(44)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 86.25 + (((tickAnim - 50) / 510) * (86.25-(86.25)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = 86.25 + (((tickAnim - 560) / 20) * (39.87-(86.25)));
            yy = 0 + (((tickAnim - 560) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 20) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 39.87 + (((tickAnim - 580) / 20) * (0-(39.87)));
            yy = 0 + (((tickAnim - 580) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 580) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (1.425-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = -1.5 + (((tickAnim - 50) / 510) * (-1.5-(-1.5)));
            zz = 1.425 + (((tickAnim - 50) / 510) * (1.425-(1.425)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = -1.5 + (((tickAnim - 560) / 40) * (0-(-1.5)));
            zz = 1.425 + (((tickAnim - 560) / 40) * (0-(1.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -11 + (((tickAnim - 25) / 25) * (-49.9949-(-11)));
            yy = 0 + (((tickAnim - 25) / 25) * (-1.3512-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (-1.1686-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -49.9949 + (((tickAnim - 50) / 510) * (-49.9949-(-49.9949)));
            yy = -1.3512 + (((tickAnim - 50) / 510) * (-1.3512-(-1.3512)));
            zz = -1.1686 + (((tickAnim - 50) / 510) * (-1.1686-(-1.1686)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = -49.9949 + (((tickAnim - 560) / 20) * (-23.0974-(-49.9949)));
            yy = -1.3512 + (((tickAnim - 560) / 20) * (-0.6756-(-1.3512)));
            zz = -1.1686 + (((tickAnim - 560) / 20) * (-0.5843-(-1.1686)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -23.0974 + (((tickAnim - 580) / 20) * (0-(-23.0974)));
            yy = -0.6756 + (((tickAnim - 580) / 20) * (0-(-0.6756)));
            zz = -0.5843 + (((tickAnim - 580) / 20) * (0-(-0.5843)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.3-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0.25 + (((tickAnim - 25) / 25) * (0.325-(0.25)));
            zz = 0.3 + (((tickAnim - 25) / 25) * (0.3-(0.3)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0.325 + (((tickAnim - 50) / 510) * (0.325-(0.325)));
            zz = 0.3 + (((tickAnim - 50) / 510) * (0.3-(0.3)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0.325 + (((tickAnim - 560) / 40) * (0-(0.325)));
            zz = 0.3 + (((tickAnim - 560) / 40) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 560) {
            xx = 10.5 + (((tickAnim - 24) / 536) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 24) / 536) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 536) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = 10.5 + (((tickAnim - 560) / 20) * (-1.25-(10.5)));
            yy = 0 + (((tickAnim - 560) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 20) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -1.25 + (((tickAnim - 580) / 20) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 580) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 580) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 11 + (((tickAnim - 24) / 26) * (0-(11)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = 0 + (((tickAnim - 560) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 560) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 20) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -2.5 + (((tickAnim - 580) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 580) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 580) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 2.25 + (((tickAnim - 10) / 14) * (20.5-(2.25)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 20.5 + (((tickAnim - 24) / 10) * (20.24-(20.5)));
            yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 20.24 + (((tickAnim - 34) / 16) * (0-(20.24)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 10) / 14) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = -2.25 + (((tickAnim - 24) / 26) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 10) / 14) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = -11.25 + (((tickAnim - 24) / 5) * (-8.62-(-11.25)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = -8.62 + (((tickAnim - 29) / 5) * (-13.99-(-8.62)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = -13.99 + (((tickAnim - 34) / 11) * (-9.67-(-13.99)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -9.67 + (((tickAnim - 45) / 5) * (0-(-9.67)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 10) / 14) * (-2-(0)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = -2 + (((tickAnim - 24) / 10) * (-6.3-(-2)));
            yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -6.3 + (((tickAnim - 34) / 16) * (0-(-6.3)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 25) / 25) * (0-(8.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 25) / 25) * (0-(1.75)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 24) / 26) * (-8.1843-(-6.25)));
            yy = 0 + (((tickAnim - 24) / 26) * (7.0827-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (-30.5162-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -8.1843 + (((tickAnim - 50) / 510) * (-8.1843-(-8.1843)));
            yy = 7.0827 + (((tickAnim - 50) / 510) * (7.0827-(7.0827)));
            zz = -30.5162 + (((tickAnim - 50) / 510) * (-30.5162-(-30.5162)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = -8.1843 + (((tickAnim - 560) / 20) * (3.9079-(-8.1843)));
            yy = 7.0827 + (((tickAnim - 560) / 20) * (3.5414-(7.0827)));
            zz = -30.5162 + (((tickAnim - 560) / 20) * (-15.2581-(-30.5162)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 3.9079 + (((tickAnim - 580) / 20) * (0-(3.9079)));
            yy = 3.5414 + (((tickAnim - 580) / 20) * (0-(3.5414)));
            zz = -15.2581 + (((tickAnim - 580) / 20) * (0-(-15.2581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 24) / 11) * (-18.7549-(2.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (-0.6474-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (2.756-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -18.7549 + (((tickAnim - 35) / 8) * (-43.4681-(-18.7549)));
            yy = -0.6474 + (((tickAnim - 35) / 8) * (-1.1453-(-0.6474)));
            zz = 2.756 + (((tickAnim - 35) / 8) * (4.8759-(2.756)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -43.4681 + (((tickAnim - 43) / 7) * (-55.5887-(-43.4681)));
            yy = -1.1453 + (((tickAnim - 43) / 7) * (-1.5437-(-1.1453)));
            zz = 4.8759 + (((tickAnim - 43) / 7) * (6.5719-(4.8759)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -55.5887 + (((tickAnim - 50) / 510) * (-55.5887-(-55.5887)));
            yy = -1.5437 + (((tickAnim - 50) / 510) * (-1.5437-(-1.5437)));
            zz = 6.5719 + (((tickAnim - 50) / 510) * (6.5719-(6.5719)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = -55.5887 + (((tickAnim - 560) / 20) * (-42.7944-(-55.5887)));
            yy = -1.5437 + (((tickAnim - 560) / 20) * (-0.7719-(-1.5437)));
            zz = 6.5719 + (((tickAnim - 560) / 20) * (3.2859-(6.5719)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -42.7944 + (((tickAnim - 580) / 20) * (0-(-42.7944)));
            yy = -0.7719 + (((tickAnim - 580) / 20) * (0-(-0.7719)));
            zz = 3.2859 + (((tickAnim - 580) / 20) * (0-(3.2859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 26) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = -0.45 + (((tickAnim - 50) / 510) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = -0.45 + (((tickAnim - 560) / 40) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 24) / 26) * (63.7455-(12.25)));
            yy = 0 + (((tickAnim - 24) / 26) * (-23.1261-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (2.4646-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 63.7455 + (((tickAnim - 50) / 510) * (63.7455-(63.7455)));
            yy = -23.1261 + (((tickAnim - 50) / 510) * (-23.1261-(-23.1261)));
            zz = 2.4646 + (((tickAnim - 50) / 510) * (2.4646-(2.4646)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 63.7455 + (((tickAnim - 560) / 40) * (0-(63.7455)));
            yy = -23.1261 + (((tickAnim - 560) / 40) * (0-(-23.1261)));
            zz = 2.4646 + (((tickAnim - 560) / 40) * (0-(2.4646)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (-0.275-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = -0.275 + (((tickAnim - 50) / 510) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = -0.275 + (((tickAnim - 560) / 40) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 24) / 26) * (-8.1843-(-6.25)));
            yy = 0 + (((tickAnim - 24) / 26) * (-7.0827-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (30.5162-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -8.1843 + (((tickAnim - 50) / 510) * (-8.1843-(-8.1843)));
            yy = -7.0827 + (((tickAnim - 50) / 510) * (-7.0827-(-7.0827)));
            zz = 30.5162 + (((tickAnim - 50) / 510) * (30.5162-(30.5162)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = -8.1843 + (((tickAnim - 560) / 20) * (4.9079-(-8.1843)));
            yy = -7.0827 + (((tickAnim - 560) / 20) * (-3.5414-(-7.0827)));
            zz = 30.5162 + (((tickAnim - 560) / 20) * (15.2581-(30.5162)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 4.9079 + (((tickAnim - 580) / 20) * (0-(4.9079)));
            yy = -3.5414 + (((tickAnim - 580) / 20) * (0-(-3.5414)));
            zz = 15.2581 + (((tickAnim - 580) / 20) * (0-(15.2581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 24) / 11) * (-18.7549-(2.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0.6474-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (-2.756-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -18.7549 + (((tickAnim - 35) / 8) * (-43.4681-(-18.7549)));
            yy = 0.6474 + (((tickAnim - 35) / 8) * (1.1453-(0.6474)));
            zz = -2.756 + (((tickAnim - 35) / 8) * (-4.8759-(-2.756)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -43.4681 + (((tickAnim - 43) / 7) * (-55.5887-(-43.4681)));
            yy = 1.1453 + (((tickAnim - 43) / 7) * (1.5437-(1.1453)));
            zz = -4.8759 + (((tickAnim - 43) / 7) * (-6.5719-(-4.8759)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -55.5887 + (((tickAnim - 50) / 510) * (-55.5887-(-55.5887)));
            yy = 1.5437 + (((tickAnim - 50) / 510) * (1.5437-(1.5437)));
            zz = -6.5719 + (((tickAnim - 50) / 510) * (-6.5719-(-6.5719)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = -55.5887 + (((tickAnim - 560) / 20) * (-43.2944-(-55.5887)));
            yy = 1.5437 + (((tickAnim - 560) / 20) * (0.7719-(1.5437)));
            zz = -6.5719 + (((tickAnim - 560) / 20) * (-3.2859-(-6.5719)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -43.2944 + (((tickAnim - 580) / 20) * (0-(-43.2944)));
            yy = 0.7719 + (((tickAnim - 580) / 20) * (0-(0.7719)));
            zz = -3.2859 + (((tickAnim - 580) / 20) * (0-(-3.2859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 26) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = -0.45 + (((tickAnim - 50) / 510) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = -0.45 + (((tickAnim - 560) / 40) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 24) / 26) * (63.7455-(12.25)));
            yy = 0 + (((tickAnim - 24) / 26) * (23.1261-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (-2.4646-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 63.7455 + (((tickAnim - 50) / 510) * (63.7455-(63.7455)));
            yy = 23.1261 + (((tickAnim - 50) / 510) * (23.1261-(23.1261)));
            zz = -2.4646 + (((tickAnim - 50) / 510) * (-2.4646-(-2.4646)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 63.7455 + (((tickAnim - 560) / 40) * (0-(63.7455)));
            yy = 23.1261 + (((tickAnim - 560) / 40) * (0-(23.1261)));
            zz = -2.4646 + (((tickAnim - 560) / 40) * (0-(-2.4646)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (-0.275-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = -0.275 + (((tickAnim - 50) / 510) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = -0.275 + (((tickAnim - 560) / 40) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 3.25 + (((tickAnim - 25) / 13) * (6.25-(3.25)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 38) / 12) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 279) {
            xx = 6.25 + (((tickAnim - 50) / 229) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 50) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 229) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 280) {
            xx = 6.25 + (((tickAnim - 279) / 1) * (0.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(6.25)));
            yy = 0 + (((tickAnim - 279) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 279) / 1) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 280) / 20) * (-8-(0.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 420) {
            xx = -8 + (((tickAnim - 300) / 120) * (-8-(-8)));
            yy = 0 + (((tickAnim - 300) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 120) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 466) {
            xx = -8 + (((tickAnim - 420) / 46) * (-12-(-8)));
            yy = 0 + (((tickAnim - 420) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 46) * (0-(0)));
        }
        else if (tickAnim >= 466 && tickAnim < 560) {
            xx = -12 + (((tickAnim - 466) / 94) * (-12-(-12)));
            yy = 0 + (((tickAnim - 466) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 466) / 94) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 580) {
            xx = -12 + (((tickAnim - 560) / 20) * (-11.5-(-12)));
            yy = 0 + (((tickAnim - 560) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 20) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = -11.5 + (((tickAnim - 580) / 20) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 580) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 580) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (-41.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -41.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 38) / 32) * (2.5-(-41.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 95) {
            xx = 2.5 + (((tickAnim - 70) / 25) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 70) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 25) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 95) / 25) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 95) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 25) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 280) {
            xx = -2.5 + (((tickAnim - 120) / 160) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 120) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 160) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -2.5 + (((tickAnim - 280) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 300) / 7) * (49.8901-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(0)));
            yy = 0 + (((tickAnim - 300) / 7) * (-0.3385-(0)));
            zz = 0 + (((tickAnim - 300) / 7) * (-0.4339-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 314) {
            xx = 49.8901-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 307) / 7) * (1.775-(49.8901-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            yy = -0.3385 + (((tickAnim - 307) / 7) * (0-(-0.3385)));
            zz = -0.4339 + (((tickAnim - 307) / 7) * (0-(-0.4339)));
        }
        else if (tickAnim >= 314 && tickAnim < 322) {
            xx = 1.775 + (((tickAnim - 314) / 8) * (7.3401-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+150))*-10-(1.775)));
            yy = 0 + (((tickAnim - 314) / 8) * (-0.3385-(0)));
            zz = 0 + (((tickAnim - 314) / 8) * (-0.4339-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 329) {
            xx = 7.3401-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+150))*-10 + (((tickAnim - 322) / 7) * (0-(7.3401-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+150))*-10)));
            yy = -0.3385 + (((tickAnim - 322) / 7) * (0-(-0.3385)));
            zz = -0.4339 + (((tickAnim - 322) / 7) * (0-(-0.4339)));
        }
        else if (tickAnim >= 329 && tickAnim < 333) {
            xx = 0 + (((tickAnim - 329) / 4) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 329) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 329) / 4) * (0-(0)));
        }
        else if (tickAnim >= 333 && tickAnim < 600) {
            xx = -1.5 + (((tickAnim - 333) / 267) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 333) / 267) * (0-(0)));
            zz = 0 + (((tickAnim - 333) / 267) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 6.5 + (((tickAnim - 38) / 32) * (-16.75-(6.5)));
            yy = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 95) {
            xx = -16.75 + (((tickAnim - 70) / 25) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 70) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 25) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 279) {
            xx = -16.75 + (((tickAnim - 95) / 184) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 95) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 184) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 280) {
            xx = -16.75 + (((tickAnim - 279) / 1) * (-9.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(-16.75)));
            yy = 0 + (((tickAnim - 279) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 279) / 1) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -9.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 280) / 20) * (0-(-9.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 300) / 7) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 300) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 7) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 314) {
            xx = -1.5 + (((tickAnim - 307) / 7) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 307) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 7) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 322) {
            xx = 0 + (((tickAnim - 314) / 8) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 314) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 8) * (0-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 329) {
            xx = -1.5 + (((tickAnim - 322) / 7) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 322) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 322) / 7) * (0-(0)));
        }
        else if (tickAnim >= 329 && tickAnim < 333) {
            xx = 0 + (((tickAnim - 329) / 4) * (1-(0)));
            yy = 0 + (((tickAnim - 329) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 329) / 4) * (0-(0)));
        }
        else if (tickAnim >= 333 && tickAnim < 420) {
            xx = 1 + (((tickAnim - 333) / 87) * (1-(1)));
            yy = 0 + (((tickAnim - 333) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 333) / 87) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 466) {
            xx = 1 + (((tickAnim - 420) / 46) * (8.5-(1)));
            yy = 0 + (((tickAnim - 420) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 46) * (0-(0)));
        }
        else if (tickAnim >= 466 && tickAnim < 560) {
            xx = 8.5 + (((tickAnim - 466) / 94) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 466) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 466) / 94) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 8.5 + (((tickAnim - 560) / 40) * (0-(8.5)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 50) / 20) * (23.5-(0)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 95) {
            xx = 23.5 + (((tickAnim - 70) / 25) * (23.5-(23.5)));
            yy = 0 + (((tickAnim - 70) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 25) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 120) {
            xx = 23.5 + (((tickAnim - 95) / 25) * (30.25-(23.5)));
            yy = 0 + (((tickAnim - 95) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 25) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 280) {
            xx = 30.25 + (((tickAnim - 120) / 160) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 120) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 160) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 30.25 + (((tickAnim - 280) / 10) * (0-(30.25)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 290) / 130) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 130) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 420) / 20) * (49-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+40))*50-(0)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 466) {
            xx = 49-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+40))*50 + (((tickAnim - 440) / 26) * (0-(49-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+40))*50)));
            yy = 0 + (((tickAnim - 440) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 26) * (0-(0)));
        }
        else if (tickAnim >= 466 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 466) / 94) * (0-(0)));
            yy = 0 + (((tickAnim - 466) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 466) / 94) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 95) {
            xx = 3.75 + (((tickAnim - 50) / 45) * (0-(3.75)));
            yy = 0 + (((tickAnim - 50) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 45) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 95) / 25) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 95) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 25) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 280) {
            xx = -6.25 + (((tickAnim - 120) / 160) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 120) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 160) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -6.25 + (((tickAnim - 280) / 10) * (10-(-6.25)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 10 + (((tickAnim - 290) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 300) / 7) * (7-(0)));
            yy = 0 + (((tickAnim - 300) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 7) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 314) {
            xx = 7 + (((tickAnim - 307) / 7) * (0-(7)));
            yy = 0 + (((tickAnim - 307) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 7) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 322) {
            xx = 0 + (((tickAnim - 314) / 8) * (7-(0)));
            yy = 0 + (((tickAnim - 314) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 8) * (0-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 329) {
            xx = 7 + (((tickAnim - 322) / 7) * (0-(7)));
            yy = 0 + (((tickAnim - 322) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 322) / 7) * (0-(0)));
        }
        else if (tickAnim >= 329 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 329) / 91) * (0-(0)));
            yy = 0 + (((tickAnim - 329) / 91) * (0-(0)));
            zz = 0 + (((tickAnim - 329) / 91) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 420) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 466) {
            xx = -5 + (((tickAnim - 440) / 26) * (0-(-5)));
            yy = 0 + (((tickAnim - 440) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 26) * (0-(0)));
        }
        else if (tickAnim >= 466 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 466) / 94) * (0-(0)));
            yy = 0 + (((tickAnim - 466) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 466) / 94) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0.6-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 61) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 34) * (0-(0)));
            zz = 0.6 + (((tickAnim - 61) / 34) * (0.6-(0.6)));
        }
        else if (tickAnim >= 95 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 95) / 185) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 185) * (0-(0)));
            zz = 0.6 + (((tickAnim - 95) / 185) * (0.6-(0.6)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0.6 + (((tickAnim - 280) / 10) * (0.8-(0.6)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0.8 + (((tickAnim - 290) / 10) * (0-(0.8)));
        }
        else if (tickAnim >= 300 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 300) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 14) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 329) {
            xx = 0 + (((tickAnim - 314) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 314) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 15) * (0-(0)));
        }
        else if (tickAnim >= 329 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 329) / 271) * (0-(0)));
            yy = 0 + (((tickAnim - 329) / 271) * (0-(0)));
            zz = 0 + (((tickAnim - 329) / 271) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 488) {
            xx = 0 + (((tickAnim - 0) / 488) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 488) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 488) * (0-(0)));
        }
        else if (tickAnim >= 488 && tickAnim < 542) {
            xx = 0 + (((tickAnim - 488) / 54) * (3.5-(0)));
            yy = 0 + (((tickAnim - 488) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 488) / 54) * (0-(0)));
        }
        else if (tickAnim >= 542 && tickAnim < 558) {
            xx = 3.5 + (((tickAnim - 542) / 16) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 542) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 542) / 16) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 580) {
            xx = 3.5 + (((tickAnim - 558) / 22) * (0-(3.5)));
            yy = 0 + (((tickAnim - 558) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyes, eyes.rotateAngleX + (float) Math.toRadians(xx), eyes.rotateAngleY + (float) Math.toRadians(yy), eyes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 0) / 70) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 70) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 70) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 70) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 5) * (0.0975-(1)));
            zz = 1 + (((tickAnim - 70) / 5) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 75) / 5) * (1-(1)));
            yy = 0.0975 + (((tickAnim - 75) / 5) * (1-(0.0975)));
            zz = 1 + (((tickAnim - 75) / 5) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 80) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 15) * (1-(1)));
        }
        else if (tickAnim >= 95 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 95) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 95) / 25) * (0.015-(1)));
            zz = 1 + (((tickAnim - 95) / 25) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 280) {
            xx = 1 + (((tickAnim - 120) / 160) * (1-(1)));
            yy = 0.015 + (((tickAnim - 120) / 160) * (0.015-(0.015)));
            zz = 1 + (((tickAnim - 120) / 160) * (1-(1)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 1 + (((tickAnim - 280) / 10) * (1-(1)));
            yy = 0.015 + (((tickAnim - 280) / 10) * (1-(0.015)));
            zz = 1 + (((tickAnim - 280) / 10) * (1-(1)));
        }
        else if (tickAnim >= 290 && tickAnim < 350) {
            xx = 1 + (((tickAnim - 290) / 60) * (1-(1)));
            yy = 1 + (((tickAnim - 290) / 60) * (1-(1)));
            zz = 1 + (((tickAnim - 290) / 60) * (1-(1)));
        }
        else if (tickAnim >= 350 && tickAnim < 360) {
            xx = 1 + (((tickAnim - 350) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 350) / 10) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 350) / 10) * (1-(1)));
        }
        else if (tickAnim >= 360 && tickAnim < 371) {
            xx = 1 + (((tickAnim - 360) / 11) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 360) / 11) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 360) / 11) * (1-(1)));
        }
        else if (tickAnim >= 371 && tickAnim < 420) {
            xx = 1 + (((tickAnim - 371) / 49) * (1-(1)));
            yy = 1 + (((tickAnim - 371) / 49) * (1-(1)));
            zz = 1 + (((tickAnim - 371) / 49) * (1-(1)));
        }
        else if (tickAnim >= 420 && tickAnim < 439) {
            xx = 1 + (((tickAnim - 420) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 420) / 19) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 420) / 19) * (1-(1)));
        }
        else if (tickAnim >= 439 && tickAnim < 462) {
            xx = 1 + (((tickAnim - 439) / 23) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 439) / 23) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 439) / 23) * (1-(1)));
        }
        else if (tickAnim >= 462 && tickAnim < 488) {
            xx = 1 + (((tickAnim - 462) / 26) * (1-(1)));
            yy = 1 + (((tickAnim - 462) / 26) * (1-(1)));
            zz = 1 + (((tickAnim - 462) / 26) * (1-(1)));
        }
        else if (tickAnim >= 488 && tickAnim < 542) {
            xx = 1 + (((tickAnim - 488) / 54) * (1-(1)));
            yy = 1 + (((tickAnim - 488) / 54) * (0.2075-(1)));
            zz = 1 + (((tickAnim - 488) / 54) * (1-(1)));
        }
        else if (tickAnim >= 542 && tickAnim < 558) {
            xx = 1 + (((tickAnim - 542) / 16) * (1-(1)));
            yy = 0.2075 + (((tickAnim - 542) / 16) * (0.2075-(0.2075)));
            zz = 1 + (((tickAnim - 542) / 16) * (1-(1)));
        }
        else if (tickAnim >= 558 && tickAnim < 580) {
            xx = 1 + (((tickAnim - 558) / 22) * (1-(1)));
            yy = 0.2075 + (((tickAnim - 558) / 22) * (1-(0.2075)));
            zz = 1 + (((tickAnim - 558) / 22) * (1-(1)));
        }
        else if (tickAnim >= 580 && tickAnim < 600) {
            xx = 1 + (((tickAnim - 580) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 580) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 580) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);
        

    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 78;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 0) / 25) * (1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 61) {
            xx = 1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-10 + (((tickAnim - 25) / 36) * (8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*15-(1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-10)));
            yy = 0 + (((tickAnim - 25) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 36) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*15 + (((tickAnim - 61) / 17) * (0-(8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*15)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 0) / 25) * (39.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*50-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 61) {
            xx = 39.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*50 + (((tickAnim - 25) / 36) * (-26.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*30-(39.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*50)));
            yy = 0 + (((tickAnim - 25) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 36) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = -26.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*30 + (((tickAnim - 61) / 17) * (0-(-26.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*30)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 78) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 0) / 78) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 78) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20 + (((tickAnim - 9) / 16) * (26.175-(21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 61) {
            xx = 26.175 + (((tickAnim - 25) / 36) * (67.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-50-(26.175)));
            yy = 0 + (((tickAnim - 25) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 36) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 67.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-50 + (((tickAnim - 61) / 17) * (0-(67.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-50)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10 + (((tickAnim - 0) / 10) * (0.89-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0.89-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20 + (((tickAnim - 10) / 15) * (-17.39-(0.89-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -17.39 + (((tickAnim - 25) / 20) * (-12.92-(-17.39)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 61) {
            xx = -12.92 + (((tickAnim - 45) / 16) * (-17-(-12.92)));
            yy = 0 + (((tickAnim - 45) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 16) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = -17 + (((tickAnim - 61) / 17) * (0-(-17)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.01-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0.01 + (((tickAnim - 10) / 15) * (0.025-(0.01)));
            zz = 0.75 + (((tickAnim - 10) / 15) * (0-(0.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 25) / 36) * (0-(0)));
            yy = 0.025 + (((tickAnim - 25) / 36) * (0-(0.025)));
            zz = 0 + (((tickAnim - 25) / 36) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 23) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 23) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 7) * (-0.0125-(1)));
            zz = 1 + (((tickAnim - 23) / 7) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 30) / 5) * (1-(1)));
            yy = -0.0125 + (((tickAnim - 30) / 5) * (-0.0125-(-0.0125)));
            zz = 1 + (((tickAnim - 30) / 5) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 35) / 33) * (1-(1)));
            yy = -0.0125 + (((tickAnim - 35) / 33) * (1-(-0.0125)));
            zz = 1 + (((tickAnim - 35) / 33) * (1-(1)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 68) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 68) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 68) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 154;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            zz = -1 + (((tickAnim - 20) / 37) * (-1-(-1)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 57) / 1) * (7.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*8-(0)));
            yy = 0 + (((tickAnim - 57) / 1) * (0-(0)));
            zz = -1 + (((tickAnim - 57) / 1) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-2-(-1)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 7.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*8 + (((tickAnim - 58) / 22) * (2.7498-(7.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*8)));
            yy = 0 + (((tickAnim - 58) / 22) * (-0.036-(0)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-2 + (((tickAnim - 58) / 22) * (-0.2509-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-2)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 2.7498 + (((tickAnim - 80) / 55) * (2.7498-(2.7498)));
            yy = -0.036 + (((tickAnim - 80) / 55) * (-0.036-(-0.036)));
            zz = -0.2509 + (((tickAnim - 80) / 55) * (-0.2509-(-0.2509)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 2.7498 + (((tickAnim - 135) / 19) * (0-(2.7498)));
            yy = -0.036 + (((tickAnim - 135) / 19) * (0-(-0.036)));
            zz = -0.2509 + (((tickAnim - 135) / 19) * (0-(-0.2509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            zz = 2 + (((tickAnim - 20) / 37) * (2-(2)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 57) / 1) * (19.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*20-(0)));
            yy = 0 + (((tickAnim - 57) / 1) * (0-(0)));
            zz = 2 + (((tickAnim - 57) / 1) * (2-(2)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 19.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*20 + (((tickAnim - 58) / 22) * (5.4981-(19.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*20)));
            yy = 0 + (((tickAnim - 58) / 22) * (-0.174-(0)));
            zz = 2 + (((tickAnim - 58) / 22) * (3.2378-(2)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 5.4981 + (((tickAnim - 80) / 55) * (5.4981-(5.4981)));
            yy = -0.174 + (((tickAnim - 80) / 55) * (-0.174-(-0.174)));
            zz = 3.2378 + (((tickAnim - 80) / 55) * (3.2378-(3.2378)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 5.4981 + (((tickAnim - 135) / 19) * (0-(5.4981)));
            yy = -0.174 + (((tickAnim - 135) / 19) * (0-(-0.174)));
            zz = 3.2378 + (((tickAnim - 135) / 19) * (0-(3.2378)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.0429-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.6899-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.5591-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.0429 + (((tickAnim - 10) / 10) * (-9.0858-(-16.0429)));
            yy = 0.6899 + (((tickAnim - 10) / 10) * (1.3798-(0.6899)));
            zz = -3.5591 + (((tickAnim - 10) / 10) * (-7.1182-(-3.5591)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -9.0858 + (((tickAnim - 20) / 15) * (16.4142-(-9.0858)));
            yy = 1.3798 + (((tickAnim - 20) / 15) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 20) / 15) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 16.4142 + (((tickAnim - 35) / 15) * (-9.0858-(16.4142)));
            yy = 1.3798 + (((tickAnim - 35) / 15) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 35) / 15) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -9.0858 + (((tickAnim - 50) / 15) * (9.4142-(-9.0858)));
            yy = 1.3798 + (((tickAnim - 50) / 15) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 50) / 15) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 9.4142 + (((tickAnim - 65) / 15) * (22.9142-(9.4142)));
            yy = 1.3798 + (((tickAnim - 65) / 15) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 65) / 15) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 22.9142 + (((tickAnim - 80) / 55) * (22.9142-(22.9142)));
            yy = 1.3798 + (((tickAnim - 80) / 55) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 80) / 55) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 135 && tickAnim < 146) {
            xx = 22.9142 + (((tickAnim - 135) / 11) * (2.4627-(22.9142)));
            yy = 1.3798 + (((tickAnim - 135) / 11) * (0.5999-(1.3798)));
            zz = -7.1182 + (((tickAnim - 135) / 11) * (-3.0949-(-7.1182)));
        }
        else if (tickAnim >= 146 && tickAnim < 154) {
            xx = 2.4627 + (((tickAnim - 146) / 8) * (0-(2.4627)));
            yy = 0.5999 + (((tickAnim - 146) / 8) * (0-(0.5999)));
            zz = -3.0949 + (((tickAnim - 146) / 8) * (0-(-3.0949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-39.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -39.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 10) / 10) * (-12-(-39.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -12 + (((tickAnim - 20) / 15) * (-0.5-(-12)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -0.5 + (((tickAnim - 35) / 8) * (-27.5-(-0.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (-12-(-27.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -12 + (((tickAnim - 50) / 15) * (-0.5-(-12)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -0.5 + (((tickAnim - 65) / 15) * (-4-(-0.5)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = -4 + (((tickAnim - 80) / 55) * (-4-(-4)));
            yy = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 146) {
            xx = -4 + (((tickAnim - 135) / 11) * (-39.49-(-4)));
            yy = 0 + (((tickAnim - 135) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 11) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 154) {
            xx = -39.49 + (((tickAnim - 146) / 8) * (0-(-39.49)));
            yy = 0 + (((tickAnim - 146) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0.425-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 38) / 5) * (0-(0.425)));
            zz = 0.3 + (((tickAnim - 38) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 43 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 43) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 30) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 7) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            yy = -0.325 + (((tickAnim - 80) / 55) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            yy = -0.325 + (((tickAnim - 135) / 19) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (72.37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 72.37 + (((tickAnim - 10) / 10) * (65.75-(72.37)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 65.75 + (((tickAnim - 20) / 8) * (7-(65.75)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 28) / 7) * (-13.3034-(7)));
            yy = 0 + (((tickAnim - 28) / 7) * (-0.8501-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (7.2002-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -13.3034 + (((tickAnim - 35) / 6) * (88.17-(-13.3034)));
            yy = -0.8501 + (((tickAnim - 35) / 6) * (0-(-0.8501)));
            zz = 7.2002 + (((tickAnim - 35) / 6) * (0-(7.2002)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 88.17 + (((tickAnim - 41) / 9) * (65.75-(88.17)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 65.75 + (((tickAnim - 50) / 8) * (7-(65.75)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 7 + (((tickAnim - 58) / 7) * (-11.5-(7)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -11.5 + (((tickAnim - 65) / 15) * (-26.25-(-11.5)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = -26.25 + (((tickAnim - 80) / 55) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = -26.25 + (((tickAnim - 135) / 5) * (41.31-(-26.25)));
            yy = 0 + (((tickAnim - 135) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 5) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 146) {
            xx = 41.31 + (((tickAnim - 140) / 6) * (87.09-(41.31)));
            yy = 0 + (((tickAnim - 140) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 6) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 154) {
            xx = 87.09 + (((tickAnim - 146) / 8) * (0-(87.09)));
            yy = 0 + (((tickAnim - 146) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.575-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 20) / 8) * (-0.5-(0.475)));
            zz = -0.575 + (((tickAnim - 20) / 8) * (0-(-0.575)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 28) / 7) * (-0.4-(-0.5)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = -0.4 + (((tickAnim - 35) / 6) * (1.065-(-0.4)));
            zz = 0 + (((tickAnim - 35) / 6) * (-0.975-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 1.065 + (((tickAnim - 41) / 9) * (0.475-(1.065)));
            zz = -0.975 + (((tickAnim - 41) / 9) * (-0.575-(-0.975)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 50) / 8) * (-0.5-(0.475)));
            zz = -0.575 + (((tickAnim - 50) / 8) * (0-(-0.575)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 58) / 7) * (-0.4-(-0.5)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            yy = -0.4 + (((tickAnim - 65) / 8) * (-0.325-(-0.4)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 73) / 7) * (-0.4-(-0.325)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            yy = -0.4 + (((tickAnim - 80) / 55) * (-0.4-(-0.4)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 135) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 135) / 5) * (0.83-(-0.4)));
            zz = 0 + (((tickAnim - 135) / 5) * (-0.23-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 140) / 6) * (0-(0)));
            yy = 0.83 + (((tickAnim - 140) / 6) * (0.755-(0.83)));
            zz = -0.23 + (((tickAnim - 140) / 6) * (-0.825-(-0.23)));
        }
        else if (tickAnim >= 146 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 146) / 8) * (0-(0)));
            yy = 0.755 + (((tickAnim - 146) / 8) * (0-(0.755)));
            zz = -0.825 + (((tickAnim - 146) / 8) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 57) {
            xx = -0.5 + (((tickAnim - 20) / 37) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            zz = -0.75 + (((tickAnim - 20) / 37) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = -0.5 + (((tickAnim - 57) / 1) * (-15.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-15-(-0.5)));
            yy = 0 + (((tickAnim - 57) / 1) * (0-(0)));
            zz = -0.75 + (((tickAnim - 57) / 1) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -15.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-15 + (((tickAnim - 58) / 22) * (-7.0144-(-15.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-15)));
            yy = 0 + (((tickAnim - 58) / 22) * (0.6184-(0)));
            zz = -0.75 + (((tickAnim - 58) / 22) * (-3.4296-(-0.75)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = -7.0144 + (((tickAnim - 80) / 55) * (-7.0144-(-7.0144)));
            yy = 0.6184 + (((tickAnim - 80) / 55) * (0.6184-(0.6184)));
            zz = -3.4296 + (((tickAnim - 80) / 55) * (-3.4296-(-3.4296)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -7.0144 + (((tickAnim - 135) / 19) * (0-(-7.0144)));
            yy = 0.6184 + (((tickAnim - 135) / 19) * (0-(0.6184)));
            zz = -3.4296 + (((tickAnim - 135) / 19) * (0-(-3.4296)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.0003-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.159-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.1929-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 57) {
            xx = 3.0003 + (((tickAnim - 20) / 37) * (3.0003-(3.0003)));
            yy = -0.159 + (((tickAnim - 20) / 37) * (-0.159-(-0.159)));
            zz = -0.1929 + (((tickAnim - 20) / 37) * (-0.1929-(-0.1929)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = 3.0003 + (((tickAnim - 57) / 1) * (-21.8997-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-25-(3.0003)));
            yy = -0.159 + (((tickAnim - 57) / 1) * (-0.159-(-0.159)));
            zz = -0.1929 + (((tickAnim - 57) / 1) * (-0.1929-(-0.1929)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -21.8997-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-25 + (((tickAnim - 58) / 22) * (-7.7497-(-21.8997-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-25)));
            yy = -0.159 + (((tickAnim - 58) / 22) * (-0.159-(-0.159)));
            zz = -0.1929 + (((tickAnim - 58) / 22) * (-0.1929-(-0.1929)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = -7.7497 + (((tickAnim - 80) / 55) * (-7.7497-(-7.7497)));
            yy = -0.159 + (((tickAnim - 80) / 55) * (-0.159-(-0.159)));
            zz = -0.1929 + (((tickAnim - 80) / 55) * (-0.1929-(-0.1929)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -7.7497 + (((tickAnim - 135) / 19) * (0-(-7.7497)));
            yy = -0.159 + (((tickAnim - 135) / 19) * (0-(-0.159)));
            zz = -0.1929 + (((tickAnim - 135) / 19) * (0-(-0.1929)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 58) {
            xx = -2.75 + (((tickAnim - 20) / 38) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 20) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 38) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -2.75 + (((tickAnim - 58) / 22) * (7.25-(-2.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 7.25 + (((tickAnim - 80) / 55) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 7.25 + (((tickAnim - 135) / 19) * (0-(7.25)));
            yy = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.678-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.9923-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.5756-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.678-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 20) / 15) * (-2.247-(2.678-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = -1.9923 + (((tickAnim - 20) / 15) * (-1.9923-(-1.9923)));
            zz = 1.5756 + (((tickAnim - 20) / 15) * (1.5756-(1.5756)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.247 + (((tickAnim - 35) / 15) * (-2.747-(-2.247)));
            yy = -1.9923 + (((tickAnim - 35) / 15) * (-1.9923-(-1.9923)));
            zz = 1.5756 + (((tickAnim - 35) / 15) * (1.5756-(1.5756)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -2.747 + (((tickAnim - 50) / 15) * (-2.247-(-2.747)));
            yy = -1.9923 + (((tickAnim - 50) / 15) * (-8.6173-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-8-(-1.9923)));
            zz = 1.5756 + (((tickAnim - 50) / 15) * (5.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8-(1.5756)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -2.247 + (((tickAnim - 65) / 15) * (-2.5984-(-2.247)));
            yy = -8.6173-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-8 + (((tickAnim - 65) / 15) * (-4.9305-(-8.6173-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-8)));
            zz = 5.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 65) / 15) * (5.704-(5.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = -2.5984 + (((tickAnim - 80) / 55) * (-2.5984-(-2.5984)));
            yy = -4.9305 + (((tickAnim - 80) / 55) * (-4.9305-(-4.9305)));
            zz = 5.704 + (((tickAnim - 80) / 55) * (5.704-(5.704)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -2.5984 + (((tickAnim - 135) / 19) * (0-(-2.5984)));
            yy = -4.9305 + (((tickAnim - 135) / 19) * (0-(-4.9305)));
            zz = 5.704 + (((tickAnim - 135) / 19) * (0-(5.704)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.1072-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.9486-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.7533-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.1072 + (((tickAnim - 20) / 15) * (1.5572-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-10-(2.1072)));
            yy = -2.9486 + (((tickAnim - 20) / 15) * (-2.9486-(-2.9486)));
            zz = 2.7533 + (((tickAnim - 20) / 15) * (2.7533-(2.7533)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 1.5572-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-10 + (((tickAnim - 35) / 14) * (5.3572-(1.5572-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-10)));
            yy = -2.9486 + (((tickAnim - 35) / 14) * (-2.9486-(-2.9486)));
            zz = 2.7533 + (((tickAnim - 35) / 14) * (2.7533-(2.7533)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 5.3572 + (((tickAnim - 49) / 2) * (32.7322-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*30-(5.3572)));
            yy = -2.9486 + (((tickAnim - 49) / 2) * (-2.9486-(-2.9486)));
            zz = 2.7533 + (((tickAnim - 49) / 2) * (2.7533-(2.7533)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 32.7322-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*30 + (((tickAnim - 51) / 29) * (14.4636-(32.7322-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*30)));
            yy = -2.9486 + (((tickAnim - 51) / 29) * (-8.3889-(-2.9486)));
            zz = 2.7533 + (((tickAnim - 51) / 29) * (-3.1398-(2.7533)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 14.4636 + (((tickAnim - 80) / 7) * (17.6136-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20-(14.4636)));
            yy = -8.3889 + (((tickAnim - 80) / 7) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 80) / 7) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = 17.6136-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20 + (((tickAnim - 87) / 6) * (14.0886-(17.6136-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20)));
            yy = -8.3889 + (((tickAnim - 87) / 6) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 87) / 6) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 14.0886 + (((tickAnim - 93) / 7) * (27.0386-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20-(14.0886)));
            yy = -8.3889 + (((tickAnim - 93) / 7) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 93) / 7) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 27.0386-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20 + (((tickAnim - 100) / 7) * (14.4636-(27.0386-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20)));
            yy = -8.3889 + (((tickAnim - 100) / 7) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 100) / 7) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 14.4636 + (((tickAnim - 107) / 6) * (17.4636-(14.4636)));
            yy = -8.3889 + (((tickAnim - 107) / 6) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 107) / 6) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 17.4636 + (((tickAnim - 113) / 22) * (17.4636-(17.4636)));
            yy = -8.3889 + (((tickAnim - 113) / 22) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 113) / 22) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 17.4636 + (((tickAnim - 135) / 19) * (0-(17.4636)));
            yy = -8.3889 + (((tickAnim - 135) / 19) * (0-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 135) / 19) * (0-(-3.1398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -0.1 + (((tickAnim - 20) / 30) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -0.1 + (((tickAnim - 50) / 30) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 50) / 30) * (0.1-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (-0.225-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -0.1 + (((tickAnim - 80) / 13) * (-0.1-(-0.1)));
            yy = 0.1 + (((tickAnim - 80) / 13) * (0.1-(0.1)));
            zz = -0.225 + (((tickAnim - 80) / 13) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 93 && tickAnim < 107) {
            xx = -0.1 + (((tickAnim - 93) / 14) * (-0.1-(-0.1)));
            yy = 0.1 + (((tickAnim - 93) / 14) * (0.1-(0.1)));
            zz = -0.225 + (((tickAnim - 93) / 14) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 107 && tickAnim < 135) {
            xx = -0.1 + (((tickAnim - 107) / 28) * (-0.1-(-0.1)));
            yy = 0.1 + (((tickAnim - 107) / 28) * (0.1-(0.1)));
            zz = -0.225 + (((tickAnim - 107) / 28) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -0.1 + (((tickAnim - 135) / 19) * (0-(-0.1)));
            yy = 0.1 + (((tickAnim - 135) / 19) * (0-(0.1)));
            zz = -0.225 + (((tickAnim - 135) / 19) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.2887-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.4924-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (3.014-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.2887 + (((tickAnim - 20) / 15) * (3.9613-(-0.2887)));
            yy = -5.4924 + (((tickAnim - 20) / 15) * (-5.4924-(-5.4924)));
            zz = 3.014 + (((tickAnim - 20) / 15) * (3.014-(3.014)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.9613 + (((tickAnim - 35) / 15) * (6.7113-(3.9613)));
            yy = -5.4924 + (((tickAnim - 35) / 15) * (-5.4924-(-5.4924)));
            zz = 3.014 + (((tickAnim - 35) / 15) * (3.014-(3.014)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 6.7113 + (((tickAnim - 50) / 30) * (12.6746-(6.7113)));
            yy = -5.4924 + (((tickAnim - 50) / 30) * (-11.2314-(-5.4924)));
            zz = 3.014 + (((tickAnim - 50) / 30) * (-0.7136-(3.014)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 12.6746 + (((tickAnim - 80) / 7) * (9.9246-(12.6746)));
            yy = -11.2314 + (((tickAnim - 80) / 7) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 80) / 7) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = 9.9246 + (((tickAnim - 87) / 6) * (12.6746-(9.9246)));
            yy = -11.2314 + (((tickAnim - 87) / 6) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 87) / 6) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 12.6746 + (((tickAnim - 93) / 7) * (9.9246-(12.6746)));
            yy = -11.2314 + (((tickAnim - 93) / 7) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 93) / 7) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 9.9246 + (((tickAnim - 100) / 7) * (12.6746-(9.9246)));
            yy = -11.2314 + (((tickAnim - 100) / 7) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 100) / 7) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 12.6746 + (((tickAnim - 107) / 6) * (10.6746-(12.6746)));
            yy = -11.2314 + (((tickAnim - 107) / 6) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 107) / 6) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 10.6746 + (((tickAnim - 113) / 22) * (10.6746-(10.6746)));
            yy = -11.2314 + (((tickAnim - 113) / 22) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 113) / 22) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 10.6746 + (((tickAnim - 135) / 19) * (0-(10.6746)));
            yy = -11.2314 + (((tickAnim - 135) / 19) * (0-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 135) / 19) * (0-(-0.7136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.0516-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (6.1166-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.7799-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 135) {
            xx = 3.0516 + (((tickAnim - 20) / 115) * (3.0516-(3.0516)));
            yy = 6.1166 + (((tickAnim - 20) / 115) * (6.1166-(6.1166)));
            zz = -3.7799 + (((tickAnim - 20) / 115) * (-3.7799-(-3.7799)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 3.0516 + (((tickAnim - 135) / 19) * (0-(3.0516)));
            yy = 6.1166 + (((tickAnim - 135) / 19) * (0-(6.1166)));
            zz = -3.7799 + (((tickAnim - 135) / 19) * (0-(-3.7799)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 107 && tickAnim < 111) {
            xx = 1 + (((tickAnim - 107) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 107) / 4) * (-0.015-(1)));
            zz = 1 + (((tickAnim - 107) / 4) * (1-(1)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = 1 + (((tickAnim - 111) / 4) * (1-(1)));
            yy = -0.015 + (((tickAnim - 111) / 4) * (1-(-0.015)));
            zz = 1 + (((tickAnim - 111) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 53;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*20 + (((tickAnim - 0) / 17) * (13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*20)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 53) {
            xx = 13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*20 + (((tickAnim - 17) / 36) * (0-(13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*20)));
            yy = 0 + (((tickAnim - 17) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 10.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 7) / 10) * (7.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20-(10.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 53) {
            xx = 7.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20 + (((tickAnim - 17) / 36) * (0-(7.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20)));
            yy = 0 + (((tickAnim - 17) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (66.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 66.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120 + (((tickAnim - 7) / 6) * (0-(66.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -1.25 + (((tickAnim - 7) / 5) * (13.65-(-1.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 13.65 + (((tickAnim - 12) / 1) * (8.95-(13.65)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 8.95 + (((tickAnim - 13) / 4) * (5.5-(8.95)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 41) {
            xx = 5.5 + (((tickAnim - 17) / 24) * (-1.35-(5.5)));
            yy = 0 + (((tickAnim - 17) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 24) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = -1.35 + (((tickAnim - 41) / 12) * (0-(-1.35)));
            yy = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.975-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0.975 + (((tickAnim - 13) / 4) * (0.5-(0.975)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*-0.1-(0)));
            zz = 0.5 + (((tickAnim - 17) / 11) * (0.5-(0.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*-0.1 + (((tickAnim - 28) / 13) * (-0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*-0.1)));
            zz = 0.5 + (((tickAnim - 28) / 13) * (0.25-(0.5)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            yy = -0.05 + (((tickAnim - 41) / 12) * (0-(-0.05)));
            zz = 0.25 + (((tickAnim - 41) / 12) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);
        
    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.4908-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.3162-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.2594-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.4908 + (((tickAnim - 10) / 10) * (-6.5-(-3.4908)));
            yy = 4.3162 + (((tickAnim - 10) / 10) * (0-(4.3162)));
            zz = -3.2594 + (((tickAnim - 10) / 10) * (0-(-3.2594)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.5 + (((tickAnim - 20) / 10) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -6.5 + (((tickAnim - 30) / 10) * (-3.2475-(-6.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.1274-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (2.2464-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.2475 + (((tickAnim - 40) / 10) * (0-(-3.2475)));
            yy = 0.1274 + (((tickAnim - 40) / 10) * (0-(0.1274)));
            zz = 2.2464 + (((tickAnim - 40) / 10) * (0-(2.2464)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.85-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2.85 + (((tickAnim - 10) / 10) * (-5.8-(-2.85)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-0.15-(0)));
            zz = -5.8 + (((tickAnim - 20) / 10) * (-5.8-(-5.8)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.15 + (((tickAnim - 30) / 20) * (0-(-0.15)));
            zz = -5.8 + (((tickAnim - 30) / 20) * (0-(-5.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24.5 + (((tickAnim - 10) / 5) * (-21.5-(24.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -21.5 + (((tickAnim - 15) / 5) * (-19-(-21.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19 + (((tickAnim - 20) / 10) * (-20.25-(-19)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20.25 + (((tickAnim - 30) / 10) * (21.37-(-20.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 21.37 + (((tickAnim - 40) / 10) * (0-(21.37)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (25.4-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 25.4 + (((tickAnim - 13) / 2) * (30.81-(25.4)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 30.81 + (((tickAnim - 15) / 5) * (-5.25-(30.81)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.25 + (((tickAnim - 20) / 10) * (-3.5-(-5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -3.5 + (((tickAnim - 30) / 5) * (39-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 39 + (((tickAnim - 35) / 5) * (-11.25-(39)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 40) / 10) * (0-(-11.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29 + (((tickAnim - 10) / 3) * (39-(29)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 39 + (((tickAnim - 13) / 2) * (6.5-(39)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.5 + (((tickAnim - 15) / 3) * (0-(6.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (30-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 30 + (((tickAnim - 20) / 10) * (30-(30)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 30 + (((tickAnim - 30) / 5) * (23.87-(30)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 23.87 + (((tickAnim - 35) / 5) * (-5.75-(23.87)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 40) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (1.125-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 1.125 + (((tickAnim - 13) / 7) * (0-(1.125)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.8-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 35) / 5) * (0-(0.8)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
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
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -34.75 + (((tickAnim - 10) / 3) * (0-(-34.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -20.75 + (((tickAnim - 15) / 5) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-20.38-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -20.38 + (((tickAnim - 33) / 2) * (57.25-(-20.38)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 57.25 + (((tickAnim - 35) / 3) * (-8.88-(57.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -8.88 + (((tickAnim - 38) / 2) * (0-(-8.88)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
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
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-32.2166-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.0295-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.8593-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -32.2166 + (((tickAnim - 5) / 5) * (-18.9331-(-32.2166)));
            yy = 1.0295 + (((tickAnim - 5) / 5) * (2.059-(1.0295)));
            zz = 1.8593 + (((tickAnim - 5) / 5) * (3.7186-(1.8593)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.9331 + (((tickAnim - 10) / 10) * (-0.25-(-18.9331)));
            yy = 2.059 + (((tickAnim - 10) / 10) * (0-(2.059)));
            zz = 3.7186 + (((tickAnim - 10) / 10) * (0-(3.7186)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.25 + (((tickAnim - 20) / 10) * (-1.5-(-0.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 30) / 10) * (-15.25-(-1.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -15.25 + (((tickAnim - 40) / 5) * (-2.38-(-15.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -2.38 + (((tickAnim - 45) / 5) * (0-(-2.38)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (39.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 39.5 + (((tickAnim - 5) / 5) * (-7.5-(39.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 10) / 10) * (2.75-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.75 + (((tickAnim - 20) / 10) * (4-(2.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4 + (((tickAnim - 30) / 10) * (0-(4)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (34.75-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 34.75 + (((tickAnim - 45) / 5) * (0-(34.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.56-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 13.56 + (((tickAnim - 3) / 2) * (5.62-(13.56)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5.62 + (((tickAnim - 5) / 3) * (0-(5.62)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (27.25-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.25 + (((tickAnim - 10) / 10) * (2-(27.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2 + (((tickAnim - 20) / 10) * (2-(2)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 30) / 10) * (16.5-(2)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 16.5 + (((tickAnim - 40) / 5) * (-12.5-(16.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 45) / 5) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-24-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -24 + (((tickAnim - 5) / 5) * (0-(-24)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (46.75-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 46.75 + (((tickAnim - 45) / 5) * (0-(46.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.8559-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.7026-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.5955-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.8559 + (((tickAnim - 10) / 10) * (1.75-(0.8559)));
            yy = -3.7026 + (((tickAnim - 10) / 10) * (0-(-3.7026)));
            zz = 0.5955 + (((tickAnim - 10) / 10) * (0-(0.5955)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 20) / 30) * (0-(1.75)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.7033-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.6617-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.1693-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.7033 + (((tickAnim - 10) / 10) * (7.25-(3.7033)));
            yy = -7.6617 + (((tickAnim - 10) / 10) * (0-(-7.6617)));
            zz = -1.1693 + (((tickAnim - 10) / 10) * (0-(-1.1693)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 20) / 10) * (7.5-(7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 30) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.601-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (12.859-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.7015-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.601 + (((tickAnim - 10) / 10) * (3-(1.601)));
            yy = 12.859-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 10) / 10) * (0-(12.859-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            zz = -1.7015 + (((tickAnim - 10) / 10) * (0-(-1.7015)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 20) / 10) * (4.25-(3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 30) / 20) * (0-(4.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (16.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 16.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 3) / 7) * (14.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(16.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 14.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 10) / 10) * (0-(14.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-1-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 30) / 20) * (0-(-1)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-3-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 30) / 20) * (0-(-3)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3.25 + (((tickAnim - 10) / 10) * (0-(-3.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (4-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4 + (((tickAnim - 30) / 10) * (1.9999-(4)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.0174-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-0.4997-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.9999 + (((tickAnim - 40) / 10) * (0-(1.9999)));
            yy = 0.0174 + (((tickAnim - 40) / 10) * (0-(0.0174)));
            zz = -0.4997 + (((tickAnim - 40) / 10) * (0-(-0.4997)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-1.25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -1.25 + (((tickAnim - 40) / 10) * (0-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.9948-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.1839-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.6146-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.9948 + (((tickAnim - 5) / 5) * (-26.4896-(-0.9948)));
            yy = -0.1839 + (((tickAnim - 5) / 5) * (-0.3677-(-0.1839)));
            zz = -1.6146 + (((tickAnim - 5) / 5) * (-3.2292-(-1.6146)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -26.4896 + (((tickAnim - 10) / 10) * (-17.2396-(-26.4896)));
            yy = -0.3677 + (((tickAnim - 10) / 10) * (-0.3677-(-0.3677)));
            zz = -3.2292 + (((tickAnim - 10) / 10) * (-3.2292-(-3.2292)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -17.2396 + (((tickAnim - 20) / 10) * (-17.2396-(-17.2396)));
            yy = -0.3677 + (((tickAnim - 20) / 10) * (-0.3677-(-0.3677)));
            zz = -3.2292 + (((tickAnim - 20) / 10) * (-3.2292-(-3.2292)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -17.2396 + (((tickAnim - 30) / 10) * (-27.1198-(-17.2396)));
            yy = -0.3677 + (((tickAnim - 30) / 10) * (-0.1839-(-0.3677)));
            zz = -3.2292 + (((tickAnim - 30) / 10) * (-1.6146-(-3.2292)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -27.1198 + (((tickAnim - 40) / 5) * (17.4401-(-27.1198)));
            yy = -0.1839 + (((tickAnim - 40) / 5) * (-0.0919-(-0.1839)));
            zz = -1.6146 + (((tickAnim - 40) / 5) * (-0.8073-(-1.6146)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 17.4401 + (((tickAnim - 45) / 5) * (0-(17.4401)));
            yy = -0.0919 + (((tickAnim - 45) / 5) * (0-(-0.0919)));
            zz = -0.8073 + (((tickAnim - 45) / 5) * (0-(-0.8073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-31.3578-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.5089-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.9343-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -31.3578 + (((tickAnim - 5) / 5) * (27.7843-(-31.3578)));
            yy = 0.5089 + (((tickAnim - 5) / 5) * (1.0178-(0.5089)));
            zz = 1.9343 + (((tickAnim - 5) / 5) * (3.8686-(1.9343)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.7843 + (((tickAnim - 10) / 10) * (34.7606-(27.7843)));
            yy = 1.0178 + (((tickAnim - 10) / 10) * (0.8161-(1.0178)));
            zz = 3.8686 + (((tickAnim - 10) / 10) * (2.3821-(3.8686)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34.7606 + (((tickAnim - 20) / 10) * (33.7617-(34.7606)));
            yy = 0.8161 + (((tickAnim - 20) / 10) * (0.4562-(0.8161)));
            zz = 2.3821 + (((tickAnim - 20) / 10) * (2.9652-(2.3821)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 33.7617 + (((tickAnim - 30) / 10) * (24.6308-(33.7617)));
            yy = 0.4562 + (((tickAnim - 30) / 10) * (0.2281-(0.4562)));
            zz = 2.9652 + (((tickAnim - 30) / 10) * (1.4826-(2.9652)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 24.6308 + (((tickAnim - 40) / 5) * (-30.9346-(24.6308)));
            yy = 0.2281 + (((tickAnim - 40) / 5) * (0.1141-(0.2281)));
            zz = 1.4826 + (((tickAnim - 40) / 5) * (0.7413-(1.4826)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -30.9346 + (((tickAnim - 45) / 5) * (0-(-30.9346)));
            yy = 0.1141 + (((tickAnim - 45) / 5) * (0-(0.1141)));
            zz = 0.7413 + (((tickAnim - 45) / 5) * (0-(0.7413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 10) / 10) * (0.03-(-0.175)));
            zz = 0.325 + (((tickAnim - 10) / 10) * (0.33-(0.325)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.03 + (((tickAnim - 20) / 10) * (0.03-(0.03)));
            zz = 0.33 + (((tickAnim - 20) / 10) * (0.33-(0.33)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.03 + (((tickAnim - 30) / 20) * (0-(0.03)));
            zz = 0.33 + (((tickAnim - 30) / 20) * (0-(0.33)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (83.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.875-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 83.25 + (((tickAnim - 5) / 5) * (2.5-(83.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.875 + (((tickAnim - 5) / 5) * (1.75-(0.875)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 10) / 10) * (-12.25-(2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 1.75 + (((tickAnim - 10) / 10) * (1.75-(1.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.25 + (((tickAnim - 20) / 10) * (-10.75-(-12.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 1.75 + (((tickAnim - 20) / 10) * (0-(1.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10.75 + (((tickAnim - 30) / 10) * (7.12-(-10.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 7.12 + (((tickAnim - 40) / 5) * (96.06-(7.12)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 96.06 + (((tickAnim - 45) / 5) * (0-(96.06)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.04-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.65-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.04 + (((tickAnim - 5) / 5) * (-0.075-(-0.04)));
            zz = -0.65 + (((tickAnim - 5) / 5) * (0-(-0.65)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.075 + (((tickAnim - 10) / 10) * (-0.245-(-0.075)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.245 + (((tickAnim - 20) / 10) * (-0.245-(-0.245)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.245 + (((tickAnim - 30) / 10) * (0-(-0.245)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.99-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (-0.85-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.99 + (((tickAnim - 45) / 5) * (0-(0.99)));
            zz = -0.85 + (((tickAnim - 45) / 5) * (0-(-0.85)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (32.7132-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.5804-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.9867-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.7132 + (((tickAnim - 10) / 10) * (-17.25-(32.7132)));
            yy = -6.5804 + (((tickAnim - 10) / 10) * (0-(-6.5804)));
            zz = 4.9867 + (((tickAnim - 10) / 10) * (0-(4.9867)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -17.25 + (((tickAnim - 20) / 10) * (-17.25-(-17.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -17.25 + (((tickAnim - 30) / 5) * (27.94-(-17.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 27.94 + (((tickAnim - 35) / 5) * (31.12-(27.94)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 31.12 + (((tickAnim - 40) / 10) * (0-(31.12)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 10) / 5) * (-28.88-(17.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -28.88 + (((tickAnim - 15) / 5) * (37.75-(-28.88)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 37.75 + (((tickAnim - 20) / 10) * (33.75-(37.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 33.75 + (((tickAnim - 30) / 5) * (-21.19-(33.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -21.19 + (((tickAnim - 35) / 5) * (0-(-21.19)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
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
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.3 + (((tickAnim - 20) / 10) * (0.3-(0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (-0.15-(0)));
            zz = 0.3 + (((tickAnim - 30) / 15) * (-0.07-(0.3)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 45) / 5) * (0-(-0.15)));
            zz = -0.07 + (((tickAnim - 45) / 5) * (0-(-0.07)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (121.9-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 121.9 + (((tickAnim - 13) / 2) * (88.81-(121.9)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 88.81 + (((tickAnim - 15) / 5) * (-14.25-(88.81)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -14.25 + (((tickAnim - 20) / 10) * (-10.75-(-14.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -10.75 + (((tickAnim - 30) / 5) * (89.69-(-10.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 89.69 + (((tickAnim - 35) / 5) * (19-(89.69)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 19 + (((tickAnim - 40) / 5) * (-14-(19)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 45) / 5) * (0-(-14)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.825-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 15) / 5) * (-0.2-(-0.15)));
            zz = -0.825 + (((tickAnim - 15) / 5) * (0-(-0.825)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 10) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 30) / 5) * (0.925-(-0.2)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.725-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.925 + (((tickAnim - 35) / 5) * (0-(0.925)));
            zz = -0.725 + (((tickAnim - 35) / 5) * (0-(-0.725)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = -0.575 + (((tickAnim - 45) / 5) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.251-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.2495-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.0491-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.251 + (((tickAnim - 10) / 10) * (-10.25-(-6.251)));
            yy = -2.2495 + (((tickAnim - 10) / 10) * (0-(-2.2495)));
            zz = 0.0491 + (((tickAnim - 10) / 10) * (0-(0.0491)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.25 + (((tickAnim - 20) / 10) * (-12.5-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 30) / 8) * (-12.25-(-12.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -12.25 + (((tickAnim - 38) / 6) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -7 + (((tickAnim - 30) / 4) * (0-(-7)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 44) / 6) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.75 + (((tickAnim - 10) / 10) * (-16.75-(-11.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16.75 + (((tickAnim - 20) / 10) * (-13-(-16.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -13 + (((tickAnim - 30) / 4) * (0-(-13)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 34) / 10) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 44) / 6) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27 + (((tickAnim - 10) / 10) * (39.75-(27)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 39.75 + (((tickAnim - 20) / 10) * (35.75-(39.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 35.75 + (((tickAnim - 30) / 4) * (0-(35.75)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 37) / 7) * (43.75-(0)));
            yy = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 43.75 + (((tickAnim - 44) / 6) * (0-(43.75)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 18.75 + (((tickAnim - 34) / 4) * (20.44-(18.75)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 20.44 + (((tickAnim - 38) / 6) * (0-(20.44)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -4.75 + (((tickAnim - 10) / 10) * (0-(-4.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-4.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -4.75 + (((tickAnim - 30) / 10) * (0-(-4.75)));
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
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 46.75 + (((tickAnim - 10) / 10) * (0-(46.75)));
            yy = 22.25 + (((tickAnim - 10) / 10) * (0-(22.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (46.75-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (22.25-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 46.75 + (((tickAnim - 30) / 10) * (-16.75-(46.75)));
            yy = 22.25 + (((tickAnim - 30) / 10) * (0-(22.25)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 40) / 10) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.5858-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.0824-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (13.8509-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.5858 + (((tickAnim - 10) / 5) * (-36.5-(-0.5858)));
            yy = -3.0824 + (((tickAnim - 10) / 5) * (0-(-3.0824)));
            zz = 13.8509 + (((tickAnim - 10) / 5) * (0-(13.8509)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36.5 + (((tickAnim - 15) / 5) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-0.5858-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-3.0824-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (13.8509-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.5858 + (((tickAnim - 30) / 5) * (-36.5-(-0.5858)));
            yy = -3.0824 + (((tickAnim - 30) / 5) * (0-(-3.0824)));
            zz = 13.8509 + (((tickAnim - 30) / 5) * (0-(13.8509)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -36.5 + (((tickAnim - 35) / 5) * (6.5-(-36.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 40) / 10) * (0-(6.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.587-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 25.587 + (((tickAnim - 10) / 5) * (75.5-(25.587)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 75.5 + (((tickAnim - 15) / 5) * (0-(75.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (25.587-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 25.587 + (((tickAnim - 30) / 5) * (75.5-(25.587)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 75.5 + (((tickAnim - 35) / 5) * (12-(75.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 40) / 10) * (0-(12)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
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
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.95-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 15) / 5) * (0-(0.525)));
            zz = -0.95 + (((tickAnim - 15) / 5) * (0-(-0.95)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.95-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 35) / 5) * (0-(0.525)));
            zz = -0.95 + (((tickAnim - 35) / 5) * (0-(-0.95)));
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
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 10 + (((tickAnim - 10) / 10) * (0-(10)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (10-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 10 + (((tickAnim - 30) / 10) * (0-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.0219-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.6587-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5.2295-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.0219 + (((tickAnim - 10) / 10) * (0-(-0.0219)));
            yy = -1.6587 + (((tickAnim - 10) / 10) * (0-(-1.6587)));
            zz = -5.2295 + (((tickAnim - 10) / 10) * (0-(-5.2295)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-0.0219-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-1.6587-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-5.2295-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.0219 + (((tickAnim - 30) / 10) * (0-(-0.0219)));
            yy = -1.6587 + (((tickAnim - 30) / 10) * (0-(-1.6587)));
            zz = -5.2295 + (((tickAnim - 30) / 10) * (0-(-5.2295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 4.75 + (((tickAnim - 10) / 10) * (0-(4.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (4.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 4.75 + (((tickAnim - 30) / 10) * (0-(4.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -12.75 + (((tickAnim - 16) / 18) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -12.75 + (((tickAnim - 34) / 16) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-3.375-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (1.55-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = -3.375 + (((tickAnim - 16) / 18) * (-3.375-(-3.375)));
            zz = 1.55 + (((tickAnim - 16) / 18) * (1.55-(1.55)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -3.375 + (((tickAnim - 34) / 16) * (0-(-3.375)));
            zz = 1.55 + (((tickAnim - 34) / 16) * (0-(1.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -17.75 + (((tickAnim - 16) / 18) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 34) / 16) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 39.75 + (((tickAnim - 16) / 18) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 39.75 + (((tickAnim - 34) / 16) * (0-(39.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -9.75 + (((tickAnim - 16) / 18) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 34) / 16) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.275-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = 0.55 + (((tickAnim - 16) / 18) * (0.55-(0.55)));
            zz = 0.275 + (((tickAnim - 16) / 18) * (0.275-(0.275)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.55 + (((tickAnim - 34) / 16) * (0-(0.55)));
            zz = 0.275 + (((tickAnim - 34) / 16) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -17.75 + (((tickAnim - 16) / 18) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 34) / 16) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 39.75 + (((tickAnim - 16) / 18) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 39.75 + (((tickAnim - 34) / 16) * (0-(39.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -9.75 + (((tickAnim - 16) / 18) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 34) / 16) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.275-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = 0.55 + (((tickAnim - 16) / 18) * (0.55-(0.55)));
            zz = 0.275 + (((tickAnim - 16) / 18) * (0.275-(0.275)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.55 + (((tickAnim - 34) / 16) * (0-(0.55)));
            zz = 0.275 + (((tickAnim - 34) / 16) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 11 + (((tickAnim - 16) / 18) * (11-(11)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 11 + (((tickAnim - 34) / 16) * (0-(11)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (18.5-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 18.5 + (((tickAnim - 16) / 18) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 18.5 + (((tickAnim - 34) / 16) * (0-(18.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 5.5 + (((tickAnim - 8) / 8) * (0-(5.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -1 + (((tickAnim - 4) / 4) * (2-(-1)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2 + (((tickAnim - 8) / 8) * (-2.75-(2)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -2.75 + (((tickAnim - 16) / 18) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 34) / 16) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -9.25 + (((tickAnim - 16) / 18) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 34) / 16) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 4 + (((tickAnim - 16) / 18) * (4-(4)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 34) / 16) * (0-(4)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 6.5 + (((tickAnim - 16) / 18) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 34) / 16) * (0-(6.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -7.75 + (((tickAnim - 16) / 18) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 34) / 16) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -13.25 + (((tickAnim - 16) / 18) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 34) / 16) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 23.5 + (((tickAnim - 16) / 18) * (23.5-(23.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 23.5 + (((tickAnim - 34) / 16) * (0-(23.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -7.75 + (((tickAnim - 16) / 18) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 34) / 16) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -13.25 + (((tickAnim - 16) / 18) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 34) / 16) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 23.5 + (((tickAnim - 16) / 18) * (23.5-(23.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 23.5 + (((tickAnim - 34) / 16) * (0-(23.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 4 + (((tickAnim - 8) / 8) * (0-(4)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 34) / 16) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -6 + (((tickAnim - 8) / 8) * (0-(-6)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (6.5-(0)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 34) / 16) * (0-(6.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 7 + (((tickAnim - 8) / 8) * (0-(7)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.75 + (((tickAnim - 8) / 8) * (0-(2.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.8748-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5169-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.7841-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.8748 + (((tickAnim - 3) / 4) * (7.1875-(0.8748)));
            yy = 0.5169 + (((tickAnim - 3) / 4) * (0-(0.5169)));
            zz = 0.7841 + (((tickAnim - 3) / 4) * (-1.0625-(0.7841)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 7.1875 + (((tickAnim - 7) / 3) * (9.75-(7.1875)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -1.0625 + (((tickAnim - 7) / 3) * (-4.25-(-1.0625)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 9.75 + (((tickAnim - 10) / 4) * (-9.4063-(9.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = -4.25 + (((tickAnim - 10) / 4) * (-3.7188-(-4.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -9.4063 + (((tickAnim - 14) / 7) * (-8.4063-(-9.4063)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 14) / 7) * (-3.7188-(-3.7188)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -8.4063 + (((tickAnim - 21) / 6) * (-13.3125-(-8.4063)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 21) / 6) * (-3.1875-(-3.7188)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -13.3125 + (((tickAnim - 27) / 4) * (0-(-13.3125)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = -3.1875 + (((tickAnim - 27) / 4) * (0-(-3.1875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.9689-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.5076-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-13.6432-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.9689 + (((tickAnim - 7) / 3) * (27-(4.9689)));
            yy = -0.5076 + (((tickAnim - 7) / 3) * (0-(-0.5076)));
            zz = -13.6432 + (((tickAnim - 7) / 3) * (-12.25-(-13.6432)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 27 + (((tickAnim - 10) / 4) * (-12.7269-(27)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.772-(0)));
            zz = -12.25 + (((tickAnim - 10) / 4) * (3.4139-(-12.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.7269 + (((tickAnim - 14) / 4) * (1.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 14) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 14) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.5 + (((tickAnim - 18) / 3) * (4-(1.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 4 + (((tickAnim - 21) / 3) * (-12.7269-(4)));
            yy = 0 + (((tickAnim - 21) / 3) * (0.772-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (3.4139-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -12.7269 + (((tickAnim - 24) / 4) * (7.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 24) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 24) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 7.5 + (((tickAnim - 28) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (21-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 7) / 3) * (0-(21)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (22.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 14) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (29.25-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 29.25 + (((tickAnim - 24) / 4) * (0-(29.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.5263-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.309-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (11.1116-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.5263 + (((tickAnim - 5) / 5) * (-25.3229-(-7.5263)));
            yy = -7.309 + (((tickAnim - 5) / 5) * (-10.6254-(-7.309)));
            zz = 11.1116 + (((tickAnim - 5) / 5) * (20.1352-(11.1116)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -25.3229 + (((tickAnim - 10) / 3) * (-4.6615-(-25.3229)));
            yy = -10.6254 + (((tickAnim - 10) / 3) * (-5.3127-(-10.6254)));
            zz = 20.1352 + (((tickAnim - 10) / 3) * (10.0676-(20.1352)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.6615 + (((tickAnim - 13) / 2) * (0-(-4.6615)));
            yy = -5.3127 + (((tickAnim - 13) / 2) * (0-(-5.3127)));
            zz = 10.0676 + (((tickAnim - 13) / 2) * (0-(10.0676)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 15) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 8) * (0-(36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80 + (((tickAnim - 7) / 2) * (-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150-(-24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150 + (((tickAnim - 9) / 6) * (0-(-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 41.25 + (((tickAnim - 7) / 2) * (0-(41.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(0);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(0);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (4.25-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 4.25 + (((tickAnim - 9) / 6) * (0-(4.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0.575 + (((tickAnim - 7) / 2) * (0.325-(0.575)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0.325 + (((tickAnim - 9) / 6) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*-12), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*-1.59);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -7.1891 + (((tickAnim - 0) / 6) * (24.75-(-7.1891)));
            yy = -9.2354 + (((tickAnim - 0) / 6) * (0-(-9.2354)));
            zz = -0.8506 + (((tickAnim - 0) / 6) * (0-(-0.8506)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 24.75 + (((tickAnim - 6) / 5) * (88.7879-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(24.75)));
            yy = 0 + (((tickAnim - 6) / 5) * (-4.0664-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0.849-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 88.7879-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 11) / 2) * (-16.9391-(88.7879-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = -4.0664 + (((tickAnim - 11) / 2) * (-9.2354-(-4.0664)));
            zz = 0.849 + (((tickAnim - 11) / 2) * (-0.8506-(0.849)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -16.9391 + (((tickAnim - 13) / 2) * (-7.1891-(-16.9391)));
            yy = -9.2354 + (((tickAnim - 13) / 2) * (-9.2354-(-9.2354)));
            zz = -0.8506 + (((tickAnim - 13) / 2) * (-0.8506-(-0.8506)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -4 + (((tickAnim - 0) / 6) * (13.25-(-4)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 13.25 + (((tickAnim - 6) / 4) * (216.645-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450-(13.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 216.645-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450 + (((tickAnim - 10) / 3) * (-10.75-(216.645-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -10.75 + (((tickAnim - 13) / 2) * (-4-(-10.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
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
            xx = 20.9949 + (((tickAnim - 0) / 2) * (20.4968-(20.9949)));
            yy = 0.2956 + (((tickAnim - 0) / 2) * (0.1847-(0.2956)));
            zz = -1.9781 + (((tickAnim - 0) / 2) * (-1.2363-(-1.9781)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 20.4968 + (((tickAnim - 2) / 4) * (34.5-(20.4968)));
            yy = 0.1847 + (((tickAnim - 2) / 4) * (0-(0.1847)));
            zz = -1.2363 + (((tickAnim - 2) / 4) * (0-(-1.2363)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 34.5 + (((tickAnim - 6) / 4) * (-103.8776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250-(34.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.1478-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0.989-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -103.8776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250 + (((tickAnim - 10) / 3) * (31.2449-(-103.8776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250)));
            yy = -0.1478 + (((tickAnim - 10) / 3) * (0.2956-(-0.1478)));
            zz = 0.989 + (((tickAnim - 10) / 3) * (-1.9781-(0.989)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 31.2449 + (((tickAnim - 13) / 2) * (20.9949-(31.2449)));
            yy = 0.2956 + (((tickAnim - 13) / 2) * (0.2956-(0.2956)));
            zz = -1.9781 + (((tickAnim - 13) / 2) * (-1.9781-(-1.9781)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 2) * (0-(0.075)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0.125-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 3) * (0.2-(1)));
            zz = 0.125 + (((tickAnim - 10) / 3) * (0-(0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 13) / 2) * (0.075-(0.2)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-27.7-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -27.7 + (((tickAnim - 3) / 1) * (-40.75-(-27.7)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -40.75 + (((tickAnim - 4) / 2) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (113.945-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*600-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 113.945-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*600 + (((tickAnim - 11) / 2) * (0-(113.945-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*600)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
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
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.525-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.405-(0)));
            zz = 0.525 + (((tickAnim - 3) / 1) * (0.43-(0.525)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.405 + (((tickAnim - 4) / 2) * (-0.25-(-0.405)));
            zz = 0.43 + (((tickAnim - 4) / 2) * (0.25-(0.43)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 6) / 5) * (0.9-(-0.25)));
            zz = 0.25 + (((tickAnim - 6) / 5) * (0.425-(0.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.9 + (((tickAnim - 11) / 2) * (0-(0.9)));
            zz = 0.425 + (((tickAnim - 11) / 2) * (0-(0.425)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
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
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -13.4391 + (((tickAnim - 0) / 7) * (24.75-(-13.4391)));
            yy = 9.2354 + (((tickAnim - 0) / 7) * (0-(9.2354)));
            zz = 0.8506 + (((tickAnim - 0) / 7) * (0-(0.8506)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 24.75 + (((tickAnim - 7) / 4) * (70.6629-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(24.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (4.0664-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-0.849-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 70.6629-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 11) / 4) * (-13.4391-(70.6629-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 4.0664 + (((tickAnim - 11) / 4) * (9.2354-(4.0664)));
            zz = -0.849 + (((tickAnim - 11) / 4) * (0.8506-(-0.849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -10.75 + (((tickAnim - 0) / 7) * (13.25-(-10.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 13.25 + (((tickAnim - 7) / 4) * (225.82-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450-(13.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 225.82-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450 + (((tickAnim - 11) / 2) * (-27.53-(225.82-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -27.53 + (((tickAnim - 13) / 2) * (-10.75-(-27.53)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (1.225-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.225 + (((tickAnim - 13) / 2) * (0-(1.225)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 33.9949 + (((tickAnim - 0) / 2) * (20.4968-(33.9949)));
            yy = -0.2956 + (((tickAnim - 0) / 2) * (-0.1847-(-0.2956)));
            zz = 1.9781 + (((tickAnim - 0) / 2) * (1.2363-(1.9781)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 20.4968 + (((tickAnim - 2) / 5) * (34.5-(20.4968)));
            yy = -0.1847 + (((tickAnim - 2) / 5) * (0-(-0.1847)));
            zz = 1.2363 + (((tickAnim - 2) / 5) * (0-(1.2363)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 34.5 + (((tickAnim - 7) / 5) * (-94.9776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250-(34.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (-0.1478-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.989-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -94.9776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250 + (((tickAnim - 12) / 3) * (33.9949-(-94.9776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250)));
            yy = -0.1478 + (((tickAnim - 12) / 3) * (-0.2956-(-0.1478)));
            zz = 0.989 + (((tickAnim - 12) / 3) * (1.9781-(0.989)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.125-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 12) / 3) * (-0.1-(1)));
            zz = 0.125 + (((tickAnim - 12) / 3) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-27.7-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -27.7 + (((tickAnim - 4) / 1) * (-40.75-(-27.7)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -40.75 + (((tickAnim - 5) / 2) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (-630.855-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*800-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -630.855-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*800 + (((tickAnim - 12) / 3) * (0-(-630.855-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*800)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0.525-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (-0.405-(0)));
            zz = 0.525 + (((tickAnim - 4) / 1) * (0.43-(0.525)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.405 + (((tickAnim - 5) / 2) * (-0.25-(-0.405)));
            zz = 0.43 + (((tickAnim - 5) / 2) * (0.25-(0.43)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 7) / 5) * (-0.125-(-0.25)));
            zz = 0.25 + (((tickAnim - 7) / 5) * (0.425-(0.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.125 + (((tickAnim - 12) / 3) * (0-(-0.125)));
            zz = 0.425 + (((tickAnim - 12) / 3) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-12), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(3.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*12), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(4.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*12), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*12), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*12), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*12), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*6), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0.35);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*8), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 32.2809 + (((tickAnim - 0) / 4) * (67.8743-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450-(32.2809)));
            yy = 0.5694 + (((tickAnim - 0) / 4) * (8.2216-(0.5694)));
            zz = 0.3958 + (((tickAnim - 0) / 4) * (-17.5984-(0.3958)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 67.8743-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450 + (((tickAnim - 4) / 4) * (-30.5-(67.8743-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450)));
            yy = 8.2216 + (((tickAnim - 4) / 4) * (0-(8.2216)));
            zz = -17.5984 + (((tickAnim - 4) / 4) * (0-(-17.5984)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -30.5 + (((tickAnim - 8) / 1) * (1.921-(-30.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (-1.0049-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.5934-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 1.921 + (((tickAnim - 9) / 6) * (32.2809-(1.921)));
            yy = -1.0049 + (((tickAnim - 9) / 6) * (0.5694-(-1.0049)));
            zz = 0.5934 + (((tickAnim - 9) / 6) * (0.3958-(0.5934)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6.6662 + (((tickAnim - 0) / 4) * (470.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-550-(-6.6662)));
            yy = 9.1417 + (((tickAnim - 0) / 4) * (0-(9.1417)));
            zz = 8.5046 + (((tickAnim - 0) / 4) * (6.2499-(8.5046)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 470.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-550 + (((tickAnim - 4) / 4) * (18-(470.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-550)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 6.2499 + (((tickAnim - 4) / 4) * (0-(6.2499)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 18 + (((tickAnim - 8) / 1) * (-24.8889-(18)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-2.7778-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -24.8889 + (((tickAnim - 9) / 6) * (-6.6662-(-24.8889)));
            yy = 0 + (((tickAnim - 9) / 6) * (9.1417-(0)));
            zz = -2.7778 + (((tickAnim - 9) / 6) * (8.5046-(-2.7778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.45 + (((tickAnim - 0) / 4) * (0-(0.45)));
            yy = 0.4 + (((tickAnim - 0) / 4) * (-0.8-(0.4)));
            zz = 0.2 + (((tickAnim - 0) / 4) * (0-(0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.8 + (((tickAnim - 4) / 4) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0.45-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.4-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 91.2247 + (((tickAnim - 0) / 2) * (137-(91.2247)));
            yy = -7.1912 + (((tickAnim - 0) / 2) * (0-(-7.1912)));
            zz = 8.3457 + (((tickAnim - 0) / 2) * (0-(8.3457)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 137 + (((tickAnim - 2) / 2) * (89-(137)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 89 + (((tickAnim - 4) / 2) * (26.75-(89)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 6) / 2) * (12-(26.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 12 + (((tickAnim - 8) / 1) * (25-(12)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 25 + (((tickAnim - 9) / 2) * (5-(25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 11) / 2) * (53.35-(5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 53.35 + (((tickAnim - 13) / 2) * (91.2247-(53.35)));
            yy = 0 + (((tickAnim - 13) / 2) * (-7.1912-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (8.3457-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.085-(0)));
            zz = -0.6 + (((tickAnim - 0) / 2) * (-0.47-(-0.6)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.085 + (((tickAnim - 2) / 2) * (0.575-(-0.085)));
            zz = -0.47 + (((tickAnim - 2) / 2) * (-0.95-(-0.47)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 4) / 2) * (0-(0.575)));
            zz = -0.95 + (((tickAnim - 4) / 2) * (0-(-0.95)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.035-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.2-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.035 + (((tickAnim - 9) / 2) * (1.475-(0.035)));
            zz = 0.2 + (((tickAnim - 9) / 2) * (0-(0.2)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.475 + (((tickAnim - 11) / 2) * (2.555-(1.475)));
            zz = 0 + (((tickAnim - 11) / 2) * (-0.685-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2.555 + (((tickAnim - 13) / 2) * (0-(2.555)));
            zz = -0.685 + (((tickAnim - 13) / 2) * (-0.6-(-0.685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 32.2809 + (((tickAnim - 0) / 4) * (67.8743-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450-(32.2809)));
            yy = -0.5694 + (((tickAnim - 0) / 4) * (-8.2216-(-0.5694)));
            zz = -0.3958 + (((tickAnim - 0) / 4) * (17.5984-(-0.3958)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 67.8743-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450 + (((tickAnim - 4) / 3) * (-30.5-(67.8743-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450)));
            yy = -8.2216 + (((tickAnim - 4) / 3) * (0-(-8.2216)));
            zz = 17.5984 + (((tickAnim - 4) / 3) * (0-(17.5984)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -30.5 + (((tickAnim - 7) / 2) * (1.921-(-30.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (-1.0049-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0.5934-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 1.921 + (((tickAnim - 9) / 6) * (32.2809-(1.921)));
            yy = -1.0049 + (((tickAnim - 9) / 6) * (-0.5694-(-1.0049)));
            zz = 0.5934 + (((tickAnim - 9) / 6) * (-0.3958-(0.5934)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6.6662 + (((tickAnim - 0) / 4) * (470.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-550-(-6.6662)));
            yy = -9.1417 + (((tickAnim - 0) / 4) * (0-(-9.1417)));
            zz = -8.5046 + (((tickAnim - 0) / 4) * (-6.2499-(-8.5046)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 470.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-550 + (((tickAnim - 4) / 3) * (32-(470.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-550)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = -6.2499 + (((tickAnim - 4) / 3) * (0-(-6.2499)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 32 + (((tickAnim - 7) / 2) * (-23.8889-(32)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-2.7778-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -23.8889 + (((tickAnim - 9) / 6) * (-6.6662-(-23.8889)));
            yy = 0 + (((tickAnim - 9) / 6) * (-9.1417-(0)));
            zz = -2.7778 + (((tickAnim - 9) / 6) * (-8.5046-(-2.7778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.45 + (((tickAnim - 0) / 4) * (0-(-0.45)));
            yy = 0.4 + (((tickAnim - 0) / 4) * (-0.8-(0.4)));
            zz = 0.2 + (((tickAnim - 0) / 4) * (0-(0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.8 + (((tickAnim - 4) / 3) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 4) / 3) * (0.375-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0.205-(0)));
            zz = 0.375 + (((tickAnim - 7) / 4) * (0.415-(0.375)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-0.45-(0)));
            yy = 0.205 + (((tickAnim - 11) / 4) * (0.4-(0.205)));
            zz = 0.415 + (((tickAnim - 11) / 4) * (0.2-(0.415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 110.4747 + (((tickAnim - 0) / 2) * (137-(110.4747)));
            yy = 7.1912 + (((tickAnim - 0) / 2) * (0-(7.1912)));
            zz = -8.3457 + (((tickAnim - 0) / 2) * (0-(-8.3457)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 137 + (((tickAnim - 2) / 2) * (89-(137)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 89 + (((tickAnim - 4) / 3) * (3.75-(89)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 3.75 + (((tickAnim - 7) / 2) * (25-(3.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 25 + (((tickAnim - 9) / 2) * (7.25-(25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 7.25 + (((tickAnim - 11) / 2) * (18.75-(7.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 18.75 + (((tickAnim - 13) / 2) * (110.4747-(18.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (7.1912-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-8.3457-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.085-(0)));
            zz = -0.6 + (((tickAnim - 0) / 2) * (-0.47-(-0.6)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.085 + (((tickAnim - 2) / 2) * (0.575-(-0.085)));
            zz = -0.47 + (((tickAnim - 2) / 2) * (-0.95-(-0.47)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 4) / 3) * (-0.2-(0.575)));
            zz = -0.95 + (((tickAnim - 4) / 3) * (0-(-0.95)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 7) / 2) * (0.035-(-0.2)));
            zz = 0 + (((tickAnim - 7) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.035 + (((tickAnim - 9) / 2) * (1.3-(0.035)));
            zz = 0.2 + (((tickAnim - 9) / 2) * (0-(0.2)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.3 + (((tickAnim - 11) / 2) * (2.155-(1.3)));
            zz = 0 + (((tickAnim - 11) / 2) * (-0.36-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2.155 + (((tickAnim - 13) / 2) * (0-(2.155)));
            zz = -0.36 + (((tickAnim - 13) / 2) * (-0.6-(-0.36)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*-8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*3), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 8) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 13) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);
       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKostensuchus entity = (EntityPrehistoricFloraKostensuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-30))*2), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-30))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+30))*0.2);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -12.145 + (((tickAnim - 0) / 13) * (23-(-12.145)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 23 + (((tickAnim - 13) / 2) * (-65.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*150-(23)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = -65.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*150 + (((tickAnim - 15) / 12) * (-21.25-(-65.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*150)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -21.25 + (((tickAnim - 27) / 3) * (-12.145-(-21.25)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -1.91 + (((tickAnim - 0) / 13) * (6.75-(-1.91)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.75 + (((tickAnim - 13) / 2) * (53.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300-80))*50-(6.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 53.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300-80))*50 + (((tickAnim - 15) / 12) * (-5-(53.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300-80))*50)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 27) / 3) * (-1.91-(-5)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.45 + (((tickAnim - 0) / 6) * (6.47-(12.45)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 6.47 + (((tickAnim - 6) / 7) * (32-(6.47)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 32 + (((tickAnim - 13) / 2) * (-10.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150-(32)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -10.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 15) / 8) * (-362.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*350-(-10.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -362.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*350 + (((tickAnim - 23) / 4) * (24.75-(-362.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*350)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 24.75 + (((tickAnim - 27) / 3) * (12.45-(24.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0.2-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0.125-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 4) * (0-(0.2)));
            zz = 0.125 + (((tickAnim - 23) / 4) * (0-(0.125)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-31-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -31 + (((tickAnim - 13) / 2) * (12.15-(-31)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 12.15 + (((tickAnim - 15) / 3) * (56.135-(12.15)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 56.135 + (((tickAnim - 18) / 3) * (487.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*590-(56.135)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 487.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*590 + (((tickAnim - 21) / 6) * (0-(487.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*590)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0.325-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 13) / 2) * (0-(-0.325)));
            zz = 0.325 + (((tickAnim - 13) / 2) * (0-(0.325)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 15.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 12) * (-20.25-(15.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = -20.25 + (((tickAnim - 12) / 16) * (23-(-20.25)));
            yy = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 23 + (((tickAnim - 28) / 2) * (159.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(23)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 25.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-50 + (((tickAnim - 0) / 12) * (-5-(25.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-50)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 12) / 16) * (6.75-(-5)));
            yy = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 6.75 + (((tickAnim - 28) / 2) * (25.55-(6.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 0) / 8) * (-86.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*100-(32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -86.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*100 + (((tickAnim - 8) / 4) * (24.75-(-86.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*100)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 24.75 + (((tickAnim - 12) / 6) * (3.675-(24.75)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 3.675 + (((tickAnim - 18) / 10) * (32-(3.675)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 32 + (((tickAnim - 28) / 2) * (32-(32)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 4) * (0-(0.2)));
            zz = 0.125 + (((tickAnim - 8) / 4) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (42.71-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 42.71 + (((tickAnim - 3) / 3) * (126.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400-(42.71)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 126.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400 + (((tickAnim - 6) / 6) * (0-(126.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-31.5-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -31.5 + (((tickAnim - 23) / 5) * (-31-(-31.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -31 + (((tickAnim - 28) / 2) * (0-(-31)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.49-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0.26-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.49 + (((tickAnim - 23) / 5) * (-0.325-(0.49)));
            zz = 0.26 + (((tickAnim - 23) / 5) * (0.325-(0.26)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 28) / 2) * (0-(-0.325)));
            zz = 0.325 + (((tickAnim - 28) / 2) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+30))*-2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+10))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*-2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+100))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-2), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*-4), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-4));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-6), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*7), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-6));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+90))*2.5), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-30))*-2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-2.5), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-2));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -13.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 7) * (-34-(-13.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = -34 + (((tickAnim - 7) / 16) * (-46.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-70-(-34)));
            yy = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 16) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -46.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-70 + (((tickAnim - 23) / 7) * (-14-(-46.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-70)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 81.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150 + (((tickAnim - 0) / 7) * (26-(81.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 26 + (((tickAnim - 7) / 16) * (34.5-(26)));
            yy = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 16) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 34.5 + (((tickAnim - 23) / 2) * (21.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-250-(34.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 21.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-250 + (((tickAnim - 25) / 5) * (-32.9-(21.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-250)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 7) * (0-(-0.2)));
            zz = 0.25 + (((tickAnim - 0) / 7) * (0.2-(0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (1.67-(0)));
            zz = 0.2 + (((tickAnim - 7) / 11) * (0.22-(0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.67 + (((tickAnim - 18) / 5) * (1.75-(1.67)));
            zz = 0.22 + (((tickAnim - 18) / 5) * (0.3-(0.22)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.75 + (((tickAnim - 23) / 5) * (-0.205-(1.75)));
            zz = 0.3 + (((tickAnim - 23) / 5) * (0.26-(0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -0.205 + (((tickAnim - 28) / 2) * (-0.2-(-0.205)));
            zz = 0.26 + (((tickAnim - 28) / 2) * (0.25-(0.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 81.5 + (((tickAnim - 0) / 7) * (7.25-(81.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 7.25 + (((tickAnim - 7) / 4) * (-1.78-(7.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -1.78 + (((tickAnim - 11) / 3) * (-6.71-(-1.78)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -6.71 + (((tickAnim - 14) / 4) * (-2.88-(-6.71)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -2.88 + (((tickAnim - 18) / 5) * (70.5-(-2.88)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 70.5 + (((tickAnim - 23) / 2) * (125-(70.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 125 + (((tickAnim - 25) / 5) * (81.5-(125)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.1-(0)));
            zz = -0.275 + (((tickAnim - 0) / 7) * (0-(-0.275)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 7) / 4) * (0.595-(0.1)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.595 + (((tickAnim - 11) / 3) * (0.5-(0.595)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 14) / 4) * (0-(0.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (1.47-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-0.37-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.47 + (((tickAnim - 20) / 3) * (1.5-(1.47)));
            zz = -0.37 + (((tickAnim - 20) / 3) * (-0.525-(-0.37)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 1.5 + (((tickAnim - 23) / 2) * (0.455-(1.5)));
            zz = -0.525 + (((tickAnim - 23) / 2) * (-0.765-(-0.525)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.455 + (((tickAnim - 25) / 3) * (0.855-(0.455)));
            zz = -0.765 + (((tickAnim - 25) / 3) * (-0.995-(-0.765)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0.855 + (((tickAnim - 28) / 2) * (0-(0.855)));
            zz = -0.995 + (((tickAnim - 28) / 2) * (-0.275-(-0.995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24.775-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 24.775 + (((tickAnim - 8) / 12) * (-34-(24.775)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -34 + (((tickAnim - 20) / 10) * (0-(-34)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18.5 + (((tickAnim - 0) / 8) * (34.5-(18.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 34.5 + (((tickAnim - 8) / 2) * (-141.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-250-(34.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -141.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-250 + (((tickAnim - 10) / 5) * (-32.9-(-141.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-250)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -32.9 + (((tickAnim - 15) / 5) * (26.5-(-32.9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 26.5 + (((tickAnim - 20) / 10) * (18.5-(26.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 8) * (1.75-(0.525)));
            zz = 0.175 + (((tickAnim - 0) / 8) * (0.3-(0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.75 + (((tickAnim - 8) / 5) * (-0.205-(1.75)));
            zz = 0.3 + (((tickAnim - 8) / 5) * (0.26-(0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.205 + (((tickAnim - 13) / 2) * (-0.2-(-0.205)));
            zz = 0.26 + (((tickAnim - 13) / 2) * (0.25-(0.26)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 5) * (0-(-0.2)));
            zz = 0.25 + (((tickAnim - 15) / 5) * (0-(0.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.525-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0.175-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -18 + (((tickAnim - 0) / 8) * (70.5-(-18)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 70.5 + (((tickAnim - 8) / 1) * (125-(70.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 125 + (((tickAnim - 9) / 5) * (81.5-(125)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 81.5 + (((tickAnim - 14) / 6) * (7.5-(81.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 7.5 + (((tickAnim - 20) / 6) * (-8.88-(7.5)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -8.88 + (((tickAnim - 26) / 4) * (-18-(-8.88)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 8) * (1.5-(0.45)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.525-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.5 + (((tickAnim - 8) / 1) * (0.455-(1.5)));
            zz = -0.525 + (((tickAnim - 8) / 1) * (-0.765-(-0.525)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.455 + (((tickAnim - 9) / 3) * (0.73-(0.455)));
            zz = -0.765 + (((tickAnim - 9) / 3) * (-1.045-(-0.765)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.73 + (((tickAnim - 12) / 2) * (0-(0.73)));
            zz = -1.045 + (((tickAnim - 12) / 2) * (-0.275-(-1.045)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0.1-(0)));
            zz = -0.275 + (((tickAnim - 14) / 6) * (0.225-(-0.275)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0.1 + (((tickAnim - 20) / 6) * (1-(0.1)));
            zz = 0.225 + (((tickAnim - 20) / 6) * (0-(0.225)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 26) / 4) * (0.45-(1)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*3), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(1.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*-1), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKostensuchus e = (EntityPrehistoricFloraKostensuchus) entity;
        animator.update(entity);

    }
}
