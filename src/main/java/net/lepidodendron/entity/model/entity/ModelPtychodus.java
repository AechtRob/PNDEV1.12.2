package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPtychodus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPtychodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer basebody;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body5;
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
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
    private final AdvancedModelRenderer membrane;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer membrane2;
    private final AdvancedModelRenderer cube_r59;

    private ModelAnimator animator;

    public ModelPtychodus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 11.0F, 13.0F);


        this.basebody = new AdvancedModelRenderer(this);
        this.basebody.setRotationPoint(-0.0782F, 1.2F, -21.9998F);
        this.head.addChild(basebody);
        this.basebody.cubeList.add(new ModelBox(basebody, 64, 0, -11.0F, -9.2F, 0.0F, 22, 19, 12, 0.0F, false));
        this.basebody.cubeList.add(new ModelBox(basebody, 0, 79, -11.0F, -12.2F, 11.75F, 22, 3, 12, 0.0F, false));
        this.basebody.cubeList.add(new ModelBox(basebody, 0, 48, -12.0F, -9.2F, 12.0F, 24, 19, 12, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.05F, 11.75F);
        this.basebody.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 114, 175, 0.0F, -10.75F, 0.0F, 0, 11, 13, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(10.0F, 10.45F, 12.9F);
        this.basebody.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0611F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 86, -21.0F, -1.0F, -1.0F, 22, 2, 12, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(9.0F, 10.25F, 1.0F);
        this.basebody.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0262F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 64, 100, -19.0F, -1.0F, -1.0F, 20, 2, 12, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(9.0F, -9.3F, 1.0F);
        this.basebody.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 94, -19.0F, -2.0F, -1.0F, 20, 3, 12, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(10.75F, 9.3F, 1.0F);
        this.basebody.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0349F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 114, 146, -1.0F, -15.0F, -1.0F, 2, 15, 14, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-10.75F, 9.3F, 1.0F);
        this.basebody.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.0349F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 114, 146, -1.0F, -15.0F, -1.0F, 2, 15, 14, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-12.0F, 9.25F, 11.75F);
        this.basebody.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.3491F, -0.1309F, 1.0472F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 24, 170, 0.0F, -1.0F, -1.0F, 1, 13, 6, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 90, 151, 0.5F, 1.0F, -1.0F, 0, 19, 12, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 170, 0.525F, 1.0F, -1.0F, 0, 19, 12, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(12.0F, 9.25F, 11.75F);
        this.basebody.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.3491F, 0.1309F, -1.0472F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 24, 170, -1.0F, -1.0F, -1.0F, 1, 13, 6, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 90, 151, -0.5F, 1.0F, -1.0F, 0, 19, 12, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 170, -0.525F, 1.0F, -1.0F, 0, 19, 12, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.7F, 24.0F);
        this.basebody.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 72, 31, -10.5F, -7.75F, -2.0F, 21, 17, 12, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(8.5F, -10.25F, -1.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0611F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 114, -18.0F, 0.0F, -1.0F, 19, 3, 12, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(8.5F, 9.25F, -1.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0785F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 109, -18.0F, 0.0F, -1.0F, 19, 3, 12, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 72, 60, -9.0F, -6.5F, -2.0F, 18, 15, 11, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(7.0F, -9.575F, -1.35F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1134F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 114, 131, -15.0F, 0.0F, -1.0F, 16, 3, 12, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(7.0F, 8.35F, -0.9F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 128, 100, -15.0F, 0.0F, -1.0F, 16, 3, 11, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 62, 129, -7.5F, -5.25F, -2.0F, 15, 11, 11, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(5.5F, -8.275F, -0.5F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1265F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 138, -12.0F, 0.0F, -1.0F, 13, 3, 11, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(5.5F, 6.475F, -1.475F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3927F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 138, 43, -12.0F, -1.0F, 0.0F, 13, 4, 10, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-2.0F, 6.95F, 6.0F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.2618F, -0.1745F, 0.6981F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 2.5F, -0.25F);
        this.pelvicfinright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 64, 39, 1.0F, -3.0F, -1.0F, 0, 3, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(2.0F, 6.95F, 6.0F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.2618F, 0.1745F, -0.6981F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 2.5F, -0.25F);
        this.pelvicfinleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 39, -1.0F, -3.0F, -1.0F, 0, 3, 4, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -1.0F, 9.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 138, 25, -5.5F, -3.0F, -1.0F, 11, 7, 11, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.5F, -5.8F, 0.5F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 174, 0, -8.0F, 0.0F, -1.0F, 9, 3, 11, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.5F, 3.45F, -0.5F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 170, 131, -8.0F, 0.0F, -1.0F, 9, 3, 11, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 146, 164, -3.0F, -3.45F, -2.0F, 6, 6, 13, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 182, 121, -2.0F, -2.95F, 11.0F, 4, 5, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 2.25F, 13.85F);
        this.body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.7418F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 132, 0, 0.0F, -5.0F, -1.0F, 1, 5, 20, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.5F, -5.0F, -2.0F, 0, 16, 32, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 3.25F, 1.8F);
        this.body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 64, 31, 0.0F, 0.0F, -1.0F, 0, 4, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -7.05F, 1.5F);
        this.body5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 174, 14, 0.0F, 0.0F, -1.0F, 0, 3, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, -5.3F, -0.5F);
        this.body5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 184, 75, -3.0F, 1.0F, -1.0F, 4, 2, 11, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 0.75F, -0.7F);
        this.body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 184, 42, -3.0F, 1.0F, -1.0F, 4, 2, 11, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.9F, 14.55F);
        this.body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.7854F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, -3, 217, -2.0F, 0.0F, -2.0F, 4, 1, 4, -0.01F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.25F, -2.95F, -0.925F);
        this.body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.0524F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 192, -1.0F, 2.0F, -1.0F, 3, 1, 13, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.3F, -2.925F, 11.45F);
        this.body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.48F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 184, 177, -2.0F, 2.0F, -1.0F, 3, 1, 4, -0.01F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-3.3F, -2.925F, 11.45F);
        this.body5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.48F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 184, 177, -1.0F, 2.0F, -1.0F, 3, 1, 4, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-3.25F, -2.95F, -0.925F);
        this.body5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0524F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 192, -2.0F, 2.0F, -1.0F, 3, 1, 13, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0782F, 3.4F, -22.7498F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1134F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 146, 146, -3.0F, -2.0F, -21.0F, 6, 3, 15, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 184, 16, -2.5F, -2.25F, -20.5F, 5, 1, 12, 0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.475F, 1.25F, -20.0F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2007F, 0.3229F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 152, -6.0F, -3.0F, -1.0F, 6, 3, 15, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.5F, 1.0F, -20.0F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.3229F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 48, 151, -6.0F, -3.0F, -1.0F, 6, 3, 15, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.5F, -2.25F, -20.5F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.3491F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 184, 93, -4.0F, 0.0F, 0.0F, 4, 1, 12, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(3.475F, 1.55F, -20.0F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3927F, 0.3229F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 152, -5.985F, -3.0F, -1.0F, 6, 3, 15, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.475F, 1.55F, -20.0F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3927F, -0.3229F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 152, -0.015F, -3.0F, -1.0F, 6, 3, 15, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-3.475F, 1.25F, -20.0F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2007F, -0.3229F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 152, 0.0F, -3.0F, -1.0F, 6, 3, 15, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.5F, 1.0F, -20.0F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.3229F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 48, 151, 0.0F, -3.0F, -1.0F, 6, 3, 15, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(9.0F, 5.6F, -16.5F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1745F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 222, -19.0F, -14.0F, 8.0F, 20, 6, 9, 0.01F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 124, 114, -19.0F, -8.0F, 8.0F, 20, 8, 9, 0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(4.5F, 1.5F, -20.0F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4363F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 182, 29, -10.0F, -7.0F, 7.0F, 11, 7, 6, 0.01F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 188, 55, -7.5F, -3.0F, -1.0F, 6, 3, 8, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-2.5F, -2.25F, -20.5F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.3491F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 184, 93, 0.0F, 0.0F, 0.0F, 4, 1, 12, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-0.0782F, 6.925F, -22.2498F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 136, 91, -7.0F, -5.975F, -16.25F, 14, 3, 6, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 75, 185, -2.5F, -3.5F, -21.0F, 5, 1, 11, 0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(2.5F, -3.5F, -21.0F);
        this.upperjaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.3491F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 185, 109, -4.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-2.5F, -3.5F, -21.0F);
        this.upperjaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.3491F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 185, 109, 0.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(6.0F, -2.75F, -19.0F);
        this.upperjaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0873F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 140, 183, -12.0F, -8.0F, -1.0F, 11, 8, 5, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(5.5F, -3.575F, -19.6F);
        this.upperjaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 1.2654F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 189, 146, -9.0F, -7.0F, -1.0F, 7, 7, 5, -0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(13.9F, -3.525F, -22.775F);
        this.upperjaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 1.309F, 0.48F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 71, 169, -11.0F, -8.2F, -1.0F, 3, 7, 4, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(13.925F, -8.875F, -22.775F);
        this.upperjaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 1.9199F, 0.48F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 48, 138, -10.0F, -8.2F, -1.0F, 2, 7, 4, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(14.25F, -3.9F, -21.8F);
        this.upperjaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 1.4835F, 0.3752F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 48, 209, -10.85F, -2.3F, -1.4F, 3, 7, 4, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(14.75F, -4.4F, -21.8F);
        this.upperjaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 1.1345F, 0.3229F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 48, 194, -11.0F, 2.7F, -0.275F, 3, 7, 4, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(5.525F, -7.675F, -16.9F);
        this.upperjaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.3927F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 188, 66, 1.0F, -3.0F, -1.0F, 1, 3, 3, 0.02F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(7.5F, -5.175F, -25.7F);
        this.upperjaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.4538F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 184, 164, -11.0F, -4.0F, -1.0F, 7, 4, 8, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-13.925F, -8.875F, -22.775F);
        this.upperjaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 1.9199F, -0.48F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 48, 138, 8.0F, -8.2F, -1.0F, 2, 7, 4, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-13.9F, -3.525F, -22.775F);
        this.upperjaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 1.309F, -0.48F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 71, 169, 8.0F, -8.2F, -1.0F, 3, 7, 4, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-14.25F, -3.9F, -21.8F);
        this.upperjaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 1.4835F, -0.3752F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 48, 209, 7.85F, -2.3F, -1.4F, 3, 7, 4, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-14.75F, -4.4F, -21.8F);
        this.upperjaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 1.1345F, -0.3229F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 48, 194, 8.0F, 2.7F, -0.275F, 3, 7, 4, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-5.525F, -7.675F, -16.9F);
        this.upperjaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, -0.3927F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 188, 66, -2.0F, -3.0F, -1.0F, 1, 3, 3, 0.02F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-14.3F, -4.625F, -21.8F);
        this.upperjaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 1.5708F, -0.3927F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 172, 183, 8.0F, -2.0F, -1.0F, 5, 11, 8, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(10.0F, -8.225F, -19.3F);
        this.upperjaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.3054F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 136, 75, -16.0F, -4.0F, -1.0F, 12, 4, 12, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(14.3F, -4.625F, -21.8F);
        this.upperjaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 1.5708F, 0.3927F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 172, 183, -13.0F, -2.0F, -1.0F, 5, 11, 8, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(10.3F, 0.075F, -10.75F);
        this.upperjaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.1134F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 42, 169, -3.0F, -13.0F, 0.0F, 3, 13, 12, 0.01F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(13.0F, -9.975F, -20.55F);
        this.upperjaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.1396F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 130, 60, -22.0F, -4.0F, 11.0F, 18, 4, 11, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-10.3F, 0.075F, -10.75F);
        this.upperjaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.1134F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 42, 169, 0.0F, -13.0F, 0.0F, 3, 13, 12, 0.01F, false));

        this.membrane = new AdvancedModelRenderer(this);
        this.membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperjaw.addChild(membrane);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(5.5F, -7.675F, -16.9F);
        this.membrane.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.3927F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 196, 66, 1.0F, -3.0F, -1.0F, 1, 3, 3, 0.02F, true));

        this.membrane2 = new AdvancedModelRenderer(this);
        this.membrane2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.membrane.addChild(membrane2);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-5.3436F, -7.675F, -16.9F);
        this.membrane2.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.3927F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 196, 66, -2.0F, -3.0F, -1.0F, 1, 3, 3, 0.02F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.head.offsetX = -0.14F;
        this.head.offsetY = -0.19F;
        this.head.offsetZ = 0.06F;
        this.head.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.head.offsetY = 0.139F;
        this.head.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.head.offsetY = 0.139F;
        this.head.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -0.0F;
        this.head.offsetX = 0.10F;
        this.head.rotateAngleY = (float)Math.toRadians(250);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 0.25F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
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
        EntityPrehistoricFloraPtychodus ee = (EntityPrehistoricFloraPtychodus) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPtychodus entity = (EntityPrehistoricFloraPtychodus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.5), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(basebody, basebody.rotateAngleX + (float) Math.toRadians(0), basebody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*2), basebody.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1.5));
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1.5));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*7), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*8), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*9), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*10), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-270))*20), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-0.15), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPtychodus entity = (EntityPrehistoricFloraPtychodus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.5), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(basebody, basebody.rotateAngleX + (float) Math.toRadians(0), basebody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), basebody.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5));
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*7), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*8), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*10), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*15), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*25), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-0.15), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPtychodus entity = (EntityPrehistoricFloraPtychodus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.25 + (((tickAnim - 5) / 3) * (1-(-1.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (0-(1)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 24.5 + (((tickAnim - 5) / 3) * (0-(24.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.175-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.05 + (((tickAnim - 3) / 5) * (0.05-(0.05)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0.175 + (((tickAnim - 3) / 5) * (0-(0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.05 + (((tickAnim - 8) / 3) * (0-(0.05)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.membrane.rotationPointX = this.membrane.rotationPointX + (float)(xx);
        this.membrane.rotationPointY = this.membrane.rotationPointY - (float)(yy);
        this.membrane.rotationPointZ = this.membrane.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1.01-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1.0125-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.01 + (((tickAnim - 3) / 5) * (1-(1.01)));
            yy = 1 + (((tickAnim - 3) / 5) * (1-(1)));
            zz = 1.0125 + (((tickAnim - 3) / 5) * (1-(1.0125)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 8) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.membrane.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.175-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.15 + (((tickAnim - 3) / 5) * (-0.15-(-0.15)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0.175 + (((tickAnim - 3) / 5) * (0.175-(0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.15 + (((tickAnim - 8) / 3) * (0-(-0.15)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0.175 + (((tickAnim - 8) / 3) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.membrane2.rotationPointX = this.membrane2.rotationPointX + (float)(xx);
        this.membrane2.rotationPointY = this.membrane2.rotationPointY - (float)(yy);
        this.membrane2.rotationPointZ = this.membrane2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1.01-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1.0125-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.01 + (((tickAnim - 3) / 5) * (1.01-(1.01)));
            yy = 1 + (((tickAnim - 3) / 5) * (1-(1)));
            zz = 1.0125 + (((tickAnim - 3) / 5) * (1.0125-(1.0125)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1.01 + (((tickAnim - 8) / 3) * (1-(1.01)));
            yy = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            zz = 1.0125 + (((tickAnim - 8) / 3) * (1-(1.0125)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.membrane2.setScale((float)xx, (float)yy, (float)zz);

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4, this.body5};

        EntityPrehistoricFloraPtychodus ee = (EntityPrehistoricFloraPtychodus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            //this.main.rotateAngleZ = (float) Math.toRadians(90);
            //this.main.offsetY = -0.2F;
           // this.bob(main, 0.5f, 2.5F, false, f2, 1);
            this.chainWave(fishTail, 0.26f * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, 0.26f * 1.7F, 0.28F, -0.55, f2, 0.4F);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

