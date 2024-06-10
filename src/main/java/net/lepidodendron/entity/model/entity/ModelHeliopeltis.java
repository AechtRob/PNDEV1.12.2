package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHeliopeltis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHeliopeltis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Heliopeltis;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer IMMOVABLESPINE1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer IMMOVABLESPINE2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer IMMOVABLESPINE3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer LAntennae;
    private final AdvancedModelRenderer RAntennae;
    private final AdvancedModelRenderer Thorax;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer LLeg6;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer LLeg7;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer RLeg6;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer RLeg7;
    private final AdvancedModelRenderer cube_r44;

    public ModelHeliopeltis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Heliopeltis = new AdvancedModelRenderer(this);
        this.Heliopeltis.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.Heliopeltis.cubeList.add(new ModelBox(Heliopeltis, 31, 17, -4.0F, -1.0F, -5.5F, 8, 1, 2, 0.0F, false));
        this.Heliopeltis.cubeList.add(new ModelBox(Heliopeltis, 0, 32, -4.0F, -1.0F, -4.0F, 8, 1, 1, -0.02F, false));
        this.Heliopeltis.cubeList.add(new ModelBox(Heliopeltis, 0, 26, -2.0F, -1.0F, -7.0F, 4, 1, 5, -0.01F, false));
        this.Heliopeltis.cubeList.add(new ModelBox(Heliopeltis, 0, 8, -1.5F, -1.5F, -6.0F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.15F, -0.4F, -5.25F);
        this.Heliopeltis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6981F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, -1.2F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.15F, -0.4F, -5.25F);
        this.Heliopeltis.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 5, -0.8F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.Heliopeltis.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6545F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 23, -2.7294F, -1.0F, -1.4395F, 2, 1, 2, -0.02F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.1794F, -1.0F, -1.4395F, 1, 1, 1, -0.03F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Heliopeltis.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 14, -3.6857F, -1.0F, 0.3622F, 2, 1, 1, -0.03F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Heliopeltis.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5672F, -0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 34, -4.9F, -2.4F, -2.2F, 2, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Heliopeltis.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2182F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 14, 1.6857F, -1.0F, 0.3622F, 2, 1, 1, -0.03F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 0.0F, -6.0F);
        this.Heliopeltis.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.6545F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.1794F, -1.0F, -1.4395F, 1, 1, 1, -0.03F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 23, 0.7294F, -1.0F, -1.4395F, 2, 1, 2, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Heliopeltis.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5672F, 0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 34, 2.9F, -2.4F, -2.2F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Heliopeltis.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5672F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 36, -1.0F, -3.4F, -2.9F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.9F, -11.2F, -4.25F);
        this.Heliopeltis.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.9163F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 17, -0.4F, 11.0F, -1.7F, 7, 0, 14, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 17, -0.4F, 10.85F, -1.7F, 7, 0, 14, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(4.9F, -11.3F, -4.25F);
        this.Heliopeltis.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.9163F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -6.6F, 10.95F, -1.7F, 7, 0, 14, 0.0F, false));

        this.IMMOVABLESPINE1 = new AdvancedModelRenderer(this);
        this.IMMOVABLESPINE1.setRotationPoint(0.0F, -4.1F, 8.2F);
        this.Heliopeltis.addChild(IMMOVABLESPINE1);
        this.setRotateAngle(IMMOVABLESPINE1, -0.0873F, 0.0F, 0.0F);
        this.IMMOVABLESPINE1.cubeList.add(new ModelBox(IMMOVABLESPINE1, 8, 8, -0.5F, -0.0117F, -0.2482F, 1, 0, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.0F, -9.7F);
        this.IMMOVABLESPINE1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 8, -0.5F, 0.5614F, -1.1878F, 1, 1, 1, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.1F, -5.1F);
        this.IMMOVABLESPINE1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 2, 18, -0.5F, -0.0359F, -0.0251F, 1, 0, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.95F, -7.45F);
        this.IMMOVABLESPINE1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 18, -0.5F, -2.85F, -1.5F, 1, 0, 5, 0.0F, false));

        this.IMMOVABLESPINE2 = new AdvancedModelRenderer(this);
        this.IMMOVABLESPINE2.setRotationPoint(8.05F, -2.7F, 6.15F);
        this.Heliopeltis.addChild(IMMOVABLESPINE2);
        this.setRotateAngle(IMMOVABLESPINE2, -0.1745F, 0.5236F, 0.0F);
        this.IMMOVABLESPINE2.cubeList.add(new ModelBox(IMMOVABLESPINE2, 6, 8, -0.5F, -0.0117F, -0.2482F, 1, 0, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-16.1F, 2.0F, -9.7F);
        this.IMMOVABLESPINE2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3054F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 2, 15.6F, 0.5614F, -1.1878F, 1, 1, 1, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.1F, -5.1F);
        this.IMMOVABLESPINE2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.5F, -0.0359F, -0.0251F, 1, 0, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 4.95F, -7.45F);
        this.IMMOVABLESPINE2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 8, -0.5F, -2.85F, -1.5F, 1, 0, 5, 0.0F, false));

        this.IMMOVABLESPINE3 = new AdvancedModelRenderer(this);
        this.IMMOVABLESPINE3.setRotationPoint(-8.05F, -2.7F, 6.15F);
        this.Heliopeltis.addChild(IMMOVABLESPINE3);
        this.setRotateAngle(IMMOVABLESPINE3, -0.1745F, -0.5236F, 0.0F);
        this.IMMOVABLESPINE3.cubeList.add(new ModelBox(IMMOVABLESPINE3, 6, 8, -0.5F, -0.0117F, -0.2482F, 1, 0, 4, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(16.1F, 2.0F, -9.7F);
        this.IMMOVABLESPINE3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 2, -16.6F, 0.5614F, -1.1878F, 1, 1, 1, -0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.1F, -5.1F);
        this.IMMOVABLESPINE3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -0.5F, -0.0359F, -0.0251F, 1, 0, 5, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 4.95F, -7.45F);
        this.IMMOVABLESPINE3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3491F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 8, -0.5F, -2.85F, -1.5F, 1, 0, 5, 0.0F, true));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.Heliopeltis.addChild(LLeg1);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.1309F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 9, 13, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(0.5F, 0.0F, -4.5F);
        this.Heliopeltis.addChild(LLeg2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.1309F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 13, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(0.5F, 0.0F, -3.0F);
        this.Heliopeltis.addChild(LLeg3);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.1309F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 9, 13, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-0.5F, 0.0F, -6.0F);
        this.Heliopeltis.addChild(RLeg1);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.1309F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 13, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-0.5F, 0.0F, -4.5F);
        this.Heliopeltis.addChild(RLeg2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.1309F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 13, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-0.5F, 0.0F, -3.0F);
        this.Heliopeltis.addChild(RLeg3);
        this.setRotateAngle(RLeg3, 0.0F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.1309F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 9, 13, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LAntennae = new AdvancedModelRenderer(this);
        this.LAntennae.setRotationPoint(1.75F, -0.25F, -6.5F);
        this.Heliopeltis.addChild(LAntennae);
        this.setRotateAngle(LAntennae, 0.0F, 0.0F, 0.0F);
        this.LAntennae.cubeList.add(new ModelBox(LAntennae, 27, 13, 0.0F, 0.2F, -4.0F, 10, 0, 4, 0.0F, false));

        this.RAntennae = new AdvancedModelRenderer(this);
        this.RAntennae.setRotationPoint(-1.75F, -0.25F, -6.5F);
        this.Heliopeltis.addChild(RAntennae);
        this.RAntennae.cubeList.add(new ModelBox(RAntennae, 27, 13, -10.0F, 0.2F, -4.0F, 10, 0, 4, 0.0F, true));

        this.Thorax = new AdvancedModelRenderer(this);
        this.Thorax.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.Heliopeltis.addChild(Thorax);
        this.setRotateAngle(Thorax, 0.0F, 0.0F, 0.0F);
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 13, -1.5F, -0.5F, -1.0F, 3, 1, 4, -0.02F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 34, -0.5F, -0.75F, -1.0F, 1, 1, 4, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-4.9F, -22.65F, -2.35F);
        this.Thorax.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -1.2217F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 20, 5.35F, 22.95F, -1.7F, 11, 0, 10, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-4.9F, -22.65F, -2.25F);
        this.Thorax.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -1.4835F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 2.1F, 22.85F, -3.45F, 4, 0, 8, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-4.9F, -22.65F, -2.35F);
        this.Thorax.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -1.3526F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 30, 3.85F, 22.9F, -2.7F, 9, 0, 10, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(4.9F, -22.65F, -2.35F);
        this.Thorax.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 1.2217F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 20, -16.35F, 22.95F, -1.7F, 11, 0, 10, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(4.9F, -22.65F, -2.25F);
        this.Thorax.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 1.4835F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -6.1F, 22.85F, -3.45F, 4, 0, 8, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(4.9F, -22.65F, -2.35F);
        this.Thorax.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 1.3526F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 30, -12.85F, 22.9F, -2.7F, 9, 0, 10, 0.0F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.Thorax.addChild(LLeg4);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.1309F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 9, 13, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Thorax.addChild(LLeg5);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg5.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.1309F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 9, 13, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.Thorax.addChild(RLeg4);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, -0.1309F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 9, 13, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Thorax.addChild(RLeg5);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg5.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.1309F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 9, 13, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax.addChild(Pygidium);
        this.setRotateAngle(Pygidium, 0.0F, 0.0F, 0.0F);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 9, 0, -0.5F, 0.45F, 3.0F, 1, 0, 20, 0.0F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 14, 31, -1.0F, -0.5F, -1.0F, 2, 1, 4, -0.03F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-4.9F, -22.6F, -5.45F);
        this.Pygidium.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.8727F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 18, 0, 6.6F, 22.95F, 0.05F, 10, 0, 13, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-4.9F, -22.6F, -5.25F);
        this.Pygidium.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.3927F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 0, 6.1F, 23.05F, 4.2F, 6, 0, 17, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(4.9F, -22.6F, -5.45F);
        this.Pygidium.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.8727F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 18, 0, -16.6F, 22.95F, 0.05F, 10, 0, 13, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(4.9F, -22.6F, -5.25F);
        this.Pygidium.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.3927F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 0, -12.1F, 23.05F, 4.2F, 6, 0, 17, 0.0F, false));

        this.LLeg6 = new AdvancedModelRenderer(this);
        this.LLeg6.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.Pygidium.addChild(LLeg6);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg6.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.1309F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 9, 13, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LLeg7 = new AdvancedModelRenderer(this);
        this.LLeg7.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Pygidium.addChild(LLeg7);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg7.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, 0.1309F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 9, 13, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.RLeg6 = new AdvancedModelRenderer(this);
        this.RLeg6.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.Pygidium.addChild(RLeg6);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg6.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.1309F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 9, 13, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.RLeg7 = new AdvancedModelRenderer(this);
        this.RLeg7.setRotationPoint(0.0F, 0.75F, 2.0F);
        this.Pygidium.addChild(RLeg7);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.RLeg7.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, -0.1309F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 9, 13, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Heliopeltis.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Heliopeltis.offsetZ = -0.03F;
        this.Heliopeltis.render(0.022f);
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
        //this.Heliopeltis.offsetY = 1.3F;

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5, this.LLeg6, this.RLeg7};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3, this.RLeg4, this.RLeg5, this.RLeg6, this.RLeg7};
        if (((EntityPrehistoricFloraHeliopeltis) e).getIsMoving()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

            this.flap(LLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(RLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(LLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(RLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(LLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(RLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(LLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(RLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(LLeg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(RLeg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(LLeg6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(RLeg6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(LLeg7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(RLeg7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
        }

        this.swing(LAntennae, 0.5F, -0.3F, false, 0, -0.1F, f2, 0.8F);
        this.swing(RAntennae, 0.5F, 0.3F, false, 0, 0.1F, f2, 0.8F);
    }
}
