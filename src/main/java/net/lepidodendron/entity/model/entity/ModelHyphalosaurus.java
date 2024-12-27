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
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer frontrightleg1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer frontleftleg1;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer backleftleg1;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer backrightleg1;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r42;

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
        this.neck2.cubeList.add(new ModelBox(neck2, 24, 26, -0.5F, -0.5F, -6.0F, 1, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.05F, -5.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 24, 29, -1.5F, -0.5F, -1.65F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 0, -1.0F, -0.5F, -3.825F, 1, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 30, -1.0F, -0.6571F, -1.8374F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.5F, -3.875F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 14, -1.0F, 0.0087F, 0.0492F, 1, 1, 2, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -1.4F, -3.875F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1571F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 28, 0.0121F, 0.9F, 0.0485F, 1, 1, 3, -0.002F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.4F, -3.875F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1571F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 28, -1.0121F, 0.9F, 0.0485F, 1, 1, 3, -0.002F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.025F, -0.125F, -1.95F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 5, 30, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 5, 30, -1.6F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.5012F, -0.6449F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 24, -1.0F, -0.5262F, -1.0051F, 2, 1, 1, -0.009F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 1, 34, -0.5F, -0.5262F, -2.9051F, 1, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.49F, 0.4638F, -2.8951F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1178F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 8, 0.015F, -1.44F, 1.49F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.49F, 0.4638F, -2.8951F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1527F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 25, -0.01F, -0.99F, -0.01F, 1, 1, 2, -0.012F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.49F, 0.4638F, -2.8951F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1178F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 8, -0.015F, -1.44F, 1.49F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.49F, 0.4638F, -2.8951F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1527F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 25, -0.99F, -0.99F, -0.01F, 1, 1, 2, -0.012F, false));

        this.frontrightleg1 = new AdvancedModelRenderer(this);
        this.frontrightleg1.setRotationPoint(-0.8848F, 1.2485F, -3.0F);
        this.chest.addChild(frontrightleg1);
        this.setRotateAngle(frontrightleg1, 0.0F, 0.0F, -0.1309F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.0152F, 0.0015F, 0.0F);
        this.frontrightleg1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 1.5708F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 35, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.01F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-2.0152F, 0.0015F, 0.0F);
        this.frontrightleg1.addChild(frontrightleg2);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontrightleg2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4363F, 0.0F, 1.5708F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 0, -0.5F, -0.25F, -0.6F, 1, 2, 1, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-1.2F, 0.1F, -0.65F);
        this.frontrightleg2.addChild(frontrightleg3);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.2F, -0.1F, 0.65F);
        this.frontrightleg3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4363F, 0.0F, 1.5708F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 35, 0.0F, 1.5F, -1.1F, 0, 2, 2, 0.0F, true));

        this.frontleftleg1 = new AdvancedModelRenderer(this);
        this.frontleftleg1.setRotationPoint(0.8848F, 1.2485F, -3.0F);
        this.chest.addChild(frontleftleg1);
        this.setRotateAngle(frontleftleg1, 0.0F, 0.0F, 0.1309F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0152F, 0.0015F, 0.0F);
        this.frontleftleg1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -1.5708F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 35, 35, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.01F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(2.0152F, 0.0015F, 0.0F);
        this.frontleftleg1.addChild(frontleftleg2);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontleftleg2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4363F, 0.0F, -1.5708F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 33, 0, -0.5F, -0.25F, -0.6F, 1, 2, 1, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(1.2F, 0.1F, -0.65F);
        this.frontleftleg2.addChild(frontleftleg3);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.2F, -0.1F, 0.65F);
        this.frontleftleg3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.4363F, 0.0F, -1.5708F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 35, 0.0F, 1.5F, -1.1F, 0, 2, 2, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.65F, -2.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, -0.2618F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 7, 36, -1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.5F, -4.0F);
        this.neck3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0611F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 38, -0.5F, 0.0F, 0.0F, 2, 1, 4, -0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.5F, -4.0F);
        this.neck3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.192F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 36, -1.5F, -1.0F, 0.0F, 2, 1, 4, -0.001F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck3.addChild(neck4);
        this.neck4.cubeList.add(new ModelBox(neck4, 36, 42, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.neck4.cubeList.add(new ModelBox(neck4, 40, 46, -0.5F, -0.5F, -6.0F, 1, 1, 1, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.5F, -0.05F, -5.0F);
        this.neck4.addChild(head2);
        this.setRotateAngle(head2, 0.0F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 0, 41, -1.5F, -0.5F, -1.65F, 2, 1, 1, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 40, 17, -1.0F, -0.5F, -3.825F, 1, 1, 3, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 15, 44, -1.0F, -0.6571F, -1.8374F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.5F, -3.875F);
        this.head2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 45, -1.0F, 0.0087F, 0.0492F, 1, 1, 2, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, -1.4F, -3.875F);
        this.head2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1571F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 45, 0.0121F, 0.9F, 0.0485F, 1, 1, 2, -0.002F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -1.4F, -3.875F);
        this.head2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.1571F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 45, -1.0121F, 0.9F, 0.0485F, 1, 1, 2, -0.002F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(0.025F, -0.125F, -1.95F);
        this.head2.addChild(eye2);
        this.eye2.cubeList.add(new ModelBox(eye2, 6, 44, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eye2.cubeList.add(new ModelBox(eye2, 6, 44, -1.6F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(-0.5F, 0.5012F, -0.8949F);
        this.head2.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 10, 41, -1.0F, -0.5262F, -1.0051F, 2, 1, 1, -0.009F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 10, 45, -0.5F, -0.5262F, -2.6551F, 1, 1, 2, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.49F, 0.4638F, -2.6451F);
        this.jaw2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.1178F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 41, 0.015F, -1.44F, 1.49F, 0, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.49F, 0.4638F, -2.6451F);
        this.jaw2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.1527F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 1, 45, -0.01F, -0.99F, -0.01F, 1, 1, 2, -0.012F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.49F, 0.4638F, -2.6451F);
        this.jaw2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.1178F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 41, -0.015F, -1.44F, 1.49F, 0, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.49F, 0.4638F, -2.6451F);
        this.jaw2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.1527F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 1, 45, -0.99F, -0.99F, -0.01F, 1, 1, 2, -0.012F, false));

        this.backleftleg1 = new AdvancedModelRenderer(this);
        this.backleftleg1.setRotationPoint(0.9848F, 0.4985F, 1.5F);
        this.main.addChild(backleftleg1);
        this.setRotateAngle(backleftleg1, 0.0F, 0.0F, 0.1745F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0152F, 0.0015F, 0.0F);
        this.backleftleg1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -1.5708F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 22, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.01F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(2.0152F, 0.0015F, 0.0F);
        this.backleftleg1.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, -0.3491F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backleftleg2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4363F, 0.0F, -1.5708F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -0.5F, -0.25F, -0.4F, 1, 2, 1, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(1.5429F, 0.019F, 0.8883F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 1.5523F, -0.0395F, 0.4367F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.2F, -0.1F, -0.65F);
        this.backleftleg3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4363F, 0.0F, -1.5708F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 17, 19, 0.0F, 1.0F, -0.9F, 0, 2, 2, 0.0F, false));

        this.backrightleg1 = new AdvancedModelRenderer(this);
        this.backrightleg1.setRotationPoint(-0.9848F, 0.4985F, 1.5F);
        this.main.addChild(backrightleg1);
        this.setRotateAngle(backrightleg1, 0.0F, 0.0F, -0.1745F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.0152F, 0.0015F, 0.0F);
        this.backrightleg1.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 1.5708F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 22, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.01F, true));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-2.0152F, 0.0015F, 0.0F);
        this.backrightleg1.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.0F, 0.3491F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backrightleg2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.4363F, 0.0F, 1.5708F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -0.5F, -0.25F, -0.4F, 1, 2, 1, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(-1.5429F, 0.019F, 0.8883F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 1.5523F, 0.0395F, -0.4367F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.2F, -0.1F, -0.65F);
        this.backrightleg3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.4363F, 0.0F, 1.5708F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 17, 19, 0.0F, 1.0F, -0.9F, 0, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2507F, 2.1789F);
        this.main.addChild(tail);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.tail.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, -1.5F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 4.75F);
        this.tail.addChild(tail2);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 28, 0.0F, -1.0F, 10.0F, 0, 2, 5, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -1.5F, -10.0F);
        this.tail2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 23, -0.5F, 1.0F, 10.0F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail2.addChild(tail3);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.5F, -17.0F);
        this.tail3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 10, 19, 0.0F, -2.0F, 17.0F, 0, 3, 5, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.5F, -15.0F);
        this.tail3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 22, 7, -0.5F, 1.0F, 15.0F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, -17.0F);
        this.tail4.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 8, 28, 0.0F, -1.0F, 17.0F, 0, 2, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -1.5F, -15.0F);
        this.tail4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 21, 14, -0.5F, 1.0F, 15.0F, 1, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -1.5F, -15.0F);
        this.tail5.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 10, 0, -0.5F, 1.0F, 15.0F, 1, 1, 3, 0.0F, false));


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
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-6), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*5), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(7), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*5), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-8), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-5), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-2.75), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-350))*5), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 68.34851 + (((tickAnim - 0) / 8) * (24.0849-(68.34851)));
            yy = 50.0852 + (((tickAnim - 0) / 8) * (-4.70602-(50.0852)));
            zz = 13.31921 + (((tickAnim - 0) / 8) * (25.38216-(13.31921)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 24.0849 + (((tickAnim - 8) / 6) * (13.05153-(24.0849)));
            yy = -4.70602 + (((tickAnim - 8) / 6) * (-34.3552-(-4.70602)));
            zz = 25.38216 + (((tickAnim - 8) / 6) * (-25.3104-(25.38216)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 13.05153 + (((tickAnim - 14) / 9) * (70.9024-(13.05153)));
            yy = -34.3552 + (((tickAnim - 14) / 9) * (19.62216-(-34.3552)));
            zz = -25.3104 + (((tickAnim - 14) / 9) * (12.79267-(-25.3104)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 70.9024 + (((tickAnim - 23) / 7) * (68.34851-(70.9024)));
            yy = 19.62216 + (((tickAnim - 23) / 7) * (50.0852-(19.62216)));
            zz = 12.79267 + (((tickAnim - 23) / 7) * (13.31921-(12.79267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg1, frontrightleg1.rotateAngleX + (float) Math.toRadians(xx), frontrightleg1.rotateAngleY + (float) Math.toRadians(yy), frontrightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 23.37535 + (((tickAnim - 0) / 8) * (15.60704-(23.37535)));
            yy = 2.48802 + (((tickAnim - 0) / 8) * (7.14378-(2.48802)));
            zz = -5.73524 + (((tickAnim - 0) / 8) * (-15.21811-(-5.73524)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 15.60704 + (((tickAnim - 8) / 3) * (5.50086-(15.60704)));
            yy = 7.14378 + (((tickAnim - 8) / 3) * (-0.44411-(7.14378)));
            zz = -15.21811 + (((tickAnim - 8) / 3) * (15.91182-(-15.21811)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 5.50086 + (((tickAnim - 11) / 3) * (11.5-(5.50086)));
            yy = -0.44411 + (((tickAnim - 11) / 3) * (0-(-0.44411)));
            zz = 15.91182 + (((tickAnim - 11) / 3) * (14.5-(15.91182)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 11.5 + (((tickAnim - 14) / 9) * (53.1923-(11.5)));
            yy = 0 + (((tickAnim - 14) / 9) * (-25.10108-(0)));
            zz = 14.5 + (((tickAnim - 14) / 9) * (-43.82746-(14.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 53.1923 + (((tickAnim - 23) / 7) * (23.37535-(53.1923)));
            yy = -25.10108 + (((tickAnim - 23) / 7) * (2.48802-(-25.10108)));
            zz = -43.82746 + (((tickAnim - 23) / 7) * (-5.73524-(-43.82746)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.93678-(0)));
            yy = 22 + (((tickAnim - 0) / 8) * (-2.59637-(22)));
            zz = -10.75 + (((tickAnim - 0) / 8) * (-28.3451-(-10.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0.93678 + (((tickAnim - 8) / 6) * (-2.60668-(0.93678)));
            yy = -2.59637 + (((tickAnim - 8) / 6) * (-24.61762-(-2.59637)));
            zz = -28.3451 + (((tickAnim - 8) / 6) * (9.65746-(-28.3451)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -2.60668 + (((tickAnim - 14) / 1) * (-14.86302-(-2.60668)));
            yy = -24.61762 + (((tickAnim - 14) / 1) * (-19.71949-(-24.61762)));
            zz = 9.65746 + (((tickAnim - 14) / 1) * (22.67279-(9.65746)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -14.86302 + (((tickAnim - 15) / 2) * (-35.85267-(-14.86302)));
            yy = -19.71949 + (((tickAnim - 15) / 2) * (-14.61626-(-19.71949)));
            zz = 22.67279 + (((tickAnim - 15) / 2) * (36.8054-(22.67279)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -35.85267 + (((tickAnim - 17) / 1) * (-43.71513-(-35.85267)));
            yy = -14.61626 + (((tickAnim - 17) / 1) * (-10.59504-(-14.61626)));
            zz = 36.8054 + (((tickAnim - 17) / 1) * (46.66243-(36.8054)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -43.71513 + (((tickAnim - 18) / 1) * (-59.23375-(-43.71513)));
            yy = -10.59504 + (((tickAnim - 18) / 1) * (-3.58857-(-10.59504)));
            zz = 46.66243 + (((tickAnim - 18) / 1) * (65.27225-(46.66243)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -59.23375 + (((tickAnim - 19) / 4) * (-45.65858-(-59.23375)));
            yy = -3.58857 + (((tickAnim - 19) / 4) * (8.87918-(-3.58857)));
            zz = 65.27225 + (((tickAnim - 19) / 4) * (80.57167-(65.27225)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -45.65858 + (((tickAnim - 23) / 7) * (0-(-45.65858)));
            yy = 8.87918 + (((tickAnim - 23) / 7) * (22-(8.87918)));
            zz = 80.57167 + (((tickAnim - 23) / 7) * (-10.75-(80.57167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0.175 + (((tickAnim - 17) / 13) * (0-(0.175)));
            zz = 0.45 + (((tickAnim - 17) / 13) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 13.05153 + (((tickAnim - 0) / 16) * (68.34851-(13.05153)));
            yy = 34.3552 + (((tickAnim - 0) / 16) * (-50.0852-(34.3552)));
            zz = 25.3104 + (((tickAnim - 0) / 16) * (-13.3192-(25.3104)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 68.34851 + (((tickAnim - 16) / 7) * (24.0849-(68.34851)));
            yy = -50.0852 + (((tickAnim - 16) / 7) * (-4.70602-(-50.0852)));
            zz = -13.3192 + (((tickAnim - 16) / 7) * (-25.3822-(-13.3192)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 24.0849 + (((tickAnim - 23) / 7) * (13.05153-(24.0849)));
            yy = -4.70602 + (((tickAnim - 23) / 7) * (34.3552-(-4.70602)));
            zz = -25.3822 + (((tickAnim - 23) / 7) * (25.3104-(-25.3822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg1, frontleftleg1.rotateAngleX + (float) Math.toRadians(xx), frontleftleg1.rotateAngleY + (float) Math.toRadians(yy), frontleftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 11.5 + (((tickAnim - 0) / 9) * (53.1923-(11.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (25.1011-(0)));
            zz = -14.5 + (((tickAnim - 0) / 9) * (43.8275-(-14.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 53.1923 + (((tickAnim - 9) / 7) * (23.37535-(53.1923)));
            yy = 25.1011 + (((tickAnim - 9) / 7) * (2.48802-(25.1011)));
            zz = 43.8275 + (((tickAnim - 9) / 7) * (-5.73524-(43.8275)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 23.37535 + (((tickAnim - 16) / 7) * (15.60704-(23.37535)));
            yy = 2.48802 + (((tickAnim - 16) / 7) * (-7.1438-(2.48802)));
            zz = -5.73524 + (((tickAnim - 16) / 7) * (15.2181-(-5.73524)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 15.60704 + (((tickAnim - 23) / 4) * (5.50086-(15.60704)));
            yy = -7.1438 + (((tickAnim - 23) / 4) * (-0.44411-(-7.1438)));
            zz = 15.2181 + (((tickAnim - 23) / 4) * (-15.9118-(15.2181)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 5.50086 + (((tickAnim - 27) / 3) * (11.5-(5.50086)));
            yy = -0.44411 + (((tickAnim - 27) / 3) * (0-(-0.44411)));
            zz = -15.9118 + (((tickAnim - 27) / 3) * (-14.5-(-15.9118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -2.49221 + (((tickAnim - 0) / 1) * (-14.86302-(-2.49221)));
            yy = 24.62874 + (((tickAnim - 0) / 1) * (19.7195-(24.62874)));
            zz = -9.38272 + (((tickAnim - 0) / 1) * (-22.6728-(-9.38272)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -14.86302 + (((tickAnim - 1) / 2) * (-26.60267-(-14.86302)));
            yy = 19.7195 + (((tickAnim - 1) / 2) * (14.6163-(19.7195)));
            zz = -22.6728 + (((tickAnim - 1) / 2) * (-36.8054-(-22.6728)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -26.60267 + (((tickAnim - 3) / 0) * (-35.71513-(-26.60267)));
            yy = 14.6163 + (((tickAnim - 3) / 0) * (10.595-(14.6163)));
            zz = -36.8054 + (((tickAnim - 3) / 0) * (-46.6624-(-36.8054)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35.71513 + (((tickAnim - 3) / 2) * (-38.26341-(-35.71513)));
            yy = 10.595 + (((tickAnim - 3) / 2) * (5.8562-(10.595)));
            zz = -46.6624 + (((tickAnim - 3) / 2) * (-62.59686-(-46.6624)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -38.26341 + (((tickAnim - 5) / 2) * (-38.27269-(-38.26341)));
            yy = 5.8562 + (((tickAnim - 5) / 2) * (-3.22451-(5.8562)));
            zz = -62.59686 + (((tickAnim - 5) / 2) * (-74.84131-(-62.59686)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -38.27269 + (((tickAnim - 7) / 2) * (-29.2155-(-38.27269)));
            yy = -3.22451 + (((tickAnim - 7) / 2) * (-6.5484-(-3.22451)));
            zz = -74.84131 + (((tickAnim - 7) / 2) * (-78.2858-(-74.84131)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -29.2155 + (((tickAnim - 9) / 7) * (0-(-29.2155)));
            yy = -6.5484 + (((tickAnim - 9) / 7) * (-22-(-6.5484)));
            zz = -78.2858 + (((tickAnim - 9) / 7) * (10.75-(-78.2858)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0.93678-(0)));
            yy = -22 + (((tickAnim - 16) / 7) * (-2.59637-(-22)));
            zz = 10.75 + (((tickAnim - 16) / 7) * (28.3451-(10.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.93678 + (((tickAnim - 23) / 7) * (-2.49221-(0.93678)));
            yy = -2.59637 + (((tickAnim - 23) / 7) * (24.62874-(-2.59637)));
            zz = 28.3451 + (((tickAnim - 23) / 7) * (-9.38272-(28.3451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-0.175-(0)));
            yy = 0.175 + (((tickAnim - 3) / 2) * (0.14-(0.175)));
            zz = 0.45 + (((tickAnim - 3) / 2) * (0.37-(0.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.175 + (((tickAnim - 5) / 4) * (-0.43-(-0.175)));
            yy = 0.14 + (((tickAnim - 5) / 4) * (0.09-(0.14)));
            zz = 0.37 + (((tickAnim - 5) / 4) * (0.23-(0.37)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -0.43 + (((tickAnim - 9) / 7) * (0-(-0.43)));
            yy = 0.09 + (((tickAnim - 9) / 7) * (0-(0.09)));
            zz = 0.23 + (((tickAnim - 9) / 7) * (0-(0.23)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
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
            xx = -30.40273 + (((tickAnim - 0) / 8) * (-77.81282-(-30.40273)));
            yy = -25.84453 + (((tickAnim - 0) / 8) * (27.56464-(-25.84453)));
            zz = 0.30208 + (((tickAnim - 0) / 8) * (-27.97498-(0.30208)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -77.81282 + (((tickAnim - 8) / 7) * (-80.6843-(-77.81282)));
            yy = 27.56464 + (((tickAnim - 8) / 7) * (52.1333-(27.56464)));
            zz = -27.97498 + (((tickAnim - 8) / 7) * (-2.965-(-27.97498)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -80.6843 + (((tickAnim - 15) / 15) * (-30.40273-(-80.6843)));
            yy = 52.1333 + (((tickAnim - 15) / 15) * (-25.84453-(52.1333)));
            zz = -2.965 + (((tickAnim - 15) / 15) * (0.30208-(-2.965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg1, backleftleg1.rotateAngleX + (float) Math.toRadians(xx), backleftleg1.rotateAngleY + (float) Math.toRadians(yy), backleftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18.75 + (((tickAnim - 0) / 8) * (8.85594-(18.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (21.94992-(0)));
            zz = -18.5 + (((tickAnim - 0) / 8) * (-4.19459-(-18.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 8.85594 + (((tickAnim - 8) / 5) * (2.74137-(8.85594)));
            yy = 21.94992 + (((tickAnim - 8) / 5) * (20.87828-(21.94992)));
            zz = -4.19459 + (((tickAnim - 8) / 5) * (1.82935-(-4.19459)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.74137 + (((tickAnim - 13) / 2) * (-0.27482-(2.74137)));
            yy = 20.87828 + (((tickAnim - 13) / 2) * (6.858-(20.87828)));
            zz = 1.82935 + (((tickAnim - 13) / 2) * (4.1918-(1.82935)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -0.27482 + (((tickAnim - 15) / 15) * (18.75-(-0.27482)));
            yy = 6.858 + (((tickAnim - 15) / 15) * (0-(6.858)));
            zz = 4.1918 + (((tickAnim - 15) / 15) * (-18.5-(4.1918)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.1087 + (((tickAnim - 0) / 8) * (13.89128-(-0.1087)));
            yy = -23.99672 + (((tickAnim - 0) / 8) * (-58.59907-(-23.99672)));
            zz = 0.35935 + (((tickAnim - 0) / 8) * (6.88723-(0.35935)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 13.89128 + (((tickAnim - 8) / 7) * (14.81985-(13.89128)));
            yy = -58.59907 + (((tickAnim - 8) / 7) * (9.1891-(-58.59907)));
            zz = 6.88723 + (((tickAnim - 8) / 7) * (33.8002-(6.88723)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 14.81985 + (((tickAnim - 15) / 3) * (9.20141-(14.81985)));
            yy = 9.1891 + (((tickAnim - 15) / 3) * (28.77349-(9.1891)));
            zz = 33.8002 + (((tickAnim - 15) / 3) * (31.78186-(33.8002)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 9.20141 + (((tickAnim - 18) / 3) * (0.89443-(9.20141)));
            yy = 28.77349 + (((tickAnim - 18) / 3) * (41.59865-(28.77349)));
            zz = 31.78186 + (((tickAnim - 18) / 3) * (27.06067-(31.78186)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0.89443 + (((tickAnim - 21) / 2) * (-11.28986-(0.89443)));
            yy = 41.59865 + (((tickAnim - 21) / 2) * (51.61411-(41.59865)));
            zz = 27.06067 + (((tickAnim - 21) / 2) * (18.59702-(27.06067)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -11.28986 + (((tickAnim - 23) / 2) * (-18.08791-(-11.28986)));
            yy = 51.61411 + (((tickAnim - 23) / 2) * (52.58394-(51.61411)));
            zz = 18.59702 + (((tickAnim - 23) / 2) * (14.74675-(18.59702)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -18.08791 + (((tickAnim - 25) / 5) * (-0.1087-(-18.08791)));
            yy = 52.58394 + (((tickAnim - 25) / 5) * (-23.99672-(52.58394)));
            zz = 14.74675 + (((tickAnim - 25) / 5) * (0.35935-(14.74675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -80.6843 + (((tickAnim - 0) / 15) * (-30.40273-(-80.6843)));
            yy = -52.13327 + (((tickAnim - 0) / 15) * (25.8445-(-52.13327)));
            zz = 2.96499 + (((tickAnim - 0) / 15) * (-0.3021-(2.96499)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -30.40273 + (((tickAnim - 15) / 8) * (-77.81282-(-30.40273)));
            yy = 25.8445 + (((tickAnim - 15) / 8) * (-27.5646-(25.8445)));
            zz = -0.3021 + (((tickAnim - 15) / 8) * (27.975-(-0.3021)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -77.81282 + (((tickAnim - 23) / 7) * (-80.6843-(-77.81282)));
            yy = -27.5646 + (((tickAnim - 23) / 7) * (-52.13327-(-27.5646)));
            zz = 27.975 + (((tickAnim - 23) / 7) * (2.96499-(27.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg1, backrightleg1.rotateAngleX + (float) Math.toRadians(xx), backrightleg1.rotateAngleY + (float) Math.toRadians(yy), backrightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0.27482 + (((tickAnim - 0) / 15) * (18.75-(-0.27482)));
            yy = -6.85799 + (((tickAnim - 0) / 15) * (0-(-6.85799)));
            zz = -4.19179 + (((tickAnim - 0) / 15) * (18.5-(-4.19179)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 18.75 + (((tickAnim - 15) / 8) * (8.85594-(18.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (-21.9499-(0)));
            zz = 18.5 + (((tickAnim - 15) / 8) * (4.1946-(18.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 8.85594 + (((tickAnim - 23) / 5) * (2.74137-(8.85594)));
            yy = -21.9499 + (((tickAnim - 23) / 5) * (-20.8783-(-21.9499)));
            zz = 4.1946 + (((tickAnim - 23) / 5) * (-1.8294-(4.1946)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.74137 + (((tickAnim - 28) / 2) * (-0.27482-(2.74137)));
            yy = -20.8783 + (((tickAnim - 28) / 2) * (-6.85799-(-20.8783)));
            zz = -1.8294 + (((tickAnim - 28) / 2) * (-4.19179-(-1.8294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.81985 + (((tickAnim - 0) / 3) * (9.20141-(14.81985)));
            yy = -9.18905 + (((tickAnim - 0) / 3) * (-28.7735-(-9.18905)));
            zz = -33.80021 + (((tickAnim - 0) / 3) * (-31.7819-(-33.80021)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 9.20141 + (((tickAnim - 3) / 3) * (0.89443-(9.20141)));
            yy = -28.7735 + (((tickAnim - 3) / 3) * (-41.5987-(-28.7735)));
            zz = -31.7819 + (((tickAnim - 3) / 3) * (-27.0607-(-31.7819)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.89443 + (((tickAnim - 6) / 2) * (-10.54983-(0.89443)));
            yy = -41.5987 + (((tickAnim - 6) / 2) * (-48.5112-(-41.5987)));
            zz = -27.0607 + (((tickAnim - 6) / 2) * (-21.34507-(-27.0607)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10.54983 + (((tickAnim - 8) / 2) * (-26.2559-(-10.54983)));
            yy = -48.5112 + (((tickAnim - 8) / 2) * (-51.52555-(-48.5112)));
            zz = -21.34507 + (((tickAnim - 8) / 2) * (-14.8443-(-21.34507)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -26.2559 + (((tickAnim - 10) / 5) * (-0.1087-(-26.2559)));
            yy = -51.52555 + (((tickAnim - 10) / 5) * (23.9967-(-51.52555)));
            zz = -14.8443 + (((tickAnim - 10) / 5) * (0.35935-(-14.8443)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -0.1087 + (((tickAnim - 15) / 8) * (13.89128-(-0.1087)));
            yy = 23.9967 + (((tickAnim - 15) / 8) * (58.5991-(23.9967)));
            zz = 0.35935 + (((tickAnim - 15) / 8) * (6.88723-(0.35935)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 13.89128 + (((tickAnim - 23) / 7) * (14.81985-(13.89128)));
            yy = 58.5991 + (((tickAnim - 23) / 7) * (-9.18905-(58.5991)));
            zz = 6.88723 + (((tickAnim - 23) / 7) * (-33.80021-(6.88723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-9), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-190))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*8), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*12), tail5.rotateAngleZ + (float) Math.toRadians(0));
       
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
