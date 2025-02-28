package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProtopsephurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProtopsephurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer frontleftfin;
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
    private final AdvancedModelRenderer Leftupperjaw;
    private final AdvancedModelRenderer Rightupperjaw;
    private final AdvancedModelRenderer side2;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Leftlowerjaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Rightlowerjaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;

    private ModelAnimator animator;

    public ModelProtopsephurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -6.0F, -4.0F, 5, 6, 10, -0.003F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.2F, -0.5F, -4.0F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.3445F, -0.3146F, 0.5308F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 0, 0.0F, 0.0F, 0.0F, 0, 5, 3, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.2F, -0.5F, -4.0F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.3445F, 0.3146F, -0.5308F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 0, 0.0F, 0.0F, 0.0F, 0, 5, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 19, 17, -2.5F, -0.125F, -4.175F, 5, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 3.5491F, -5.8798F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1833F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 7, -0.5F, -3.0F, -0.25F, 4, 3, 2, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 3.2478F, -7.5932F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1789F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 47, -0.5F, -2.0F, -0.275F, 2, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.4419F, -11.5073F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2007F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 45, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 2.4131F, -11.5162F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1178F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 41, -1.0F, -0.9712F, 0.0086F, 1, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3386F, -5.6848F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2705F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 13, -1.0F, 0.0F, -2.75F, 2, 2, 3, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -0.5135F, -2.8083F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 17, -1.0F, -0.025F, -0.1F, 4, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.3386F, -5.6848F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.288F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 35, -1.0F, -0.025F, -0.075F, 4, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 5.1753F, -1.0142F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 41, -1.5F, -1.975F, -2.175F, 5, 1, 2, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 5.25F, 1.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 40, -1.5F, -2.15F, -2.225F, 5, 2, 2, -0.001F, false));

        this.Leftupperjaw = new AdvancedModelRenderer(this);
        this.Leftupperjaw.setRotationPoint(2.5F, 3.875F, -4.175F);
        this.head.addChild(Leftupperjaw);
        this.Leftupperjaw.cubeList.add(new ModelBox(Leftupperjaw, 38, 23, -2.0F, -2.0F, 0.0F, 2, 2, 4, -0.003F, false));

        this.Rightupperjaw = new AdvancedModelRenderer(this);
        this.Rightupperjaw.setRotationPoint(-2.5F, 3.875F, -4.175F);
        this.head.addChild(Rightupperjaw);
        this.Rightupperjaw.cubeList.add(new ModelBox(Rightupperjaw, 38, 23, 0.0F, -2.0F, 0.0F, 2, 2, 4, -0.003F, true));

        this.side2 = new AdvancedModelRenderer(this);
        this.side2.setRotationPoint(2.858F, 2.9104F, 0.7801F);
        this.head.addChild(side2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-5.7172F, -0.3426F, -0.0158F);
        this.side2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0873F, 0.0008F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -0.7F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-6.0607F, -1.5413F, -3.9523F);
        this.side2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0873F, 0.0008F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 40, 0.0F, -0.425F, 0.0F, 2, 2, 4, 0.001F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-4.2238F, -1.5026F, -8.3911F);
        this.side2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0531F, -0.3927F, -0.0036F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 27, 0.0F, -0.225F, -0.2F, 2, 2, 5, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.358F, -1.4685F, -12.2961F);
        this.side2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0089F, -0.2182F, -0.0019F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 45, 0.0F, 0.0F, 0.0F, 1, 1, 4, -0.001F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0011F, -0.3426F, -0.0158F);
        this.side2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, -0.0873F, -0.0008F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, -0.7F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.3446F, -1.5413F, -3.9523F);
        this.side2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, -0.0873F, -0.0008F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 40, -2.0F, -0.425F, 0.0F, 2, 2, 4, 0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-5.8547F, -1.0422F, -3.5963F);
        this.side2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0087F, 0.0436F, 0.0004F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 4, 0, -0.3F, -0.75F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.1386F, -1.0422F, -3.5963F);
        this.side2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0087F, -0.0436F, -0.0004F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 4, 0, -0.7F, -0.75F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.4923F, -1.5026F, -8.3911F);
        this.side2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0531F, 0.3927F, 0.0036F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 27, -2.0F, -0.225F, -0.2F, 2, 2, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.358F, -1.4685F, -12.2961F);
        this.side2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0089F, 0.2182F, 0.0019F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 45, -1.0F, 0.0F, 0.0F, 1, 1, 4, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.1125F, -1.1003F);
        this.head.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.9397F, -0.6172F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2793F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 35, -2.5F, -1.0F, -2.4F, 5, 1, 3, -0.003F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 27, -1.5F, -1.0F, -4.4F, 3, 1, 2, -0.002F, false));

        this.Leftlowerjaw = new AdvancedModelRenderer(this);
        this.Leftlowerjaw.setRotationPoint(2.5F, -0.789F, -2.5945F);
        this.jaw.addChild(Leftlowerjaw);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.5F, 1.7287F, 1.9773F);
        this.Leftlowerjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2793F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 17, 0.5F, -1.0F, -2.4F, 2, 1, 3, -0.004F, false));

        this.Rightlowerjaw = new AdvancedModelRenderer(this);
        this.Rightlowerjaw.setRotationPoint(-2.5F, -0.789F, -2.5945F);
        this.jaw.addChild(Rightlowerjaw);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.5F, 1.7287F, 1.9773F);
        this.Rightlowerjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2793F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 17, -2.5F, -1.0F, -2.4F, 2, 1, 3, -0.004F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -4.3762F, 5.5119F);
        this.main.addChild(tail);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 4.4262F, 0.1881F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 33, -2.0F, -2.0883F, -0.2156F, 3, 2, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -1.5238F, 0.1881F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1222F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 21, 0, -2.0F, -0.0383F, -0.0156F, 4, 4, 4, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-0.8433F, 3.1702F, 0.1423F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.4483F, -0.1776F, 0.4394F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 17, 0.0F, 0.0617F, -0.0156F, 0, 5, 3, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.8433F, 3.1702F, 0.1423F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.4483F, 0.1776F, -0.4394F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 17, 0.0F, 0.0617F, -0.0156F, 0, 5, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 1.0956F, 3.1846F);
        this.tail.addChild(tail2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 2.1648F, 0.0146F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3142F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 0, -0.5F, -1.35F, 0.4F, 2, 2, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.5F, -2.3437F, 0.9753F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.6458F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 47, 19, 1.5F, -2.7F, 0.0F, 0, 3, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.5F, -2.3056F, 0.9912F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0087F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 31, 9, -3.0F, 0.2117F, -1.0156F, 3, 3, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2482F, 3.7392F);
        this.tail2.addChild(tail3);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 1.2972F, 0.8782F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.4887F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 20, 45, 0.5F, -0.375F, -0.525F, 0, 4, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.0175F, 3.7543F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3142F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 44, 30, -0.5F, -1.575F, -3.925F, 1, 2, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, -2.0574F, 1.252F);
        this.tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0087F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 24, 41, -2.0F, 0.3117F, -1.5156F, 2, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.7047F, 3.3596F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.033F, 3.0266F);
        this.tail4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4451F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 17, 0.0F, -0.7383F, -2.9656F, 0, 6, 9, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.5F, 0.4557F, 0.0064F);
        this.tail4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3578F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 13, 27, -2.0F, -0.4383F, -0.0156F, 1, 1, 6, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.15F;
        this.main.offsetZ = -0.4F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.1F;
        this.main.offsetY = -0.03F;
        this.main.offsetX = -0.02F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.65F;
        this.main.offsetX = 0.238F;
        this.main.rotateAngleY = (float)Math.toRadians(245);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.03F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraProtopsephurus ee = (EntityPrehistoricFloraProtopsephurus) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProtopsephurus entity = (EntityPrehistoricFloraProtopsephurus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*2), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*-0.1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(frontrightfin, frontrightfin.rotateAngleX + (float) Math.toRadians(0), frontrightfin.rotateAngleY + (float) Math.toRadians(0), frontrightfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*3));
        this.setRotateAngle(frontleftfin, frontleftfin.rotateAngleX + (float) Math.toRadians(0), frontleftfin.rotateAngleY + (float) Math.toRadians(0), frontleftfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*3));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-2), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*6), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightfin, backrightfin.rotateAngleX + (float) Math.toRadians(0), backrightfin.rotateAngleY + (float) Math.toRadians(0), backrightfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*3));
        this.setRotateAngle(backleftfin, backleftfin.rotateAngleX + (float) Math.toRadians(0), backleftfin.rotateAngleY + (float) Math.toRadians(0), backleftfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*3));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*12), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*15), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-200))*18), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProtopsephurus entity = (EntityPrehistoricFloraProtopsephurus) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432))*3), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432))*-0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(frontrightfin, frontrightfin.rotateAngleX + (float) Math.toRadians(0), frontrightfin.rotateAngleY + (float) Math.toRadians(0), frontrightfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432))*3));
        this.setRotateAngle(frontleftfin, frontleftfin.rotateAngleX + (float) Math.toRadians(0), frontleftfin.rotateAngleY + (float) Math.toRadians(0), frontleftfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432))*3));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-50))*-4), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-50))*8), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightfin, backrightfin.rotateAngleX + (float) Math.toRadians(0), backrightfin.rotateAngleY + (float) Math.toRadians(0), backrightfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-50))*3));
        this.setRotateAngle(backleftfin, backleftfin.rotateAngleX + (float) Math.toRadians(0), backleftfin.rotateAngleY + (float) Math.toRadians(0), backleftfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-50))*3));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-130))*15), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-180))*22), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-250))*24), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtopsephurus entity = (EntityPrehistoricFloraProtopsephurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (30-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 5) / 5) * (0-(-15)));
            yy = 30 + (((tickAnim - 5) / 5) * (0-(30)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperjaw, Leftupperjaw.rotateAngleX + (float) Math.toRadians(xx), Leftupperjaw.rotateAngleY + (float) Math.toRadians(yy), Leftupperjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-30-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 5) / 5) * (0-(-15)));
            yy = -30 + (((tickAnim - 5) / 5) * (0-(-30)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperjaw, Rightupperjaw.rotateAngleX + (float) Math.toRadians(xx), Rightupperjaw.rotateAngleY + (float) Math.toRadians(yy), Rightupperjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (60-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 60 + (((tickAnim - 5) / 5) * (0-(60)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (40-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 40 + (((tickAnim - 5) / 5) * (0-(40)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerjaw, Leftlowerjaw.rotateAngleX + (float) Math.toRadians(xx), Leftlowerjaw.rotateAngleY + (float) Math.toRadians(yy), Leftlowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-40-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -40 + (((tickAnim - 5) / 5) * (0-(-40)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerjaw, Rightlowerjaw.rotateAngleX + (float) Math.toRadians(xx), Rightlowerjaw.rotateAngleY + (float) Math.toRadians(yy), Rightlowerjaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraProtopsephurus ee = (EntityPrehistoricFloraProtopsephurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = -0.2F;
            this.bob(main, 0.5f, 2.5F, false, f2, 1);
            this.chainWave(fishTail, 0.26f * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, 0.26f * 1.7F, 0.28F, -0.55, f2, 0.4F);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

