package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLeedsichthys;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLeedsichthys extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftPelvic;
    private final AdvancedModelRenderer rightPelvic;
    private final AdvancedModelRenderer leftPectoral;
    private final AdvancedModelRenderer rightPectoral;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer maxilla;
    private final AdvancedModelRenderer leftMaxilla;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightMaxilla;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;

    private ModelAnimator animator;

    public ModelLeedsichthys() {
        this.textureWidth = 320;
        this.textureHeight = 320;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 11.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 85, 0, -10.0F, -22.0F, -61.0F, 20, 33, 30, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 11.5F, -61.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0785F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 123, -9.0F, -3.8995F, -0.0218F, 18, 4, 30, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 9.2F, -78.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 136, 194, -10.0F, -9.8F, 0.0F, 20, 8, 18, -0.005F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -23.3F, -47.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 216, 177, -9.0F, 0.0093F, -0.039F, 18, 2, 17, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -22.0F, -61.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 230, 64, -9.0F, -0.0655F, 0.0211F, 18, 2, 14, 0.0F, false));

        this.leftPelvic = new AdvancedModelRenderer(this);
        this.leftPelvic.setRotationPoint(7.0F, 11.2F, -54.0F);
        this.body.addChild(leftPelvic);
        this.setRotateAngle(leftPelvic, 0.3922F, 0.1964F, -0.4408F);
        this.leftPelvic.cubeList.add(new ModelBox(leftPelvic, 57, 258, 0.0F, -2.0F, -2.0F, 0, 42, 7, 0.0F, false));

        this.rightPelvic = new AdvancedModelRenderer(this);
        this.rightPelvic.setRotationPoint(-7.0F, 11.2F, -54.0F);
        this.body.addChild(rightPelvic);
        this.setRotateAngle(rightPelvic, 0.3922F, -0.1964F, 0.4408F);
        this.rightPelvic.cubeList.add(new ModelBox(rightPelvic, 57, 258, 0.0F, -2.0F, -2.0F, 0, 42, 7, 0.0F, true));

        this.leftPectoral = new AdvancedModelRenderer(this);
        this.leftPectoral.setRotationPoint(10.0F, 8.6F, -69.0F);
        this.body.addChild(leftPectoral);
        this.setRotateAngle(leftPectoral, 0.0F, 0.0F, 0.7854F);
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 85, 64, -1.0F, 0.0F, -4.0F, 56, 0, 16, 0.0F, false));

        this.rightPectoral = new AdvancedModelRenderer(this);
        this.rightPectoral.setRotationPoint(-10.0F, 8.6F, -69.0F);
        this.body.addChild(rightPectoral);
        this.setRotateAngle(rightPectoral, 0.0F, 0.0F, -0.7854F);
        this.rightPectoral.cubeList.add(new ModelBox(rightPectoral, 85, 64, -55.0F, 0.0F, -4.0F, 56, 0, 16, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -32.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 85, 81, -10.0F, -20.0F, 1.0F, 20, 34, 28, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -21.0F, 29.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0785F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 169, -9.0F, 0.1223F, -28.017F, 18, 4, 28, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 29.0F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 77, 144, -9.0F, -18.0F, -2.0F, 18, 32, 20, -0.005F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -20.9F, 0.0F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 120, 221, -8.0F, -0.1F, 0.0F, 16, 5, 18, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -20.3F, 6.0F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 158, 0.0F, -20.8591F, -0.0251F, 0, 21, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 18.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 102, 245, -7.0F, 12.0F, -1.0F, 14, 2, 14, -0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 154, 144, -8.0F, -14.0F, -3.0F, 16, 26, 23, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -18.6F, 0.0F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2007F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 0, -7.0F, 0.2F, -0.1F, 14, 5, 21, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -20.3F, -12.0F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 123, 0.0F, -13.8591F, 11.9749F, 0, 16, 12, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 14.0F, 13.0F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 158, -7.0F, -2.0F, 0.0F, 14, 2, 8, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -3.0F, -5.0F, 0, 19, 16, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 20.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 182, 81, -7.0F, -10.0F, -3.0F, 14, 18, 25, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 12.4F, 0.0F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 191, 199, -6.0F, -4.9F, 0.0F, 12, 5, 22, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -14.1F, 0.4F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.192F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 210, 125, -6.0F, -0.1F, 0.0F, 12, 5, 22, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 22.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 73, 201, -6.0F, -6.0F, -3.0F, 12, 12, 20, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2007F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 59, 234, -5.0F, 0.0F, -0.5F, 10, 5, 18, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 8.6F, -1.0F);
        this.tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 236, 81, -5.0F, -2.9F, 0.0F, 10, 3, 18, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 228, 227, -4.0F, -3.0F, -3.0F, 8, 7, 19, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -6.5F, -1.0F);
        this.tail5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1571F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 234, 254, -3.0F, -0.1F, 0.3F, 6, 4, 17, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 6.5F, -0.9F);
        this.tail5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1222F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 257, 42, -3.0F, -3.1F, -0.1F, 6, 3, 17, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 17, 0, -2.0F, -1.0F, 14.0F, 4, 3, 8, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 187, 253, -3.0F, -2.0F, -3.0F, 6, 5, 17, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 233, 153, -7.0F, 0.5F, 2.0F, 14, 0, 17, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 43, 27, -4.0F, -0.5F, 6.0F, 8, 2, 11, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 0, 0.0F, -40.0F, 2.0F, 0, 80, 42, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.tail6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1047F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 202, -2.0F, -0.1F, -1.0F, 4, 2, 15, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 4.2F, -1.0F);
        this.tail6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 134, 144, -2.0F, -1.8F, 0.0F, 4, 2, 15, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tail6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1222F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 43, 11, -1.0F, -1.0F, 0.0F, 2, 1, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.5F, 14.0F);
        this.tail6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.192F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 43, 0, -1.0F, 0.0F, -0.1F, 2, 2, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -17.0F, -59.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 186, 0, -11.0F, 1.0F, -19.0F, 22, 23, 14, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 154, 81, -11.0F, 4.0F, -5.0F, 22, 16, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 118, 197, -7.0F, 5.0F, -33.0F, 14, 11, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 238, 197, -8.0F, 5.0F, -30.0F, 16, 11, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 156, 0, -7.0F, 10.0F, -40.0F, 14, 6, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 217, 254, -5.0F, 14.0F, -45.0F, 10, 2, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 26.2F, -19.0F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 202, -8.0F, -9.8F, 0.0F, 16, 10, 18, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -2.6F, -17.0F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1571F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 186, 38, -10.0F, -0.0895F, 0.2118F, 20, 10, 15, -0.005F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 14.0F, -45.0F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.7418F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 67, 144, -4.0F, 2.0F, 2.0F, 8, 2, 6, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 231, -4.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 3.4F, -30.4F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4189F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 231, -7.0F, -0.1205F, -0.1062F, 14, 7, 15, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 8.7F, -39.0F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5498F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 257, 129, -6.0F, -0.146F, -0.0043F, 12, 5, 10, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 16.0F, -33.0F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 147, 253, -8.0F, -3.0F, 3.0F, 16, 3, 12, -0.006F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 259, 11, -7.0F, -3.0F, 0.0F, 14, 3, 3, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 10.5F, -31.5F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3491F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 36, -7.0F, -0.5F, -0.5F, 14, 1, 1, 0.08F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 206, 234, -7.0F, -1.5F, -1.5F, 14, 3, 3, 0.04F, false));

        this.maxilla = new AdvancedModelRenderer(this);
        this.maxilla.setRotationPoint(0.0F, 16.0F, -37.0F);
        this.head.addChild(maxilla);
        this.setRotateAngle(maxilla, 0.0436F, 0.0F, 0.0F);


        this.leftMaxilla = new AdvancedModelRenderer(this);
        this.leftMaxilla.setRotationPoint(-0.8F, -1.0F, 1.0F);
        this.maxilla.addChild(leftMaxilla);
        this.setRotateAngle(leftMaxilla, 0.3057F, 0.041F, 0.0149F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(6.9933F, 1.0133F, 3.305F);
        this.leftMaxilla.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.616F, 0.034F, -0.0941F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 72, 258, 0.3367F, -8.3053F, -3.3236F, 0, 8, 15, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(6.9933F, 1.0133F, -0.695F);
        this.leftMaxilla.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.6118F, 0.0843F, -0.0226F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 257, 106, 0.0F, -2.7946F, -0.0608F, 1, 3, 19, -0.003F, false));

        this.rightMaxilla = new AdvancedModelRenderer(this);
        this.rightMaxilla.setRotationPoint(0.8F, -1.0F, 1.0F);
        this.maxilla.addChild(rightMaxilla);
        this.setRotateAngle(rightMaxilla, 0.3057F, -0.041F, -0.0149F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-6.9933F, 1.0133F, 3.305F);
        this.rightMaxilla.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.616F, -0.034F, 0.0941F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 72, 258, -0.3367F, -8.3053F, -3.3236F, 0, 8, 15, -0.003F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-6.9933F, 1.0133F, -0.695F);
        this.rightMaxilla.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.6118F, -0.0843F, 0.0226F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 257, 106, -1.0F, -2.7946F, -0.0608F, 1, 3, 19, -0.003F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 18.4F, -19.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 245, 0, -7.0F, -2.4F, -21.0F, 14, 2, 8, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 242, 42, -5.0F, -2.4F, -26.0F, 10, 2, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 182, 125, -5.0F, -0.4F, -20.0F, 10, 2, 14, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -2.4F, -13.0F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1745F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 206, 227, -7.0F, 0.0F, -1.0F, 14, 2, 4, -0.005F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 254, -8.0F, 0.0F, 2.0F, 16, 2, 12, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.3F, -26.0F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.3054F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 167, 227, -4.0F, -3.1F, 6.0F, 8, 3, 22, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 85, 81, -3.0F, -2.1F, 0.0F, 6, 2, 6, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2618F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 210, 153, -5.0F, -0.4F, -7.0F, 10, 2, 9, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1745F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 244, 23, -7.0F, 1.6F, -12.0F, 14, 3, 15, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(0);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(maxilla, -0.25F, 0.0F, 0.0F);
        this.head.offsetY = 0.05F;
        this.head.offsetX = -0.0F;
        this.head.offsetZ = 0.38F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.2F, -0.02F, 0.02F);
        this.setRotateAngle(head, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(maxilla, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.02F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.02F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.02F, -0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.02F, -0.2F, 0.0F);
        this.setRotateAngle(tail6, 0.02F, -0.2F, 0.0F);
        this.root.offsetZ = 0.1F;
        this.root.offsetY = -0.6F;
        this.root.offsetX = -0.01F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(root, 0.0F, -0.1F, -0.3F);
        this.setRotateAngle(head, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(jaw, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(maxilla, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, -0.5F, 0.0F);
        this.root.offsetY = 0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLeedsichthys ee = (EntityPrehistoricFloraLeedsichthys) entitylivingbaseIn;

        this.root.offsetZ = 2F;
        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLeedsichthys entity = (EntityPrehistoricFloraLeedsichthys) entitylivingbaseIn;
        int animCycle = 385;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/2.3))-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 175) {
            xx = -2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/2.3)) + (((tickAnim - 68) / 107) * (-3.5-(-2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/2.3)))));
            yy = 0 + (((tickAnim - 68) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 107) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 320) {
            xx = -3.5 + (((tickAnim - 175) / 145) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 175) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 145) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 385) {
            xx = -3.5 + (((tickAnim - 320) / 65) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 320) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 0) / 175) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 175) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 320) {
            xx = -25 + (((tickAnim - 175) / 145) * (-25-(-25)));
            yy = 0 + (((tickAnim - 175) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 145) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 385) {
            xx = -25 + (((tickAnim - 320) / 65) * (0-(-25)));
            yy = 0 + (((tickAnim - 320) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(maxilla, maxilla.rotateAngleX + (float) Math.toRadians(xx), maxilla.rotateAngleY + (float) Math.toRadians(yy), maxilla.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 175) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 175) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 175) / 145) * (0-(0)));
            yy = 0.6 + (((tickAnim - 175) / 145) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 175) / 145) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 385) {
            xx = 0 + (((tickAnim - 320) / 65) * (0-(0)));
            yy = 0.6 + (((tickAnim - 320) / 65) * (0-(0.6)));
            zz = 0 + (((tickAnim - 320) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.maxilla.rotationPointX = this.maxilla.rotationPointX + (float)(xx);
        this.maxilla.rotationPointY = this.maxilla.rotationPointY - (float)(yy);
        this.maxilla.rotationPointZ = this.maxilla.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 0) / 175) * (36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 175) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 320) {
            xx = 36.5 + (((tickAnim - 175) / 145) * (36.5-(36.5)));
            yy = 0 + (((tickAnim - 175) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 145) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 385) {
            xx = 36.5 + (((tickAnim - 320) / 65) * (0-(36.5)));
            yy = 0 + (((tickAnim - 320) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeedsichthys entity = (EntityPrehistoricFloraLeedsichthys) entitylivingbaseIn;
        int animCycle = 47;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-90))*-0.75), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-20))*-0.7));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*151/0.99))*-0.5);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(leftPectoral, leftPectoral.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150+50))*-1), leftPectoral.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-50))*-0.65), leftPectoral.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99))*1.2));
        this.setRotateAngle(rightPectoral, rightPectoral.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150+50))*1), rightPectoral.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-50))*-0.65), rightPectoral.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99))*1.2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-50))*-0.7), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-150))*-1.3), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-140))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-170))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-90))*8), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-90))*8), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-90))*10), tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-120))*-2), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftPelvic, leftPelvic.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150+45))*-0.8), leftPelvic.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-50))*0.8), leftPelvic.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99))*1.3));
        this.setRotateAngle(rightPelvic, rightPelvic.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150+45))*0.8), rightPelvic.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99-50))*-0.8), rightPelvic.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.99))*1.3));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeedsichthys entity = (EntityPrehistoricFloraLeedsichthys) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-90))*-1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-20))*-1.3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867))*-0.95);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(leftPectoral, leftPectoral.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*286+45))*-0.3), leftPectoral.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-50))*-0.8), leftPectoral.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867))*2.3));
        this.setRotateAngle(rightPectoral, rightPectoral.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*286+45))*0.3), rightPectoral.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-50))*-0.8), rightPectoral.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867))*2.3));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-50))*-1.8), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-150))*-2), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-140))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-170))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-90))*12), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-90))*14), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-90))*18), tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-120))*-3), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftPelvic, leftPelvic.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*286+45))*0.3), leftPelvic.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-50))*-0.65), leftPelvic.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867))*2));
        this.setRotateAngle(rightPelvic, rightPelvic.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*286+45))*0.3), rightPelvic.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867-50))*-0.65), rightPelvic.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.867))*2));

    }

    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeedsichthys entity = (EntityPrehistoricFloraLeedsichthys) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 2 + (((tickAnim - 0) / 30) * (2.00002-(2)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.24985-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.0087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.00002 + (((tickAnim - 30) / 10) * (2.00002-(2.00002)));
            yy = -0.24985 + (((tickAnim - 30) / 10) * (-0.24985-(-0.24985)));
            zz = -0.0087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*1 + (((tickAnim - 30) / 10) * (-0.0087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-0.5-(-0.0087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*1)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 2.00002 + (((tickAnim - 40) / 13) * (2-(2.00002)));
            yy = -0.24985 + (((tickAnim - 40) / 13) * (0-(-0.24985)));
            zz = -0.0087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-0.5 + (((tickAnim - 40) / 13) * (0-(-0.0087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-0.5)));
        }
        else if (tickAnim >= 53 && tickAnim < 160) {
            xx = 2 + (((tickAnim - 53) / 107) * (2-(2)));
            yy = 0 + (((tickAnim - 53) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 107) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 18.67592 + (((tickAnim - 0) / 30) * (18.68712-(18.67592)));
            yy = -14.74079 + (((tickAnim - 0) / 30) * (-14.57627-(-14.74079)));
            zz = -66.60452 + (((tickAnim - 0) / 30) * (-66.7931-(-66.60452)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18.68712 + (((tickAnim - 30) / 10) * (18.62566-(18.68712)));
            yy = -14.57627 + (((tickAnim - 30) / 10) * (-15.39846-(-14.57627)));
            zz = -66.7931 + (((tickAnim - 30) / 10) * (-65.84954-(-66.7931)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 18.62566 + (((tickAnim - 40) / 13) * (18.67592-(18.62566)));
            yy = -15.39846 + (((tickAnim - 40) / 13) * (-14.74079-(-15.39846)));
            zz = -65.84954 + (((tickAnim - 40) / 13) * (-66.60452-(-65.84954)));
        }
        else if (tickAnim >= 53 && tickAnim < 160) {
            xx = 18.67592 + (((tickAnim - 53) / 107) * (18.67592-(18.67592)));
            yy = -14.74079 + (((tickAnim - 53) / 107) * (-14.74079-(-14.74079)));
            zz = -66.60452 + (((tickAnim - 53) / 107) * (-66.60452-(-66.60452)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftPelvic, leftPelvic.rotateAngleX + (float) Math.toRadians(xx), leftPelvic.rotateAngleY + (float) Math.toRadians(yy), leftPelvic.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.475 + (((tickAnim - 30) / 10) * (0.5-(0.475)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0.5 + (((tickAnim - 40) / 13) * (0-(0.5)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 53) / 107) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 107) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftPelvic.rotationPointX = this.leftPelvic.rotationPointX + (float)(xx);
        this.leftPelvic.rotationPointY = this.leftPelvic.rotationPointY - (float)(yy);
        this.leftPelvic.rotationPointZ = this.leftPelvic.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 18.67592 + (((tickAnim - 0) / 30) * (18.66417-(18.67592)));
            yy = 14.7408 + (((tickAnim - 0) / 30) * (14.90528-(14.7408)));
            zz = 66.6045 + (((tickAnim - 0) / 30) * (66.41586-(66.6045)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18.66417 + (((tickAnim - 30) / 10) * (18.69778-(18.66417)));
            yy = 14.90528 + (((tickAnim - 30) / 10) * (14.41173-(14.90528)));
            zz = 66.41586 + (((tickAnim - 30) / 10) * (66.98158-(66.41586)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 18.69778 + (((tickAnim - 40) / 13) * (18.67592-(18.69778)));
            yy = 14.41173 + (((tickAnim - 40) / 13) * (14.7408-(14.41173)));
            zz = 66.98158 + (((tickAnim - 40) / 13) * (66.6045-(66.98158)));
        }
        else if (tickAnim >= 53 && tickAnim < 160) {
            xx = 18.67592 + (((tickAnim - 53) / 107) * (18.67592-(18.67592)));
            yy = 14.7408 + (((tickAnim - 53) / 107) * (14.7408-(14.7408)));
            zz = 66.6045 + (((tickAnim - 53) / 107) * (66.6045-(66.6045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightPelvic, rightPelvic.rotateAngleX + (float) Math.toRadians(xx), rightPelvic.rotateAngleY + (float) Math.toRadians(yy), rightPelvic.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.49311 + (((tickAnim - 0) / 30) * (-0.12329-(-0.49311)));
            yy = -26.2457 + (((tickAnim - 0) / 30) * (-26.24973-(-26.2457)));
            zz = -41.38504 + (((tickAnim - 0) / 30) * (-42.22125-(-41.38504)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.12329 + (((tickAnim - 30) / 10) * (-0.61636-(-0.12329)));
            yy = -26.24973 + (((tickAnim - 30) / 10) * (-26.24328-(-26.24973)));
            zz = -42.22125 + (((tickAnim - 30) / 10) * (-41.10632-(-42.22125)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -0.61636 + (((tickAnim - 40) / 13) * (-0.49311-(-0.61636)));
            yy = -26.24328 + (((tickAnim - 40) / 13) * (-26.2457-(-26.24328)));
            zz = -41.10632 + (((tickAnim - 40) / 13) * (-41.38504-(-41.10632)));
        }
        else if (tickAnim >= 53 && tickAnim < 109) {
            xx = -0.49311 + (((tickAnim - 53) / 56) * (-0.48323-(-0.49311)));
            yy = -26.2457 + (((tickAnim - 53) / 56) * (-23.7458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.165-(-26.2457)));
            zz = -41.38504 + (((tickAnim - 53) / 56) * (-41.40848-(-41.38504)));
        }
        else if (tickAnim >= 109 && tickAnim < 160) {
            xx = -0.48323 + (((tickAnim - 109) / 51) * (-0.49311-(-0.48323)));
            yy = -23.7458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.165 + (((tickAnim - 109) / 51) * (-26.2457-(-23.7458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.165)));
            zz = -41.40848 + (((tickAnim - 109) / 51) * (-41.38504-(-41.40848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftPectoral, leftPectoral.rotateAngleX + (float) Math.toRadians(xx), leftPectoral.rotateAngleY + (float) Math.toRadians(yy), leftPectoral.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0.25 + (((tickAnim - 0) / 53) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 160) {
            xx = 0.25 + (((tickAnim - 53) / 107) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 53) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 107) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftPectoral.rotationPointX = this.leftPectoral.rotationPointX + (float)(xx);
        this.leftPectoral.rotationPointY = this.leftPectoral.rotationPointY - (float)(yy);
        this.leftPectoral.rotationPointZ = this.leftPectoral.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.49311 + (((tickAnim - 0) / 30) * (-0.98599-(-0.49311)));
            yy = 26.2457 + (((tickAnim - 0) / 30) * (26.23279-(26.2457)));
            zz = 41.38504 + (((tickAnim - 0) / 30) * (40.27025-(41.38504)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.98599 + (((tickAnim - 30) / 10) * (-0.36984-(-0.98599)));
            yy = 26.23279 + (((tickAnim - 30) / 10) * (26.24758-(26.23279)));
            zz = 40.27025 + (((tickAnim - 30) / 10) * (41.66377-(40.27025)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -0.36984 + (((tickAnim - 40) / 13) * (-0.49311-(-0.36984)));
            yy = 26.24758 + (((tickAnim - 40) / 13) * (26.2457-(26.24758)));
            zz = 41.66377 + (((tickAnim - 40) / 13) * (41.38504-(41.66377)));
        }
        else if (tickAnim >= 53 && tickAnim < 109) {
            xx = -0.49311 + (((tickAnim - 53) / 56) * (-0.49311-(-0.49311)));
            yy = 26.2457 + (((tickAnim - 53) / 56) * (26.2457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.165-(26.2457)));
            zz = 41.38504 + (((tickAnim - 53) / 56) * (41.38504-(41.38504)));
        }
        else if (tickAnim >= 109 && tickAnim < 160) {
            xx = -0.49311 + (((tickAnim - 109) / 51) * (-0.49311-(-0.49311)));
            yy = 26.2457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.165 + (((tickAnim - 109) / 51) * (26.2457-(26.2457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.165)));
            zz = 41.38504 + (((tickAnim - 109) / 51) * (41.38504-(41.38504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightPectoral, rightPectoral.rotateAngleX + (float) Math.toRadians(xx), rightPectoral.rotateAngleY + (float) Math.toRadians(yy), rightPectoral.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0.25 + (((tickAnim - 0) / 53) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 160) {
            xx = 0.25 + (((tickAnim - 53) / 107) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 53) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 107) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightPectoral.rotationPointX = this.rightPectoral.rotationPointX + (float)(xx);
        this.rightPectoral.rotationPointY = this.rightPectoral.rotationPointY - (float)(yy);
        this.rightPectoral.rotationPointZ = this.rightPectoral.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -3.00577 + (((tickAnim - 0) / 23) * (-0.8529-(-3.00577)));
            yy = 0.0448 + (((tickAnim - 0) / 23) * (-1.1109-(0.0448)));
            zz = 1.47724 + (((tickAnim - 0) / 23) * (2.76252-(1.47724)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.8529 + (((tickAnim - 23) / 7) * (-4.0738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(-0.8529)));
            yy = -1.1109 + (((tickAnim - 23) / 7) * (-1.84635-(-1.1109)));
            zz = 2.76252 + (((tickAnim - 23) / 7) * (3.58043-(2.76252)));
        }
        else if (tickAnim >= 30 && tickAnim < 44) {
            xx = -4.0738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 30) / 14) * (-4.0052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(-4.0738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = -1.84635 + (((tickAnim - 30) / 14) * (-0.78227-(-1.84635)));
            zz = 3.58043 + (((tickAnim - 30) / 14) * (3.5242-(3.58043)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = -4.0052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 44) / 11) * (-2.9654-(-4.0052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = -0.78227 + (((tickAnim - 44) / 11) * (-0.01433-(-0.78227)));
            zz = 3.5242 + (((tickAnim - 44) / 11) * (1.88034-(3.5242)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -2.9654 + (((tickAnim - 55) / 105) * (-3.00577-(-2.9654)));
            yy = -0.01433 + (((tickAnim - 55) / 105) * (0.0448-(-0.01433)));
            zz = 1.88034 + (((tickAnim - 55) / 105) * (1.47724-(1.88034)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.275 + (((tickAnim - 0) / 30) * (0-(-0.275)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = -1.575 + (((tickAnim - 0) / 30) * (-1.575-(-1.575)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -1.575 + (((tickAnim - 30) / 10) * (-1.575-(-1.575)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = -1.575 + (((tickAnim - 40) / 20) * (-1.575-(-1.575)));
        }
        else if (tickAnim >= 60 && tickAnim < 160) {
            xx = -0.275 + (((tickAnim - 60) / 100) * (-0.275-(-0.275)));
            yy = 0 + (((tickAnim - 60) / 100) * (0-(0)));
            zz = -1.575 + (((tickAnim - 60) / 100) * (-1.575-(-1.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.69745 + (((tickAnim - 0) / 30) * (0.78401-(-0.69745)));
            yy = 1.52514 + (((tickAnim - 0) / 30) * (-0.70619-(1.52514)));
            zz = 1.9809 + (((tickAnim - 0) / 30) * (3.50828-(1.9809)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.78401 + (((tickAnim - 30) / 10) * (-0.69745-(0.78401)));
            yy = -0.70619 + (((tickAnim - 30) / 10) * (1.52514-(-0.70619)));
            zz = 3.50828 + (((tickAnim - 30) / 10) * (1.9809-(3.50828)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.69745 + (((tickAnim - 40) / 120) * (-0.69745-(-0.69745)));
            yy = 1.52514 + (((tickAnim - 40) / 120) * (1.52514-(1.52514)));
            zz = 1.9809 + (((tickAnim - 40) / 120) * (1.9809-(1.9809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.225 + (((tickAnim - 0) / 30) * (-0.68-(-0.225)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.68 + (((tickAnim - 30) / 10) * (-0.225-(-0.68)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.225 + (((tickAnim - 40) / 120) * (-0.225-(-0.225)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.15105 + (((tickAnim - 0) / 30) * (0.81872-(-0.15105)));
            yy = -1.73281 + (((tickAnim - 0) / 30) * (-1.72991-(-1.73281)));
            zz = 3.96556 + (((tickAnim - 0) / 30) * (4.96601-(3.96556)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.81872 + (((tickAnim - 30) / 10) * (-0.15105-(0.81872)));
            yy = -1.72991 + (((tickAnim - 30) / 10) * (-1.73281-(-1.72991)));
            zz = 4.96601 + (((tickAnim - 30) / 10) * (3.96556-(4.96601)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.15105 + (((tickAnim - 40) / 120) * (-0.15105-(-0.15105)));
            yy = -1.73281 + (((tickAnim - 40) / 120) * (-1.73281-(-1.73281)));
            zz = 3.96556 + (((tickAnim - 40) / 120) * (3.96556-(3.96556)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -1.35 + (((tickAnim - 0) / 40) * (-1.35-(-1.35)));
            yy = -0.4 + (((tickAnim - 0) / 40) * (-0.4-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -1.35 + (((tickAnim - 40) / 120) * (-1.35-(-1.35)));
            yy = -0.4 + (((tickAnim - 40) / 120) * (-0.4-(-0.4)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -1.90488 + (((tickAnim - 0) / 30) * (4.51423-(-1.90488)));
            yy = -4.64386 + (((tickAnim - 0) / 30) * (-4.60991-(-4.64386)));
            zz = 6.77189 + (((tickAnim - 0) / 30) * (7.77459-(6.77189)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4.51423 + (((tickAnim - 30) / 10) * (-1.90488-(4.51423)));
            yy = -4.60991 + (((tickAnim - 30) / 10) * (-4.64386-(-4.60991)));
            zz = 7.77459 + (((tickAnim - 30) / 10) * (6.77189-(7.77459)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -1.90488 + (((tickAnim - 40) / 15) * (-1.90488-(-1.90488)));
            yy = -4.64386 + (((tickAnim - 40) / 15) * (-4.64386-(-4.64386)));
            zz = 6.77189 + (((tickAnim - 40) / 15) * (6.77189-(6.77189)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -1.90488 + (((tickAnim - 55) / 105) * (-1.90488-(-1.90488)));
            yy = -4.64386 + (((tickAnim - 55) / 105) * (-4.64386-(-4.64386)));
            zz = 6.77189 + (((tickAnim - 55) / 105) * (6.77189-(6.77189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0.775 + (((tickAnim - 0) / 40) * (-0.775-(-0.775)));
            yy = -0.275 + (((tickAnim - 0) / 40) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.775 + (((tickAnim - 40) / 120) * (-0.775-(-0.775)));
            yy = -0.275 + (((tickAnim - 40) / 120) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -3.20812 + (((tickAnim - 0) / 30) * (4.29188-(-3.20812)));
            yy = 0.89109 + (((tickAnim - 0) / 30) * (0.89109-(0.89109)));
            zz = 13.61532 + (((tickAnim - 0) / 30) * (13.61532-(13.61532)));
        }
        else if (tickAnim >= 30 && tickAnim < 46) {
            xx = 4.29188 + (((tickAnim - 30) / 16) * (-3.2081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-20))*1.5-(4.29188)));
            yy = 0.89109 + (((tickAnim - 30) / 16) * (0.8911+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*2-(0.89109)));
            zz = 13.61532 + (((tickAnim - 30) / 16) * (13.61532-(13.61532)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = -3.2081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-20))*1.5 + (((tickAnim - 46) / 9) * (-3.20812-(-3.2081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-20))*1.5)));
            yy = 0.8911+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*2 + (((tickAnim - 46) / 9) * (0.89109-(0.8911+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*2)));
            zz = 13.61532 + (((tickAnim - 46) / 9) * (13.61532-(13.61532)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -3.20812 + (((tickAnim - 55) / 105) * (-3.20812-(-3.20812)));
            yy = 0.89109 + (((tickAnim - 55) / 105) * (0.89109-(0.89109)));
            zz = 13.61532 + (((tickAnim - 55) / 105) * (13.61532-(13.61532)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0.775 + (((tickAnim - 0) / 40) * (-0.775-(-0.775)));
            yy = -0.625 + (((tickAnim - 0) / 40) * (-0.625-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -3.86195 + (((tickAnim - 0) / 30) * (-1.19727-(-3.86195)));
            yy = -3.07995 + (((tickAnim - 0) / 30) * (-7.46204-(-3.07995)));
            zz = 22.49595 + (((tickAnim - 0) / 30) * (6.49203-(22.49595)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = -1.19727 + (((tickAnim - 30) / 11) * (-1.67206-(-1.19727)));
            yy = -7.46204 + (((tickAnim - 30) / 11) * (-11.7482+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*2-(-7.46204)));
            zz = 6.49203 + (((tickAnim - 30) / 11) * (22.94139-(6.49203)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = -1.67206 + (((tickAnim - 41) / 14) * (-3.86195-(-1.67206)));
            yy = -11.7482+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*2 + (((tickAnim - 41) / 14) * (-3.07995-(-11.7482+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*2)));
            zz = 22.94139 + (((tickAnim - 41) / 14) * (22.49595-(22.94139)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -3.86195 + (((tickAnim - 55) / 105) * (-3.86195-(-3.86195)));
            yy = -3.07995 + (((tickAnim - 55) / 105) * (-3.07995-(-3.07995)));
            zz = 22.49595 + (((tickAnim - 55) / 105) * (22.49595-(22.49595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0.5 + (((tickAnim - 0) / 40) * (-0.5-(-0.5)));
            yy = -0.5 + (((tickAnim - 0) / 40) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.5 + (((tickAnim - 40) / 120) * (-0.5-(-0.5)));
            yy = -0.5 + (((tickAnim - 40) / 120) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -1.73079 + (((tickAnim - 0) / 30) * (-1.78839-(-1.73079)));
            yy = 0.25863 + (((tickAnim - 0) / 30) * (-12.05539-(0.25863)));
            zz = 38.99609 + (((tickAnim - 0) / 30) * (28.8727-(38.99609)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -1.78839 + (((tickAnim - 30) / 10) * (-1.75635-(-1.78839)));
            yy = -12.05539 + (((tickAnim - 30) / 10) * (11.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-2-(-12.05539)));
            zz = 28.8727 + (((tickAnim - 30) / 10) * (36.87259-(28.8727)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -1.75635 + (((tickAnim - 40) / 6) * (-1.74986-(-1.75635)));
            yy = 11.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-2 + (((tickAnim - 40) / 6) * (-8.5008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-2-(11.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-2)));
            zz = 36.87259 + (((tickAnim - 40) / 6) * (37.17888-(36.87259)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = -1.74986 + (((tickAnim - 46) / 9) * (-1.73079-(-1.74986)));
            yy = -8.5008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-2 + (((tickAnim - 46) / 9) * (0.25863-(-8.5008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-2)));
            zz = 37.17888 + (((tickAnim - 46) / 9) * (38.99609-(37.17888)));
        }
        else if (tickAnim >= 55 && tickAnim < 160) {
            xx = -1.73079 + (((tickAnim - 55) / 105) * (-1.73079-(-1.73079)));
            yy = 0.25863 + (((tickAnim - 55) / 105) * (0.25863-(0.25863)));
            zz = 38.99609 + (((tickAnim - 55) / 105) * (38.99609-(38.99609)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0.275 + (((tickAnim - 0) / 40) * (-0.275-(-0.275)));
            yy = -0.725 + (((tickAnim - 0) / 40) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -0.275 + (((tickAnim - 40) / 120) * (-0.275-(-0.275)));
            yy = -0.725 + (((tickAnim - 40) / 120) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail6.rotationPointX = this.tail6.rotationPointX + (float)(xx);
        this.tail6.rotationPointY = this.tail6.rotationPointY - (float)(yy);
        this.tail6.rotationPointZ = this.tail6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 3.5 + (((tickAnim - 0) / 30) * (-0.75007-(3.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.01527-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.49977-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = -0.75007 + (((tickAnim - 30) / 18) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.3-(-0.75007)));
            yy = -0.01527 + (((tickAnim - 30) / 18) * (0-(-0.01527)));
            zz = 0.49977 + (((tickAnim - 30) / 18) * (0-(0.49977)));
        }
        else if (tickAnim >= 48 && tickAnim < 84) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.3 + (((tickAnim - 48) / 36) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.3)));
            yy = 0 + (((tickAnim - 48) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 36) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 160) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 84) / 76) * (3.5-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = 0 + (((tickAnim - 84) / 76) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 76) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*-0.15 + (((tickAnim - 0) / 30) * (-17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*-0.15-(-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*-0.15)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = -17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*-0.15 + (((tickAnim - 30) / 18) * (-8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.5-(-17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*-0.15)));
            yy = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 18) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 84) {
            xx = -8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.5 + (((tickAnim - 48) / 36) * (-9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(-8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.5)));
            yy = 0 + (((tickAnim - 48) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 36) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 160) {
            xx = -9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 84) / 76) * (-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*-0.15-(-9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            yy = 0 + (((tickAnim - 84) / 76) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 76) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(maxilla, maxilla.rotateAngleX + (float) Math.toRadians(xx), maxilla.rotateAngleY + (float) Math.toRadians(yy), maxilla.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.15 + (((tickAnim - 0) / 30) * (21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.15-(13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.15)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = 21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.15 + (((tickAnim - 30) / 18) * (11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1-(21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.15)));
            yy = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 18) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 83) {
            xx = 11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1 + (((tickAnim - 48) / 35) * (9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1)));
            yy = 0 + (((tickAnim - 48) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 35) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 160) {
            xx = 9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 83) / 77) * (13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.15-(9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 83) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};

        EntityPrehistoricFloraLeedsichthys ee = (EntityPrehistoricFloraLeedsichthys) e;
        //ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (ee.getAnimation() == ee.NO_ANIMATION || ee.getAnimation() == null) {
            this.jaw.rotateAngleX = ee.mouthAngle() * (float)Math.toRadians(30);
            //System.err.println("Mouth Angle:" + entity.mouthAngle());
            //System.err.println("Feed Ticks:" + entity.getFeedTicks());
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

