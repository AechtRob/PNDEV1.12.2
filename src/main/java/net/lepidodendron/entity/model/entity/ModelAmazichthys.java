package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAmazichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r35;


    private ModelAnimator animator;

    public ModelAmazichthys() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.347F, -3.8285F, -12.0232F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.2624F, -0.1495F, 0.0393F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 47, 0.275F, -0.05F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.347F, -3.8285F, -12.0232F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.2624F, 0.1495F, -0.0393F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 47, -0.275F, -0.05F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5964F, -4.1671F, -12.6473F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.3907F, -0.1215F, 0.0067F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 59, 39, -0.425F, -0.275F, -0.8F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5964F, -4.1671F, -12.6473F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.3907F, 0.1215F, -0.0067F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 39, -0.575F, -0.275F, -0.8F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.9912F, -2.5022F, -8.3471F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.3816F, -0.1309F, 0.0161F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 0, 0.0F, -3.1F, 0.125F, 1, 3, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.2217F, -3.9389F, -13.1538F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.1848F, -0.2027F, 0.0199F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 18, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.2217F, -3.9389F, -13.1538F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.1848F, 0.2027F, -0.0199F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 18, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.9912F, -2.5022F, -8.3471F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.3816F, 0.1309F, -0.0161F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 0, -1.0F, -3.1F, 0.125F, 1, 3, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.1247F, -11.222F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.3526F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 59, -1.5F, 0.0F, 0.2F, 2, 4, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -4.0079F, -13.0599F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.2217F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 59, -0.5F, 0.0F, 0.0F, 2, 2, 1, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -5.7819F, -13.9833F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.456F, -0.27F, -0.1446F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 28, 0.0F, 0.025F, 0.075F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.6135F, -6.593F, -12.1752F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2201F, -0.1097F, -0.0361F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 54, -0.025F, 0.0F, 0.025F, 1, 3, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.6135F, -6.593F, -12.1752F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2201F, 0.1097F, 0.0361F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 54, -0.975F, 0.0F, 0.025F, 1, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -5.7819F, -13.9833F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.456F, 0.27F, 0.1446F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 59, 28, -1.0F, 0.025F, 0.075F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -6.7054F, -12.2093F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 59, 6, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -6.7054F, -12.2093F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2793F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 57, 45, -0.5F, 0.0F, 0.0F, 2, 1, 3, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -1.2752F, 0.0291F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0698F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 40, 45, -0.5F, -1.0F, -0.3F, 3, 1, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -1.2752F, -3.9709F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0218F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 47, -1.5F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, -1.5242F, -7.9643F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 45, -0.5F, -3.1F, -1.0F, 4, 3, 5, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -8.9681F, -0.0048F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 27, 0, -2.5F, 0.0F, 0.0F, 4, 7, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -8.75F, -5.0F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6109F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 21, 21, -0.5F, 0.0F, 0.0F, 0, 5, 9, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -8.75F, -5.0F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 21, -2.5F, 0.0F, 0.0F, 5, 7, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.0004F, -4.3037F, -9.1645F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1939F, -0.1264F, -0.0354F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 0, 0.0F, -3.0F, 0.0F, 1, 5, 5, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.0004F, -4.3037F, -9.1645F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1939F, 0.1264F, 0.0354F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 46, 0, -1.0F, -3.0F, 0.0F, 1, 5, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, -8.75F, -5.0F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2705F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 21, 36, -0.5F, 0.0F, -5.0F, 4, 5, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0078F, -2.9099F, -8.8546F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 51, 52, -1.0078F, 0.0833F, -4.3594F, 2, 1, 5, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.6801F, 0.3333F, -3.0745F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0138F, -0.1256F, -0.1319F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 59, 32, -0.4F, -0.5F, -1.075F, 1, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.6645F, 0.3333F, -3.0745F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0138F, 0.1256F, 0.1319F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 59, 32, -0.6F, -0.5F, -1.075F, 1, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.9801F, 0.5583F, -4.2515F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0131F, -0.192F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 13, 0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 13, 0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.9645F, 0.5583F, -4.2515F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0131F, 0.192F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 27, 13, -1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.9F, -2.5242F, -5.9643F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, -1.0472F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 54, 0.0F, 0.0F, -2.0F, 0, 5, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.9F, -2.5242F, -5.9643F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, 1.0472F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 54, 0.0F, 0.0F, -2.0F, 0, 5, 4, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.1387F, -5.1834F, -12.0839F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, 0.1537F, 0.3036F, 0.103F);
        this.eye.cubeList.add(new ModelBox(eye, 59, 23, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 59, 36, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.1387F, -5.1834F, -12.0839F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, 0.1537F, -0.3036F, -0.103F);
        this.eye2.cubeList.add(new ModelBox(eye2, 59, 23, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 59, 36, -0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.1042F, -6.5106F, 4.1868F);
        this.main.addChild(tail);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.1042F, 3.0149F, 5.403F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1833F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 34, -1.5F, -2.2F, -6.125F, 3, 3, 7, -0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.1042F, -2.1926F, 0.4293F);
        this.tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2749F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 40, 13, -0.5F, 0.0F, 0.0F, 3, 4, 6, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.8208F, 4.5149F, 0.403F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.2194F, 0.2143F, -0.7617F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 59, 11, 0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0292F, 4.5149F, 0.403F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.2194F, -0.2143F, 0.7617F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 59, 11, 0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.0917F, 1.1529F, 5.0072F);
        this.tail.addChild(tail2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5125F, 1.747F, 5.1279F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1876F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 36, 52, -0.5F, -2.0F, -5.0F, 2, 2, 5, -0.006F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.4875F, -1.944F, 0.5298F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0131F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 19, 53, -2.75F, 2.875F, 0.6F, 2, 0, 5, 0.0F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 19, 53, -0.25F, 2.875F, 0.6F, 2, 0, 5, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5125F, -1.944F, 0.5298F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1178F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 24, -0.5F, 0.125F, -0.4F, 2, 3, 7, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0125F, -0.1551F, 6.4303F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -0.51F, -0.4128F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.8421F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, 0.5F, 0.3F, -2.5F, 0, 7, 13, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 40, 35, 0.0F, 0.3F, -0.2F, 1, 1, 8, 0.0F, false));



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
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.5F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
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
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.12F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetX = -0.06F;
        this.main.offsetZ = 0.03F;
        this.main.offsetY = -0.5F;
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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.2F * still);
            this.chainSwing(fishTail, speed * still, 0.2F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

