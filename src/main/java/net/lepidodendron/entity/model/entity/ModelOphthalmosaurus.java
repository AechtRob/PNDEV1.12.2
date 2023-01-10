package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelOphthalmosaurus extends AdvancedModelBase {


    private ModelAnimator animator;
    private final AdvancedModelRenderer Ophthalmosaurus;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer ForelimbL;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer ForelimbR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer HindlimbL;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer HindlimbR;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer Body7;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body8;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    public ModelOphthalmosaurus() {

        this.textureWidth = 160;
        this.textureHeight = 190;

        this.Ophthalmosaurus = new AdvancedModelRenderer(this);
        this.Ophthalmosaurus.setRotationPoint(0.0F, 15.0F, 10.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Ophthalmosaurus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -10.0F, -8.9F, 3.0F, 18, 18, 12, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 92, 80, -7.5F, -8.6F, 0.0F, 13, 17, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 8.4F, 0.0F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1396F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 125, 85, -5.0F, -1.9F, 0.0F, 8, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -8.6F, -0.4F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3142F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 85, 117, -5.0F, -0.2578F, -0.087F, 8, 9, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -8.6F, -0.4F);
        this.Body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.192F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 46, -7.0F, -0.5578F, 2.913F, 12, 9, 14, 0.01F, false));

        this.ForelimbL = new AdvancedModelRenderer(this);
        this.ForelimbL.setRotationPoint(7.8F, 5.5F, 5.0F);
        this.Body1.addChild(ForelimbL);
        this.setRotateAngle(ForelimbL, 0.5249F, 0.194F, 0.2123F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, -0.5F, -2.0F);
        this.ForelimbL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.6545F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 77, 70, -1.0F, 1.2F, 0.0F, 15, 0, 9, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 86, 53, -1.0F, 0.2F, 0.0F, 5, 2, 4, -0.01F, false));

        this.ForelimbR = new AdvancedModelRenderer(this);
        this.ForelimbR.setRotationPoint(-9.8F, 5.5F, 5.0F);
        this.Body1.addChild(ForelimbR);
        this.setRotateAngle(ForelimbR, 0.5249F, -0.194F, -0.2123F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.2F, -0.5F, -2.0F);
        this.ForelimbR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.6545F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 77, 70, -14.0F, 1.2F, 0.0F, 15, 0, 9, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 86, 53, -4.0F, 0.2F, 0.0F, 5, 2, 4, -0.01F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 14.9F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 31, -9.5F, -8.0F, -2.3F, 17, 15, 13, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -12.0F, 2.0F);
        this.Body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 61, 70, -1.0F, -12.0F, 0.0F, 0, 13, 15, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 70, -7.0F, -3.0F, 0.0F, 12, 3, 11, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -12.3F, 0.0F);
        this.Body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 61, 0, -6.5F, 0.0F, 0.6F, 11, 6, 11, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -2.0F, 11.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 53, 23, -7.5F, -6.0F, -1.0F, 13, 12, 8, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 9.5F, 0.0F);
        this.Body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3665F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 91, -6.0F, -5.9F, -0.2F, 10, 6, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -9.3F, 0.0F);
        this.Body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2443F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 100, 53, -5.5F, 0.0F, 0.0F, 9, 5, 8, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 6.6F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 87, 35, -6.0F, -4.0F, -1.0F, 10, 8, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 6.8F, 0.0F);
        this.Body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3316F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 103, -5.0F, -3.0F, 0.0F, 8, 3, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.Body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3142F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 99, -5.0F, 0.0F, 0.0F, 8, 4, 9, 0.0F, false));

        this.HindlimbL = new AdvancedModelRenderer(this);
        this.HindlimbL.setRotationPoint(4.0F, 3.5F, 6.0F);
        this.Body4.addChild(HindlimbL);
        this.setRotateAngle(HindlimbL, 0.5601F, -0.2276F, 0.2018F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.HindlimbL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.6109F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 29, 85, 1.0F, 0.5F, -2.0F, 6, 0, 5, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.HindlimbR = new AdvancedModelRenderer(this);
        this.HindlimbR.setRotationPoint(-6.0F, 3.5F, 6.0F);
        this.Body4.addChild(HindlimbR);
        this.setRotateAngle(HindlimbR, 0.5601F, 0.2276F, -0.2018F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.HindlimbR.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.6109F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 85, -7.0F, 0.5F, -2.0F, 6, 0, 5, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -2.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, true));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 7.6F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 106, 0, -4.5F, -4.0F, -1.0F, 7, 7, 8, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -7.5F, -7.6F);
        this.Body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3142F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 95, 0, -4.0F, 0.0F, 9.0F, 6, 4, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 6.8F, -7.6F);
        this.Body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3316F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 83, 101, -4.0F, -3.0F, 9.0F, 6, 3, 3, 0.0F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 58, 113, -3.5F, -3.0F, -1.0F, 5, 5, 8, 0.0F, false));

        this.Body7 = new AdvancedModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 6.7F);
        this.Body6.addChild(Body7);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.2F, 0.0F);
        this.Body7.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0524F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 108, 120, -2.5F, 0.0F, -1.0F, 3, 4, 7, 0.0F, false));

        this.Body8 = new AdvancedModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 137, -1.0F, -14.0F, -1.0F, 0, 30, 18, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 7.6F, 4.8F);
        this.Body8.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.7679F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 115, 107, -1.5F, -1.9727F, -0.1319F, 1, 2, 10, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.8203F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 60, -2.0F, -1.3F, -1.3F, 2, 3, 10, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Ophthalmosaurus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 96, 18, -5.0F, -4.0F, -9.0F, 8, 6, 9, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 126, 44, -5.0F, 2.0F, -4.0F, 8, 2, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 117, 67, -3.5F, 0.1F, -17.0F, 5, 2, 8, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 121, 124, -2.5F, 1.1F, -25.0F, 3, 1, 8, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 70, 127, -1.7F, 1.9F, -24.0F, 0, 1, 8, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 127, 51, -0.3F, 1.9F, -24.0F, 0, 1, 8, 0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.0F, -6.9F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1833F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 2, 118, -5.5F, -1.4384F, -0.4996F, 9, 3, 3, 0.03F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 126, 79, -5.5F, -0.9384F, -0.0996F, 9, 2, 2, 0.04F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 4.4F, -8.0F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 35, 106, -4.0F, -3.9F, 0.1F, 6, 4, 9, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.5F, -12.0F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5934F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 51, 127, -2.5F, -2.0713F, -0.0186F, 4, 4, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 1.3F, -17.0F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3316F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 88, 18, -2.0F, -1.1999F, -0.0306F, 3, 2, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -4.0F, -9.0F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.5061F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 92, 101, -4.0F, 0.0F, 0.0F, 6, 5, 10, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 2.0F, -25.0F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1047F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 49, 0, -1.5F, -1.0F, 0.0F, 2, 1, 9, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.1F, -17.0F);
        this.Head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0524F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 60, 0.6F, -0.2F, 0.0F, 0, 1, 8, 0.01F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 15, 127, -2.6F, -0.2F, 0.0F, 0, 1, 8, 0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 29, 120, -5.0F, 0.0F, -5.0F, 8, 2, 5, -0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 117, 34, -3.5F, 0.0F, -13.0F, 5, 1, 8, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 122, 16, -2.5F, 0.0F, -21.0F, 3, 1, 8, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 79, 130, -0.2F, -0.8F, -21.7F, 0, 1, 8, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 41, 130, -1.8F, -0.8F, -21.7F, 0, 1, 8, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 127, -4.0F, -2.0F, -4.2F, 6, 2, 5, 0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.Jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0524F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 32, 128, 0.7F, -0.8F, -0.6F, 0, 1, 8, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 128, 103, -2.7F, -0.8F, -0.6F, 0, 1, 8, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.0F, -12.0F);
        this.Jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1745F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 106, -2.5F, -1.3F, 3.0F, 3, 1, 4, -0.01F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 115, 91, -2.5F, -1.0F, 0.0F, 3, 1, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Ophthalmosaurus.render(f5 * 1F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Head.offsetY = -0F;
        this.Head.offsetX = 0.01F;
        this.Jaw.rotateAngleX = (float) Math.toRadians(22.5);
        this.Head.rotateAngleX = (float) Math.toRadians(0);
        this.Head.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


       AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5, this.Body6, this.Body7, this.Body8};
        AdvancedModelRenderer[] upperBody = {this.Head};

        float speed = 0.15F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.8F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.18F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {

            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(upperBody, speed * still, 0.15F, 0, f2, 0.5F *still);
        }
        else {
            //Dont swing if on land - it loooks dumb
            //this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(ForelimbL, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(ForelimbL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
        this.walk(ForelimbL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(ForelimbR, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(ForelimbR, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
        this.walk(ForelimbR, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(HindlimbL, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
        this.swing(HindlimbL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        this.walk(HindlimbL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        this.flap(HindlimbR, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
        this.swing(HindlimbR, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
        this.walk(HindlimbR, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.Ophthalmosaurus.offsetY = 0.15F;
            this.bob(Ophthalmosaurus, -speed * 1.8F, 0.02F, false, f2, 1);
            this.walk(Jaw, (float) (speed * 1.8F), 0.15F, false, 1, 0, f2, 0);
            this.chainWave(fishTail, speed * 1.5F, 0.0025F, -0.1, f2, 0.4F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.01F, -0.25, f2, 0.2F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, -(float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

