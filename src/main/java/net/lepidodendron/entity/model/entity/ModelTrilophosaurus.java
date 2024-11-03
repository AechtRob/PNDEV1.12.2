package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTrilophosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraTrilophosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTrilophosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Trilophosaurus;
    private final AdvancedModelRendererExtended lowerbody;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended backrightleg;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended backrightleg2;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended backrightleg3;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended backleftleg3;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended upperbody;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended frontrightarm;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended frontrightarm2;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended frontrightarm3;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended frontleftarm;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended frontleftarm2;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended frontleftarm3;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended neck4;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended eyeleft;
    private final AdvancedModelRendererExtended eyeright;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended cube_r30;

    private ModelAnimator animator;

    public ModelTrilophosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Trilophosaurus = new AdvancedModelRendererExtended(this);
        this.Trilophosaurus.setRotationPoint(0.0F, 16.35F, 0.0F);


        this.lowerbody = new AdvancedModelRendererExtended(this);
        this.lowerbody.setRotationPoint(0.0F, -0.7949F, 4.329F);
        this.Trilophosaurus.addChild(lowerbody);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(1.0F, 1.8116F, -0.2856F);
        this.lowerbody.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, -3.4F, -1.5F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0636F, -0.0929F);
        this.lowerbody.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 31, -1.5F, -2.0F, -2.5F, 3, 4, 4, 0.0F, false));

        this.backrightleg = new AdvancedModelRendererExtended(this);
        this.backrightleg.setRotationPoint(-1.4697F, 1.9849F, -0.2047F);
        this.lowerbody.addChild(backrightleg);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.4812F, 0.4929F, -0.1178F);
        this.backrightleg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.6166F, 0.1669F, 0.7799F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 3, -1.0F, -0.622F, -0.6053F, 1, 1, 5, 0.01F, true));

        this.backrightleg2 = new AdvancedModelRendererExtended(this);
        this.backrightleg2.setRotationPoint(-2.8307F, 3.0162F, -0.2174F);
        this.backrightleg.addChild(backrightleg2);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.1348F, -0.0912F, 0.0453F);
        this.backrightleg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.2347F, 0.2082F, 0.1967F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 42, -0.6125F, -0.4443F, -0.1933F, 1, 1, 4, 0.01F, true));

        this.backrightleg3 = new AdvancedModelRendererExtended(this);
        this.backrightleg3.setRotationPoint(-0.3803F, 3.3415F, 1.0653F);
        this.backrightleg2.addChild(backrightleg3);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-0.0986F, 0.3F, 0.0589F);
        this.backrightleg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 27, -2.5F, -0.3F, -1.7F, 4, 0, 3, 0.0F, true));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(1.4697F, 1.9849F, -0.2047F);
        this.lowerbody.addChild(backleftleg);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-0.4812F, 0.4929F, -0.1178F);
        this.backleftleg.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.6166F, -0.1669F, -0.7799F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 3, 0.0F, -0.622F, -0.6053F, 1, 1, 5, 0.01F, false));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(2.8307F, 3.0162F, -0.2174F);
        this.backleftleg.addChild(backleftleg2);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-0.1348F, -0.0912F, 0.0453F);
        this.backleftleg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.2347F, -0.2082F, -0.1967F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 42, -0.3875F, -0.4443F, -0.1933F, 1, 1, 4, 0.01F, false));

        this.backleftleg3 = new AdvancedModelRendererExtended(this);
        this.backleftleg3.setRotationPoint(0.3803F, 3.3415F, 1.0653F);
        this.backleftleg2.addChild(backleftleg3);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0986F, 0.3F, 0.0589F);
        this.backleftleg3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 27, -1.5F, -0.3F, -1.7F, 4, 0, 3, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 0.8719F, 1.3524F);
        this.lowerbody.addChild(tail);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 1.623F, 4.8186F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 22, 0.0F, -4.3F, -5.5F, 0, 7, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -0.627F, 2.3186F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 0, -1.0F, -1.0F, -3.3F, 2, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.777F, 3.9186F);
        this.tail.addChild(tail2);


        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-0.01F, 2.4F, 8.4F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 22, 0.0F, -5.25F, -7.95F, 0, 7, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.5F, -0.85F, 8.9F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 3, -1.0F, -1.05F, -8.9F, 1, 2, 6, -0.01F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.682F, 5.8816F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.5F, -1.168F, 7.0184F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 8, -1.0F, 0.2243F, -7.0924F, 1, 1, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 3.082F, 13.0184F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 17, 0.0F, -5.55F, -12.9F, 0, 7, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.005F, -0.3766F, 5.9536F);
        this.tail3.addChild(tail4);


        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.995F, -0.7913F, 1.0649F);
        this.tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 0, -1.5F, 0.23F, -1.1424F, 1, 1, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.005F, -0.5413F, 13.8149F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -1.8F, -13.85F, 0, 7, 9, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -0.1801F, -1.229F);
        this.lowerbody.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 14, 12, -2.0F, -0.925F, -5.1F, 4, 4, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 35, -0.5F, -1.575F, -5.09F, 1, 1, 5, 0.01F, false));

        this.upperbody = new AdvancedModelRendererExtended(this);
        this.upperbody.setRotationPoint(0.0F, 0.925F, -5.1F);
        this.body.addChild(upperbody);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 32, 19, -1.5F, -1.85F, -3.0F, 3, 4, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -2.1529F, -1.8707F);
        this.upperbody.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 42, -0.5F, -0.1F, -2.1F, 1, 1, 4, 0.0F, false));

        this.frontrightarm = new AdvancedModelRendererExtended(this);
        this.frontrightarm.setRotationPoint(-0.9468F, 1.1687F, -1.6417F);
        this.upperbody.addChild(frontrightarm);


        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(-0.5416F, 0.2642F, -0.3517F);
        this.frontrightarm.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6981F, -1.2149F, 0.0188F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 40, -0.5F, -0.6482F, -1.3065F, 1, 1, 5, 0.01F, true));

        this.frontrightarm2 = new AdvancedModelRendererExtended(this);
        this.frontrightarm2.setRotationPoint(-3.2335F, 2.435F, 0.4688F);
        this.frontrightarm.addChild(frontrightarm2);


        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0919F, -0.079F, 0.469F);
        this.frontrightarm2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.48F, 0.3491F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 0, -0.4F, 0.0F, -0.8F, 1, 5, 1, 0.0F, true));

        this.frontrightarm3 = new AdvancedModelRendererExtended(this);
        this.frontrightarm3.setRotationPoint(-0.7063F, 3.994F, -1.9487F);
        this.frontrightarm2.addChild(frontrightarm3);


        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(-0.2927F, 0.3F, -0.9472F);
        this.frontrightarm3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.48F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 10, -1.8F, -0.3F, -1.1F, 4, 0, 3, 0.0F, true));

        this.frontleftarm = new AdvancedModelRendererExtended(this);
        this.frontleftarm.setRotationPoint(0.9468F, 1.1687F, -1.6417F);
        this.upperbody.addChild(frontleftarm);


        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.5416F, 0.2642F, -0.3517F);
        this.frontleftarm.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.6981F, 1.2149F, -0.0188F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 40, -0.5F, -0.6482F, -1.3065F, 1, 1, 5, 0.01F, false));

        this.frontleftarm2 = new AdvancedModelRendererExtended(this);
        this.frontleftarm2.setRotationPoint(3.2335F, 2.435F, 0.4688F);
        this.frontleftarm.addChild(frontleftarm2);


        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(-0.0919F, -0.079F, 0.469F);
        this.frontleftarm2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.48F, -0.3491F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 0, -0.6F, 0.0F, -0.8F, 1, 5, 1, 0.0F, false));

        this.frontleftarm3 = new AdvancedModelRendererExtended(this);
        this.frontleftarm3.setRotationPoint(0.7063F, 3.994F, -1.9487F);
        this.frontleftarm2.addChild(frontleftarm3);


        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.2927F, 0.3F, -0.9472F);
        this.frontleftarm3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.48F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 39, 10, -2.2F, -0.3F, -1.1F, 4, 0, 3, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.05F, -3.0F);
        this.upperbody.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 1, 33, -1.5F, -1.5F, -1.2F, 3, 3, 3, -0.01F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -0.6195F);
        this.neck.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 11, 36, -1.0F, -1.0F, -3.1F, 2, 2, 4, 0.0F, false));

        this.neck4 = new AdvancedModelRendererExtended(this);
        this.neck4.setRotationPoint(0.0F, 0.2732F, -2.737F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1789F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 11, 45, -1.0F, -1.3141F, -2.073F, 2, 2, 2, -0.01F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.0F, 0.3334F, -1.2383F);
        this.neck4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 45, 20, -0.5F, -0.4866F, -1.0F, 1, 1, 2, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.7042F, -2.0015F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.2051F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 22, -1.0F, -0.8461F, -1.7417F, 2, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 42, 14, -0.5F, 0.1539F, -3.5417F, 1, 1, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(0.5692F, 0.7524F, -3.6349F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.2531F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 20, 36, -1.0804F, -0.6085F, 0.063F, 1, 1, 2, -0.01F, false));

        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(-0.2735F, 0.6439F, -2.4605F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.2531F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 29, 46, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.01F, false));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(0.5F, -7.7794F, -8.0097F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.48F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 31, -1.0F, 9.1F, 0.3F, 1, 1, 2, 0.0F, false));

        this.eyeleft = new AdvancedModelRendererExtended(this);
        this.eyeleft.setRotationPoint(0.8F, 0.0539F, -0.8417F);
        this.head.addChild(eyeleft);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 20, 4, -0.6F, -0.5F, -0.4F, 1, 1, 1, 0.0F, false));

        this.eyeright = new AdvancedModelRendererExtended(this);
        this.eyeright.setRotationPoint(-0.8F, 0.0539F, -0.8417F);
        this.head.addChild(eyeright);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 0, 20, -0.4F, -0.5F, -0.4F, 1, 1, 1, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.6539F, 0.2583F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 17, -0.5F, -0.7F, -1.4485F, 1, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 34, 41, -0.5F, -0.0929F, -3.7485F, 1, 1, 3, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 5, -1.0F, -0.1F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(-0.5886F, 0.4985F, -3.8468F);
        this.lowerjaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.2531F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 7, 17, 0.1004F, -0.6285F, 0.063F, 1, 1, 2, -0.01F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(0.5886F, 0.4985F, -3.8468F);
        this.lowerjaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.2531F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 0, -1.1004F, -0.6185F, 0.063F, 1, 1, 2, -0.01F, false));

        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.4971F, -1.4297F);
        this.lowerjaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0436F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 37, 0.0F, -0.54F, -1.3F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Trilophosaurus.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(Trilophosaurus, -1.5F, 3.1F, 0.1F);
        this.setRotateAngle(body, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(upperbody, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.05F, 0.2F);
        this.setRotateAngle(neck3, 0.0F, 0.05F, 0.2F);
        this.setRotateAngle(neck4, 0.0F, 0.05F, 0.2F);
        this.setRotateAngle(head, 0.0F, 0.1F, 0.2F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, -0.2F);
        this.setRotateAngle(tail2, 0.0F, -0.15F, -0.2F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, -0.1F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, -0.1F);
        this.setRotateAngle(frontleftarm, 0.0F, 0.0F, -0.25F);
        this.setRotateAngle(frontleftarm2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftarm3, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(frontrightarm, 0.0F, 0.0F, 0.4F);
        this.setRotateAngle(frontrightarm2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontrightarm3, 0.0F, 0.0F, -0.1F);
        this.setRotateAngle(backleftleg, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(backleftleg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg, 0.0F, 0.0F, 0.3F);
        this.setRotateAngle(backrightleg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg3, 0.0F, 0.0F, 0.0F);
        this.Trilophosaurus.offsetY = -0.25F;
        this.Trilophosaurus.offsetX = 0.0F;
        this.Trilophosaurus.offsetZ = -1.58F;
        this.Trilophosaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Trilophosaurus, 0.2F, 0.5F, -0.3F);
        this.setRotateAngle(body, -0.1F, -0.1F, 0.2F);
        this.setRotateAngle(upperbody, -0.15F, -0.1F, 0.1F);
        this.setRotateAngle(neck, -0.1F, -0.1F, -0.2F);
        this.setRotateAngle(neck3, -0.1F, -0.1F, -0.1F);
        this.setRotateAngle(neck4, -0.2F, -0.1F, -0.1F);
        this.setRotateAngle(head, -0.1F, 0.0F, 0.1F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.05F, -0.1F, 0.05F);
        this.setRotateAngle(tail2, 0.05F, -0.1F, 0.05F);
        this.setRotateAngle(tail3, 0.05F, -0.2F, 0.05F);
        this.setRotateAngle(tail4, 0.05F, -0.2F, 0.05F);
        this.setRotateAngle(frontleftarm, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(frontleftarm2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(frontleftarm3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontrightarm, 0.0F, 0.0F, 0.3F);
        this.setRotateAngle(frontrightarm2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(frontrightarm3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg, 0.0F, -0.2F, 0.3F);
        this.setRotateAngle(backleftleg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg, -0.5F, 0.3F, 0.0F);
        this.setRotateAngle(backrightleg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg3, 0.0F, 0.0F, 0.0F);
        this.Trilophosaurus.offsetZ = -0.03F;
        this.Trilophosaurus.offsetY = 0.32F;
        this.Trilophosaurus.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Trilophosaurus.offsetY = -1.3F;
        this.Trilophosaurus.offsetX = 1.5F;
        this.Trilophosaurus.rotateAngleY = (float)Math.toRadians(200);
        this.Trilophosaurus.rotateAngleX = (float)Math.toRadians(8);
        this.Trilophosaurus.rotateAngleZ = (float)Math.toRadians(-8);
        this.Trilophosaurus.scaleChildren = true;
        float scaler = 4.4F;
        this.Trilophosaurus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Trilophosaurus, 0.2F, 4.4F, 0.2F);
        this.setRotateAngle(body, -0.1F, -0.1F, 0.2F);
        this.setRotateAngle(upperbody, -0.15F, -0.1F, 0.1F);
        this.setRotateAngle(neck, -0.1F, -0.2F, -0.2F);
        this.setRotateAngle(neck3, -0.1F, -0.2F, -0.1F);
        this.setRotateAngle(neck4, -0.2F, -0.2F, -0.1F);
        this.setRotateAngle(head, -0.1F, 0.0F, 0.1F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.05F, -0.1F, 0.05F);
        this.setRotateAngle(tail2, 0.05F, -0.1F, 0.05F);
        this.setRotateAngle(tail3, 0.05F, -0.1F, 0.05F);
        this.setRotateAngle(tail4, 0.05F, -0.1F, 0.05F);
        this.setRotateAngle(frontleftarm, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(frontleftarm2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(frontleftarm3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontrightarm, 0.0F, 0.0F, 0.3F);
        this.setRotateAngle(frontrightarm2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(frontrightarm3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg, 0.0F, -0.2F, 0.3F);
        this.setRotateAngle(backleftleg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg, -0.5F, 0.3F, 0.0F);
        this.setRotateAngle(backrightleg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg3, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Trilophosaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Trilophosaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Trilophosaurus.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.root.offsetY = 1.28F;

        EntityPrehistoricFloraTrilophosaurus Trilophosaurus = (EntityPrehistoricFloraTrilophosaurus) e;
        float masterSpeed = Trilophosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck3);
        this.faceTarget(f3, f4, 2, neck4);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};

        if (Trilophosaurus.getAnimation() == Trilophosaurus.MAKE_NEST_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }


        if (Trilophosaurus.getIsClimbing()) {
            //Pose for climbing:
            //this.root.offsetY = 1.40F;
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTrilophosaurus ee = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;


        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;


    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;

    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTrilophosaurus e = (EntityPrehistoricFloraTrilophosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();

    }
}
