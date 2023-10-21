package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEurhinosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelEurhinosaurus extends AdvancedModelBase {


    private ModelAnimator animator;
    private final AdvancedModelRenderer Eurhinosaurus;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer ForelimbL;
    private final AdvancedModelRenderer ForelimbR;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer HindlimbL;
    private final AdvancedModelRenderer HindlimbR;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer Body7;
    private final AdvancedModelRenderer Body8;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    public ModelEurhinosaurus() {

        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Eurhinosaurus = new AdvancedModelRenderer(this);
        this.Eurhinosaurus.setRotationPoint(0.0F, 16.0F, 9.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 1.1F, -17.5F);
        this.Eurhinosaurus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 80, 24, -5.5F, -3.1F, -0.5F, 10, 7, 5, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 35, 19, -7.0F, -4.1F, 3.5F, 13, 8, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.9F, -0.5F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 103, 72, -4.5F, -2.0F, 0.0F, 8, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.6F, 3.4F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 66, 37, -6.0F, -1.8144F, -0.0642F, 11, 2, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.7F, 3.6F);
        this.Body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 64, -6.0F, 0.0287F, -0.055F, 11, 4, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.8F, -1.0F);
        this.Body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3578F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 0, -4.5F, -0.1046F, 0.0603F, 8, 3, 5, 0.0F, false));

        this.ForelimbL = new AdvancedModelRenderer(this);
        this.ForelimbL.setRotationPoint(6.0F, 3.4F, 5.5F);
        this.Body1.addChild(ForelimbL);
        this.setRotateAngle(ForelimbL, 0.0F, 0.0F, 0.2618F);
        this.ForelimbL.cubeList.add(new ModelBox(ForelimbL, 0, 0, -1.0F, -1.0F, -1.0F, 4, 2, 4, 0.0F, false));
        this.ForelimbL.cubeList.add(new ModelBox(ForelimbL, 0, 56, 0.0F, 0.0F, -1.0F, 17, 0, 7, 0.0F, false));

        this.ForelimbR = new AdvancedModelRenderer(this);
        this.ForelimbR.setRotationPoint(-7.0F, 3.4F, 5.5F);
        this.Body1.addChild(ForelimbR);
        this.setRotateAngle(ForelimbR, 0.0F, 0.0F, -0.2618F);
        this.ForelimbR.cubeList.add(new ModelBox(ForelimbR, 0, 0, -3.0F, -1.0F, -1.0F, 4, 2, 4, 0.0F, true));
        this.ForelimbR.cubeList.add(new ModelBox(ForelimbR, 0, 56, -17.0F, 0.0F, -1.0F, 17, 0, 7, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.1F, 12.5F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 35, 0, -6.5F, -3.0F, -1.0F, 12, 8, 10, -0.001F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 53, 88, -0.5F, -19.6F, 1.0F, 0, 16, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.5F, -0.1F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 49, -5.0F, -0.0276F, -0.0698F, 9, 4, 9, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 6.5F, -0.2F);
        this.Body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 70, 64, -5.0F, -2.0F, 0.0F, 9, 2, 9, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 40, 56, -5.5F, -2.9F, -1.0F, 10, 7, 9, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 27, 100, -0.5F, -19.6F, -0.2F, 0, 16, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 6.0F, -0.2F);
        this.Body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 88, -3.5F, -2.0F, -0.4F, 6, 2, 9, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -5.3F, -0.1F);
        this.Body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 79, -3.5F, -0.0129F, -0.1886F, 6, 4, 9, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 35, 37, -5.0F, -2.2F, -1.0F, 9, 6, 12, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 63, 76, -3.0F, -2.1F, 0.0F, 5, 2, 11, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.0F, 0.6F);
        this.Body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1571F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 73, -3.0F, -0.1152F, -0.3028F, 5, 3, 11, 0.0F, false));

        this.HindlimbL = new AdvancedModelRenderer(this);
        this.HindlimbL.setRotationPoint(4.0F, 3.8F, 6.0F);
        this.Body4.addChild(HindlimbL);
        this.setRotateAngle(HindlimbL, 0.0F, 0.0F, 0.6109F);
        this.HindlimbL.cubeList.add(new ModelBox(HindlimbL, 104, 94, -1.0F, -1.2F, -1.0F, 3, 2, 3, 0.0F, false));
        this.HindlimbL.cubeList.add(new ModelBox(HindlimbL, 70, 0, 0.0F, -0.2F, -1.0F, 15, 0, 5, 0.0F, false));

        this.HindlimbR = new AdvancedModelRenderer(this);
        this.HindlimbR.setRotationPoint(-5.0F, 3.8F, 6.0F);
        this.Body4.addChild(HindlimbR);
        this.setRotateAngle(HindlimbR, 0.0F, 0.0F, -0.6109F);
        this.HindlimbR.cubeList.add(new ModelBox(HindlimbR, 104, 94, -2.0F, -1.2F, -1.0F, 3, 2, 3, 0.0F, true));
        this.HindlimbR.cubeList.add(new ModelBox(HindlimbR, 70, 0, -15.0F, -0.2F, -1.0F, 15, 0, 5, 0.0F, true));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 71, 9, -3.5F, -1.5F, -1.0F, 6, 4, 10, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.Body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1571F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 88, 95, -2.0F, -2.0015F, -0.2174F, 3, 2, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1222F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 98, 40, -2.0F, 0.0029F, -0.0418F, 3, 2, 9, 0.0F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 86, 80, -2.5F, -1.0F, -1.0F, 4, 3, 10, -0.001F, false));

        this.Body7 = new AdvancedModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Body6.addChild(Body7);
        this.Body7.cubeList.add(new ModelBox(Body7, 99, 55, -2.0F, -1.0F, -1.0F, 3, 3, 8, -0.002F, false));

        this.Body8 = new AdvancedModelRenderer(this);
        this.Body8.setRotationPoint(-0.5F, 0.0F, 6.8F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 0, 0.0F, -20.8F, -0.8F, 0, 37, 17, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 9.0F, 5.2F);
        this.Body8.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.733F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 93, -1.0F, -1.1164F, 0.0626F, 2, 1, 11, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.0F, 0.2F);
        this.Body8.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.925F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 70, 90, -1.0F, 0.0F, 0.0F, 2, 2, 11, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -18.0F);
        this.Eurhinosaurus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 70, 104, -3.5F, -1.0F, -4.0F, 6, 4, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 85, 76, -3.5F, 3.0F, -1.0F, 6, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 104, 30, -1.5F, 2.0F, -15.0F, 2, 1, 7, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 94, 6, -1.0F, 2.0F, -26.0F, 1, 1, 11, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 106, -2.0F, 1.0F, -8.0F, 3, 2, 3, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 35, 37, -2.5F, 1.0F, -5.0F, 4, 2, 1, 0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4451F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 19, -1.5F, -0.0839F, 3.529F, 2, 2, 1, -0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 100, -1.5F, -0.0839F, 0.029F, 2, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.9F, -4.0F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4625F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 7, -2.5F, -0.0911F, 0.0006F, 4, 2, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.0F, -15.0F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1396F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 52, 73, -1.5F, 0.0F, 0.1F, 2, 1, 7, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.8F, 3.0F, -26.0F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.0087F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, 0.0F, -0.8F, 0.3F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, 0.0F, -0.8F, 2.3F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, 0.0F, -0.8F, 4.3F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, 0.0F, -0.8F, 6.3F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, 0.0F, -0.8F, 8.3F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, 0.0F, -0.8F, 10.3F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 3.0F, -15.0F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.0611F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 7, -0.004F, -0.8F, 1.3022F, 0, 1, 1, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 7, -0.004F, -0.8F, 3.3022F, 0, 1, 1, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 7, -0.004F, -0.8F, 5.3022F, 0, 1, 1, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 7, -0.004F, -0.8F, 7.3022F, 0, 1, 1, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 7, -0.004F, -0.8F, 9.3022F, 0, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.0F, -15.0F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0611F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 7, 0.004F, -0.8F, 9.3022F, 0, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 7, 0.004F, -0.8F, 7.3022F, 0, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 7, 0.004F, -0.8F, 5.3022F, 0, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 7, 0.004F, -0.8F, 3.3022F, 0, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 7, 0.004F, -0.8F, 1.3022F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.2F, 3.0F, -26.0F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0087F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 7, 0.0F, -0.8F, 10.3F, 0, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 7, 0.0F, -0.8F, 8.3F, 0, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 7, 0.0F, -0.8F, 6.3F, 0, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 7, 0.0F, -0.8F, 4.3F, 0, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 7, 0.0F, -0.8F, 2.3F, 0, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 7, 0.0F, -0.8F, 0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 4.0F, -4.0F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 14, -2.5F, -1.1F, 3.2F, 4, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 10.1F, -8.2F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1833F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 14, -3.5F, -10.4384F, 3.8004F, 6, 1, 1, 0.04F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 88, -3.5F, -10.9384F, 3.3004F, 6, 2, 2, 0.03F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 22, 78, -3.5F, 0.0F, -3.0F, 6, 1, 3, -0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 98, 67, -2.0F, 0.0F, -7.0F, 3, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 35, 41, -2.5F, 0.0F, -4.0F, 4, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 105, 79, -1.5F, 0.0F, -11.0F, 2, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 18, 9, -3.5F, -2.0F, -2.1F, 6, 2, 2, -0.002F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.8F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.1309F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -1.0F, -0.4F, -6.5F, 0, 1, 1, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -1.0F, -0.4F, -4.5F, 0, 1, 1, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -1.0F, -0.4F, -2.5F, 0, 1, 1, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -1.0F, -0.4F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.8F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.1309F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -0.4F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -0.4F, -2.5F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -0.4F, -4.5F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -0.4F, -6.5F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2618F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 62, 90, -2.5F, -1.1F, 0.2F, 4, 1, 3, -0.001F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Eurhinosaurus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Head.offsetY = -0.01F;
        this.Head.offsetX = 0.01F;
        this.Head.offsetZ = 0.13F;
        this.Jaw.rotateAngleX = (float) Math.toRadians(22.5);
        this.Head.rotateAngleX = (float) Math.toRadians(0);
        this.Head.rotateAngleZ = (float) Math.toRadians(0);
        this.Head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Eurhinosaurus, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(Body1, -0.05F, 0.05F, 0.0F);
        this.setRotateAngle(Body2, 0.02F, 0.07F, 0.0F);
        this.setRotateAngle(Body3, 0.03F, 0.09F, 0.0F);
        this.setRotateAngle(Body4, 0.04F, 0.09F, 0.0F);
        this.setRotateAngle(Body5, 0.05F, 0.09F, 0.0F);
        this.setRotateAngle(Body6, 0.06F, 0.09F, 0.0F);
        this.setRotateAngle(Body7, 0.07F, 0.09F, 0.0F);
        this.setRotateAngle(Body8, 0.08F, 0.09F, 0.0F);
        this.setRotateAngle(Head, -0.09F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.05F, 0.0F, 0.0F);
        this.Eurhinosaurus.offsetY = -0.3F;
        this.Eurhinosaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Eurhinosaurus, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(Body1, -0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.07F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.09F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.09F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.09F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, -0.09F, 0.0F);
        this.setRotateAngle(Body7, 0.0F, -0.09F, 0.0F);
        this.setRotateAngle(Body8, 0.0F, -0.09F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.05F, 0.0F, 0.0F);
        this.Eurhinosaurus.offsetY = -0.05F;
        this.Eurhinosaurus.render(0.01F);
        resetToDefaultPose();
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
        ((EntityPrehistoricFloraEurhinosaurus)e).tailBuffer.applyChainSwingBuffer(fishTail);

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
            this.Eurhinosaurus.offsetY = 0.15F;
            this.bob(Eurhinosaurus, -speed * 1.8F, 0.02F, false, f2, 1);
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

