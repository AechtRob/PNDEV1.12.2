package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelShaihuludia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer righthair3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer lefthair3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer chaetae4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer righthair4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer lefthair4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer chaetae5;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer righthair5;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer lefthair5;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer chaetae6;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer righthair6;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer lefthair6;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer chaetae7;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer righthair7;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer lefthair11;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer chaetae8;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer righthair8;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer lefthair8;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer chaetae9;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer righthair9;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer lefthair9;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer chaetae10;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer righthair10;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer lefthair10;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer chaetae11;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer frontbody2;
    private final AdvancedModelRenderer righthair2;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer lefthair2;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer chaetae3;
    private final AdvancedModelRenderer cube_r99;
    private final AdvancedModelRenderer cube_r100;
    private final AdvancedModelRenderer cube_r101;
    private final AdvancedModelRenderer cube_r102;
    private final AdvancedModelRenderer cube_r103;
    private final AdvancedModelRenderer cube_r104;
    private final AdvancedModelRenderer cube_r105;
    private final AdvancedModelRenderer cube_r106;
    private final AdvancedModelRenderer frontbody;
    private final AdvancedModelRenderer righthair;
    private final AdvancedModelRenderer cube_r107;
    private final AdvancedModelRenderer cube_r108;
    private final AdvancedModelRenderer cube_r109;
    private final AdvancedModelRenderer lefthair;
    private final AdvancedModelRenderer cube_r110;
    private final AdvancedModelRenderer cube_r111;
    private final AdvancedModelRenderer cube_r112;
    private final AdvancedModelRenderer chaetae;
    private final AdvancedModelRenderer cube_r113;
    private final AdvancedModelRenderer cube_r114;
    private final AdvancedModelRenderer cube_r115;
    private final AdvancedModelRenderer cube_r116;
    private final AdvancedModelRenderer cube_r117;
    private final AdvancedModelRenderer cube_r118;
    private final AdvancedModelRenderer cube_r119;
    private final AdvancedModelRenderer cube_r120;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer chaetae2;
    private final AdvancedModelRenderer cube_r121;
    private final AdvancedModelRenderer cube_r122;
    private final AdvancedModelRenderer cube_r123;
    private final AdvancedModelRenderer cube_r124;
    private final AdvancedModelRenderer horn;
    private final AdvancedModelRenderer horn2;

    public ModelShaihuludia() {
        this.textureWidth = 45;
        this.textureHeight = 43;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 9, 6, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.001F, false));

        this.righthair3 = new AdvancedModelRenderer(this);
        this.righthair3.setRotationPoint(-1.3763F, 0.0F, 0.4823F);
        this.body.addChild(righthair3);
        this.setRotateAngle(righthair3, 0.0436F, 0.0F, -0.2182F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 36, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 34, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1309F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 22, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.lefthair3 = new AdvancedModelRenderer(this);
        this.lefthair3.setRotationPoint(1.3763F, 0.0F, 0.4823F);
        this.body.addChild(lefthair3);
        this.setRotateAngle(lefthair3, 0.0436F, 0.0F, 0.2182F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.5672F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 36, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3054F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 34, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 22, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.chaetae4 = new AdvancedModelRenderer(this);
        this.chaetae4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body.addChild(chaetae4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3906F, 0.1377F, 0.0081F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 20, -0.8255F, -0.0218F, -1.975F, 1, 0, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3557F, -0.1377F, -0.0081F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 15, -0.1745F, -0.0218F, -1.975F, 1, 0, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.5F, 0.3F);
        this.chaetae4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3938F, -0.0864F, -0.0011F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 24, -0.9505F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5F, 0.3F);
        this.chaetae4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3938F, 0.0864F, 0.0011F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 1, -0.0495F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0038F, -0.0872F, 0.1311F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 4, -2.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.008F, 0.0869F, 0.1792F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 32, -2.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0038F, 0.0872F, -0.1311F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 32, 0.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.008F, -0.0869F, -0.1792F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 32, 0.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 8, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.righthair4 = new AdvancedModelRenderer(this);
        this.righthair4.setRotationPoint(-1.3763F, 0.0F, 0.4823F);
        this.body2.addChild(righthair4);
        this.setRotateAngle(righthair4, 0.0436F, 0.0F, -0.2182F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.5672F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 36, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3054F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 15, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1309F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 10, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.lefthair4 = new AdvancedModelRenderer(this);
        this.lefthair4.setRotationPoint(1.3763F, 0.0F, 0.4823F);
        this.body2.addChild(lefthair4);
        this.setRotateAngle(lefthair4, 0.0436F, 0.0F, 0.2182F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.5672F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 36, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3054F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 15, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.1309F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 10, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.chaetae5 = new AdvancedModelRenderer(this);
        this.chaetae5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(chaetae5);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.4F, 0.525F);
        this.chaetae5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1705F, 0.1327F, 0.0379F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 27, 28, -0.8255F, -0.0218F, -1.9F, 1, 0, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.4F, 0.525F);
        this.chaetae5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1356F, -0.1327F, -0.0379F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 22, 27, -0.1745F, -0.0218F, -1.975F, 1, 0, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.425F, 0.275F);
        this.chaetae5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1749F, -0.0846F, 0.0177F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 12, -0.9505F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.425F, 0.275F);
        this.chaetae5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1749F, 0.0846F, -0.0177F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 20, -0.0495F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.275F, -0.475F, 0.0F);
        this.chaetae5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0038F, -0.0872F, 0.1311F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 21, 30, -2.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.275F, -0.475F, 0.5F);
        this.chaetae5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.008F, 0.0869F, 0.1792F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 11, -2.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.275F, -0.475F, 0.0F);
        this.chaetae5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0038F, 0.0872F, -0.1311F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 23, 0.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.275F, -0.475F, 0.5F);
        this.chaetae5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.008F, -0.0869F, -0.1792F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 31, 13, 0.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 4, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.001F, false));

        this.righthair5 = new AdvancedModelRenderer(this);
        this.righthair5.setRotationPoint(-1.3763F, 0.0F, 0.4823F);
        this.body3.addChild(righthair5);
        this.setRotateAngle(righthair5, 0.0436F, 0.0F, -0.2182F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair5.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.5672F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 21, 35, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.3054F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 34, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.1309F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 36, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.lefthair5 = new AdvancedModelRenderer(this);
        this.lefthair5.setRotationPoint(1.3763F, 0.0F, 0.4823F);
        this.body3.addChild(lefthair5);
        this.setRotateAngle(lefthair5, 0.0436F, 0.0F, 0.2182F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.5672F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 21, 35, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair5.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.3054F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 14, 34, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair5.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.1309F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 36, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.chaetae6 = new AdvancedModelRenderer(this);
        this.chaetae6.setRotationPoint(0.0F, 0.025F, 1.0F);
        this.body3.addChild(chaetae6);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.4F, 0.525F);
        this.chaetae6.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4347F, 0.1379F, 0.002F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 28, 8, -0.8255F, -0.0218F, -1.9F, 1, 0, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -0.4F, 0.525F);
        this.chaetae6.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3998F, -0.1379F, -0.002F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 27, 4, -0.1745F, -0.0218F, -1.975F, 1, 0, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.425F, 0.275F);
        this.chaetae6.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3938F, -0.0864F, -0.0011F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 0, -0.9505F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -0.425F, 0.275F);
        this.chaetae6.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3938F, 0.0864F, 0.0011F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 4, -0.0495F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.275F, -0.475F, 0.0F);
        this.chaetae6.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0076F, -0.0869F, 0.2621F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 15, 29, -2.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.275F, -0.475F, 0.5F);
        this.chaetae6.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.008F, 0.0869F, 0.2665F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 29, 18, -2.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.275F, -0.475F, 0.0F);
        this.chaetae6.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0038F, 0.0872F, -0.1311F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 29, 21, 0.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.275F, -0.475F, 0.5F);
        this.chaetae6.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.008F, -0.0869F, -0.1792F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 30, 0, 0.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 16, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.righthair6 = new AdvancedModelRenderer(this);
        this.righthair6.setRotationPoint(-0.8763F, 0.0F, 0.4823F);
        this.body4.addChild(righthair6);
        this.setRotateAngle(righthair6, 0.0436F, 0.0F, -0.2182F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair6.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.5672F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 35, 38, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair6.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.3054F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 7, 38, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair6.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.1309F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 39, 2, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.lefthair6 = new AdvancedModelRenderer(this);
        this.lefthair6.setRotationPoint(0.8763F, 0.0F, 0.4823F);
        this.body4.addChild(lefthair6);
        this.setRotateAngle(lefthair6, 0.0436F, 0.0F, 0.2182F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair6.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.5672F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 35, 38, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair6.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.3054F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 7, 38, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair6.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.1309F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 39, 2, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.chaetae7 = new AdvancedModelRenderer(this);
        this.chaetae7.setRotationPoint(0.0F, 0.0F, 1.075F);
        this.body4.addChild(chaetae7);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -0.4F, 0.525F);
        this.chaetae7.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1527F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 5, 25, -0.5245F, -0.0218F, -1.775F, 1, 0, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -0.425F, 0.275F);
        this.chaetae7.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2618F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 12, 20, -0.5505F, -0.1468F, -0.725F, 1, 0, 2, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.275F, -0.475F, 0.5F);
        this.chaetae7.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, -0.2665F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 32, -0.3495F, 0.1032F, -0.8F, 2, 0, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.275F, -0.475F, 0.5F);
        this.chaetae7.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0F, 0.2665F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 32, 2, -1.6505F, 0.1032F, -0.8F, 2, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 7, 14, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.001F, false));

        this.righthair7 = new AdvancedModelRenderer(this);
        this.righthair7.setRotationPoint(-0.8763F, 0.0F, 0.4823F);
        this.body5.addChild(righthair7);
        this.setRotateAngle(righthair7, 0.0436F, 0.0F, -0.2182F);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair7.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.5672F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 38, 27, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair7.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.3054F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 38, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair7.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.1309F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 28, 38, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.lefthair11 = new AdvancedModelRenderer(this);
        this.lefthair11.setRotationPoint(0.8763F, 0.0F, 0.4823F);
        this.body5.addChild(lefthair11);
        this.setRotateAngle(lefthair11, 0.0436F, 0.0F, 0.2182F);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair11.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.5672F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 38, 27, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair11.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.3054F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 38, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair11.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, -0.1309F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 28, 38, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.chaetae8 = new AdvancedModelRenderer(this);
        this.chaetae8.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.body5.addChild(chaetae8);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, -0.4F, 0.525F);
        this.chaetae8.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.1527F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 5, 28, -0.5245F, -0.0218F, -1.775F, 1, 0, 2, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, -0.425F, 0.275F);
        this.chaetae8.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.2618F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 17, 26, -0.5505F, -0.1468F, -0.725F, 1, 0, 2, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.275F, -0.475F, 0.5F);
        this.chaetae8.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.0F, -0.2665F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 28, 16, -0.3495F, 0.1032F, -0.8F, 2, 0, 1, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.275F, -0.475F, 0.5F);
        this.chaetae8.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, 0.2665F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 27, 31, -1.6505F, 0.1032F, -0.8F, 2, 0, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 12, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.righthair8 = new AdvancedModelRenderer(this);
        this.righthair8.setRotationPoint(-0.8763F, 0.0F, 0.4823F);
        this.body6.addChild(righthair8);
        this.setRotateAngle(righthair8, 0.0436F, 0.0F, -0.2182F);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair8.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, 0.5672F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 14, 38, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair8.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.3054F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 21, 37, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair8.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.1309F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 38, 24, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.lefthair8 = new AdvancedModelRenderer(this);
        this.lefthair8.setRotationPoint(0.8763F, 0.0F, 0.4823F);
        this.body6.addChild(lefthair8);
        this.setRotateAngle(lefthair8, 0.0436F, 0.0F, 0.2182F);


        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair8.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, -0.5672F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 14, 38, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair8.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, -0.3054F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 21, 37, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair8.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, -0.1309F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 38, 24, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.chaetae9 = new AdvancedModelRenderer(this);
        this.chaetae9.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.body6.addChild(chaetae9);


        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, -0.4F, 0.525F);
        this.chaetae9.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.1527F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 27, 25, -0.5245F, -0.0218F, -1.775F, 1, 0, 2, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, -0.425F, 0.275F);
        this.chaetae9.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.2618F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 26, 13, -0.5505F, -0.1468F, -0.725F, 1, 0, 2, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.275F, -0.475F, 0.5F);
        this.chaetae9.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.0F, -0.2665F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 10, 0, -0.3495F, 0.1032F, -0.8F, 2, 0, 1, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.275F, -0.475F, 0.5F);
        this.chaetae9.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, 0.0F, 0.2665F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 7, 34, -1.6505F, 0.1032F, -0.8F, 2, 0, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 18, 8, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.001F, false));

        this.righthair9 = new AdvancedModelRenderer(this);
        this.righthair9.setRotationPoint(-0.3763F, 0.0F, 0.4823F);
        this.body7.addChild(righthair9);
        this.setRotateAngle(righthair9, 0.0436F, 0.0F, -0.2182F);


        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair9.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, 0.5672F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 40, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair9.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, 0.3054F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 39, 4, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair9.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, 0.1309F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 5, 40, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.lefthair9 = new AdvancedModelRenderer(this);
        this.lefthair9.setRotationPoint(0.3763F, 0.0F, 0.4823F);
        this.body7.addChild(lefthair9);
        this.setRotateAngle(lefthair9, 0.0436F, 0.0F, 0.2182F);


        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair9.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, -0.5672F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 0, 40, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair9.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, -0.3054F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 39, 4, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair9.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, -0.1309F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 5, 40, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.chaetae10 = new AdvancedModelRenderer(this);
        this.chaetae10.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.body7.addChild(chaetae10);


        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, -0.4F, 0.525F);
        this.chaetae10.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.1527F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 10, 29, -0.5245F, -0.0218F, -1.775F, 1, 0, 2, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, -0.425F, 0.275F);
        this.chaetae10.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.2618F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 10, 26, -0.5505F, -0.1468F, -0.725F, 1, 0, 2, 0.0F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(-0.275F, -0.475F, 0.5F);
        this.chaetae10.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, 0.0F, -0.2665F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 10, 40, 0.4005F, 0.1032F, -0.8F, 1, 0, 1, 0.0F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(0.275F, -0.475F, 0.5F);
        this.chaetae10.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, 0.0F, 0.2665F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 15, 40, -1.4005F, 0.1032F, -0.8F, 1, 0, 1, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 7, 18, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.righthair10 = new AdvancedModelRenderer(this);
        this.righthair10.setRotationPoint(-0.3763F, 0.0F, 0.4823F);
        this.body8.addChild(righthair10);
        this.setRotateAngle(righthair10, 0.0436F, 0.0F, -0.2182F);


        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair10.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, 0.5672F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 21, 39, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair10.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, 0.3054F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 17, 0, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair10.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, 0.1309F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 39, 29, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.lefthair10 = new AdvancedModelRenderer(this);
        this.lefthair10.setRotationPoint(0.3763F, 0.0F, 0.4823F);
        this.body8.addChild(lefthair10);
        this.setRotateAngle(lefthair10, 0.0436F, 0.0F, 0.2182F);


        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair10.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, -0.5672F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 21, 39, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair10.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.0F, -0.3054F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 17, 0, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair10.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0F, -0.1309F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 39, 29, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.chaetae11 = new AdvancedModelRenderer(this);
        this.chaetae11.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.body8.addChild(chaetae11);


        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(0.0F, -0.4F, 0.525F);
        this.chaetae11.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.1527F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 0, 29, -0.5245F, -0.0218F, -1.775F, 1, 0, 2, 0.0F, false));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(0.0F, -0.425F, 0.275F);
        this.chaetae11.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.2618F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 26, -0.5505F, -0.1468F, -0.725F, 1, 0, 2, 0.0F, false));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(-0.275F, -0.475F, 0.5F);
        this.chaetae11.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0F, 0.0F, -0.2665F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 39, 7, 0.4005F, 0.1032F, -0.8F, 1, 0, 1, 0.0F, false));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(0.275F, -0.475F, 0.5F);
        this.chaetae11.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.0F, 0.0F, 0.2665F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 39, 31, -1.4005F, 0.1032F, -0.8F, 1, 0, 1, 0.0F, false));

        this.frontbody2 = new AdvancedModelRenderer(this);
        this.frontbody2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.root.addChild(frontbody2);
        this.frontbody2.cubeList.add(new ModelBox(frontbody2, 9, 10, -1.5F, -0.5F, -2.0F, 3, 1, 2, 0.0F, false));

        this.righthair2 = new AdvancedModelRenderer(this);
        this.righthair2.setRotationPoint(-1.3763F, 0.0F, -1.5177F);
        this.frontbody2.addChild(righthair2);
        this.setRotateAngle(righthair2, 0.0436F, 0.0F, -0.2182F);


        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair2.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.0F, 0.5672F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 28, 36, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair2.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0F, 0.3054F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 35, 17, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair2.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0F, 0.1309F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 35, 36, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.lefthair2 = new AdvancedModelRenderer(this);
        this.lefthair2.setRotationPoint(1.3763F, 0.0F, -1.5177F);
        this.frontbody2.addChild(lefthair2);
        this.setRotateAngle(lefthair2, 0.0436F, 0.0F, 0.2182F);


        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair2.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0F, -0.5672F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 28, 36, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair2.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0F, -0.3054F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 35, 17, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair2.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0F, -0.1309F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 35, 36, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.chaetae3 = new AdvancedModelRenderer(this);
        this.chaetae3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.frontbody2.addChild(chaetae3);


        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae3.addChild(cube_r99);
        this.setRotateAngle(cube_r99, -0.2145F, 0.1342F, 0.032F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 5, 22, -0.8255F, -0.0218F, -1.975F, 1, 0, 2, 0.0F, false));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae3.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.1796F, -0.1342F, -0.032F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 0, 23, -0.1745F, -0.0218F, -1.975F, 1, 0, 2, 0.0F, false));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae3.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.4376F, -0.0863F, -0.0049F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 23, 7, -0.9505F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae3.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.4376F, 0.0863F, 0.0049F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 10, 23, -0.0495F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae3.addChild(cube_r103);
        this.setRotateAngle(cube_r103, -0.0038F, -0.0872F, 0.1311F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 32, 25, -2.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae3.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.008F, 0.0869F, 0.1792F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 32, 28, -2.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae3.addChild(cube_r105);
        this.setRotateAngle(cube_r105, -0.0038F, 0.0872F, -0.1311F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 33, 6, 0.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae3.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.008F, -0.0869F, -0.1792F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 33, 8, 0.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.frontbody = new AdvancedModelRenderer(this);
        this.frontbody.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.frontbody2.addChild(frontbody);
        this.frontbody.cubeList.add(new ModelBox(frontbody, 11, 2, -1.5F, -0.5F, -2.0F, 3, 1, 2, 0.001F, false));

        this.righthair = new AdvancedModelRenderer(this);
        this.righthair.setRotationPoint(-1.3763F, 0.0F, -1.5177F);
        this.frontbody.addChild(righthair);
        this.setRotateAngle(righthair, 0.0436F, 0.0F, -0.2182F);


        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.0F, 0.5672F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 37, 0, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.0F, 0.3054F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 35, 20, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0013F, 0.0F, 0.0177F);
        this.righthair.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.0F, 0.1309F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 37, 12, -3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, false));

        this.lefthair = new AdvancedModelRenderer(this);
        this.lefthair.setRotationPoint(1.3763F, 0.0F, -1.5177F);
        this.frontbody.addChild(lefthair);
        this.setRotateAngle(lefthair, 0.0436F, 0.0F, 0.2182F);


        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.0F, -0.5672F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 37, 0, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.0F, -0.3054F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 35, 20, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(-0.0013F, 0.0F, 0.0177F);
        this.lefthair.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.0F, -0.1309F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 37, 12, 0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F, true));

        this.chaetae = new AdvancedModelRenderer(this);
        this.chaetae.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.frontbody.addChild(chaetae);


        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.2145F, 0.1342F, 0.032F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 24, 18, -0.8255F, -0.0218F, -1.975F, 1, 0, 2, 0.0F, false));

        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.1796F, -0.1342F, -0.032F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 24, 21, -0.1745F, -0.0218F, -1.975F, 1, 0, 2, 0.0F, false));

        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.2625F, -0.0858F, 0.0102F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 23, 10, -0.9505F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.2625F, 0.0858F, -0.0102F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 17, 23, -0.0495F, -0.0968F, -0.6F, 1, 0, 2, 0.0F, false));

        this.cube_r117 = new AdvancedModelRenderer(this);
        this.cube_r117.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae.addChild(cube_r117);
        this.setRotateAngle(cube_r117, -0.0038F, -0.0872F, 0.1311F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 33, 30, -2.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r118 = new AdvancedModelRenderer(this);
        this.cube_r118.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.008F, 0.0869F, 0.1792F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 27, 33, -2.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.cube_r119 = new AdvancedModelRenderer(this);
        this.cube_r119.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae.addChild(cube_r119);
        this.setRotateAngle(cube_r119, -0.0038F, 0.0872F, -0.1311F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 33, 32, 0.0005F, -0.0218F, -0.825F, 2, 0, 1, 0.0F, false));

        this.cube_r120 = new AdvancedModelRenderer(this);
        this.cube_r120.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.008F, -0.0869F, -0.1792F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 0, 34, 0.0005F, -0.0218F, -0.6F, 2, 0, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.frontbody.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 14, 16, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.chaetae2 = new AdvancedModelRenderer(this);
        this.chaetae2.setRotationPoint(0.0F, 0.0F, -0.9F);
        this.head.addChild(chaetae2);


        this.cube_r121 = new AdvancedModelRenderer(this);
        this.cube_r121.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae2.addChild(cube_r121);
        this.setRotateAngle(cube_r121, -0.1254F, 0.001F, 0.0601F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 14, 14, -0.4755F, -0.0218F, -0.975F, 1, 0, 1, 0.0F, false));

        this.cube_r122 = new AdvancedModelRenderer(this);
        this.cube_r122.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae2.addChild(cube_r122);
        this.setRotateAngle(cube_r122, -0.0111F, 0.0839F, -0.1314F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 25, 40, 0.0255F, 0.0032F, -0.9F, 1, 0, 1, 0.0F, false));

        this.cube_r123 = new AdvancedModelRenderer(this);
        this.cube_r123.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.chaetae2.addChild(cube_r123);
        this.setRotateAngle(cube_r123, -0.0038F, -0.0872F, 0.1311F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 30, 40, -1.0005F, -0.0218F, -0.425F, 1, 0, 1, 0.0F, false));

        this.cube_r124 = new AdvancedModelRenderer(this);
        this.cube_r124.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.chaetae2.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.0953F, -0.0869F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 35, 40, -0.5245F, -0.0718F, -0.375F, 1, 0, 1, 0.0F, false));

        this.horn = new AdvancedModelRenderer(this);
        this.horn.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.head.addChild(horn);
        this.setRotateAngle(horn, 0.0F, -0.4363F, 0.0F);
        this.horn.cubeList.add(new ModelBox(horn, 0, 0, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.horn2 = new AdvancedModelRenderer(this);
        this.horn2.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.head.addChild(horn2);
        this.setRotateAngle(horn2, 0.0F, 0.4363F, 0.0F);
        this.horn2.cubeList.add(new ModelBox(horn2, 0, 0, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.3F, 0.0F, 0.3F);
        this.setRotateAngle(head, -0.2F, -0.3F, 0.0F);
        this.setRotateAngle(body2, 0.2F, -0.3F, 0.0F);
        this.setRotateAngle(body3, 0.2F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body7, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body8, 0.0F, 0.2F, 0.0F);
        this.root.offsetZ = 0.0F;
        this.root.offsetY = -0.15F;
        this.root.offsetX = 0.0F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
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
        //this.Crotalocephalus.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8};
        AdvancedModelRenderer[] upperbody = {this.frontbody2, this.frontbody, this.head};

        float speed = 0.2F;
        float tailVdegree = 0.1F;
        float tailHdegree = 0.3F;
        float tailSwing = 0.3F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.18F;
            tailVdegree = 0.02F;
            tailHdegree = 0.3F;
            tailSwing = 0.2F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if(e.isInWater()) {
                this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
                this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, 1);
                this.chainSwing(upperbody, speed, tailHdegree, -2.5, f2, 1);


                this.swing(horn2, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
                this.swing(horn, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);
                //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
                if (!isAtBottom) {
                    this.bob(root, -speed, 0.12F, false, f2, 2);
                }

            } else {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.Kleptothule.offsetY = 1.02F;
                this.bob(root, -speed, 0.21F, false, f2, 1);
                this.chainSwing(fishTail, speed, tailVdegree*0.5F, -3, f2, 1);
            }
        }
    }
}
