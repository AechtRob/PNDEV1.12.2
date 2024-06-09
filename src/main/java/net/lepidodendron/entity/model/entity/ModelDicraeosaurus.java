package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDicraeosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDicraeosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer upperarmL;
    private final AdvancedModelRenderer lowerarmL;
    private final AdvancedModelRenderer handL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer upperarmR;
    private final AdvancedModelRenderer lowerarmR;
    private final AdvancedModelRenderer handR;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer lowerjaw;
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
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer upperlegR;
    private final AdvancedModelRenderer lowerlegR;
    private final AdvancedModelRenderer footR;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer upperlegL;
    private final AdvancedModelRenderer lowerlegL;
    private final AdvancedModelRenderer footL;
    private final AdvancedModelRenderer cube_r45;

    private ModelAnimator animator;

    public ModelDicraeosaurus() {
        this.textureWidth = 290;
        this.textureHeight = 290;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, -14.0F, 7.775F);
        this.setRotateAngle(root, 0.0F, 3.1416F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 5.25F, -7.65F);
        this.root.addChild(hips);
        this.hips.cubeList.add(new ModelBox(hips, 180, 73, -11.0F, -10.875F, -9.725F, 22, 24, 16, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.55F, -6.125F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5288F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 230, 43, -5.0F, -1.525F, -9.2F, 10, 6, 13, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -11.8F, 1.275F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 141, 176, -13.0F, -2.325F, 2.0F, 26, 30, 24, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 92, 222, -6.0F, -6.925F, 5.85F, 12, 6, 14, 0.005F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.575F, 5.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.24F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 228, 11, -5.75F, -2.0F, -11.35F, 11, 7, 13, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.6845F, 24.3118F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2356F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 190, 56, -5.75F, -2.975F, -5.3F, 11, 6, 9, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 10.425F, 24.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 50, 183, -10.525F, -9.25F, -0.9F, 20, 24, 12, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 15.7F, 5.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1833F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 172, 142, -9.5F, -2.9F, -7.0F, 18, 3, 13, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -11.35F, 9.8F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3447F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 204, 232, -5.0F, -1.35F, -8.2F, 10, 6, 10, 0.0F, false));

        this.upperarmL = new AdvancedModelRenderer(this);
        this.upperarmL.setRotationPoint(-9.7F, 10.2755F, 7.1865F);
        this.chest.addChild(upperarmL);
        this.setRotateAngle(upperarmL, -0.0698F, 0.0F, 0.0F);
        this.upperarmL.cubeList.add(new ModelBox(upperarmL, 149, 249, -3.5F, -1.775F, -3.5F, 7, 13, 7, 0.0F, false));

        this.lowerarmL = new AdvancedModelRenderer(this);
        this.lowerarmL.setRotationPoint(-2.0F, 11.2F, -0.325F);
        this.upperarmL.addChild(lowerarmL);
        this.setRotateAngle(lowerarmL, 0.2094F, 0.0F, 0.0F);
        this.lowerarmL.cubeList.add(new ModelBox(lowerarmL, 248, 152, -1.0F, -1.7994F, -2.1811F, 6, 10, 5, 0.0F, false));

        this.handL = new AdvancedModelRenderer(this);
        this.handL.setRotationPoint(1.725F, 6.5006F, 0.7939F);
        this.lowerarmL.addChild(handL);
        this.setRotateAngle(handL, -0.1396F, 0.0F, 0.0F);
        this.handL.cubeList.add(new ModelBox(handL, 42, 130, -2.25F, 1.4407F, -2.1452F, 5, 5, 4, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.0F, 3.0657F, 0.1298F);
        this.handL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.0908F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 57, 0.925F, 0.825F, -0.5F, 2, 1, 1, 0.0F, false));

        this.upperarmR = new AdvancedModelRenderer(this);
        this.upperarmR.setRotationPoint(9.7F, 10.8005F, 7.1865F);
        this.chest.addChild(upperarmR);
        this.setRotateAngle(upperarmR, -0.0698F, 0.0F, 0.0F);
        this.upperarmR.cubeList.add(new ModelBox(upperarmR, 245, 207, -3.5F, -1.825F, -3.5F, 7, 13, 7, 0.0F, false));

        this.lowerarmR = new AdvancedModelRenderer(this);
        this.lowerarmR.setRotationPoint(2.0F, 11.2F, -0.35F);
        this.upperarmR.addChild(lowerarmR);
        this.setRotateAngle(lowerarmR, 0.2094F, 0.0F, 0.0F);
        this.lowerarmR.cubeList.add(new ModelBox(lowerarmR, 22, 20, -5.0F, -2.1994F, -2.1811F, 6, 10, 5, 0.0F, false));

        this.handR = new AdvancedModelRenderer(this);
        this.handR.setRotationPoint(-2.25F, 8.8006F, 0.4939F);
        this.lowerarmR.addChild(handR);
        this.setRotateAngle(handR, -0.1396F, 0.0F, 0.0F);
        this.handR.cubeList.add(new ModelBox(handR, 74, 121, -2.25F, -1.3093F, -1.9202F, 5, 5, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.0F, 3.0657F, 0.1298F);
        this.handR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.0908F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 94, -0.325F, -0.05F, -0.5F, 2, 1, 1, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.5595F, 10.0143F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 188, 0, -7.0F, -5.5858F, -2.2657F, 14, 12, 12, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -9.3608F, 3.3093F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2793F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 81, 242, -4.0F, -1.225F, -4.0F, 8, 6, 11, 0.005F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.6642F, 0.9843F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.0385F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 130, 186, -6.5F, -4.0F, -2.35F, 13, 9, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -4.9858F, 10.1843F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 144, 230, -5.025F, 0.075F, -1.425F, 10, 9, 10, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 241, 192, -3.0F, -3.15F, -1.975F, 6, 4, 11, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 3.5F, 8.5F);
        this.neck2.addChild(neck3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -6.0856F, 0.0204F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1004F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 3, -1.875F, 0.3113F, -2.3241F, 4, 5, 11, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.2644F, 5.8704F);
        this.neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0916F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 244, 101, -3.35F, -3.575F, -6.875F, 7, 6, 12, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(-0.025F, -0.3606F, 9.9954F);
        this.neck3.addChild(neck4);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.729F, 4.8998F);
        this.neck4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1134F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 175, 1, -1.325F, -0.525F, -7.3F, 3, 3, 8, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.9906F, 11.954F);
        this.neck4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3403F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 219, -1.325F, -0.5727F, -7.0611F, 3, 3, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.429F, 2.0248F);
        this.neck4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1396F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 173, -2.25F, -0.65F, -1.85F, 5, 5, 10, -0.005F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.025F, -0.679F, 9.4998F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.2531F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 218, 113, -2.225F, -1.791F, -0.448F, 5, 4, 5, 0.009F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 2.3967F, 9.7069F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 14, 0.225F, -0.15F, -0.825F, 0, 1, 2, -0.001F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 14, -1.775F, -0.15F, -0.825F, 0, 1, 2, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.6881F, 2.7664F, 9.7936F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.6364F, -1.3697F, -1.6352F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 53, -2.65F, -0.425F, -0.425F, 4, 1, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.1F, 2.8805F, 10.5748F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1571F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 54, -0.875F, -0.775F, 0.4F, 2, 1, 0, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.7381F, 2.7664F, 9.7936F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.6364F, 1.3697F, 1.6352F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 53, -1.35F, -0.425F, -0.025F, 4, 1, 0, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.025F, 2.7583F, 10.7161F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2051F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -1.3F, -0.6F, 0.45F, 3, 1, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.441F, 1.552F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1484F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 48, 118, -1.3F, -1.325F, -2.4F, 3, 2, 3, 0.002F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.441F, 1.552F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 48, 118, -1.275F, -1.5F, -0.2F, 3, 2, 3, 0.009F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.291F, 5.427F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4581F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 129, 49, -1.275F, -0.825F, -2.8F, 3, 2, 8, 0.007F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 2.209F, 10.652F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6152F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 106, 95, -1.275F, -0.875F, -1.625F, 3, 1, 2, 0.008F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.109F, 8.927F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1047F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 106, 98, -1.275F, -0.85F, -1.45F, 3, 2, 2, 0.009F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.184F, 5.527F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2051F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 74, 130, -1.825F, -1.5F, -2.575F, 4, 3, 5, 0.009F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(-2.2F, 2.634F, 1.627F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.2705F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.2125F, 2.769F, 9.0456F);
        this.lowerjaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2313F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 12, 54, -0.9125F, -0.2F, -0.35F, 2, 2, 0, -0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.2125F, 2.769F, 9.0456F);
        this.lowerjaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2836F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 29, 1, -1.3125F, -0.275F, -0.025F, 3, 1, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.4F, 2.8536F, 7.4712F);
        this.lowerjaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2313F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 13, -0.125F, -0.675F, -0.85F, 0, 1, 2, -0.001F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.525F, 2.928F, 7.4614F);
        this.lowerjaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2007F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 15, -0.225F, -0.65F, -0.825F, 0, 1, 2, -0.001F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(4.45F, 2.675F, 6.975F);
        this.lowerjaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.2836F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 2, 36, -0.6F, -0.775F, -3.0F, 0, 1, 5, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 2.675F, 6.975F);
        this.lowerjaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2837F, -0.0209F, 0.0061F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 55, 0.975F, -0.75F, -3.025F, 0, 1, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 3.7928F, 7.1689F);
        this.lowerjaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.7636F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 106, 91, 0.875F, -0.45F, -0.65F, 3, 2, 2, -0.088F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 3.45F, 8.35F);
        this.lowerjaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.5105F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 97, 121, 0.875F, -0.225F, -1.55F, 3, 2, 2, -0.001F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.375F, 3.4377F, 5.4292F);
        this.lowerjaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.6414F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 49, 94, -1.5F, -0.325F, -1.775F, 3, 1, 3, -0.008F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 1.975F, 6.825F);
        this.lowerjaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4538F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 101, 25, 0.375F, 0.35F, -1.5F, 4, 2, 2, -0.001F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.0F, 3.35F);
        this.lowerjaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.5105F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 100, 149, 0.375F, -0.475F, -1.775F, 4, 2, 5, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(2.2F, 2.7296F, 2.9802F);
        this.lowerjaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.4625F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 139, 67, -1.825F, -1.025F, -2.875F, 4, 1, 6, -0.002F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerjaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2967F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 128, 104, -0.025F, -0.675F, -2.1F, 5, 2, 5, -0.003F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(2.2F, -1.925F, -0.1F);
        this.lowerjaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1353F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 152, 122, -1.825F, 1.1F, -0.275F, 4, 2, 3, -0.001F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(1.9208F, 1.0636F, -0.6751F);
        this.lowerjaw.addChild(throat);
        this.setRotateAngle(throat, 0.096F, 0.0F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-2.1958F, -0.7136F, 0.6751F);
        this.throat.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3447F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 97, 139, 1.2F, -0.35F, -0.85F, 3, 2, 5, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(2.4208F, 1.1136F, -0.6751F);
        this.lowerjaw.addChild(throat2);
        this.setRotateAngle(throat2, -0.144F, 0.0174F, -0.0017F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.2208F, -0.5136F, -2.5999F);
        this.throat2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2357F, -0.0258F, 0.0044F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 62, 149, -1.2206F, -1.4174F, -2.7619F, 3, 2, 5, 0.055F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.481F, -3.1613F, -13.3266F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1876F, -0.0043F, -0.0008F);
        this.tail.cubeList.add(new ModelBox(tail, 183, 25, -7.975F, -3.9758F, -6.2019F, 15, 16, 15, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.225F, -5.5258F, -1.8519F);
        this.tail.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.4669F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 194, 157, -4.6F, 0.425F, -3.725F, 8, 3, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, -1.6008F, -6.9519F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, -0.0083F, -0.003F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 191, -6.5F, -2.0F, -10.0F, 11, 13, 14, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-1.375F, 2.425F, -11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0044F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 221, 127, -4.25F, -4.0837F, -11.9707F, 9, 10, 15, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(1.0F, -1.7837F, -12.7457F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1405F, 0.0F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0218F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 186, 116, -4.25F, -2.25F, -15.0F, 7, 8, 18, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(-0.225F, -0.5F, -14.7F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1047F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 44, 220, -2.5695F, -1.2847F, -18.3904F, 4, 5, 20, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(-0.8695F, 0.4653F, -17.8404F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 91, 196, -1.2F, -1.6864F, -22.6627F, 3, 3, 23, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(1.025F, -1.4364F, -22.1627F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, 0.1071F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 218, 207, -1.65F, -0.149F, -23.4803F, 2, 2, 23, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(-0.6F, 0.601F, -23.4303F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, 0.2447F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 183, 229, -0.6F, -0.5837F, -17.7723F, 1, 1, 18, 0.0F, false));

        this.upperlegR = new AdvancedModelRenderer(this);
        this.upperlegR.setRotationPoint(11.975F, -4.4352F, -2.0325F);
        this.hips.addChild(upperlegR);
        this.setRotateAngle(upperlegR, 0.0829F, 0.0F, 0.0F);
        this.upperlegR.cubeList.add(new ModelBox(upperlegR, 0, 218, -5.0F, -0.5378F, -6.4109F, 10, 23, 11, 0.0F, false));

        this.lowerlegR = new AdvancedModelRenderer(this);
        this.lowerlegR.setRotationPoint(0.3F, 21.5579F, 0.1527F);
        this.upperlegR.addChild(lowerlegR);
        this.setRotateAngle(lowerlegR, -0.1091F, 0.0F, 0.0F);
        this.lowerlegR.cubeList.add(new ModelBox(lowerlegR, 34, 245, -3.5F, -2.2091F, -4.7813F, 7, 16, 8, 0.0F, false));

        this.footR = new AdvancedModelRenderer(this);
        this.footR.setRotationPoint(0.0F, 13.1284F, 0.9489F);
        this.lowerlegR.addChild(footR);
        this.setRotateAngle(footR, -0.1396F, 0.0F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -9.7534F, 1.0871F);
        this.footR.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1658F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 240, 62, -3.925F, 7.961F, -8.4493F, 8, 4, 12, 0.0F, false));

        this.upperlegL = new AdvancedModelRenderer(this);
        this.upperlegL.setRotationPoint(-11.0F, -4.9F, -2.125F);
        this.hips.addChild(upperlegL);
        this.setRotateAngle(upperlegL, 0.0829F, 0.0F, 0.0F);
        this.upperlegL.cubeList.add(new ModelBox(upperlegL, 217, 158, -4.0F, -0.0467F, -6.3702F, 10, 23, 11, 0.0F, false));

        this.lowerlegL = new AdvancedModelRenderer(this);
        this.lowerlegL.setRotationPoint(0.675F, 22.4783F, 0.2048F);
        this.upperlegL.addChild(lowerlegL);
        this.setRotateAngle(lowerlegL, -0.1091F, 0.0F, 0.0F);
        this.lowerlegL.cubeList.add(new ModelBox(lowerlegL, 119, 242, -3.5F, -2.7267F, -4.7996F, 7, 16, 8, 0.0F, false));

        this.footL = new AdvancedModelRenderer(this);
        this.footL.setRotationPoint(0.0F, 11.5608F, -0.7688F);
        this.lowerlegL.addChild(footL);
        this.setRotateAngle(footL, -0.192F, 0.0F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -9.7534F, 1.0871F);
        this.footL.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2138F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 232, 236, -4.075F, 8.825F, -7.25F, 8, 4, 12, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.chest.rotateAngleY = (float) Math.toRadians(180);
        this.upperarmR.setScale(0,0,0);
        this.upperarmL.setScale(0,0,0);
        this.upperarmR.scaleChildren = true;
        this.upperarmL.scaleChildren = true;
        this.setRotateAngle(neck, 0.05F, 0.0F, -0.01F);
        this.setRotateAngle(neck2, 0.05F, 0.0F, -0.02F);
        this.setRotateAngle(neck3, -0.05F, 0.0F, -0.03F);
        this.setRotateAngle(neck4, -0.05F, 0.0F, -0.04F);
        this.setRotateAngle(head, -0.05F, 0.0F, -0.05F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.chest.offsetY = -0.1F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = -0.21F;
        this.chest.render(0.01F);
        this.upperarmR.setScale(1,1,1);
        this.upperarmL.setScale(1,1,1);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.02F);
        this.setRotateAngle(neck, 0.0F, 0.05F, 0.1F);
        this.setRotateAngle(neck2, 0.0F, 0.1F, 0.1F);
        this.setRotateAngle(neck3, 0.0F, 0.2F, 0.1F);
        this.setRotateAngle(neck4, -0.02F, 0.3F, 0.2F);
        this.setRotateAngle(head, -0.2F, 0.2F, 0.2F);
        this.setRotateAngle(lowerjaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(throat2, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.05F, -0.2F, 0.0F);
        this.setRotateAngle(tail6, 0.15F, -0.02F, 0.0F);
        this.setRotateAngle(tail7, 0.2F, -0.05F, 0.0F);
        this.setRotateAngle(tail8, 0.25F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegL, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegL, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(footL, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegR, 0.2F, 0.0F, 0.2F);
        this.setRotateAngle(lowerlegR, -0.2F, 0.0F, 0.6F);
        this.setRotateAngle(footR, -0.5F, 0.0F, 0.2F);
        this.setRotateAngle(upperarmL, 0.2F, 0.0F, -0.3F);
        this.setRotateAngle(lowerarmL, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(handL, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmR, -0.2F, 0.0F, 0.4F);
        this.setRotateAngle(lowerarmR, 0.3F, 0.0F, 0.3F);
        this.setRotateAngle(handR, -0.3F, 0.0F, 0.0F);
        this.root.offsetY = 0.05F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.8F;
        this.root.offsetX = -0.25F;
        this.root.rotateAngleY = (float)Math.toRadians(-68);
        this.root.rotateAngleX = (float)Math.toRadians(15);
        this.root.rotateAngleZ = (float)Math.toRadians(-10);
        this.root.scaleChildren = true;
        float scaler = 0.35F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:


        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraDicraeosaurus camara = (EntityPrehistoricFloraDicraeosaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = camara.getJuvenile();

        if (isBaby) {
            this.neck4.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1.025F, 1.025F, 1.025F);
            this.neck3.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1F, 1, 1F);
            this.neck3.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        camara.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = camara.getTravelSpeed()/2;

            if (!camara.isInWater()) {

                if (f3 == 0.0F || !camara.getIsMoving()) {
                    if (camara.getAnimation() != camara.EAT_ANIMATION
                        && camara.getAnimation() != camara.DRINK_ANIMATION
                        && camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.04F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.walk(lowerjaw, (float) ( 0.04), 0.1F, true, 0, 0, f2, 1);
                    }

                    if (camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Tail, (0.15F * 0.1F), 0.1F, 0.2F, f2, 1F);
                        this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.35F, 0.12F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.35F, 0F, f2, 1F);
                    }

                    return;
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
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDicraeosaurus ee = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The drink anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SOCIAL_ANIMATION) { //The leaves grazing anim
            animSocial(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }



    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;
        int animCycle = 175;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = -4.25 + (((tickAnim - 43) / 67) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 43) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 67) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = -4.25 + (((tickAnim - 110) / 66) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 110) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 66) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = -6.75 + (((tickAnim - 43) / 67) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 43) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 67) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = -6.75 + (((tickAnim - 110) / 66) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 110) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 66) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 43) / 87) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 87) * (0-(0)));
            zz = -0.5 + (((tickAnim - 43) / 87) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 130 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 130) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 46) * (0-(0)));
            zz = -0.5 + (((tickAnim - 130) / 46) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (15.44367-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (-1.14452-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (5.63532-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = 15.44367 + (((tickAnim - 43) / 67) * (16.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 43) / 67) * (-1.14452-(-1.14452)));
            zz = 5.63532 + (((tickAnim - 43) / 67) * (5.63532-(5.63532)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = 16.44367 + (((tickAnim - 110) / 66) * (0-(16.44367)));
            yy = -1.14452 + (((tickAnim - 110) / 66) * (0-(-1.14452)));
            zz = 5.63532 + (((tickAnim - 110) / 66) * (0-(5.63532)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 43) / 87) * (0-(0)));
            yy = 1.425 + (((tickAnim - 43) / 87) * (1.425-(1.425)));
            zz = 0 + (((tickAnim - 43) / 87) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 130) / 46) * (0-(0)));
            yy = 1.425 + (((tickAnim - 130) / 46) * (0-(1.425)));
            zz = 0 + (((tickAnim - 130) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-5.25-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = 7 + (((tickAnim - 43) / 67) * (7-(7)));
            yy = 0 + (((tickAnim - 43) / 67) * (0-(0)));
            zz = -5.25 + (((tickAnim - 43) / 67) * (-5.25-(-5.25)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = 7 + (((tickAnim - 110) / 66) * (0-(7)));
            yy = 0 + (((tickAnim - 110) / 66) * (0-(0)));
            zz = -5.25 + (((tickAnim - 110) / 66) * (0-(-5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 43) / 87) * (0-(0)));
            yy = 0.325 + (((tickAnim - 43) / 87) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 43) / 87) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 130) / 46) * (0-(0)));
            yy = 0.325 + (((tickAnim - 130) / 46) * (0-(0.325)));
            zz = 0 + (((tickAnim - 130) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = -11.5 + (((tickAnim - 43) / 67) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 43) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 67) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = -11.5 + (((tickAnim - 110) / 66) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 110) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 66) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0.175-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 43) / 67) * (0-(0)));
            yy = 0.375 + (((tickAnim - 43) / 67) * (0.375-(0.375)));
            zz = 0.175 + (((tickAnim - 43) / 67) * (0.175-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (15.44367-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (-1.14452-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-5.6353-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = 15.44367 + (((tickAnim - 43) / 67) * (15.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 43) / 67) * (-1.14452-(-1.14452)));
            zz = -5.6353 + (((tickAnim - 43) / 67) * (-5.6353-(-5.6353)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = 15.44367 + (((tickAnim - 110) / 66) * (0-(15.44367)));
            yy = -1.14452 + (((tickAnim - 110) / 66) * (0-(-1.14452)));
            zz = -5.6353 + (((tickAnim - 110) / 66) * (0-(-5.6353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 43) / 87) * (0-(0)));
            yy = 1.425 + (((tickAnim - 43) / 87) * (1.425-(1.425)));
            zz = 0 + (((tickAnim - 43) / 87) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 130) / 46) * (0-(0)));
            yy = 1.425 + (((tickAnim - 130) / 46) * (0-(1.425)));
            zz = 0 + (((tickAnim - 130) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmR.rotationPointX = this.upperarmR.rotationPointX + (float)(xx);
        this.upperarmR.rotationPointY = this.upperarmR.rotationPointY - (float)(yy);
        this.upperarmR.rotationPointZ = this.upperarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (5.25-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = 7 + (((tickAnim - 43) / 67) * (7-(7)));
            yy = 0 + (((tickAnim - 43) / 67) * (0-(0)));
            zz = 5.25 + (((tickAnim - 43) / 67) * (5.25-(5.25)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = 7 + (((tickAnim - 110) / 66) * (0-(7)));
            yy = 0 + (((tickAnim - 110) / 66) * (0-(0)));
            zz = 5.25 + (((tickAnim - 110) / 66) * (0-(5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 43) / 87) * (0-(0)));
            yy = 0.325 + (((tickAnim - 43) / 87) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 43) / 87) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 130) / 46) * (0-(0)));
            yy = 0.325 + (((tickAnim - 130) / 46) * (0-(0.325)));
            zz = 0 + (((tickAnim - 130) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = -11.5 + (((tickAnim - 43) / 67) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 43) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 67) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = -11.5 + (((tickAnim - 110) / 66) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 110) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 66) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0.175-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 43) / 67) * (0-(0)));
            yy = 0.375 + (((tickAnim - 43) / 67) * (0.375-(0.375)));
            zz = 0.175 + (((tickAnim - 43) / 67) * (0.175-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handR.rotationPointX = this.handR.rotationPointX + (float)(xx);
        this.handR.rotationPointY = this.handR.rotationPointY - (float)(yy);
        this.handR.rotationPointZ = this.handR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (-5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-0.5 + (((tickAnim - 36) / 7) * (-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(-5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-0.5)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 43) / 10) * (-5.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2-(-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 73) {
            xx = -5.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2 + (((tickAnim - 53) / 20) * (-3.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.75-290))*-0.8-(-5.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2)));
            yy = 0 + (((tickAnim - 53) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 20) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 91) {
            xx = -3.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.75-290))*-0.8 + (((tickAnim - 73) / 18) * (-5.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.8-(-3.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.75-290))*-0.8)));
            yy = 0 + (((tickAnim - 73) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 18) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 99) {
            xx = -5.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.8 + (((tickAnim - 91) / 8) * (-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(-5.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.8)));
            yy = 0 + (((tickAnim - 91) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 8) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = -6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 99) / 10) * (-5.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2-(-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            yy = 0 + (((tickAnim - 99) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 10) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 135) {
            xx = -5.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2 + (((tickAnim - 109) / 26) * (-3.15-(-5.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2)));
            yy = 0 + (((tickAnim - 109) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 26) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 176) {
            xx = -3.15 + (((tickAnim - 135) / 41) * (0-(-3.15)));
            yy = 0 + (((tickAnim - 135) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -5.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*-3 + (((tickAnim - 30) / 13) * (-11.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1-(-5.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*-3)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -11.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1 + (((tickAnim - 43) / 10) * (-13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-2-(-11.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-2 + (((tickAnim - 53) / 47) * (-12.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1-(-13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-2)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -12.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1 + (((tickAnim - 100) / 10) * (-14.375-(-12.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 153) {
            xx = -14.375 + (((tickAnim - 110) / 43) * (-7-(-14.375)));
            yy = 0 + (((tickAnim - 110) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 43) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 176) {
            xx = -7 + (((tickAnim - 153) / 23) * (0-(-7)));
            yy = 0 + (((tickAnim - 153) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-7.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = -7.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1 + (((tickAnim - 28) / 15) * (-15.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1-(-7.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1)));
            yy = 0 + (((tickAnim - 28) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 15) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -15.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1 + (((tickAnim - 43) / 10) * (-16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-3-(-15.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 78) {
            xx = -16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-3 + (((tickAnim - 53) / 25) * (-13.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1-(-16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-3)));
            yy = 0 + (((tickAnim - 53) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 25) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -13.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1 + (((tickAnim - 78) / 22) * (-15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2-(-13.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1)));
            yy = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2 + (((tickAnim - 100) / 10) * (-14.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-3-(-15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = -14.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-3 + (((tickAnim - 110) / 66) * (0-(-14.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-3)));
            yy = 0 + (((tickAnim - 110) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 66) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 5.75 + (((tickAnim - 43) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(5.75)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 75) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 53) / 22) * (4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 53) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 22) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 99) {
            xx = 4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3 + (((tickAnim - 75) / 24) * (5.75-(4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3)));
            yy = 0 + (((tickAnim - 75) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 24) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 110) {
            xx = 5.75 + (((tickAnim - 99) / 11) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(5.75)));
            yy = 0 + (((tickAnim - 99) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 11) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 110) / 66) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 110) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 66) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 11 + (((tickAnim - 43) / 10) * (-5.1-(11)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 75) {
            xx = -5.1 + (((tickAnim - 53) / 22) * (0-(-5.1)));
            yy = 0 + (((tickAnim - 53) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            zz = 0 + (((tickAnim - 53) / 22) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (1-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 75) / 25) * (-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 1 + (((tickAnim - 100) / 10) * (-5.1-(1)));
            yy = -1 + (((tickAnim - 100) / 10) * (0-(-1)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 176) {
            xx = -5.1 + (((tickAnim - 110) / 66) * (0-(-5.1)));
            yy = 0 + (((tickAnim - 110) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 66) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = -8 + (((tickAnim - 28) / 15) * (-13.5-(-8)));
            yy = 0 + (((tickAnim - 28) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 15) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -13.5 + (((tickAnim - 43) / 10) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 53) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 36) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 89) / 11) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 89) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 11) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -11.5 + (((tickAnim - 100) / 10) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (9.25-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = 9.25 + (((tickAnim - 53) / 17) * (0-(9.25)));
            yy = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (9.25-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 133) {
            xx = 9.25 + (((tickAnim - 116) / 17) * (0-(9.25)));
            yy = 0 + (((tickAnim - 116) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            yy = -0.7 + (((tickAnim - 53) / 17) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 116) / 17) * (0-(0)));
            yy = -0.7 + (((tickAnim - 116) / 17) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 116) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = -7 + (((tickAnim - 53) / 17) * (0-(-7)));
            yy = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (-7-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 133) {
            xx = -7 + (((tickAnim - 116) / 17) * (0-(-7)));
            yy = 0 + (((tickAnim - 116) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 43) / 10) * (-0.825-(-0.05)));
            zz = 0.05 + (((tickAnim - 43) / 10) * (0.125-(0.05)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            yy = -0.825 + (((tickAnim - 53) / 17) * (0-(-0.825)));
            zz = 0.125 + (((tickAnim - 53) / 17) * (0-(0.125)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 35) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0.05-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            yy = -0.05 + (((tickAnim - 105) / 11) * (-0.825-(-0.05)));
            zz = 0.05 + (((tickAnim - 105) / 11) * (0.125-(0.05)));
        }
        else if (tickAnim >= 116 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 116) / 17) * (0-(0)));
            yy = -0.825 + (((tickAnim - 116) / 17) * (0-(-0.825)));
            zz = 0.125 + (((tickAnim - 116) / 17) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1 + (((tickAnim - 40) / 60) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 40) / 136) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 40) / 136) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 40) / 136) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 176) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 176) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 176) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 40) / 136) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4 + (((tickAnim - 40) / 136) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (1.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*0.5-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 36) {
            xx = 1.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*2 + (((tickAnim - 22) / 14) * (1.0793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2-(1.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*2)));
            yy = 0 + (((tickAnim - 22) / 14) * (-0.19609-(0)));
            zz = 1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*0.5 + (((tickAnim - 22) / 14) * (0.5077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2-(1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*0.5)));
        }
        else if (tickAnim >= 36 && tickAnim < 55) {
            xx = 1.0793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2 + (((tickAnim - 36) / 19) * (0-(1.0793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2)));
            yy = -0.19609 + (((tickAnim - 36) / 19) * (0-(-0.19609)));
            zz = 0.5077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2 + (((tickAnim - 36) / 19) * (0-(0.5077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 15) / 25) * (-0.9977-(1)));
            yy = 0 + (((tickAnim - 15) / 25) * (-0.09594-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (-2.74833-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -0.9977 + (((tickAnim - 40) / 15) * (0-(-0.9977)));
            yy = -0.09594 + (((tickAnim - 40) / 15) * (0-(-0.09594)));
            zz = -2.74833 + (((tickAnim - 40) / 15) * (0-(-2.74833)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (3.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = 3.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3 + (((tickAnim - 38) / 17) * (0-(3.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3)));
            yy = 0 + (((tickAnim - 38) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 32) {
            xx = 3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-3 + (((tickAnim - 14) / 18) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5-(3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-3)));
            yy = 0 + (((tickAnim - 14) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 18) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 55) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5 + (((tickAnim - 32) / 23) * (0-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5)));
            yy = 0 + (((tickAnim - 32) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 37) {
            xx = 2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-5 + (((tickAnim - 15) / 22) * (2.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5-(2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-5)));
            yy = 0 + (((tickAnim - 15) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 22) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = 2.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5 + (((tickAnim - 37) / 18) * (0-(2.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5)));
            yy = 0 + (((tickAnim - 37) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = -12.25 + (((tickAnim - 38) / 15) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.05-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.05 + (((tickAnim - 38) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.05)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerjaw.rotationPointX = this.lowerjaw.rotationPointX + (float)(xx);
        this.lowerjaw.rotationPointY = this.lowerjaw.rotationPointY - (float)(yy);
        this.lowerjaw.rotationPointZ = this.lowerjaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 15) / 23) * (1-(1)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 38) / 10) * (0.25-(1)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0.25 + (((tickAnim - 48) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 15) / 15) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1-(1)));
            yy = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 15) / 15) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1 + (((tickAnim - 30) / 25) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1)));
            yy = 1 + (((tickAnim - 30) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 14.75 + (((tickAnim - 15) / 23) * (13.75-(14.75)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = 13.75 + (((tickAnim - 38) / 17) * (0-(13.75)));
            yy = 0 + (((tickAnim - 38) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1.0875-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (1.4175-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1.0875 + (((tickAnim - 15) / 15) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1-(1.0875)));
            yy = 1.4175 + (((tickAnim - 15) / 15) * (1.4025-(1.4175)));
            zz = 1 + (((tickAnim - 15) / 15) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1 + (((tickAnim - 30) / 25) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1)));
            yy = 1.4025 + (((tickAnim - 30) / 25) * (1-(1.4025)));
            zz = 1 + (((tickAnim - 30) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 10) / 20) * (0-(1)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -0.5 + (((tickAnim - 10) / 20) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -1 + (((tickAnim - 10) / 20) * (0-(-1)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 10) / 20) * (0-(3)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -2.75 + (((tickAnim - 10) / 20) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.03-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.03 + (((tickAnim - 10) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.03)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerjaw.rotationPointX = this.lowerjaw.rotationPointX + (float)(xx);
        this.lowerjaw.rotationPointY = this.lowerjaw.rotationPointY - (float)(yy);
        this.lowerjaw.rotationPointZ = this.lowerjaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 3.75 + (((tickAnim - 10) / 20) * (0-(3.75)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = -0.375 + (((tickAnim - 10) / 20) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -4.25 + (((tickAnim - 10) / 20) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.225-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 20) * (0-(-0.05)));
            zz = 0.225 + (((tickAnim - 10) / 20) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1.085-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1.68-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1.1225-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 1.085 + (((tickAnim - 10) / 20) * (1-(1.085)));
            yy = 1.68 + (((tickAnim - 10) / 20) * (1-(1.68)));
            zz = 1.1225 + (((tickAnim - 10) / 20) * (1-(1.1225)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animSocial(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 163;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 20) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (2.5-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 108) {
            xx = 2.5 + (((tickAnim - 80) / 28) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 80) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 28) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 163) {
            xx = 2.5 + (((tickAnim - 108) / 55) * (0-(2.5)));
            yy = 0 + (((tickAnim - 108) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (2.29167-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -5.75 + (((tickAnim - 9) / 11) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 2.29167 + (((tickAnim - 9) / 11) * (5-(2.29167)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 5 + (((tickAnim - 20) / 23) * (8-(5)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 8 + (((tickAnim - 43) / 37) * (8-(8)));
        }
        else if (tickAnim >= 80 && tickAnim < 108) {
            xx = -3.75 + (((tickAnim - 80) / 28) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 80) / 28) * (0-(0)));
            zz = 8 + (((tickAnim - 80) / 28) * (8-(8)));
        }
        else if (tickAnim >= 108 && tickAnim < 130) {
            xx = -3.75 + (((tickAnim - 108) / 22) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 108) / 22) * (0-(0)));
            zz = 8 + (((tickAnim - 108) / 22) * (8-(8)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = -3.75 + (((tickAnim - 130) / 11) * (-10.05-(-3.75)));
            yy = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            zz = 8 + (((tickAnim - 130) / 11) * (3.84-(8)));
        }
        else if (tickAnim >= 141 && tickAnim < 151) {
            xx = -10.05 + (((tickAnim - 141) / 10) * (0-(-10.05)));
            yy = 0 + (((tickAnim - 141) / 10) * (0-(0)));
            zz = 3.84 + (((tickAnim - 141) / 10) * (0-(3.84)));
        }
        else if (tickAnim >= 151 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (2.05-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 2.05 + (((tickAnim - 9) / 11) * (0-(2.05)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.225 + (((tickAnim - 22) / 1) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 25) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 27) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 53) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 27) / 53) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 80) / 28) * (0-(0)));
            yy = -0.35 + (((tickAnim - 80) / 28) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 80) / 28) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 108) / 22) * (0-(0)));
            yy = -0.35 + (((tickAnim - 108) / 22) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 108) / 22) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            yy = -0.35 + (((tickAnim - 130) / 11) * (1.93-(-0.35)));
            zz = 0 + (((tickAnim - 130) / 11) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 141) / 10) * (0-(0)));
            yy = 1.93 + (((tickAnim - 141) / 10) * (0-(1.93)));
            zz = 0 + (((tickAnim - 141) / 10) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-3.09375-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 9) / 11) * (0-(15.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = -3.09375 + (((tickAnim - 9) / 11) * (-6.75-(-3.09375)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = -6.75 + (((tickAnim - 20) / 23) * (-7-(-6.75)));
        }
        else if (tickAnim >= 43 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 43) / 87) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 87) * (0-(0)));
            zz = -7 + (((tickAnim - 43) / 87) * (-6.75-(-7)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 130) / 11) * (19.5-(0)));
            yy = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            zz = -6.75 + (((tickAnim - 130) / 11) * (-3.36-(-6.75)));
        }
        else if (tickAnim >= 141 && tickAnim < 151) {
            xx = 19.5 + (((tickAnim - 141) / 10) * (0-(19.5)));
            yy = 0 + (((tickAnim - 141) / 10) * (0-(0)));
            zz = -3.36 + (((tickAnim - 141) / 10) * (0-(-3.36)));
        }
        else if (tickAnim >= 151 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 9) / 11) * (-0.725-(0.975)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 20) / 110) * (0-(0)));
            yy = -0.725 + (((tickAnim - 20) / 110) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 20) / 110) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            yy = -0.725 + (((tickAnim - 130) / 11) * (0.925-(-0.725)));
            zz = 0 + (((tickAnim - 130) / 11) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 141) / 10) * (0-(0)));
            yy = 0.925 + (((tickAnim - 141) / 10) * (0-(0.925)));
            zz = 0 + (((tickAnim - 141) / 10) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -15.5 + (((tickAnim - 9) / 11) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 20) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 110) * (-4-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 130) / 11) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            zz = -4 + (((tickAnim - 130) / 11) * (-1.92-(-4)));
        }
        else if (tickAnim >= 141 && tickAnim < 151) {
            xx = -31.75 + (((tickAnim - 141) / 10) * (0-(-31.75)));
            yy = 0 + (((tickAnim - 141) / 10) * (0-(0)));
            zz = -1.92 + (((tickAnim - 141) / 10) * (0-(-1.92)));
        }
        else if (tickAnim >= 151 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.375-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.4 + (((tickAnim - 9) / 11) * (0-(0.4)));
            zz = 0.375 + (((tickAnim - 9) / 11) * (0-(0.375)));
        }
        else if (tickAnim >= 20 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 20) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 110) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 11) * (0.575-(0)));
            zz = 0 + (((tickAnim - 130) / 11) * (0.825-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 141) / 10) * (0-(0)));
            yy = 0.575 + (((tickAnim - 141) / 10) * (0-(0.575)));
            zz = 0.825 + (((tickAnim - 141) / 10) * (0-(0.825)));
        }
        else if (tickAnim >= 151 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = -2 + (((tickAnim - 20) / 11) * (-5.25-(-2)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = -7.5 + (((tickAnim - 31) / 12) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = -5.25 + (((tickAnim - 31) / 12) * (-9-(-5.25)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = -9 + (((tickAnim - 43) / 37) * (-9-(-9)));
        }
        else if (tickAnim >= 80 && tickAnim < 108) {
            xx = -3.25 + (((tickAnim - 80) / 28) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 80) / 28) * (0-(0)));
            zz = -9 + (((tickAnim - 80) / 28) * (-9-(-9)));
        }
        else if (tickAnim >= 108 && tickAnim < 119) {
            xx = -3.25 + (((tickAnim - 108) / 11) * (-6.375-(-3.25)));
            yy = 0 + (((tickAnim - 108) / 11) * (0-(0)));
            zz = -9 + (((tickAnim - 108) / 11) * (-4.5-(-9)));
        }
        else if (tickAnim >= 119 && tickAnim < 130) {
            xx = -6.375 + (((tickAnim - 119) / 11) * (0-(-6.375)));
            yy = 0 + (((tickAnim - 119) / 11) * (0-(0)));
            zz = -4.5 + (((tickAnim - 119) / 11) * (0-(-4.5)));
        }
        else if (tickAnim >= 130 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 130) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -1.05 + (((tickAnim - 0) / 20) * (-0.7-(-1.05)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            yy = -0.7 + (((tickAnim - 20) / 11) * (2.465-(-0.7)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            yy = 2.465 + (((tickAnim - 31) / 12) * (-1.2-(2.465)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = -1.2 + (((tickAnim - 43) / 2) * (-1.575-(-1.2)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = -1.575 + (((tickAnim - 45) / 2) * (-1.2-(-1.575)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            yy = -1.2 + (((tickAnim - 47) / 1) * (-1.575-(-1.2)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = -1.575 + (((tickAnim - 48) / 2) * (-1.2-(-1.575)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            yy = -1.2 + (((tickAnim - 50) / 30) * (-1.45-(-1.2)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 80) / 28) * (0-(0)));
            yy = -1.45 + (((tickAnim - 80) / 28) * (-1.45-(-1.45)));
            zz = 0 + (((tickAnim - 80) / 28) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 108) / 11) * (0-(0)));
            yy = -1.45 + (((tickAnim - 108) / 11) * (2.245-(-1.45)));
            zz = 0 + (((tickAnim - 108) / 11) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 119) / 11) * (0-(0)));
            yy = 2.245 + (((tickAnim - 119) / 11) * (0-(2.245)));
            zz = 0 + (((tickAnim - 119) / 11) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 130) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 33) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 130) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmR.rotationPointX = this.upperarmR.rotationPointX + (float)(xx);
        this.upperarmR.rotationPointY = this.upperarmR.rotationPointY - (float)(yy);
        this.upperarmR.rotationPointZ = this.upperarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (11.75-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (3.83036-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 11.75 + (((tickAnim - 31) / 12) * (0-(11.75)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = 3.83036 + (((tickAnim - 31) / 12) * (9-(3.83036)));
        }
        else if (tickAnim >= 43 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 43) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 65) * (0-(0)));
            zz = 9 + (((tickAnim - 43) / 65) * (9-(9)));
        }
        else if (tickAnim >= 108 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 108) / 11) * (17.25-(0)));
            yy = 0 + (((tickAnim - 108) / 11) * (0-(0)));
            zz = 9 + (((tickAnim - 108) / 11) * (1.125-(9)));
        }
        else if (tickAnim >= 119 && tickAnim < 130) {
            xx = 17.25 + (((tickAnim - 119) / 11) * (0-(17.25)));
            yy = 0 + (((tickAnim - 119) / 11) * (0-(0)));
            zz = 1.125 + (((tickAnim - 119) / 11) * (0-(1.125)));
        }
        else if (tickAnim >= 130 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 130) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 31 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 31) / 77) * (0-(0)));
            yy = 0.875 + (((tickAnim - 31) / 77) * (0-(0.875)));
            zz = 0 + (((tickAnim - 31) / 77) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 108) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 11) * (1.275-(0)));
            zz = 0 + (((tickAnim - 108) / 11) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 119) / 11) * (0-(0)));
            yy = 1.275 + (((tickAnim - 119) / 11) * (0-(1.275)));
            zz = 0 + (((tickAnim - 119) / 11) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 130) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 33) * (0.875-(0)));
            zz = 0 + (((tickAnim - 130) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = -12.25 + (((tickAnim - 31) / 12) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 43) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 65) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 108) / 11) * (-18-(0)));
            yy = 0 + (((tickAnim - 108) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 11) * (4.875-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 130) {
            xx = -18 + (((tickAnim - 119) / 11) * (0-(-18)));
            yy = 0 + (((tickAnim - 119) / 11) * (0-(0)));
            zz = 4.875 + (((tickAnim - 119) / 11) * (0-(4.875)));
        }
        else if (tickAnim >= 130 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 130) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (0.575-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0.03-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            yy = 0.575 + (((tickAnim - 31) / 12) * (0-(0.575)));
            zz = 0.03 + (((tickAnim - 31) / 12) * (0-(0.03)));
        }
        else if (tickAnim >= 43 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 43) / 76) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 76) * (0.9-(0)));
            zz = 0 + (((tickAnim - 43) / 76) * (-0.1-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 119) / 44) * (0-(0)));
            yy = 0.9 + (((tickAnim - 119) / 44) * (0-(0.9)));
            zz = -0.1 + (((tickAnim - 119) / 44) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handR.rotationPointX = this.handR.rotationPointX + (float)(xx);
        this.handR.rotationPointY = this.handR.rotationPointY - (float)(yy);
        this.handR.rotationPointZ = this.handR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.9282+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.0212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*145-20))*2-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = -2.9282+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*1 + (((tickAnim - 25) / 26) * (-3.8782+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1-(-2.9282+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*1)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 25) / 26) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = -0.0212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*145-20))*2 + (((tickAnim - 25) / 26) * (-0.0458-(-0.0212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*145-20))*2)));
        }
        else if (tickAnim >= 51 && tickAnim < 102) {
            xx = -3.8782+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1 + (((tickAnim - 51) / 51) * (-0.7949+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1-(-3.8782+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 51) / 51) * (-1.0532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = -0.0458 + (((tickAnim - 51) / 51) * (-0.02511-(-0.0458)));
        }
        else if (tickAnim >= 102 && tickAnim < 112) {
            xx = -0.7949+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1 + (((tickAnim - 102) / 10) * (-0.3199+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1-(-0.7949+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1)));
            yy = -1.0532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 102) / 10) * (0.4718+Math.sin((Math.PI/180)*(((double)tickAnim/20)*12-50))*3-(-1.0532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            zz = -0.02511 + (((tickAnim - 102) / 10) * (-0.02511-(-0.02511)));
        }
        else if (tickAnim >= 112 && tickAnim < 163) {
            xx = -0.3199+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1 + (((tickAnim - 112) / 51) * (0-(-0.3199+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1)));
            yy = 0.4718+Math.sin((Math.PI/180)*(((double)tickAnim/20)*12-50))*3 + (((tickAnim - 112) / 51) * (0-(0.4718+Math.sin((Math.PI/180)*(((double)tickAnim/20)*12-50))*3)));
            zz = -0.02511 + (((tickAnim - 112) / 51) * (0-(-0.02511)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0.7185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-1.8037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-1.0212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 102) {
            xx = 0.7185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 28) / 74) * (2.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0.7185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = -1.8037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 28) / 74) * (0.8218+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2-(-1.8037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = -1.0212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2 + (((tickAnim - 28) / 74) * (-0.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(-1.0212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2)));
        }
        else if (tickAnim >= 102 && tickAnim < 163) {
            xx = 2.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 102) / 61) * (0-(2.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0.8218+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2 + (((tickAnim - 102) / 61) * (0-(0.8218+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2)));
            zz = -0.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 102) / 61) * (0-(-0.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0.9542+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.9503+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (2.74017-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 56) {
            xx = 0.9542+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 21) / 35) * (1.5042+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(0.9542+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = -0.9503+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*1 + (((tickAnim - 21) / 35) * (-2.7507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(-0.9503+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*1)));
            zz = 2.74017 + (((tickAnim - 21) / 35) * (-0.0458-(2.74017)));
        }
        else if (tickAnim >= 56 && tickAnim < 103) {
            xx = 1.5042+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 56) / 47) * (10.13455-(1.5042+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = -2.7507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 56) / 47) * (0.82184-(-2.7507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            zz = -0.0458 + (((tickAnim - 56) / 47) * (-0.02511-(-0.0458)));
        }
        else if (tickAnim >= 103 && tickAnim < 163) {
            xx = 10.13455 + (((tickAnim - 103) / 60) * (0-(10.13455)));
            yy = 0.82184 + (((tickAnim - 103) / 60) * (0-(0.82184)));
            zz = -0.02511 + (((tickAnim - 103) / 60) * (0-(-0.02511)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-1.7506-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-1.4993-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0.04582-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 51) {
            xx = -1.7506 + (((tickAnim - 28) / 23) * (-1.7506-(-1.7506)));
            yy = -1.4993 + (((tickAnim - 28) / 23) * (1.4993-(-1.4993)));
            zz = 0.04582 + (((tickAnim - 28) / 23) * (-0.0458-(0.04582)));
        }
        else if (tickAnim >= 51 && tickAnim < 103) {
            xx = -1.7506 + (((tickAnim - 51) / 52) * (16.5472-(-1.7506)));
            yy = 1.4993 + (((tickAnim - 51) / 52) * (-1.81436-(1.4993)));
            zz = -0.0458 + (((tickAnim - 51) / 52) * (-0.80812-(-0.0458)));
        }
        else if (tickAnim >= 103 && tickAnim < 163) {
            xx = 16.5472 + (((tickAnim - 103) / 60) * (0-(16.5472)));
            yy = -1.81436 + (((tickAnim - 103) / 60) * (0-(-1.81436)));
            zz = -0.80812 + (((tickAnim - 103) / 60) * (0-(-0.80812)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 0) / 106) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 106) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 106) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 163) {
            xx = 6.5 + (((tickAnim - 106) / 57) * (0-(6.5)));
            yy = 0 + (((tickAnim - 106) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 57) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 54 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 54) / 48) * (10.5-(0)));
            yy = 0 + (((tickAnim - 54) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 48) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 163) {
            xx = 10.5 + (((tickAnim - 102) / 61) * (0-(10.5)));
            yy = 0 + (((tickAnim - 102) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 61) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 54 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 54) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 48) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 54) / 48) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 102) / 61) * (0-(0)));
            yy = -0.925 + (((tickAnim - 102) / 61) * (0-(-0.925)));
            zz = 0 + (((tickAnim - 102) / 61) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 54 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 54) / 24) * (-8.57-(0)));
            yy = 0 + (((tickAnim - 54) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 24) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 105) {
            xx = -8.57 + (((tickAnim - 78) / 27) * (-14.25-(-8.57)));
            yy = 0 + (((tickAnim - 78) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 27) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 163) {
            xx = -14.25 + (((tickAnim - 105) / 58) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 105) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 54 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 54) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 24) * (-0.67-(0)));
            zz = 0 + (((tickAnim - 54) / 24) * (0.06-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 78) / 27) * (0-(0)));
            yy = -0.67 + (((tickAnim - 78) / 27) * (-1.1-(-0.67)));
            zz = 0.06 + (((tickAnim - 78) / 27) * (0.125-(0.06)));
        }
        else if (tickAnim >= 105 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 105) / 58) * (0-(0)));
            yy = -1.1 + (((tickAnim - 105) / 58) * (0-(-1.1)));
            zz = 0.125 + (((tickAnim - 105) / 58) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 54 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 54) / 24) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.3-(1)));
            yy = 1 + (((tickAnim - 54) / 24) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5-(1)));
            zz = 1 + (((tickAnim - 54) / 24) * (1-(1)));
        }
        else if (tickAnim >= 78 && tickAnim < 105) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.3 + (((tickAnim - 78) / 27) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.3)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5 + (((tickAnim - 78) / 27) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5)));
            zz = 1 + (((tickAnim - 78) / 27) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 20) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 163) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*2 + (((tickAnim - 40) / 123) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*2)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 40) / 123) * (0-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 40) / 123) * (0-(0)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 40) / 123) * (0-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 40) / 123) * (0-(0)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 40) / 123) * (0-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 40) / 123) * (0-(0)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 40) / 123) * (0-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 163) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-4 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-4)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 40) / 123) * (0-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 163) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-5 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-5)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 40) / 123) * (0-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-6-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 163) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-6 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-6)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 40) / 123) * (0-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 40) / 123) * (0-(0)));
            yy = -1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 40) / 123) * (0-(-1.3007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4 + (((tickAnim - 40) / 123) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 20) / 10) * (5-(5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 30) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -3.85 + (((tickAnim - 20) / 10) * (-3.85-(-3.85)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3.85 + (((tickAnim - 30) / 20) * (0-(-3.85)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.35 + (((tickAnim - 20) / 10) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.35 + (((tickAnim - 30) / 20) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.75 + (((tickAnim - 20) / 10) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 30) / 20) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 20) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 30) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.875 + (((tickAnim - 20) / 10) * (0.875-(0.875)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.875 + (((tickAnim - 30) / 20) * (0-(0.875)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.5 + (((tickAnim - 20) / 10) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10.5 + (((tickAnim - 30) / 20) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 20) / 10) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 20) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 30) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.625-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.625 + (((tickAnim - 20) / 10) * (1.625-(1.625)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.625 + (((tickAnim - 30) / 20) * (0-(1.625)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmR.rotationPointX = this.upperarmR.rotationPointX + (float)(xx);
        this.upperarmR.rotationPointY = this.upperarmR.rotationPointY - (float)(yy);
        this.upperarmR.rotationPointZ = this.upperarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 20) / 10) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 30) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.75 + (((tickAnim - 20) / 10) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 30) / 20) * (0-(2.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 20) / 10) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 30) / 20) * (0-(2.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.75 + (((tickAnim - 20) / 10) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 30) / 20) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 20) / 10) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 30) / 20) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.5 + (((tickAnim - 20) / 10) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.5 + (((tickAnim - 30) / 20) * (0-(1.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 20) / 10) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 30) / 20) * (0-(8.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.25 + (((tickAnim - 20) / 10) * (4.25-(4.25)));
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
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.75 + (((tickAnim - 10) / 10) * (3-(2.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 20) / 10) * (3-(3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 30) / 20) * (0-(3)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.54-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 3.54 + (((tickAnim - 12) / 8) * (-4-(3.54)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 20) / 10) * (-4-(-4)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (-2.48-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -2.48 + (((tickAnim - 12) / 8) * (-14.25-(-2.48)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -14.25 + (((tickAnim - 20) / 10) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -14.25 + (((tickAnim - 30) / 6) * (-1.34-(-14.25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -1.34 + (((tickAnim - 36) / 4) * (2.05-(-1.34)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.05 + (((tickAnim - 40) / 10) * (0-(2.05)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (-14.03-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -14.03 + (((tickAnim - 12) / 8) * (-9.25-(-14.03)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 20) / 10) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -9.25 + (((tickAnim - 30) / 6) * (-7.3-(-9.25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -7.3 + (((tickAnim - 36) / 14) * (0-(-7.3)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-14.84-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -14.84 + (((tickAnim - 8) / 4) * (-18.48-(-14.84)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -18.48 + (((tickAnim - 12) / 8) * (-15.5-(-18.48)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.5 + (((tickAnim - 20) / 10) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -15.5 + (((tickAnim - 30) / 6) * (-23.23-(-15.5)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -23.23 + (((tickAnim - 36) / 7) * (-5.55-(-23.23)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -5.55 + (((tickAnim - 43) / 7) * (0-(-5.55)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (11.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.25 + (((tickAnim - 20) / 10) * (-5.25-(-5.25)));
            yy = 11.25 + (((tickAnim - 20) / 10) * (11.25-(11.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 30) / 20) * (0-(-5.25)));
            yy = 11.25 + (((tickAnim - 30) / 20) * (0-(11.25)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.175 + (((tickAnim - 20) / 10) * (1.175-(1.175)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.175 + (((tickAnim - 30) / 20) * (0-(1.175)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -33 + (((tickAnim - 20) / 10) * (-33-(-33)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -33 + (((tickAnim - 30) / 20) * (0-(-33)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 33.25 + (((tickAnim - 20) / 10) * (33.25-(33.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 33.25 + (((tickAnim - 30) / 20) * (0-(33.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footR, footR.rotateAngleX + (float) Math.toRadians(xx), footR.rotateAngleY + (float) Math.toRadians(yy), footR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.35-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.35 + (((tickAnim - 20) / 10) * (1.35-(1.35)));
            zz = -0.1 + (((tickAnim - 20) / 10) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.35 + (((tickAnim - 30) / 20) * (0-(1.35)));
            zz = -0.1 + (((tickAnim - 30) / 20) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footR.rotationPointX = this.footR.rotationPointX + (float)(xx);
        this.footR.rotationPointY = this.footR.rotationPointY - (float)(yy);
        this.footR.rotationPointZ = this.footR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.25 + (((tickAnim - 20) / 10) * (-5.25-(-5.25)));
            yy = -11.25 + (((tickAnim - 20) / 10) * (-11.25-(-11.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 30) / 20) * (0-(-5.25)));
            yy = -11.25 + (((tickAnim - 30) / 20) * (0-(-11.25)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.175 + (((tickAnim - 20) / 10) * (1.175-(1.175)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.175 + (((tickAnim - 30) / 20) * (0-(1.175)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -33 + (((tickAnim - 20) / 10) * (-33-(-33)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -33 + (((tickAnim - 30) / 20) * (0-(-33)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 33 + (((tickAnim - 20) / 10) * (33-(33)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 30) / 20) * (0-(33)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.525-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.025 + (((tickAnim - 20) / 10) * (0.025-(0.025)));
            zz = -0.525 + (((tickAnim - 20) / 10) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.025 + (((tickAnim - 30) / 20) * (0-(0.025)));
            zz = -0.525 + (((tickAnim - 30) / 20) * (0-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL.rotationPointX = this.footL.rotationPointX + (float)(xx);
        this.footL.rotationPointY = this.footL.rotationPointY - (float)(yy);
        this.footL.rotationPointZ = this.footL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.5 + (((tickAnim - 20) / 10) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10.5 + (((tickAnim - 30) / 20) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 20) / 10) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 30) / 20) * (0-(0.3)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handR.rotationPointX = this.handR.rotationPointX + (float)(xx);
        this.handR.rotationPointY = this.handR.rotationPointY - (float)(yy);
        this.handR.rotationPointZ = this.handR.rotationPointZ + (float)(zz);

    }
    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 190;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -4.25 + (((tickAnim - 63) / 10) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = -4.25 + (((tickAnim - 73) / 47) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 47) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -4.25 + (((tickAnim - 120) / 10) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = -4.25 + (((tickAnim - 130) / 60) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -6.75 + (((tickAnim - 63) / 10) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 98) {
            xx = -6.75 + (((tickAnim - 73) / 25) * (-5.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*0.2-(-6.75)));
            yy = 0 + (((tickAnim - 73) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 25) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = -5.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*0.2 + (((tickAnim - 98) / 22) * (-6.75-(-5.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*0.2)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -6.75 + (((tickAnim - 120) / 10) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = -6.75 + (((tickAnim - 130) / 60) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (-0.5-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 63) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = -0.5 + (((tickAnim - 73) / 47) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 120) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = -0.5 + (((tickAnim - 130) / 60) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (15.44367-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (-1.14452-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (5.63532-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 15.44367 + (((tickAnim - 63) / 10) * (15.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 63) / 10) * (-1.14452-(-1.14452)));
            zz = 5.63532 + (((tickAnim - 63) / 10) * (5.63532-(5.63532)));
        }
        else if (tickAnim >= 73 && tickAnim < 98) {
            xx = 15.44367 + (((tickAnim - 73) / 25) * (11.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 73) / 25) * (-1.14452-(-1.14452)));
            zz = 5.63532 + (((tickAnim - 73) / 25) * (5.63532-(5.63532)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 11.44367 + (((tickAnim - 98) / 22) * (15.44367-(11.44367)));
            yy = -1.14452 + (((tickAnim - 98) / 22) * (-1.14452-(-1.14452)));
            zz = 5.63532 + (((tickAnim - 98) / 22) * (5.63532-(5.63532)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 15.44367 + (((tickAnim - 120) / 10) * (15.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 120) / 10) * (-1.14452-(-1.14452)));
            zz = 5.63532 + (((tickAnim - 120) / 10) * (5.63532-(5.63532)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = 15.44367 + (((tickAnim - 130) / 60) * (0-(15.44367)));
            yy = -1.14452 + (((tickAnim - 130) / 60) * (0-(-1.14452)));
            zz = 5.63532 + (((tickAnim - 130) / 60) * (0-(5.63532)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 63) / 57) * (0-(0)));
            yy = 1.425 + (((tickAnim - 63) / 57) * (1.425-(1.425)));
            zz = 0 + (((tickAnim - 63) / 57) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 1.425 + (((tickAnim - 120) / 70) * (0-(1.425)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (-5.25-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 7 + (((tickAnim - 63) / 10) * (7-(7)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = -5.25 + (((tickAnim - 63) / 10) * (-5.25-(-5.25)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = 7 + (((tickAnim - 73) / 47) * (7-(7)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = -5.25 + (((tickAnim - 73) / 47) * (-5.25-(-5.25)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 7 + (((tickAnim - 120) / 10) * (7-(7)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = -5.25 + (((tickAnim - 120) / 10) * (-5.25-(-5.25)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = 7 + (((tickAnim - 130) / 60) * (0-(7)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = -5.25 + (((tickAnim - 130) / 60) * (0-(-5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 63) / 57) * (0-(0)));
            yy = 0.325 + (((tickAnim - 63) / 57) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 63) / 57) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 0.325 + (((tickAnim - 120) / 70) * (0-(0.325)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -11.5 + (((tickAnim - 63) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 98) {
            xx = -11.5 + (((tickAnim - 73) / 25) * (-9.75-(-11.5)));
            yy = 0 + (((tickAnim - 73) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 25) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = -9.75 + (((tickAnim - 98) / 22) * (-11.5-(-9.75)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -11.5 + (((tickAnim - 120) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = -11.5 + (((tickAnim - 130) / 60) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 63 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 63) / 67) * (0-(0)));
            yy = 0.3 + (((tickAnim - 63) / 67) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 63) / 67) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (15.44367-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (-1.14452-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (-5.6353-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 15.44367 + (((tickAnim - 63) / 10) * (15.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 63) / 10) * (-1.14452-(-1.14452)));
            zz = -5.6353 + (((tickAnim - 63) / 10) * (-5.6353-(-5.6353)));
        }
        else if (tickAnim >= 73 && tickAnim < 98) {
            xx = 15.44367 + (((tickAnim - 73) / 25) * (11.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 73) / 25) * (-1.14452-(-1.14452)));
            zz = -5.6353 + (((tickAnim - 73) / 25) * (-5.6353-(-5.6353)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 11.44367 + (((tickAnim - 98) / 22) * (15.44367-(11.44367)));
            yy = -1.14452 + (((tickAnim - 98) / 22) * (-1.14452-(-1.14452)));
            zz = -5.6353 + (((tickAnim - 98) / 22) * (-5.6353-(-5.6353)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 15.44367 + (((tickAnim - 120) / 10) * (15.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 120) / 10) * (-1.14452-(-1.14452)));
            zz = -5.6353 + (((tickAnim - 120) / 10) * (-5.6353-(-5.6353)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = 15.44367 + (((tickAnim - 130) / 60) * (0-(15.44367)));
            yy = -1.14452 + (((tickAnim - 130) / 60) * (0-(-1.14452)));
            zz = -5.6353 + (((tickAnim - 130) / 60) * (0-(-5.6353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 63) / 57) * (0-(0)));
            yy = 1.425 + (((tickAnim - 63) / 57) * (1.425-(1.425)));
            zz = 0 + (((tickAnim - 63) / 57) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 1.425 + (((tickAnim - 120) / 70) * (0-(1.425)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmR.rotationPointX = this.upperarmR.rotationPointX + (float)(xx);
        this.upperarmR.rotationPointY = this.upperarmR.rotationPointY - (float)(yy);
        this.upperarmR.rotationPointZ = this.upperarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (5.25-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 7 + (((tickAnim - 63) / 10) * (7-(7)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 5.25 + (((tickAnim - 63) / 10) * (5.25-(5.25)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = 7 + (((tickAnim - 73) / 47) * (7-(7)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = 5.25 + (((tickAnim - 73) / 47) * (5.25-(5.25)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 7 + (((tickAnim - 120) / 10) * (7-(7)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 5.25 + (((tickAnim - 120) / 10) * (5.25-(5.25)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = 7 + (((tickAnim - 130) / 60) * (0-(7)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 5.25 + (((tickAnim - 130) / 60) * (0-(5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 63) / 57) * (0-(0)));
            yy = 0.325 + (((tickAnim - 63) / 57) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 63) / 57) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 0.325 + (((tickAnim - 120) / 70) * (0-(0.325)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -11.5 + (((tickAnim - 63) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 98) {
            xx = -11.5 + (((tickAnim - 73) / 25) * (-9.75-(-11.5)));
            yy = 0 + (((tickAnim - 73) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 25) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = -9.75 + (((tickAnim - 98) / 22) * (-11.5-(-9.75)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -11.5 + (((tickAnim - 120) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = -11.5 + (((tickAnim - 130) / 60) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 63 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 63) / 67) * (0-(0)));
            yy = 0.45 + (((tickAnim - 63) / 67) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 63) / 67) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handR.rotationPointX = this.handR.rotationPointX + (float)(xx);
        this.handR.rotationPointY = this.handR.rotationPointY - (float)(yy);
        this.handR.rotationPointZ = this.handR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 63) / 10) * (-6.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*2-(-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = -6.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*2 + (((tickAnim - 73) / 47) * (-8.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-0.5-(-6.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*2)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 47) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -8.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-0.5 + (((tickAnim - 120) / 10) * (-8.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2-(-8.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-0.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = -8.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2 + (((tickAnim - 130) / 60) * (0-(-8.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1 + (((tickAnim - 63) / 10) * (-13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2-(-14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = -13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2 + (((tickAnim - 73) / 47) * (-16.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1-(-13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 47) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -16.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1 + (((tickAnim - 120) / 10) * (-13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2-(-16.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = -13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2 + (((tickAnim - 130) / 60) * (0-(-13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 63) / 10) * (-16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*3-(-17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = -16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*3 + (((tickAnim - 73) / 47) * (-17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(-16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*3)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 47) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 120) / 10) * (-16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*3-(-17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = -16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*3 + (((tickAnim - 130) / 60) * (0-(-16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*3)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 7.5 + (((tickAnim - 63) / 10) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = 12.5 + (((tickAnim - 73) / 47) * (7.5-(12.5)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 47) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 7.5 + (((tickAnim - 120) / 10) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = 12.5 + (((tickAnim - 130) / 60) * (0-(12.5)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 11 + (((tickAnim - 63) / 10) * (13.15-(11)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 120) {
            xx = 13.15 + (((tickAnim - 73) / 47) * (11-(13.15)));
            yy = 0 + (((tickAnim - 73) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 47) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 11 + (((tickAnim - 120) / 10) * (13.15-(11)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 190) {
            xx = 13.15 + (((tickAnim - 130) / 60) * (0-(13.15)));
            yy = 0 + (((tickAnim - 130) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = -8 + (((tickAnim - 48) / 15) * (-13.5-(-8)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -13.5 + (((tickAnim - 63) / 10) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 94) {
            xx = -13.5 + (((tickAnim - 73) / 21) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 73) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 21) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 94) / 26) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 94) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 26) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -13.5 + (((tickAnim - 120) / 10) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 144) {
            xx = -13.5 + (((tickAnim - 130) / 14) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 130) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 14) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 144) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 63 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 63) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 94) {
            xx = 9.75 + (((tickAnim - 73) / 21) * (-1-(9.75)));
            yy = 0 + (((tickAnim - 73) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 21) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 120) {
            xx = -1 + (((tickAnim - 94) / 26) * (0-(-1)));
            yy = 0 + (((tickAnim - 94) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 26) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 120) / 11) * (9.75-(0)));
            yy = 0 + (((tickAnim - 120) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 11) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 144) {
            xx = 9.75 + (((tickAnim - 131) / 13) * (0-(9.75)));
            yy = 0 + (((tickAnim - 131) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 13) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 144) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 63 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 10) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (-0.5-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 73) / 21) * (0-(0)));
            yy = -0.425 + (((tickAnim - 73) / 21) * (0.15-(-0.425)));
            zz = -0.5 + (((tickAnim - 73) / 21) * (0-(-0.5)));
        }
        else if (tickAnim >= 94 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 94) / 26) * (0-(0)));
            yy = 0.15 + (((tickAnim - 94) / 26) * (0-(0.15)));
            zz = 0 + (((tickAnim - 94) / 26) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 120) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 11) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 120) / 11) * (-0.475-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 131) / 13) * (0-(0)));
            yy = -0.425 + (((tickAnim - 131) / 13) * (0-(-0.425)));
            zz = -0.475 + (((tickAnim - 131) / 13) * (0-(-0.475)));
        }
        else if (tickAnim >= 144 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 144) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 63 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 63) / 10) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 94) {
            xx = -6.5 + (((tickAnim - 73) / 21) * (-3-(-6.5)));
            yy = 0 + (((tickAnim - 73) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 21) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 120) {
            xx = -3 + (((tickAnim - 94) / 26) * (0-(-3)));
            yy = 0 + (((tickAnim - 94) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 26) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 120) / 11) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 120) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 11) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 144) {
            xx = -6.5 + (((tickAnim - 131) / 13) * (-2-(-6.5)));
            yy = 0 + (((tickAnim - 131) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 13) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 190) {
            xx = -2 + (((tickAnim - 144) / 46) * (0-(-2)));
            yy = 0 + (((tickAnim - 144) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 63 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 10) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (-0.275-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 73) / 21) * (0-(0)));
            yy = -0.675 + (((tickAnim - 73) / 21) * (0-(-0.675)));
            zz = -0.275 + (((tickAnim - 73) / 21) * (0-(-0.275)));
        }
        else if (tickAnim >= 94 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 94) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 26) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 120) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 11) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 120) / 11) * (-0.275-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 131) / 13) * (0-(0)));
            yy = -0.675 + (((tickAnim - 131) / 13) * (0-(-0.675)));
            zz = -0.275 + (((tickAnim - 131) / 13) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 190) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1 + (((tickAnim - 60) / 130) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 60) / 130) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 60) / 130) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 60) / 130) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 190) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 190) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 190) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 60) / 130) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4 + (((tickAnim - 60) / 130) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 845;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5-90))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 8) / 77) * (-2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.3-(0)));
            yy = -1.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5-90))*-2 + (((tickAnim - 8) / 77) * (-0.5903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.3-(-1.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5-90))*-2)));
            zz = 0 + (((tickAnim - 8) / 77) * (2.05278-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = -2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.3 + (((tickAnim - 85) / 121) * (-2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.3-(-2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.3)));
            yy = -0.5903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.3 + (((tickAnim - 85) / 121) * (-0.59034-(-0.5903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.3)));
            zz = 2.05278 + (((tickAnim - 85) / 121) * (2.05278-(2.05278)));
        }
        else if (tickAnim >= 206 && tickAnim < 253) {
            xx = -2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.3 + (((tickAnim - 206) / 47) * (-7.46276-(-2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.3)));
            yy = -0.59034 + (((tickAnim - 206) / 47) * (-0.6521-(-0.59034)));
            zz = 2.05278 + (((tickAnim - 206) / 47) * (0.46373-(2.05278)));
        }
        else if (tickAnim >= 253 && tickAnim < 340) {
            xx = -7.46276 + (((tickAnim - 253) / 87) * (-16.9653-(-7.46276)));
            yy = -0.6521 + (((tickAnim - 253) / 87) * (0.39775-(-0.6521)));
            zz = 0.46373 + (((tickAnim - 253) / 87) * (1.42769-(0.46373)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = -16.9653 + (((tickAnim - 340) / 136) * (-16.9653-(-16.9653)));
            yy = 0.39775 + (((tickAnim - 340) / 136) * (0.39775-(0.39775)));
            zz = 1.42769 + (((tickAnim - 340) / 136) * (1.42769-(1.42769)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = -16.9653 + (((tickAnim - 476) / 136) * (-16.9653-(-16.9653)));
            yy = 0.39775 + (((tickAnim - 476) / 136) * (0.39775-(0.39775)));
            zz = 1.42769 + (((tickAnim - 476) / 136) * (1.42769-(1.42769)));
        }
        else if (tickAnim >= 612 && tickAnim < 721) {
            xx = -16.9653 + (((tickAnim - 612) / 109) * (-16.9653-(-16.9653)));
            yy = 0.39775 + (((tickAnim - 612) / 109) * (0.39775-(0.39775)));
            zz = 1.42769 + (((tickAnim - 612) / 109) * (1.42769-(1.42769)));
        }
        else if (tickAnim >= 721 && tickAnim < 771) {
            xx = -16.9653 + (((tickAnim - 721) / 50) * (-15.05851-(-16.9653)));
            yy = 0.39775 + (((tickAnim - 721) / 50) * (-3.2191+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5-90))*9-(0.39775)));
            zz = 1.42769 + (((tickAnim - 721) / 50) * (-3.10601-(1.42769)));
        }
        else if (tickAnim >= 771 && tickAnim < 788) {
            xx = -15.05851 + (((tickAnim - 771) / 17) * (-11.64838-(-15.05851)));
            yy = -3.2191+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5-90))*9 + (((tickAnim - 771) / 17) * (-6.8918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*2-(-3.2191+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5-90))*9)));
            zz = -3.10601 + (((tickAnim - 771) / 17) * (2.12872-(-3.10601)));
        }
        else if (tickAnim >= 788 && tickAnim < 824) {
            xx = -11.64838 + (((tickAnim - 788) / 36) * (-2.859+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*2-(-11.64838)));
            yy = -6.8918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*2 + (((tickAnim - 788) / 36) * (-0.61995-(-6.8918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*2)));
            zz = 2.12872 + (((tickAnim - 788) / 36) * (-0.43006-(2.12872)));
        }
        else if (tickAnim >= 824 && tickAnim < 845) {
            xx = -2.859+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*2 + (((tickAnim - 824) / 21) * (0-(-2.859+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*2)));
            yy = -0.61995 + (((tickAnim - 824) / 21) * (0-(-0.61995)));
            zz = -0.43006 + (((tickAnim - 824) / 21) * (0-(-0.43006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 8) / 332) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 332) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 8) / 332) * (-1.975-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 0 + (((tickAnim - 340) / 136) * (0-(0)));
            yy = -0.775 + (((tickAnim - 340) / 136) * (-0.775-(-0.775)));
            zz = -1.975 + (((tickAnim - 340) / 136) * (-1.975-(-1.975)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 0 + (((tickAnim - 476) / 136) * (0-(0)));
            yy = -0.775 + (((tickAnim - 476) / 136) * (-0.775-(-0.775)));
            zz = -1.975 + (((tickAnim - 476) / 136) * (-1.975-(-1.975)));
        }
        else if (tickAnim >= 612 && tickAnim < 721) {
            xx = 0 + (((tickAnim - 612) / 109) * (0-(0)));
            yy = -0.775 + (((tickAnim - 612) / 109) * (-0.775-(-0.775)));
            zz = -1.975 + (((tickAnim - 612) / 109) * (-1.975-(-1.975)));
        }
        else if (tickAnim >= 721 && tickAnim < 771) {
            xx = 0 + (((tickAnim - 721) / 50) * (0-(0)));
            yy = -0.775 + (((tickAnim - 721) / 50) * (-0.77-(-0.775)));
            zz = -1.975 + (((tickAnim - 721) / 50) * (-2.42-(-1.975)));
        }
        else if (tickAnim >= 771 && tickAnim < 802) {
            xx = 0 + (((tickAnim - 771) / 31) * (0-(0)));
            yy = -0.77 + (((tickAnim - 771) / 31) * (0-(-0.77)));
            zz = -2.42 + (((tickAnim - 771) / 31) * (0-(-2.42)));
        }
        else if (tickAnim >= 802 && tickAnim < 824) {
            xx = 0 + (((tickAnim - 802) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 802) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 802) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5-90))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 8) / 77) * (-2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.5-(0)));
            yy = -2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5-90))*-3 + (((tickAnim - 8) / 77) * (-4.24854-(-2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5-90))*-3)));
            zz = 0 + (((tickAnim - 8) / 77) * (0.11146-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = -2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.5 + (((tickAnim - 85) / 121) * (-2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.5-(-2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.5)));
            yy = -4.24854 + (((tickAnim - 85) / 121) * (-4.24854-(-4.24854)));
            zz = 0.11146 + (((tickAnim - 85) / 121) * (0.11146-(0.11146)));
        }
        else if (tickAnim >= 206 && tickAnim < 253) {
            xx = -2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.5 + (((tickAnim - 206) / 47) * (-0.9235+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*5-(-2.0237+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.5)));
            yy = -4.24854 + (((tickAnim - 206) / 47) * (-3.87603-(-4.24854)));
            zz = 0.11146 + (((tickAnim - 206) / 47) * (1.47045-(0.11146)));
        }
        else if (tickAnim >= 253 && tickAnim < 340) {
            xx = -0.9235+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*5 + (((tickAnim - 253) / 87) * (-24.6-(-0.9235+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*5)));
            yy = -3.87603 + (((tickAnim - 253) / 87) * (-4.57565-(-3.87603)));
            zz = 1.47045 + (((tickAnim - 253) / 87) * (1.55589-(1.47045)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = -24.6 + (((tickAnim - 340) / 136) * (-24.6-(-24.6)));
            yy = -4.57565 + (((tickAnim - 340) / 136) * (-4.57565-(-4.57565)));
            zz = 1.55589 + (((tickAnim - 340) / 136) * (1.55589-(1.55589)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = -24.6 + (((tickAnim - 476) / 136) * (-24.6-(-24.6)));
            yy = -4.57565 + (((tickAnim - 476) / 136) * (-4.57565-(-4.57565)));
            zz = 1.55589 + (((tickAnim - 476) / 136) * (1.55589-(1.55589)));
        }
        else if (tickAnim >= 612 && tickAnim < 721) {
            xx = -24.6 + (((tickAnim - 612) / 109) * (-24.6-(-24.6)));
            yy = -4.57565 + (((tickAnim - 612) / 109) * (-4.57565-(-4.57565)));
            zz = 1.55589 + (((tickAnim - 612) / 109) * (1.55589-(1.55589)));
        }
        else if (tickAnim >= 721 && tickAnim < 771) {
            xx = -24.6 + (((tickAnim - 721) / 50) * (0-(-24.6)));
            yy = -4.57565 + (((tickAnim - 721) / 50) * (-11.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-3-(-4.57565)));
            zz = 1.55589 + (((tickAnim - 721) / 50) * (0-(1.55589)));
        }
        else if (tickAnim >= 771 && tickAnim < 788) {
            xx = 0 + (((tickAnim - 771) / 17) * (-1.17089-(0)));
            yy = -11.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-3 + (((tickAnim - 771) / 17) * (-10.1069+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130/1.5-90))*5-(-11.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-3)));
            zz = 0 + (((tickAnim - 771) / 17) * (0.0994-(0)));
        }
        else if (tickAnim >= 788 && tickAnim < 819) {
            xx = -1.17089 + (((tickAnim - 788) / 31) * (-0.9932+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3-(-1.17089)));
            yy = -10.1069+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130/1.5-90))*5 + (((tickAnim - 788) / 31) * (-1.79624-(-10.1069+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130/1.5-90))*5)));
            zz = 0.0994 + (((tickAnim - 788) / 31) * (0.04712-(0.0994)));
        }
        else if (tickAnim >= 819 && tickAnim < 845) {
            xx = -0.9932+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3 + (((tickAnim - 819) / 26) * (0-(-0.9932+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3)));
            yy = -1.79624 + (((tickAnim - 819) / 26) * (0-(-1.79624)));
            zz = 0.04712 + (((tickAnim - 819) / 26) * (0-(0.04712)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (-3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.5 + (((tickAnim - 85) / 121) * (4.25-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*0.5)));
            yy = -3.25 + (((tickAnim - 85) / 121) * (-3.25-(-3.25)));
            zz = 0 + (((tickAnim - 85) / 121) * (0-(0)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 4.25 + (((tickAnim - 206) / 134) * (-7.81696-(4.25)));
            yy = -3.25 + (((tickAnim - 206) / 134) * (-2.67785-(-3.25)));
            zz = 0 + (((tickAnim - 206) / 134) * (13.81237-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = -7.81696 + (((tickAnim - 340) / 136) * (-7.81696-(-7.81696)));
            yy = -2.67785 + (((tickAnim - 340) / 136) * (-2.67785-(-2.67785)));
            zz = 13.81237 + (((tickAnim - 340) / 136) * (13.81237-(13.81237)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = -7.81696 + (((tickAnim - 476) / 136) * (-7.81696-(-7.81696)));
            yy = -2.67785 + (((tickAnim - 476) / 136) * (-2.67785-(-2.67785)));
            zz = 13.81237 + (((tickAnim - 476) / 136) * (13.81237-(13.81237)));
        }
        else if (tickAnim >= 612 && tickAnim < 721) {
            xx = -7.81696 + (((tickAnim - 612) / 109) * (-7.81696-(-7.81696)));
            yy = -2.67785 + (((tickAnim - 612) / 109) * (-2.67785-(-2.67785)));
            zz = 13.81237 + (((tickAnim - 612) / 109) * (13.81237-(13.81237)));
        }
        else if (tickAnim >= 721 && tickAnim < 771) {
            xx = -7.81696 + (((tickAnim - 721) / 50) * (11.03944-(-7.81696)));
            yy = -2.67785 + (((tickAnim - 721) / 50) * (-6.63102-(-2.67785)));
            zz = 13.81237 + (((tickAnim - 721) / 50) * (-3.58763-(13.81237)));
        }
        else if (tickAnim >= 771 && tickAnim < 802) {
            xx = 11.03944 + (((tickAnim - 771) / 31) * (4.25-(11.03944)));
            yy = -6.63102 + (((tickAnim - 771) / 31) * (-3.25-(-6.63102)));
            zz = -3.58763 + (((tickAnim - 771) / 31) * (0-(-3.58763)));
        }
        else if (tickAnim >= 802 && tickAnim < 845) {
            xx = 4.25 + (((tickAnim - 802) / 43) * (0-(4.25)));
            yy = -3.25 + (((tickAnim - 802) / 43) * (0-(-3.25)));
            zz = 0 + (((tickAnim - 802) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 0) / 340) * (-0.9-(0)));
            yy = 0 + (((tickAnim - 0) / 340) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 340) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = -0.9 + (((tickAnim - 340) / 136) * (-0.9-(-0.9)));
            yy = 0 + (((tickAnim - 340) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 136) * (0-(0)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = -0.9 + (((tickAnim - 476) / 136) * (-0.9-(-0.9)));
            yy = 0 + (((tickAnim - 476) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 476) / 136) * (0-(0)));
        }
        else if (tickAnim >= 612 && tickAnim < 721) {
            xx = -0.9 + (((tickAnim - 612) / 109) * (-0.9-(-0.9)));
            yy = 0 + (((tickAnim - 612) / 109) * (0-(0)));
            zz = 0 + (((tickAnim - 612) / 109) * (0-(0)));
        }
        else if (tickAnim >= 721 && tickAnim < 771) {
            xx = -0.9 + (((tickAnim - 721) / 50) * (-0.15-(-0.9)));
            yy = 0 + (((tickAnim - 721) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 721) / 50) * (0-(0)));
        }
        else if (tickAnim >= 771 && tickAnim < 845) {
            xx = -0.15 + (((tickAnim - 771) / 74) * (0-(-0.15)));
            yy = 0 + (((tickAnim - 771) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 771) / 74) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.02402-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.7499-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.50058-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 85) {
            xx = -0.02402 + (((tickAnim - 15) / 70) * (5.5-(-0.02402)));
            yy = 2.7499 + (((tickAnim - 15) / 70) * (-10.25-(2.7499)));
            zz = -0.50058 + (((tickAnim - 15) / 70) * (0-(-0.50058)));
        }
        else if (tickAnim >= 85 && tickAnim < 168) {
            xx = 5.5 + (((tickAnim - 85) / 83) * (5.41237-(5.5)));
            yy = -10.25 + (((tickAnim - 85) / 83) * (-7.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3.5-(-10.25)));
            zz = 0 + (((tickAnim - 85) / 83) * (1.04798-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 206) {
            xx = 5.41237 + (((tickAnim - 168) / 38) * (5.5-(5.41237)));
            yy = -7.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3.5 + (((tickAnim - 168) / 38) * (-10.25-(-7.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3.5)));
            zz = 1.04798 + (((tickAnim - 168) / 38) * (0-(1.04798)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 5.5 + (((tickAnim - 206) / 134) * (14.3681-(5.5)));
            yy = -10.25 + (((tickAnim - 206) / 134) * (-18.07869-(-10.25)));
            zz = 0 + (((tickAnim - 206) / 134) * (1.37736-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 14.3681 + (((tickAnim - 340) / 136) * (14.3681-(14.3681)));
            yy = -18.07869 + (((tickAnim - 340) / 136) * (-18.07869-(-18.07869)));
            zz = 1.37736 + (((tickAnim - 340) / 136) * (1.37736-(1.37736)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 14.3681 + (((tickAnim - 476) / 136) * (14.3681-(14.3681)));
            yy = -18.07869 + (((tickAnim - 476) / 136) * (-18.07869-(-18.07869)));
            zz = 1.37736 + (((tickAnim - 476) / 136) * (1.37736-(1.37736)));
        }
        else if (tickAnim >= 612 && tickAnim < 721) {
            xx = 14.3681 + (((tickAnim - 612) / 109) * (14.3681-(14.3681)));
            yy = -18.07869 + (((tickAnim - 612) / 109) * (-18.07869-(-18.07869)));
            zz = 1.37736 + (((tickAnim - 612) / 109) * (1.37736-(1.37736)));
        }
        else if (tickAnim >= 721 && tickAnim < 771) {
            xx = 14.3681 + (((tickAnim - 721) / 50) * (14.76211-(14.3681)));
            yy = -18.07869 + (((tickAnim - 721) / 50) * (-10.0617-(-18.07869)));
            zz = 1.37736 + (((tickAnim - 721) / 50) * (-7.95207-(1.37736)));
        }
        else if (tickAnim >= 771 && tickAnim < 788) {
            xx = 14.76211 + (((tickAnim - 771) / 17) * (9.82259-(14.76211)));
            yy = -10.0617 + (((tickAnim - 771) / 17) * (-12.13437-(-10.0617)));
            zz = -7.95207 + (((tickAnim - 771) / 17) * (-4.00022-(-7.95207)));
        }
        else if (tickAnim >= 788 && tickAnim < 802) {
            xx = 9.82259 + (((tickAnim - 788) / 14) * (5.5-(9.82259)));
            yy = -12.13437 + (((tickAnim - 788) / 14) * (-10.25-(-12.13437)));
            zz = -4.00022 + (((tickAnim - 788) / 14) * (0-(-4.00022)));
        }
        else if (tickAnim >= 802 && tickAnim < 845) {
            xx = 5.5 + (((tickAnim - 802) / 43) * (0-(5.5)));
            yy = -10.25 + (((tickAnim - 802) / 43) * (0-(-10.25)));
            zz = 0 + (((tickAnim - 802) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 15) / 153) * (-0.17-(0)));
            yy = 0 + (((tickAnim - 15) / 153) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 153) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 253) {
            xx = -0.17 + (((tickAnim - 168) / 85) * (-0.5-(-0.17)));
            yy = 0 + (((tickAnim - 168) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 85) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 340) {
            xx = -0.5 + (((tickAnim - 253) / 87) * (-0.9-(-0.5)));
            yy = 0 + (((tickAnim - 253) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 87) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = -0.9 + (((tickAnim - 340) / 136) * (-0.9-(-0.9)));
            yy = 0 + (((tickAnim - 340) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 136) * (0-(0)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = -0.9 + (((tickAnim - 476) / 136) * (-0.9-(-0.9)));
            yy = 0 + (((tickAnim - 476) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 476) / 136) * (0-(0)));
        }
        else if (tickAnim >= 612 && tickAnim < 721) {
            xx = -0.9 + (((tickAnim - 612) / 109) * (-0.9-(-0.9)));
            yy = 0 + (((tickAnim - 612) / 109) * (0-(0)));
            zz = 0 + (((tickAnim - 612) / 109) * (0-(0)));
        }
        else if (tickAnim >= 721 && tickAnim < 771) {
            xx = -0.9 + (((tickAnim - 721) / 50) * (-0.025-(-0.9)));
            yy = 0 + (((tickAnim - 721) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 721) / 50) * (0-(0)));
        }
        else if (tickAnim >= 771 && tickAnim < 845) {
            xx = -0.025 + (((tickAnim - 771) / 74) * (0-(-0.025)));
            yy = 0 + (((tickAnim - 771) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 771) / 74) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.375-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*7 + (((tickAnim - 8) / 7) * (0-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*7)));
            yy = 2.375 + (((tickAnim - 8) / 7) * (4.75-(2.375)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (-0.3049-(0)));
            yy = 4.75 + (((tickAnim - 15) / 70) * (-6.86752-(4.75)));
            zz = 0 + (((tickAnim - 15) / 70) * (2.43782-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 116) {
            xx = -0.3049 + (((tickAnim - 85) / 31) * (-0.3049-(-0.3049)));
            yy = -6.86752 + (((tickAnim - 85) / 31) * (-6.86752-(-6.86752)));
            zz = 2.43782 + (((tickAnim - 85) / 31) * (2.43782-(2.43782)));
        }
        else if (tickAnim >= 116 && tickAnim < 168) {
            xx = -0.3049 + (((tickAnim - 116) / 52) * (-0.39786-(-0.3049)));
            yy = -6.86752 + (((tickAnim - 116) / 52) * (-2.3195+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3.5-(-6.86752)));
            zz = 2.43782 + (((tickAnim - 116) / 52) * (-1.84213-(2.43782)));
        }
        else if (tickAnim >= 168 && tickAnim < 206) {
            xx = -0.39786 + (((tickAnim - 168) / 38) * (-0.3049-(-0.39786)));
            yy = -2.3195+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3.5 + (((tickAnim - 168) / 38) * (-6.86752-(-2.3195+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3.5)));
            zz = -1.84213 + (((tickAnim - 168) / 38) * (2.43782-(-1.84213)));
        }
        else if (tickAnim >= 206 && tickAnim < 253) {
            xx = -0.3049 + (((tickAnim - 206) / 47) * (-26.92093-(-0.3049)));
            yy = -6.86752 + (((tickAnim - 206) / 47) * (-10.98621-(-6.86752)));
            zz = 2.43782 + (((tickAnim - 206) / 47) * (6.13064-(2.43782)));
        }
        else if (tickAnim >= 253 && tickAnim < 340) {
            xx = -26.92093 + (((tickAnim - 253) / 87) * (4.47831-(-26.92093)));
            yy = -10.98621 + (((tickAnim - 253) / 87) * (-21.1023-(-10.98621)));
            zz = 6.13064 + (((tickAnim - 253) / 87) * (15.20071-(6.13064)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 4.47831 + (((tickAnim - 340) / 136) * (4.47831-(4.47831)));
            yy = -21.1023 + (((tickAnim - 340) / 136) * (-21.1023-(-21.1023)));
            zz = 15.20071 + (((tickAnim - 340) / 136) * (15.20071-(15.20071)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 4.47831 + (((tickAnim - 476) / 136) * (4.47831-(4.47831)));
            yy = -21.1023 + (((tickAnim - 476) / 136) * (-21.1023-(-21.1023)));
            zz = 15.20071 + (((tickAnim - 476) / 136) * (15.20071-(15.20071)));
        }
        else if (tickAnim >= 612 && tickAnim < 721) {
            xx = 4.47831 + (((tickAnim - 612) / 109) * (4.47831-(4.47831)));
            yy = -21.1023 + (((tickAnim - 612) / 109) * (-21.1023-(-21.1023)));
            zz = 15.20071 + (((tickAnim - 612) / 109) * (15.20071-(15.20071)));
        }
        else if (tickAnim >= 721 && tickAnim < 771) {
            xx = 4.47831 + (((tickAnim - 721) / 50) * (-6.86055-(4.47831)));
            yy = -21.1023 + (((tickAnim - 721) / 50) * (-17.86186-(-21.1023)));
            zz = 15.20071 + (((tickAnim - 721) / 50) * (12.29533-(15.20071)));
        }
        else if (tickAnim >= 771 && tickAnim < 788) {
            xx = -6.86055 + (((tickAnim - 771) / 17) * (-4.04859-(-6.86055)));
            yy = -17.86186 + (((tickAnim - 771) / 17) * (-19.75849-(-17.86186)));
            zz = 12.29533 + (((tickAnim - 771) / 17) * (9.64089-(12.29533)));
        }
        else if (tickAnim >= 788 && tickAnim < 802) {
            xx = -4.04859 + (((tickAnim - 788) / 14) * (-0.3049-(-4.04859)));
            yy = -19.75849 + (((tickAnim - 788) / 14) * (-6.86752-(-19.75849)));
            zz = 9.64089 + (((tickAnim - 788) / 14) * (2.43782-(9.64089)));
        }
        else if (tickAnim >= 802 && tickAnim < 845) {
            xx = -0.3049 + (((tickAnim - 802) / 43) * (0-(-0.3049)));
            yy = -6.86752 + (((tickAnim - 802) / 43) * (0-(-6.86752)));
            zz = 2.43782 + (((tickAnim - 802) / 43) * (0-(2.43782)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 206 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 206) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 206) / 47) * (0.175-(0)));
            zz = 0 + (((tickAnim - 206) / 47) * (0.75-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 253) / 87) * (0-(0)));
            yy = 0.175 + (((tickAnim - 253) / 87) * (0-(0.175)));
            zz = 0.75 + (((tickAnim - 253) / 87) * (0.025-(0.75)));
        }
        else if (tickAnim >= 340 && tickAnim < 721) {
            xx = 0 + (((tickAnim - 340) / 381) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 381) * (0-(0)));
            zz = 0.025 + (((tickAnim - 340) / 381) * (0.025-(0.025)));
        }
        else if (tickAnim >= 721 && tickAnim < 802) {
            xx = 0 + (((tickAnim - 721) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 721) / 81) * (0-(0)));
            zz = 0.025 + (((tickAnim - 721) / 81) * (0-(0.025)));
        }
        else if (tickAnim >= 802 && tickAnim < 845) {
            xx = 0 + (((tickAnim - 802) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 802) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 802) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (3.24395-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (-0.1983-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (3.49438-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 3.24395 + (((tickAnim - 85) / 121) * (3.24395-(3.24395)));
            yy = -0.1983 + (((tickAnim - 85) / 121) * (-0.1983-(-0.1983)));
            zz = 3.49438 + (((tickAnim - 85) / 121) * (3.49438-(3.49438)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 3.24395 + (((tickAnim - 206) / 134) * (2.80823-(3.24395)));
            yy = -0.1983 + (((tickAnim - 206) / 134) * (-1.63661-(-0.1983)));
            zz = 3.49438 + (((tickAnim - 206) / 134) * (30.20988-(3.49438)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 2.80823 + (((tickAnim - 340) / 136) * (2.80823-(2.80823)));
            yy = -1.63661 + (((tickAnim - 340) / 136) * (-1.63661-(-1.63661)));
            zz = 30.20988 + (((tickAnim - 340) / 136) * (30.20988-(30.20988)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 2.80823 + (((tickAnim - 476) / 136) * (2.80823-(2.80823)));
            yy = -1.63661 + (((tickAnim - 476) / 136) * (-1.63661-(-1.63661)));
            zz = 30.20988 + (((tickAnim - 476) / 136) * (30.20988-(30.20988)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 2.80823 + (((tickAnim - 612) / 136) * (2.80823-(2.80823)));
            yy = -1.63661 + (((tickAnim - 612) / 136) * (-1.63661-(-1.63661)));
            zz = 30.20988 + (((tickAnim - 612) / 136) * (30.20988-(30.20988)));
        }
        else if (tickAnim >= 748 && tickAnim < 771) {
            xx = 2.80823 + (((tickAnim - 748) / 23) * (2.35867-(2.80823)));
            yy = -1.63661 + (((tickAnim - 748) / 23) * (-2.23652-(-1.63661)));
            zz = 30.20988 + (((tickAnim - 748) / 23) * (33.3789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*9-(30.20988)));
        }
        else if (tickAnim >= 771 && tickAnim < 793) {
            xx = 2.35867 + (((tickAnim - 771) / 22) * (2.84323-(2.35867)));
            yy = -2.23652 + (((tickAnim - 771) / 22) * (-1.57498-(-2.23652)));
            zz = 33.3789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*9 + (((tickAnim - 771) / 22) * (18.886+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*9-(33.3789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*9)));
        }
        else if (tickAnim >= 793 && tickAnim < 845) {
            xx = 2.84323 + (((tickAnim - 793) / 52) * (0-(2.84323)));
            yy = -1.57498 + (((tickAnim - 793) / 52) * (0-(-1.57498)));
            zz = 18.886+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*9 + (((tickAnim - 793) / 52) * (0-(18.886+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (-11.925-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 0 + (((tickAnim - 85) / 121) * (0-(0)));
            yy = -11.925 + (((tickAnim - 85) / 121) * (-11.925-(-11.925)));
            zz = 0 + (((tickAnim - 85) / 121) * (0-(0)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 206) / 134) * (3.45-(0)));
            yy = -11.925 + (((tickAnim - 206) / 134) * (-20.47-(-11.925)));
            zz = 0 + (((tickAnim - 206) / 134) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 3.45 + (((tickAnim - 340) / 136) * (3.45-(3.45)));
            yy = -20.47 + (((tickAnim - 340) / 136) * (-20.47-(-20.47)));
            zz = 0 + (((tickAnim - 340) / 136) * (0-(0)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 3.45 + (((tickAnim - 476) / 136) * (3.45-(3.45)));
            yy = -20.47 + (((tickAnim - 476) / 136) * (-20.47-(-20.47)));
            zz = 0 + (((tickAnim - 476) / 136) * (0-(0)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 3.45 + (((tickAnim - 612) / 136) * (3.45-(3.45)));
            yy = -20.47 + (((tickAnim - 612) / 136) * (-20.47-(-20.47)));
            zz = 0 + (((tickAnim - 612) / 136) * (0-(0)));
        }
        else if (tickAnim >= 748 && tickAnim < 771) {
            xx = 3.45 + (((tickAnim - 748) / 23) * (4.075-(3.45)));
            yy = -20.47 + (((tickAnim - 748) / 23) * (-20.47-(-20.47)));
            zz = 0 + (((tickAnim - 748) / 23) * (0-(0)));
        }
        else if (tickAnim >= 771 && tickAnim < 793) {
            xx = 4.075 + (((tickAnim - 771) / 22) * (2.84-(4.075)));
            yy = -20.47 + (((tickAnim - 771) / 22) * (-12.635-(-20.47)));
            zz = 0 + (((tickAnim - 771) / 22) * (0-(0)));
        }
        else if (tickAnim >= 793 && tickAnim < 845) {
            xx = 2.84 + (((tickAnim - 793) / 52) * (0-(2.84)));
            yy = -12.635 + (((tickAnim - 793) / 52) * (0-(-12.635)));
            zz = 0 + (((tickAnim - 793) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 15) / 35) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 15) / 35) * (1.5-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 206) {
            xx = -3.75 + (((tickAnim - 50) / 156) * (-3.75-(-3.75)));
            yy = 1.5 + (((tickAnim - 50) / 156) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 50) / 156) * (0-(0)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = -3.75 + (((tickAnim - 206) / 134) * (-3.82886-(-3.75)));
            yy = 1.5 + (((tickAnim - 206) / 134) * (1.28515-(1.5)));
            zz = 0 + (((tickAnim - 206) / 134) * (-3.24385-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = -3.82886 + (((tickAnim - 340) / 136) * (-3.82886-(-3.82886)));
            yy = 1.28515 + (((tickAnim - 340) / 136) * (1.28515-(1.28515)));
            zz = -3.24385 + (((tickAnim - 340) / 136) * (-3.24385-(-3.24385)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = -3.82886 + (((tickAnim - 476) / 136) * (-3.82886-(-3.82886)));
            yy = 1.28515 + (((tickAnim - 476) / 136) * (1.28515-(1.28515)));
            zz = -3.24385 + (((tickAnim - 476) / 136) * (-3.24385-(-3.24385)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = -3.82886 + (((tickAnim - 612) / 136) * (-3.82886-(-3.82886)));
            yy = 1.28515 + (((tickAnim - 612) / 136) * (1.28515-(1.28515)));
            zz = -3.24385 + (((tickAnim - 612) / 136) * (-3.24385-(-3.24385)));
        }
        else if (tickAnim >= 748 && tickAnim < 802) {
            xx = -3.82886 + (((tickAnim - 748) / 54) * (-3.75-(-3.82886)));
            yy = 1.28515 + (((tickAnim - 748) / 54) * (1.5-(1.28515)));
            zz = -3.24385 + (((tickAnim - 748) / 54) * (0-(-3.24385)));
        }
        else if (tickAnim >= 802 && tickAnim < 845) {
            xx = -3.75 + (((tickAnim - 802) / 43) * (0-(-3.75)));
            yy = 1.5 + (((tickAnim - 802) / 43) * (0-(1.5)));
            zz = 0 + (((tickAnim - 802) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 15) / 325) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 325) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 325) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 0 + (((tickAnim - 340) / 136) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 136) * (0-(0)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 0 + (((tickAnim - 476) / 136) * (0-(0)));
            yy = 0 + (((tickAnim - 476) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 476) / 136) * (0-(0)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 0 + (((tickAnim - 612) / 136) * (0-(0)));
            yy = 0 + (((tickAnim - 612) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 612) / 136) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 1 + (((tickAnim - 0) / 85) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 85) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 85) * (1-(1)));
        }
        else if (tickAnim >= 85 && tickAnim < 114) {
            xx = 1 + (((tickAnim - 85) / 29) * (0.975-(1)));
            yy = 1 + (((tickAnim - 85) / 29) * (1-(1)));
            zz = 1 + (((tickAnim - 85) / 29) * (1-(1)));
        }
        else if (tickAnim >= 114 && tickAnim < 157) {
            xx = 0.975 + (((tickAnim - 114) / 43) * (1-(0.975)));
            yy = 1 + (((tickAnim - 114) / 43) * (1-(1)));
            zz = 1 + (((tickAnim - 114) / 43) * (1-(1)));
        }
        else if (tickAnim >= 157 && tickAnim < 206) {
            xx = 1 + (((tickAnim - 157) / 49) * (0.975-(1)));
            yy = 1 + (((tickAnim - 157) / 49) * (1-(1)));
            zz = 1 + (((tickAnim - 157) / 49) * (1-(1)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 0.975 + (((tickAnim - 206) / 134) * (1-(0.975)));
            yy = 1 + (((tickAnim - 206) / 134) * (1-(1)));
            zz = 1 + (((tickAnim - 206) / 134) * (1-(1)));
        }
        else if (tickAnim >= 340 && tickAnim < 357) {
            xx = 1 + (((tickAnim - 340) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 340) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 340) / 17) * (1-(1)));
        }
        else if (tickAnim >= 357 && tickAnim < 386) {
            xx = 1 + (((tickAnim - 357) / 29) * (0.9617-(1)));
            yy = 1 + (((tickAnim - 357) / 29) * (1-(1)));
            zz = 1 + (((tickAnim - 357) / 29) * (1-(1)));
        }
        else if (tickAnim >= 386 && tickAnim < 428) {
            xx = 0.9617 + (((tickAnim - 386) / 42) * (1-(0.9617)));
            yy = 1 + (((tickAnim - 386) / 42) * (1-(1)));
            zz = 1 + (((tickAnim - 386) / 42) * (1-(1)));
        }
        else if (tickAnim >= 428 && tickAnim < 458) {
            xx = 1 + (((tickAnim - 428) / 30) * (0.9617-(1)));
            yy = 1 + (((tickAnim - 428) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 428) / 30) * (1-(1)));
        }
        else if (tickAnim >= 458 && tickAnim < 476) {
            xx = 0.9617 + (((tickAnim - 458) / 18) * (1-(0.9617)));
            yy = 1 + (((tickAnim - 458) / 18) * (1-(1)));
            zz = 1 + (((tickAnim - 458) / 18) * (1-(1)));
        }
        else if (tickAnim >= 476 && tickAnim < 493) {
            xx = 1 + (((tickAnim - 476) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 476) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 476) / 17) * (1-(1)));
        }
        else if (tickAnim >= 493 && tickAnim < 522) {
            xx = 1 + (((tickAnim - 493) / 29) * (0.9617-(1)));
            yy = 1 + (((tickAnim - 493) / 29) * (1-(1)));
            zz = 1 + (((tickAnim - 493) / 29) * (1-(1)));
        }
        else if (tickAnim >= 522 && tickAnim < 564) {
            xx = 0.9617 + (((tickAnim - 522) / 42) * (1-(0.9617)));
            yy = 1 + (((tickAnim - 522) / 42) * (1-(1)));
            zz = 1 + (((tickAnim - 522) / 42) * (1-(1)));
        }
        else if (tickAnim >= 564 && tickAnim < 593) {
            xx = 1 + (((tickAnim - 564) / 29) * (0.9617-(1)));
            yy = 1 + (((tickAnim - 564) / 29) * (1-(1)));
            zz = 1 + (((tickAnim - 564) / 29) * (1-(1)));
        }
        else if (tickAnim >= 593 && tickAnim < 612) {
            xx = 0.9617 + (((tickAnim - 593) / 19) * (1-(0.9617)));
            yy = 1 + (((tickAnim - 593) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 593) / 19) * (1-(1)));
        }
        else if (tickAnim >= 612 && tickAnim < 628) {
            xx = 1 + (((tickAnim - 612) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 612) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 612) / 16) * (1-(1)));
        }
        else if (tickAnim >= 628 && tickAnim < 658) {
            xx = 1 + (((tickAnim - 628) / 30) * (0.9617-(1)));
            yy = 1 + (((tickAnim - 628) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 628) / 30) * (1-(1)));
        }
        else if (tickAnim >= 658 && tickAnim < 700) {
            xx = 0.9617 + (((tickAnim - 658) / 42) * (1-(0.9617)));
            yy = 1 + (((tickAnim - 658) / 42) * (1-(1)));
            zz = 1 + (((tickAnim - 658) / 42) * (1-(1)));
        }
        else if (tickAnim >= 700 && tickAnim < 729) {
            xx = 1 + (((tickAnim - 700) / 29) * (0.9617-(1)));
            yy = 1 + (((tickAnim - 700) / 29) * (1-(1)));
            zz = 1 + (((tickAnim - 700) / 29) * (1-(1)));
        }
        else if (tickAnim >= 729 && tickAnim < 748) {
            xx = 0.9617 + (((tickAnim - 729) / 19) * (1-(0.9617)));
            yy = 1 + (((tickAnim - 729) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 729) / 19) * (1-(1)));
        }
        else if (tickAnim >= 748 && tickAnim < 802) {
            xx = 1 + (((tickAnim - 748) / 54) * (0.975-(1)));
            yy = 1 + (((tickAnim - 748) / 54) * (1-(1)));
            zz = 1 + (((tickAnim - 748) / 54) * (1-(1)));
        }
        else if (tickAnim >= 802 && tickAnim < 845) {
            xx = 0.975 + (((tickAnim - 802) / 43) * (1-(0.975)));
            yy = 1 + (((tickAnim - 802) / 43) * (1-(1)));
            zz = 1 + (((tickAnim - 802) / 43) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.chest.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (16.54928-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (-5.01693-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (21.44802-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 16.54928 + (((tickAnim - 85) / 121) * (16.54928-(16.54928)));
            yy = -5.01693 + (((tickAnim - 85) / 121) * (-5.01693-(-5.01693)));
            zz = 21.44802 + (((tickAnim - 85) / 121) * (21.44802-(21.44802)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 16.54928 + (((tickAnim - 206) / 134) * (22.32832-(16.54928)));
            yy = -5.01693 + (((tickAnim - 206) / 134) * (0.52354-(-5.01693)));
            zz = 21.44802 + (((tickAnim - 206) / 134) * (14.34731-(21.44802)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 22.32832 + (((tickAnim - 340) / 136) * (22.32832-(22.32832)));
            yy = 0.52354 + (((tickAnim - 340) / 136) * (0.52354-(0.52354)));
            zz = 14.34731 + (((tickAnim - 340) / 136) * (14.34731-(14.34731)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 22.32832 + (((tickAnim - 476) / 136) * (22.32832-(22.32832)));
            yy = 0.52354 + (((tickAnim - 476) / 136) * (0.52354-(0.52354)));
            zz = 14.34731 + (((tickAnim - 476) / 136) * (14.34731-(14.34731)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 22.32832 + (((tickAnim - 612) / 136) * (22.32832-(22.32832)));
            yy = 0.52354 + (((tickAnim - 612) / 136) * (0.52354-(0.52354)));
            zz = 14.34731 + (((tickAnim - 612) / 136) * (14.34731-(14.34731)));
        }
        else if (tickAnim >= 748 && tickAnim < 771) {
            xx = 22.32832 + (((tickAnim - 748) / 23) * (18.99303-(22.32832)));
            yy = 0.52354 + (((tickAnim - 748) / 23) * (-8.16719-(0.52354)));
            zz = 14.34731 + (((tickAnim - 748) / 23) * (41.49755-(14.34731)));
        }
        else if (tickAnim >= 771 && tickAnim < 795) {
            xx = 18.99303 + (((tickAnim - 771) / 24) * (19.27671-(18.99303)));
            yy = -8.16719 + (((tickAnim - 771) / 24) * (-0.59012-(-8.16719)));
            zz = 41.49755 + (((tickAnim - 771) / 24) * (8.7186-(41.49755)));
        }
        else if (tickAnim >= 795 && tickAnim < 811) {
            xx = 19.27671 + (((tickAnim - 795) / 16) * (16.97929-(19.27671)));
            yy = -0.59012 + (((tickAnim - 795) / 16) * (-3.7455-(-0.59012)));
            zz = 8.7186 + (((tickAnim - 795) / 16) * (15.82379-(8.7186)));
        }
        else if (tickAnim >= 811 && tickAnim < 845) {
            xx = 16.97929 + (((tickAnim - 811) / 34) * (0-(16.97929)));
            yy = -3.7455 + (((tickAnim - 811) / 34) * (0-(-3.7455)));
            zz = 15.82379 + (((tickAnim - 811) / 34) * (0-(15.82379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (3.105-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 0 + (((tickAnim - 85) / 121) * (0-(0)));
            yy = 3.105 + (((tickAnim - 85) / 121) * (3.105-(3.105)));
            zz = 0 + (((tickAnim - 85) / 121) * (0-(0)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 206) / 134) * (0-(0)));
            yy = 3.105 + (((tickAnim - 206) / 134) * (2.25-(3.105)));
            zz = 0 + (((tickAnim - 206) / 134) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 0 + (((tickAnim - 340) / 136) * (0-(0)));
            yy = 2.25 + (((tickAnim - 340) / 136) * (2.25-(2.25)));
            zz = 0 + (((tickAnim - 340) / 136) * (0-(0)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 0 + (((tickAnim - 476) / 136) * (0-(0)));
            yy = 2.25 + (((tickAnim - 476) / 136) * (2.25-(2.25)));
            zz = 0 + (((tickAnim - 476) / 136) * (0-(0)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 0 + (((tickAnim - 612) / 136) * (0-(0)));
            yy = 2.25 + (((tickAnim - 612) / 136) * (2.25-(2.25)));
            zz = 0 + (((tickAnim - 612) / 136) * (0-(0)));
        }
        else if (tickAnim >= 748 && tickAnim < 795) {
            xx = 0 + (((tickAnim - 748) / 47) * (0-(0)));
            yy = 2.25 + (((tickAnim - 748) / 47) * (3.91-(2.25)));
            zz = 0 + (((tickAnim - 748) / 47) * (0-(0)));
        }
        else if (tickAnim >= 795 && tickAnim < 811) {
            xx = 0 + (((tickAnim - 795) / 16) * (0-(0)));
            yy = 3.91 + (((tickAnim - 795) / 16) * (1.905-(3.91)));
            zz = 0 + (((tickAnim - 795) / 16) * (0-(0)));
        }
        else if (tickAnim >= 811 && tickAnim < 845) {
            xx = 0 + (((tickAnim - 811) / 34) * (0-(0)));
            yy = 1.905 + (((tickAnim - 811) / 34) * (0-(1.905)));
            zz = 0 + (((tickAnim - 811) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (22.74915-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (-12.3274-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (-21.20615-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 22.74915 + (((tickAnim - 85) / 121) * (22.74915-(22.74915)));
            yy = -12.3274 + (((tickAnim - 85) / 121) * (-12.3274-(-12.3274)));
            zz = -21.20615 + (((tickAnim - 85) / 121) * (-21.20615-(-21.20615)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 22.74915 + (((tickAnim - 206) / 134) * (37.19723-(22.74915)));
            yy = -12.3274 + (((tickAnim - 206) / 134) * (4.42255-(-12.3274)));
            zz = -21.20615 + (((tickAnim - 206) / 134) * (-24.39556-(-21.20615)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 37.19723 + (((tickAnim - 340) / 136) * (37.19723-(37.19723)));
            yy = 4.42255 + (((tickAnim - 340) / 136) * (4.42255-(4.42255)));
            zz = -24.39556 + (((tickAnim - 340) / 136) * (-24.39556-(-24.39556)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 37.19723 + (((tickAnim - 476) / 136) * (37.19723-(37.19723)));
            yy = 4.42255 + (((tickAnim - 476) / 136) * (4.42255-(4.42255)));
            zz = -24.39556 + (((tickAnim - 476) / 136) * (-24.39556-(-24.39556)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 37.19723 + (((tickAnim - 612) / 136) * (37.19723-(37.19723)));
            yy = 4.42255 + (((tickAnim - 612) / 136) * (4.42255-(4.42255)));
            zz = -24.39556 + (((tickAnim - 612) / 136) * (-24.39556-(-24.39556)));
        }
        else if (tickAnim >= 748 && tickAnim < 771) {
            xx = 37.19723 + (((tickAnim - 748) / 23) * (20.67661-(37.19723)));
            yy = 4.42255 + (((tickAnim - 748) / 23) * (4.88754-(4.42255)));
            zz = -24.39556 + (((tickAnim - 748) / 23) * (-7.56644-(-24.39556)));
        }
        else if (tickAnim >= 771 && tickAnim < 795) {
            xx = 20.67661 + (((tickAnim - 771) / 24) * (11.71493-(20.67661)));
            yy = 4.88754 + (((tickAnim - 771) / 24) * (-6.22745-(4.88754)));
            zz = -7.56644 + (((tickAnim - 771) / 24) * (-14.51749-(-7.56644)));
        }
        else if (tickAnim >= 795 && tickAnim < 811) {
            xx = 11.71493 + (((tickAnim - 795) / 16) * (11.82267-(11.71493)));
            yy = -6.22745 + (((tickAnim - 795) / 16) * (-7.00361-(-6.22745)));
            zz = -14.51749 + (((tickAnim - 795) / 16) * (-18.41319-(-14.51749)));
        }
        else if (tickAnim >= 811 && tickAnim < 845) {
            xx = 11.82267 + (((tickAnim - 811) / 34) * (0-(11.82267)));
            yy = -7.00361 + (((tickAnim - 811) / 34) * (0-(-7.00361)));
            zz = -18.41319 + (((tickAnim - 811) / 34) * (0-(-18.41319)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (1.6-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (1.705-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (-0.375-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 1.6 + (((tickAnim - 85) / 121) * (1.6-(1.6)));
            yy = 1.705 + (((tickAnim - 85) / 121) * (1.705-(1.705)));
            zz = -0.375 + (((tickAnim - 85) / 121) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 1.6 + (((tickAnim - 206) / 134) * (0.875-(1.6)));
            yy = 1.705 + (((tickAnim - 206) / 134) * (0.875-(1.705)));
            zz = -0.375 + (((tickAnim - 206) / 134) * (0-(-0.375)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 0.875 + (((tickAnim - 340) / 136) * (0.875-(0.875)));
            yy = 0.875 + (((tickAnim - 340) / 136) * (0.875-(0.875)));
            zz = 0 + (((tickAnim - 340) / 136) * (0-(0)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 0.875 + (((tickAnim - 476) / 136) * (0.875-(0.875)));
            yy = 0.875 + (((tickAnim - 476) / 136) * (0.875-(0.875)));
            zz = 0 + (((tickAnim - 476) / 136) * (0-(0)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 0.875 + (((tickAnim - 612) / 136) * (0.875-(0.875)));
            yy = 0.875 + (((tickAnim - 612) / 136) * (0.875-(0.875)));
            zz = 0 + (((tickAnim - 612) / 136) * (0-(0)));
        }
        else if (tickAnim >= 748 && tickAnim < 771) {
            xx = 0.875 + (((tickAnim - 748) / 23) * (0-(0.875)));
            yy = 0.875 + (((tickAnim - 748) / 23) * (0-(0.875)));
            zz = 0 + (((tickAnim - 748) / 23) * (0-(0)));
        }
        else if (tickAnim >= 771 && tickAnim < 795) {
            xx = 0 + (((tickAnim - 771) / 24) * (0.36-(0)));
            yy = 0 + (((tickAnim - 771) / 24) * (-0.23-(0)));
            zz = 0 + (((tickAnim - 771) / 24) * (-0.23-(0)));
        }
        else if (tickAnim >= 795 && tickAnim < 811) {
            xx = 0.36 + (((tickAnim - 795) / 16) * (0.6-(0.36)));
            yy = -0.23 + (((tickAnim - 795) / 16) * (-0.22-(-0.23)));
            zz = -0.23 + (((tickAnim - 795) / 16) * (-0.375-(-0.23)));
        }
        else if (tickAnim >= 811 && tickAnim < 845) {
            xx = 0.6 + (((tickAnim - 811) / 34) * (0-(0.6)));
            yy = -0.22 + (((tickAnim - 811) / 34) * (0-(-0.22)));
            zz = -0.375 + (((tickAnim - 811) / 34) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (-37.25-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = -37.25 + (((tickAnim - 85) / 121) * (-37.25-(-37.25)));
            yy = 0 + (((tickAnim - 85) / 121) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 121) * (0-(0)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = -37.25 + (((tickAnim - 206) / 134) * (11.5-(-37.25)));
            yy = 0 + (((tickAnim - 206) / 134) * (0-(0)));
            zz = 0 + (((tickAnim - 206) / 134) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 11.5 + (((tickAnim - 340) / 136) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 340) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 136) * (0-(0)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 11.5 + (((tickAnim - 476) / 136) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 476) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 476) / 136) * (0-(0)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 11.5 + (((tickAnim - 612) / 136) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 612) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 612) / 136) * (0-(0)));
        }
        else if (tickAnim >= 748 && tickAnim < 771) {
            xx = 11.5 + (((tickAnim - 748) / 23) * (-11.12918-(11.5)));
            yy = 0 + (((tickAnim - 748) / 23) * (-2.97112-(0)));
            zz = 0 + (((tickAnim - 748) / 23) * (-8.49925-(0)));
        }
        else if (tickAnim >= 771 && tickAnim < 811) {
            xx = -11.12918 + (((tickAnim - 771) / 40) * (-24.75-(-11.12918)));
            yy = -2.97112 + (((tickAnim - 771) / 40) * (0-(-2.97112)));
            zz = -8.49925 + (((tickAnim - 771) / 40) * (0-(-8.49925)));
        }
        else if (tickAnim >= 811 && tickAnim < 845) {
            xx = -24.75 + (((tickAnim - 811) / 34) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 811) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 811) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (0.53-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (1.02-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 0 + (((tickAnim - 85) / 121) * (0-(0)));
            yy = 0.53 + (((tickAnim - 85) / 121) * (0.53-(0.53)));
            zz = 1.02 + (((tickAnim - 85) / 121) * (1.02-(1.02)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 206) / 134) * (0-(0)));
            yy = 0.53 + (((tickAnim - 206) / 134) * (0.53-(0.53)));
            zz = 1.02 + (((tickAnim - 206) / 134) * (0.02-(1.02)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 0 + (((tickAnim - 340) / 136) * (0-(0)));
            yy = 0.53 + (((tickAnim - 340) / 136) * (0.53-(0.53)));
            zz = 0.02 + (((tickAnim - 340) / 136) * (0.02-(0.02)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 0 + (((tickAnim - 476) / 136) * (0-(0)));
            yy = 0.53 + (((tickAnim - 476) / 136) * (0.53-(0.53)));
            zz = 0.02 + (((tickAnim - 476) / 136) * (0.02-(0.02)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 0 + (((tickAnim - 612) / 136) * (0-(0)));
            yy = 0.53 + (((tickAnim - 612) / 136) * (0.53-(0.53)));
            zz = 0.02 + (((tickAnim - 612) / 136) * (0.02-(0.02)));
        }
        else if (tickAnim >= 748 && tickAnim < 811) {
            xx = 0 + (((tickAnim - 748) / 63) * (0-(0)));
            yy = 0.53 + (((tickAnim - 748) / 63) * (0.53-(0.53)));
            zz = 0.02 + (((tickAnim - 748) / 63) * (0.795-(0.02)));
        }
        else if (tickAnim >= 811 && tickAnim < 845) {
            xx = 0 + (((tickAnim - 811) / 34) * (0-(0)));
            yy = 0.53 + (((tickAnim - 811) / 34) * (0-(0.53)));
            zz = 0.795 + (((tickAnim - 811) / 34) * (0-(0.795)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (16.93037-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (3.91364-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (-16.55634-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 16.93037 + (((tickAnim - 85) / 121) * (16.93037-(16.93037)));
            yy = 3.91364 + (((tickAnim - 85) / 121) * (3.91364-(3.91364)));
            zz = -16.55634 + (((tickAnim - 85) / 121) * (-16.55634-(-16.55634)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 16.93037 + (((tickAnim - 206) / 134) * (59.8353-(16.93037)));
            yy = 3.91364 + (((tickAnim - 206) / 134) * (8.16504-(3.91364)));
            zz = -16.55634 + (((tickAnim - 206) / 134) * (-10.3417-(-16.55634)));
        }
        else if (tickAnim >= 340 && tickAnim < 476) {
            xx = 59.8353 + (((tickAnim - 340) / 136) * (59.8353-(59.8353)));
            yy = 8.16504 + (((tickAnim - 340) / 136) * (8.16504-(8.16504)));
            zz = -10.3417 + (((tickAnim - 340) / 136) * (-10.3417-(-10.3417)));
        }
        else if (tickAnim >= 476 && tickAnim < 612) {
            xx = 59.8353 + (((tickAnim - 476) / 136) * (59.8353-(59.8353)));
            yy = 8.16504 + (((tickAnim - 476) / 136) * (8.16504-(8.16504)));
            zz = -10.3417 + (((tickAnim - 476) / 136) * (-10.3417-(-10.3417)));
        }
        else if (tickAnim >= 612 && tickAnim < 748) {
            xx = 59.8353 + (((tickAnim - 612) / 136) * (59.8353-(59.8353)));
            yy = 8.16504 + (((tickAnim - 612) / 136) * (8.16504-(8.16504)));
            zz = -10.3417 + (((tickAnim - 612) / 136) * (-10.3417-(-10.3417)));
        }
        else if (tickAnim >= 748 && tickAnim < 771) {
            xx = 59.8353 + (((tickAnim - 748) / 23) * (59.13832-(59.8353)));
            yy = 8.16504 + (((tickAnim - 748) / 23) * (14.67842-(8.16504)));
            zz = -10.3417 + (((tickAnim - 748) / 23) * (-19.2665-(-10.3417)));
        }
        else if (tickAnim >= 771 && tickAnim < 793) {
            xx = 59.13832 + (((tickAnim - 771) / 22) * (11.19572-(59.13832)));
            yy = 14.67842 + (((tickAnim - 771) / 22) * (8.53806-(14.67842)));
            zz = -19.2665 + (((tickAnim - 771) / 22) * (-29.52887-(-19.2665)));
        }
        else if (tickAnim >= 793 && tickAnim < 845) {
            xx = 11.19572 + (((tickAnim - 793) / 52) * (0-(11.19572)));
            yy = 8.53806 + (((tickAnim - 793) / 52) * (0-(8.53806)));
            zz = -29.52887 + (((tickAnim - 793) / 52) * (0-(-29.52887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 15) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 70) * (2.33-(0)));
            zz = 0 + (((tickAnim - 15) / 70) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 206) {
            xx = 0 + (((tickAnim - 85) / 121) * (0-(0)));
            yy = 2.33 + (((tickAnim - 85) / 121) * (2.33-(2.33)));
            zz = 0 + (((tickAnim - 85) / 121) * (0-(0)));
        }
        else if (tickAnim >= 206 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 206) / 134) * (0-(0)));
            yy = 2.33 + (((tickAnim - 206) / 134) * (5.78-(2.33)));
            zz = 0 + (((tickAnim - 206) / 134) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 340) / -340) * (-(0)));
            yy = 5.78 + (((tickAnim - 340) / -340) * (-(5.78)));
            zz = 0 + (((tickAnim - 340) / -340) * (-(0)));
        }

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-8.5-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -8.5 + (((tickAnim - 11) / 9) * (0-(-8.5)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.07855-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.99846-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (3.2986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -0.07855 + (((tickAnim - 11) / 7) * (0-(-0.07855)));
            yy = 1.99846 + (((tickAnim - 11) / 7) * (0.75-(1.99846)));
            zz = 3.2986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 11) / 7) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(3.2986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0.75 + (((tickAnim - 18) / 12) * (0-(0.75)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 18) / 12) * (0-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 15) * (5.5-(0)));
            zz = 3 + (((tickAnim - 8) / 15) * (-0.33333-(3)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 5.5 + (((tickAnim - 23) / 7) * (0-(5.5)));
            zz = -0.33333 + (((tickAnim - 23) / 7) * (0-(-0.33333)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-9.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -9.75 + (((tickAnim - 8) / 5) * (-3.5-(-9.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -3.5 + (((tickAnim - 13) / 5) * (6.85-(-3.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 6.85 + (((tickAnim - 18) / 5) * (10.6-(6.85)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 10.6 + (((tickAnim - 23) / 7) * (0-(10.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 4) / 4) * (-0.6-(-0.3)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 8) / 5) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 13) / 5) * (-0.55-(-0.6)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.55 + (((tickAnim - 18) / 5) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.55 + (((tickAnim - 23) / 7) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-8.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = -8.25 + (((tickAnim - 18) / 5) * (-9-(-8.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -9 + (((tickAnim - 23) / 7) * (0-(-9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 5) * (0-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-21-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = -21 + (((tickAnim - 11) / 7) * (3.25-(-21)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 3.25 + (((tickAnim - 18) / 5) * (3.25-(3.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 3.25 + (((tickAnim - 23) / 7) * (0-(3.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = -0.625 + (((tickAnim - 11) / 7) * (-0.755-(-0.625)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.755 + (((tickAnim - 18) / 5) * (-0.755-(-0.755)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.755 + (((tickAnim - 23) / 7) * (0-(-0.755)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmR.rotationPointX = this.upperarmR.rotationPointX + (float)(xx);
        this.upperarmR.rotationPointY = this.upperarmR.rotationPointY - (float)(yy);
        this.upperarmR.rotationPointZ = this.upperarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (19-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (3.64803-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (-2.02358-(0)));
            zz = 19 + (((tickAnim - 11) / 7) * (-7.57743-(19)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 3.64803 + (((tickAnim - 18) / 5) * (3.46248-(3.64803)));
            yy = -2.02358 + (((tickAnim - 18) / 5) * (-3.16378-(-2.02358)));
            zz = -7.57743 + (((tickAnim - 18) / 5) * (-3.47896-(-7.57743)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 3.46248 + (((tickAnim - 23) / 7) * (0-(3.46248)));
            yy = -3.16378 + (((tickAnim - 23) / 7) * (0-(-3.16378)));
            zz = -3.47896 + (((tickAnim - 23) / 7) * (0-(-3.47896)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.7-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 18) / 5) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 23) / 7) * (0-(0.7)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0.425-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.375-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 18) / 5) * (0-(0.425)));
            zz = 0.375 + (((tickAnim - 18) / 5) * (0-(0.375)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handR.rotationPointX = this.handR.rotationPointX + (float)(xx);
        this.handR.rotationPointY = this.handR.rotationPointY - (float)(yy);
        this.handR.rotationPointZ = this.handR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-9.7179+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-15.00011-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (11.09238-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -9.7179+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 11) / 4) * (-5.63275-(-9.7179+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = -15.00011 + (((tickAnim - 11) / 4) * (1.00319-(-15.00011)));
            zz = 11.09238 + (((tickAnim - 11) / 4) * (5.54144-(11.09238)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -5.63275 + (((tickAnim - 15) / 4) * (5.9524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-50))*5-(-5.63275)));
            yy = 1.00319 + (((tickAnim - 15) / 4) * (17.00648-(1.00319)));
            zz = 5.54144 + (((tickAnim - 15) / 4) * (-0.00951-(5.54144)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 5.9524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-50))*5 + (((tickAnim - 19) / 11) * (0-(5.9524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-50))*5)));
            yy = 17.00648 + (((tickAnim - 19) / 11) * (0-(17.00648)));
            zz = -0.00951 + (((tickAnim - 19) / 11) * (0-(-0.00951)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-1.275-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-2.775-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -1.275 + (((tickAnim - 11) / 3) * (-0.4-(-1.275)));
            yy = 0.4 + (((tickAnim - 11) / 3) * (0.25-(0.4)));
            zz = -2.775 + (((tickAnim - 11) / 3) * (-2.775-(-2.775)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -0.4 + (((tickAnim - 14) / 16) * (0-(-0.4)));
            yy = 0.25 + (((tickAnim - 14) / 16) * (0-(0.25)));
            zz = -2.775 + (((tickAnim - 14) / 16) * (0-(-2.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-6.83546-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-3.75524-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-2.6461-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -6.83546 + (((tickAnim - 6) / 3) * (-14.63492-(-6.83546)));
            yy = -3.75524 + (((tickAnim - 6) / 3) * (-14.58813-(-3.75524)));
            zz = -2.6461 + (((tickAnim - 6) / 3) * (6.30814-(-2.6461)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -14.63492 + (((tickAnim - 9) / 3) * (-7.72653-(-14.63492)));
            yy = -14.58813 + (((tickAnim - 9) / 3) * (-0.82119-(-14.58813)));
            zz = 6.30814 + (((tickAnim - 9) / 3) * (12.289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3-(6.30814)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -7.72653 + (((tickAnim - 12) / 3) * (-5.02418-(-7.72653)));
            yy = -0.82119 + (((tickAnim - 12) / 3) * (10.66256-(-0.82119)));
            zz = 12.289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3 + (((tickAnim - 12) / 3) * (10.20611-(12.289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5.02418 + (((tickAnim - 15) / 5) * (-5.1799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-5.02418)));
            yy = 10.66256 + (((tickAnim - 15) / 5) * (17.09061-(10.66256)));
            zz = 10.20611 + (((tickAnim - 15) / 5) * (-1.6419+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(10.20611)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -5.1799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 20) / 6) * (0.97935-(-5.1799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 17.09061 + (((tickAnim - 20) / 6) * (5.95333-(17.09061)));
            zz = -1.6419+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 20) / 6) * (-5.0722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-1.6419+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.97935 + (((tickAnim - 26) / 4) * (0-(0.97935)));
            yy = 5.95333 + (((tickAnim - 26) / 4) * (0-(5.95333)));
            zz = -5.0722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 26) / 4) * (0-(-5.0722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.38-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.525-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.38 + (((tickAnim - 9) / 4) * (0.375-(0.38)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = -0.525 + (((tickAnim - 9) / 4) * (0-(-0.525)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.375 + (((tickAnim - 13) / 2) * (-0.155-(0.375)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.155 + (((tickAnim - 15) / 5) * (-0.1-(-0.155)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.55-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.1 + (((tickAnim - 20) / 10) * (0-(-0.1)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.55 + (((tickAnim - 20) / 10) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.29051-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-5.59901-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-5.77431-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0.29051 + (((tickAnim - 6) / 5) * (0-(0.29051)));
            yy = -5.59901 + (((tickAnim - 6) / 5) * (-12.25-(-5.59901)));
            zz = -5.77431 + (((tickAnim - 6) / 5) * (9-(-5.77431)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-4.85712-(0)));
            yy = -12.25 + (((tickAnim - 11) / 4) * (4.51527-(-12.25)));
            zz = 9 + (((tickAnim - 11) / 4) * (16.81466-(9)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -4.85712 + (((tickAnim - 15) / 3) * (-0.69297-(-4.85712)));
            yy = 4.51527 + (((tickAnim - 15) / 3) * (5.1245-(4.51527)));
            zz = 16.81466 + (((tickAnim - 15) / 3) * (15.05654-(16.81466)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.69297 + (((tickAnim - 18) / 5) * (-0.46321-(-0.69297)));
            yy = 5.1245 + (((tickAnim - 18) / 5) * (21.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-90))*3-(5.1245)));
            zz = 15.05654 + (((tickAnim - 18) / 5) * (-1.99412-(15.05654)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.46321 + (((tickAnim - 23) / 7) * (0-(-0.46321)));
            yy = 21.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-90))*3 + (((tickAnim - 23) / 7) * (0-(21.806+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-90))*3)));
            zz = -1.99412 + (((tickAnim - 23) / 7) * (0-(-1.99412)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.15-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -1.15 + (((tickAnim - 13) / 5) * (-0.31-(-1.15)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -0.31 + (((tickAnim - 18) / 12) * (0-(-0.31)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.5022-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-4.97478-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-7.52182-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.5022 + (((tickAnim - 6) / 3) * (0-(0.5022)));
            yy = -4.97478 + (((tickAnim - 6) / 3) * (0-(-4.97478)));
            zz = -7.52182 + (((tickAnim - 6) / 3) * (8-(-7.52182)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (10.82992-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (-14.82721-(0)));
            zz = 8 + (((tickAnim - 9) / 6) * (14.05671-(8)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 10.82992 + (((tickAnim - 15) / 7) * (9.26534-(10.82992)));
            yy = -14.82721 + (((tickAnim - 15) / 7) * (17.2588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-90))*6-(-14.82721)));
            zz = 14.05671 + (((tickAnim - 15) / 7) * (2.8065+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-90))*3-(14.05671)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 9.26534 + (((tickAnim - 22) / 8) * (0-(9.26534)));
            yy = 17.2588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-90))*6 + (((tickAnim - 22) / 8) * (0-(17.2588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-90))*6)));
            zz = 2.8065+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-90))*3 + (((tickAnim - 22) / 8) * (0-(2.8065+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-90))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.485-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.485 + (((tickAnim - 6) / 3) * (-0.775-(0.485)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.775 + (((tickAnim - 9) / 4) * (-1.1-(-0.775)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -1.1 + (((tickAnim - 13) / 5) * (-0.7-(-1.1)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.7 + (((tickAnim - 18) / 4) * (0.265-(-0.7)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0.265 + (((tickAnim - 22) / 8) * (0-(0.265)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (-9.16436-(0)));
            yy = 0 + (((tickAnim - 13) / 9) * (0.39844-(0)));
            zz = 2.5 + (((tickAnim - 13) / 9) * (0.84868-(2.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -9.16436 + (((tickAnim - 22) / 8) * (0-(-9.16436)));
            yy = 0.39844 + (((tickAnim - 22) / 8) * (0-(0.39844)));
            zz = 0.84868 + (((tickAnim - 22) / 8) * (0-(0.84868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 2.75 + (((tickAnim - 10) / 10) * (-7.75-(2.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -7.75 + (((tickAnim - 20) / 10) * (0-(-7.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 5.75 + (((tickAnim - 10) / 10) * (0-(5.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (6.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 6.5 + (((tickAnim - 10) / 10) * (0-(6.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 7 + (((tickAnim - 10) / 10) * (-2-(7)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -2 + (((tickAnim - 20) / 10) * (0-(-2)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 9.5 + (((tickAnim - 10) / 10) * (-2.5-(9.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -2.5 + (((tickAnim - 20) / 10) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.12-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -3.12 + (((tickAnim - 5) / 5) * (4.75-(-3.12)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 4.75 + (((tickAnim - 10) / 10) * (-8.25-(4.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -8.25 + (((tickAnim - 20) / 10) * (0-(-8.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2.75 + (((tickAnim - 3) / 2) * (1.67-(2.75)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.67 + (((tickAnim - 5) / 5) * (16-(1.67)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 16 + (((tickAnim - 10) / 10) * (-6.25-(16)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.25 + (((tickAnim - 20) / 10) * (0-(-6.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.94-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -2.94 + (((tickAnim - 3) / 2) * (-13.29-(-2.94)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -13.29 + (((tickAnim - 5) / 5) * (13.25-(-13.29)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 13.25 + (((tickAnim - 10) / 10) * (-10.5-(13.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -10.5 + (((tickAnim - 20) / 10) * (0-(-10.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (24.25-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 24.25 + (((tickAnim - 11) / 9) * (0-(24.25)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-10.25-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -8.75 + (((tickAnim - 11) / 5) * (0.27273-(-8.75)));
            yy = -10.25 + (((tickAnim - 11) / 5) * (-4.65909-(-10.25)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.27273 + (((tickAnim - 16) / 4) * (0-(0.27273)));
            yy = -4.65909 + (((tickAnim - 16) / 4) * (0-(-4.65909)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = -1.05 + (((tickAnim - 11) / 5) * (2.095-(-1.05)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 2.095 + (((tickAnim - 16) / 4) * (0-(2.095)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -12.5 + (((tickAnim - 20) / 13) * (10.5-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 33) / 17) * (0-(10.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (2.225-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 2.225 + (((tickAnim - 27) / 6) * (0-(2.225)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
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
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-33.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -33.5 + (((tickAnim - 20) / 7) * (-12.13-(-33.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -12.13 + (((tickAnim - 27) / 6) * (-9.75-(-12.13)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 33) / 17) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0.75 + (((tickAnim - 20) / 7) * (2.175-(0.75)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 2.175 + (((tickAnim - 27) / 6) * (-0.75-(2.175)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.75 + (((tickAnim - 33) / 17) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegL.rotationPointX = this.lowerlegL.rotationPointX + (float)(xx);
        this.lowerlegL.rotationPointY = this.lowerlegL.rotationPointY - (float)(yy);
        this.lowerlegL.rotationPointZ = this.lowerlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -10.75 + (((tickAnim - 20) / 7) * (-14.13-(-10.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -14.13 + (((tickAnim - 27) / 4) * (7.58-(-14.13)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 7.58 + (((tickAnim - 31) / 2) * (-3-(7.58)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 33) / 17) * (0-(-3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 50) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL.rotationPointX = this.footL.rotationPointX + (float)(xx);
        this.footL.rotationPointY = this.footL.rotationPointY - (float)(yy);
        this.footL.rotationPointZ = this.footL.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -4.25 + (((tickAnim - 43) / 10) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -4.25 + (((tickAnim - 53) / 47) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -6.75 + (((tickAnim - 43) / 10) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -6.75 + (((tickAnim - 53) / 47) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 43) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = -0.5 + (((tickAnim - 53) / 47) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (15.44367-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (-1.14452-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (5.63532-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 15.44367 + (((tickAnim - 43) / 10) * (15.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 43) / 10) * (-1.14452-(-1.14452)));
            zz = 5.63532 + (((tickAnim - 43) / 10) * (5.63532-(5.63532)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 15.44367 + (((tickAnim - 53) / 47) * (0-(15.44367)));
            yy = -1.14452 + (((tickAnim - 53) / 47) * (0-(-1.14452)));
            zz = 5.63532 + (((tickAnim - 53) / 47) * (0-(5.63532)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 43) / 57) * (0-(0)));
            yy = 1.425 + (((tickAnim - 43) / 57) * (0-(1.425)));
            zz = 0 + (((tickAnim - 43) / 57) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-5.25-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 7 + (((tickAnim - 43) / 10) * (7-(7)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = -5.25 + (((tickAnim - 43) / 10) * (-5.25-(-5.25)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 7 + (((tickAnim - 53) / 47) * (0-(7)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = -5.25 + (((tickAnim - 53) / 47) * (0-(-5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 43) / 57) * (0-(0)));
            yy = 0.325 + (((tickAnim - 43) / 57) * (0-(0.325)));
            zz = 0 + (((tickAnim - 43) / 57) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -11.5 + (((tickAnim - 43) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -11.5 + (((tickAnim - 53) / 47) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0.375 + (((tickAnim - 43) / 10) * (0.375-(0.375)));
            zz = 0.15 + (((tickAnim - 43) / 10) * (0.15-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (15.44367-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (-1.14452-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-5.6353-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 15.44367 + (((tickAnim - 43) / 10) * (15.44367-(15.44367)));
            yy = -1.14452 + (((tickAnim - 43) / 10) * (-1.14452-(-1.14452)));
            zz = -5.6353 + (((tickAnim - 43) / 10) * (-5.6353-(-5.6353)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 15.44367 + (((tickAnim - 53) / 47) * (0-(15.44367)));
            yy = -1.14452 + (((tickAnim - 53) / 47) * (0-(-1.14452)));
            zz = -5.6353 + (((tickAnim - 53) / 47) * (0-(-5.6353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 43) / 57) * (0-(0)));
            yy = 1.425 + (((tickAnim - 43) / 57) * (0-(1.425)));
            zz = 0 + (((tickAnim - 43) / 57) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmR.rotationPointX = this.upperarmR.rotationPointX + (float)(xx);
        this.upperarmR.rotationPointY = this.upperarmR.rotationPointY - (float)(yy);
        this.upperarmR.rotationPointZ = this.upperarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (5.25-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 7 + (((tickAnim - 43) / 10) * (7-(7)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 5.25 + (((tickAnim - 43) / 10) * (5.25-(5.25)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 7 + (((tickAnim - 53) / 47) * (0-(7)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 5.25 + (((tickAnim - 53) / 47) * (0-(5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 43) / 57) * (0-(0)));
            yy = 0.325 + (((tickAnim - 43) / 57) * (0-(0.325)));
            zz = 0 + (((tickAnim - 43) / 57) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -11.5 + (((tickAnim - 43) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -11.5 + (((tickAnim - 53) / 47) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0.375 + (((tickAnim - 43) / 10) * (0.375-(0.375)));
            zz = 0.15 + (((tickAnim - 43) / 10) * (0.15-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handR.rotationPointX = this.handR.rotationPointX + (float)(xx);
        this.handR.rotationPointY = this.handR.rotationPointY - (float)(yy);
        this.handR.rotationPointZ = this.handR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 43) / 10) * (-6.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2-(-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -6.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2 + (((tickAnim - 53) / 47) * (0-(-6.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-2)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1 + (((tickAnim - 43) / 10) * (-13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-2-(-14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-1)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-2 + (((tickAnim - 53) / 47) * (0-(-13.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-2)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 43) / 10) * (-16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-3-(-17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-3 + (((tickAnim - 53) / 47) * (0-(-16.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*-3)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 7.5 + (((tickAnim - 43) / 10) * (1.5-(7.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 1.5 + (((tickAnim - 53) / 47) * (0-(1.5)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 11 + (((tickAnim - 43) / 10) * (-5.1-(11)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -5.1 + (((tickAnim - 53) / 47) * (0-(-5.1)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = -8 + (((tickAnim - 28) / 15) * (-13.5-(-8)));
            yy = 0 + (((tickAnim - 28) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 15) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -13.5 + (((tickAnim - 43) / 10) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -7 + (((tickAnim - 53) / 47) * (0-(-7)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0.1-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            yy = -0.025 + (((tickAnim - 53) / 47) * (0-(-0.025)));
            zz = 0.1 + (((tickAnim - 53) / 47) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1 + (((tickAnim - 40) / 60) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4 + (((tickAnim - 40) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));

    }




    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -9.25 + (((tickAnim - 0) / 5) * (-15.75-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -15.75 + (((tickAnim - 5) / 4) * (-2.63-(-15.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -2.63 + (((tickAnim - 9) / 4) * (11.5-(-2.63)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 11.5 + (((tickAnim - 13) / 17) * (-9.25-(11.5)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 5) * (-0.575-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -0.575 + (((tickAnim - 5) / 4) * (-0.025-(-0.575)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.025 + (((tickAnim - 9) / 4) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0.25 + (((tickAnim - 5) / 4) * (20.38-(0.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.38 + (((tickAnim - 9) / 4) * (6.5-(20.38)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 6.5 + (((tickAnim - 13) / 17) * (0-(6.5)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0.875-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 9) / 4) * (-0.725-(0.875)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = -0.725 + (((tickAnim - 13) / 17) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5.75 + (((tickAnim - 0) / 5) * (-2.37-(5.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -2.37 + (((tickAnim - 5) / 4) * (-33.06-(-2.37)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -33.06 + (((tickAnim - 9) / 3) * (-8.63-(-33.06)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -8.63 + (((tickAnim - 12) / 1) * (-17-(-8.63)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -17 + (((tickAnim - 13) / 17) * (5.75-(-17)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0.6-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (1.05-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 9) / 4) * (0.3-(0.6)));
            zz = 1.05 + (((tickAnim - 9) / 4) * (0-(1.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = 0.3 + (((tickAnim - 13) / 17) * (0-(0.3)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 0) / 20) * (-14.25-(11)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -14.25 + (((tickAnim - 20) / 5) * (-2.63-(-14.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.63 + (((tickAnim - 25) / 5) * (11-(-2.63)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 20) * (0-(-1)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.025 + (((tickAnim - 25) / 5) * (-1-(-0.025)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmR.rotationPointX = this.upperarmR.rotationPointX + (float)(xx);
        this.upperarmR.rotationPointY = this.upperarmR.rotationPointY - (float)(yy);
        this.upperarmR.rotationPointZ = this.upperarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 0) / 20) * (0-(0.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (20.38-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20.38 + (((tickAnim - 25) / 5) * (0.75-(20.38)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.875-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.875 + (((tickAnim - 25) / 5) * (0-(0.875)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -11.25 + (((tickAnim - 0) / 10) * (-0.25-(-11.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 10) / 10) * (3.75-(-0.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 3.75 + (((tickAnim - 20) / 5) * (-28-(3.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -28 + (((tickAnim - 25) / 3) * (-2.08-(-28)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.08 + (((tickAnim - 28) / 2) * (-11.25-(-2.08)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 20) * (0-(0.75)));
            zz = -0.4 + (((tickAnim - 0) / 20) * (0-(-0.4)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (1.475-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.3-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 1.475 + (((tickAnim - 25) / 3) * (0.805-(1.475)));
            zz = -0.3 + (((tickAnim - 25) / 3) * (-0.105-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0.805 + (((tickAnim - 28) / 2) * (0.75-(0.805)));
            zz = -0.105 + (((tickAnim - 28) / 2) * (-0.4-(-0.105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handR.rotationPointX = this.handR.rotationPointX + (float)(xx);
        this.handR.rotationPointY = this.handR.rotationPointY - (float)(yy);
        this.handR.rotationPointZ = this.handR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 0) / 13) * (-15.25-(0.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -15.25 + (((tickAnim - 13) / 5) * (1.11-(-15.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 1.11 + (((tickAnim - 18) / 4) * (8.25-(1.11)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 8.25 + (((tickAnim - 22) / 8) * (0.75-(8.25)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.75-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.75 + (((tickAnim - 18) / 4) * (0-(0.75)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -5.75 + (((tickAnim - 0) / 6) * (-6.26-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -6.26 + (((tickAnim - 6) / 7) * (-15.75-(-6.26)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -15.75 + (((tickAnim - 13) / 5) * (-10.34-(-15.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -10.34 + (((tickAnim - 18) / 4) * (-2.75-(-10.34)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -2.75 + (((tickAnim - 22) / 8) * (-5.75-(-2.75)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 13) * (0-(-0.45)));
            zz = 0.55 + (((tickAnim - 0) / 13) * (-0.025-(0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (1.37-(0)));
            zz = -0.025 + (((tickAnim - 13) / 5) * (0.2-(-0.025)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.37 + (((tickAnim - 18) / 4) * (-0.8-(1.37)));
            zz = 0.2 + (((tickAnim - 18) / 4) * (-0.225-(0.2)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = -0.8 + (((tickAnim - 22) / 8) * (-0.45-(-0.8)));
            zz = -0.225 + (((tickAnim - 22) / 8) * (0.55-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegR.rotationPointX = this.lowerlegR.rotationPointX + (float)(xx);
        this.lowerlegR.rotationPointY = this.lowerlegR.rotationPointY - (float)(yy);
        this.lowerlegR.rotationPointZ = this.lowerlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 4.25 + (((tickAnim - 0) / 6) * (11.32-(4.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 11.32 + (((tickAnim - 6) / 7) * (1.25-(11.32)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1.25 + (((tickAnim - 13) / 5) * (-12.43942-(1.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (-1.24528-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.23416-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -12.43942 + (((tickAnim - 18) / 3) * (9.51122-(-12.43942)));
            yy = -1.24528 + (((tickAnim - 18) / 3) * (-0.12171-(-1.24528)));
            zz = 0.23416 + (((tickAnim - 18) / 3) * (1.20469-(0.23416)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 9.51122 + (((tickAnim - 21) / 1) * (-5.5-(9.51122)));
            yy = -0.12171 + (((tickAnim - 21) / 1) * (0-(-0.12171)));
            zz = 1.20469 + (((tickAnim - 21) / 1) * (0-(1.20469)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -5.5 + (((tickAnim - 22) / 8) * (4.25-(-5.5)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footR, footR.rotateAngleX + (float) Math.toRadians(xx), footR.rotateAngleY + (float) Math.toRadians(yy), footR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 6) / 7) * (1.45-(-0.25)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.45 + (((tickAnim - 13) / 5) * (0.8-(1.45)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 18) / 4) * (0-(0.8)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footR.rotationPointX = this.footR.rotationPointX + (float)(xx);
        this.footR.rotationPointY = this.footR.rotationPointY - (float)(yy);
        this.footR.rotationPointZ = this.footR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.11 + (((tickAnim - 0) / 5) * (8.25-(1.11)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 26) {
            xx = 8.25 + (((tickAnim - 5) / 21) * (-11.25-(8.25)));
            yy = 0 + (((tickAnim - 5) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 21) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -11.25 + (((tickAnim - 26) / 4) * (1.11-(-11.25)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 5) * (0-(0.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 5) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 21) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (0.75-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -14.93 + (((tickAnim - 0) / 3) * (-3.91-(-14.93)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.91 + (((tickAnim - 3) / 2) * (-0.25-(-3.91)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 26) {
            xx = -0.25 + (((tickAnim - 5) / 21) * (-11.75-(-0.25)));
            yy = 0 + (((tickAnim - 5) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 21) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -11.75 + (((tickAnim - 26) / 4) * (-14.93-(-11.75)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 5) * (-0.8-(1.2)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 5) / 21) * (0-(0)));
            yy = -0.8 + (((tickAnim - 5) / 21) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 5) / 21) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (1.2-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegL.rotationPointX = this.lowerlegL.rotationPointX + (float)(xx);
        this.lowerlegL.rotationPointY = this.lowerlegL.rotationPointY - (float)(yy);
        this.lowerlegL.rotationPointZ = this.lowerlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6.5 + (((tickAnim - 0) / 4) * (12.66-(-6.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 12.66 + (((tickAnim - 4) / 1) * (-8.25-(12.66)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = -8.25 + (((tickAnim - 5) / 11) * (6.81-(-8.25)));
            yy = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 6.81 + (((tickAnim - 16) / 10) * (15.5-(6.81)));
            yy = 0 + (((tickAnim - 16) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 10) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 15.5 + (((tickAnim - 26) / 4) * (-6.5-(15.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 16) * (0-(0.375)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 16) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 10) * (-1.275-(0)));
            zz = 0 + (((tickAnim - 16) / 10) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = -1.275 + (((tickAnim - 26) / 4) * (0.375-(-1.275)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL.rotationPointX = this.footL.rotationPointX + (float)(xx);
        this.footL.rotationPointY = this.footL.rotationPointY - (float)(yy);
        this.footL.rotationPointZ = this.footL.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.13-150))*0.1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1-120))*-0.3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169))*-0.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*340/1-190))*-0.1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*340/1-190))*-0.2);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.12-150))*0.3), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1+115))*-0.8));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.13+65))*0.6), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*-0.8), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1+150))*1.3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.14+65))*0.3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*0.4), neck.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1+150))*-0.7));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1+65))*0.4), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1-50))*0.5), neck2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1+150))*-0.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1+65))*0.35), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1-50))*-0.8), neck3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1+150))*-0.5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.25-70))*-0.385), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*-1.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*0.85));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.129))*-0.259), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*0.85));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*1.8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*0.85));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.124-120))*-1.8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*1), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*1.85));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.125-15))*-1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*2.2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*1.85));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.125-15))*2), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*3.2), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*2.85));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.123))*1.4), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*6.8), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*3.85));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*720/2.125-30))*9), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*9), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(2.125/1.5)*169/1))*5.85));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDicraeosaurus entity = (EntityPrehistoricFloraDicraeosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9.25 + (((tickAnim - 0) / 3) * (-15.75-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -15.75 + (((tickAnim - 3) / 3) * (-2.63-(-15.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -2.63 + (((tickAnim - 6) / 2) * (20-(-2.63)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 8) / 12) * (-9.25-(20)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 3) * (-0.95-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.95 + (((tickAnim - 3) / 3) * (2.375-(-0.95)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 2.375 + (((tickAnim - 6) / 2) * (-0.95-(2.375)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = -0.95 + (((tickAnim - 8) / 12) * (-0.275-(-0.95)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.25 + (((tickAnim - 3) / 3) * (20.38-(0.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 20.38 + (((tickAnim - 6) / 2) * (-0.5-(20.38)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 8) / 12) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.875-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 6) / 2) * (-0.9-(0.875)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = -0.9 + (((tickAnim - 8) / 12) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5.75 + (((tickAnim - 0) / 3) * (-2.37-(5.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -2.37 + (((tickAnim - 3) / 3) * (-28.56-(-2.37)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -28.56 + (((tickAnim - 6) / 2) * (-2.38-(-28.56)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -2.38 + (((tickAnim - 8) / 0) * (-19.75-(-2.38)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -19.75 + (((tickAnim - 8) / 12) * (5.75-(-19.75)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.625-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (1.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 6) / 2) * (0.53-(0.625)));
            zz = 1.1 + (((tickAnim - 6) / 2) * (0.38-(1.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.53 + (((tickAnim - 8) / 0) * (0.475-(0.53)));
            zz = 0.38 + (((tickAnim - 8) / 0) * (0.475-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handL.rotationPointX = this.handL.rotationPointX + (float)(xx);
        this.handL.rotationPointY = this.handL.rotationPointY - (float)(yy);
        this.handL.rotationPointZ = this.handL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 19 + (((tickAnim - 0) / 13) * (-11-(19)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -11 + (((tickAnim - 13) / 3) * (1.75-(-11)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 1.75 + (((tickAnim - 16) / 2) * (20.75-(1.75)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 20.75 + (((tickAnim - 18) / 2) * (19-(20.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -1.35 + (((tickAnim - 0) / 13) * (0-(-1.35)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (2.45-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 2.45 + (((tickAnim - 16) / 2) * (-1.35-(2.45)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -1.35 + (((tickAnim - 18) / 2) * (-1.35-(-1.35)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmR.rotationPointX = this.upperarmR.rotationPointX + (float)(xx);
        this.upperarmR.rotationPointY = this.upperarmR.rotationPointY - (float)(yy);
        this.upperarmR.rotationPointZ = this.upperarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 12.5 + (((tickAnim - 16) / 3) * (0-(12.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 13) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.4-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 16) / 3) * (-0.4-(0.4)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -21 + (((tickAnim - 0) / 8) * (-0.25-(-21)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.25 + (((tickAnim - 8) / 5) * (3.75-(-0.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 3.75 + (((tickAnim - 13) / 3) * (-28-(3.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -28 + (((tickAnim - 16) / 2) * (-1.58-(-28)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -1.58 + (((tickAnim - 18) / 1) * (-21-(-1.58)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 13) * (0-(0.8)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (1.25-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.25 + (((tickAnim - 16) / 3) * (0.8-(1.25)));
            zz = -0.125 + (((tickAnim - 16) / 3) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handR.rotationPointX = this.handR.rotationPointX + (float)(xx);
        this.handR.rotationPointY = this.handR.rotationPointY - (float)(yy);
        this.handR.rotationPointZ = this.handR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.75 + (((tickAnim - 0) / 9) * (-24.25-(0.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -24.25 + (((tickAnim - 9) / 3) * (7.51-(-24.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 7.51 + (((tickAnim - 12) / 2) * (13.25-(7.51)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 13.25 + (((tickAnim - 14) / 6) * (0.75-(13.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (2.1-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 2.1 + (((tickAnim - 12) / 2) * (0-(2.1)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -5.75 + (((tickAnim - 0) / 6) * (-6.26-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -6.26 + (((tickAnim - 6) / 3) * (-20.75-(-6.26)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -20.75 + (((tickAnim - 9) / 3) * (-10.34-(-20.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -10.34 + (((tickAnim - 12) / 2) * (-2.75-(-10.34)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -2.75 + (((tickAnim - 14) / 6) * (-5.75-(-2.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 9) * (0-(-0.45)));
            zz = 0.55 + (((tickAnim - 0) / 9) * (-0.025-(0.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (1.37-(0)));
            zz = -0.025 + (((tickAnim - 9) / 3) * (0.2-(-0.025)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.37 + (((tickAnim - 12) / 2) * (-1.575-(1.37)));
            zz = 0.2 + (((tickAnim - 12) / 2) * (-0.225-(0.2)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -1.575 + (((tickAnim - 14) / 6) * (-0.45-(-1.575)));
            zz = -0.225 + (((tickAnim - 14) / 6) * (0.55-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegR.rotationPointX = this.lowerlegR.rotationPointX + (float)(xx);
        this.lowerlegR.rotationPointY = this.lowerlegR.rotationPointY - (float)(yy);
        this.lowerlegR.rotationPointZ = this.lowerlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 4.25 + (((tickAnim - 0) / 6) * (11.32-(4.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 11.32 + (((tickAnim - 6) / 3) * (-20.75-(11.32)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -20.75 + (((tickAnim - 9) / 3) * (-12.47381-(-20.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (-0.284-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (2.81094-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -12.47381 + (((tickAnim - 12) / 1) * (9.51122-(-12.47381)));
            yy = -0.284 + (((tickAnim - 12) / 1) * (-0.12171-(-0.284)));
            zz = 2.81094 + (((tickAnim - 12) / 1) * (1.20469-(2.81094)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.51122 + (((tickAnim - 13) / 1) * (-9.75-(9.51122)));
            yy = -0.12171 + (((tickAnim - 13) / 1) * (0-(-0.12171)));
            zz = 1.20469 + (((tickAnim - 13) / 1) * (0-(1.20469)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -9.75 + (((tickAnim - 14) / 6) * (4.25-(-9.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footR, footR.rotateAngleX + (float) Math.toRadians(xx), footR.rotateAngleY + (float) Math.toRadians(yy), footR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 6) / 3) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footR.rotationPointX = this.footR.rotationPointX + (float)(xx);
        this.footR.rotationPointY = this.footR.rotationPointY - (float)(yy);
        this.footR.rotationPointZ = this.footR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.86 + (((tickAnim - 0) / 5) * (12.25-(10.86)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 12.25 + (((tickAnim - 5) / 13) * (-16-(12.25)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -16 + (((tickAnim - 18) / 2) * (10.86-(-16)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 2.75 + (((tickAnim - 0) / 5) * (-0.775-(2.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            yy = -0.775 + (((tickAnim - 5) / 13) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (2.75-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.18 + (((tickAnim - 0) / 3) * (0.59-(-17.18)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.59 + (((tickAnim - 3) / 2) * (-3.25-(0.59)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -3.25 + (((tickAnim - 5) / 10) * (-10.61-(-3.25)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10.61 + (((tickAnim - 15) / 3) * (-31.25-(-10.61)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -31.25 + (((tickAnim - 18) / 2) * (-17.18-(-31.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.875 + (((tickAnim - 0) / 5) * (0.2-(1.875)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            yy = 0.2 + (((tickAnim - 5) / 13) * (0-(0.2)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (1.875-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegL.rotationPointX = this.lowerlegL.rotationPointX + (float)(xx);
        this.lowerlegL.rotationPointY = this.lowerlegL.rotationPointY - (float)(yy);
        this.lowerlegL.rotationPointZ = this.lowerlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.5 + (((tickAnim - 0) / 3) * (11.66-(-6.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11.66 + (((tickAnim - 3) / 2) * (-8.25-(11.66)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -8.25 + (((tickAnim - 5) / 7) * (8.56-(-8.25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 8.56 + (((tickAnim - 12) / 6) * (4.25-(8.56)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 4.25 + (((tickAnim - 18) / 2) * (-6.5-(4.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-150))*0.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-120))*0.7), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-190))*-0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-190))*-0.269);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-150))*0.55), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1+115))*-0.8));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1+65))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*0.3), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1+150))*1.3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1+65))*0.3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*0.6), neck.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1+150))*-0.7));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1+65))*0.4), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-50))*0.5), neck2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1+150))*-0.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1+65))*0.35), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-50))*-0.8), neck3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1+150))*-0.5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-70))*-0.585), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*0.85));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1))*-0.459), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*0.85));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*1.8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*0.85));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-120))*-1.8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*1.85));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-15))*-1.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*4.2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*1.85));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-15))*3.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*5.2), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2.85));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1))*2.8), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*9.8), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*3.85));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-30))*10), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*9), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*5.85));


    }
        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDicraeosaurus e = (EntityPrehistoricFloraDicraeosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
