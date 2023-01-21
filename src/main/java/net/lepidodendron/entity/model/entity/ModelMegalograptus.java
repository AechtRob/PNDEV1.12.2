package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelMegalograptus extends AdvancedModelBase {

    private final AdvancedModelRenderer Megalograptus;
    private final AdvancedModelRenderer MainTergites1;
    private final AdvancedModelRenderer MainTergites2;
    private final AdvancedModelRenderer MainTergites3;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Trident;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Cube_r1;
    private final AdvancedModelRenderer Cube_r2;
    private final AdvancedModelRenderer Cube_r3;
    private final AdvancedModelRenderer Cube_r4;
    private final AdvancedModelRenderer Cube_r5;
    private final AdvancedModelRenderer Cube_r6;
    private final AdvancedModelRenderer Cube_r7;
    private final AdvancedModelRenderer Cube_r8;
    private final AdvancedModelRenderer Pedipalps1;
    private final AdvancedModelRenderer Cube_r9;
    private final AdvancedModelRenderer Cube_r10;
    private final AdvancedModelRenderer Pedipalps2;
    private final AdvancedModelRenderer Cube_r11;
    private final AdvancedModelRenderer Cube_r12;
    private final AdvancedModelRenderer Grasping1;
    private final AdvancedModelRenderer Cube_r13;
    private final AdvancedModelRenderer Grasping2;
    private final AdvancedModelRenderer Cube_r14;
    private final AdvancedModelRenderer Cube_r15;
    private final AdvancedModelRenderer Grasping3;
    private final AdvancedModelRenderer Cube_r16;
    private final AdvancedModelRenderer Grasping4;
    private final AdvancedModelRenderer Grasping5;
    private final AdvancedModelRenderer Cube_r17;
    private final AdvancedModelRenderer Grasping6;
    private final AdvancedModelRenderer Cube_r18;
    private final AdvancedModelRenderer Cube_r19;
    private final AdvancedModelRenderer Grasping7;
    private final AdvancedModelRenderer Cube_r20;
    private final AdvancedModelRenderer Grasping8;
    private final AdvancedModelRenderer Paddle1;
    private final AdvancedModelRenderer Cube_r21;
    private final AdvancedModelRenderer PaddleP1;
    private final AdvancedModelRenderer Cube_r22;
    private final AdvancedModelRenderer Paddle2;
    private final AdvancedModelRenderer Cube_r23;
    private final AdvancedModelRenderer PaddleP2;
    private final AdvancedModelRenderer Cube_r24;
    private final AdvancedModelRenderer FLeg1;
    private final AdvancedModelRenderer FLeg2;
    private final AdvancedModelRenderer BLeg1;
    private final AdvancedModelRenderer Cube_r25;
    private final AdvancedModelRenderer BLeg2;
    private final AdvancedModelRenderer Cube_r26;

    private ModelAnimator animator;


    public ModelMegalograptus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Megalograptus = new AdvancedModelRenderer(this);
        this.Megalograptus.setRotationPoint(0.0F, 21.5F, 4.0F);


        this.MainTergites1 = new AdvancedModelRenderer(this);
        this.MainTergites1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Megalograptus.addChild(MainTergites1);
        this.MainTergites1.cubeList.add(new ModelBox(MainTergites1, 24, 29, -4.0F, -0.5F, 0.0F, 8, 1, 4, 0.0F, false));
        this.MainTergites1.cubeList.add(new ModelBox(MainTergites1, 30, 13, -3.0F, -1.5F, 0.0F, 6, 3, 4, 0.0F, false));

        this.MainTergites2 = new AdvancedModelRenderer(this);
        this.MainTergites2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.MainTergites1.addChild(MainTergites2);
        this.MainTergites2.cubeList.add(new ModelBox(MainTergites2, 30, 20, -3.0F, -1.5F, 0.0F, 6, 3, 4, -0.01F, false));
        this.MainTergites2.cubeList.add(new ModelBox(MainTergites2, 0, 20, -4.5F, -0.5F, 0.0F, 9, 1, 4, 0.0F, false));

        this.MainTergites3 = new AdvancedModelRenderer(this);
        this.MainTergites3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.MainTergites2.addChild(MainTergites3);
        this.MainTergites3.cubeList.add(new ModelBox(MainTergites3, 33, 6, -2.5F, -1.5F, 0.0F, 5, 3, 4, -0.01F, false));
        this.MainTergites3.cubeList.add(new ModelBox(MainTergites3, 0, 29, -4.0F, -0.5F, 0.0F, 8, 1, 4, -0.01F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.MainTergites3.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 14, 39, -2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 38, 0, -2.0F, -1.0F, 0.0F, 4, 2, 3, -0.001F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 38, -2.0F, -1.0F, 0.0F, 4, 2, 3, -0.002F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 30, 34, -2.0F, -1.0F, 0.0F, 4, 2, 3, -0.003F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 16, 34, -2.0F, -1.0F, 0.0F, 4, 2, 3, -0.004F, false));

        this.Trident = new AdvancedModelRenderer(this);
        this.Trident.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail5.addChild(Trident);
        this.Trident.cubeList.add(new ModelBox(Trident, 37, 41, -2.0F, -1.0F, 0.0F, 4, 2, 2, -0.005F, false));
        this.Trident.cubeList.add(new ModelBox(Trident, 0, 16, 0.0F, -1.0F, 2.0F, 0, 2, 9, 0.0F, false));
        this.Trident.cubeList.add(new ModelBox(Trident, 0, 0, -4.0F, 0.0F, 1.0F, 8, 0, 10, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Megalograptus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 10, -4.0F, -1.5F, -7.0F, 8, 3, 7, 0.01F, false));

        this.Cube_r1 = new AdvancedModelRenderer(this);
        this.Cube_r1.setRotationPoint(-0.4F, 1.5F, -2.75F);
        this.Head.addChild(Cube_r1);
        this.setRotateAngle(Cube_r1, -0.1766F, 0.4011F, -0.4287F);
        this.Cube_r1.cubeList.add(new ModelBox(Cube_r1, 0, 3, -3.2F, -1.2F, -1.0F, 3, 1, 2, -0.001F, true));

        this.Cube_r2 = new AdvancedModelRenderer(this);
        this.Cube_r2.setRotationPoint(-0.7F, 1.5F, 0.2F);
        this.Head.addChild(Cube_r2);
        this.setRotateAngle(Cube_r2, -0.0846F, 0.2013F, -0.4013F);
        this.Cube_r2.cubeList.add(new ModelBox(Cube_r2, 26, 8, -2.0F, -0.75F, -4.25F, 3, 1, 1, -0.001F, true));

        this.Cube_r3 = new AdvancedModelRenderer(this);
        this.Cube_r3.setRotationPoint(-0.25F, 1.5F, 0.0F);
        this.Head.addChild(Cube_r3);
        this.setRotateAngle(Cube_r3, 0.0F, 0.0F, -0.3927F);
        this.Cube_r3.cubeList.add(new ModelBox(Cube_r3, 41, 34, -3.15F, -1.25F, -5.0F, 3, 1, 1, -0.001F, true));

        this.Cube_r4 = new AdvancedModelRenderer(this);
        this.Cube_r4.setRotationPoint(0.3F, 5.9F, 0.2F);
        this.Head.addChild(Cube_r4);
        this.setRotateAngle(Cube_r4, 0.5018F, 1.1721F, 0.129F);
        this.Cube_r4.cubeList.add(new ModelBox(Cube_r4, 20, 29, 3.15F, -6.5F, -2.95F, 2, 1, 2, -0.001F, true));

        this.Cube_r5 = new AdvancedModelRenderer(this);
        this.Cube_r5.setRotationPoint(-0.3F, 5.9F, 0.2F);
        this.Head.addChild(Cube_r5);
        this.setRotateAngle(Cube_r5, 0.5018F, -1.1721F, -0.129F);
        this.Cube_r5.cubeList.add(new ModelBox(Cube_r5, 20, 29, -5.15F, -6.5F, -2.95F, 2, 1, 2, -0.001F, false));

        this.Cube_r6 = new AdvancedModelRenderer(this);
        this.Cube_r6.setRotationPoint(0.25F, 1.5F, 0.0F);
        this.Head.addChild(Cube_r6);
        this.setRotateAngle(Cube_r6, 0.0F, 0.0F, 0.3927F);
        this.Cube_r6.cubeList.add(new ModelBox(Cube_r6, 41, 34, 0.15F, -1.25F, -5.0F, 3, 1, 1, -0.001F, false));

        this.Cube_r7 = new AdvancedModelRenderer(this);
        this.Cube_r7.setRotationPoint(0.7F, 1.5F, 0.2F);
        this.Head.addChild(Cube_r7);
        this.setRotateAngle(Cube_r7, -0.0846F, -0.2013F, 0.4013F);
        this.Cube_r7.cubeList.add(new ModelBox(Cube_r7, 26, 8, -1.0F, -0.75F, -4.25F, 3, 1, 1, -0.001F, false));

        this.Cube_r8 = new AdvancedModelRenderer(this);
        this.Cube_r8.setRotationPoint(0.4F, 1.5F, -2.75F);
        this.Head.addChild(Cube_r8);
        this.setRotateAngle(Cube_r8, -0.1766F, -0.4011F, 0.4287F);
        this.Cube_r8.cubeList.add(new ModelBox(Cube_r8, 0, 3, 0.2F, -1.2F, -1.0F, 3, 1, 2, -0.001F, false));

        this.Pedipalps1 = new AdvancedModelRenderer(this);
        this.Pedipalps1.setRotationPoint(2.0F, 1.25F, -7.0F);
        this.Head.addChild(Pedipalps1);


        this.Cube_r9 = new AdvancedModelRenderer(this);
        this.Cube_r9.setRotationPoint(-1.9F, -1.35F, 7.35F);
        this.Pedipalps1.addChild(Cube_r9);
        this.setRotateAngle(Cube_r9, 0.2317F, -0.3405F, -0.0786F);
        this.Cube_r9.cubeList.add(new ModelBox(Cube_r9, 0, 6, -1.75F, -0.75F, -9.75F, 1, 1, 3, 0.0F, false));
        this.Cube_r9.cubeList.add(new ModelBox(Cube_r9, 0, 0, -2.75F, -0.25F, -8.75F, 1, 0, 1, 0.0F, false));

        this.Cube_r10 = new AdvancedModelRenderer(this);
        this.Cube_r10.setRotationPoint(-1.9F, -1.35F, 7.35F);
        this.Pedipalps1.addChild(Cube_r10);
        this.setRotateAngle(Cube_r10, 0.2214F, -0.1704F, -0.0381F);
        this.Cube_r10.cubeList.add(new ModelBox(Cube_r10, 0, 0, -1.0F, -0.25F, -12.75F, 2, 0, 3, 0.0F, false));

        this.Pedipalps2 = new AdvancedModelRenderer(this);
        this.Pedipalps2.setRotationPoint(-2.0F, 1.25F, -7.0F);
        this.Head.addChild(Pedipalps2);


        this.Cube_r11 = new AdvancedModelRenderer(this);
        this.Cube_r11.setRotationPoint(1.9F, -1.35F, 7.35F);
        this.Pedipalps2.addChild(Cube_r11);
        this.setRotateAngle(Cube_r11, 0.2317F, 0.3405F, 0.0786F);
        this.Cube_r11.cubeList.add(new ModelBox(Cube_r11, 0, 6, 0.75F, -0.75F, -9.75F, 1, 1, 3, 0.0F, true));
        this.Cube_r11.cubeList.add(new ModelBox(Cube_r11, 0, 0, 1.75F, -0.25F, -8.75F, 1, 0, 1, 0.0F, true));

        this.Cube_r12 = new AdvancedModelRenderer(this);
        this.Cube_r12.setRotationPoint(1.9F, -1.35F, 7.35F);
        this.Pedipalps2.addChild(Cube_r12);
        this.setRotateAngle(Cube_r12, 0.2214F, 0.1704F, 0.0381F);
        this.Cube_r12.cubeList.add(new ModelBox(Cube_r12, 0, 0, -1.0F, -0.25F, -12.75F, 2, 0, 3, 0.0F, true));

        this.Grasping1 = new AdvancedModelRenderer(this);
        this.Grasping1.setRotationPoint(2.25F, 1.75F, -5.75F);
        this.Head.addChild(Grasping1);


        this.Cube_r13 = new AdvancedModelRenderer(this);
        this.Cube_r13.setRotationPoint(-2.75F, 0.15F, 6.05F);
        this.Grasping1.addChild(Cube_r13);
        this.setRotateAngle(Cube_r13, 0.0F, -0.7854F, 0.0F);
        this.Cube_r13.cubeList.add(new ModelBox(Cube_r13, 4, 0, -4.25F, 0.0F, -13.0F, 1, 0, 3, 0.0F, false));
        this.Cube_r13.cubeList.add(new ModelBox(Cube_r13, 4, 0, -4.25F, -0.5F, -13.0F, 1, 0, 3, 0.0F, false));
        this.Cube_r13.cubeList.add(new ModelBox(Cube_r13, 18, 20, -3.25F, -0.75F, -14.0F, 2, 1, 8, 0.0F, false));

        this.Grasping2 = new AdvancedModelRenderer(this);
        this.Grasping2.setRotationPoint(6.25F, -0.1F, -4.75F);
        this.Grasping1.addChild(Grasping2);


        this.Cube_r14 = new AdvancedModelRenderer(this);
        this.Cube_r14.setRotationPoint(-6.5F, 0.0F, 12.55F);
        this.Grasping2.addChild(Cube_r14);
        this.setRotateAngle(Cube_r14, 0.0F, -0.7418F, 0.0F);
        this.Cube_r14.cubeList.add(new ModelBox(Cube_r14, 29, 27, -13.75F, -0.25F, -15.25F, 8, 0, 1, 0.0F, false));
        this.Cube_r14.cubeList.add(new ModelBox(Cube_r14, 29, 27, -13.75F, 0.25F, -15.25F, 8, 0, 1, 0.0F, false));

        this.Cube_r15 = new AdvancedModelRenderer(this);
        this.Cube_r15.setRotationPoint(-6.5F, 0.0F, 12.55F);
        this.Grasping2.addChild(Cube_r15);
        this.setRotateAngle(Cube_r15, 0.0F, -0.5672F, 0.0F);
        this.Cube_r15.cubeList.add(new ModelBox(Cube_r15, 0, 13, -6.25F, -0.25F, -15.0F, 3, 0, 1, 0.0F, false));
        this.Cube_r15.cubeList.add(new ModelBox(Cube_r15, 0, 13, -6.25F, 0.25F, -15.0F, 3, 0, 1, 0.0F, false));
        this.Cube_r15.cubeList.add(new ModelBox(Cube_r15, 17, 25, -3.25F, -0.5F, -16.0F, 2, 1, 2, -0.01F, false));

        this.Grasping3 = new AdvancedModelRenderer(this);
        this.Grasping3.setRotationPoint(0.7F, 0.0F, -1.85F);
        this.Grasping2.addChild(Grasping3);


        this.Cube_r16 = new AdvancedModelRenderer(this);
        this.Cube_r16.setRotationPoint(-7.2F, 0.25F, 14.4F);
        this.Grasping3.addChild(Cube_r16);
        this.setRotateAngle(Cube_r16, 0.0F, -0.2618F, 0.0F);
        this.Cube_r16.cubeList.add(new ModelBox(Cube_r16, 16, 10, -1.75F, -0.25F, -22.75F, 5, 0, 7, 0.0F, false));

        this.Grasping4 = new AdvancedModelRenderer(this);
        this.Grasping4.setRotationPoint(-0.1F, 0.0F, -7.25F);
        this.Grasping3.addChild(Grasping4);
        this.Grasping4.cubeList.add(new ModelBox(Grasping4, 20, 0, -6.0F, 0.0F, -6.0F, 6, 0, 6, 0.0F, false));

        this.Grasping5 = new AdvancedModelRenderer(this);
        this.Grasping5.setRotationPoint(-2.25F, 1.75F, -5.75F);
        this.Head.addChild(Grasping5);


        this.Cube_r17 = new AdvancedModelRenderer(this);
        this.Cube_r17.setRotationPoint(2.75F, 0.15F, 6.05F);
        this.Grasping5.addChild(Cube_r17);
        this.setRotateAngle(Cube_r17, 0.0F, 0.7854F, 0.0F);
        this.Cube_r17.cubeList.add(new ModelBox(Cube_r17, 4, 0, 3.25F, 0.0F, -13.0F, 1, 0, 3, 0.0F, true));
        this.Cube_r17.cubeList.add(new ModelBox(Cube_r17, 4, 0, 3.25F, -0.5F, -13.0F, 1, 0, 3, 0.0F, true));
        this.Cube_r17.cubeList.add(new ModelBox(Cube_r17, 18, 20, 1.25F, -0.75F, -14.0F, 2, 1, 8, 0.0F, true));

        this.Grasping6 = new AdvancedModelRenderer(this);
        this.Grasping6.setRotationPoint(-6.25F, -0.1F, -4.75F);
        this.Grasping5.addChild(Grasping6);


        this.Cube_r18 = new AdvancedModelRenderer(this);
        this.Cube_r18.setRotationPoint(6.5F, 0.0F, 12.55F);
        this.Grasping6.addChild(Cube_r18);
        this.setRotateAngle(Cube_r18, 0.0F, 0.7418F, 0.0F);
        this.Cube_r18.cubeList.add(new ModelBox(Cube_r18, 29, 27, 5.75F, -0.25F, -15.25F, 8, 0, 1, 0.0F, true));
        this.Cube_r18.cubeList.add(new ModelBox(Cube_r18, 29, 27, 5.75F, 0.25F, -15.25F, 8, 0, 1, 0.0F, true));

        this.Cube_r19 = new AdvancedModelRenderer(this);
        this.Cube_r19.setRotationPoint(6.5F, 0.0F, 12.55F);
        this.Grasping6.addChild(Cube_r19);
        this.setRotateAngle(Cube_r19, 0.0F, 0.5672F, 0.0F);
        this.Cube_r19.cubeList.add(new ModelBox(Cube_r19, 0, 13, 3.25F, -0.25F, -15.0F, 3, 0, 1, 0.0F, true));
        this.Cube_r19.cubeList.add(new ModelBox(Cube_r19, 0, 13, 3.25F, 0.25F, -15.0F, 3, 0, 1, 0.0F, true));
        this.Cube_r19.cubeList.add(new ModelBox(Cube_r19, 17, 25, 1.25F, -0.5F, -16.0F, 2, 1, 2, -0.01F, true));

        this.Grasping7 = new AdvancedModelRenderer(this);
        this.Grasping7.setRotationPoint(-0.7F, 0.0F, -1.85F);
        this.Grasping6.addChild(Grasping7);


        this.Cube_r20 = new AdvancedModelRenderer(this);
        this.Cube_r20.setRotationPoint(7.2F, 0.25F, 14.4F);
        this.Grasping7.addChild(Cube_r20);
        this.setRotateAngle(Cube_r20, 0.0F, 0.2618F, 0.0F);
        this.Cube_r20.cubeList.add(new ModelBox(Cube_r20, 16, 10, -3.25F, -0.25F, -22.75F, 5, 0, 7, 0.0F, true));

        this.Grasping8 = new AdvancedModelRenderer(this);
        this.Grasping8.setRotationPoint(0.1F, 0.0F, -7.25F);
        this.Grasping7.addChild(Grasping8);
        this.Grasping8.cubeList.add(new ModelBox(Grasping8, 20, 0, 0.0F, 0.0F, -6.0F, 6, 0, 6, 0.0F, true));

        this.Paddle1 = new AdvancedModelRenderer(this);
        this.Paddle1.setRotationPoint(3.75F, 1.5F, -2.25F);
        this.Head.addChild(Paddle1);


        this.Cube_r21 = new AdvancedModelRenderer(this);
        this.Cube_r21.setRotationPoint(-3.35F, -26.0F, -0.5F);
        this.Paddle1.addChild(Cube_r21);
        this.setRotateAngle(Cube_r21, 0.0F, -0.4363F, 0.0F);
        this.Cube_r21.cubeList.add(new ModelBox(Cube_r21, 25, 39, 3.0F, 26.0F, -1.0F, 5, 1, 2, 0.0F, false));

        this.PaddleP1 = new AdvancedModelRenderer(this);
        this.PaddleP1.setRotationPoint(3.9F, 0.5F, 2.85F);
        this.Paddle1.addChild(PaddleP1);


        this.Cube_r22 = new AdvancedModelRenderer(this);
        this.Cube_r22.setRotationPoint(-7.25F, -26.5F, -3.35F);
        this.PaddleP1.addChild(Cube_r22);
        this.setRotateAngle(Cube_r22, 0.0F, -0.4363F, 0.0F);
        this.Cube_r22.cubeList.add(new ModelBox(Cube_r22, 0, 10, 13.0F, 26.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.Cube_r22.cubeList.add(new ModelBox(Cube_r22, 0, 34, 8.0F, 26.0F, -1.5F, 5, 1, 3, 0.001F, false));

        this.Paddle2 = new AdvancedModelRenderer(this);
        this.Paddle2.setRotationPoint(-3.75F, 1.5F, -2.25F);
        this.Head.addChild(Paddle2);


        this.Cube_r23 = new AdvancedModelRenderer(this);
        this.Cube_r23.setRotationPoint(3.35F, -26.0F, -0.5F);
        this.Paddle2.addChild(Cube_r23);
        this.setRotateAngle(Cube_r23, 0.0F, 0.4363F, 0.0F);
        this.Cube_r23.cubeList.add(new ModelBox(Cube_r23, 25, 39, -8.0F, 26.0F, -1.0F, 5, 1, 2, 0.0F, true));

        this.PaddleP2 = new AdvancedModelRenderer(this);
        this.PaddleP2.setRotationPoint(-3.9F, 0.5F, 2.85F);
        this.Paddle2.addChild(PaddleP2);


        this.Cube_r24 = new AdvancedModelRenderer(this);
        this.Cube_r24.setRotationPoint(7.25F, -26.5F, -3.35F);
        this.PaddleP2.addChild(Cube_r24);
        this.setRotateAngle(Cube_r24, 0.0F, 0.4363F, 0.0F);
        this.Cube_r24.cubeList.add(new ModelBox(Cube_r24, 0, 10, -14.0F, 26.0F, -1.0F, 1, 1, 2, 0.0F, true));
        this.Cube_r24.cubeList.add(new ModelBox(Cube_r24, 0, 34, -13.0F, 26.0F, -1.5F, 5, 1, 3, 0.001F, true));

        this.FLeg1 = new AdvancedModelRenderer(this);
        this.FLeg1.setRotationPoint(3.5F, 1.5F, -4.5F);
        this.Head.addChild(FLeg1);
        this.FLeg1.cubeList.add(new ModelBox(FLeg1, 37, 39, -0.25F, 0.0F, -0.5F, 6, 1, 1, 0.0F, false));
        this.FLeg1.cubeList.add(new ModelBox(FLeg1, 24, 6, 0.75F, 0.5F, -1.0F, 5, 0, 2, 0.0F, false));

        this.FLeg2 = new AdvancedModelRenderer(this);
        this.FLeg2.setRotationPoint(-3.5F, 1.5F, -4.5F);
        this.Head.addChild(FLeg2);
        this.FLeg2.cubeList.add(new ModelBox(FLeg2, 37, 39, -5.75F, 0.0F, -0.5F, 6, 1, 1, 0.0F, true));
        this.FLeg2.cubeList.add(new ModelBox(FLeg2, 24, 6, -5.75F, 0.5F, -1.0F, 5, 0, 2, 0.0F, true));

        this.BLeg1 = new AdvancedModelRenderer(this);
        this.BLeg1.setRotationPoint(3.55F, 1.5F, -3.5F);
        this.Head.addChild(BLeg1);


        this.Cube_r25 = new AdvancedModelRenderer(this);
        this.Cube_r25.setRotationPoint(-2.85F, -26.0F, 3.7F);
        this.BLeg1.addChild(Cube_r25);
        this.setRotateAngle(Cube_r25, 0.0F, -0.2182F, 0.0F);
        this.Cube_r25.cubeList.add(new ModelBox(Cube_r25, 0, 27, 1.75F, 26.0F, -4.25F, 8, 1, 1, 0.0F, false));

        this.BLeg2 = new AdvancedModelRenderer(this);
        this.BLeg2.setRotationPoint(-3.55F, 1.5F, -3.5F);
        this.Head.addChild(BLeg2);


        this.Cube_r26 = new AdvancedModelRenderer(this);
        this.Cube_r26.setRotationPoint(2.85F, -26.0F, 3.7F);
        this.BLeg2.addChild(Cube_r26);
        this.setRotateAngle(Cube_r26, 0.0F, 0.2182F, 0.0F);
        this.Cube_r26.cubeList.add(new ModelBox(Cube_r26, 0, 27, -9.75F, 26.0F, -4.25F, 8, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Megalograptus.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Megalograptus.rotateAngleX = (float) Math.toRadians(90);
        this.Megalograptus.rotateAngleZ = (float) Math.toRadians(90);
        this.Megalograptus.offsetX = -0.06F;
        this.Megalograptus.offsetY = -0.21F;
        this.Megalograptus.offsetZ = 0.15F;
        this.Megalograptus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Megalograptus, -0.3927F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(MainTergites1, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Tail5, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Trident, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Cube_r1, -0.1766F, 0.4011F, -0.4287F);
        this.setRotateAngle(Cube_r2, -0.0846F, 0.2013F, -0.4013F);
        this.setRotateAngle(Cube_r3, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(Cube_r4, 0.5018F, 1.1721F, 0.129F);
        this.setRotateAngle(Cube_r5, 0.5018F, -1.1721F, -0.129F);
        this.setRotateAngle(Cube_r6, 0.0F, 0.0F, 0.3927F);
        this.setRotateAngle(Cube_r7, -0.0846F, -0.2013F, 0.4013F);
        this.setRotateAngle(Cube_r8, -0.1766F, -0.4011F, 0.4287F);
        this.setRotateAngle(Cube_r9, 0.2317F, -0.3405F, -0.0786F);
        this.setRotateAngle(Cube_r10, 0.2214F, -0.1704F, -0.0381F);
        this.setRotateAngle(Cube_r11, 0.2317F, 0.3405F, 0.0786F);
        this.setRotateAngle(Cube_r12, 0.2214F, 0.1704F, 0.0381F);
        this.setRotateAngle(Grasping1, 0.0F, -0.5672F, 0.0F);
        this.setRotateAngle(Cube_r13, 0.0F, -0.7854F, 0.0F);
        this.setRotateAngle(Grasping2, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(Cube_r14, 0.0F, -0.7418F, 0.0F);
        this.setRotateAngle(Cube_r15, 0.0F, -0.5672F, 0.0F);
        this.setRotateAngle(Grasping3, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(Cube_r16, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Grasping4, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Grasping5, 0.0F, 0.5672F, 0.0F);
        this.setRotateAngle(Cube_r17, 0.0F, 0.7854F, 0.0F);
        this.setRotateAngle(Grasping6, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Cube_r18, 0.0F, 0.7418F, 0.0F);
        this.setRotateAngle(Cube_r19, 0.0F, 0.5672F, 0.0F);
        this.setRotateAngle(Grasping7, 0.0F, 0.48F, 0.0F);
        this.setRotateAngle(Cube_r20, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(Grasping8, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Paddle1, 0.0F, 0.0F, -0.1309F);
        this.setRotateAngle(Cube_r21, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(PaddleP1, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(Cube_r22, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(Paddle2, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(Cube_r23, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(PaddleP2, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(Cube_r24, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(FLeg1, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(FLeg2, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(BLeg1, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(Cube_r25, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(BLeg2, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(Cube_r26, 0.0F, 0.2182F, 0.0F);
        this.Megalograptus.offsetZ = -0.05F;
        this.Megalograptus.render(0.01F);
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
        this.Megalograptus.offsetY = 1.0F;

        float speedMultiplier = 1F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speedMultiplier = 1.75F;
        }
        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        //AdvancedModelRenderer[] fishBody = {this.body1, this.body2, this.body3, this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] fishBody = {this.MainTergites1, this.MainTergites2, this.MainTergites3, this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] fishfinL = {this.Paddle1, this.PaddleP1};
        AdvancedModelRenderer[] fishfinR = {this.Paddle2, this.PaddleP2};

        //mouthparts:
        this.swing(Grasping1, 0.4F, -0.3F, false, 0, -0.1F, f2, 0.8F);
        this.swing(Grasping2, 0.4F, 0.3F, false, 0, 0.1F, f2, 0.8F);
        this.swing(Grasping5, 0.4F, 0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(Grasping6, 0.4F, -0.2F, false, 0, 0.1F, f2, 0.8F);

        float speed = 0.4F * speedMultiplier;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.4F;
        float paddleHdegree = 0.4F;
        float tailSwing = 1.0F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;

        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F * speedMultiplier;
            tailHdegree = 0.4F;
            tailSwing = 0.25F;
            paddleVdegree = 0.1F;
            this.Paddle1.defaultRotationY = 0F;
            this.Paddle2.defaultRotationY = 0F;

            this.FLeg2.rotateAngleZ = -0.6109F;
            this.BLeg1.rotateAngleZ = -0.6109F;
            this.FLeg1.rotateAngleZ = 0.6109F;
            this.BLeg2.rotateAngleZ = 0.6109F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishBody, speed, 0.1F, -3, f2, 0.5F);
            this.chainSwing(fishTail, speed, tailHdegree, -2, f2, tailSwing);

            this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            if (e.isInWater()) {
                if (!isAtBottom) {
                    this.swing(FLeg1, speed, 0.2F, false, 0F, 0.4F, f2, 1F);
                    this.swing(BLeg1, speed, 0.2F, false, 0F, 0.4F, f2, 1F);
                    this.swing(FLeg2, speed, 0.2F, true, 0F, 0.4F, f2, 1F);
                    this.swing(BLeg2, speed, 0.2F, true, 0F, 0.4F, f2, 1F);
                } else { //Walking
                    if (f3 != 0.0F) {
                        this.flap(FLeg1, speed, 0.2F, false, 0F, 0.5F, f2, 1F);
                        this.flap(BLeg1, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                        this.flap(FLeg2, speed, 0.2F, true, 3F, 0.5F, f2, 1F);
                        this.flap(BLeg2, speed, 0.2F, true, 0F, 0.5F, f2, 1F);

                        this.swing(FLeg1, speed, 0.2F, false, 0F, 0.4F, f2, 0.8F);
                        this.swing(BLeg1, speed, 0.2F, false, 3F, 0.4F, f2, 0.8F);
                        this.swing(FLeg2, speed, 0.2F, true, 3F, 0.4F, f2, 0.8F);
                        this.swing(BLeg2, speed, 0.2F, true, 0F, 0.4F, f2, 0.8F);
                    }
                }
            }

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(Megalograptus, -speed * 0.5F, 2.5F, false, f2, 2);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Megalograptus.offsetY = 1.1F;
                this.bob(Megalograptus, -speed * 1.5F, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, tailHdegree, -3, f2, 1);
                this.chainSwing(fishBody, speed, 0.1F, -2, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.MainTergites1, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.MainTergites2, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.MainTergites3, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail2, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail4, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail5, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail5, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Trident, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(20);
    }
}
