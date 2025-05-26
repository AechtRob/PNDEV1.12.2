package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMachimosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMachimosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Lefthindfootheel;
    private final AdvancedModelRenderer Lefthindfoottoes;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Righthindfootheel;
    private final AdvancedModelRenderer Righthindfoottoes;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer leftArmUpper;
    private final AdvancedModelRenderer leftArmLower;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArmUpper;
    private final AdvancedModelRenderer rightArmLower;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer Upperjawbase;
    private final AdvancedModelRenderer immobile;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer immobile2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer immobile7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer immobile8;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer immobile4;
    private final AdvancedModelRenderer immobile5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer immobile6;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer immobile3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer throatPouch;
    private final AdvancedModelRenderer throatPouch2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;

    public ModelMachimosaurus() {
        this.textureWidth = 134;
        this.textureHeight = 116;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.5F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(-0.5F, -8.25F, 13.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.0848F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 54, 25, -4.0F, -2.5083F, 1.9784F, 8, 7, 11, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 88, 87, -2.0F, -3.0083F, 2.0034F, 4, 1, 11, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.3F, 1.1017F, 7.4784F);
        this.hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.0F, 0.6793F, 0.1061F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 99, 59, -2.5F, -2.5F, -7.5F, 5, 5, 8, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.3F, -0.5F, -6.1F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.1698F, -0.3396F, 0.1274F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 0, 23, -1.5F, -0.5F, -1.5F, 4, 8, 5, 0.0F, false));

        this.Lefthindfootheel = new AdvancedModelRenderer(this);
        this.Lefthindfootheel.setRotationPoint(1.0F, 6.0F, 1.0F);
        this.Leftshin.addChild(Lefthindfootheel);
        this.setRotateAngle(Lefthindfootheel, -0.0768F, 0.0F, -0.1911F);
        this.Lefthindfootheel.cubeList.add(new ModelBox(Lefthindfootheel, 28, 99, -3.5F, 0.0F, -5.5F, 6, 2, 7, 0.0F, false));

        this.Lefthindfoottoes = new AdvancedModelRenderer(this);
        this.Lefthindfoottoes.setRotationPoint(0.0F, 0.49F, -5.5F);
        this.Lefthindfootheel.addChild(Lefthindfoottoes);
        this.Lefthindfoottoes.cubeList.add(new ModelBox(Lefthindfoottoes, 108, 90, -4.0F, -0.5F, -4.5F, 7, 2, 5, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.3F, 1.1017F, 7.4784F);
        this.hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.0F, -0.6793F, -0.1061F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 99, 59, -2.5F, -2.5F, -7.5F, 5, 5, 8, 0.0F, true));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.3F, -0.5F, -6.1F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.1698F, 0.3396F, -0.1274F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 0, 23, -2.5F, -0.5F, -1.5F, 4, 8, 5, 0.0F, true));

        this.Righthindfootheel = new AdvancedModelRenderer(this);
        this.Righthindfootheel.setRotationPoint(-1.0F, 6.0F, 1.0F);
        this.Rightshin.addChild(Righthindfootheel);
        this.setRotateAngle(Righthindfootheel, -0.0768F, 0.0F, 0.1911F);
        this.Righthindfootheel.cubeList.add(new ModelBox(Righthindfootheel, 28, 99, -2.5F, 0.0F, -5.5F, 6, 2, 7, 0.0F, true));

        this.Righthindfoottoes = new AdvancedModelRenderer(this);
        this.Righthindfoottoes.setRotationPoint(0.0F, 0.49F, -5.5F);
        this.Righthindfootheel.addChild(Righthindfoottoes);
        this.Righthindfoottoes.cubeList.add(new ModelBox(Righthindfoottoes, 108, 90, -3.0F, -0.5F, -4.5F, 7, 2, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7583F, 2.9784F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0337F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 37, 66, -5.5F, -2.0F, -7.0F, 11, 8, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 0, -3.5F, -2.4F, -6.975F, 7, 1, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.25F, -6.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0337F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -7.0F, -1.0F, -13.0F, 14, 9, 13, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 42, 10, -4.0F, -1.5F, -13.025F, 8, 1, 13, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.25F, -12.0F);
        this.body2.addChild(chest);
        this.setRotateAngle(chest, 0.1274F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 47, -6.5F, -2.0F, -8.0F, 13, 8, 8, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 65, 98, -3.5F, -2.5F, -8.05F, 7, 1, 8, 0.0F, false));

        this.leftArmUpper = new AdvancedModelRenderer(this);
        this.leftArmUpper.setRotationPoint(-6.0F, 4.0F, -5.0F);
        this.chest.addChild(leftArmUpper);
        this.setRotateAngle(leftArmUpper, -0.0283F, -0.8915F, -0.0213F);
        this.leftArmUpper.cubeList.add(new ModelBox(leftArmUpper, 27, 23, -2.0F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.leftArmLower = new AdvancedModelRenderer(this);
        this.leftArmLower.setRotationPoint(-0.5F, 0.0F, 3.5F);
        this.leftArmUpper.addChild(leftArmLower);
        this.setRotateAngle(leftArmLower, 0.1276F, 0.9034F, 0.584F);
        this.leftArmLower.cubeList.add(new ModelBox(leftArmLower, 0, 0, -1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.leftArmLower.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.237F, 0.2335F, -0.2759F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 37, -2.5F, -0.25F, -3.5F, 5, 1, 4, 0.0F, false));

        this.rightArmUpper = new AdvancedModelRenderer(this);
        this.rightArmUpper.setRotationPoint(6.0F, 4.0F, -5.0F);
        this.chest.addChild(rightArmUpper);
        this.setRotateAngle(rightArmUpper, -0.0283F, 0.8915F, 0.0213F);
        this.rightArmUpper.cubeList.add(new ModelBox(rightArmUpper, 27, 23, -1.0F, -1.0F, -1.0F, 3, 3, 5, 0.0F, true));

        this.rightArmLower = new AdvancedModelRenderer(this);
        this.rightArmLower.setRotationPoint(0.5F, 0.0F, 3.5F);
        this.rightArmUpper.addChild(rightArmLower);
        this.setRotateAngle(rightArmLower, 0.1276F, -0.9034F, -0.584F);
        this.rightArmLower.cubeList.add(new ModelBox(rightArmLower, 0, 0, -1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.rightArmLower.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.237F, -0.2335F, 0.2759F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 37, -2.5F, -0.25F, -3.5F, 5, 1, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.25F, -7.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0956F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 76, 73, -5.5F, -2.0F, -6.0F, 11, 7, 6, 0.001F, false));
        this.neck.cubeList.add(new ModelBox(neck, 21, 83, -2.5F, -2.5F, -6.0F, 5, 1, 6, 0.001F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.5F, -5.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0956F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 84, 46, -5.0F, -2.5F, -6.0F, 10, 6, 6, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 48, 99, -2.0F, -3.0F, -4.0F, 4, 1, 3, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 54, 29, -1.5F, -3.0F, -6.025F, 3, 1, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -5.5F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0602F, 0.0F, 0.0F);


        this.Upperjawbase = new AdvancedModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.head.addChild(Upperjawbase);
        this.Upperjawbase.cubeList.add(new ModelBox(Upperjawbase, 64, 87, -4.5F, -1.0F, -7.4F, 9, 2, 8, 0.0F, false));

        this.immobile = new AdvancedModelRenderer(this);
        this.immobile.setRotationPoint(0.5F, -1.25F, 0.6F);
        this.Upperjawbase.addChild(immobile);
        this.setRotateAngle(immobile, 0.0611F, 0.0F, 0.0F);
        this.immobile.cubeList.add(new ModelBox(immobile, 93, 0, -4.0F, -1.5F, -8.0F, 7, 2, 8, 0.0F, false));
        this.immobile.cubeList.add(new ModelBox(immobile, 38, 32, -1.5F, -2.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -1.5F, -8.0F);
        this.immobile.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.015F, 0.2992F, -0.19F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 70, 50, -2.0F, 0.0F, -3.0F, 2, 2, 4, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -1.5F, -8.0F);
        this.immobile.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.015F, 0.2992F, -0.19F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 97, -2.0F, 1.4F, -3.0F, 2, 1, 4, -0.001F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.0F, -1.5F, -8.0F);
        this.immobile.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.015F, -0.2992F, 0.19F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 97, 0.0F, 1.4F, -3.0F, 2, 1, 4, -0.001F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 50, 0.0F, 0.0F, -3.0F, 2, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.5F, -10.0F);
        this.immobile.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.192F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 65, 0, -1.5F, 0.45F, -2.8F, 3, 1, 5, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.5F, -9.0F);
        this.immobile.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.24F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 83, -1.5F, 0.25F, -4.0F, 3, 1, 5, 0.0F, false));

        this.immobile2 = new AdvancedModelRenderer(this);
        this.immobile2.setRotationPoint(0.5F, 1.0F, -5.4F);
        this.Upperjawbase.addChild(immobile2);
        this.setRotateAngle(immobile2, 0.0218F, 0.0F, 0.0F);
        this.immobile2.cubeList.add(new ModelBox(immobile2, 0, 23, -2.0F, -1.0F, -20.0F, 3, 1, 20, 0.0F, false));
        this.immobile2.cubeList.add(new ModelBox(immobile2, 52, 90, -2.5F, -1.0F, -23.0F, 4, 1, 3, 0.0F, false));
        this.immobile2.cubeList.add(new ModelBox(immobile2, 35, 47, -1.5F, -1.25F, -23.0F, 2, 1, 6, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -20.0F);
        this.immobile2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0131F, 0.0F, -0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 97, 1.0F, -0.25F, 0.0F, 0, 1, 13, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.0F, -20.0F);
        this.immobile2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0131F, 0.0F, 0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 97, -1.0F, -0.25F, 0.0F, 0, 1, 13, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.0F, -23.0F);
        this.immobile2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 41, -3.0F, -0.25F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 0.0F, -22.0F);
        this.immobile2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 0, 0.0F, -0.25F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.5F, 0.0F, -22.0F);
        this.immobile2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 0, 0.0F, -0.25F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.25F, -17.0F);
        this.immobile2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1029F, 0.0022F, 0.0102F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 97, -1.0F, 0.5F, 7.0F, 2, 1, 4, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.25F, -17.0F);
        this.immobile2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0611F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 103, 102, -1.0F, 0.0F, 0.0F, 2, 1, 11, 0.0F, false));

        this.immobile7 = new AdvancedModelRenderer(this);
        this.immobile7.setRotationPoint(-5.0F, -0.05F, -3.0F);
        this.immobile2.addChild(immobile7);
        this.setRotateAngle(immobile7, 0.0F, -0.48F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.immobile7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.0436F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 71, 108, 0.0F, -1.0F, -7.0F, 3, 1, 7, 0.0F, false));

        this.immobile8 = new AdvancedModelRenderer(this);
        this.immobile8.setRotationPoint(4.5F, 0.95F, -8.4F);
        this.Upperjawbase.addChild(immobile8);
        this.setRotateAngle(immobile8, 0.0F, 0.48F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.immobile8.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0349F, 0.0436F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 71, 108, -3.0F, -1.0F, -7.0F, 3, 1, 7, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 82, 17, -4.5F, 0.0F, -8.0F, 9, 2, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.0F, -7.0F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1265F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 17, -3.0F, -1.0F, -3.0F, 6, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 25, -1.5F, -1.0F, -7.0F, 3, 1, 2, -0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 9, -2.0F, -1.0F, -5.0F, 4, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.4F, 0.0F, -8.0F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1949F, 0.0952F, -0.0165F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 87, 100, -3.5F, -2.875F, 0.0F, 4, 3, 9, -0.001F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.4F, 0.0F, -8.0F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1949F, -0.0952F, 0.0165F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 87, 100, -0.5F, -2.875F, 0.0F, 4, 3, 9, -0.001F, false));

        this.immobile4 = new AdvancedModelRenderer(this);
        this.immobile4.setRotationPoint(0.5F, 1.0F, -6.0F);
        this.jaw.addChild(immobile4);
        this.setRotateAngle(immobile4, 0.0218F, 0.0F, 0.0F);


        this.immobile5 = new AdvancedModelRenderer(this);
        this.immobile5.setRotationPoint(-5.0F, -0.05F, -3.0F);
        this.immobile4.addChild(immobile5);
        this.setRotateAngle(immobile5, 0.0F, -0.48F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -0.05F, 1.0F);
        this.immobile5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.0436F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 64, 0.0F, -0.95F, -7.0F, 3, 1, 7, 0.0F, false));

        this.immobile6 = new AdvancedModelRenderer(this);
        this.immobile6.setRotationPoint(4.0F, -0.05F, -3.0F);
        this.immobile4.addChild(immobile6);
        this.setRotateAngle(immobile6, 0.0F, 0.48F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -0.05F, 1.0F);
        this.immobile6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0436F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 64, -3.0F, -0.95F, -7.0F, 3, 1, 7, 0.0F, true));

        this.immobile3 = new AdvancedModelRenderer(this);
        this.immobile3.setRotationPoint(0.5F, 1.0F, -7.0F);
        this.jaw.addChild(immobile3);
        this.setRotateAngle(immobile3, 0.0218F, 0.0F, 0.0F);
        this.immobile3.cubeList.add(new ModelBox(immobile3, 28, 26, -2.0F, -1.05F, -19.0F, 3, 1, 19, 0.0F, false));
        this.immobile3.cubeList.add(new ModelBox(immobile3, 84, 59, -2.5F, -1.0F, -22.0F, 4, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, -1.0F, -19.0F);
        this.immobile3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0131F, 0.0F, 0.1745F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 51, 98, 0.0F, -0.75F, 0.0F, 0, 1, 13, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.0F, -1.0F, -19.0F);
        this.immobile3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0131F, 0.0F, -0.1745F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 51, 98, 0.0F, -0.75F, 0.0F, 0, 1, 13, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -1.0F, -22.0F);
        this.immobile3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1745F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 38, 36, -3.0F, -0.75F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, -1.0F, -21.0F);
        this.immobile3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.1745F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 45, 0.0F, -0.75F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.5F, -1.0F, -21.0F);
        this.immobile3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.1745F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 45, 0.0F, -0.75F, -1.0F, 0, 1, 3, 0.0F, false));

        this.throatPouch = new AdvancedModelRenderer(this);
        this.throatPouch.setRotationPoint(0.5F, 3.5F, -6.0F);
        this.neck2.addChild(throatPouch);
        this.setRotateAngle(throatPouch, -0.3927F, 0.0F, 0.0F);
        this.throatPouch.cubeList.add(new ModelBox(throatPouch, 105, 11, -5.0F, -2.0F, 0.0F, 9, 2, 3, 0.0F, false));

        this.throatPouch2 = new AdvancedModelRenderer(this);
        this.throatPouch2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.throatPouch.addChild(throatPouch2);
        this.setRotateAngle(throatPouch2, 0.48F, 0.0F, 0.0F);
        this.throatPouch2.cubeList.add(new ModelBox(throatPouch2, 108, 83, -5.0F, -2.0F, 0.0F, 9, 2, 4, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2583F, 11.9784F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0637F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 43, 47, -3.5F, -1.75F, 0.0F, 7, 6, 12, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 83, -2.0F, -2.5F, 0.025F, 4, 1, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.75F, 11.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0213F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 64, -2.5F, -0.75F, 0.0F, 5, 5, 13, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -1.75F, 2.0F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0262F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 80, 31, -2.0F, 0.2F, -2.0F, 3, 1, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 12.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0424F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 72, 0, -2.0F, -1.0F, 0.0F, 4, 4, 12, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -1.35F, 2.0F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0524F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 64, 0.0F, -0.75F, 5.0F, 1, 2, 5, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 27, 32, -0.5F, -0.75F, -1.0F, 2, 2, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0424F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 83, -1.5F, -0.75F, 0.0F, 3, 3, 12, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 15, 100, 0.0F, -3.75F, 0.0F, 0, 3, 12, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0213F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 100, 29, -1.0F, -0.75F, 0.0F, 2, 3, 11, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 68, 51, 0.0F, -3.75F, 0.0F, 0, 6, 15, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.3F;
        this.root.offsetX = 0.15F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(220);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 0.3F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.2F, 3.8F, -0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.005F, 0.0F, 0.0F);
        this.root.offsetY = -0.155F;
        this.root.render(0.01f);
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

        EntityPrehistoricFloraMachimosaurus entityMachimosaurus = (EntityPrehistoricFloraMachimosaurus) e;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

        entityMachimosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityMachimosaurus.getAnimation() == entityMachimosaurus.LAY_ANIMATION) {

        }
        else {
            if (!entityMachimosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityMachimosaurus.getIsMoving()) {
                    if (entityMachimosaurus.getAnimation() != entityMachimosaurus.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityMachimosaurus.getIsFast()) { //Running


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
        this.throatPouch.setScale(1,1,1);

        EntityPrehistoricFloraMachimosaurus ee = (EntityPrehistoricFloraMachimosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else {
            //Swimming pose:
            if (!ee.getIsFast()) { //fast in water
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                //moving in water
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

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

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMachimosaurus entity = (EntityPrehistoricFloraMachimosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5 + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*2.5 + (((tickAnim - 10) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*-2.5 + (((tickAnim - 20) / 20) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (-13.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*10-(-13.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-15 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-15)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*10 + (((tickAnim - 20) / 20) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*20 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+120))*-15-(-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-15 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-20 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-20)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+120))*-15 + (((tickAnim - 20) / 20) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+120))*-15)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*10 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*-5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*-5 + (((tickAnim - 20) / 20) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -4.25 + (((tickAnim - 10) / 30) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.6-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 12) / 28) * (0-(0)));
            yy = 0.525 + (((tickAnim - 12) / 28) * (0-(0.525)));
            zz = -0.6 + (((tickAnim - 12) / 28) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throatPouch.rotationPointX = this.throatPouch.rotationPointX + (float)(xx);
        this.throatPouch.rotationPointY = this.throatPouch.rotationPointY - (float)(yy);
        this.throatPouch.rotationPointZ = this.throatPouch.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 12) * (1.3-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 12) / 28) * (1-(1)));
            yy = 1 + (((tickAnim - 12) / 28) * (1-(1)));
            zz = 1.3 + (((tickAnim - 12) / 28) * (1-(1.3)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throatPouch.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMachimosaurus entity = (EntityPrehistoricFloraMachimosaurus) entitylivingbaseIn;
        int animCycle = 24;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-160))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-160))*15 + (((tickAnim - 5) / 5) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-160))*15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10 + (((tickAnim - 10) / 14) * (0-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-15 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(1.35);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+170))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+170))*-5 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+170))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*10 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-3 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*-15 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*3 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*20 + (((tickAnim - 5) / 5) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+150))*15-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*20)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+150))*15 + (((tickAnim - 10) / 14) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+150))*15)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Upperjawbase, Upperjawbase.rotateAngleX + (float) Math.toRadians(xx), Upperjawbase.rotateAngleY + (float) Math.toRadians(yy), Upperjawbase.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMachimosaurus entity = (EntityPrehistoricFloraMachimosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 13) / 22) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 35) / 15) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0.625 + (((tickAnim - 13) / 22) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 35) / 15) * (0-(0.625)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 4.75 + (((tickAnim - 10) / 28) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 38) / 12) * (0-(4.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(0), Leftshin.rotateAngleY + (float) Math.toRadians(0), Leftshin.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (2.75-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 50) {
            xx = 0.75 + (((tickAnim - 16) / 34) * (0-(0.75)));
            yy = 0 + (((tickAnim - 16) / 34) * (0-(0)));
            zz = 2.75 + (((tickAnim - 16) / 34) * (0-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfootheel, Lefthindfootheel.rotateAngleX + (float) Math.toRadians(xx), Lefthindfootheel.rotateAngleY + (float) Math.toRadians(yy), Lefthindfootheel.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -6 + (((tickAnim - 10) / 28) * (-6-(-6)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 38) / 12) * (0-(-6)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoottoes, Lefthindfoottoes.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoottoes.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoottoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 5.5 + (((tickAnim - 10) / 15) * (-7.32993-(5.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (-14.18576-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (-4.37124-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -7.32993 + (((tickAnim - 25) / 10) * (-28.39796-(-7.32993)));
            yy = -14.18576 + (((tickAnim - 25) / 10) * (-8.51145-(-14.18576)));
            zz = -4.37124 + (((tickAnim - 25) / 10) * (-2.62274-(-4.37124)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -28.39796 + (((tickAnim - 35) / 15) * (0-(-28.39796)));
            yy = -8.51145 + (((tickAnim - 35) / 15) * (0-(-8.51145)));
            zz = -2.62274 + (((tickAnim - 35) / 15) * (0-(-2.62274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 0) / 10) * (0-(-35)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (-8.01977-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (-11.40448-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (-37.23083-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -8.01977 + (((tickAnim - 25) / 25) * (-35-(-8.01977)));
            yy = -11.40448 + (((tickAnim - 25) / 25) * (0-(-11.40448)));
            zz = -37.23083 + (((tickAnim - 25) / 25) * (0-(-37.23083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 34.5 + (((tickAnim - 0) / 10) * (-1.25-(34.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -1.25 + (((tickAnim - 10) / 6) * (24.75441-(-1.25)));
            yy = 0 + (((tickAnim - 10) / 6) * (18.34476-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (13.15768-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 24.75441 + (((tickAnim - 16) / 3) * (36.09441-(24.75441)));
            yy = 18.34476 + (((tickAnim - 16) / 3) * (29.53549-(18.34476)));
            zz = 13.15768 + (((tickAnim - 16) / 3) * (19.76677-(13.15768)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 36.09441 + (((tickAnim - 19) / 6) * (72.41989-(36.09441)));
            yy = 29.53549 + (((tickAnim - 19) / 6) * (49.22509-(29.53549)));
            zz = 19.76677 + (((tickAnim - 19) / 6) * (51.58447-(19.76677)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 72.41989 + (((tickAnim - 25) / 10) * (48.20575-(72.41989)));
            yy = 49.22509 + (((tickAnim - 25) / 10) * (47.38022-(49.22509)));
            zz = 51.58447 + (((tickAnim - 25) / 10) * (-8.53536-(51.58447)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 48.20575 + (((tickAnim - 35) / 15) * (34.5-(48.20575)));
            yy = 47.38022 + (((tickAnim - 35) / 15) * (0-(47.38022)));
            zz = -8.53536 + (((tickAnim - 35) / 15) * (0-(-8.53536)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfootheel, Righthindfootheel.rotateAngleX + (float) Math.toRadians(xx), Righthindfootheel.rotateAngleY + (float) Math.toRadians(yy), Righthindfootheel.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.635-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.36-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.635 + (((tickAnim - 5) / 5) * (0.525-(0.635)));
            zz = -0.36 + (((tickAnim - 5) / 5) * (-0.725-(-0.36)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0.29-(0)));
            yy = 0.525 + (((tickAnim - 10) / 6) * (1.285-(0.525)));
            zz = -0.725 + (((tickAnim - 10) / 6) * (-1.2-(-0.725)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0.29 + (((tickAnim - 16) / 3) * (0.46-(0.29)));
            yy = 1.285 + (((tickAnim - 16) / 3) * (0.81-(1.285)));
            zz = -1.2 + (((tickAnim - 16) / 3) * (-1.47-(-1.2)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0.46 + (((tickAnim - 19) / 6) * (0.775-(0.46)));
            yy = 0.81 + (((tickAnim - 19) / 6) * (0.25-(0.81)));
            zz = -1.47 + (((tickAnim - 19) / 6) * (-1.975-(-1.47)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0.775 + (((tickAnim - 25) / 10) * (1.05-(0.775)));
            yy = 0.25 + (((tickAnim - 25) / 10) * (1.15-(0.25)));
            zz = -1.975 + (((tickAnim - 25) / 10) * (0.375-(-1.975)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.05 + (((tickAnim - 35) / 5) * (1.28-(1.05)));
            yy = 1.15 + (((tickAnim - 35) / 5) * (1.815-(1.15)));
            zz = 0.375 + (((tickAnim - 35) / 5) * (0.26-(0.375)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.28 + (((tickAnim - 40) / 10) * (0-(1.28)));
            yy = 1.815 + (((tickAnim - 40) / 10) * (0-(1.815)));
            zz = 0.26 + (((tickAnim - 40) / 10) * (0-(0.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righthindfootheel.rotationPointX = this.Righthindfootheel.rotationPointX + (float)(xx);
        this.Righthindfootheel.rotationPointY = this.Righthindfootheel.rotationPointY - (float)(yy);
        this.Righthindfootheel.rotationPointZ = this.Righthindfootheel.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.99846-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.0785-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.24863-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -1.99846 + (((tickAnim - 10) / 9) * (-33.43581-(-1.99846)));
            yy = -0.0785 + (((tickAnim - 10) / 9) * (13.64287-(-0.0785)));
            zz = -2.24863 + (((tickAnim - 10) / 9) * (-4.13916-(-2.24863)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -33.43581 + (((tickAnim - 19) / 6) * (-48.25-(-33.43581)));
            yy = 13.64287 + (((tickAnim - 19) / 6) * (0-(13.64287)));
            zz = -4.13916 + (((tickAnim - 19) / 6) * (0-(-4.13916)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -48.25 + (((tickAnim - 25) / 4) * (-37.87628-(-48.25)));
            yy = 0 + (((tickAnim - 25) / 4) * (-12.23825-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (-2.95546-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -37.87628 + (((tickAnim - 29) / 4) * (16.32269-(-37.87628)));
            yy = -12.23825 + (((tickAnim - 29) / 4) * (-22.02886-(-12.23825)));
            zz = -2.95546 + (((tickAnim - 29) / 4) * (-5.31984-(-2.95546)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 16.32269 + (((tickAnim - 33) / 2) * (56.6-(16.32269)));
            yy = -22.02886 + (((tickAnim - 33) / 2) * (0-(-22.02886)));
            zz = -5.31984 + (((tickAnim - 33) / 2) * (0-(-5.31984)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 56.6 + (((tickAnim - 35) / 9) * (-28.24-(56.6)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -28.24 + (((tickAnim - 44) / 6) * (0-(-28.24)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoottoes, Righthindfoottoes.rotateAngleX + (float) Math.toRadians(xx), Righthindfoottoes.rotateAngleY + (float) Math.toRadians(yy), Righthindfoottoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 13) / 22) * (4-(4)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 35) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 13) / 22) * (4-(4)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 35) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-6.07641-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.02869-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (5.29093-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -6.07641 + (((tickAnim - 13) / 22) * (-6.07641-(-6.07641)));
            yy = -0.02869 + (((tickAnim - 13) / 22) * (-0.02869-(-0.02869)));
            zz = 5.29093 + (((tickAnim - 13) / 22) * (5.29093-(5.29093)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.07641 + (((tickAnim - 35) / 15) * (0-(-6.07641)));
            yy = -0.02869 + (((tickAnim - 35) / 15) * (0-(-0.02869)));
            zz = 5.29093 + (((tickAnim - 35) / 15) * (0-(5.29093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmUpper, leftArmUpper.rotateAngleX + (float) Math.toRadians(xx), leftArmUpper.rotateAngleY + (float) Math.toRadians(yy), leftArmUpper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (14-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 13) / 22) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 14 + (((tickAnim - 13) / 22) * (14-(14)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 35) / 15) * (0-(17.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 14 + (((tickAnim - 35) / 15) * (0-(14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmLower, leftArmLower.rotateAngleX + (float) Math.toRadians(xx), leftArmLower.rotateAngleY + (float) Math.toRadians(yy), leftArmLower.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.43984-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.47123-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-7.68852-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -5.43984 + (((tickAnim - 13) / 22) * (-5.43984-(-5.43984)));
            yy = -0.47123 + (((tickAnim - 13) / 22) * (-0.47123-(-0.47123)));
            zz = -7.68852 + (((tickAnim - 13) / 22) * (-7.68852-(-7.68852)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.43984 + (((tickAnim - 35) / 15) * (0-(-5.43984)));
            yy = -0.47123 + (((tickAnim - 35) / 15) * (0-(-0.47123)));
            zz = -7.68852 + (((tickAnim - 35) / 15) * (0-(-7.68852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = -0.425 + (((tickAnim - 13) / 22) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.425 + (((tickAnim - 35) / 15) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10.95179-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.42428-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.7029-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -10.95179 + (((tickAnim - 13) / 22) * (-10.95179-(-10.95179)));
            yy = -0.42428 + (((tickAnim - 13) / 22) * (-0.42428-(-0.42428)));
            zz = -6.7029 + (((tickAnim - 13) / 22) * (-6.7029-(-6.7029)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10.95179 + (((tickAnim - 35) / 15) * (0-(-10.95179)));
            yy = -0.42428 + (((tickAnim - 35) / 15) * (0-(-0.42428)));
            zz = -6.7029 + (((tickAnim - 35) / 15) * (0-(-6.7029)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmUpper, rightArmUpper.rotateAngleX + (float) Math.toRadians(xx), rightArmUpper.rotateAngleY + (float) Math.toRadians(yy), rightArmUpper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-3.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = -3.25 + (((tickAnim - 13) / 22) * (-3.25-(-3.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -3.25 + (((tickAnim - 35) / 15) * (0-(-3.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 22) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.15 + (((tickAnim - 35) / 15) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 13 && tickAnim < 35) {
            xx = -6 + (((tickAnim - 13) / 22) * (-6-(-6)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            yy = -5.75 + (((tickAnim - 17) / 18) * (-10.75-(-5.75)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -10.75 + (((tickAnim - 35) / 15) * (0-(-10.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-6.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            yy = -6.5 + (((tickAnim - 17) / 18) * (-11.25-(-6.5)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -11.25 + (((tickAnim - 35) / 15) * (0-(-11.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1.47216-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (5.79193-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.73001-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 1.47216 + (((tickAnim - 6) / 11) * (2.70419-(1.47216)));
            yy = 5.79193 + (((tickAnim - 6) / 11) * (-5.26618-(5.79193)));
            zz = 0.73001 + (((tickAnim - 6) / 11) * (0.36238-(0.73001)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 2.70419 + (((tickAnim - 17) / 6) * (7.75-(2.70419)));
            yy = -5.26618 + (((tickAnim - 17) / 6) * (-9.25-(-5.26618)));
            zz = 0.36238 + (((tickAnim - 17) / 6) * (0-(0.36238)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 23) / 12) * (2.75-(7.75)));
            yy = -9.25 + (((tickAnim - 23) / 12) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 2.75 + (((tickAnim - 35) / 8) * (1.42868-(2.75)));
            yy = -9.25 + (((tickAnim - 35) / 8) * (-10.61161-(-9.25)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.40436-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 1.42868 + (((tickAnim - 43) / 7) * (0-(1.42868)));
            yy = -10.61161 + (((tickAnim - 43) / 7) * (0-(-10.61161)));
            zz = -0.40436 + (((tickAnim - 43) / 7) * (0-(-0.40436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (11.4-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 6) / 11) * (0-(0)));
            yy = 11.4 + (((tickAnim - 6) / 11) * (-3-(11.4)));
            zz = 0 + (((tickAnim - 6) / 11) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0.53882-(0)));
            yy = -3 + (((tickAnim - 17) / 6) * (-9.74108-(-3)));
            zz = 0 + (((tickAnim - 17) / 6) * (-0.34927-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0.53882 + (((tickAnim - 23) / 6) * (4.67714-(0.53882)));
            yy = -9.74108 + (((tickAnim - 23) / 6) * (-19.63034-(-9.74108)));
            zz = -0.34927 + (((tickAnim - 23) / 6) * (-2.04624-(-0.34927)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 4.67714 + (((tickAnim - 29) / 6) * (0-(4.67714)));
            yy = -19.63034 + (((tickAnim - 29) / 6) * (-20.25-(-19.63034)));
            zz = -2.04624 + (((tickAnim - 29) / 6) * (0-(-2.04624)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = -20.25 + (((tickAnim - 35) / 8) * (-12.75-(-20.25)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = -12.75 + (((tickAnim - 43) / 7) * (0-(-12.75)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (18.17-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 18.17 + (((tickAnim - 6) / 5) * (12.33-(18.17)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 12.33 + (((tickAnim - 11) / 6) * (-6.25-(12.33)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-13.21313-(0)));
            yy = -6.25 + (((tickAnim - 17) / 6) * (-17.02051-(-6.25)));
            zz = 0 + (((tickAnim - 17) / 6) * (2.28591-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -13.21313 + (((tickAnim - 23) / 6) * (4.36764-(-13.21313)));
            yy = -17.02051 + (((tickAnim - 23) / 6) * (-14.21305-(-17.02051)));
            zz = 2.28591 + (((tickAnim - 23) / 6) * (-0.78108-(2.28591)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 4.36764 + (((tickAnim - 29) / 6) * (0-(4.36764)));
            yy = -14.21305 + (((tickAnim - 29) / 6) * (-22.25-(-14.21305)));
            zz = -0.78108 + (((tickAnim - 29) / 6) * (0-(-0.78108)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = -22.25 + (((tickAnim - 35) / 8) * (-22.87-(-22.25)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = -22.87 + (((tickAnim - 43) / 7) * (0-(-22.87)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMachimosaurus entity = (EntityPrehistoricFloraMachimosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = -2 + (((tickAnim - 18) / 13) * (-2-(-2)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 31) / 19) * (0-(-2)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -0.7 + (((tickAnim - 18) / 13) * (-0.7-(-0.7)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -0.7 + (((tickAnim - 31) / 19) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfootheel, Lefthindfootheel.rotateAngleX + (float) Math.toRadians(xx), Lefthindfootheel.rotateAngleY + (float) Math.toRadians(yy), Lefthindfootheel.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 18) * (0.725-(0.3)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = 0.725 + (((tickAnim - 18) / 13) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0.725 + (((tickAnim - 31) / 19) * (0.3-(0.725)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Lefthindfootheel.rotationPointX = this.Lefthindfootheel.rotationPointX + (float)(xx);
        this.Lefthindfootheel.rotationPointY = this.Lefthindfootheel.rotationPointY - (float)(yy);
        this.Lefthindfootheel.rotationPointZ = this.Lefthindfootheel.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfootheel, Righthindfootheel.rotateAngleX + (float) Math.toRadians(xx), Righthindfootheel.rotateAngleY + (float) Math.toRadians(yy), Righthindfootheel.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 18) * (0.725-(0.325)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = 0.725 + (((tickAnim - 18) / 13) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0.725 + (((tickAnim - 31) / 19) * (0.325-(0.725)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righthindfootheel.rotationPointX = this.Righthindfootheel.rotationPointX + (float)(xx);
        this.Righthindfootheel.rotationPointY = this.Righthindfootheel.rotationPointY - (float)(yy);
        this.Righthindfootheel.rotationPointZ = this.Righthindfootheel.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 5.75 + (((tickAnim - 18) / 13) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 31) / 19) * (0-(5.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 6 + (((tickAnim - 18) / 13) * (6-(6)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 31) / 19) * (0-(6)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraMachimosaurus entity = (EntityPrehistoricFloraMachimosaurus) entitylivingbaseIn;
        int animCycle = 37;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 5 + (((tickAnim - 0) / 26) * (51.2299-(5)));
            yy = -8.75 + (((tickAnim - 0) / 26) * (26.4284-(-8.75)));
            zz = 0 + (((tickAnim - 0) / 26) * (65.2034-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 51.2299 + (((tickAnim - 26) / 5) * (18.69052-(51.2299)));
            yy = 26.4284 + (((tickAnim - 26) / 5) * (9.253-(26.4284)));
            zz = 65.2034 + (((tickAnim - 26) / 5) * (38.7443-(65.2034)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 18.69052 + (((tickAnim - 31) / 7) * (5-(18.69052)));
            yy = 9.253 + (((tickAnim - 31) / 7) * (-8.75-(9.253)));
            zz = 38.7443 + (((tickAnim - 31) / 7) * (0-(38.7443)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = -42.25 + (((tickAnim - 0) / 26) * (25.9309-(-42.25)));
            yy = 0 + (((tickAnim - 0) / 26) * (-53.4815-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (-4.2575-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 25.9309 + (((tickAnim - 26) / 5) * (-45.06447-(25.9309)));
            yy = -53.4815 + (((tickAnim - 26) / 5) * (-7.588-(-53.4815)));
            zz = -4.2575 + (((tickAnim - 26) / 5) * (49.1647-(-4.2575)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -45.06447 + (((tickAnim - 31) / 7) * (-42.25-(-45.06447)));
            yy = -7.588 + (((tickAnim - 31) / 7) * (0-(-7.588)));
            zz = 49.1647 + (((tickAnim - 31) / 7) * (0-(49.1647)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0.875-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0.875 + (((tickAnim - 26) / 5) * (0.5-(0.875)));
            yy = -0.75 + (((tickAnim - 26) / 5) * (0.275-(-0.75)));
            zz = 0 + (((tickAnim - 26) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0.5 + (((tickAnim - 31) / 7) * (0-(0.5)));
            yy = 0.275 + (((tickAnim - 31) / 7) * (0-(0.275)));
            zz = -0.425 + (((tickAnim - 31) / 7) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftshin.rotationPointX = this.Leftshin.rotationPointX + (float)(xx);
        this.Leftshin.rotationPointY = this.Leftshin.rotationPointY - (float)(yy);
        this.Leftshin.rotationPointZ = this.Leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 34.25 + (((tickAnim - 0) / 8) * (3.84572-(34.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (-6.78433-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-7.54112-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 3.84572 + (((tickAnim - 8) / 4) * (-4.76599-(3.84572)));
            yy = -6.78433 + (((tickAnim - 8) / 4) * (-9.49807-(-6.78433)));
            zz = -7.54112 + (((tickAnim - 8) / 4) * (-10.55757-(-7.54112)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = -4.76599 + (((tickAnim - 12) / 14) * (46.22714-(-4.76599)));
            yy = -9.49807 + (((tickAnim - 12) / 14) * (-13.2182-(-9.49807)));
            zz = -10.55757 + (((tickAnim - 12) / 14) * (-12.6973-(-10.55757)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 46.22714 + (((tickAnim - 26) / 5) * (107.18509-(46.22714)));
            yy = -13.2182 + (((tickAnim - 26) / 5) * (6.5714-(-13.2182)));
            zz = -12.6973 + (((tickAnim - 26) / 5) * (-26.763-(-12.6973)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 107.18509 + (((tickAnim - 31) / 5) * (9.3117-(107.18509)));
            yy = 6.5714 + (((tickAnim - 31) / 5) * (2.19047-(6.5714)));
            zz = -26.763 + (((tickAnim - 31) / 5) * (-8.921-(-26.763)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 9.3117 + (((tickAnim - 36) / 2) * (34.25-(9.3117)));
            yy = 2.19047 + (((tickAnim - 36) / 2) * (0-(2.19047)));
            zz = -8.921 + (((tickAnim - 36) / 2) * (0-(-8.921)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfootheel, Lefthindfootheel.rotateAngleX + (float) Math.toRadians(xx), Lefthindfootheel.rotateAngleY + (float) Math.toRadians(yy), Lefthindfootheel.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0.8-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (-1.1-(0)));
            yy = 1.45 + (((tickAnim - 26) / 5) * (1.85-(1.45)));
            zz = 0.8 + (((tickAnim - 26) / 5) * (-0.925-(0.8)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -1.1 + (((tickAnim - 31) / 5) * (-0.27-(-1.1)));
            yy = 1.85 + (((tickAnim - 31) / 5) * (0.985-(1.85)));
            zz = -0.925 + (((tickAnim - 31) / 5) * (-0.23-(-0.925)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -0.27 + (((tickAnim - 36) / 2) * (0-(-0.27)));
            yy = 0.985 + (((tickAnim - 36) / 2) * (0-(0.985)));
            zz = -0.23 + (((tickAnim - 36) / 2) * (0-(-0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Lefthindfootheel.rotationPointX = this.Lefthindfootheel.rotationPointX + (float)(xx);
        this.Lefthindfootheel.rotationPointY = this.Lefthindfootheel.rotationPointY - (float)(yy);
        this.Lefthindfootheel.rotationPointZ = this.Lefthindfootheel.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 13.96334 + (((tickAnim - 0) / 8) * (51.2299-(13.96334)));
            yy = -29.32596 + (((tickAnim - 0) / 8) * (-26.42842-(-29.32596)));
            zz = -14.98743 + (((tickAnim - 0) / 8) * (-65.20338-(-14.98743)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 51.2299 + (((tickAnim - 8) / 7) * (18.69052-(51.2299)));
            yy = -26.42842 + (((tickAnim - 8) / 7) * (-9.25297-(-26.42842)));
            zz = -65.20338 + (((tickAnim - 8) / 7) * (-38.7443-(-65.20338)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 18.69052 + (((tickAnim - 15) / 7) * (5-(18.69052)));
            yy = -9.25297 + (((tickAnim - 15) / 7) * (8.75-(-9.25297)));
            zz = -38.7443 + (((tickAnim - 15) / 7) * (0-(-38.7443)));
        }
        else if (tickAnim >= 22 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 22) / 16) * (13.96334-(5)));
            yy = 8.75 + (((tickAnim - 22) / 16) * (-29.32596-(8.75)));
            zz = 0 + (((tickAnim - 22) / 16) * (-14.98743-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 0) / 8) * (25.93089-(10)));
            yy = 32.5 + (((tickAnim - 0) / 8) * (53.48153-(32.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.25749-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 25.93089 + (((tickAnim - 8) / 7) * (-45.06447-(25.93089)));
            yy = 53.48153 + (((tickAnim - 8) / 7) * (7.58799-(53.48153)));
            zz = 4.25749 + (((tickAnim - 8) / 7) * (-49.16465-(4.25749)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -45.06447 + (((tickAnim - 15) / 7) * (-46-(-45.06447)));
            yy = 7.58799 + (((tickAnim - 15) / 7) * (0-(7.58799)));
            zz = -49.16465 + (((tickAnim - 15) / 7) * (0-(-49.16465)));
        }
        else if (tickAnim >= 22 && tickAnim < 38) {
            xx = -46 + (((tickAnim - 22) / 16) * (10-(-46)));
            yy = 0 + (((tickAnim - 22) / 16) * (32.5-(0)));
            zz = 0 + (((tickAnim - 22) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.7 + (((tickAnim - 8) / 7) * (0.5-(-0.7)));
            yy = -0.65 + (((tickAnim - 8) / 7) * (0.275-(-0.65)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.425-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0.5 + (((tickAnim - 15) / 4) * (-0.375-(0.5)));
            yy = 0.275 + (((tickAnim - 15) / 4) * (0.595-(0.275)));
            zz = -0.425 + (((tickAnim - 15) / 4) * (0.46-(-0.425)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -0.375 + (((tickAnim - 19) / 3) * (0-(-0.375)));
            yy = 0.595 + (((tickAnim - 19) / 3) * (0-(0.595)));
            zz = 0.46 + (((tickAnim - 19) / 3) * (0-(0.46)));
        }
        else if (tickAnim >= 22 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 22) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightshin.rotationPointX = this.Rightshin.rotationPointX + (float)(xx);
        this.Rightshin.rotationPointY = this.Rightshin.rotationPointY - (float)(yy);
        this.Rightshin.rotationPointZ = this.Rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 19.75 + (((tickAnim - 0) / 8) * (93.72714-(19.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (13.21822-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (12.69728-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 93.72714 + (((tickAnim - 8) / 7) * (107.18509-(93.72714)));
            yy = 13.21822 + (((tickAnim - 8) / 7) * (-6.57143-(13.21822)));
            zz = 12.69728 + (((tickAnim - 8) / 7) * (26.76296-(12.69728)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 107.18509 + (((tickAnim - 15) / 4) * (81.37281-(107.18509)));
            yy = -6.57143 + (((tickAnim - 15) / 4) * (1.57256-(-6.57143)));
            zz = 26.76296 + (((tickAnim - 15) / 4) * (7.54742-(26.76296)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 81.37281 + (((tickAnim - 19) / 2) * (25-(81.37281)));
            yy = 1.57256 + (((tickAnim - 19) / 2) * (0-(1.57256)));
            zz = 7.54742 + (((tickAnim - 19) / 2) * (0-(7.54742)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 21) / 2) * (38-(25)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 38 + (((tickAnim - 23) / 8) * (6.25-(38)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 6.25 + (((tickAnim - 31) / 7) * (19.75-(6.25)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfootheel, Righthindfootheel.rotateAngleX + (float) Math.toRadians(xx), Righthindfootheel.rotateAngleY + (float) Math.toRadians(yy), Righthindfootheel.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (2.82-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 2.82 + (((tickAnim - 18) / 1) * (4.035-(2.82)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 4.035 + (((tickAnim - 19) / 2) * (0-(4.035)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righthindfootheel.rotationPointX = this.Righthindfootheel.rotationPointX + (float)(xx);
        this.Righthindfootheel.rotationPointY = this.Righthindfootheel.rotationPointY - (float)(yy);
        this.Righthindfootheel.rotationPointZ = this.Righthindfootheel.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -40.75 + (((tickAnim - 0) / 2) * (-70.08-(-40.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -70.08 + (((tickAnim - 2) / 6) * (-104.75-(-70.08)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -104.75 + (((tickAnim - 8) / 7) * (20.12663-(-104.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (17.20326-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (6.18612-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 20.12663 + (((tickAnim - 15) / 4) * (-19.5-(20.12663)));
            yy = 17.20326 + (((tickAnim - 15) / 4) * (0-(17.20326)));
            zz = 6.18612 + (((tickAnim - 15) / 4) * (0-(6.18612)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -19.5 + (((tickAnim - 19) / 4) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoottoes, Righthindfoottoes.rotateAngleX + (float) Math.toRadians(xx), Righthindfoottoes.rotateAngleY + (float) Math.toRadians(yy), Righthindfoottoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 0) / 2) * (3.51-(2.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 3.51 + (((tickAnim - 2) / 6) * (1.3-(3.51)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 1.3 + (((tickAnim - 8) / 7) * (1.325-(1.3)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 1.325 + (((tickAnim - 15) / 3) * (3.34-(1.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 3.34 + (((tickAnim - 18) / 5) * (0-(3.34)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righthindfoottoes.rotationPointX = this.Righthindfoottoes.rotationPointX + (float)(xx);
        this.Righthindfoottoes.rotationPointY = this.Righthindfoottoes.rotationPointY - (float)(yy);
        this.Righthindfoottoes.rotationPointZ = this.Righthindfoottoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 0) / 18) * (185.0624-(15)));
            yy = 27.5 + (((tickAnim - 0) / 18) * (2.21544-(27.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (-142.24888-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 185.0624 + (((tickAnim - 18) / 3) * (172.953-(185.0624)));
            yy = 2.21544 + (((tickAnim - 18) / 3) * (-4.1057-(2.21544)));
            zz = -142.24888 + (((tickAnim - 18) / 3) * (-177.8111-(-142.24888)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = 172.953 + (((tickAnim - 21) / 17) * (15-(172.953)));
            yy = -4.1057 + (((tickAnim - 21) / 17) * (27.5-(-4.1057)));
            zz = -177.8111 + (((tickAnim - 21) / 17) * (0-(-177.8111)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmUpper, leftArmUpper.rotateAngleX + (float) Math.toRadians(xx), leftArmUpper.rotateAngleY + (float) Math.toRadians(yy), leftArmUpper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 0) / 13) * (-96.52756-(35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 0 + (((tickAnim - 0) / 13) * (24.41161-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-108.99978-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -96.52756 + (((tickAnim - 13) / 5) * (128.37221-(-96.52756)));
            yy = 24.41161 + (((tickAnim - 13) / 5) * (6.78964-(24.41161)));
            zz = -108.99978 + (((tickAnim - 13) / 5) * (139.83588-(-108.99978)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 128.37221 + (((tickAnim - 18) / 3) * (85.24606-(128.37221)));
            yy = 6.78964 + (((tickAnim - 18) / 3) * (9.8492-(6.78964)));
            zz = 139.83588 + (((tickAnim - 18) / 3) * (87.8246-(139.83588)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = 85.24606 + (((tickAnim - 21) / 17) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(85.24606)));
            yy = 9.8492 + (((tickAnim - 21) / 17) * (0-(9.8492)));
            zz = 87.8246 + (((tickAnim - 21) / 17) * (0-(87.8246)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmLower, leftArmLower.rotateAngleX + (float) Math.toRadians(xx), leftArmLower.rotateAngleY + (float) Math.toRadians(yy), leftArmLower.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0.375-(0)));
            yy = 0.525 + (((tickAnim - 13) / 5) * (0.425-(0.525)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0.375 + (((tickAnim - 18) / 3) * (0-(0.375)));
            yy = 0.425 + (((tickAnim - 18) / 3) * (0-(0.425)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArmLower.rotationPointX = this.leftArmLower.rotationPointX + (float)(xx);
        this.leftArmLower.rotationPointY = this.leftArmLower.rotationPointY - (float)(yy);
        this.leftArmLower.rotationPointZ = this.leftArmLower.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 37.95355 + (((tickAnim - 0) / 13) * (82.54769-(37.95355)));
            yy = 4.91564 + (((tickAnim - 0) / 13) * (-8.20679-(4.91564)));
            zz = 6.23061 + (((tickAnim - 0) / 13) * (5.9014-(6.23061)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 82.54769 + (((tickAnim - 13) / 5) * (-16.04857-(82.54769)));
            yy = -8.20679 + (((tickAnim - 13) / 5) * (5.3827-(-8.20679)));
            zz = 5.9014 + (((tickAnim - 13) / 5) * (8.29246-(5.9014)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -16.04857 + (((tickAnim - 18) / 3) * (15.59368-(-16.04857)));
            yy = 5.3827 + (((tickAnim - 18) / 3) * (13.5364-(5.3827)));
            zz = 8.29246 + (((tickAnim - 18) / 3) * (9.7271-(8.29246)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 15.59368 + (((tickAnim - 21) / 6) * (-31.22632-(15.59368)));
            yy = 13.5364 + (((tickAnim - 21) / 6) * (10.46171-(13.5364)));
            zz = 9.7271 + (((tickAnim - 21) / 6) * (-4.07889-(9.7271)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -31.22632 + (((tickAnim - 27) / 4) * (-19.54387-(-31.22632)));
            yy = 10.46171 + (((tickAnim - 27) / 4) * (-0.2936-(10.46171)));
            zz = -4.07889 + (((tickAnim - 27) / 4) * (-3.28762-(-4.07889)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -19.54387 + (((tickAnim - 31) / 7) * (37.95355-(-19.54387)));
            yy = -0.2936 + (((tickAnim - 31) / 7) * (4.91564-(-0.2936)));
            zz = -3.28762 + (((tickAnim - 31) / 7) * (6.23061-(-3.28762)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.225-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 13) / 5) * (0-(1.225)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0.225-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 21) / 6) * (1.31-(0.225)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 1.31 + (((tickAnim - 27) / 4) * (0-(1.31)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -185.20296 + (((tickAnim - 0) / 8) * (-125.03571-(-185.20296)));
            yy = 4.10574 + (((tickAnim - 0) / 8) * (-5.43889-(4.10574)));
            zz = -177.81106 + (((tickAnim - 0) / 8) * (-124.26937-(-177.81106)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -125.03571 + (((tickAnim - 8) / 1) * (-101.32429-(-125.03571)));
            yy = -5.43889 + (((tickAnim - 8) / 1) * (-9.45289-(-5.43889)));
            zz = -124.26937 + (((tickAnim - 8) / 1) * (-101.75243-(-124.26937)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -101.32429 + (((tickAnim - 9) / 11) * (-4.46768-(-101.32429)));
            yy = -9.45289 + (((tickAnim - 9) / 11) * (-25.47672-(-9.45289)));
            zz = -101.75243 + (((tickAnim - 9) / 11) * (-11.86496-(-101.75243)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -4.46768 + (((tickAnim - 20) / 9) * (73.40648-(-4.46768)));
            yy = -25.47672 + (((tickAnim - 20) / 9) * (-51.37867-(-25.47672)));
            zz = -11.86496 + (((tickAnim - 20) / 9) * (61.05101-(-11.86496)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 73.40648 + (((tickAnim - 29) / 4) * (104.81523-(73.40648)));
            yy = -51.37867 + (((tickAnim - 29) / 4) * (-8.36984-(-51.37867)));
            zz = 61.05101 + (((tickAnim - 29) / 4) * (69.57534-(61.05101)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 104.81523 + (((tickAnim - 33) / 5) * (172.76285-(104.81523)));
            yy = -8.36984 + (((tickAnim - 33) / 5) * (2.23402-(-8.36984)));
            zz = 69.57534 + (((tickAnim - 33) / 5) * (177.34681-(69.57534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmUpper, rightArmUpper.rotateAngleX + (float) Math.toRadians(xx), rightArmUpper.rotateAngleY + (float) Math.toRadians(yy), rightArmUpper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 85.24606 + (((tickAnim - 0) / 9) * (95.40772-(85.24606)));
            yy = -9.84915 + (((tickAnim - 0) / 9) * (-28.31025-(-9.84915)));
            zz = -87.82461 + (((tickAnim - 0) / 9) * (-41.20579-(-87.82461)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 95.40772 + (((tickAnim - 9) / 6) * (46.95743-(95.40772)));
            yy = -28.31025 + (((tickAnim - 9) / 6) * (-10.11948-(-28.31025)));
            zz = -41.20579 + (((tickAnim - 9) / 6) * (14.88078-(-41.20579)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 46.95743 + (((tickAnim - 15) / 5) * (39.59992-(46.95743)));
            yy = -10.11948 + (((tickAnim - 15) / 5) * (4.0344-(-10.11948)));
            zz = 14.88078 + (((tickAnim - 15) / 5) * (-6.34861-(14.88078)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 39.59992 + (((tickAnim - 20) / 8) * (-35.47363-(39.59992)));
            yy = 4.0344 + (((tickAnim - 20) / 8) * (-21.65233-(4.0344)));
            zz = -6.34861 + (((tickAnim - 20) / 8) * (-20.2801-(-6.34861)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -35.47363 + (((tickAnim - 28) / 5) * (-24.377-(-35.47363)));
            yy = -21.65233 + (((tickAnim - 28) / 5) * (4.47032-(-21.65233)));
            zz = -20.2801 + (((tickAnim - 28) / 5) * (-53.88074-(-20.2801)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -24.377 + (((tickAnim - 33) / 2) * (49.64417-(-24.377)));
            yy = 4.47032 + (((tickAnim - 33) / 2) * (5.74225-(4.47032)));
            zz = -53.88074 + (((tickAnim - 33) / 2) * (-97.71261-(-53.88074)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 49.64417 + (((tickAnim - 35) / 3) * (85.24606-(49.64417)));
            yy = 5.74225 + (((tickAnim - 35) / 3) * (-9.84915-(5.74225)));
            zz = -97.71261 + (((tickAnim - 35) / 3) * (-87.82461-(-97.71261)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmLower, rightArmLower.rotateAngleX + (float) Math.toRadians(xx), rightArmLower.rotateAngleY + (float) Math.toRadians(yy), rightArmLower.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -0.75 + (((tickAnim - 28) / 5) * (-0.375-(-0.75)));
            yy = -0.425 + (((tickAnim - 28) / 5) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -0.375 + (((tickAnim - 33) / 5) * (0-(-0.375)));
            yy = -0.425 + (((tickAnim - 33) / 5) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArmLower.rotationPointX = this.rightArmLower.rotationPointX + (float)(xx);
        this.rightArmLower.rotationPointY = this.rightArmLower.rotationPointY - (float)(yy);
        this.rightArmLower.rotationPointZ = this.rightArmLower.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15.59368 + (((tickAnim - 0) / 4) * (11.52643-(15.59368)));
            yy = -13.53642 + (((tickAnim - 0) / 4) * (-10.46834-(-13.53642)));
            zz = -9.72706 + (((tickAnim - 0) / 4) * (-8.24226-(-9.72706)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 11.52643 + (((tickAnim - 4) / 5) * (0.3967-(11.52643)));
            yy = -10.46834 + (((tickAnim - 4) / 5) * (-5.0202-(-10.46834)));
            zz = -8.24226 + (((tickAnim - 4) / 5) * (-9.79472-(-8.24226)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0.3967 + (((tickAnim - 9) / 3) * (1.89827-(0.3967)));
            yy = -5.0202 + (((tickAnim - 9) / 3) * (-4.53686-(-5.0202)));
            zz = -9.79472 + (((tickAnim - 9) / 3) * (-8.04703-(-9.79472)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1.89827 + (((tickAnim - 12) / 3) * (-8.48582-(1.89827)));
            yy = -4.53686 + (((tickAnim - 12) / 3) * (-2.63164-(-4.53686)));
            zz = -8.04703 + (((tickAnim - 12) / 3) * (-1.15795-(-8.04703)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -8.48582 + (((tickAnim - 15) / 5) * (0-(-8.48582)));
            yy = -2.63164 + (((tickAnim - 15) / 5) * (0-(-2.63164)));
            zz = -1.15795 + (((tickAnim - 15) / 5) * (0-(-1.15795)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (91.68052-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (-6.01619-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (-4.32314-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 91.68052 + (((tickAnim - 28) / 4) * (117.5-(91.68052)));
            yy = -6.01619 + (((tickAnim - 28) / 4) * (-43.25-(-6.01619)));
            zz = -4.32314 + (((tickAnim - 28) / 4) * (0-(-4.32314)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 117.5 + (((tickAnim - 32) / 2) * (14.29863-(117.5)));
            yy = -43.25 + (((tickAnim - 32) / 2) * (-40.99332-(-43.25)));
            zz = 0 + (((tickAnim - 32) / 2) * (-16.31622-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 14.29863 + (((tickAnim - 34) / 4) * (15.59368-(14.29863)));
            yy = -40.99332 + (((tickAnim - 34) / 4) * (-13.53642-(-40.99332)));
            zz = -16.31622 + (((tickAnim - 34) / 4) * (-9.72706-(-16.31622)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.335-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = -0.335 + (((tickAnim - 4) / 5) * (-0.25-(-0.335)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 9) / 6) * (0.805-(-0.25)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.805 + (((tickAnim - 15) / 5) * (0.7-(0.805)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 20) / 8) * (1.7-(0.7)));
            zz = 0 + (((tickAnim - 20) / 8) * (-0.6-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.7 + (((tickAnim - 28) / 4) * (1.28-(1.7)));
            zz = -0.6 + (((tickAnim - 28) / 4) * (-0.24-(-0.6)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 1.28 + (((tickAnim - 32) / 2) * (0-(1.28)));
            zz = -0.24 + (((tickAnim - 32) / 2) * (0-(-0.24)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 12) / 14) * (-90.25-(0)));
            yy = 0 + (((tickAnim - 12) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 14) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -90.25 + (((tickAnim - 26) / 5) * (43.75-(-90.25)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 43.75 + (((tickAnim - 31) / 5) * (-6.42-(43.75)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -6.42 + (((tickAnim - 36) / 2) * (0-(-6.42)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoottoes, Lefthindfoottoes.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoottoes.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoottoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (2.1-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 2.1 + (((tickAnim - 19) / 7) * (0-(2.1)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (1.275-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 1.275 + (((tickAnim - 31) / 5) * (0-(1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Lefthindfoottoes.rotationPointX = this.Lefthindfoottoes.rotationPointX + (float)(xx);
        this.Lefthindfoottoes.rotationPointY = this.Lefthindfoottoes.rotationPointY - (float)(yy);
        this.Lefthindfoottoes.rotationPointZ = this.Lefthindfoottoes.rotationPointZ + (float)(zz);
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-30))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.391-40))*-0.22);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.391-40))*-0.2);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-130))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-70))*1));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-120))*-2.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-130))*1));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-190))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78+60))*-3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.391-40))*-0.07);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-140))*2));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.391-50))*-0.05);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-220))*2));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.391-70))*-0.05);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-290))*2));
        this.throatPouch.rotationPointX = this.throatPouch.rotationPointX + (float)(0);
        this.throatPouch.rotationPointY = this.throatPouch.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.391-90))*-0.1);
        this.throatPouch.rotationPointZ = this.throatPouch.rotationPointZ + (float)(0);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-30))*0.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-90))*0.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-20))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-150))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-50))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-190))*2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-70))*2));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-240))*2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.78-90))*2));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMachimosaurus entity = (EntityPrehistoricFloraMachimosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(126.7463+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665))*2), Leftthigh.rotateAngleY + (float) Math.toRadians(-17.4915), Leftthigh.rotateAngleZ + (float) Math.toRadians(66.9466));
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(-58.9643+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-120))*2), Leftshin.rotateAngleY + (float) Math.toRadians(18.3789), Leftshin.rotateAngleZ + (float) Math.toRadians(4.0646));
        this.setRotateAngle(Lefthindfootheel, Lefthindfootheel.rotateAngleX + (float) Math.toRadians(97.75), Lefthindfootheel.rotateAngleY + (float) Math.toRadians(0), Lefthindfootheel.rotateAngleZ + (float) Math.toRadians(0));
        this.Lefthindfootheel.rotationPointX = this.Lefthindfootheel.rotationPointX + (float)(0);
        this.Lefthindfootheel.rotationPointY = this.Lefthindfootheel.rotationPointY - (float)(0);
        this.Lefthindfootheel.rotationPointZ = this.Lefthindfootheel.rotationPointZ + (float)(-0.625);
        this.setRotateAngle(Lefthindfoottoes, Lefthindfoottoes.rotateAngleX + (float) Math.toRadians(23), Lefthindfoottoes.rotateAngleY + (float) Math.toRadians(0), Lefthindfoottoes.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(126.7463+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665))*-2), Rightthigh.rotateAngleY + (float) Math.toRadians(17.4915), Rightthigh.rotateAngleZ + (float) Math.toRadians(-66.9466));
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(-58.9643+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-120))*-2), Rightshin.rotateAngleY + (float) Math.toRadians(-18.37893), Rightshin.rotateAngleZ + (float) Math.toRadians(-4.0646));
        this.setRotateAngle(Righthindfootheel, Righthindfootheel.rotateAngleX + (float) Math.toRadians(97.75), Righthindfootheel.rotateAngleY + (float) Math.toRadians(0), Righthindfootheel.rotateAngleZ + (float) Math.toRadians(0));
        this.Righthindfootheel.rotationPointX = this.Righthindfootheel.rotationPointX + (float)(0);
        this.Righthindfootheel.rotationPointY = this.Righthindfootheel.rotationPointY - (float)(0);
        this.Righthindfootheel.rotationPointZ = this.Righthindfootheel.rotationPointZ + (float)(-0.625);
        this.setRotateAngle(Righthindfoottoes, Righthindfoottoes.rotateAngleX + (float) Math.toRadians(23), Righthindfoottoes.rotateAngleY + (float) Math.toRadians(0), Righthindfoottoes.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArmUpper, leftArmUpper.rotateAngleX + (float) Math.toRadians(5.5), leftArmUpper.rotateAngleY + (float) Math.toRadians(22.5), leftArmUpper.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArmLower, leftArmLower.rotateAngleX + (float) Math.toRadians(68.73276), leftArmLower.rotateAngleY + (float) Math.toRadians(-12.9996), leftArmLower.rotateAngleZ + (float) Math.toRadians(27.2197));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(97), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArmUpper, rightArmUpper.rotateAngleX + (float) Math.toRadians(5.5), rightArmUpper.rotateAngleY + (float) Math.toRadians(-22.5), rightArmUpper.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArmLower, rightArmLower.rotateAngleX + (float) Math.toRadians(68.73276), rightArmLower.rotateAngleY + (float) Math.toRadians(12.99965), rightArmLower.rotateAngleZ + (float) Math.toRadians(-27.21969));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(97), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-40))*-1), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665))*-0.3);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-60))*-1.2), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-90))*1.2), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-160))*1.2), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-200))*-1.2), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-20))*1.2), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-20))*1.2), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-60))*4), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-90))*9), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-170))*12), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-200))*17), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-280))*22), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMachimosaurus entity = (EntityPrehistoricFloraMachimosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(126.7463+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665))*2), Leftthigh.rotateAngleY + (float) Math.toRadians(-17.4915), Leftthigh.rotateAngleZ + (float) Math.toRadians(66.9466));
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(-58.9643+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-120))*2), Leftshin.rotateAngleY + (float) Math.toRadians(18.3789), Leftshin.rotateAngleZ + (float) Math.toRadians(4.0646));
        this.setRotateAngle(Lefthindfootheel, Lefthindfootheel.rotateAngleX + (float) Math.toRadians(97.75), Lefthindfootheel.rotateAngleY + (float) Math.toRadians(0), Lefthindfootheel.rotateAngleZ + (float) Math.toRadians(0));
        this.Lefthindfootheel.rotationPointX = this.Lefthindfootheel.rotationPointX + (float)(0);
        this.Lefthindfootheel.rotationPointY = this.Lefthindfootheel.rotationPointY - (float)(0);
        this.Lefthindfootheel.rotationPointZ = this.Lefthindfootheel.rotationPointZ + (float)(-0.625);
        this.setRotateAngle(Lefthindfoottoes, Lefthindfoottoes.rotateAngleX + (float) Math.toRadians(23), Lefthindfoottoes.rotateAngleY + (float) Math.toRadians(0), Lefthindfoottoes.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(126.7463+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665))*-2), Rightthigh.rotateAngleY + (float) Math.toRadians(17.4915), Rightthigh.rotateAngleZ + (float) Math.toRadians(-66.9466));
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(-58.9643+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-120))*-2), Rightshin.rotateAngleY + (float) Math.toRadians(-18.37893), Rightshin.rotateAngleZ + (float) Math.toRadians(-4.0646));
        this.setRotateAngle(Righthindfootheel, Righthindfootheel.rotateAngleX + (float) Math.toRadians(97.75), Righthindfootheel.rotateAngleY + (float) Math.toRadians(0), Righthindfootheel.rotateAngleZ + (float) Math.toRadians(0));
        this.Righthindfootheel.rotationPointX = this.Righthindfootheel.rotationPointX + (float)(0);
        this.Righthindfootheel.rotationPointY = this.Righthindfootheel.rotationPointY - (float)(0);
        this.Righthindfootheel.rotationPointZ = this.Righthindfootheel.rotationPointZ + (float)(-0.625);
        this.setRotateAngle(Righthindfoottoes, Righthindfoottoes.rotateAngleX + (float) Math.toRadians(23), Righthindfoottoes.rotateAngleY + (float) Math.toRadians(0), Righthindfoottoes.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArmUpper, leftArmUpper.rotateAngleX + (float) Math.toRadians(5.5), leftArmUpper.rotateAngleY + (float) Math.toRadians(22.5), leftArmUpper.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArmLower, leftArmLower.rotateAngleX + (float) Math.toRadians(68.73276), leftArmLower.rotateAngleY + (float) Math.toRadians(-12.9996), leftArmLower.rotateAngleZ + (float) Math.toRadians(27.2197));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(97), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArmUpper, rightArmUpper.rotateAngleX + (float) Math.toRadians(5.5), rightArmUpper.rotateAngleY + (float) Math.toRadians(-22.5), rightArmUpper.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArmLower, rightArmLower.rotateAngleX + (float) Math.toRadians(68.73276), rightArmLower.rotateAngleY + (float) Math.toRadians(12.99965), rightArmLower.rotateAngleZ + (float) Math.toRadians(-27.21969));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(97), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-40))*-2), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333))*-0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-60))*-1.2), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-90))*2), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.334-160))*2), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-200))*-2), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-20))*2), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-20))*2), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.334-60))*7), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-90))*12), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.334-170))*19), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-200))*24), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.334-280))*28), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMachimosaurus e = (EntityPrehistoricFloraMachimosaurus) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(10);
            animator.rotate(neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(jaw, (float) Math.toRadians(17), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(10);
            animator.resetKeyframe(10);


    }
}
