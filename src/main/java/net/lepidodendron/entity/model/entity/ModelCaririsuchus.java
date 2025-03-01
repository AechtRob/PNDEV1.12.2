package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCaririsuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCaririsuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;

    private ModelAnimator animator;

    public ModelCaririsuchus() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 13.5F, 8.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.6613F, -1.4515F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2356F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 8, -1.5F, 0.075F, 0.2F, 3, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.25F, 0.75F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 24, -2.5F, -1.0F, -2.5F, 5, 5, 5, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(3.25F, 1.25F, -0.25F);
        this.main.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.3054F, 0.0F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 40, 41, -1.75F, -0.75F, -2.0F, 3, 5, 4, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(-0.25F, 4.25F, -2.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.6545F, 0.0F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 58, -1.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 5.7773F, 1.7187F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.3491F, 0.0F, 0.0F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 0, 44, -1.5F, -0.0509F, -4.4649F, 3, 1, 5, 0.0F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-3.25F, 1.25F, -0.25F);
        this.main.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.3054F, 0.0F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 40, 41, -1.25F, -0.75F, -2.0F, 3, 5, 4, 0.0F, true));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.25F, 4.25F, -2.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.6545F, 0.0F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 0, 58, -1.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0F, 5.7773F, 1.7187F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.3491F, 0.0F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 0, 44, -1.5F, -0.0509F, -4.4649F, 3, 1, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.25F, -1.25F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -1.5F, -6.0F, 6, 5, 6, -0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 59, 27, -2.0F, -2.3247F, -5.9913F, 4, 1, 2, 0.002F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 24, -2.5F, 3.25F, -6.0F, 5, 1, 6, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.3247F, -3.9913F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 0, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -3.0F, -1.5F, -6.0F, 6, 5, 6, 0.002F, false));
        this.body2.cubeList.add(new ModelBox(body2, 57, 37, -2.0F, -2.3247F, -1.9913F, 4, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 25, 0, -2.5F, 3.25F, -6.0F, 5, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.25F, -6.0F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 18, -2.0F, 0.275F, 0.0F, 4, 1, 4, -0.002F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.9564F, -5.5019F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 40, 32, -2.5F, -0.2974F, -2.4147F, 5, 5, 3, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7974F, -2.4147F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 67, -1.5F, 0.25F, 0.0F, 3, 1, 2, 0.0F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(1.75F, 3.856F, -0.7875F);
        this.body3.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.3927F, 0.0F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 62, 6, -0.5F, -0.5F, -1.5F, 2, 4, 2, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.5F, 3.5F, 0.5F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.829F, 0.0F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 35, 64, -1.0F, 0.0F, -2.0F, 2, 5, 2, -0.001F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 4.0309F, -0.3949F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.5236F, 0.0F, 0.0F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 62, 49, -1.5F, 0.0F, -3.0F, 3, 1, 3, -0.001F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-1.75F, 3.856F, -0.7875F);
        this.body3.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.3927F, 0.0F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 62, 6, -1.5F, -0.5F, -1.5F, 2, 4, 2, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.5F, 3.5F, 0.5F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.829F, 0.0F, 0.0F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 35, 64, -1.0F, 0.0F, -2.0F, 2, 5, 2, -0.001F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 4.0309F, -0.3949F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.5236F, 0.0F, 0.0F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 62, 49, -1.5F, 0.0F, -3.0F, 3, 1, 3, -0.001F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0115F, -1.8733F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 55, 41, -0.75F, -0.2936F, -2.999F, 3, 4, 3, -0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 55, 41, -2.25F, -0.2936F, -2.999F, 3, 4, 3, -0.004F, true));
        this.neck.cubeList.add(new ModelBox(neck, 11, 63, -1.5F, -0.6186F, -3.099F, 3, 1, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 4.4564F, -0.999F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 58, -1.5F, -0.925F, -2.05F, 4, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5918F, -3.0251F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 57, 31, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 68, -1.0F, 0.0F, -4.0F, 2, 2, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.7218F, 1.0751F, -6.9587F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3918F, -0.2159F, 0.0318F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 71, -0.5F, -0.425F, -1.2F, 1, 1, 1, -0.001F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.1017F, 1.7608F, -7.6611F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6274F, -0.2159F, 0.0318F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 71, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.3507F, 0.6558F, -6.366F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0707F, -0.2159F, 0.0318F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 71, 0.0F, 0.0F, -1.4F, 1, 1, 1, 0.002F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 71, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.004F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0F, 1.5709F, -3.5392F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1474F, -0.2159F, 0.0318F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 64, 0.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, 1.0761F, -3.4674F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3031F, -0.2342F, 0.1011F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 15, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, 1.0761F, -3.4674F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0849F, -0.2342F, 0.1011F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 59, 21, 0.0F, 0.0F, -0.125F, 2, 1, 4, -0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.7218F, 1.0751F, -6.9587F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3918F, 0.2159F, -0.0318F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 71, -0.5F, -0.425F, -1.2F, 1, 1, 1, -0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.3084F, 1.5331F, -4.9352F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3762F, -0.2159F, 0.0318F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 3, 72, 0.0F, -0.525F, -0.575F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.1616F, 1.7725F, -7.0768F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2563F, -0.2213F, 0.2438F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 35, -0.075F, -0.25F, -0.425F, 0, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.9014F, 1.526F, -7.8593F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1665F, -0.2674F, 0.2197F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 6, 72, 0.175F, -0.825F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.907F, -9.0769F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2491F, -0.3957F, 0.0341F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 72, -0.125F, -0.325F, -0.675F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.1616F, 1.7725F, -7.0768F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2563F, 0.2213F, -0.2438F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 35, 0.075F, -0.25F, -0.425F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.3084F, 1.5331F, -4.9352F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3762F, 0.2159F, -0.0318F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 3, 72, 0.0F, -0.525F, -0.575F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.1017F, 1.7608F, -7.6611F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6274F, 0.2159F, -0.0318F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 54, 71, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.3507F, 0.6558F, -6.366F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0707F, 0.2159F, -0.0318F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 49, 71, -1.0F, 0.0F, -1.4F, 1, 1, 1, 0.002F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 71, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.004F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0F, 1.5709F, -3.5392F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1474F, 0.2159F, -0.0318F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 24, 64, -1.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.0F, 1.0761F, -3.4674F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0849F, 0.2342F, -0.1011F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 59, 21, -2.0F, 0.0F, -0.125F, 2, 1, 4, -0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.0F, 1.0761F, -3.4674F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3031F, 0.2342F, -0.1011F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 59, 15, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 1.4918F, -7.5695F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2749F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 68, 41, -1.5F, -0.9861F, -1.0F, 2, 1, 1, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 1.6353F, -6.5799F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.144F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 58, -1.5F, -1.0F, -1.0F, 2, 1, 4, 0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.1956F, -7.9729F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 68, -0.5F, 0.0F, -1.0F, 2, 1, 1, -0.001F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 0.7808F, -8.9255F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1007F, -0.5214F, -0.0503F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 23, 70, 0.0F, -0.5F, -1.0F, 1, 1, 1, -0.005F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, 0.7808F, -8.9255F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1007F, 0.5214F, 0.0503F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 34, 48, -1.0F, -0.5F, -1.0F, 1, 1, 1, -0.004F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.9014F, 1.526F, -7.8593F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1665F, 0.2674F, -0.2197F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 6, 72, -0.175F, -0.825F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 0.907F, -9.0769F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2491F, 0.3957F, -0.0341F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 72, 0.125F, -0.325F, -0.675F, 0, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.0F, 0.1956F, -7.9729F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0873F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 34, 42, 0.5F, 0.0F, -1.9F, 1, 1, 1, -0.002F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 0.3263F, -6.4786F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0873F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 66, 67, -0.5F, 0.0F, -1.5F, 2, 1, 2, 0.001F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.0F, -4.0F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 44, 66, -0.5F, 0.0F, -3.0F, 2, 1, 3, -0.002F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-1.0F, 2.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 23, -0.5F, -1.75F, -3.575F, 3, 3, 4, -0.003F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.0F, 0.5F, -4.0F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.1745F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 65, 0, 0.05F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(3.0F, 0.5F, -4.0F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.1745F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 65, 0, -1.05F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.0F, 1.485F, -4.3607F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3622F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 32, 51, -1.5F, -2.025F, 0.325F, 3, 2, 4, -0.002F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 0.6707F, -7.248F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2749F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 39, 58, -0.5F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.25F, 0.3402F, -4.7594F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.5367F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 70, 71, -0.175F, -0.625F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.25F, -0.3586F, -6.222F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.328F, -0.1962F, 0.096F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 17, 38, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.1F, -0.5217F, -7.8783F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.5585F, -0.0524F, -0.0326F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 67, 71, -0.05F, -0.9F, -0.725F, 0, 1, 1, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0F, -1.08F, -9.2581F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.6365F, -0.3965F, 0.278F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 64, 71, -0.4F, -0.425F, -0.175F, 0, 1, 1, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.0F, 0.5606F, -3.6827F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1474F, -0.2159F, 0.0318F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 63, 61, 0.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.9F, -0.5217F, -7.8783F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.5585F, 0.0524F, 0.0326F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 67, 71, 0.05F, -0.9F, -0.725F, 0, 1, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0F, -1.08F, -9.2581F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.6365F, 0.3965F, -0.278F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 64, 71, 0.4F, -0.425F, -0.175F, 0, 1, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, -0.4966F, -8.9178F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.4124F, -0.4865F, 0.2018F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 70, 37, 0.0F, -0.5F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(2.0F, -0.4966F, -8.9178F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.4124F, 0.4865F, -0.2018F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 28, 70, -1.0F, -0.5F, -1.0F, 1, 1, 1, -0.004F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.0F, -0.1449F, -9.6124F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.3622F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 34, 45, -0.5F, -1.075F, -0.475F, 1, 1, 1, -0.001F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(1.0F, 0.0323F, -9.1449F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.3622F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 68, -1.0F, -1.075F, 0.0F, 2, 1, 2, -0.002F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(2.25F, 0.3402F, -4.7594F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.5367F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 70, 71, 0.175F, -0.625F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(2.25F, -0.3586F, -6.222F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.328F, 0.1962F, -0.096F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 17, 38, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.2998F, 0.5456F, -7.2705F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.2979F, -0.16F, 0.0615F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 68, 44, -0.5F, -0.975F, -1.175F, 1, 1, 1, -0.002F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(1.7002F, 0.5456F, -7.2705F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.2979F, 0.16F, -0.0615F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 68, 44, -0.5F, -0.975F, -1.175F, 1, 1, 1, -0.002F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(3.0F, 0.5606F, -3.6827F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.1474F, 0.2159F, -0.0318F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 63, 61, -1.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.5F, -0.3647F, -6.5799F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1265F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 51, -1.5F, 0.0F, -1.0F, 2, 1, 5, -0.004F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.6338F, -3.3931F);
        this.head.addChild(eye);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.7727F, 0.1602F, -0.6571F);
        this.eye.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0035F, -0.3409F, -0.0276F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 59, 71, 0.125F, -0.65F, -0.025F, 1, 1, 1, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(1.7727F, 0.1602F, -0.6571F);
        this.eye.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0035F, 0.3409F, 0.0276F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 59, 71, -1.125F, -0.65F, -0.025F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 2.75F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 25, 8, -2.0F, -0.8223F, -0.0196F, 4, 4, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 47, 51, -1.0F, -1.0223F, -0.0196F, 2, 1, 5, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.65F, 4.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 32, -1.5F, -0.0723F, -0.0196F, 3, 3, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 42, -1.0F, -0.2973F, -0.0196F, 2, 1, 6, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3854F, 5.752F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 35, -1.0F, -0.3223F, -0.0196F, 2, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 50, -0.5F, -0.5723F, -0.0196F, 1, 1, 6, -0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.6F, 5.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 44, 15, -0.5F, -0.8223F, -0.0196F, 1, 1, 6, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.25F, -0.8223F, 0.4804F);
        this.tail4.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.0436F, 0.0436F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 63, 54, -0.1681F, -0.5F, -0.0048F, 0, 1, 5, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.25F, -0.8223F, 0.4804F);
        this.tail4.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.0436F, -0.0436F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 63, 54, 0.1681F, -0.5F, -0.0048F, 0, 1, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.60F;
        this.main.offsetX = 0.10F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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

        EntityPrehistoricFloraCaririsuchus proteros = (EntityPrehistoricFloraCaririsuchus) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCaririsuchus ee = (EntityPrehistoricFloraCaririsuchus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animStand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaririsuchus entity = (EntityPrehistoricFloraCaririsuchus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.125+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-55))*-0.55);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 26.75269 + (((tickAnim - 0) / 5) * (3.35024-(26.75269)));
            yy = 2.2458 + (((tickAnim - 0) / 5) * (-3.87902-(2.2458)));
            zz = 0.13743 + (((tickAnim - 0) / 5) * (0.97708-(0.13743)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.35024 + (((tickAnim - 5) / 5) * (-17.25-(3.35024)));
            yy = -3.87902 + (((tickAnim - 5) / 5) * (0-(-3.87902)));
            zz = 0.97708 + (((tickAnim - 5) / 5) * (0-(0.97708)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -17.25 + (((tickAnim - 10) / 15) * (26.75269-(-17.25)));
            yy = 0 + (((tickAnim - 10) / 15) * (2.2458-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0.13743-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.75 + (((tickAnim - 0) / 3) * (15.47-(22.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 15.47 + (((tickAnim - 3) / 5) * (-15.4-(15.47)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15.4 + (((tickAnim - 8) / 2) * (-16.5-(-15.4)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -16.5 + (((tickAnim - 10) / 15) * (22.75-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.615-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.015-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.615 + (((tickAnim - 5) / 3) * (1.555-(1.615)));
            zz = 0.015 + (((tickAnim - 5) / 3) * (0.055-(0.015)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.555 + (((tickAnim - 8) / 2) * (-0.2-(1.555)));
            zz = 0.055 + (((tickAnim - 8) / 2) * (0.425-(0.055)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 15) * (0-(-0.2)));
            zz = 0.425 + (((tickAnim - 10) / 15) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.75 + (((tickAnim - 0) / 3) * (81.63-(29.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 81.63 + (((tickAnim - 3) / 2) * (40.14-(81.63)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 40.14 + (((tickAnim - 5) / 5) * (41.75-(40.14)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 41.75 + (((tickAnim - 10) / 3) * (19.49-(41.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 19.49 + (((tickAnim - 13) / 4) * (-1.03-(19.49)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -1.03 + (((tickAnim - 17) / 4) * (4.84-(-1.03)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 4.84 + (((tickAnim - 21) / 4) * (29.75-(4.84)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.325-(0)));
            zz = 0.425 + (((tickAnim - 0) / 3) * (-0.2-(0.425)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.325 + (((tickAnim - 3) / 0) * (1.73-(1.325)));
            zz = -0.2 + (((tickAnim - 3) / 0) * (0.18-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.73 + (((tickAnim - 3) / 2) * (1.34-(1.73)));
            zz = 0.18 + (((tickAnim - 3) / 2) * (0.365-(0.18)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.34 + (((tickAnim - 5) / 3) * (0.775-(1.34)));
            zz = 0.365 + (((tickAnim - 5) / 3) * (0-(0.365)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 2) * (-0.2-(0.775)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 6) * (0.385-(-0.2)));
            zz = 0 + (((tickAnim - 10) / 6) * (0.18-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.385 + (((tickAnim - 16) / 7) * (0-(0.385)));
            zz = 0.18 + (((tickAnim - 16) / 7) * (0.595-(0.18)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0.595 + (((tickAnim - 23) / 2) * (0.425-(0.595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+120))*4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*2));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-55))*-0.07);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*4), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+140))*-4), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-5));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -31.25 + (((tickAnim - 0) / 11) * (50.29355-(-31.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (7.5524-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-5.2112-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 50.29355 + (((tickAnim - 11) / 7) * (9.54593-(50.29355)));
            yy = 7.5524 + (((tickAnim - 11) / 7) * (8.15499-(7.5524)));
            zz = -5.2112 + (((tickAnim - 11) / 7) * (-9.33837-(-5.2112)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 9.54593 + (((tickAnim - 18) / 7) * (-31.25-(9.54593)));
            yy = 8.15499 + (((tickAnim - 18) / 7) * (0-(8.15499)));
            zz = -9.33837 + (((tickAnim - 18) / 7) * (0-(-9.33837)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0.4 + (((tickAnim - 11) / 14) * (0-(0.4)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 23 + (((tickAnim - 0) / 11) * (4-(23)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 11) / 2) * (12.27-(4)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 12.27 + (((tickAnim - 13) / 5) * (-7.29-(12.27)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -7.29 + (((tickAnim - 18) / 4) * (-9.85-(-7.29)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -9.85 + (((tickAnim - 22) / 3) * (23-(-9.85)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 11) * (0.425-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 11) / 2) * (0.755-(0.425)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.755 + (((tickAnim - 13) / 5) * (0.65-(0.755)));
            zz = 0.175 + (((tickAnim - 13) / 5) * (0-(0.175)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.65 + (((tickAnim - 18) / 7) * (-0.15-(0.65)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.5 + (((tickAnim - 0) / 5) * (-15.93-(9.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15.93 + (((tickAnim - 5) / 3) * (-1.11-(-15.93)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -1.11 + (((tickAnim - 8) / 3) * (46.75-(-1.11)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 46.75 + (((tickAnim - 11) / 2) * (80.18-(46.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 80.18 + (((tickAnim - 13) / 5) * (69.47-(80.18)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 69.47 + (((tickAnim - 18) / 4) * (62.15-(69.47)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 62.15 + (((tickAnim - 22) / 3) * (9.5-(62.15)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 3) / 2) * (0-(0.7)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0.425-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (-0.775-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 11) / 2) * (0.13-(0.425)));
            zz = -0.775 + (((tickAnim - 11) / 2) * (-0.94-(-0.775)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.13 + (((tickAnim - 13) / 3) * (1.035-(0.13)));
            zz = -0.94 + (((tickAnim - 13) / 3) * (-1.24-(-0.94)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.035 + (((tickAnim - 16) / 2) * (1.095-(1.035)));
            zz = -1.24 + (((tickAnim - 16) / 2) * (-1.435-(-1.24)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.095 + (((tickAnim - 18) / 4) * (0.78-(1.095)));
            zz = -1.435 + (((tickAnim - 18) / 4) * (-1.115-(-1.435)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.78 + (((tickAnim - 22) / 3) * (0-(0.78)));
            zz = -1.115 + (((tickAnim - 22) / 3) * (0-(-1.115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 39.54355 + (((tickAnim - 0) / 13) * (-30.5-(39.54355)));
            yy = -7.55238 + (((tickAnim - 0) / 13) * (0-(-7.55238)));
            zz = 5.21118 + (((tickAnim - 0) / 13) * (0-(5.21118)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -30.5 + (((tickAnim - 13) / 10) * (47.54355-(-30.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (-7.5524-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (5.2112-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 47.54355 + (((tickAnim - 23) / 2) * (39.54355-(47.54355)));
            yy = -7.5524 + (((tickAnim - 23) / 2) * (-7.55238-(-7.5524)));
            zz = 5.2112 + (((tickAnim - 23) / 2) * (5.21118-(5.2112)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 13) * (0-(0.4)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 23) / 2) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.27 + (((tickAnim - 0) / 5) * (-7.29-(2.27)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -7.29 + (((tickAnim - 5) / 4) * (-5.1-(-7.29)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5.1 + (((tickAnim - 9) / 4) * (22.5-(-5.1)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 13) / 10) * (13.25-(22.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 13.25 + (((tickAnim - 23) / 2) * (2.27-(13.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 3) * (0.485-(0.075)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.485 + (((tickAnim - 3) / 2) * (0.65-(0.485)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.65 + (((tickAnim - 5) / 8) * (-0.15-(0.65)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 10) * (0.425-(-0.15)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 23) / 2) * (0.075-(0.425)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 80.18 + (((tickAnim - 0) / 5) * (69.47-(80.18)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 69.47 + (((tickAnim - 5) / 4) * (70.9-(69.47)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 70.9 + (((tickAnim - 9) / 4) * (9.5-(70.9)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 9.5 + (((tickAnim - 13) / 4) * (-15.87-(9.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15.87 + (((tickAnim - 17) / 3) * (-9.53-(-15.87)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -9.53 + (((tickAnim - 20) / 3) * (49.5-(-9.53)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 49.5 + (((tickAnim - 23) / 2) * (80.18-(49.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.205 + (((tickAnim - 0) / 3) * (1.305-(0.205)));
            zz = -1.415 + (((tickAnim - 0) / 3) * (-1.42-(-1.415)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.305 + (((tickAnim - 3) / 2) * (1.07-(1.305)));
            zz = -1.42 + (((tickAnim - 3) / 2) * (-1.435-(-1.42)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.07 + (((tickAnim - 5) / 4) * (0.68-(1.07)));
            zz = -1.435 + (((tickAnim - 5) / 4) * (-1.465-(-1.435)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.68 + (((tickAnim - 9) / 4) * (-0.025-(0.68)));
            zz = -1.465 + (((tickAnim - 9) / 4) * (0-(-1.465)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 13) / 3) * (0.39-(-0.025)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.39 + (((tickAnim - 16) / 7) * (-0.1-(0.39)));
            zz = -0.25 + (((tickAnim - 16) / 7) * (-0.775-(-0.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 23) / 2) * (0.205-(-0.1)));
            zz = -0.775 + (((tickAnim - 23) / 2) * (-1.415-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+160))*4.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+250))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*2.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*2.5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+200))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3.5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*1.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -4.75 + (((tickAnim - 0) / 10) * (24.50963-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.24206-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.25993-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 24.50963 + (((tickAnim - 10) / 7) * (0.82306-(24.50963)));
            yy = -4.24206 + (((tickAnim - 10) / 7) * (3.43901-(-4.24206)));
            zz = -0.25993 + (((tickAnim - 10) / 7) * (-1.60274-(-0.25993)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0.82306 + (((tickAnim - 17) / 5) * (-12.25-(0.82306)));
            yy = 3.43901 + (((tickAnim - 17) / 5) * (0-(3.43901)));
            zz = -1.60274 + (((tickAnim - 17) / 5) * (0-(-1.60274)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -12.25 + (((tickAnim - 22) / 3) * (-4.75-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -11.25 + (((tickAnim - 0) / 9) * (27-(-11.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 27 + (((tickAnim - 9) / 3) * (17.47-(27)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 17.47 + (((tickAnim - 12) / 7) * (-15.4-(17.47)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -15.4 + (((tickAnim - 19) / 3) * (-16-(-15.4)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -16 + (((tickAnim - 22) / 3) * (-11.25-(-16)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 9) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 8) * (1.615-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0.015-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.615 + (((tickAnim - 17) / 2) * (1.555-(1.615)));
            zz = 0.015 + (((tickAnim - 17) / 2) * (0.055-(0.015)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.555 + (((tickAnim - 19) / 3) * (-0.075-(1.555)));
            zz = 0.055 + (((tickAnim - 19) / 3) * (0-(0.055)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 22) / 3) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.25 + (((tickAnim - 0) / 3) * (-3.62-(15.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -3.62 + (((tickAnim - 3) / 3) * (12.56-(-3.62)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 12.56 + (((tickAnim - 6) / 3) * (29.75-(12.56)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 29.75 + (((tickAnim - 9) / 3) * (81.63-(29.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 81.63 + (((tickAnim - 12) / 4) * (40.14-(81.63)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 40.14 + (((tickAnim - 16) / 6) * (37.25-(40.14)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 37.25 + (((tickAnim - 22) / 3) * (15.25-(37.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 3) * (-0.035-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.17-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.035 + (((tickAnim - 3) / 6) * (0-(-0.035)));
            zz = 0.17 + (((tickAnim - 3) / 6) * (0.425-(0.17)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (1.325-(0)));
            zz = 0.425 + (((tickAnim - 9) / 3) * (-0.2-(0.425)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.325 + (((tickAnim - 12) / 1) * (1.58-(1.325)));
            zz = -0.2 + (((tickAnim - 12) / 1) * (0.455-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.58 + (((tickAnim - 13) / 3) * (1.34-(1.58)));
            zz = 0.455 + (((tickAnim - 13) / 3) * (0.365-(0.455)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.34 + (((tickAnim - 16) / 3) * (1.1-(1.34)));
            zz = 0.365 + (((tickAnim - 16) / 3) * (0-(0.365)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 19) / 3) * (-0.175-(1.1)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 22) / 3) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);
        

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaririsuchus entity = (EntityPrehistoricFloraCaririsuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.5 + (((tickAnim - 15) / 20) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 35) / 15) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.575 + (((tickAnim - 15) / 20) * (-2.575-(-2.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.575 + (((tickAnim - 35) / 15) * (0-(-2.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18 + (((tickAnim - 15) / 20) * (-18-(-18)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 35) / 15) * (0-(-18)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 35.5 + (((tickAnim - 15) / 20) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 35) / 15) * (0-(35.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11.25 + (((tickAnim - 15) / 20) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 35) / 15) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18 + (((tickAnim - 15) / 20) * (-18-(-18)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 35) / 15) * (0-(-18)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 35.5 + (((tickAnim - 15) / 20) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 35) / 15) * (0-(35.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11.25 + (((tickAnim - 15) / 20) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 35) / 15) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.49553-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.49553 + (((tickAnim - 15) / 20) * (-3.49553-(-3.49553)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.49553 + (((tickAnim - 35) / 15) * (0-(-3.49553)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.75 + (((tickAnim - 15) / 20) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 35) / 15) * (0-(6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -0.25 + (((tickAnim - 15) / 20) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.25 + (((tickAnim - 35) / 15) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21 + (((tickAnim - 15) / 20) * (-21-(-21)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 35) / 15) * (0-(-21)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 25.25 + (((tickAnim - 15) / 20) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 35) / 15) * (0-(25.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21 + (((tickAnim - 15) / 20) * (-21-(-21)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 35) / 15) * (0-(-21)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 25.25 + (((tickAnim - 15) / 20) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 35) / 15) * (0-(25.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 15) / 20) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 35) / 15) * (0-(7.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.75 + (((tickAnim - 15) / 20) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.75 + (((tickAnim - 35) / 15) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.75 + (((tickAnim - 15) / 20) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 35) / 15) * (0-(3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-6.03-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -6.03 + (((tickAnim - 7) / 8) * (14-(-6.03)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 15) / 20) * (14-(14)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 14 + (((tickAnim - 35) / 3) * (5.14-(14)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 5.14 + (((tickAnim - 38) / 4) * (-0.83-(5.14)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -0.83 + (((tickAnim - 42) / 8) * (0-(-0.83)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (1.84-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 1.84 + (((tickAnim - 38) / 4) * (-5.75-(1.84)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = -5.75 + (((tickAnim - 42) / 2) * (-13.52-(-5.75)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -13.52 + (((tickAnim - 44) / 6) * (0-(-13.52)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaririsuchus entity = (EntityPrehistoricFloraCaririsuchus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 8.75 + (((tickAnim - 3) / 4) * (0.74155-(8.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.43884-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-2.20681-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.74155 + (((tickAnim - 7) / 3) * (-0.50845-(0.74155)));
            yy = 0.43884 + (((tickAnim - 7) / 3) * (0.43884-(0.43884)));
            zz = -2.20681 + (((tickAnim - 7) / 3) * (-2.20681-(-2.20681)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.50845 + (((tickAnim - 10) / 2) * (0-(-0.50845)));
            yy = 0.43884 + (((tickAnim - 10) / 2) * (0-(0.43884)));
            zz = -2.20681 + (((tickAnim - 10) / 2) * (0-(-2.20681)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -15.25 + (((tickAnim - 3) / 4) * (-13.25-(-15.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -13.25 + (((tickAnim - 7) / 3) * (3.75-(-13.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 3.75 + (((tickAnim - 10) / 2) * (0-(3.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.475-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0.475 + (((tickAnim - 3) / 9) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 5 + (((tickAnim - 3) / 4) * (26.5-(5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 26.5 + (((tickAnim - 7) / 1) * (0-(26.5)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaririsuchus entity = (EntityPrehistoricFloraCaririsuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 9.25 + (((tickAnim - 9) / 12) * (0-(9.25)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-2.10163-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (13.37603-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-10.67662-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -2.10163 + (((tickAnim - 9) / 12) * (0-(-2.10163)));
            yy = 13.37603 + (((tickAnim - 9) / 12) * (0-(13.37603)));
            zz = -10.67662 + (((tickAnim - 9) / 12) * (0-(-10.67662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-11.70044-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (4.33969-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (5.82771-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -11.70044 + (((tickAnim - 9) / 12) * (0-(-11.70044)));
            yy = 4.33969 + (((tickAnim - 9) / 12) * (0-(4.33969)));
            zz = 5.82771 + (((tickAnim - 9) / 12) * (0-(5.82771)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = -0.2 + (((tickAnim - 9) / 12) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = -0.5 + (((tickAnim - 9) / 12) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-7.12744-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-15.11468-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (16.87081-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -7.12744 + (((tickAnim - 9) / 12) * (0-(-7.12744)));
            yy = -15.11468 + (((tickAnim - 9) / 12) * (0-(-15.11468)));
            zz = 16.87081 + (((tickAnim - 9) / 12) * (0-(16.87081)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-7.99332-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-5.15756-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-16.02168-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -7.99332 + (((tickAnim - 9) / 12) * (0-(-7.99332)));
            yy = -5.15756 + (((tickAnim - 9) / 12) * (0-(-5.15756)));
            zz = -16.02168 + (((tickAnim - 9) / 12) * (0-(-16.02168)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = -0.2 + (((tickAnim - 9) / 12) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = -0.5 + (((tickAnim - 9) / 12) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 9) / 7) * (2.5-(15)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 2.5 + (((tickAnim - 16) / 3) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -2.5 + (((tickAnim - 19) / 2) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (21.91-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 21.91 + (((tickAnim - 7) / 2) * (9.5-(21.91)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 9.5 + (((tickAnim - 9) / 3) * (11.25-(9.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 11.25 + (((tickAnim - 12) / 4) * (-13.5-(11.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -13.5 + (((tickAnim - 16) / 3) * (-6.75-(-13.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -6.75 + (((tickAnim - 19) / 2) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (16-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16 + (((tickAnim - 8) / 1) * (0-(16)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (14-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 14 + (((tickAnim - 16) / 3) * (0-(14)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaririsuchus entity = (EntityPrehistoricFloraCaririsuchus) entitylivingbaseIn;
        int animCycle = 115;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = 7.5 + (((tickAnim - 35) / 11) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 11) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 7.5 + (((tickAnim - 46) / 14) * (0-(7.5)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 46) {
            xx = 24 + (((tickAnim - 15) / 31) * (24-(24)));
            yy = 0 + (((tickAnim - 15) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 31) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 24 + (((tickAnim - 46) / 14) * (0-(24)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = -21.5 + (((tickAnim - 35) / 11) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 11) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = -21.5 + (((tickAnim - 46) / 7) * (-27.37-(-21.5)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -27.37 + (((tickAnim - 53) / 7) * (0-(-27.37)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.725 + (((tickAnim - 8) / 7) * (0-(0.725)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (47.38-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 47.38 + (((tickAnim - 8) / 7) * (-23.25-(47.38)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.25 + (((tickAnim - 15) / 20) * (-10.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = -10.25 + (((tickAnim - 35) / 11) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 11) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = -10.25 + (((tickAnim - 46) / 7) * (44.43-(-10.25)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 44.43 + (((tickAnim - 53) / 7) * (0-(44.43)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.975-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.125 + (((tickAnim - 8) / 7) * (-0.2-(1.125)));
            zz = -0.975 + (((tickAnim - 8) / 7) * (0-(-0.975)));
        }
        else if (tickAnim >= 15 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 15) / 31) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 31) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 15) / 31) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 7) * (0.525-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (-0.85-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0.525 + (((tickAnim - 53) / 7) * (0-(0.525)));
            zz = -0.85 + (((tickAnim - 53) / 7) * (0-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (-14-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = -14 + (((tickAnim - 35) / 11) * (-14-(-14)));
            yy = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 11) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = -14 + (((tickAnim - 46) / 14) * (0-(-14)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (-11-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = -11 + (((tickAnim - 35) / 11) * (-11-(-11)));
            yy = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 11) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = -11 + (((tickAnim - 46) / 14) * (0-(-11)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (17-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = 17 + (((tickAnim - 35) / 11) * (17-(17)));
            yy = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 11) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 17 + (((tickAnim - 46) / 14) * (0-(17)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4.25 + (((tickAnim - 15) / 20) * (12-(4.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 12 + (((tickAnim - 35) / 7) * (16-(12)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 16 + (((tickAnim - 42) / 4) * (16-(16)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 16 + (((tickAnim - 46) / 14) * (-2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*-8-(16)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = -2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*-8 + (((tickAnim - 60) / 16) * (-7.25-(-2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*-8)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = -7.25 + (((tickAnim - 76) / 7) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 7) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = -7.25 + (((tickAnim - 83) / 4) * (-8.5-(-7.25)));
            yy = 0 + (((tickAnim - 83) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 4) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 90) {
            xx = -8.5 + (((tickAnim - 87) / 3) * (-7.25-(-8.5)));
            yy = 0 + (((tickAnim - 87) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 3) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = -7.25 + (((tickAnim - 90) / 3) * (-8.5-(-7.25)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = -8.5 + (((tickAnim - 93) / 4) * (-7.25-(-8.5)));
            yy = 0 + (((tickAnim - 93) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 4) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = -7.25 + (((tickAnim - 97) / 6) * (-8.5-(-7.25)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 115) {
            xx = -8.5 + (((tickAnim - 103) / 12) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 103) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.25 + (((tickAnim - 15) / 20) * (16-(11.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 16 + (((tickAnim - 35) / 3) * (12.38-(16)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 12.38 + (((tickAnim - 38) / 4) * (11.25-(12.38)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 11.25 + (((tickAnim - 42) / 3) * (9.75-(11.25)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 9.75 + (((tickAnim - 45) / 4) * (11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-7-(9.75)));
            yy = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 76) {
            xx = 11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-7 + (((tickAnim - 49) / 27) * (-6.75-(11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-7)));
            yy = 0 + (((tickAnim - 49) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 27) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = -6.75 + (((tickAnim - 76) / 7) * (-11.75-(-6.75)));
            yy = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 7) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = -11.75 + (((tickAnim - 83) / 4) * (-9.5-(-11.75)));
            yy = 0 + (((tickAnim - 83) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 4) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 90) {
            xx = -9.5 + (((tickAnim - 87) / 3) * (-11.75-(-9.5)));
            yy = 0 + (((tickAnim - 87) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 3) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = -11.75 + (((tickAnim - 90) / 3) * (-9.5-(-11.75)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = -9.5 + (((tickAnim - 93) / 4) * (-11.75-(-9.5)));
            yy = 0 + (((tickAnim - 93) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 4) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = -11.75 + (((tickAnim - 97) / 6) * (-8.5-(-11.75)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 115) {
            xx = -8.5 + (((tickAnim - 103) / 12) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 103) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 63) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 20) * (0.4-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 83) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 14) * (0-(0)));
            zz = 0.4 + (((tickAnim - 83) / 14) * (0.4-(0.4)));
        }
        else if (tickAnim >= 97 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 97) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 18) * (0-(0)));
            zz = 0.4 + (((tickAnim - 97) / 18) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (5.41532-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0.94627-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0.2224-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 68) {
            xx = 5.41532 + (((tickAnim - 46) / 22) * (-1.58468-(5.41532)));
            yy = 0.94627 + (((tickAnim - 46) / 22) * (0.94627-(0.94627)));
            zz = 0.2224 + (((tickAnim - 46) / 22) * (0.2224-(0.2224)));
        }
        else if (tickAnim >= 68 && tickAnim < 93) {
            xx = -1.58468 + (((tickAnim - 68) / 25) * (-5.55249-(-1.58468)));
            yy = 0.94627 + (((tickAnim - 68) / 25) * (0.94627-(0.94627)));
            zz = 0.2224 + (((tickAnim - 68) / 25) * (0.2224-(0.2224)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = -5.55249 + (((tickAnim - 93) / 9) * (-1.79037-(-5.55249)));
            yy = 0.94627 + (((tickAnim - 93) / 9) * (0.56075-(0.94627)));
            zz = 0.2224 + (((tickAnim - 93) / 9) * (0.13179-(0.2224)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = -1.79037 + (((tickAnim - 102) / 13) * (0-(-1.79037)));
            yy = 0.56075 + (((tickAnim - 102) / 13) * (0-(0.56075)));
            zz = 0.13179 + (((tickAnim - 102) / 13) * (0-(0.13179)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 68) {
            xx = 7.5 + (((tickAnim - 46) / 22) * (16.25-(7.5)));
            yy = 0 + (((tickAnim - 46) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 22) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 93) {
            xx = 16.25 + (((tickAnim - 68) / 25) * (9.5-(16.25)));
            yy = 0 + (((tickAnim - 68) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 25) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = 9.5 + (((tickAnim - 93) / 9) * (12.63-(9.5)));
            yy = 0 + (((tickAnim - 93) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 9) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = 12.63 + (((tickAnim - 102) / 13) * (0-(12.63)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 68) {
            xx = -15.75 + (((tickAnim - 46) / 22) * (-2.75-(-15.75)));
            yy = 0 + (((tickAnim - 46) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 22) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = -2.75 + (((tickAnim - 68) / 10) * (-3.3-(-2.75)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = -3.3 + (((tickAnim - 78) / 15) * (-12.25-(-3.3)));
            yy = 0 + (((tickAnim - 78) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 15) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = -12.25 + (((tickAnim - 93) / 9) * (-17.76-(-12.25)));
            yy = 0 + (((tickAnim - 93) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 9) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = -17.76 + (((tickAnim - 102) / 13) * (0-(-17.76)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = -21.5 + (((tickAnim - 46) / 10) * (-21.45-(-21.5)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 68) {
            xx = -21.45 + (((tickAnim - 56) / 12) * (-0.75-(-21.45)));
            yy = 0 + (((tickAnim - 56) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 12) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = -0.75 + (((tickAnim - 68) / 10) * (4-(-0.75)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = 4 + (((tickAnim - 78) / 15) * (-20.75-(4)));
            yy = 0 + (((tickAnim - 78) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 15) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = -20.75 + (((tickAnim - 93) / 9) * (-21.05-(-20.75)));
            yy = 0 + (((tickAnim - 93) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 9) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = -21.05 + (((tickAnim - 102) / 13) * (0-(-21.05)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animStand(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaririsuchus entity = (EntityPrehistoricFloraCaririsuchus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -0.5 + (((tickAnim - 10) / 9) * (-1.5-(-0.5)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -1.5 + (((tickAnim - 19) / 9) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -4.5 + (((tickAnim - 10) / 9) * (-6.75-(-4.5)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -6.75 + (((tickAnim - 19) / 9) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 21.25 + (((tickAnim - 10) / 9) * (26.5-(21.25)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 26.5 + (((tickAnim - 19) / 5) * (0-(26.5)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (0.4-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 10) / 9) * (1-(1)));
            yy = 0.4 + (((tickAnim - 10) / 9) * (0.095-(0.4)));
            zz = 1 + (((tickAnim - 10) / 9) * (1-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 19) / 5) * (1-(1)));
            yy = 0.095 + (((tickAnim - 19) / 5) * (1-(0.095)));
            zz = 1 + (((tickAnim - 19) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCaririsuchus entity = (EntityPrehistoricFloraCaririsuchus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*4), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.125+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-55))*-0.55);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 26.75269 + (((tickAnim - 0) / 5) * (3.35024-(26.75269)));
            yy = 2.2458 + (((tickAnim - 0) / 5) * (-3.87902-(2.2458)));
            zz = 0.13743 + (((tickAnim - 0) / 5) * (0.97708-(0.13743)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.35024 + (((tickAnim - 5) / 5) * (-17.25-(3.35024)));
            yy = -3.87902 + (((tickAnim - 5) / 5) * (0-(-3.87902)));
            zz = 0.97708 + (((tickAnim - 5) / 5) * (0-(0.97708)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -17.25 + (((tickAnim - 10) / 15) * (26.75269-(-17.25)));
            yy = 0 + (((tickAnim - 10) / 15) * (2.2458-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0.13743-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.75 + (((tickAnim - 0) / 3) * (15.47-(22.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 15.47 + (((tickAnim - 3) / 5) * (-15.4-(15.47)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15.4 + (((tickAnim - 8) / 2) * (-16.5-(-15.4)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -16.5 + (((tickAnim - 10) / 15) * (22.75-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.615-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.015-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.615 + (((tickAnim - 5) / 3) * (1.555-(1.615)));
            zz = 0.015 + (((tickAnim - 5) / 3) * (0.055-(0.015)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.555 + (((tickAnim - 8) / 2) * (-0.2-(1.555)));
            zz = 0.055 + (((tickAnim - 8) / 2) * (0.425-(0.055)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 15) * (0-(-0.2)));
            zz = 0.425 + (((tickAnim - 10) / 15) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.75 + (((tickAnim - 0) / 3) * (81.63-(29.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 81.63 + (((tickAnim - 3) / 2) * (40.14-(81.63)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 40.14 + (((tickAnim - 5) / 5) * (41.75-(40.14)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 41.75 + (((tickAnim - 10) / 3) * (19.49-(41.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 19.49 + (((tickAnim - 13) / 4) * (-1.03-(19.49)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -1.03 + (((tickAnim - 17) / 4) * (4.84-(-1.03)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 4.84 + (((tickAnim - 21) / 4) * (29.75-(4.84)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.325-(0)));
            zz = 0.425 + (((tickAnim - 0) / 3) * (-0.2-(0.425)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.325 + (((tickAnim - 3) / 0) * (1.73-(1.325)));
            zz = -0.2 + (((tickAnim - 3) / 0) * (0.18-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.73 + (((tickAnim - 3) / 2) * (1.34-(1.73)));
            zz = 0.18 + (((tickAnim - 3) / 2) * (0.365-(0.18)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.34 + (((tickAnim - 5) / 3) * (0.775-(1.34)));
            zz = 0.365 + (((tickAnim - 5) / 3) * (0-(0.365)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 2) * (-0.2-(0.775)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 6) * (0.385-(-0.2)));
            zz = 0 + (((tickAnim - 10) / 6) * (0.18-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.385 + (((tickAnim - 16) / 7) * (0-(0.385)));
            zz = 0.18 + (((tickAnim - 16) / 7) * (0.595-(0.18)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0.595 + (((tickAnim - 23) / 2) * (0.425-(0.595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+120))*4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*2));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-55))*-0.07);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*4), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+140))*-4), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-5));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -31.25 + (((tickAnim - 0) / 11) * (50.29355-(-31.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (7.5524-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-5.2112-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 50.29355 + (((tickAnim - 11) / 7) * (9.54593-(50.29355)));
            yy = 7.5524 + (((tickAnim - 11) / 7) * (8.15499-(7.5524)));
            zz = -5.2112 + (((tickAnim - 11) / 7) * (-9.33837-(-5.2112)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 9.54593 + (((tickAnim - 18) / 7) * (-31.25-(9.54593)));
            yy = 8.15499 + (((tickAnim - 18) / 7) * (0-(8.15499)));
            zz = -9.33837 + (((tickAnim - 18) / 7) * (0-(-9.33837)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0.4 + (((tickAnim - 11) / 14) * (0-(0.4)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 23 + (((tickAnim - 0) / 11) * (4-(23)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 11) / 2) * (12.27-(4)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 12.27 + (((tickAnim - 13) / 5) * (-7.29-(12.27)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -7.29 + (((tickAnim - 18) / 4) * (-9.85-(-7.29)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -9.85 + (((tickAnim - 22) / 3) * (23-(-9.85)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 11) * (0.425-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 11) / 2) * (0.755-(0.425)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.755 + (((tickAnim - 13) / 5) * (0.65-(0.755)));
            zz = 0.175 + (((tickAnim - 13) / 5) * (0-(0.175)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.65 + (((tickAnim - 18) / 7) * (-0.15-(0.65)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.5 + (((tickAnim - 0) / 5) * (-15.93-(9.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15.93 + (((tickAnim - 5) / 3) * (-1.11-(-15.93)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -1.11 + (((tickAnim - 8) / 3) * (46.75-(-1.11)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 46.75 + (((tickAnim - 11) / 2) * (80.18-(46.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 80.18 + (((tickAnim - 13) / 5) * (69.47-(80.18)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 69.47 + (((tickAnim - 18) / 4) * (62.15-(69.47)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 62.15 + (((tickAnim - 22) / 3) * (9.5-(62.15)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 3) / 2) * (0-(0.7)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0.425-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (-0.775-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 11) / 2) * (0.13-(0.425)));
            zz = -0.775 + (((tickAnim - 11) / 2) * (-0.94-(-0.775)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.13 + (((tickAnim - 13) / 3) * (1.035-(0.13)));
            zz = -0.94 + (((tickAnim - 13) / 3) * (-1.24-(-0.94)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.035 + (((tickAnim - 16) / 2) * (1.095-(1.035)));
            zz = -1.24 + (((tickAnim - 16) / 2) * (-1.435-(-1.24)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.095 + (((tickAnim - 18) / 4) * (0.78-(1.095)));
            zz = -1.435 + (((tickAnim - 18) / 4) * (-1.115-(-1.435)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.78 + (((tickAnim - 22) / 3) * (0-(0.78)));
            zz = -1.115 + (((tickAnim - 22) / 3) * (0-(-1.115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 39.54355 + (((tickAnim - 0) / 13) * (-30.5-(39.54355)));
            yy = -7.55238 + (((tickAnim - 0) / 13) * (0-(-7.55238)));
            zz = 5.21118 + (((tickAnim - 0) / 13) * (0-(5.21118)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -30.5 + (((tickAnim - 13) / 10) * (47.54355-(-30.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (-7.5524-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (5.2112-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 47.54355 + (((tickAnim - 23) / 2) * (39.54355-(47.54355)));
            yy = -7.5524 + (((tickAnim - 23) / 2) * (-7.55238-(-7.5524)));
            zz = 5.2112 + (((tickAnim - 23) / 2) * (5.21118-(5.2112)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 13) * (0-(0.4)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 23) / 2) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.27 + (((tickAnim - 0) / 5) * (-7.29-(2.27)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -7.29 + (((tickAnim - 5) / 4) * (-5.1-(-7.29)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5.1 + (((tickAnim - 9) / 4) * (22.5-(-5.1)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 13) / 10) * (13.25-(22.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 13.25 + (((tickAnim - 23) / 2) * (2.27-(13.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 3) * (0.485-(0.075)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.485 + (((tickAnim - 3) / 2) * (0.65-(0.485)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.65 + (((tickAnim - 5) / 8) * (-0.15-(0.65)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 10) * (0.425-(-0.15)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 23) / 2) * (0.075-(0.425)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 80.18 + (((tickAnim - 0) / 5) * (69.47-(80.18)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 69.47 + (((tickAnim - 5) / 4) * (70.9-(69.47)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 70.9 + (((tickAnim - 9) / 4) * (9.5-(70.9)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 9.5 + (((tickAnim - 13) / 4) * (-15.87-(9.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15.87 + (((tickAnim - 17) / 3) * (-9.53-(-15.87)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -9.53 + (((tickAnim - 20) / 3) * (49.5-(-9.53)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 49.5 + (((tickAnim - 23) / 2) * (80.18-(49.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.205 + (((tickAnim - 0) / 3) * (1.305-(0.205)));
            zz = -1.415 + (((tickAnim - 0) / 3) * (-1.42-(-1.415)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.305 + (((tickAnim - 3) / 2) * (1.07-(1.305)));
            zz = -1.42 + (((tickAnim - 3) / 2) * (-1.435-(-1.42)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.07 + (((tickAnim - 5) / 4) * (0.68-(1.07)));
            zz = -1.435 + (((tickAnim - 5) / 4) * (-1.465-(-1.435)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.68 + (((tickAnim - 9) / 4) * (-0.025-(0.68)));
            zz = -1.465 + (((tickAnim - 9) / 4) * (0-(-1.465)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 13) / 3) * (0.39-(-0.025)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.39 + (((tickAnim - 16) / 7) * (-0.1-(0.39)));
            zz = -0.25 + (((tickAnim - 16) / 7) * (-0.775-(-0.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 23) / 2) * (0.205-(-0.1)));
            zz = -0.775 + (((tickAnim - 23) / 2) * (-1.415-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+160))*4.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+250))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*2.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*2.5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+200))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3.5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*1.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -4.75 + (((tickAnim - 0) / 10) * (24.50963-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.24206-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.25993-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 24.50963 + (((tickAnim - 10) / 7) * (0.82306-(24.50963)));
            yy = -4.24206 + (((tickAnim - 10) / 7) * (3.43901-(-4.24206)));
            zz = -0.25993 + (((tickAnim - 10) / 7) * (-1.60274-(-0.25993)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0.82306 + (((tickAnim - 17) / 5) * (-12.25-(0.82306)));
            yy = 3.43901 + (((tickAnim - 17) / 5) * (0-(3.43901)));
            zz = -1.60274 + (((tickAnim - 17) / 5) * (0-(-1.60274)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -12.25 + (((tickAnim - 22) / 3) * (-4.75-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -11.25 + (((tickAnim - 0) / 9) * (27-(-11.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 27 + (((tickAnim - 9) / 3) * (17.47-(27)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 17.47 + (((tickAnim - 12) / 7) * (-15.4-(17.47)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -15.4 + (((tickAnim - 19) / 3) * (-16-(-15.4)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -16 + (((tickAnim - 22) / 3) * (-11.25-(-16)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 9) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 8) * (1.615-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0.015-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.615 + (((tickAnim - 17) / 2) * (1.555-(1.615)));
            zz = 0.015 + (((tickAnim - 17) / 2) * (0.055-(0.015)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.555 + (((tickAnim - 19) / 3) * (-0.075-(1.555)));
            zz = 0.055 + (((tickAnim - 19) / 3) * (0-(0.055)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 22) / 3) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.25 + (((tickAnim - 0) / 3) * (-3.62-(15.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -3.62 + (((tickAnim - 3) / 3) * (12.56-(-3.62)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 12.56 + (((tickAnim - 6) / 3) * (29.75-(12.56)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 29.75 + (((tickAnim - 9) / 3) * (81.63-(29.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 81.63 + (((tickAnim - 12) / 4) * (40.14-(81.63)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 40.14 + (((tickAnim - 16) / 6) * (37.25-(40.14)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 37.25 + (((tickAnim - 22) / 3) * (15.25-(37.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 3) * (-0.035-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.17-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.035 + (((tickAnim - 3) / 6) * (0-(-0.035)));
            zz = 0.17 + (((tickAnim - 3) / 6) * (0.425-(0.17)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (1.325-(0)));
            zz = 0.425 + (((tickAnim - 9) / 3) * (-0.2-(0.425)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.325 + (((tickAnim - 12) / 1) * (1.58-(1.325)));
            zz = -0.2 + (((tickAnim - 12) / 1) * (0.455-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.58 + (((tickAnim - 13) / 3) * (1.34-(1.58)));
            zz = 0.455 + (((tickAnim - 13) / 3) * (0.365-(0.455)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.34 + (((tickAnim - 16) / 3) * (1.1-(1.34)));
            zz = 0.365 + (((tickAnim - 16) / 3) * (0-(0.365)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 19) / 3) * (-0.175-(1.1)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 22) / 3) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);
       

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCaririsuchus entity = (EntityPrehistoricFloraCaririsuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.57467 + (((tickAnim - 0) / 5) * (38.17533-(-15.57467)));
            yy = -13.4554 + (((tickAnim - 0) / 5) * (-13.4554-(-13.4554)));
            zz = -2.1789 + (((tickAnim - 0) / 5) * (-2.1789-(-2.1789)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 38.17533 + (((tickAnim - 5) / 4) * (-24.68182-(38.17533)));
            yy = -13.4554 + (((tickAnim - 5) / 4) * (-13.4554-(-13.4554)));
            zz = -2.1789 + (((tickAnim - 5) / 4) * (-2.1789-(-2.1789)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -24.68182 + (((tickAnim - 9) / 2) * (-15.57467-(-24.68182)));
            yy = -13.4554 + (((tickAnim - 9) / 2) * (-13.4554-(-13.4554)));
            zz = -2.1789 + (((tickAnim - 9) / 2) * (-2.1789-(-2.1789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -16 + (((tickAnim - 0) / 4) * (12.75-(-16)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 12.75 + (((tickAnim - 4) / 3) * (-21.32-(12.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -21.32 + (((tickAnim - 7) / 4) * (-16-(-21.32)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 7) * (1.475-(-0.05)));
            zz = 0.125 + (((tickAnim - 0) / 7) * (0.13-(0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 1.475 + (((tickAnim - 7) / 4) * (-0.05-(1.475)));
            zz = 0.13 + (((tickAnim - 7) / 4) * (0.125-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 29.5 + (((tickAnim - 0) / 2) * (7.08-(29.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 7.08 + (((tickAnim - 2) / 1) * (22.91-(7.08)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22.91 + (((tickAnim - 3) / 2) * (52.5-(22.91)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 52.5 + (((tickAnim - 5) / 1) * (89.74-(52.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 89.74 + (((tickAnim - 6) / 2) * (72.35-(89.74)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 72.35 + (((tickAnim - 8) / 3) * (29.5-(72.35)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 2) * (0.845-(0.025)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.24-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.845 + (((tickAnim - 2) / 1) * (1.475-(0.845)));
            zz = 0.24 + (((tickAnim - 2) / 1) * (0.905-(0.24)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.475 + (((tickAnim - 3) / 2) * (0.745-(1.475)));
            zz = 0.905 + (((tickAnim - 3) / 2) * (0.1-(0.905)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.745 + (((tickAnim - 5) / 1) * (1.725-(0.745)));
            zz = 0.1 + (((tickAnim - 5) / 1) * (-0.23-(0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.725 + (((tickAnim - 6) / 1) * (2.895-(1.725)));
            zz = -0.23 + (((tickAnim - 6) / 1) * (0.15-(-0.23)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.895 + (((tickAnim - 7) / 1) * (2.55-(2.895)));
            zz = 0.15 + (((tickAnim - 7) / 1) * (0.13-(0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 2.55 + (((tickAnim - 8) / 3) * (0.025-(2.55)));
            zz = 0.13 + (((tickAnim - 8) / 3) * (0-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.57467 + (((tickAnim - 0) / 5) * (42.42533-(-15.57467)));
            yy = 13.4554 + (((tickAnim - 0) / 5) * (13.4554-(13.4554)));
            zz = 2.1789 + (((tickAnim - 0) / 5) * (2.1789-(2.1789)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 42.42533 + (((tickAnim - 5) / 4) * (-24.93182-(42.42533)));
            yy = 13.4554 + (((tickAnim - 5) / 4) * (13.4554-(13.4554)));
            zz = 2.1789 + (((tickAnim - 5) / 4) * (2.1789-(2.1789)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -24.93182 + (((tickAnim - 9) / 2) * (-15.57467-(-24.93182)));
            yy = 13.4554 + (((tickAnim - 9) / 2) * (13.4554-(13.4554)));
            zz = 2.1789 + (((tickAnim - 9) / 2) * (2.1789-(2.1789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -16 + (((tickAnim - 0) / 4) * (12.75-(-16)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 12.75 + (((tickAnim - 4) / 3) * (-21.32-(12.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -21.32 + (((tickAnim - 7) / 4) * (-16-(-21.32)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 7) * (1.475-(-0.05)));
            zz = 0.125 + (((tickAnim - 0) / 7) * (0.13-(0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 1.475 + (((tickAnim - 7) / 4) * (-0.05-(1.475)));
            zz = 0.13 + (((tickAnim - 7) / 4) * (0.125-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 29.5 + (((tickAnim - 0) / 2) * (7.08-(29.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 7.08 + (((tickAnim - 2) / 1) * (22.91-(7.08)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22.91 + (((tickAnim - 3) / 2) * (52.5-(22.91)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 52.5 + (((tickAnim - 5) / 1) * (89.74-(52.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 89.74 + (((tickAnim - 6) / 2) * (72.35-(89.74)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 72.35 + (((tickAnim - 8) / 3) * (29.5-(72.35)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 2) * (0.845-(0.025)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.24-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.845 + (((tickAnim - 2) / 1) * (1.475-(0.845)));
            zz = 0.24 + (((tickAnim - 2) / 1) * (0.905-(0.24)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.475 + (((tickAnim - 3) / 2) * (0.745-(1.475)));
            zz = 0.905 + (((tickAnim - 3) / 2) * (0.1-(0.905)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.745 + (((tickAnim - 5) / 1) * (1.725-(0.745)));
            zz = 0.1 + (((tickAnim - 5) / 1) * (-0.23-(0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.725 + (((tickAnim - 6) / 1) * (2.895-(1.725)));
            zz = -0.23 + (((tickAnim - 6) / 1) * (0.15-(-0.23)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.895 + (((tickAnim - 7) / 1) * (2.55-(2.895)));
            zz = 0.15 + (((tickAnim - 7) / 1) * (0.13-(0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 2.55 + (((tickAnim - 8) / 3) * (0.025-(2.55)));
            zz = 0.13 + (((tickAnim - 8) / 3) * (0-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 42.70546 + (((tickAnim - 0) / 3) * (8.48084-(42.70546)));
            yy = -3.42012 + (((tickAnim - 0) / 3) * (9.54401-(-3.42012)));
            zz = 1.53908 + (((tickAnim - 0) / 3) * (-17.65519-(1.53908)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 8.48084 + (((tickAnim - 3) / 3) * (-34.25-(8.48084)));
            yy = 9.54401 + (((tickAnim - 3) / 3) * (0-(9.54401)));
            zz = -17.65519 + (((tickAnim - 3) / 3) * (0-(-17.65519)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -34.25 + (((tickAnim - 6) / 5) * (42.70546-(-34.25)));
            yy = 0 + (((tickAnim - 6) / 5) * (-3.42012-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (1.53908-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 6) * (0-(0.6)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0.6-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 20.75 + (((tickAnim - 0) / 1) * (35.92-(20.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 35.92 + (((tickAnim - 1) / 2) * (-9.1-(35.92)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -9.1 + (((tickAnim - 3) / 2) * (-9.57-(-9.1)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -9.57 + (((tickAnim - 5) / 1) * (27.75-(-9.57)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 27.75 + (((tickAnim - 6) / 5) * (20.75-(27.75)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 1) / 1) * (0.64-(0.275)));
            zz = 0 + (((tickAnim - 1) / 1) * (0.075-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.64 + (((tickAnim - 2) / 1) * (0.705-(0.64)));
            zz = 0.075 + (((tickAnim - 2) / 1) * (0-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.705 + (((tickAnim - 3) / 3) * (0.7-(0.705)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 6) / 2) * (0.55-(0.7)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 8) / 3) * (0-(0.55)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 58.25 + (((tickAnim - 0) / 1) * (78.88-(58.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 78.88 + (((tickAnim - 1) / 2) * (84.18-(78.88)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 84.18 + (((tickAnim - 3) / 2) * (76.04-(84.18)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 76.04 + (((tickAnim - 5) / 1) * (-4-(76.04)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -4 + (((tickAnim - 6) / 1) * (-19.96-(-4)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -19.96 + (((tickAnim - 7) / 1) * (-37.87-(-19.96)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -37.87 + (((tickAnim - 8) / 0) * (-25.03-(-37.87)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -25.03 + (((tickAnim - 8) / 3) * (58.25-(-25.03)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.675-(0)));
            zz = -0.875 + (((tickAnim - 0) / 1) * (-1.355-(-0.875)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.675 + (((tickAnim - 1) / 1) * (1.015-(0.675)));
            zz = -1.355 + (((tickAnim - 1) / 1) * (-1.37-(-1.355)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.015 + (((tickAnim - 2) / 1) * (0.41-(1.015)));
            zz = -1.37 + (((tickAnim - 2) / 1) * (-1.385-(-1.37)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 2) * (0.27-(0.41)));
            zz = -1.385 + (((tickAnim - 3) / 2) * (-1.42-(-1.385)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.27 + (((tickAnim - 5) / 1) * (-0.075-(0.27)));
            zz = -1.42 + (((tickAnim - 5) / 1) * (0-(-1.42)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = -0.075 + (((tickAnim - 6) / 1) * (0.8-(-0.075)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.8 + (((tickAnim - 7) / 1) * (0.745-(0.8)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.745 + (((tickAnim - 8) / 0) * (1.43-(0.745)));
            zz = -0.125 + (((tickAnim - 8) / 0) * (-0.09-(-0.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.43 + (((tickAnim - 8) / 3) * (0-(1.43)));
            zz = -0.09 + (((tickAnim - 8) / 3) * (-0.875-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 42.68478 + (((tickAnim - 0) / 3) * (3.80945-(42.68478)));
            yy = 4.10094 + (((tickAnim - 0) / 3) * (-5.24285-(4.10094)));
            zz = -1.85439 + (((tickAnim - 0) / 3) * (13.60969-(-1.85439)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.80945 + (((tickAnim - 3) / 2) * (-34.25-(3.80945)));
            yy = -5.24285 + (((tickAnim - 3) / 2) * (0-(-5.24285)));
            zz = 13.60969 + (((tickAnim - 3) / 2) * (0-(13.60969)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -34.25 + (((tickAnim - 5) / 6) * (42.68478-(-34.25)));
            yy = 0 + (((tickAnim - 5) / 6) * (4.10094-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (-1.85439-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 5) * (0-(0.6)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0.6-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 20.75 + (((tickAnim - 0) / 1) * (35.92-(20.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 35.92 + (((tickAnim - 1) / 2) * (-9.1-(35.92)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -9.1 + (((tickAnim - 3) / 0) * (-4.07-(-9.1)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.07 + (((tickAnim - 3) / 2) * (27.75-(-4.07)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 27.75 + (((tickAnim - 5) / 6) * (20.75-(27.75)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 1) / 1) * (0.64-(0.275)));
            zz = 0 + (((tickAnim - 1) / 1) * (0.075-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.64 + (((tickAnim - 2) / 1) * (0.705-(0.64)));
            zz = 0.075 + (((tickAnim - 2) / 1) * (0-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.705 + (((tickAnim - 3) / 2) * (0-(0.705)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.375-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 6) / 5) * (0-(0.375)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 58.25 + (((tickAnim - 0) / 1) * (78.88-(58.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 78.88 + (((tickAnim - 1) / 2) * (84.18-(78.88)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 84.18 + (((tickAnim - 3) / 0) * (76.04-(84.18)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 76.04 + (((tickAnim - 3) / 2) * (42.5-(76.04)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 42.5 + (((tickAnim - 5) / 1) * (-20.46-(42.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.46 + (((tickAnim - 6) / 2) * (-49.53-(-20.46)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -49.53 + (((tickAnim - 8) / 1) * (-11.39-(-49.53)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -11.39 + (((tickAnim - 9) / 2) * (58.25-(-11.39)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.675-(0)));
            zz = -0.875 + (((tickAnim - 0) / 1) * (-1.355-(-0.875)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.675 + (((tickAnim - 1) / 1) * (1.015-(0.675)));
            zz = -1.355 + (((tickAnim - 1) / 1) * (-1.37-(-1.355)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.015 + (((tickAnim - 2) / 1) * (0.41-(1.015)));
            zz = -1.37 + (((tickAnim - 2) / 1) * (-1.385-(-1.37)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 0) * (0.27-(0.41)));
            zz = -1.385 + (((tickAnim - 3) / 0) * (-1.42-(-1.385)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.27 + (((tickAnim - 3) / 2) * (0-(0.27)));
            zz = -1.42 + (((tickAnim - 3) / 2) * (-0.725-(-1.42)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.45-(0)));
            zz = -0.725 + (((tickAnim - 5) / 1) * (-0.25-(-0.725)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 6) / 2) * (0.2-(0.45)));
            zz = -0.25 + (((tickAnim - 6) / 2) * (0.24-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 1) * (0.575-(0.2)));
            zz = 0.24 + (((tickAnim - 8) / 1) * (-0.32-(0.24)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 9) / 2) * (0-(0.575)));
            zz = -0.32 + (((tickAnim - 9) / 2) * (-0.875-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-40))*-6), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-10))*-1.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664+35))*1.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-20))*-8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-80))*0.1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-100))*8), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0.125);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-180))*6), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-20))*15), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.4);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-310))*8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-100))*-6), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-140))*-6), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-180))*-9), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*664-200))*-9), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCaririsuchus e = (EntityPrehistoricFloraCaririsuchus) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(5);
            //animator.move(this.neck, 0,0,-2F);
            animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
            //animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(5);
            animator.resetKeyframe(10);

    }
}
