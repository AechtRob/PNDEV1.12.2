package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnthracosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAnthracosaurus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Shoulderslope;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Leftfrontfoot;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Rightfrontfoot;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Shoulderslope2;
    private final AdvancedModelRenderer Shoulderslope_r1;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer Eyes;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer Throatpouch;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfinend;
    private final AdvancedModelRenderer Tailfinmidend;
    private final AdvancedModelRenderer Tailfinmiddle;
    private final AdvancedModelRenderer Tailfinmidbase;
    private final AdvancedModelRenderer Tailfinbase;
    private final AdvancedModelRenderer Hipslope;
    private final AdvancedModelRenderer Hipslope2;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Lefthindfoot;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Righthindfoot;

    private ModelAnimator animator;

    public ModelAnthracosaurus() {
        this.textureWidth = 88;
        this.textureHeight = 88;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, -3.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 17.0F, 24.0F);
        this.root.addChild(Hips);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 27, -3.5F, -0.25F, -17.0F, 7, 6, 16, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.9F, -16.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0213F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -4.5F, -1.9574F, -18.0005F, 9, 9, 18, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.3426F, -18.0005F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0213F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 30, 27, -4.0F, -0.5F, -7.0F, 8, 7, 8, 0.0F, false));

        this.Shoulderslope = new AdvancedModelRenderer(this);
        this.Shoulderslope.setRotationPoint(0.0F, -3.3F, 0.0F);
        this.Bodyfront.addChild(Shoulderslope);
        this.setRotateAngle(Shoulderslope, 0.2208F, 0.0F, 0.0F);
        this.Shoulderslope.cubeList.add(new ModelBox(Shoulderslope, 0, 49, -3.5F, 1.25F, -7.0F, 7, 2, 7, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.0F, 4.0F, -4.5F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.0F, 0.2759F, 0.322F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 0, 36, -4.5F, -1.0F, -1.5F, 5, 3, 3, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.4458F, -0.1698F, 0.0389F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 36, 0, -0.5F, -0.5F, -1.0F, 2, 5, 2, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.5F, 3.8F, 0.0F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.3821F, 0.1698F, -0.3183F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 69, 9, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.0F, 4.0F, -4.5F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.0F, -0.2759F, -0.322F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 0, 36, -0.5F, -1.0F, -1.5F, 5, 3, 3, 0.0F, true));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.4458F, 0.1698F, -0.0389F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 36, 0, -1.5F, -0.5F, -1.0F, 2, 5, 2, 0.0F, true));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.5F, 3.8F, 0.0F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.3821F, -0.1698F, 0.3183F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 69, 9, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 3.1F, -7.0F);
        this.Bodyfront.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 44, 56, -3.5F, -2.35F, -2.5F, 7, 5, 4, 0.0F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 3.0F, -2.75F);
        this.neck.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.1745F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 62, 52, -3.0F, -1.35F, 0.25F, 6, 1, 4, 0.0F, false));

        this.Shoulderslope2 = new AdvancedModelRenderer(this);
        this.Shoulderslope2.setRotationPoint(0.0F, -6.4F, 7.0F);
        this.neck.addChild(Shoulderslope2);
        this.setRotateAngle(Shoulderslope2, 0.2208F, 0.0F, 0.0F);


        this.Shoulderslope_r1 = new AdvancedModelRenderer(this);
        this.Shoulderslope_r1.setRotationPoint(0.0F, 10.9F, 12.0F);
        this.Shoulderslope2.addChild(Shoulderslope_r1);
        this.setRotateAngle(Shoulderslope_r1, -0.0436F, 0.0F, 0.0F);
        this.Shoulderslope_r1.cubeList.add(new ModelBox(Shoulderslope_r1, 67, 43, -3.0F, -8.65F, -22.5F, 6, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6F, -2.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 15, -1.5F, 0.0F, -10.0F, 3, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 54, 24, -1.5F, 0.05F, -8.1F, 3, 1, 9, -0.015F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 69, 24, -1.5F, -2.6F, -3.5F, 3, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2094F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 65, 1.6F, -1.0F, -6.1F, 2, 2, 6, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3316F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 61, -0.2776F, -0.05F, -0.0876F, 2, 1, 3, 0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1396F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 70, 1.1F, 0.0F, -8.7F, 2, 1, 3, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3665F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 0, 2.975F, 0.0F, -8.775F, 2, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, 0.1396F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 3, 2.85F, -2.6F, -8.75F, 0, 2, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 14, 2.35F, -2.35F, -7.8F, 0, 2, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 0, 2.85F, -1.6F, -7.3F, 0, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 3, 2.35F, -1.85F, -5.8F, 0, 2, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 4, 2.85F, -1.35F, -6.05F, 0, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 2.85F, -1.1F, -4.8F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 69, 14, -1.5F, -3.025F, -7.0F, 3, 2, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4189F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 15, -1.0F, -0.15F, 2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 7, -1.0F, 0.05F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 2, -1.5F, -3.85F, -9.75F, 3, 2, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3665F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 0, -4.975F, 0.0F, -8.775F, 2, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, -0.1396F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -2.85F, -1.1F, -4.8F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 4, -2.85F, -1.35F, -6.05F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 4, 0, -2.85F, -1.6F, -7.3F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 3, -2.35F, -1.85F, -5.8F, 0, 2, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 14, -2.35F, -2.35F, -7.8F, 0, 2, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 3, -2.85F, -2.6F, -8.75F, 0, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3316F, -0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 70, 61, -1.7224F, -0.05F, -0.0876F, 2, 1, 3, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.1396F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 70, -3.1F, 0.0F, -8.7F, 2, 1, 3, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.2094F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 65, -3.6F, -1.0F, -6.1F, 2, 2, 6, 0.0F, false));

        this.Eyes = new AdvancedModelRenderer(this);
        this.Eyes.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.head.addChild(Eyes);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eyes.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.1745F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 2.25F, -2.275F, -5.75F, 1, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eyes.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, -0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -3.25F, -2.275F, -5.75F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, -0.75F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 70, 57, -1.5F, 0.0F, -9.0F, 3, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 34, -2.0F, 0.0F, -6.5F, 4, 1, 8, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 69, -2.5F, -1.65F, -2.25F, 5, 2, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.2094F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 1.7486F, -0.5F, 0.858F, 0, 1, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.2618F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 1, 3.4F, -1.5F, -8.7F, 0, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.24F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 53, 13, 1.575F, -1.0F, -8.7F, 2, 1, 3, 0.01F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0524F, 0.1833F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 26, 62, 1.225F, -0.7F, -6.0F, 2, 1, 7, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.1833F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 43, 0.0486F, 0.0F, 0.358F, 2, 1, 7, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.2618F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 1, -3.4F, -1.5F, -8.7F, 0, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.24F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 53, 13, -3.575F, -1.0F, -8.7F, 2, 1, 3, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0873F, -0.2094F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -1.7486F, -0.5F, 0.858F, 0, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0873F, -0.1833F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 56, 43, -2.0486F, 0.0F, 0.358F, 2, 1, 7, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0524F, -0.1833F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 62, -3.225F, -0.7F, -6.0F, 2, 1, 7, -0.01F, false));

        this.Throatpouch = new AdvancedModelRenderer(this);
        this.Throatpouch.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.jaw.addChild(Throatpouch);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.05F, 0.5F);
        this.Throatpouch.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2182F, -0.2182F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 54, 17, -3.35F, 1.9F, -8.35F, 1, 1, 3, -0.015F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.05F, 0.5F);
        this.Throatpouch.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2182F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 69, 29, -1.5F, 2.0F, -8.75F, 3, 1, 3, -0.015F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Throatpouch.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.2182F, 0.2182F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 54, 17, 2.35F, 1.9F, -8.35F, 1, 1, 3, -0.015F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Throatpouch.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 56, 0, -2.0F, 1.25F, -6.25F, 4, 1, 8, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 1.9F, -1.0F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0213F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 37, 42, -2.5F, -1.5F, -1.0F, 5, 5, 9, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 1.4F, 8.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 20, 50, -2.0F, -2.0F, -1.0F, 4, 4, 8, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.1F, 7.0F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 54, 12, -1.5F, -1.0F, -1.0F, 3, 3, 9, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.9F, 8.05F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.0213F, 0.0F, 0.0F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 14, 62, -1.0F, -1.0F, -1.0F, 2, 2, 8, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.4F, 6.75F);
        this.Tailmiddleend.addChild(Tailend);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 47, 66, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.Tailfinend = new AdvancedModelRenderer(this);
        this.Tailfinend.setRotationPoint(0.01F, -4.8F, 0.0F);
        this.Tailend.addChild(Tailfinend);
        this.setRotateAngle(Tailfinend, -0.0213F, 0.0F, 0.0F);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 36, 2, 0.0F, 1.0F, 0.0F, 0, 4, 10, 0.0F, false));

        this.Tailfinmidend = new AdvancedModelRenderer(this);
        this.Tailfinmidend.setRotationPoint(0.0F, -4.8F, 0.0F);
        this.Tailmiddleend.addChild(Tailfinmidend);
        this.Tailfinmidend.cubeList.add(new ModelBox(Tailfinmidend, 0, 5, 0.0F, 1.0F, -0.1F, 0, 3, 7, 0.0F, false));

        this.Tailfinmiddle = new AdvancedModelRenderer(this);
        this.Tailfinmiddle.setRotationPoint(0.01F, -4.3F, 0.0F);
        this.Tailmiddle.addChild(Tailfinmiddle);
        this.Tailfinmiddle.cubeList.add(new ModelBox(Tailfinmiddle, 0, 1, 0.0F, 1.0F, -0.1F, 0, 3, 8, 0.0F, false));

        this.Tailfinmidbase = new AdvancedModelRenderer(this);
        this.Tailfinmidbase.setRotationPoint(-0.01F, -4.7F, 0.0F);
        this.Tailmiddlebase.addChild(Tailfinmidbase);
        this.setRotateAngle(Tailfinmidbase, -0.0424F, 0.0F, 0.0F);
        this.Tailfinmidbase.cubeList.add(new ModelBox(Tailfinmidbase, 0, 27, -0.49F, 1.0F, 0.0F, 1, 2, 7, 0.0F, false));

        this.Tailfinbase = new AdvancedModelRenderer(this);
        this.Tailfinbase.setRotationPoint(0.0F, -2.8F, -0.02F);
        this.Tailbase.addChild(Tailfinbase);
        this.setRotateAngle(Tailfinbase, -0.0424F, 0.0F, 0.0F);
        this.Tailfinbase.cubeList.add(new ModelBox(Tailfinbase, 58, 57, -1.0F, 0.1F, 0.0F, 2, 2, 8, 0.0F, false));

        this.Hipslope = new AdvancedModelRenderer(this);
        this.Hipslope.setRotationPoint(0.0F, -3.65F, -8.0F);
        this.Hips.addChild(Hipslope);
        this.setRotateAngle(Hipslope, -0.1436F, 0.0F, 0.0F);
        this.Hipslope.cubeList.add(new ModelBox(Hipslope, 36, 0, -2.5F, 1.85F, -2.5F, 5, 2, 10, 0.0F, false));

        this.Hipslope2 = new AdvancedModelRenderer(this);
        this.Hipslope2.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.Hipslope.addChild(Hipslope2);
        this.setRotateAngle(Hipslope2, 0.0658F, 0.0F, 0.0F);
        this.Hipslope2.cubeList.add(new ModelBox(Hipslope2, 0, 58, -2.5F, 1.6F, -8.5F, 5, 3, 6, -0.01F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.5F, 3.5F, -5.0F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.1698F, 1.2524F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 0, -1.5F, -1.0F, -5.5F, 3, 3, 6, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -0.1485F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 30, 27, -1.0F, -0.5F, -0.5F, 2, 5, 2, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 3.5F, 0.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.3396F, -0.4033F, -0.1274F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 56, 67, -2.5F, 0.0F, -3.5F, 5, 1, 4, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.5F, 3.5F, -5.0F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.1698F, -1.2524F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 0, -1.5F, -1.0F, -5.5F, 3, 3, 6, 0.0F, true));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, -0.1485F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 30, 27, -1.0F, -0.5F, -0.5F, 2, 5, 2, 0.0F, true));

        this.Righthindfoot = new AdvancedModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 3.5F, 0.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.3396F, 0.4033F, 0.1274F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 56, 67, -2.5F, 0.0F, -3.5F, 5, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

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
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};

        EntityPrehistoricFloraAnthracosaurus entitySilesaurus = (EntityPrehistoricFloraAnthracosaurus) e;

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAnthracosaurus ee = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;


    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnthracosaurus e = (EntityPrehistoricFloraAnthracosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
