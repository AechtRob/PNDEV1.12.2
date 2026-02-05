package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraChangchunsaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelChangchunsaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer feather;
    private final AdvancedModelRenderer feather2;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer feather3;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;

    private ModelAnimator animator;

    public ModelChangchunsaurus() {
        this.textureWidth = 68;
        this.textureHeight = 68;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 12.825F, 3.5F);
        this.setRotateAngle(Root, -0.0436F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.05F, -2.9128F, -0.7231F);
        this.Root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 53, 1.0F, -3.0F, -1.0F, 0, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.1378F, 1.7019F);
        this.Root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 8, -1.0F, -2.0F, -3.0F, 0, 2, 4, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.1378F, 1.7019F);
        this.Root.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 54, 8, 1.0F, -2.0F, -3.0F, 0, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.9878F, -0.4981F);
        this.Root.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2356F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 0, -2.5F, -2.0F, -1.0F, 5, 6, 4, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.5628F, -0.6231F);
        this.Root.addChild(Body);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -1.625F, -0.575F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 49, 1.0F, -3.0F, -5.0F, 0, 3, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.3F, -1.425F, -2.875F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 0, -1.0F, -2.0F, -3.0F, 0, 2, 6, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.3F, -1.425F, -2.875F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 0, 1.0F, -2.0F, -3.0F, 0, 2, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.0F, -7.0F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -3.0F, -7.0F, -1.0F, 6, 7, 8, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 1.125F, -7.65F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, -0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.001F, 3.3108F, -3.7871F);
        this.Chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 35, -2.001F, -2.9848F, -0.1737F, 4, 3, 5, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.074F, -2.4064F);
        this.Chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 26, -2.5F, -4.0F, -1.0F, 5, 4, 5, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 2.8741F, -3.9314F);
        this.Chest.addChild(Neck);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.6142F, -0.0554F);
        this.Neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 43, -2.0F, -1.1888F, -2.1585F, 4, 4, 4, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -2.3892F, -1.6554F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0436F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.5178F, -2.5076F);
        this.Neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6545F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 44, -1.5F, -2.0F, 0.0F, 3, 2, 4, 0.005F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.3072F, -3.0826F);
        this.Neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6545F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 50, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.001F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -2.0928F, -1.3826F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0436F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.725F, -1.125F);
        this.Neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 57, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.75F, -1.3F);
        this.Neck3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 20, -1.5F, -2.0F, -1.0F, 3, 2, 2, -0.001F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.5F, 0.1F, -1.9F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.2182F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 58, 59, -1.0F, 0.5511F, -3.8141F, 1, 1, 3, 0.003F, false));
        this.Head.cubeList.add(new ModelBox(Head, 48, 61, 0.025F, 0.7228F, -3.2219F, 0, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 48, 61, -1.025F, 0.6728F, -3.2219F, 0, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.983F, -0.448F, -1.4833F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1531F, -0.2266F, -0.0232F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 9, 0.0343F, -0.1288F, -1.0057F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.0551F, 0.9293F, -0.5987F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2618F, -0.192F, -0.0436F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 60, -1.541F, -0.3328F, -2.5969F, 0, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.9449F, 0.9293F, -0.5987F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2618F, 0.192F, 0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 60, 1.541F, -0.3328F, -2.5969F, 0, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 1.7478F, -3.6969F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 62, 24, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.075F, 0.9228F, -1.5219F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.3054F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 8, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.083F, -0.223F, -3.1083F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3491F, -0.6981F, -0.1745F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 62, 13, 0.0214F, 0.0002F, -0.0294F, 1, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.075F, 0.9228F, -1.5219F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0436F, -0.3054F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 8, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 0.2228F, -4.3469F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 62, 15, -0.5F, 0.6058F, -0.5602F, 1, 1, 1, 0.001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.7228F, -4.9719F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.432F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 61, -0.5F, -0.0084F, -0.0507F, 1, 1, 2, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.083F, -0.223F, -3.1083F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3491F, 0.6981F, 0.1745F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 62, 13, -1.0214F, 0.0002F, -0.0294F, 1, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.983F, -0.448F, -1.4833F);
        this.Head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1531F, 0.2266F, 0.0232F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 62, 9, -1.0343F, -0.1288F, -1.0057F, 1, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.511F, 0.0419F, -3.5318F);
        this.Head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3054F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 36, 60, -0.489F, -0.0325F, -0.0053F, 1, 1, 2, 0.001F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.8F, 1.3728F, -1.5969F);
        this.Head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, -0.288F, -0.0349F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 56, -0.0659F, -1.0F, -3.0145F, 1, 1, 3, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.8F, 1.3728F, -1.5969F);
        this.Head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0873F, 0.288F, 0.0349F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 56, -0.9341F, -1.0F, -3.0145F, 1, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 1.2478F, -1.4469F);
        this.Head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0436F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 52, 40, -1.5F, -1.8643F, -0.3118F, 3, 2, 2, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.2107F, 0.5569F);
        this.Head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.8738F, -0.2593F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0436F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 54, 32, -1.5F, -1.9205F, -1.3306F, 3, 2, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.325F, -0.2262F, -1.3843F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1745F, -0.2793F, 0.0436F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 54, 28, -0.0026F, 0.0011F, -2.7661F, 1, 1, 3, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.525F, 0.1988F, -2.9093F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 8, 56, -1.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 8, 56, -0.05F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.6949F, -0.1313F, -1.0556F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2618F, -0.1745F, 0.0436F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 6, 60, -1.6831F, -0.7361F, -2.5115F, 0, 1, 3, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.6949F, -0.1313F, -1.0556F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2618F, 0.1745F, -0.0436F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 6, 60, 1.6831F, -0.7361F, -2.5115F, 0, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.1738F, -4.3843F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.5672F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 62, 17, -0.5F, -0.8209F, -1.3502F, 1, 1, 1, -0.001F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.2238F, -4.4093F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1396F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 28, 10, -0.5F, -1.0207F, -0.3901F, 1, 1, 4, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.325F, -0.2262F, -1.3843F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1745F, 0.2793F, -0.0436F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 54, 28, -0.9974F, 0.0011F, -2.7661F, 1, 1, 3, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.5816F, -2.5862F);
        this.jaw.addChild(throat);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.4055F, 0.9074F);
        this.throat.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.4363F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 52, 35, -0.5F, -1.0F, -1.0F, 1, 1, 4, -0.001F, false));

        this.feather = new AdvancedModelRenderer(this);
        this.feather.setRotationPoint(-0.5F, -0.467F, 0.2444F);
        this.Head.addChild(feather);
        this.setRotateAngle(feather, 0.1745F, 0.0F, 0.0F);
        this.feather.cubeList.add(new ModelBox(feather, -2, 51, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.feather2 = new AdvancedModelRenderer(this);
        this.feather2.setRotationPoint(-1.5965F, 2.063F, -0.0871F);
        this.Head.addChild(feather2);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.1535F, -0.313F, 0.0871F);
        this.feather2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.48F, 0.3491F, 0.9163F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 54, -1.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.feather3 = new AdvancedModelRenderer(this);
        this.feather3.setRotationPoint(0.5965F, 2.063F, -0.0871F);
        this.Head.addChild(feather3);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.1535F, -0.313F, 0.0871F);
        this.feather3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.48F, -0.3491F, -0.9163F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 54, -2.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(2.275F, 3.049F, -3.7564F);
        this.Chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.0F, 0.3491F, 0.0F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.575F, 1.0F, 0.075F);
        this.leftarm.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.9599F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 12, 45, 0.0F, -0.6868F, 0.9501F, 1, 4, 2, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.075F, 0.625F, 4.125F);
        this.leftarm.addChild(leftarm2);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.7F, -0.9F, -4.075F);
        this.leftarm2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.5236F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 52, 57, 0.0F, -1.4295F, 2.2158F, 1, 4, 2, 0.0F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(-0.025F, 2.8F, -2.7F);
        this.leftarm2.addChild(leftarm3);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.325F, 1.0F, 2.45F);
        this.leftarm3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.3927F, 0.1222F, 0.3491F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 24, 60, -0.5115F, -0.1462F, -3.4341F, 1, 2, 2, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-2.275F, 3.049F, -3.7564F);
        this.Chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0F, -0.3491F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.575F, 1.0F, 0.075F);
        this.rightarm.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.9599F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 12, 45, -1.0F, -0.6868F, 0.9501F, 1, 4, 2, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.075F, 0.625F, 4.125F);
        this.rightarm.addChild(rightarm2);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.7F, -0.9F, -4.075F);
        this.rightarm2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.5236F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 52, 57, -1.0F, -1.4295F, 2.2158F, 1, 4, 2, 0.0F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(0.025F, 2.8F, -2.7F);
        this.rightarm2.addChild(rightarm3);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.325F, 1.0F, 2.45F);
        this.rightarm3.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.3927F, -0.1222F, -0.3491F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 24, 60, -0.4885F, -0.1462F, -3.4341F, 1, 2, 2, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.3628F, 2.0269F);
        this.Root.addChild(Tail);
        this.setRotateAngle(Tail, 0.1309F, 0.0F, 0.0F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -0.6F, -0.25F);
        this.Tail.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.3491F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 15, -2.0F, -1.1557F, 0.1332F, 4, 5, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 2.0F, 5.0F);
        this.Tail.addChild(Tail2);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -0.325F, 0.55F);
        this.Tail2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.3054F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 35, -1.5F, -1.1806F, -0.9506F, 3, 4, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 1.35F, 4.7F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -0.0436F, 0.0481F);
        this.Tail3.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.1745F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 36, 35, -1.0F, -1.0586F, -0.5801F, 2, 3, 6, 0.001F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.8564F, 5.0981F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1309F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 20, 25, -1.0F, -0.7436F, -0.0519F, 2, 2, 8, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.4564F, 8.4981F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 20, 15, -0.5F, -1.0F, -1.0F, 1, 1, 9, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.0F, -1.1378F, -0.5981F);
        this.Root.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.2618F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 40, 10, -1.0F, -1.0F, -2.0F, 3, 6, 4, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.75F, 4.825F, -1.875F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.9599F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 20, 51, -1.0F, 0.0F, -0.2F, 2, 7, 2, 0.001F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 6.975F, 1.775F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -1.0036F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 28, 51, -1.0F, -0.025F, -1.225F, 2, 4, 1, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 3.825F, -0.225F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.3491F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 40, 30, -1.5F, -0.6855F, -3.9673F, 3, 1, 4, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.0F, -1.1378F, -0.5981F);
        this.Root.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.2618F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 40, 10, -2.0F, -1.0F, -2.0F, 3, 6, 4, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.75F, 4.825F, -1.875F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.9599F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 20, 51, -1.0F, 0.0F, -0.2F, 2, 7, 2, 0.001F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 6.975F, 1.775F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -1.0036F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 28, 51, -1.0F, -0.025F, -1.225F, 2, 4, 1, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 3.825F, -0.225F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.3491F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 40, 30, -1.5F, -0.6855F, -3.9673F, 3, 1, 4, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = 0.5F;
        this.Root.offsetX = 0.75F;
        this.Root.offsetZ = 0.7F;
        this.Root.rotateAngleY = (float)Math.toRadians(225);
        this.Root.rotateAngleX = (float)Math.toRadians(14);
        this.Root.rotateAngleZ = (float)Math.toRadians(-8);
        this.Root.scaleChildren = true;
        float scaler = 0.55F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetY = -0.054F;
        this.Root.render(0.01F);
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

        EntityPrehistoricFloraChangchunsaurus EntityChangchunsaurus = (EntityPrehistoricFloraChangchunsaurus) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        EntityChangchunsaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityChangchunsaurus.getAnimation() == EntityChangchunsaurus.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityChangchunsaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityChangchunsaurus.getIsMoving()) {
                    if (EntityChangchunsaurus.getAnimation() != EntityChangchunsaurus.EAT_ANIMATION
                        && EntityChangchunsaurus.getAnimation() != EntityChangchunsaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityChangchunsaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraChangchunsaurus ee = (EntityPrehistoricFloraChangchunsaurus) entitylivingbaseIn;

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
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The noise anim
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChangchunsaurus entity = (EntityPrehistoricFloraChangchunsaurus) entitylivingbaseIn;
        int animCycle = 125;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = -30.25 + (((tickAnim - 31) / 55) * (-30.25-(-30.25)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = -30.25 + (((tickAnim - 86) / 39) * (0-(-30.25)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = -59.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-95))*-60 + (((tickAnim - 0) / 31) * (137.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*150-(-59.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-95))*-60)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 47) {
            xx = 137.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*150 + (((tickAnim - 31) / 16) * (14.555-(137.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*150)));
            yy = 0 + (((tickAnim - 31) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 16) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = 14.555 + (((tickAnim - 47) / 23) * (-28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-95))*-50-(14.555)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 23) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = -28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-95))*-50 + (((tickAnim - 70) / 16) * (-1.87-(-28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-95))*-50)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = -1.87 + (((tickAnim - 86) / 39) * (0-(-1.87)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 0) / 70) * (-8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = -8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 70) / 16) * (-10.5-(-8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = -10.5 + (((tickAnim - 86) / 39) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.3-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 24) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 46) * (0-(0)));
            zz = 0.3 + (((tickAnim - 24) / 46) * (0-(0.3)));
        }
        else if (tickAnim >= 70 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 70) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 47) {
            xx = -15.25 + (((tickAnim - 31) / 16) * (-43.71-(-15.25)));
            yy = 0 + (((tickAnim - 31) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 16) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = -43.71 + (((tickAnim - 47) / 23) * (-15.25-(-43.71)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 23) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = -15.25 + (((tickAnim - 70) / 16) * (-16.96-(-15.25)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = -16.96 + (((tickAnim - 86) / 39) * (0-(-16.96)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (-1.2-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 47) / 39) * (0-(0)));
            yy = 0.925 + (((tickAnim - 47) / 39) * (0-(0.925)));
            zz = -1.2 + (((tickAnim - 47) / 39) * (0-(-1.2)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(xx);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(yy);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 70) {
            xx = 29.25 + (((tickAnim - 31) / 39) * (21.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*20-(29.25)));
            yy = 0 + (((tickAnim - 31) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 39) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 21.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*20 + (((tickAnim - 70) / 35) * (-0.46+Math.sin((Math.PI/180)*(((double)tickAnim/20)*154))*20-(21.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*20)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = -0.46+Math.sin((Math.PI/180)*(((double)tickAnim/20)*154))*20 + (((tickAnim - 105) / 20) * (0-(-0.46+Math.sin((Math.PI/180)*(((double)tickAnim/20)*154))*20)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-1.475-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = -1.475 + (((tickAnim - 31) / 12) * (-1.07-(-1.475)));
        }
        else if (tickAnim >= 43 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 43) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 21) * (-0.375-(0)));
            zz = -1.07 + (((tickAnim - 43) / 21) * (-1.39-(-1.07)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            yy = -0.375 + (((tickAnim - 64) / 6) * (0-(-0.375)));
            zz = -1.39 + (((tickAnim - 64) / 6) * (-1.475-(-1.39)));
        }
        else if (tickAnim >= 70 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 70) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 13) * (0-(0)));
            zz = -1.475 + (((tickAnim - 70) / 13) * (0.32-(-1.475)));
        }
        else if (tickAnim >= 83 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 83) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 42) * (0-(0)));
            zz = 0.32 + (((tickAnim - 83) / 42) * (0-(0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-46.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*200-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = -46.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*200 + (((tickAnim - 13) / 34) * (-3.04-(-46.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*200)));
            yy = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = -3.04 + (((tickAnim - 47) / 23) * (33.25-(-3.04)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 23) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = 33.25 + (((tickAnim - 70) / 16) * (-3.04-(33.25)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 94) {
            xx = -3.04 + (((tickAnim - 86) / 8) * (18.37-(-3.04)));
            yy = 0 + (((tickAnim - 86) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 8) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = 18.37 + (((tickAnim - 94) / 31) * (0-(18.37)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(0);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(0);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 47) {
            xx = 16 + (((tickAnim - 31) / 16) * (40.33-(16)));
            yy = 0 + (((tickAnim - 31) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 16) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = 40.33 + (((tickAnim - 47) / 23) * (16-(40.33)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 23) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = 16 + (((tickAnim - 70) / 16) * (40.33-(16)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 94) {
            xx = 40.33 + (((tickAnim - 86) / 8) * (28.09-(40.33)));
            yy = 0 + (((tickAnim - 86) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 8) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = 28.09 + (((tickAnim - 94) / 31) * (0-(28.09)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 31 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 31) / 16) * (21.5-(0)));
            yy = 0 + (((tickAnim - 31) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 16) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 55) {
            xx = 21.5 + (((tickAnim - 47) / 8) * (0-(21.5)));
            yy = 0 + (((tickAnim - 47) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 8) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 70) / 16) * (21.5-(0)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 94) {
            xx = 21.5 + (((tickAnim - 86) / 8) * (0-(21.5)));
            yy = 0 + (((tickAnim - 86) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 0) / 31) * (51.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 70) {
            xx = 51.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 31) / 39) * (51.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5-(51.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            yy = 0 + (((tickAnim - 31) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 39) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 125) {
            xx = 51.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 70) / 55) * (0-(51.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            yy = 0 + (((tickAnim - 70) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather, feather.rotateAngleX + (float) Math.toRadians(xx), feather.rotateAngleY + (float) Math.toRadians(yy), feather.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 0) / 16) * (-39.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (-48.36035-(0)));
            yy = -39.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 16) / 8) * (-54.2181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(-39.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            zz = 0 + (((tickAnim - 16) / 8) * (56.02556-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = -48.36035 + (((tickAnim - 24) / 7) * (0-(-48.36035)));
            yy = -54.2181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 24) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(-54.2181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            zz = 56.02556 + (((tickAnim - 24) / 7) * (0-(56.02556)));
        }
        else if (tickAnim >= 31 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 31) / 39) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 31) / 39) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            zz = 0 + (((tickAnim - 31) / 39) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 70) / 24) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 70) / 24) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            zz = 0 + (((tickAnim - 70) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather2, feather2.rotateAngleX + (float) Math.toRadians(xx), feather2.rotateAngleY + (float) Math.toRadians(yy), feather2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-1.675-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 70) {
            xx = -0.175 + (((tickAnim - 31) / 39) * (-0.175-(-0.175)));
            yy = 0.4 + (((tickAnim - 31) / 39) * (0.4-(0.4)));
            zz = -1.675 + (((tickAnim - 31) / 39) * (-1.675-(-1.675)));
        }
        else if (tickAnim >= 70 && tickAnim < 125) {
            xx = -0.175 + (((tickAnim - 70) / 55) * (0-(-0.175)));
            yy = 0.4 + (((tickAnim - 70) / 55) * (0-(0.4)));
            zz = -1.675 + (((tickAnim - 70) / 55) * (0-(-1.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feather2.rotationPointX = this.feather2.rotationPointX + (float)(xx);
        this.feather2.rotationPointY = this.feather2.rotationPointY - (float)(yy);
        this.feather2.rotationPointZ = this.feather2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 0) / 16) * (29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (-30.24602-(0)));
            yy = 29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 16) / 8) * (50.8598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5-(29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            zz = 0 + (((tickAnim - 16) / 8) * (-39.06408-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = -30.24602 + (((tickAnim - 24) / 7) * (0-(-30.24602)));
            yy = 50.8598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 24) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5-(50.8598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            zz = -39.06408 + (((tickAnim - 24) / 7) * (0-(-39.06408)));
        }
        else if (tickAnim >= 31 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 31) / 39) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 31) / 39) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            zz = 0 + (((tickAnim - 31) / 39) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 70) / 24) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 70) / 24) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            zz = 0 + (((tickAnim - 70) / 24) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather3, feather3.rotateAngleX + (float) Math.toRadians(xx), feather3.rotateAngleY + (float) Math.toRadians(yy), feather3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-1.675-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 70) {
            xx = -0.175 + (((tickAnim - 31) / 39) * (-0.175-(-0.175)));
            yy = 0.4 + (((tickAnim - 31) / 39) * (0.4-(0.4)));
            zz = -1.675 + (((tickAnim - 31) / 39) * (-1.675-(-1.675)));
        }
        else if (tickAnim >= 70 && tickAnim < 125) {
            xx = -0.175 + (((tickAnim - 70) / 55) * (0-(-0.175)));
            yy = 0.4 + (((tickAnim - 70) / 55) * (0-(0.4)));
            zz = -1.675 + (((tickAnim - 70) / 55) * (0-(-1.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feather3.rotationPointX = this.feather3.rotationPointX + (float)(xx);
        this.feather3.rotationPointY = this.feather3.rotationPointY - (float)(yy);
        this.feather3.rotationPointZ = this.feather3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (29.64012-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (-13.4514-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (23.09384-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 125) {
            xx = 29.64012 + (((tickAnim - 31) / 94) * (0-(29.64012)));
            yy = -13.4514 + (((tickAnim - 31) / 94) * (0-(-13.4514)));
            zz = 23.09384 + (((tickAnim - 31) / 94) * (0-(23.09384)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (29.64012-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (13.4514-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-23.09384-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 125) {
            xx = 29.64012 + (((tickAnim - 31) / 94) * (0-(29.64012)));
            yy = 13.4514 + (((tickAnim - 31) / 94) * (0-(13.4514)));
            zz = -23.09384 + (((tickAnim - 31) / 94) * (0-(-23.09384)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(0);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(0);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (2.50519-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (-0.75889-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-2.20776-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 125) {
            xx = 2.50519 + (((tickAnim - 31) / 94) * (0-(2.50519)));
            yy = -0.75889 + (((tickAnim - 31) / 94) * (0-(-0.75889)));
            zz = -2.20776 + (((tickAnim - 31) / 94) * (0-(-2.20776)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(0);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(0);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = 11.25 + (((tickAnim - 31) / 55) * (7.5-(11.25)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = 7.5 + (((tickAnim - 86) / 39) * (0-(7.5)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = 13.75 + (((tickAnim - 31) / 55) * (13.83-(13.75)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 107) {
            xx = 13.83 + (((tickAnim - 86) / 21) * (-1.78-(13.83)));
            yy = 0 + (((tickAnim - 86) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 21) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 125) {
            xx = -1.78 + (((tickAnim - 107) / 18) * (0-(-1.78)));
            yy = 0 + (((tickAnim - 107) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = 10 + (((tickAnim - 31) / 55) * (15.08-(10)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 107) {
            xx = 15.08 + (((tickAnim - 86) / 21) * (1.31-(15.08)));
            yy = 0 + (((tickAnim - 86) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 21) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 125) {
            xx = 1.31 + (((tickAnim - 107) / 18) * (0-(1.31)));
            yy = 0 + (((tickAnim - 107) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = 5.25 + (((tickAnim - 31) / 55) * (12.25-(5.25)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 107) {
            xx = 12.25 + (((tickAnim - 86) / 21) * (-1.77-(12.25)));
            yy = 0 + (((tickAnim - 86) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 21) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = -1.77 + (((tickAnim - 107) / 8) * (-5.47-(-1.77)));
            yy = 0 + (((tickAnim - 107) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 8) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -5.47 + (((tickAnim - 115) / 10) * (0-(-5.47)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = -2 + (((tickAnim - 31) / 55) * (19.08-(-2)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 107) {
            xx = 19.08 + (((tickAnim - 86) / 21) * (3.93-(19.08)));
            yy = 0 + (((tickAnim - 86) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 21) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = 3.93 + (((tickAnim - 107) / 8) * (-9.86-(3.93)));
            yy = 0 + (((tickAnim - 107) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 8) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = -9.86 + (((tickAnim - 115) / 5) * (-13.93-(-9.86)));
            yy = 0 + (((tickAnim - 115) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 5) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = -13.93 + (((tickAnim - 120) / 5) * (0-(-13.93)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = 23.75 + (((tickAnim - 31) / 55) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = 23.75 + (((tickAnim - 86) / 39) * (0-(23.75)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (2.87-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = 2.87 + (((tickAnim - 31) / 55) * (2.87-(2.87)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = 2.87 + (((tickAnim - 86) / 39) * (0-(2.87)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = 7.5 + (((tickAnim - 31) / 55) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = 7.5 + (((tickAnim - 86) / 39) * (0-(7.5)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = -3.49 + (((tickAnim - 31) / 55) * (-3.49-(-3.49)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = -3.49 + (((tickAnim - 86) / 39) * (0-(-3.49)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            yy = -0.15 + (((tickAnim - 31) / 55) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            yy = -0.15 + (((tickAnim - 86) / 39) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 86) {
            xx = 23.75 + (((tickAnim - 31) / 55) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 31) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 55) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = 23.75 + (((tickAnim - 86) / 39) * (0-(23.75)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (2.87-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 93) {
            xx = 2.87 + (((tickAnim - 31) / 62) * (2.87-(2.87)));
            yy = 0 + (((tickAnim - 31) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 62) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 2.87 + (((tickAnim - 93) / 32) * (0-(2.87)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 93) {
            xx = 7.5 + (((tickAnim - 31) / 62) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 31) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 62) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 7.5 + (((tickAnim - 93) / 32) * (0-(7.5)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 93) {
            xx = -3.49 + (((tickAnim - 31) / 62) * (-3.49-(-3.49)));
            yy = 0 + (((tickAnim - 31) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 62) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = -3.49 + (((tickAnim - 93) / 32) * (0-(-3.49)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 31) / 62) * (0-(0)));
            yy = -0.15 + (((tickAnim - 31) / 62) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 31) / 62) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            yy = -0.15 + (((tickAnim - 93) / 32) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-57-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 47) {
            xx = -57 + (((tickAnim - 31) / 16) * (-75.04-(-57)));
            yy = 0 + (((tickAnim - 31) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 16) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = -75.04 + (((tickAnim - 47) / 23) * (-56.5-(-75.04)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 23) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = -56.5 + (((tickAnim - 70) / 16) * (-59.79-(-56.5)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 125) {
            xx = -59.79 + (((tickAnim - 86) / 39) * (0-(-59.79)));
            yy = 0 + (((tickAnim - 86) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChangchunsaurus entity = (EntityPrehistoricFloraChangchunsaurus) entitylivingbaseIn;
        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -9.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 40) / 1) * (15-(-9.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 70) {
            xx = 15 + (((tickAnim - 41) / 29) * (15-(15)));
            yy = 0 + (((tickAnim - 41) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 29) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 15 + (((tickAnim - 70) / 20) * (-0.25-(15)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = -0.25 + (((tickAnim - 90) / 20) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = -0.25 + (((tickAnim - 110) / 20) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 20) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -0.25 + (((tickAnim - 130) / 15) * (15-(-0.25)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 15 + (((tickAnim - 145) / 30) * (15-(15)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 15 + (((tickAnim - 175) / 25) * (0-(15)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (-3.575-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = -3.575 + (((tickAnim - 90) / 20) * (-3.575-(-3.575)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = -3.575 + (((tickAnim - 110) / 20) * (-3.575-(-3.575)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = -3.575 + (((tickAnim - 130) / 15) * (-3.575-(-3.575)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = -3.575 + (((tickAnim - 145) / 30) * (-3.575-(-3.575)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = -3.575 + (((tickAnim - 175) / 25) * (0-(-3.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(xx);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(yy);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-25.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+5))*30-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -25.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+5))*30 + (((tickAnim - 40) / 1) * (3.25-(-25.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+5))*30)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 70) {
            xx = 3.25 + (((tickAnim - 41) / 29) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 41) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 29) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 3.25 + (((tickAnim - 70) / 20) * (-8.25-(3.25)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -8.25 + (((tickAnim - 90) / 10) * (1.5-(-8.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 1.5 + (((tickAnim - 100) / 10) * (-8.25-(1.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -8.25 + (((tickAnim - 110) / 10) * (1.5-(-8.25)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 1.5 + (((tickAnim - 120) / 10) * (-8.25-(1.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -8.25 + (((tickAnim - 130) / 15) * (3.25-(-8.25)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 3.25 + (((tickAnim - 145) / 30) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 176) {
            xx = 3.25 + (((tickAnim - 175) / 1) * (-16.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+5))*20-(3.25)));
            yy = 0 + (((tickAnim - 175) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 1) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 200) {
            xx = -16.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+5))*20 + (((tickAnim - 176) / 24) * (0-(-16.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+5))*20)));
            yy = 0 + (((tickAnim - 176) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 7 + (((tickAnim - 40) / 30) * (7-(7)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 100) {
            xx = 7 + (((tickAnim - 70) / 30) * (-5.75-(7)));
            yy = 0 + (((tickAnim - 70) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 30) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -5.75 + (((tickAnim - 100) / 20) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = -5.75 + (((tickAnim - 120) / 25) * (8.25-(-5.75)));
            yy = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 25) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 8.25 + (((tickAnim - 145) / 30) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 8.25 + (((tickAnim - 175) / 25) * (0-(8.25)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 0) / 145) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 145) * (0.55-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0.55 + (((tickAnim - 145) / 30) * (0.55-(0.55)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0.55 + (((tickAnim - 175) / 25) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 40) / 10) * (1.75-(-10.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 1.75 + (((tickAnim - 50) / 5) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(1.75)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 55) / 10) * (4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 65) / 5) * (-8.5-(4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -8.5 + (((tickAnim - 70) / 20) * (1.6219-(-8.5)));
            yy = 0 + (((tickAnim - 70) / 20) * (-11.38658-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (-8.16171-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 1.6219 + (((tickAnim - 90) / 10) * (-15.8781-(1.6219)));
            yy = -11.38658 + (((tickAnim - 90) / 10) * (-11.38658-(-11.38658)));
            zz = -8.16171 + (((tickAnim - 90) / 10) * (-8.16171-(-8.16171)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -15.8781 + (((tickAnim - 100) / 10) * (1.6219-(-15.8781)));
            yy = -11.38658 + (((tickAnim - 100) / 10) * (-11.38658-(-11.38658)));
            zz = -8.16171 + (((tickAnim - 100) / 10) * (-8.16171-(-8.16171)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 1.6219 + (((tickAnim - 110) / 10) * (-15.8781-(1.6219)));
            yy = -11.38658 + (((tickAnim - 110) / 10) * (-11.38658-(-11.38658)));
            zz = -8.16171 + (((tickAnim - 110) / 10) * (-8.16171-(-8.16171)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -15.8781 + (((tickAnim - 120) / 10) * (10.1219-(-15.8781)));
            yy = -11.38658 + (((tickAnim - 120) / 10) * (-11.38658-(-11.38658)));
            zz = -8.16171 + (((tickAnim - 120) / 10) * (-8.16171-(-8.16171)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 10.1219 + (((tickAnim - 130) / 15) * (-10.25-(10.1219)));
            yy = -11.38658 + (((tickAnim - 130) / 15) * (0-(-11.38658)));
            zz = -8.16171 + (((tickAnim - 130) / 15) * (0-(-8.16171)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = -10.25 + (((tickAnim - 145) / 10) * (1.75-(-10.25)));
            yy = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 10) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 160) {
            xx = 1.75 + (((tickAnim - 155) / 5) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(1.75)));
            yy = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 5) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 160) / 10) * (-12.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 175) {
            xx = -12.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 170) / 5) * (-8.5-(-12.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 170) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 5) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -8.5 + (((tickAnim - 175) / 25) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0.325-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 0.325 + (((tickAnim - 90) / 20) * (0.325-(0.325)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 0.325 + (((tickAnim - 110) / 20) * (0.325-(0.325)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 20) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 175) {
            xx = 0.325 + (((tickAnim - 130) / 45) * (0-(0.325)));
            yy = 0 + (((tickAnim - 130) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 45) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(xx);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(yy);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 40) / 10) * (24.75-(3.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 24.75 + (((tickAnim - 50) / 5) * (22.75-(24.75)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 22.75 + (((tickAnim - 55) / 5) * (24.75-(22.75)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 24.75 + (((tickAnim - 60) / 5) * (22.75-(24.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 22.75 + (((tickAnim - 65) / 5) * (15.75-(22.75)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 15.75 + (((tickAnim - 70) / 20) * (52.26122-(15.75)));
            yy = 0 + (((tickAnim - 70) / 20) * (12.0726-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (-5.84295-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 52.26122 + (((tickAnim - 90) / 10) * (42.26122-(52.26122)));
            yy = 12.0726 + (((tickAnim - 90) / 10) * (12.0726-(12.0726)));
            zz = -5.84295 + (((tickAnim - 90) / 10) * (-5.84295-(-5.84295)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 42.26122 + (((tickAnim - 100) / 10) * (52.26122-(42.26122)));
            yy = 12.0726 + (((tickAnim - 100) / 10) * (12.0726-(12.0726)));
            zz = -5.84295 + (((tickAnim - 100) / 10) * (-5.84295-(-5.84295)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 52.26122 + (((tickAnim - 110) / 10) * (42.26122-(52.26122)));
            yy = 12.0726 + (((tickAnim - 110) / 10) * (12.0726-(12.0726)));
            zz = -5.84295 + (((tickAnim - 110) / 10) * (-5.84295-(-5.84295)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 42.26122 + (((tickAnim - 120) / 10) * (52.26122-(42.26122)));
            yy = 12.0726 + (((tickAnim - 120) / 10) * (12.0726-(12.0726)));
            zz = -5.84295 + (((tickAnim - 120) / 10) * (-5.84295-(-5.84295)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 52.26122 + (((tickAnim - 130) / 15) * (3.25-(52.26122)));
            yy = 12.0726 + (((tickAnim - 130) / 15) * (0-(12.0726)));
            zz = -5.84295 + (((tickAnim - 130) / 15) * (0-(-5.84295)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = 3.25 + (((tickAnim - 145) / 10) * (24.75-(3.25)));
            yy = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 10) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 160) {
            xx = 24.75 + (((tickAnim - 155) / 5) * (22.75-(24.75)));
            yy = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 5) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 165) {
            xx = 22.75 + (((tickAnim - 160) / 5) * (24.75-(22.75)));
            yy = 0 + (((tickAnim - 160) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 5) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = 24.75 + (((tickAnim - 165) / 5) * (22.75-(24.75)));
            yy = 0 + (((tickAnim - 165) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 5) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 175) {
            xx = 22.75 + (((tickAnim - 170) / 5) * (15.75-(22.75)));
            yy = 0 + (((tickAnim - 170) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 5) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 15.75 + (((tickAnim - 175) / 25) * (0-(15.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 40) / 10) * (0-(19)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 3.5 + (((tickAnim - 55) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 3.5 + (((tickAnim - 65) / 5) * (10.75-(3.5)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 10.75 + (((tickAnim - 70) / 20) * (10.69419-(10.75)));
            yy = 0 + (((tickAnim - 70) / 20) * (5.70511-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (-8.01994-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 10.69419 + (((tickAnim - 90) / 20) * (10.69419-(10.69419)));
            yy = 5.70511 + (((tickAnim - 90) / 20) * (5.70511-(5.70511)));
            zz = -8.01994 + (((tickAnim - 90) / 20) * (-8.01994-(-8.01994)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 10.69419 + (((tickAnim - 110) / 20) * (10.69419-(10.69419)));
            yy = 5.70511 + (((tickAnim - 110) / 20) * (5.70511-(5.70511)));
            zz = -8.01994 + (((tickAnim - 110) / 20) * (-8.01994-(-8.01994)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 10.69419 + (((tickAnim - 130) / 15) * (19-(10.69419)));
            yy = 5.70511 + (((tickAnim - 130) / 15) * (0-(5.70511)));
            zz = -8.01994 + (((tickAnim - 130) / 15) * (0-(-8.01994)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = 19 + (((tickAnim - 145) / 10) * (0-(19)));
            yy = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 10) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 155) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 5) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 165) {
            xx = 3.5 + (((tickAnim - 160) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 160) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 5) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 165) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 165) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 5) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 175) {
            xx = 3.5 + (((tickAnim - 170) / 5) * (10.75-(3.5)));
            yy = 0 + (((tickAnim - 170) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 5) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 10.75 + (((tickAnim - 175) / 25) * (0-(10.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 6 + (((tickAnim - 40) / 5) * (-1.75-(6)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 45) / 5) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (7-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 7 + (((tickAnim - 55) / 5) * (0-(7)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (7-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 7 + (((tickAnim - 65) / 5) * (0-(7)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 13.75 + (((tickAnim - 100) / 10) * (0-(13.75)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 13.75 + (((tickAnim - 120) / 10) * (0-(13.75)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (6-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 6 + (((tickAnim - 145) / 5) * (-1.75-(6)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 155) {
            xx = -1.75 + (((tickAnim - 150) / 5) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 150) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 5) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 155) / 5) * (7-(0)));
            yy = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 5) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 165) {
            xx = 7 + (((tickAnim - 160) / 5) * (0-(7)));
            yy = 0 + (((tickAnim - 160) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 5) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 165) / 5) * (7-(0)));
            yy = 0 + (((tickAnim - 165) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 5) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 175) {
            xx = 7 + (((tickAnim - 170) / 5) * (0-(7)));
            yy = 0 + (((tickAnim - 170) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 5) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (17.25-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 17.25 + (((tickAnim - 45) / 5) * (0-(17.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (13.5-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 13.5 + (((tickAnim - 58) / 2) * (0-(13.5)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (13.5-(0)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 13.5 + (((tickAnim - 63) / 2) * (0-(13.5)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 65) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 80) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 145) / 5) * (17.25-(0)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 155) {
            xx = 17.25 + (((tickAnim - 150) / 5) * (0-(17.25)));
            yy = 0 + (((tickAnim - 150) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 5) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 5) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 160) / 3) * (13.5-(0)));
            yy = 0 + (((tickAnim - 160) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 3) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 165) {
            xx = 13.5 + (((tickAnim - 163) / 2) * (0-(13.5)));
            yy = 0 + (((tickAnim - 163) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 2) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 165) / 3) * (13.5-(0)));
            yy = 0 + (((tickAnim - 165) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 3) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 170) {
            xx = 13.5 + (((tickAnim - 168) / 2) * (0-(13.5)));
            yy = 0 + (((tickAnim - 168) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 2) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 170) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -35.75 + (((tickAnim - 40) / 105) * (-35.75-(-35.75)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -35.75 + (((tickAnim - 145) / 30) * (-35.75-(-35.75)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -35.75 + (((tickAnim - 175) / 25) * (0-(-35.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather, feather.rotateAngleX + (float) Math.toRadians(xx), feather.rotateAngleY + (float) Math.toRadians(yy), feather.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-22.15099-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (27.34288-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-9.11864-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -22.15099 + (((tickAnim - 40) / 105) * (-22.15099-(-22.15099)));
            yy = 27.34288 + (((tickAnim - 40) / 105) * (27.34288-(27.34288)));
            zz = -9.11864 + (((tickAnim - 40) / 105) * (-9.11864-(-9.11864)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -22.15099 + (((tickAnim - 145) / 30) * (-22.15099-(-22.15099)));
            yy = 27.34288 + (((tickAnim - 145) / 30) * (27.34288-(27.34288)));
            zz = -9.11864 + (((tickAnim - 145) / 30) * (-9.11864-(-9.11864)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -22.15099 + (((tickAnim - 175) / 25) * (0-(-22.15099)));
            yy = 27.34288 + (((tickAnim - 175) / 25) * (0-(27.34288)));
            zz = -9.11864 + (((tickAnim - 175) / 25) * (0-(-9.11864)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather2, feather2.rotateAngleX + (float) Math.toRadians(xx), feather2.rotateAngleY + (float) Math.toRadians(yy), feather2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.075-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -0.3 + (((tickAnim - 40) / 105) * (-0.3-(-0.3)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = -0.075 + (((tickAnim - 40) / 105) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -0.3 + (((tickAnim - 145) / 30) * (-0.3-(-0.3)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = -0.075 + (((tickAnim - 145) / 30) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -0.3 + (((tickAnim - 175) / 25) * (0-(-0.3)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = -0.075 + (((tickAnim - 175) / 25) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feather2.rotationPointX = this.feather2.rotationPointX + (float)(xx);
        this.feather2.rotationPointY = this.feather2.rotationPointY - (float)(yy);
        this.feather2.rotationPointZ = this.feather2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-22.15099-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-27.34288-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (9.11864-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -22.15099 + (((tickAnim - 40) / 105) * (-22.15099-(-22.15099)));
            yy = -27.34288 + (((tickAnim - 40) / 105) * (-27.34288-(-27.34288)));
            zz = 9.11864 + (((tickAnim - 40) / 105) * (9.11864-(9.11864)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -22.15099 + (((tickAnim - 145) / 30) * (-22.15099-(-22.15099)));
            yy = -27.34288 + (((tickAnim - 145) / 30) * (-27.34288-(-27.34288)));
            zz = 9.11864 + (((tickAnim - 145) / 30) * (9.11864-(9.11864)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -22.15099 + (((tickAnim - 175) / 25) * (0-(-22.15099)));
            yy = -27.34288 + (((tickAnim - 175) / 25) * (0-(-27.34288)));
            zz = 9.11864 + (((tickAnim - 175) / 25) * (0-(9.11864)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather3, feather3.rotateAngleX + (float) Math.toRadians(xx), feather3.rotateAngleY + (float) Math.toRadians(yy), feather3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.075-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 0.3 + (((tickAnim - 40) / 105) * (0.3-(0.3)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0.075 + (((tickAnim - 40) / 105) * (0.075-(0.075)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0.3 + (((tickAnim - 145) / 30) * (0.3-(0.3)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0.075 + (((tickAnim - 145) / 30) * (0.075-(0.075)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0.3 + (((tickAnim - 175) / 25) * (0-(0.3)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0.075 + (((tickAnim - 175) / 25) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feather3.rotationPointX = this.feather3.rotationPointX + (float)(xx);
        this.feather3.rotationPointY = this.feather3.rotationPointY - (float)(yy);
        this.feather3.rotationPointZ = this.feather3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 16.5 + (((tickAnim - 40) / 70) * (25.75-(16.5)));
            yy = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 70) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 175) {
            xx = 25.75 + (((tickAnim - 110) / 65) * (25.75-(25.75)));
            yy = 0 + (((tickAnim - 110) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 65) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 25.75 + (((tickAnim - 175) / 25) * (0-(25.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.67418-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.98473-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.63629-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -5.67418 + (((tickAnim - 40) / 105) * (-5.67418-(-5.67418)));
            yy = 0.98473 + (((tickAnim - 40) / 105) * (0.98473-(0.98473)));
            zz = 1.63629 + (((tickAnim - 40) / 105) * (1.63629-(1.63629)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -5.67418 + (((tickAnim - 145) / 30) * (-5.67418-(-5.67418)));
            yy = 0.98473 + (((tickAnim - 145) / 30) * (0.98473-(0.98473)));
            zz = 1.63629 + (((tickAnim - 145) / 30) * (1.63629-(1.63629)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -5.67418 + (((tickAnim - 175) / 25) * (0-(-5.67418)));
            yy = 0.98473 + (((tickAnim - 175) / 25) * (0-(0.98473)));
            zz = 1.63629 + (((tickAnim - 175) / 25) * (0-(1.63629)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 16.5 + (((tickAnim - 40) / 30) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 16.5 + (((tickAnim - 70) / 20) * (25.75-(16.5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 25.75 + (((tickAnim - 90) / 20) * (25.75-(25.75)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 145) {
            xx = 25.75 + (((tickAnim - 110) / 35) * (16.5-(25.75)));
            yy = 0 + (((tickAnim - 110) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 35) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 16.5 + (((tickAnim - 145) / 30) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 16.5 + (((tickAnim - 175) / 25) * (0-(16.5)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.67418-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.98473-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.63629-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = -5.67418 + (((tickAnim - 40) / 70) * (-5.67418-(-5.67418)));
            yy = 0.98473 + (((tickAnim - 40) / 70) * (0.98473-(0.98473)));
            zz = 1.63629 + (((tickAnim - 40) / 70) * (1.63629-(1.63629)));
        }
        else if (tickAnim >= 110 && tickAnim < 145) {
            xx = -5.67418 + (((tickAnim - 110) / 35) * (-37.92418-(-5.67418)));
            yy = 0.98473 + (((tickAnim - 110) / 35) * (0.98473-(0.98473)));
            zz = 1.63629 + (((tickAnim - 110) / 35) * (1.63629-(1.63629)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -37.92418 + (((tickAnim - 145) / 30) * (-37.92418-(-37.92418)));
            yy = 0.98473 + (((tickAnim - 145) / 30) * (0.98473-(0.98473)));
            zz = 1.63629 + (((tickAnim - 145) / 30) * (1.63629-(1.63629)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -37.92418 + (((tickAnim - 175) / 25) * (0-(-37.92418)));
            yy = 0.98473 + (((tickAnim - 175) / 25) * (0-(0.98473)));
            zz = 1.63629 + (((tickAnim - 175) / 25) * (0-(1.63629)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 0) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 110) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 110) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 35) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 110) / 35) * (-0.4-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            yy = -0.95 + (((tickAnim - 145) / 30) * (-0.95-(-0.95)));
            zz = -0.4 + (((tickAnim - 145) / 30) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = -0.95 + (((tickAnim - 175) / 25) * (0-(-0.95)));
            zz = -0.4 + (((tickAnim - 175) / 25) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -0.25 + (((tickAnim - 40) / 30) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -0.25 + (((tickAnim - 70) / 20) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (7.25-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 7.25 + (((tickAnim - 100) / 10) * (0-(7.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (7.25-(0)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 7.25 + (((tickAnim - 120) / 10) * (0-(7.25)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -0.25 + (((tickAnim - 145) / 30) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -0.25 + (((tickAnim - 175) / 25) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -7.5 + (((tickAnim - 40) / 30) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -7.5 + (((tickAnim - 70) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 6.25 + (((tickAnim - 100) / 10) * (0-(6.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 6.25 + (((tickAnim - 120) / 10) * (0-(6.25)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -7.5 + (((tickAnim - 145) / 30) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -7.5 + (((tickAnim - 175) / 25) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -5 + (((tickAnim - 70) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -6.5 + (((tickAnim - 100) / 10) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -6.5 + (((tickAnim - 120) / 10) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -5 + (((tickAnim - 145) / 30) * (-5-(-5)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -5 + (((tickAnim - 175) / 25) * (0-(-5)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -4 + (((tickAnim - 40) / 30) * (-4-(-4)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -4 + (((tickAnim - 70) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = -10.25 + (((tickAnim - 100) / 5) * (3.17-(-10.25)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 3.17 + (((tickAnim - 105) / 5) * (0-(3.17)));
            yy = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 5) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = -10.25 + (((tickAnim - 120) / 5) * (3.17-(-10.25)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 3.17 + (((tickAnim - 125) / 5) * (0-(3.17)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (-4-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -4 + (((tickAnim - 145) / 30) * (-4-(-4)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -4 + (((tickAnim - 175) / 25) * (0-(-4)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -6.25 + (((tickAnim - 40) / 30) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -6.25 + (((tickAnim - 70) / 20) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (-16-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = -16 + (((tickAnim - 100) / 5) * (6-(-16)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 6 + (((tickAnim - 105) / 5) * (0-(6)));
            yy = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 5) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (-16-(0)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = -16 + (((tickAnim - 120) / 5) * (6-(-16)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 6 + (((tickAnim - 125) / 5) * (0-(6)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -6.25 + (((tickAnim - 145) / 30) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -6.25 + (((tickAnim - 175) / 25) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (12.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 12.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25 + (((tickAnim - 40) / 1) * (-12.5-(12.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 70) {
            xx = -12.5 + (((tickAnim - 41) / 29) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 41) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 29) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -12.5 + (((tickAnim - 70) / 10) * (6.75-(-12.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 6.75 + (((tickAnim - 80) / 10) * (20.25-(6.75)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = 20.25 + (((tickAnim - 90) / 40) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 138) {
            xx = 20.25 + (((tickAnim - 130) / 8) * (-16.37-(20.25)));
            yy = 0 + (((tickAnim - 130) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 8) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 145) {
            xx = -16.37 + (((tickAnim - 138) / 7) * (-9.75-(-16.37)));
            yy = 0 + (((tickAnim - 138) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 7) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -9.75 + (((tickAnim - 145) / 30) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -9.75 + (((tickAnim - 175) / 13) * (-19.3-(-9.75)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -19.3 + (((tickAnim - 188) / 12) * (0-(-19.3)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (-5.62-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -5.62 + (((tickAnim - 80) / 10) * (-2.25-(-5.62)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = -2.25 + (((tickAnim - 90) / 40) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 138) {
            xx = -2.25 + (((tickAnim - 130) / 8) * (25.88-(-2.25)));
            yy = 0 + (((tickAnim - 130) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 8) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 145) {
            xx = 25.88 + (((tickAnim - 138) / 7) * (-4.5-(25.88)));
            yy = 0 + (((tickAnim - 138) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 7) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -4.5 + (((tickAnim - 145) / 30) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -4.5 + (((tickAnim - 175) / 13) * (5.65-(-4.5)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 5.65 + (((tickAnim - 188) / 6) * (32.07-(5.65)));
            yy = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 32.07 + (((tickAnim - 194) / 6) * (0-(32.07)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.75 + (((tickAnim - 40) / 30) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -2.75 + (((tickAnim - 70) / 20) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 130) / 8) * (-28.87-(0)));
            yy = 0 + (((tickAnim - 130) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 8) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 145) {
            xx = -28.87 + (((tickAnim - 138) / 7) * (-2.75-(-28.87)));
            yy = 0 + (((tickAnim - 138) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 7) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -2.75 + (((tickAnim - 145) / 30) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -2.75 + (((tickAnim - 175) / 13) * (1.97-(-2.75)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 1.97 + (((tickAnim - 188) / 6) * (-19.27-(1.97)));
            yy = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = -19.27 + (((tickAnim - 194) / 6) * (0-(-19.27)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            yy = -0.325 + (((tickAnim - 90) / 40) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            yy = -0.325 + (((tickAnim - 130) / 15) * (-0.17-(-0.325)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            yy = -0.17 + (((tickAnim - 145) / 30) * (-0.17-(-0.17)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            yy = -0.17 + (((tickAnim - 175) / 13) * (0-(-0.17)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 6) * (-0.29-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            yy = -0.29 + (((tickAnim - 194) / 6) * (0-(-0.29)));
            zz = 0 + (((tickAnim - 194) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (-17-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = -17 + (((tickAnim - 90) / 40) * (-17-(-17)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 138) {
            xx = -17 + (((tickAnim - 130) / 8) * (81.92-(-17)));
            yy = 0 + (((tickAnim - 130) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 8) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 145) {
            xx = 81.92 + (((tickAnim - 138) / 7) * (0.83-(81.92)));
            yy = 0 + (((tickAnim - 138) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 7) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0.83 + (((tickAnim - 145) / 30) * (0.83-(0.83)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0.83 + (((tickAnim - 175) / 13) * (5.64-(0.83)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 5.64 + (((tickAnim - 188) / 6) * (75.32-(5.64)));
            yy = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 75.32 + (((tickAnim - 194) / 6) * (0-(75.32)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0.025-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (-0.21-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0.025 + (((tickAnim - 80) / 10) * (-0.7-(0.025)));
            zz = -0.21 + (((tickAnim - 80) / 10) * (0-(-0.21)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            yy = -0.7 + (((tickAnim - 90) / 40) * (-0.7-(-0.7)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 130) / 8) * (0-(0)));
            yy = -0.7 + (((tickAnim - 130) / 8) * (1.8-(-0.7)));
            zz = 0 + (((tickAnim - 130) / 8) * (-0.225-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 138) / 7) * (0-(0)));
            yy = 1.8 + (((tickAnim - 138) / 7) * (0.325-(1.8)));
            zz = -0.225 + (((tickAnim - 138) / 7) * (0-(-0.225)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            yy = 0.325 + (((tickAnim - 145) / 30) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            yy = 0.325 + (((tickAnim - 175) / 13) * (-0.125-(0.325)));
            zz = 0 + (((tickAnim - 175) / 13) * (0.25-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            yy = -0.125 + (((tickAnim - 188) / 6) * (1.925-(-0.125)));
            zz = 0.25 + (((tickAnim - 188) / 6) * (0-(0.25)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            yy = 1.925 + (((tickAnim - 194) / 6) * (0-(1.925)));
            zz = 0 + (((tickAnim - 194) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (12.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 12.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25 + (((tickAnim - 40) / 1) * (-12.5-(12.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 70) {
            xx = -12.5 + (((tickAnim - 41) / 29) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 41) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 29) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -12.5 + (((tickAnim - 70) / 20) * (-28.75-(-12.5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -28.75 + (((tickAnim - 90) / 10) * (25.5-(-28.75)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 25.5 + (((tickAnim - 100) / 10) * (-28.75-(25.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -28.75 + (((tickAnim - 110) / 10) * (25.5-(-28.75)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 25.5 + (((tickAnim - 120) / 10) * (-28.75-(25.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -28.75 + (((tickAnim - 130) / 15) * (-31.25-(-28.75)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -31.25 + (((tickAnim - 145) / 30) * (-31.25-(-31.25)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -31.25 + (((tickAnim - 175) / 13) * (9.99-(-31.25)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 9.99 + (((tickAnim - 188) / 12) * (0-(9.99)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 70) / 6) * (24.36-(0)));
            yy = 0 + (((tickAnim - 70) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 6) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 24.36 + (((tickAnim - 76) / 14) * (-10.75-(24.36)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -10.75 + (((tickAnim - 90) / 10) * (14-(-10.75)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = 14 + (((tickAnim - 100) / 5) * (18.63-(14)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 18.63 + (((tickAnim - 105) / 5) * (-10.75-(18.63)));
            yy = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 5) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -10.75 + (((tickAnim - 110) / 10) * (14-(-10.75)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 14 + (((tickAnim - 120) / 5) * (18.63-(14)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 18.63 + (((tickAnim - 125) / 5) * (-10.75-(18.63)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -10.75 + (((tickAnim - 130) / 15) * (-20.25-(-10.75)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = -20.25 + (((tickAnim - 145) / 30) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = -20.25 + (((tickAnim - 175) / 7) * (33.46-(-20.25)));
            yy = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 33.46 + (((tickAnim - 182) / 6) * (-0.84-(33.46)));
            yy = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 6) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -0.84 + (((tickAnim - 188) / 12) * (0-(-0.84)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.75 + (((tickAnim - 40) / 30) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = -2.75 + (((tickAnim - 70) / 8) * (-33.58-(-2.75)));
            yy = 0 + (((tickAnim - 70) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 8) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -33.58 + (((tickAnim - 78) / 5) * (-33.58-(-33.58)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -33.58 + (((tickAnim - 83) / 7) * (25.25-(-33.58)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 25.25 + (((tickAnim - 90) / 10) * (0-(25.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 100) / 5) * (-36.12-(0)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = -36.12 + (((tickAnim - 105) / 3) * (-36.12-(-36.12)));
            yy = 0 + (((tickAnim - 105) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 3) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = -36.12 + (((tickAnim - 108) / 2) * (25.25-(-36.12)));
            yy = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 2) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 25.25 + (((tickAnim - 110) / 10) * (0-(25.25)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 120) / 5) * (-36.12-(0)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = -36.12 + (((tickAnim - 125) / 3) * (-36.12-(-36.12)));
            yy = 0 + (((tickAnim - 125) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 3) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = -36.12 + (((tickAnim - 128) / 2) * (25.25-(-36.12)));
            yy = 0 + (((tickAnim - 128) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 2) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 25.25 + (((tickAnim - 130) / 15) * (0.5-(25.25)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0.5 + (((tickAnim - 145) / 30) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = 0.5 + (((tickAnim - 175) / 7) * (-26.36733-(0.5)));
            yy = 0 + (((tickAnim - 175) / 7) * (-2.01744-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (2.31336-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = -26.36733 + (((tickAnim - 182) / 6) * (-13.75-(-26.36733)));
            yy = -2.01744 + (((tickAnim - 182) / 6) * (0-(-2.01744)));
            zz = 2.31336 + (((tickAnim - 182) / 6) * (0-(2.31336)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -13.75 + (((tickAnim - 188) / 12) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 70) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 8) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 70) / 8) * (-0.175-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 78) / 5) * (-0.35-(-0.35)));
            zz = -0.175 + (((tickAnim - 78) / 5) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            yy = -0.35 + (((tickAnim - 83) / 7) * (0-(-0.35)));
            zz = -0.175 + (((tickAnim - 83) / 7) * (0-(-0.175)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (-0.225-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 105) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 105) / 3) * (-0.5-(-0.5)));
            zz = -0.225 + (((tickAnim - 105) / 3) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 108) / 2) * (0-(-0.5)));
            zz = -0.225 + (((tickAnim - 108) / 2) * (0-(-0.225)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (-0.225-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 125) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 125) / 3) * (-0.5-(-0.5)));
            zz = -0.225 + (((tickAnim - 125) / 3) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 128) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 128) / 2) * (0-(-0.5)));
            zz = -0.225 + (((tickAnim - 128) / 2) * (0-(-0.225)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (-0.17-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            yy = -0.17 + (((tickAnim - 145) / 30) * (-0.17-(-0.17)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            yy = -0.17 + (((tickAnim - 175) / 13) * (-0.255-(-0.17)));
            zz = 0 + (((tickAnim - 175) / 13) * (-0.175-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = -0.255 + (((tickAnim - 188) / 12) * (0-(-0.255)));
            zz = -0.175 + (((tickAnim - 188) / 12) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (62.76-(0)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 62.76 + (((tickAnim - 73) / 5) * (82.5-(62.76)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 82.5 + (((tickAnim - 78) / 5) * (82.5-(82.5)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 82.5 + (((tickAnim - 83) / 7) * (14.75-(82.5)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 95) {
            xx = 14.75 + (((tickAnim - 90) / 5) * (-12.87-(14.75)));
            yy = 0 + (((tickAnim - 90) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 5) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = -12.87 + (((tickAnim - 95) / 5) * (53.75-(-12.87)));
            yy = 0 + (((tickAnim - 95) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 5) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 102) {
            xx = 53.75 + (((tickAnim - 100) / 2) * (83.96-(53.75)));
            yy = 0 + (((tickAnim - 100) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 2) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 105) {
            xx = 83.96 + (((tickAnim - 102) / 3) * (73.13-(83.96)));
            yy = 0 + (((tickAnim - 102) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 3) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = 73.13 + (((tickAnim - 105) / 3) * (73.13-(73.13)));
            yy = 0 + (((tickAnim - 105) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 3) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 73.13 + (((tickAnim - 108) / 2) * (14.75-(73.13)));
            yy = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 2) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 14.75 + (((tickAnim - 110) / 5) * (-12.87-(14.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = -12.87 + (((tickAnim - 115) / 5) * (53.75-(-12.87)));
            yy = 0 + (((tickAnim - 115) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 5) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 122) {
            xx = 53.75 + (((tickAnim - 120) / 2) * (83.96-(53.75)));
            yy = 0 + (((tickAnim - 120) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 2) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 125) {
            xx = 83.96 + (((tickAnim - 122) / 3) * (73.13-(83.96)));
            yy = 0 + (((tickAnim - 122) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 3) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = 73.13 + (((tickAnim - 125) / 3) * (73.13-(73.13)));
            yy = 0 + (((tickAnim - 125) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 3) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = 73.13 + (((tickAnim - 128) / 2) * (14.75-(73.13)));
            yy = 0 + (((tickAnim - 128) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 2) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 14.75 + (((tickAnim - 130) / 15) * (37.33-(14.75)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 37.33 + (((tickAnim - 145) / 30) * (37.33-(37.33)));
            yy = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = 37.33 + (((tickAnim - 175) / 7) * (82.77-(37.33)));
            yy = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 82.77 + (((tickAnim - 182) / 6) * (-3.28-(82.77)));
            yy = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 6) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -3.28 + (((tickAnim - 188) / 12) * (0-(-3.28)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 70) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 8) * (2.025-(0)));
            zz = 0 + (((tickAnim - 70) / 8) * (-0.325-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            yy = 2.025 + (((tickAnim - 78) / 5) * (2.025-(2.025)));
            zz = -0.325 + (((tickAnim - 78) / 5) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            yy = 2.025 + (((tickAnim - 83) / 7) * (0-(2.025)));
            zz = -0.325 + (((tickAnim - 83) / 7) * (0-(-0.325)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 3) * (0.575-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 93) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 93) / 2) * (0-(0.575)));
            zz = 0 + (((tickAnim - 93) / 2) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 95) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 5) * (0.425-(0)));
            zz = 0 + (((tickAnim - 95) / 5) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 100) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 100) / 2) * (1.72-(0.425)));
            zz = 0 + (((tickAnim - 100) / 2) * (-0.24-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 102) / 3) * (0-(0)));
            yy = 1.72 + (((tickAnim - 102) / 3) * (2.05-(1.72)));
            zz = -0.24 + (((tickAnim - 102) / 3) * (-0.275-(-0.24)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 105) / 3) * (0-(0)));
            yy = 2.05 + (((tickAnim - 105) / 3) * (2.05-(2.05)));
            zz = -0.275 + (((tickAnim - 105) / 3) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            yy = 2.05 + (((tickAnim - 108) / 2) * (0-(2.05)));
            zz = -0.275 + (((tickAnim - 108) / 2) * (0-(-0.275)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 3) * (0.575-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 113) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 113) / 2) * (0-(0.575)));
            zz = 0 + (((tickAnim - 113) / 2) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 115) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 5) * (0.425-(0)));
            zz = 0 + (((tickAnim - 115) / 5) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 120) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 120) / 2) * (1.72-(0.425)));
            zz = 0 + (((tickAnim - 120) / 2) * (-0.24-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 122) / 3) * (0-(0)));
            yy = 1.72 + (((tickAnim - 122) / 3) * (2.05-(1.72)));
            zz = -0.24 + (((tickAnim - 122) / 3) * (-0.275-(-0.24)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 125) / 3) * (0-(0)));
            yy = 2.05 + (((tickAnim - 125) / 3) * (2.05-(2.05)));
            zz = -0.275 + (((tickAnim - 125) / 3) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 128) / 2) * (0-(0)));
            yy = 2.05 + (((tickAnim - 128) / 2) * (0-(2.05)));
            zz = -0.275 + (((tickAnim - 128) / 2) * (0-(-0.275)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0.325-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 145) / 30) * (0-(0)));
            yy = 0.325 + (((tickAnim - 145) / 30) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 145) / 30) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 175) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 175) / 3) * (2.04-(0.325)));
            zz = 0 + (((tickAnim - 175) / 3) * (-0.12-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 178) / 4) * (0-(0)));
            yy = 2.04 + (((tickAnim - 178) / 4) * (1.65-(2.04)));
            zz = -0.12 + (((tickAnim - 178) / 4) * (-0.25-(-0.12)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            yy = 1.65 + (((tickAnim - 182) / 6) * (-0.7-(1.65)));
            zz = -0.25 + (((tickAnim - 182) / 6) * (0-(-0.25)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = -0.7 + (((tickAnim - 188) / 12) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChangchunsaurus entity = (EntityPrehistoricFloraChangchunsaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 6.75 + (((tickAnim - 5) / 5) * (5-(6.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.75 + (((tickAnim - 5) / 5) * (14.25-(17.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.25 + (((tickAnim - 10) / 10) * (0-(14.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.5 + (((tickAnim - 5) / 5) * (55.75-(-4.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 55.75 + (((tickAnim - 10) / 10) * (0-(55.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.5 + (((tickAnim - 5) / 5) * (5.25-(25.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 10) / 10) * (0-(5.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (0-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChangchunsaurus entity = (EntityPrehistoricFloraChangchunsaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (5.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 5.75 + (((tickAnim - 10) / 10) * (0-(5.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (5.75-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 5.75 + (((tickAnim - 35) / 15) * (0-(5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 2.5 + (((tickAnim - 10) / 10) * (-12.25-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = -12.25 + (((tickAnim - 20) / 15) * (2.5-(-12.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 2.5 + (((tickAnim - 35) / 9) * (-12.25-(2.5)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = -12.25 + (((tickAnim - 44) / 6) * (0-(-12.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-9.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -9.75 + (((tickAnim - 10) / 10) * (-19.5-(-9.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -19.5 + (((tickAnim - 20) / 15) * (-9.75-(-19.5)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = -9.75 + (((tickAnim - 35) / 9) * (-19.5-(-9.75)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = -19.5 + (((tickAnim - 44) / 6) * (0-(-19.5)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (24.23766-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-11.87-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.68841-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 24.23766 + (((tickAnim - 10) / 10) * (27.36995-(24.23766)));
            yy = -11.87 + (((tickAnim - 10) / 10) * (-20.94483-(-11.87)));
            zz = -4.68841 + (((tickAnim - 10) / 10) * (7.40006-(-4.68841)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 27.36995 + (((tickAnim - 20) / 15) * (24.23766-(27.36995)));
            yy = -20.94483 + (((tickAnim - 20) / 15) * (-11.87-(-20.94483)));
            zz = 7.40006 + (((tickAnim - 20) / 15) * (-4.68841-(7.40006)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 24.23766 + (((tickAnim - 35) / 9) * (27.36995-(24.23766)));
            yy = -11.87 + (((tickAnim - 35) / 9) * (-20.94483-(-11.87)));
            zz = -4.68841 + (((tickAnim - 35) / 9) * (7.40006-(-4.68841)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 27.36995 + (((tickAnim - 44) / 6) * (0-(27.36995)));
            yy = -20.94483 + (((tickAnim - 44) / 6) * (0-(-20.94483)));
            zz = 7.40006 + (((tickAnim - 44) / 6) * (0-(7.40006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 33 + (((tickAnim - 10) / 10) * (-29.75-(33)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -29.75 + (((tickAnim - 20) / 15) * (33-(-29.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 33 + (((tickAnim - 35) / 10) * (-29.75-(33)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -29.75 + (((tickAnim - 45) / 5) * (0-(-29.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 9 + (((tickAnim - 10) / 3) * (17.56-(9)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.56 + (((tickAnim - 13) / 7) * (-6.75-(17.56)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -6.75 + (((tickAnim - 20) / 15) * (9-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 9 + (((tickAnim - 35) / 3) * (17.56-(9)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 17.56 + (((tickAnim - 38) / 7) * (-6.75-(17.56)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 45) / 5) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -33.75 + (((tickAnim - 15) / 2) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -33.75 + (((tickAnim - 17) / 3) * (27-(-33.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 27 + (((tickAnim - 20) / 20) * (-33.75-(27)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -33.75 + (((tickAnim - 40) / 2) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -33.75 + (((tickAnim - 42) / 3) * (27-(-33.75)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 27 + (((tickAnim - 45) / 5) * (0-(27)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 15) / 2) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.375 + (((tickAnim - 17) / 3) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 40) / 2) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = -0.375 + (((tickAnim - 42) / 3) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.75 + (((tickAnim - 5) / 5) * (50-(5.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 50 + (((tickAnim - 10) / 3) * (88.44-(50)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 88.44 + (((tickAnim - 13) / 2) * (71.38-(88.44)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 71.38 + (((tickAnim - 15) / 2) * (71.38-(71.38)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 71.38 + (((tickAnim - 17) / 3) * (10.75-(71.38)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 10.75 + (((tickAnim - 20) / 7) * (-6.08-(10.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -6.08 + (((tickAnim - 27) / 3) * (5.75-(-6.08)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 30) / 5) * (50-(5.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 50 + (((tickAnim - 35) / 3) * (88.44-(50)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 88.44 + (((tickAnim - 38) / 2) * (71.38-(88.44)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 71.38 + (((tickAnim - 40) / 2) * (71.38-(71.38)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 71.38 + (((tickAnim - 42) / 3) * (10.75-(71.38)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 45) / 5) * (0-(10.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.8 + (((tickAnim - 5) / 5) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (1.875-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 1.875 + (((tickAnim - 15) / 2) * (1.875-(1.875)));
            zz = -0.225 + (((tickAnim - 15) / 2) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.875 + (((tickAnim - 17) / 3) * (0-(1.875)));
            zz = -0.225 + (((tickAnim - 17) / 3) * (0-(-0.225)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0.57-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.57 + (((tickAnim - 23) / 4) * (0.145-(0.57)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.145 + (((tickAnim - 27) / 3) * (-0.8-(0.145)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.8 + (((tickAnim - 30) / 5) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (1.875-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (-0.225-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 1.875 + (((tickAnim - 40) / 2) * (1.875-(1.875)));
            zz = -0.225 + (((tickAnim - 40) / 2) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 1.875 + (((tickAnim - 42) / 3) * (0-(1.875)));
            zz = -0.225 + (((tickAnim - 42) / 3) * (0-(-0.225)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChangchunsaurus entity = (EntityPrehistoricFloraChangchunsaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -13.25 + (((tickAnim - 15) / 15) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -13.25 + (((tickAnim - 30) / 10) * (12.38-(-13.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.38 + (((tickAnim - 40) / 10) * (0-(12.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.6-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.8-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -5.6 + (((tickAnim - 15) / 15) * (-5.6-(-5.6)));
            zz = 3.8 + (((tickAnim - 15) / 15) * (3.8-(3.8)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -5.6 + (((tickAnim - 30) / 10) * (-3.9-(-5.6)));
            zz = 3.8 + (((tickAnim - 30) / 10) * (2.7-(3.8)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -3.9 + (((tickAnim - 40) / 10) * (0-(-3.9)));
            zz = 2.7 + (((tickAnim - 40) / 10) * (0-(2.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(xx);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(yy);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -1.5 + (((tickAnim - 40) / 5) * (-3.75-(-1.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 45) / 5) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -14.5 + (((tickAnim - 40) / 5) * (-16-(-14.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 45) / 5) * (0-(-16)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 9.5 + (((tickAnim - 15) / 15) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 9.5 + (((tickAnim - 30) / 15) * (-8.5-(9.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 45) / 5) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 18.5 + (((tickAnim - 15) / 15) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18.5 + (((tickAnim - 30) / 10) * (18-(18.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 18 + (((tickAnim - 40) / 5) * (19.25-(18)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 19.25 + (((tickAnim - 45) / 5) * (0-(19.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -13 + (((tickAnim - 15) / 15) * (-13-(-13)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -13 + (((tickAnim - 30) / 10) * (-17.25-(-13)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -17.25 + (((tickAnim - 40) / 5) * (-20.5-(-17.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -20.5 + (((tickAnim - 45) / 5) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -12.75 + (((tickAnim - 40) / 3) * (-12.37-(-12.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -12.37 + (((tickAnim - 43) / 2) * (13-(-12.37)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 45) / 5) * (0-(13)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (37.5-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 40) / 10) * (0-(37.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (11.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (17.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 11.25 + (((tickAnim - 40) / 10) * (0-(11.25)));
            zz = 17.5 + (((tickAnim - 40) / 10) * (0-(17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (18.75-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 18.75 + (((tickAnim - 40) / 10) * (0-(18.75)));
            zz = 25 + (((tickAnim - 40) / 10) * (0-(25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (37.5-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 40) / 10) * (0-(37.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (-11.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-17.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -11.25 + (((tickAnim - 40) / 10) * (0-(-11.25)));
            zz = -17.5 + (((tickAnim - 40) / 10) * (0-(-17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (-18.75-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -18.75 + (((tickAnim - 40) / 10) * (0-(-18.75)));
            zz = -25 + (((tickAnim - 40) / 10) * (0-(-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (3.25-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.25 + (((tickAnim - 15) / 15) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 3.25 + (((tickAnim - 30) / 10) * (0-(3.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (10.75-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 45) / 5) * (0-(10.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (10.75-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 15) / 15) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10.75 + (((tickAnim - 30) / 10) * (-9.25-(10.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -9.25 + (((tickAnim - 40) / 5) * (1.63-(-9.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 1.63 + (((tickAnim - 45) / 5) * (0-(1.63)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -12.25 + (((tickAnim - 40) / 5) * (1.13-(-12.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 1.13 + (((tickAnim - 45) / 5) * (0-(1.13)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-8.49399-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (-0.10048-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-0.72288-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -8.49399 + (((tickAnim - 33) / 7) * (-8.98198-(-8.49399)));
            yy = -0.10048 + (((tickAnim - 33) / 7) * (-0.30145-(-0.10048)));
            zz = -0.72288 + (((tickAnim - 33) / 7) * (-2.16864-(-0.72288)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -8.98198 + (((tickAnim - 40) / 3) * (-14.21147-(-8.98198)));
            yy = -0.30145 + (((tickAnim - 40) / 3) * (-0.28715-(-0.30145)));
            zz = -2.16864 + (((tickAnim - 40) / 3) * (-2.06575-(-2.16864)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -14.21147 + (((tickAnim - 43) / 4) * (5.75901-(-14.21147)));
            yy = -0.28715 + (((tickAnim - 43) / 4) * (-0.15072-(-0.28715)));
            zz = -2.06575 + (((tickAnim - 43) / 4) * (-1.08432-(-2.06575)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 5.75901 + (((tickAnim - 47) / 3) * (0-(5.75901)));
            yy = -0.15072 + (((tickAnim - 47) / 3) * (0-(-0.15072)));
            zz = -1.08432 + (((tickAnim - 47) / 3) * (0-(-1.08432)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (11.33-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 11.33 + (((tickAnim - 33) / 4) * (8.25-(11.33)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 8.25 + (((tickAnim - 37) / 3) * (0-(8.25)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (-19.75-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -19.75 + (((tickAnim - 43) / 4) * (0-(-19.75)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-45-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -45 + (((tickAnim - 15) / 15) * (-45-(-45)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -45 + (((tickAnim - 30) / 10) * (-43-(-45)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -43 + (((tickAnim - 40) / 10) * (0-(-43)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 33.75 + (((tickAnim - 15) / 15) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 33.75 + (((tickAnim - 30) / 10) * (25.13-(33.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.13 + (((tickAnim - 40) / 10) * (0-(25.13)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.15 + (((tickAnim - 15) / 15) * (0.15-(0.15)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0.15 + (((tickAnim - 30) / 20) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -45.5 + (((tickAnim - 15) / 15) * (-45.5-(-45.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -45.5 + (((tickAnim - 30) / 10) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -55.5 + (((tickAnim - 40) / 10) * (0-(-55.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -1.15 + (((tickAnim - 15) / 15) * (-1.15-(-1.15)));
            zz = -0.25 + (((tickAnim - 15) / 15) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -1.15 + (((tickAnim - 30) / 10) * (-0.82-(-1.15)));
            zz = -0.25 + (((tickAnim - 30) / 10) * (-0.42-(-0.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.82 + (((tickAnim - 40) / 10) * (0-(-0.82)));
            zz = -0.42 + (((tickAnim - 40) / 10) * (0-(-0.42)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (71.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 71.75 + (((tickAnim - 15) / 15) * (71.75-(71.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 71.75 + (((tickAnim - 30) / 10) * (63.72635-(71.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (1.26849-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (1.03643-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 63.72635 + (((tickAnim - 40) / 10) * (0-(63.72635)));
            yy = 1.26849 + (((tickAnim - 40) / 10) * (0-(1.26849)));
            zz = 1.03643 + (((tickAnim - 40) / 10) * (0-(1.03643)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 8) / 7) * (0-(0.7)));
            zz = -0.2 + (((tickAnim - 8) / 7) * (0-(-0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-45-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -45 + (((tickAnim - 15) / 15) * (-45-(-45)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -45 + (((tickAnim - 30) / 10) * (-43-(-45)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -43 + (((tickAnim - 40) / 10) * (0-(-43)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 33.75 + (((tickAnim - 15) / 15) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 33.75 + (((tickAnim - 30) / 10) * (25.13-(33.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.13 + (((tickAnim - 40) / 10) * (0-(25.13)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.15 + (((tickAnim - 15) / 15) * (0.15-(0.15)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0.15 + (((tickAnim - 30) / 20) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -45.5 + (((tickAnim - 15) / 15) * (-45.5-(-45.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -45.5 + (((tickAnim - 30) / 10) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -55.5 + (((tickAnim - 40) / 10) * (0-(-55.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -1.15 + (((tickAnim - 15) / 15) * (-1.15-(-1.15)));
            zz = -0.25 + (((tickAnim - 15) / 15) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -1.15 + (((tickAnim - 30) / 10) * (-0.82-(-1.15)));
            zz = -0.25 + (((tickAnim - 30) / 10) * (-0.42-(-0.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.82 + (((tickAnim - 40) / 10) * (0-(-0.82)));
            zz = -0.42 + (((tickAnim - 40) / 10) * (0-(-0.42)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (71.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 71.75 + (((tickAnim - 15) / 15) * (71.75-(71.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 71.75 + (((tickAnim - 30) / 10) * (63.72635-(71.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (1.26849-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (1.03643-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 63.72635 + (((tickAnim - 40) / 10) * (0-(63.72635)));
            yy = 1.26849 + (((tickAnim - 40) / 10) * (0-(1.26849)));
            zz = 1.03643 + (((tickAnim - 40) / 10) * (0-(1.03643)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 8) / 7) * (0-(0.7)));
            zz = -0.2 + (((tickAnim - 8) / 7) * (0-(-0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChangchunsaurus entity = (EntityPrehistoricFloraChangchunsaurus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.75 + (((tickAnim - 10) / 5) * (0.25-(-0.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.25 + (((tickAnim - 15) / 5) * (-0.75-(0.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.75 + (((tickAnim - 20) / 5) * (0.25-(-0.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0.25 + (((tickAnim - 25) / 5) * (-0.75-(0.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -0.75 + (((tickAnim - 30) / 15) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -1 + (((tickAnim - 10) / 5) * (-2-(-1)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2 + (((tickAnim - 15) / 5) * (-1-(-2)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -1 + (((tickAnim - 20) / 5) * (-2-(-1)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2 + (((tickAnim - 25) / 5) * (-1-(-2)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -1 + (((tickAnim - 30) / 15) * (0-(-1)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5.25 + (((tickAnim - 10) / 5) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5.25 + (((tickAnim - 20) / 5) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -5.25 + (((tickAnim - 30) / 15) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.5 + (((tickAnim - 10) / 5) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 20) / 5) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -3.5 + (((tickAnim - 30) / 15) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17 + (((tickAnim - 10) / 5) * (0-(17)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (17-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 17 + (((tickAnim - 20) / 5) * (0-(17)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (17-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 17 + (((tickAnim - 30) / 15) * (0-(17)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-13-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13 + (((tickAnim - 15) / 5) * (0-(-13)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-13-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -13 + (((tickAnim - 25) / 3) * (0-(-13)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -6.75 + (((tickAnim - 31) / 4) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (15.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 15) / 5) * (0-(15.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (15.5-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 15.5 + (((tickAnim - 25) / 3) * (0-(15.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (15.5-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 15.5 + (((tickAnim - 31) / 3) * (0-(15.5)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraChangchunsaurus entity = (EntityPrehistoricFloraChangchunsaurus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 13.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*50 + (((tickAnim - 0) / 6) * (-9.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*50-(13.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*50)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -9.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*50 + (((tickAnim - 6) / 6) * (-10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*50-(-9.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*50)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -6 + (((tickAnim - 0) / 6) * (11.575-(-6)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 11.575 + (((tickAnim - 6) / 3) * (40.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-180-(11.575)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 40.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-180 + (((tickAnim - 9) / 3) * (-6-(40.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-180)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.025-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -0.025 + (((tickAnim - 8) / 4) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 4.5 + (((tickAnim - 0) / 1) * (20.5-(4.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 20.5 + (((tickAnim - 1) / 2) * (17.23-(20.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 17.23 + (((tickAnim - 3) / 3) * (24.25-(17.23)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 24.25 + (((tickAnim - 6) / 2) * (-30.75-(24.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30.75 + (((tickAnim - 8) / 2) * (-30.75-(-30.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -30.75 + (((tickAnim - 10) / 2) * (4.5-(-30.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 1) / 2) * (0.5-(-0.15)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (0-(0.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 8) / 2) * (-0.25-(-0.375)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 2) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
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
            xx = 72.16561 + (((tickAnim - 0) / 1) * (7.39141-(72.16561)));
            yy = -1.18182 + (((tickAnim - 0) / 1) * (-2.73133-(-1.18182)));
            zz = 2.02495 + (((tickAnim - 0) / 1) * (3.08957-(2.02495)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 7.39141 + (((tickAnim - 1) / 2) * (-5.15-(7.39141)));
            yy = -2.73133 + (((tickAnim - 1) / 2) * (0-(-2.73133)));
            zz = 3.08957 + (((tickAnim - 1) / 2) * (0-(3.08957)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -5.15 + (((tickAnim - 3) / 0) * (-20.55-(-5.15)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -20.55 + (((tickAnim - 3) / 3) * (55.25-(-20.55)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 55.25 + (((tickAnim - 6) / 2) * (87.62-(55.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 87.62 + (((tickAnim - 8) / 2) * (82.85-(87.62)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 82.85 + (((tickAnim - 10) / 2) * (72.16561-(82.85)));
            yy = 0 + (((tickAnim - 10) / 2) * (-1.18182-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (2.02495-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 1) * (-0.15-(0.9)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 1) / 2) * (0.45-(-0.15)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.45 + (((tickAnim - 3) / 0) * (0.225-(0.45)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.225 + (((tickAnim - 3) / 1) * (0.4-(0.225)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 4) / 2) * (1.475-(0.4)));
            zz = 0 + (((tickAnim - 4) / 2) * (-0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.475 + (((tickAnim - 6) / 2) * (2.745-(1.475)));
            zz = -0.2 + (((tickAnim - 6) / 2) * (-0.43-(-0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.745 + (((tickAnim - 8) / 2) * (2.175-(2.745)));
            zz = -0.43 + (((tickAnim - 8) / 2) * (-0.375-(-0.43)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 2.175 + (((tickAnim - 10) / 2) * (0.9-(2.175)));
            zz = -0.375 + (((tickAnim - 10) / 2) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50 + (((tickAnim - 0) / 6) * (10.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*50-(19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 10.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*50 + (((tickAnim - 6) / 6) * (1.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*50-(10.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*50)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11.575 + (((tickAnim - 0) / 3) * (-7.815+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-185-(11.575)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.815+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-185 + (((tickAnim - 3) / 3) * (-8-(-7.815+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-185)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -8 + (((tickAnim - 6) / 6) * (11.575-(-8)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.025-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = -0.025 + (((tickAnim - 2) / 4) * (0-(-0.025)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 55.25 + (((tickAnim - 0) / 2) * (92.62-(55.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 92.62 + (((tickAnim - 2) / 2) * (82.85-(92.62)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 82.85 + (((tickAnim - 4) / 2) * (69.16561-(82.85)));
            yy = 0 + (((tickAnim - 4) / 2) * (-1.18182-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (2.02495-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 69.16561 + (((tickAnim - 6) / 1) * (5.519-(69.16561)));
            yy = -1.18182 + (((tickAnim - 6) / 1) * (4.99284-(-1.18182)));
            zz = 2.02495 + (((tickAnim - 6) / 1) * (-2.31845-(2.02495)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5.519 + (((tickAnim - 7) / 1) * (13.29363-(5.519)));
            yy = 4.99284 + (((tickAnim - 7) / 1) * (2.06054-(4.99284)));
            zz = -2.31845 + (((tickAnim - 7) / 1) * (-3.13383-(-2.31845)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 13.29363 + (((tickAnim - 8) / 4) * (55.25-(13.29363)));
            yy = 2.06054 + (((tickAnim - 8) / 4) * (0-(2.06054)));
            zz = -3.13383 + (((tickAnim - 8) / 4) * (0-(-3.13383)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.02-(0)));
            zz = -0.2 + (((tickAnim - 0) / 2) * (-0.23-(-0.2)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 2.02 + (((tickAnim - 2) / 2) * (2.725-(2.02)));
            zz = -0.23 + (((tickAnim - 2) / 2) * (-0.45-(-0.23)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 2.725 + (((tickAnim - 4) / 2) * (2.15-(2.725)));
            zz = -0.45 + (((tickAnim - 4) / 2) * (-0.175-(-0.45)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 2.15 + (((tickAnim - 6) / 1) * (0-(2.15)));
            zz = -0.175 + (((tickAnim - 6) / 1) * (0-(-0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.3-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 2) * (0.685-(0.3)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.685 + (((tickAnim - 10) / 2) * (0-(0.685)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (-30.75-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -30.75 + (((tickAnim - 3) / 1) * (-30.75-(-30.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -30.75 + (((tickAnim - 4) / 2) * (6-(-30.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 6 + (((tickAnim - 6) / 1) * (15-(6)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 7) / 1) * (-12.52-(15)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -12.52 + (((tickAnim - 8) / 4) * (17.5-(-12.52)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.375 + (((tickAnim - 3) / 1) * (-0.25-(-0.375)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 4) / 2) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+80))*7), Root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+80))*4), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+80))*-8));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+120))*1);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+150))*-10), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+80))*-4), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+100))*8));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+190))*10), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+100))*8));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+220))*12), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+100))*-8));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(9.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+370))*12), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+350))*-12), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+400))*12), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather, feather.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+400))*12), feather.rotateAngleY + (float) Math.toRadians(0), feather.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather2, feather2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+450))*-20), feather2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+450))*-20), feather2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+450))*-17));


        this.setRotateAngle(feather3, feather3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+450))*-20), feather3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+450))*20), feather3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5+450))*17));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5))*4), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620))*8), Tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+80))*-3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5-50))*8), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620-50))*8), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+80))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5-100))*6), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620-100))*12), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+80))*-3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5-150))*8), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620-150))*18), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+80))*-3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5-200))*10), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620-200))*22), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620+80))*-3));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraChangchunsaurus entity = (EntityPrehistoricFloraChangchunsaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 29.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*50 + (((tickAnim - 0) / 13) * (-17.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*50-(29.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*50)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -17.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*50 + (((tickAnim - 13) / 12) * (12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*50-(-17.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*50)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -16.5 + (((tickAnim - 0) / 13) * (11.575-(-16.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.575 + (((tickAnim - 13) / 5) * (78.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-95-(11.575)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 78.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-95 + (((tickAnim - 18) / 7) * (-16.5-(78.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-95)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.025-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = -0.025 + (((tickAnim - 16) / 9) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.25 + (((tickAnim - 0) / 5) * (-12.52-(10.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -12.52 + (((tickAnim - 5) / 8) * (24.25-(-12.52)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 24.25 + (((tickAnim - 13) / 5) * (-30.75-(24.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -30.75 + (((tickAnim - 18) / 3) * (-30.75-(-30.75)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -30.75 + (((tickAnim - 21) / 4) * (10.25-(-30.75)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.7 + (((tickAnim - 5) / 3) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = -0.375 + (((tickAnim - 18) / 3) * (-0.25-(-0.375)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 21) / 4) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 27 + (((tickAnim - 0) / 5) * (15.85-(27)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 15.85 + (((tickAnim - 5) / 8) * (55.25-(15.85)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 55.25 + (((tickAnim - 13) / 3) * (87.62-(55.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 87.62 + (((tickAnim - 16) / 5) * (82.85-(87.62)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 82.85 + (((tickAnim - 21) / 4) * (27-(82.85)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 1) * (0-(0.325)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 2) / 3) * (-0.525-(-0.1)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.525 + (((tickAnim - 5) / 3) * (1.35-(-0.525)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.35 + (((tickAnim - 8) / 5) * (1.475-(1.35)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.475 + (((tickAnim - 13) / 3) * (2.745-(1.475)));
            zz = -0.2 + (((tickAnim - 13) / 3) * (-0.43-(-0.2)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 2.745 + (((tickAnim - 16) / 5) * (2.175-(2.745)));
            zz = -0.43 + (((tickAnim - 16) / 5) * (-0.375-(-0.43)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 2.175 + (((tickAnim - 21) / 4) * (0.325-(2.175)));
            zz = -0.375 + (((tickAnim - 21) / 4) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50 + (((tickAnim - 0) / 13) * (-26.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-10-(10.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -26.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-10 + (((tickAnim - 13) / 12) * (52.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*50-(-26.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-10)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 11.575 + (((tickAnim - 0) / 6) * (18.635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-95-(11.575)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 18.635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-95 + (((tickAnim - 6) / 7) * (-16.5-(18.635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-95)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -16.5 + (((tickAnim - 13) / 12) * (11.575-(-16.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.025-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            zz = -0.025 + (((tickAnim - 3) / 22) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 55.25 + (((tickAnim - 0) / 3) * (92.62-(55.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 92.62 + (((tickAnim - 3) / 5) * (82.85-(92.62)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 82.85 + (((tickAnim - 8) / 5) * (29.75-(82.85)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 29.75 + (((tickAnim - 13) / 5) * (4.6-(29.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 4.6 + (((tickAnim - 18) / 7) * (55.25-(4.6)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.02-(0)));
            zz = -0.2 + (((tickAnim - 0) / 3) * (-0.23-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 2.02 + (((tickAnim - 3) / 5) * (2.725-(2.02)));
            zz = -0.23 + (((tickAnim - 3) / 5) * (-0.45-(-0.23)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 2.725 + (((tickAnim - 8) / 5) * (0.325-(2.725)));
            zz = -0.45 + (((tickAnim - 8) / 5) * (0-(-0.45)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0.325 + (((tickAnim - 13) / 0) * (0.82-(0.325)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.82 + (((tickAnim - 13) / 1) * (0.845-(0.82)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.845 + (((tickAnim - 14) / 4) * (-0.675-(0.845)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -0.675 + (((tickAnim - 18) / 4) * (0.685-(-0.675)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.685 + (((tickAnim - 22) / 3) * (0-(0.685)));
            zz = 0 + (((tickAnim - 22) / 3) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.5 + (((tickAnim - 0) / 6) * (-30.75-(17.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -30.75 + (((tickAnim - 6) / 2) * (-30.75-(-30.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -30.75 + (((tickAnim - 8) / 5) * (10.25-(-30.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 10.25 + (((tickAnim - 13) / 5) * (-12.52-(10.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -12.52 + (((tickAnim - 18) / 7) * (17.5-(-12.52)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 6) / 2) * (-0.25-(-0.375)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 5) * (-0.15-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 5) * (-0.7-(-0.15)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -0.7 + (((tickAnim - 18) / 4) * (0-(-0.7)));
            zz = -0.2 + (((tickAnim - 18) / 4) * (0-(-0.2)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*2), Root.rotateAngleY + (float) Math.toRadians(0), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*4));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*0.95);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-0.5);
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-4));
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*4), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*4));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*5), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-450))*-5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-500))*5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(feather, feather.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-480))*7), feather.rotateAngleY + (float) Math.toRadians(0), feather.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*-3), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*1), Tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-4));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-4), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*2), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*4));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*-4), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*3), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*-4), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*4), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-400))*-4), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*6), Tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(feather2, feather2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-450))*4), feather2.rotateAngleY + (float) Math.toRadians(0), feather2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-450))*4));
        this.setRotateAngle(feather3, feather3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-450))*4), feather3.rotateAngleY + (float) Math.toRadians(0), feather3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-450))*-4));
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-5), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*4));
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*-5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*4));
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-5), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*4));
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*-5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*4));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraChangchunsaurus e = (EntityPrehistoricFloraChangchunsaurus) entity;
        animator.update(entity);


    }
}
