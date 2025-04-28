package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPliosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPliosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer basin_r1;
    private final AdvancedModelRenderer basin_r2;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Head;
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
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer Leftfrontflipper1;
    private final AdvancedModelRenderer Leftfrontflipper2;
    private final AdvancedModelRenderer Leftfrontflipper3;
    private final AdvancedModelRenderer Rightfrontflipper1;
    private final AdvancedModelRenderer Rightfrontflipper2;
    private final AdvancedModelRenderer Rightfrontflipper3;
    private final AdvancedModelRenderer Lefthindflipper1;
    private final AdvancedModelRenderer Lefthindflipper2;
    private final AdvancedModelRenderer Lefthindflipper3;
    private final AdvancedModelRenderer Righthindflipper1;
    private final AdvancedModelRenderer Righthindflipper2;
    private final AdvancedModelRenderer Righthindflipper3;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;

    private ModelAnimator animator;

    public ModelPliosaurus() {
        this.textureWidth = 200;
        this.textureHeight = 200;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.5F, 0.0F, 27.0F);


        this.basin_r1 = new AdvancedModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Hips.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0524F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 0, 53, -14.0F, -2.8F, -5.0F, 27, 17, 19, 0.0F, false));

        this.basin_r2 = new AdvancedModelRenderer(this);
        this.basin_r2.setRotationPoint(0.0F, -0.9F, 14.3F);
        this.Hips.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -0.1745F, 0.0F, 0.0F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 93, 53, -12.0F, 0.1075F, -22.1741F, 23, 3, 17, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.3F, -6.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.1484F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5135F, -29.1815F);
        this.Bodymiddle.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -16.5F, -0.9149F, -1.2563F, 32, 22, 30, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 3.2865F, -30.2815F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.2007F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 80, 77, -16.0F, -4.1791F, -12.1367F, 31, 21, 13, 0.0F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 92, 88, -16.0F, -4.1791F, 0.8633F, 31, 21, 1, -0.01F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 4.7135F, -13.3185F);
        this.Bodyfront.addChild(Neck1);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 0, 90, -12.0F, -8.0F, -7.0F, 23, 18, 8, 0.0F, false));
        this.Neck1.cubeList.add(new ModelBox(Neck1, 6, 96, -12.0F, -8.0F, 1.0F, 23, 18, 2, -0.01F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -1.8F, -7.0F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0436F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 95, 0, -10.0F, -6.0436F, -9.001F, 19, 17, 10, -0.001F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 103, 8, -10.0F, -6.0436F, 0.999F, 19, 17, 2, -0.01F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.0564F, -10.001F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0175F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 0, 121, -9.0F, -6.8947F, -7.0689F, 17, 16, 8, -0.01F, false));
        this.Neck3.cubeList.add(new ModelBox(Neck3, 7, 127, -9.0F, -6.8947F, 0.9311F, 17, 16, 2, -0.03F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -3.3F, -7.0F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.0436F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 106, 129, -8.0F, -2.8564F, -9.001F, 15, 9, 10, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 154, 0, -6.0F, 1.0436F, -18.001F, 11, 5, 10, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 120, 154, -4.0F, 3.0436F, -29.001F, 7, 3, 11, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 176, -2.5F, 4.0436F, -37.001F, 4, 2, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.0436F, -36.801F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1257F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 147, 176, -2.0F, -0.4261F, 0.0017F, 3, 2, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.2F, 5.4436F, -37.001F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.3927F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 26, 0.0F, -0.4F, 1.0F, 0, 2, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.2F, 5.4436F, -34.501F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.3927F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 26, 0.0F, 0.2518F, 0.2157F, 0, 2, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.8F, 5.9436F, -32.301F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1573F, -0.0008F, 0.3568F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 26, 1.38F, -1.2537F, -0.4918F, 0, 2, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.8F, 5.9436F, -29.001F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3319F, -0.0008F, 0.3568F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 3, 26, 1.3774F, -1.1785F, -2.2117F, 0, 2, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 3, 53, 0.1774F, -0.8785F, -0.2117F, 0, 3, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.8F, 5.9436F, -27.001F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.201F, -0.0008F, 0.3568F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 53, 0.1758F, -0.2792F, -0.2715F, 0, 3, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.8F, 5.9436F, -25.001F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0172F, -0.0008F, 0.3568F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 65, 0.1742F, -0.2136F, -0.2712F, 0, 3, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.8F, 5.9436F, -23.301F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1481F, -0.0008F, 0.3568F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 65, 0.1729F, -0.5428F, -0.2709F, 0, 3, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 63, 0.1729F, -1.0428F, 1.7291F, 0, 3, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 58, 0.1729F, -1.2428F, 3.7291F, 0, 3, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 53, 0.1729F, -1.5428F, 5.7291F, 0, 3, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 53, 0.1729F, -1.5428F, 7.7291F, 0, 3, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.8F, 5.9436F, -23.301F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1481F, 0.0008F, -0.3568F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 53, -0.1729F, -1.5428F, 7.7291F, 0, 3, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 53, -0.1729F, -1.5428F, 5.7291F, 0, 3, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 58, -0.1729F, -1.2428F, 3.7291F, 0, 3, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 63, -0.1729F, -1.0428F, 1.7291F, 0, 3, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 65, -0.1729F, -0.5428F, -0.2709F, 0, 3, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.8F, 5.9436F, -32.301F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1573F, 0.0008F, -0.3568F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 26, -1.38F, -1.2537F, -0.4918F, 0, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.8F, 5.9436F, -29.001F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3319F, 0.0008F, -0.3568F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 3, 26, -1.3774F, -1.1785F, -2.2117F, 0, 2, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 3, 53, -0.1774F, -0.8785F, -0.2117F, 0, 3, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.8F, 5.9436F, -27.001F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.201F, 0.0008F, -0.3568F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 53, -0.1758F, -0.2792F, -0.2715F, 0, 3, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.8F, 5.9436F, -25.001F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0172F, 0.0008F, -0.3568F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 3, 65, -0.1742F, -0.2136F, -0.2712F, 0, 3, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.2F, 5.4436F, -34.501F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, -0.3927F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 6, 26, 0.0F, 0.2518F, 0.2157F, 0, 2, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.2F, 5.4436F, -37.001F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, -0.3927F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 26, 0.0F, -0.4F, 1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 5.2436F, -36.801F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 26, -1.1F, -0.5F, 0.1F, 1, 2, 0, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 26, 0.5F, -0.3F, 0.1F, 1, 2, 0, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 26, -2.5F, -0.3F, 0.1F, 1, 2, 0, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 26, 0.5F, -0.3F, 0.1F, 1, 2, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.0436F, -18.001F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 163, 100, -3.0F, 0.0595F, -11.1802F, 5, 2, 12, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 6.8436F, -23.001F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 169, 89, -4.0F, -3.01F, -0.0531F, 7, 3, 6, -0.02F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 6.0436F, -29.001F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 128, 169, -4.0F, -3.0F, 0.0F, 7, 3, 6, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -2.8564F, -9.001F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 157, 61, -6.0F, 1.0007F, -4.9463F, 11, 3, 5, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.2436F, -17.701F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3927F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 155, 169, -6.0F, 0.8042F, 1.9875F, 11, 3, 3, -0.02F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.2436F, -17.701F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.5236F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 16, -5.0F, -0.1958F, -0.0125F, 9, 4, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.8564F, -9.001F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3054F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 163, 115, -5.0F, 0.0007F, -4.7463F, 9, 4, 5, -0.01F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 6.0436F, 0.999F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.0175F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 51, 129, -8.0F, 0.0F, -10.0F, 15, 6, 12, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 156, 74, -6.0F, 0.0F, -19.0F, 11, 5, 9, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 74, 53, -3.5F, 0.0F, -30.0F, 6, 4, 11, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 103, 165, -2.5F, 0.0F, -38.0F, 4, 3, 8, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 147, 139, -6.0F, -6.0F, -10.0F, 11, 7, 10, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 4.0F, -30.0F);
        this.Lowerjaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 100, 112, -2.5F, -3.0448F, -7.8268F, 4, 3, 8, -0.002F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.3F, 0.7F, -37.7F);
        this.Lowerjaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.2443F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 6, 0, 0.0F, -2.0F, -0.3F, 0, 2, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 5, 0.0F, -2.6F, 1.4F, 0, 2, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 53, 0.0F, -3.1F, 3.3F, 0, 3, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 4, 0.0F, -1.2F, 7.7F, 0, 3, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 16, 0.0F, -1.1F, 9.7F, 0, 3, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 0, 0.0F, -1.3F, 11.7F, 0, 3, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 4, 0.0F, -1.4F, 13.7F, 0, 3, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 20, 0, 0.0F, -1.5F, 15.7F, 0, 3, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 16, 0.0F, -1.2F, 17.7F, 0, 3, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 5, 4, 0.0F, -1.2F, 19.7F, 0, 3, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 3, 0, 0.0F, -1.2F, 21.7F, 0, 3, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.3F, 0.7F, -31.7F);
        this.Lowerjaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0436F, 0.0F, -0.2443F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 27, 16, 0.0F, -2.7F, -1.3F, 0, 3, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.3F, 0.7F, -31.3F);
        this.Lowerjaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1134F, 0.0F, -0.2443F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 0.0F, -2.2826F, -0.0996F, 0, 3, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.3F, 0.7F, -31.7F);
        this.Lowerjaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.2443F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 3, 0, 0.0F, -1.2F, 15.7F, 0, 3, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 5, 4, 0.0F, -1.2F, 13.7F, 0, 3, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 16, 0.0F, -1.2F, 11.7F, 0, 3, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 0, 0.0F, -1.5F, 9.7F, 0, 3, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 4, 0.0F, -1.4F, 7.7F, 0, 3, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 24, 0, 0.0F, -1.3F, 5.7F, 0, 3, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 24, 16, 0.0F, -1.1F, 3.7F, 0, 3, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 4, 0.0F, -1.2F, 1.7F, 0, 3, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 53, 0.0F, -3.1F, -2.7F, 0, 3, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 5, 0.0F, -2.6F, -4.6F, 0, 2, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 6, 0, 0.0F, -2.0F, -6.3F, 0, 2, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.3F, 0.7F, -31.3F);
        this.Lowerjaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1134F, 0.0F, 0.2443F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, 0.0F, -2.2826F, -0.0996F, 0, 3, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.3F, 0.7F, -31.7F);
        this.Lowerjaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0436F, 0.0F, 0.2443F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 27, 16, 0.0F, -2.7F, -1.3F, 0, 3, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.0F, 0.4F, -37.8F);
        this.Lowerjaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2618F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 12, 26, -0.8F, -1.4F, -0.1F, 1, 2, 0, 0.0F, true));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 12, 26, 0.8F, -1.4F, -0.1F, 1, 2, 0, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 4.0F, -30.0F);
        this.Lowerjaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0873F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 37, 164, -3.5F, -2.0F, 0.1F, 6, 2, 11, -0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 5.0F, -19.0F);
        this.Lowerjaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1047F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 154, 16, -6.0F, -1.0F, 0.2F, 11, 1, 9, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -1.0F, -9.9F);
        this.Lowerjaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1309F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 147, 129, -6.0F, 0.0F, -8.0F, 11, 1, 8, -0.01F, false));

        this.Leftfrontflipper1 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper1.setRotationPoint(15.0F, 10.8076F, -7.1998F);
        this.Bodyfront.addChild(Leftfrontflipper1);
        this.setRotateAngle(Leftfrontflipper1, -0.1188F, 0.0552F, 0.0F);
        this.Leftfrontflipper1.cubeList.add(new ModelBox(Leftfrontflipper1, 88, 149, -2.9913F, -0.0016F, -5.9194F, 11, 5, 10, 0.0F, false));

        this.Leftfrontflipper2 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper2.setRotationPoint(8.0F, 0.0F, -5.4F);
        this.Leftfrontflipper1.addChild(Leftfrontflipper2);
        this.setRotateAngle(Leftfrontflipper2, 0.0F, -0.1309F, 0.0F);
        this.Leftfrontflipper2.cubeList.add(new ModelBox(Leftfrontflipper2, 113, 112, -0.232F, 0.9984F, -0.6946F, 18, 3, 13, 0.0F, false));

        this.Leftfrontflipper3 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper3.setRotationPoint(16.2489F, 0.5F, 3.4266F);
        this.Leftfrontflipper2.addChild(Leftfrontflipper3);
        this.setRotateAngle(Leftfrontflipper3, 0.0F, -0.1309F, 0.0F);
        this.Leftfrontflipper3.cubeList.add(new ModelBox(Leftfrontflipper3, 157, 157, 1.0292F, 0.9984F, -3.5243F, 10, 2, 9, 0.0F, false));

        this.Rightfrontflipper1 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper1.setRotationPoint(-16.0F, 10.8076F, -7.1998F);
        this.Bodyfront.addChild(Rightfrontflipper1);
        this.setRotateAngle(Rightfrontflipper1, -0.1188F, -0.0552F, 0.0F);
        this.Rightfrontflipper1.cubeList.add(new ModelBox(Rightfrontflipper1, 88, 149, -8.0087F, -0.0016F, -5.9194F, 11, 5, 10, 0.0F, true));

        this.Rightfrontflipper2 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper2.setRotationPoint(-8.0F, 0.0F, -5.4F);
        this.Rightfrontflipper1.addChild(Rightfrontflipper2);
        this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.1309F, 0.0F);
        this.Rightfrontflipper2.cubeList.add(new ModelBox(Rightfrontflipper2, 113, 112, -17.768F, 0.9984F, -0.6946F, 18, 3, 13, 0.0F, true));

        this.Rightfrontflipper3 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper3.setRotationPoint(-16.2489F, 0.5F, 3.4266F);
        this.Rightfrontflipper2.addChild(Rightfrontflipper3);
        this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.1309F, 0.0F);
        this.Rightfrontflipper3.cubeList.add(new ModelBox(Rightfrontflipper3, 157, 157, -11.0292F, 0.9984F, -3.5243F, 10, 2, 9, 0.0F, true));

        this.Lefthindflipper1 = new AdvancedModelRenderer(this);
        this.Lefthindflipper1.setRotationPoint(13.0F, 11.1806F, 0.18F);
        this.Hips.addChild(Lefthindflipper1);
        this.Lefthindflipper1.cubeList.add(new ModelBox(Lefthindflipper1, 45, 148, -3.0F, -2.0F, -6.0F, 11, 5, 10, 0.0F, false));

        this.Lefthindflipper2 = new AdvancedModelRenderer(this);
        this.Lefthindflipper2.setRotationPoint(8.0F, 0.0F, -5.4F);
        this.Lefthindflipper1.addChild(Lefthindflipper2);
        this.setRotateAngle(Lefthindflipper2, 0.0F, -0.1309F, 0.0F);
        this.Lefthindflipper2.cubeList.add(new ModelBox(Lefthindflipper2, 50, 112, -0.2511F, -1.0F, -0.7734F, 18, 3, 13, 0.0F, false));

        this.Lefthindflipper3 = new AdvancedModelRenderer(this);
        this.Lefthindflipper3.setRotationPoint(16.2489F, 0.5F, 3.4266F);
        this.Lefthindflipper2.addChild(Lefthindflipper3);
        this.setRotateAngle(Lefthindflipper3, 0.0F, -0.1309F, 0.0F);
        this.Lefthindflipper3.cubeList.add(new ModelBox(Lefthindflipper3, 157, 49, 1.0F, -1.0F, -3.6F, 10, 2, 9, 0.0F, false));

        this.Righthindflipper1 = new AdvancedModelRenderer(this);
        this.Righthindflipper1.setRotationPoint(-14.0F, 11.1806F, 0.18F);
        this.Hips.addChild(Righthindflipper1);
        this.Righthindflipper1.cubeList.add(new ModelBox(Righthindflipper1, 45, 148, -8.0F, -2.0F, -6.0F, 11, 5, 10, 0.0F, true));

        this.Righthindflipper2 = new AdvancedModelRenderer(this);
        this.Righthindflipper2.setRotationPoint(-8.0F, 0.0F, -5.4F);
        this.Righthindflipper1.addChild(Righthindflipper2);
        this.setRotateAngle(Righthindflipper2, 0.0F, 0.1309F, 0.0F);
        this.Righthindflipper2.cubeList.add(new ModelBox(Righthindflipper2, 50, 112, -17.7489F, -1.0F, -0.7734F, 18, 3, 13, 0.0F, true));

        this.Righthindflipper3 = new AdvancedModelRenderer(this);
        this.Righthindflipper3.setRotationPoint(-16.2489F, 0.5F, 3.4266F);
        this.Righthindflipper2.addChild(Righthindflipper3);
        this.setRotateAngle(Righthindflipper3, 0.0F, 0.1309F, 0.0F);
        this.Righthindflipper3.cubeList.add(new ModelBox(Righthindflipper3, 157, 49, -11.0F, -1.0F, -3.6F, 10, 2, 9, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 1.6F, 9.0F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1309F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 146, -8.0F, -2.6526F, 3.9572F, 15, 9, 7, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 125, 28, -10.0F, -2.6526F, -3.0428F, 19, 13, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.6526F, 10.9572F);
        this.Tail1.addChild(Tail2);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0524F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 163, -7.0F, -2.0F, -1.0F, 13, 7, 5, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0873F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 72, 165, -5.0F, -2.0872F, -1.9962F, 9, 7, 6, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 4.9128F, -1.4962F);
        this.Tail3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.4363F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 63, 90, -1.0F, -4.0339F, -0.6521F, 1, 4, 6, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.0872F, 4.0038F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -3.0F, -2.0F, 0.0F, 5, 6, 9, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 6.9F, 5.3F);
        this.Tail4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.7505F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 63, 101, -1.0F, -4.9464F, -0.0122F, 1, 5, 5, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 7.2F, -0.7F);
        this.Tail4.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0349F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 53, -1.0F, -4.9594F, 0.0242F, 1, 5, 6, -0.001F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = 0.0F;
        this.Hips.offsetX = -0.4F;
        this.Hips.offsetZ = 2.0F;
        this.Hips.rotateAngleY = (float)Math.toRadians(120);
        this.Hips.rotateAngleX = (float)Math.toRadians(0);
        this.Hips.rotateAngleZ = (float)Math.toRadians(0);
        this.Hips.scaleChildren = true;
        float scaler = 0.4F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Tail3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Righthindflipper3, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Righthindflipper2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Righthindflipper1, -0.1643F, 0.1601F, -0.0355F);
        this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Rightfrontflipper1, -0.1468F, -0.0889F, -0.2161F);
        this.setRotateAngle(Neck3, -0.1306F, 0.0076F, -0.044F);
        this.setRotateAngle(Neck2, -0.1309F, 0.0F, -0.0873F);
        this.setRotateAngle(Neck1, -0.0436F, 0.0F, -0.0436F);
        this.setRotateAngle(Lowerjaw, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthindflipper3, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Lefthindflipper2, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Lefthindflipper1, -0.1643F, -0.1601F, 0.0355F);
        this.setRotateAngle(Leftfrontflipper3, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Leftfrontflipper2, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Leftfrontflipper1, -0.1468F, 0.0889F, 0.2161F);
        this.setRotateAngle(Head, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, -0.0436F, 0.0F, -0.0436F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
            resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPliosaurus ee = (EntityPrehistoricFloraPliosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPliosaurus entity = (EntityPrehistoricFloraPliosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-2.5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-2.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10 + (((tickAnim - 10) / 10) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10 + (((tickAnim - 10) / 10) * (0-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*7.5-(2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5))-(0));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*7.5 + (((tickAnim - 10) / 10) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*7.5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5) + (((tickAnim - 10) / 10) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 0) / 10) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10) + (((tickAnim - 10) / 3) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15 + (((tickAnim - 13) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10) + (((tickAnim - 13) / 7) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 0) / 10) * (22.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1-(22.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1 + (((tickAnim - 13) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));

    }




    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPliosaurus entity = (EntityPrehistoricFloraPliosaurus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*2), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-3));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5);
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2.5), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*3));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*-2), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-20))*3));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-3), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-0.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*0.5));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*2.5));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*5));
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*30), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*30), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*20));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*5), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*5), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*10));
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*5), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*5), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-30), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-20));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-40))*5), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*-5), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*-10));
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*5), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+110))*-5), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*-10));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*30), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*25), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*10));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*5), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*5), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*10));
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*5), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*5), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-210))*10));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*30), Righthindflipper1.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*-25), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-10));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*5), Righthindflipper2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*-5), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*-10));
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*5), Righthindflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*-5), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*-10));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*2.5), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-3));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-3));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPliosaurus entity = (EntityPrehistoricFloraPliosaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*3), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+80))*-3));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-1.5);
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-1), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+60))*2));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-0.5), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+50))*1));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-2.5), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*3));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*1.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-1));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*1.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-1));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-190))*-0.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-80))*1));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+260))*-20), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*20));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+290))*-5), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*10), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*15));
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+320))*-5), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*10), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*15));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+240))*-20), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+10))*-20));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-10), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15));
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+300))*-5), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*-10), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*-15));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+80))*20), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*15));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-5), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+110))*15), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-80))*10));
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*-5), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+140))*15), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-110))*10));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*-20), Righthindflipper1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100))*-20), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*-5), Righthindflipper2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+130))*-15), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*-10));
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5), Righthindflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+160))*-15), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*-10));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*2), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*-2));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*1.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-10))*-1));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-40))*4), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-40))*3), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-70))*-3));

    }

    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPliosaurus entity = (EntityPrehistoricFloraPliosaurus) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 120) {
            xx = -2.5 + (((tickAnim - 0) / 120) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = -8 + (((tickAnim - 0) / 120) * (-8-(-8)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 0) / 120) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 0) / 120) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 0) / 10) * (-2.5-(2.5)));
            yy = -5 + (((tickAnim - 0) / 10) * (-5-(-5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -2.5 + (((tickAnim - 10) / 6) * (0.13889-(-2.5)));
            yy = -5 + (((tickAnim - 10) / 6) * (-5-(-5)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.13889 + (((tickAnim - 16) / 2) * (-2.33413-(0.13889)));
            yy = -5 + (((tickAnim - 16) / 2) * (-5-(-5)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -2.33413 + (((tickAnim - 18) / 7) * (-2.33413-(-2.33413)));
            yy = -5 + (((tickAnim - 18) / 7) * (-5-(-5)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.33413 + (((tickAnim - 25) / 5) * (5.28236-(-2.33413)));
            yy = -5 + (((tickAnim - 25) / 5) * (-5-(-5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 5.28236 + (((tickAnim - 30) / 12) * (2.5-(5.28236)));
            yy = -5 + (((tickAnim - 30) / 12) * (-5-(-5)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 42) / 78) * (2.5-(2.5)));
            yy = -5 + (((tickAnim - 42) / 78) * (-5-(-5)));
            zz = 0 + (((tickAnim - 42) / 78) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 0) / 13) * (2.5-(5)));
            yy = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 13) / 5) * (0.07022-(2.5)));
            yy = 2.5 + (((tickAnim - 13) / 5) * (2.42978-(2.5)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0.07022 + (((tickAnim - 18) / 3) * (-7.34429-(0.07022)));
            yy = 2.42978 + (((tickAnim - 18) / 3) * (2.38764-(2.42978)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -7.34429 + (((tickAnim - 21) / 7) * (0.74706-(-7.34429)));
            yy = 2.38764 + (((tickAnim - 21) / 7) * (2.27326-(2.38764)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 0.74706 + (((tickAnim - 28) / 14) * (5-(0.74706)));
            yy = 2.27326 + (((tickAnim - 28) / 14) * (0-(2.27326)));
            zz = 0 + (((tickAnim - 28) / 14) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 120) {
            xx = 5 + (((tickAnim - 42) / 78) * (5-(5)));
            yy = 0 + (((tickAnim - 42) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 78) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -7.70325 + (((tickAnim - 0) / 14) * (-7.70325-(-7.70325)));
            yy = -12.36052 + (((tickAnim - 0) / 14) * (-12.36052-(-12.36052)));
            zz = 1.87683 + (((tickAnim - 0) / 14) * (1.87683-(1.87683)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -7.70325 + (((tickAnim - 14) / 4) * (-2.6355-(-7.70325)));
            yy = -12.36052 + (((tickAnim - 14) / 4) * (-8.24034-(-12.36052)));
            zz = 1.87683 + (((tickAnim - 14) / 4) * (1.25122-(1.87683)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -2.6355 + (((tickAnim - 18) / 6) * (-7.5-(-2.6355)));
            yy = -8.24034 + (((tickAnim - 18) / 6) * (0-(-8.24034)));
            zz = 1.25122 + (((tickAnim - 18) / 6) * (0-(1.25122)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -7.5 + (((tickAnim - 24) / 3) * (-5.01427-(-7.5)));
            yy = 0 + (((tickAnim - 24) / 3) * (1.96064-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (-0.2935-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -5.01427 + (((tickAnim - 27) / 3) * (-7.5333-(-5.01427)));
            yy = 1.96064 + (((tickAnim - 27) / 3) * (4.57482-(1.96064)));
            zz = -0.2935 + (((tickAnim - 27) / 3) * (-0.68482-(-0.2935)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -7.5333 + (((tickAnim - 30) / 12) * (-7.53199-(-7.5333)));
            yy = 4.57482 + (((tickAnim - 30) / 12) * (4.94494-(4.57482)));
            zz = -0.68482 + (((tickAnim - 30) / 12) * (-0.74089-(-0.68482)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -7.53199 + (((tickAnim - 42) / 6) * (-7.09721-(-7.53199)));
            yy = 4.94494 + (((tickAnim - 42) / 6) * (4.94494-(4.94494)));
            zz = -0.74089 + (((tickAnim - 42) / 6) * (-0.74089-(-0.74089)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = -7.09721 + (((tickAnim - 48) / 15) * (-7.53199-(-7.09721)));
            yy = 4.94494 + (((tickAnim - 48) / 15) * (4.94494-(4.94494)));
            zz = -0.74089 + (((tickAnim - 48) / 15) * (-0.74089-(-0.74089)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -7.53199 + (((tickAnim - 63) / 10) * (-12.62619-(-7.53199)));
            yy = 4.94494 + (((tickAnim - 63) / 10) * (-4.57306-(4.94494)));
            zz = -0.74089 + (((tickAnim - 63) / 10) * (0.69886-(-0.74089)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -12.62619 + (((tickAnim - 73) / 7) * (-7.70325-(-12.62619)));
            yy = -4.57306 + (((tickAnim - 73) / 7) * (-12.36052-(-4.57306)));
            zz = 0.69886 + (((tickAnim - 73) / 7) * (1.87683-(0.69886)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -7.70325 + (((tickAnim - 80) / 40) * (-7.70325-(-7.70325)));
            yy = -12.36052 + (((tickAnim - 80) / 40) * (-12.36052-(-12.36052)));
            zz = 1.87683 + (((tickAnim - 80) / 40) * (1.87683-(1.87683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (2.5-(0)));
            yy = -10 + (((tickAnim - 0) / 22) * (-10-(-10)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 2.5 + (((tickAnim - 22) / 4) * (-0.0753-(2.5)));
            yy = -10 + (((tickAnim - 22) / 4) * (-10-(-10)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -0.0753 + (((tickAnim - 26) / 3) * (-0.07343-(-0.0753)));
            yy = -10 + (((tickAnim - 26) / 3) * (-10-(-10)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -0.07343 + (((tickAnim - 29) / 2) * (-2.57249-(-0.07343)));
            yy = -10 + (((tickAnim - 29) / 2) * (-10-(-10)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -2.57249 + (((tickAnim - 31) / 1) * (-0.0559-(-2.57249)));
            yy = -10 + (((tickAnim - 31) / 1) * (-10-(-10)));
            zz = 0 + (((tickAnim - 31) / 1) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = -0.0559 + (((tickAnim - 32) / 10) * (0-(-0.0559)));
            yy = -10 + (((tickAnim - 32) / 10) * (2.41-(-10)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (-2.5-(0)));
            yy = 2.41 + (((tickAnim - 42) / 4) * (2.41-(2.41)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = -2.5 + (((tickAnim - 46) / 5) * (0-(-2.5)));
            yy = 2.41 + (((tickAnim - 46) / 5) * (2.41-(2.41)));
            zz = 0 + (((tickAnim - 46) / 5) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 51) / 6) * (0-(0)));
            yy = 2.41 + (((tickAnim - 51) / 6) * (4.91-(2.41)));
            zz = 0 + (((tickAnim - 51) / 6) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            yy = 4.91 + (((tickAnim - 57) / 6) * (2.41-(4.91)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 63) / 10) * (-7.5-(0)));
            yy = 2.41 + (((tickAnim - 63) / 10) * (-4.4155-(2.41)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 73) / 7) * (0-(-7.5)));
            yy = -4.4155 + (((tickAnim - 73) / 7) * (-10-(-4.4155)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = -10 + (((tickAnim - 80) / 40) * (-10-(-10)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (7.5-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 7.5 + (((tickAnim - 21) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0.75519 + (((tickAnim - 0) / 40) * (-0.13523-(0.75519)));
            yy = -12.9751 + (((tickAnim - 0) / 40) * (-14.89347-(-12.9751)));
            zz = 8.951 + (((tickAnim - 0) / 40) * (9.2947-(8.951)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = -0.13523 + (((tickAnim - 40) / 11) * (4.94888-(-0.13523)));
            yy = -14.89347 + (((tickAnim - 40) / 11) * (-16.64272-(-14.89347)));
            zz = 9.2947 + (((tickAnim - 40) / 11) * (-13.69979-(9.2947)));
        }
        else if (tickAnim >= 51 && tickAnim < 57) {
            xx = 4.94888 + (((tickAnim - 51) / 6) * (-0.13523-(4.94888)));
            yy = -16.64272 + (((tickAnim - 51) / 6) * (-14.89347-(-16.64272)));
            zz = -13.69979 + (((tickAnim - 51) / 6) * (9.2947-(-13.69979)));
        }
        else if (tickAnim >= 57 && tickAnim < 120) {
            xx = -0.13523 + (((tickAnim - 57) / 63) * (0.75519-(-0.13523)));
            yy = -14.89347 + (((tickAnim - 57) / 63) * (-12.9751-(-14.89347)));
            zz = 9.2947 + (((tickAnim - 57) / 63) * (8.951-(9.2947)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.55314-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-15.67014-(0)));
            zz = -2.5 + (((tickAnim - 0) / 40) * (-2.34892-(-2.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -1.55314 + (((tickAnim - 40) / 8) * (-1.71885-(-1.55314)));
            yy = -15.67014 + (((tickAnim - 40) / 8) * (-10.24258-(-15.67014)));
            zz = -2.34892 + (((tickAnim - 40) / 8) * (-0.13955-(-2.34892)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = -1.71885 + (((tickAnim - 48) / 4) * (0.17591-(-1.71885)));
            yy = -10.24258 + (((tickAnim - 48) / 4) * (-3.24318-(-10.24258)));
            zz = -0.13955 + (((tickAnim - 48) / 4) * (-5.07329-(-0.13955)));
        }
        else if (tickAnim >= 52 && tickAnim < 58) {
            xx = 0.17591 + (((tickAnim - 52) / 6) * (-1.55314-(0.17591)));
            yy = -3.24318 + (((tickAnim - 52) / 6) * (-15.67014-(-3.24318)));
            zz = -5.07329 + (((tickAnim - 52) / 6) * (-2.34892-(-5.07329)));
        }
        else if (tickAnim >= 58 && tickAnim < 120) {
            xx = -1.55314 + (((tickAnim - 58) / 62) * (0-(-1.55314)));
            yy = -15.67014 + (((tickAnim - 58) / 62) * (0-(-15.67014)));
            zz = -2.34892 + (((tickAnim - 58) / 62) * (-2.5-(-2.34892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 40) * (-5-(-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = -5 + (((tickAnim - 40) / 6) * (5.33-(-5)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 5.33 + (((tickAnim - 46) / 7) * (-15-(5.33)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = -15 + (((tickAnim - 53) / 5) * (-5-(-15)));
        }
        else if (tickAnim >= 58 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 58) / 62) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 62) * (0-(0)));
            zz = -5 + (((tickAnim - 58) / 62) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.13523 + (((tickAnim - 0) / 13) * (-0.13523-(-0.13523)));
            yy = 14.89347 + (((tickAnim - 0) / 13) * (14.89347-(14.89347)));
            zz = -9.2947 + (((tickAnim - 0) / 13) * (-9.2947-(-9.2947)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -0.13523 + (((tickAnim - 13) / 11) * (3.76046-(-0.13523)));
            yy = 14.89347 + (((tickAnim - 13) / 11) * (16.42888-(14.89347)));
            zz = -9.2947 + (((tickAnim - 13) / 11) * (8.56503-(-9.2947)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 3.76046 + (((tickAnim - 24) / 6) * (-0.13523-(3.76046)));
            yy = 16.42888 + (((tickAnim - 24) / 6) * (14.89347-(16.42888)));
            zz = 8.56503 + (((tickAnim - 24) / 6) * (-9.2947-(8.56503)));
        }
        else if (tickAnim >= 30 && tickAnim < 120) {
            xx = -0.13523 + (((tickAnim - 30) / 90) * (-0.13523-(-0.13523)));
            yy = 14.89347 + (((tickAnim - 30) / 90) * (14.89347-(14.89347)));
            zz = -9.2947 + (((tickAnim - 30) / 90) * (-9.2947-(-9.2947)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -1.55314 + (((tickAnim - 0) / 13) * (-1.55314-(-1.55314)));
            yy = 15.67014 + (((tickAnim - 0) / 13) * (15.67014-(15.67014)));
            zz = 2.34892 + (((tickAnim - 0) / 13) * (2.34892-(2.34892)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = -1.55314 + (((tickAnim - 13) / 9) * (-1.71885-(-1.55314)));
            yy = 15.67014 + (((tickAnim - 13) / 9) * (10.24258-(15.67014)));
            zz = 2.34892 + (((tickAnim - 13) / 9) * (0.13955-(2.34892)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -1.71885 + (((tickAnim - 22) / 3) * (1.5862-(-1.71885)));
            yy = 10.24258 + (((tickAnim - 22) / 3) * (8.16606-(10.24258)));
            zz = 0.13955 + (((tickAnim - 22) / 3) * (10.28262-(0.13955)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 1.5862 + (((tickAnim - 25) / 6) * (-1.55314-(1.5862)));
            yy = 8.16606 + (((tickAnim - 25) / 6) * (15.67014-(8.16606)));
            zz = 10.28262 + (((tickAnim - 25) / 6) * (2.34892-(10.28262)));
        }
        else if (tickAnim >= 31 && tickAnim < 120) {
            xx = -1.55314 + (((tickAnim - 31) / 89) * (-1.55314-(-1.55314)));
            yy = 15.67014 + (((tickAnim - 31) / 89) * (15.67014-(15.67014)));
            zz = 2.34892 + (((tickAnim - 31) / 89) * (2.34892-(2.34892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 16) * (5-(5)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 5 + (((tickAnim - 16) / 6) * (-5.33-(5)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = -5.33 + (((tickAnim - 22) / 6) * (15-(-5.33)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 15 + (((tickAnim - 28) / 6) * (5-(15)));
        }
        else if (tickAnim >= 34 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 34) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 86) * (0-(0)));
            zz = 5 + (((tickAnim - 34) / 86) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 0) / 69) * (0-(0)));
            yy = -27.5 + (((tickAnim - 0) / 69) * (-27.5-(-27.5)));
            zz = 12.5 + (((tickAnim - 0) / 69) * (12.5-(12.5)));
        }
        else if (tickAnim >= 69 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 69) / 14) * (6.42848-(0)));
            yy = -27.5 + (((tickAnim - 69) / 14) * (-26.79524-(-27.5)));
            zz = 12.5 + (((tickAnim - 69) / 14) * (-1.53271-(12.5)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 6.42848 + (((tickAnim - 83) / 7) * (0-(6.42848)));
            yy = -26.79524 + (((tickAnim - 83) / 7) * (-27.5-(-26.79524)));
            zz = -1.53271 + (((tickAnim - 83) / 7) * (12.5-(-1.53271)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = -27.5 + (((tickAnim - 90) / 30) * (-27.5-(-27.5)));
            zz = 12.5 + (((tickAnim - 90) / 30) * (12.5-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = -7.5 + (((tickAnim - 0) / 72) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 72 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 72) / 7) * (-0.36094-(0)));
            yy = 0 + (((tickAnim - 72) / 7) * (4.7605-(0)));
            zz = -7.5 + (((tickAnim - 72) / 7) * (-3.544-(-7.5)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = -0.36094 + (((tickAnim - 79) / 4) * (-0.19022-(-0.36094)));
            yy = 4.7605 + (((tickAnim - 79) / 4) * (7.39643-(4.7605)));
            zz = -3.544 + (((tickAnim - 79) / 4) * (-4.27202-(-3.544)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = -0.19022 + (((tickAnim - 83) / 5) * (0-(-0.19022)));
            yy = 7.39643 + (((tickAnim - 83) / 5) * (10-(7.39643)));
            zz = -4.27202 + (((tickAnim - 83) / 5) * (-15-(-4.27202)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 88) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 88) / 5) * (0-(10)));
            zz = -15 + (((tickAnim - 88) / 5) * (-7.5-(-15)));
        }
        else if (tickAnim >= 93 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 93) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 27) * (0-(0)));
            zz = -7.5 + (((tickAnim - 93) / 27) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 0) / 76) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 76) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 76) * (-5-(-5)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            zz = -5 + (((tickAnim - 76) / 7) * (5-(-5)));
        }
        else if (tickAnim >= 83 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 83) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 6) * (0-(0)));
            zz = 5 + (((tickAnim - 83) / 6) * (-10-(5)));
        }
        else if (tickAnim >= 89 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 89) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 89) / 8) * (0-(0)));
            zz = -10 + (((tickAnim - 89) / 8) * (-5-(-10)));
        }
        else if (tickAnim >= 97 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            zz = -5 + (((tickAnim - 97) / 23) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 25 + (((tickAnim - 0) / 47) * (27.5-(25)));
            zz = -12.5 + (((tickAnim - 0) / 47) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 47 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 47) / 14) * (6.42848-(0)));
            yy = 27.5 + (((tickAnim - 47) / 14) * (26.79524-(27.5)));
            zz = -12.5 + (((tickAnim - 47) / 14) * (1.53271-(-12.5)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 6.42848 + (((tickAnim - 61) / 7) * (0-(6.42848)));
            yy = 26.79524 + (((tickAnim - 61) / 7) * (27.5-(26.79524)));
            zz = 1.53271 + (((tickAnim - 61) / 7) * (-12.5-(1.53271)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 27.5 + (((tickAnim - 68) / 52) * (25-(27.5)));
            zz = -12.5 + (((tickAnim - 68) / 52) * (-12.5-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 7.5 + (((tickAnim - 0) / 47) * (7.5-(7.5)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 47) / 7) * (-0.36094-(0)));
            yy = 0 + (((tickAnim - 47) / 7) * (-4.7605-(0)));
            zz = 7.5 + (((tickAnim - 47) / 7) * (3.544-(7.5)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = -0.36094 + (((tickAnim - 54) / 4) * (-0.19022-(-0.36094)));
            yy = -4.7605 + (((tickAnim - 54) / 4) * (-7.39643-(-4.7605)));
            zz = 3.544 + (((tickAnim - 54) / 4) * (4.27202-(3.544)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -0.19022 + (((tickAnim - 58) / 5) * (0-(-0.19022)));
            yy = -7.39643 + (((tickAnim - 58) / 5) * (-10-(-7.39643)));
            zz = 4.27202 + (((tickAnim - 58) / 5) * (15-(4.27202)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 63) / 5) * (0-(-10)));
            zz = 15 + (((tickAnim - 63) / 5) * (7.5-(15)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 7.5 + (((tickAnim - 68) / 52) * (7.5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 2.5 + (((tickAnim - 0) / 47) * (5-(2.5)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 5 + (((tickAnim - 47) / 6) * (-5-(5)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = -5 + (((tickAnim - 53) / 7) * (10-(-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 10 + (((tickAnim - 60) / 8) * (5-(10)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 5 + (((tickAnim - 68) / 52) * (2.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper3.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = -15 + (((tickAnim - 0) / 120) * (-15-(-15)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = -10 + (((tickAnim - 0) / 120) * (-10-(-10)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 17.48072 + (((tickAnim - 0) / 120) * (17.48072-(17.48072)));
            yy = 0.95645 + (((tickAnim - 0) / 120) * (0.95645-(0.95645)));
            zz = -2.30991 + (((tickAnim - 0) / 120) * (-2.30991-(-2.30991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = -12.5 + (((tickAnim - 0) / 120) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = -25 + (((tickAnim - 0) / 120) * (-25-(-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, Neck1);
        this.faceTarget(f3, f4, 5, Neck2);
        this.faceTarget(f3, f4, 5, Neck3);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        EntityPrehistoricFloraPliosaurus ee = (EntityPrehistoricFloraPliosaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

