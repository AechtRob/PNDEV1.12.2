package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelTitanicthys extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer PectoralfinR;
    private final AdvancedModelRenderer PectoralfinL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer PelvicfinR;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer PelvicfinR2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Tailfin;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer UpperJaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Lowerjaw;
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

    public ModelTitanicthys() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 44, 0, -8.5F, -20.25F, -24.0F, 17, 16, 15, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.0F, -24.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 64, -7.0F, -1.6F, 0.0F, 14, 2, 15, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -21.0F, -24.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 81, -7.0F, 0.025F, 0.0F, 14, 2, 15, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.55F, -30.5F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 126, 50, -6.0F, -3.25F, 2.75F, 12, 3, 4, 0.0F, false));

        this.PectoralfinR = new AdvancedModelRenderer(this);
        this.PectoralfinR.setRotationPoint(-8.5F, -6.0F, -19.0F);
        this.Body.addChild(PectoralfinR);
        this.setRotateAngle(PectoralfinR, 0.0F, 0.0F, 0.5236F);
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 0, 80, 0.0F, -1.0F, -2.75F, 0, 25, 15, 0.0F, false));

        this.PectoralfinL = new AdvancedModelRenderer(this);
        this.PectoralfinL.setRotationPoint(8.5F, -6.0F, -19.0F);
        this.Body.addChild(PectoralfinL);
        this.setRotateAngle(PectoralfinL, 0.0F, 0.0F, -0.5236F);
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 0, 80, 0.0F, -1.0F, -2.75F, 0, 25, 15, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -13.0F, -10.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 64, -7.5F, -9.0F, -0.5F, 15, 20, 11, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.5F, 10.5F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 30, 81, 0.0F, -22.0F, -2.25F, 0, 13, 17, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 44, 31, -6.5F, -9.0F, -1.0F, 13, 19, 14, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -0.25F, 13.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 82, 85, -5.5F, -6.25F, -1.0F, 11, 12, 13, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 4.75F, 12.0F);
        this.Body4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2793F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 95, 51, -3.5F, -2.5F, -13.25F, 9, 4, 13, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -6.25F, 12.0F);
        this.Body4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 97, 68, -3.5F, -1.0F, -13.0F, 9, 4, 13, 0.0F, false));

        this.PelvicfinR = new AdvancedModelRenderer(this);
        this.PelvicfinR.setRotationPoint(-2.0F, 8.0F, 6.75F);
        this.Body4.addChild(PelvicfinR);
        this.setRotateAngle(PelvicfinR, 0.0F, 0.0F, 0.3491F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(8.5F, 0.0F, -4.0F);
        this.PelvicfinR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 54, -8.5F, -0.75F, 0.0F, 0, 8, 10, 0.0F, false));

        this.PelvicfinR2 = new AdvancedModelRenderer(this);
        this.PelvicfinR2.setRotationPoint(2.0F, 8.0F, 6.75F);
        this.Body4.addChild(PelvicfinR2);
        this.setRotateAngle(PelvicfinR2, 0.0F, 0.0F, -0.3491F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-8.5F, 0.0F, -4.0F);
        this.PelvicfinR2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 54, 8.5F, -0.75F, 0.0F, 0, 8, 10, 0.0F, true));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.5F, 12.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, -4.5F, -4.25F, -1.0F, 9, 8, 12, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.75F, 11.0F);
        this.Body5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2269F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 120, -4.0F, -3.0F, -12.0F, 8, 3, 12, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.25F, 11.0F);
        this.Body5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.192F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 111, -4.0F, 0.0F, -12.0F, 8, 3, 12, 0.0F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, -0.25F, 11.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 49, 98, -2.5F, -2.5F, -1.5F, 5, 5, 15, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 3, 0.0F, 3.25F, -0.75F, 0, 4, 4, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 144, -2.5F, -1.0F, 13.75F, 5, 2, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.5F, 13.5F);
        this.Body6.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 109, 110, -2.0F, 0.0F, -15.0F, 4, 2, 15, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.0F, -0.5F, 0.5F);
        this.Body6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0873F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 92, 15, -2.0F, -0.5F, -2.0F, 4, 2, 16, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, -0.5F, 0.5F);
        this.Body6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0873F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 92, 15, -2.0F, -0.5F, -2.0F, 4, 2, 16, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.5F, 13.5F);
        this.Body6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 98, 33, -2.0F, -2.0F, -15.0F, 4, 2, 15, 0.0F, false));

        this.Tailfin = new AdvancedModelRenderer(this);
        this.Tailfin.setRotationPoint(0.0F, -2.5F, 13.5F);
        this.Body6.addChild(Tailfin);
        this.Tailfin.cubeList.add(new ModelBox(Tailfin, 0, 0, 0.0F, -20.5F, -1.0F, 0, 42, 22, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailfin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.9163F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 55, 189, -1.0F, -0.25F, -3.25F, 1, 3, 16, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 55, 189, 0.0F, -0.25F, -3.25F, 1, 3, 16, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -12.0F, -24.0F);
        this.Body.addChild(Head);


        this.UpperJaw = new AdvancedModelRenderer(this);
        this.UpperJaw.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Head.addChild(UpperJaw);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -10.5F, 0.0F);
        this.UpperJaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.3788F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 7, -4.0F, -12.5F, -13.5F, 8, 0, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -10.5F, 0.0F);
        this.UpperJaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.0734F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 84, 39, -4.0F, -9.5F, -14.25F, 8, 3, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -10.5F, 0.0F);
        this.UpperJaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4189F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 93, 0, -7.0F, 0.0F, -7.5F, 14, 6, 8, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 4.0F, 4.0F, -15.5F, 2, 3, 4, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -6.0F, 4.0F, -15.5F, 2, 3, 4, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 117, 85, -6.0F, 0.0F, -15.5F, 12, 4, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(4.5F, -2.5F, -13.0F);
        this.UpperJaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.48F, 0.3491F, -0.3491F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 5, -0.25F, -0.25F, -2.0F, 0, 4, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.5F, -2.5F, -13.0F);
        this.UpperJaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.48F, -0.3491F, 0.3491F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 8, 5, 0.25F, -0.25F, -2.0F, 0, 4, 2, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-5.0F, -1.5F, -10.0F);
        this.UpperJaw.addChild(bone);
        this.setRotateAngle(bone, 0.0F, -0.3054F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3403F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 124, 0, -1.175F, -4.0F, -0.75F, 3, 6, 14, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0611F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 75, 110, -1.25F, -4.25F, -0.75F, 3, 8, 14, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(5.0F, -1.5F, -10.0F);
        this.UpperJaw.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 0.3054F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3403F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 124, 0, -1.825F, -4.0F, -0.75F, 3, 6, 14, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0611F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 75, 110, -1.75F, -4.25F, -0.75F, 3, 8, 14, 0.0F, true));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 3.45F, -2.5F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.1745F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 0.25F, -5.0F);
        this.Lowerjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2618F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 124, 20, -5.5F, 1.15F, -5.3F, 9, 2, 7, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 0.25F, -5.0F);
        this.Lowerjaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3403F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 0, -5.5F, 0.15F, -3.65F, 9, 2, 5, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.75F, -8.0F);
        this.Lowerjaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3054F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 84, 33, -4.0F, 0.7F, -4.75F, 8, 2, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Lowerjaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 121, 33, -5.0F, -2.25F, -0.25F, 10, 3, 8, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(4.5F, -0.5F, -9.75F);
        this.Lowerjaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0436F, 0.2618F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 95, 110, -1.95F, -1.5F, 2.75F, 2, 3, 10, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(4.5F, -0.5F, -9.75F);
        this.Lowerjaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4363F, 0.2618F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 126, -1.975F, -0.15F, 0.0F, 2, 2, 7, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-4.5F, -0.5F, -9.75F);
        this.Lowerjaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0436F, -0.2618F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 95, 110, -0.05F, -1.5F, 2.75F, 2, 3, 10, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-4.5F, -0.5F, -9.75F);
        this.Lowerjaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4363F, -0.2618F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 20, 126, -0.025F, -0.15F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(4.5F, 1.0F, -10.0F);
        this.Lowerjaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1571F, 0.2618F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 126, -3.0F, -1.6F, 0.0F, 3, 2, 14, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-4.5F, 1.0F, -10.0F);
        this.Lowerjaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1571F, -0.2618F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 126, 0.0F, -1.6F, 0.0F, 3, 2, 14, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Lowerjaw.rotateAngleX = (float) Math.toRadians(35);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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

        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5, this.Body6, this.Tailfin};

        float speed = 0.1F;
        float still = 1f;
        float inwater = 1f;
        if (f3 == 0.0F) {
            still = 0.3F;}
        if (!e.isInWater()) {
            speed = 0.3F;
            inwater = 0.5F;
        }

        //this.Neck.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.Neck.rotateAngleX += f4 / (180F / (float) Math.PI);

        if (f3 != 0.0F) {this.walk(Lowerjaw, (float) (speed * 1.5), 0.2F, true, 0, -0.2F, f2, 1);}

        this.chainWave(fishTail, speed * still, 0.02F * still, -3, f2, 0.8F * still);
        this.chainSwing(fishTail, speed * still, 0.4F * still, -3, f2, 0.6F * still);
        if (e.isInWater()) {
            this.swing(Body, speed, 0.3F, true, 0, 0, f2, 1);
        }
        else {
            this.swing(Body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(PectoralfinL, (float) (speed * 0.65), 0.5F * inwater, true, 0.8F, 0.3F, f2, 1 * inwater);
        this.swing(PectoralfinL, (float) (speed * 0.65), 0.3F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(PectoralfinR, (float) (speed * 0.65), -0.5F * inwater, true, 0.8F, -0.3F, f2, 1 * inwater);
        this.swing(PectoralfinR, (float) (speed * 0.65), -0.3F * inwater, true, 0, 0, f2, 1 * inwater);

        this.flap(PelvicfinR2, (float) (speed * 0.65), 0.3F * inwater, true, 0.8F, 0.1F, f2, 1 * inwater);
        this.swing(PelvicfinR2, (float) (speed * 0.65), 0.2F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(PelvicfinR, (float) (speed * 0.65), -0.3F * inwater, true, 0.8F, -0.1F, f2, 1 * inwater);
        this.swing(PelvicfinR, (float) (speed * 0.65), -0.2F * inwater, true, 0, 0, f2, 1 * inwater);

        if (!e.isInWater()) {
            this.Body.rotateAngleZ = (float) Math.toRadians(90);
            this.Body.offsetY = -0.2F;
            this.bob(Body, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);
        }

    }
}
