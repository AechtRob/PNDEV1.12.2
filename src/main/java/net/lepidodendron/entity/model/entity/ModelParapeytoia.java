package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelParapeytoia extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer legR13;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer legL13;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer legL14;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer legR14;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer legR15;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer legL15;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer legR16;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer legL16;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer legL17;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer legL18;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer legR17;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer legR18;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer legR19;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer legL19;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer legL20;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer legL21;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer legR20;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer legR21;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer armR4;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer armR5;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer armL4;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer armL5;

    public ModelParapeytoia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 18.0F, -4.0F);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 6, -3.0F, -1.0F, -4.0F, 6, 4, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 12, -4.0F, -0.5F, -4.0F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 12, 3.0F, -0.5F, -4.0F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(5.0F, 0.5F, -3.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -2.0F, -1.0F, -0.1F, 2, 1, 1, 0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.0F, 0.5F, -3.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, 0.0F, -1.0F, -0.1F, 2, 1, 1, 0.01F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -0.4F, -3.65F);
        this.head.addChild(bone);
        this.setRotateAngle(bone, 0.0873F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 32, 32, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.0F, -2.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.48F, 0.0873F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.48F, -0.0873F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.75F, 3.0F, -2.5F);
        this.head.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.5236F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 0, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.75F, 3.0F, -2.5F);
        this.head.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.5236F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, 3.0F, -1.0F);
        this.head.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.5236F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, 3.0F, -1.0F);
        this.head.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.5236F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(body);
        this.setRotateAngle(body, -0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 19, -3.0F, -2.0F, -0.1F, 6, 4, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, -2.0F, 1.8F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.5236F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, 0.0F, 0.0F, -2.0F, 1, 0, 5, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.0F, -2.0F, 1.8F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.5236F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 10, -1.0F, 0.0F, -2.0F, 1, 0, 5, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.75F, 2.0F, 1.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, -0.9163F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legR3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6545F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 28, -4.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legR3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.0436F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 29, -5.0F, 0.0F, -2.0F, 5, 0, 3, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.75F, 2.0F, 2.25F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, -0.9163F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.6545F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.25F, 0.0F, 1.0F);
        this.legR4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.0436F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 3, -5.75F, 0.0F, -2.0F, 6, 0, 3, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.75F, 2.0F, 2.25F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, -0.9163F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.6545F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.25F, 0.0F, 1.0F);
        this.legL4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.0436F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 3, -0.25F, 0.0F, -2.0F, 6, 0, 3, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, 2.0F, 1.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, -0.9163F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legL3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.6545F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 28, 0.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legL3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.0436F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 29, 0.0F, 0.0F, -2.0F, 5, 0, 3, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.75F, 2.0F, 3.5F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, -0.9163F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.6545F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legR5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.0436F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 0, -6.75F, 0.0F, -1.25F, 7, 0, 3, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.75F, 2.0F, 4.75F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, -0.9163F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.6545F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legR6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 0, -6.75F, 0.0F, -1.25F, 7, 0, 3, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.75F, 2.0F, 4.75F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, -0.9163F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.6545F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legL6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.0436F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 0, -0.25F, 0.0F, -1.25F, 7, 0, 3, 0.0F, true));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.75F, 2.0F, 3.5F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, -0.9163F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.6545F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legL5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.0436F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 0, -0.25F, 0.0F, -1.25F, 7, 0, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 17, 14, -3.0F, -2.0F, -0.1F, 6, 4, 5, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.0F, -2.0F, 1.9F);
        this.body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.5236F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -0.025F, 0.0F, -2.0F, 1, 0, 5, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-3.0F, -2.0F, 1.9F);
        this.body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.5236F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -0.975F, 0.0F, -2.0F, 1, 0, 5, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.75F, 2.0F, 1.1F);
        this.body2.addChild(legR7);
        this.setRotateAngle(legR7, -0.9163F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR7.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.6545F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legR7.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.0436F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 20, 0, -6.75F, 0.0F, -1.25F, 7, 0, 3, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.75F, 2.0F, 1.1F);
        this.body2.addChild(legL7);
        this.setRotateAngle(legL7, -0.9163F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL7.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.6545F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legL7.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 0.0436F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 20, 0, -0.25F, 0.0F, -1.25F, 7, 0, 3, 0.0F, true));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.75F, 2.0F, 2.35F);
        this.body2.addChild(legL8);
        this.setRotateAngle(legL8, -0.9163F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL8.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.6545F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legL8.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, 0.0436F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 0, -0.25F, 0.0F, -1.25F, 7, 0, 3, 0.0F, true));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.75F, 2.0F, 3.6F);
        this.body2.addChild(legL9);
        this.setRotateAngle(legL9, -0.9163F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL9.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.6545F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legL9.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 0.0436F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 0, -0.25F, 0.0F, -1.25F, 7, 0, 3, 0.0F, true));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.75F, 2.0F, 4.85F);
        this.body2.addChild(legL10);
        this.setRotateAngle(legL10, -0.9163F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL10.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.6545F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legL10.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.0436F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 20, 0, -0.25F, 0.0F, -1.25F, 7, 0, 3, 0.0F, true));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.75F, 2.0F, 2.35F);
        this.body2.addChild(legR8);
        this.setRotateAngle(legR8, -0.9163F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR8.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.6545F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legR8.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.0436F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 20, 0, -6.75F, 0.0F, -1.25F, 7, 0, 3, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.75F, 2.0F, 3.6F);
        this.body2.addChild(legR9);
        this.setRotateAngle(legR9, -0.9163F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR9.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.6545F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legR9.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -0.0436F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 0, -6.75F, 0.0F, -1.25F, 7, 0, 3, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.75F, 2.0F, 4.85F);
        this.body2.addChild(legR10);
        this.setRotateAngle(legR10, -0.9163F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR10.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.6545F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legR10.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, -0.0436F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 20, 0, -6.75F, 0.0F, -1.25F, 7, 0, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 4.6F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -2.5F, -1.75F, -0.75F, 5, 3, 7, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(2.5F, -1.75F, 3.25F);
        this.body3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, -0.5236F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 28, 0.0F, 0.0F, -3.1F, 1, 0, 6, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-2.5F, -1.75F, 3.25F);
        this.body3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, 0.5236F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 28, -1.0F, 0.0F, -3.1F, 1, 0, 6, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.75F, 1.0F, 1.5F);
        this.body3.addChild(legR11);
        this.setRotateAngle(legR11, -0.9163F, 0.0F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR11.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.6545F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legR11.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, -0.0436F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 20, 0, -6.75F, 0.0F, -1.25F, 7, 0, 3, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.75F, 1.0F, 1.5F);
        this.body3.addChild(legL11);
        this.setRotateAngle(legL11, -0.9163F, 0.0F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL11.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.6545F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legL11.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.0F, 0.0436F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 20, 0, -0.25F, 0.0F, -1.25F, 7, 0, 3, 0.0F, true));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.75F, 1.0F, 2.75F);
        this.body3.addChild(legL12);
        this.setRotateAngle(legL12, -0.9163F, 0.0F, 0.0F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL12.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.6545F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legL12.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, 0.0436F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 20, 0, -0.25F, 0.0F, -1.25F, 7, 0, 3, 0.0F, true));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.75F, 1.0F, 2.75F);
        this.body3.addChild(legR12);
        this.setRotateAngle(legR12, -0.9163F, 0.0F, 0.0F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR12.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.6545F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legR12.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, -0.0436F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 20, 0, -6.75F, 0.0F, -1.25F, 7, 0, 3, 0.0F, false));

        this.legR13 = new AdvancedModelRenderer(this);
        this.legR13.setRotationPoint(-0.75F, 0.75F, 4.0F);
        this.body3.addChild(legR13);
        this.setRotateAngle(legR13, -0.9163F, 0.0F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR13.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.6545F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.25F, 0.0F, 1.0F);
        this.legR13.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0F, -0.0436F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 20, 3, -5.75F, 0.0F, -2.0F, 6, 0, 3, 0.0F, false));

        this.legL13 = new AdvancedModelRenderer(this);
        this.legL13.setRotationPoint(0.75F, 0.75F, 4.0F);
        this.body3.addChild(legL13);
        this.setRotateAngle(legL13, -0.9163F, 0.0F, 0.0F);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL13.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -0.6545F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.25F, 0.0F, 1.0F);
        this.legL13.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.0F, 0.0436F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 20, 3, -0.25F, 0.0F, -2.0F, 6, 0, 3, 0.0F, true));

        this.legL14 = new AdvancedModelRenderer(this);
        this.legL14.setRotationPoint(0.75F, 0.75F, 5.25F);
        this.body3.addChild(legL14);
        this.setRotateAngle(legL14, -0.9163F, 0.0F, 0.0F);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL14.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.6545F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.25F, 0.0F, 1.0F);
        this.legL14.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, 0.0436F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 20, 3, -0.25F, 0.0F, -2.0F, 6, 0, 3, 0.0F, true));

        this.legR14 = new AdvancedModelRenderer(this);
        this.legR14.setRotationPoint(-0.75F, 0.75F, 5.25F);
        this.body3.addChild(legR14);
        this.setRotateAngle(legR14, -0.9163F, 0.0F, 0.0F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR14.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.6545F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.25F, 0.0F, 1.0F);
        this.legR14.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0F, -0.0436F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 20, 3, -5.75F, 0.0F, -2.0F, 6, 0, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.6F, 5.75F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0436F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 10, -2.0F, -0.75F, -1.0F, 4, 2, 7, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(2.0F, -0.75F, 3.0F);
        this.body4.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, -0.5236F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 27, 23, 0.0F, 0.0F, -3.0F, 1, 0, 6, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-2.0F, -0.75F, 3.0F);
        this.body4.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, 0.5236F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 27, 23, -1.0F, 0.0F, -3.0F, 1, 0, 6, 0.0F, false));

        this.legR15 = new AdvancedModelRenderer(this);
        this.legR15.setRotationPoint(-0.75F, 1.25F, 1.15F);
        this.body4.addChild(legR15);
        this.setRotateAngle(legR15, -0.9163F, 0.0F, 0.0F);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.legR15.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.6545F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 23, 32, -4.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.25F, 0.0F, 1.0F);
        this.legR15.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, -0.0436F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 20, 3, -5.75F, 0.0F, -2.0F, 6, 0, 3, 0.0F, false));

        this.legL15 = new AdvancedModelRenderer(this);
        this.legL15.setRotationPoint(0.75F, 1.25F, 1.15F);
        this.body4.addChild(legL15);
        this.setRotateAngle(legL15, -0.9163F, 0.0F, 0.0F);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.legL15.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, -0.6545F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 23, 32, -0.5F, 0.0F, -0.75F, 5, 0, 1, 0.0F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.25F, 0.0F, 1.0F);
        this.legL15.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.0F, 0.0436F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 20, 3, -0.25F, 0.0F, -2.0F, 6, 0, 3, 0.0F, true));

        this.legR16 = new AdvancedModelRenderer(this);
        this.legR16.setRotationPoint(-0.75F, 1.25F, 2.5F);
        this.body4.addChild(legR16);
        this.setRotateAngle(legR16, -0.9163F, 0.0F, 0.0F);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legR16.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.6545F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 7, 28, -4.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legR16.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.0F, -0.0436F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 5, 29, -5.0F, 0.0F, -2.0F, 5, 0, 3, 0.0F, false));

        this.legL16 = new AdvancedModelRenderer(this);
        this.legL16.setRotationPoint(0.75F, 1.25F, 2.5F);
        this.body4.addChild(legL16);
        this.setRotateAngle(legL16, -0.9163F, 0.0F, 0.0F);


        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legL16.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, -0.6545F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 7, 28, 0.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legL16.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.0F, 0.0436F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 5, 29, 0.0F, 0.0F, -2.0F, 5, 0, 3, 0.0F, true));

        this.legL17 = new AdvancedModelRenderer(this);
        this.legL17.setRotationPoint(0.75F, 1.25F, 3.75F);
        this.body4.addChild(legL17);
        this.setRotateAngle(legL17, -0.9163F, 0.0F, 0.0F);


        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legL17.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, -0.6545F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 7, 28, 0.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legL17.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.0F, 0.0436F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 5, 29, 0.0F, 0.0F, -2.0F, 5, 0, 3, 0.0F, true));

        this.legL18 = new AdvancedModelRenderer(this);
        this.legL18.setRotationPoint(0.75F, 1.25F, 5.0F);
        this.body4.addChild(legL18);
        this.setRotateAngle(legL18, -0.9163F, 0.0F, 0.0F);


        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legL18.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, -0.6545F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 7, 28, 0.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legL18.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, 0.0F, 0.0436F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 5, 29, 0.0F, 0.0F, -2.0F, 5, 0, 3, 0.0F, true));

        this.legR17 = new AdvancedModelRenderer(this);
        this.legR17.setRotationPoint(-0.75F, 1.25F, 3.75F);
        this.body4.addChild(legR17);
        this.setRotateAngle(legR17, -0.9163F, 0.0F, 0.0F);


        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legR17.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, 0.6545F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 7, 28, -4.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legR17.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, 0.0F, -0.0436F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 5, 29, -5.0F, 0.0F, -2.0F, 5, 0, 3, 0.0F, false));

        this.legR18 = new AdvancedModelRenderer(this);
        this.legR18.setRotationPoint(-0.75F, 1.25F, 5.0F);
        this.body4.addChild(legR18);
        this.setRotateAngle(legR18, -0.9163F, 0.0F, 0.0F);


        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legR18.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, 0.6545F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 7, 28, -4.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.legR18.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, 0.0F, -0.0436F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 5, 29, -5.0F, 0.0F, -2.0F, 5, 0, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 5.75F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0436F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 17, 23, -1.5F, -0.5F, -1.0F, 3, 1, 5, 0.0F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(1.5F, -0.5F, 1.75F);
        this.body5.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, 0.0F, -0.5236F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 30, 14, 0.0F, 0.0F, -1.75F, 1, 0, 4, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(-1.5F, -0.5F, 1.75F);
        this.body5.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.0F, 0.5236F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 30, 14, -1.0F, 0.0F, -1.75F, 1, 0, 4, 0.0F, false));

        this.legR19 = new AdvancedModelRenderer(this);
        this.legR19.setRotationPoint(-0.75F, 0.5F, 0.65F);
        this.body5.addChild(legR19);
        this.setRotateAngle(legR19, -0.9163F, 0.0F, 0.0F);


        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(-0.75F, -0.15F, -0.75F);
        this.legR19.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0F, 0.0F, -0.0436F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 6, 32, -3.25F, 0.25F, -0.25F, 4, 0, 2, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(-0.75F, 0.1F, 0.75F);
        this.legR19.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0F, 0.6545F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 0, 5, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL19 = new AdvancedModelRenderer(this);
        this.legL19.setRotationPoint(0.75F, 0.5F, 0.65F);
        this.body5.addChild(legL19);
        this.setRotateAngle(legL19, -0.9163F, 0.0F, 0.0F);


        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(0.75F, -0.15F, -0.75F);
        this.legL19.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, 0.0F, 0.0436F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 6, 32, -0.75F, 0.25F, -0.25F, 4, 0, 2, 0.0F, true));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(0.75F, 0.1F, 0.75F);
        this.legL19.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, -0.6545F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 0, 5, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legL20 = new AdvancedModelRenderer(this);
        this.legL20.setRotationPoint(0.75F, 0.5F, 1.9F);
        this.body5.addChild(legL20);
        this.setRotateAngle(legL20, -0.9163F, 0.0F, 0.0F);


        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.75F, -0.15F, -0.75F);
        this.legL20.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, 0.0F, 0.0436F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 6, 32, -0.75F, 0.25F, -0.25F, 4, 0, 2, 0.0F, true));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(0.75F, 0.1F, 0.75F);
        this.legL20.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, -0.6545F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 0, 5, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legL21 = new AdvancedModelRenderer(this);
        this.legL21.setRotationPoint(0.75F, 0.5F, 3.15F);
        this.body5.addChild(legL21);
        this.setRotateAngle(legL21, -0.9163F, 0.0F, 0.0F);


        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(0.75F, -0.15F, -0.75F);
        this.legL21.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, 0.0F, 0.0436F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 6, 32, -0.75F, 0.25F, -0.25F, 4, 0, 2, 0.0F, true));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(0.75F, 0.1F, 0.75F);
        this.legL21.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, -0.6545F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 0, 5, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legR20 = new AdvancedModelRenderer(this);
        this.legR20.setRotationPoint(-0.75F, 0.5F, 1.9F);
        this.body5.addChild(legR20);
        this.setRotateAngle(legR20, -0.9163F, 0.0F, 0.0F);


        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.75F, -0.15F, -0.75F);
        this.legR20.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.0F, 0.0F, -0.0436F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 6, 32, -3.25F, 0.25F, -0.25F, 4, 0, 2, 0.0F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(-0.75F, 0.1F, 0.75F);
        this.legR20.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0F, 0.6545F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 0, 5, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR21 = new AdvancedModelRenderer(this);
        this.legR21.setRotationPoint(-0.75F, 0.5F, 3.15F);
        this.body5.addChild(legR21);
        this.setRotateAngle(legR21, -0.9163F, 0.0F, 0.0F);


        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(-0.75F, -0.15F, -0.75F);
        this.legR21.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.0F, 0.0F, -0.0436F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 6, 32, -3.25F, 0.25F, -0.25F, 4, 0, 2, 0.0F, false));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(-0.75F, 0.1F, 0.75F);
        this.legR21.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.0F, 0.6545F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 5, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.25F, 4.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0436F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 17, 29, -0.5F, -0.25F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(-1.0F, 0.75F, 0.0F);
        this.body6.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0F, -0.3054F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 10, 0, -1.25F, -0.75F, -0.25F, 3, 0, 7, 0.0F, false));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(1.0F, 0.75F, 0.0F);
        this.body6.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.0F, 0.3054F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 10, 0, -1.75F, -0.75F, -0.25F, 3, 0, 7, 0.0F, true));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-1.25F, 1.0F, -3.0F);
        this.head.addChild(armR);
        this.setRotateAngle(armR, 0.0F, -0.3491F, -0.2618F);
        this.armR.cubeList.add(new ModelBox(armR, 24, 29, -4.0F, -0.5F, -1.0F, 4, 1, 2, 0.01F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-3.25F, 0.0F, -0.5F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, 0.0F, 0.6981F, -0.3491F);
        this.armR2.cubeList.add(new ModelBox(armR2, 0, 32, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(1.25F, 0.0F, -1.5F);
        this.armR2.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.0F, -1.1781F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 9, 10, -1.75F, -0.1F, -4.75F, 2, 0, 6, 0.0F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(-0.25F, 0.0F, -2.0F);
        this.armR2.addChild(armR3);
        this.armR3.cubeList.add(new ModelBox(armR3, 0, 10, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(0.75F, 0.0F, 0.0F);
        this.armR3.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0F, -0.9599F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 13, 29, -2.25F, -0.05F, -4.75F, 2, 0, 5, 0.0F, false));

        this.armR4 = new AdvancedModelRenderer(this);
        this.armR4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.armR3.addChild(armR4);
        this.armR4.cubeList.add(new ModelBox(armR4, 0, 3, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.armR4.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0F, -0.5236F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 0, 28, -0.25F, 0.0F, -3.75F, 1, 0, 4, 0.0F, false));

        this.armR5 = new AdvancedModelRenderer(this);
        this.armR5.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.armR4.addChild(armR5);
        this.setRotateAngle(armR5, 0.0F, 0.2618F, 0.0F);
        this.armR5.cubeList.add(new ModelBox(armR5, 23, 23, -0.5F, 0.025F, -5.0F, 2, 0, 5, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(1.25F, 1.0F, -3.0F);
        this.head.addChild(armL);
        this.setRotateAngle(armL, 0.0F, 0.3491F, 0.2618F);
        this.armL.cubeList.add(new ModelBox(armL, 24, 29, 0.0F, -0.5F, -1.0F, 4, 1, 2, 0.01F, true));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(3.25F, 0.0F, -0.5F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, -0.6981F, 0.3491F);
        this.armL2.cubeList.add(new ModelBox(armL2, 0, 32, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, true));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(-1.25F, 0.0F, -1.5F);
        this.armL2.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0F, 1.1781F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 9, 10, -0.25F, -0.1F, -4.75F, 2, 0, 6, 0.0F, true));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(0.25F, 0.0F, -2.0F);
        this.armL2.addChild(armL3);
        this.armL3.cubeList.add(new ModelBox(armL3, 0, 10, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.01F, true));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(-0.75F, 0.0F, 0.0F);
        this.armL3.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0F, 0.9599F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 13, 29, 0.25F, -0.05F, -4.75F, 2, 0, 5, 0.0F, true));

        this.armL4 = new AdvancedModelRenderer(this);
        this.armL4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.armL3.addChild(armL4);
        this.armL4.cubeList.add(new ModelBox(armL4, 0, 3, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.armL4.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0F, 0.5236F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 0, 28, -0.75F, 0.0F, -3.75F, 1, 0, 4, 0.0F, true));

        this.armL5 = new AdvancedModelRenderer(this);
        this.armL5.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.armL4.addChild(armL5);
        this.setRotateAngle(armL5, 0.0F, -0.2618F, 0.0F);
        this.armL5.cubeList.add(new ModelBox(armL5, 23, 23, -1.5F, 0.025F, -5.0F, 2, 0, 5, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.18F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.head.offsetZ = -0.06F;
        this.head.render(0.01F);
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
        this.head.offsetY = 1.2F;

        float speed = 0.4F * 0.2F;
        float tailVdegree = 0.75F * 0.2F;
        float tailHdegree = 0.0F * 0.2F;
        float tailSwing = 0.75F * 0.2F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.25F * 0.2F;
            tailVdegree = 0.075F * 0.2F;
            tailHdegree = 0.3F * 0.2F;
            tailSwing = 0.6F * 0.2F;
        }
        if (!e.isInWater()) {
            speed = 0.7F * 0.2F;
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10, this.legL11, this.legL12, this.legL13, this.legL14, this.legL15, this.legL16, this.legL17, this.legL18, this.legL19, this.legL20, this.legL21};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10, this.legR11, this.legR12, this.legR13, this.legR14, this.legR15, this.legR16, this.legR17, this.legR18, this.legR19, this.legR20, this.legR21};
        AdvancedModelRenderer[] bodyF = {this.body2, this.body3, this.body4,this.body5,this.body6};
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6};
        AdvancedModelRenderer[] pincerL = {this.armL, this.armL2, this.armL3, this.armL4, this.armL5};
        AdvancedModelRenderer[] pincerR = {this.armR, this.armR2, this.armR3, this.armR4, this.armR5};

        this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
        this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

        this.chainSwing(pincerL, speed * 3F, 0.15F, 0.5F, f2, 0.1F);
        this.chainSwing(pincerR, speed *  3F, -0.15F, 0.5F, f2, 0.1F);
        this.swing(armL, speed * 3F, 0.6F, true, 0, 0.5F, f2, 0.5F);
        this.swing(armR, speed * 3F, -0.6F, true, 0, -0.5F, f2, 0.5F);

        if (isAtBottom && e.isInWater()) {
            if (f3 != 0.0) {
                this.chainWave(legsL, 0.8F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.8F, 0.2F, -3, f2, 1);
                this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.flap(legL6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.flap(legR6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
                this.flap(legL7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
                this.flap(legR7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
                this.flap(legL8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
                this.flap(legR8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
                this.flap(legL9, 0.5F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
                this.flap(legR9, 0.5F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
                this.flap(legL10, 0.5F, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
                this.flap(legR10, 0.5F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
                this.flap(legL11, 0.5F, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
                this.flap(legR11, 0.5F, 0.5F, false, 10.0F, 0.5F, f2, 0.3F);
                this.flap(legL12, 0.5F, -0.5F, false, 11.0F, -0.5F, f2, 0.3F);
                this.flap(legR12, 0.5F, 0.5F, false, 11.0F, 0.5F, f2, 0.3F);
                this.flap(legL13, 0.5F, -0.5F, false, 12.0F, -0.5F, f2, 0.3F);
                this.flap(legR13, 0.5F, 0.5F, false, 12.0F, 0.5F, f2, 0.3F);
                this.flap(legL14, 0.5F, -0.5F, false, 13.0F, -0.5F, f2, 0.3F);
                this.flap(legR14, 0.5F, 0.5F, false, 13.0F, 0.5F, f2, 0.3F);
                this.flap(legL15, 0.5F, -0.5F, false, 14.0F, -0.5F, f2, 0.3F);
                this.flap(legR15, 0.5F, 0.5F, false, 14.0F, 0.5F, f2, 0.3F);
                this.flap(legL16, 0.5F, -0.5F, false, 15.0F, -0.5F, f2, 0.3F);
                this.flap(legR16, 0.5F, 0.5F, false, 15.0F, 0.5F, f2, 0.3F);
                this.flap(legL17, 0.5F, -0.5F, false, 16.0F, -0.5F, f2, 0.3F);
                this.flap(legR17, 0.5F, 0.5F, false, 16.0F, 0.5F, f2, 0.3F);
                this.flap(legL18, 0.5F, -0.5F, false, 17.0F, -0.5F, f2, 0.3F);
                this.flap(legR18, 0.5F, 0.5F, false, 17.0F, 0.5F, f2, 0.3F);
                this.flap(legL19, 0.5F, -0.5F, false, 18.0F, -0.5F, f2, 0.3F);
                this.flap(legR19, 0.5F, 0.5F, false, 18.0F, 0.5F, f2, 0.3F);
                this.flap(legL20, 0.5F, -0.5F, false, 19.0F, -0.5F, f2, 0.3F);
                this.flap(legR20, 0.5F, 0.5F, false, 19.0F, 0.5F, f2, 0.3F);
                this.flap(legL21, 0.5F, -0.5F, false, 20.0F, -0.5F, f2, 0.3F);
                this.flap(legR21, 0.5F, 0.5F, false, 20.0F, 0.5F, f2, 0.3F);
                //this.bob(head, -speed, 1.5F, false, f2, 2);
                this.walk(body6, 0.8F, -0.015f, false, 2, 0.2F, f2, 1F);
                this.chainWave(bodyF, 0.8F, 0.03f, 0.5, f2, 0.4F);
            }
            this.chainSwing(bodyF, 0.1F, 0.03F, -3, f2, 1.0F);
        }
        else if (e.isInWater()) {
            this.chainWave(legsL, 0.4F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.4F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.4F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.4F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.4F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.4F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.4F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.4F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.4F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.4F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.4F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.4F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(legL6, 0.4F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(legR6, 0.4F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.flap(legL7, 0.4F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.4F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(legL8, 0.4F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(legR8, 0.4F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
            this.flap(legL9, 0.4F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(legR9, 0.4F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.flap(legL10, 0.4F, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
            this.flap(legR10, 0.4F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
            this.flap(legL11, 0.4F, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
            this.flap(legR11, 0.4F, 0.5F, false, 10.0F, 0.5F, f2, 0.3F);
            this.flap(legL12, 0.4F, -0.5F, false, 11.0F, -0.5F, f2, 0.3F);
            this.flap(legR12, 0.4F, 0.5F, false, 11.0F, 0.5F, f2, 0.3F);
            this.flap(legL13, 0.4F, -0.5F, false, 12.0F, -0.5F, f2, 0.3F);
            this.flap(legR13, 0.4F, 0.5F, false, 12.0F, 0.5F, f2, 0.3F);
            this.flap(legL14, 0.4F, -0.5F, false, 13.0F, -0.5F, f2, 0.3F);
            this.flap(legR14, 0.4F, 0.5F, false, 13.0F, 0.5F, f2, 0.3F);
            this.flap(legL15, 0.4F, -0.5F, false, 14.0F, -0.5F, f2, 0.3F);
            this.flap(legR15, 0.4F, 0.5F, false, 14.0F, 0.5F, f2, 0.3F);
            this.flap(legL16, 0.4F, -0.5F, false, 15.0F, -0.5F, f2, 0.3F);
            this.flap(legR16, 0.4F, 0.5F, false, 15.0F, 0.5F, f2, 0.3F);
            this.flap(legL17, 0.4F, -0.5F, false, 16.0F, -0.5F, f2, 0.3F);
            this.flap(legR17, 0.4F, 0.5F, false, 16.0F, 0.5F, f2, 0.3F);
            this.flap(legL18, 0.4F, -0.5F, false, 17.0F, -0.5F, f2, 0.3F);
            this.flap(legR18, 0.4F, 0.5F, false, 17.0F, 0.5F, f2, 0.3F);
            this.flap(legL19, 0.4F, -0.5F, false, 18.0F, -0.5F, f2, 0.3F);
            this.flap(legR19, 0.4F, 0.5F, false, 18.0F, 0.5F, f2, 0.3F);
            this.flap(legL20, 0.4F, -0.5F, false, 19.0F, -0.5F, f2, 0.3F);
            this.flap(legR20, 0.4F, 0.5F, false, 19.0F, 0.5F, f2, 0.3F);
            this.flap(legL21, 0.4F, -0.5F, false, 20.0F, -0.5F, f2, 0.3F);
            this.flap(legR21, 0.4F, 0.5F, false, 20.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.35F, 0.3f, -3, f2, 0.6F);
            //this.bob(head, 0.2F, 0.2F, false, f2, 1);
        }


        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            this.head.offsetY = 1.2F;
            this.bob(head, -speed * 3F, 2F, false, f2, 1);
            this.chainWave(fishTail, speed * 4F, tailHdegree * 3F, -3, f2, 1);
            this.chainSwing(fishTail, speed * 4F, tailVdegree * 3F, -3, f2, 1);
        }

    }
}
