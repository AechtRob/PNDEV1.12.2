package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHensodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer spikem;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer spikef;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer tail3;

    public ModelHensodon() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -7.75F, -1.5F, 3, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -10.1346F, 1.7456F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.1781F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 13, -0.5F, -0.8F, 0.0F, 1, 3, 1, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -10.1346F, 1.7456F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6311F, -0.2324F, -0.2F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 28, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -10.1346F, 1.7456F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6311F, 0.2324F, 0.2F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 28, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -9.6151F, -0.4293F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.8727F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 18, -0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -6.7954F, -2.8847F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.1345F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 28, -0.5F, 0.0F, -0.05F, 2, 2, 1, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -7.6678F, -1.9979F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.9163F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 23, -0.5F, 0.0F, -0.05F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -7.25F, -1.5F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6981F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, -0.5F, -2.5F, -0.7F, 2, 3, 4, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -4.4111F, -4.1574F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 23, -0.5F, -0.1F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -2.1096F, -1.0662F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0712F, -0.27F, 0.1446F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.9F, -1.8315F, -0.0796F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.9004F, -0.0696F, 0.352F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 33, 0.0F, 0.0F, -0.375F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -1.7669F, 1.6518F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.4234F, -0.4755F, 0.0678F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 32, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -1.7669F, 1.6518F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.4234F, 0.4755F, -0.0678F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 32, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -1.6282F, -1.3167F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.4399F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 17, -0.5F, -0.075F, 0.025F, 2, 3, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -2.7028F, -3.0035F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.0036F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 0, -0.5F, -0.075F, 0.0F, 2, 2, 2, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.575F, -5.441F, -2.936F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 32, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 32, 0.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, -6.0F, 0.5F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1806F, 0.2577F, 0.0465F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 32, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, -4.25F, 1.5F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.2618F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 25, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.5F, -4.25F, 1.5F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.2618F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 25, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.9F, -1.8315F, -0.0796F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.9004F, 0.0696F, -0.352F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 33, 0.0F, 0.0F, -0.375F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, -2.1096F, -1.0662F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.0712F, 0.27F, -0.1446F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 33, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, -6.0F, 0.5F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1806F, -0.2577F, -0.0465F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 7, 32, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 7, 32, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -3.25F, -1.5F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3491F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 13, 0, -0.5F, -3.05F, -2.1F, 2, 3, 3, 0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -5.95F, 0.75F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.1855F, 0.3435F, 0.0631F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 28, 32, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -5.95F, 0.75F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.1855F, -0.3435F, -0.0631F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 28, 32, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.spikem = new AdvancedModelRenderer(this);
        this.spikem.setRotationPoint(1.5F, -4.25F, 1.5F);
        this.main.addChild(spikem);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.9678F, -0.4579F, -5.8723F);
        this.spikem.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0904F, -0.2651F, -0.0238F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 25, 32, -0.075F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.25F, -1.7455F, -6.2185F);
        this.spikem.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.7514F, 0.2577F, 0.0465F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 17, 0.25F, -3.0F, -1.0F, 0, 4, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.0322F, -0.4579F, -5.8723F);
        this.spikem.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0904F, 0.2651F, 0.0238F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 25, 32, 0.075F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.75F, -1.7455F, -6.2185F);
        this.spikem.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.7514F, -0.2577F, -0.0465F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 9, 17, -0.25F, -3.0F, -1.0F, 0, 4, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.0F, -1.7455F, -6.2185F);
        this.spikem.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.9163F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 31, 9, -0.5F, 0.0F, -1.0F, 2, 2, 1, -0.002F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, -1.8767F, 0.5951F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.5831F, 0.2201F, -0.143F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 3, 33, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, -1.8767F, 0.5951F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.5831F, -0.2201F, 0.143F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 3, 33, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -3.0F, -2.6F);
        this.main.addChild(jaw);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.2238F, -0.0337F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3491F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 31, 22, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.spikef = new AdvancedModelRenderer(this);
        this.spikef.setRotationPoint(-0.5F, -6.7954F, -2.8847F);
        this.main.addChild(spikef);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -0.3247F, 1.0655F);
        this.spikef.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 14, 28, 0.0F, -1.5F, -1.4F, 0, 2, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 1.0038F, -1.4335F);
        this.spikef.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 1.0472F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 22, 32, 0.0F, -2.8F, -0.6F, 0, 3, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.7999F, -1.8337F);
        this.spikef.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3054F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 31, 5, -0.5F, 0.0F, 0.0F, 2, 2, 1, -0.002F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -5.3795F, 1.2422F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 16, -1.0F, -1.6205F, -0.2422F, 2, 4, 2, 0.006F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 3.2942F, 0.8524F);
        this.tail.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5236F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 25, 25, 0.5F, -2.75F, -0.5F, 0, 3, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 3.7942F, -0.1976F);
        this.tail.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 2.0508F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 22, 13, -0.5F, 0.0F, 0.0F, 2, 3, 2, -0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0F, -2.093F, 2.2632F);
        this.tail.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.733F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 7, 0.5F, 0.0F, -3.0F, 1, 2, 3, -0.006F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1655F, 1.5124F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 28, -0.5F, -0.355F, -0.5546F, 1, 2, 2, 0.006F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 7, 0.0F, -3.9275F, -0.2492F, 0, 4, 4, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 2.5744F, 0.9511F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 2.5307F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 12, 32, -0.5F, 0.0F, 0.1F, 1, 2, 1, 0.003F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -1.9275F, 0.7508F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.9163F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 22, 19, -0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6526F, 1.7837F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 25, 0.025F, -1.5F, 0.0F, 0, 3, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.4F;
        this.main.offsetX = -0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 5.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
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
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                //this.body.offsetY = -0.10F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
