package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHypuronector;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHypuronector extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Hypuronector;
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

    public ModelHypuronector() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hypuronector = new AdvancedModelRendererExtended(this);
        this.Hypuronector.setRotationPoint(0.0F, 16.35F, 0.0F);


        this.lowerbody = new AdvancedModelRendererExtended(this);
        this.lowerbody.setRotationPoint(0.0F, -0.7949F, 4.329F);
        this.Hypuronector.addChild(lowerbody);


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
        this.Hypuronector.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(Hypuronector, -1.5F, 3.1F, 0.1F);
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
        this.Hypuronector.offsetY = -0.25F;
        this.Hypuronector.offsetX = 0.0F;
        this.Hypuronector.offsetZ = -1.58F;
        this.Hypuronector.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hypuronector, 0.2F, 0.5F, -0.3F);
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
        this.Hypuronector.offsetZ = -0.03F;
        this.Hypuronector.offsetY = 0.32F;
        this.Hypuronector.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hypuronector.offsetY = -1.3F;
        this.Hypuronector.offsetX = 1.5F;
        this.Hypuronector.rotateAngleY = (float)Math.toRadians(200);
        this.Hypuronector.rotateAngleX = (float)Math.toRadians(8);
        this.Hypuronector.rotateAngleZ = (float)Math.toRadians(-8);
        this.Hypuronector.scaleChildren = true;
        float scaler = 4.4F;
        this.Hypuronector.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hypuronector, 0.2F, 4.4F, 0.2F);
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
        this.Hypuronector.render(f);
        //Reset rotations, positions and sizing:
        this.Hypuronector.setScale(1.0F, 1.0F, 1.0F);
        this.Hypuronector.scaleChildren = false;
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

        EntityPrehistoricFloraHypuronector Hypuronector = (EntityPrehistoricFloraHypuronector) e;
        float masterSpeed = Hypuronector.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck3);
        this.faceTarget(f3, f4, 2, neck4);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};

        if (Hypuronector.getAnimation() == Hypuronector.MAKE_NEST_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }


        if (Hypuronector.getIsClimbing()) {
            //Pose for climbing:
            //this.root.offsetY = 1.40F;
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraHypuronector ee = (EntityPrehistoricFloraHypuronector) entitylivingbaseIn;


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

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypuronector entity = (EntityPrehistoricFloraHypuronector) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -9.5 + (((tickAnim - 10) / 28) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 38) / 12) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(xx), lowerbody.rotateAngleY + (float) Math.toRadians(yy), lowerbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = -2.25 + (((tickAnim - 10) / 28) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -2.25 + (((tickAnim - 38) / 12) * (0-(-2.25)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerbody.rotationPointX = this.lowerbody.rotationPointX + (float)(xx);
        this.lowerbody.rotationPointY = this.lowerbody.rotationPointY - (float)(yy);
        this.lowerbody.rotationPointZ = this.lowerbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (37.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 37.5 + (((tickAnim - 10) / 28) * (37.5-(37.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 37.5 + (((tickAnim - 38) / 12) * (0-(37.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-43.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = -43.25 + (((tickAnim - 10) / 28) * (-43.25-(-43.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = -43.25 + (((tickAnim - 38) / 12) * (0-(-43.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.7409-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.42324-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.46393-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 9.7409 + (((tickAnim - 10) / 28) * (9.7409-(9.7409)));
            yy = -0.42324 + (((tickAnim - 10) / 28) * (-0.42324-(-0.42324)));
            zz = 2.46393 + (((tickAnim - 10) / 28) * (2.46393-(2.46393)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9.7409 + (((tickAnim - 38) / 12) * (0-(9.7409)));
            yy = -0.42324 + (((tickAnim - 38) / 12) * (0-(-0.42324)));
            zz = 2.46393 + (((tickAnim - 38) / 12) * (0-(2.46393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 5) / 33) * (0-(0)));
            yy = 0.075 + (((tickAnim - 5) / 33) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 5) / 33) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.075 + (((tickAnim - 38) / 12) * (0-(0.075)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-39.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = -39.75 + (((tickAnim - 10) / 28) * (-39.75-(-39.75)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = -39.75 + (((tickAnim - 38) / 12) * (0-(-39.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (43.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 43.25 + (((tickAnim - 10) / 28) * (43.25-(43.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 43.25 + (((tickAnim - 38) / 12) * (0-(43.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 10.25 + (((tickAnim - 10) / 28) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 38) / 12) * (0-(10.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.58616-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.80349-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (8.68655-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0.58616 + (((tickAnim - 10) / 28) * (0.58616-(0.58616)));
            yy = 0.80349 + (((tickAnim - 10) / 28) * (0.80349-(0.80349)));
            zz = 8.68655 + (((tickAnim - 10) / 28) * (8.68655-(8.68655)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.58616 + (((tickAnim - 38) / 12) * (0-(0.58616)));
            yy = 0.80349 + (((tickAnim - 38) / 12) * (0-(0.80349)));
            zz = 8.68655 + (((tickAnim - 38) / 12) * (0-(8.68655)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.21079-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.99724-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.51473-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -0.21079 + (((tickAnim - 10) / 28) * (-0.21079-(-0.21079)));
            yy = -7.99724 + (((tickAnim - 10) / 28) * (-7.99724-(-7.99724)));
            zz = 1.51473 + (((tickAnim - 10) / 28) * (1.51473-(1.51473)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -0.21079 + (((tickAnim - 38) / 12) * (0-(-0.21079)));
            yy = -7.99724 + (((tickAnim - 38) / 12) * (0-(-7.99724)));
            zz = 1.51473 + (((tickAnim - 38) / 12) * (0-(1.51473)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.00803-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.71596-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.87157-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 6.00803 + (((tickAnim - 10) / 28) * (6.00803-(6.00803)));
            yy = -3.71596 + (((tickAnim - 10) / 28) * (-3.71596-(-3.71596)));
            zz = 1.87157 + (((tickAnim - 10) / 28) * (1.87157-(1.87157)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 6.00803 + (((tickAnim - 38) / 12) * (0-(6.00803)));
            yy = -3.71596 + (((tickAnim - 38) / 12) * (0-(-3.71596)));
            zz = 1.87157 + (((tickAnim - 38) / 12) * (0-(1.87157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.00382-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.99924-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.08748-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 1.00382 + (((tickAnim - 10) / 28) * (1.00382-(1.00382)));
            yy = -4.99924 + (((tickAnim - 10) / 28) * (-4.99924-(-4.99924)));
            zz = -0.08748 + (((tickAnim - 10) / 28) * (-0.08748-(-0.08748)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.00382 + (((tickAnim - 38) / 12) * (0-(1.00382)));
            yy = -4.99924 + (((tickAnim - 38) / 12) * (0-(-4.99924)));
            zz = -0.08748 + (((tickAnim - 38) / 12) * (0-(-0.08748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 2 + (((tickAnim - 10) / 28) * (2-(2)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 38) / 12) * (0-(2)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 3.5 + (((tickAnim - 10) / 28) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 38) / 12) * (0-(3.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 17.25 + (((tickAnim - 10) / 28) * (17.25-(17.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 17.25 + (((tickAnim - 38) / 12) * (0-(17.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm, frontrightarm.rotateAngleX + (float) Math.toRadians(xx), frontrightarm.rotateAngleY + (float) Math.toRadians(yy), frontrightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-17.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = -17.25 + (((tickAnim - 10) / 28) * (-17.25-(-17.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = -17.25 + (((tickAnim - 38) / 12) * (0-(-17.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm2, frontrightarm2.rotateAngleX + (float) Math.toRadians(xx), frontrightarm2.rotateAngleY + (float) Math.toRadians(yy), frontrightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 3.5 + (((tickAnim - 10) / 28) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 1.75 + (((tickAnim - 10) / 28) * (1.75-(1.75)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 38) / 12) * (0-(3.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 1.75 + (((tickAnim - 38) / 12) * (0-(1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm3, frontrightarm3.rotateAngleX + (float) Math.toRadians(xx), frontrightarm3.rotateAngleY + (float) Math.toRadians(yy), frontrightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-17.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = -17.25 + (((tickAnim - 10) / 28) * (-17.25-(-17.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = -17.25 + (((tickAnim - 38) / 12) * (0-(-17.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm, frontleftarm.rotateAngleX + (float) Math.toRadians(xx), frontleftarm.rotateAngleY + (float) Math.toRadians(yy), frontleftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 17.25 + (((tickAnim - 10) / 28) * (17.25-(17.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 17.25 + (((tickAnim - 38) / 12) * (0-(17.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm2, frontleftarm2.rotateAngleX + (float) Math.toRadians(xx), frontleftarm2.rotateAngleY + (float) Math.toRadians(yy), frontleftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 3.5 + (((tickAnim - 10) / 28) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = -1.75 + (((tickAnim - 10) / 28) * (-1.75-(-1.75)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 38) / 12) * (0-(3.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = -1.75 + (((tickAnim - 38) / 12) * (0-(-1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm3, frontleftarm3.rotateAngleX + (float) Math.toRadians(xx), frontleftarm3.rotateAngleY + (float) Math.toRadians(yy), frontleftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0.991+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.75))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-3.24749-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (2.25362-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0.991+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.75))*-0.5 + (((tickAnim - 25) / 25) * (0-(0.991+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.75))*-0.5)));
            yy = -3.24749 + (((tickAnim - 25) / 25) * (0-(-3.24749)));
            zz = 2.25362 + (((tickAnim - 25) / 25) * (0-(2.25362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (3.241+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.75))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-50))*0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.93853-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 3.241+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.75))*-0.5 + (((tickAnim - 24) / 26) * (0-(3.241+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.75))*-0.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-50))*0.5 + (((tickAnim - 24) / 26) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-50))*0.5)));
            zz = 0.93853 + (((tickAnim - 24) / 26) * (0-(0.93853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.54188-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-17.9109-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.71823-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 8.54188 + (((tickAnim - 10) / 28) * (8.54188-(8.54188)));
            yy = -17.9109 + (((tickAnim - 10) / 28) * (-17.9109-(-17.9109)));
            zz = 4.71823 + (((tickAnim - 10) / 28) * (4.71823-(4.71823)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 8.54188 + (((tickAnim - 38) / 12) * (0-(8.54188)));
            yy = -17.9109 + (((tickAnim - 38) / 12) * (0-(-17.9109)));
            zz = 4.71823 + (((tickAnim - 38) / 12) * (0-(4.71823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.57081-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-20.73512-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (15.57946-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = -3.57081 + (((tickAnim - 10) / 14) * (0.61127-(-3.57081)));
            yy = -20.73512 + (((tickAnim - 10) / 14) * (-21.61455-(-20.73512)));
            zz = 15.57946 + (((tickAnim - 10) / 14) * (24.02502-(15.57946)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0.61127 + (((tickAnim - 24) / 26) * (0-(0.61127)));
            yy = -21.61455 + (((tickAnim - 24) / 26) * (0-(-21.61455)));
            zz = 24.02502 + (((tickAnim - 24) / 26) * (0-(24.02502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypuronector entity = (EntityPrehistoricFloraHypuronector) entitylivingbaseIn;
        int animCycle = 24;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(xx), lowerbody.rotateAngleY + (float) Math.toRadians(yy), lowerbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -0.125 + (((tickAnim - 8) / 5) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerbody.rotationPointX = this.lowerbody.rotationPointX + (float)(xx);
        this.lowerbody.rotationPointY = this.lowerbody.rotationPointY - (float)(yy);
        this.lowerbody.rotationPointZ = this.lowerbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (3.25-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 3.25 + (((tickAnim - 8) / 5) * (0-(3.25)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.75-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -1.75 + (((tickAnim - 8) / 5) * (0-(-1.75)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 3) / 5) * (-11.0452-(-4.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (5.15328-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-1.00446-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = -11.0452 + (((tickAnim - 8) / 16) * (0-(-11.0452)));
            yy = 5.15328 + (((tickAnim - 8) / 16) * (0-(5.15328)));
            zz = -1.00446 + (((tickAnim - 8) / 16) * (0-(-1.00446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.25 + (((tickAnim - 3) / 5) * (-4.53612-(-0.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (7.22753-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.57186-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.53612 + (((tickAnim - 8) / 2) * (-3.75851-(-4.53612)));
            yy = 7.22753 + (((tickAnim - 8) / 2) * (6.72822-(7.22753)));
            zz = -0.57186 + (((tickAnim - 8) / 2) * (-0.52257-(-0.57186)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = -3.75851 + (((tickAnim - 10) / 14) * (0-(-3.75851)));
            yy = 6.72822 + (((tickAnim - 10) / 14) * (0-(6.72822)));
            zz = -0.52257 + (((tickAnim - 10) / 14) * (0-(-0.52257)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 3) / 5) * (1.81383-(10)));
            yy = 0 + (((tickAnim - 3) / 5) * (-15.24271-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.47702-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 1.81383 + (((tickAnim - 8) / 10) * (-0.78329-(1.81383)));
            yy = -15.24271 + (((tickAnim - 8) / 10) * (1.2495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.7))*-5-(-15.24271)));
            zz = -0.47702 + (((tickAnim - 8) / 10) * (-0.07167-(-0.47702)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -0.78329 + (((tickAnim - 18) / 6) * (0-(-0.78329)));
            yy = 1.2495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.7))*-5 + (((tickAnim - 18) / 6) * (0-(1.2495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.7))*-5)));
            zz = -0.07167 + (((tickAnim - 18) / 6) * (0-(-0.07167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 6.25 + (((tickAnim - 3) / 5) * (-2.81666-(6.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (-12.48537-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.6094-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -2.81666 + (((tickAnim - 8) / 10) * (-0.7873-(-2.81666)));
            yy = -12.48537 + (((tickAnim - 8) / 10) * (5.7492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.7))*-9-(-12.48537)));
            zz = 0.6094 + (((tickAnim - 8) / 10) * (-0.13346-(0.6094)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -0.7873 + (((tickAnim - 18) / 6) * (0-(-0.7873)));
            yy = 5.7492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.7))*-9 + (((tickAnim - 18) / 6) * (0-(5.7492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.7))*-9)));
            zz = -0.13346 + (((tickAnim - 18) / 6) * (0-(-0.13346)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 8) / 10) * (0-(7.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -1.75 + (((tickAnim - 3) / 5) * (5-(-1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 8) / 4) * (3.33346-(5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.49915-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.02907-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 3.33346 + (((tickAnim - 12) / 3) * (1.668-(3.33346)));
            yy = 0.49915 + (((tickAnim - 12) / 3) * (-2.24936-(0.49915)));
            zz = 0.02907 + (((tickAnim - 12) / 3) * (-0.05821-(0.02907)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1.668 + (((tickAnim - 15) / 3) * (0-(1.668)));
            yy = -2.24936 + (((tickAnim - 15) / 3) * (0-(-2.24936)));
            zz = -0.05821 + (((tickAnim - 15) / 3) * (0-(-0.05821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.5 + (((tickAnim - 3) / 5) * (-1.45832-(3.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (7.84479-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (2.0946-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -1.45832 + (((tickAnim - 8) / 7) * (-0.48718-(-1.45832)));
            yy = 7.84479 + (((tickAnim - 8) / 7) * (4.61486-(7.84479)));
            zz = 2.0946 + (((tickAnim - 8) / 7) * (0.68118-(2.0946)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.48718 + (((tickAnim - 15) / 3) * (0-(-0.48718)));
            yy = 4.61486 + (((tickAnim - 15) / 3) * (0-(4.61486)));
            zz = 0.68118 + (((tickAnim - 15) / 3) * (0-(0.68118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm, frontrightarm.rotateAngleX + (float) Math.toRadians(xx), frontrightarm.rotateAngleY + (float) Math.toRadians(yy), frontrightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-27.80317-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-18.56319-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (3.79595-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -27.80317 + (((tickAnim - 8) / 10) * (0-(-27.80317)));
            yy = -18.56319 + (((tickAnim - 8) / 10) * (0-(-18.56319)));
            zz = 3.79595 + (((tickAnim - 8) / 10) * (0-(3.79595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm2, frontrightarm2.rotateAngleX + (float) Math.toRadians(xx), frontrightarm2.rotateAngleY + (float) Math.toRadians(yy), frontrightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (12.22106-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.84805-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-9.34079-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 12.22106 + (((tickAnim - 8) / 10) * (0-(12.22106)));
            yy = -0.84805 + (((tickAnim - 8) / 10) * (0-(-0.84805)));
            zz = -9.34079 + (((tickAnim - 8) / 10) * (0-(-9.34079)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm3, frontrightarm3.rotateAngleX + (float) Math.toRadians(xx), frontrightarm3.rotateAngleY + (float) Math.toRadians(yy), frontrightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.5 + (((tickAnim - 3) / 5) * (5.10279-(3.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (15.35944-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-15.71779-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 5.10279 + (((tickAnim - 8) / 8) * (0-(5.10279)));
            yy = 15.35944 + (((tickAnim - 8) / 8) * (0-(15.35944)));
            zz = -15.71779 + (((tickAnim - 8) / 8) * (0-(-15.71779)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm, frontleftarm.rotateAngleX + (float) Math.toRadians(xx), frontleftarm.rotateAngleY + (float) Math.toRadians(yy), frontleftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-19.44115-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-10.32764-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (20.82885-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -19.44115 + (((tickAnim - 8) / 9) * (0-(-19.44115)));
            yy = -10.32764 + (((tickAnim - 8) / 9) * (0-(-10.32764)));
            zz = 20.82885 + (((tickAnim - 8) / 9) * (0-(20.82885)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm2, frontleftarm2.rotateAngleX + (float) Math.toRadians(xx), frontleftarm2.rotateAngleY + (float) Math.toRadians(yy), frontleftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-4.44256-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (1.20286-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-5.53074-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -4.44256 + (((tickAnim - 8) / 8) * (-0.75-(-4.44256)));
            yy = 1.20286 + (((tickAnim - 8) / 8) * (0-(1.20286)));
            zz = -5.53074 + (((tickAnim - 8) / 8) * (-2.75-(-5.53074)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -0.75 + (((tickAnim - 16) / 3) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = -2.75 + (((tickAnim - 16) / 3) * (0-(-2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm3, frontleftarm3.rotateAngleX + (float) Math.toRadians(xx), frontleftarm3.rotateAngleY + (float) Math.toRadians(yy), frontleftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 6) / 2) * (0-(0.15)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0.225-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 16) / 3) * (0-(0.225)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftarm3.rotationPointX = this.frontleftarm3.rotationPointX + (float)(xx);
        this.frontleftarm3.rotationPointY = this.frontleftarm3.rotationPointY - (float)(yy);
        this.frontleftarm3.rotationPointZ = this.frontleftarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5.75 + (((tickAnim - 3) / 5) * (6.9934-(-5.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.30458-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-2.48139-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 6.9934 + (((tickAnim - 8) / 4) * (7.75001-(6.9934)));
            yy = 0.30458 + (((tickAnim - 8) / 4) * (1.93708-(0.30458)));
            zz = -2.48139 + (((tickAnim - 8) / 4) * (-1.4183-(-2.48139)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 7.75001 + (((tickAnim - 12) / 3) * (2.2513-(7.75001)));
            yy = 1.93708 + (((tickAnim - 12) / 3) * (-2.79916-(1.93708)));
            zz = -1.4183 + (((tickAnim - 12) / 3) * (-0.90754-(-1.4183)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.2513 + (((tickAnim - 15) / 3) * (0-(2.2513)));
            yy = -2.79916 + (((tickAnim - 15) / 3) * (1.5-(-2.79916)));
            zz = -0.90754 + (((tickAnim - 15) / 3) * (-2.25-(-0.90754)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (-2.25-(0)));
            yy = 1.5 + (((tickAnim - 18) / 3) * (0-(1.5)));
            zz = -2.25 + (((tickAnim - 18) / 3) * (0-(-2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -2.25 + (((tickAnim - 21) / 3) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.275-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = -0.275 + (((tickAnim - 8) / 10) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5.75 + (((tickAnim - 3) / 5) * (8.72033-(-5.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.62167-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-5.46486-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 8.72033 + (((tickAnim - 8) / 4) * (-6.94393-(8.72033)));
            yy = 0.62167 + (((tickAnim - 8) / 4) * (20.77076-(0.62167)));
            zz = -5.46486 + (((tickAnim - 8) / 4) * (-5.55793-(-5.46486)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -6.94393 + (((tickAnim - 12) / 3) * (-3.25-(-6.94393)));
            yy = 20.77076 + (((tickAnim - 12) / 3) * (-4.5-(20.77076)));
            zz = -5.55793 + (((tickAnim - 12) / 3) * (-5.25-(-5.55793)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3.25 + (((tickAnim - 15) / 3) * (0-(-3.25)));
            yy = -4.5 + (((tickAnim - 15) / 3) * (7.75-(-4.5)));
            zz = -5.25 + (((tickAnim - 15) / 3) * (-8.75-(-5.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 7.75 + (((tickAnim - 18) / 5) * (0-(7.75)));
            zz = -8.75 + (((tickAnim - 18) / 5) * (0-(-8.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 3) / 5) * (10.99794-(13.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.05558-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-4.24964-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 10.99794 + (((tickAnim - 8) / 4) * (-2.27711-(10.99794)));
            yy = 0.05558 + (((tickAnim - 8) / 4) * (-23.31313-(0.05558)));
            zz = -4.24964 + (((tickAnim - 8) / 4) * (-3.32037-(-4.24964)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -2.27711 + (((tickAnim - 12) / 3) * (0.32721-(-2.27711)));
            yy = -23.31313 + (((tickAnim - 12) / 3) * (-1.9706-(-23.31313)));
            zz = -3.32037 + (((tickAnim - 12) / 3) * (-3.09703-(-3.32037)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.32721 + (((tickAnim - 15) / 3) * (-0.34151-(0.32721)));
            yy = -1.9706 + (((tickAnim - 15) / 3) * (-14.50939-(-1.9706)));
            zz = -3.09703 + (((tickAnim - 15) / 3) * (-3.31773-(-3.09703)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -0.34151 + (((tickAnim - 18) / 3) * (-4.03085-(-0.34151)));
            yy = -14.50939 + (((tickAnim - 18) / 3) * (-7.99118-(-14.50939)));
            zz = -3.31773 + (((tickAnim - 18) / 3) * (-2.3288-(-3.31773)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -4.03085 + (((tickAnim - 21) / 2) * (0-(-4.03085)));
            yy = -7.99118 + (((tickAnim - 21) / 2) * (0-(-7.99118)));
            zz = -2.3288 + (((tickAnim - 21) / 2) * (0-(-2.3288)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0.3 + (((tickAnim - 15) / 3) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (23.92327-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-6.91607-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (9.52219-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 23.92327 + (((tickAnim - 3) / 5) * (0-(23.92327)));
            yy = -6.91607 + (((tickAnim - 3) / 5) * (0-(-6.91607)));
            zz = 9.52219 + (((tickAnim - 3) / 5) * (-11.25-(9.52219)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-14.25-(0)));
            zz = -11.25 + (((tickAnim - 8) / 4) * (0-(-11.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -14.25 + (((tickAnim - 12) / 3) * (-26.67674-(-14.25)));
            yy = -14.25 + (((tickAnim - 12) / 3) * (-1.36348-(-14.25)));
            zz = 0 + (((tickAnim - 12) / 3) * (7.90195-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -26.67674 + (((tickAnim - 15) / 3) * (-4.65038-(-26.67674)));
            yy = -1.36348 + (((tickAnim - 15) / 3) * (-13.9739-(-1.36348)));
            zz = 7.90195 + (((tickAnim - 15) / 3) * (-1.75752-(7.90195)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -4.65038 + (((tickAnim - 18) / 3) * (-14.0111-(-4.65038)));
            yy = -13.9739 + (((tickAnim - 18) / 3) * (-3.0223-(-13.9739)));
            zz = -1.75752 + (((tickAnim - 18) / 3) * (-0.38605-(-1.75752)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -14.0111 + (((tickAnim - 21) / 3) * (0-(-14.0111)));
            yy = -3.0223 + (((tickAnim - 21) / 3) * (0-(-3.0223)));
            zz = -0.38605 + (((tickAnim - 21) / 3) * (0-(-0.38605)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 3) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 5) * (0.02-(1)));
            zz = 1 + (((tickAnim - 3) / 5) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (1-(1)));
            yy = 0.02 + (((tickAnim - 8) / 7) * (0.358-(0.02)));
            zz = 1 + (((tickAnim - 8) / 7) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 15) / 7) * (1-(1)));
            yy = 0.358 + (((tickAnim - 15) / 7) * (1-(0.358)));
            zz = 1 + (((tickAnim - 15) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 3) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 5) * (0.02-(1)));
            zz = 1 + (((tickAnim - 3) / 5) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 8) / 10) * (1-(1)));
            yy = 0.02 + (((tickAnim - 8) / 10) * (1-(0.02)));
            zz = 1 + (((tickAnim - 8) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 18.75 + (((tickAnim - 3) / 4) * (36-(18.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 36 + (((tickAnim - 7) / 1) * (9.5-(36)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 9.5 + (((tickAnim - 8) / 4) * (26.5-(9.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 26.5 + (((tickAnim - 12) / 3) * (4.75-(26.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.75 + (((tickAnim - 15) / 3) * (26.75-(4.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 26.75 + (((tickAnim - 18) / 3) * (2.04-(26.75)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 2.04 + (((tickAnim - 21) / 3) * (0-(2.04)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypuronector entity = (EntityPrehistoricFloraHypuronector) entitylivingbaseIn;
        int animCycle = 20;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -4.66923 + (((tickAnim - 0) / 7) * (-33.19877-(-4.66923)));
            yy = 49.33686 + (((tickAnim - 0) / 7) * (14.49589-(49.33686)));
            zz = -6.14543 + (((tickAnim - 0) / 7) * (46.09196-(-6.14543)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -33.19877 + (((tickAnim - 7) / 3) * (-28.5-(-33.19877)));
            yy = 14.49589 + (((tickAnim - 7) / 3) * (0-(14.49589)));
            zz = 46.09196 + (((tickAnim - 7) / 3) * (0-(46.09196)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -28.5 + (((tickAnim - 10) / 10) * (-4.66923-(-28.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (49.33686-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-6.14543-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.34846 + (((tickAnim - 0) / 11) * (4.20224-(-2.34846)));
            yy = 46.20388 + (((tickAnim - 0) / 11) * (-37.92351-(46.20388)));
            zz = -3.25191 + (((tickAnim - 0) / 11) * (2.52294-(-3.25191)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 4.20224 + (((tickAnim - 11) / 6) * (-20.76317-(4.20224)));
            yy = -37.92351 + (((tickAnim - 11) / 6) * (16.29006-(-37.92351)));
            zz = 2.52294 + (((tickAnim - 11) / 6) * (-53.50395-(2.52294)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -20.76317 + (((tickAnim - 17) / 3) * (-2.34846-(-20.76317)));
            yy = 16.29006 + (((tickAnim - 17) / 3) * (46.20388-(16.29006)));
            zz = -53.50395 + (((tickAnim - 17) / 3) * (-3.25191-(-53.50395)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1.92828 + (((tickAnim - 0) / 6) * (4.124-(1.92828)));
            yy = -36.21246 + (((tickAnim - 0) / 6) * (-11.33014-(-36.21246)));
            zz = -2.76519 + (((tickAnim - 0) / 6) * (5.81481-(-2.76519)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 4.124 + (((tickAnim - 6) / 4) * (7.87093-(4.124)));
            yy = -11.33014 + (((tickAnim - 6) / 4) * (18.57244-(-11.33014)));
            zz = 5.81481 + (((tickAnim - 6) / 4) * (8.17862-(5.81481)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 7.87093 + (((tickAnim - 10) / 4) * (-10.61642-(7.87093)));
            yy = 18.57244 + (((tickAnim - 10) / 4) * (-14.6064-(18.57244)));
            zz = 8.17862 + (((tickAnim - 10) / 4) * (52.65349-(8.17862)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10.61642 + (((tickAnim - 14) / 4) * (0-(-10.61642)));
            yy = -14.6064 + (((tickAnim - 14) / 4) * (-48.5-(-14.6064)));
            zz = 52.65349 + (((tickAnim - 14) / 4) * (0-(52.65349)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (1.92828-(0)));
            yy = -48.5 + (((tickAnim - 18) / 2) * (-36.21246-(-48.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (-2.76519-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm, frontrightarm.rotateAngleX + (float) Math.toRadians(xx), frontrightarm.rotateAngleY + (float) Math.toRadians(yy), frontrightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.91429-(0)));
            yy = -30.75 + (((tickAnim - 0) / 4) * (13.98584-(-30.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (-48.35416-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.91429 + (((tickAnim - 4) / 5) * (0-(3.91429)));
            yy = 13.98584 + (((tickAnim - 4) / 5) * (48.5-(13.98584)));
            zz = -48.35416 + (((tickAnim - 4) / 5) * (0-(-48.35416)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (-0.15614-(0)));
            yy = 48.5 + (((tickAnim - 9) / 6) * (8.87364-(48.5)));
            zz = 0 + (((tickAnim - 9) / 6) * (-1.01212-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.15614 + (((tickAnim - 15) / 5) * (0-(-0.15614)));
            yy = 8.87364 + (((tickAnim - 15) / 5) * (-30.75-(8.87364)));
            zz = -1.01212 + (((tickAnim - 15) / 5) * (0-(-1.01212)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm, frontleftarm.rotateAngleX + (float) Math.toRadians(xx), frontleftarm.rotateAngleY + (float) Math.toRadians(yy), frontleftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 17.25 + (((tickAnim - 0) / 7) * (47.24117-(17.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (8.16713-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-30.3683-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 47.24117 + (((tickAnim - 7) / 3) * (2-(47.24117)));
            yy = 8.16713 + (((tickAnim - 7) / 3) * (0-(8.16713)));
            zz = -30.3683 + (((tickAnim - 7) / 3) * (0-(-30.3683)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (17.25-(2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -37.32047 + (((tickAnim - 0) / 4) * (44.00862-(-37.32047)));
            yy = -85.35371 + (((tickAnim - 0) / 4) * (-47.20618-(-85.35371)));
            zz = 43.50948 + (((tickAnim - 0) / 4) * (-52.778-(43.50948)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 44.00862 + (((tickAnim - 4) / 3) * (48.75472-(44.00862)));
            yy = -47.20618 + (((tickAnim - 4) / 3) * (-24.1004-(-47.20618)));
            zz = -52.778 + (((tickAnim - 4) / 3) * (-70.30048-(-52.778)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 48.75472 + (((tickAnim - 7) / 2) * (9.17059-(48.75472)));
            yy = -24.1004 + (((tickAnim - 7) / 2) * (-40.51321-(-24.1004)));
            zz = -70.30048 + (((tickAnim - 7) / 2) * (1.00935-(-70.30048)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 9.17059 + (((tickAnim - 9) / 1) * (29.49663-(9.17059)));
            yy = -40.51321 + (((tickAnim - 9) / 1) * (-26.13905-(-40.51321)));
            zz = 1.00935 + (((tickAnim - 9) / 1) * (-15.78375-(1.00935)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 29.49663 + (((tickAnim - 10) / 6) * (10.63154-(29.49663)));
            yy = -26.13905 + (((tickAnim - 10) / 6) * (-71.63898-(-26.13905)));
            zz = -15.78375 + (((tickAnim - 10) / 6) * (-12.24862-(-15.78375)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 10.63154 + (((tickAnim - 16) / 4) * (-37.32047-(10.63154)));
            yy = -71.63898 + (((tickAnim - 16) / 4) * (-85.35371-(-71.63898)));
            zz = -12.24862 + (((tickAnim - 16) / 4) * (43.50948-(-12.24862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 7) / 3) * (-0.175-(0.225)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -0.175 + (((tickAnim - 10) / 6) * (-0.395-(-0.175)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.395 + (((tickAnim - 16) / 4) * (0-(-0.395)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 17.25 + (((tickAnim - 11) / 6) * (21.25-(17.25)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (50.75-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 21.25 + (((tickAnim - 17) / 3) * (0-(21.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 50.75 + (((tickAnim - 17) / 3) * (0-(50.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.1-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -0.325 + (((tickAnim - 11) / 9) * (0-(-0.325)));
            zz = 0.1 + (((tickAnim - 11) / 9) * (0-(0.1)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-11.09903-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (42.33295-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.2273-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -11.09903 + (((tickAnim - 5) / 3) * (-22.90526-(-11.09903)));
            yy = 42.33295 + (((tickAnim - 5) / 3) * (66.58929-(42.33295)));
            zz = 1.2273 + (((tickAnim - 5) / 3) * (-16.3516-(1.2273)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.90526 + (((tickAnim - 8) / 2) * (-74.65251-(-22.90526)));
            yy = 66.58929 + (((tickAnim - 8) / 2) * (75.55466-(66.58929)));
            zz = -16.3516 + (((tickAnim - 8) / 2) * (-75.86662-(-16.3516)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -74.65251 + (((tickAnim - 10) / 4) * (28.31764-(-74.65251)));
            yy = 75.55466 + (((tickAnim - 10) / 4) * (37.68583-(75.55466)));
            zz = -75.86662 + (((tickAnim - 10) / 4) * (38.41266-(-75.86662)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 28.31764 + (((tickAnim - 14) / 3) * (20.43016-(28.31764)));
            yy = 37.68583 + (((tickAnim - 14) / 3) * (-4.45804-(37.68583)));
            zz = 38.41266 + (((tickAnim - 14) / 3) * (48.40475-(38.41266)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 20.43016 + (((tickAnim - 17) / 2) * (6.95952-(20.43016)));
            yy = -4.45804 + (((tickAnim - 17) / 2) * (-0.3748-(-4.45804)));
            zz = 48.40475 + (((tickAnim - 17) / 2) * (6.95055-(48.40475)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 6.95952 + (((tickAnim - 19) / 1) * (0-(6.95952)));
            yy = -0.3748 + (((tickAnim - 19) / 1) * (0-(-0.3748)));
            zz = 6.95055 + (((tickAnim - 19) / 1) * (0-(6.95055)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.245-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.245 + (((tickAnim - 5) / 5) * (-0.2-(-0.245)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 7) * (0.225-(-0.2)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 17) / 3) * (0-(0.225)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.59196-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-29.95066-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-19.30428-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 25.59196 + (((tickAnim - 10) / 4) * (18.04806-(25.59196)));
            yy = -29.95066 + (((tickAnim - 10) / 4) * (-1.36231-(-29.95066)));
            zz = -19.30428 + (((tickAnim - 10) / 4) * (-47.58219-(-19.30428)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 18.04806 + (((tickAnim - 14) / 4) * (0-(18.04806)));
            yy = -1.36231 + (((tickAnim - 14) / 4) * (0-(-1.36231)));
            zz = -47.58219 + (((tickAnim - 14) / 4) * (0-(-47.58219)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm2, frontrightarm2.rotateAngleX + (float) Math.toRadians(xx), frontrightarm2.rotateAngleY + (float) Math.toRadians(yy), frontrightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.07449 + (((tickAnim - 0) / 3) * (-12.99871-(-0.07449)));
            yy = -22.74863 + (((tickAnim - 0) / 3) * (-24.55337-(-22.74863)));
            zz = 2.27776 + (((tickAnim - 0) / 3) * (11.54642-(2.27776)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -12.99871 + (((tickAnim - 3) / 7) * (-32.12392-(-12.99871)));
            yy = -24.55337 + (((tickAnim - 3) / 7) * (-40.36402-(-24.55337)));
            zz = 11.54642 + (((tickAnim - 3) / 7) * (35.46712-(11.54642)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -32.12392 + (((tickAnim - 10) / 4) * (31.87028-(-32.12392)));
            yy = -40.36402 + (((tickAnim - 10) / 4) * (-33.6596-(-40.36402)));
            zz = 35.46712 + (((tickAnim - 10) / 4) * (-43.91885-(35.46712)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 31.87028 + (((tickAnim - 14) / 3) * (-13.43119-(31.87028)));
            yy = -33.6596 + (((tickAnim - 14) / 3) * (-22.75964-(-33.6596)));
            zz = -43.91885 + (((tickAnim - 14) / 3) * (4.33718-(-43.91885)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -13.43119 + (((tickAnim - 17) / 1) * (0-(-13.43119)));
            yy = -22.75964 + (((tickAnim - 17) / 1) * (8.25-(-22.75964)));
            zz = 4.33718 + (((tickAnim - 17) / 1) * (0-(4.33718)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-0.07449-(0)));
            yy = 8.25 + (((tickAnim - 18) / 2) * (-22.74863-(8.25)));
            zz = 0 + (((tickAnim - 18) / 2) * (2.27776-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm3, frontrightarm3.rotateAngleX + (float) Math.toRadians(xx), frontrightarm3.rotateAngleY + (float) Math.toRadians(yy), frontrightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 3) * (0.23-(0.1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.23 + (((tickAnim - 3) / 2) * (0.24-(0.23)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.24 + (((tickAnim - 5) / 2) * (0.15-(0.24)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 7) / 5) * (0-(0.15)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0.1-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightarm3.rotationPointX = this.frontrightarm3.rotationPointX + (float)(xx);
        this.frontrightarm3.rotationPointY = this.frontrightarm3.rotationPointY - (float)(yy);
        this.frontrightarm3.rotationPointZ = this.frontrightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (26.79806-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.3623-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (47.5822-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 26.79806 + (((tickAnim - 4) / 5) * (0-(26.79806)));
            yy = 1.3623 + (((tickAnim - 4) / 5) * (0-(1.3623)));
            zz = 47.5822 + (((tickAnim - 4) / 5) * (0-(47.5822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm2, frontleftarm2.rotateAngleX + (float) Math.toRadians(xx), frontleftarm2.rotateAngleY + (float) Math.toRadians(yy), frontleftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (31.87028-(0)));
            yy = 86.25 + (((tickAnim - 0) / 4) * (33.6596-(86.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (43.9189-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 31.87028 + (((tickAnim - 4) / 4) * (-6.75-(31.87028)));
            yy = 33.6596 + (((tickAnim - 4) / 4) * (0-(33.6596)));
            zz = 43.9189 + (((tickAnim - 4) / 4) * (0-(43.9189)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -6.75 + (((tickAnim - 8) / 1) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (1.75-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (47.91667-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.75 + (((tickAnim - 16) / 4) * (0-(1.75)));
            yy = 47.91667 + (((tickAnim - 16) / 4) * (86.25-(47.91667)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm3, frontleftarm3.rotateAngleX + (float) Math.toRadians(xx), frontleftarm3.rotateAngleY + (float) Math.toRadians(yy), frontleftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (0.1-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 16) / 4) * (0-(0.1)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftarm3.rotationPointX = this.frontleftarm3.rotationPointX + (float)(xx);
        this.frontleftarm3.rotationPointY = this.frontleftarm3.rotationPointY - (float)(yy);
        this.frontleftarm3.rotationPointZ = this.frontleftarm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-130))*1), lowerbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+35))*7), lowerbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*5));
        this.lowerbody.rotationPointX = this.lowerbody.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.159);
        this.lowerbody.rotationPointY = this.lowerbody.rotationPointY - (float)(0);
        this.lowerbody.rotationPointZ = this.lowerbody.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-180))*8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*2));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-2), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*5), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*2.1));
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(0);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(0);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(0.125);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*4), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-140))*5), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.95))*1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-180))*-11.5), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-180))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-280))*-11), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-1));


    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypuronector entity = (EntityPrehistoricFloraHypuronector) entitylivingbaseIn;
        int animCycle = 10;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.75 + (((tickAnim - 0) / 3) * (-10.68646-(18.75)));
            yy = 30.25 + (((tickAnim - 0) / 3) * (-8.66827-(30.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (61.40406-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10.68646 + (((tickAnim - 3) / 2) * (0-(-10.68646)));
            yy = -8.66827 + (((tickAnim - 3) / 2) * (-53.5-(-8.66827)));
            zz = 61.40406 + (((tickAnim - 3) / 2) * (0-(61.40406)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (18.75-(0)));
            yy = -53.5 + (((tickAnim - 5) / 5) * (30.25-(-53.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.75 + (((tickAnim - 0) / 3) * (3.86886-(12.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.07067-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-52.57863-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.86886 + (((tickAnim - 3) / 2) * (0-(3.86886)));
            yy = 5.07067 + (((tickAnim - 3) / 2) * (0-(5.07067)));
            zz = -52.57863 + (((tickAnim - 3) / 2) * (14.25-(-52.57863)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (12.75-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 14.25 + (((tickAnim - 5) / 5) * (0-(14.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.61836 + (((tickAnim - 0) / 3) * (32.41708-(-16.61836)));
            yy = -72.28476 + (((tickAnim - 0) / 3) * (-3.99116-(-72.28476)));
            zz = 15.94 + (((tickAnim - 0) / 3) * (-65.7299-(15.94)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 32.41708 + (((tickAnim - 3) / 1) * (10.39026-(32.41708)));
            yy = -3.99116 + (((tickAnim - 3) / 1) * (-3.26676-(-3.99116)));
            zz = -65.7299 + (((tickAnim - 3) / 1) * (-11.58123-(-65.7299)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 10.39026 + (((tickAnim - 4) / 1) * (0-(10.39026)));
            yy = -3.26676 + (((tickAnim - 4) / 1) * (0-(-3.26676)));
            zz = -11.58123 + (((tickAnim - 4) / 1) * (-12.25-(-11.58123)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-16.61836-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-72.28476-(0)));
            zz = -12.25 + (((tickAnim - 5) / 5) * (15.94-(-12.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (13.28123-(0)));
            yy = 54 + (((tickAnim - 0) / 4) * (-32.81012-(54)));
            zz = 0 + (((tickAnim - 0) / 4) * (10.43402-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 13.28123 + (((tickAnim - 4) / 3) * (-17.79438-(13.28123)));
            yy = -32.81012 + (((tickAnim - 4) / 3) * (4.01203-(-32.81012)));
            zz = 10.43402 + (((tickAnim - 4) / 3) * (-56.73139-(10.43402)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -17.79438 + (((tickAnim - 7) / 3) * (0-(-17.79438)));
            yy = 4.01203 + (((tickAnim - 7) / 3) * (54-(4.01203)));
            zz = -56.73139 + (((tickAnim - 7) / 3) * (0-(-56.73139)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (16.49932-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-9.83635-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.89677-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 16.49932 + (((tickAnim - 4) / 3) * (7.83047-(16.49932)));
            yy = -9.83635 + (((tickAnim - 4) / 3) * (-17.51844-(-9.83635)));
            zz = -2.89677 + (((tickAnim - 4) / 3) * (32.57446-(-2.89677)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 7.83047 + (((tickAnim - 7) / 3) * (0-(7.83047)));
            yy = -17.51844 + (((tickAnim - 7) / 3) * (0-(-17.51844)));
            zz = 32.57446 + (((tickAnim - 7) / 3) * (0-(32.57446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-18.02327-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (70.50784-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-19.04213-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -18.02327 + (((tickAnim - 4) / 3) * (54.87826-(-18.02327)));
            yy = 70.50784 + (((tickAnim - 4) / 3) * (15.85586-(70.50784)));
            zz = -19.04213 + (((tickAnim - 4) / 3) * (67.85736-(-19.04213)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 54.87826 + (((tickAnim - 7) / 1) * (22.76523-(54.87826)));
            yy = 15.85586 + (((tickAnim - 7) / 1) * (17.58292-(15.85586)));
            zz = 67.85736 + (((tickAnim - 7) / 1) * (13.05696-(67.85736)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.76523 + (((tickAnim - 8) / 2) * (0-(22.76523)));
            yy = 17.58292 + (((tickAnim - 8) / 2) * (0-(17.58292)));
            zz = 13.05696 + (((tickAnim - 8) / 2) * (0-(13.05696)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 4) * (0-(0.1)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0.1-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
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
            xx = -15.13705 + (((tickAnim - 0) / 5) * (11.62789-(-15.13705)));
            yy = -59.96781 + (((tickAnim - 0) / 5) * (34.67487-(-59.96781)));
            zz = -3.87042 + (((tickAnim - 0) / 5) * (15.24098-(-3.87042)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 11.62789 + (((tickAnim - 5) / 1) * (20.41806-(11.62789)));
            yy = 34.67487 + (((tickAnim - 5) / 1) * (15.66971-(34.67487)));
            zz = 15.24098 + (((tickAnim - 5) / 1) * (31.6868-(15.24098)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 20.41806 + (((tickAnim - 6) / 2) * (-3.14125-(20.41806)));
            yy = 15.66971 + (((tickAnim - 6) / 2) * (-15.37109-(15.66971)));
            zz = 31.6868 + (((tickAnim - 6) / 2) * (54.55232-(31.6868)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.14125 + (((tickAnim - 8) / 2) * (-15.13705-(-3.14125)));
            yy = -15.37109 + (((tickAnim - 8) / 2) * (-59.96781-(-15.37109)));
            zz = 54.55232 + (((tickAnim - 8) / 2) * (-3.87042-(54.55232)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm, frontrightarm.rotateAngleX + (float) Math.toRadians(xx), frontrightarm.rotateAngleY + (float) Math.toRadians(yy), frontrightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.10108 + (((tickAnim - 0) / 5) * (7.41328-(17.10108)));
            yy = -1.72794 + (((tickAnim - 0) / 5) * (-37.63315-(-1.72794)));
            zz = 9.85108 + (((tickAnim - 0) / 5) * (-12.0292-(9.85108)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 7.41328 + (((tickAnim - 5) / 1) * (22.93527-(7.41328)));
            yy = -37.63315 + (((tickAnim - 5) / 1) * (-24.05928-(-37.63315)));
            zz = -12.0292 + (((tickAnim - 5) / 1) * (-31.16275-(-12.0292)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22.93527 + (((tickAnim - 6) / 2) * (21.92818-(22.93527)));
            yy = -24.05928 + (((tickAnim - 6) / 2) * (-9.86672-(-24.05928)));
            zz = -31.16275 + (((tickAnim - 6) / 2) * (-62.51376-(-31.16275)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21.92818 + (((tickAnim - 8) / 2) * (17.10108-(21.92818)));
            yy = -9.86672 + (((tickAnim - 8) / 2) * (-1.72794-(-9.86672)));
            zz = -62.51376 + (((tickAnim - 8) / 2) * (9.85108-(-62.51376)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm2, frontrightarm2.rotateAngleX + (float) Math.toRadians(xx), frontrightarm2.rotateAngleY + (float) Math.toRadians(yy), frontrightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.40448 + (((tickAnim - 0) / 3) * (-9.36859-(1.40448)));
            yy = -14.93561 + (((tickAnim - 0) / 3) * (-37.67343-(-14.93561)));
            zz = -5.43411 + (((tickAnim - 0) / 3) * (4.36959-(-5.43411)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -9.36859 + (((tickAnim - 3) / 1) * (0.65626-(-9.36859)));
            yy = -37.67343 + (((tickAnim - 3) / 1) * (-52.17184-(-37.67343)));
            zz = 4.36959 + (((tickAnim - 3) / 1) * (0.33034-(4.36959)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.65626 + (((tickAnim - 4) / 1) * (9.96921-(0.65626)));
            yy = -52.17184 + (((tickAnim - 4) / 1) * (-62.04179-(-52.17184)));
            zz = 0.33034 + (((tickAnim - 4) / 1) * (-11.25472-(0.33034)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 9.96921 + (((tickAnim - 5) / 3) * (24.50115-(9.96921)));
            yy = -62.04179 + (((tickAnim - 5) / 3) * (-31.34498-(-62.04179)));
            zz = -11.25472 + (((tickAnim - 5) / 3) * (-41.22236-(-11.25472)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 24.50115 + (((tickAnim - 8) / 1) * (-2.33836-(24.50115)));
            yy = -31.34498 + (((tickAnim - 8) / 1) * (-21.45601-(-31.34498)));
            zz = -41.22236 + (((tickAnim - 8) / 1) * (0.90014-(-41.22236)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -2.33836 + (((tickAnim - 9) / 1) * (1.40448-(-2.33836)));
            yy = -21.45601 + (((tickAnim - 9) / 1) * (-14.93561-(-21.45601)));
            zz = 0.90014 + (((tickAnim - 9) / 1) * (-5.43411-(0.90014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm3, frontrightarm3.rotateAngleX + (float) Math.toRadians(xx), frontrightarm3.rotateAngleY + (float) Math.toRadians(yy), frontrightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.455-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.455 + (((tickAnim - 2) / 1) * (0.425-(0.455)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.425 + (((tickAnim - 3) / 6) * (0.4-(0.425)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 9) / 1) * (0-(0.4)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightarm3.rotationPointX = this.frontrightarm3.rotationPointX + (float)(xx);
        this.frontrightarm3.rotationPointY = this.frontrightarm3.rotationPointY - (float)(yy);
        this.frontrightarm3.rotationPointZ = this.frontrightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.7385-(0)));
            yy = -36.5 + (((tickAnim - 0) / 3) * (10.84042-(-36.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-51.40564-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.7385 + (((tickAnim - 3) / 1) * (5.49489-(-1.7385)));
            yy = 10.84042 + (((tickAnim - 3) / 1) * (75.73383-(10.84042)));
            zz = -51.40564 + (((tickAnim - 3) / 1) * (2.87465-(-51.40564)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 5.49489 + (((tickAnim - 4) / 6) * (0-(5.49489)));
            yy = 75.73383 + (((tickAnim - 4) / 6) * (-36.5-(75.73383)));
            zz = 2.87465 + (((tickAnim - 4) / 6) * (0-(2.87465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm, frontleftarm.rotateAngleX + (float) Math.toRadians(xx), frontleftarm.rotateAngleY + (float) Math.toRadians(yy), frontleftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (30.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 30.5 + (((tickAnim - 3) / 1) * (0-(30.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm2, frontleftarm2.rotateAngleX + (float) Math.toRadians(xx), frontleftarm2.rotateAngleY + (float) Math.toRadians(yy), frontleftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (102.74999-(0)));
            yy = 90 + (((tickAnim - 0) / 1) * (80.25-(90)));
            zz = 0 + (((tickAnim - 0) / 1) * (89.99999-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 102.74999 + (((tickAnim - 1) / 2) * (59.77984-(102.74999)));
            yy = 80.25 + (((tickAnim - 1) / 2) * (18.50352-(80.25)));
            zz = 89.99999 + (((tickAnim - 1) / 2) * (61.77161-(89.99999)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 59.77984 + (((tickAnim - 3) / 0) * (12.2766-(59.77984)));
            yy = 18.50352 + (((tickAnim - 3) / 0) * (36.07598-(18.50352)));
            zz = 61.77161 + (((tickAnim - 3) / 0) * (-8.23787-(61.77161)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 12.2766 + (((tickAnim - 3) / 1) * (-2.5-(12.2766)));
            yy = 36.07598 + (((tickAnim - 3) / 1) * (0-(36.07598)));
            zz = -8.23787 + (((tickAnim - 3) / 1) * (0-(-8.23787)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 4) / 6) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (90-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm3, frontleftarm3.rotateAngleX + (float) Math.toRadians(xx), frontleftarm3.rotateAngleY + (float) Math.toRadians(yy), frontleftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.225-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 2) * (0-(0.225)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftarm3.rotationPointX = this.frontleftarm3.rotationPointX + (float)(xx);
        this.frontleftarm3.rotationPointY = this.frontleftarm3.rotationPointY - (float)(yy);
        this.frontleftarm3.rotationPointZ = this.frontleftarm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*1), lowerbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+55))*10), lowerbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*5));
        this.lowerbody.rotationPointX = this.lowerbody.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.259);
        this.lowerbody.rotationPointY = this.lowerbody.rotationPointY - (float)(0);
        this.lowerbody.rotationPointZ = this.lowerbody.rotationPointZ + (float)(0);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-280))*-11), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*10), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*-2), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*15), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2.1));
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(0);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(0);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(0.275);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*1), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-140))*5), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*-5), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*1));


    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraHypuronector entity = (EntityPrehistoricFloraHypuronector) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 54.70689 + (((tickAnim - 0) / 5) * (-11.07287-(54.70689)));
            yy = 41.47214 + (((tickAnim - 0) / 5) * (5.78596-(41.47214)));
            zz = 56.59823 + (((tickAnim - 0) / 5) * (64.6266-(56.59823)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -11.07287 + (((tickAnim - 5) / 5) * (-51.75962-(-11.07287)));
            yy = 5.78596 + (((tickAnim - 5) / 5) * (-16.28513-(5.78596)));
            zz = 64.6266 + (((tickAnim - 5) / 5) * (70.05884-(64.6266)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -51.75962 + (((tickAnim - 10) / 10) * (54.70689-(-51.75962)));
            yy = -16.28513 + (((tickAnim - 10) / 10) * (41.47214-(-16.28513)));
            zz = 70.05884 + (((tickAnim - 10) / 10) * (56.59823-(70.05884)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -41.38064 + (((tickAnim - 0) / 11) * (47.57765-(-41.38064)));
            yy = 22.83794 + (((tickAnim - 0) / 11) * (-38.34363-(22.83794)));
            zz = -66.22447 + (((tickAnim - 0) / 11) * (-61.01637-(-66.22447)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 47.57765 + (((tickAnim - 11) / 6) * (-17.09962-(47.57765)));
            yy = -38.34363 + (((tickAnim - 11) / 6) * (-12.23956-(-38.34363)));
            zz = -61.01637 + (((tickAnim - 11) / 6) * (-59.38299-(-61.01637)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -17.09962 + (((tickAnim - 17) / 3) * (-41.38064-(-17.09962)));
            yy = -12.23956 + (((tickAnim - 17) / 3) * (22.83794-(-12.23956)));
            zz = -59.38299 + (((tickAnim - 17) / 3) * (-66.22447-(-59.38299)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -25.29506 + (((tickAnim - 0) / 6) * (-7.972-(-25.29506)));
            yy = -26.88829 + (((tickAnim - 0) / 6) * (-9.06289-(-26.88829)));
            zz = 46.75637 + (((tickAnim - 0) / 6) * (67.60691-(46.75637)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -7.972 + (((tickAnim - 6) / 4) * (19.92186-(-7.972)));
            yy = -9.06289 + (((tickAnim - 6) / 4) * (2.85476-(-9.06289)));
            zz = 67.60691 + (((tickAnim - 6) / 4) * (66.89114-(67.60691)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 19.92186 + (((tickAnim - 10) / 4) * (-9.92943-(19.92186)));
            yy = 2.85476 + (((tickAnim - 10) / 4) * (-12.34381-(2.85476)));
            zz = 66.89114 + (((tickAnim - 10) / 4) * (73.15963-(66.89114)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -9.92943 + (((tickAnim - 14) / 4) * (-36.55841-(-9.92943)));
            yy = -12.34381 + (((tickAnim - 14) / 4) * (-34.41924-(-12.34381)));
            zz = 73.15963 + (((tickAnim - 14) / 4) * (52.68328-(73.15963)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -36.55841 + (((tickAnim - 18) / 2) * (-25.29506-(-36.55841)));
            yy = -34.41924 + (((tickAnim - 18) / 2) * (-26.88829-(-34.41924)));
            zz = 52.68328 + (((tickAnim - 18) / 2) * (46.75637-(52.68328)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm, frontrightarm.rotateAngleX + (float) Math.toRadians(xx), frontrightarm.rotateAngleY + (float) Math.toRadians(yy), frontrightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            yy = -0.325 + (((tickAnim - 6) / 14) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightarm.rotationPointX = this.frontrightarm.rotationPointX + (float)(xx);
        this.frontrightarm.rotationPointY = this.frontrightarm.rotationPointY - (float)(yy);
        this.frontrightarm.rotationPointZ = this.frontrightarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 24.96682 + (((tickAnim - 0) / 4) * (-3.81366-(24.96682)));
            yy = -18.55939 + (((tickAnim - 0) / 4) * (14.0131-(-18.55939)));
            zz = -55.64338 + (((tickAnim - 0) / 4) * (-79.55333-(-55.64338)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -3.81366 + (((tickAnim - 4) / 5) * (-36.55841-(-3.81366)));
            yy = 14.0131 + (((tickAnim - 4) / 5) * (34.41924-(14.0131)));
            zz = -79.55333 + (((tickAnim - 4) / 5) * (-52.68328-(-79.55333)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -36.55841 + (((tickAnim - 9) / 6) * (-6.69011-(-36.55841)));
            yy = 34.41924 + (((tickAnim - 9) / 6) * (5.34183-(34.41924)));
            zz = -52.68328 + (((tickAnim - 9) / 6) * (-49.03328-(-52.68328)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.69011 + (((tickAnim - 15) / 5) * (24.96682-(-6.69011)));
            yy = 5.34183 + (((tickAnim - 15) / 5) * (-18.55939-(5.34183)));
            zz = -49.03328 + (((tickAnim - 15) / 5) * (-55.64338-(-49.03328)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm, frontleftarm.rotateAngleX + (float) Math.toRadians(xx), frontleftarm.rotateAngleY + (float) Math.toRadians(yy), frontleftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8.865 + (((tickAnim - 0) / 5) * (36.02754-(-8.865)));
            yy = -8.61858 + (((tickAnim - 0) / 5) * (3.39497-(-8.61858)));
            zz = -16.66431 + (((tickAnim - 0) / 5) * (-21.77513-(-16.66431)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 36.02754 + (((tickAnim - 5) / 5) * (0.82692-(36.02754)));
            yy = 3.39497 + (((tickAnim - 5) / 5) * (17.336-(3.39497)));
            zz = -21.77513 + (((tickAnim - 5) / 5) * (-66.51624-(-21.77513)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.82692 + (((tickAnim - 10) / 10) * (-8.865-(0.82692)));
            yy = 17.336 + (((tickAnim - 10) / 10) * (-8.61858-(17.336)));
            zz = -66.51624 + (((tickAnim - 10) / 10) * (-16.66431-(-66.51624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -219.47182 + (((tickAnim - 0) / 5) * (-293.68596-(-219.47182)));
            yy = -82.62386 + (((tickAnim - 0) / 5) * (-42.21097-(-82.62386)));
            zz = 192.07168 + (((tickAnim - 0) / 5) * (261.24653-(192.07168)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -293.68596 + (((tickAnim - 5) / 2) * (-310.63485-(-293.68596)));
            yy = -42.21097 + (((tickAnim - 5) / 2) * (-26.64538-(-42.21097)));
            zz = 261.24653 + (((tickAnim - 5) / 2) * (290.51373-(261.24653)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -310.63485 + (((tickAnim - 7) / 1) * (-367.4852-(-310.63485)));
            yy = -26.64538 + (((tickAnim - 7) / 1) * (-37.30875-(-26.64538)));
            zz = 290.51373 + (((tickAnim - 7) / 1) * (379.08393-(290.51373)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -367.4852 + (((tickAnim - 8) / 2) * (-362.19525-(-367.4852)));
            yy = -37.30875 + (((tickAnim - 8) / 2) * (-34.61337-(-37.30875)));
            zz = 379.08393 + (((tickAnim - 8) / 2) * (362.00533-(379.08393)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -362.19525 + (((tickAnim - 10) / 5) * (-298.64084-(-362.19525)));
            yy = -34.61337 + (((tickAnim - 10) / 5) * (-67.27032-(-34.61337)));
            zz = 362.00533 + (((tickAnim - 10) / 5) * (285.77678-(362.00533)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -298.64084 + (((tickAnim - 15) / 5) * (-219.47182-(-298.64084)));
            yy = -67.27032 + (((tickAnim - 15) / 5) * (-82.62386-(-67.27032)));
            zz = 285.77678 + (((tickAnim - 15) / 5) * (192.07168-(285.77678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 7) / 3) * (-0.175-(0.225)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 10) / 10) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (12.64215-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (13.94229-(0)));
            zz = 53.75 + (((tickAnim - 0) / 11) * (48.6618-(53.75)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 12.64215 + (((tickAnim - 11) / 6) * (18.52442-(12.64215)));
            yy = 13.94229 + (((tickAnim - 11) / 6) * (10.59999-(13.94229)));
            zz = 48.6618 + (((tickAnim - 11) / 6) * (21.98345-(48.6618)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 18.52442 + (((tickAnim - 17) / 3) * (0-(18.52442)));
            yy = 10.59999 + (((tickAnim - 17) / 3) * (0-(10.59999)));
            zz = 21.98345 + (((tickAnim - 17) / 3) * (53.75-(21.98345)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.1-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -0.325 + (((tickAnim - 11) / 9) * (0-(-0.325)));
            zz = 0.1 + (((tickAnim - 11) / 9) * (0-(0.1)));
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
            xx = -1.25 + (((tickAnim - 0) / 5) * (-23.6931-(-1.25)));
            yy = 32.75 + (((tickAnim - 0) / 5) * (59.71525-(32.75)));
            zz = -3.25 + (((tickAnim - 0) / 5) * (-22.60129-(-3.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -23.6931 + (((tickAnim - 5) / 5) * (-74.65251-(-23.6931)));
            yy = 59.71525 + (((tickAnim - 5) / 5) * (75.55466-(59.71525)));
            zz = -22.60129 + (((tickAnim - 5) / 5) * (-75.86662-(-22.60129)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -74.65251 + (((tickAnim - 10) / 4) * (28.31764-(-74.65251)));
            yy = 75.55466 + (((tickAnim - 10) / 4) * (37.68583-(75.55466)));
            zz = -75.86662 + (((tickAnim - 10) / 4) * (38.41266-(-75.86662)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 28.31764 + (((tickAnim - 14) / 3) * (70.68016-(28.31764)));
            yy = 37.68583 + (((tickAnim - 14) / 3) * (-4.45804-(37.68583)));
            zz = 38.41266 + (((tickAnim - 14) / 3) * (48.40475-(38.41266)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 70.68016 + (((tickAnim - 17) / 1) * (9.23881-(70.68016)));
            yy = -4.45804 + (((tickAnim - 17) / 1) * (41.00167-(-4.45804)));
            zz = 48.40475 + (((tickAnim - 17) / 1) * (13.08773-(48.40475)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 9.23881 + (((tickAnim - 18) / 2) * (-1.25-(9.23881)));
            yy = 41.00167 + (((tickAnim - 18) / 2) * (32.75-(41.00167)));
            zz = 13.08773 + (((tickAnim - 18) / 2) * (-3.25-(13.08773)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 7) * (0.225-(-0.2)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 17) / 3) * (0-(0.225)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (22.41922-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-4.41717-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-49.07999-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 22.41922 + (((tickAnim - 6) / 4) * (35.08522-(22.41922)));
            yy = -4.41717 + (((tickAnim - 6) / 4) * (-17.25956-(-4.41717)));
            zz = -49.07999 + (((tickAnim - 6) / 4) * (-42.59462-(-49.07999)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 35.08522 + (((tickAnim - 10) / 4) * (15.00717-(35.08522)));
            yy = -17.25956 + (((tickAnim - 10) / 4) * (-23.50715-(-17.25956)));
            zz = -42.59462 + (((tickAnim - 10) / 4) * (0.78015-(-42.59462)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15.00717 + (((tickAnim - 14) / 4) * (0-(15.00717)));
            yy = -23.50715 + (((tickAnim - 14) / 4) * (0-(-23.50715)));
            zz = 0.78015 + (((tickAnim - 14) / 4) * (5-(0.78015)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 18) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm2, frontrightarm2.rotateAngleX + (float) Math.toRadians(xx), frontrightarm2.rotateAngleY + (float) Math.toRadians(yy), frontrightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.61972 + (((tickAnim - 0) / 3) * (-26.4031-(-6.61972)));
            yy = -26.14688 + (((tickAnim - 0) / 3) * (-36.65273-(-26.14688)));
            zz = -37.48796 + (((tickAnim - 0) / 3) * (-8.15243-(-37.48796)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -26.4031 + (((tickAnim - 3) / 3) * (-46.62853-(-26.4031)));
            yy = -36.65273 + (((tickAnim - 3) / 3) * (-37.76334-(-36.65273)));
            zz = -8.15243 + (((tickAnim - 3) / 3) * (17.31461-(-8.15243)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -46.62853 + (((tickAnim - 6) / 4) * (-77.51429-(-46.62853)));
            yy = -37.76334 + (((tickAnim - 6) / 4) * (-41.65479-(-37.76334)));
            zz = 17.31461 + (((tickAnim - 6) / 4) * (54.63904-(17.31461)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -77.51429 + (((tickAnim - 10) / 4) * (39.06338-(-77.51429)));
            yy = -41.65479 + (((tickAnim - 10) / 4) * (-57.20178-(-41.65479)));
            zz = 54.63904 + (((tickAnim - 10) / 4) * (-62.58207-(54.63904)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 39.06338 + (((tickAnim - 14) / 3) * (-13.43119-(39.06338)));
            yy = -57.20178 + (((tickAnim - 14) / 3) * (-22.75964-(-57.20178)));
            zz = -62.58207 + (((tickAnim - 14) / 3) * (4.33718-(-62.58207)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -13.43119 + (((tickAnim - 17) / 1) * (-3.53379-(-13.43119)));
            yy = -22.75964 + (((tickAnim - 17) / 1) * (-12.29818-(-22.75964)));
            zz = 4.33718 + (((tickAnim - 17) / 1) * (-43.05365-(4.33718)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -3.53379 + (((tickAnim - 18) / 2) * (-6.61972-(-3.53379)));
            yy = -12.29818 + (((tickAnim - 18) / 2) * (-26.14688-(-12.29818)));
            zz = -43.05365 + (((tickAnim - 18) / 2) * (-37.48796-(-43.05365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightarm3, frontrightarm3.rotateAngleX + (float) Math.toRadians(xx), frontrightarm3.rotateAngleY + (float) Math.toRadians(yy), frontrightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.43-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.43 + (((tickAnim - 3) / 1) * (0.53-(0.43)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.12-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.53 + (((tickAnim - 4) / 1) * (0.555-(0.53)));
            zz = 0.12 + (((tickAnim - 4) / 1) * (0.2-(0.12)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.555 + (((tickAnim - 5) / 1) * (0.44-(0.555)));
            zz = 0.2 + (((tickAnim - 5) / 1) * (0.275-(0.2)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.44 + (((tickAnim - 6) / 6) * (0-(0.44)));
            zz = 0.275 + (((tickAnim - 6) / 6) * (0-(0.275)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightarm3.rotationPointX = this.frontrightarm3.rotationPointX + (float)(xx);
        this.frontrightarm3.rotationPointY = this.frontrightarm3.rotationPointY - (float)(yy);
        this.frontrightarm3.rotationPointZ = this.frontrightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (23.70371-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (12.94986-(0)));
            zz = 23 + (((tickAnim - 0) / 4) * (23.23638-(23)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 23.70371 + (((tickAnim - 4) / 5) * (0-(23.70371)));
            yy = 12.94986 + (((tickAnim - 4) / 5) * (0-(12.94986)));
            zz = 23.23638 + (((tickAnim - 4) / 5) * (0-(23.23638)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (19.13-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 19.13 + (((tickAnim - 15) / 5) * (23-(19.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm2, frontleftarm2.rotateAngleX + (float) Math.toRadians(xx), frontleftarm2.rotateAngleY + (float) Math.toRadians(yy), frontleftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -81.88685 + (((tickAnim - 0) / 4) * (31.87028-(-81.88685)));
            yy = 84.06628 + (((tickAnim - 0) / 4) * (33.6596-(84.06628)));
            zz = -57.11212 + (((tickAnim - 0) / 4) * (43.9189-(-57.11212)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 31.87028 + (((tickAnim - 4) / 4) * (-6.75-(31.87028)));
            yy = 33.6596 + (((tickAnim - 4) / 4) * (0-(33.6596)));
            zz = 43.9189 + (((tickAnim - 4) / 4) * (0-(43.9189)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -6.75 + (((tickAnim - 8) / 1) * (-6.43101-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (14.07597-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (42.11973-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -6.43101 + (((tickAnim - 9) / 6) * (-7.25904-(-6.43101)));
            yy = 14.07597 + (((tickAnim - 9) / 6) * (53.63046-(14.07597)));
            zz = 42.11973 + (((tickAnim - 9) / 6) * (24.44957-(42.11973)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.25904 + (((tickAnim - 15) / 5) * (-81.88685-(-7.25904)));
            yy = 53.63046 + (((tickAnim - 15) / 5) * (84.06628-(53.63046)));
            zz = 24.44957 + (((tickAnim - 15) / 5) * (-57.11212-(24.44957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftarm3, frontleftarm3.rotateAngleX + (float) Math.toRadians(xx), frontleftarm3.rotateAngleY + (float) Math.toRadians(yy), frontleftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 9) * (0-(0.425)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0.58-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.58 + (((tickAnim - 15) / 5) * (0.425-(0.58)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftarm3.rotationPointX = this.frontleftarm3.rotationPointX + (float)(xx);
        this.frontleftarm3.rotationPointY = this.frontleftarm3.rotationPointY - (float)(yy);
        this.frontleftarm3.rotationPointZ = this.frontleftarm3.rotationPointZ + (float)(zz);

        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(xx), lowerbody.rotateAngleY + (float) Math.toRadians(yy), lowerbody.rotateAngleZ + (float) Math.toRadians(zz));

        this.lowerbody.rotationPointX = this.lowerbody.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.65);
        this.lowerbody.rotationPointY = this.lowerbody.rotationPointY - (float)(8.425);
        this.lowerbody.rotationPointZ = this.lowerbody.rotationPointZ + (float)(-13.2);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-270))*15), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+130))*5));

        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));

        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(0);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(0);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(0.3);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(7), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+120))*5), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+190))*5), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-5.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.95))*1), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*-17), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1.5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-290))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-80))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-320))*-15), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-130))*-3));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-9.5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHypuronector e = (EntityPrehistoricFloraHypuronector) entity;
        animator.update(entity);
        //this.resetToDefaultPose();

    }
}
