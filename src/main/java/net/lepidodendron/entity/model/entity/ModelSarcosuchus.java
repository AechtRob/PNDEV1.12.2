package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSarcosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSarcosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backleftleg4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
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
    private final AdvancedModelRenderer poach;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer poach2;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer poach3;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer tail7;

    private ModelAnimator animator;

    public ModelSarcosuchus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.5F, 12.3F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(-0.5F, -7.25F, 27.0F);
        this.root.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -2.75F, -3.45F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 211, -4.0F, -0.8F, 0.3F, 9, 1, 10, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -2.0F, -3.5F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 85, 105, -4.0F, -0.8F, 0.3F, 9, 1, 10, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 165, 70, -6.0F, 0.0F, -0.5F, 13, 12, 11, 0.001F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-4.0F, 4.3F, 1.0F);
        this.hips.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.2686F, 0.4968F, 1.0178F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 108, 0, -3.5F, -1.0F, -3.5F, 8, 12, 7, 0.0F, true));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.0F, 10.0F, -3.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.7559F, 0.0738F, -0.9991F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 0, 128, -2.5F, 0.0F, -0.5F, 6, 12, 5, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.5F, 10.75F, 4.75F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.1745F, 0.0F, -0.0349F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 131, 133, -4.0F, -0.5F, -5.5F, 8, 3, 5, 0.0F, true));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(0.0F, -0.5F, -4.5F);
        this.backrightleg3.addChild(backrightleg4);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 166, 196, -4.5F, 0.0F, -7.0F, 9, 3, 7, -0.01F, true));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(4.0F, 4.3F, 1.0F);
        this.hips.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.2686F, -0.4968F, -1.0178F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 108, 0, -4.5F, -1.0F, -3.5F, 8, 12, 7, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0F, 10.0F, -3.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.7559F, -0.0738F, 0.9991F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 128, -3.5F, 0.0F, -0.5F, 6, 12, 5, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.5F, 10.75F, 4.75F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.1745F, 0.0F, 0.0349F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 131, 133, -4.0F, -0.5F, -5.5F, 8, 3, 5, 0.0F, false));

        this.backleftleg4 = new AdvancedModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.0F, -0.5F, -4.5F);
        this.backleftleg3.addChild(backleftleg4);
        this.backleftleg4.cubeList.add(new ModelBox(backleftleg4, 166, 196, -4.5F, 0.0F, -7.0F, 9, 3, 7, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 173, 41, -7.5F, -2.0F, -10.0F, 15, 14, 10, 0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 82, 94, -5.5F, -2.75F, -9.0F, 11, 1, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 1, 202, -5.5F, -3.5F, -8.0F, 11, 1, 8, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.25F, -8.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 174, 5, -9.0F, -1.0F, -15.0F, 18, 15, 15, 0.001F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 29, -7.0F, -1.75F, -15.0F, 14, 1, 15, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 185, -7.0F, -2.5F, -15.0F, 14, 1, 15, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.25F, -15.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 84, 204, -8.5F, -2.0F, -7.0F, 17, 14, 9, 0.001F, false));
        this.body3.cubeList.add(new ModelBox(body3, 55, 22, -6.5F, -2.75F, -7.0F, 13, 1, 8, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 1, 177, -6.5F, -3.5F, -7.0F, 13, 1, 7, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, -7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 64, 176, -7.5F, -2.0F, -7.0F, 15, 12, 9, 0.001F, false));
        this.body4.cubeList.add(new ModelBox(body4, 108, 20, -5.5F, -2.75F, -7.0F, 11, 1, 8, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 168, -5.5F, -3.25F, -7.0F, 11, 1, 7, -0.01F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-7.5F, 7.75F, -0.75F);
        this.body4.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.5197F, -0.0171F, 1.2734F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 142, 225, -2.3168F, -2.6178F, -3.2609F, 5, 8, 6, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(1.1832F, 3.8322F, -1.1109F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.4531F, -0.0239F, -1.2072F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 144, 227, -3.0F, -0.9318F, -0.5896F, 5, 8, 4, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 6.2F, 2.2F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.2762F, -0.2906F, -0.2089F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 211, 199, -4.0F, -0.4069F, -5.9398F, 7, 3, 7, 0.0F, true));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(7.5F, 7.75F, -0.75F);
        this.body4.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.5197F, 0.0171F, -1.2734F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 142, 225, -2.6832F, -2.6178F, -3.2609F, 5, 8, 6, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(-1.1832F, 3.8322F, -1.1109F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.4531F, 0.0239F, 1.2072F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 144, 227, -2.0F, -0.9318F, -0.5896F, 5, 8, 4, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 6.2F, 2.2F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.2762F, 0.2906F, 0.2089F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 211, 199, -3.0F, -0.4069F, -5.9398F, 7, 3, 7, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.body4.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 63, 149, -6.5F, -1.75F, -8.0F, 13, 10, 11, 0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 27, 104, -4.5F, -2.55F, -8.0F, 9, 1, 10, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 2, 159, -4.5F, -3.05F, -8.0F, 9, 1, 8, -0.012F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 1.1F, 6.8F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 187, 174, -6.0F, 4.25F, -15.0F, 10, 4, 11, 0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.144F, -7.445F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 108, 67, -6.0F, -2.144F, -5.555F, 12, 4, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 123, 30, -5.0F, -1.144F, -10.555F, 10, 3, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 139, 21, -2.5F, -0.144F, -14.555F, 5, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.5891F, -25.8948F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.7787F, 0.2957F, -0.0775F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 34, -0.7638F, -2.4686F, -0.9108F, 1, 3, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, -0.5109F, -22.9948F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.831F, 0.2957F, -0.0775F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 0, 0.0F, -0.0462F, 0.0692F, 1, 3, 1, -0.001F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, -0.5109F, -22.9948F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.831F, -0.2957F, 0.0775F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 0, -1.0F, -0.0462F, 0.0692F, 1, 3, 1, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, 0.5891F, -25.8948F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.7787F, -0.2957F, 0.0775F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 34, -0.2362F, -2.4686F, -0.9108F, 1, 3, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.3685F, -25.8281F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.8195F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 68, -1.5F, -3.0034F, 0.003F, 4, 3, 1, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 2.2761F, -26.9637F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -3.0063F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 0, 0.5F, -0.4704F, 0.5328F, 1, 1, 0, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 2.2761F, -26.9637F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -2.9191F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 49, -2.5F, -0.5204F, -0.2172F, 1, 1, 1, 0.001F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 29, -0.5F, -0.5204F, -0.2172F, 1, 1, 1, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.95F, 2.3142F, -27.0925F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -3.0075F, -0.0176F, 0.1297F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 29, -0.6F, -0.75F, -0.5F, 1, 2, 1, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.95F, 2.3142F, -27.0925F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -3.0075F, 0.0176F, -0.1297F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 46, -0.4F, -0.75F, -0.5F, 1, 2, 1, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 1.7761F, -27.4637F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -2.3518F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 108, 30, -1.5F, -0.7275F, -2.8642F, 5, 1, 3, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.0726F, -28.4907F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.8195F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 29, -2.5F, -1.9919F, 0.011F, 5, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -1.5435F, -26.0781F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.1214F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 141, 116, -2.5F, -0.1526F, 0.2693F, 6, 3, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 1.781F, -19.555F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1178F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 9, -2.25F, -0.2623F, -0.9995F, 0, 2, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 9, 1.25F, -0.2623F, -0.9995F, 0, 2, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 124, 121, -2.5F, -2.1123F, -6.9995F, 4, 2, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.5372F, 1.856F, -13.4571F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1504F, -0.4437F, 0.3394F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 34, 0.0F, -1.0F, -2.15F, 0, 2, 5, 0.002F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.5F, 1.8106F, -17.1546F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0166F, 0.0052F, 0.3054F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 0.0F, 0.0F, -1.35F, 0, 1, 3, 0.001F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, 1.375F, -22.0356F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.116F, 0.0204F, 0.1733F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.0F, 1.375F, -22.0356F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.116F, -0.0204F, -0.1733F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.0F, 0.0F, -3.5F, 0, 1, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.5F, 1.8106F, -17.1546F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0166F, -0.0052F, -0.3054F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, 0.0F, 0.0F, -1.35F, 0, 1, 3, 0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 1.856F, -14.555F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0175F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 139, 7, -1.5F, -2.0F, -4.0F, 5, 2, 4, 0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, -0.819F, -14.63F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 97, 0, -0.5F, -0.0133F, -4.6652F, 3, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, -2.144F, -10.555F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3054F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 139, 14, -1.5F, 0.025F, -4.275F, 5, 2, 4, -0.001F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.5372F, 1.856F, -13.4571F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1504F, 0.4437F, -0.3394F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 34, 0.0F, -1.0F, -2.15F, 0, 2, 5, 0.002F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-5.0F, 0.856F, -10.555F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.4669F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 94, 138, 0.0F, -1.0F, -6.0F, 3, 2, 6, 0.002F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(5.0F, 0.856F, -10.555F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.4669F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 94, 138, -3.0F, -1.0F, -6.0F, 3, 2, 6, 0.002F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -1.1843F, -2.3914F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 23, 136, -3.5F, -1.25F, -1.8F, 8, 2, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, -2.419F, -7.855F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 135, 39, -2.5F, -0.0048F, 0.0122F, 7, 2, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, -2.144F, -10.555F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1309F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 139, 64, -2.5F, 0.075F, -0.275F, 6, 2, 3, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(3.5F, -1.144F, -8.805F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.1745F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 44, 36, -1.9481F, -1.5079F, -3.7658F, 2, 3, 3, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-3.5F, -1.144F, -8.805F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.1745F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1309F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 44, 36, -0.0512F, -1.6064F, -3.7485F, 2, 3, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.856F, -3.555F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 114, 88, -5.5F, 1.0F, -2.0F, 11, 4, 6, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 122, 55, -5.0F, 1.0F, -7.0F, 10, 3, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 138, 99, -3.0F, -3.0F, -5.75F, 6, 4, 4, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 77, 135, -3.5F, -3.0F, -2.75F, 7, 4, 4, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 113, 138, -2.5F, 1.0F, -11.0F, 5, 2, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 2.9565F, -13.5845F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1265F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 9, -1.0F, -0.825F, -1.4F, 3, 1, 4, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 9, -1.0F, -0.825F, -1.4F, 3, 1, 4, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.75F, 0.7089F, -17.7065F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1178F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 44, 29, 0.0F, -0.7483F, -2.4294F, 0, 1, 5, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 44, 29, 3.5F, -0.7483F, -2.4294F, 0, 1, 5, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-5.0F, 0.0F, -7.0F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.4669F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 46, 0.25F, 0.25F, -5.75F, 0, 1, 4, 0.002F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 68, 61, 0.0F, 1.0F, -6.0F, 3, 2, 6, 0.002F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0F, 1.0F, -11.0F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0175F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 6, 34, -3.25F, -0.75F, -3.725F, 0, 1, 2, 0.001F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 6, 34, 1.25F, -0.75F, -3.725F, 0, 1, 2, 0.001F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 99, 121, -3.5F, 0.0F, -4.0F, 5, 2, 4, 0.001F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, 4.0F, -7.075F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1309F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 83, 67, -2.0F, -1.0F, -4.0F, 6, 1, 4, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0F, 5.0F, -1.7F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1745F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 132, 0, -3.0F, -1.0F, -5.5F, 8, 1, 5, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.0F, 5.0F, 1.0F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.3054F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 117, 78, -3.5F, -1.025F, -3.2F, 9, 2, 7, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(2.5F, 1.025F, -21.75F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1134F, -0.2618F, 0.0218F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 207, 215, -1.0F, -0.9056F, -0.0462F, 1, 2, 2, 0.01F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(2.4F, 0.3133F, -21.1933F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2376F, -0.2401F, 0.2966F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 0, -0.05F, -0.7423F, -0.5615F, 0, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-2.4F, 0.3133F, -21.1933F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.2376F, 0.2401F, -0.2966F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, 0.05F, -0.7423F, -0.5615F, 0, 1, 1, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.75F, 0.6783F, -22.2047F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.4058F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 48, 0, -0.5F, -1.2465F, -0.3588F, 1, 1, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 48, 0, -2.0F, -1.2465F, -0.3588F, 1, 1, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.8368F, 0.087F, -22.1477F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2247F, 0.0432F, -0.3025F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 48, 3, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.8368F, 0.087F, -22.1477F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2247F, -0.0432F, 0.3025F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 48, 11, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 0.925F, -16.0F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.1178F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 48, 0, -1.5F, -0.1123F, -6.7495F, 4, 2, 8, 0.0F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 173, 218, -2.0F, -0.1123F, -6.7495F, 5, 2, 1, 0.01F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-2.5F, 1.025F, -21.75F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1134F, 0.2618F, -0.0218F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 207, 215, 0.0F, -0.9056F, -0.0462F, 1, 2, 2, 0.01F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(5.0F, 0.0F, -7.0F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.4669F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 46, -0.25F, 0.25F, -5.75F, 0, 1, 4, 0.002F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 68, 61, -3.0F, 1.0F, -6.0F, 3, 2, 6, 0.002F, false));

        this.poach = new AdvancedModelRenderer(this);
        this.poach.setRotationPoint(-1.0F, 3.075F, -13.975F);
        this.jaw.addChild(poach);
        this.setRotateAngle(poach, -0.3491F, 0.0F, 0.0F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.5F, 3.9F);
        this.poach.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1309F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 173, 156, -1.0F, -2.0F, -4.0F, 4, 2, 4, -0.01F, false));

        this.poach2 = new AdvancedModelRenderer(this);
        this.poach2.setRotationPoint(0.0F, 0.5F, 3.975F);
        this.poach.addChild(poach2);
        this.setRotateAngle(poach2, 0.1745F, 0.0F, 0.0F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.5F, 3.9F);
        this.poach2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.1309F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 199, 151, -2.0F, -4.0F, -4.0F, 6, 4, 7, -0.01F, false));

        this.poach3 = new AdvancedModelRenderer(this);
        this.poach3.setRotationPoint(0.0F, 0.85F, 6.8F);
        this.poach2.addChild(poach3);
        this.setRotateAngle(poach3, 0.0873F, 0.0F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.5F, 3.9F);
        this.poach3.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1309F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 134, 176, -3.0F, -4.0F, -4.0F, 8, 4, 8, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.6F, 6.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2443F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 165, 99, -5.0F, -1.5316F, -0.9392F, 10, 11, 13, 0.001F, false));
        this.tail.cubeList.add(new ModelBox(tail, 34, 120, 3.0F, -3.5316F, -0.9392F, 0, 2, 13, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 34, 120, -3.0F, -3.5316F, -0.9392F, 0, 2, 13, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.4316F, 11.0608F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 166, 125, -4.0F, 0.0F, 0.0F, 8, 10, 13, 0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 116, 2.5F, -3.0F, 0.0F, 0, 3, 13, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 116, -2.5F, -3.0F, 0.0F, 0, 3, 13, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 11.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1134F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 215, 75, -3.0F, 0.0F, 0.0F, 6, 9, 13, 0.001F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 125, 99, 2.0F, -4.0F, 1.0F, 0, 4, 12, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 125, 99, -2.0F, -4.0F, 1.0F, 0, 4, 12, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.1F, 12.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 93, -2.5F, -0.0872F, -0.9962F, 5, 7, 13, 0.001F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 86, 117, 1.5F, -5.0872F, 0.0038F, 0, 5, 12, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 86, 117, -1.5F, -5.0872F, 0.0038F, 0, 5, 12, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.5129F, 11.0038F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 60, 94, -2.0F, -0.0872F, -0.9962F, 4, 6, 13, 0.001F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 111, 121, 1.0F, -4.0872F, 0.0038F, 0, 4, 12, -0.001F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 111, 121, -1.0F, -4.0872F, 0.0038F, 0, 4, 12, -0.001F, true));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.7628F, 11.0038F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 86, 22, -1.5F, 0.0F, 0.0F, 3, 4, 15, 0.001F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.tail6.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0436F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 110, 103, -1.0F, -3.0F, 0.5F, 0, 3, 14, 0.0F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 110, 103, 0.0F, -3.0F, 0.5F, 0, 3, 14, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 2.5F, 14.5F);
        this.tail6.addChild(tail7);
        this.tail7.cubeList.add(new ModelBox(tail7, 1, 148, -1.0F, -1.5F, 0.25F, 2, 3, 4, 0.0F, false));
        this.tail7.cubeList.add(new ModelBox(tail7, 36, 146, 0.0F, -3.5F, 0.25F, 0, 5, 7, 0.0F, false));


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
        this.root.offsetY = 0.0F;
        this.root.offsetX = 0.4F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.3F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.2F, 4.2F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleX = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.105F;
        this.root.render(0.01F);
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

        EntityPrehistoricFloraSarcosuchus entitySarcosuchus = (EntityPrehistoricFloraSarcosuchus) e;


        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        entitySarcosuchus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySarcosuchus.getAnimation() == entitySarcosuchus.LAY_ANIMATION || entitySarcosuchus.getAnimation() == entitySarcosuchus.STAND_ANIMATION) {
            this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
            this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);

        }
        else {
            if (!entitySarcosuchus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySarcosuchus.getIsMoving()) {
                    if (entitySarcosuchus.getAnimation() != entitySarcosuchus.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySarcosuchus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                this.root.offsetY = 0.3F;
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
//        this.eye.setScale(1,1,1);
//        this.eye2.setScale(1,1,1);

        EntityPrehistoricFloraSarcosuchus ee = (EntityPrehistoricFloraSarcosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else {
            //Swimming pose:
            //moving in water
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


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
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSarcosuchus entity = (EntityPrehistoricFloraSarcosuchus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.16377-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.94969-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.33387-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 12.16377 + (((tickAnim - 5) / 4) * (16.84014-(12.16377)));
            yy = -7.94969 + (((tickAnim - 5) / 4) * (-8.51315-(-7.94969)));
            zz = -0.33387 + (((tickAnim - 5) / 4) * (-3.31117-(-0.33387)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 16.84014 + (((tickAnim - 9) / 7) * (-10.25-(16.84014)));
            yy = -8.51315 + (((tickAnim - 9) / 7) * (0-(-8.51315)));
            zz = -3.31117 + (((tickAnim - 9) / 7) * (0-(-3.31117)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.25 + (((tickAnim - 16) / 3) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.25 + (((tickAnim - 19) / 4) * (-10.19686-(-10.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (-1.53568-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-3.96333-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -10.19686 + (((tickAnim - 23) / 4) * (-15.84843-(-10.19686)));
            yy = -1.53568 + (((tickAnim - 23) / 4) * (-0.76784-(-1.53568)));
            zz = -3.96333 + (((tickAnim - 23) / 4) * (-1.98166-(-3.96333)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -15.84843 + (((tickAnim - 27) / 3) * (-15.34843-(-15.84843)));
            yy = -0.76784 + (((tickAnim - 27) / 3) * (-0.76784-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 27) / 3) * (-1.98166-(-1.98166)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -15.34843 + (((tickAnim - 30) / 5) * (0-(-15.34843)));
            yy = -0.76784 + (((tickAnim - 30) / 5) * (0-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 30) / 5) * (0-(-1.98166)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.89347-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (14.03535-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.75415-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 4.89347 + (((tickAnim - 5) / 4) * (11.48596-(4.89347)));
            yy = 14.03535 + (((tickAnim - 5) / 4) * (17.04317-(14.03535)));
            zz = -2.75415 + (((tickAnim - 5) / 4) * (-1.4762-(-2.75415)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 11.48596 + (((tickAnim - 9) / 3) * (13.28126-(11.48596)));
            yy = 17.04317 + (((tickAnim - 9) / 3) * (9.94947-(17.04317)));
            zz = -1.4762 + (((tickAnim - 9) / 3) * (-5.56616-(-1.4762)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 13.28126 + (((tickAnim - 12) / 2) * (-8.78697-(13.28126)));
            yy = 9.94947 + (((tickAnim - 12) / 2) * (7.5849-(9.94947)));
            zz = -5.56616 + (((tickAnim - 12) / 2) * (-6.92949-(-5.56616)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8.78697 + (((tickAnim - 14) / 4) * (1-(-8.78697)));
            yy = 7.5849 + (((tickAnim - 14) / 4) * (0-(7.5849)));
            zz = -6.92949 + (((tickAnim - 14) / 4) * (0-(-6.92949)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (-19.98527-(1)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.37617-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-4.48428-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.98527 + (((tickAnim - 23) / 4) * (-0.24264-(-19.98527)));
            yy = -0.37617 + (((tickAnim - 23) / 4) * (-0.18808-(-0.37617)));
            zz = -4.48428 + (((tickAnim - 23) / 4) * (-2.24214-(-4.48428)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.24264 + (((tickAnim - 27) / 3) * (-0.24264-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 27) / 3) * (-0.18808-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 27) / 3) * (-2.24214-(-2.24214)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.24264 + (((tickAnim - 30) / 5) * (0-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 30) / 5) * (0-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 30) / 5) * (0-(-2.24214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 13) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 2) * (0.165-(1)));
            zz = 1 + (((tickAnim - 13) / 2) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 15) / 3) * (1-(1)));
            yy = 0.165 + (((tickAnim - 15) / 3) * (1-(0.165)));
            zz = 1 + (((tickAnim - 15) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 13) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 2) * (0.165-(1)));
            zz = 1 + (((tickAnim - 13) / 2) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 15) / 3) * (1-(1)));
            yy = 0.165 + (((tickAnim - 15) / 3) * (1-(0.165)));
            zz = 1 + (((tickAnim - 15) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 17 + (((tickAnim - 5) / 4) * (0-(17)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (19.5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 19.5 + (((tickAnim - 14) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 19.5 + (((tickAnim - 22) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSarcosuchus entity = (EntityPrehistoricFloraSarcosuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (-0.5-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 8) / 2) * (6.25-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 10) / 3) * (0-(6.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.75 + (((tickAnim - 3) / 5) * (-27.09589-(-7.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.5989-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-5.46242-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -27.09589 + (((tickAnim - 8) / 5) * (0-(-27.09589)));
            yy = -1.5989 + (((tickAnim - 8) / 5) * (0-(-1.5989)));
            zz = -5.46242 + (((tickAnim - 8) / 5) * (0-(-5.46242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.25 + (((tickAnim - 3) / 5) * (31-(3.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 8) / 2) * (0-(31)));
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
        EntityPrehistoricFloraSarcosuchus entity = (EntityPrehistoricFloraSarcosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (52.97301-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.91434-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-21.58489-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 52.97301 + (((tickAnim - 20) / 13) * (34.21811-(52.97301)));
            yy = 12.91434 + (((tickAnim - 20) / 13) * (11.96439-(12.91434)));
            zz = -21.58489 + (((tickAnim - 20) / 13) * (-33.92989-(-21.58489)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 34.21811 + (((tickAnim - 33) / 17) * (0-(34.21811)));
            yy = 11.96439 + (((tickAnim - 33) / 17) * (0-(11.96439)));
            zz = -33.92989 + (((tickAnim - 33) / 17) * (0-(-33.92989)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 18 + (((tickAnim - 20) / 6) * (15.78665-(18)));
            yy = 0 + (((tickAnim - 20) / 6) * (6.91247-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (-5.36123-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 15.78665 + (((tickAnim - 26) / 7) * (6.81563-(15.78665)));
            yy = 6.91247 + (((tickAnim - 26) / 7) * (13.25122-(6.91247)));
            zz = -5.36123 + (((tickAnim - 26) / 7) * (-10.27748-(-5.36123)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.81563 + (((tickAnim - 33) / 17) * (0-(6.81563)));
            yy = 13.25122 + (((tickAnim - 33) / 17) * (0-(13.25122)));
            zz = -10.27748 + (((tickAnim - 33) / 17) * (0-(-10.27748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0.65-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (-0.425-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            yy = 0.65 + (((tickAnim - 26) / 24) * (0-(0.65)));
            zz = -0.425 + (((tickAnim - 26) / 24) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (16.48-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 16.48 + (((tickAnim - 9) / 11) * (30.5-(16.48)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 30.5 + (((tickAnim - 20) / 13) * (66.75-(30.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 66.75 + (((tickAnim - 33) / 5) * (12.21253-(66.75)));
            yy = 0 + (((tickAnim - 33) / 5) * (2.58986-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (9.49073-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 12.21253 + (((tickAnim - 38) / 5) * (-8.53388-(12.21253)));
            yy = 2.58986 + (((tickAnim - 38) / 5) * (4.80975-(2.58986)));
            zz = 9.49073 + (((tickAnim - 38) / 5) * (17.62565-(9.49073)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -8.53388 + (((tickAnim - 43) / 7) * (0-(-8.53388)));
            yy = 4.80975 + (((tickAnim - 43) / 7) * (0-(4.80975)));
            zz = 17.62565 + (((tickAnim - 43) / 7) * (0-(17.62565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0.425 + (((tickAnim - 20) / 6) * (2.945-(0.425)));
            zz = 0 + (((tickAnim - 20) / 6) * (-0.97-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 2.945 + (((tickAnim - 26) / 7) * (6.26-(2.945)));
            zz = -0.97 + (((tickAnim - 26) / 7) * (-2.4-(-0.97)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 6.26 + (((tickAnim - 33) / 10) * (1.635-(6.26)));
            zz = -2.4 + (((tickAnim - 33) / 10) * (0.615-(-2.4)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.635 + (((tickAnim - 43) / 7) * (0-(1.635)));
            zz = 0.615 + (((tickAnim - 43) / 7) * (0-(0.615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-38.33-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -38.33 + (((tickAnim - 9) / 11) * (-40-(-38.33)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -40 + (((tickAnim - 20) / 6) * (23.33-(-40)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 23.33 + (((tickAnim - 26) / 7) * (22.5-(23.33)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 33) / 17) * (0-(22.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.765-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.865-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -0.765 + (((tickAnim - 9) / 11) * (-0.75-(-0.765)));
            zz = 0.865 + (((tickAnim - 9) / 11) * (0.85-(0.865)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = -0.75 + (((tickAnim - 20) / 6) * (-0.04-(-0.75)));
            zz = 0.85 + (((tickAnim - 20) / 6) * (0.105-(0.85)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = -0.04 + (((tickAnim - 26) / 7) * (0-(-0.04)));
            zz = 0.105 + (((tickAnim - 26) / 7) * (-0.65-(0.105)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -0.65 + (((tickAnim - 33) / 17) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSarcosuchus entity = (EntityPrehistoricFloraSarcosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.825 + (((tickAnim - 20) / 10) * (-6.825-(-6.825)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -6.825 + (((tickAnim - 30) / 20) * (0-(-6.825)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-25.60841-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.36059-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.54547-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.60841 + (((tickAnim - 20) / 10) * (-25.60841-(-25.60841)));
            yy = 5.36059 + (((tickAnim - 20) / 10) * (5.36059-(5.36059)));
            zz = 6.54547 + (((tickAnim - 20) / 10) * (6.54547-(6.54547)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.60841 + (((tickAnim - 30) / 20) * (0-(-25.60841)));
            yy = 5.36059 + (((tickAnim - 30) / 20) * (0-(5.36059)));
            zz = 6.54547 + (((tickAnim - 30) / 20) * (0-(6.54547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29.54949-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (14.10947-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-8.11649-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.54949 + (((tickAnim - 20) / 10) * (29.54949-(29.54949)));
            yy = 14.10947 + (((tickAnim - 20) / 10) * (14.10947-(14.10947)));
            zz = -8.11649 + (((tickAnim - 20) / 10) * (-8.11649-(-8.11649)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29.54949 + (((tickAnim - 30) / 20) * (0-(29.54949)));
            yy = 14.10947 + (((tickAnim - 30) / 20) * (0-(14.10947)));
            zz = -8.11649 + (((tickAnim - 30) / 20) * (0-(-8.11649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.55552-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.28004-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.73436-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.55552 + (((tickAnim - 20) / 10) * (-15.55552-(-15.55552)));
            yy = 1.28004 + (((tickAnim - 20) / 10) * (1.28004-(1.28004)));
            zz = -6.73436 + (((tickAnim - 20) / 10) * (-6.73436-(-6.73436)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.55552 + (((tickAnim - 30) / 20) * (0-(-15.55552)));
            yy = 1.28004 + (((tickAnim - 30) / 20) * (0-(1.28004)));
            zz = -6.73436 + (((tickAnim - 30) / 20) * (0-(-6.73436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (28.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 28.75 + (((tickAnim - 20) / 10) * (28.75-(28.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 28.75 + (((tickAnim - 30) / 20) * (0-(28.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.57335-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.47676-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-23.78606-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.57335 + (((tickAnim - 20) / 10) * (3.57335-(3.57335)));
            yy = 8.47676 + (((tickAnim - 20) / 10) * (8.47676-(8.47676)));
            zz = -23.78606 + (((tickAnim - 20) / 10) * (-23.78606-(-23.78606)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3.57335 + (((tickAnim - 30) / 20) * (0-(3.57335)));
            yy = 8.47676 + (((tickAnim - 30) / 20) * (0-(8.47676)));
            zz = -23.78606 + (((tickAnim - 30) / 20) * (0-(-23.78606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.525 + (((tickAnim - 20) / 10) * (0.525-(0.525)));
            yy = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            zz = -0.5 + (((tickAnim - 20) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            yy = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
            zz = -0.5 + (((tickAnim - 30) / 20) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 20) / 10) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 30) / 20) * (0-(-13.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 20) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.75 + (((tickAnim - 20) / 10) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 30) / 20) * (0-(5.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.35 + (((tickAnim - 20) / 10) * (-1.35-(-1.35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.35 + (((tickAnim - 30) / 20) * (0-(-1.35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.60841-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.36059-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.54547-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.60841 + (((tickAnim - 20) / 10) * (-25.60841-(-25.60841)));
            yy = -5.36059 + (((tickAnim - 20) / 10) * (-5.36059-(-5.36059)));
            zz = -6.54547 + (((tickAnim - 20) / 10) * (-6.54547-(-6.54547)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.60841 + (((tickAnim - 30) / 20) * (0-(-25.60841)));
            yy = -5.36059 + (((tickAnim - 30) / 20) * (0-(-5.36059)));
            zz = -6.54547 + (((tickAnim - 30) / 20) * (0-(-6.54547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29.54949-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-14.10947-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (8.11649-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.54949 + (((tickAnim - 20) / 10) * (29.54949-(29.54949)));
            yy = -14.10947 + (((tickAnim - 20) / 10) * (-14.10947-(-14.10947)));
            zz = 8.11649 + (((tickAnim - 20) / 10) * (8.11649-(8.11649)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29.54949 + (((tickAnim - 30) / 20) * (0-(29.54949)));
            yy = -14.10947 + (((tickAnim - 30) / 20) * (0-(-14.10947)));
            zz = 8.11649 + (((tickAnim - 30) / 20) * (0-(8.11649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.55552-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.28004-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.73436-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.55552 + (((tickAnim - 20) / 10) * (-15.55552-(-15.55552)));
            yy = -1.28004 + (((tickAnim - 20) / 10) * (-1.28004-(-1.28004)));
            zz = 6.73436 + (((tickAnim - 20) / 10) * (6.73436-(6.73436)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.55552 + (((tickAnim - 30) / 20) * (0-(-15.55552)));
            yy = -1.28004 + (((tickAnim - 30) / 20) * (0-(-1.28004)));
            zz = 6.73436 + (((tickAnim - 30) / 20) * (0-(6.73436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-28.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -28.75 + (((tickAnim - 20) / 10) * (-28.75-(-28.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -28.75 + (((tickAnim - 30) / 20) * (0-(-28.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.35 + (((tickAnim - 20) / 10) * (1.35-(1.35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.35 + (((tickAnim - 30) / 20) * (0-(1.35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.57335-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.47676-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (23.78606-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.57335 + (((tickAnim - 20) / 10) * (3.57335-(3.57335)));
            yy = -8.47676 + (((tickAnim - 20) / 10) * (-8.47676-(-8.47676)));
            zz = 23.78606 + (((tickAnim - 20) / 10) * (23.78606-(23.78606)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3.57335 + (((tickAnim - 30) / 20) * (0-(3.57335)));
            yy = -8.47676 + (((tickAnim - 30) / 20) * (0-(-8.47676)));
            zz = 23.78606 + (((tickAnim - 30) / 20) * (0-(23.78606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.525 + (((tickAnim - 20) / 10) * (0.525-(0.525)));
            yy = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            zz = -0.5 + (((tickAnim - 20) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            yy = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
            zz = -0.5 + (((tickAnim - 30) / 20) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);

    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSarcosuchus entity = (EntityPrehistoricFloraSarcosuchus) entitylivingbaseIn;
        int animCycle = 560;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-8.525-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = -8.525 + (((tickAnim - 30) / 470) * (-8.525-(-8.525)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = -8.525 + (((tickAnim - 500) / 25) * (-8.525-(-8.525)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = -8.525 + (((tickAnim - 525) / 35) * (0-(-8.525)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (31.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -18 + (((tickAnim - 30) / 470) * (-18-(-18)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 31.5 + (((tickAnim - 30) / 470) * (31.5-(31.5)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -18 + (((tickAnim - 500) / 25) * (-18-(-18)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 31.5 + (((tickAnim - 500) / 25) * (31.5-(31.5)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -18 + (((tickAnim - 525) / 35) * (0-(-18)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 31.5 + (((tickAnim - 525) / 35) * (0-(31.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11.61994-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (6.78195-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-4.74239-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 11.61994 + (((tickAnim - 30) / 470) * (11.61994-(11.61994)));
            yy = 6.78195 + (((tickAnim - 30) / 470) * (6.78195-(6.78195)));
            zz = -4.74239 + (((tickAnim - 30) / 470) * (-4.74239-(-4.74239)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 11.61994 + (((tickAnim - 500) / 25) * (11.61994-(11.61994)));
            yy = 6.78195 + (((tickAnim - 500) / 25) * (6.78195-(6.78195)));
            zz = -4.74239 + (((tickAnim - 500) / 25) * (-4.74239-(-4.74239)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 11.61994 + (((tickAnim - 525) / 35) * (0-(11.61994)));
            yy = 6.78195 + (((tickAnim - 525) / 35) * (0-(6.78195)));
            zz = -4.74239 + (((tickAnim - 525) / 35) * (0-(-4.74239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-3.47288-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.92008-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-33.87705-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -3.47288 + (((tickAnim - 30) / 470) * (-3.47288-(-3.47288)));
            yy = -0.92008 + (((tickAnim - 30) / 470) * (-0.92008-(-0.92008)));
            zz = -33.87705 + (((tickAnim - 30) / 470) * (-33.87705-(-33.87705)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -3.47288 + (((tickAnim - 500) / 25) * (-3.47288-(-3.47288)));
            yy = -0.92008 + (((tickAnim - 500) / 25) * (-0.92008-(-0.92008)));
            zz = -33.87705 + (((tickAnim - 500) / 25) * (-33.87705-(-33.87705)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -3.47288 + (((tickAnim - 525) / 35) * (0-(-3.47288)));
            yy = -0.92008 + (((tickAnim - 525) / 35) * (0-(-0.92008)));
            zz = -33.87705 + (((tickAnim - 525) / 35) * (0-(-33.87705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (6.21025-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-14.26639-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (18.6574-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 6.21025 + (((tickAnim - 9) / 14) * (22.98517-(6.21025)));
            yy = -14.26639 + (((tickAnim - 9) / 14) * (-0.1911-(-14.26639)));
            zz = 18.6574 + (((tickAnim - 9) / 14) * (0.16187-(18.6574)));
        }
        else if (tickAnim >= 23 && tickAnim < 500) {
            xx = 22.98517 + (((tickAnim - 23) / 477) * (22.98517-(22.98517)));
            yy = -0.1911 + (((tickAnim - 23) / 477) * (-0.1911-(-0.1911)));
            zz = 0.16187 + (((tickAnim - 23) / 477) * (0.16187-(0.16187)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 22.98517 + (((tickAnim - 500) / 25) * (22.98517-(22.98517)));
            yy = -0.1911 + (((tickAnim - 500) / 25) * (-0.1911-(-0.1911)));
            zz = 0.16187 + (((tickAnim - 500) / 25) * (0.16187-(0.16187)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 22.98517 + (((tickAnim - 525) / 35) * (0-(22.98517)));
            yy = -0.1911 + (((tickAnim - 525) / 35) * (0-(-0.1911)));
            zz = 0.16187 + (((tickAnim - 525) / 35) * (0-(0.16187)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-59.68294-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.29124-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-9.54788-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = -59.68294 + (((tickAnim - 9) / 14) * (-68.21733-(-59.68294)));
            yy = -1.29124 + (((tickAnim - 9) / 14) * (-2.81725-(-1.29124)));
            zz = -9.54788 + (((tickAnim - 9) / 14) * (-20.83173-(-9.54788)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -68.21733 + (((tickAnim - 23) / 7) * (-68.71733-(-68.21733)));
            yy = -2.81725 + (((tickAnim - 23) / 7) * (-2.81725-(-2.81725)));
            zz = -20.83173 + (((tickAnim - 23) / 7) * (-20.83173-(-20.83173)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -68.71733 + (((tickAnim - 30) / 470) * (-68.71733-(-68.71733)));
            yy = -2.81725 + (((tickAnim - 30) / 470) * (-2.81725-(-2.81725)));
            zz = -20.83173 + (((tickAnim - 30) / 470) * (-20.83173-(-20.83173)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -68.71733 + (((tickAnim - 500) / 25) * (-68.71733-(-68.71733)));
            yy = -2.81725 + (((tickAnim - 500) / 25) * (-2.81725-(-2.81725)));
            zz = -20.83173 + (((tickAnim - 500) / 25) * (-20.83173-(-20.83173)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -68.71733 + (((tickAnim - 525) / 35) * (0-(-68.71733)));
            yy = -2.81725 + (((tickAnim - 525) / 35) * (0-(-2.81725)));
            zz = -20.83173 + (((tickAnim - 525) / 35) * (0-(-20.83173)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.9-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = -0.9 + (((tickAnim - 9) / 14) * (-1.275-(-0.9)));
            yy = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 14) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -1.275 + (((tickAnim - 23) / 7) * (-2.37-(-1.275)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -2.37 + (((tickAnim - 30) / 470) * (-2.37-(-2.37)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -2.37 + (((tickAnim - 500) / 25) * (-2.37-(-2.37)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -2.37 + (((tickAnim - 525) / 35) * (0-(-2.37)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (95.18064-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (5.20559-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (8.88593-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 95.18064 + (((tickAnim - 9) / 14) * (67.3032-(95.18064)));
            yy = 5.20559 + (((tickAnim - 9) / 14) * (11.35764-(5.20559)));
            zz = 8.88593 + (((tickAnim - 9) / 14) * (19.38749-(8.88593)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 67.3032 + (((tickAnim - 23) / 7) * (67.3032-(67.3032)));
            yy = 11.35764 + (((tickAnim - 23) / 7) * (11.35764-(11.35764)));
            zz = 19.38749 + (((tickAnim - 23) / 7) * (19.38749-(19.38749)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 67.3032 + (((tickAnim - 30) / 470) * (67.3032-(67.3032)));
            yy = 11.35764 + (((tickAnim - 30) / 470) * (11.35764-(11.35764)));
            zz = 19.38749 + (((tickAnim - 30) / 470) * (19.38749-(19.38749)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 67.3032 + (((tickAnim - 500) / 25) * (67.3032-(67.3032)));
            yy = 11.35764 + (((tickAnim - 500) / 25) * (11.35764-(11.35764)));
            zz = 19.38749 + (((tickAnim - 500) / 25) * (19.38749-(19.38749)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 67.3032 + (((tickAnim - 525) / 35) * (0-(67.3032)));
            yy = 11.35764 + (((tickAnim - 525) / 35) * (0-(11.35764)));
            zz = 19.38749 + (((tickAnim - 525) / 35) * (0-(19.38749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.975-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (1.43-(0)));
            zz = -0.975 + (((tickAnim - 23) / 7) * (-1.975-(-0.975)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 1.43 + (((tickAnim - 30) / 470) * (1.43-(1.43)));
            zz = -1.975 + (((tickAnim - 30) / 470) * (-1.975-(-1.975)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 1.43 + (((tickAnim - 500) / 25) * (1.43-(1.43)));
            zz = -1.975 + (((tickAnim - 500) / 25) * (-1.975-(-1.975)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 1.43 + (((tickAnim - 525) / 35) * (0-(1.43)));
            zz = -1.975 + (((tickAnim - 525) / 35) * (0-(-1.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 89) {
            xx = -11.75 + (((tickAnim - 30) / 59) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 30) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 59) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = -11.75 + (((tickAnim - 89) / 1) * (-14.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*-3-(-11.75)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = -14.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*-3 + (((tickAnim - 90) / 40) * (-15.5-(-14.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*-3)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 500) {
            xx = -15.5 + (((tickAnim - 130) / 370) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 130) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 370) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -15.5 + (((tickAnim - 500) / 25) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -15.5 + (((tickAnim - 525) / 35) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 89) {
            xx = 5.5 + (((tickAnim - 30) / 59) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 30) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 59) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = 5.5 + (((tickAnim - 89) / 1) * (5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-5-(5.5)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = 5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-5 + (((tickAnim - 90) / 40) * (0.75-(5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-5)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 500) {
            xx = 0.75 + (((tickAnim - 130) / 370) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 130) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 370) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 540) {
            xx = 0.75 + (((tickAnim - 500) / 40) * (14.25-(0.75)));
            yy = 0 + (((tickAnim - 500) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 40) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 560) {
            xx = 14.25 + (((tickAnim - 540) / 20) * (0-(14.25)));
            yy = 0 + (((tickAnim - 540) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 34) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 87) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 43) * (0.5-(0)));
            zz = 0 + (((tickAnim - 87) / 43) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 130) / 330) * (0-(0)));
            yy = 0.5 + (((tickAnim - 130) / 330) * (0-(0.5)));
            zz = 0 + (((tickAnim - 130) / 330) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 460) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 40) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eye.rotationPointX = this.eye.rotationPointX + (float)(xx);
        this.eye.rotationPointY = this.eye.rotationPointY - (float)(yy);
        this.eye.rotationPointZ = this.eye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 0) / 53) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 53) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 53) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 1 + (((tickAnim - 53) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 9) * (-0.16-(1)));
            zz = 1 + (((tickAnim - 53) / 9) * (1-(1)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 62) / 8) * (1-(1)));
            yy = -0.16 + (((tickAnim - 62) / 8) * (1-(-0.16)));
            zz = 1 + (((tickAnim - 62) / 8) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 87) {
            xx = 1 + (((tickAnim - 70) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 17) * (1-(1)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 87) / 43) * (1-(1)));
            yy = 1 + (((tickAnim - 87) / 43) * (-0.0375-(1)));
            zz = 1 + (((tickAnim - 87) / 43) * (1-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 448) {
            xx = 1 + (((tickAnim - 130) / 318) * (1-(1)));
            yy = -0.0375 + (((tickAnim - 130) / 318) * (-0.0375-(-0.0375)));
            zz = 1 + (((tickAnim - 130) / 318) * (1-(1)));
        }
        else if (tickAnim >= 448 && tickAnim < 460) {
            xx = 1 + (((tickAnim - 448) / 12) * (1-(1)));
            yy = -0.0375 + (((tickAnim - 448) / 12) * (1-(-0.0375)));
            zz = 1 + (((tickAnim - 448) / 12) * (1-(1)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 1 + (((tickAnim - 460) / 40) * (1-(1)));
            yy = 1 + (((tickAnim - 460) / 40) * (1-(1)));
            zz = 1 + (((tickAnim - 460) / 40) * (1-(1)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 1 + (((tickAnim - 500) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 500) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 500) / 25) * (1-(1)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 1 + (((tickAnim - 525) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 525) / 35) * (1-(1)));
            zz = 1 + (((tickAnim - 525) / 35) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 34) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 87) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 43) * (0.5-(0)));
            zz = 0 + (((tickAnim - 87) / 43) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 130) / 330) * (0-(0)));
            yy = 0.5 + (((tickAnim - 130) / 330) * (0-(0.5)));
            zz = 0 + (((tickAnim - 130) / 330) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 460) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 40) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eye2.rotationPointX = this.eye2.rotationPointX + (float)(xx);
        this.eye2.rotationPointY = this.eye2.rotationPointY - (float)(yy);
        this.eye2.rotationPointZ = this.eye2.rotationPointZ + (float)(zz);


        if (tickAnim >= 53 && tickAnim < 62) {
            xx = 1 + (((tickAnim - 53) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 9) * (-0.16-(1)));
            zz = 1 + (((tickAnim - 53) / 9) * (1-(1)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 62) / 8) * (1-(1)));
            yy = -0.16 + (((tickAnim - 62) / 8) * (1-(-0.16)));
            zz = 1 + (((tickAnim - 62) / 8) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 87) {
            xx = 1 + (((tickAnim - 70) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 17) * (1-(1)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 87) / 43) * (1-(1)));
            yy = 1 + (((tickAnim - 87) / 43) * (-0.0375-(1)));
            zz = 1 + (((tickAnim - 87) / 43) * (1-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 448) {
            xx = 1 + (((tickAnim - 130) / 318) * (1-(1)));
            yy = -0.0375 + (((tickAnim - 130) / 318) * (-0.0375-(-0.0375)));
            zz = 1 + (((tickAnim - 130) / 318) * (1-(1)));
        }
        else if (tickAnim >= 448 && tickAnim < 460) {
            xx = 1 + (((tickAnim - 448) / 12) * (1-(1)));
            yy = -0.0375 + (((tickAnim - 448) / 12) * (1-(-0.0375)));
            zz = 1 + (((tickAnim - 448) / 12) * (1-(1)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 1 + (((tickAnim - 460) / 40) * (1-(1)));
            yy = 1 + (((tickAnim - 460) / 40) * (1-(1)));
            zz = 1 + (((tickAnim - 460) / 40) * (1-(1)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 1 + (((tickAnim - 500) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 500) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 500) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 87 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 87) / 1) * (3.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*20-(0)));
            yy = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 1) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 130) {
            xx = 3.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*20 + (((tickAnim - 88) / 42) * (19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.5))*0.2-(3.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*20)));
            yy = 0 + (((tickAnim - 88) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 42) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 500) {
            xx = 19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.5))*0.2 + (((tickAnim - 130) / 370) * (19.5-(19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.5))*0.2)));
            yy = 0 + (((tickAnim - 130) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 370) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 512) {
            xx = 19.5 + (((tickAnim - 500) / 12) * (0-(19.5)));
            yy = 0 + (((tickAnim - 500) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 6.5 + (((tickAnim - 30) / 470) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 6.5 + (((tickAnim - 500) / 25) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 6.5 + (((tickAnim - 525) / 35) * (0-(6.5)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 6.25 + (((tickAnim - 30) / 470) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 6.25 + (((tickAnim - 500) / 25) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 6.25 + (((tickAnim - 525) / 35) * (0-(6.25)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -7.25 + (((tickAnim - 30) / 470) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -7.25 + (((tickAnim - 500) / 25) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -7.25 + (((tickAnim - 525) / 35) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -5.5 + (((tickAnim - 30) / 470) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -5.5 + (((tickAnim - 500) / 25) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -5.5 + (((tickAnim - 525) / 35) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-31.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -18 + (((tickAnim - 30) / 470) * (-18-(-18)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = -31.5 + (((tickAnim - 30) / 470) * (-31.5-(-31.5)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -18 + (((tickAnim - 500) / 25) * (-18-(-18)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = -31.5 + (((tickAnim - 500) / 25) * (-31.5-(-31.5)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -18 + (((tickAnim - 525) / 35) * (0-(-18)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = -31.5 + (((tickAnim - 525) / 35) * (0-(-31.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11.61994-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-6.78195-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (4.74239-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 11.61994 + (((tickAnim - 30) / 470) * (11.61994-(11.61994)));
            yy = -6.78195 + (((tickAnim - 30) / 470) * (-6.78195-(-6.78195)));
            zz = 4.74239 + (((tickAnim - 30) / 470) * (4.74239-(4.74239)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 11.61994 + (((tickAnim - 500) / 25) * (11.61994-(11.61994)));
            yy = -6.78195 + (((tickAnim - 500) / 25) * (-6.78195-(-6.78195)));
            zz = 4.74239 + (((tickAnim - 500) / 25) * (4.74239-(4.74239)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 11.61994 + (((tickAnim - 525) / 35) * (0-(11.61994)));
            yy = -6.78195 + (((tickAnim - 525) / 35) * (0-(-6.78195)));
            zz = 4.74239 + (((tickAnim - 525) / 35) * (0-(4.74239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-3.47288-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.92008-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (33.87705-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -3.47288 + (((tickAnim - 30) / 470) * (-3.47288-(-3.47288)));
            yy = 0.92008 + (((tickAnim - 30) / 470) * (0.92008-(0.92008)));
            zz = 33.87705 + (((tickAnim - 30) / 470) * (33.87705-(33.87705)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -3.47288 + (((tickAnim - 500) / 25) * (-3.47288-(-3.47288)));
            yy = 0.92008 + (((tickAnim - 500) / 25) * (0.92008-(0.92008)));
            zz = 33.87705 + (((tickAnim - 500) / 25) * (33.87705-(33.87705)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -3.47288 + (((tickAnim - 525) / 35) * (0-(-3.47288)));
            yy = 0.92008 + (((tickAnim - 525) / 35) * (0-(0.92008)));
            zz = 33.87705 + (((tickAnim - 525) / 35) * (0-(33.87705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-41.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = -41.75 + (((tickAnim - 23) / 11) * (-36-(-41.75)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (4.52648-(0)));
            yy = 0 + (((tickAnim - 34) / 11) * (-11.04296-(0)));
            zz = -36 + (((tickAnim - 34) / 11) * (-8.69263-(-36)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = 4.52648 + (((tickAnim - 45) / 455) * (4.52648-(4.52648)));
            yy = -11.04296 + (((tickAnim - 45) / 455) * (-11.04296-(-11.04296)));
            zz = -8.69263 + (((tickAnim - 45) / 455) * (-8.69263-(-8.69263)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 4.52648 + (((tickAnim - 500) / 25) * (4.52648-(4.52648)));
            yy = -11.04296 + (((tickAnim - 500) / 25) * (-11.04296-(-11.04296)));
            zz = -8.69263 + (((tickAnim - 500) / 25) * (-8.69263-(-8.69263)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 4.52648 + (((tickAnim - 525) / 35) * (0-(4.52648)));
            yy = -11.04296 + (((tickAnim - 525) / 35) * (0-(-11.04296)));
            zz = -8.69263 + (((tickAnim - 525) / 35) * (0-(-8.69263)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-11.25906-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (11.16241-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (39.49955-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -11.25906 + (((tickAnim - 23) / 11) * (-31.81363-(-11.25906)));
            yy = 11.16241 + (((tickAnim - 23) / 11) * (1.89176-(11.16241)));
            zz = 39.49955 + (((tickAnim - 23) / 11) * (22.32261-(39.49955)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = -31.81363 + (((tickAnim - 34) / 11) * (-50.56363-(-31.81363)));
            yy = 1.89176 + (((tickAnim - 34) / 11) * (1.89176-(1.89176)));
            zz = 22.32261 + (((tickAnim - 34) / 11) * (22.32261-(22.32261)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = -50.56363 + (((tickAnim - 45) / 455) * (-50.56363-(-50.56363)));
            yy = 1.89176 + (((tickAnim - 45) / 455) * (1.89176-(1.89176)));
            zz = 22.32261 + (((tickAnim - 45) / 455) * (22.32261-(22.32261)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -50.56363 + (((tickAnim - 500) / 25) * (-50.56363-(-50.56363)));
            yy = 1.89176 + (((tickAnim - 500) / 25) * (1.89176-(1.89176)));
            zz = 22.32261 + (((tickAnim - 500) / 25) * (22.32261-(22.32261)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -50.56363 + (((tickAnim - 525) / 35) * (0-(-50.56363)));
            yy = 1.89176 + (((tickAnim - 525) / 35) * (0-(1.89176)));
            zz = 22.32261 + (((tickAnim - 525) / 35) * (0-(22.32261)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (1.875-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 1.875 + (((tickAnim - 34) / 11) * (1.875-(1.875)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = 1.875 + (((tickAnim - 45) / 455) * (1.875-(1.875)));
            yy = 0 + (((tickAnim - 45) / 455) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 455) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 1.875 + (((tickAnim - 500) / 25) * (1.875-(1.875)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 1.875 + (((tickAnim - 525) / 35) * (0-(1.875)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (24.99091-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-11.42233-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (5.60619-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 24.99091 + (((tickAnim - 23) / 11) * (75.93154-(24.99091)));
            yy = -11.42233 + (((tickAnim - 23) / 11) * (-9.30935-(-11.42233)));
            zz = 5.60619 + (((tickAnim - 23) / 11) * (-16.84916-(5.60619)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 75.93154 + (((tickAnim - 34) / 11) * (67.93154-(75.93154)));
            yy = -9.30935 + (((tickAnim - 34) / 11) * (-9.30935-(-9.30935)));
            zz = -16.84916 + (((tickAnim - 34) / 11) * (-16.84916-(-16.84916)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = 67.93154 + (((tickAnim - 45) / 455) * (67.93154-(67.93154)));
            yy = -9.30935 + (((tickAnim - 45) / 455) * (-9.30935-(-9.30935)));
            zz = -16.84916 + (((tickAnim - 45) / 455) * (-16.84916-(-16.84916)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 67.93154 + (((tickAnim - 500) / 25) * (67.93154-(67.93154)));
            yy = -9.30935 + (((tickAnim - 500) / 25) * (-9.30935-(-9.30935)));
            zz = -16.84916 + (((tickAnim - 500) / 25) * (-16.84916-(-16.84916)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 67.93154 + (((tickAnim - 525) / 35) * (0-(67.93154)));
            yy = -9.30935 + (((tickAnim - 525) / 35) * (0-(-9.30935)));
            zz = -16.84916 + (((tickAnim - 525) / 35) * (0-(-16.84916)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-1.55-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 11) * (3.155-(0.975)));
            zz = -1.55 + (((tickAnim - 23) / 11) * (-2.5-(-1.55)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            yy = 3.155 + (((tickAnim - 34) / 11) * (3.16-(3.155)));
            zz = -2.5 + (((tickAnim - 34) / 11) * (-2.2-(-2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 45) / 455) * (0-(0)));
            yy = 3.16 + (((tickAnim - 45) / 455) * (3.16-(3.16)));
            zz = -2.2 + (((tickAnim - 45) / 455) * (-2.2-(-2.2)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 3.16 + (((tickAnim - 500) / 25) * (3.16-(3.16)));
            zz = -2.2 + (((tickAnim - 500) / 25) * (-2.2-(-2.2)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 3.16 + (((tickAnim - 525) / 35) * (0-(3.16)));
            zz = -2.2 + (((tickAnim - 525) / 35) * (0-(-2.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 87 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 87) / 45) * (-6-(0)));
            yy = 0 + (((tickAnim - 87) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 45) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 499) {
            xx = -6 + (((tickAnim - 132) / 367) * (-6-(-6)));
            yy = 0 + (((tickAnim - 132) / 367) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 367) * (0-(0)));
        }
        else if (tickAnim >= 499 && tickAnim < 512) {
            xx = -6 + (((tickAnim - 499) / 13) * (0-(-6)));
            yy = 0 + (((tickAnim - 499) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 499) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(poach, poach.rotateAngleX + (float) Math.toRadians(xx), poach.rotateAngleY + (float) Math.toRadians(yy), poach.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSarcosuchus entity = (EntityPrehistoricFloraSarcosuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.75 + (((tickAnim - 20) / 20) * (0-(2.75)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 12 + (((tickAnim - 20) / 6) * (14-(12)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 26) / 9) * (0-(14)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSarcosuchus entity = (EntityPrehistoricFloraSarcosuchus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -41.36079 + (((tickAnim - 0) / 13) * (-14.45032-(-41.36079)));
            yy = -13.28994 + (((tickAnim - 0) / 13) * (-15.64753-(-13.28994)));
            zz = -9.63052 + (((tickAnim - 0) / 13) * (-1.05744-(-9.63052)));
        }
        else if (tickAnim >= 13 && tickAnim < 39) {
            xx = -14.45032 + (((tickAnim - 13) / 26) * (40.12062-(-14.45032)));
            yy = -15.64753 + (((tickAnim - 13) / 26) * (-20.36271-(-15.64753)));
            zz = -1.05744 + (((tickAnim - 13) / 26) * (16.0887-(-1.05744)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 40.12062 + (((tickAnim - 39) / 9) * (6.79731-(40.12062)));
            yy = -20.36271 + (((tickAnim - 39) / 9) * (-10.24535-(-20.36271)));
            zz = 16.0887 + (((tickAnim - 39) / 9) * (40.5834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*55-(16.0887)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 6.79731 + (((tickAnim - 48) / 12) * (-41.36079-(6.79731)));
            yy = -10.24535 + (((tickAnim - 48) / 12) * (-13.28994-(-10.24535)));
            zz = 40.5834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*55 + (((tickAnim - 48) / 12) * (-9.63052-(40.5834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -7.59912 + (((tickAnim - 0) / 13) * (-4.81608-(-7.59912)));
            yy = 27.39407 + (((tickAnim - 0) / 13) * (18.26271-(27.39407)));
            zz = 28.34718 + (((tickAnim - 0) / 13) * (18.89812-(28.34718)));
        }
        else if (tickAnim >= 13 && tickAnim < 39) {
            xx = -4.81608 + (((tickAnim - 13) / 26) * (0-(-4.81608)));
            yy = 18.26271 + (((tickAnim - 13) / 26) * (0-(18.26271)));
            zz = 18.89812 + (((tickAnim - 13) / 26) * (0-(18.89812)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (12.19606-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (1.55328-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (14.68908-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 12.19606 + (((tickAnim - 45) / 9) * (-32.18233-(12.19606)));
            yy = 1.55328 + (((tickAnim - 45) / 9) * (15.12087-(1.55328)));
            zz = 14.68908 + (((tickAnim - 45) / 9) * (27.63858-(14.68908)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -32.18233 + (((tickAnim - 54) / 6) * (-7.59912-(-32.18233)));
            yy = 15.12087 + (((tickAnim - 54) / 6) * (27.39407-(15.12087)));
            zz = 27.63858 + (((tickAnim - 54) / 6) * (28.34718-(27.63858)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0.45 + (((tickAnim - 0) / 39) * (0-(0.45)));
            yy = -1.625 + (((tickAnim - 0) / 39) * (0-(-1.625)));
            zz = 2.15 + (((tickAnim - 0) / 39) * (0-(2.15)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (1.015-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (-0.785-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0.59-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 1.015 + (((tickAnim - 45) / 9) * (-0.06-(1.015)));
            yy = -0.785 + (((tickAnim - 45) / 9) * (0.53-(-0.785)));
            zz = 0.59 + (((tickAnim - 45) / 9) * (0.71-(0.59)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -0.06 + (((tickAnim - 54) / 6) * (0.45-(-0.06)));
            yy = 0.53 + (((tickAnim - 54) / 6) * (-1.625-(0.53)));
            zz = 0.71 + (((tickAnim - 54) / 6) * (2.15-(0.71)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 33.5 + (((tickAnim - 0) / 6) * (19.98333-(33.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = -4 + (((tickAnim - 0) / 6) * (-6.91667-(-4)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 19.98333 + (((tickAnim - 6) / 7) * (7.75-(19.98333)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = -6.91667 + (((tickAnim - 6) / 7) * (-10.25-(-6.91667)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 7.75 + (((tickAnim - 13) / 10) * (-8.69031-(7.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (1.62951-(0)));
            zz = -10.25 + (((tickAnim - 13) / 10) * (-15.55483-(-10.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 39) {
            xx = -8.69031 + (((tickAnim - 23) / 16) * (54.02203-(-8.69031)));
            yy = 1.62951 + (((tickAnim - 23) / 16) * (-9.16139-(1.62951)));
            zz = -15.55483 + (((tickAnim - 23) / 16) * (-9.61363-(-15.55483)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 54.02203 + (((tickAnim - 39) / 6) * (82.14153-(54.02203)));
            yy = -9.16139 + (((tickAnim - 39) / 6) * (-6.87104-(-9.16139)));
            zz = -9.61363 + (((tickAnim - 39) / 6) * (-8.21022-(-9.61363)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 82.14153 + (((tickAnim - 45) / 4) * (14.03168-(82.14153)));
            yy = -6.87104 + (((tickAnim - 45) / 4) * (4.41803-(-6.87104)));
            zz = -8.21022 + (((tickAnim - 45) / 4) * (-21.2447-(-8.21022)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = 14.03168 + (((tickAnim - 49) / 3) * (21.50348-(14.03168)));
            yy = 4.41803 + (((tickAnim - 49) / 3) * (6.66306-(4.41803)));
            zz = -21.2447 + (((tickAnim - 49) / 3) * (-25.54174-(-21.2447)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 21.50348 + (((tickAnim - 52) / 2) * (35.67751-(21.50348)));
            yy = 6.66306 + (((tickAnim - 52) / 2) * (5.51459-(6.66306)));
            zz = -25.54174 + (((tickAnim - 52) / 2) * (-21.3641-(-25.54174)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 35.67751 + (((tickAnim - 54) / 6) * (33.5-(35.67751)));
            yy = 5.51459 + (((tickAnim - 54) / 6) * (0-(5.51459)));
            zz = -21.3641 + (((tickAnim - 54) / 6) * (-4-(-21.3641)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 2.3 + (((tickAnim - 0) / 6) * (2.525-(2.3)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 2.525 + (((tickAnim - 6) / 7) * (1.65-(2.525)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 1.65 + (((tickAnim - 13) / 10) * (0-(1.65)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 23) / 16) * (-0.875-(0)));
            yy = 0 + (((tickAnim - 23) / 16) * (1.575-(0)));
            zz = 0 + (((tickAnim - 23) / 16) * (-1.4-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -0.875 + (((tickAnim - 39) / 6) * (-0.66-(-0.875)));
            yy = 1.575 + (((tickAnim - 39) / 6) * (4.29-(1.575)));
            zz = -1.4 + (((tickAnim - 39) / 6) * (-2.385-(-1.4)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = -0.66 + (((tickAnim - 45) / 4) * (-0.44-(-0.66)));
            yy = 4.29 + (((tickAnim - 45) / 4) * (2.43-(4.29)));
            zz = -2.385 + (((tickAnim - 45) / 4) * (-2.625-(-2.385)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = -0.44 + (((tickAnim - 49) / 3) * (-0.78-(-0.44)));
            yy = 2.43 + (((tickAnim - 49) / 3) * (3.5-(2.43)));
            zz = -2.625 + (((tickAnim - 49) / 3) * (-1.97-(-2.625)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = -0.78 + (((tickAnim - 52) / 2) * (-0.22-(-0.78)));
            yy = 3.5 + (((tickAnim - 52) / 2) * (3.99-(3.5)));
            zz = -1.97 + (((tickAnim - 52) / 2) * (-1.31-(-1.97)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -0.22 + (((tickAnim - 54) / 6) * (0-(-0.22)));
            yy = 3.99 + (((tickAnim - 54) / 6) * (2.3-(3.99)));
            zz = -1.31 + (((tickAnim - 54) / 6) * (0-(-1.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = -25.75 + (((tickAnim - 0) / 29) * (42.19725-(-25.75)));
            yy = 0 + (((tickAnim - 0) / 29) * (0.47179-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (6.13785-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 42.19725 + (((tickAnim - 29) / 7) * (2.78438-(42.19725)));
            yy = 0.47179 + (((tickAnim - 29) / 7) * (-3.8511-(0.47179)));
            zz = 6.13785 + (((tickAnim - 29) / 7) * (14.56778-(6.13785)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 2.78438 + (((tickAnim - 36) / 12) * (-59.5-(2.78438)));
            yy = -3.8511 + (((tickAnim - 36) / 12) * (0-(-3.8511)));
            zz = 14.56778 + (((tickAnim - 36) / 12) * (0-(14.56778)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -59.5 + (((tickAnim - 48) / 12) * (-25.75-(-59.5)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = -0.03368 + (((tickAnim - 0) / 29) * (0-(-0.03368)));
            yy = 4.49536 + (((tickAnim - 0) / 29) * (0-(4.49536)));
            zz = -1.18982 + (((tickAnim - 0) / 29) * (3.75-(-1.18982)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 3.75 + (((tickAnim - 29) / 7) * (0-(3.75)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = -20.5 + (((tickAnim - 36) / 6) * (-48.14345-(-20.5)));
            yy = 0 + (((tickAnim - 36) / 6) * (8.04177-(0)));
            zz = 0 + (((tickAnim - 36) / 6) * (-14.93746-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -48.14345 + (((tickAnim - 42) / 6) * (2.31105-(-48.14345)));
            yy = 8.04177 + (((tickAnim - 42) / 6) * (40.11408-(8.04177)));
            zz = -14.93746 + (((tickAnim - 42) / 6) * (3.74726-(-14.93746)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 2.31105 + (((tickAnim - 48) / 12) * (-0.03368-(2.31105)));
            yy = 40.11408 + (((tickAnim - 48) / 12) * (4.49536-(40.11408)));
            zz = 3.74726 + (((tickAnim - 48) / 12) * (-1.18982-(3.74726)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (-1.35-(0)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = -1.35 + (((tickAnim - 36) / 6) * (-1.69-(-1.35)));
            yy = 0 + (((tickAnim - 36) / 6) * (-0.12-(0)));
            zz = 0 + (((tickAnim - 36) / 6) * (-0.22-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -1.69 + (((tickAnim - 42) / 6) * (0.325-(-1.69)));
            yy = -0.12 + (((tickAnim - 42) / 6) * (-0.25-(-0.12)));
            zz = -0.22 + (((tickAnim - 42) / 6) * (-0.45-(-0.22)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0.325 + (((tickAnim - 48) / 12) * (0-(0.325)));
            yy = -0.25 + (((tickAnim - 48) / 12) * (0-(-0.25)));
            zz = -0.45 + (((tickAnim - 48) / 12) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 9.7521 + (((tickAnim - 0) / 6) * (7.39636-(9.7521)));
            yy = 25.18362 + (((tickAnim - 0) / 6) * (12.14695-(25.18362)));
            zz = 12.37212 + (((tickAnim - 0) / 6) * (4.03029-(12.37212)));
        }
        else if (tickAnim >= 6 && tickAnim < 29) {
            xx = 7.39636 + (((tickAnim - 6) / 23) * (88.83043-(7.39636)));
            yy = 12.14695 + (((tickAnim - 6) / 23) * (7.18154-(12.14695)));
            zz = 4.03029 + (((tickAnim - 6) / 23) * (18.53826-(4.03029)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 88.83043 + (((tickAnim - 29) / 7) * (88.83043-(88.83043)));
            yy = 7.18154 + (((tickAnim - 29) / 7) * (7.18154-(7.18154)));
            zz = 18.53826 + (((tickAnim - 29) / 7) * (18.53826-(18.53826)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 88.83043 + (((tickAnim - 36) / 6) * (80.8102-(88.83043)));
            yy = 7.18154 + (((tickAnim - 36) / 6) * (17.19932-(7.18154)));
            zz = 18.53826 + (((tickAnim - 36) / 6) * (14.19829-(18.53826)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 80.8102 + (((tickAnim - 42) / 6) * (14.84899-(80.8102)));
            yy = 17.19932 + (((tickAnim - 42) / 6) * (15.29768-(17.19932)));
            zz = 14.19829 + (((tickAnim - 42) / 6) * (8.46819-(14.19829)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 14.84899 + (((tickAnim - 48) / 12) * (9.7521-(14.84899)));
            yy = 15.29768 + (((tickAnim - 48) / 12) * (25.18362-(15.29768)));
            zz = 8.46819 + (((tickAnim - 48) / 12) * (12.37212-(8.46819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.475 + (((tickAnim - 0) / 6) * (0-(0.475)));
            yy = 0.225 + (((tickAnim - 0) / 6) * (0.125-(0.225)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 6) / 23) * (0-(0)));
            yy = 0.125 + (((tickAnim - 6) / 23) * (2-(0.125)));
            zz = 0 + (((tickAnim - 6) / 23) * (-1.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 29) / 7) * (2-(2)));
            zz = -1.25 + (((tickAnim - 29) / 7) * (-1.45-(-1.25)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 36) / 6) * (0-(0)));
            yy = 2 + (((tickAnim - 36) / 6) * (1.16-(2)));
            zz = -1.45 + (((tickAnim - 36) / 6) * (-2.085-(-1.45)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = 1.16 + (((tickAnim - 42) / 6) * (0.325-(1.16)));
            zz = -2.085 + (((tickAnim - 42) / 6) * (0-(-2.085)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (0.475-(0)));
            yy = 0.325 + (((tickAnim - 48) / 12) * (0.225-(0.325)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-40))*-1.4), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*-1.5), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-3.75), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-130))*-1.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-160))*-1), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-190))*-1), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(3.25), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-230))*-2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*5));


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*1.2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*0.25);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*0.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5))*-0.5);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (-47.22-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -47.22 + (((tickAnim - 33) / 6) * (-82.5-(-47.22)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = -82.5 + (((tickAnim - 39) / 10) * (39.75-(-82.5)));
            yy = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 39.75 + (((tickAnim - 49) / 4) * (13.5-(39.75)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 13.5 + (((tickAnim - 53) / 7) * (0-(13.5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (-0.545-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (1.425-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = -0.545 + (((tickAnim - 33) / 6) * (-2.75-(-0.545)));
            zz = 1.425 + (((tickAnim - 33) / 6) * (0-(1.425)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = -2.75 + (((tickAnim - 39) / 4) * (0-(-2.75)));
            zz = 0 + (((tickAnim - 39) / 4) * (0.95-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            zz = 0.95 + (((tickAnim - 43) / 6) * (-1.025-(0.95)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = -1.025 + (((tickAnim - 49) / 4) * (-1.025-(-1.025)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = -1.025 + (((tickAnim - 53) / 7) * (0-(-1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+40))*-0.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-1.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5))*-0.5), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1.5), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*1));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-1.2), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*-2.5), body4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*2), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-100))*-1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*3), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-280))*-3), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-300))*7));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-320))*-4), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-350))*9));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 20.48481 + (((tickAnim - 0) / 12) * (40.12062-(20.48481)));
            yy = 12.91773 + (((tickAnim - 0) / 12) * (20.36271-(12.91773)));
            zz = -7.76865 + (((tickAnim - 0) / 12) * (-16.0887-(-7.76865)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 40.12062 + (((tickAnim - 12) / 7) * (10.37623-(40.12062)));
            yy = 20.36271 + (((tickAnim - 12) / 7) * (8.81474-(20.36271)));
            zz = -16.0887 + (((tickAnim - 12) / 7) * (44.5592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-65-(-16.0887)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 10.37623 + (((tickAnim - 19) / 14) * (-41.36079-(10.37623)));
            yy = 8.81474 + (((tickAnim - 19) / 14) * (13.28994-(8.81474)));
            zz = 44.5592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-65 + (((tickAnim - 19) / 14) * (10.63052-(44.5592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-65)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = -41.36079 + (((tickAnim - 33) / 27) * (20.48481-(-41.36079)));
            yy = 13.28994 + (((tickAnim - 33) / 27) * (12.91773-(13.28994)));
            zz = 10.63052 + (((tickAnim - 33) / 27) * (-7.76865-(10.63052)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1.43392 + (((tickAnim - 0) / 12) * (0-(1.43392)));
            yy = -18.26271 + (((tickAnim - 0) / 12) * (0-(-18.26271)));
            zz = -18.89812 + (((tickAnim - 0) / 12) * (0-(-18.89812)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (12.39569-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (4.01859-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-18.5059-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 12.39569 + (((tickAnim - 18) / 10) * (-32.18233-(12.39569)));
            yy = 4.01859 + (((tickAnim - 18) / 10) * (-15.12087-(4.01859)));
            zz = -18.5059 + (((tickAnim - 18) / 10) * (-27.63858-(-18.5059)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -32.18233 + (((tickAnim - 28) / 5) * (-7.59912-(-32.18233)));
            yy = -15.12087 + (((tickAnim - 28) / 5) * (-27.39407-(-15.12087)));
            zz = -27.63858 + (((tickAnim - 28) / 5) * (-28.34718-(-27.63858)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = -7.59912 + (((tickAnim - 33) / 27) * (1.43392-(-7.59912)));
            yy = -27.39407 + (((tickAnim - 33) / 27) * (-18.26271-(-27.39407)));
            zz = -28.34718 + (((tickAnim - 33) / 27) * (-18.89812-(-28.34718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -0.35 + (((tickAnim - 0) / 12) * (0-(-0.35)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (1.39-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (-0.785-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-0.06-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 1.39 + (((tickAnim - 18) / 10) * (0.06-(1.39)));
            yy = -0.785 + (((tickAnim - 18) / 10) * (0.53-(-0.785)));
            zz = -0.06 + (((tickAnim - 18) / 10) * (0.71-(-0.06)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0.06 + (((tickAnim - 28) / 5) * (0.45-(0.06)));
            yy = 0.53 + (((tickAnim - 28) / 5) * (-1.625-(0.53)));
            zz = 0.71 + (((tickAnim - 28) / 5) * (2.15-(0.71)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 0.45 + (((tickAnim - 33) / 27) * (-0.35-(0.45)));
            yy = -1.625 + (((tickAnim - 33) / 27) * (0-(-1.625)));
            zz = 2.15 + (((tickAnim - 33) / 27) * (0-(2.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 3.88916 + (((tickAnim - 0) / 8) * (31.88163-(3.88916)));
            yy = 16.70641 + (((tickAnim - 0) / 8) * (9.08009-(16.70641)));
            zz = 15.47471 + (((tickAnim - 0) / 8) * (12.70383-(15.47471)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 31.88163 + (((tickAnim - 8) / 4) * (51.52203-(31.88163)));
            yy = 9.08009 + (((tickAnim - 8) / 4) * (9.16139-(9.08009)));
            zz = 12.70383 + (((tickAnim - 8) / 4) * (9.61363-(12.70383)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 51.52203 + (((tickAnim - 12) / 6) * (71.89153-(51.52203)));
            yy = 9.16139 + (((tickAnim - 12) / 6) * (-6.87104-(9.16139)));
            zz = 9.61363 + (((tickAnim - 12) / 6) * (-8.21022-(9.61363)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 71.89153 + (((tickAnim - 18) / 5) * (11.53168-(71.89153)));
            yy = -6.87104 + (((tickAnim - 18) / 5) * (-4.41803-(-6.87104)));
            zz = -8.21022 + (((tickAnim - 18) / 5) * (21.2447-(-8.21022)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 11.53168 + (((tickAnim - 23) / 5) * (35.67751-(11.53168)));
            yy = -4.41803 + (((tickAnim - 23) / 5) * (-5.51459-(-4.41803)));
            zz = 21.2447 + (((tickAnim - 23) / 5) * (21.3641-(21.2447)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 35.67751 + (((tickAnim - 28) / 5) * (32.99814-(35.67751)));
            yy = -5.51459 + (((tickAnim - 28) / 5) * (-0.6365-(-5.51459)));
            zz = 21.3641 + (((tickAnim - 28) / 5) * (5.09231-(21.3641)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 32.99814 + (((tickAnim - 33) / 11) * (13.89887-(32.99814)));
            yy = -0.6365 + (((tickAnim - 33) / 11) * (6.7211-(-0.6365)));
            zz = 5.09231 + (((tickAnim - 33) / 11) * (9.49697-(5.09231)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 13.89887 + (((tickAnim - 44) / 16) * (3.88916-(13.89887)));
            yy = 6.7211 + (((tickAnim - 44) / 16) * (16.70641-(6.7211)));
            zz = 9.49697 + (((tickAnim - 44) / 16) * (15.47471-(9.49697)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.35-(0)));
            yy = 0.85 + (((tickAnim - 0) / 3) * (1.305-(0.85)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.56-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.35 + (((tickAnim - 3) / 5) * (-0.26-(0.35)));
            yy = 1.305 + (((tickAnim - 3) / 5) * (2.265-(1.305)));
            zz = -0.56 + (((tickAnim - 3) / 5) * (-0.105-(-0.56)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.26 + (((tickAnim - 8) / 4) * (-0.2-(-0.26)));
            yy = 2.265 + (((tickAnim - 8) / 4) * (2.2-(2.265)));
            zz = -0.105 + (((tickAnim - 8) / 4) * (-1.4-(-0.105)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -0.2 + (((tickAnim - 12) / 6) * (-0.66-(-0.2)));
            yy = 2.2 + (((tickAnim - 12) / 6) * (5.415-(2.2)));
            zz = -1.4 + (((tickAnim - 12) / 6) * (-1.535-(-1.4)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.66 + (((tickAnim - 18) / 5) * (0.44-(-0.66)));
            yy = 5.415 + (((tickAnim - 18) / 5) * (2.955-(5.415)));
            zz = -1.535 + (((tickAnim - 18) / 5) * (-0.525-(-1.535)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0.44 + (((tickAnim - 23) / 5) * (0.22-(0.44)));
            yy = 2.955 + (((tickAnim - 23) / 5) * (2.915-(2.955)));
            zz = -0.525 + (((tickAnim - 23) / 5) * (-0.81-(-0.525)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0.22 + (((tickAnim - 28) / 5) * (0-(0.22)));
            yy = 2.915 + (((tickAnim - 28) / 5) * (1.9-(2.915)));
            zz = -0.81 + (((tickAnim - 28) / 5) * (0-(-0.81)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 33) / 11) * (0-(0)));
            yy = 1.9 + (((tickAnim - 33) / 11) * (1.425-(1.9)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 1.425 + (((tickAnim - 44) / 16) * (0.85-(1.425)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.5 + (((tickAnim - 0) / 3) * (-27.25-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -27.25 + (((tickAnim - 3) / 5) * (-53.62-(-27.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -53.62 + (((tickAnim - 8) / 4) * (-82.5-(-53.62)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -82.5 + (((tickAnim - 12) / 4) * (-16.83-(-82.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -16.83 + (((tickAnim - 16) / 7) * (39.75-(-16.83)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 39.75 + (((tickAnim - 23) / 5) * (13.5-(39.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 13.5 + (((tickAnim - 28) / 4) * (0-(13.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 32) / 28) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 32) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.7-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = -0.525 + (((tickAnim - 3) / 9) * (-2.75-(-0.525)));
            zz = 0.7 + (((tickAnim - 3) / 9) * (0-(0.7)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = -2.75 + (((tickAnim - 12) / 4) * (-0.25-(-2.75)));
            zz = 0 + (((tickAnim - 12) / 4) * (0.95-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 16) / 7) * (0-(-0.25)));
            zz = 0.95 + (((tickAnim - 16) / 7) * (-1.025-(0.95)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = -1.025 + (((tickAnim - 23) / 5) * (-1.025-(-1.025)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = -1.025 + (((tickAnim - 28) / 4) * (0-(-1.025)));
        }
        else if (tickAnim >= 32 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 32) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 6.28438 + (((tickAnim - 0) / 12) * (-59.5-(6.28438)));
            yy = 3.8511 + (((tickAnim - 0) / 12) * (0-(3.8511)));
            zz = -14.56778 + (((tickAnim - 0) / 12) * (0-(-14.56778)));
        }
        else if (tickAnim >= 12 && tickAnim < 54) {
            xx = -59.5 + (((tickAnim - 12) / 42) * (42.51888-(-59.5)));
            yy = 0 + (((tickAnim - 12) / 42) * (7.08844-(0)));
            zz = 0 + (((tickAnim - 12) / 42) * (-3.17183-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 42.51888 + (((tickAnim - 54) / 6) * (6.28438-(42.51888)));
            yy = 7.08844 + (((tickAnim - 54) / 6) * (3.8511-(7.08844)));
            zz = -3.17183 + (((tickAnim - 54) / 6) * (-14.56778-(-3.17183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -20.5 + (((tickAnim - 0) / 6) * (-48.14345-(-20.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (-8.04177-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (14.93746-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -48.14345 + (((tickAnim - 6) / 6) * (2.31105-(-48.14345)));
            yy = -8.04177 + (((tickAnim - 6) / 6) * (-40.11408-(-8.04177)));
            zz = 14.93746 + (((tickAnim - 6) / 6) * (-3.74726-(14.93746)));
        }
        else if (tickAnim >= 12 && tickAnim < 37) {
            xx = 2.31105 + (((tickAnim - 12) / 25) * (11.57931-(2.31105)));
            yy = -40.11408 + (((tickAnim - 12) / 25) * (-14.35511-(-40.11408)));
            zz = -3.74726 + (((tickAnim - 12) / 25) * (15.96045-(-3.74726)));
        }
        else if (tickAnim >= 37 && tickAnim < 54) {
            xx = 11.57931 + (((tickAnim - 37) / 17) * (0-(11.57931)));
            yy = -14.35511 + (((tickAnim - 37) / 17) * (0-(-14.35511)));
            zz = 15.96045 + (((tickAnim - 37) / 17) * (0-(15.96045)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1.25 + (((tickAnim - 0) / 6) * (1.75-(1.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.23-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 1.75 + (((tickAnim - 6) / 6) * (-0.45-(1.75)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = -0.23 + (((tickAnim - 6) / 6) * (-0.45-(-0.23)));
        }
        else if (tickAnim >= 12 && tickAnim < 54) {
            xx = -0.45 + (((tickAnim - 12) / 42) * (0-(-0.45)));
            yy = 0 + (((tickAnim - 12) / 42) * (0-(0)));
            zz = -0.45 + (((tickAnim - 12) / 42) * (0-(-0.45)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (1.25-(0)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 88.64503 + (((tickAnim - 0) / 6) * (84.25629-(88.64503)));
            yy = -19.52518 + (((tickAnim - 0) / 6) * (-17.36844-(-19.52518)));
            zz = -21.7431 + (((tickAnim - 0) / 6) * (-14.97986-(-21.7431)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 84.25629 + (((tickAnim - 6) / 6) * (20.46899-(84.25629)));
            yy = -17.36844 + (((tickAnim - 6) / 6) * (-15.16699-(-17.36844)));
            zz = -14.97986 + (((tickAnim - 6) / 6) * (-8.37013-(-14.97986)));
        }
        else if (tickAnim >= 12 && tickAnim < 37) {
            xx = 20.46899 + (((tickAnim - 12) / 25) * (-15.08058-(20.46899)));
            yy = -15.16699 + (((tickAnim - 12) / 25) * (-1.21172-(-15.16699)));
            zz = -8.37013 + (((tickAnim - 12) / 25) * (-19.52891-(-8.37013)));
        }
        else if (tickAnim >= 37 && tickAnim < 54) {
            xx = -15.08058 + (((tickAnim - 37) / 17) * (88.83043-(-15.08058)));
            yy = -1.21172 + (((tickAnim - 37) / 17) * (-7.18154-(-1.21172)));
            zz = -19.52891 + (((tickAnim - 37) / 17) * (-18.53826-(-19.52891)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 88.83043 + (((tickAnim - 54) / 6) * (88.64503-(88.83043)));
            yy = -7.18154 + (((tickAnim - 54) / 6) * (-19.52518-(-7.18154)));
            zz = -18.53826 + (((tickAnim - 54) / 6) * (-21.7431-(-18.53826)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 2 + (((tickAnim - 0) / 6) * (1.22-(2)));
            zz = -1.925 + (((tickAnim - 0) / 6) * (-1.89-(-1.925)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 1.22 + (((tickAnim - 6) / 6) * (0.325-(1.22)));
            zz = -1.89 + (((tickAnim - 6) / 6) * (0-(-1.89)));
        }
        else if (tickAnim >= 12 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 12) / 25) * (0-(0)));
            yy = 0.325 + (((tickAnim - 12) / 25) * (-0.03-(0.325)));
            zz = 0 + (((tickAnim - 12) / 25) * (-0.97-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 37) / 17) * (0-(0)));
            yy = -0.03 + (((tickAnim - 37) / 17) * (2-(-0.03)));
            zz = -0.97 + (((tickAnim - 37) / 17) * (-1.725-(-0.97)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 2 + (((tickAnim - 54) / 6) * (2-(2)));
            zz = -1.725 + (((tickAnim - 54) / 6) * (-1.925-(-1.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSarcosuchus entity = (EntityPrehistoricFloraSarcosuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-0.2);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(60.1694663837+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), backrightleg.rotateAngleY + (float) Math.toRadians(-13.12067), backrightleg.rotateAngleZ + (float) Math.toRadians(29.82136));
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(1.125);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(0);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(0);


        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(4.64004), backrightleg2.rotateAngleY + (float) Math.toRadians(-9.86686), backrightleg2.rotateAngleZ + (float) Math.toRadians(48.10514));


        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(95.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4), backrightleg3.rotateAngleY + (float) Math.toRadians(0), backrightleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(0);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(1.525);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(-3.55);


        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*4), backrightleg4.rotateAngleY + (float) Math.toRadians(0), backrightleg4.rotateAngleZ + (float) Math.toRadians(0));
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(0);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(0);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(-1.025);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*0.5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-0.5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-1), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-1), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(15.5), frontrightleg.rotateAngleY + (float) Math.toRadians(0), frontrightleg.rotateAngleZ + (float) Math.toRadians(0));
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(1.1);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(0);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(0);


        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(67.39013), frontrightleg2.rotateAngleY + (float) Math.toRadians(4.97207), frontrightleg2.rotateAngleZ + (float) Math.toRadians(60.38213));
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(0);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(0);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(-0.625);


        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(78.17044), frontrightleg3.rotateAngleY + (float) Math.toRadians(15.34646), frontrightleg3.rotateAngleZ + (float) Math.toRadians(19.57675));
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(0);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(0);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(-2.425);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*1), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(7.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*3), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(7.25), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-4.75), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*11), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*14), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-1.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*-17), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(-1.5), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*-20), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(60.1694663837+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2), backleftleg.rotateAngleY + (float) Math.toRadians(13.12067), backleftleg.rotateAngleZ + (float) Math.toRadians(-29.82136));
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(-1.125);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(0);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(0);


        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(4.64004), backleftleg2.rotateAngleY + (float) Math.toRadians(9.86686), backleftleg2.rotateAngleZ + (float) Math.toRadians(-48.10514));


        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(95.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-4), backleftleg3.rotateAngleY + (float) Math.toRadians(0), backleftleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(0);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(1.525);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(-3.55);


        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-4), backleftleg4.rotateAngleY + (float) Math.toRadians(0), backleftleg4.rotateAngleZ + (float) Math.toRadians(0));
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(0);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(0);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(-1.025);


        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(15.5), frontleftleg.rotateAngleY + (float) Math.toRadians(0), frontleftleg.rotateAngleZ + (float) Math.toRadians(0));
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(-1.1);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(0);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(0);


        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(67.39013), frontleftleg2.rotateAngleY + (float) Math.toRadians(-4.97207), frontleftleg2.rotateAngleZ + (float) Math.toRadians(-60.38213));
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(0);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(0);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(-0.625);


        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(78.17044), frontleftleg3.rotateAngleY + (float) Math.toRadians(-15.34646), frontleftleg3.rotateAngleZ + (float) Math.toRadians(-19.57675));
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(0);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(0);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(-2.425);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSarcosuchus e = (EntityPrehistoricFloraSarcosuchus) entity;
        animator.update(entity);


    }
}
