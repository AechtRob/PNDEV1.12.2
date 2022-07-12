package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelOrodus extends AdvancedModelBase {
    private final AdvancedModelRenderer Orodus;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer AnalR;
    private final AdvancedModelRenderer AnalL;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Body7;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Body8;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer Body9;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;

    private ModelAnimator animator;

    public ModelOrodus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Orodus = new AdvancedModelRenderer(this);
        this.Orodus.setRotationPoint(0.5F, 9.0F, -9.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, -5.2F);
        this.Orodus.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 30, 86, -3.0F, -3.93F, -4.2F, 5, 6, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 37, -3.5F, -4.03F, -2.2F, 6, 8, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.85F, -2.13F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4538F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 93, -2.0F, 0.0266F, -0.034F, 3, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.3362F, -1.9526F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5061F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 92, 61, -1.5F, -1.9962F, -0.9446F, 2, 2, 3, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.99F, -4.66F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3752F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 92, -2.0F, 0.1728F, -0.239F, 3, 2, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.42F, -3.1F, -5.0F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 92, 90, -1.08F, 3.73F, 0.28F, 2, 1, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 90, -1.58F, -0.67F, -0.1F, 3, 5, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.07F, -2.2F);
        this.Cephalon.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 15, 9, -2.5F, -1.6338F, -1.1526F, 4, 2, 2, -0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.2662F, 0.2474F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4887F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 81, 64, -1.5F, -0.9962F, -5.8446F, 2, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1638F, -2.0826F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4102F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 92, -1.5F, -0.4697F, -2.7603F, 2, 1, 4, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 58, -2.0F, -0.1697F, -2.8603F, 3, 1, 4, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2338F, 0.6474F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.384F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 70, 44, -2.5F, 1.13F, -1.88F, 4, 1, 2, -0.011F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 90, 78, -2.5F, 1.13F, -2.1974F, 4, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.2338F, 0.6474F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 83, 72, -2.5F, 0.23F, -2.78F, 4, 1, 4, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -0.3F, -5.3F);
        this.Orodus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 29, 58, -4.0F, -5.4F, 0.0F, 7, 11, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.0F, 2.66F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2269F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 82, 82, -3.0F, 0.06F, -0.4193F, 5, 4, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 5.6F, 0.0F);
        this.Body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 80, -2.5F, -0.9F, -0.1F, 4, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -5.39F, -0.2F);
        this.Body1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5061F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 91, -2.0F, -0.0219F, -0.0959F, 3, 3, 3, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.76F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 20, 28, -5.0F, -5.6F, 0.0F, 9, 12, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.72F, 4.9F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 77, 25, -3.0F, 0.126F, -0.4601F, 5, 3, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -7.49F, 0.6F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.192F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 78, 44, -3.0F, 0.0142F, -0.1929F, 5, 3, 5, -0.001F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-5.0F, 5.1F, 5.0F);
        this.Body2.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, 0.0F, -0.6109F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 22, 50, -7.0F, -0.02F, -2.0F, 7, 0, 6, 0.0F, false));
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 70, 37, -7.0F, 0.0F, -2.0F, 7, 0, 6, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(4.0F, 5.1F, 5.0F);
        this.Body2.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.0F, 0.6109F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 22, 50, 0.0F, -0.02F, -2.0F, 7, 0, 6, 0.0F, true));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 70, 37, 0.0F, 0.0F, -2.0F, 7, 0, 6, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 8.9F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 29, 0, -4.5F, -5.1F, -0.4F, 8, 10, 9, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 6.3F, 0.0F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0698F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 58, -3.5F, -2.1F, -0.4F, 6, 2, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -5.82F, 5.3F);
        this.Body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0175F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 78, 53, -3.0F, 0.0006F, -1.1147F, 5, 2, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -6.3F, 0.0F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 79, -3.0F, 0.1747F, 0.3003F, 5, 2, 5, 0.001F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 8.7F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 50, -4.0F, -5.0F, -1.2F, 7, 10, 7, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 15, 0, -2.5F, -5.7F, -1.2F, 4, 1, 7, 0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 5.6F, -1.2F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0344F, 0.0055F, 0.0026F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 49, 70, -3.0F, -1.0F, 0.0F, 5, 1, 7, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 48, 20, -4.0F, -5.0F, 0.1F, 7, 9, 7, -0.001F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, -0.5F, -10.2F, 2.1F, 0, 5, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 5.2F, 0.1F);
        this.Body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1222F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 67, 72, -2.5F, -1.9F, 0.0F, 4, 2, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -5.7F, 0.1F);
        this.Body5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0524F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 76, -2.0F, 0.0F, 0.0F, 3, 2, 7, 0.0F, false));

        this.AnalR = new AdvancedModelRenderer(this);
        this.AnalR.setRotationPoint(-3.7F, 2.8F, 4.8F);
        this.Body5.addChild(AnalR);
        this.setRotateAngle(AnalR, 0.0F, 0.0F, -0.5236F);
        this.AnalR.cubeList.add(new ModelBox(AnalR, 2, 88, -4.0F, 0.6F, -2.0F, 4, 0, 4, 0.0F, false));
        this.AnalR.cubeList.add(new ModelBox(AnalR, 45, 87, -4.0F, 0.58F, -2.0F, 4, 0, 4, 0.0F, false));

        this.AnalL = new AdvancedModelRenderer(this);
        this.AnalL.setRotationPoint(2.7F, 2.8F, 4.8F);
        this.Body5.addChild(AnalL);
        this.setRotateAngle(AnalL, 0.0F, 0.0F, 0.5236F);
        this.AnalL.cubeList.add(new ModelBox(AnalL, 2, 88, 0.0F, 0.6F, -2.0F, 4, 0, 4, 0.0F, true));
        this.AnalL.cubeList.add(new ModelBox(AnalL, 45, 87, 0.0F, 0.58F, -2.0F, 4, 0, 4, 0.0F, true));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 6.3F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 49, 42, -3.5F, -4.6F, 0.1F, 6, 7, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -6.0F, 0.1F);
        this.Body6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 72, -1.5F, 0.0F, 0.0F, 2, 2, 8, 0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 4.2F, 0.1F);
        this.Body6.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.192F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 64, 0, -2.0F, -2.8F, -0.2F, 3, 3, 9, 0.0F, false));

        this.Body7 = new AdvancedModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, -2.0F, 8.1F);
        this.Body6.addChild(Body7);
        this.Body7.cubeList.add(new ModelBox(Body7, 70, 13, -3.0F, -2.0F, -0.6F, 5, 5, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 5.0F, -0.6F);
        this.Body7.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1571F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 83, -1.0F, -2.2F, 0.3F, 1, 2, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -3.4F, -0.6F);
        this.Body7.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0524F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 65, 82, -1.5F, 0.1F, 0.0F, 2, 2, 6, 0.0F, false));

        this.Body8 = new AdvancedModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 5.3F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 68, -3.0F, -2.0F, -0.4F, 5, 5, 6, -0.001F, false));
        this.Body8.cubeList.add(new ModelBox(Body8, 29, 20, -4.0F, 0.5F, 1.6F, 7, 0, 4, 0.0F, false));
        this.Body8.cubeList.add(new ModelBox(Body8, 29, 25, -3.5F, 0.5F, -0.4F, 6, 0, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -3.0F, -0.4F);
        this.Body8.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0349F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 80, 0, -2.0F, 0.0F, -0.2F, 3, 1, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 3.8F, -0.5F);
        this.Body8.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0698F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 87, 8, -1.0F, -1.0F, -0.1F, 1, 1, 6, 0.0F, false));

        this.Body9 = new AdvancedModelRenderer(this);
        this.Body9.setRotationPoint(0.0F, 0.0F, 5.2F);
        this.Body8.addChild(Body9);
        this.Body9.cubeList.add(new ModelBox(Body9, 55, 0, -2.5F, -1.5F, -0.4F, 4, 4, 4, 0.0F, false));
        this.Body9.cubeList.add(new ModelBox(Body9, 57, 37, -3.0F, 0.5F, -0.6F, 5, 0, 4, 0.0F, false));
        this.Body9.cubeList.add(new ModelBox(Body9, 0, 0, -0.5F, -10.0F, 0.0F, 0, 22, 14, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 3.4F, -0.2F);
        this.Body9.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2443F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 64, 13, -1.0F, -1.0F, -0.1F, 1, 1, 4, -0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -2.7F, -0.2F);
        this.Body9.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3142F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 91, 34, -1.5F, 0.0F, -0.1F, 2, 2, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Orodus.render(0.025F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Jaw.rotateAngleX = (float) Math.toRadians(26);
        this.Orodus.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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

        this.Orodus.offsetY = 0.75F;

        AdvancedModelRenderer[] fishTail = {this.Body4, this.Body5, this.Body6, this.Body7, this.Body8, this.Body9};

        float speed = 0.21F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.2F * still, -0.85, f2, 0.6F * still);
            this.swing(Orodus, speed*0.85F, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Orodus, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(PectoralL, (float) (speed * 0.65), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralL, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(PectoralR, (float) (speed * 0.65), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralR, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(AnalL, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(AnalL, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(AnalR, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(AnalR, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.Orodus.rotateAngleZ = (float) Math.toRadians(90);
            this.Orodus.offsetY = 1.1F;
            this.bob(Orodus, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity ent, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) ent;
        animator.update(ent);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) ent);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Cephalon, 0,0,-0.2F);
        animator.rotate(this.Cephalon, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(47.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

