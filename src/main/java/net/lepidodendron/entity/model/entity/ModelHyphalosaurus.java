package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHyphalosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHyphalosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer frontrightleg1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontleftleg1;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backleftleg1;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer backrightleg1;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r44;

    private ModelAnimator animator;

    public ModelHyphalosaurus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.0F, 3.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.2289F, 2.3702F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 12, -1.5F, -2.0F, -4.0F, 3, 2, 4, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.1121F, -1.4403F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 8, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -1.75F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 12, 5, -2.0F, -0.3621F, -2.6903F, 4, 3, 3, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.body.addChild(chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.084F, -3.3788F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 15, -1.5F, -2.225F, 0.05F, 3, 2, 4, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.1007F, -2.9289F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 29, -1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.65F, -2.8F);
        this.chest.addChild(neck1);
        this.neck1.cubeList.add(new ModelBox(neck1, 24, 1, -1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -0.5F, -4.0F);
        this.neck1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0611F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 18, -0.5F, 0.0F, 0.0F, 2, 1, 4, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.5F, -4.0F);
        this.neck1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.192F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 6, -1.5F, -1.0F, 0.0F, 2, 1, 4, -0.001F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck1.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 20, 22, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.05F, -5.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 24, 29, -1.5F, -0.5F, -0.9F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 0, -1.0F, -0.5F, -3.825F, 1, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.7658F, -0.8366F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 30, -1.0F, 0.0087F, -0.0008F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, -3.875F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 13, -1.0F, 0.0087F, 0.0492F, 1, 1, 3, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -1.4F, -3.875F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1571F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 28, 0.0121F, 0.9F, 0.0485F, 1, 1, 3, -0.002F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.4F, -3.875F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1571F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 28, -1.0121F, 0.9F, 0.0485F, 1, 1, 3, -0.002F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.025F, -0.125F, -1.2F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 5, 30, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 5, 30, -1.6F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5012F, -0.3949F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 24, -1.5F, -0.5262F, -0.5051F, 2, 1, 1, -0.009F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 33, -1.0F, -0.5262F, -3.1551F, 1, 1, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.99F, 0.4638F, -3.1451F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1178F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 8, 0.015F, -1.44F, 1.49F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.99F, 0.4638F, -3.1451F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.1527F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 24, -0.01F, -0.99F, -0.01F, 1, 1, 3, -0.012F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.01F, 0.4638F, -3.1451F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1178F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 8, -0.015F, -1.44F, 1.49F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.01F, 0.4638F, -3.1451F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.1527F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 24, -0.99F, -0.99F, -0.01F, 1, 1, 3, -0.012F, false));

        this.frontrightleg1 = new AdvancedModelRenderer(this);
        this.frontrightleg1.setRotationPoint(-0.8848F, 1.2485F, -3.0F);
        this.chest.addChild(frontrightleg1);
        this.setRotateAngle(frontrightleg1, 0.0F, 0.0F, -0.1309F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.0152F, 0.0015F, 0.0F);
        this.frontrightleg1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 1.5708F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 35, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.01F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-2.0152F, 0.0015F, 0.0F);
        this.frontrightleg1.addChild(frontrightleg2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontrightleg2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4363F, 0.0F, 1.5708F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 0, -0.5F, -0.25F, -0.6F, 1, 2, 1, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-1.2F, 0.1F, -0.65F);
        this.frontrightleg2.addChild(frontrightleg3);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.2F, -0.1F, 0.65F);
        this.frontrightleg3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4363F, 0.0F, 1.5708F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 35, 0.0F, 1.5F, -1.1F, 0, 2, 2, 0.0F, true));

        this.frontleftleg1 = new AdvancedModelRenderer(this);
        this.frontleftleg1.setRotationPoint(0.8848F, 1.2485F, -3.0F);
        this.chest.addChild(frontleftleg1);
        this.setRotateAngle(frontleftleg1, 0.0F, 0.0F, 0.1309F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0152F, 0.0015F, 0.0F);
        this.frontleftleg1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -1.5708F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 35, 35, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.01F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(2.0152F, 0.0015F, 0.0F);
        this.frontleftleg1.addChild(frontleftleg2);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontleftleg2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.4363F, 0.0F, -1.5708F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 33, 0, -0.5F, -0.25F, -0.6F, 1, 2, 1, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(1.2F, 0.1F, -0.65F);
        this.frontleftleg2.addChild(frontleftleg3);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.2F, -0.1F, 0.65F);
        this.frontleftleg3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.4363F, 0.0F, -1.5708F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 35, 0.0F, 1.5F, -1.1F, 0, 2, 2, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.65F, -2.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, -0.2618F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 7, 36, -1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -0.5F, -4.0F);
        this.neck3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0611F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 17, 38, -0.5F, 0.0F, 0.0F, 2, 1, 4, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.5F, -4.0F);
        this.neck3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.192F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 36, -1.5F, -1.0F, 0.0F, 2, 1, 4, -0.001F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck3.addChild(neck4);
        this.neck4.cubeList.add(new ModelBox(neck4, 36, 42, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.5F, -0.05F, -5.0F);
        this.neck4.addChild(head2);
        this.setRotateAngle(head2, 0.0F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 0, 41, -1.5F, -0.5F, -0.9F, 2, 1, 1, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 40, 17, -1.0F, -0.5F, -3.825F, 1, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.7658F, -0.8366F);
        this.head2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3054F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 44, -1.0F, 0.0087F, -0.0008F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.5F, -3.875F);
        this.head2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 27, 44, -1.0F, 0.0087F, 0.0492F, 1, 1, 3, -0.001F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, -1.4F, -3.875F);
        this.head2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.1571F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 44, 0.0121F, 0.9F, 0.0485F, 1, 1, 3, -0.002F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.4F, -3.875F);
        this.head2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.1571F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 18, 44, -1.0121F, 0.9F, 0.0485F, 1, 1, 3, -0.002F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(0.025F, -0.125F, -1.2F);
        this.head2.addChild(eye2);
        this.eye2.cubeList.add(new ModelBox(eye2, 6, 44, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eye2.cubeList.add(new ModelBox(eye2, 6, 44, -1.6F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.5012F, -0.3949F);
        this.head2.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 10, 41, -1.5F, -0.5262F, -0.5051F, 2, 1, 1, -0.009F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 9, 44, -1.0F, -0.5262F, -3.1551F, 1, 1, 3, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.99F, 0.4638F, -3.1451F);
        this.jaw2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.1178F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 41, 0.015F, -1.44F, 1.49F, 0, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.99F, 0.4638F, -3.1451F);
        this.jaw2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.1527F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 44, -0.01F, -0.99F, -0.01F, 1, 1, 3, -0.012F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.01F, 0.4638F, -3.1451F);
        this.jaw2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.1178F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 7, 41, -0.015F, -1.44F, 1.49F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.01F, 0.4638F, -3.1451F);
        this.jaw2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.1527F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 44, -0.99F, -0.99F, -0.01F, 1, 1, 3, -0.012F, false));

        this.backleftleg1 = new AdvancedModelRenderer(this);
        this.backleftleg1.setRotationPoint(0.9848F, 0.4985F, 1.5F);
        this.main.addChild(backleftleg1);
        this.setRotateAngle(backleftleg1, 0.0F, 0.0F, 0.1745F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0152F, 0.0015F, 0.0F);
        this.backleftleg1.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -1.5708F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 22, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.01F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(2.0152F, 0.0015F, 0.0F);
        this.backleftleg1.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, -0.3491F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backleftleg2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4363F, 0.0F, -1.5708F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -0.5F, -0.25F, -0.4F, 1, 2, 1, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(1.5429F, 0.019F, 0.8883F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 1.5523F, -0.0395F, 0.4367F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.2F, -0.1F, -0.65F);
        this.backleftleg3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.4363F, 0.0F, -1.5708F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 17, 19, 0.0F, 1.0F, -0.9F, 0, 2, 2, 0.0F, false));

        this.backrightleg1 = new AdvancedModelRenderer(this);
        this.backrightleg1.setRotationPoint(-0.9848F, 0.4985F, 1.5F);
        this.main.addChild(backrightleg1);
        this.setRotateAngle(backrightleg1, 0.0F, 0.0F, -0.1745F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.0152F, 0.0015F, 0.0F);
        this.backrightleg1.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 1.5708F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 22, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.01F, true));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-2.0152F, 0.0015F, 0.0F);
        this.backrightleg1.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.0F, 0.3491F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backrightleg2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.4363F, 0.0F, 1.5708F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, -0.5F, -0.25F, -0.4F, 1, 2, 1, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(-1.5429F, 0.019F, 0.8883F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 1.5523F, 0.0395F, -0.4367F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.2F, -0.1F, -0.65F);
        this.backrightleg3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.4363F, 0.0F, 1.5708F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 17, 19, 0.0F, 1.0F, -0.9F, 0, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2507F, 2.1789F);
        this.main.addChild(tail);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.tail.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 0, -1.5F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 4.75F);
        this.tail.addChild(tail2);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.tail2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 19, 28, 0.0F, -1.0F, 10.0F, 0, 2, 5, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.5F, -10.0F);
        this.tail2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 23, -0.5F, 1.0F, 10.0F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail2.addChild(tail3);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.5F, -17.0F);
        this.tail3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 10, 19, 0.0F, -2.0F, 17.0F, 0, 3, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -1.5F, -15.0F);
        this.tail3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 22, 7, -0.5F, 1.0F, 15.0F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0F, -17.0F);
        this.tail4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 8, 28, 0.0F, -1.0F, 17.0F, 0, 2, 5, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -1.5F, -15.0F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 21, 14, -0.5F, 1.0F, 15.0F, 1, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -1.5F, -15.0F);
        this.tail5.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 10, 0, -0.5F, 1.0F, 15.0F, 1, 1, 3, 0.0F, false));


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
        this.main.offsetY = -2.0F;
        this.main.offsetX = -1.338F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.63F;
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
        this.main.offsetY = 0.0F;

        EntityPrehistoricFloraHyphalosaurus proteros = (EntityPrehistoricFloraHyphalosaurus) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, head};
        AdvancedModelRenderer[] Neck2 = {this.neck3, this.neck4, head2};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            this.chainSwing(Neck2, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck2, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.chainSwing(Neck2, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck2, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
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
        EntityPrehistoricFloraHyphalosaurus ee = (EntityPrehistoricFloraHyphalosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHyphalosaurus entity = (EntityPrehistoricFloraHyphalosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.75 + (((tickAnim - 5) / 5) * (-2.5-(1.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 10) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.75 + (((tickAnim - 5) / 5) * (3.5-(-1.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 10) / 10) * (0-(3.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.75 + (((tickAnim - 5) / 5) * (5.5-(-2.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.5 + (((tickAnim - 10) / 10) * (0-(5.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 22.25 + (((tickAnim - 5) / 5) * (0-(22.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (23.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 23.75 + (((tickAnim - 15) / 5) * (0-(23.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.75 + (((tickAnim - 5) / 5) * (-2.5-(1.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 10) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.75 + (((tickAnim - 5) / 5) * (3.5-(-1.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 10) / 10) * (0-(3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.75 + (((tickAnim - 5) / 5) * (5.5-(-2.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.5 + (((tickAnim - 10) / 10) * (0-(5.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 22.25 + (((tickAnim - 5) / 5) * (0-(22.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (23.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 23.75 + (((tickAnim - 15) / 5) * (0-(23.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw2, jaw2.rotateAngleX + (float) Math.toRadians(xx), jaw2.rotateAngleY + (float) Math.toRadians(yy), jaw2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHyphalosaurus entity = (EntityPrehistoricFloraHyphalosaurus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+150))*2), neck1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+200))*2), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+250))*2), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftleg1, frontleftleg1.rotateAngleX + (float) Math.toRadians(57.03458), frontleftleg1.rotateAngleY + (float) Math.toRadians(-40.8471), frontleftleg1.rotateAngleZ + (float) Math.toRadians(9.2662));
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(20.70821), frontleftleg2.rotateAngleY + (float) Math.toRadians(-3.5678), frontleftleg2.rotateAngleZ + (float) Math.toRadians(37.8479+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*4));
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(0), frontleftleg3.rotateAngleY + (float) Math.toRadians(0), frontleftleg3.rotateAngleZ + (float) Math.toRadians(16.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-40))*5));
        this.setRotateAngle(frontrightleg1, frontrightleg1.rotateAngleX + (float) Math.toRadians(57.03458), frontrightleg1.rotateAngleY + (float) Math.toRadians(40.84707), frontrightleg1.rotateAngleZ + (float) Math.toRadians(-9.26625));
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(20.70821), frontrightleg2.rotateAngleY + (float) Math.toRadians(3.56782), frontrightleg2.rotateAngleZ + (float) Math.toRadians(-37.8479+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*4));
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(0), frontrightleg3.rotateAngleY + (float) Math.toRadians(0), frontrightleg3.rotateAngleZ + (float) Math.toRadians(-16.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-40))*5));
        this.setRotateAngle(backleftleg1, backleftleg1.rotateAngleX + (float) Math.toRadians(-15.66831), backleftleg1.rotateAngleY + (float) Math.toRadians(-43.2844), backleftleg1.rotateAngleZ + (float) Math.toRadians(22.2497));
        this.setRotateAngle(backrightleg1, backrightleg1.rotateAngleX + (float) Math.toRadians(-15.66831), backrightleg1.rotateAngleY + (float) Math.toRadians(43.28441), backrightleg1.rotateAngleZ + (float) Math.toRadians(-22.24971));
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(0), backrightleg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*2), backrightleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(0), backrightleg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))*4), backrightleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*4), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*8), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*12), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+100))*2), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+50))*2), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(-6.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+150))*2), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+200))*2), neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(0), head2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+250))*2), head2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(0), backleftleg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*2), backleftleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(0), backleftleg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))*4), backleftleg3.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHyphalosaurus entity = (EntityPrehistoricFloraHyphalosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*4));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*4), neck1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+200))*4), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*4), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftleg1, frontleftleg1.rotateAngleX + (float) Math.toRadians(57.03458), frontleftleg1.rotateAngleY + (float) Math.toRadians(-40.8471), frontleftleg1.rotateAngleZ + (float) Math.toRadians(9.2662));
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(20.70821), frontleftleg2.rotateAngleY + (float) Math.toRadians(-3.5678), frontleftleg2.rotateAngleZ + (float) Math.toRadians(37.8479+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*4));
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(0), frontleftleg3.rotateAngleY + (float) Math.toRadians(0), frontleftleg3.rotateAngleZ + (float) Math.toRadians(16.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-40))*5));
        this.setRotateAngle(frontrightleg1, frontrightleg1.rotateAngleX + (float) Math.toRadians(57.03458), frontrightleg1.rotateAngleY + (float) Math.toRadians(40.84707), frontrightleg1.rotateAngleZ + (float) Math.toRadians(-9.26625));
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(20.70821), frontrightleg2.rotateAngleY + (float) Math.toRadians(3.56782), frontrightleg2.rotateAngleZ + (float) Math.toRadians(-37.8479+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*4));
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(0), frontrightleg3.rotateAngleY + (float) Math.toRadians(0), frontrightleg3.rotateAngleZ + (float) Math.toRadians(-16.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-40))*5));
        this.setRotateAngle(backleftleg1, backleftleg1.rotateAngleX + (float) Math.toRadians(-15.66831), backleftleg1.rotateAngleY + (float) Math.toRadians(-43.2844), backleftleg1.rotateAngleZ + (float) Math.toRadians(22.2497));
        this.setRotateAngle(backrightleg1, backrightleg1.rotateAngleX + (float) Math.toRadians(-15.66831), backrightleg1.rotateAngleY + (float) Math.toRadians(43.28441), backrightleg1.rotateAngleZ + (float) Math.toRadians(-22.24971));
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(0), backrightleg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*2), backrightleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(0), backrightleg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-70))*4), backrightleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*8), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*12), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*16), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*16), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*4), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*4), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(0), backleftleg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*2), backleftleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(0), backleftleg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-70))*4), backleftleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(-5.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*4), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+200))*4), neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(0), head2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*4), head2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHyphalosaurus entity = (EntityPrehistoricFloraHyphalosaurus) entitylivingbaseIn;
       
    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHyphalosaurus e = (EntityPrehistoricFloraHyphalosaurus) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(10);
            animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.head2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(10);
            animator.resetKeyframe(10);

    }
}
