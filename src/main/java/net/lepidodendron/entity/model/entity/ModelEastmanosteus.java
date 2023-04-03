package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEastmanosteus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEastmanosteus extends AdvancedModelBase {
    private final AdvancedModelRenderer Eastmanosteus;
    private final AdvancedModelRenderer Head;
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
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer VentralL;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer VentralR;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;

    private ModelAnimator animator;

    public ModelEastmanosteus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Eastmanosteus = new AdvancedModelRenderer(this);
        this.Eastmanosteus.setRotationPoint(0.0F, 34.4F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -15.2F, 0.9F);
        this.Eastmanosteus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 37, 0, -3.5F, -3.3F, -5.3F, 7, 6, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.3F, -9.2F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, -1.4137F, 1.5746F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, 0.0F, 0.3F, -1.9958F, 0, 1, 4, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.4F, -6.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 0, -2.0F, 1.9F, -2.9F, 0, 1, 3, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 40, 2.0F, 1.9F, -2.9F, 0, 1, 3, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.4F, -9.6F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2967F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 73, 36, -2.5F, -1.8438F, -0.0609F, 5, 1, 2, -0.003F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 63, -2.5F, -1.1438F, -0.0609F, 5, 1, 6, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.8F, -8.7F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6632F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 14, -2.0F, 0.0487F, -1.9674F, 4, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.5F, -4.9F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4189F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 71, -2.5F, -0.0195F, -4.206F, 5, 2, 5, -0.002F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.7F, -0.2F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2269F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 65, 22, -3.0F, -0.0667F, -4.8956F, 6, 2, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -6.9F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2356F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 56, -3.0F, -0.6409F, -0.535F, 6, 1, 1, 0.04F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.7F, -3.3F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 59, 0, -3.5F, -1.2F, 0.0F, 7, 2, 4, -0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 40, -4.0F, -0.2F, 0.0F, 8, 2, 4, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.6F, 1.1F, -7.7F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4961F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 0, -1.6F, -1.2829F, -0.0269F, 1, 1, 1, -0.002F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 20, -1.6F, -1.0829F, -0.0269F, 1, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 36, -1.6F, -2.0829F, 0.9731F, 1, 2, 3, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 0, 3.8F, -1.2829F, -0.0269F, 1, 1, 1, -0.002F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 20, 3.8F, -1.0829F, -0.0269F, 1, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 36, 3.8F, -2.0829F, 0.9731F, 1, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.7F, -4.1F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2443F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 63, 47, -3.0F, 0.6F, -4.2F, 6, 2, 3, -0.002F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 53, -3.0F, -0.2F, -4.2F, 6, 2, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.2F, -3.2F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.3316F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 72, 15, -3.5F, -1.1308F, -1.5234F, 7, 3, 2, -0.002F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 65, 30, -2.5F, 0.1692F, -6.4234F, 5, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.3308F, -5.2234F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.5708F, -1.3788F, 1.5708F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 26, -1.0F, -0.0769F, 1.5F, 3, 1, 0, -0.002F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 26, -1.0F, -0.0769F, -1.5F, 3, 1, 0, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.3308F, -5.2234F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0698F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 26, -1.5F, -0.5769F, -1.1F, 3, 1, 0, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.0692F, -7.5234F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1571F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 76, 40, -2.0F, -1.2396F, 2.88F, 4, 1, 2, -0.003F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 20, -2.0F, -0.9396F, 0.98F, 4, 1, 4, -0.002F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.1692F, -2.4234F);
        this.Jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 78, 0, -2.5F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.2692F, 0.2766F);
        this.Jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 73, -2.0F, -1.037F, -2.92F, 4, 1, 3, -0.002F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -17.0F, 1.0F);
        this.Eastmanosteus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -4.0F, -2.2F, -0.2F, 8, 9, 10, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -3.0F, -0.3F);
        this.Body1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0349F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 36, -3.0F, 0.0007F, 0.0209F, 6, 2, 10, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(4.0F, 6.1F, 1.7F);
        this.Body1.addChild(PectoralL);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1745F, 0.4363F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 44, 14, -1.0F, -1.0F, -1.3F, 10, 0, 7, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-4.0F, 6.1F, 1.7F);
        this.Body1.addChild(PectoralR);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralR.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1745F, -0.4363F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 14, -9.0F, -1.0F, -1.3F, 10, 0, 7, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 1.0F, 9.4F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 21, 20, -3.5F, -3.1F, -0.7F, 7, 7, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 5.0F, 0.3F);
        this.Body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2443F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 28, -3.0F, -2.3F, -0.2F, 6, 3, 8, -0.002F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -6.0F, 0.3F);
        this.Body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 53, -2.5F, 1.7F, 0.0F, 5, 2, 7, 0.0F, false));

        this.VentralL = new AdvancedModelRenderer(this);
        this.VentralL.setRotationPoint(2.9F, 2.6F, 5.6F);
        this.Body2.addChild(VentralL);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.6136F, 0.1203F, -0.1378F);
        this.VentralL.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.6981F, 0.3054F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 22, -1.0F, 0.0F, -2.0F, 6, 0, 4, 0.0F, false));

        this.VentralR = new AdvancedModelRenderer(this);
        this.VentralR.setRotationPoint(-2.9F, 2.6F, 5.6F);
        this.Body2.addChild(VentralR);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.6136F, 0.1203F, -0.1378F);
        this.VentralR.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.6981F, -0.3054F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 44, 22, -5.0F, 0.0F, -2.0F, 6, 0, 4, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 6.9F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 47, -3.0F, -2.8F, -0.6F, 6, 5, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -4.0F, 0.4F);
        this.Body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.576F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 41, 0.0F, -9.4F, -0.6F, 0, 10, 8, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 3.0F, 0.4F);
        this.Body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 72, 7, -2.0F, -1.1F, 0.0F, 4, 2, 5, -0.001F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -5.3F, 0.4F);
        this.Body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1047F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 68, 65, -2.0F, 1.6F, 0.0F, 4, 2, 6, -0.002F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -0.7F, 5.1F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 70, -2.0F, -1.7F, -0.7F, 4, 3, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 3.1F, 1.3F);
        this.Body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.733F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.0F, -0.5F, -0.4F, 0, 5, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 3.3F, 0.3F);
        this.Body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3316F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 49, -1.5F, -2.1F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -2.3F, 0.3F);
        this.Body4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0175F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 67, 74, -1.5F, -0.0962F, -0.2732F, 3, 2, 4, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.3F, 4.0F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.0873F, 0.0F, 0.0F);
        this.Body5.cubeList.add(new ModelBox(Body5, 27, 0, -1.0F, -1.9736F, -0.0116F, 2, 1, 5, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 36, 75, 0.0F, -1.6739F, 2.1989F, 0, 7, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 2.1261F, -0.0011F);
        this.Body5.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.384F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 13, 73, -1.0F, -2.0354F, -0.1858F, 2, 2, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0261F, 0.2989F);
        this.Body5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0698F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 63, -1.5F, -1.6F, -2.0F, 3, 2, 7, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.9739F, 4.8989F);
        this.Body5.addChild(Tail);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0651F, 0.1891F);
        this.Tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3316F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 59, -1.0F, -1.1F, -1.1F, 2, 2, 8, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.0651F, -0.0109F);
        this.Tail.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0175F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 38, 54, 0.0F, -3.7001F, -0.0315F, 0, 14, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -3.0349F, 6.0891F);
        this.Tail.addChild(Tail2);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.9F, -1.3F);
        this.Tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2793F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 20, 0.0F, -2.4273F, 0.1666F, 0, 16, 10, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 1.4757F, -0.8474F);
        this.Tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.4014F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 15, 49, -0.5F, -1.1F, -0.1F, 1, 1, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Eastmanosteus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Jaw.rotateAngleX = (float) Math.toRadians(20);
        this.Head.offsetY = 0.15F;
        this.Head.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, -1.5708F, -1.4137F, 1.5746F);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.4961F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -1.5708F, -1.3788F, 1.5708F);
        this.setRotateAngle(cube_r12, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, 0.3054F, 0.0F, -0.1745F);
        this.setRotateAngle(cube_r17, 0.0F, -0.1745F, 0.4363F);
        this.setRotateAngle(PectoralR, 0.2618F, 0.0F, 0.3054F);
        this.setRotateAngle(cube_r18, 0.0F, 0.1745F, -0.4363F);
        this.setRotateAngle(Body2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r19, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(VentralL, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(cube_r21, 0.0F, -0.6981F, 0.3054F);
        this.setRotateAngle(VentralR, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(cube_r22, 0.0F, 0.6981F, -0.3054F);
        this.setRotateAngle(Body3, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r23, -0.5919F, -0.2188F, 0.1449F);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r26, 0.733F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0894F, -0.2173F, -0.0193F);
        this.setRotateAngle(cube_r29, 0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r31, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r33, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, 0.4014F, 0.0F, 0.0F);
        this.Eastmanosteus.rotateAngleY = (float) Math.toRadians(90);
        this.Eastmanosteus.offsetY = -0.43F;
        this.Eastmanosteus.offsetX = -0.1F;
        this.Eastmanosteus.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(cube_r1, -1.5708F, -1.4137F, 1.5746F);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.4961F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -1.5708F, -1.3788F, 1.5708F);
        this.setRotateAngle(cube_r12, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, 0.3054F, 0.0F, -0.1745F);
        this.setRotateAngle(cube_r17, 0.0F, -0.1745F, 0.4363F);
        this.setRotateAngle(PectoralR, 0.2618F, 0.0F, 0.3054F);
        this.setRotateAngle(cube_r18, 0.0F, 0.1745F, -0.4363F);
        this.setRotateAngle(Body2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r19, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(VentralL, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(cube_r21, 0.0F, -0.6981F, 0.3054F);
        this.setRotateAngle(VentralR, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(cube_r22, 0.0F, 0.6981F, -0.3054F);
        this.setRotateAngle(Body3, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r23, -0.5919F, -0.2188F, 0.1449F);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r26, 0.733F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0894F, -0.2173F, -0.0193F);
        this.setRotateAngle(cube_r29, 0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r31, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r33, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, 0.4014F, 0.0F, 0.0F);
        this.Eastmanosteus.rotateAngleY = (float) Math.toRadians(90);
        this.Eastmanosteus.rotateAngleX = (float) Math.toRadians(26);
        this.Eastmanosteus.offsetX = -0.05F;
        this.Eastmanosteus.render(0.01F);
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
        this.resetToDefaultPose();

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5, this.Tail, this.Tail2};
        ((EntityPrehistoricFloraEastmanosteus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.2F;
        float still = 1f;
        float inwater = 1f;
        if (f3 == 0.0F) {
            still = 0.3F;}
        if (!e.isInWater()) {
            speed = 0.3F;
            inwater = 0.5F;
        }

        //if (f3 != 0.0F) {
        //    this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, -0.2F, f2, 1);
        //}

        this.chainWave(fishTail, speed * still, 0.02F * still, -3, f2, 0.8F * still);
        this.chainSwing(fishTail, speed * still, 0.5F * still, -3, f2, 0.6F * still);
        if (e.isInWater()) {
            this.swing(Eastmanosteus, speed, 0.3F, true, 0, 0, f2, 1);
        }
        else {
            this.swing(Eastmanosteus, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(PectoralL, (float) (speed * 0.65), 0.5F * inwater, true, 0.8F, 0.3F, f2, 1 * inwater);
        this.swing(PectoralL, (float) (speed * 0.65), 0.3F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(PectoralR, (float) (speed * 0.65), -0.5F * inwater, true, 0.8F, -0.3F, f2, 1 * inwater);
        this.swing(PectoralR, (float) (speed * 0.65), -0.3F * inwater, true, 0, 0, f2, 1 * inwater);

        this.flap(VentralL, (float) (speed * 0.65), 0.3F * inwater, true, 0.8F, 0.1F, f2, 1 * inwater);
        this.swing(VentralL, (float) (speed * 0.65), 0.2F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(VentralR, (float) (speed * 0.65), -0.3F * inwater, true, 0.8F, -0.1F, f2, 1 * inwater);
        this.swing(VentralR, (float) (speed * 0.65), -0.2F * inwater, true, 0, 0, f2, 1 * inwater);

        if (!e.isInWater()) {
            this.Eastmanosteus.rotateAngleZ = (float) Math.toRadians(90);
            this.Eastmanosteus.offsetY = -0.7F;
            this.Eastmanosteus.offsetX = -0.6F;
            this.bob(Eastmanosteus, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(13);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(75), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}

