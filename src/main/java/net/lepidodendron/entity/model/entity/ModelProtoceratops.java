package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProtoceratops;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProtoceratops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightarm1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer leftarm1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer throatneck;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Head;
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
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer rightfrill;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer leftfrill;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer cube_r99;
    private final AdvancedModelRenderer cube_r100;
    private final AdvancedModelRenderer cube_r101;
    private final AdvancedModelRenderer cube_r102;
    private final AdvancedModelRenderer cube_r103;
    private final AdvancedModelRenderer cube_r104;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r105;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r106;
    private final AdvancedModelRenderer cube_r107;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r108;
    private final AdvancedModelRenderer cube_r109;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r110;
    private final AdvancedModelRenderer cube_r111;
    private final AdvancedModelRenderer cube_r112;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r113;
    private final AdvancedModelRenderer cube_r114;
    private final AdvancedModelRenderer cube_r115;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r116;

    private ModelAnimator animator;

    public ModelProtoceratops() {
        this.textureWidth = 91;
        this.textureHeight = 91;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.0833F, 6.0476F, 3.8712F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.9167F, -0.1421F, -2.5451F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -1.0F, -0.625F, -3.975F, 4, 2, 8, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0833F, 4.1538F, -2.7327F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -3.0F, -4.15F, -4.0F, 6, 10, 8, 0.01F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-3.6917F, 1.1439F, -0.7251F);
        this.main.addChild(rightleg1);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.2849F, -1.9576F);
        this.rightleg1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.288F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 52, -2.0F, -1.0F, -1.0F, 3, 7, 6, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 5.5821F, -4.1576F);
        this.rightleg1.addChild(rightleg2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.2217F, -0.2879F);
        this.rightleg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7636F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 41, -1.5F, -3.0F, 0.0F, 2, 3, 9, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 4.3637F, 7.8654F);
        this.rightleg2.addChild(rightleg3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.1331F, 0.1225F);
        this.rightleg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.7846F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 54, -1.5F, -0.25F, -0.25F, 2, 2, 7, -0.02F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 6.2081F, -2.1275F);
        this.rightleg3.addChild(rightleg4);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 58, 8, -1.5F, -0.25F, -3.25F, 3, 1, 4, 0.0F, true));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(3.8583F, 1.1439F, -0.7251F);
        this.main.addChild(leftleg1);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.2849F, -1.9576F);
        this.leftleg1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.288F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 52, -1.0F, -1.0F, -1.0F, 3, 7, 6, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 5.5821F, -4.1576F);
        this.leftleg1.addChild(leftleg2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.2217F, -0.2879F);
        this.leftleg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7636F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 41, -0.5F, -3.0F, 0.0F, 2, 3, 9, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 4.3637F, 7.8654F);
        this.leftleg2.addChild(leftleg3);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.1331F, 0.1225F);
        this.leftleg3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.7846F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 54, -0.5F, -0.25F, -0.25F, 2, 2, 7, -0.02F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 6.2081F, -2.1275F);
        this.leftleg3.addChild(leftleg4);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 58, 8, -1.5F, -0.25F, -3.25F, 3, 1, 4, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(-0.4167F, -0.0003F, -6.275F);
        this.main.addChild(chest);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.925F, -0.475F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4058F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 29, -1.0F, 0.025F, -8.65F, 3, 2, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 4.8288F, -0.4909F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3011F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 19, -3.0F, -4.4F, -6.7F, 6, 5, 9, 0.002F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 6.9338F, -4.0699F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1004F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 0, -3.0F, -2.55F, -3.15F, 6, 5, 8, -0.01F, false));

        this.rightarm1 = new AdvancedModelRenderer(this);
        this.rightarm1.setRotationPoint(-2.6252F, 7.0518F, -4.2978F);
        this.chest.addChild(rightarm1);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.9748F, 3.2911F, 1.1038F);
        this.rightarm1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4741F, -0.0735F, 0.1585F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 66, -0.9F, -3.75F, -1.0F, 3, 6, 3, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-1.0974F, 4.6567F, 3.4839F);
        this.rightarm1.addChild(rightarm2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.2542F, -0.2844F, -0.0433F);
        this.rightarm2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1146F, -0.0834F, -0.0689F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 80, -1.15F, 5.4F, -1.7F, 2, 1, 2, -0.01F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 73, 24, -1.15F, -0.1F, -1.7F, 2, 6, 2, 0.0F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(0.4314F, 5.6516F, -1.735F);
        this.rightarm2.addChild(rightarm3);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 67, 60, -1.3162F, -0.25F, -2.3361F, 3, 1, 3, 0.02F, true));

        this.leftarm1 = new AdvancedModelRenderer(this);
        this.leftarm1.setRotationPoint(3.6252F, 7.0518F, -4.2978F);
        this.chest.addChild(leftarm1);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.9748F, 3.2911F, 1.1038F);
        this.leftarm1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4741F, 0.0735F, -0.1585F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 47, 66, -2.1F, -3.75F, -1.0F, 3, 6, 3, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(1.0974F, 4.6567F, 3.4839F);
        this.leftarm1.addChild(leftarm2);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2542F, -0.2844F, -0.0433F);
        this.leftarm2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1146F, 0.0834F, 0.0689F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 80, -0.85F, 5.4F, -1.7F, 2, 1, 2, -0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 73, 24, -0.85F, -0.1F, -1.7F, 2, 6, 2, 0.0F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(-0.4314F, 5.6516F, -1.735F);
        this.leftarm2.addChild(leftarm3);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 67, 60, -1.6838F, -0.25F, -2.3361F, 3, 1, 3, 0.02F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.5F, 3.6541F, -6.9577F);
        this.chest.addChild(neck);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 2.6639F, -2.7287F);
        this.neck.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0218F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 45, -1.0F, -3.925F, -3.125F, 4, 4, 7, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 48, 41, -1.5F, -1.925F, -2.125F, 5, 4, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.925F, 1.5492F, -5.2908F);
        this.neck.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.022F, -0.1309F, -0.0029F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 86, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.925F, 1.5492F, -5.2908F);
        this.neck.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.022F, 0.1309F, 0.0029F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 86, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.throatneck = new AdvancedModelRenderer(this);
        this.throatneck.setRotationPoint(0.0F, 5.6451F, -4.0791F);
        this.neck.addChild(throatneck);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.5F, 2.25F);
        this.throatneck.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1265F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 54, 14, -2.0F, -1.5F, -2.5F, 4, 3, 6, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 2.35F, -5.575F);
        this.neck.addChild(Head);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.3449F, -7.109F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -2.0028F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 80, 81, -0.375F, -2.0F, -2.0F, 1, 2, 2, -0.001F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 73, 81, -0.625F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.125F, -0.4714F, -6.2716F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -2.282F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 85, 45, -0.475F, -2.0F, -1.0F, 1, 2, 1, -0.01F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 85, 41, -0.775F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 3.2928F, -6.9914F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.549F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 66, 81, -0.5F, -1.925F, -1.95F, 1, 2, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 3.5047F, -3.8495F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 3.111F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 84, 12, -0.5F, -0.025F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.6811F, -3.1287F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -2.7445F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 79, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 4.0203F, -6.1721F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.9853F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 84, 0, -0.5F, -0.675F, -1.825F, 1, 1, 2, -0.04F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 4.0203F, -6.1721F);
        this.Head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.1999F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 47, 83, -0.5F, -0.45F, -0.975F, 1, 1, 2, -0.03F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.1169F, 2.4857F, -2.2215F);
        this.Head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.9564F, -0.1907F, -0.097F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 25, 34, -0.05F, -2.0F, -0.75F, 0, 4, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.7866F, 2.8713F, -2.1491F);
        this.Head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.1908F, -0.1676F, -0.0151F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 13, 67, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0224F, -2.5248F, -2.3744F);
        this.Head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.0463F, 0.2012F, 0.3347F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 82, 23, -1.0F, -2.5F, -0.5F, 2, 3, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.2287F, -2.4627F, -1.0758F);
        this.Head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.3077F, -0.4131F, -0.1281F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 17, 57, -0.225F, -1.725F, -0.475F, 1, 3, 1, -0.01F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.7564F, 0.8879F, -0.6839F);
        this.Head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.1047F, -0.7065F, -0.4374F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 54, 83, -0.55F, -1.625F, -1.525F, 1, 3, 1, -0.05F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 80, 52, -0.55F, -1.625F, -0.85F, 1, 3, 2, -0.04F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-3.9106F, 1.009F, 1.0021F);
        this.Head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3689F, -0.9771F, -0.6631F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 86, 20, -0.5F, 0.3F, -0.975F, 1, 1, 1, -0.03F, true));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 64, 86, -0.5F, -0.075F, -0.975F, 1, 1, 1, -0.02F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.1457F, -0.1671F, 0.1067F);
        this.Head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.8489F, -0.9771F, -0.6631F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 86, -0.5F, -0.95F, 0.375F, 1, 2, 1, -0.01F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 14, 86, -0.5F, -0.95F, -0.05F, 1, 2, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.7102F, -0.2104F, -0.2937F);
        this.Head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -1.2852F, -0.9771F, -0.6631F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 69, 86, -0.375F, -1.45F, -0.575F, 1, 1, 1, -0.05F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 74, 86, -0.375F, -1.075F, -0.575F, 1, 1, 1, -0.04F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.6704F, -1.318F, 0.5351F);
        this.Head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.0679F, -0.9583F, 0.488F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 24, 73, -0.65F, -3.35F, -1.65F, 1, 5, 2, -0.01F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-2.2287F, -2.4627F, -1.0758F);
        this.Head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -1.4807F, -0.4096F, -0.1755F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 84, 69, -0.225F, -1.725F, 0.125F, 1, 3, 1, -0.01F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.7771F, -1.0976F, -2.1775F);
        this.Head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -1.0936F, -0.0261F, -0.073F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 67, 52, -0.175F, -2.975F, -1.5F, 2, 3, 4, -0.01F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.7291F, -0.9694F, -2.5456F);
        this.Head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.9655F, -0.632F, -0.4475F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 32, 72, -0.65F, -1.1F, -1.5F, 1, 2, 4, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5214F, 1.9529F, -6.1031F);
        this.Head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -1.5557F, -0.1615F, -0.0122F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 43, 76, -0.025F, -2.15F, -1.5F, 1, 2, 3, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.6727F, -1.2135F, -5.7661F);
        this.Head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -1.1871F, -0.2161F, -0.035F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 60, 66, 0.0F, -4.0F, 0.0F, 1, 4, 5, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.1169F, 2.4857F, -2.2215F);
        this.Head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.9564F, 0.1907F, 0.097F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 25, 34, 0.05F, -2.0F, -0.75F, 0, 4, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.7866F, 2.8713F, -2.1491F);
        this.Head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -1.1908F, 0.1676F, 0.0151F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 13, 67, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.6727F, -1.2135F, -5.7661F);
        this.Head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -1.1871F, 0.2161F, 0.035F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 60, 66, -1.0F, -4.0F, 0.0F, 1, 4, 5, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5214F, 1.9529F, -6.1031F);
        this.Head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -1.5557F, 0.1615F, 0.0122F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 43, 76, -0.975F, -2.15F, -1.5F, 1, 2, 3, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(2.2287F, -2.4627F, -1.0758F);
        this.Head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -1.3077F, 0.4131F, 0.1281F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 17, 57, -0.775F, -1.725F, -0.475F, 1, 3, 1, -0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(2.6704F, -1.318F, 0.5351F);
        this.Head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -1.0679F, 0.9583F, -0.488F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 24, 73, -0.35F, -3.35F, -1.65F, 1, 5, 2, -0.01F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(2.2287F, -2.4627F, -1.0758F);
        this.Head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -1.4807F, 0.4096F, 0.1755F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 84, 69, -0.775F, -1.725F, 0.125F, 1, 3, 1, -0.01F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.7771F, -1.0976F, -2.1775F);
        this.Head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -1.0936F, 0.0261F, 0.073F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 67, 52, -1.825F, -2.975F, -1.5F, 2, 3, 4, -0.01F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.7291F, -0.9694F, -2.5456F);
        this.Head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.9655F, 0.632F, 0.4475F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 32, 72, -0.35F, -1.1F, -1.5F, 1, 2, 4, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(2.7102F, -0.2104F, -0.2937F);
        this.Head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -1.2852F, 0.9771F, 0.6631F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 69, 86, -0.625F, -1.45F, -0.575F, 1, 1, 1, -0.05F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 74, 86, -0.625F, -1.075F, -0.575F, 1, 1, 1, -0.04F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(1.7564F, 0.8879F, -0.6839F);
        this.Head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -1.1047F, 0.7065F, 0.4374F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 80, 52, -0.45F, -1.625F, -0.85F, 1, 3, 2, -0.04F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 54, 83, -0.45F, -1.625F, -1.525F, 1, 3, 1, -0.05F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(3.9106F, 1.009F, 1.0021F);
        this.Head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.3689F, 0.9771F, 0.6631F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 86, 20, -0.5F, 0.3F, -0.975F, 1, 1, 1, -0.03F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 64, 86, -0.5F, -0.075F, -0.975F, 1, 1, 1, -0.02F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(3.1457F, -0.1671F, 0.1067F);
        this.Head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.8489F, 0.9771F, 0.6631F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 86, -0.5F, -0.95F, 0.375F, 1, 2, 1, -0.01F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 14, 86, -0.5F, -0.95F, -0.05F, 1, 2, 1, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, -2.3705F, -2.9701F);
        this.Head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -1.7802F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 24, 86, -0.5F, -0.175F, -0.125F, 1, 2, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, -1.1819F, -5.6991F);
        this.Head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.4102F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 16, 80, -0.5F, -2.05F, 0.05F, 1, 3, 2, 0.001F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.5F, -0.5172F, -3.6587F);
        this.Head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -1.1126F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 73, 33, -1.0F, -2.5F, -1.525F, 1, 4, 3, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(1.0224F, -2.5248F, -2.3744F);
        this.Head.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -1.0463F, -0.2012F, -0.3347F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 82, 23, -1.0F, -2.5F, -0.5F, 2, 3, 1, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, -3.2263F, -1.5607F);
        this.Head.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.9163F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 59, 81, -1.0F, -1.525F, -0.3F, 2, 3, 1, 0.01F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, -5.4292F, 0.4757F);
        this.Head.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.4407F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 30, 84, -1.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, -6.275F, -0.3175F);
        this.Head.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.4712F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 82, 41, 0.0F, -3.5F, 0.025F, 0, 7, 1, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, -6.3341F, 0.908F);
        this.Head.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1527F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 82, 36, -1.0F, 0.525F, -0.8F, 2, 3, 1, 0.01F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, -6.3341F, 0.908F);
        this.Head.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.3709F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 52, 76, -1.0F, -3.0F, -0.575F, 2, 5, 1, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-1.2653F, -1.8328F, -2.7765F);
        this.Head.addChild(righteye);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.0184F, -0.0297F, 0.0051F);
        this.righteye.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.9655F, -0.632F, -0.4475F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 86, 64, -0.5F, -0.475F, -0.475F, 1, 1, 1, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(1.2653F, -1.8328F, -2.7765F);
        this.Head.addChild(lefteye);


        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0184F, -0.0297F, 0.0051F);
        this.lefteye.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.9655F, 0.632F, 0.4475F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 86, 64, -0.5F, -0.475F, -0.475F, 1, 1, 1, 0.0F, false));

        this.rightfrill = new AdvancedModelRenderer(this);
        this.rightfrill.setRotationPoint(0.0F, 12.15F, 15.075F);
        this.Head.addChild(rightfrill);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-1.36F, -17.9618F, -13.9034F);
        this.rightfrill.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.4979F, 0.5142F, -0.2281F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 75, 0, -3.15F, -2.15F, -0.575F, 3, 5, 1, 0.0F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-1.0676F, -16.4798F, -15.6223F);
        this.rightfrill.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.4767F, 0.4875F, -0.2113F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 42, 54, -1.0F, -5.05F, 0.1F, 1, 6, 1, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-3.7912F, -20.308F, -11.2326F);
        this.rightfrill.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.5719F, 0.3331F, -0.5666F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 59, 86, -0.5F, 0.0F, -0.475F, 1, 2, 1, -0.001F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-6.9018F, -16.2331F, -11.6704F);
        this.rightfrill.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.1772F, 0.6369F, 0.3392F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 75, 20, 0.0F, -0.6F, 0.0F, 4, 1, 1, -0.01F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-5.632F, -15.7306F, -12.4675F);
        this.rightfrill.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.2032F, 0.8451F, 0.3029F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 71, 49, -1.5F, -0.6F, -0.5F, 4, 1, 1, 0.0F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-1.9026F, -16.0432F, -16.1671F);
        this.rightfrill.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -0.3958F, 0.1955F, 0.1585F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 85, 49, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-3.7867F, -15.7695F, -14.2572F);
        this.rightfrill.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.4488F, 0.6219F, -0.0301F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 82, 33, -0.35F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-6.8046F, -17.4869F, -10.5484F);
        this.rightfrill.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.3831F, 0.5689F, -0.0262F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 73, 65, 0.1F, -0.05F, -0.5F, 5, 2, 1, 0.0F, true));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-5.4738F, -18.5135F, -10.942F);
        this.rightfrill.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.5981F, 0.3315F, -0.5091F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 79, 86, -1.7F, 0.275F, -0.5F, 1, 1, 1, -0.01F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(-4.1823F, -20.0343F, -11.0819F);
        this.rightfrill.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.6707F, 0.07F, -0.8668F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 59, 76, -3.0F, -0.025F, -0.475F, 3, 3, 1, 0.001F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(-2.189F, -21.3025F, -11.8994F);
        this.rightfrill.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.5719F, 0.3331F, -0.5666F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 82, 28, -2.0F, -0.025F, -0.475F, 2, 3, 1, 0.0F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(-1.495F, -20.5725F, -12.6396F);
        this.rightfrill.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.303F, 0.587F, 0.0202F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 84, 4, -1.0F, -0.75F, -0.5F, 2, 2, 1, 0.001F, true));

        this.leftfrill = new AdvancedModelRenderer(this);
        this.leftfrill.setRotationPoint(0.0F, 12.15F, 15.075F);
        this.Head.addChild(leftfrill);


        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(1.36F, -17.9618F, -13.9034F);
        this.leftfrill.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.4979F, -0.5142F, 0.2281F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 75, 0, 0.15F, -2.15F, -0.575F, 3, 5, 1, 0.0F, false));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(1.0676F, -16.4798F, -15.6223F);
        this.leftfrill.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.4767F, -0.4875F, 0.2113F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 42, 54, 0.0F, -5.05F, 0.1F, 1, 6, 1, 0.0F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(3.7912F, -20.308F, -11.2326F);
        this.leftfrill.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.5719F, -0.3331F, 0.5666F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 59, 86, -0.5F, 0.0F, -0.475F, 1, 2, 1, -0.001F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(6.9018F, -16.2331F, -11.6704F);
        this.leftfrill.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.1772F, -0.6369F, -0.3392F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 75, 20, -4.0F, -0.6F, 0.0F, 4, 1, 1, -0.01F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(5.632F, -15.7306F, -12.4675F);
        this.leftfrill.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.2032F, -0.8451F, -0.3029F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 71, 49, -2.5F, -0.6F, -0.5F, 4, 1, 1, 0.0F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(1.9026F, -16.0432F, -16.1671F);
        this.leftfrill.addChild(cube_r82);
        this.setRotateAngle(cube_r82, -0.3958F, -0.1955F, -0.1585F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 85, 49, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(3.7867F, -15.7695F, -14.2572F);
        this.leftfrill.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.4488F, -0.6219F, 0.0301F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 82, 33, -2.65F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(6.8046F, -17.4869F, -10.5484F);
        this.leftfrill.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.3831F, -0.5689F, 0.0262F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 73, 65, -5.1F, -0.05F, -0.5F, 5, 2, 1, 0.0F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(5.4738F, -18.5135F, -10.942F);
        this.leftfrill.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.5981F, -0.3315F, 0.5091F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 79, 86, 0.7F, 0.275F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(4.1823F, -20.0343F, -11.0819F);
        this.leftfrill.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.6707F, -0.07F, 0.8668F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 59, 76, 0.0F, -0.025F, -0.475F, 3, 3, 1, 0.001F, false));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(2.189F, -21.3025F, -11.8994F);
        this.leftfrill.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.5719F, -0.3331F, 0.5666F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 82, 28, 0.0F, -0.025F, -0.475F, 2, 3, 1, 0.0F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(1.495F, -20.5725F, -12.6396F);
        this.leftfrill.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.303F, -0.587F, -0.0202F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 84, 4, -1.0F, -0.75F, -0.5F, 2, 2, 1, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0802F, 0.8212F, 1.3462F);
        this.Head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1178F, 0.0F, 0.0F);


        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(-0.0802F, 2.8028F, -3.3715F);
        this.jaw.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 1.7191F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 0, 75, -1.0F, 0.525F, -0.025F, 2, 1, 3, 0.0F, false));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(0.0948F, 5.0139F, -3.4117F);
        this.jaw.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.3709F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 73, 69, -1.175F, -2.0F, -0.875F, 2, 2, 3, 0.0F, false));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(-1.0802F, 5.0139F, -3.4117F);
        this.jaw.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.3784F, -0.195F, -0.0769F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 80, 58, 0.275F, -2.65F, -0.5F, 0, 2, 3, 0.0F, true));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 75, 14, -0.175F, -2.025F, -0.9F, 1, 2, 3, 0.0F, true));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(-1.2835F, 2.5611F, -3.7263F);
        this.jaw.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.361F, -0.2266F, 0.0063F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 0, 80, 0.025F, -1.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(-1.6924F, 1.3763F, -2.0931F);
        this.jaw.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.5177F, -0.5265F, -0.0964F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 71, 41, -0.125F, -2.225F, -1.5F, 2, 4, 3, 0.0F, true));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.0802F, 3.5264F, -5.1286F);
        this.jaw.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.0894F, -0.2173F, 0.0193F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 84, 16, -0.8F, -0.3F, -1.2F, 1, 1, 2, 0.0F, true));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(-0.0802F, 4.4281F, -4.9719F);
        this.jaw.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -0.1117F, -0.2168F, 0.0241F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 84, 8, -0.7F, -0.525F, -0.6F, 1, 1, 2, 0.0F, true));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(-1.819F, 2.4579F, -1.174F);
        this.jaw.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.7869F, -0.4257F, -0.2761F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 73, 8, -0.5F, -0.925F, -1.5F, 2, 2, 3, 0.0F, true));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(1.1231F, 2.5611F, -3.7263F);
        this.jaw.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.361F, 0.2266F, -0.0063F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 80, -0.025F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(1.5319F, 1.3763F, -2.0931F);
        this.jaw.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.5177F, 0.5265F, 0.0964F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 71, 41, -1.875F, -2.225F, -1.5F, 2, 4, 3, 0.0F, false));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(1.6586F, 2.4579F, -1.174F);
        this.jaw.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.7869F, 0.4257F, 0.2761F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 73, 8, -1.5F, -0.925F, -1.5F, 2, 2, 3, 0.0F, false));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(0.9198F, 5.0139F, -3.4117F);
        this.jaw.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.3784F, 0.195F, 0.0769F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 80, 58, -0.275F, -2.65F, -0.5F, 0, 2, 3, 0.0F, false));
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 75, 14, -0.825F, -2.025F, -0.9F, 1, 2, 3, 0.0F, false));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(-0.0802F, 3.5264F, -5.1286F);
        this.jaw.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.0894F, 0.2173F, -0.0193F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 84, 16, -0.2F, -0.3F, -1.2F, 1, 1, 2, 0.0F, false));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(-0.0802F, 4.4281F, -4.9719F);
        this.jaw.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -0.1117F, 0.2168F, -0.0241F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 84, 8, -0.3F, -0.525F, -0.6F, 1, 1, 2, 0.0F, false));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(-0.0802F, 4.3867F, -5.4923F);
        this.jaw.addChild(cube_r103);
        this.setRotateAngle(cube_r103, -0.3534F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 84, 86, -0.5F, -0.675F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(-0.0802F, 3.5583F, -6.4991F);
        this.jaw.addChild(cube_r104);
        this.setRotateAngle(cube_r104, -0.6981F, 0.0F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 7, 84, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.05F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(-0.0802F, 4.354F, -1.4924F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.1745F, 0.0F, 0.0F);


        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.6763F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 58, 0, -1.5F, -1.925F, 0.0F, 3, 2, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0833F, 1.3529F, 1.4309F);
        this.main.addChild(tail1);


        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(1.0F, -0.0178F, 2.372F);
        this.tail1.addChild(cube_r106);
        this.setRotateAngle(cube_r106, -0.2705F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 56, 34, -2.5F, -1.05F, -2.725F, 3, 1, 5, 0.0F, false));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(-1.5F, 3.25F, 1.75F);
        this.tail1.addChild(cube_r107);
        this.setRotateAngle(cube_r107, -0.2182F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 31, 14, -1.0F, -3.825F, -3.1F, 5, 8, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5434F, 5.0476F);
        this.tail1.addChild(tail2);


        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(-0.5F, 2.074F, 2.0663F);
        this.tail2.addChild(cube_r108);
        this.setRotateAngle(cube_r108, -0.1789F, 0.0F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 0, 57, -1.0F, -2.0F, -3.5F, 3, 4, 5, 0.0F, false));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, 0.017F, 1.9301F);
        this.tail2.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.0436F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 17, 64, -0.5F, -1.1F, -2.95F, 1, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.78F, 3.7426F);
        this.tail2.addChild(tail3);


        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(0.0F, -1.4038F, 3.0556F);
        this.tail3.addChild(cube_r110);
        this.setRotateAngle(cube_r110, -0.6109F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 73, 75, -0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(0.0F, 2.8644F, 3.0969F);
        this.tail3.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.2749F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 56, 24, -1.0F, -2.175F, -4.875F, 2, 3, 6, 0.01F, false));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(0.0F, -0.7747F, 1.8087F);
        this.tail3.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.3054F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 23, 81, -0.5F, -1.0F, -0.975F, 1, 2, 2, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.4203F, 4.7157F);
        this.tail3.addChild(tail4);


        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(-0.5F, 2.1053F, 2.8443F);
        this.tail4.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.3316F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 67, 0.25F, -1.325F, -4.55F, 1, 2, 5, 0.0F, false));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 13, 73, -0.25F, -1.325F, -3.55F, 1, 2, 4, 0.0F, false));

        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(0.0F, -0.1857F, 2.1079F);
        this.tail4.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.6632F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 82, 75, -0.5F, 0.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(0.0F, -2.8242F, -1.6602F);
        this.tail4.addChild(cube_r115);
        this.setRotateAngle(cube_r115, -0.6109F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 40, 82, -0.5F, 0.0F, 3.0F, 1, 2, 2, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 1.2657F, 3.4656F);
        this.tail4.addChild(tail5);


        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(-0.5F, 0.8396F, -0.6213F);
        this.tail5.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.4014F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 32, 64, 0.0F, -1.225F, -1.5F, 1, 1, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {

        this.neck.offsetY = 0.0F;
        this.neck.offsetX = 0.0F;
        this.neck.offsetZ = 0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.12F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.5F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(150);
        this.main.rotateAngleX = (float)Math.toRadians(5);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.7F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        EntityPrehistoricFloraProtoceratops entityProtoceratops = (EntityPrehistoricFloraProtoceratops) e;

//        this.faceTarget(f3, f4, 12, Neck1);
//        this.faceTarget(f3, f4, 12, Neck2);
//        this.faceTarget(f3, f4, 12, Neck3);
//        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityProtoceratops.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityProtoceratops.getAnimation() == entityProtoceratops.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityProtoceratops.isReallyInWater()) {

                if (f3 == 0.0F || !entityProtoceratops.getIsMoving()) {
                    if (entityProtoceratops.getAnimation() != entityProtoceratops.EAT_ANIMATION
                        && entityProtoceratops.getAnimation() != entityProtoceratops.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityProtoceratops.getIsFast()) { //Running


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
        this.righteye.setScale(1,1,1);
        this.lefteye.setScale(1,1,1);
        EntityPrehistoricFloraProtoceratops ee = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animBlink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-8.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*20 + (((tickAnim - 30) / 20) * (0-(-8.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*20)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 30) / 20) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.075-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.075 + (((tickAnim - 30) / 20) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.66323-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.47595-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.81792-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.66323 + (((tickAnim - 15) / 15) * (22.25-(3.66323)));
            yy = 2.47595 + (((tickAnim - 15) / 15) * (0-(2.47595)));
            zz = -6.81792 + (((tickAnim - 15) / 15) * (0-(-6.81792)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 22.25 + (((tickAnim - 30) / 11) * (-1.55-(22.25)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -1.55 + (((tickAnim - 41) / 9) * (0-(-1.55)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righteye, righteye.rotateAngleX + (float) Math.toRadians(xx), righteye.rotateAngleY + (float) Math.toRadians(yy), righteye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0.1 + (((tickAnim - 15) / 35) * (0-(0.1)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = -0.05 + (((tickAnim - 15) / 35) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righteye.rotationPointX = this.righteye.rotationPointX + (float)(xx);
        this.righteye.rotationPointY = this.righteye.rotationPointY - (float)(yy);
        this.righteye.rotationPointZ = this.righteye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (0.4-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            yy = 0.4 + (((tickAnim - 15) / 15) * (0-(0.4)));
            zz = 1 + (((tickAnim - 15) / 15) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 30) / 20) * (1-(1)));
            yy = 0 + (((tickAnim - 30) / 20) * (1-(0)));
            zz = 1 + (((tickAnim - 30) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.66323-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.47595-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.81792-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.66323 + (((tickAnim - 15) / 15) * (22.25-(3.66323)));
            yy = 2.47595 + (((tickAnim - 15) / 15) * (0-(2.47595)));
            zz = -6.81792 + (((tickAnim - 15) / 15) * (0-(-6.81792)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 22.25 + (((tickAnim - 30) / 11) * (-1.55-(22.25)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -1.55 + (((tickAnim - 41) / 9) * (0-(-1.55)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefteye, lefteye.rotateAngleX + (float) Math.toRadians(xx), lefteye.rotateAngleY + (float) Math.toRadians(yy), lefteye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0.1 + (((tickAnim - 15) / 35) * (0-(0.1)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = -0.05 + (((tickAnim - 15) / 35) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefteye.rotationPointX = this.lefteye.rotationPointX + (float)(xx);
        this.lefteye.rotationPointY = this.lefteye.rotationPointY - (float)(yy);
        this.lefteye.rotationPointZ = this.lefteye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (0.4-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            yy = 0.4 + (((tickAnim - 15) / 15) * (0-(0.4)));
            zz = 1 + (((tickAnim - 15) / 15) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 30) / 20) * (1-(1)));
            yy = 0 + (((tickAnim - 30) / 20) * (1-(0)));
            zz = 1 + (((tickAnim - 30) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 17 + (((tickAnim - 15) / 15) * (24.525-(17)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 24.525 + (((tickAnim - 30) / 4) * (24.75-(24.525)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 24.75 + (((tickAnim - 34) / 16) * (0-(24.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.2 + (((tickAnim - 30) / 20) * (0-(0.2)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10 + (((tickAnim - 0) / 25) * (-4.8201-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-30-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.02272-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -4.8201-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-30 + (((tickAnim - 25) / 20) * (0-(-4.8201-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-30)));
            yy = -1.02272 + (((tickAnim - 25) / 20) * (0-(-1.02272)));
            zz = 22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30 + (((tickAnim - 25) / 20) * (0-(22.2526+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*600/0.5-50))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*600/0.5-50))*-1 + (((tickAnim - 25) / 20) * (0-(-6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*600/0.5-50))*-1)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.85-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.85 + (((tickAnim - 3) / 5) * (0-(2.85)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (21.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*600/0.5))*-3-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 21.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*600/0.5))*-3 + (((tickAnim - 25) / 20) * (0-(21.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*600/0.5))*-3)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 10) / 10) * (0-(8.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11 + (((tickAnim - 10) / 10) * (0-(-11)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.75 + (((tickAnim - 10) / 10) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18 + (((tickAnim - 10) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11 + (((tickAnim - 10) / 10) * (0-(-11)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.75 + (((tickAnim - 10) / 10) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18 + (((tickAnim - 10) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.75 + (((tickAnim - 10) / 10) * (0-(15.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.375-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.25 + (((tickAnim - 5) / 5) * (0-(13.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -2.375 + (((tickAnim - 5) / 5) * (-4.75-(-2.375)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (12.25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -4.75 + (((tickAnim - 10) / 3) * (-4.75-(-4.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 12.25 + (((tickAnim - 13) / 7) * (0-(12.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = -4.75 + (((tickAnim - 13) / 7) * (0-(-4.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (21.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 21.5 + (((tickAnim - 10) / 3) * (0-(21.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -14.25 + (((tickAnim - 18) / 10) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 28) / 22) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5.25-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -5.25 + (((tickAnim - 18) / 10) * (-5.25-(-5.25)));
            zz = 3 + (((tickAnim - 18) / 10) * (3-(3)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -5.25 + (((tickAnim - 28) / 22) * (0-(-5.25)));
            zz = 3 + (((tickAnim - 28) / 22) * (0-(3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -4 + (((tickAnim - 18) / 10) * (-4-(-4)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 28) / 22) * (0-(-4)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-31-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -31 + (((tickAnim - 18) / 10) * (-31-(-31)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -31 + (((tickAnim - 28) / 22) * (0-(-31)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (51.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 51.5 + (((tickAnim - 18) / 10) * (51.5-(51.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 51.5 + (((tickAnim - 28) / 22) * (0-(51.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -4 + (((tickAnim - 18) / 10) * (-4-(-4)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 28) / 22) * (0-(-4)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-31-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -31 + (((tickAnim - 18) / 10) * (-31-(-31)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -31 + (((tickAnim - 28) / 22) * (0-(-31)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (51.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 51.5 + (((tickAnim - 18) / 10) * (51.5-(51.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 51.5 + (((tickAnim - 28) / 22) * (0-(51.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm3.rotationPointX = this.leftarm3.rotationPointX + (float)(xx);
        this.leftarm3.rotationPointY = this.leftarm3.rotationPointY - (float)(yy);
        this.leftarm3.rotationPointZ = this.leftarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 11.75 + (((tickAnim - 18) / 10) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 28) / 22) * (0-(11.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -10 + (((tickAnim - 18) / 10) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 28) / 22) * (0-(-10)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = -0.3 + (((tickAnim - 18) / 10) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = -0.3 + (((tickAnim - 28) / 22) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 38) / 12) * (0-(-7)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (13.75-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 18) / 10) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 13.75 + (((tickAnim - 28) / 10) * (-2.75-(13.75)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 38) / 12) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-0.125-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.05 + (((tickAnim - 38) / 12) * (0-(0.05)));
            zz = -0.125 + (((tickAnim - 38) / 12) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (23.75-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 23.75 + (((tickAnim - 18) / 10) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 23.75 + (((tickAnim - 28) / 5) * (0-(23.75)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -11.25 + (((tickAnim - 18) / 10) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 28) / 22) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 32 + (((tickAnim - 18) / 10) * (32-(32)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 28) / 22) * (0-(32)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.225-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.6 + (((tickAnim - 18) / 10) * (-0.6-(-0.6)));
            zz = -0.225 + (((tickAnim - 18) / 10) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -0.6 + (((tickAnim - 28) / 22) * (0-(-0.6)));
            zz = -0.225 + (((tickAnim - 28) / 22) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-41-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -41 + (((tickAnim - 18) / 10) * (-41-(-41)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -41 + (((tickAnim - 28) / 22) * (0-(-41)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 18) / 10) * (-0.3-(-0.3)));
            zz = 0.175 + (((tickAnim - 18) / 10) * (0.175-(0.175)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -0.3 + (((tickAnim - 28) / 22) * (0-(-0.3)));
            zz = 0.175 + (((tickAnim - 28) / 22) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 34 + (((tickAnim - 18) / 10) * (34-(34)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 34 + (((tickAnim - 28) / 22) * (0-(34)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -11.25 + (((tickAnim - 18) / 10) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 28) / 22) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 32 + (((tickAnim - 18) / 10) * (32-(32)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 28) / 22) * (0-(32)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.225-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.6 + (((tickAnim - 18) / 10) * (-0.6-(-0.6)));
            zz = -0.225 + (((tickAnim - 18) / 10) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -0.6 + (((tickAnim - 28) / 22) * (0-(-0.6)));
            zz = -0.225 + (((tickAnim - 28) / 22) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-41-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -41 + (((tickAnim - 18) / 10) * (-41-(-41)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -41 + (((tickAnim - 28) / 22) * (0-(-41)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 18) / 10) * (-0.3-(-0.3)));
            zz = 0.175 + (((tickAnim - 18) / 10) * (0.175-(0.175)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -0.3 + (((tickAnim - 28) / 22) * (0-(-0.3)));
            zz = 0.175 + (((tickAnim - 28) / 22) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 34 + (((tickAnim - 18) / 10) * (34-(34)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 34 + (((tickAnim - 28) / 22) * (0-(34)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -23.25 + (((tickAnim - 15) / 15) * (17.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 17.25 + (((tickAnim - 30) / 11) * (-7.32536-(17.25)));
            yy = 0 + (((tickAnim - 30) / 11) * (0.39243-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0.58979-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -7.32536 + (((tickAnim - 41) / 9) * (0-(-7.32536)));
            yy = 0.39243 + (((tickAnim - 41) / 9) * (0-(0.39243)));
            zz = 0.58979 + (((tickAnim - 41) / 9) * (0-(0.58979)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 15) / 15) * (12.5-(5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 12.5 + (((tickAnim - 30) / 11) * (19.23-(12.5)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 19.23 + (((tickAnim - 41) / 9) * (0-(19.23)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -33 + (((tickAnim - 8) / 7) * (17-(-33)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 17 + (((tickAnim - 15) / 5) * (2.42-(17)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.42 + (((tickAnim - 20) / 10) * (17.5-(2.42)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 17.5 + (((tickAnim - 30) / 11) * (-33.23-(17.5)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -33.23 + (((tickAnim - 41) / 9) * (0-(-33.23)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(0);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(0);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (97-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 97 + (((tickAnim - 8) / 7) * (0-(97)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (9.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 9.5 + (((tickAnim - 20) / 5) * (10.25-(9.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 25) / 10) * (100.5-(10.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 100.5 + (((tickAnim - 35) / 6) * (125.59-(100.5)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 125.59 + (((tickAnim - 41) / 9) * (0-(125.59)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-8.525-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*7), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.075-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 7) * (0-(0.25)));
            zz = -0.075 + (((tickAnim - 8) / 7) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 8.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-25 + (((tickAnim - 0) / 13) * (0-(8.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 3) / 5) * (6.25-(-10)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 6.25 + (((tickAnim - 8) / 4) * (6.12-(6.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 6.12 + (((tickAnim - 12) / 3) * (0-(6.12)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animBlink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 18;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*390+100))*0.15), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (-0.02-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = -0.02 + (((tickAnim - 8) / 2) * (-0.02-(-0.02)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 10) / 8) * (1-(1)));
            yy = -0.02 + (((tickAnim - 10) / 8) * (1-(-0.02)));
            zz = 1 + (((tickAnim - 10) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (-0.02-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = -0.02 + (((tickAnim - 8) / 2) * (-0.02-(-0.02)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 10) / 8) * (1-(1)));
            yy = -0.02 + (((tickAnim - 10) / 8) * (1-(-0.02)));
            zz = 1 + (((tickAnim - 10) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);
    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 165;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 57) {
            xx = 5 + (((tickAnim - 25) / 32) * (5-(5)));
            yy = 0 + (((tickAnim - 25) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 32) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 132) {
            xx = 5 + (((tickAnim - 57) / 75) * (5-(5)));
            yy = 0 + (((tickAnim - 57) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 75) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = 5 + (((tickAnim - 132) / 33) * (0-(5)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (1.575-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 25) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 32) * (0-(0)));
            zz = 1.575 + (((tickAnim - 25) / 32) * (1.575-(1.575)));
        }
        else if (tickAnim >= 57 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 57) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 75) * (0-(0)));
            zz = 1.575 + (((tickAnim - 57) / 75) * (1.575-(1.575)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 1.575 + (((tickAnim - 132) / 33) * (0-(1.575)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 57) {
            xx = -3 + (((tickAnim - 25) / 32) * (-3-(-3)));
            yy = 0 + (((tickAnim - 25) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 32) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 132) {
            xx = -3 + (((tickAnim - 57) / 75) * (-3-(-3)));
            yy = 0 + (((tickAnim - 57) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 75) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -3 + (((tickAnim - 132) / 33) * (0-(-3)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -3.25 + (((tickAnim - 25) / 107) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -3.25 + (((tickAnim - 132) / 33) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-18.56241-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1.75347-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-2.30381-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -18.56241 + (((tickAnim - 25) / 107) * (-18.56241-(-18.56241)));
            yy = 1.75347 + (((tickAnim - 25) / 107) * (1.75347-(1.75347)));
            zz = -2.30381 + (((tickAnim - 25) / 107) * (-2.30381-(-2.30381)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -18.56241 + (((tickAnim - 132) / 33) * (0-(-18.56241)));
            yy = 1.75347 + (((tickAnim - 132) / 33) * (0-(1.75347)));
            zz = -2.30381 + (((tickAnim - 132) / 33) * (0-(-2.30381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = 20.25 + (((tickAnim - 25) / 107) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = 20.25 + (((tickAnim - 132) / 33) * (0-(20.25)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 57) {
            xx = -23.5 + (((tickAnim - 25) / 32) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 25) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 32) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 132) {
            xx = -23.5 + (((tickAnim - 57) / 75) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 57) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 75) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = -23.5 + (((tickAnim - 132) / 18) * (7.42-(-23.5)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 165) {
            xx = 7.42 + (((tickAnim - 150) / 15) * (0-(7.42)));
            yy = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-19.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -19.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 13) / 12) * (-9.75-(-19.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 57) {
            xx = -9.75 + (((tickAnim - 25) / 32) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 25) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 32) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 132) {
            xx = -9.75 + (((tickAnim - 57) / 75) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 57) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 75) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = -9.75 + (((tickAnim - 132) / 18) * (-46.39-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-9.75)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 165) {
            xx = -46.39-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 150) / 15) * (0-(-46.39-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (94.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 94.75 + (((tickAnim - 13) / 12) * (33.75-(94.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 57) {
            xx = 33.75 + (((tickAnim - 25) / 32) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 25) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 32) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 132) {
            xx = 33.75 + (((tickAnim - 57) / 75) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 57) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 75) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = 33.75 + (((tickAnim - 132) / 18) * (107.44-(33.75)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 165) {
            xx = 107.44 + (((tickAnim - 150) / 15) * (0-(107.44)));
            yy = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (9.18997-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1.08221-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-5.89942-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 9.18997 + (((tickAnim - 25) / 8) * (4.24249-(9.18997)));
            yy = 1.08221 + (((tickAnim - 25) / 8) * (0.44131-(1.08221)));
            zz = -5.89942 + (((tickAnim - 25) / 8) * (-1.95072-(-5.89942)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 4.24249 + (((tickAnim - 33) / 12) * (-1.25751-(4.24249)));
            yy = 0.44131 + (((tickAnim - 33) / 12) * (0.44131-(0.44131)));
            zz = -1.95072 + (((tickAnim - 33) / 12) * (-1.95072-(-1.95072)));
        }
        else if (tickAnim >= 45 && tickAnim < 57) {
            xx = -1.25751 + (((tickAnim - 45) / 12) * (9.18997-(-1.25751)));
            yy = 0.44131 + (((tickAnim - 45) / 12) * (1.08221-(0.44131)));
            zz = -1.95072 + (((tickAnim - 45) / 12) * (5.89942-(-1.95072)));
        }
        else if (tickAnim >= 57 && tickAnim < 64) {
            xx = 9.18997 + (((tickAnim - 57) / 7) * (4.24249-(9.18997)));
            yy = 1.08221 + (((tickAnim - 57) / 7) * (0.44131-(1.08221)));
            zz = 5.89942 + (((tickAnim - 57) / 7) * (-1.95072-(5.89942)));
        }
        else if (tickAnim >= 64 && tickAnim < 77) {
            xx = 4.24249 + (((tickAnim - 64) / 13) * (-1.25751-(4.24249)));
            yy = 0.44131 + (((tickAnim - 64) / 13) * (0.44131-(0.44131)));
            zz = -1.95072 + (((tickAnim - 64) / 13) * (-1.95072-(-1.95072)));
        }
        else if (tickAnim >= 77 && tickAnim < 124) {
            xx = -1.25751 + (((tickAnim - 77) / 47) * (-16.7584-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10-(-1.25751)));
            yy = 0.44131 + (((tickAnim - 77) / 47) * (-0.01504-(0.44131)));
            zz = -1.95072 + (((tickAnim - 77) / 47) * (-2.72397-(-1.95072)));
        }
        else if (tickAnim >= 124 && tickAnim < 132) {
            xx = -16.7584-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10 + (((tickAnim - 124) / 8) * (-19.7584-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10-(-16.7584-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10)));
            yy = -0.01504 + (((tickAnim - 124) / 8) * (-0.01504-(-0.01504)));
            zz = -2.72397 + (((tickAnim - 124) / 8) * (-2.72397-(-2.72397)));
        }
        else if (tickAnim >= 132 && tickAnim < 133) {
            xx = -19.7584-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10 + (((tickAnim - 132) / 1) * (-19.7584-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*20-(-19.7584-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10)));
            yy = -0.01504 + (((tickAnim - 132) / 1) * (-0.01504-(-0.01504)));
            zz = -2.72397 + (((tickAnim - 132) / 1) * (-2.72397-(-2.72397)));
        }
        else if (tickAnim >= 133 && tickAnim < 165) {
            xx = -19.7584-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*20 + (((tickAnim - 133) / 32) * (0-(-19.7584-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*20)));
            yy = -0.01504 + (((tickAnim - 133) / 32) * (0-(-0.01504)));
            zz = -2.72397 + (((tickAnim - 133) / 32) * (0-(-2.72397)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -10.5 + (((tickAnim - 25) / 8) * (9.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*10-(-10.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 9.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*10 + (((tickAnim - 33) / 12) * (-5.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-30-(9.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*10)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 57) {
            xx = -5.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-30 + (((tickAnim - 45) / 12) * (11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-30-(-5.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-30)));
            yy = 0 + (((tickAnim - 45) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 12) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 64) {
            xx = 11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-30 + (((tickAnim - 57) / 7) * (-3.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*10-(11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-30)));
            yy = 0 + (((tickAnim - 57) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 7) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 77) {
            xx = -3.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*10 + (((tickAnim - 64) / 13) * (31.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-30-(-3.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*10)));
            yy = 0 + (((tickAnim - 64) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 13) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 31.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-30 + (((tickAnim - 77) / 18) * (0-(31.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-30)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 95) / 13) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))-(0)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 124) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*500)) + (((tickAnim - 108) / 16) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*500)))));
            yy = 0 + (((tickAnim - 108) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 16) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 124) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 8) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 132) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-40-(0)));
            yy = 0 + (((tickAnim - 132) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 1) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 165) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-40 + (((tickAnim - 133) / 32) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-40)));
            yy = 0 + (((tickAnim - 133) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 112 && tickAnim < 117) {
            xx = 1 + (((tickAnim - 112) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 112) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 112) / 5) * (1-(1)));
        }
        else if (tickAnim >= 117 && tickAnim < 122) {
            xx = 1 + (((tickAnim - 117) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 117) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 117) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 112 && tickAnim < 117) {
            xx = 1 + (((tickAnim - 112) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 112) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 112) / 5) * (1-(1)));
        }
        else if (tickAnim >= 117 && tickAnim < 122) {
            xx = 1 + (((tickAnim - 117) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 117) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 117) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (24.5-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 24.5 + (((tickAnim - 25) / 7) * (0-(24.5)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 2.5 + (((tickAnim - 35) / 3) * (0-(2.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (2.5-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 2.5 + (((tickAnim - 42) / 3) * (0-(2.5)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 45) / 12) * (24.5-(0)));
            yy = 0 + (((tickAnim - 45) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 12) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 24.5 + (((tickAnim - 57) / 6) * (0-(24.5)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 63) / 4) * (2.5-(0)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 2.5 + (((tickAnim - 67) / 3) * (0-(2.5)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 2.5 + (((tickAnim - 73) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -1.5 + (((tickAnim - 25) / 107) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -1.5 + (((tickAnim - 132) / 33) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -7.5 + (((tickAnim - 25) / 107) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -7.5 + (((tickAnim - 132) / 33) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -14.5 + (((tickAnim - 25) / 107) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -14.5 + (((tickAnim - 132) / 33) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(0), rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(0), rightleg3.rotateAngleY + (float) Math.toRadians(0), rightleg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = 8.75 + (((tickAnim - 25) / 107) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = 8.75 + (((tickAnim - 132) / 33) * (0-(8.75)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -5.25 + (((tickAnim - 25) / 107) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -5.25 + (((tickAnim - 132) / 33) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -3 + (((tickAnim - 25) / 107) * (-3-(-3)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -3 + (((tickAnim - 132) / 33) * (0-(-3)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -6.5 + (((tickAnim - 25) / 107) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -6.5 + (((tickAnim - 132) / 33) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = 9 + (((tickAnim - 25) / 107) * (9-(9)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = 9 + (((tickAnim - 132) / 33) * (0-(9)));
            yy = 0 + (((tickAnim - 132) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-5.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*-12), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+20))*-2.5);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+70))*12), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.7);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15.25 + (((tickAnim - 0) / 4) * (-28.27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(15.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = -6.85 + (((tickAnim - 0) / 4) * (0-(-6.85)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -28.27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 4) / 6) * (-105.2901-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-200-(-28.27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-3.11364-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -105.2901-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-200 + (((tickAnim - 10) / 3) * (15.25-(-105.2901-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-200)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -3.11364 + (((tickAnim - 10) / 3) * (-6.85-(-3.11364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -30.25 + (((tickAnim - 0) / 2) * (-51.25-(-30.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -51.25 + (((tickAnim - 2) / 2) * (-25.3994-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-51.25)));
            yy = 0 + (((tickAnim - 2) / 2) * (-2.99752-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (7.42059-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -25.3994-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 4) / 3) * (28.63-(-25.3994-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = -2.99752 + (((tickAnim - 4) / 3) * (0-(-2.99752)));
            zz = 7.42059 + (((tickAnim - 4) / 3) * (0-(7.42059)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 28.63 + (((tickAnim - 7) / 3) * (14.88-(28.63)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 14.88 + (((tickAnim - 10) / 3) * (-30.25-(14.88)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.55 + (((tickAnim - 4) / 3) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.45-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 2) * (0-(0.45)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 119.75 + (((tickAnim - 0) / 2) * (120-(119.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 120 + (((tickAnim - 2) / 2) * (54.5-(120)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 54.5 + (((tickAnim - 4) / 2) * (-3.11693-(54.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (-0.92012-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-1.97772-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -3.11693 + (((tickAnim - 6) / 2) * (-3.60066-(-3.11693)));
            yy = -0.92012 + (((tickAnim - 6) / 2) * (-0.53141-(-0.92012)));
            zz = -1.97772 + (((tickAnim - 6) / 2) * (0.17945-(-1.97772)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.60066 + (((tickAnim - 8) / 2) * (95.32409-(-3.60066)));
            yy = -0.53141 + (((tickAnim - 8) / 2) * (-0.26571-(-0.53141)));
            zz = 0.17945 + (((tickAnim - 8) / 2) * (0.08972-(0.17945)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 95.32409 + (((tickAnim - 10) / 3) * (119.75-(95.32409)));
            yy = -0.26571 + (((tickAnim - 10) / 3) * (0-(-0.26571)));
            zz = 0.08972 + (((tickAnim - 10) / 3) * (0-(0.08972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.4 + (((tickAnim - 2) / 2) * (0.45-(-0.4)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 4) / 2) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 6) / 1) * (0.515-(0.45)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.515 + (((tickAnim - 7) / 1) * (0.9-(0.515)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.9 + (((tickAnim - 8) / 0) * (0.965-(0.9)));
            zz = 0 + (((tickAnim - 8) / 0) * (0.405-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.965 + (((tickAnim - 8) / 2) * (0.755-(0.965)));
            zz = 0.405 + (((tickAnim - 8) / 2) * (0.175-(0.405)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.755 + (((tickAnim - 10) / 3) * (0-(0.755)));
            zz = 0.175 + (((tickAnim - 10) / 3) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(xx);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(yy);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 0) / 3) * (-34.39455-(-2.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.29434-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (7.15388-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -34.39455 + (((tickAnim - 3) / 5) * (-23.6521-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-34.39455)));
            yy = -0.29434 + (((tickAnim - 3) / 5) * (-3.94114-(-0.29434)));
            zz = 7.15388 + (((tickAnim - 3) / 5) * (10.81585-(7.15388)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -23.6521-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 8) / 5) * (-2.75-(-23.6521-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = -3.94114 + (((tickAnim - 8) / 5) * (0-(-3.94114)));
            zz = 10.81585 + (((tickAnim - 8) / 5) * (0-(10.81585)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -49.25 + (((tickAnim - 0) / 2) * (0.75-(-49.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.75 + (((tickAnim - 2) / 1) * (24.40869-(0.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (5.23446-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (-11.3671-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 24.40869 + (((tickAnim - 3) / 1) * (19.15069-(24.40869)));
            yy = 5.23446 + (((tickAnim - 3) / 1) * (6.24928-(5.23446)));
            zz = -11.3671 + (((tickAnim - 3) / 1) * (-12.39463-(-11.3671)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 19.15069 + (((tickAnim - 4) / 6) * (110.63-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(19.15069)));
            yy = 6.24928 + (((tickAnim - 4) / 6) * (0-(6.24928)));
            zz = -12.39463 + (((tickAnim - 4) / 6) * (0-(-12.39463)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 110.63-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 10) / 3) * (-49.25-(110.63-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 3) / 1) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 4) / 4) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 138.01155 + (((tickAnim - 0) / 3) * (62.75-(138.01155)));
            yy = 5.20211 + (((tickAnim - 0) / 3) * (0-(5.20211)));
            zz = 5.75253 + (((tickAnim - 0) / 3) * (6.75-(5.75253)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 62.75 + (((tickAnim - 3) / 1) * (-7.43226-(62.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (1.00855-(0)));
            zz = 6.75 + (((tickAnim - 3) / 1) * (7.68449-(6.75)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -7.43226 + (((tickAnim - 4) / 1) * (-7.43226-(-7.43226)));
            yy = 1.00855 + (((tickAnim - 4) / 1) * (1.00855-(1.00855)));
            zz = 7.68449 + (((tickAnim - 4) / 1) * (7.68449-(7.68449)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.43226 + (((tickAnim - 5) / 3) * (99.8088-(-7.43226)));
            yy = 1.00855 + (((tickAnim - 5) / 3) * (1.58291-(1.00855)));
            zz = 7.68449 + (((tickAnim - 5) / 3) * (-0.62337-(7.68449)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 99.8088 + (((tickAnim - 8) / 2) * (153.93141-(99.8088)));
            yy = 1.58291 + (((tickAnim - 8) / 2) * (3.134-(1.58291)));
            zz = -0.62337 + (((tickAnim - 8) / 2) * (2.10916-(-0.62337)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 153.93141 + (((tickAnim - 10) / 3) * (138.01155-(153.93141)));
            yy = 3.134 + (((tickAnim - 10) / 3) * (5.20211-(3.134)));
            zz = 2.10916 + (((tickAnim - 10) / 3) * (5.75253-(2.10916)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -0.45 + (((tickAnim - 4) / 1) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.45 + (((tickAnim - 5) / 3) * (0.725-(-0.45)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.725 + (((tickAnim - 8) / 2) * (0-(0.725)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0.175 + (((tickAnim - 10) / 3) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm3.rotationPointX = this.leftarm3.rotationPointX + (float)(xx);
        this.leftarm3.rotationPointY = this.leftarm3.rotationPointY - (float)(yy);
        this.leftarm3.rotationPointZ = this.leftarm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+30))*5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(7-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+60))*-10), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+50))*10), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(2.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*4), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*8), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-200))*8), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(0);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(-0.325);


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*8), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0.2);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(-0.3);


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-300))*8), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.25 + (((tickAnim - 0) / 3) * (4.25-(29.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 4.25 + (((tickAnim - 3) / 3) * (-20-(4.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -20 + (((tickAnim - 6) / 7) * (29.25-(-20)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22 + (((tickAnim - 0) / 3) * (16.13-(22)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 16.13 + (((tickAnim - 3) / 3) * (-1.75-(16.13)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.75 + (((tickAnim - 6) / 4) * (18.5-(-1.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18.5 + (((tickAnim - 10) / 3) * (22-(18.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (-15.1-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -15.1 + (((tickAnim - 3) / 1) * (-32.25-(-15.1)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -32.25 + (((tickAnim - 4) / 2) * (26.25-(-32.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 26.25 + (((tickAnim - 6) / 3) * (-6.19-(26.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -6.19 + (((tickAnim - 9) / 4) * (22.5-(-6.19)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 64.75 + (((tickAnim - 0) / 2) * (117.88-(64.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 117.88 + (((tickAnim - 2) / 1) * (95-(117.88)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 95 + (((tickAnim - 3) / 1) * (95-(95)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 95 + (((tickAnim - 4) / 2) * (-3-(95)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -3 + (((tickAnim - 6) / 3) * (7.25-(-3)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 7.25 + (((tickAnim - 9) / 1) * (-6.55-(7.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -6.55 + (((tickAnim - 10) / 3) * (64.75-(-6.55)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 2) / 1) * (0-(0.4)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 6) / 2) * (0.49-(-0.15)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.07-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.49 + (((tickAnim - 8) / 1) * (1.08-(0.49)));
            zz = 0.07 + (((tickAnim - 8) / 1) * (0.345-(0.07)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.08 + (((tickAnim - 9) / 1) * (0.66-(1.08)));
            zz = 0.345 + (((tickAnim - 9) / 1) * (0.13-(0.345)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.66 + (((tickAnim - 10) / 1) * (0.875-(0.66)));
            zz = 0.13 + (((tickAnim - 10) / 1) * (0.325-(0.13)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 11) / 2) * (0-(0.875)));
            zz = 0.325 + (((tickAnim - 11) / 2) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10.25 + (((tickAnim - 0) / 4) * (-19.57741-(10.25)));
            yy = -3.05 + (((tickAnim - 0) / 4) * (-3.39395-(-3.05)));
            zz = -2.55 + (((tickAnim - 0) / 4) * (-4.06687-(-2.55)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -19.57741 + (((tickAnim - 4) / 5) * (31.25-(-19.57741)));
            yy = -3.39395 + (((tickAnim - 4) / 5) * (0-(-3.39395)));
            zz = -4.06687 + (((tickAnim - 4) / 5) * (0-(-4.06687)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 31.25 + (((tickAnim - 9) / 4) * (10.25-(31.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (-3.05-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-2.55-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.25 + (((tickAnim - 0) / 3) * (-12.74931-(19.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.20802-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.63775-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -12.74931 + (((tickAnim - 3) / 1) * (-15.74885-(-12.74931)));
            yy = 0.20802 + (((tickAnim - 3) / 1) * (0.34671-(0.20802)));
            zz = -0.63775 + (((tickAnim - 3) / 1) * (-1.06291-(-0.63775)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -15.74885 + (((tickAnim - 4) / 5) * (-49.0292-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-15.74885)));
            yy = 0.34671 + (((tickAnim - 4) / 5) * (0.12608-(0.34671)));
            zz = -1.06291 + (((tickAnim - 4) / 5) * (-0.38652-(-1.06291)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -49.0292-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 9) / 4) * (19.25-(-49.0292-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0.12608 + (((tickAnim - 9) / 4) * (0-(0.12608)));
            zz = -0.38652 + (((tickAnim - 9) / 4) * (0-(-0.38652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 4) / 5) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -44 + (((tickAnim - 0) / 2) * (-40.75-(-44)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -40.75 + (((tickAnim - 2) / 2) * (28-(-40.75)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 28 + (((tickAnim - 4) / 5) * (51.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(28)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 51.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 9) / 4) * (-44-(51.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.575 + (((tickAnim - 0) / 2) * (-0.425-(-0.575)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 2) / 2) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 4) / 2) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.175-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 8) / 1) * (0-(0.175)));
            zz = -0.3 + (((tickAnim - 8) / 1) * (0-(-0.3)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0.135-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.135 + (((tickAnim - 12) / 1) * (-0.575-(0.135)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 95 + (((tickAnim - 0) / 1) * (95-(95)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 95 + (((tickAnim - 1) / 3) * (1.97904-(95)));
            yy = 0 + (((tickAnim - 1) / 3) * (-1.00332-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (4.72564-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 1.97904 + (((tickAnim - 4) / 2) * (-9.71-(1.97904)));
            yy = -1.00332 + (((tickAnim - 4) / 2) * (0-(-1.00332)));
            zz = 4.72564 + (((tickAnim - 4) / 2) * (0-(4.72564)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.71 + (((tickAnim - 6) / 2) * (-27.42-(-9.71)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -27.42 + (((tickAnim - 8) / 1) * (92.37-(-27.42)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 92.37 + (((tickAnim - 9) / 3) * (128.62-(92.37)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 128.62 + (((tickAnim - 12) / 1) * (95-(128.62)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 0) / 4) * (-0.15-(0.875)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 4) / 2) * (0.8-(-0.15)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.425-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.8 + (((tickAnim - 6) / 2) * (1.55-(0.8)));
            zz = 0.425 + (((tickAnim - 6) / 2) * (0.375-(0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.55 + (((tickAnim - 8) / 0) * (1.53-(1.55)));
            zz = 0.375 + (((tickAnim - 8) / 0) * (1.125-(0.375)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.53 + (((tickAnim - 8) / 1) * (0.425-(1.53)));
            zz = 1.125 + (((tickAnim - 8) / 1) * (0-(1.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 9) / 4) * (0.875-(0.425)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProtoceratops entity = (EntityPrehistoricFloraProtoceratops) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*2), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-40))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-0.1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-90))*0.35);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*0.5);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*1), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-2));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.4347 + (((tickAnim - 0) / 3) * (-0.7447-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(14.4347)));
            yy = 0.58781 + (((tickAnim - 0) / 3) * (1.37156-(0.58781)));
            zz = 2.94213 + (((tickAnim - 0) / 3) * (6.86497-(2.94213)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.7447-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 3) / 5) * (-40-(-0.7447-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 1.37156 + (((tickAnim - 3) / 5) * (0-(1.37156)));
            zz = 6.86497 + (((tickAnim - 3) / 5) * (0-(6.86497)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -40 + (((tickAnim - 8) / 15) * (-19.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-40)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -19.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 23) / 2) * (14.4347-(-19.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 23) / 2) * (0.58781-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (2.94213-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -50.51954 + (((tickAnim - 0) / 3) * (-60.79-(-50.51954)));
            yy = 0.0434 + (((tickAnim - 0) / 3) * (0-(0.0434)));
            zz = -0.00009 + (((tickAnim - 0) / 3) * (0-(-0.00009)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -60.79 + (((tickAnim - 3) / 5) * (19-(-60.79)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 19 + (((tickAnim - 8) / 10) * (7.32-(19)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 7.32 + (((tickAnim - 18) / 5) * (-33-(7.32)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -33 + (((tickAnim - 23) / 2) * (-50.51954-(-33)));
            yy = 0 + (((tickAnim - 23) / 2) * (0.0434-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (-0.00009-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 5) * (-0.1-(-0.275)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 5) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 132.75 + (((tickAnim - 0) / 3) * (150.37-(132.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 150.37 + (((tickAnim - 3) / 5) * (20.5-(150.37)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 20.5 + (((tickAnim - 8) / 10) * (1.89-(20.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.89 + (((tickAnim - 18) / 5) * (109.75-(1.89)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 109.75 + (((tickAnim - 23) / 2) * (132.75-(109.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 8) / 2) * (0.485-(-0.175)));
            zz = 0.225 + (((tickAnim - 8) / 2) * (0.13-(0.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.485 + (((tickAnim - 10) / 3) * (0.375-(0.485)));
            zz = 0.13 + (((tickAnim - 10) / 3) * (0-(0.13)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 13) / 5) * (-0.35-(0.375)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 18) / 5) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(xx);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(yy);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -16.25 + (((tickAnim - 0) / 9) * (32.25-(-16.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 32.25 + (((tickAnim - 9) / 6) * (82.6053-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(32.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (1.37156-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (6.86497-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 82.6053-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 15) / 5) * (-37.5-(82.6053-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 1.37156 + (((tickAnim - 15) / 5) * (0-(1.37156)));
            zz = 6.86497 + (((tickAnim - 15) / 5) * (0-(6.86497)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -37.5 + (((tickAnim - 20) / 5) * (-16.25-(-37.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.25 + (((tickAnim - 0) / 5) * (-1.43-(10.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1.43 + (((tickAnim - 5) / 4) * (-41-(-1.43)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -41 + (((tickAnim - 9) / 5) * (-50.54-(-41)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -50.54 + (((tickAnim - 14) / 6) * (19-(-50.54)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 19 + (((tickAnim - 20) / 5) * (10.25-(19)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 5) / 4) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5.49226 + (((tickAnim - 0) / 5) * (0.14-(5.49226)));
            yy = -0.40027 + (((tickAnim - 0) / 5) * (0-(-0.40027)));
            zz = 2.21413 + (((tickAnim - 0) / 5) * (0-(2.21413)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.14 + (((tickAnim - 5) / 6) * (132.75-(0.14)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 132.75 + (((tickAnim - 11) / 3) * (150.37-(132.75)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 150.37 + (((tickAnim - 14) / 6) * (18.74585-(150.37)));
            yy = 0 + (((tickAnim - 14) / 6) * (-0.40177-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (1.18368-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 18.74585 + (((tickAnim - 20) / 5) * (5.49226-(18.74585)));
            yy = -0.40177 + (((tickAnim - 20) / 5) * (-0.40027-(-0.40177)));
            zz = 1.18368 + (((tickAnim - 20) / 5) * (2.21413-(1.18368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 5) * (-0.575-(0.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.575 + (((tickAnim - 5) / 6) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 20) / 2) * (0.165-(-0.325)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.165 + (((tickAnim - 22) / 3) * (0.5-(0.165)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm3.rotationPointX = this.leftarm3.rotationPointX + (float)(xx);
        this.leftarm3.rotationPointY = this.leftarm3.rotationPointY - (float)(yy);
        this.leftarm3.rotationPointZ = this.leftarm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-180))*2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*2), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*0.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*2), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-40))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-140))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*2), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*2), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0.05);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(-0.075);


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*2), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-180))*2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*2));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -17 + (((tickAnim - 0) / 13) * (18-(-17)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 18 + (((tickAnim - 13) / 6) * (99.605-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(18)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 99.605-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 19) / 6) * (-17-(99.605-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -3.5 + (((tickAnim - 0) / 13) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (13.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 13.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 20) / 5) * (-3.5-(13.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.5 + (((tickAnim - 0) / 3) * (4.2-(4.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 4.2 + (((tickAnim - 3) / 10) * (27.75-(4.2)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 27.75 + (((tickAnim - 13) / 3) * (-10-(27.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 16) / 4) * (-292.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(-10)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -292.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 20) / 5) * (4.5-(-292.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 5) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.5 + (((tickAnim - 0) / 3) * (5.28537-(15.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.08357-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.05555-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5.28537 + (((tickAnim - 3) / 5) * (-15.84434-(5.28537)));
            yy = -0.08357 + (((tickAnim - 3) / 5) * (-0.04558-(-0.08357)));
            zz = 1.05555 + (((tickAnim - 3) / 5) * (0.57576-(1.05555)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -15.84434 + (((tickAnim - 8) / 5) * (30.25-(-15.84434)));
            yy = -0.04558 + (((tickAnim - 8) / 5) * (0-(-0.04558)));
            zz = 0.57576 + (((tickAnim - 8) / 5) * (0-(0.57576)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 30.25 + (((tickAnim - 13) / 3) * (104.08-(30.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 104.08 + (((tickAnim - 16) / 3) * (99.26-(104.08)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 99.26 + (((tickAnim - 19) / 4) * (47.36-(99.26)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 47.36 + (((tickAnim - 23) / 2) * (15.5-(47.36)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 8) * (-0.5-(0.275)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 5) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (1.07-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.03-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.07 + (((tickAnim - 16) / 3) * (0.425-(1.07)));
            zz = -0.03 + (((tickAnim - 16) / 3) * (-0.05-(-0.03)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 19) / 4) * (0.915-(0.425)));
            zz = -0.05 + (((tickAnim - 19) / 4) * (-0.02-(-0.05)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.915 + (((tickAnim - 23) / 2) * (0.275-(0.915)));
            zz = -0.02 + (((tickAnim - 23) / 2) * (0-(-0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 18 + (((tickAnim - 0) / 7) * (19.405-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(18)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 19.405-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 7) / 6) * (-17-(19.405-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -17 + (((tickAnim - 13) / 12) * (18-(-17)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -14.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 8) / 5) * (-3.5-(-14.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 13) / 12) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 27.75 + (((tickAnim - 0) / 4) * (-10-(27.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 4) / 4) * (-77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-10)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 8) / 5) * (4.5-(-77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 4.5 + (((tickAnim - 13) / 12) * (27.75-(4.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 5) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.25 + (((tickAnim - 0) / 3) * (104.08-(30.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 104.08 + (((tickAnim - 3) / 4) * (99.26-(104.08)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 99.26 + (((tickAnim - 7) / 3) * (47.36-(99.26)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 47.36 + (((tickAnim - 10) / 3) * (15.5-(47.36)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 15.5 + (((tickAnim - 13) / 4) * (-3.21463-(15.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (-0.08357-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (1.05555-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -3.21463 + (((tickAnim - 17) / 4) * (-15.84434-(-3.21463)));
            yy = -0.08357 + (((tickAnim - 17) / 4) * (-0.04558-(-0.08357)));
            zz = 1.05555 + (((tickAnim - 17) / 4) * (0.57576-(1.05555)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -15.84434 + (((tickAnim - 21) / 4) * (30.25-(-15.84434)));
            yy = -0.04558 + (((tickAnim - 21) / 4) * (0-(-0.04558)));
            zz = 0.57576 + (((tickAnim - 21) / 4) * (0-(0.57576)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.07-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.03-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.07 + (((tickAnim - 3) / 4) * (0.425-(1.07)));
            zz = -0.03 + (((tickAnim - 3) / 4) * (-0.05-(-0.03)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.425 + (((tickAnim - 7) / 6) * (0.275-(0.425)));
            zz = -0.05 + (((tickAnim - 7) / 6) * (0-(-0.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.275 + (((tickAnim - 13) / 4) * (0.255-(0.275)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0.255 + (((tickAnim - 17) / 4) * (-0.5-(0.255)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.5 + (((tickAnim - 21) / 4) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProtoceratops e = (EntityPrehistoricFloraProtoceratops) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
