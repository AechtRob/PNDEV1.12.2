package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGooloogongia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGooloogongia extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer backlobe;
    private final AdvancedModelRenderer cube_r33;

    private ModelAnimator animator;

    public ModelGooloogongia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.0F, 10.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -5.0F, -16.0F, 8, 6, 10, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(3.425F, 0.0F, -13.225F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.7489F, 0.7608F, -0.5618F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 53, 38, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 0, 0.0F, -1.75F, 2.0F, 0, 3, 5, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-3.425F, 0.0F, -13.225F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.7489F, -0.7608F, 0.5618F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 53, 38, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 0, 0.0F, -1.75F, 2.0F, 0, 3, 5, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.9938F, -5.0F, -16.0373F);
        this.main.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.9876F, 0.9578F, -4.9005F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0916F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 27, -0.5F, -0.55F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 24, 1.4876F, -0.55F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.8228F, 2.4676F, -6.5891F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0963F, -0.6996F, -0.043F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, 0.4153F, -0.8277F, -1.7192F, 0, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1648F, 2.4676F, -6.5891F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0963F, 0.6996F, 0.043F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, -0.4153F, -0.8277F, -1.7192F, 0, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.8228F, 2.4676F, -6.5891F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3363F, -0.6996F, -0.043F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, 0.1653F, -0.9277F, -2.0192F, 1, 1, 2, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1648F, 2.4676F, -6.5891F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3363F, 0.6996F, 0.043F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 21, -1.1653F, -0.9277F, -2.0192F, 1, 1, 2, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.8228F, 1.6176F, -6.5891F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1051F, -0.7182F, -0.0443F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 29, 0.0471F, -1.0347F, -1.9174F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.1648F, 1.6176F, -6.5891F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1051F, 0.7182F, 0.0443F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 30, -2.0471F, -1.0347F, -1.9174F, 2, 1, 2, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0057F, 2.7812F, -6.0185F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.314F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 19, -3.4882F, -2.0735F, -0.6521F, 3, 2, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.0057F, 2.7812F, -6.0185F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4012F, 0.2693F, 0.0161F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 48, -2.0773F, -3.7235F, 2.1979F, 2, 2, 4, 0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.982F, 2.7812F, -6.0185F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4012F, -0.2693F, -0.0161F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 48, 0.0773F, -3.7235F, 2.1979F, 2, 2, 4, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.982F, 2.7812F, -6.0185F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.314F, -0.2693F, -0.0161F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 8, 0.4023F, -0.5235F, -0.6521F, 0, 1, 8, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 29, 0.0773F, -2.0235F, -0.6521F, 2, 2, 8, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.0057F, 2.7812F, -6.0185F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.314F, 0.2693F, 0.0161F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 8, -0.4023F, -0.5235F, -0.6521F, 0, 1, 8, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 31, -2.0773F, -2.0235F, -0.6521F, 2, 2, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.9938F, 0.0F, 0.0373F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0916F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 41, -1.5F, 0.0F, -6.0F, 3, 2, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.9688F, 1.6245F, -7.9651F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4232F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 18, -0.525F, -0.8444F, 0.0442F, 1, 1, 2, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.9688F, 0.6041F, -6.0142F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0742F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -0.5F, -0.0384F, -2.0107F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-5.9938F, 0.0F, 0.0373F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0829F, -0.3054F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 22, 0.075F, 0.0F, -7.0F, 3, 2, 7, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.0062F, 0.0F, 0.0373F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0829F, 0.3054F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 39, -3.075F, 0.0F, -7.0F, 3, 2, 7, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-2.0F, 4.525F, 0.05F);
        this.head.addChild(jaw);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.982F, -1.7438F, -6.0685F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.314F, -0.2693F, -0.0161F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 9, 0.5773F, -0.5235F, -0.6521F, 0, 1, 8, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 10, 0.0773F, -0.0235F, -0.6521F, 2, 1, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.9943F, -1.7438F, -6.0685F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.314F, 0.2693F, 0.0161F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 9, -0.5773F, -0.5235F, -0.6521F, 0, 1, 8, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 36, -2.0773F, -0.0235F, -0.6521F, 2, 1, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.6846F, -2.2804F, -7.0113F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.8691F, -0.603F, 0.2156F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.05F, -0.3F, -0.225F, 0, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 1, 0.0F, -0.075F, -0.625F, 0, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.697F, -2.2804F, -7.0113F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.8691F, 0.603F, -0.2156F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -0.05F, -0.3F, -0.225F, 0, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 1, 0.0F, -0.075F, -0.625F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.8228F, -2.0574F, -6.6391F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.5156F, -0.603F, 0.2156F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 16, 0.1653F, 0.0473F, -2.0192F, 1, 1, 2, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.8352F, -2.0574F, -6.6391F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.5156F, 0.603F, -0.2156F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 3, -1.1653F, 0.0473F, -2.0192F, 1, 1, 2, -0.001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0207F, -1.6322F, -6.7972F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.6474F, -0.6413F, 0.4137F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 5, 0, -0.425F, -0.525F, -0.425F, 1, 1, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.0043F, -0.4313F, -2.9852F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3052F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 27, -1.4895F, -0.375F, -4.0F, 3, 1, 8, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0312F, 0.5624F, -3.0843F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2443F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 46, 25, -2.025F, -0.9F, 0.1982F, 4, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0312F, -0.9174F, -6.7952F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3796F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 42, 0, -1.525F, -1.0007F, -0.3068F, 3, 1, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0312F, -1.1174F, -6.9202F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5149F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 0, -0.525F, -0.8881F, -1.7745F, 1, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.8267F, -5.9361F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -3.5F, -2.1733F, -1.0639F, 7, 5, 6, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 3.8267F, -0.0639F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1571F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 38, 31, -2.5F, -1.15F, -0.775F, 5, 1, 6, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 38, 31, -2.5F, -1.15F, -0.775F, 5, 1, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.6585F, 4.952F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 0, -2.5F, -1.5147F, -1.0159F, 5, 4, 6, -0.02F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 3.4853F, 0.9841F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0742F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 40, 10, -2.0F, -1.15F, -1.925F, 4, 1, 6, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 40, 10, -2.0F, -1.15F, -1.925F, 4, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1174F, 5.0076F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 45, -1.5F, -1.6321F, -1.0235F, 3, 4, 5, -0.03F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -2.5571F, 3.9765F);
        this.tail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 3, 0.0F, -1.0F, -3.0F, 0, 2, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 2.3179F, 3.3765F);
        this.tail3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.096F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 49, 51, -1.0F, -0.8448F, -3.5579F, 2, 1, 4, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.0F, 1.8679F, 0.7265F);
        this.tail3.addChild(backleftfin);
        this.setRotateAngle(backleftfin, -0.3491F, 0.3927F, 0.0F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 32, 12, 0.5F, -1.3F, -1.0F, 0, 2, 7, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.0F, 1.8679F, 0.7265F);
        this.tail3.addChild(backrightfin);
        this.setRotateAngle(backrightfin, -0.3491F, -0.3927F, 0.0F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 32, 12, -0.5F, -1.3F, -1.0F, 0, 2, 7, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.4179F, 3.7265F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 29, 47, -1.0F, -2.0F, 0.0F, 2, 4, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.025F, 0.0F, 3.675F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 46, 17, -0.525F, -1.0F, 0.0F, 1, 2, 6, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 23, -0.025F, 1.0F, 0.0F, 0, 3, 4, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 33, 34, 0.025F, -2.5F, 4.0F, 0, 6, 7, 0.0F, false));

        this.backlobe = new AdvancedModelRenderer(this);
        this.backlobe.setRotationPoint(-0.025F, -1.4897F, -0.3422F);
        this.tail5.addChild(backlobe);
        this.setRotateAngle(backlobe, 0.1789F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.5897F, 0.1172F);
        this.backlobe.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1745F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 46, 33, 0.0F, -1.5F, 0.0F, 0, 2, 5, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 14, 29, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.02F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = 0.02F;
        this.main.offsetY = -0.23F;
        this.main.offsetZ = 0.07F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(frontleftfin, -1.5686F, 1.0551F, -1.5601F);
        this.setRotateAngle(frontrightfin, -0.6365F, -0.5924F, 0.3833F);
        this.setRotateAngle(cube_r1, 0.0916F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0963F, -0.6996F, -0.043F);
        this.setRotateAngle(cube_r3, -0.0963F, 0.6996F, 0.043F);
        this.setRotateAngle(cube_r4, -0.3363F, -0.6996F, -0.043F);
        this.setRotateAngle(cube_r5, -0.3363F, 0.6996F, 0.043F);
        this.setRotateAngle(cube_r6, 0.1051F, -0.7182F, -0.0443F);
        this.setRotateAngle(cube_r7, 0.1051F, 0.7182F, 0.0443F);
        this.setRotateAngle(cube_r8, -0.314F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.4012F, 0.2693F, 0.0161F);
        this.setRotateAngle(cube_r10, -0.4012F, -0.2693F, -0.0161F);
        this.setRotateAngle(cube_r11, -0.314F, -0.2693F, -0.0161F);
        this.setRotateAngle(cube_r12, -0.314F, 0.2693F, 0.0161F);
        this.setRotateAngle(cube_r13, 0.0916F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.4232F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0829F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0829F, 0.3054F, 0.0F);
        this.setRotateAngle(jaw, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.314F, -0.2693F, -0.0161F);
        this.setRotateAngle(cube_r19, -0.314F, 0.2693F, 0.0161F);
        this.setRotateAngle(cube_r20, -0.8691F, -0.603F, 0.2156F);
        this.setRotateAngle(cube_r21, -0.8691F, 0.603F, -0.2156F);
        this.setRotateAngle(cube_r22, -0.5156F, -0.603F, 0.2156F);
        this.setRotateAngle(cube_r23, -0.5156F, 0.603F, -0.2156F);
        this.setRotateAngle(cube_r24, -0.6474F, -0.6413F, 0.4137F);
        this.setRotateAngle(cube_r25, -0.3052F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, -0.3796F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.5149F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r29, 0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r30, 0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(backleftfin, -0.3274F, 0.1868F, 0.0754F);
        this.setRotateAngle(backrightfin, -0.6461F, -1.0183F, 0.4322F);
        this.setRotateAngle(tail4, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(tail5, 0.1415F, 0.3892F, 0.054F);
        this.setRotateAngle(backlobe, 0.2615F, -0.8118F, -0.1918F);
        this.setRotateAngle(cube_r33, 0.1745F, 0.0F, 0.0F);
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = 0.07F;
        this.main.offsetY = -0.05F;
        this.main.offsetZ = -0.09F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.main.offsetY = 0F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.134F;

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        //if (!e.isInWater()) {
        //    speed = 0.210F;
        //}


        //this.head.rotateAngleY += (f3 / (180F / (float) Math.PI));
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.43F * still, -0.65, f2, 0.5F * still);
            this.swing(main, speed, 0.1F * still, true, 0, 0, f2, 0.7F * still);
        }
        else {
            this.chainWave(fishTail, speed * 0.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 0.5F, 0.2F, -0.55, f2, 0.4F * still);
        }
        this.flap(frontleftfin, (float) (speed * 0.65), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontleftfin, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(frontrightfin, (float) (speed * 0.65), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontrightfin, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(backleftfin, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backleftfin, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(backrightfin, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backrightfin, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        //if (!e.isInWater()) {
        //    //this.head.rotateAngleZ = (float) Math.toRadians(90);
        //    this.head.offsetY = 0.22F;
        //    this.bob(head, -speed * 1.8F, 1.5F, false, f2, 1);
        //    this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
        //    this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        //}

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGooloogongia e = (EntityPrehistoricFloraGooloogongia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

