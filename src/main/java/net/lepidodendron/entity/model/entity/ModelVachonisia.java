package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelVachonisia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer simlegR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer simlegL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer simlegR2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer simlegL2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer simlegL3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer simlegL4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer simlegL5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer simlegL6;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer simlegL7;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer simlegL8;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer simlegL9;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer simlegR3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer simlegR4;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer simlegR5;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer simlegR6;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer simlegR7;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer simlegR8;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer simlegR9;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer sponge;


    public ModelVachonisia() {
        this.textureWidth = 25;
        this.textureHeight = 25;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 7, 17, -1.0F, -2.5F, -4.0F, 2, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 17, -0.5F, -2.35F, -0.5F, 1, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.75F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, 0.0F, -6.0F, 6, 0, 11, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.75F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -6.0F, 0.0F, -6.0F, 6, 0, 11, 0.0F, false));

        this.simlegR = new AdvancedModelRenderer(this);
        this.simlegR.setRotationPoint(-0.5F, -1.75F, 0.25F);
        this.body.addChild(simlegR);
        this.setRotateAngle(simlegR, 0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.7418F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 8, -2.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 6, -3.0F, -0.2F, 0.1F, 3, 2, 0, 0.0F, false));

        this.simlegL = new AdvancedModelRenderer(this);
        this.simlegL.setRotationPoint(0.5F, -1.75F, 0.25F);
        this.body.addChild(simlegL);
        this.setRotateAngle(simlegL, 0.1309F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.7418F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 8, 0.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, 0.0F, -0.2F, 0.1F, 3, 2, 0, 0.0F, true));

        this.simlegR2 = new AdvancedModelRenderer(this);
        this.simlegR2.setRotationPoint(-0.5F, -1.75F, 0.75F);
        this.body.addChild(simlegR2);
        this.setRotateAngle(simlegR2, 0.1309F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.7418F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 8, -2.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 6, -2.0F, -0.2F, 0.1F, 2, 2, 0, 0.0F, false));

        this.simlegL2 = new AdvancedModelRenderer(this);
        this.simlegL2.setRotationPoint(0.5F, -1.75F, 0.75F);
        this.body.addChild(simlegL2);
        this.setRotateAngle(simlegL2, 0.1309F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.7418F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, 0.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 6, 0.0F, -0.2F, 0.1F, 2, 2, 0, 0.0F, true));

        this.simlegL3 = new AdvancedModelRenderer(this);
        this.simlegL3.setRotationPoint(0.5F, -1.75F, 1.25F);
        this.body.addChild(simlegL3);
        this.setRotateAngle(simlegL3, 0.1309F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.7418F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 8, 0.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 6, 6, 0.0F, -0.2F, 0.1F, 2, 2, 0, 0.0F, true));

        this.simlegL4 = new AdvancedModelRenderer(this);
        this.simlegL4.setRotationPoint(0.5F, -1.75F, 1.75F);
        this.body.addChild(simlegL4);
        this.setRotateAngle(simlegL4, 0.1309F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.7418F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 8, 0.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 6, 6, -0.25F, -0.2F, 0.1F, 2, 2, 0, 0.0F, true));

        this.simlegL5 = new AdvancedModelRenderer(this);
        this.simlegL5.setRotationPoint(0.5F, -1.75F, 2.25F);
        this.body.addChild(simlegL5);
        this.setRotateAngle(simlegL5, 0.1309F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.7418F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 8, 0.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 6, 6, -0.25F, -0.2F, 0.1F, 2, 2, 0, 0.0F, true));

        this.simlegL6 = new AdvancedModelRenderer(this);
        this.simlegL6.setRotationPoint(0.5F, -1.75F, 2.75F);
        this.body.addChild(simlegL6);
        this.setRotateAngle(simlegL6, 0.1309F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.7418F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, 0.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 6, -0.4F, -0.2F, 0.1F, 2, 2, 0, 0.0F, true));

        this.simlegL7 = new AdvancedModelRenderer(this);
        this.simlegL7.setRotationPoint(0.5F, -1.75F, 3.25F);
        this.body.addChild(simlegL7);
        this.setRotateAngle(simlegL7, 0.1309F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL7.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.7418F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 8, 0.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL7.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 6, -0.4F, -0.2F, 0.1F, 2, 2, 0, 0.0F, true));

        this.simlegL8 = new AdvancedModelRenderer(this);
        this.simlegL8.setRotationPoint(0.5F, -1.75F, 3.75F);
        this.body.addChild(simlegL8);
        this.setRotateAngle(simlegL8, 0.1309F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL8.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.7418F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 8, 0.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL8.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1745F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 6, 6, -0.4F, -0.2F, 0.1F, 2, 2, 0, 0.0F, true));

        this.simlegL9 = new AdvancedModelRenderer(this);
        this.simlegL9.setRotationPoint(0.5F, -1.75F, 4.25F);
        this.body.addChild(simlegL9);
        this.setRotateAngle(simlegL9, 0.1309F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL9.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.7418F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 8, 0.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegL9.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 6, 6, -0.4F, -0.2F, 0.1F, 2, 2, 0, 0.0F, true));

        this.simlegR3 = new AdvancedModelRenderer(this);
        this.simlegR3.setRotationPoint(-0.5F, -1.75F, 1.25F);
        this.body.addChild(simlegR3);
        this.setRotateAngle(simlegR3, 0.1309F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.7418F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 8, -2.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 6, 6, -2.0F, -0.2F, 0.1F, 2, 2, 0, 0.0F, false));

        this.simlegR4 = new AdvancedModelRenderer(this);
        this.simlegR4.setRotationPoint(-0.5F, -1.75F, 1.75F);
        this.body.addChild(simlegR4);
        this.setRotateAngle(simlegR4, 0.1309F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.7418F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 8, -2.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1745F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 6, 6, -1.75F, -0.2F, 0.1F, 2, 2, 0, 0.0F, false));

        this.simlegR5 = new AdvancedModelRenderer(this);
        this.simlegR5.setRotationPoint(-0.5F, -1.75F, 2.25F);
        this.body.addChild(simlegR5);
        this.setRotateAngle(simlegR5, 0.1309F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR5.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -0.7418F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 8, -2.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1745F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 6, 6, -1.75F, -0.2F, 0.1F, 2, 2, 0, 0.0F, false));

        this.simlegR6 = new AdvancedModelRenderer(this);
        this.simlegR6.setRotationPoint(-0.5F, -1.75F, 2.75F);
        this.body.addChild(simlegR6);
        this.setRotateAngle(simlegR6, 0.1309F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR6.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.7418F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 8, -2.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR6.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1745F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 6, 6, -1.6F, -0.2F, 0.1F, 2, 2, 0, 0.0F, false));

        this.simlegR7 = new AdvancedModelRenderer(this);
        this.simlegR7.setRotationPoint(-0.5F, -1.75F, 3.25F);
        this.body.addChild(simlegR7);
        this.setRotateAngle(simlegR7, 0.1309F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR7.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.7418F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 8, -2.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR7.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1745F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 6, 6, -1.6F, -0.2F, 0.1F, 2, 2, 0, 0.0F, false));

        this.simlegR8 = new AdvancedModelRenderer(this);
        this.simlegR8.setRotationPoint(-0.5F, -1.75F, 3.75F);
        this.body.addChild(simlegR8);
        this.setRotateAngle(simlegR8, 0.1309F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR8.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, -0.7418F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 8, -2.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR8.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1745F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 6, 6, -1.6F, -0.2F, 0.1F, 2, 2, 0, 0.0F, false));

        this.simlegR9 = new AdvancedModelRenderer(this);
        this.simlegR9.setRotationPoint(-0.5F, -1.75F, 4.25F);
        this.body.addChild(simlegR9);
        this.setRotateAngle(simlegR9, 0.1309F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR9.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, -0.7418F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 8, -2.0F, -0.35F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.simlegR9.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1745F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 6, 6, -1.6F, -0.2F, 0.1F, 2, 2, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.5F, -2.3F, -2.5F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.5672F, -0.3927F);
        this.legR1.cubeList.add(new ModelBox(legR1, 13, 15, -5.0F, 0.0F, -0.5F, 5, 0, 3, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.5F, -2.3F, -2.5F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.5672F, 0.3927F);
        this.legL.cubeList.add(new ModelBox(legL, 13, 15, 0.0F, 0.0F, -0.5F, 5, 0, 3, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, -2.05F, -2.5F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.829F, -0.5672F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 2, -4.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, -2.05F, -2.5F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.829F, 0.5672F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 2, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, -2.05F, -1.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.2618F, -0.48F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -4.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, -2.05F, -1.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.2618F, 0.48F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 0, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, -2.3F, -1.5F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, -0.5236F, -0.3491F);
        this.legR4.cubeList.add(new ModelBox(legR4, 12, 11, -5.0F, 0.0F, -0.5F, 5, 0, 4, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, -2.3F, -1.5F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.5236F, 0.3491F);
        this.legL4.cubeList.add(new ModelBox(legL4, 12, 11, 0.0F, 0.0F, -0.5F, 5, 0, 4, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, -2.05F, -0.75F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, -0.48F, -0.3927F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 4, -2.0F, 0.0F, -0.5F, 2, 0, 2, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, -2.05F, -0.75F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.48F, 0.3927F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 4, 0.0F, 0.0F, -0.5F, 2, 0, 2, 0.0F, true));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.5F, -2.3F, -0.5F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, -0.3491F, -0.3927F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 11, -5.0F, 0.0F, -0.5F, 5, 0, 6, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.5F, -2.3F, -0.5F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.3491F, 0.3927F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 11, 0.0F, 0.0F, -0.5F, 5, 0, 6, 0.0F, true));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.6F, -2.0F, -3.75F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.2618F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 4, 4, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.6F, -2.0F, -3.75F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.2618F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 4, 4, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, true));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-1.0F, -2.15F, -0.5F);
        this.body.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.0F, 0.2182F, -0.2182F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 13, 18, -4.5F, 0.0F, -0.5F, 5, 0, 2, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(1.0F, -2.15F, -0.5F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.0F, -0.2182F, 0.2182F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 13, 18, -0.5F, 0.0F, -0.5F, 5, 0, 2, 0.0F, true));

        this.sponge = new AdvancedModelRenderer(this);
        this.sponge.setRotationPoint(0.0F, 24.0F, 0.0F);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(22.5);
        this.body.offsetY = -0.2F;
        this.body.offsetZ = -0;
        this.body.offsetX = 0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.15F;
        this.body.offsetY = 0.1F;
        this.body.render(0.01f);
        resetToDefaultPose();
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

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double) e.getPosition().getY() + 0.334D) > e.posY);
        }


        AdvancedModelRenderer[] armsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6};
        AdvancedModelRenderer[] armsR = {this.legR1, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6};



        //swim legs:
        float speedLeg = 1.5F;
        float degreeLeg = 0.3F;
        float weightLeg = -0.5F;

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (isAtBottom) {
                this.bob(body, 0.5F, 0.02F, true, f2, 0.5F);
                if (f3 != 0) {
                    this.chainSwing(armsL, 0.35F, -0.2F, 1, f2, 0.6F);
                    this.chainSwing(armsR, 0.35F, 0.2F, 1, f2, 0.6F);
                } else {
                    this.chainSwing(armsL, 0.2F, -0.1F, 1, f2, 0.4F);
                    this.chainSwing(armsR, 0.2F, 0.1F, 1, f2, 0.4F);
                }
            } else { //is Swimming
                this.bob(body, 0.22F, 0.16F, false, f2, 0.8F);
                this.chainSwing(armsL, 0.4F, -0.25F, 1, f2, 0.6F);
                this.chainSwing(armsR, 0.4F, 0.25F, 1, f2, 0.6F);
                this.flap(legL, 0.25F, -0.2F, false, 2.0F, -0.2F, f2, 0.3F);
                this.flap(legR1, 0.25F, 0.2F, false, 2.0F, 0.2F, f2, 0.3F);
            }

            this.swing(antennaL, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
            this.swing(antennaR, 0.4F, 0.2F, false, 0.5F, 0.1F, f2, 0.8F);
            this.walk(antennaL, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
            this.walk(antennaR, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
            this.flap(simlegL, speedLeg, -degreeLeg, false, 0, -weightLeg, f2, 0.7F);
            this.flap(simlegR, speedLeg, degreeLeg, false, 0, weightLeg, f2, 0.7F);
            this.flap(simlegL2, speedLeg, -degreeLeg, false, 0.5F, -weightLeg, f2, 0.7F);
            this.flap(simlegR2, speedLeg, degreeLeg, false, 0.5F, weightLeg, f2, 0.7F);
            this.flap(simlegL3, speedLeg, -degreeLeg, false, 1.0F, -weightLeg, f2, 0.7F);
            this.flap(simlegR3, speedLeg, degreeLeg, false, 1.0F, weightLeg, f2, 0.7F);
            this.flap(simlegL4, speedLeg, -degreeLeg, false, 1.5F, -weightLeg, f2, 0.7F);
            this.flap(simlegR4, speedLeg, degreeLeg, false, 1.5F, weightLeg, f2, 0.7F);
            this.flap(simlegL5, speedLeg, -degreeLeg, false, 2.0F, -weightLeg, f2, 0.7F);
            this.flap(simlegR5, speedLeg, degreeLeg, false, 2.0F, weightLeg, f2, 0.7F);
            this.flap(simlegL6, speedLeg, -degreeLeg, false, 2.5F, -weightLeg, f2, 0.7F);
            this.flap(simlegR6, speedLeg, degreeLeg, false, 2.5F, weightLeg, f2, 0.7F);
            this.flap(simlegL7, speedLeg, -degreeLeg, false, 3.0F, -weightLeg, f2, 0.7F);
            this.flap(simlegR7, speedLeg, degreeLeg, false, 3.0F, weightLeg, f2, 0.7F);
            this.flap(simlegL8, speedLeg, -degreeLeg, false, 3.5F, -weightLeg, f2, 0.7F);
            this.flap(simlegR8, speedLeg, degreeLeg, false, 3.5F, weightLeg, f2, 0.7F);
            this.flap(simlegL9, speedLeg, -degreeLeg, false, 4.0F, -weightLeg, f2, 0.7F);
            this.flap(simlegR9, speedLeg, degreeLeg, false, 4.0F, weightLeg, f2, 0.7F);

        }
    }
}
