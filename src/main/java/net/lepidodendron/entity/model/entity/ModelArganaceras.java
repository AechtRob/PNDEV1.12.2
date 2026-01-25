package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArganaceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelArganaceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cheek;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cheek2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;

    private ModelAnimator animator;

    public ModelArganaceras() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 12.0261F, 9.3034F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -3.8865F, -2.0037F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4058F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, -1.5F, 0.0382F, 0.0118F, 5, 2, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -2.9261F, -2.9034F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, -2.5F, 0.0073F, 0.0001F, 7, 8, 7, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(3.0F, 1.0739F, 0.5966F);
        this.main.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.2986F, -0.0651F, -0.2084F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 19, 44, -1.5F, 0.5F, -2.0F, 4, 6, 4, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0F, 5.25F, -1.5F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.4729F, 0.0283F, 0.2303F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 33, 52, -1.0F, 0.0F, -0.25F, 3, 6, 3, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 5.0F, 2.7F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.1745F, 0.0F, 0.0F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 36, 44, -1.5F, 0.0F, -5.0F, 4, 2, 5, 0.0F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-3.0F, 1.0739F, 0.5966F);
        this.main.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.2986F, 0.0651F, 0.2084F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 19, 44, -2.5F, 0.5F, -2.0F, 4, 6, 4, 0.0F, true));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.0F, 5.25F, -1.5F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.4729F, -0.0283F, -0.2303F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 33, 52, -2.0F, 0.0F, -0.25F, 3, 6, 3, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0F, 5.0F, 2.7F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.1745F, 0.0F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 36, 44, -2.5F, 0.0F, -5.0F, 4, 2, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-1.0F, -1.4261F, 3.4466F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.4538F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 47, -1.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 3.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2705F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 51, 49, -0.5F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 3.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1047F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 62, 0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(1.0F, 0.65F, 2.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 63, 46, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -1.5786F, -2.0186F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -1.4474F, -11.2848F, 10, 10, 11, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.0724F, -5.8848F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 0, -3.5F, -0.0026F, 0.0069F, 8, 2, 6, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.6474F, -10.6848F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 36, -3.5F, -2.0F, 0.0F, 8, 2, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0526F, -10.2848F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 29, 22, -3.0F, -2.0F, -5.0F, 7, 8, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.0F, -2.5F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 43, 9, -2.5F, -1.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(2.8F, 5.0F, -2.125F);
        this.body2.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, -0.3054F, 0.9599F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 49, 31, -1.0F, -1.5F, 0.0F, 3, 3, 5, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(1.0F, -0.3F, 5.35F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.2624F, 0.6741F, 0.041F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 0, 0, -1.5F, -0.5F, -1.5F, 3, 6, 2, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.1825F, 4.136F, -0.54F);
        this.frontleftleg2.addChild(frontleftleg3);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0709F, 0.4032F, 0.0522F);
        this.frontleftleg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 0, 0.0F, -0.6F, -1.5F, 4, 2, 3, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-1.8F, 5.0F, -2.125F);
        this.body2.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, -0.3054F, -0.9599F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 49, 31, -2.0F, -1.5F, 0.0F, 3, 3, 5, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-1.0F, -0.3F, 5.35F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.2624F, -0.6741F, -0.041F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 0, 0, -1.5F, -0.5F, -1.5F, 3, 6, 2, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.1825F, 4.136F, -0.54F);
        this.frontrightleg2.addChild(frontrightleg3);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0709F, 0.4032F, 0.0522F);
        this.frontrightleg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 55, 0, -4.0F, -0.6F, -1.5F, 4, 2, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5F, -4.0F);
        this.body2.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 49, 17, -2.0F, 0.0F, -3.25F, 5, 5, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.825F, -1.0F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 26, -1.5F, 0.0F, -2.35F, 4, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 6.0F, -0.5F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 55, -2.0F, -1.325F, -2.875F, 4, 2, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.5F, 0.0137F, -2.2653F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 51, 40, -2.0F, -0.0137F, -3.2347F, 4, 5, 3, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0616F, -2.2429F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 61, 31, -1.5F, -0.5F, -1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 4.0541F, -2.1093F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 22, -1.5F, -0.9F, -0.325F, 3, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.2075F, 1.7216F, -2.1629F);
        this.neck2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 57, -2.2075F, -1.1353F, -2.0218F, 4, 4, 2, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 66, -1.2075F, 0.2647F, -6.5468F, 2, 1, 2, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 59, 6, -1.7075F, 0.2647F, -4.5468F, 3, 1, 3, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 17, 38, -1.7075F, -0.7353F, -4.6968F, 3, 1, 1, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 26, -1.2075F, -0.7353F, -5.5468F, 2, 1, 1, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.2075F, 0.7647F, -4.0468F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3752F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 64, 0.0F, -0.5F, -2.7F, 1, 1, 3, 0.001F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.7925F, 0.7647F, -4.0468F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3752F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 64, -1.0F, -0.5F, -2.7F, 1, 1, 3, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.3075F, 0.2647F, -4.0218F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.0873F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 64, 0.025F, -1.0F, 0.25F, 2, 2, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 22, 0.025F, -1.9F, 0.25F, 1, 1, 2, -0.001F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.8925F, -0.6353F, -4.0218F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0873F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 22, -1.025F, -1.0F, 0.25F, 1, 1, 2, -0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 64, -2.025F, -0.1F, 0.25F, 2, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.7075F, -0.5716F, -6.0234F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.0123F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 41, -0.5F, -0.0046F, -1.0003F, 2, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.7075F, -1.4716F, -4.2484F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4669F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 44, -0.5F, 0.0001F, -1.9905F, 2, 1, 2, 0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.4325F, -1.1421F, -3.1563F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5171F, 0.6726F, 0.3405F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 9, -0.85F, 0.2F, 0.525F, 1, 0, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.3075F, -1.3171F, -3.1813F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5171F, 0.6726F, 0.3405F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 9, -0.35F, 0.225F, -0.075F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.0175F, -1.1421F, -3.1563F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5171F, -0.6726F, -0.3405F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 9, -0.15F, 0.2F, 0.525F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.8925F, -1.3171F, -3.1813F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5171F, -0.6726F, -0.3405F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 5, 9, -0.65F, 0.225F, -0.075F, 1, 0, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.2075F, -2.2353F, -2.3968F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3971F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 63, 15, -0.5F, -0.0153F, -1.9913F, 3, 2, 2, 0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.7075F, -2.7353F, -2.5218F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 61, -0.5F, 0.5F, 0.0F, 4, 2, 2, 0.01F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.4925F, -0.3853F, -3.1218F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.264F, 0.1264F, 0.0341F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 41, -0.5F, -0.5F, -0.425F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.9075F, -0.3853F, -3.1218F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.264F, -0.1264F, -0.0341F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 41, -0.5F, -0.5F, -0.425F, 1, 1, 1, 0.0F, true));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-0.7075F, -1.4716F, -4.2484F);
        this.head.addChild(nose);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 0.8479F, -1.0844F);
        this.nose.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.4268F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 38, -1.0F, -0.325F, -0.2F, 1, 1, 1, 0.0F, false));

        this.cheek = new AdvancedModelRenderer(this);
        this.cheek.setRotationPoint(1.5925F, 0.5147F, -2.6468F);
        this.head.addChild(cheek);
        this.setRotateAngle(cheek, 0.4029F, 0.4724F, -0.8181F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 1.925F, -0.6F);
        this.cheek.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.9599F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 66, 42, -1.0F, -0.115F, 0.0344F, 1, 1, 2, -0.003F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 22, -1.0F, 1.06F, 0.0344F, 1, 1, 0, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 27, -1.0F, 0.81F, -0.4656F, 1, 0, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 66, 20, -1.0F, 0.06F, 0.0344F, 1, 1, 2, -0.001F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.7587F, 1.1108F);
        this.cheek.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.7345F, 0.2143F, 0.0919F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 63, 37, -0.325F, -0.475F, -1.0F, 1, 1, 3, -0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.9957F, -0.5314F, 2.9157F);
        this.cheek.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4899F, 0.1932F, -0.102F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 66, 24, -0.85F, -0.425F, -0.875F, 1, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.3117F, 0.4188F, 1.775F);
        this.cheek.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3266F, 0.3215F, 0.1384F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 43, 9, 0.0F, -0.725F, -0.525F, 0, 1, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.3139F, 0.963F);
        this.cheek.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4051F, 0.2415F, 0.1022F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 48, 62, -0.275F, -0.4923F, -0.7261F, 1, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 1.0F, -1.0F);
        this.cheek.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 32, 0, -1.0F, -1.15F, 0.25F, 1, 2, 1, 0.0F, false));

        this.cheek2 = new AdvancedModelRenderer(this);
        this.cheek2.setRotationPoint(-2.0075F, 0.5147F, -2.6468F);
        this.head.addChild(cheek2);
        this.setRotateAngle(cheek2, 0.4029F, -0.4724F, 0.8181F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 1.925F, -0.6F);
        this.cheek2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.9599F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 42, 0.0F, -0.115F, 0.0344F, 1, 1, 2, -0.003F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 31, 22, 0.0F, 1.06F, 0.0344F, 1, 1, 0, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 22, 27, 0.0F, 0.81F, -0.4656F, 1, 0, 1, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 20, 0.0F, 0.06F, 0.0344F, 1, 1, 2, -0.001F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.7587F, 1.1108F);
        this.cheek2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.7345F, -0.2143F, -0.0919F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 63, 37, -0.675F, -0.475F, -1.0F, 1, 1, 3, -0.001F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.9957F, -0.5314F, 2.9157F);
        this.cheek2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4899F, -0.1932F, 0.102F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 66, 24, -0.15F, -0.425F, -0.875F, 1, 1, 2, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.3117F, 0.4188F, 1.775F);
        this.cheek2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3266F, -0.3215F, -0.1384F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 43, 9, 0.0F, -0.725F, -0.525F, 0, 1, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.3139F, 0.963F);
        this.cheek2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.4051F, -0.2415F, -0.1022F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 48, 62, -0.725F, -0.4923F, -0.7261F, 1, 1, 3, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 1.0F, -1.0F);
        this.cheek2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0873F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 32, 0, 0.0F, -1.15F, 0.25F, 1, 2, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.3632F, 1.2647F, -1.8152F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 63, 64, -1.5707F, 0.0F, -4.7316F, 2, 1, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 59, -2.0707F, 0.0F, -2.7316F, 3, 1, 3, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 62, -2.0707F, -1.5F, -1.7316F, 3, 2, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.6707F, -1.0F, -2.2066F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.0873F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 9, 66, 0.025F, 1.0F, 0.25F, 2, 1, 2, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.5293F, -1.0F, -2.2066F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0873F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 9, 66, -2.025F, 1.0F, 0.25F, 2, 1, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-2.5707F, -0.5F, -2.2316F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.3752F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 63, 54, 0.0F, 0.5F, -2.7F, 1, 1, 3, 0.001F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.4293F, -0.5F, -2.2316F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.3752F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 63, 54, -1.0F, 0.5F, -2.7F, 1, 1, 3, 0.001F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5707F, 1.2154F, -1.2452F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.9687F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 26, 38, 0.0F, -0.75F, -0.675F, 0, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.0707F, 1.3285F, -2.7653F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0785F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 46, 57, -1.0F, -0.9821F, 0.0066F, 3, 1, 3, -0.002F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5707F, 1.0F, -4.7316F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1745F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 64, 11, -1.0F, -1.0F, 0.0F, 2, 1, 2, -0.002F, false));

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
        this.main.offsetY = 0.2F;
        this.main.offsetX = 0.35F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.105F;
        this.main.render(0.01F);
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
        this.main.offsetZ = -0.1F;

        EntityPrehistoricFloraArganaceras EntityMegalosaurus = (EntityPrehistoricFloraArganaceras) e;

        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.head};

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArganaceras entity = (EntityPrehistoricFloraArganaceras) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20.25 + (((tickAnim - 10) / 10) * (0-(20.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.75 + (((tickAnim - 10) / 10) * (0-(15.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.5 + (((tickAnim - 5) / 5) * (10.5-(21.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.5 + (((tickAnim - 10) / 10) * (0-(10.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (24.75-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 24.75 + (((tickAnim - 8) / 2) * (0-(24.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArganaceras entity = (EntityPrehistoricFloraArganaceras) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -2 + (((tickAnim - 15) / 15) * (0-(-2)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.25 + (((tickAnim - 15) / 15) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 15) * (0-(0.15)));
            zz = 0.1 + (((tickAnim - 15) / 15) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1.5 + (((tickAnim - 15) / 15) * (0-(1.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 18.25 + (((tickAnim - 15) / 15) * (0-(18.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArganaceras entity = (EntityPrehistoricFloraArganaceras) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 37 + (((tickAnim - 20) / 17) * (-28.81-(37)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -28.81 + (((tickAnim - 37) / 13) * (0-(-28.81)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 10.5 + (((tickAnim - 20) / 17) * (38.67-(10.5)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 38.67 + (((tickAnim - 37) / 13) * (0-(38.67)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 17) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (-0.45-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = -0.625 + (((tickAnim - 37) / 13) * (0-(-0.625)));
            zz = -0.45 + (((tickAnim - 37) / 13) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 34.5 + (((tickAnim - 20) / 8) * (-5.24-(34.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -5.24 + (((tickAnim - 28) / 9) * (45.08-(-5.24)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 45.08 + (((tickAnim - 37) / 13) * (0-(45.08)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 17) * (1.45-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 1.45 + (((tickAnim - 37) / 13) * (0-(1.45)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArganaceras entity = (EntityPrehistoricFloraArganaceras) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.75 + (((tickAnim - 20) / 10) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.75 + (((tickAnim - 30) / 20) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.025-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -3.3 + (((tickAnim - 20) / 10) * (-3.3-(-3.3)));
            zz = 1.025 + (((tickAnim - 20) / 10) * (1.025-(1.025)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3.3 + (((tickAnim - 30) / 20) * (0-(-3.3)));
            zz = 1.025 + (((tickAnim - 30) / 20) * (0-(1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-19.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -28 + (((tickAnim - 20) / 10) * (-28-(-28)));
            yy = -19.75 + (((tickAnim - 20) / 10) * (-19.75-(-19.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -28 + (((tickAnim - 30) / 20) * (0-(-28)));
            yy = -19.75 + (((tickAnim - 30) / 20) * (0-(-19.75)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (41-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 41 + (((tickAnim - 20) / 10) * (41-(41)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 41 + (((tickAnim - 30) / 20) * (0-(41)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (19.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -28 + (((tickAnim - 20) / 10) * (-28-(-28)));
            yy = 19.75 + (((tickAnim - 20) / 10) * (19.75-(19.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -28 + (((tickAnim - 30) / 20) * (0-(-28)));
            yy = 19.75 + (((tickAnim - 30) / 20) * (0-(19.75)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (41-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 41 + (((tickAnim - 20) / 10) * (41-(41)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 41 + (((tickAnim - 30) / 20) * (0-(41)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 15) / 5) * (-5.5-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.5 + (((tickAnim - 20) / 10) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 30) / 20) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (21-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21 + (((tickAnim - 20) / 10) * (21-(21)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21 + (((tickAnim - 30) / 20) * (0-(21)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.25 + (((tickAnim - 20) / 10) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 30) / 20) * (0-(3.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.25 + (((tickAnim - 20) / 10) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 30) / 20) * (0-(8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArganaceras entity = (EntityPrehistoricFloraArganaceras) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.33573 + (((tickAnim - 0) / 5) * (25.5-(12.33573)));
            yy = 1.71858 + (((tickAnim - 0) / 5) * (0-(1.71858)));
            zz = -1.21601 + (((tickAnim - 0) / 5) * (0-(-1.21601)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 25.5 + (((tickAnim - 5) / 11) * (-32.26524-(25.5)));
            yy = 0 + (((tickAnim - 5) / 11) * (-6.13778-(0)));
            zz = 0 + (((tickAnim - 5) / 11) * (4.3429-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -32.26524 + (((tickAnim - 16) / 2) * (-21.51524-(-32.26524)));
            yy = -6.13778 + (((tickAnim - 16) / 2) * (-6.13778-(-6.13778)));
            zz = 4.3429 + (((tickAnim - 16) / 2) * (4.3429-(4.3429)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -21.51524 + (((tickAnim - 18) / 12) * (12.33573-(-21.51524)));
            yy = -6.13778 + (((tickAnim - 18) / 12) * (1.71858-(-6.13778)));
            zz = 4.3429 + (((tickAnim - 18) / 12) * (-1.21601-(4.3429)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18.54 + (((tickAnim - 0) / 5) * (25.75-(18.54)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25.75 + (((tickAnim - 5) / 3) * (35.17-(25.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 35.17 + (((tickAnim - 8) / 8) * (24.25-(35.17)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 24.25 + (((tickAnim - 16) / 2) * (0-(24.25)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (18.54-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 5) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = -0.6 + (((tickAnim - 5) / 8) * (0-(-0.6)));
            zz = 0.125 + (((tickAnim - 5) / 8) * (0-(0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = -0.6 + (((tickAnim - 16) / 14) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.08 + (((tickAnim - 0) / 5) * (20.75-(2.08)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20.75 + (((tickAnim - 5) / 3) * (36.97-(20.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 36.97 + (((tickAnim - 8) / 8) * (21.75-(36.97)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 21.75 + (((tickAnim - 16) / 2) * (21.52-(21.75)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 21.52 + (((tickAnim - 18) / 7) * (-2.3-(21.52)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.3 + (((tickAnim - 25) / 5) * (2.08-(-2.3)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.605-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.09-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.605 + (((tickAnim - 8) / 2) * (1.89-(0.605)));
            zz = 0.09 + (((tickAnim - 8) / 2) * (0.06-(0.09)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.89 + (((tickAnim - 10) / 3) * (1.015-(1.89)));
            zz = 0.06 + (((tickAnim - 10) / 3) * (0.04-(0.06)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.015 + (((tickAnim - 13) / 3) * (0-(1.015)));
            zz = 0.04 + (((tickAnim - 13) / 3) * (0-(0.04)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 24) / 6) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
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
            xx = -32.26524 + (((tickAnim - 0) / 3) * (-21.51524-(-32.26524)));
            yy = 6.13778 + (((tickAnim - 0) / 3) * (6.13778-(6.13778)));
            zz = -4.3429 + (((tickAnim - 0) / 3) * (-4.3429-(-4.3429)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = -21.51524 + (((tickAnim - 3) / 15) * (25.5-(-21.51524)));
            yy = 6.13778 + (((tickAnim - 3) / 15) * (0-(6.13778)));
            zz = -4.3429 + (((tickAnim - 3) / 15) * (0-(-4.3429)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 25.5 + (((tickAnim - 18) / 12) * (-32.26524-(25.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (6.13778-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (-4.3429-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.25 + (((tickAnim - 0) / 3) * (0-(24.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 3) / 15) * (25.75-(0)));
            yy = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 15) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 25.75 + (((tickAnim - 18) / 4) * (35.17-(25.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 35.17 + (((tickAnim - 22) / 8) * (24.25-(35.17)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 18) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.125-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = -0.6 + (((tickAnim - 18) / 9) * (0-(-0.6)));
            zz = 0.125 + (((tickAnim - 18) / 9) * (0-(0.125)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
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
            xx = 21.75 + (((tickAnim - 0) / 3) * (21.52-(21.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 21.52 + (((tickAnim - 3) / 8) * (-11.6-(21.52)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -11.6 + (((tickAnim - 11) / 7) * (20.75-(-11.6)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 20.75 + (((tickAnim - 18) / 4) * (36.97-(20.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 36.97 + (((tickAnim - 22) / 8) * (21.75-(36.97)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.09-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.07 + (((tickAnim - 8) / 3) * (-0.75-(-0.07)));
            zz = 0.09 + (((tickAnim - 8) / 3) * (0.175-(0.09)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = -0.75 + (((tickAnim - 11) / 7) * (0-(-0.75)));
            zz = 0.175 + (((tickAnim - 11) / 7) * (0-(0.175)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0.605-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0.09-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.605 + (((tickAnim - 22) / 3) * (1.89-(0.605)));
            zz = 0.09 + (((tickAnim - 22) / 3) * (0.06-(0.09)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 1.89 + (((tickAnim - 25) / 2) * (1.015-(1.89)));
            zz = 0.06 + (((tickAnim - 25) / 2) * (0.04-(0.06)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 1.015 + (((tickAnim - 27) / 3) * (0-(1.015)));
            zz = 0.04 + (((tickAnim - 27) / 3) * (0-(0.04)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -192 + (((tickAnim - 0) / 18) * (5.84056-(-192)));
            yy = 7.75 + (((tickAnim - 0) / 18) * (3.96919-(7.75)));
            zz = -180 + (((tickAnim - 0) / 18) * (3.42069-(-180)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 5.84056 + (((tickAnim - 18) / 7) * (-85.58792-(5.84056)));
            yy = 3.96919 + (((tickAnim - 18) / 7) * (25.52157-(3.96919)));
            zz = 3.42069 + (((tickAnim - 18) / 7) * (-81.77351-(3.42069)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -85.58792 + (((tickAnim - 25) / 5) * (-192-(-85.58792)));
            yy = 25.52157 + (((tickAnim - 25) / 5) * (7.75-(25.52157)));
            zz = -81.77351 + (((tickAnim - 25) / 5) * (-180-(-81.77351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 31.15359 + (((tickAnim - 0) / 8) * (5.96178-(31.15359)));
            yy = -36.44088 + (((tickAnim - 0) / 8) * (-54.73884-(-36.44088)));
            zz = -46.89467 + (((tickAnim - 0) / 8) * (14.02983-(-46.89467)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 5.96178 + (((tickAnim - 8) / 10) * (6.84958-(5.96178)));
            yy = -54.73884 + (((tickAnim - 8) / 10) * (-29.62901-(-54.73884)));
            zz = 14.02983 + (((tickAnim - 8) / 10) * (28.29737-(14.02983)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 6.84958 + (((tickAnim - 18) / 1) * (9.23446-(6.84958)));
            yy = -29.62901 + (((tickAnim - 18) / 1) * (-39.37278-(-29.62901)));
            zz = 28.29737 + (((tickAnim - 18) / 1) * (39.24929-(28.29737)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 9.23446 + (((tickAnim - 19) / 6) * (6.74994-(9.23446)));
            yy = -39.37278 + (((tickAnim - 19) / 6) * (-20.47814-(-39.37278)));
            zz = 39.24929 + (((tickAnim - 19) / 6) * (-50.654-(39.24929)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.74994 + (((tickAnim - 25) / 5) * (31.15359-(6.74994)));
            yy = -20.47814 + (((tickAnim - 25) / 5) * (-36.44088-(-20.47814)));
            zz = -50.654 + (((tickAnim - 25) / 5) * (-46.89467-(-50.654)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.425 + (((tickAnim - 0) / 8) * (-0.585-(-0.425)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.7-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -0.585 + (((tickAnim - 8) / 10) * (0-(-0.585)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = -0.7 + (((tickAnim - 8) / 10) * (0-(-0.7)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-0.13-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.775-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.13 + (((tickAnim - 23) / 7) * (-0.425-(-0.13)));
            yy = 0.775 + (((tickAnim - 23) / 7) * (0-(0.775)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.23028 + (((tickAnim - 0) / 3) * (-3.55256-(-7.23028)));
            yy = 0.53586 + (((tickAnim - 0) / 3) * (0.72173-(0.53586)));
            zz = 29.96614 + (((tickAnim - 0) / 3) * (22.21915-(29.96614)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.55256 + (((tickAnim - 3) / 5) * (0-(-3.55256)));
            yy = 0.72173 + (((tickAnim - 3) / 5) * (0-(0.72173)));
            zz = 22.21915 + (((tickAnim - 3) / 5) * (0-(22.21915)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-3.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = -3.5 + (((tickAnim - 11) / 7) * (22-(-3.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-1.8148-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (3.13858-(0)));
            zz = 22 + (((tickAnim - 18) / 7) * (81.6918-(22)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -1.8148 + (((tickAnim - 25) / 5) * (-7.23028-(-1.8148)));
            yy = 3.13858 + (((tickAnim - 25) / 5) * (0.53586-(3.13858)));
            zz = 81.6918 + (((tickAnim - 25) / 5) * (29.96614-(81.6918)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.265-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.265 + (((tickAnim - 3) / 5) * (-0.325-(0.265)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 8) / 10) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0.65-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.5-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.65 + (((tickAnim - 23) / 7) * (0-(0.65)));
            yy = 0.5 + (((tickAnim - 23) / 7) * (0-(0.5)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5.84056 + (((tickAnim - 0) / 8) * (-85.58792-(5.84056)));
            yy = 3.96919 + (((tickAnim - 0) / 8) * (-25.52157-(3.96919)));
            zz = 3.42069 + (((tickAnim - 0) / 8) * (81.77351-(3.42069)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -85.58792 + (((tickAnim - 8) / 5) * (-192-(-85.58792)));
            yy = -25.52157 + (((tickAnim - 8) / 5) * (-7.75-(-25.52157)));
            zz = 81.77351 + (((tickAnim - 8) / 5) * (180-(81.77351)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -192 + (((tickAnim - 13) / 17) * (5.84056-(-192)));
            yy = -7.75 + (((tickAnim - 13) / 17) * (3.96919-(-7.75)));
            zz = 180 + (((tickAnim - 13) / 17) * (3.42069-(180)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 6.84958 + (((tickAnim - 0) / 2) * (9.23446-(6.84958)));
            yy = 29.62901 + (((tickAnim - 0) / 2) * (39.37278-(29.62901)));
            zz = -28.29737 + (((tickAnim - 0) / 2) * (-39.24929-(-28.29737)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 9.23446 + (((tickAnim - 2) / 6) * (6.74994-(9.23446)));
            yy = 39.37278 + (((tickAnim - 2) / 6) * (20.47814-(39.37278)));
            zz = -39.24929 + (((tickAnim - 2) / 6) * (50.654-(-39.24929)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.74994 + (((tickAnim - 8) / 5) * (31.15359-(6.74994)));
            yy = 20.47814 + (((tickAnim - 8) / 5) * (36.44088-(20.47814)));
            zz = 50.654 + (((tickAnim - 8) / 5) * (46.89467-(50.654)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 31.15359 + (((tickAnim - 13) / 10) * (12.95906-(31.15359)));
            yy = 36.44088 + (((tickAnim - 13) / 10) * (44.43935-(36.44088)));
            zz = 46.89467 + (((tickAnim - 13) / 10) * (-17.97031-(46.89467)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 12.95906 + (((tickAnim - 23) / 7) * (6.84958-(12.95906)));
            yy = 44.43935 + (((tickAnim - 23) / 7) * (29.62901-(44.43935)));
            zz = -17.97031 + (((tickAnim - 23) / 7) * (-28.29737-(-17.97031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.13-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0.13 + (((tickAnim - 4) / 9) * (0.875-(0.13)));
            yy = 0.775 + (((tickAnim - 4) / 9) * (0.05-(0.775)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0.875 + (((tickAnim - 13) / 10) * (0.585-(0.875)));
            yy = 0.05 + (((tickAnim - 13) / 10) * (-0.3-(0.05)));
            zz = 0 + (((tickAnim - 13) / 10) * (-0.175-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.585 + (((tickAnim - 23) / 7) * (0-(0.585)));
            yy = -0.3 + (((tickAnim - 23) / 7) * (0-(-0.3)));
            zz = -0.175 + (((tickAnim - 23) / 7) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.23028 + (((tickAnim - 0) / 3) * (-3.55256-(-7.23028)));
            yy = 0.53586 + (((tickAnim - 0) / 3) * (-0.72173-(0.53586)));
            zz = -29.96614 + (((tickAnim - 0) / 3) * (-22.21915-(-29.96614)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -3.55256 + (((tickAnim - 3) / 3) * (0-(-3.55256)));
            yy = -0.72173 + (((tickAnim - 3) / 3) * (0-(-0.72173)));
            zz = -22.21915 + (((tickAnim - 3) / 3) * (-73-(-22.21915)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-9.98028-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.53586-(0)));
            zz = -73 + (((tickAnim - 6) / 7) * (-29.96614-(-73)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9.98028 + (((tickAnim - 13) / 3) * (-10.51982-(-9.98028)));
            yy = 0.53586 + (((tickAnim - 13) / 3) * (0.58191-(0.53586)));
            zz = -29.96614 + (((tickAnim - 13) / 3) * (-29.46044-(-29.96614)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -10.51982 + (((tickAnim - 16) / 4) * (-13.74943-(-10.51982)));
            yy = 0.58191 + (((tickAnim - 16) / 4) * (2.15012-(0.58191)));
            zz = -29.46044 + (((tickAnim - 16) / 4) * (-16.42057-(-29.46044)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -13.74943 + (((tickAnim - 20) / 3) * (-6.17416-(-13.74943)));
            yy = 2.15012 + (((tickAnim - 20) / 3) * (3.80768-(2.15012)));
            zz = -16.42057 + (((tickAnim - 20) / 3) * (-2.63772-(-16.42057)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -6.17416 + (((tickAnim - 23) / 7) * (-7.23028-(-6.17416)));
            yy = 3.80768 + (((tickAnim - 23) / 7) * (0.53586-(3.80768)));
            zz = -2.63772 + (((tickAnim - 23) / 7) * (-29.96614-(-2.63772)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.735-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-0.675-(0)));
            yy = -0.735 + (((tickAnim - 3) / 3) * (0-(-0.735)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.675 + (((tickAnim - 6) / 7) * (0.2-(-0.675)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.2 + (((tickAnim - 13) / 3) * (0.425-(0.2)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.425 + (((tickAnim - 16) / 2) * (0.11-(0.425)));
            yy = -0.025 + (((tickAnim - 16) / 2) * (-0.285-(-0.025)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.11 + (((tickAnim - 18) / 2) * (0.11-(0.11)));
            yy = -0.285 + (((tickAnim - 18) / 2) * (-0.16-(-0.285)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.11 + (((tickAnim - 20) / 3) * (0-(0.11)));
            yy = -0.16 + (((tickAnim - 20) / 3) * (-0.4-(-0.16)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 23) / 7) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+100))*-4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+40))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*0.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-4));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-3), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArganaceras entity = (EntityPrehistoricFloraArganaceras) entitylivingbaseIn;
        int animCycle = 52;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.33573 + (((tickAnim - 0) / 8) * (25.5-(12.33573)));
            yy = 1.71858 + (((tickAnim - 0) / 8) * (0-(1.71858)));
            zz = -1.21601 + (((tickAnim - 0) / 8) * (0-(-1.21601)));
        }
        else if (tickAnim >= 8 && tickAnim < 28) {
            xx = 25.5 + (((tickAnim - 8) / 20) * (-32.26524-(25.5)));
            yy = 0 + (((tickAnim - 8) / 20) * (-6.13778-(0)));
            zz = 0 + (((tickAnim - 8) / 20) * (4.3429-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -32.26524 + (((tickAnim - 28) / 5) * (-21.51524-(-32.26524)));
            yy = -6.13778 + (((tickAnim - 28) / 5) * (-6.13778-(-6.13778)));
            zz = 4.3429 + (((tickAnim - 28) / 5) * (4.3429-(4.3429)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = -21.51524 + (((tickAnim - 33) / 20) * (12.33573-(-21.51524)));
            yy = -6.13778 + (((tickAnim - 33) / 20) * (1.71858-(-6.13778)));
            zz = 4.3429 + (((tickAnim - 33) / 20) * (-1.21601-(4.3429)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18.54 + (((tickAnim - 0) / 8) * (25.75-(18.54)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.75 + (((tickAnim - 8) / 5) * (35.17-(25.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 35.17 + (((tickAnim - 13) / 15) * (24.25-(35.17)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 24.25 + (((tickAnim - 28) / 5) * (0-(24.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 33) / 20) * (18.54-(0)));
            yy = 0 + (((tickAnim - 33) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 8) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = -0.6 + (((tickAnim - 8) / 14) * (0-(-0.6)));
            zz = 0.125 + (((tickAnim - 8) / 14) * (0-(0.125)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 28) / 25) * (0-(0)));
            yy = -0.6 + (((tickAnim - 28) / 25) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 28) / 25) * (0-(0)));
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
            xx = 2.08 + (((tickAnim - 0) / 8) * (20.75-(2.08)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20.75 + (((tickAnim - 8) / 5) * (36.97-(20.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 36.97 + (((tickAnim - 13) / 15) * (21.75-(36.97)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 21.75 + (((tickAnim - 28) / 5) * (21.52-(21.75)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 21.52 + (((tickAnim - 33) / 11) * (-2.3-(21.52)));
            yy = 0 + (((tickAnim - 33) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -2.3 + (((tickAnim - 44) / 9) * (2.08-(-2.3)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.605-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.09-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.605 + (((tickAnim - 13) / 5) * (1.89-(0.605)));
            zz = 0.09 + (((tickAnim - 13) / 5) * (0.06-(0.09)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.89 + (((tickAnim - 18) / 4) * (1.015-(1.89)));
            zz = 0.06 + (((tickAnim - 18) / 4) * (0.04-(0.06)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 1.015 + (((tickAnim - 22) / 6) * (0-(1.015)));
            zz = 0.04 + (((tickAnim - 22) / 6) * (0-(0.04)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            yy = -0.35 + (((tickAnim - 42) / 11) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -32.26524 + (((tickAnim - 0) / 6) * (-21.51524-(-32.26524)));
            yy = 6.13778 + (((tickAnim - 0) / 6) * (6.13778-(6.13778)));
            zz = -4.3429 + (((tickAnim - 0) / 6) * (-4.3429-(-4.3429)));
        }
        else if (tickAnim >= 6 && tickAnim < 32) {
            xx = -21.51524 + (((tickAnim - 6) / 26) * (25.5-(-21.51524)));
            yy = 6.13778 + (((tickAnim - 6) / 26) * (0-(6.13778)));
            zz = -4.3429 + (((tickAnim - 6) / 26) * (0-(-4.3429)));
        }
        else if (tickAnim >= 32 && tickAnim < 53) {
            xx = 25.5 + (((tickAnim - 32) / 21) * (-32.26524-(25.5)));
            yy = 0 + (((tickAnim - 32) / 21) * (6.13778-(0)));
            zz = 0 + (((tickAnim - 32) / 21) * (-4.3429-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 24.25 + (((tickAnim - 0) / 6) * (0-(24.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 6) / 26) * (25.75-(0)));
            yy = 0 + (((tickAnim - 6) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 26) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 25.75 + (((tickAnim - 32) / 6) * (35.17-(25.75)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 35.17 + (((tickAnim - 38) / 15) * (24.25-(35.17)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 32) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 32) * (0.125-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 32) / 16) * (0-(0)));
            yy = -0.6 + (((tickAnim - 32) / 16) * (0-(-0.6)));
            zz = 0.125 + (((tickAnim - 32) / 16) * (0-(0.125)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 5) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
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
            xx = 21.75 + (((tickAnim - 0) / 6) * (21.52-(21.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 21.52 + (((tickAnim - 6) / 12) * (-11.6-(21.52)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -11.6 + (((tickAnim - 18) / 14) * (20.75-(-11.6)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 20.75 + (((tickAnim - 32) / 6) * (36.97-(20.75)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 36.97 + (((tickAnim - 38) / 15) * (21.75-(36.97)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0.09-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.07 + (((tickAnim - 13) / 5) * (-0.75-(-0.07)));
            zz = 0.09 + (((tickAnim - 13) / 5) * (0.175-(0.09)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = -0.75 + (((tickAnim - 18) / 14) * (0-(-0.75)));
            zz = 0.175 + (((tickAnim - 18) / 14) * (0-(0.175)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 6) * (0.605-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0.09-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0.605 + (((tickAnim - 38) / 5) * (1.89-(0.605)));
            zz = 0.09 + (((tickAnim - 38) / 5) * (0.06-(0.09)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            yy = 1.89 + (((tickAnim - 43) / 5) * (1.015-(1.89)));
            zz = 0.06 + (((tickAnim - 43) / 5) * (0.04-(0.06)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 1.015 + (((tickAnim - 48) / 5) * (0-(1.015)));
            zz = 0.04 + (((tickAnim - 48) / 5) * (0-(0.04)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 32) {
            xx = -192 + (((tickAnim - 0) / 32) * (5.84056-(-192)));
            yy = 7.75 + (((tickAnim - 0) / 32) * (3.96919-(7.75)));
            zz = -180 + (((tickAnim - 0) / 32) * (3.42069-(-180)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 5.84056 + (((tickAnim - 32) / 12) * (-85.58792-(5.84056)));
            yy = 3.96919 + (((tickAnim - 32) / 12) * (25.52157-(3.96919)));
            zz = 3.42069 + (((tickAnim - 32) / 12) * (-81.77351-(3.42069)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -85.58792 + (((tickAnim - 44) / 9) * (-192-(-85.58792)));
            yy = 25.52157 + (((tickAnim - 44) / 9) * (7.75-(25.52157)));
            zz = -81.77351 + (((tickAnim - 44) / 9) * (-180-(-81.77351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 31.15359 + (((tickAnim - 0) / 13) * (5.96178-(31.15359)));
            yy = -36.44088 + (((tickAnim - 0) / 13) * (-54.73884-(-36.44088)));
            zz = -46.89467 + (((tickAnim - 0) / 13) * (14.02983-(-46.89467)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 5.96178 + (((tickAnim - 13) / 19) * (6.84958-(5.96178)));
            yy = -54.73884 + (((tickAnim - 13) / 19) * (-29.62901-(-54.73884)));
            zz = 14.02983 + (((tickAnim - 13) / 19) * (28.29737-(14.02983)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 6.84958 + (((tickAnim - 32) / 2) * (9.23446-(6.84958)));
            yy = -29.62901 + (((tickAnim - 32) / 2) * (-39.37278-(-29.62901)));
            zz = 28.29737 + (((tickAnim - 32) / 2) * (39.24929-(28.29737)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 9.23446 + (((tickAnim - 34) / 10) * (6.74994-(9.23446)));
            yy = -39.37278 + (((tickAnim - 34) / 10) * (-20.47814-(-39.37278)));
            zz = 39.24929 + (((tickAnim - 34) / 10) * (-50.654-(39.24929)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 6.74994 + (((tickAnim - 44) / 9) * (31.15359-(6.74994)));
            yy = -20.47814 + (((tickAnim - 44) / 9) * (-36.44088-(-20.47814)));
            zz = -50.654 + (((tickAnim - 44) / 9) * (-46.89467-(-50.654)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.425 + (((tickAnim - 0) / 13) * (-0.585-(-0.425)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.7-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = -0.585 + (((tickAnim - 13) / 19) * (0-(-0.585)));
            yy = 0 + (((tickAnim - 13) / 19) * (0-(0)));
            zz = -0.7 + (((tickAnim - 13) / 19) * (0-(-0.7)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 32) / 9) * (-0.13-(0)));
            yy = 0 + (((tickAnim - 32) / 9) * (0.775-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = -0.13 + (((tickAnim - 41) / 12) * (-0.425-(-0.13)));
            yy = 0.775 + (((tickAnim - 41) / 12) * (0-(0.775)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
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
            xx = -7.23028 + (((tickAnim - 0) / 6) * (-3.55256-(-7.23028)));
            yy = 0.53586 + (((tickAnim - 0) / 6) * (0.72173-(0.53586)));
            zz = 29.96614 + (((tickAnim - 0) / 6) * (22.21915-(29.96614)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -3.55256 + (((tickAnim - 6) / 7) * (0-(-3.55256)));
            yy = 0.72173 + (((tickAnim - 6) / 7) * (0-(0.72173)));
            zz = 22.21915 + (((tickAnim - 6) / 7) * (0-(22.21915)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-3.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = -3.5 + (((tickAnim - 18) / 14) * (22-(-3.5)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 32) / 12) * (-1.8148-(0)));
            yy = 0 + (((tickAnim - 32) / 12) * (3.13858-(0)));
            zz = 22 + (((tickAnim - 32) / 12) * (81.6918-(22)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -1.8148 + (((tickAnim - 44) / 9) * (-7.23028-(-1.8148)));
            yy = 3.13858 + (((tickAnim - 44) / 9) * (0.53586-(3.13858)));
            zz = 81.6918 + (((tickAnim - 44) / 9) * (29.96614-(81.6918)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.39-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.39 + (((tickAnim - 6) / 7) * (-0.325-(0.39)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 13) / 5) * (-0.855-(-0.325)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = -0.855 + (((tickAnim - 18) / 14) * (0-(-0.855)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 32) / 9) * (0.65-(0)));
            yy = 0 + (((tickAnim - 32) / 9) * (0.5-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = 0.65 + (((tickAnim - 41) / 12) * (0-(0.65)));
            yy = 0.5 + (((tickAnim - 41) / 12) * (0-(0.5)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
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
            xx = 5.84056 + (((tickAnim - 0) / 13) * (-85.58792-(5.84056)));
            yy = 3.96919 + (((tickAnim - 0) / 13) * (-25.52157-(3.96919)));
            zz = 3.42069 + (((tickAnim - 0) / 13) * (81.77351-(3.42069)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -85.58792 + (((tickAnim - 13) / 10) * (-192-(-85.58792)));
            yy = -25.52157 + (((tickAnim - 13) / 10) * (-7.75-(-25.52157)));
            zz = 81.77351 + (((tickAnim - 13) / 10) * (180-(81.77351)));
        }
        else if (tickAnim >= 23 && tickAnim < 53) {
            xx = -192 + (((tickAnim - 23) / 30) * (5.84056-(-192)));
            yy = -7.75 + (((tickAnim - 23) / 30) * (3.96919-(-7.75)));
            zz = 180 + (((tickAnim - 23) / 30) * (3.42069-(180)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.84958 + (((tickAnim - 0) / 3) * (9.23446-(6.84958)));
            yy = 29.62901 + (((tickAnim - 0) / 3) * (39.37278-(29.62901)));
            zz = -28.29737 + (((tickAnim - 0) / 3) * (-39.24929-(-28.29737)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 9.23446 + (((tickAnim - 3) / 10) * (6.74994-(9.23446)));
            yy = 39.37278 + (((tickAnim - 3) / 10) * (20.47814-(39.37278)));
            zz = -39.24929 + (((tickAnim - 3) / 10) * (50.654-(-39.24929)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 6.74994 + (((tickAnim - 13) / 10) * (31.15359-(6.74994)));
            yy = 20.47814 + (((tickAnim - 13) / 10) * (36.44088-(20.47814)));
            zz = 50.654 + (((tickAnim - 13) / 10) * (46.89467-(50.654)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 31.15359 + (((tickAnim - 23) / 17) * (12.95906-(31.15359)));
            yy = 36.44088 + (((tickAnim - 23) / 17) * (44.43935-(36.44088)));
            zz = 46.89467 + (((tickAnim - 23) / 17) * (-17.97031-(46.89467)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 12.95906 + (((tickAnim - 40) / 13) * (6.84958-(12.95906)));
            yy = 44.43935 + (((tickAnim - 40) / 13) * (29.62901-(44.43935)));
            zz = -17.97031 + (((tickAnim - 40) / 13) * (-28.29737-(-17.97031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.13-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0.13 + (((tickAnim - 8) / 15) * (0.875-(0.13)));
            yy = 0.775 + (((tickAnim - 8) / 15) * (0.05-(0.775)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0.875 + (((tickAnim - 23) / 17) * (0.585-(0.875)));
            yy = 0.05 + (((tickAnim - 23) / 17) * (-0.3-(0.05)));
            zz = 0 + (((tickAnim - 23) / 17) * (-0.175-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0.585 + (((tickAnim - 40) / 13) * (0-(0.585)));
            yy = -0.3 + (((tickAnim - 40) / 13) * (0-(-0.3)));
            zz = -0.175 + (((tickAnim - 40) / 13) * (0-(-0.175)));
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
            xx = -7.23028 + (((tickAnim - 0) / 5) * (-3.55256-(-7.23028)));
            yy = 0.53586 + (((tickAnim - 0) / 5) * (-0.72173-(0.53586)));
            zz = -29.96614 + (((tickAnim - 0) / 5) * (-22.21915-(-29.96614)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.55256 + (((tickAnim - 5) / 5) * (0-(-3.55256)));
            yy = -0.72173 + (((tickAnim - 5) / 5) * (0-(-0.72173)));
            zz = -22.21915 + (((tickAnim - 5) / 5) * (-73-(-22.21915)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-9.98028-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0.53586-(0)));
            zz = -73 + (((tickAnim - 10) / 13) * (-29.96614-(-73)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -9.98028 + (((tickAnim - 23) / 5) * (-10.51982-(-9.98028)));
            yy = 0.53586 + (((tickAnim - 23) / 5) * (0.58191-(0.53586)));
            zz = -29.96614 + (((tickAnim - 23) / 5) * (-29.46044-(-29.96614)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -10.51982 + (((tickAnim - 28) / 7) * (-13.74943-(-10.51982)));
            yy = 0.58191 + (((tickAnim - 28) / 7) * (2.15012-(0.58191)));
            zz = -29.46044 + (((tickAnim - 28) / 7) * (-16.42057-(-29.46044)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -13.74943 + (((tickAnim - 35) / 5) * (-6.17416-(-13.74943)));
            yy = 2.15012 + (((tickAnim - 35) / 5) * (3.80768-(2.15012)));
            zz = -16.42057 + (((tickAnim - 35) / 5) * (-2.63772-(-16.42057)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -6.17416 + (((tickAnim - 40) / 13) * (-7.23028-(-6.17416)));
            yy = 3.80768 + (((tickAnim - 40) / 13) * (0.53586-(3.80768)));
            zz = -2.63772 + (((tickAnim - 40) / 13) * (-29.96614-(-2.63772)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.735-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-0.675-(0)));
            yy = -0.735 + (((tickAnim - 5) / 5) * (0-(-0.735)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -0.675 + (((tickAnim - 10) / 13) * (0.2-(-0.675)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0.2 + (((tickAnim - 23) / 5) * (0.425-(0.2)));
            yy = 0 + (((tickAnim - 23) / 5) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0.425 + (((tickAnim - 28) / 4) * (0.11-(0.425)));
            yy = -0.2 + (((tickAnim - 28) / 4) * (-0.285-(-0.2)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0.11 + (((tickAnim - 32) / 3) * (0.11-(0.11)));
            yy = -0.285 + (((tickAnim - 32) / 3) * (-0.285-(-0.285)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.11 + (((tickAnim - 35) / 5) * (0-(0.11)));
            yy = -0.285 + (((tickAnim - 35) / 5) * (-0.4-(-0.285)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = -0.4 + (((tickAnim - 40) / 13) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137+150))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137+100))*-2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5+40))*-0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5-100))*0.35);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5-50))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-50))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-50))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5-100))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-100))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5-150))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-150))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-150))*-4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5-100))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137+150))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137+80))*3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5-150))*1), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-100))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-50))*-2));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5-250))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-100))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137-50))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5-350))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*137/0.5-450))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraArganaceras ee = (EntityPrehistoricFloraArganaceras) entitylivingbaseIn;

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
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraArganaceras e = (EntityPrehistoricFloraArganaceras) entity;

    }
}
