package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnthracosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraPholiderpeton;
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
        this.root.render(f5);
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
        ((EntityPrehistoricFloraAnthracosaurus)e).tailBuffer.applyChainSwingBuffer(Tail);

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
        } else if (ee.getAnimation() == ee.LOOK_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());

        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;
        int animCycle = 42;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-0.25), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+20))*1.5), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-15))*1));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0.325+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-0.15);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0.1);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*0.1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.51346 + (((tickAnim - 0) / 8) * (4.93538-(0.51346)));
            yy = -26.98992 + (((tickAnim - 0) / 8) * (-5.21008-(-26.98992)));
            zz = -7.04248 + (((tickAnim - 0) / 8) * (-9.15001-(-7.04248)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 4.93538 + (((tickAnim - 8) / 12) * (14.32662-(4.93538)));
            yy = -5.21008 + (((tickAnim - 8) / 12) * (24.381-(-5.21008)));
            zz = -9.15001 + (((tickAnim - 8) / 12) * (12.1943-(-9.15001)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 14.32662 + (((tickAnim - 20) / 11) * (8.78322-(14.32662)));
            yy = 24.381 + (((tickAnim - 20) / 11) * (-14.90835-(24.381)));
            zz = 12.1943 + (((tickAnim - 20) / 11) * (13.81633-(12.1943)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 8.78322 + (((tickAnim - 31) / 8) * (0-(8.78322)));
            yy = -14.90835 + (((tickAnim - 31) / 8) * (-37.5-(-14.90835)));
            zz = 13.81633 + (((tickAnim - 31) / 8) * (-4.75-(13.81633)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0.51346-(0)));
            yy = -37.5 + (((tickAnim - 39) / 4) * (-26.98992-(-37.5)));
            zz = -4.75 + (((tickAnim - 39) / 4) * (-7.04248-(-4.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -11.83284 + (((tickAnim - 0) / 8) * (5.25851-(-11.83284)));
            yy = 27.17789 + (((tickAnim - 0) / 8) * (17.72946-(27.17789)));
            zz = -0.3754 + (((tickAnim - 0) / 8) * (20.84011-(-0.3754)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 5.25851 + (((tickAnim - 8) / 12) * (28.03447-(5.25851)));
            yy = 17.72946 + (((tickAnim - 8) / 12) * (1.13506-(17.72946)));
            zz = 20.84011 + (((tickAnim - 8) / 12) * (41.4778-(20.84011)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 28.03447 + (((tickAnim - 20) / 11) * (2.06168-(28.03447)));
            yy = 1.13506 + (((tickAnim - 20) / 11) * (35.55633-(1.13506)));
            zz = 41.4778 + (((tickAnim - 20) / 11) * (42.02361-(41.4778)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 2.06168 + (((tickAnim - 31) / 8) * (-11.83284-(2.06168)));
            yy = 35.55633 + (((tickAnim - 31) / 8) * (27.17789-(35.55633)));
            zz = 42.02361 + (((tickAnim - 31) / 8) * (-0.3754-(42.02361)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -11.83284 + (((tickAnim - 39) / 4) * (-11.83284-(-11.83284)));
            yy = 27.17789 + (((tickAnim - 39) / 4) * (27.17789-(27.17789)));
            zz = -0.3754 + (((tickAnim - 39) / 4) * (-0.3754-(-0.3754)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.85085 + (((tickAnim - 0) / 8) * (-4.48862-(12.85085)));
            yy = -5.7551 + (((tickAnim - 0) / 8) * (-17.33547-(-5.7551)));
            zz = 4.22515 + (((tickAnim - 0) / 8) * (-21.87207-(4.22515)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -4.48862 + (((tickAnim - 8) / 12) * (27.77713-(-4.48862)));
            yy = -17.33547 + (((tickAnim - 8) / 12) * (-51.75193-(-17.33547)));
            zz = -21.87207 + (((tickAnim - 8) / 12) * (-38.28704-(-21.87207)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 27.77713 + (((tickAnim - 20) / 11) * (68.84512-(27.77713)));
            yy = -51.75193 + (((tickAnim - 20) / 11) * (-24.77948-(-51.75193)));
            zz = -38.28704 + (((tickAnim - 20) / 11) * (-43.13512-(-38.28704)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 68.84512 + (((tickAnim - 31) / 8) * (12.82909-(68.84512)));
            yy = -24.77948 + (((tickAnim - 31) / 8) * (-3.60484-(-24.77948)));
            zz = -43.13512 + (((tickAnim - 31) / 8) * (4.19476-(-43.13512)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 12.82909 + (((tickAnim - 39) / 4) * (12.85085-(12.82909)));
            yy = -3.60484 + (((tickAnim - 39) / 4) * (-5.7551-(-3.60484)));
            zz = 4.19476 + (((tickAnim - 39) / 4) * (4.22515-(4.19476)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 14.32662 + (((tickAnim - 0) / 8) * (11.5872+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2-(14.32662)));
            yy = -24.38096 + (((tickAnim - 0) / 8) * (0.97968-(-24.38096)));
            zz = -12.19431 + (((tickAnim - 0) / 8) * (-11.5308-(-12.19431)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 11.5872+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2 + (((tickAnim - 8) / 9) * (0-(11.5872+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2)));
            yy = 0.97968 + (((tickAnim - 8) / 9) * (37.5-(0.97968)));
            zz = -11.5308 + (((tickAnim - 8) / 9) * (4.75-(-11.5308)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (5.61925-(0)));
            yy = 37.5 + (((tickAnim - 17) / 11) * (1.15008-(37.5)));
            zz = 4.75 + (((tickAnim - 17) / 11) * (6.5239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4-(4.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = 5.61925 + (((tickAnim - 28) / 15) * (14.32662-(5.61925)));
            yy = 1.15008 + (((tickAnim - 28) / 15) * (-24.38096-(1.15008)));
            zz = 6.5239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4 + (((tickAnim - 28) / 15) * (-12.19431-(6.5239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 28.03447 + (((tickAnim - 0) / 8) * (-0.65518-(28.03447)));
            yy = 1.13506 + (((tickAnim - 0) / 8) * (-14.78787-(1.13506)));
            zz = -41.47781 + (((tickAnim - 0) / 8) * (-43.20264-(-41.47781)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -0.65518 + (((tickAnim - 8) / 9) * (-3.06322-(-0.65518)));
            yy = -14.78787 + (((tickAnim - 8) / 9) * (-24.04777-(-14.78787)));
            zz = -43.20264 + (((tickAnim - 8) / 9) * (-10.71323-(-43.20264)));
        }
        else if (tickAnim >= 17 && tickAnim < 43) {
            xx = -3.06322 + (((tickAnim - 17) / 26) * (28.03447-(-3.06322)));
            yy = -24.04777 + (((tickAnim - 17) / 26) * (1.13506-(-24.04777)));
            zz = -10.71323 + (((tickAnim - 17) / 26) * (-41.47781-(-10.71323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 36.61723 + (((tickAnim - 0) / 8) * (69.44192-(36.61723)));
            yy = 50.68233 + (((tickAnim - 0) / 8) * (-14.68123-(50.68233)));
            zz = 47.04838 + (((tickAnim - 0) / 8) * (42.97662-(47.04838)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 69.44192 + (((tickAnim - 8) / 9) * (4.15003-(69.44192)));
            yy = -14.68123 + (((tickAnim - 8) / 9) * (-10.40166-(-14.68123)));
            zz = 42.97662 + (((tickAnim - 8) / 9) * (0.55698-(42.97662)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 4.15003 + (((tickAnim - 17) / 6) * (-4.91185-(4.15003)));
            yy = -10.40166 + (((tickAnim - 17) / 6) * (1.89226-(-10.40166)));
            zz = 0.55698 + (((tickAnim - 17) / 6) * (14.44206-(0.55698)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -4.91185 + (((tickAnim - 23) / 5) * (-11.98811-(-4.91185)));
            yy = 1.89226 + (((tickAnim - 23) / 5) * (14.07445-(1.89226)));
            zz = 14.44206 + (((tickAnim - 23) / 5) * (20.97566-(14.44206)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = -11.98811 + (((tickAnim - 28) / 15) * (36.61723-(-11.98811)));
            yy = 14.07445 + (((tickAnim - 28) / 15) * (50.68233-(14.07445)));
            zz = 20.97566 + (((tickAnim - 28) / 15) * (47.04838-(20.97566)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-48.12231-(0)));
            yy = 56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 0) / 14) * (-43.17782-(56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 0 + (((tickAnim - 0) / 14) * (-38.28553-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -48.12231 + (((tickAnim - 14) / 6) * (9.8906-(-48.12231)));
            yy = -43.17782 + (((tickAnim - 14) / 6) * (-37.51718-(-43.17782)));
            zz = -38.28553 + (((tickAnim - 14) / 6) * (8.67909-(-38.28553)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 9.8906 + (((tickAnim - 20) / 23) * (0-(9.8906)));
            yy = -37.51718 + (((tickAnim - 20) / 23) * (59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-37.51718)));
            zz = 8.67909 + (((tickAnim - 20) / 23) * (0-(8.67909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -53.47031 + (((tickAnim - 0) / 14) * (-25.31881-(-53.47031)));
            yy = 10.63826 + (((tickAnim - 0) / 14) * (4.19382-(10.63826)));
            zz = 8.35963 + (((tickAnim - 0) / 14) * (7.97029-(8.35963)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -25.31881 + (((tickAnim - 14) / 6) * (-7.5-(-25.31881)));
            yy = 4.19382 + (((tickAnim - 14) / 6) * (0-(4.19382)));
            zz = 7.97029 + (((tickAnim - 14) / 6) * (0-(7.97029)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-15.05553-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (-5.43023-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-13.73472-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -15.05553 + (((tickAnim - 30) / 13) * (-53.47031-(-15.05553)));
            yy = -5.43023 + (((tickAnim - 30) / 13) * (10.63826-(-5.43023)));
            zz = -13.73472 + (((tickAnim - 30) / 13) * (8.35963-(-13.73472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 139.03566 + (((tickAnim - 0) / 14) * (136.76371-(139.03566)));
            yy = -5.79392 + (((tickAnim - 0) / 14) * (-9.55852-(-5.79392)));
            zz = -113.20003 + (((tickAnim - 0) / 14) * (-36.25469-(-113.20003)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 136.76371 + (((tickAnim - 14) / 6) * (-0.48438-(136.76371)));
            yy = -9.55852 + (((tickAnim - 14) / 6) * (2.19568-(-9.55852)));
            zz = -36.25469 + (((tickAnim - 14) / 6) * (-8.01444-(-36.25469)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -0.48438 + (((tickAnim - 20) / 8) * (46.22194-(-0.48438)));
            yy = 2.19568 + (((tickAnim - 20) / 8) * (-29.5441-(2.19568)));
            zz = -8.01444 + (((tickAnim - 20) / 8) * (-40.23219-(-8.01444)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 46.22194 + (((tickAnim - 28) / 2) * (65.03289-(46.22194)));
            yy = -29.5441 + (((tickAnim - 28) / 2) * (-33.54962-(-29.5441)));
            zz = -40.23219 + (((tickAnim - 28) / 2) * (-56.05458-(-40.23219)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 65.03289 + (((tickAnim - 30) / 13) * (139.03566-(65.03289)));
            yy = -33.54962 + (((tickAnim - 30) / 13) * (-5.79392-(-33.54962)));
            zz = -56.05458 + (((tickAnim - 30) / 13) * (-113.20003-(-56.05458)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 7.15622 + (((tickAnim - 0) / 16) * (-53.28758-(7.15622)));
            yy = 39.64972 + (((tickAnim - 0) / 16) * (3.20635-(39.64972)));
            zz = -5.26373 + (((tickAnim - 0) / 16) * (55.15508-(-5.26373)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -53.28758 + (((tickAnim - 16) / 12) * (-184.6598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(-53.28758)));
            yy = 3.20635 + (((tickAnim - 16) / 12) * (10.15343-(3.20635)));
            zz = 55.15508 + (((tickAnim - 16) / 12) * (177.1152-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(55.15508)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -184.6598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 28) / 5) * (-110.53176-(-184.6598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 10.15343 + (((tickAnim - 28) / 5) * (10.2814-(10.15343)));
            zz = 177.1152-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 28) / 5) * (102.38444-(177.1152-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -110.53176 + (((tickAnim - 33) / 4) * (-51.17537-(-110.53176)));
            yy = 10.2814 + (((tickAnim - 33) / 4) * (34.85704-(10.2814)));
            zz = 102.38444 + (((tickAnim - 33) / 4) * (44.15662-(102.38444)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -51.17537 + (((tickAnim - 37) / 6) * (7.15622-(-51.17537)));
            yy = 34.85704 + (((tickAnim - 37) / 6) * (39.64972-(34.85704)));
            zz = 44.15662 + (((tickAnim - 37) / 6) * (-5.26373-(44.15662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -3.25 + (((tickAnim - 0) / 8) * (21.59826-(-3.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (24.55268-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (19.40023-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 21.59826 + (((tickAnim - 8) / 8) * (42.38816-(21.59826)));
            yy = 24.55268 + (((tickAnim - 8) / 8) * (37.20836-(24.55268)));
            zz = 19.40023 + (((tickAnim - 8) / 8) * (52.02707-(19.40023)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 42.38816 + (((tickAnim - 16) / 12) * (141.91117-(42.38816)));
            yy = 37.20836 + (((tickAnim - 16) / 12) * (13.75524-(37.20836)));
            zz = 52.02707 + (((tickAnim - 16) / 12) * (108.89896-(52.02707)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 141.91117 + (((tickAnim - 28) / 10) * (156.58059-(141.91117)));
            yy = 13.75524 + (((tickAnim - 28) / 10) * (6.87762-(13.75524)));
            zz = 108.89896 + (((tickAnim - 28) / 10) * (54.44948-(108.89896)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 156.58059 + (((tickAnim - 38) / 5) * (-3.25-(156.58059)));
            yy = 6.87762 + (((tickAnim - 38) / 5) * (0-(6.87762)));
            zz = 54.44948 + (((tickAnim - 38) / 5) * (0-(54.44948)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.595-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 7) / 12) * (0-(0)));
            yy = -0.595 + (((tickAnim - 7) / 12) * (0-(-0.595)));
            zz = 0 + (((tickAnim - 7) / 12) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 19) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righthindfoot.rotationPointX = this.Righthindfoot.rotationPointX + (float)(xx);
        this.Righthindfoot.rotationPointY = this.Righthindfoot.rotationPointY - (float)(yy);
        this.Righthindfoot.rotationPointZ = this.Righthindfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0.25), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-10))*-3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-20))*0.9));


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-0.25), Bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+30))*-3), Bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0.25), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+30))*5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-15))*-1));


        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(-3.5), Tailbase.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*2), Tailbase.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(-2.5), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-50))*1.5), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-3));


        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(2.75), Tailmiddle.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-150))*1.8), Tailmiddle.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-5));


        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(3.5), Tailmiddleend.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-150))*2), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-5));


        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(-1), Tailend.rotateAngleY + (float) Math.toRadians(0.0575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-200))*4.5), Tailend.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-3));


        this.Hipslope.rotationPointX = this.Hipslope.rotationPointX + (float)(0);
        this.Hipslope.rotationPointY = this.Hipslope.rotationPointY - (float)(0);
        this.Hipslope.rotationPointZ = this.Hipslope.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-20-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -9.75 + (((tickAnim - 16) / 12) * (-36.14337-(-9.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (-16.44668-(0)));
            zz = -20 + (((tickAnim - 16) / 12) * (-20.69841-(-20)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -36.14337 + (((tickAnim - 28) / 9) * (-40.8798-(-36.14337)));
            yy = -16.44668 + (((tickAnim - 28) / 9) * (-7.04807-(-16.44668)));
            zz = -20.69841 + (((tickAnim - 28) / 9) * (-6.00578-(-20.69841)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -40.8798 + (((tickAnim - 37) / 6) * (0-(-40.8798)));
            yy = -7.04807 + (((tickAnim - 37) / 6) * (0-(-7.04807)));
            zz = -6.00578 + (((tickAnim - 37) / 6) * (0-(-6.00578)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Throatpouch, Throatpouch.rotateAngleX + (float) Math.toRadians(-0.25), Throatpouch.rotateAngleY + (float) Math.toRadians(0), Throatpouch.rotateAngleZ + (float) Math.toRadians(0));
        this.Throatpouch.rotationPointX = this.Throatpouch.rotationPointX + (float)(0);
        this.Throatpouch.rotationPointY = this.Throatpouch.rotationPointY - (float)(-0.125);
        this.Throatpouch.rotationPointZ = this.Throatpouch.rotationPointZ + (float)(0);
        this.Throatpouch.setScale((float)1,(float)(0.9375-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5))*-0.05),(float)1);


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-115))*0.5), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-10))*1), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-30))*1));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0), Bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-40))*-1.5), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(0), Bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-70))*-0.8), Bodyfront.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(-23.11032), Leftupperarm.rotateAngleY + (float) Math.toRadians(34.3548+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*1), Leftupperarm.rotateAngleZ + (float) Math.toRadians(-67.74593));
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(46.6548), Leftlowerarm.rotateAngleY + (float) Math.toRadians(8.20197), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(72.78624));
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(69.9364+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-30))*-2), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(-5.50272), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(0.05643));
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(-28.05714), Rightupperarm.rotateAngleY + (float) Math.toRadians(-32.305+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-1), Rightupperarm.rotateAngleZ + (float) Math.toRadians(63.71111));
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(46.75604), Rightlowerarm.rotateAngleY + (float) Math.toRadians(-4.74174), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(-70.07658));
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(69.9739+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-30))*2), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(7.74585), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(0.25498));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-80))*1), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(0), Tailbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-10))*4), Tailbase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(0), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-30))*5.5), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(0), Tailmiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-70))*6), Tailmiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(0), Tailmiddleend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-120))*9.5), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(0), Tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-150))*11), Tailend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(99.148+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*3), Leftthigh.rotateAngleY + (float) Math.toRadians(-46.36725), Leftthigh.rotateAngleZ + (float) Math.toRadians(14.26811));
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(-21.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-30))*5), Leftshin.rotateAngleY + (float) Math.toRadians(0), Leftshin.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(41.7502+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-70))*8), Lefthindfoot.rotateAngleY + (float) Math.toRadians(18.9738), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(-7.3199));
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(103.5221+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-3), Rightthigh.rotateAngleY + (float) Math.toRadians(46.62715), Rightthigh.rotateAngleZ + (float) Math.toRadians(-24.49475));
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(-11.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-30))*-5), Rightshin.rotateAngleY + (float) Math.toRadians(0), Rightshin.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(10.7502+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.0-70))*-9), Righthindfoot.rotateAngleY + (float) Math.toRadians(-18.97376), Righthindfoot.rotateAngleZ + (float) Math.toRadians(7.31989));


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-40))*5), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-20))*3));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0), Bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-80))*-7), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-80))*2));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(0), Bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-80))*-3), Bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*3));
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(-9.35362), Leftupperarm.rotateAngleY + (float) Math.toRadians(25.091+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-0.5), Leftupperarm.rotateAngleZ + (float) Math.toRadians(-54.4354));
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(46.6548+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*5), Leftlowerarm.rotateAngleY + (float) Math.toRadians(8.20197), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(72.78624));
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(69.9364+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*8), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(-5.50272), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(0.05643));
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(-9.35362), Rightupperarm.rotateAngleY + (float) Math.toRadians(-25.091+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-0.5), Rightupperarm.rotateAngleZ + (float) Math.toRadians(54.43544));
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(46.756+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-5), Rightlowerarm.rotateAngleY + (float) Math.toRadians(-4.74174), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(-70.07658));
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(69.9739+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*-8), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(7.74585), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(0.25498));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-80))*5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*2));
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(0), Tailbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-10))*6), Tailbase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(0), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*7.5), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(0), Tailmiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-70))*10), Tailmiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(0), Tailmiddleend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-120))*15), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(0), Tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-150))*20), Tailend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(117.9223+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*2), Leftthigh.rotateAngleY + (float) Math.toRadians(-57.59931), Leftthigh.rotateAngleZ + (float) Math.toRadians(26.11358));
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(-18.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*3), Leftshin.rotateAngleY + (float) Math.toRadians(0), Leftshin.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(64.5002+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-70))*7), Lefthindfoot.rotateAngleY + (float) Math.toRadians(18.9738), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(-7.3199));
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(126.2438+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-2), Rightthigh.rotateAngleY + (float) Math.toRadians(59.95795), Rightthigh.rotateAngleZ + (float) Math.toRadians(-25.75035));
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(-30.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-30))*-5), Rightshin.rotateAngleY + (float) Math.toRadians(0), Rightshin.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(64.5002+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-70))*-7), Righthindfoot.rotateAngleY + (float) Math.toRadians(-18.97376), Righthindfoot.rotateAngleZ + (float) Math.toRadians(7.31989));


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.75 + (((tickAnim - 6) / 7) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.225-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 6) / 7) * (0-(-0.225)));
            zz = -0.225 + (((tickAnim - 6) / 7) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.Bodymiddle.rotationPointX = this.Bodymiddle.rotationPointX + (float)(0);
        this.Bodymiddle.rotationPointY = this.Bodymiddle.rotationPointY - (float)(0);
        this.Bodymiddle.rotationPointZ = this.Bodymiddle.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.81853-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (10.6985-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-14.3755-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.81853 + (((tickAnim - 6) / 7) * (0-(-1.81853)));
            yy = 10.6985 + (((tickAnim - 6) / 7) * (0-(10.6985)));
            zz = -14.3755 + (((tickAnim - 6) / 7) * (0-(-14.3755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (14.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 6) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 14.5 + (((tickAnim - 6) / 7) * (0-(14.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.81853-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-10.6985-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (14.37552-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.81853 + (((tickAnim - 6) / 7) * (0-(-1.81853)));
            yy = -10.6985 + (((tickAnim - 6) / 7) * (0-(-10.6985)));
            zz = 14.37552 + (((tickAnim - 6) / 7) * (0-(14.37552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-14.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 6) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = -14.5 + (((tickAnim - 6) / 7) * (0-(-14.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-5.49813-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.14375-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-1.4931-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -5.49813 + (((tickAnim - 6) / 7) * (0-(-5.49813)));
            yy = -0.14375 + (((tickAnim - 6) / 7) * (0-(-0.14375)));
            zz = -1.4931 + (((tickAnim - 6) / 7) * (0-(-1.4931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-16.47497-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.50031-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-5.72827-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -16.47497 + (((tickAnim - 6) / 7) * (0-(-16.47497)));
            yy = -0.50031 + (((tickAnim - 6) / 7) * (0-(-0.50031)));
            zz = -5.72827 + (((tickAnim - 6) / 7) * (0-(-5.72827)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 34.75 + (((tickAnim - 6) / 3) * (-1.05-(34.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -1.05 + (((tickAnim - 9) / 4) * (0-(-1.05)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (12.75-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 12.75 + (((tickAnim - 6) / 7) * (0-(12.75)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-12.75-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -12.75 + (((tickAnim - 6) / 7) * (0-(-12.75)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1.75 + (((tickAnim - 6) / 7) * (0-(1.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(xx), Tailbase.rotateAngleY + (float) Math.toRadians(yy), Tailbase.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnthracosaurus entity = (EntityPrehistoricFloraAnthracosaurus) entitylivingbaseIn;
        int animCycle = 220;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 31) / 69) * (0-(0)));
            yy = 1.25 + (((tickAnim - 31) / 69) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 31) / 69) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 100) / 16) * (0-(0)));
            yy = 1.25 + (((tickAnim - 100) / 16) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 100) / 16) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 116) / 62) * (0-(0)));
            yy = 1.25 + (((tickAnim - 116) / 62) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 116) / 62) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 178) / 42) * (0-(0)));
            yy = 1.25 + (((tickAnim - 178) / 42) * (0-(1.25)));
            zz = 0 + (((tickAnim - 178) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-1.4-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 31) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 69) * (0-(0)));
            zz = -1.4 + (((tickAnim - 31) / 69) * (-1.4-(-1.4)));
        }
        else if (tickAnim >= 100 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 100) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 16) * (0-(0)));
            zz = -1.4 + (((tickAnim - 100) / 16) * (-1.525-(-1.4)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 116) / 62) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 62) * (0-(0)));
            zz = -1.525 + (((tickAnim - 116) / 62) * (-1.525-(-1.525)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 178) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 42) * (0-(0)));
            zz = -1.525 + (((tickAnim - 178) / 42) * (0-(-1.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0.03121-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (-2.7282-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-1.02207-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 100) {
            xx = 0.03121 + (((tickAnim - 31) / 69) * (0.03121-(0.03121)));
            yy = -2.7282 + (((tickAnim - 31) / 69) * (-2.7282-(-2.7282)));
            zz = -1.02207 + (((tickAnim - 31) / 69) * (-1.02207-(-1.02207)));
        }
        else if (tickAnim >= 100 && tickAnim < 116) {
            xx = 0.03121 + (((tickAnim - 100) / 16) * (0.0321-(0.03121)));
            yy = -2.7282 + (((tickAnim - 100) / 16) * (-3.47803-(-2.7282)));
            zz = -1.02207 + (((tickAnim - 100) / 16) * (-1.03848-(-1.02207)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0.0321 + (((tickAnim - 116) / 62) * (0.0321-(0.0321)));
            yy = -3.47803 + (((tickAnim - 116) / 62) * (-3.47803-(-3.47803)));
            zz = -1.03848 + (((tickAnim - 116) / 62) * (-1.03848-(-1.03848)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0.0321 + (((tickAnim - 178) / 42) * (0-(0.0321)));
            yy = -3.47803 + (((tickAnim - 178) / 42) * (0-(-3.47803)));
            zz = -1.03848 + (((tickAnim - 178) / 42) * (0-(-1.03848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-0.04925-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (-3.76565-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0.75145-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 100) {
            xx = -0.04925 + (((tickAnim - 31) / 69) * (-0.04925-(-0.04925)));
            yy = -3.76565 + (((tickAnim - 31) / 69) * (-3.76565-(-3.76565)));
            zz = 0.75145 + (((tickAnim - 31) / 69) * (0.75145-(0.75145)));
        }
        else if (tickAnim >= 100 && tickAnim < 116) {
            xx = -0.04925 + (((tickAnim - 100) / 16) * (-0.04853-(-0.04925)));
            yy = -3.76565 + (((tickAnim - 100) / 16) * (-4.26554-(-3.76565)));
            zz = 0.75145 + (((tickAnim - 100) / 16) * (0.74121-(0.75145)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = -0.04853 + (((tickAnim - 116) / 62) * (-0.04853-(-0.04853)));
            yy = -4.26554 + (((tickAnim - 116) / 62) * (-4.26554-(-4.26554)));
            zz = 0.74121 + (((tickAnim - 116) / 62) * (0.74121-(0.74121)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = -0.04853 + (((tickAnim - 178) / 42) * (0-(-0.04853)));
            yy = -4.26554 + (((tickAnim - 178) / 42) * (0-(-4.26554)));
            zz = 0.74121 + (((tickAnim - 178) / 42) * (0-(0.74121)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5.23325-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (17.36854-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.43225-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 5.23325 + (((tickAnim - 12) / 10) * (6.93785-(5.23325)));
            yy = 17.36854 + (((tickAnim - 12) / 10) * (-4.26659-(17.36854)));
            zz = -0.43225 + (((tickAnim - 12) / 10) * (17.89167-(-0.43225)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 6.93785 + (((tickAnim - 22) / 8) * (0.06011-(6.93785)));
            yy = -4.26659 + (((tickAnim - 22) / 8) * (-19.24948-(-4.26659)));
            zz = 17.89167 + (((tickAnim - 22) / 8) * (-1.0018-(17.89167)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 0.06011 + (((tickAnim - 30) / 69) * (0.06011-(0.06011)));
            yy = -19.24948 + (((tickAnim - 30) / 69) * (-19.24948-(-19.24948)));
            zz = -1.0018 + (((tickAnim - 30) / 69) * (-1.0018-(-1.0018)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 0.06011 + (((tickAnim - 99) / 17) * (0.06021-(0.06011)));
            yy = -19.24948 + (((tickAnim - 99) / 17) * (-10.99948-(-19.24948)));
            zz = -1.0018 + (((tickAnim - 99) / 17) * (-0.99315-(-1.0018)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0.06021 + (((tickAnim - 116) / 62) * (0.06021-(0.06021)));
            yy = -10.99948 + (((tickAnim - 116) / 62) * (-10.99948-(-10.99948)));
            zz = -0.99315 + (((tickAnim - 116) / 62) * (-0.99315-(-0.99315)));
        }
        else if (tickAnim >= 178 && tickAnim < 188) {
            xx = 0.06021 + (((tickAnim - 178) / 10) * (5.53454-(0.06021)));
            yy = -10.99948 + (((tickAnim - 178) / 10) * (12.5554-(-10.99948)));
            zz = -0.99315 + (((tickAnim - 178) / 10) * (9.54654-(-0.99315)));
        }
        else if (tickAnim >= 188 && tickAnim < 198) {
            xx = 5.53454 + (((tickAnim - 188) / 10) * (-3.49818-(5.53454)));
            yy = 12.5554 + (((tickAnim - 188) / 10) * (36.99821-(12.5554)));
            zz = 9.54654 + (((tickAnim - 188) / 10) * (-10.09625-(9.54654)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = -3.49818 + (((tickAnim - 198) / 22) * (0-(-3.49818)));
            yy = 36.99821 + (((tickAnim - 198) / 22) * (0-(36.99821)));
            zz = -10.09625 + (((tickAnim - 198) / 22) * (0-(-10.09625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (28.71891-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (13.32742-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (48.31389-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 28.71891 + (((tickAnim - 12) / 10) * (10.06502-(28.71891)));
            yy = 13.32742 + (((tickAnim - 12) / 10) * (9.67403-(13.32742)));
            zz = 48.31389 + (((tickAnim - 12) / 10) * (40.15664-(48.31389)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 10.06502 + (((tickAnim - 22) / 8) * (-4.43609-(10.06502)));
            yy = 9.67403 + (((tickAnim - 22) / 8) * (-0.98123-(9.67403)));
            zz = 40.15664 + (((tickAnim - 22) / 8) * (5.47946-(40.15664)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = -4.43609 + (((tickAnim - 30) / 69) * (-4.43609-(-4.43609)));
            yy = -0.98123 + (((tickAnim - 30) / 69) * (-0.98123-(-0.98123)));
            zz = 5.47946 + (((tickAnim - 30) / 69) * (5.47946-(5.47946)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = -4.43609 + (((tickAnim - 99) / 14) * (-4.43609-(-4.43609)));
            yy = -0.98123 + (((tickAnim - 99) / 14) * (-0.98123-(-0.98123)));
            zz = 5.47946 + (((tickAnim - 99) / 14) * (5.47946-(5.47946)));
        }
        else if (tickAnim >= 113 && tickAnim < 178) {
            xx = -4.43609 + (((tickAnim - 113) / 65) * (-4.43609-(-4.43609)));
            yy = -0.98123 + (((tickAnim - 113) / 65) * (-0.98123-(-0.98123)));
            zz = 5.47946 + (((tickAnim - 113) / 65) * (5.47946-(5.47946)));
        }
        else if (tickAnim >= 178 && tickAnim < 188) {
            xx = -4.43609 + (((tickAnim - 178) / 10) * (0.581-(-4.43609)));
            yy = -0.98123 + (((tickAnim - 178) / 10) * (21.35487-(-0.98123)));
            zz = 5.47946 + (((tickAnim - 178) / 10) * (40.25599-(5.47946)));
        }
        else if (tickAnim >= 188 && tickAnim < 198) {
            xx = 0.581 + (((tickAnim - 188) / 10) * (-15.48756-(0.581)));
            yy = 21.35487 + (((tickAnim - 188) / 10) * (2.3493-(21.35487)));
            zz = 40.25599 + (((tickAnim - 188) / 10) * (9.39494-(40.25599)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = -15.48756 + (((tickAnim - 198) / 22) * (0-(-15.48756)));
            yy = 2.3493 + (((tickAnim - 198) / 22) * (0-(2.3493)));
            zz = 9.39494 + (((tickAnim - 198) / 22) * (0-(9.39494)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (2.1662-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-38.28623-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-36.51275-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 2.1662 + (((tickAnim - 12) / 10) * (54.04706-(2.1662)));
            yy = -38.28623 + (((tickAnim - 12) / 10) * (-16.53178-(-38.28623)));
            zz = -36.51275 + (((tickAnim - 12) / 10) * (-42.58982-(-36.51275)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 54.04706 + (((tickAnim - 22) / 8) * (0-(54.04706)));
            yy = -16.53178 + (((tickAnim - 22) / 8) * (0-(-16.53178)));
            zz = -42.58982 + (((tickAnim - 22) / 8) * (-2.75-(-42.58982)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 30) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 69) * (0-(0)));
            zz = -2.75 + (((tickAnim - 30) / 69) * (-2.75-(-2.75)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = -2.75 + (((tickAnim - 99) / 14) * (-2.75-(-2.75)));
        }
        else if (tickAnim >= 113 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 113) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 65) * (0-(0)));
            zz = -2.75 + (((tickAnim - 113) / 65) * (-2.75-(-2.75)));
        }
        else if (tickAnim >= 178 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 178) / 10) * (61.17209-(0)));
            yy = 0 + (((tickAnim - 178) / 10) * (-3.78768-(0)));
            zz = -2.75 + (((tickAnim - 178) / 10) * (-52.83779-(-2.75)));
        }
        else if (tickAnim >= 188 && tickAnim < 198) {
            xx = 61.17209 + (((tickAnim - 188) / 10) * (22.20218-(61.17209)));
            yy = -3.78768 + (((tickAnim - 188) / 10) * (-1.21551-(-3.78768)));
            zz = -52.83779 + (((tickAnim - 188) / 10) * (-0.66604-(-52.83779)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = 22.20218 + (((tickAnim - 198) / 22) * (0-(22.20218)));
            yy = -1.21551 + (((tickAnim - 198) / 22) * (0-(-1.21551)));
            zz = -0.66604 + (((tickAnim - 198) / 22) * (0-(-0.66604)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14.03864-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-29.70252-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.85422-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 14.03864 + (((tickAnim - 30) / 69) * (14.03864-(14.03864)));
            yy = -29.70252 + (((tickAnim - 30) / 69) * (-29.70252-(-29.70252)));
            zz = -1.85422 + (((tickAnim - 30) / 69) * (-1.85422-(-1.85422)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 14.03864 + (((tickAnim - 99) / 17) * (17.9602-(14.03864)));
            yy = -29.70252 + (((tickAnim - 99) / 17) * (-12.83594-(-29.70252)));
            zz = -1.85422 + (((tickAnim - 99) / 17) * (-10.70128-(-1.85422)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 17.9602 + (((tickAnim - 116) / 7) * (11.54143-(17.9602)));
            yy = -12.83594 + (((tickAnim - 116) / 7) * (-3.39636-(-12.83594)));
            zz = -10.70128 + (((tickAnim - 116) / 7) * (1.30945-(-10.70128)));
        }
        else if (tickAnim >= 123 && tickAnim < 178) {
            xx = 11.54143 + (((tickAnim - 123) / 55) * (11.54143-(11.54143)));
            yy = -3.39636 + (((tickAnim - 123) / 55) * (-3.39636-(-3.39636)));
            zz = 1.30945 + (((tickAnim - 123) / 55) * (1.30945-(1.30945)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 11.54143 + (((tickAnim - 178) / 42) * (0-(11.54143)));
            yy = -3.39636 + (((tickAnim - 178) / 42) * (0-(-3.39636)));
            zz = 1.30945 + (((tickAnim - 178) / 42) * (0-(1.30945)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (18.73664-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-1.41581-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-14.35844-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 18.73664 + (((tickAnim - 30) / 69) * (18.73664-(18.73664)));
            yy = -1.41581 + (((tickAnim - 30) / 69) * (-1.41581-(-1.41581)));
            zz = -14.35844 + (((tickAnim - 30) / 69) * (-14.35844-(-14.35844)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 18.73664 + (((tickAnim - 99) / 17) * (12.71838-(18.73664)));
            yy = -1.41581 + (((tickAnim - 99) / 17) * (-5.66519-(-1.41581)));
            zz = -14.35844 + (((tickAnim - 99) / 17) * (-36.54447-(-14.35844)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 12.71838 + (((tickAnim - 116) / 7) * (12.39822-(12.71838)));
            yy = -5.66519 + (((tickAnim - 116) / 7) * (-0.65742-(-5.66519)));
            zz = -36.54447 + (((tickAnim - 116) / 7) * (-13.46785-(-36.54447)));
        }
        else if (tickAnim >= 123 && tickAnim < 178) {
            xx = 12.39822 + (((tickAnim - 123) / 55) * (12.39822-(12.39822)));
            yy = -0.65742 + (((tickAnim - 123) / 55) * (-0.65742-(-0.65742)));
            zz = -13.46785 + (((tickAnim - 123) / 55) * (-13.46785-(-13.46785)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 12.39822 + (((tickAnim - 178) / 42) * (0-(12.39822)));
            yy = -0.65742 + (((tickAnim - 178) / 42) * (0-(-0.65742)));
            zz = -13.46785 + (((tickAnim - 178) / 42) * (0-(-13.46785)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-23.58243-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-2.44622-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (12.22787-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = -23.58243 + (((tickAnim - 30) / 69) * (-23.58243-(-23.58243)));
            yy = -2.44622 + (((tickAnim - 30) / 69) * (-2.44622-(-2.44622)));
            zz = 12.22787 + (((tickAnim - 30) / 69) * (12.22787-(12.22787)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = -23.58243 + (((tickAnim - 99) / 17) * (20.56699-(-23.58243)));
            yy = -2.44622 + (((tickAnim - 99) / 17) * (-0.36915-(-2.44622)));
            zz = 12.22787 + (((tickAnim - 99) / 17) * (39.42044-(12.22787)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 20.56699 + (((tickAnim - 116) / 7) * (-23.58243-(20.56699)));
            yy = -0.36915 + (((tickAnim - 116) / 7) * (-2.44622-(-0.36915)));
            zz = 39.42044 + (((tickAnim - 116) / 7) * (12.22787-(39.42044)));
        }
        else if (tickAnim >= 123 && tickAnim < 178) {
            xx = -23.58243 + (((tickAnim - 123) / 55) * (-23.58243-(-23.58243)));
            yy = -2.44622 + (((tickAnim - 123) / 55) * (-2.44622-(-2.44622)));
            zz = 12.22787 + (((tickAnim - 123) / 55) * (12.22787-(12.22787)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = -23.58243 + (((tickAnim - 178) / 42) * (0-(-23.58243)));
            yy = -2.44622 + (((tickAnim - 178) / 42) * (0-(-2.44622)));
            zz = 12.22787 + (((tickAnim - 178) / 42) * (0-(12.22787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.00855-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-3.74085-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.26196-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = -7.00855 + (((tickAnim - 30) / 69) * (-7.00855-(-7.00855)));
            yy = -3.74085 + (((tickAnim - 30) / 69) * (-3.74085-(-3.74085)));
            zz = 0.26196 + (((tickAnim - 30) / 69) * (0.26196-(0.26196)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = -7.00855 + (((tickAnim - 99) / 17) * (-9.29583-(-7.00855)));
            yy = -3.74085 + (((tickAnim - 99) / 17) * (-6.96645-(-3.74085)));
            zz = 0.26196 + (((tickAnim - 99) / 17) * (0.66125-(0.26196)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = -9.29583 + (((tickAnim - 116) / 62) * (-9.29583-(-9.29583)));
            yy = -6.96645 + (((tickAnim - 116) / 62) * (-6.96645-(-6.96645)));
            zz = 0.66125 + (((tickAnim - 116) / 62) * (0.66125-(0.66125)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = -9.29583 + (((tickAnim - 178) / 42) * (0-(-9.29583)));
            yy = -6.96645 + (((tickAnim - 178) / 42) * (0-(-6.96645)));
            zz = 0.66125 + (((tickAnim - 178) / 42) * (0-(0.66125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4.289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-7.72856-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.57785-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 4.289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 30) / 1) * (4.289-(4.289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = -7.72856 + (((tickAnim - 30) / 1) * (-7.72856-(-7.72856)));
            zz = -0.57785 + (((tickAnim - 30) / 1) * (-0.57785-(-0.57785)));
        }
        else if (tickAnim >= 31 && tickAnim < 99) {
            xx = 4.289 + (((tickAnim - 31) / 68) * (4.28903-(4.289)));
            yy = -7.72856 + (((tickAnim - 31) / 68) * (-7.72856-(-7.72856)));
            zz = -0.57785 + (((tickAnim - 31) / 68) * (-0.57785-(-0.57785)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 4.28903 + (((tickAnim - 99) / 17) * (-0.1744+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-4-(4.28903)));
            yy = -7.72856 + (((tickAnim - 99) / 17) * (-10.72009-(-7.72856)));
            zz = -0.57785 + (((tickAnim - 99) / 17) * (-0.80609-(-0.57785)));
        }
        else if (tickAnim >= 116 && tickAnim < 117) {
            xx = -0.1744+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-4 + (((tickAnim - 116) / 1) * (0.0006-(-0.1744+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-4)));
            yy = -10.72009 + (((tickAnim - 116) / 1) * (-10.72009-(-10.72009)));
            zz = -0.80609 + (((tickAnim - 116) / 1) * (-0.80609-(-0.80609)));
        }
        else if (tickAnim >= 117 && tickAnim < 178) {
            xx = 0.0006 + (((tickAnim - 117) / 61) * (0.32563-(0.0006)));
            yy = -10.72009 + (((tickAnim - 117) / 61) * (-10.72009-(-10.72009)));
            zz = -0.80609 + (((tickAnim - 117) / 61) * (-0.80609-(-0.80609)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0.32563 + (((tickAnim - 178) / 42) * (0-(0.32563)));
            yy = -10.72009 + (((tickAnim - 178) / 42) * (0-(-10.72009)));
            zz = -0.80609 + (((tickAnim - 178) / 42) * (0-(-0.80609)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-3.50022-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0.5558-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-0.04114-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -3.50022 + (((tickAnim - 33) / 69) * (-3.50022-(-3.50022)));
            yy = 0.5558 + (((tickAnim - 33) / 69) * (0.5558-(0.5558)));
            zz = -0.04114 + (((tickAnim - 33) / 69) * (-0.04114-(-0.04114)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = -3.50022 + (((tickAnim - 102) / 14) * (-3.5008-(-3.50022)));
            yy = 0.5558 + (((tickAnim - 102) / 14) * (1.05411-(0.5558)));
            zz = -0.04114 + (((tickAnim - 102) / 14) * (-0.0823-(-0.04114)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = -3.5008 + (((tickAnim - 116) / 64) * (-3.5008-(-3.5008)));
            yy = 1.05411 + (((tickAnim - 116) / 64) * (1.05411-(1.05411)));
            zz = -0.0823 + (((tickAnim - 116) / 64) * (-0.0823-(-0.0823)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -3.5008 + (((tickAnim - 180) / 40) * (0-(-3.5008)));
            yy = 1.05411 + (((tickAnim - 180) / 40) * (0-(1.05411)));
            zz = -0.0823 + (((tickAnim - 180) / 40) * (0-(-0.0823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(xx), Tailbase.rotateAngleY + (float) Math.toRadians(yy), Tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-2.5129-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.70555-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (1.03184-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2.5129 + (((tickAnim - 33) / 69) * (-2.5129-(-2.5129)));
            yy = -0.70555 + (((tickAnim - 33) / 69) * (-0.70555-(-0.70555)));
            zz = 1.03184 + (((tickAnim - 33) / 69) * (1.03184-(1.03184)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = -2.5129 + (((tickAnim - 102) / 14) * (-2.51279-(-2.5129)));
            yy = -0.70555 + (((tickAnim - 102) / 14) * (-0.45579-(-0.70555)));
            zz = 1.03184 + (((tickAnim - 102) / 14) * (1.02088-(1.03184)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = -2.51279 + (((tickAnim - 116) / 64) * (-2.51279-(-2.51279)));
            yy = -0.45579 + (((tickAnim - 116) / 64) * (-0.45579-(-0.45579)));
            zz = 1.02088 + (((tickAnim - 116) / 64) * (1.02088-(1.02088)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -2.51279 + (((tickAnim - 180) / 40) * (0-(-2.51279)));
            yy = -0.45579 + (((tickAnim - 180) / 40) * (0-(-0.45579)));
            zz = 1.02088 + (((tickAnim - 180) / 40) * (0-(1.02088)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (2.73359-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.58314-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (1.72408-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 2.73359 + (((tickAnim - 33) / 69) * (2.73359-(2.73359)));
            yy = -0.58314 + (((tickAnim - 33) / 69) * (-0.58314-(-0.58314)));
            zz = 1.72408 + (((tickAnim - 33) / 69) * (1.72408-(1.72408)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 2.73359 + (((tickAnim - 102) / 14) * (2.73352-(2.73359)));
            yy = -0.58314 + (((tickAnim - 102) / 14) * (0.41572-(-0.58314)));
            zz = 1.72408 + (((tickAnim - 102) / 14) * (1.77178-(1.72408)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 2.73352 + (((tickAnim - 116) / 64) * (2.73352-(2.73352)));
            yy = 0.41572 + (((tickAnim - 116) / 64) * (0.41572-(0.41572)));
            zz = 1.77178 + (((tickAnim - 116) / 64) * (1.77178-(1.77178)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 2.73352 + (((tickAnim - 180) / 40) * (0-(2.73352)));
            yy = 0.41572 + (((tickAnim - 180) / 40) * (0-(0.41572)));
            zz = 1.77178 + (((tickAnim - 180) / 40) * (0-(1.77178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(xx), Tailmiddle.rotateAngleY + (float) Math.toRadians(yy), Tailmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (3.40474-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-1.98855-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (2.84757-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 3.40474 + (((tickAnim - 33) / 69) * (3.40474-(3.40474)));
            yy = -1.98855 + (((tickAnim - 33) / 69) * (-1.98855-(-1.98855)));
            zz = 2.84757 + (((tickAnim - 33) / 69) * (2.84757-(2.84757)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 3.40474 + (((tickAnim - 102) / 14) * (3.41316-(3.40474)));
            yy = -1.98855 + (((tickAnim - 102) / 14) * (-3.98203-(-1.98855)));
            zz = 2.84757 + (((tickAnim - 102) / 14) * (2.68595-(2.84757)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 3.41316 + (((tickAnim - 116) / 64) * (3.41316-(3.41316)));
            yy = -3.98203 + (((tickAnim - 116) / 64) * (-3.98203-(-3.98203)));
            zz = 2.68595 + (((tickAnim - 116) / 64) * (2.68595-(2.68595)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 3.41316 + (((tickAnim - 180) / 40) * (0-(3.41316)));
            yy = -3.98203 + (((tickAnim - 180) / 40) * (0-(-3.98203)));
            zz = 2.68595 + (((tickAnim - 180) / 40) * (0-(2.68595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), Tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-2.15069-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-4.21177-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (2.07942-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2.15069 + (((tickAnim - 33) / 69) * (-2.15069-(-2.15069)));
            yy = -4.21177 + (((tickAnim - 33) / 69) * (-4.21177-(-4.21177)));
            zz = 2.07942 + (((tickAnim - 33) / 69) * (2.07942-(2.07942)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = -2.15069 + (((tickAnim - 102) / 14) * (-2.15654-(-2.15069)));
            yy = -4.21177 + (((tickAnim - 102) / 14) * (-5.96053-(-4.21177)));
            zz = 2.07942 + (((tickAnim - 102) / 14) * (2.14544-(2.07942)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = -2.15654 + (((tickAnim - 116) / 64) * (-2.15654-(-2.15654)));
            yy = -5.96053 + (((tickAnim - 116) / 64) * (-5.96053-(-5.96053)));
            zz = 2.14544 + (((tickAnim - 116) / 64) * (2.14544-(2.14544)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -2.15654 + (((tickAnim - 180) / 40) * (0-(-2.15654)));
            yy = -5.96053 + (((tickAnim - 180) / 40) * (0-(-5.96053)));
            zz = 2.14544 + (((tickAnim - 180) / 40) * (0-(2.14544)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(xx), Tailend.rotateAngleY + (float) Math.toRadians(yy), Tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (24-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 30) / 69) * (0-(0)));
            yy = 24 + (((tickAnim - 30) / 69) * (24-(24)));
            zz = 0 + (((tickAnim - 30) / 69) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 99) / 17) * (0-(0)));
            yy = 24 + (((tickAnim - 99) / 17) * (26.75-(24)));
            zz = 0 + (((tickAnim - 99) / 17) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 116) / 62) * (0-(0)));
            yy = 26.75 + (((tickAnim - 116) / 62) * (26.75-(26.75)));
            zz = 0 + (((tickAnim - 116) / 62) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 178) / 42) * (0-(0)));
            yy = 26.75 + (((tickAnim - 178) / 42) * (0-(26.75)));
            zz = 0 + (((tickAnim - 178) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 0) / 220) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 220) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 0) / 220) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 220) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 84) {
            xx = 1 + (((tickAnim - 15) / 69) * (1-(1)));
            yy = 0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05 + (((tickAnim - 15) / 69) * (0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05-(0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05)));
            zz = 1 + (((tickAnim - 15) / 69) * (1-(1)));
        }
        else if (tickAnim >= 84 && tickAnim < 113) {
            xx = 1 + (((tickAnim - 84) / 29) * (1-(1)));
            yy = 0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05 + (((tickAnim - 84) / 29) * (1-(0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05)));
            zz = 1 + (((tickAnim - 84) / 29) * (1-(1)));
        }
        else if (tickAnim >= 113 && tickAnim < 123) {
            xx = 1 + (((tickAnim - 113) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 113) / 10) * (0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05-(1)));
            zz = 1 + (((tickAnim - 113) / 10) * (1-(1)));
        }
        else if (tickAnim >= 123 && tickAnim < 167) {
            xx = 1 + (((tickAnim - 123) / 44) * (1-(1)));
            yy = 0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05 + (((tickAnim - 123) / 44) * (0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05-(0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05)));
            zz = 1 + (((tickAnim - 123) / 44) * (1-(1)));
        }
        else if (tickAnim >= 167 && tickAnim < 178) {
            xx = 1 + (((tickAnim - 167) / 11) * (1-(1)));
            yy = 0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05 + (((tickAnim - 167) / 11) * (1-(0.9375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*170/0.8))*-0.05)));
            zz = 1 + (((tickAnim - 167) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Throatpouch.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-31.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-22.55103-(0)));
            yy = -31.25 + (((tickAnim - 20) / 8) * (18.32208-(-31.25)));
            zz = 0 + (((tickAnim - 20) / 8) * (9.68268-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -22.55103 + (((tickAnim - 28) / 5) * (0-(-22.55103)));
            yy = 18.32208 + (((tickAnim - 28) / 5) * (35-(18.32208)));
            zz = 9.68268 + (((tickAnim - 28) / 5) * (0-(9.68268)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            yy = 35 + (((tickAnim - 33) / 69) * (35-(35)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            yy = 35 + (((tickAnim - 102) / 14) * (33-(35)));
            zz = 0 + (((tickAnim - 102) / 14) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            yy = 33 + (((tickAnim - 116) / 64) * (33-(33)));
            zz = 0 + (((tickAnim - 116) / 64) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 180) / 9) * (-15.75-(0)));
            yy = 33 + (((tickAnim - 180) / 9) * (1.73381-(33)));
            zz = 0 + (((tickAnim - 180) / 9) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 198) {
            xx = -15.75 + (((tickAnim - 189) / 9) * (0-(-15.75)));
            yy = 1.73381 + (((tickAnim - 189) / 9) * (-26.69-(1.73381)));
            zz = 0 + (((tickAnim - 189) / 9) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            yy = -26.69 + (((tickAnim - 198) / 22) * (0-(-26.69)));
            zz = 0 + (((tickAnim - 198) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-32-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -32 + (((tickAnim - 20) / 8) * (-34.25-(-32)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -34.25 + (((tickAnim - 28) / 5) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 14) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 64) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 180) / 9) * (-33.6-(0)));
            yy = 0 + (((tickAnim - 180) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 9) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 198) {
            xx = -33.6 + (((tickAnim - 189) / 9) * (-4-(-33.6)));
            yy = 0 + (((tickAnim - 189) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 9) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = -4 + (((tickAnim - 198) / 22) * (0-(-4)));
            yy = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (52.36741-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (15.9705-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (44.387-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 52.36741 + (((tickAnim - 12) / 8) * (92.12278-(52.36741)));
            yy = 15.9705 + (((tickAnim - 12) / 8) * (17.15723-(15.9705)));
            zz = 44.387 + (((tickAnim - 12) / 8) * (80.07492-(44.387)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 92.12278 + (((tickAnim - 20) / 8) * (115.06139-(92.12278)));
            yy = 17.15723 + (((tickAnim - 20) / 8) * (8.57861-(17.15723)));
            zz = 80.07492 + (((tickAnim - 20) / 8) * (40.03746-(80.07492)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 115.06139 + (((tickAnim - 28) / 5) * (0-(115.06139)));
            yy = 8.57861 + (((tickAnim - 28) / 5) * (0-(8.57861)));
            zz = 40.03746 + (((tickAnim - 28) / 5) * (0-(40.03746)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 14) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 64) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 180) / 9) * (146.22553-(0)));
            yy = 0 + (((tickAnim - 180) / 9) * (12.92411-(0)));
            zz = 0 + (((tickAnim - 180) / 9) * (73.54551-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 198) {
            xx = 146.22553 + (((tickAnim - 189) / 9) * (4.25-(146.22553)));
            yy = 12.92411 + (((tickAnim - 189) / 9) * (0-(12.92411)));
            zz = 73.54551 + (((tickAnim - 189) / 9) * (0-(73.54551)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = 4.25 + (((tickAnim - 198) / 22) * (0-(4.25)));
            yy = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


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
