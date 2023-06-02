package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSclerodus extends AdvancedModelBase {
    private final AdvancedModelRenderer Sclerodus;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Rightside;
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
    private final AdvancedModelRenderer Leftside;
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    public ModelSclerodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Sclerodus = new AdvancedModelRenderer(this);
        this.Sclerodus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Sclerodus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 24, 19, -0.5F, -1.1F, -8.25F, 1, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.1F, -7.95F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2269F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 12, -0.5F, -0.022F, -0.0299F, 1, 1, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.1F, 0.1F, -2.75F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 0, -0.0839F, -1.0F, 0.0328F, 5, 1, 4, 0.001F, false));

        this.Rightside = new AdvancedModelRenderer(this);
        this.Rightside.setRotationPoint(0.0F, -1.1F, -7.95F);
        this.Head.addChild(Rightside);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.2F, 0.2F, -0.5F);
        this.Rightside.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0742F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 17, 0.0401F, 0.0F, -0.0224F, 1, 1, 3, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.3F, 0.2F, 12.7F);
        this.Rightside.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 2.0988F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 37, -3.0227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 36, -1.8227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 22, -0.7227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 33, -3.0227F, 0.0F, 0.0061F, 3, 1, 1, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-5.4F, 0.2F, 10.0F);
        this.Rightside.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.9766F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 30, -1.1376F, 0.5F, -0.449F, 1, 0, 1, -0.002F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, -2.3376F, 0.5F, -0.449F, 1, 0, 1, -0.002F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 34, -2.9376F, 0.0F, -0.049F, 3, 1, 1, -0.002F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-5.6F, 0.2F, 7.0F);
        this.Rightside.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.645F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 5, 27, -0.7442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 27, -1.8442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 22, -2.9442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 8, -2.9442F, 0.0F, -0.0719F, 3, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.8F, 0.2F, 4.1F);
        this.Rightside.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.2959F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 14, -0.5525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 0, -1.6525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 27, -2.7525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 36, -2.9525F, 0.0F, -0.0547F, 3, 1, 1, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 0.2F, 4.9F);
        this.Rightside.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.8072F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 5, -3.9425F, 0.0F, -0.9667F, 4, 1, 1, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.5F, 0.2F, 1.3F);
        this.Rightside.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.528F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 6, 1.8605F, 0.5F, -0.563F, 1, 0, 1, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.5F, 0.2F, 1.3F);
        this.Rightside.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5629F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 6, 0.7605F, 0.5F, -0.563F, 1, 0, 1, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.5F, 0.2F, 1.3F);
        this.Rightside.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.7723F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 14, -0.3395F, 0.5F, -0.463F, 1, 0, 1, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.5F, 0.2F, 1.3F);
        this.Rightside.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 1.1388F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 6, -1.4395F, 0.5F, -0.663F, 1, 0, 1, -0.001F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 12, -2.5395F, 0.5F, -0.663F, 1, 0, 1, -0.001F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 3, -1.0395F, 0.0F, 0.937F, 1, 1, 1, -0.001F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 11, -3.0395F, 0.0F, 0.937F, 1, 1, 1, -0.001F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 33, -3.0395F, 0.0F, -0.063F, 3, 1, 1, -0.002F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 36, -3.0395F, 0.0F, 1.937F, 3, 1, 1, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-4.1F, 0.2F, 5.6F);
        this.Rightside.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.5978F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.8833F, 0.0F, -0.3184F, 1, 1, 1, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, 0.0F, -0.3F);
        this.Rightside.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.6501F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 29, -2.6F, 0.2F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.739F, 3.2695F);
        this.Rightside.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2325F, -0.0066F, -0.1164F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 32, -1.9281F, 0.3203F, -0.3239F, 2, 1, 2, -0.002F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 26, -1.9281F, 0.0203F, -0.3239F, 2, 1, 2, -0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 12, -1.9281F, 0.0203F, -3.0239F, 2, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, -1.439F, 3.2695F);
        this.Rightside.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1242F, 0.0414F, -0.3203F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 12, -0.2F, 0.7457F, -1.2153F, 1, 1, 1, 0.0F, false));

        this.Leftside = new AdvancedModelRenderer(this);
        this.Leftside.setRotationPoint(0.0F, -1.1F, -7.95F);
        this.Head.addChild(Leftside);
        this.Leftside.cubeList.add(new ModelBox(Leftside, 18, 24, -0.5401F, 0.2F, -0.6224F, 1, 1, 3, -0.002F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.2F, 0.2F, -0.5F);
        this.Leftside.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.0742F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 17, -1.0401F, 0.0F, -0.0224F, 1, 1, 3, -0.001F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(4.3F, 0.2F, 12.7F);
        this.Leftside.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -2.0988F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 5, 37, 2.0227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 36, 0.8227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 37, 22, -0.2773F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 33, 0.0227F, 0.0F, 0.0061F, 3, 1, 1, -0.001F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(5.4F, 0.2F, 10.0F);
        this.Leftside.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -1.9766F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 30, 0.1376F, 0.5F, -0.449F, 1, 0, 1, -0.002F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 37, 1.3376F, 0.5F, -0.449F, 1, 0, 1, -0.002F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 34, -0.0624F, 0.0F, -0.049F, 3, 1, 1, -0.002F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(5.6F, 0.2F, 7.0F);
        this.Leftside.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -1.645F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 5, 27, -0.2558F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 27, 0.8442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 22, 1.9442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 8, -0.0558F, 0.0F, -0.0719F, 3, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(4.8F, 0.2F, 4.1F);
        this.Leftside.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -1.2959F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 22, 14, -0.4475F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 26, 0, 0.6525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 27, 1.7525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 36, -0.0475F, 0.0F, -0.0547F, 3, 1, 1, -0.001F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0F, 0.2F, 4.9F);
        this.Leftside.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.8072F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 31, 5, -0.0575F, 0.0F, -0.9667F, 4, 1, 1, -0.002F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.5F, 0.2F, 1.3F);
        this.Leftside.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.528F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 6, -2.8605F, 0.5F, -0.563F, 1, 0, 1, -0.001F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.5F, 0.2F, 1.3F);
        this.Leftside.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.5629F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 6, -1.7605F, 0.5F, -0.563F, 1, 0, 1, -0.001F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.5F, 0.2F, 1.3F);
        this.Leftside.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.7723F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 14, -0.6605F, 0.5F, -0.463F, 1, 0, 1, -0.001F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(3.5F, 0.2F, 1.3F);
        this.Leftside.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -1.1388F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 6, 0.4395F, 0.5F, -0.663F, 1, 0, 1, -0.001F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 12, 1.5395F, 0.5F, -0.663F, 1, 0, 1, -0.001F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 3, 0.0395F, 0.0F, 0.937F, 1, 1, 1, -0.001F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 11, 2.0395F, 0.0F, 0.937F, 1, 1, 1, -0.001F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 23, 33, 0.0395F, 0.0F, -0.063F, 3, 1, 1, -0.002F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 27, 36, 0.0395F, 0.0F, 1.937F, 3, 1, 1, -0.001F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(4.2F, 0.2F, 5.7F);
        this.Leftside.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.685F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -0.2494F, 0.0F, -0.2694F, 1, 1, 1, -0.003F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.5F, 0.0F, -0.3F);
        this.Leftside.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.6501F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 29, -0.4F, 0.2F, 0.0F, 3, 1, 3, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -0.739F, 3.2695F);
        this.Leftside.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2325F, 0.0066F, 0.1164F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 14, 32, -0.0719F, 0.3203F, -0.3239F, 2, 1, 2, -0.002F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 26, -0.0719F, 0.0203F, -0.3239F, 2, 1, 2, -0.001F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 30, 12, -0.0719F, 0.0203F, -3.0239F, 2, 1, 3, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.5F, -1.439F, 3.2695F);
        this.Leftside.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1242F, -0.0414F, 0.3203F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 12, -0.8F, 0.7457F, -1.2153F, 1, 1, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-1.0F, -0.1F, 3.6F);
        this.Head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 30, 0, -1.0F, -2.0F, -6.75F, 4, 2, 2, -0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 11, -1.5F, -2.0F, -4.75F, 5, 2, 5, -0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 0.5F, -2.2F, -6.55F, 1, 2, 8, -0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 6, -1.0F, -2.0F, 0.25F, 4, 2, 3, -0.03F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(1.0F, -0.75F, 3.35F);
        this.body.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 20, -1.5F, -1.25F, -0.4F, 3, 2, 4, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 26, -1.0F, -1.25F, -0.1F, 2, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 3.7F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 10, 24, -0.5F, -1.0F, -0.3F, 1, 2, 5, -0.001F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 9, 32, 0.0F, -2.0F, 0.7F, 0, 1, 4, -0.001F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.05F, 4.7F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 14, 12, 0.0F, -2.0F, 0.0F, 0, 4, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Sclerodus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Sclerodus.rotateAngleY = (float) Math.toRadians(90);
        this.Sclerodus.offsetY = -0.13F;
        this.Sclerodus.offsetX = -0.06F;
        this.Sclerodus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.2F, 0.0F);
        this.Sclerodus.offsetY = -0.05F;
        this.Sclerodus.render(0.01F);
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
        this.resetToDefaultPose();
        this.Sclerodus.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail2, this.tail3, this.tail4, this.tail5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);


            this.swing(Sclerodus, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                //this.Sclerodus.offsetY = 0.58F;
                this.bob(Sclerodus, -speed, 5F, false, f2, 1);
            }
        }
    }
}
