package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIchthyosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIchthyosaurus extends AdvancedModelBase {


    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer ForelimbL;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer ForelimbL2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer HindlimbL;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer HindlimbL2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    public ModelIchthyosaurus() {

        this.textureWidth = 92;
        this.textureHeight = 92;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 28.0F, -23.75F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -11.5183F, 10.8578F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 54, 13, -4.0F, -4.3817F, -1.9328F, 8, 9, 4, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.9487F, -0.201F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 73, -3.0F, -0.125F, -1.5F, 6, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.0513F, -0.201F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2269F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 0, -3.5F, -1.05F, -1.475F, 7, 2, 3, 0.0F, false));

        this.ForelimbL = new AdvancedModelRenderer(this);
        this.ForelimbL.setRotationPoint(5.8F, 3.0183F, 3.3422F);
        this.body.addChild(ForelimbL);
        this.setRotateAngle(ForelimbL, 0.5249F, 0.194F, 0.2123F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2F, -0.5F, -2.0F);
        this.ForelimbL.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.6545F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 0, -1.0F, 1.2F, 0.0F, 13, 0, 8, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 34, -1.0F, 0.2F, 0.0F, 5, 2, 4, -0.01F, false));

        this.ForelimbL2 = new AdvancedModelRenderer(this);
        this.ForelimbL2.setRotationPoint(-5.8F, 3.0183F, 3.3422F);
        this.body.addChild(ForelimbL2);
        this.setRotateAngle(ForelimbL2, 0.5249F, -0.194F, -0.2123F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.2F, -0.5F, -2.0F);
        this.ForelimbL2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.6545F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 0, -12.0F, 1.2F, 0.0F, 13, 0, 8, -0.01F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 34, -4.0F, 0.2F, 0.0F, 5, 2, 4, -0.01F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.826F, 1.2368F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -5.5F, -3.9057F, 0.0054F, 11, 10, 10, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.9955F, 4.6139F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2443F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 60, -4.5F, -0.0442F, -4.9809F, 9, 3, 5, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -5.9955F, 9.5639F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 65, -4.5F, 0.0422F, -4.9302F, 9, 3, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 6.3545F, 4.6639F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 40, -4.5F, -2.45F, -4.85F, 9, 3, 10, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.6931F, 9.3655F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 26, 20, -5.0F, -3.5626F, -0.0101F, 10, 12, 8, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -4.5876F, 8.2399F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0829F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 0, -4.5F, -0.007F, -8.0372F, 7, 5, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -7.9626F, -14.5601F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 29, -1.0F, -9.0F, 15.0F, 0, 8, 12, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 2.1387F, 8.0183F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 45, 44, -3.5F, -3.6012F, -0.9784F, 7, 7, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.5062F, 3.2917F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3316F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 53, -3.0F, -1.6F, -4.5F, 6, 3, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.3105F, 3.7192F);
        this.body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3578F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 31, -2.5F, -2.0F, -4.5F, 5, 4, 9, 0.0F, false));

        this.HindlimbL = new AdvancedModelRenderer(this);
        this.HindlimbL.setRotationPoint(3.0F, 2.8988F, 2.7216F);
        this.body4.addChild(HindlimbL);
        this.setRotateAngle(HindlimbL, 0.5601F, -0.2276F, 0.2018F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.HindlimbL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.6109F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 37, 13, 1.0F, 0.5F, -2.0F, 6, 0, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 60, 0.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.HindlimbL2 = new AdvancedModelRenderer(this);
        this.HindlimbL2.setRotationPoint(-3.0F, 2.8988F, 2.7216F);
        this.body4.addChild(HindlimbL2);
        this.setRotateAngle(HindlimbL2, 0.5601F, 0.2276F, -0.2018F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.HindlimbL2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.6109F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 13, -7.0F, 0.5F, -2.0F, 6, 0, 5, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 60, -2.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.1617F, 7.7871F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 21, 66, -2.5F, -2.5129F, -1.1655F, 5, 5, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -3.1129F, -0.1655F);
        this.body5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2269F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 68, 44, -2.0F, -0.75F, -1.0F, 4, 2, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.9871F, 1.8345F);
        this.body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 53, -2.0F, -1.0F, -1.85F, 4, 1, 6, -0.01F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.1222F, 5.5884F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 45, 68, -2.0F, -1.9351F, -0.2539F, 4, 4, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -2.9351F, 0.7461F);
        this.body6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 58, 75, -1.5F, 0.375F, -0.725F, 3, 1, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.8868F, 2.8283F);
        this.body6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 75, 8, -1.5F, -0.65F, -3.125F, 3, 1, 5, -0.01F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -0.0209F, 4.403F);
        this.body6.addChild(body7);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.3058F, 1.6251F);
        this.body7.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1222F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -0.5F, -0.5F, -1.65F, 1, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, -2.0642F, -0.9569F);
        this.body7.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0087F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 66, -2.0F, 0.275F, 1.0F, 2, 3, 4, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, -0.2835F, 3.4478F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 7, 0.0F, -12.3557F, -0.5547F, 0, 21, 13, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 0.4193F, 1.1953F);
        this.body8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6632F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 31, 54, -1.5F, -0.55F, -2.3F, 1, 2, 10, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0536F, -10.5409F, 8.9822F);
        this.main.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 72, 28, -3.0536F, -1.9091F, -2.6572F, 6, 3, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 74, 75, -2.5536F, -1.9091F, -5.5572F, 5, 3, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 14, 78, -1.5536F, 0.0909F, -11.5572F, 3, 1, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 62, 27, -2.0536F, -0.9091F, -7.5572F, 4, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 77, 63, -1.0536F, 0.0909F, -16.5572F, 2, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 37, 0.6964F, 0.4659F, -16.4572F, 0, 1, 12, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 77, 53, -3.0536F, 1.0409F, -2.6572F, 6, 1, 3, -0.02F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.0536F, 3.6562F, 0.1359F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 77, -2.5F, -1.9941F, -2.943F, 5, 2, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.0536F, -0.4616F, -11.2567F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.144F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 5, -0.5F, -0.0445F, -4.0317F, 1, 1, 4, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.0536F, -2.1275F, -5.7672F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3316F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 81, -1.5F, -0.0662F, -2.9487F, 3, 2, 3, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.0536F, -1.2275F, -8.5672F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2531F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 20, -1.0F, 1.0195F, -1.4082F, 2, 1, 2, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 41, -1.0F, 0.0195F, -2.9082F, 2, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.9464F, -20.4591F, -11.9822F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5061F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 63, 68, -3.5F, 19.0F, -0.5F, 5, 3, 4, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 78, -3.0F, 19.0F, -3.5F, 4, 3, 3, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(2.2214F, -0.6591F, -4.3822F);
        this.Head.addChild(eye);
        this.setRotateAngle(eye, 0.3054F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 0, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 26, 23, -0.525F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-2.3286F, -0.6591F, -4.3822F);
        this.Head.addChild(eye2);
        this.setRotateAngle(eye2, 0.3054F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 0, -0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 26, 23, -0.475F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(-0.0536F, 1.0667F, -2.6839F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 43, 60, -2.5F, -0.0258F, -2.8483F, 5, 1, 3, -0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 28, 78, -1.5F, -1.6258F, -2.8483F, 3, 2, 3, -0.03F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 72, 21, -1.5F, -0.0508F, -8.7983F, 3, 1, 6, -0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 54, 15, 0.9F, -0.5508F, -13.6733F, 0, 1, 11, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 77, 57, -1.0F, -0.0508F, -13.7483F, 2, 1, 5, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.5895F, 2.8198F);
        this.Jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2182F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 78, 14, -2.0F, -1.0441F, -5.843F, 4, 1, 3, -0.02F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.5367F, -4.272F);
        this.Jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 45, -1.0F, -0.4F, -1.375F, 2, 1, 3, -0.03F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.Ichthyosaurus.offsetZ = -0.85F;
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Head.rotateAngleX = (float) Math.toRadians(-5);
        this.Head.rotateAngleY = (float) Math.toRadians(0);
        this.setRotateAngle(Jaw, 0.5F, 0.0F, 0.0F);
        this.Head.offsetY = 0.115F;
        this.Head.offsetX = -0.0F;
        this.Head.offsetZ = -0.41F;
        this.Head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(Head, -0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.02F, -0.1F, 0.0F);
        this.setRotateAngle(body2, 0.03F, -0.1F, 0.0F);
        this.setRotateAngle(body3, 0.04F, -0.1F, 0.0F);
        this.setRotateAngle(body4, 0.05F, -0.1F, 0.0F);
        this.setRotateAngle(body5, 0.06F, -0.1F, 0.0F);
        this.setRotateAngle(body6, 0.07F, -0.1F, 0.0F);
        this.setRotateAngle(body7, 0.08F, -0.1F, 0.0F);
        this.setRotateAngle(body8, 0.08F, -0.1F, 0.0F);
        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.28F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, 0.0F, 0.0F, 0.01F);
        this.setRotateAngle(Head, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body6, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body7, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body8, 0.0F, -0.1F, 0.0F);
        this.main.offsetY = -0.05F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.4F;
        this.main.offsetX = 0.55F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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


        AdvancedModelRenderer[] fishTail = {this.body4, this.body5, this.body6, this.body7, this.body8};
        AdvancedModelRenderer[] upperBody = {this.Head};
        ((EntityPrehistoricFloraIchthyosaurus)e).tailBuffer.applyChainSwingBuffer(fishTail);

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

        this.flap(ForelimbL2, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(ForelimbL2, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
        this.walk(ForelimbL2, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(HindlimbL, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
        this.swing(HindlimbL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        this.walk(HindlimbL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        this.flap(HindlimbL2, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
        this.swing(HindlimbL2, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
        this.walk(HindlimbL2, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            //this.main.offsetY = 0.15F;
            this.bob(main, -speed * 1.8F, 0.02F, false, f2, 1);
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

