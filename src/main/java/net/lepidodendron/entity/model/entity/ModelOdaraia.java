package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelOdaraia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer finR;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer finR11;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer finR12;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer finR13;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legR13;
    private final AdvancedModelRenderer finR14;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer legR14;
    private final AdvancedModelRenderer finR15;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer legR15;
    private final AdvancedModelRenderer finR16;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer legR16;
    private final AdvancedModelRenderer finR17;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer legR17;
    private final AdvancedModelRenderer finR18;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer legR18;
    private final AdvancedModelRenderer finR19;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer legR19;
    private final AdvancedModelRenderer finR20;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer legR20;
    private final AdvancedModelRenderer finR21;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer legR21;
    private final AdvancedModelRenderer finR22;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer legR22;
    private final AdvancedModelRenderer finR23;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer legR23;
    private final AdvancedModelRenderer finR24;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer legR24;
    private final AdvancedModelRenderer finR25;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer finL10;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer finL11;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer finL12;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer finL13;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer legL13;
    private final AdvancedModelRenderer finL14;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer legL14;
    private final AdvancedModelRenderer finL15;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer legL15;
    private final AdvancedModelRenderer finL16;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer legL16;
    private final AdvancedModelRenderer finL17;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer legL17;
    private final AdvancedModelRenderer finL18;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer legL18;
    private final AdvancedModelRenderer finL19;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer legL19;
    private final AdvancedModelRenderer finL20;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer legL20;
    private final AdvancedModelRenderer finL21;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer legL21;
    private final AdvancedModelRenderer finL22;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer legL22;
    private final AdvancedModelRenderer finL23;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer legL23;
    private final AdvancedModelRenderer finL24;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer legL25;
    private final AdvancedModelRenderer finL26;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer legL26;
    private final AdvancedModelRenderer finL27;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer cube_r99;
    private final AdvancedModelRenderer cube_r100;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer cube_r101;
    private final AdvancedModelRenderer cube_r102;
    private final AdvancedModelRenderer legsR2;
    private final AdvancedModelRenderer finR28;
    private final AdvancedModelRenderer cube_r103;
    private final AdvancedModelRenderer cube_r104;
    private final AdvancedModelRenderer legsL2;
    private final AdvancedModelRenderer finL30;
    private final AdvancedModelRenderer cube_r105;
    private final AdvancedModelRenderer cube_r106;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r107;
    private final AdvancedModelRenderer legsL3;
    private final AdvancedModelRenderer finL31;
    private final AdvancedModelRenderer cube_r108;
    private final AdvancedModelRenderer cube_r109;
    private final AdvancedModelRenderer legsL4;
    private final AdvancedModelRenderer finL28;
    private final AdvancedModelRenderer cube_r110;
    private final AdvancedModelRenderer cube_r111;
    private final AdvancedModelRenderer legsL5;
    private final AdvancedModelRenderer finL29;
    private final AdvancedModelRenderer cube_r112;
    private final AdvancedModelRenderer cube_r113;
    private final AdvancedModelRenderer legsR3;
    private final AdvancedModelRenderer finR29;
    private final AdvancedModelRenderer cube_r114;
    private final AdvancedModelRenderer cube_r115;
    private final AdvancedModelRenderer legsR4;
    private final AdvancedModelRenderer finR30;
    private final AdvancedModelRenderer cube_r116;
    private final AdvancedModelRenderer cube_r117;
    private final AdvancedModelRenderer legsR5;
    private final AdvancedModelRenderer finR31;
    private final AdvancedModelRenderer cube_r118;
    private final AdvancedModelRenderer cube_r119;
    private final AdvancedModelRenderer legR25;
    private final AdvancedModelRenderer finR26;
    private final AdvancedModelRenderer cube_r120;
    private final AdvancedModelRenderer cube_r121;
    private final AdvancedModelRenderer legR26;
    private final AdvancedModelRenderer finR27;
    private final AdvancedModelRenderer cube_r122;
    private final AdvancedModelRenderer cube_r123;
    private final AdvancedModelRenderer legL24;
    private final AdvancedModelRenderer finL25;
    private final AdvancedModelRenderer cube_r124;
    private final AdvancedModelRenderer cube_r125;

    public ModelOdaraia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.0F, -5.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, -3.1416F);
        this.body.cubeList.add(new ModelBox(body, 0, 22, -1.5F, -2.0F, -1.99F, 3, 2, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -3.5F, -2.25F, 9, 7, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 0, -1.0F, -2.25F, -3.0F, 2, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 4, 24, 1.0F, -2.0F, -3.25F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 13, -2.0F, -2.0F, -3.25F, 1, 1, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, -0.5F, -0.5F);
        this.body.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL3.addChild(finL4);
        this.setRotateAngle(finL4, 0.0F, 0.5236F, 0.0F);
        this.finL4.cubeList.add(new ModelBox(finL4, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, -0.5F, -1.0F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL2.addChild(finL3);
        this.setRotateAngle(finL3, 0.0F, 0.5236F, 0.0F);
        this.finL3.cubeList.add(new ModelBox(finL3, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.4363F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.25F, -0.5F, -1.5F);
        this.body.addChild(legL);
        this.legL.cubeList.add(new ModelBox(legL, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL.addChild(finL);
        this.setRotateAngle(finL, 0.0F, 0.5236F, 0.0F);
        this.finL.cubeList.add(new ModelBox(finL, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.25F, -0.5F, -1.5F);
        this.body.addChild(legR);
        this.legR.cubeList.add(new ModelBox(legR, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR.addChild(finR);
        this.setRotateAngle(finR, 0.0F, -0.5236F, 0.0F);
        this.finR.cubeList.add(new ModelBox(finR, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3927F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, -0.5F, -1.0F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR2.addChild(finR3);
        this.setRotateAngle(finR3, 0.0F, -0.5236F, 0.0F);
        this.finR3.cubeList.add(new ModelBox(finR3, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.3927F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.4363F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.25F, -0.5F, -0.5F);
        this.body.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR3.addChild(finR4);
        this.setRotateAngle(finR4, 0.0F, -0.5236F, 0.0F);
        this.finR4.cubeList.add(new ModelBox(finR4, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3927F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.4363F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.25F, -0.5F, 0.0F);
        this.body.addChild(legR4);
        this.legR4.cubeList.add(new ModelBox(legR4, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR4.addChild(finR5);
        this.setRotateAngle(finR5, 0.0F, -0.5236F, 0.0F);
        this.finR5.cubeList.add(new ModelBox(finR5, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.4363F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.body.addChild(legR5);
        this.legR5.cubeList.add(new ModelBox(legR5, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR5.addChild(finR6);
        this.setRotateAngle(finR6, 0.0F, -0.5236F, 0.0F);
        this.finR6.cubeList.add(new ModelBox(finR6, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.3927F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.4363F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.25F, -0.5F, 1.0F);
        this.body.addChild(legR6);
        this.legR6.cubeList.add(new ModelBox(legR6, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR6.addChild(finR7);
        this.setRotateAngle(finR7, 0.0F, -0.5236F, 0.0F);
        this.finR7.cubeList.add(new ModelBox(finR7, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR7.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.3927F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR7.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.4363F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.25F, -0.5F, 1.5F);
        this.body.addChild(legR7);
        this.legR7.cubeList.add(new ModelBox(legR7, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR7.addChild(finR8);
        this.setRotateAngle(finR8, 0.0F, -0.5236F, 0.0F);
        this.finR8.cubeList.add(new ModelBox(finR8, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.3927F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.4363F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.25F, -0.5F, 2.0F);
        this.body.addChild(legR8);
        this.legR8.cubeList.add(new ModelBox(legR8, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR8.addChild(finR9);
        this.setRotateAngle(finR9, 0.0F, -0.5236F, 0.0F);
        this.finR9.cubeList.add(new ModelBox(finR9, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR9.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.3927F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR9.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.4363F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.25F, -0.5F, 2.5F);
        this.body.addChild(legR9);
        this.legR9.cubeList.add(new ModelBox(legR9, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR9.addChild(finR10);
        this.setRotateAngle(finR10, 0.0F, -0.5236F, 0.0F);
        this.finR10.cubeList.add(new ModelBox(finR10, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR10.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.3927F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR10.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.4363F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.25F, -0.5F, 3.0F);
        this.body.addChild(legR10);
        this.legR10.cubeList.add(new ModelBox(legR10, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR10.addChild(finR11);
        this.setRotateAngle(finR11, 0.0F, -0.5236F, 0.0F);
        this.finR11.cubeList.add(new ModelBox(finR11, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR11.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.3927F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR11.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.4363F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.25F, -0.5F, 3.5F);
        this.body.addChild(legR11);
        this.legR11.cubeList.add(new ModelBox(legR11, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR12 = new AdvancedModelRenderer(this);
        this.finR12.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR11.addChild(finR12);
        this.setRotateAngle(finR12, 0.0F, -0.5236F, 0.0F);
        this.finR12.cubeList.add(new ModelBox(finR12, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR12.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.3927F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR12.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.4363F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.25F, -0.5F, 4.0F);
        this.body.addChild(legR12);
        this.legR12.cubeList.add(new ModelBox(legR12, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR13 = new AdvancedModelRenderer(this);
        this.finR13.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR12.addChild(finR13);
        this.setRotateAngle(finR13, 0.0F, -0.5236F, 0.0F);
        this.finR13.cubeList.add(new ModelBox(finR13, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR13.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.3927F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR13.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.4363F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR13 = new AdvancedModelRenderer(this);
        this.legR13.setRotationPoint(-0.25F, -0.5F, 4.5F);
        this.body.addChild(legR13);
        this.legR13.cubeList.add(new ModelBox(legR13, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR14 = new AdvancedModelRenderer(this);
        this.finR14.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR13.addChild(finR14);
        this.setRotateAngle(finR14, 0.0F, -0.5236F, 0.0F);
        this.finR14.cubeList.add(new ModelBox(finR14, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR14.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.3927F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR14.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -0.4363F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR14 = new AdvancedModelRenderer(this);
        this.legR14.setRotationPoint(-0.25F, -0.5F, 5.0F);
        this.body.addChild(legR14);
        this.legR14.cubeList.add(new ModelBox(legR14, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR15 = new AdvancedModelRenderer(this);
        this.finR15.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR14.addChild(finR15);
        this.setRotateAngle(finR15, 0.0F, -0.5236F, 0.0F);
        this.finR15.cubeList.add(new ModelBox(finR15, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR15.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.3927F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR15.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, -0.4363F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR15 = new AdvancedModelRenderer(this);
        this.legR15.setRotationPoint(-0.25F, -0.5F, 5.5F);
        this.body.addChild(legR15);
        this.legR15.cubeList.add(new ModelBox(legR15, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR16 = new AdvancedModelRenderer(this);
        this.finR16.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR15.addChild(finR16);
        this.setRotateAngle(finR16, 0.0F, -0.5236F, 0.0F);
        this.finR16.cubeList.add(new ModelBox(finR16, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR16.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.3927F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR16.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.4363F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR16 = new AdvancedModelRenderer(this);
        this.legR16.setRotationPoint(-0.25F, -0.5F, 6.0F);
        this.body.addChild(legR16);
        this.legR16.cubeList.add(new ModelBox(legR16, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR17 = new AdvancedModelRenderer(this);
        this.finR17.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR16.addChild(finR17);
        this.setRotateAngle(finR17, 0.0F, -0.5236F, 0.0F);
        this.finR17.cubeList.add(new ModelBox(finR17, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR17.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, 0.3927F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR17.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -0.4363F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR17 = new AdvancedModelRenderer(this);
        this.legR17.setRotationPoint(-0.25F, -0.5F, 6.5F);
        this.body.addChild(legR17);
        this.legR17.cubeList.add(new ModelBox(legR17, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR18 = new AdvancedModelRenderer(this);
        this.finR18.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR17.addChild(finR18);
        this.setRotateAngle(finR18, 0.0F, -0.5236F, 0.0F);
        this.finR18.cubeList.add(new ModelBox(finR18, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR18.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 0.3927F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR18.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, -0.4363F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR18 = new AdvancedModelRenderer(this);
        this.legR18.setRotationPoint(-0.25F, -0.5F, 7.0F);
        this.body.addChild(legR18);
        this.legR18.cubeList.add(new ModelBox(legR18, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR19 = new AdvancedModelRenderer(this);
        this.finR19.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR18.addChild(finR19);
        this.setRotateAngle(finR19, 0.0F, -0.5236F, 0.0F);
        this.finR19.cubeList.add(new ModelBox(finR19, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR19.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.3927F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR19.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -0.4363F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR19 = new AdvancedModelRenderer(this);
        this.legR19.setRotationPoint(-0.25F, -0.5F, 7.5F);
        this.body.addChild(legR19);
        this.legR19.cubeList.add(new ModelBox(legR19, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR20 = new AdvancedModelRenderer(this);
        this.finR20.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR19.addChild(finR20);
        this.setRotateAngle(finR20, 0.0F, -0.5236F, 0.0F);
        this.finR20.cubeList.add(new ModelBox(finR20, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR20.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, 0.3927F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR20.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, -0.4363F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR20 = new AdvancedModelRenderer(this);
        this.legR20.setRotationPoint(-0.25F, -0.5F, 8.0F);
        this.body.addChild(legR20);
        this.legR20.cubeList.add(new ModelBox(legR20, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR21 = new AdvancedModelRenderer(this);
        this.finR21.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR20.addChild(finR21);
        this.setRotateAngle(finR21, 0.0F, -0.5236F, 0.0F);
        this.finR21.cubeList.add(new ModelBox(finR21, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR21.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, 0.3927F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR21.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.0F, -0.4363F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR21 = new AdvancedModelRenderer(this);
        this.legR21.setRotationPoint(-0.25F, -0.5F, 8.5F);
        this.body.addChild(legR21);
        this.legR21.cubeList.add(new ModelBox(legR21, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR22 = new AdvancedModelRenderer(this);
        this.finR22.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR21.addChild(finR22);
        this.setRotateAngle(finR22, 0.0F, -0.5236F, 0.0F);
        this.finR22.cubeList.add(new ModelBox(finR22, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR22.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, 0.3927F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR22.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, -0.4363F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR22 = new AdvancedModelRenderer(this);
        this.legR22.setRotationPoint(-0.25F, -0.5F, 9.0F);
        this.body.addChild(legR22);
        this.legR22.cubeList.add(new ModelBox(legR22, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR23 = new AdvancedModelRenderer(this);
        this.finR23.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR22.addChild(finR23);
        this.setRotateAngle(finR23, 0.0F, -0.5236F, 0.0F);
        this.finR23.cubeList.add(new ModelBox(finR23, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR23.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, 0.3927F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR23.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, -0.4363F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR23 = new AdvancedModelRenderer(this);
        this.legR23.setRotationPoint(-0.25F, -0.5F, 9.5F);
        this.body.addChild(legR23);
        this.legR23.cubeList.add(new ModelBox(legR23, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR24 = new AdvancedModelRenderer(this);
        this.finR24.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR23.addChild(finR24);
        this.setRotateAngle(finR24, 0.0F, -0.5236F, 0.0F);
        this.finR24.cubeList.add(new ModelBox(finR24, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR24.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, 0.3927F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR24.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0F, -0.4363F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR24 = new AdvancedModelRenderer(this);
        this.legR24.setRotationPoint(-0.25F, -0.5F, 10.0F);
        this.body.addChild(legR24);
        this.legR24.cubeList.add(new ModelBox(legR24, 8, 22, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR25 = new AdvancedModelRenderer(this);
        this.finR25.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR24.addChild(finR25);
        this.setRotateAngle(finR25, 0.0F, -0.5236F, 0.0F);
        this.finR25.cubeList.add(new ModelBox(finR25, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR25.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.0F, 0.3927F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR25.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.0F, -0.4363F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.25F, -0.5F, 0.0F);
        this.body.addChild(legL4);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL4.addChild(finL5);
        this.setRotateAngle(finL5, 0.0F, 0.5236F, 0.0F);
        this.finL5.cubeList.add(new ModelBox(finL5, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL5.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.0F, -0.3927F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL5.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, 0.4363F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.body.addChild(legL5);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL5.addChild(finL6);
        this.setRotateAngle(finL6, 0.0F, 0.5236F, 0.0F);
        this.finL6.cubeList.add(new ModelBox(finL6, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL6.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.0F, -0.3927F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL6.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0F, 0.4363F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.25F, -0.5F, 1.0F);
        this.body.addChild(legL6);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL6.addChild(finL7);
        this.setRotateAngle(finL7, 0.0F, 0.5236F, 0.0F);
        this.finL7.cubeList.add(new ModelBox(finL7, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL7.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, -0.3927F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL7.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, 0.4363F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.25F, -0.5F, 1.5F);
        this.body.addChild(legL7);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL7.addChild(finL8);
        this.setRotateAngle(finL8, 0.0F, 0.5236F, 0.0F);
        this.finL8.cubeList.add(new ModelBox(finL8, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL8.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.0F, -0.3927F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL8.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, 0.4363F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.25F, -0.5F, 2.0F);
        this.body.addChild(legL8);
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL8.addChild(finL9);
        this.setRotateAngle(finL9, 0.0F, 0.5236F, 0.0F);
        this.finL9.cubeList.add(new ModelBox(finL9, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL9.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, 0.0F, -0.3927F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL9.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.0F, 0.4363F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.25F, -0.5F, 2.5F);
        this.body.addChild(legL9);
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL9.addChild(finL10);
        this.setRotateAngle(finL10, 0.0F, 0.5236F, 0.0F);
        this.finL10.cubeList.add(new ModelBox(finL10, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL10.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.0F, -0.3927F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL10.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.0F, 0.4363F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.25F, -0.5F, 3.0F);
        this.body.addChild(legL10);
        this.legL10.cubeList.add(new ModelBox(legL10, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL10.addChild(finL11);
        this.setRotateAngle(finL11, 0.0F, 0.5236F, 0.0F);
        this.finL11.cubeList.add(new ModelBox(finL11, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL11.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, 0.0F, -0.3927F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL11.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.0F, 0.4363F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.25F, -0.5F, 3.5F);
        this.body.addChild(legL11);
        this.legL11.cubeList.add(new ModelBox(legL11, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL12 = new AdvancedModelRenderer(this);
        this.finL12.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL11.addChild(finL12);
        this.setRotateAngle(finL12, 0.0F, 0.5236F, 0.0F);
        this.finL12.cubeList.add(new ModelBox(finL12, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL12.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, 0.0F, -0.3927F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL12.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.0F, 0.4363F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.25F, -0.5F, 4.0F);
        this.body.addChild(legL12);
        this.legL12.cubeList.add(new ModelBox(legL12, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL13 = new AdvancedModelRenderer(this);
        this.finL13.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL12.addChild(finL13);
        this.setRotateAngle(finL13, 0.0F, 0.5236F, 0.0F);
        this.finL13.cubeList.add(new ModelBox(finL13, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL13.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.0F, -0.3927F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL13.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, 0.0F, 0.4363F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL13 = new AdvancedModelRenderer(this);
        this.legL13.setRotationPoint(0.25F, -0.5F, 4.5F);
        this.body.addChild(legL13);
        this.legL13.cubeList.add(new ModelBox(legL13, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL14 = new AdvancedModelRenderer(this);
        this.finL14.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL13.addChild(finL14);
        this.setRotateAngle(finL14, 0.0F, 0.5236F, 0.0F);
        this.finL14.cubeList.add(new ModelBox(finL14, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL14.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, 0.0F, -0.3927F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL14.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, 0.0F, 0.4363F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL14 = new AdvancedModelRenderer(this);
        this.legL14.setRotationPoint(0.25F, -0.5F, 5.0F);
        this.body.addChild(legL14);
        this.legL14.cubeList.add(new ModelBox(legL14, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL15 = new AdvancedModelRenderer(this);
        this.finL15.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL14.addChild(finL15);
        this.setRotateAngle(finL15, 0.0F, 0.5236F, 0.0F);
        this.finL15.cubeList.add(new ModelBox(finL15, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL15.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, 0.0F, -0.3927F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL15.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, 0.0F, 0.4363F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL15 = new AdvancedModelRenderer(this);
        this.legL15.setRotationPoint(0.25F, -0.5F, 5.5F);
        this.body.addChild(legL15);
        this.legL15.cubeList.add(new ModelBox(legL15, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL16 = new AdvancedModelRenderer(this);
        this.finL16.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL15.addChild(finL16);
        this.setRotateAngle(finL16, 0.0F, 0.5236F, 0.0F);
        this.finL16.cubeList.add(new ModelBox(finL16, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL16.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, 0.0F, -0.3927F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL16.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.0F, 0.4363F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL16 = new AdvancedModelRenderer(this);
        this.legL16.setRotationPoint(0.25F, -0.5F, 6.0F);
        this.body.addChild(legL16);
        this.legL16.cubeList.add(new ModelBox(legL16, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL17 = new AdvancedModelRenderer(this);
        this.finL17.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL16.addChild(finL17);
        this.setRotateAngle(finL17, 0.0F, 0.5236F, 0.0F);
        this.finL17.cubeList.add(new ModelBox(finL17, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL17.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0F, 0.0F, -0.3927F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL17.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0F, 0.0F, 0.4363F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL17 = new AdvancedModelRenderer(this);
        this.legL17.setRotationPoint(0.25F, -0.5F, 6.5F);
        this.body.addChild(legL17);
        this.legL17.cubeList.add(new ModelBox(legL17, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL18 = new AdvancedModelRenderer(this);
        this.finL18.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL17.addChild(finL18);
        this.setRotateAngle(finL18, 0.0F, 0.5236F, 0.0F);
        this.finL18.cubeList.add(new ModelBox(finL18, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL18.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, 0.0F, -0.3927F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL18.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, 0.0F, 0.4363F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL18 = new AdvancedModelRenderer(this);
        this.legL18.setRotationPoint(0.25F, -0.5F, 7.0F);
        this.body.addChild(legL18);
        this.legL18.cubeList.add(new ModelBox(legL18, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL19 = new AdvancedModelRenderer(this);
        this.finL19.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL18.addChild(finL19);
        this.setRotateAngle(finL19, 0.0F, 0.5236F, 0.0F);
        this.finL19.cubeList.add(new ModelBox(finL19, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL19.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, 0.0F, -0.3927F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL19.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, 0.0F, 0.4363F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL19 = new AdvancedModelRenderer(this);
        this.legL19.setRotationPoint(0.25F, -0.5F, 7.5F);
        this.body.addChild(legL19);
        this.legL19.cubeList.add(new ModelBox(legL19, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL20 = new AdvancedModelRenderer(this);
        this.finL20.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL19.addChild(finL20);
        this.setRotateAngle(finL20, 0.0F, 0.5236F, 0.0F);
        this.finL20.cubeList.add(new ModelBox(finL20, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL20.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, 0.0F, -0.3927F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL20.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, 0.0F, 0.4363F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL20 = new AdvancedModelRenderer(this);
        this.legL20.setRotationPoint(0.25F, -0.5F, 8.0F);
        this.body.addChild(legL20);
        this.legL20.cubeList.add(new ModelBox(legL20, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL21 = new AdvancedModelRenderer(this);
        this.finL21.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL20.addChild(finL21);
        this.setRotateAngle(finL21, 0.0F, 0.5236F, 0.0F);
        this.finL21.cubeList.add(new ModelBox(finL21, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL21.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.0F, 0.0F, -0.3927F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL21.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0F, 0.0F, 0.4363F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL21 = new AdvancedModelRenderer(this);
        this.legL21.setRotationPoint(0.25F, -0.5F, 8.5F);
        this.body.addChild(legL21);
        this.legL21.cubeList.add(new ModelBox(legL21, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL22 = new AdvancedModelRenderer(this);
        this.finL22.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL21.addChild(finL22);
        this.setRotateAngle(finL22, 0.0F, 0.5236F, 0.0F);
        this.finL22.cubeList.add(new ModelBox(finL22, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL22.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.0F, 0.0F, -0.3927F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL22.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.0F, 0.0F, 0.4363F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL22 = new AdvancedModelRenderer(this);
        this.legL22.setRotationPoint(0.25F, -0.5F, 9.0F);
        this.body.addChild(legL22);
        this.legL22.cubeList.add(new ModelBox(legL22, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL23 = new AdvancedModelRenderer(this);
        this.finL23.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL22.addChild(finL23);
        this.setRotateAngle(finL23, 0.0F, 0.5236F, 0.0F);
        this.finL23.cubeList.add(new ModelBox(finL23, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL23.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0F, 0.0F, -0.3927F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL23.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.0F, 0.0F, 0.4363F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL23 = new AdvancedModelRenderer(this);
        this.legL23.setRotationPoint(0.25F, -0.5F, 9.5F);
        this.body.addChild(legL23);
        this.legL23.cubeList.add(new ModelBox(legL23, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL24 = new AdvancedModelRenderer(this);
        this.finL24.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL23.addChild(finL24);
        this.setRotateAngle(finL24, 0.0F, 0.5236F, 0.0F);
        this.finL24.cubeList.add(new ModelBox(finL24, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL24.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.0F, 0.0F, -0.3927F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL24.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0F, 0.0F, 0.4363F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.75F, 10.0F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 6, 8, -1.0F, -0.5F, -0.01F, 2, 1, 2, 0.0F, false));

        this.legL25 = new AdvancedModelRenderer(this);
        this.legL25.setRotationPoint(0.0F, 0.25F, 0.5F);
        this.body1.addChild(legL25);
        this.legL25.cubeList.add(new ModelBox(legL25, 0, 24, 0.25F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL26 = new AdvancedModelRenderer(this);
        this.finL26.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL25.addChild(finL26);
        this.setRotateAngle(finL26, 0.0F, 0.5236F, 0.0F);
        this.finL26.cubeList.add(new ModelBox(finL26, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL26.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0F, 0.0F, -0.3927F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL26.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0F, 0.0F, 0.4363F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL26 = new AdvancedModelRenderer(this);
        this.legL26.setRotationPoint(-0.25F, 0.25F, 1.0F);
        this.body1.addChild(legL26);
        this.legL26.cubeList.add(new ModelBox(legL26, 0, 24, 0.5F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL27 = new AdvancedModelRenderer(this);
        this.finL27.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL26.addChild(finL27);
        this.setRotateAngle(finL27, 0.0F, 0.5236F, 0.0F);
        this.finL27.cubeList.add(new ModelBox(finL27, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL27.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0F, 0.0F, -0.3927F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL27.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0F, 0.0F, 0.4363F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(0.25F, 0.25F, 1.5F);
        this.body1.addChild(legsL);
        this.legsL.cubeList.add(new ModelBox(legsL, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(1.75F, 1.0F, 0.5F);
        this.legsL.addChild(finL2);
        this.setRotateAngle(finL2, 0.0F, 0.5236F, 0.0F);
        this.finL2.cubeList.add(new ModelBox(finL2, 6, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL2.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0F, 0.0F, -0.3927F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL2.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.0F, 0.0F, 0.4363F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 10, 5, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(-0.25F, 0.25F, 1.5F);
        this.body1.addChild(legsR);
        this.legsR.cubeList.add(new ModelBox(legsR, 0, 6, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-1.75F, 1.0F, 0.5F);
        this.legsR.addChild(finR2);
        this.setRotateAngle(finR2, 0.0F, -0.5236F, 0.0F);
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 8, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR2.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0F, 0.0F, 0.3927F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 12, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR2.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0F, 0.0F, -0.4363F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 4, 12, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.legsR2 = new AdvancedModelRenderer(this);
        this.legsR2.setRotationPoint(-0.25F, 0.25F, 2.0F);
        this.body1.addChild(legsR2);
        this.legsR2.cubeList.add(new ModelBox(legsR2, 0, 6, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finR28 = new AdvancedModelRenderer(this);
        this.finR28.setRotationPoint(-1.75F, 1.0F, 0.5F);
        this.legsR2.addChild(finR28);
        this.setRotateAngle(finR28, 0.0F, -0.5236F, 0.0F);
        this.finR28.cubeList.add(new ModelBox(finR28, 0, 8, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR28.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.0F, 0.0F, 0.3927F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 0, 12, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR28.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.0F, 0.0F, -0.4363F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 4, 12, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.legsL2 = new AdvancedModelRenderer(this);
        this.legsL2.setRotationPoint(0.25F, 0.25F, 2.0F);
        this.body1.addChild(legsL2);
        this.legsL2.cubeList.add(new ModelBox(legsL2, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL30 = new AdvancedModelRenderer(this);
        this.finL30.setRotationPoint(1.75F, 1.0F, 0.5F);
        this.legsL2.addChild(finL30);
        this.setRotateAngle(finL30, 0.0F, 0.5236F, 0.0F);
        this.finL30.cubeList.add(new ModelBox(finL30, 6, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL30.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.0F, 0.0F, -0.3927F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL30.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.0F, 0.0F, 0.4363F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 10, 5, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 6, -0.99F, -0.51F, -0.01F, 2, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 30, 32, -1.0F, -0.5F, -0.01F, 2, 1, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 16, 22, -3.5F, 0.0F, 2.0F, 7, 0, 2, 0.0F, false));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(0.0F, -0.75F, 2.0F);
        this.body3.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.8727F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 0, 0, 0.0F, 0.35F, 0.0F, 0, 1, 5, 0.0F, false));

        this.legsL3 = new AdvancedModelRenderer(this);
        this.legsL3.setRotationPoint(0.25F, 0.25F, 0.5F);
        this.body2.addChild(legsL3);
        this.legsL3.cubeList.add(new ModelBox(legsL3, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL31 = new AdvancedModelRenderer(this);
        this.finL31.setRotationPoint(1.75F, 1.0F, 0.5F);
        this.legsL3.addChild(finL31);
        this.setRotateAngle(finL31, 0.0F, 0.5236F, 0.0F);
        this.finL31.cubeList.add(new ModelBox(finL31, 6, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL31.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.0F, 0.0F, -0.3927F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL31.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.0F, 0.0F, 0.4363F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 10, 5, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.legsL4 = new AdvancedModelRenderer(this);
        this.legsL4.setRotationPoint(0.25F, 0.25F, 1.0F);
        this.body2.addChild(legsL4);
        this.legsL4.cubeList.add(new ModelBox(legsL4, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL28 = new AdvancedModelRenderer(this);
        this.finL28.setRotationPoint(1.75F, 1.0F, 0.5F);
        this.legsL4.addChild(finL28);
        this.setRotateAngle(finL28, 0.0F, 0.5236F, 0.0F);
        this.finL28.cubeList.add(new ModelBox(finL28, 6, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL28.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.0F, 0.0F, -0.3927F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL28.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.0F, 0.0F, 0.4363F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 10, 5, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.legsL5 = new AdvancedModelRenderer(this);
        this.legsL5.setRotationPoint(0.25F, 0.25F, 1.5F);
        this.body2.addChild(legsL5);
        this.legsL5.cubeList.add(new ModelBox(legsL5, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finL29 = new AdvancedModelRenderer(this);
        this.finL29.setRotationPoint(1.75F, 1.0F, 0.5F);
        this.legsL5.addChild(finL29);
        this.setRotateAngle(finL29, 0.0F, 0.5236F, 0.0F);
        this.finL29.cubeList.add(new ModelBox(finL29, 6, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL29.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.0F, 0.0F, -0.3927F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL29.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.0F, 0.0F, 0.4363F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 10, 5, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.legsR3 = new AdvancedModelRenderer(this);
        this.legsR3.setRotationPoint(-0.25F, 0.25F, 0.5F);
        this.body2.addChild(legsR3);
        this.legsR3.cubeList.add(new ModelBox(legsR3, 0, 6, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finR29 = new AdvancedModelRenderer(this);
        this.finR29.setRotationPoint(-1.75F, 1.0F, 0.5F);
        this.legsR3.addChild(finR29);
        this.setRotateAngle(finR29, 0.0F, -0.5236F, 0.0F);
        this.finR29.cubeList.add(new ModelBox(finR29, 0, 8, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR29.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.0F, 0.0F, 0.3927F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 0, 12, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR29.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.0F, 0.0F, -0.4363F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 4, 12, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.legsR4 = new AdvancedModelRenderer(this);
        this.legsR4.setRotationPoint(-0.25F, 0.25F, 1.0F);
        this.body2.addChild(legsR4);
        this.legsR4.cubeList.add(new ModelBox(legsR4, 0, 6, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finR30 = new AdvancedModelRenderer(this);
        this.finR30.setRotationPoint(-1.75F, 1.0F, 0.5F);
        this.legsR4.addChild(finR30);
        this.setRotateAngle(finR30, 0.0F, -0.5236F, 0.0F);
        this.finR30.cubeList.add(new ModelBox(finR30, 0, 8, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR30.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.0F, 0.0F, 0.3927F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 0, 12, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r117 = new AdvancedModelRenderer(this);
        this.cube_r117.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR30.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.0F, 0.0F, -0.4363F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 4, 12, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.legsR5 = new AdvancedModelRenderer(this);
        this.legsR5.setRotationPoint(-0.25F, 0.25F, 1.5F);
        this.body2.addChild(legsR5);
        this.legsR5.cubeList.add(new ModelBox(legsR5, 0, 6, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finR31 = new AdvancedModelRenderer(this);
        this.finR31.setRotationPoint(-1.75F, 1.0F, 0.5F);
        this.legsR5.addChild(finR31);
        this.setRotateAngle(finR31, 0.0F, -0.5236F, 0.0F);
        this.finR31.cubeList.add(new ModelBox(finR31, 0, 8, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r118 = new AdvancedModelRenderer(this);
        this.cube_r118.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR31.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.0F, 0.0F, 0.3927F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 0, 12, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r119 = new AdvancedModelRenderer(this);
        this.cube_r119.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR31.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.0F, 0.0F, -0.4363F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 4, 12, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.legR25 = new AdvancedModelRenderer(this);
        this.legR25.setRotationPoint(0.0F, 0.25F, 0.5F);
        this.body1.addChild(legR25);
        this.legR25.cubeList.add(new ModelBox(legR25, 8, 22, -2.25F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR26 = new AdvancedModelRenderer(this);
        this.finR26.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR25.addChild(finR26);
        this.setRotateAngle(finR26, 0.0F, -0.5236F, 0.0F);
        this.finR26.cubeList.add(new ModelBox(finR26, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r120 = new AdvancedModelRenderer(this);
        this.cube_r120.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR26.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.0F, 0.0F, 0.3927F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r121 = new AdvancedModelRenderer(this);
        this.cube_r121.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR26.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.0F, 0.0F, -0.4363F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legR26 = new AdvancedModelRenderer(this);
        this.legR26.setRotationPoint(0.25F, 0.25F, 1.0F);
        this.body1.addChild(legR26);
        this.legR26.cubeList.add(new ModelBox(legR26, 8, 22, -2.5F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finR27 = new AdvancedModelRenderer(this);
        this.finR27.setRotationPoint(-2.75F, 1.5F, 0.5F);
        this.legR26.addChild(finR27);
        this.setRotateAngle(finR27, 0.0F, -0.5236F, 0.0F);
        this.finR27.cubeList.add(new ModelBox(finR27, 0, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r122 = new AdvancedModelRenderer(this);
        this.cube_r122.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finR27.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.0F, 0.0F, 0.3927F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 10, 3, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r123 = new AdvancedModelRenderer(this);
        this.cube_r123.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finR27.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.0F, 0.0F, -0.4363F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 4, 10, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL24 = new AdvancedModelRenderer(this);
        this.legL24.setRotationPoint(0.25F, -0.5F, 10.0F);
        this.body.addChild(legL24);
        this.legL24.cubeList.add(new ModelBox(legL24, 0, 24, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.finL25 = new AdvancedModelRenderer(this);
        this.finL25.setRotationPoint(2.75F, 1.5F, 0.5F);
        this.legL24.addChild(finL25);
        this.setRotateAngle(finL25, 0.0F, 0.5236F, 0.0F);
        this.finL25.cubeList.add(new ModelBox(finL25, 0, 20, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r124 = new AdvancedModelRenderer(this);
        this.cube_r124.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.finL25.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.0F, 0.0F, -0.3927F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 8, 10, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r125 = new AdvancedModelRenderer(this);
        this.cube_r125.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finL25.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.0F, 0.0F, 0.4363F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 4, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.16F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.body.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 1.2F;

        AdvancedModelRenderer[] Tail = {this.body2, this.body3};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            float speedLeg = 1.5F;
            float degreeLeg = 0.3F;
            float weightLeg = -0.5F;
            this.swing(legL, speedLeg, -degreeLeg, false, 0, -weightLeg, f2, 0.7F);
            this.swing(legR, speedLeg, degreeLeg, false, 0, weightLeg, f2, 0.7F);
            this.swing(legL2, speedLeg, -degreeLeg, false, 0.5F, -weightLeg, f2, 0.7F);
            this.swing(legR2, speedLeg, degreeLeg, false, 0.5F, weightLeg, f2, 0.7F);
            this.swing(legL3, speedLeg, -degreeLeg, false, 1.0F, -weightLeg, f2, 0.7F);
            this.swing(legR3, speedLeg, degreeLeg, false, 1.0F, weightLeg, f2, 0.7F);
            this.swing(legL4, speedLeg, -degreeLeg, false, 1.5F, -weightLeg, f2, 0.7F);
            this.swing(legR4, speedLeg, degreeLeg, false, 1.5F, weightLeg, f2, 0.7F);
            this.swing(legL5, speedLeg, -degreeLeg, false, 2.0F, -weightLeg, f2, 0.7F);
            this.swing(legR5, speedLeg, degreeLeg, false, 2.0F, weightLeg, f2, 0.7F);
            this.swing(legL6, speedLeg, -degreeLeg, false, 2.5F, -weightLeg, f2, 0.7F);
            this.swing(legR6, speedLeg, degreeLeg, false, 2.5F, weightLeg, f2, 0.7F);
            this.swing(legL7, speedLeg, -degreeLeg, false, 3.0F, -weightLeg, f2, 0.7F);
            this.swing(legR7, speedLeg, degreeLeg, false, 3.0F, weightLeg, f2, 0.7F);
            this.swing(legL8, speedLeg, -degreeLeg, false, 3.5F, -weightLeg, f2, 0.7F);
            this.swing(legR8, speedLeg, degreeLeg, false, 3.5F, weightLeg, f2, 0.7F);
            this.swing(legL9, speedLeg, -degreeLeg, false, 4.0F, -weightLeg, f2, 0.7F);
            this.swing(legR9, speedLeg, degreeLeg, false, 4.0F, weightLeg, f2, 0.7F);
            this.swing(legL10, speedLeg, -degreeLeg, false, 4.5F, -weightLeg, f2, 0.7F);
            this.swing(legR10, speedLeg, degreeLeg, false, 4.5F, weightLeg, f2, 0.7F);
            this.swing(legL11, speedLeg, -degreeLeg, false, 5.0F, -weightLeg, f2, 0.7F);
            this.swing(legR11, speedLeg, degreeLeg, false, 5.0F, weightLeg, f2, 0.7F);
            this.swing(legL12, speedLeg, -degreeLeg, false, 5.5F, -weightLeg, f2, 0.7F);
            this.swing(legR12, speedLeg, degreeLeg, false, 5.5F, weightLeg, f2, 0.7F);
            this.swing(legL13, speedLeg, -degreeLeg, false, 6.0F, -weightLeg, f2, 0.7F);
            this.swing(legR13, speedLeg, degreeLeg, false, 6.0F, weightLeg, f2, 0.7F);
            this.swing(legL14, speedLeg, -degreeLeg, false, 6.5F, -weightLeg, f2, 0.7F);
            this.swing(legR14, speedLeg, degreeLeg, false, 6.5F, weightLeg, f2, 0.7F);
            this.swing(legL15, speedLeg, -degreeLeg, false, 7.0F, -weightLeg, f2, 0.7F);
            this.swing(legR15, speedLeg, degreeLeg, false, 7.0F, weightLeg, f2, 0.7F);
            this.swing(legL16, speedLeg, -degreeLeg, false, 7.5F, -weightLeg, f2, 0.7F);
            this.swing(legR16, speedLeg, degreeLeg, false, 7.5F, weightLeg, f2, 0.7F);
            this.swing(legL17, speedLeg, -degreeLeg, false, 8.0F, -weightLeg, f2, 0.7F);
            this.swing(legR17, speedLeg, degreeLeg, false, 8.0F, weightLeg, f2, 0.7F);
            this.swing(legL18, speedLeg, -degreeLeg, false, 8.5F, -weightLeg, f2, 0.7F);
            this.swing(legR18, speedLeg, degreeLeg, false, 8.5F, weightLeg, f2, 0.7F);
            this.swing(legL19, speedLeg, -degreeLeg, false, 9.0F, -weightLeg, f2, 0.7F);
            this.swing(legR19, speedLeg, degreeLeg, false, 9.0F, weightLeg, f2, 0.7F);
            this.swing(legL20, speedLeg, -degreeLeg, false, 9.5F, -weightLeg, f2, 0.7F);
            this.swing(legR20, speedLeg, degreeLeg, false, 9.5F, weightLeg, f2, 0.7F);
            this.swing(legL21, speedLeg, -degreeLeg, false, 10.0F, -weightLeg, f2, 0.7F);
            this.swing(legR21, speedLeg, degreeLeg, false, 10.0F, weightLeg, f2, 0.7F);
            this.swing(legL22, speedLeg, -degreeLeg, false, 10.5F, -weightLeg, f2, 0.7F);
            this.swing(legR22, speedLeg, degreeLeg, false, 10.5F, weightLeg, f2, 0.7F);
            this.swing(legL23, speedLeg, -degreeLeg, false, 11.0F, -weightLeg, f2, 0.7F);
            this.swing(legR23, speedLeg, degreeLeg, false, 11.0F, weightLeg, f2, 0.7F);
            this.swing(legL24, speedLeg, -degreeLeg, false, 11.5F, -weightLeg, f2, 0.7F);
            this.swing(legR24, speedLeg, degreeLeg, false, 11.5F, weightLeg, f2, 0.7F);
            this.swing(legL25, speedLeg, -degreeLeg, false, 12.0F, -weightLeg, f2, 0.7F);
            this.swing(legR25, speedLeg, degreeLeg, false, 12.0F, weightLeg, f2, 0.7F);
            this.swing(legL26, speedLeg, -degreeLeg, false, 12.5F, -weightLeg, f2, 0.7F);
            this.swing(legR26, speedLeg, degreeLeg, false, 12.5F, weightLeg, f2, 0.7F);
            this.swing(legsL, speedLeg, -degreeLeg, false, 13.0F, -weightLeg, f2, 0.7F);
            this.swing(legsR, speedLeg, degreeLeg, false, 13.0F, weightLeg, f2, 0.7F);
            this.swing(legsL2, speedLeg, -degreeLeg, false, 13.5F, -weightLeg, f2, 0.7F);
            this.swing(legsR2, speedLeg, degreeLeg, false, 13.5F, weightLeg, f2, 0.7F);
            this.swing(legsL3, speedLeg, -degreeLeg, false, 14.0F, -weightLeg, f2, 0.7F);
            this.swing(legsR3, speedLeg, degreeLeg, false, 14.0F, weightLeg, f2, 0.7F);
            this.swing(legsL4, speedLeg, -degreeLeg, false, 14.5F, -weightLeg, f2, 0.7F);
            this.swing(legsR4, speedLeg, degreeLeg, false, 14.5F, weightLeg, f2, 0.7F);
            this.swing(legsL5, speedLeg, -degreeLeg, false, 15.0F, -weightLeg, f2, 0.7F);
            this.swing(legsR5, speedLeg, degreeLeg, false, 15.0F, weightLeg, f2, 0.7F);

            if (f3 != 0) {
                this.chainWave(Tail, 0.48F, 0.25F, -0.15F, f2, 0.65F);
                this.chainSwing(Tail, 0.35F, 0.15F, 0, f2, 0.5F);
            }
            else {
                this.chainWave(Tail, 0.15F, 0.11F, -1.5, f2, 0.8F);
            }

            if (!e.isInWater()) {
                this.body.offsetY = 1.25F;
                this.bob(body, -speed * 1.5F, 3F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.01F, false, f2, 2);
                } else {
                    this.bob(body, -speed, 0.12F, false, f2, 2);
                }
            }
        }
    }
}