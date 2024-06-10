package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDracopelta;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDracopelta extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer Eye;

    private ModelAnimator animator;

    public ModelDracopelta() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.05F, 10.8286F, 6.5828F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.5032F, -5.2152F, -2.7184F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1151F, 0.0074F, -0.4363F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 56, 0.0F, -0.75F, 4.25F, 0, 3, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 56, 0.0F, -1.0F, 0.5F, 0, 3, 3, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 52, 0.0F, -0.5F, -3.5F, 0, 3, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-8.55F, -2.3571F, -6.6691F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0183F, 0.3054F, 0.0055F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, -2.25F, -0.25F, 7.1F, 2, 0, 3, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 69, 0, -2.75F, -0.25F, 3.1F, 4, 0, 3, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 29, -3.25F, 0.0F, -0.7F, 6, 0, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(8.45F, -2.3571F, -6.6691F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0183F, -0.3054F, -0.0055F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 22, 0.25F, -0.25F, 7.1F, 2, 0, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 69, 0, -1.25F, -0.25F, 3.1F, 4, 0, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 41, 29, -2.75F, 0.0F, -0.7F, 6, 0, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.4032F, -5.2152F, -2.7184F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1151F, -0.0074F, 0.4363F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 52, 0.0F, -0.5F, -3.5F, 0, 3, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 56, 0.0F, -0.75F, 4.25F, 0, 3, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 56, 0.0F, -1.0F, 0.5F, 0, 3, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.55F, -3.1786F, -2.5828F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 22, -6.5F, -1.25F, -5.6F, 14, 3, 12, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -5.95F, -1.0F, -5.1F, 13, 10, 11, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(5.55F, 0.7314F, -0.31F);
        this.main.addChild(legleft);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.4599F, -0.2728F);
        this.legleft.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 56, -2.0F, -1.0F, -2.0F, 3, 9, 5, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, 5.3733F, -4.0261F);
        this.legleft.addChild(legleft2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 3.2046F, 0.6319F);
        this.legleft2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 67, 29, -2.0F, -3.5F, -0.5F, 3, 6, 3, -0.001F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 5.2046F, 1.8819F);
        this.legleft2.addChild(legleft3);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 71, -1.5F, 0.0F, -2.25F, 3, 2, 3, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-5.65F, 0.7314F, -0.31F);
        this.main.addChild(legright);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.4599F, -0.2728F);
        this.legright.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 56, -1.0F, -1.0F, -2.0F, 3, 9, 5, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, 5.3733F, -4.0261F);
        this.legright.addChild(legright2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 3.2046F, 0.6319F);
        this.legright2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 29, -1.0F, -3.5F, -0.5F, 3, 6, 3, -0.001F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 5.2046F, 1.8819F);
        this.legright2.addChild(legright3);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 71, -1.5F, 0.0F, -2.25F, 3, 2, 3, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -1.9988F, 3.118F);
        this.main.addChild(Tail1);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.1F, 0.1522F, 2.7654F);
        this.Tail1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 77, -1.35F, -1.35F, 2.25F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 77, -1.35F, -1.35F, 0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 77, -1.35F, -1.35F, -0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 27, -1.35F, -1.35F, -2.25F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 75, 77, -3.75F, -1.35F, -2.25F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 77, -3.75F, -1.35F, -0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 77, -3.75F, -1.35F, 0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 53, -3.75F, -1.35F, 2.25F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 27, 0.45F, -1.35F, -2.25F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 77, 0.45F, -1.35F, -0.75F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 77, 0.45F, -1.35F, 0.75F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 77, 0.45F, -1.35F, 2.25F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 77, 2.85F, -1.35F, 0.75F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 53, 2.85F, -1.35F, 2.25F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 77, 2.85F, -1.35F, -0.75F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 75, 77, 2.85F, -1.35F, -2.25F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 15, -3.9F, -1.0F, -3.5F, 8, 6, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.6587F, -1.4765F, 1.5458F);
        this.Tail1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4964F, -0.147F, -0.3655F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 56, 73, 0.35F, -1.25F, 2.25F, 0, 2, 2, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 61, 73, 0.35F, -1.0F, -0.75F, 0, 2, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-5.1F, -0.0391F, 2.3034F);
        this.Tail1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4152F, 0.3215F, -0.1384F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 29, -1.25F, 0.0F, 2.0F, 2, 0, 2, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 73, -0.25F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(5.0F, -0.0391F, 2.3034F);
        this.Tail1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4152F, -0.3215F, 0.1384F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 57, 29, -0.75F, 0.0F, 2.0F, 2, 0, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 73, -1.75F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.5587F, -1.4765F, 1.5458F);
        this.Tail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4964F, 0.147F, 0.3655F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 73, -0.35F, -1.25F, 2.25F, 0, 2, 2, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 61, 73, -0.35F, -1.0F, -0.75F, 0, 2, 2, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 3.1023F, 4.8111F);
        this.Tail1.addChild(Tail2);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.35F, -1.248F, 4.2848F);
        this.Tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3054F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 51, 76, -0.5F, -0.2F, -2.75F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 76, -0.5F, -0.2F, -1.25F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 76, -0.5F, -0.2F, 0.25F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 76, -0.5F, -0.2F, 1.75F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 51, 76, 4.1F, -0.2F, -2.75F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 76, 2.5F, -0.2F, -2.4F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 76, 1.1F, -0.2F, -2.4F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 76, 1.1F, -0.2F, -0.45F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 76, 1.1F, -0.2F, 1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 76, 2.5F, -0.2F, -0.45F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 76, 2.5F, -0.2F, 1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 76, 4.1F, -0.2F, -1.25F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 76, 4.1F, -0.2F, 0.25F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 76, 4.1F, -0.2F, 1.75F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.5499F, -0.7861F, 3.4982F);
        this.Tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3655F, -0.147F, -0.3655F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 56, 1.4F, -1.525F, 1.0F, 0, 2, 2, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 60, 1.4F, -1.275F, -2.0F, 0, 2, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-5.1F, -3.1414F, -2.5077F);
        this.Tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4152F, 0.3215F, -0.1384F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 72, 47, -2.25F, 0.0F, 8.0F, 2, 0, 2, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 72, 67, -1.25F, 0.0F, 5.0F, 2, 0, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(5.0F, -3.1414F, -2.5077F);
        this.Tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4152F, -0.3215F, 0.1384F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 72, 47, 0.25F, 0.0F, 8.0F, 2, 0, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 72, 67, -0.75F, 0.0F, 5.0F, 2, 0, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.9501F, -2.0457F);
        this.Tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 49, 0, -3.0F, -0.25F, 2.5F, 6, 5, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.4499F, -0.7861F, 3.4982F);
        this.Tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3655F, 0.147F, 0.3655F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 60, -1.4F, -1.275F, -2.0F, 0, 2, 2, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 56, -1.4F, -1.525F, 1.0F, 0, 2, 2, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0048F, 0.9948F, 6.4549F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0864F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5548F, -0.4593F, 3.3807F);
        this.Tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 62, 32, -0.5F, -0.5F, -2.75F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 76, -0.5F, -0.5F, -1.25F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 31, 76, -0.5F, -0.5F, 0.25F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 21, 76, -0.5F, -0.5F, 1.75F, 1, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.4144F, -0.1299F, 3.395F);
        this.Tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0594F, -0.0163F, -0.3733F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 75, 0.75F, -0.875F, 0.5F, 0, 1, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.4144F, -0.1299F, 3.395F);
        this.Tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0594F, -0.0163F, -0.3733F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 76, 5, 0.95F, -1.125F, -2.5F, 0, 1, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.8971F, 0.9147F, 3.2317F);
        this.Tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0661F, 0.3215F, -0.1384F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 60, 56, -1.5F, -1.0F, 0.5F, 2, 0, 2, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 69, 4, -0.5F, -1.0F, -2.5F, 2, 0, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.3048F, -0.1299F, 3.395F);
        this.Tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0594F, 0.0163F, 0.3733F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 76, 5, -0.95F, -1.125F, -2.5F, 0, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.7875F, 0.9147F, 3.2317F);
        this.Tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0661F, -0.3215F, 0.1384F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 69, 4, -1.5F, -1.0F, -2.5F, 2, 0, 2, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 60, 56, -0.5F, -1.0F, 0.5F, 2, 0, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.0057F, 2.0516F, 4.5192F);
        this.Tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 52, -2.0F, -2.75F, -5.0F, 4, 3, 7, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.3048F, -0.1299F, 3.395F);
        this.Tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0594F, 0.0163F, 0.3733F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 11, 75, -0.75F, -0.875F, 0.5F, 0, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.4452F, -0.4593F, 3.3807F);
        this.Tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 31, 76, -0.5F, -0.5F, 0.25F, 1, 1, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 21, 76, -0.5F, -0.5F, 1.75F, 1, 1, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 76, -0.5F, -0.5F, -1.25F, 1, 1, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 62, 32, -0.5F, -0.5F, -2.75F, 1, 1, 1, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(-0.0057F, 0.5956F, 6.2101F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0873F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.8175F, -1.0033F, 3.2095F);
        this.Tail4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0594F, -0.0163F, -0.3733F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 76, 9, 0.3F, -0.175F, 0.5F, 0, 1, 2, 0.0F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 5, 7, 0.3F, -0.225F, -2.5F, 0, 1, 2, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.8914F, 0.3191F, -2.9784F);
        this.Tail4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0661F, 0.3215F, -0.1384F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 74, -2.25F, -1.0F, 6.75F, 1, 0, 2, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 74, 50, -1.25F, -1.0F, 3.75F, 1, 0, 2, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.7931F, 0.3191F, -2.9784F);
        this.Tail4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0661F, -0.3215F, 0.1384F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 74, 50, 0.25F, -1.0F, 3.75F, 1, 0, 2, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 66, 74, 1.25F, -1.0F, 6.75F, 1, 0, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.3031F, -1.8114F);
        this.Tail4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0436F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 17, 58, -1.0F, -2.25F, 1.25F, 2, 2, 7, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.7192F, -1.0033F, 3.2095F);
        this.Tail4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0594F, 0.0163F, 0.3733F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 76, 9, -0.3F, -0.175F, 0.5F, 0, 1, 2, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 5, 7, -0.3F, -0.225F, -2.5F, 0, 1, 2, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.3822F, 6.2305F);
        this.Tail4.addChild(Tail5);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.9209F, -8.0419F);
        this.Tail5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0436F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 30, 52, -0.5F, -1.75F, 7.75F, 1, 1, 11, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.7541F, -0.622F, 2.8457F);
        this.Tail5.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0634F, 0.1473F, -0.1268F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 4, 0, -3.0F, 0.5F, 3.5F, 1, 0, 2, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 43, 65, -2.5F, 0.5F, 0.5F, 1, 0, 2, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 25, 74, -2.0F, 0.5F, -2.5F, 1, 0, 2, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.8523F, -0.622F, 2.8457F);
        this.Tail5.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0634F, -0.1473F, 0.1268F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 4, 0, 2.0F, 0.5F, 3.5F, 1, 0, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 25, 74, 1.0F, 0.5F, -2.5F, 1, 0, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 43, 65, 1.5F, 0.5F, 0.5F, 1, 0, 2, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -3.2404F, -7.1504F);
        this.main.addChild(Body);
        this.setRotateAngle(Body, -0.2182F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.1F, 4.4942F, -5.2484F);
        this.Body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3927F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 60, 78, -1.95F, -3.25F, -1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 19, 79, -5.25F, -3.25F, -1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 14, 79, -4.25F, -3.25F, 0.25F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 35, 79, -5.25F, -3.25F, 1.4F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 9, 79, -4.25F, -3.25F, 2.65F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 30, 79, -1.95F, -3.25F, 1.4F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 55, 78, -1.95F, -3.25F, 4.0F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 79, 4, -5.25F, -3.25F, 4.0F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 60, 78, 1.05F, -3.25F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 30, 79, 1.05F, -3.25F, 1.4F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 55, 78, 1.05F, -3.25F, 4.0F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 35, 79, 4.35F, -3.25F, 1.4F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 9, 79, 3.35F, -3.25F, 2.65F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 79, 4, 4.35F, -3.25F, 4.0F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 14, 79, 3.35F, -3.25F, 0.25F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 19, 79, 4.35F, -3.25F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 38, -5.9F, -2.75F, -1.75F, 12, 9, 8, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-2.1F, 0.1687F, -4.6048F);
        this.Body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2382F, 0.1096F, -0.4232F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 0, -0.75F, -3.65F, 1.5F, 0, 5, 3, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 38, -0.75F, -1.9F, -2.0F, 0, 3, 3, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.1F, 4.4942F, -5.2484F);
        this.Body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.4003F, 0.2083F, 0.0627F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 60, 52, -10.75F, -1.25F, 0.75F, 5, 0, 3, 0.0F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 67, 39, -9.75F, -1.25F, -2.75F, 5, 0, 3, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 4.4942F, -5.2484F);
        this.Body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4003F, -0.2083F, -0.0627F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 60, 52, 5.75F, -1.25F, 0.75F, 5, 0, 3, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 67, 39, 4.75F, -1.25F, -2.75F, 5, 0, 3, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(2.0F, 0.1687F, -4.6048F);
        this.Body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2382F, -0.1096F, 0.4232F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, 0.75F, -3.65F, 1.5F, 0, 5, 3, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 38, 0.75F, -1.9F, -2.0F, 0, 3, 3, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(-0.1F, 3.7518F, -6.4201F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1309F, 0.0F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.1F, 0.7425F, 1.1717F);
        this.Chest.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3054F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 79, 79, -4.5F, -3.0F, -4.75F, 1, 1, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 50, 79, -4.5F, -3.0F, -3.25F, 1, 1, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 45, 79, -1.5F, -3.0F, -4.75F, 1, 1, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 40, 79, -1.5F, -3.0F, -3.25F, 1, 1, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 41, 38, -5.1F, -2.5F, -5.25F, 10, 8, 5, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 45, 79, 0.4F, -3.0F, -4.75F, 1, 1, 1, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 40, 79, 0.4F, -3.0F, -3.25F, 1, 1, 1, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 50, 79, 3.4F, -3.0F, -3.25F, 1, 1, 1, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 79, 79, 3.4F, -3.0F, -4.75F, 1, 1, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.1F, 0.7425F, 1.1717F);
        this.Chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1666F, 0.0522F, -0.3011F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 27, 68, -1.5F, -5.0F, -2.75F, 0, 3, 2, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 33, 41, -1.5F, -4.0F, -5.25F, 0, 2, 2, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.1F, 0.7425F, 1.1717F);
        this.Chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.3062F, 0.1304F, 0.0115F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 69, 70, -7.75F, -1.5F, -5.7F, 4, 0, 3, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.7425F, 1.1717F);
        this.Chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.3062F, -0.1304F, -0.0115F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 69, 70, 3.75F, -1.5F, -5.7F, 4, 0, 3, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.7425F, 1.1717F);
        this.Chest.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1666F, -0.0522F, 0.3011F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 27, 68, 1.5F, -5.0F, -2.75F, 0, 3, 2, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 33, 41, 1.5F, -4.0F, -5.25F, 0, 2, 2, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(5.05F, 5.873F, 0.0494F);
        this.Chest.addChild(armleft);
        this.setRotateAngle(armleft, -0.169F, 0.3477F, 0.0317F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -0.4129F, 0.9383F);
        this.armleft.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.829F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 32, 65, -1.5F, -2.0F, -3.0F, 3, 6, 4, 0.0F, false));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.0F, 1.9962F, 3.3321F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.2618F, 0.0F, 0.0F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -2.4091F, -2.3938F);
        this.armleft2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.0873F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 14, 68, -1.5F, 2.0F, 0.5F, 3, 4, 3, -0.001F, false));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.0F, 3.5909F, -1.1438F);
        this.armleft2.addChild(armleft3);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 73, 21, -1.5F, 0.0F, -1.75F, 3, 2, 3, 0.0F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-4.95F, 5.873F, 0.0494F);
        this.Chest.addChild(armright);
        this.setRotateAngle(armright, -0.169F, -0.3477F, -0.0317F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -0.4129F, 0.9383F);
        this.armright.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.829F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 32, 65, -1.5F, -2.0F, -3.0F, 3, 6, 4, 0.0F, true));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.0F, 1.9962F, 3.3321F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.2618F, 0.0F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -2.4091F, -2.3938F);
        this.armright2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0873F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 14, 68, -1.5F, 2.0F, 0.5F, 3, 4, 3, -0.001F, true));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(0.0F, 3.5909F, -1.1438F);
        this.armright2.addChild(armright3);
        this.armright3.cubeList.add(new ModelBox(armright3, 73, 21, -1.5F, 0.0F, -1.75F, 3, 2, 3, 0.0F, true));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.05F, 1.2954F, -3.6663F);
        this.Chest.addChild(Neck1);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 51, 63, -3.0F, -1.0F, -3.0F, 6, 5, 4, 0.0F, false));
        this.Neck1.cubeList.add(new ModelBox(Neck1, 72, 43, -2.5F, -1.4F, -2.9F, 5, 1, 2, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.25F, -2.75F);
        this.Neck1.addChild(Neck2);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 66, 13, -2.0F, -1.0F, -2.5F, 4, 4, 3, 0.0F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 0, 26, -1.5F, -1.5F, -2.25F, 3, 1, 2, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.14F, -0.3992F, -2.2358F);
        this.Neck2.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 68, 62, -2.41F, 0.9348F, -1.6708F, 5, 2, 2, -0.001F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.09F, 2.3191F, -2.2046F);
        this.Head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 1.2654F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 53, 33, -1.5F, -1.4F, -1.4F, 3, 1, 2, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.09F, 2.3191F, -2.2046F);
        this.Head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.829F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 12, 56, -1.5F, -0.6F, -1.9F, 3, 1, 2, 0.001F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.64F, 1.1492F, -1.7642F);
        this.Head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.5672F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 30, -2.5F, -0.75F, -1.5F, 4, 2, 1, 0.0F, false));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 38, 0, -3.05F, -0.75F, -0.5F, 5, 2, 3, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-2.31F, -0.9796F, -0.749F);
        this.Head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.7692F, 0.5237F, 0.6404F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 73, 74, -1.0F, 0.4F, -0.1F, 2, 1, 1, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(2.59F, -0.9796F, -0.749F);
        this.Head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.7692F, -0.5237F, -0.6404F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 73, 74, -1.0F, 0.4F, -0.1F, 2, 1, 1, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.09F, 1.7799F, -0.6137F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.2182F, 0.0F, 0.0F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 1.6549F, -0.5572F);
        this.Jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.9163F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 38, 6, -1.5F, -1.75F, -0.5F, 3, 1, 2, 0.0F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 67, 56, -1.5F, -0.75F, -1.5F, 3, 1, 4, 0.0F, false));

        this.Eye = new AdvancedModelRenderer(this);
        this.Eye.setRotationPoint(0.09F, 0.7742F, -0.8142F);
        this.Head.addChild(Eye);
        this.setRotateAngle(Eye, 0.6021F, 0.0F, 0.0F);
        this.Eye.cubeList.add(new ModelBox(Eye, 36, 38, -2.5F, -0.5F, -0.5F, 5, 1, 1, 0.01F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraDracopelta entityYuxi = (EntityPrehistoricFloraDracopelta) e;

        if (entityYuxi.getAnimation() == entityYuxi.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Head};
        entityYuxi.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityYuxi.getAnimation() == entityYuxi.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityYuxi.isReallyInWater()) {

                if (f3 == 0.0F || !entityYuxi.getIsMoving()) {
                    if (entityYuxi.getAnimation() != entityYuxi.EAT_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.DRINK_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityYuxi.getIsFast()) { //Running


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

        EntityPrehistoricFloraDracopelta ee = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            } else {
                //Swimming pose:
                if (!ee.getIsMoving()) { //static in water
                    //
                } else {
                    //moving in water
                    //
                }
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.RELAX_ANIMATION) { //The hiding and unhiding anim
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The hiding and unhiding anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;
        int animCycle = 180;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 72) / 33) * (6.75-(0)));
            yy = 0 + (((tickAnim - 72) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 33) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 6.75 + (((tickAnim - 105) / 48) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 48) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 6.75 + (((tickAnim - 153) / 27) * (0-(6.75)));
            yy = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 72) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 33) * (-0.15-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            zz = -0.15 + (((tickAnim - 105) / 48) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            zz = -0.15 + (((tickAnim - 153) / 27) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 72) / 33) * (7-(0)));
            yy = 0 + (((tickAnim - 72) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 33) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 7 + (((tickAnim - 105) / 48) * (7-(7)));
            yy = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 48) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 7 + (((tickAnim - 153) / 27) * (0-(7)));
            yy = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 72) / 33) * (-27.05826-(0)));
            yy = 0 + (((tickAnim - 72) / 33) * (-4.7579-(0)));
            zz = 0 + (((tickAnim - 72) / 33) * (-7.37904-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = -27.05826 + (((tickAnim - 105) / 48) * (-27.05826-(-27.05826)));
            yy = -4.7579 + (((tickAnim - 105) / 48) * (-4.7579-(-4.7579)));
            zz = -7.37904 + (((tickAnim - 105) / 48) * (-7.37904-(-7.37904)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = -27.05826 + (((tickAnim - 153) / 27) * (0-(-27.05826)));
            yy = -4.7579 + (((tickAnim - 153) / 27) * (0-(-4.7579)));
            zz = -7.37904 + (((tickAnim - 153) / 27) * (0-(-7.37904)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 72) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 33) * (1.05-(0)));
            zz = 0 + (((tickAnim - 72) / 33) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            yy = 1.05 + (((tickAnim - 105) / 48) * (1.05-(1.05)));
            zz = 0 + (((tickAnim - 105) / 48) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            yy = 1.05 + (((tickAnim - 153) / 27) * (0-(1.05)));
            zz = 0 + (((tickAnim - 153) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 72) / 33) * (0.21308-(0)));
            yy = 0 + (((tickAnim - 72) / 33) * (-1.18913-(0)));
            zz = 0 + (((tickAnim - 72) / 33) * (3.55672-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 0.21308 + (((tickAnim - 105) / 48) * (0.21308-(0.21308)));
            yy = -1.18913 + (((tickAnim - 105) / 48) * (-1.18913-(-1.18913)));
            zz = 3.55672 + (((tickAnim - 105) / 48) * (3.55672-(3.55672)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 0.21308 + (((tickAnim - 153) / 27) * (0-(0.21308)));
            yy = -1.18913 + (((tickAnim - 153) / 27) * (0-(-1.18913)));
            zz = 3.55672 + (((tickAnim - 153) / 27) * (0-(3.55672)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 72) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 33) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 72) / 33) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            yy = -0.125 + (((tickAnim - 105) / 48) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 105) / 48) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            yy = -0.125 + (((tickAnim - 153) / 27) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 153) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 72) / 33) * (12.5-(0)));
            yy = 0 + (((tickAnim - 72) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 33) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 12.5 + (((tickAnim - 105) / 48) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 48) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 12.5 + (((tickAnim - 153) / 27) * (0-(12.5)));
            yy = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 72) / 17) * (-41.99812-(0)));
            yy = 0 + (((tickAnim - 72) / 17) * (2.03095-(0)));
            zz = 0 + (((tickAnim - 72) / 17) * (24.33574-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 105) {
            xx = -41.99812 + (((tickAnim - 89) / 16) * (-66.14292-(-41.99812)));
            yy = 2.03095 + (((tickAnim - 89) / 16) * (-3.24308-(2.03095)));
            zz = 24.33574 + (((tickAnim - 89) / 16) * (7.86475-(24.33574)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = -66.14292 + (((tickAnim - 105) / 48) * (-66.14292-(-66.14292)));
            yy = -3.24308 + (((tickAnim - 105) / 48) * (-3.24308-(-3.24308)));
            zz = 7.86475 + (((tickAnim - 105) / 48) * (7.86475-(7.86475)));
        }
        else if (tickAnim >= 153 && tickAnim < 168) {
            xx = -66.14292 + (((tickAnim - 153) / 15) * (-16.63517-(-66.14292)));
            yy = -3.24308 + (((tickAnim - 153) / 15) * (-0.7341-(-3.24308)));
            zz = 7.86475 + (((tickAnim - 153) / 15) * (1.70756-(7.86475)));
        }
        else if (tickAnim >= 168 && tickAnim < 180) {
            xx = -16.63517 + (((tickAnim - 168) / 12) * (0-(-16.63517)));
            yy = -0.7341 + (((tickAnim - 168) / 12) * (0-(-0.7341)));
            zz = 1.70756 + (((tickAnim - 168) / 12) * (0-(1.70756)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 72) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 17) * (0.55-(0)));
            zz = 0 + (((tickAnim - 72) / 17) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 89) / 16) * (0-(0)));
            yy = 0.55 + (((tickAnim - 89) / 16) * (0-(0.55)));
            zz = 0 + (((tickAnim - 89) / 16) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 48) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 153) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 15) * (0.95-(0)));
            zz = 0 + (((tickAnim - 153) / 15) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 168) / 12) * (0-(0)));
            yy = 0.95 + (((tickAnim - 168) / 12) * (0-(0.95)));
            zz = 0 + (((tickAnim - 168) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 72) / 17) * (-26.16728-(0)));
            yy = 0 + (((tickAnim - 72) / 17) * (-4.60591-(0)));
            zz = 0 + (((tickAnim - 72) / 17) * (-24.46312-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 105) {
            xx = -26.16728 + (((tickAnim - 89) / 16) * (7.75-(-26.16728)));
            yy = -4.60591 + (((tickAnim - 89) / 16) * (0-(-4.60591)));
            zz = -24.46312 + (((tickAnim - 89) / 16) * (0-(-24.46312)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 7.75 + (((tickAnim - 105) / 48) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 48) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 168) {
            xx = 7.75 + (((tickAnim - 153) / 15) * (-28.87-(7.75)));
            yy = 0 + (((tickAnim - 153) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 15) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 180) {
            xx = -28.87 + (((tickAnim - 168) / 12) * (0-(-28.87)));
            yy = 0 + (((tickAnim - 168) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));

        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(0);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(0);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 72) / 17) * (93.29-(0)));
            yy = 0 + (((tickAnim - 72) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 17) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 105) {
            xx = 93.29 + (((tickAnim - 89) / 16) * (41.5-(93.29)));
            yy = 0 + (((tickAnim - 89) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 16) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 153) {
            xx = 41.5 + (((tickAnim - 105) / 48) * (41.5-(41.5)));
            yy = 0 + (((tickAnim - 105) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 48) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 168) {
            xx = 41.5 + (((tickAnim - 153) / 15) * (98.7-(41.5)));
            yy = 0 + (((tickAnim - 153) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 15) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 180) {
            xx = 98.7 + (((tickAnim - 168) / 12) * (0-(98.7)));
            yy = 0 + (((tickAnim - 168) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 0) / 153) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 153) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 153) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 153) / 15) * (0.15-(0)));
            yy = 0 + (((tickAnim - 153) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 15) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 180) {
            xx = 0.15 + (((tickAnim - 168) / 12) * (0-(0.15)));
            yy = 0 + (((tickAnim - 168) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-0.67515-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (7.0983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (3.29138-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 57) {
            xx = -0.67515 + (((tickAnim - 21) / 36) * (1.11705-(-0.67515)));
            yy = 7.0983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 21) / 36) * (11.7287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(7.0983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = 3.29138 + (((tickAnim - 21) / 36) * (4.87929-(3.29138)));
        }
        else if (tickAnim >= 57 && tickAnim < 72) {
            xx = 1.11705 + (((tickAnim - 57) / 15) * (1.09779-(1.11705)));
            yy = 11.7287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 57) / 15) * (10.2293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(11.7287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 4.87929 + (((tickAnim - 57) / 15) * (4.79963-(4.87929)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = 1.09779 + (((tickAnim - 72) / 33) * (18.5-(1.09779)));
            yy = 10.2293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 72) / 33) * (0-(10.2293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 4.79963 + (((tickAnim - 72) / 33) * (0-(4.79963)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 18.5 + (((tickAnim - 105) / 10) * (34.5-(18.5)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 122) {
            xx = 34.5 + (((tickAnim - 115) / 7) * (27.23-(34.5)));
            yy = 0 + (((tickAnim - 115) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 7) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 131) {
            xx = 27.23 + (((tickAnim - 122) / 9) * (23.36-(27.23)));
            yy = 0 + (((tickAnim - 122) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 9) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 140) {
            xx = 23.36 + (((tickAnim - 131) / 9) * (27.13-(23.36)));
            yy = 0 + (((tickAnim - 131) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 9) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 147) {
            xx = 27.13 + (((tickAnim - 140) / 7) * (20.57-(27.13)));
            yy = 0 + (((tickAnim - 140) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 7) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 153) {
            xx = 20.57 + (((tickAnim - 147) / 6) * (18.5-(20.57)));
            yy = 0 + (((tickAnim - 147) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 6) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 18.5 + (((tickAnim - 153) / 27) * (0-(18.5)));
            yy = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (5.94182-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (2.8733+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-11.20472-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 57) {
            xx = 5.94182 + (((tickAnim - 21) / 36) * (-6.5-(5.94182)));
            yy = 2.8733+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 21) / 36) * (11.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(2.8733+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = -11.20472 + (((tickAnim - 21) / 36) * (0-(-11.20472)));
        }
        else if (tickAnim >= 57 && tickAnim < 72) {
            xx = -6.5 + (((tickAnim - 57) / 15) * (-6.40244-(-6.5)));
            yy = 11.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 57) / 15) * (10.5205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(11.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 0 + (((tickAnim - 57) / 15) * (0.37791-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 105) {
            xx = -6.40244 + (((tickAnim - 72) / 33) * (7.25-(-6.40244)));
            yy = 10.5205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 72) / 33) * (0-(10.5205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 0.37791 + (((tickAnim - 72) / 33) * (0-(0.37791)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 7.25 + (((tickAnim - 105) / 10) * (1.5-(7.25)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 122) {
            xx = 1.5 + (((tickAnim - 115) / 7) * (10.03-(1.5)));
            yy = 0 + (((tickAnim - 115) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 7) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 131) {
            xx = 10.03 + (((tickAnim - 122) / 9) * (8.14-(10.03)));
            yy = 0 + (((tickAnim - 122) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 9) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 140) {
            xx = 8.14 + (((tickAnim - 131) / 9) * (3.53-(8.14)));
            yy = 0 + (((tickAnim - 131) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 9) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 147) {
            xx = 3.53 + (((tickAnim - 140) / 7) * (13.14-(3.53)));
            yy = 0 + (((tickAnim - 140) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 7) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 153) {
            xx = 13.14 + (((tickAnim - 147) / 6) * (7.25-(13.14)));
            yy = 0 + (((tickAnim - 147) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 6) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 7.25 + (((tickAnim - 153) / 27) * (0-(7.25)));
            yy = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.7517+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 21) / 13) * (-10.22279-(0)));
            yy = -0.7517+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 21) / 13) * (0.42645-(-0.7517+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            zz = 0 + (((tickAnim - 21) / 13) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -10.22279 + (((tickAnim - 34) / 9) * (-6.9541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-10.22279)));
            yy = 0.42645 + (((tickAnim - 34) / 9) * (0.65532-(0.42645)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -6.9541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 43) / 7) * (-2.3645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3-(-6.9541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0.65532 + (((tickAnim - 43) / 7) * (0.32766-(0.65532)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = -2.3645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3 + (((tickAnim - 50) / 7) * (-6.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(-2.3645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3)));
            yy = 0.32766 + (((tickAnim - 50) / 7) * (0-(0.32766)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 105) {
            xx = -6.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 57) / 48) * (-4.5-(-6.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 0 + (((tickAnim - 57) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 48) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = -4.5 + (((tickAnim - 105) / 10) * (-13.21631-(-4.5)));
            yy = 0 + (((tickAnim - 105) / 10) * (-0.7812-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (-4.93875-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 122) {
            xx = -13.21631 + (((tickAnim - 115) / 7) * (5.75-(-13.21631)));
            yy = -0.7812 + (((tickAnim - 115) / 7) * (0-(-0.7812)));
            zz = -4.93875 + (((tickAnim - 115) / 7) * (0-(-4.93875)));
        }
        else if (tickAnim >= 122 && tickAnim < 131) {
            xx = 5.75 + (((tickAnim - 122) / 9) * (1.12-(5.75)));
            yy = 0 + (((tickAnim - 122) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 9) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 140) {
            xx = 1.12 + (((tickAnim - 131) / 9) * (-9.67578-(1.12)));
            yy = 0 + (((tickAnim - 131) / 9) * (1.97157-(0)));
            zz = 0 + (((tickAnim - 131) / 9) * (-0.33608-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 147) {
            xx = -9.67578 + (((tickAnim - 140) / 7) * (0-(-9.67578)));
            yy = 1.97157 + (((tickAnim - 140) / 7) * (0-(1.97157)));
            zz = -0.33608 + (((tickAnim - 140) / 7) * (0-(-0.33608)));
        }
        else if (tickAnim >= 147 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 147) / 6) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 147) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 6) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = -4.5 + (((tickAnim - 153) / 27) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 0) / 105) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 105) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0.3-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 115) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 38) * (0-(0)));
            zz = 0.3 + (((tickAnim - 115) / 38) * (0.3-(0.3)));
        }
        else if (tickAnim >= 153 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 27) * (0-(0)));
            zz = 0.3 + (((tickAnim - 153) / 27) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-10))*-1), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*-2), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-4), Tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-6 + (((tickAnim - 0) / 180) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-10))*3 + (((tickAnim - 0) / 180) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-10))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-9 + (((tickAnim - 0) / 180) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-9-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-9)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*5 + (((tickAnim - 0) / 180) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-60))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 105 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 105) / 10) * (20-(0)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 122) {
            xx = 20 + (((tickAnim - 115) / 7) * (0-(20)));
            yy = 0 + (((tickAnim - 115) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 7) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 122) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 122) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 9) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 131) / 9) * (21.5-(0)));
            yy = 0 + (((tickAnim - 131) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 9) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 147) {
            xx = 21.5 + (((tickAnim - 140) / 7) * (0-(21.5)));
            yy = 0 + (((tickAnim - 140) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 15) / 5) * (9-(9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 9 + (((tickAnim - 20) / 15) * (0-(9)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.5 + (((tickAnim - 15) / 5) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 20) / 15) * (0-(6.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-36.7386-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.9888-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-20.2621-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36.7386 + (((tickAnim - 15) / 5) * (-36.7386-(-36.7386)));
            yy = -0.9888 + (((tickAnim - 15) / 5) * (-0.9888-(-0.9888)));
            zz = -20.2621 + (((tickAnim - 15) / 5) * (-20.2621-(-20.2621)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -36.7386 + (((tickAnim - 20) / 15) * (0-(-36.7386)));
            yy = -0.9888 + (((tickAnim - 20) / 15) * (0-(-0.9888)));
            zz = -20.2621 + (((tickAnim - 20) / 15) * (0-(-20.2621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.47343-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.13445-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (12.43555-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -21.47343 + (((tickAnim - 15) / 5) * (-21.47343-(-21.47343)));
            yy = -5.13445 + (((tickAnim - 15) / 5) * (-5.13445-(-5.13445)));
            zz = 12.43555 + (((tickAnim - 15) / 5) * (12.43555-(12.43555)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -21.47343 + (((tickAnim - 20) / 15) * (0-(-21.47343)));
            yy = -5.13445 + (((tickAnim - 20) / 15) * (0-(-5.13445)));
            zz = 12.43555 + (((tickAnim - 20) / 15) * (0-(12.43555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.375 + (((tickAnim - 15) / 5) * (-0.375-(-0.375)));
            yy = 0.3 + (((tickAnim - 15) / 5) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.375 + (((tickAnim - 20) / 15) * (0-(-0.375)));
            yy = 0.3 + (((tickAnim - 20) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.26853-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.12389-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.77225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 35.26853 + (((tickAnim - 15) / 5) * (35.26853-(35.26853)));
            yy = -2.12389 + (((tickAnim - 15) / 5) * (-2.12389-(-2.12389)));
            zz = 0.77225 + (((tickAnim - 15) / 5) * (0.77225-(0.77225)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 35.26853 + (((tickAnim - 20) / 15) * (0-(35.26853)));
            yy = -2.12389 + (((tickAnim - 20) / 15) * (0-(-2.12389)));
            zz = 0.77225 + (((tickAnim - 20) / 15) * (0-(0.77225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-36.7386-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.98885-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (20.26212-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36.7386 + (((tickAnim - 15) / 5) * (-36.7386-(-36.7386)));
            yy = -0.98885 + (((tickAnim - 15) / 5) * (-0.98885-(-0.98885)));
            zz = 20.26212 + (((tickAnim - 15) / 5) * (20.26212-(20.26212)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -36.7386 + (((tickAnim - 20) / 15) * (0-(-36.7386)));
            yy = -0.98885 + (((tickAnim - 20) / 15) * (0-(-0.98885)));
            zz = 20.26212 + (((tickAnim - 20) / 15) * (0-(20.26212)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.65062-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.92144-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-14.41331-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -21.65062 + (((tickAnim - 15) / 5) * (-21.65062-(-21.65062)));
            yy = 6.92144 + (((tickAnim - 15) / 5) * (6.92144-(6.92144)));
            zz = -14.41331 + (((tickAnim - 15) / 5) * (-14.41331-(-14.41331)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -21.65062 + (((tickAnim - 20) / 15) * (0-(-21.65062)));
            yy = 6.92144 + (((tickAnim - 20) / 15) * (0-(6.92144)));
            zz = -14.41331 + (((tickAnim - 20) / 15) * (0-(-14.41331)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.375 + (((tickAnim - 15) / 5) * (0.375-(0.375)));
            yy = 0.3 + (((tickAnim - 15) / 5) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0.375 + (((tickAnim - 20) / 15) * (0-(0.375)));
            yy = 0.3 + (((tickAnim - 20) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.26853-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.12389-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.77225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 35.26853 + (((tickAnim - 15) / 5) * (35.26853-(35.26853)));
            yy = -2.12389 + (((tickAnim - 15) / 5) * (-2.12389-(-2.12389)));
            zz = 0.77225 + (((tickAnim - 15) / 5) * (0.77225-(0.77225)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 35.26853 + (((tickAnim - 20) / 15) * (0-(35.26853)));
            yy = -2.12389 + (((tickAnim - 20) / 15) * (0-(-2.12389)));
            zz = 0.77225 + (((tickAnim - 20) / 15) * (0-(0.77225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 39 + (((tickAnim - 15) / 5) * (33.5-(39)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 33.5 + (((tickAnim - 20) / 15) * (0-(33.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.35729-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.38457-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.84861-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.35729 + (((tickAnim - 15) / 5) * (19.25-(1.35729)));
            yy = 2.38457 + (((tickAnim - 15) / 5) * (0-(2.38457)));
            zz = -6.84861 + (((tickAnim - 15) / 5) * (0-(-6.84861)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 19.25 + (((tickAnim - 20) / 15) * (0-(19.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.42353-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.2246-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-7.14637-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.42353 + (((tickAnim - 15) / 5) * (-9.75-(-13.42353)));
            yy = -1.2246 + (((tickAnim - 15) / 5) * (0-(-1.2246)));
            zz = -7.14637 + (((tickAnim - 15) / 5) * (0-(-7.14637)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -9.75 + (((tickAnim - 20) / 15) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (22.5-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 15) / 5) * (0-(22.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -3.25 + (((tickAnim - 15) / 17) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 32) / 18) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.95-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = -2.95 + (((tickAnim - 15) / 17) * (-2.95-(-2.95)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -2.95 + (((tickAnim - 32) / 18) * (0-(-2.95)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 27.25 + (((tickAnim - 15) / 17) * (27.25-(27.25)));
            yy = -11.5 + (((tickAnim - 15) / 17) * (-11.5-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 27.25 + (((tickAnim - 32) / 18) * (0-(27.25)));
            yy = -11.5 + (((tickAnim - 32) / 18) * (0-(-11.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = -1.275 + (((tickAnim - 15) / 17) * (-1.275-(-1.275)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            yy = -1.275 + (((tickAnim - 32) / 10) * (0.87-(-1.275)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.87 + (((tickAnim - 42) / 8) * (0-(0.87)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 39 + (((tickAnim - 15) / 17) * (39-(39)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 39 + (((tickAnim - 32) / 10) * (-11.02-(39)));
            yy = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -11.02 + (((tickAnim - 42) / 8) * (0-(-11.02)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 0.025 + (((tickAnim - 15) / 17) * (0.025-(0.025)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            yy = 0.025 + (((tickAnim - 32) / 10) * (2.06-(0.025)));
            zz = 0 + (((tickAnim - 32) / 10) * (0.575-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 2.06 + (((tickAnim - 42) / 8) * (0-(2.06)));
            zz = 0.575 + (((tickAnim - 42) / 8) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-60.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -60.25 + (((tickAnim - 15) / 17) * (-60.25-(-60.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -60.25 + (((tickAnim - 32) / 5) * (-18.57-(-60.25)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -18.57 + (((tickAnim - 37) / 5) * (-6.39-(-18.57)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -6.39 + (((tickAnim - 42) / 8) * (0-(-6.39)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.86-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 7) * (0-(0.775)));
            zz = 0.86 + (((tickAnim - 8) / 7) * (0.825-(0.86)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0.825 + (((tickAnim - 15) / 17) * (0.825-(0.825)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0.625-(0)));
            zz = 0.825 + (((tickAnim - 32) / 5) * (0.6-(0.825)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0.625 + (((tickAnim - 37) / 13) * (0-(0.625)));
            zz = 0.6 + (((tickAnim - 37) / 13) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -23 + (((tickAnim - 15) / 17) * (-23-(-23)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -23 + (((tickAnim - 32) / 18) * (0-(-23)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 29 + (((tickAnim - 15) / 17) * (29-(29)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 32) / 18) * (0-(29)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 0.275 + (((tickAnim - 15) / 17) * (0.275-(0.275)));
            zz = -0.125 + (((tickAnim - 15) / 17) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.275 + (((tickAnim - 32) / 18) * (0-(0.275)));
            zz = -0.125 + (((tickAnim - 32) / 18) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.5594-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.69988-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.88265-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -6.5594 + (((tickAnim - 15) / 17) * (-6.5594-(-6.5594)));
            yy = -7.69988 + (((tickAnim - 15) / 17) * (-7.69988-(-7.69988)));
            zz = 0.88265 + (((tickAnim - 15) / 17) * (0.88265-(0.88265)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -6.5594 + (((tickAnim - 32) / 18) * (0-(-6.5594)));
            yy = -7.69988 + (((tickAnim - 32) / 18) * (0-(-7.69988)));
            zz = 0.88265 + (((tickAnim - 32) / 18) * (0-(0.88265)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.90624-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-15.77436-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.32505-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -8.90624 + (((tickAnim - 15) / 17) * (-8.90624-(-8.90624)));
            yy = -15.77436 + (((tickAnim - 15) / 17) * (-15.77436-(-15.77436)));
            zz = -0.32505 + (((tickAnim - 15) / 17) * (-0.32505-(-0.32505)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -8.90624 + (((tickAnim - 32) / 18) * (0-(-8.90624)));
            yy = -15.77436 + (((tickAnim - 32) / 18) * (0-(-15.77436)));
            zz = -0.32505 + (((tickAnim - 32) / 18) * (0-(-0.32505)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.49072-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-12.43459-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.29548-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0.49072 + (((tickAnim - 15) / 17) * (0.49072-(0.49072)));
            yy = -12.43459 + (((tickAnim - 15) / 17) * (-12.43459-(-12.43459)));
            zz = -2.29548 + (((tickAnim - 15) / 17) * (-2.29548-(-2.29548)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0.49072 + (((tickAnim - 32) / 18) * (0-(0.49072)));
            yy = -12.43459 + (((tickAnim - 32) / 18) * (0-(-12.43459)));
            zz = -2.29548 + (((tickAnim - 32) / 18) * (0-(-2.29548)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.17856-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-6.45041-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-8.61471-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.17856 + (((tickAnim - 8) / 7) * (3.21359-(2.17856)));
            yy = -6.45041 + (((tickAnim - 8) / 7) * (-16.43543-(-6.45041)));
            zz = -8.61471 + (((tickAnim - 8) / 7) * (-5.72886-(-8.61471)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 3.21359 + (((tickAnim - 15) / 17) * (3.21359-(3.21359)));
            yy = -16.43543 + (((tickAnim - 15) / 17) * (-16.43543-(-16.43543)));
            zz = -5.72886 + (((tickAnim - 15) / 17) * (-5.72886-(-5.72886)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 3.21359 + (((tickAnim - 32) / 6) * (-10.708-(3.21359)));
            yy = -16.43543 + (((tickAnim - 32) / 6) * (-17.17705-(-16.43543)));
            zz = -5.72886 + (((tickAnim - 32) / 6) * (-3.29879-(-5.72886)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -10.708 + (((tickAnim - 38) / 12) * (0-(-10.708)));
            yy = -17.17705 + (((tickAnim - 38) / 12) * (0-(-17.17705)));
            zz = -3.29879 + (((tickAnim - 38) / 12) * (0-(-3.29879)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.43556-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (12.57111-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-7.84147-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 5.43556 + (((tickAnim - 8) / 7) * (14.11056-(5.43556)));
            yy = 12.57111 + (((tickAnim - 8) / 7) * (-9.22998-(12.57111)));
            zz = -7.84147 + (((tickAnim - 8) / 7) * (-7.62314-(-7.84147)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 14.11056 + (((tickAnim - 15) / 17) * (14.11056-(14.11056)));
            yy = -9.22998 + (((tickAnim - 15) / 17) * (-9.22998-(-9.22998)));
            zz = -7.62314 + (((tickAnim - 15) / 17) * (-7.62314-(-7.62314)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 14.11056 + (((tickAnim - 32) / 6) * (15.12083-(14.11056)));
            yy = -9.22998 + (((tickAnim - 32) / 6) * (-6.29317-(-9.22998)));
            zz = -7.62314 + (((tickAnim - 32) / 6) * (-5.1976-(-7.62314)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 15.12083 + (((tickAnim - 38) / 4) * (2.58056-(15.12083)));
            yy = -6.29317 + (((tickAnim - 38) / 4) * (-4.19544-(-6.29317)));
            zz = -5.1976 + (((tickAnim - 38) / 4) * (-3.46507-(-5.1976)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 2.58056 + (((tickAnim - 42) / 8) * (0-(2.58056)));
            yy = -4.19544 + (((tickAnim - 42) / 8) * (0-(-4.19544)));
            zz = -3.46507 + (((tickAnim - 42) / 8) * (0-(-3.46507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 7.25 + (((tickAnim - 15) / 17) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 32) / 18) * (0-(7.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 4.25 + (((tickAnim - 15) / 17) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 32) / 18) * (0-(4.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.27794-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (9.01579-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-17.98852-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 6.27794 + (((tickAnim - 15) / 17) * (6.27794-(6.27794)));
            yy = 9.01579 + (((tickAnim - 15) / 17) * (9.01579-(9.01579)));
            zz = -17.98852 + (((tickAnim - 15) / 17) * (-17.98852-(-17.98852)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 6.27794 + (((tickAnim - 32) / 18) * (0-(6.27794)));
            yy = 9.01579 + (((tickAnim - 32) / 18) * (0-(9.01579)));
            zz = -17.98852 + (((tickAnim - 32) / 18) * (0-(-17.98852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 1.4 + (((tickAnim - 15) / 17) * (1.4-(1.4)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 1.4 + (((tickAnim - 32) / 18) * (0-(1.4)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-35.24717-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3461-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (12.4382-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -35.24717 + (((tickAnim - 15) / 17) * (-35.24717-(-35.24717)));
            yy = 0.3461 + (((tickAnim - 15) / 17) * (0.3461-(0.3461)));
            zz = 12.4382 + (((tickAnim - 15) / 17) * (12.4382-(12.4382)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -35.24717 + (((tickAnim - 32) / 18) * (0-(-35.24717)));
            yy = 0.3461 + (((tickAnim - 32) / 18) * (0-(0.3461)));
            zz = 12.4382 + (((tickAnim - 32) / 18) * (0-(12.4382)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 11.25 + (((tickAnim - 15) / 17) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 32) / 18) * (0-(11.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.27794-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.0158-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (17.9885-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 6.27794 + (((tickAnim - 15) / 17) * (6.27794-(6.27794)));
            yy = -9.0158 + (((tickAnim - 15) / 17) * (-9.0158-(-9.0158)));
            zz = 17.9885 + (((tickAnim - 15) / 17) * (17.9885-(17.9885)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 6.27794 + (((tickAnim - 32) / 18) * (0-(6.27794)));
            yy = -9.0158 + (((tickAnim - 32) / 18) * (0-(-9.0158)));
            zz = 17.9885 + (((tickAnim - 32) / 18) * (0-(17.9885)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 1.4 + (((tickAnim - 15) / 17) * (1.4-(1.4)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 1.4 + (((tickAnim - 32) / 18) * (0-(1.4)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-35.24717-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3461-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-12.4382-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -35.24717 + (((tickAnim - 15) / 17) * (-35.24717-(-35.24717)));
            yy = 0.3461 + (((tickAnim - 15) / 17) * (0.3461-(0.3461)));
            zz = -12.4382 + (((tickAnim - 15) / 17) * (-12.4382-(-12.4382)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -35.24717 + (((tickAnim - 32) / 18) * (0-(-35.24717)));
            yy = 0.3461 + (((tickAnim - 32) / 18) * (0-(0.3461)));
            zz = -12.4382 + (((tickAnim - 32) / 18) * (0-(-12.4382)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 11.25 + (((tickAnim - 15) / 17) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 32) / 18) * (0-(11.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3 + (((tickAnim - 23) / 27) * (0-(0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -5.5 + (((tickAnim - 15) / 8) * (-7.75-(-5.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 23) / 27) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 15) / 8) * (8.5-(6)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 8.5 + (((tickAnim - 23) / 9) * (6-(8.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 32) / 18) * (0-(6)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3-(0)));
            yy = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3 + (((tickAnim - 29) / 14) * (0-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = -0.75 + (((tickAnim - 18) / 21) * (0-(-0.75)));
            zz = 1.25 + (((tickAnim - 18) / 21) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 33.75 + (((tickAnim - 18) / 10) * (3.25798-(33.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (-2.47252-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (-0.36975-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 3.25798 + (((tickAnim - 28) / 11) * (-16.75-(3.25798)));
            yy = -2.47252 + (((tickAnim - 28) / 11) * (0-(-2.47252)));
            zz = -0.36975 + (((tickAnim - 28) / 11) * (0-(-0.36975)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 39) / 11) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0.33-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            yy = 0.33 + (((tickAnim - 28) / 11) * (-0.8-(0.33)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = -0.8 + (((tickAnim - 39) / 11) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 20.5 + (((tickAnim - 18) / 10) * (16.13-(20.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 16.13 + (((tickAnim - 28) / 11) * (4.25-(16.13)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 39) / 11) * (0-(4.25)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0.46-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            yy = 0.46 + (((tickAnim - 28) / 11) * (-0.325-(0.46)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = -0.325 + (((tickAnim - 39) / 11) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.72-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = -12.72 + (((tickAnim - 4) / 14) * (32.5-(-12.72)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 32.5 + (((tickAnim - 18) / 10) * (25.63-(32.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 25.63 + (((tickAnim - 28) / 6) * (-18.48-(25.63)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = -18.48 + (((tickAnim - 34) / 5) * (12.75-(-18.48)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 39) / 11) * (0-(12.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));

        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(0);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(0);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = -1.25 + (((tickAnim - 18) / 21) * (0-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = 0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*1 + (((tickAnim - 18) / 21) * (0-(0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*1)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+40))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = 0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+40))*1 + (((tickAnim - 18) / 21) * (0-(0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+40))*1)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1 + (((tickAnim - 18) / 21) * (0-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = 0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*-1 + (((tickAnim - 18) / 32) * (0-(0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*-1)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = 0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-1 + (((tickAnim - 18) / 21) * (0-(0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-1)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.01812-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.38265-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.28815-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0.01812 + (((tickAnim - 18) / 21) * (0-(0.01812)));
            yy = 1.38265 + (((tickAnim - 18) / 21) * (0-(1.38265)));
            zz = -1.28815 + (((tickAnim - 18) / 21) * (0-(-1.28815)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.69657-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.01026-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.58365-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = -0.69657 + (((tickAnim - 18) / 21) * (0-(-0.69657)));
            yy = -1.01026 + (((tickAnim - 18) / 21) * (0-(-1.01026)));
            zz = 1.58365 + (((tickAnim - 18) / 21) * (0-(1.58365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = -4.5 + (((tickAnim - 18) / 21) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8 + (((tickAnim - 6) / 14) * (0-(0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*4 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-5 + (((tickAnim - 6) / 4) * (-2.05-(-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.05 + (((tickAnim - 10) / 10) * (0-(-2.05)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*5 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10 + (((tickAnim - 6) / 4) * (-2.475-(-0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.475 + (((tickAnim - 10) / 10) * (0-(-2.475)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-70))*10-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-70))*10 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-70))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (10.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 10.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20 + (((tickAnim - 9) / 8) * (0-(10.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 31) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2 + (((tickAnim - 0) / 31) * (-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 31) / 86) * (-6-(-6)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -6 + (((tickAnim - 117) / 43) * (0-(-6)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (-1.6-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = -1.6 + (((tickAnim - 13) / 18) * (-3.5-(-1.6)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = -3.5 + (((tickAnim - 31) / 86) * (-3.5-(-3.5)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -3.5 + (((tickAnim - 117) / 43) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 37.4 + (((tickAnim - 10) / 13) * (7.1908-(37.4)));
            yy = 0 + (((tickAnim - 10) / 13) * (-9.67477-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-1.21465-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 7.1908 + (((tickAnim - 23) / 10) * (-25.75-(7.1908)));
            yy = -9.67477 + (((tickAnim - 23) / 10) * (0-(-9.67477)));
            zz = -1.21465 + (((tickAnim - 23) / 10) * (0-(-1.21465)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -25.75 + (((tickAnim - 33) / 84) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -25.75 + (((tickAnim - 117) / 22) * (-16.88-(-25.75)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = -16.88 + (((tickAnim - 139) / 11) * (-0.6-(-16.88)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -0.6 + (((tickAnim - 150) / 10) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (1-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 23) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 33) / 106) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 106) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 106) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.82-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.82 + (((tickAnim - 10) / 5) * (24.51-(4.82)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 24.51 + (((tickAnim - 15) / 8) * (0.69-(24.51)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0.69 + (((tickAnim - 23) / 10) * (47.25-(0.69)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 47.25 + (((tickAnim - 33) / 84) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 47.25 + (((tickAnim - 117) / 22) * (17.22-(47.25)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 17.22 + (((tickAnim - 139) / 11) * (23.27-(17.22)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 23.27 + (((tickAnim - 150) / 10) * (0-(23.27)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0.975-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 10) * (0-(0.975)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 33) / 106) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 106) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 106) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 11) * (0.6-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 150) / 7) * (0-(0)));
            yy = 0.6 + (((tickAnim - 150) / 7) * (0-(0.6)));
            zz = 0 + (((tickAnim - 150) / 7) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 157) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 157) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38.95-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -38.95 + (((tickAnim - 10) / 5) * (30.17-(-38.95)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 30.17 + (((tickAnim - 15) / 8) * (-27.69-(30.17)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -27.69 + (((tickAnim - 23) / 10) * (-14.5-(-27.69)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -14.5 + (((tickAnim - 33) / 84) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -14.5 + (((tickAnim - 117) / 22) * (1.53-(-14.5)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 1.53 + (((tickAnim - 139) / 11) * (19.48-(1.53)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 157) {
            xx = 19.48 + (((tickAnim - 150) / 7) * (-15.01-(19.48)));
            yy = 0 + (((tickAnim - 150) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 7) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 160) {
            xx = -15.01 + (((tickAnim - 157) / 3) * (0-(-15.01)));
            yy = 0 + (((tickAnim - 157) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.075-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0.1 + (((tickAnim - 10) / 13) * (0.55-(0.1)));
            zz = 0.075 + (((tickAnim - 10) / 13) * (0.08-(0.075)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.55 + (((tickAnim - 23) / 10) * (0-(0.55)));
            zz = 0.08 + (((tickAnim - 23) / 10) * (0-(0.08)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 22) * (0.175-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0.175 + (((tickAnim - 139) / 21) * (0-(0.175)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 57.75 + (((tickAnim - 0) / 8) * (4.92455-(57.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.74943-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.71872-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 4.92455 + (((tickAnim - 8) / 6) * (-20-(4.92455)));
            yy = 5.74943 + (((tickAnim - 8) / 6) * (0-(5.74943)));
            zz = 1.71872 + (((tickAnim - 8) / 6) * (0-(1.71872)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = -20 + (((tickAnim - 14) / 17) * (-25.75-(-20)));
            yy = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -25.75 + (((tickAnim - 31) / 86) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -25.75 + (((tickAnim - 117) / 11) * (-13.34-(-25.75)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = -13.34 + (((tickAnim - 128) / 11) * (0-(-13.34)));
            yy = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.625 + (((tickAnim - 8) / 6) * (-0.75-(0.625)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            yy = -0.75 + (((tickAnim - 14) / 17) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 11) * (0.6-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            yy = 0.6 + (((tickAnim - 128) / 11) * (1.15-(0.6)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 1.15 + (((tickAnim - 139) / 21) * (0-(1.15)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.25 + (((tickAnim - 0) / 8) * (-6.75-(2.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -6.75 + (((tickAnim - 8) / 6) * (35-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 35 + (((tickAnim - 14) / 17) * (47.25-(35)));
            yy = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 47.25 + (((tickAnim - 31) / 86) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 47.25 + (((tickAnim - 117) / 11) * (60.89-(47.25)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = 60.89 + (((tickAnim - 128) / 11) * (0-(60.89)));
            yy = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.975 + (((tickAnim - 8) / 6) * (0-(0.975)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 17) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 31) / 108) * (0-(0)));
            yy = -0.075 + (((tickAnim - 31) / 108) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 31) / 108) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 28.25 + (((tickAnim - 0) / 8) * (-27.09-(28.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -27.09 + (((tickAnim - 8) / 4) * (-26.23-(-27.09)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -26.23 + (((tickAnim - 12) / 2) * (-9.39-(-26.23)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = -9.39 + (((tickAnim - 14) / 17) * (-14.5-(-9.39)));
            yy = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -14.5 + (((tickAnim - 31) / 86) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -14.5 + (((tickAnim - 117) / 11) * (30.52-(-14.5)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = 30.52 + (((tickAnim - 128) / 11) * (1.75-(30.52)));
            yy = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 1.75 + (((tickAnim - 139) / 21) * (0-(1.75)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 128 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 11) * (0.45-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0.45 + (((tickAnim - 139) / 21) * (0-(0.45)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.10353-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.82071-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-4.75113-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = 0.10353 + (((tickAnim - 9) / 15) * (0.10353-(0.10353)));
            yy = -1.82071 + (((tickAnim - 9) / 15) * (-1.24571-(-1.82071)));
            zz = -4.75113 + (((tickAnim - 9) / 15) * (4.7511-(-4.75113)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 0.10353 + (((tickAnim - 24) / 14) * (-6-(0.10353)));
            yy = -1.24571 + (((tickAnim - 24) / 14) * (0-(-1.24571)));
            zz = 4.7511 + (((tickAnim - 24) / 14) * (0-(4.7511)));
        }
        else if (tickAnim >= 38 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 38) / 79) * (-6-(-6)));
            yy = 0 + (((tickAnim - 38) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 79) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -6 + (((tickAnim - 117) / 43) * (0-(-6)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.48199-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.5726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-6.51777-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = -0.48199 + (((tickAnim - 9) / 15) * (-0.48199-(-0.48199)));
            yy = 0.5726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3 + (((tickAnim - 9) / 15) * (4.22263-(0.5726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3)));
            zz = -6.51777 + (((tickAnim - 9) / 15) * (6.5178-(-6.51777)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -0.48199 + (((tickAnim - 24) / 14) * (-4.25-(-0.48199)));
            yy = 4.22263 + (((tickAnim - 24) / 14) * (0-(4.22263)));
            zz = 6.5178 + (((tickAnim - 24) / 14) * (0-(6.5178)));
        }
        else if (tickAnim >= 38 && tickAnim < 117) {
            xx = -4.25 + (((tickAnim - 38) / 79) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 38) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 79) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -4.25 + (((tickAnim - 117) / 43) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.10139-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.3494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-1.99496-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = -0.10139 + (((tickAnim - 9) / 15) * (1.88179-(-0.10139)));
            yy = -1.3494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3 + (((tickAnim - 9) / 15) * (4.0581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5-(-1.3494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3)));
            zz = -1.99496 + (((tickAnim - 9) / 15) * (2.19416-(-1.99496)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 1.88179 + (((tickAnim - 24) / 14) * (1.74805-(1.88179)));
            yy = 4.0581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5 + (((tickAnim - 24) / 14) * (1.9969-(4.0581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5)));
            zz = 2.19416 + (((tickAnim - 24) / 14) * (0.11171-(2.19416)));
        }
        else if (tickAnim >= 38 && tickAnim < 117) {
            xx = 1.74805 + (((tickAnim - 38) / 79) * (1.74805-(1.74805)));
            yy = 1.9969 + (((tickAnim - 38) / 79) * (1.9969-(1.9969)));
            zz = 0.11171 + (((tickAnim - 38) / 79) * (0.11171-(0.11171)));
        }
        else if (tickAnim >= 117 && tickAnim < 131) {
            xx = 1.74805 + (((tickAnim - 117) / 14) * (-6.57343-(1.74805)));
            yy = 1.9969 + (((tickAnim - 117) / 14) * (1.34407-(1.9969)));
            zz = 0.11171 + (((tickAnim - 117) / 14) * (0.07519-(0.11171)));
        }
        else if (tickAnim >= 131 && tickAnim < 160) {
            xx = -6.57343 + (((tickAnim - 131) / 29) * (0-(-6.57343)));
            yy = 1.34407 + (((tickAnim - 131) / 29) * (0-(1.34407)));
            zz = 0.07519 + (((tickAnim - 131) / 29) * (0-(0.07519)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.20632-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.65141-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.58891-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.20632 + (((tickAnim - 3) / 5) * (-0.44882-(-0.20632)));
            yy = 0.65141 + (((tickAnim - 3) / 5) * (1.6293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3-(0.65141)));
            zz = 1.58891 + (((tickAnim - 3) / 5) * (-3.90668-(1.58891)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = -0.44882 + (((tickAnim - 8) / 16) * (1.0504-(-0.44882)));
            yy = 1.6293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3 + (((tickAnim - 8) / 16) * (-1.8563+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(1.6293+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3)));
            zz = -3.90668 + (((tickAnim - 8) / 16) * (3.7879-(-3.90668)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 1.0504 + (((tickAnim - 24) / 14) * (8.01723-(1.0504)));
            yy = -1.8563+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 24) / 14) * (2.923-(-1.8563+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = 3.7879 + (((tickAnim - 24) / 14) * (-0.67544-(3.7879)));
        }
        else if (tickAnim >= 38 && tickAnim < 117) {
            xx = 8.01723 + (((tickAnim - 38) / 79) * (8.01723-(8.01723)));
            yy = 2.923 + (((tickAnim - 38) / 79) * (2.923-(2.923)));
            zz = -0.67544 + (((tickAnim - 38) / 79) * (-0.67544-(-0.67544)));
        }
        else if (tickAnim >= 117 && tickAnim < 131) {
            xx = 8.01723 + (((tickAnim - 117) / 14) * (-4.35379-(8.01723)));
            yy = 2.923 + (((tickAnim - 117) / 14) * (1.9674-(2.923)));
            zz = -0.67544 + (((tickAnim - 117) / 14) * (-0.45462-(-0.67544)));
        }
        else if (tickAnim >= 131 && tickAnim < 148) {
            xx = -4.35379 + (((tickAnim - 131) / 17) * (-8.57131-(-4.35379)));
            yy = 1.9674 + (((tickAnim - 131) / 17) * (0.89602-(1.9674)));
            zz = -0.45462 + (((tickAnim - 131) / 17) * (-0.20705-(-0.45462)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -8.57131 + (((tickAnim - 148) / 12) * (0-(-8.57131)));
            yy = 0.89602 + (((tickAnim - 148) / 12) * (0-(0.89602)));
            zz = -0.20705 + (((tickAnim - 148) / 12) * (0-(-0.20705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.75271-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-3.98762-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5.96425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -0.75271 + (((tickAnim - 3) / 6) * (-0.45536-(-0.75271)));
            yy = -3.98762 + (((tickAnim - 3) / 6) * (-0.2659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3-(-3.98762)));
            zz = 5.96425 + (((tickAnim - 3) / 6) * (-4.02579-(5.96425)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = -0.45536 + (((tickAnim - 9) / 15) * (4.29464-(-0.45536)));
            yy = -0.2659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3 + (((tickAnim - 9) / 15) * (0.3091+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-0.2659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3)));
            zz = -4.02579 + (((tickAnim - 9) / 15) * (4.0258-(-4.02579)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 4.29464 + (((tickAnim - 24) / 14) * (5.02516-(4.29464)));
            yy = 0.3091+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 24) / 14) * (5.728-(0.3091+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = 4.0258 + (((tickAnim - 24) / 14) * (-0.50282-(4.0258)));
        }
        else if (tickAnim >= 38 && tickAnim < 117) {
            xx = 5.02516 + (((tickAnim - 38) / 79) * (5.02516-(5.02516)));
            yy = 5.728 + (((tickAnim - 38) / 79) * (5.728-(5.728)));
            zz = -0.50282 + (((tickAnim - 38) / 79) * (-0.50282-(-0.50282)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 5.02516 + (((tickAnim - 117) / 6) * (13.4185-(5.02516)));
            yy = 5.728 + (((tickAnim - 117) / 6) * (4.72037-(5.728)));
            zz = -0.50282 + (((tickAnim - 117) / 6) * (-0.41437-(-0.50282)));
        }
        else if (tickAnim >= 123 && tickAnim < 131) {
            xx = 13.4185 + (((tickAnim - 123) / 8) * (18.38232-(13.4185)));
            yy = 4.72037 + (((tickAnim - 123) / 8) * (3.85538-(4.72037)));
            zz = -0.41437 + (((tickAnim - 123) / 8) * (-0.33844-(-0.41437)));
        }
        else if (tickAnim >= 131 && tickAnim < 138) {
            xx = 18.38232 + (((tickAnim - 131) / 7) * (7.43064-(18.38232)));
            yy = 3.85538 + (((tickAnim - 131) / 7) * (2.97415-(3.85538)));
            zz = -0.33844 + (((tickAnim - 131) / 7) * (-0.26108-(-0.33844)));
        }
        else if (tickAnim >= 138 && tickAnim < 148) {
            xx = 7.43064 + (((tickAnim - 138) / 10) * (-2.01193-(7.43064)));
            yy = 2.97415 + (((tickAnim - 138) / 10) * (1.98651-(2.97415)));
            zz = -0.26108 + (((tickAnim - 138) / 10) * (-0.17438-(-0.26108)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -2.01193 + (((tickAnim - 148) / 12) * (0-(-2.01193)));
            yy = 1.98651 + (((tickAnim - 148) / 12) * (0-(1.98651)));
            zz = -0.17438 + (((tickAnim - 148) / 12) * (0-(-0.17438)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9 + (((tickAnim - 0) / 14) * (0.81612-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 14) / 19) * (0-(3)));
            yy = 0 + (((tickAnim - 14) / 19) * (0-(0)));
            zz = 0.81612 + (((tickAnim - 14) / 19) * (0-(0.81612)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 0) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (8-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = -2 + (((tickAnim - 8) / 12) * (0-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 20) / 13) * (6.6604-(8)));
            yy = 0 + (((tickAnim - 20) / 13) * (0.08058-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 6.6604 + (((tickAnim - 33) / 84) * (6.6604-(6.6604)));
            yy = 0.08058 + (((tickAnim - 33) / 84) * (0.08058-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 33) / 84) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 6.6604 + (((tickAnim - 117) / 43) * (0-(6.6604)));
            yy = 0.08058 + (((tickAnim - 117) / 43) * (0-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 117) / 43) * (-2-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = -0.475 + (((tickAnim - 33) / 84) * (-0.475-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (31.97-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 31.97 + (((tickAnim - 12) / 5) * (11.73635-(31.97)));
            yy = 0 + (((tickAnim - 12) / 5) * (4.34025-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-16.38793-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 11.73635 + (((tickAnim - 17) / 4) * (5.5-(11.73635)));
            yy = 4.34025 + (((tickAnim - 17) / 4) * (0-(4.34025)));
            zz = -16.38793 + (((tickAnim - 17) / 4) * (0-(-16.38793)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 5.5 + (((tickAnim - 21) / 12) * (15-(5.5)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 15 + (((tickAnim - 33) / 84) * (15-(15)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 15 + (((tickAnim - 117) / 12) * (17.56-(15)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 17.56 + (((tickAnim - 129) / 12) * (0-(17.56)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.57-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0.57 + (((tickAnim - 17) / 4) * (-0.1-(0.57)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            yy = -0.1 + (((tickAnim - 21) / 12) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 12) * (0.6-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            yy = 0.6 + (((tickAnim - 129) / 12) * (0-(0.6)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.93-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = -23.93 + (((tickAnim - 12) / 9) * (-40.75-(-23.93)));
            yy = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -40.75 + (((tickAnim - 21) / 12) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -40.75 + (((tickAnim - 33) / 84) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = -40.75 + (((tickAnim - 117) / 12) * (-22.39-(-40.75)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = -22.39 + (((tickAnim - 129) / 12) * (0-(-22.39)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (2.75-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 2.75 + (((tickAnim - 141) / 19) * (0-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 129 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 129) / 12) * (0.45-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0.45 + (((tickAnim - 141) / 19) * (0-(0.45)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (66.89-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 66.89 + (((tickAnim - 12) / 5) * (12.4-(66.89)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 12.4 + (((tickAnim - 17) / 4) * (30.25-(12.4)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 30.25 + (((tickAnim - 21) / 12) * (26.25-(30.25)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 26.25 + (((tickAnim - 33) / 84) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 26.25 + (((tickAnim - 117) / 12) * (87.16-(26.25)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 87.16 + (((tickAnim - 129) / 12) * (0-(87.16)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 0) / 129) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 129) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 129) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = -0.025 + (((tickAnim - 129) / 12) * (0-(-0.025)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-42-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -42 + (((tickAnim - 10) / 7) * (1.04-(-42)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1.04 + (((tickAnim - 17) / 6) * (15-(1.04)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 23) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 15 + (((tickAnim - 33) / 84) * (15-(15)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 15 + (((tickAnim - 117) / 22) * (-10.69-(15)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = -10.69 + (((tickAnim - 139) / 11) * (12.37-(-10.69)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 12.37 + (((tickAnim - 150) / 10) * (0-(12.37)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (1.325-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 1.325 + (((tickAnim - 17) / 6) * (0.08-(1.325)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.08 + (((tickAnim - 23) / 10) * (0.48-(0.08)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.48 + (((tickAnim - 33) / 84) * (0.48-(0.48)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.39-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.39 + (((tickAnim - 5) / 5) * (-6.22-(4.39)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -6.22 + (((tickAnim - 10) / 7) * (-44.22-(-6.22)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -44.22 + (((tickAnim - 17) / 6) * (-40.75-(-44.22)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -40.75 + (((tickAnim - 23) / 10) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -40.75 + (((tickAnim - 33) / 84) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -40.75 + (((tickAnim - 117) / 22) * (-19.39-(-40.75)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = -19.39 + (((tickAnim - 139) / 11) * (-37.31-(-19.39)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -37.31 + (((tickAnim - 150) / 10) * (0-(-37.31)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.07-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 16.07 + (((tickAnim - 5) / 5) * (41.63-(16.07)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 41.63 + (((tickAnim - 10) / 7) * (95.39-(41.63)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 95.39 + (((tickAnim - 17) / 6) * (19.75-(95.39)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 19.75 + (((tickAnim - 23) / 10) * (26.25-(19.75)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 26.25 + (((tickAnim - 33) / 84) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 26.25 + (((tickAnim - 117) / 22) * (30.66-(26.25)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 30.66 + (((tickAnim - 139) / 11) * (67.22-(30.66)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 67.22 + (((tickAnim - 150) / 10) * (0-(67.22)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0.075 + (((tickAnim - 17) / 6) * (0.08-(0.075)));
            yy = 0 + (((tickAnim - 17) / 6) * (0.2-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 117) {
            xx = 0.08 + (((tickAnim - 23) / 94) * (0-(0.08)));
            yy = 0.2 + (((tickAnim - 23) / 94) * (0-(0.2)));
            zz = 0 + (((tickAnim - 23) / 94) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 117) / 22) * (0.08-(0)));
            yy = 0 + (((tickAnim - 117) / 22) * (0.45-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.81671-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (10.83085-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.06678-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 5.81671 + (((tickAnim - 13) / 16) * (39-(5.81671)));
            yy = 10.83085 + (((tickAnim - 13) / 16) * (0-(10.83085)));
            zz = 9.06678 + (((tickAnim - 13) / 16) * (0-(9.06678)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 39 + (((tickAnim - 29) / 88) * (39-(39)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 39 + (((tickAnim - 117) / 43) * (0-(39)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 13) / 7) * (13-(0.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 13 + (((tickAnim - 20) / 9) * (23-(13)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 23 + (((tickAnim - 29) / 88) * (23-(23)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 23 + (((tickAnim - 117) / 43) * (0-(23)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 8) / 12) * (12-(-20)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 12 + (((tickAnim - 20) / 9) * (12-(12)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.42902-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-0.33008-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 12 + (((tickAnim - 29) / 88) * (12-(12)));
            yy = 0.42902 + (((tickAnim - 29) / 88) * (0.42902-(0.42902)));
            zz = -0.33008 + (((tickAnim - 29) / 88) * (-0.33008-(-0.33008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 20 + (((tickAnim - 8) / 9) * (0-(20)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 3) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 146) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Jaw.rotationPointX = this.Jaw.rotationPointX + (float)(xx);
        this.Jaw.rotationPointY = this.Jaw.rotationPointY - (float)(yy);
        this.Jaw.rotationPointZ = this.Jaw.rotationPointZ + (float)(zz);


    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;
        int animCycle = 760;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-8.4213+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-1.45659-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 42) {
            xx = -8.4213+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*2 + (((tickAnim - 19) / 23) * (-13.6372+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3-(-8.4213+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*2)));
            yy = 0 + (((tickAnim - 19) / 23) * (0-(0)));
            zz = -1.45659 + (((tickAnim - 19) / 23) * (-3.18948-(-1.45659)));
        }
        else if (tickAnim >= 42 && tickAnim < 70) {
            xx = -13.6372+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3 + (((tickAnim - 42) / 28) * (0-(-13.6372+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3)));
            yy = 0 + (((tickAnim - 42) / 28) * (0-(0)));
            zz = -3.18948 + (((tickAnim - 42) / 28) * (-9-(-3.18948)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            zz = -9 + (((tickAnim - 70) / 650) * (-9-(-9)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            zz = -9 + (((tickAnim - 720) / 20) * (-4.5-(-9)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = -16.75 + (((tickAnim - 740) / 20) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = -4.5 + (((tickAnim - 740) / 20) * (0-(-4.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (-4.74-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 42) / 28) * (0-(0)));
            yy = -4.74 + (((tickAnim - 42) / 28) * (-5.625-(-4.74)));
            zz = 0 + (((tickAnim - 42) / 28) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            yy = -5.625 + (((tickAnim - 70) / 650) * (-5.625-(-5.625)));
            zz = 0 + (((tickAnim - 70) / 650) * (0-(0)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            yy = -5.625 + (((tickAnim - 720) / 20) * (-5.335-(-5.625)));
            zz = 0 + (((tickAnim - 720) / 20) * (0-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = -5.335 + (((tickAnim - 740) / 20) * (0-(-5.335)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 4) / 15) * (7.5188-(0)));
            yy = 0 + (((tickAnim - 4) / 15) * (-3.72993-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (-1.98511-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 7.5188 + (((tickAnim - 19) / 18) * (-0.25767-(7.5188)));
            yy = -3.72993 + (((tickAnim - 19) / 18) * (-7.56589-(-3.72993)));
            zz = -1.98511 + (((tickAnim - 19) / 18) * (-5.11788-(-1.98511)));
        }
        else if (tickAnim >= 37 && tickAnim < 70) {
            xx = -0.25767 + (((tickAnim - 37) / 33) * (17.98522-(-0.25767)));
            yy = -7.56589 + (((tickAnim - 37) / 33) * (-4.19212-(-7.56589)));
            zz = -5.11788 + (((tickAnim - 37) / 33) * (-10.55874-(-5.11788)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 17.98522 + (((tickAnim - 70) / 650) * (17.98522-(17.98522)));
            yy = -4.19212 + (((tickAnim - 70) / 650) * (-4.19212-(-4.19212)));
            zz = -10.55874 + (((tickAnim - 70) / 650) * (-10.55874-(-10.55874)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 17.98522 + (((tickAnim - 720) / 20) * (48.25-(17.98522)));
            yy = -4.19212 + (((tickAnim - 720) / 20) * (0-(-4.19212)));
            zz = -10.55874 + (((tickAnim - 720) / 20) * (0-(-10.55874)));
        }
        else if (tickAnim >= 740 && tickAnim < 751) {
            xx = 48.25 + (((tickAnim - 740) / 11) * (5.61-(48.25)));
            yy = 0 + (((tickAnim - 740) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 11) * (0-(0)));
        }
        else if (tickAnim >= 751 && tickAnim < 760) {
            xx = 5.61 + (((tickAnim - 751) / 9) * (0-(5.61)));
            yy = 0 + (((tickAnim - 751) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 751) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 0) / 740) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 740) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 740) * (0-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 751) {
            xx = 0 + (((tickAnim - 740) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 11) * (0.8-(0)));
            zz = 0 + (((tickAnim - 740) / 11) * (0-(0)));
        }
        else if (tickAnim >= 751 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 751) / 9) * (0-(0)));
            yy = 0.8 + (((tickAnim - 751) / 9) * (0-(0.8)));
            zz = 0 + (((tickAnim - 751) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 4) / 15) * (3.94-(0)));
            yy = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 3.94 + (((tickAnim - 19) / 18) * (28.46-(3.94)));
            yy = 0 + (((tickAnim - 19) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 18) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 70) {
            xx = 28.46 + (((tickAnim - 37) / 33) * (53.25-(28.46)));
            yy = 0 + (((tickAnim - 37) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 33) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 53.25 + (((tickAnim - 70) / 650) * (53.25-(53.25)));
            yy = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 650) * (0-(0)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 53.25 + (((tickAnim - 720) / 20) * (42.63-(53.25)));
            yy = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 720) / 20) * (0-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 42.63 + (((tickAnim - 740) / 20) * (0-(42.63)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            yy = 0.275 + (((tickAnim - 4) / 15) * (1.33-(0.275)));
            zz = 0.2 + (((tickAnim - 4) / 15) * (0.35-(0.2)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 19) / 18) * (0-(0)));
            yy = 1.33 + (((tickAnim - 19) / 18) * (1.345-(1.33)));
            zz = 0.35 + (((tickAnim - 19) / 18) * (0.53-(0.35)));
        }
        else if (tickAnim >= 37 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 37) / 33) * (0-(0)));
            yy = 1.345 + (((tickAnim - 37) / 33) * (-1.01-(1.345)));
            zz = 0.53 + (((tickAnim - 37) / 33) * (0.53-(0.53)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            yy = -1.01 + (((tickAnim - 70) / 650) * (-1.01-(-1.01)));
            zz = 0.53 + (((tickAnim - 70) / 650) * (0.53-(0.53)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            yy = -1.01 + (((tickAnim - 720) / 20) * (0-(-1.01)));
            zz = 0.53 + (((tickAnim - 720) / 20) * (0-(0.53)));
        }
        else if (tickAnim >= 740 && tickAnim < 751) {
            xx = 0 + (((tickAnim - 740) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 11) * (0.9-(0)));
            zz = 0 + (((tickAnim - 740) / 11) * (0-(0)));
        }
        else if (tickAnim >= 751 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 751) / 9) * (0-(0)));
            yy = 0.9 + (((tickAnim - 751) / 9) * (0-(0.9)));
            zz = 0 + (((tickAnim - 751) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 4) / 15) * (-1.63772-(0)));
            yy = 0 + (((tickAnim - 4) / 15) * (-0.32502-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0.64498-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = -1.63772 + (((tickAnim - 19) / 18) * (-11.25993-(-1.63772)));
            yy = -0.32502 + (((tickAnim - 19) / 18) * (1.27455-(-0.32502)));
            zz = 0.64498 + (((tickAnim - 19) / 18) * (0.3367-(0.64498)));
        }
        else if (tickAnim >= 37 && tickAnim < 70) {
            xx = -11.25993 + (((tickAnim - 37) / 33) * (-67.64893-(-11.25993)));
            yy = 1.27455 + (((tickAnim - 37) / 33) * (19.11828-(1.27455)));
            zz = 0.3367 + (((tickAnim - 37) / 33) * (5.05057-(0.3367)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = -67.64893 + (((tickAnim - 70) / 650) * (-67.64893-(-67.64893)));
            yy = 19.11828 + (((tickAnim - 70) / 650) * (19.11828-(19.11828)));
            zz = 5.05057 + (((tickAnim - 70) / 650) * (5.05057-(5.05057)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = -67.64893 + (((tickAnim - 720) / 20) * (-73.3558-(-67.64893)));
            yy = 19.11828 + (((tickAnim - 720) / 20) * (5.5867-(19.11828)));
            zz = 5.05057 + (((tickAnim - 720) / 20) * (0.39206-(5.05057)));
        }
        else if (tickAnim >= 740 && tickAnim < 751) {
            xx = -73.3558 + (((tickAnim - 740) / 11) * (7.37859-(-73.3558)));
            yy = 5.5867 + (((tickAnim - 740) / 11) * (2.56057-(5.5867)));
            zz = 0.39206 + (((tickAnim - 740) / 11) * (0.17969-(0.39206)));
        }
        else if (tickAnim >= 751 && tickAnim < 760) {
            xx = 7.37859 + (((tickAnim - 751) / 9) * (0-(7.37859)));
            yy = 2.56057 + (((tickAnim - 751) / 9) * (0-(2.56057)));
            zz = 0.17969 + (((tickAnim - 751) / 9) * (0-(0.17969)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.47-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 19) / 18) * (0-(0)));
            yy = 0.47 + (((tickAnim - 19) / 18) * (0.675-(0.47)));
            zz = 0 + (((tickAnim - 19) / 18) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 37) / 11) * (0.11-(0)));
            yy = 0.675 + (((tickAnim - 37) / 11) * (1.235-(0.675)));
            zz = 0 + (((tickAnim - 37) / 11) * (0.68-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0.11 + (((tickAnim - 48) / 22) * (0.6-(0.11)));
            yy = 1.235 + (((tickAnim - 48) / 22) * (0.5-(1.235)));
            zz = 0.68 + (((tickAnim - 48) / 22) * (0.45-(0.68)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0.6 + (((tickAnim - 70) / 650) * (0.6-(0.6)));
            yy = 0.5 + (((tickAnim - 70) / 650) * (0.5-(0.5)));
            zz = 0.45 + (((tickAnim - 70) / 650) * (0.45-(0.45)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0.6 + (((tickAnim - 720) / 20) * (0-(0.6)));
            yy = 0.5 + (((tickAnim - 720) / 20) * (0-(0.5)));
            zz = 0.45 + (((tickAnim - 720) / 20) * (0.625-(0.45)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0.625 + (((tickAnim - 740) / 20) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (9.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.04343-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-2.3521-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 9.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3 + (((tickAnim - 19) / 19) * (19.16105-(9.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3)));
            yy = -0.04343 + (((tickAnim - 19) / 19) * (0-(-0.04343)));
            zz = -2.3521 + (((tickAnim - 19) / 19) * (6-(-2.3521)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 19.16105 + (((tickAnim - 38) / 4) * (22.61271-(19.16105)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 6 + (((tickAnim - 38) / 4) * (6-(6)));
        }
        else if (tickAnim >= 42 && tickAnim < 70) {
            xx = 22.61271 + (((tickAnim - 42) / 28) * (0-(22.61271)));
            yy = 0 + (((tickAnim - 42) / 28) * (0-(0)));
            zz = 6 + (((tickAnim - 42) / 28) * (-0.5-(6)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            zz = -0.5 + (((tickAnim - 70) / 650) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            zz = -0.5 + (((tickAnim - 720) / 20) * (6-(-0.5)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 6 + (((tickAnim - 740) / 20) * (0-(6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 19) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 19) * (-1.575-(0)));
            zz = 0 + (((tickAnim - 19) / 19) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = -1.575 + (((tickAnim - 38) / 4) * (-1-(-1.575)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 42) / 28) * (0-(0)));
            yy = -1 + (((tickAnim - 42) / 28) * (0.155-(-1)));
            zz = 0 + (((tickAnim - 42) / 28) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            yy = 0.155 + (((tickAnim - 70) / 650) * (0.155-(0.155)));
            zz = 0 + (((tickAnim - 70) / 650) * (0-(0)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            yy = 0.155 + (((tickAnim - 720) / 20) * (2.08-(0.155)));
            zz = 0 + (((tickAnim - 720) / 20) * (0-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 2.08 + (((tickAnim - 740) / 20) * (0-(2.08)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (22.10799-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (9.06213-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-40.10377-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 22.10799 + (((tickAnim - 19) / 19) * (21.75-(22.10799)));
            yy = 9.06213 + (((tickAnim - 19) / 19) * (-9.0821-(9.06213)));
            zz = -40.10377 + (((tickAnim - 19) / 19) * (-91.17801-(-40.10377)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 21.75 + (((tickAnim - 38) / 32) * (38.65589-(21.75)));
            yy = -9.0821 + (((tickAnim - 38) / 32) * (1.59771-(-9.0821)));
            zz = -91.17801 + (((tickAnim - 38) / 32) * (-81.84878-(-91.17801)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 38.65589 + (((tickAnim - 70) / 650) * (38.65589-(38.65589)));
            yy = 1.59771 + (((tickAnim - 70) / 650) * (1.59771-(1.59771)));
            zz = -81.84878 + (((tickAnim - 70) / 650) * (-81.84878-(-81.84878)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 38.65589 + (((tickAnim - 720) / 20) * (13.75-(38.65589)));
            yy = 1.59771 + (((tickAnim - 720) / 20) * (0-(1.59771)));
            zz = -81.84878 + (((tickAnim - 720) / 20) * (0-(-81.84878)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 13.75 + (((tickAnim - 740) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-1.07-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.12-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 19) / 19) * (0-(0)));
            yy = -1.07 + (((tickAnim - 19) / 19) * (0.525-(-1.07)));
            zz = 0.12 + (((tickAnim - 19) / 19) * (0.45-(0.12)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 38) / 32) * (0.7-(0)));
            yy = 0.525 + (((tickAnim - 38) / 32) * (0.275-(0.525)));
            zz = 0.45 + (((tickAnim - 38) / 32) * (0-(0.45)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0.7 + (((tickAnim - 70) / 650) * (0.7-(0.7)));
            yy = 0.275 + (((tickAnim - 70) / 650) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 70) / 650) * (0-(0)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0.7 + (((tickAnim - 720) / 20) * (0-(0.7)));
            yy = 0.275 + (((tickAnim - 720) / 20) * (1.45-(0.275)));
            zz = 0 + (((tickAnim - 720) / 20) * (0.375-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 1.45 + (((tickAnim - 740) / 20) * (0-(1.45)));
            zz = 0.375 + (((tickAnim - 740) / 20) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-38.02592-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-17.61189-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-21.06828-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = -38.02592 + (((tickAnim - 19) / 14) * (0-(-38.02592)));
            yy = -17.61189 + (((tickAnim - 19) / 14) * (0-(-17.61189)));
            zz = -21.06828 + (((tickAnim - 19) / 14) * (0-(-21.06828)));
        }
        else if (tickAnim >= 33 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 33) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 37) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 650) * (0-(0)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (3.75-(0)));
            yy = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 720) / 20) * (0-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 3.75 + (((tickAnim - 740) / 20) * (0-(3.75)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 0.05 + (((tickAnim - 19) / 14) * (0-(0.05)));
            yy = -0.25 + (((tickAnim - 19) / 14) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 19) / 14) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 33) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 37) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 650) * (0-(0)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 720) / 20) * (1.1-(0)));
            zz = 0 + (((tickAnim - 720) / 20) * (0-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 1.1 + (((tickAnim - 740) / 20) * (0-(1.1)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9.15479-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (1.08365-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.2062-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 42) {
            xx = -9.15479 + (((tickAnim - 16) / 26) * (0.90845-(-9.15479)));
            yy = 1.08365 + (((tickAnim - 16) / 26) * (2.85172-(1.08365)));
            zz = -0.2062 + (((tickAnim - 16) / 26) * (-0.54264-(-0.2062)));
        }
        else if (tickAnim >= 42 && tickAnim < 70) {
            xx = 0.90845 + (((tickAnim - 42) / 28) * (-10.78618-(0.90845)));
            yy = 2.85172 + (((tickAnim - 42) / 28) * (4.66645-(2.85172)));
            zz = -0.54264 + (((tickAnim - 42) / 28) * (-0.88795-(-0.54264)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = -10.78618 + (((tickAnim - 70) / 650) * (-10.78618-(-10.78618)));
            yy = 4.66645 + (((tickAnim - 70) / 650) * (4.66645-(4.66645)));
            zz = -0.88795 + (((tickAnim - 70) / 650) * (-0.88795-(-0.88795)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = -10.78618 + (((tickAnim - 720) / 20) * (0-(-10.78618)));
            yy = 4.66645 + (((tickAnim - 720) / 20) * (0-(4.66645)));
            zz = -0.88795 + (((tickAnim - 720) / 20) * (0-(-0.88795)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (4.2131-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (4.85646-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (1.74913-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 56) {
            xx = 4.2131 + (((tickAnim - 42) / 14) * (-2.99002-(4.2131)));
            yy = 4.85646 + (((tickAnim - 42) / 14) * (5.92488-(4.85646)));
            zz = 1.74913 + (((tickAnim - 42) / 14) * (2.13394-(1.74913)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = -2.99002 + (((tickAnim - 56) / 14) * (0.30686-(-2.99002)));
            yy = 5.92488 + (((tickAnim - 56) / 14) * (6.9933-(5.92488)));
            zz = 2.13394 + (((tickAnim - 56) / 14) * (2.51875-(2.13394)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0.30686 + (((tickAnim - 70) / 650) * (0.30686-(0.30686)));
            yy = 6.9933 + (((tickAnim - 70) / 650) * (6.9933-(6.9933)));
            zz = 2.51875 + (((tickAnim - 70) / 650) * (2.51875-(2.51875)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0.30686 + (((tickAnim - 720) / 20) * (11.2839-(0.30686)));
            yy = 6.9933 + (((tickAnim - 720) / 20) * (4.41336-(6.9933)));
            zz = 2.51875 + (((tickAnim - 720) / 20) * (0.87965-(2.51875)));
        }
        else if (tickAnim >= 740 && tickAnim < 749) {
            xx = 11.2839 + (((tickAnim - 740) / 9) * (0-(11.2839)));
            yy = 4.41336 + (((tickAnim - 740) / 9) * (0-(4.41336)));
            zz = 0.87965 + (((tickAnim - 740) / 9) * (0-(0.87965)));
        }
        else if (tickAnim >= 749 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 749) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 749) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 749) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.13023-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.45074-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.59105-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 42) {
            xx = -5.13023 + (((tickAnim - 8) / 34) * (5.59887-(-5.13023)));
            yy = 1.45074 + (((tickAnim - 8) / 34) * (7.25368-(1.45074)));
            zz = 0.59105 + (((tickAnim - 8) / 34) * (2.95526-(0.59105)));
        }
        else if (tickAnim >= 42 && tickAnim < 56) {
            xx = 5.59887 + (((tickAnim - 42) / 14) * (6.03942-(5.59887)));
            yy = 7.25368 + (((tickAnim - 42) / 14) * (9.56167-(7.25368)));
            zz = 2.95526 + (((tickAnim - 42) / 14) * (3.89557-(2.95526)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = 6.03942 + (((tickAnim - 56) / 14) * (0.97996-(6.03942)));
            yy = 9.56167 + (((tickAnim - 56) / 14) * (11.86966-(9.56167)));
            zz = 3.89557 + (((tickAnim - 56) / 14) * (4.83588-(3.89557)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0.97996 + (((tickAnim - 70) / 650) * (0.97996-(0.97996)));
            yy = 11.86966 + (((tickAnim - 70) / 650) * (11.86966-(11.86966)));
            zz = 4.83588 + (((tickAnim - 70) / 650) * (4.83588-(4.83588)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0.97996 + (((tickAnim - 720) / 20) * (5.25114-(0.97996)));
            yy = 11.86966 + (((tickAnim - 720) / 20) * (4.99993-(11.86966)));
            zz = 4.83588 + (((tickAnim - 720) / 20) * (0.02619-(4.83588)));
        }
        else if (tickAnim >= 740 && tickAnim < 749) {
            xx = 5.25114 + (((tickAnim - 740) / 9) * (-6.72-(5.25114)));
            yy = 4.99993 + (((tickAnim - 740) / 9) * (0-(4.99993)));
            zz = 0.02619 + (((tickAnim - 740) / 9) * (0-(0.02619)));
        }
        else if (tickAnim >= 749 && tickAnim < 760) {
            xx = -6.72 + (((tickAnim - 749) / 11) * (0-(-6.72)));
            yy = 0 + (((tickAnim - 749) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 749) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.94818-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.30562-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.50677-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -4.94818 + (((tickAnim - 18) / 8) * (4.13602-(-4.94818)));
            yy = 3.30562 + (((tickAnim - 18) / 8) * (4.87972-(3.30562)));
            zz = 1.50677 + (((tickAnim - 18) / 8) * (2.22428-(1.50677)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 4.13602 + (((tickAnim - 26) / 7) * (4.61467-(4.13602)));
            yy = 4.87972 + (((tickAnim - 26) / 7) * (6.13901-(4.87972)));
            zz = 2.22428 + (((tickAnim - 26) / 7) * (2.79828-(2.22428)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 4.61467 + (((tickAnim - 33) / 4) * (1.25757-(4.61467)));
            yy = 6.13901 + (((tickAnim - 33) / 4) * (6.92606-(6.13901)));
            zz = 2.79828 + (((tickAnim - 33) / 4) * (3.15704-(2.79828)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 1.25757 + (((tickAnim - 37) / 5) * (0.57995-(1.25757)));
            yy = 6.92606 + (((tickAnim - 37) / 5) * (7.91369-(6.92606)));
            zz = 3.15704 + (((tickAnim - 37) / 5) * (3.60722-(3.15704)));
        }
        else if (tickAnim >= 42 && tickAnim < 56) {
            xx = 0.57995 + (((tickAnim - 42) / 14) * (2.35539-(0.57995)));
            yy = 7.91369 + (((tickAnim - 42) / 14) * (10.43168-(7.91369)));
            zz = 3.60722 + (((tickAnim - 42) / 14) * (4.75497-(3.60722)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = 2.35539 + (((tickAnim - 56) / 14) * (0.13083-(2.35539)));
            yy = 10.43168 + (((tickAnim - 56) / 14) * (12.94967-(10.43168)));
            zz = 4.75497 + (((tickAnim - 56) / 14) * (5.90272-(4.75497)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0.13083 + (((tickAnim - 70) / 650) * (0.13083-(0.13083)));
            yy = 12.94967 + (((tickAnim - 70) / 650) * (12.94967-(12.94967)));
            zz = 5.90272 + (((tickAnim - 70) / 650) * (5.90272-(5.90272)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0.13083 + (((tickAnim - 720) / 20) * (-5.24768-(0.13083)));
            yy = 12.94967 + (((tickAnim - 720) / 20) * (4.49961-(12.94967)));
            zz = 5.90272 + (((tickAnim - 720) / 20) * (0.05902-(5.90272)));
        }
        else if (tickAnim >= 740 && tickAnim < 749) {
            xx = -5.24768 + (((tickAnim - 740) / 9) * (-0.66-(-5.24768)));
            yy = 4.49961 + (((tickAnim - 740) / 9) * (0-(4.49961)));
            zz = 0.05902 + (((tickAnim - 740) / 9) * (0-(0.05902)));
        }
        else if (tickAnim >= 749 && tickAnim < 754) {
            xx = -0.66 + (((tickAnim - 749) / 5) * (-7.35-(-0.66)));
            yy = 0 + (((tickAnim - 749) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 749) / 5) * (0-(0)));
        }
        else if (tickAnim >= 754 && tickAnim < 760) {
            xx = -7.35 + (((tickAnim - 754) / 6) * (0-(-7.35)));
            yy = 0 + (((tickAnim - 754) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 754) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (7.84566-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (1.4571-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.16847-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 7.84566 + (((tickAnim - 12) / 6) * (21.34728-(7.84566)));
            yy = 1.4571 + (((tickAnim - 12) / 6) * (3.30276-(1.4571)));
            zz = 0.16847 + (((tickAnim - 12) / 6) * (0.38187-(0.16847)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 21.34728 + (((tickAnim - 18) / 8) * (7.88254-(21.34728)));
            yy = 3.30276 + (((tickAnim - 18) / 8) * (4.51701-(3.30276)));
            zz = 0.38187 + (((tickAnim - 18) / 8) * (0.52226-(0.38187)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 7.88254 + (((tickAnim - 26) / 7) * (4.33813-(7.88254)));
            yy = 4.51701 + (((tickAnim - 26) / 7) * (5.52125-(4.51701)));
            zz = 0.52226 + (((tickAnim - 26) / 7) * (0.63837-(0.52226)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 4.33813 + (((tickAnim - 33) / 4) * (5.37286-(4.33813)));
            yy = 5.52125 + (((tickAnim - 33) / 4) * (6.1489-(5.52125)));
            zz = 0.63837 + (((tickAnim - 33) / 4) * (0.71094-(0.63837)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 5.37286 + (((tickAnim - 37) / 5) * (3.50462-(5.37286)));
            yy = 6.1489 + (((tickAnim - 37) / 5) * (7.2855-(6.1489)));
            zz = 0.71094 + (((tickAnim - 37) / 5) * (0.84235-(0.71094)));
        }
        else if (tickAnim >= 42 && tickAnim < 70) {
            xx = 3.50462 + (((tickAnim - 42) / 28) * (6.14393-(3.50462)));
            yy = 7.2855 + (((tickAnim - 42) / 28) * (11.92173-(7.2855)));
            zz = 0.84235 + (((tickAnim - 42) / 28) * (1.37839-(0.84235)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 6.14393 + (((tickAnim - 70) / 650) * (6.14393-(6.14393)));
            yy = 11.92173 + (((tickAnim - 70) / 650) * (11.92173-(11.92173)));
            zz = 1.37839 + (((tickAnim - 70) / 650) * (1.37839-(1.37839)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 6.14393 + (((tickAnim - 720) / 20) * (2.51203-(6.14393)));
            yy = 11.92173 + (((tickAnim - 720) / 20) * (4.74112-(11.92173)));
            zz = 1.37839 + (((tickAnim - 720) / 20) * (0.29064-(1.37839)));
        }
        else if (tickAnim >= 740 && tickAnim < 749) {
            xx = 2.51203 + (((tickAnim - 740) / 9) * (15.69-(2.51203)));
            yy = 4.74112 + (((tickAnim - 740) / 9) * (0-(4.74112)));
            zz = 0.29064 + (((tickAnim - 740) / 9) * (0-(0.29064)));
        }
        else if (tickAnim >= 749 && tickAnim < 754) {
            xx = 15.69 + (((tickAnim - 749) / 5) * (-2.1-(15.69)));
            yy = 0 + (((tickAnim - 749) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 749) / 5) * (0-(0)));
        }
        else if (tickAnim >= 754 && tickAnim < 760) {
            xx = -2.1 + (((tickAnim - 754) / 6) * (0-(-2.1)));
            yy = 0 + (((tickAnim - 754) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 754) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 42) {
            xx = 4.5 + (((tickAnim - 19) / 23) * (2.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*3-(4.5)));
            yy = 0 + (((tickAnim - 19) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 23) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 70) {
            xx = 2.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*3 + (((tickAnim - 42) / 28) * (0-(2.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*3)));
            yy = 0 + (((tickAnim - 42) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 28) * (-3.75-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            zz = -3.75 + (((tickAnim - 70) / 650) * (-3.75-(-3.75)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (1-(0)));
            yy = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            zz = -3.75 + (((tickAnim - 720) / 20) * (-1.875-(-3.75)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 1 + (((tickAnim - 740) / 20) * (0-(1)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = -1.875 + (((tickAnim - 740) / 20) * (0-(-1.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 19) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 23) * (0.3-(0)));
            zz = 0 + (((tickAnim - 19) / 23) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 42) / 4) * (0-(0.3)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 2) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 48) / 1) * (0-(0)));
            yy = -0.025 + (((tickAnim - 48) / 1) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 48) / 1) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 65) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 2) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 65) / 2) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 67) / 1) * (0-(0)));
            yy = -0.075 + (((tickAnim - 67) / 1) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 67) / 1) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);


        if (tickAnim >= 70 && tickAnim < 103) {
            xx = 1 + (((tickAnim - 70) / 33) * (1.0225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.005-(1)));
            yy = 1 + (((tickAnim - 70) / 33) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 33) * (1-(1)));
        }
        else if (tickAnim >= 103 && tickAnim < 250) {
            xx = 1.0225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.005 + (((tickAnim - 103) / 147) * (1-(1.0225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.005)));
            yy = 1 + (((tickAnim - 103) / 147) * (1-(1)));
            zz = 1 + (((tickAnim - 103) / 147) * (1-(1)));
        }
        else if (tickAnim >= 250 && tickAnim < 285) {
            xx = 1 + (((tickAnim - 250) / 35) * (1.0225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.005-(1)));
            yy = 1 + (((tickAnim - 250) / 35) * (1-(1)));
            zz = 1 + (((tickAnim - 250) / 35) * (1-(1)));
        }
        else if (tickAnim >= 285 && tickAnim < 680) {
            xx = 1.0225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.005 + (((tickAnim - 285) / 395) * (1-(1.0225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.005)));
            yy = 1 + (((tickAnim - 285) / 395) * (1-(1)));
            zz = 1 + (((tickAnim - 285) / 395) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Body.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (2.75-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 2.75 + (((tickAnim - 50) / 20) * (0-(2.75)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 70) / 240) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 240) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 310) / 410) * (0-(0)));
            yy = 0 + (((tickAnim - 310) / 410) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 410) * (0-(0)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (8.5-(0)));
            yy = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 720) / 20) * (0-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 8.5 + (((tickAnim - 740) / 20) * (0-(8.5)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 43) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 45) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 16) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 61) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 2) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 61) / 2) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 63) / 1) * (0-(0)));
            yy = -0.075 + (((tickAnim - 63) / 1) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 63) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 0) / 70) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 70) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 70) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 103) {
            xx = 1 + (((tickAnim - 70) / 33) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 33) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 33) * (1-(1)));
        }
        else if (tickAnim >= 103 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 103) / 27) * (1-(1)));
            yy = 1 + (((tickAnim - 103) / 27) * (1-(1)));
            zz = 1 + (((tickAnim - 103) / 27) * (1-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 1 + (((tickAnim - 130) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 130) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 130) / 25) * (1-(1)));
        }
        else if (tickAnim >= 155 && tickAnim < 196) {
            xx = 1 + (((tickAnim - 155) / 41) * (1-(1)));
            yy = 1 + (((tickAnim - 155) / 41) * (1-(1)));
            zz = 1 + (((tickAnim - 155) / 41) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Chest.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 19) / 18) * (13.8863-(0)));
            yy = 0 + (((tickAnim - 19) / 18) * (0.38091-(0)));
            zz = 0 + (((tickAnim - 19) / 18) * (-1.12495-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 13.8863 + (((tickAnim - 37) / 5) * (16.11475-(13.8863)));
            yy = 0.38091 + (((tickAnim - 37) / 5) * (0.1624-(0.38091)));
            zz = -1.12495 + (((tickAnim - 37) / 5) * (-1.95461-(-1.12495)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 16.11475 + (((tickAnim - 42) / 6) * (5.17843-(16.11475)));
            yy = 0.1624 + (((tickAnim - 42) / 6) * (-0.08963-(0.1624)));
            zz = -1.95461 + (((tickAnim - 42) / 6) * (-2.91151-(-1.95461)));
        }
        else if (tickAnim >= 48 && tickAnim < 62) {
            xx = 5.17843 + (((tickAnim - 48) / 14) * (-34.86628-(5.17843)));
            yy = -0.08963 + (((tickAnim - 48) / 14) * (-7.25032-(-0.08963)));
            zz = -2.91151 + (((tickAnim - 48) / 14) * (-27.58143-(-2.91151)));
        }
        else if (tickAnim >= 62 && tickAnim < 720) {
            xx = -34.86628 + (((tickAnim - 62) / 658) * (-34.86628-(-34.86628)));
            yy = -7.25032 + (((tickAnim - 62) / 658) * (-7.25032-(-7.25032)));
            zz = -27.58143 + (((tickAnim - 62) / 658) * (-27.58143-(-27.58143)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = -34.86628 + (((tickAnim - 720) / 20) * (0-(-34.86628)));
            yy = -7.25032 + (((tickAnim - 720) / 20) * (0-(-7.25032)));
            zz = -27.58143 + (((tickAnim - 720) / 20) * (0-(-27.58143)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 19) / 18) * (0-(0)));
            yy = 1.4 + (((tickAnim - 19) / 18) * (0.125-(1.4)));
            zz = 0 + (((tickAnim - 19) / 18) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 37) / 5) * (-0.05-(0.125)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 42) / 6) * (1.025-(-0.05)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 48) / 6) * (0-(0)));
            yy = 1.025 + (((tickAnim - 48) / 6) * (0.8-(1.025)));
            zz = 0 + (((tickAnim - 48) / 6) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 54) / 8) * (0-(0)));
            yy = 0.8 + (((tickAnim - 54) / 8) * (0-(0.8)));
            zz = 0 + (((tickAnim - 54) / 8) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 62) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 8) * (0.1-(0)));
            zz = 0 + (((tickAnim - 62) / 8) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 70) / 650) * (0-(0)));
            yy = 0.1 + (((tickAnim - 70) / 650) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 70) / 650) * (0-(0)));
        }
        else if (tickAnim >= 720 && tickAnim < 728) {
            xx = 0 + (((tickAnim - 720) / 8) * (0-(0)));
            yy = 0.1 + (((tickAnim - 720) / 8) * (1.31-(0.1)));
            zz = 0 + (((tickAnim - 720) / 8) * (0-(0)));
        }
        else if (tickAnim >= 728 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 728) / 12) * (0-(0)));
            yy = 1.31 + (((tickAnim - 728) / 12) * (0.575-(1.31)));
            zz = 0 + (((tickAnim - 728) / 12) * (0-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 740) / 20) * (0-(0.575)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 5.5 + (((tickAnim - 19) / 18) * (15.51263-(5.5)));
            yy = 0 + (((tickAnim - 19) / 18) * (-6.25621-(0)));
            zz = 0 + (((tickAnim - 19) / 18) * (8.4671-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 15.51263 + (((tickAnim - 37) / 11) * (12.75-(15.51263)));
            yy = -6.25621 + (((tickAnim - 37) / 11) * (0-(-6.25621)));
            zz = 8.4671 + (((tickAnim - 37) / 11) * (7-(8.4671)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 12.75 + (((tickAnim - 48) / 6) * (-50.35791-(12.75)));
            yy = 0 + (((tickAnim - 48) / 6) * (6.80457-(0)));
            zz = 7 + (((tickAnim - 48) / 6) * (9.02432-(7)));
        }
        else if (tickAnim >= 54 && tickAnim < 62) {
            xx = -50.35791 + (((tickAnim - 54) / 8) * (-48.22191-(-50.35791)));
            yy = 6.80457 + (((tickAnim - 54) / 8) * (-27.55192-(6.80457)));
            zz = 9.02432 + (((tickAnim - 54) / 8) * (13.45691-(9.02432)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = -48.22191 + (((tickAnim - 62) / 8) * (-52.47191-(-48.22191)));
            yy = -27.55192 + (((tickAnim - 62) / 8) * (-27.55192-(-27.55192)));
            zz = 13.45691 + (((tickAnim - 62) / 8) * (13.45691-(13.45691)));
        }
        else if (tickAnim >= 70 && tickAnim < 720) {
            xx = -52.47191 + (((tickAnim - 70) / 650) * (-52.47191-(-52.47191)));
            yy = -27.55192 + (((tickAnim - 70) / 650) * (-27.55192-(-27.55192)));
            zz = 13.45691 + (((tickAnim - 70) / 650) * (13.45691-(13.45691)));
        }
        else if (tickAnim >= 720 && tickAnim < 728) {
            xx = -52.47191 + (((tickAnim - 720) / 8) * (-42.10861-(-52.47191)));
            yy = -27.55192 + (((tickAnim - 720) / 8) * (-16.07195-(-27.55192)));
            zz = 13.45691 + (((tickAnim - 720) / 8) * (7.84986-(13.45691)));
        }
        else if (tickAnim >= 728 && tickAnim < 740) {
            xx = -42.10861 + (((tickAnim - 728) / 12) * (0-(-42.10861)));
            yy = -16.07195 + (((tickAnim - 728) / 12) * (0-(-16.07195)));
            zz = 7.84986 + (((tickAnim - 728) / 12) * (0-(7.84986)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 19) / 18) * (0-(0)));
            yy = -0.575 + (((tickAnim - 19) / 18) * (-0.05-(-0.575)));
            zz = 0 + (((tickAnim - 19) / 18) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = -0.05 + (((tickAnim - 37) / 5) * (-0.375-(-0.05)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -0.375 + (((tickAnim - 42) / 6) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 48) / 14) * (-0.325-(0)));
            yy = -0.375 + (((tickAnim - 48) / 14) * (0.275-(-0.375)));
            zz = 0 + (((tickAnim - 48) / 14) * (0.3-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 64) {
            xx = -0.325 + (((tickAnim - 62) / 2) * (-0.52-(-0.325)));
            yy = 0.275 + (((tickAnim - 62) / 2) * (0.255-(0.275)));
            zz = 0.3 + (((tickAnim - 62) / 2) * (0.35-(0.3)));
        }
        else if (tickAnim >= 64 && tickAnim < 67) {
            xx = -0.52 + (((tickAnim - 64) / 3) * (-0.325-(-0.52)));
            yy = 0.255 + (((tickAnim - 64) / 3) * (0.275-(0.255)));
            zz = 0.35 + (((tickAnim - 64) / 3) * (0.3-(0.35)));
        }
        else if (tickAnim >= 67 && tickAnim < 720) {
            xx = -0.325 + (((tickAnim - 67) / 653) * (-0.325-(-0.325)));
            yy = 0.275 + (((tickAnim - 67) / 653) * (0.275-(0.275)));
            zz = 0.3 + (((tickAnim - 67) / 653) * (0.3-(0.3)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = -0.325 + (((tickAnim - 720) / 20) * (0-(-0.325)));
            yy = 0.275 + (((tickAnim - 720) / 20) * (0-(0.275)));
            zz = 0.3 + (((tickAnim - 720) / 20) * (0-(0.3)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = -3.25 + (((tickAnim - 19) / 18) * (-18.49409-(-3.25)));
            yy = 0 + (((tickAnim - 19) / 18) * (0.47591-(0)));
            zz = 0 + (((tickAnim - 19) / 18) * (1.42252-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = -18.49409 + (((tickAnim - 37) / 11) * (-10.23938-(-18.49409)));
            yy = 0.47591 + (((tickAnim - 37) / 11) * (0.64276-(0.47591)));
            zz = 1.42252 + (((tickAnim - 37) / 11) * (1.89394-(1.42252)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = -10.23938 + (((tickAnim - 48) / 6) * (92.13031-(-10.23938)));
            yy = 0.64276 + (((tickAnim - 48) / 6) * (0.32138-(0.64276)));
            zz = 1.89394 + (((tickAnim - 48) / 6) * (0.94697-(1.89394)));
        }
        else if (tickAnim >= 54 && tickAnim < 62) {
            xx = 92.13031 + (((tickAnim - 54) / 8) * (77.74562-(92.13031)));
            yy = 0.32138 + (((tickAnim - 54) / 8) * (-7.37479-(0.32138)));
            zz = 0.94697 + (((tickAnim - 54) / 8) * (3.25061-(0.94697)));
        }
        else if (tickAnim >= 62 && tickAnim < 720) {
            xx = 77.74562 + (((tickAnim - 62) / 658) * (77.74562-(77.74562)));
            yy = -7.37479 + (((tickAnim - 62) / 658) * (-7.37479-(-7.37479)));
            zz = 3.25061 + (((tickAnim - 62) / 658) * (3.25061-(3.25061)));
        }
        else if (tickAnim >= 720 && tickAnim < 728) {
            xx = 77.74562 + (((tickAnim - 720) / 8) * (108.60161-(77.74562)));
            yy = -7.37479 + (((tickAnim - 720) / 8) * (-4.30196-(-7.37479)));
            zz = 3.25061 + (((tickAnim - 720) / 8) * (1.89619-(3.25061)));
        }
        else if (tickAnim >= 728 && tickAnim < 740) {
            xx = 108.60161 + (((tickAnim - 728) / 12) * (0-(108.60161)));
            yy = -4.30196 + (((tickAnim - 728) / 12) * (0-(-4.30196)));
            zz = 1.89619 + (((tickAnim - 728) / 12) * (5.25-(1.89619)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 5.25 + (((tickAnim - 740) / 20) * (0-(5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 11) * (0.6-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 48) / 14) * (0-(0)));
            yy = 0.6 + (((tickAnim - 48) / 14) * (0-(0.6)));
            zz = 0 + (((tickAnim - 48) / 14) * (-0.35-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 62) / 658) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 658) * (0-(0)));
            zz = -0.35 + (((tickAnim - 62) / 658) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            zz = -0.35 + (((tickAnim - 720) / 20) * (0-(-0.35)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 19) / 13) * (4.1363-(0)));
            yy = 0 + (((tickAnim - 19) / 13) * (0.38091-(0)));
            zz = 0 + (((tickAnim - 19) / 13) * (-1.12495-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 4.1363 + (((tickAnim - 32) / 7) * (-36.59731-(4.1363)));
            yy = 0.38091 + (((tickAnim - 32) / 7) * (-2.90022-(0.38091)));
            zz = -1.12495 + (((tickAnim - 32) / 7) * (8.25505-(-1.12495)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -36.59731 + (((tickAnim - 39) / 5) * (-57.94554-(-36.59731)));
            yy = -2.90022 + (((tickAnim - 39) / 5) * (0.9943-(-2.90022)));
            zz = 8.25505 + (((tickAnim - 39) / 5) * (15.09317-(8.25505)));
        }
        else if (tickAnim >= 44 && tickAnim < 70) {
            xx = -57.94554 + (((tickAnim - 44) / 26) * (-71.19617-(-57.94554)));
            yy = 0.9943 + (((tickAnim - 44) / 26) * (16.3898-(0.9943)));
            zz = 15.09317 + (((tickAnim - 44) / 26) * (10.3051-(15.09317)));
        }
        else if (tickAnim >= 70 && tickAnim < 310) {
            xx = -71.19617 + (((tickAnim - 70) / 240) * (-71.19617-(-71.19617)));
            yy = 16.3898 + (((tickAnim - 70) / 240) * (16.3898-(16.3898)));
            zz = 10.3051 + (((tickAnim - 70) / 240) * (10.3051-(10.3051)));
        }
        else if (tickAnim >= 310 && tickAnim < 324) {
            xx = -71.19617 + (((tickAnim - 310) / 14) * (-75.59906-(-71.19617)));
            yy = 16.3898 + (((tickAnim - 310) / 14) * (7.38339-(16.3898)));
            zz = 10.3051 + (((tickAnim - 310) / 14) * (11.71109-(10.3051)));
        }
        else if (tickAnim >= 324 && tickAnim < 338) {
            xx = -75.59906 + (((tickAnim - 324) / 14) * (-78.92984-(-75.59906)));
            yy = 7.38339 + (((tickAnim - 324) / 14) * (0.8477-(7.38339)));
            zz = 11.71109 + (((tickAnim - 324) / 14) * (7.69508-(11.71109)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = -78.92984 + (((tickAnim - 338) / 36) * (-78.92984-(-78.92984)));
            yy = 0.8477 + (((tickAnim - 338) / 36) * (0.8477-(0.8477)));
            zz = 7.69508 + (((tickAnim - 338) / 36) * (7.69508-(7.69508)));
        }
        else if (tickAnim >= 374 && tickAnim < 720) {
            xx = -78.92984 + (((tickAnim - 374) / 346) * (-78.92984-(-78.92984)));
            yy = 0.8477 + (((tickAnim - 374) / 346) * (0.8477-(0.8477)));
            zz = 7.69508 + (((tickAnim - 374) / 346) * (7.69508-(7.69508)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = -78.92984 + (((tickAnim - 720) / 20) * (-56.22395-(-78.92984)));
            yy = 0.8477 + (((tickAnim - 720) / 20) * (1.61655-(0.8477)));
            zz = 7.69508 + (((tickAnim - 720) / 20) * (6.99315-(7.69508)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = -56.22395 + (((tickAnim - 740) / 20) * (0-(-56.22395)));
            yy = 1.61655 + (((tickAnim - 740) / 20) * (0-(1.61655)));
            zz = 6.99315 + (((tickAnim - 740) / 20) * (0-(6.99315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 19) / 13) * (0-(0)));
            yy = 1.125 + (((tickAnim - 19) / 13) * (1.075-(1.125)));
            zz = 0 + (((tickAnim - 19) / 13) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 1.075 + (((tickAnim - 32) / 7) * (-0.56-(1.075)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = -0.56 + (((tickAnim - 39) / 3) * (-1.25-(-0.56)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = -1.25 + (((tickAnim - 42) / 2) * (-1.15-(-1.25)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 44) / 26) * (0-(0)));
            yy = -1.15 + (((tickAnim - 44) / 26) * (1.8-(-1.15)));
            zz = 0 + (((tickAnim - 44) / 26) * (-0.65-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 70) / 240) * (0-(0)));
            yy = 1.8 + (((tickAnim - 70) / 240) * (1.8-(1.8)));
            zz = -0.65 + (((tickAnim - 70) / 240) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 310 && tickAnim < 324) {
            xx = 0 + (((tickAnim - 310) / 14) * (0-(0)));
            yy = 1.8 + (((tickAnim - 310) / 14) * (2.575-(1.8)));
            zz = -0.65 + (((tickAnim - 310) / 14) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 324 && tickAnim < 338) {
            xx = 0 + (((tickAnim - 324) / 14) * (0-(0)));
            yy = 2.575 + (((tickAnim - 324) / 14) * (1.8-(2.575)));
            zz = -0.65 + (((tickAnim - 324) / 14) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = 0 + (((tickAnim - 338) / 36) * (0-(0)));
            yy = 1.8 + (((tickAnim - 338) / 36) * (1.8-(1.8)));
            zz = -0.65 + (((tickAnim - 338) / 36) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 374 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 374) / 346) * (0-(0)));
            yy = 1.8 + (((tickAnim - 374) / 346) * (1.8-(1.8)));
            zz = -0.65 + (((tickAnim - 374) / 346) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            yy = 1.8 + (((tickAnim - 720) / 20) * (-0.255-(1.8)));
            zz = -0.65 + (((tickAnim - 720) / 20) * (-1.83-(-0.65)));
        }
        else if (tickAnim >= 740 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 740) / 10) * (0-(0)));
            yy = -0.255 + (((tickAnim - 740) / 10) * (1.17-(-0.255)));
            zz = -1.83 + (((tickAnim - 740) / 10) * (-0.63-(-1.83)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            yy = 1.17 + (((tickAnim - 750) / 10) * (0-(1.17)));
            zz = -0.63 + (((tickAnim - 750) / 10) * (0-(-0.63)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 32) {
            xx = 5.5 + (((tickAnim - 19) / 13) * (21.9935-(5.5)));
            yy = 0 + (((tickAnim - 19) / 13) * (0.34903-(0)));
            zz = 0 + (((tickAnim - 19) / 13) * (-0.96571-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 21.9935 + (((tickAnim - 32) / 7) * (1.50031-(21.9935)));
            yy = 0.34903 + (((tickAnim - 32) / 7) * (-0.47367-(0.34903)));
            zz = -0.96571 + (((tickAnim - 32) / 7) * (-8.24861-(-0.96571)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 1.50031 + (((tickAnim - 39) / 5) * (2.31905-(1.50031)));
            yy = -0.47367 + (((tickAnim - 39) / 5) * (8.0897-(-0.47367)));
            zz = -8.24861 + (((tickAnim - 39) / 5) * (-16.28944-(-8.24861)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 2.31905 + (((tickAnim - 44) / 6) * (-3.22755-(2.31905)));
            yy = 8.0897 + (((tickAnim - 44) / 6) * (4.5746-(8.0897)));
            zz = -16.28944 + (((tickAnim - 44) / 6) * (-9.2747-(-16.28944)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -3.22755 + (((tickAnim - 50) / 3) * (-5.41153-(-3.22755)));
            yy = 4.5746 + (((tickAnim - 50) / 3) * (0.84236-(4.5746)));
            zz = -9.2747 + (((tickAnim - 50) / 3) * (-6.88474-(-9.2747)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -5.41153 + (((tickAnim - 53) / 7) * (-9.95831-(-5.41153)));
            yy = 0.84236 + (((tickAnim - 53) / 7) * (0.89162-(0.84236)));
            zz = -6.88474 + (((tickAnim - 53) / 7) * (-7.55155-(-6.88474)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -9.95831 + (((tickAnim - 60) / 10) * (-10.72597-(-9.95831)));
            yy = 0.89162 + (((tickAnim - 60) / 10) * (-3.55368-(0.89162)));
            zz = -7.55155 + (((tickAnim - 60) / 10) * (-10.64469-(-7.55155)));
        }
        else if (tickAnim >= 70 && tickAnim < 310) {
            xx = -10.72597 + (((tickAnim - 70) / 240) * (-10.72597-(-10.72597)));
            yy = -3.55368 + (((tickAnim - 70) / 240) * (-3.55368-(-3.55368)));
            zz = -10.64469 + (((tickAnim - 70) / 240) * (-10.64469-(-10.64469)));
        }
        else if (tickAnim >= 310 && tickAnim < 338) {
            xx = -10.72597 + (((tickAnim - 310) / 28) * (-1.97597-(-10.72597)));
            yy = -3.55368 + (((tickAnim - 310) / 28) * (-3.55368-(-3.55368)));
            zz = -10.64469 + (((tickAnim - 310) / 28) * (-10.64469-(-10.64469)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = -1.97597 + (((tickAnim - 338) / 36) * (-1.97597-(-1.97597)));
            yy = -3.55368 + (((tickAnim - 338) / 36) * (-3.55368-(-3.55368)));
            zz = -10.64469 + (((tickAnim - 338) / 36) * (-10.64469-(-10.64469)));
        }
        else if (tickAnim >= 374 && tickAnim < 720) {
            xx = -1.97597 + (((tickAnim - 374) / 346) * (-1.97597-(-1.97597)));
            yy = -3.55368 + (((tickAnim - 374) / 346) * (-3.55368-(-3.55368)));
            zz = -10.64469 + (((tickAnim - 374) / 346) * (-10.64469-(-10.64469)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = -1.97597 + (((tickAnim - 720) / 20) * (1.10445-(-1.97597)));
            yy = -3.55368 + (((tickAnim - 720) / 20) * (-0.45027-(-3.55368)));
            zz = -10.64469 + (((tickAnim - 720) / 20) * (-21.90518-(-10.64469)));
        }
        else if (tickAnim >= 740 && tickAnim < 750) {
            xx = 1.10445 + (((tickAnim - 740) / 10) * (-17.25-(1.10445)));
            yy = -0.45027 + (((tickAnim - 740) / 10) * (0-(-0.45027)));
            zz = -21.90518 + (((tickAnim - 740) / 10) * (0-(-21.90518)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = -17.25 + (((tickAnim - 750) / 10) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 19 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 19) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 13) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 19) / 13) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = -0.35 + (((tickAnim - 32) / 7) * (0.175-(-0.35)));
            zz = 0 + (((tickAnim - 32) / 7) * (-0.125-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 39) / 3) * (-0.31-(0.175)));
            zz = -0.125 + (((tickAnim - 39) / 3) * (0.515-(-0.125)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = -0.31 + (((tickAnim - 42) / 2) * (0-(-0.31)));
            zz = 0.515 + (((tickAnim - 42) / 2) * (0.9-(0.515)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 44) / 3) * (-0.04-(0)));
            yy = 0 + (((tickAnim - 44) / 3) * (-0.06-(0)));
            zz = 0.9 + (((tickAnim - 44) / 3) * (0.19-(0.9)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = -0.04 + (((tickAnim - 47) / 1) * (-0.06-(-0.04)));
            yy = -0.06 + (((tickAnim - 47) / 1) * (-0.09-(-0.06)));
            zz = 0.19 + (((tickAnim - 47) / 1) * (0.075-(0.19)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -0.06 + (((tickAnim - 48) / 2) * (-0.09-(-0.06)));
            yy = -0.09 + (((tickAnim - 48) / 2) * (-0.13-(-0.09)));
            zz = 0.075 + (((tickAnim - 48) / 2) * (-0.285-(0.075)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -0.09 + (((tickAnim - 50) / 3) * (-0.13-(-0.09)));
            yy = -0.13 + (((tickAnim - 50) / 3) * (-0.18-(-0.13)));
            zz = -0.285 + (((tickAnim - 50) / 3) * (-0.515-(-0.285)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -0.13 + (((tickAnim - 53) / 7) * (-0.18-(-0.13)));
            yy = -0.18 + (((tickAnim - 53) / 7) * (-0.25-(-0.18)));
            zz = -0.515 + (((tickAnim - 53) / 7) * (-0.895-(-0.515)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -0.18 + (((tickAnim - 60) / 10) * (-0.25-(-0.18)));
            yy = -0.25 + (((tickAnim - 60) / 10) * (-0.35-(-0.25)));
            zz = -0.895 + (((tickAnim - 60) / 10) * (-0.775-(-0.895)));
        }
        else if (tickAnim >= 70 && tickAnim < 310) {
            xx = -0.25 + (((tickAnim - 70) / 240) * (-0.25-(-0.25)));
            yy = -0.35 + (((tickAnim - 70) / 240) * (-0.35-(-0.35)));
            zz = -0.775 + (((tickAnim - 70) / 240) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 310 && tickAnim < 338) {
            xx = -0.25 + (((tickAnim - 310) / 28) * (0-(-0.25)));
            yy = -0.35 + (((tickAnim - 310) / 28) * (-0.7-(-0.35)));
            zz = -0.775 + (((tickAnim - 310) / 28) * (-0.455-(-0.775)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = 0 + (((tickAnim - 338) / 36) * (0-(0)));
            yy = -0.7 + (((tickAnim - 338) / 36) * (-0.7-(-0.7)));
            zz = -0.455 + (((tickAnim - 338) / 36) * (-0.455-(-0.455)));
        }
        else if (tickAnim >= 374 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 374) / 346) * (0-(0)));
            yy = -0.7 + (((tickAnim - 374) / 346) * (-0.7-(-0.7)));
            zz = -0.455 + (((tickAnim - 374) / 346) * (-0.455-(-0.455)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            yy = -0.7 + (((tickAnim - 720) / 20) * (-0.475-(-0.7)));
            zz = -0.455 + (((tickAnim - 720) / 20) * (0-(-0.455)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = -0.475 + (((tickAnim - 740) / 20) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 19) / 13) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 19) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 13) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = -13.25 + (((tickAnim - 32) / 7) * (70.08437-(-13.25)));
            yy = 0 + (((tickAnim - 32) / 7) * (0.32294-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0.96528-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 70.08437 + (((tickAnim - 39) / 3) * (56.60553-(70.08437)));
            yy = 0.32294 + (((tickAnim - 39) / 3) * (5.01495-(0.32294)));
            zz = 0.96528 + (((tickAnim - 39) / 3) * (-3.29819-(0.96528)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 56.60553 + (((tickAnim - 42) / 2) * (64.2437-(56.60553)));
            yy = 5.01495 + (((tickAnim - 42) / 2) * (2.73733-(5.01495)));
            zz = -3.29819 + (((tickAnim - 42) / 2) * (-0.26378-(-3.29819)));
        }
        else if (tickAnim >= 44 && tickAnim < 70) {
            xx = 64.2437 + (((tickAnim - 44) / 26) * (81.5-(64.2437)));
            yy = 2.73733 + (((tickAnim - 44) / 26) * (0-(2.73733)));
            zz = -0.26378 + (((tickAnim - 44) / 26) * (0-(-0.26378)));
        }
        else if (tickAnim >= 70 && tickAnim < 310) {
            xx = 81.5 + (((tickAnim - 70) / 240) * (81.5-(81.5)));
            yy = 0 + (((tickAnim - 70) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 240) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 324) {
            xx = 81.5 + (((tickAnim - 310) / 14) * (107.5-(81.5)));
            yy = 0 + (((tickAnim - 310) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 14) * (0-(0)));
        }
        else if (tickAnim >= 324 && tickAnim < 338) {
            xx = 107.5 + (((tickAnim - 324) / 14) * (81.5-(107.5)));
            yy = 0 + (((tickAnim - 324) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 324) / 14) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = 81.5 + (((tickAnim - 338) / 36) * (81.5-(81.5)));
            yy = 0 + (((tickAnim - 338) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 338) / 36) * (0-(0)));
        }
        else if (tickAnim >= 374 && tickAnim < 720) {
            xx = 81.5 + (((tickAnim - 374) / 346) * (81.5-(81.5)));
            yy = 0 + (((tickAnim - 374) / 346) * (0-(0)));
            zz = 0 + (((tickAnim - 374) / 346) * (0-(0)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 81.5 + (((tickAnim - 720) / 20) * (60.5-(81.5)));
            yy = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 720) / 20) * (0-(0)));
        }
        else if (tickAnim >= 740 && tickAnim < 750) {
            xx = 60.5 + (((tickAnim - 740) / 10) * (99-(60.5)));
            yy = 0 + (((tickAnim - 740) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 10) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 99 + (((tickAnim - 750) / 10) * (0-(99)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 19 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 19) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 13) * (0.475-(0)));
            zz = 0 + (((tickAnim - 19) / 13) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            yy = 0.475 + (((tickAnim - 32) / 10) * (0-(0.475)));
            zz = 0 + (((tickAnim - 32) / 10) * (-0.65-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = -0.65 + (((tickAnim - 42) / 2) * (-0.75-(-0.65)));
        }
        else if (tickAnim >= 44 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 44) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 26) * (-0.275-(0)));
            zz = -0.75 + (((tickAnim - 44) / 26) * (-0.475-(-0.75)));
        }
        else if (tickAnim >= 70 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 70) / 240) * (0-(0)));
            yy = -0.275 + (((tickAnim - 70) / 240) * (-0.275-(-0.275)));
            zz = -0.475 + (((tickAnim - 70) / 240) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 310 && tickAnim < 338) {
            xx = 0 + (((tickAnim - 310) / 28) * (0-(0)));
            yy = -0.275 + (((tickAnim - 310) / 28) * (-0.275-(-0.275)));
            zz = -0.475 + (((tickAnim - 310) / 28) * (-0.275-(-0.475)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = 0 + (((tickAnim - 338) / 36) * (0-(0)));
            yy = -0.275 + (((tickAnim - 338) / 36) * (-0.275-(-0.275)));
            zz = -0.275 + (((tickAnim - 338) / 36) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 374 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 374) / 346) * (0-(0)));
            yy = -0.275 + (((tickAnim - 374) / 346) * (-0.275-(-0.275)));
            zz = -0.275 + (((tickAnim - 374) / 346) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 0 + (((tickAnim - 720) / 20) * (0-(0)));
            yy = -0.275 + (((tickAnim - 720) / 20) * (-0.225-(-0.275)));
            zz = -0.275 + (((tickAnim - 720) / 20) * (0-(-0.275)));
        }
        else if (tickAnim >= 740 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 740) / 10) * (0-(0)));
            yy = -0.225 + (((tickAnim - 740) / 10) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 740) / 10) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = -4 + (((tickAnim - 19) / 18) * (-5.91463-(-4)));
            yy = 0 + (((tickAnim - 19) / 18) * (-3.53449-(0)));
            zz = 0 + (((tickAnim - 19) / 18) * (0.64958-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 52) {
            xx = -5.91463 + (((tickAnim - 37) / 15) * (-13.62312-(-5.91463)));
            yy = -3.53449 + (((tickAnim - 37) / 15) * (-6.00164-(-3.53449)));
            zz = 0.64958 + (((tickAnim - 37) / 15) * (1.10299-(0.64958)));
        }
        else if (tickAnim >= 52 && tickAnim < 70) {
            xx = -13.62312 + (((tickAnim - 52) / 18) * (6.53254-(-13.62312)));
            yy = -6.00164 + (((tickAnim - 52) / 18) * (-8.24715-(-6.00164)));
            zz = 1.10299 + (((tickAnim - 52) / 18) * (1.51568-(1.10299)));
        }
        else if (tickAnim >= 70 && tickAnim < 196) {
            xx = 6.53254 + (((tickAnim - 70) / 126) * (6.53254-(6.53254)));
            yy = -8.24715 + (((tickAnim - 70) / 126) * (-8.24715-(-8.24715)));
            zz = 1.51568 + (((tickAnim - 70) / 126) * (1.51568-(1.51568)));
        }
        else if (tickAnim >= 196 && tickAnim < 210) {
            xx = 6.53254 + (((tickAnim - 196) / 14) * (3.6075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5-(6.53254)));
            yy = -8.24715 + (((tickAnim - 196) / 14) * (-8.05715-(-8.24715)));
            zz = 1.51568 + (((tickAnim - 196) / 14) * (1.51568-(1.51568)));
        }
        else if (tickAnim >= 210 && tickAnim < 223) {
            xx = 3.6075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5 + (((tickAnim - 210) / 13) * (7.10266-(3.6075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5)));
            yy = -8.05715 + (((tickAnim - 210) / 13) * (-5.66643-(-8.05715)));
            zz = 1.51568 + (((tickAnim - 210) / 13) * (1.8279+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*1-(1.51568)));
        }
        else if (tickAnim >= 223 && tickAnim < 250) {
            xx = 7.10266 + (((tickAnim - 223) / 27) * (-3.7171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5-(7.10266)));
            yy = -5.66643 + (((tickAnim - 223) / 27) * (0.2008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1-(-5.66643)));
            zz = 1.8279+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*1 + (((tickAnim - 223) / 27) * (5.60143-(1.8279+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*1)));
        }
        else if (tickAnim >= 250 && tickAnim < 310) {
            xx = -3.7171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5 + (((tickAnim - 250) / 60) * (-3.7171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5-(-3.7171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5)));
            yy = 0.2008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1 + (((tickAnim - 250) / 60) * (1.1008-(0.2008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1)));
            zz = 5.60143 + (((tickAnim - 250) / 60) * (5.60143-(5.60143)));
        }
        else if (tickAnim >= 310 && tickAnim < 338) {
            xx = -3.7171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5 + (((tickAnim - 310) / 28) * (27.4695-(-3.7171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5)));
            yy = 1.1008 + (((tickAnim - 310) / 28) * (3.56944-(1.1008)));
            zz = 5.60143 + (((tickAnim - 310) / 28) * (4.65994-(5.60143)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = 27.4695 + (((tickAnim - 338) / 36) * (27.4695-(27.4695)));
            yy = 3.56944 + (((tickAnim - 338) / 36) * (3.56944-(3.56944)));
            zz = 4.65994 + (((tickAnim - 338) / 36) * (4.65994-(4.65994)));
        }
        else if (tickAnim >= 374 && tickAnim < 425) {
            xx = 27.4695 + (((tickAnim - 374) / 51) * (27.4695-(27.4695)));
            yy = 3.56944 + (((tickAnim - 374) / 51) * (3.56944-(3.56944)));
            zz = 4.65994 + (((tickAnim - 374) / 51) * (4.65994-(4.65994)));
        }
        else if (tickAnim >= 425 && tickAnim < 460) {
            xx = 27.4695 + (((tickAnim - 425) / 35) * (25.2695+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(27.4695)));
            yy = 3.56944 + (((tickAnim - 425) / 35) * (3.56944-(3.56944)));
            zz = 4.65994 + (((tickAnim - 425) / 35) * (4.65994-(4.65994)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 25.2695+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 460) / 40) * (21.0945+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(25.2695+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 3.56944 + (((tickAnim - 460) / 40) * (3.56944-(3.56944)));
            zz = 4.65994 + (((tickAnim - 460) / 40) * (4.65994-(4.65994)));
        }
        else if (tickAnim >= 500 && tickAnim < 561) {
            xx = 21.0945+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 500) / 61) * (27.4695-(21.0945+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 3.56944 + (((tickAnim - 500) / 61) * (3.56944-(3.56944)));
            zz = 4.65994 + (((tickAnim - 500) / 61) * (4.65994-(4.65994)));
        }
        else if (tickAnim >= 561 && tickAnim < 680) {
            xx = 27.4695 + (((tickAnim - 561) / 119) * (27.4695-(27.4695)));
            yy = 3.56944 + (((tickAnim - 561) / 119) * (3.56944-(3.56944)));
            zz = 4.65994 + (((tickAnim - 561) / 119) * (4.65994-(4.65994)));
        }
        else if (tickAnim >= 680 && tickAnim < 706) {
            xx = 27.4695 + (((tickAnim - 680) / 26) * (7.7681-(27.4695)));
            yy = 3.56944 + (((tickAnim - 680) / 26) * (-16.42615-(3.56944)));
            zz = 4.65994 + (((tickAnim - 680) / 26) * (-2.22984-(4.65994)));
        }
        else if (tickAnim >= 706 && tickAnim < 720) {
            xx = 7.7681 + (((tickAnim - 706) / 14) * (4.7681-(7.7681)));
            yy = -16.42615 + (((tickAnim - 706) / 14) * (-16.42615-(-16.42615)));
            zz = -2.22984 + (((tickAnim - 706) / 14) * (-2.22984-(-2.22984)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = 4.7681 + (((tickAnim - 720) / 20) * (18-(4.7681)));
            yy = -16.42615 + (((tickAnim - 720) / 20) * (0-(-16.42615)));
            zz = -2.22984 + (((tickAnim - 720) / 20) * (0-(-2.22984)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 18 + (((tickAnim - 740) / 20) * (0-(18)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 52) * (0.625-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 52) / 668) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 668) * (0-(0)));
            zz = 0.625 + (((tickAnim - 52) / 668) * (0.625-(0.625)));
        }
        else if (tickAnim >= 720 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 720) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 720) / 40) * (0-(0)));
            zz = 0.625 + (((tickAnim - 720) / 40) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = -7.75 + (((tickAnim - 19) / 18) * (6.368-(-7.75)));
            yy = 0 + (((tickAnim - 19) / 18) * (-5.76328-(0)));
            zz = 0 + (((tickAnim - 19) / 18) * (0.51373-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 70) {
            xx = 6.368 + (((tickAnim - 37) / 33) * (-5.14132-(6.368)));
            yy = -5.76328 + (((tickAnim - 37) / 33) * (-13.44766-(-5.76328)));
            zz = 0.51373 + (((tickAnim - 37) / 33) * (1.1987-(0.51373)));
        }
        else if (tickAnim >= 70 && tickAnim < 196) {
            xx = -5.14132 + (((tickAnim - 70) / 126) * (-5.14132-(-5.14132)));
            yy = -13.44766 + (((tickAnim - 70) / 126) * (-13.44766-(-13.44766)));
            zz = 1.1987 + (((tickAnim - 70) / 126) * (1.1987-(1.1987)));
        }
        else if (tickAnim >= 196 && tickAnim < 210) {
            xx = -5.14132 + (((tickAnim - 196) / 14) * (-3.14132-(-5.14132)));
            yy = -13.44766 + (((tickAnim - 196) / 14) * (-13.25766-(-13.44766)));
            zz = 1.1987 + (((tickAnim - 196) / 14) * (1.1987-(1.1987)));
        }
        else if (tickAnim >= 210 && tickAnim < 223) {
            xx = -3.14132 + (((tickAnim - 210) / 13) * (-4.62989-(-3.14132)));
            yy = -13.25766 + (((tickAnim - 210) / 13) * (-7.28689-(-13.25766)));
            zz = 1.1987 + (((tickAnim - 210) / 13) * (1.7205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*3-(1.1987)));
        }
        else if (tickAnim >= 223 && tickAnim < 250) {
            xx = -4.62989 + (((tickAnim - 223) / 27) * (-3.2171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-0.8-(-4.62989)));
            yy = -7.28689 + (((tickAnim - 223) / 27) * (-0.0669-(-7.28689)));
            zz = 1.7205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*3 + (((tickAnim - 223) / 27) * (7.7857-(1.7205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*3)));
        }
        else if (tickAnim >= 250 && tickAnim < 310) {
            xx = -3.2171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-0.8 + (((tickAnim - 250) / 60) * (-3.2171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-0.8-(-3.2171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-0.8)));
            yy = -0.0669 + (((tickAnim - 250) / 60) * (-0.0669-(-0.0669)));
            zz = 7.7857 + (((tickAnim - 250) / 60) * (7.7857-(7.7857)));
        }
        else if (tickAnim >= 310 && tickAnim < 338) {
            xx = -3.2171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-0.8 + (((tickAnim - 310) / 28) * (-1.6407-(-3.2171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-0.8)));
            yy = -0.0669 + (((tickAnim - 310) / 28) * (17.39713-(-0.0669)));
            zz = 7.7857 + (((tickAnim - 310) / 28) * (6.64655-(7.7857)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = -1.6407 + (((tickAnim - 338) / 36) * (-1.6407-(-1.6407)));
            yy = 17.39713 + (((tickAnim - 338) / 36) * (17.39713-(17.39713)));
            zz = 6.64655 + (((tickAnim - 338) / 36) * (6.64655-(6.64655)));
        }
        else if (tickAnim >= 374 && tickAnim < 425) {
            xx = -1.6407 + (((tickAnim - 374) / 51) * (-1.6407-(-1.6407)));
            yy = 17.39713 + (((tickAnim - 374) / 51) * (17.39713-(17.39713)));
            zz = 6.64655 + (((tickAnim - 374) / 51) * (6.64655-(6.64655)));
        }
        else if (tickAnim >= 425 && tickAnim < 460) {
            xx = -1.6407 + (((tickAnim - 425) / 35) * (-9.6407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(-1.6407)));
            yy = 17.39713 + (((tickAnim - 425) / 35) * (17.39713-(17.39713)));
            zz = 6.64655 + (((tickAnim - 425) / 35) * (6.64655-(6.64655)));
        }
        else if (tickAnim >= 460 && tickAnim < 479) {
            xx = -9.6407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 460) / 19) * (-9.6407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(-9.6407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 17.39713 + (((tickAnim - 460) / 19) * (17.39713-(17.39713)));
            zz = 6.64655 + (((tickAnim - 460) / 19) * (6.64655-(6.64655)));
        }
        else if (tickAnim >= 479 && tickAnim < 500) {
            xx = -9.6407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 479) / 21) * (-9.6407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(-9.6407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 17.39713 + (((tickAnim - 479) / 21) * (17.39713-(17.39713)));
            zz = 6.64655 + (((tickAnim - 479) / 21) * (6.64655-(6.64655)));
        }
        else if (tickAnim >= 500 && tickAnim < 561) {
            xx = -9.6407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 500) / 61) * (-1.6407-(-9.6407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 17.39713 + (((tickAnim - 500) / 61) * (17.39713-(17.39713)));
            zz = 6.64655 + (((tickAnim - 500) / 61) * (6.64655-(6.64655)));
        }
        else if (tickAnim >= 561 && tickAnim < 680) {
            xx = -1.6407 + (((tickAnim - 561) / 119) * (-1.6407-(-1.6407)));
            yy = 17.39713 + (((tickAnim - 561) / 119) * (17.39713-(17.39713)));
            zz = 6.64655 + (((tickAnim - 561) / 119) * (6.64655-(6.64655)));
        }
        else if (tickAnim >= 680 && tickAnim < 706) {
            xx = -1.6407 + (((tickAnim - 680) / 26) * (-2.7387-(-1.6407)));
            yy = 17.39713 + (((tickAnim - 680) / 26) * (-14.57147-(17.39713)));
            zz = 6.64655 + (((tickAnim - 680) / 26) * (7.70805-(6.64655)));
        }
        else if (tickAnim >= 706 && tickAnim < 720) {
            xx = -2.7387 + (((tickAnim - 706) / 14) * (-2.7387-(-2.7387)));
            yy = -14.57147 + (((tickAnim - 706) / 14) * (-14.57147-(-14.57147)));
            zz = 7.70805 + (((tickAnim - 706) / 14) * (7.70805-(7.70805)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = -2.7387 + (((tickAnim - 720) / 20) * (14.5-(-2.7387)));
            yy = -14.57147 + (((tickAnim - 720) / 20) * (0-(-14.57147)));
            zz = 7.70805 + (((tickAnim - 720) / 20) * (0-(7.70805)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 14.5 + (((tickAnim - 740) / 20) * (0-(14.5)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 338) {
            xx = 0 + (((tickAnim - 0) / 338) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 338) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 338) * (0.35-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 338) / 382) * (0-(0)));
            yy = 0 + (((tickAnim - 338) / 382) * (0-(0)));
            zz = 0.35 + (((tickAnim - 338) / 382) * (0.35-(0.35)));
        }
        else if (tickAnim >= 720 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 720) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 720) / 40) * (0-(0)));
            zz = 0.35 + (((tickAnim - 720) / 40) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 14 + (((tickAnim - 19) / 18) * (14-(14)));
            yy = 0 + (((tickAnim - 19) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 18) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 52) {
            xx = 14 + (((tickAnim - 37) / 15) * (21.33-(14)));
            yy = 0 + (((tickAnim - 37) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 15) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 70) {
            xx = 21.33 + (((tickAnim - 52) / 18) * (0-(21.33)));
            yy = 0 + (((tickAnim - 52) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 18) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 196) {
            xx = 0 + (((tickAnim - 70) / 126) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 126) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 126) * (0-(0)));
        }
        else if (tickAnim >= 196 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 196) / 14) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 196) / 14) * (0.19-(0)));
            zz = 0 + (((tickAnim - 196) / 14) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 223) {
            xx = -1.25 + (((tickAnim - 210) / 13) * (-5.03487-(-1.25)));
            yy = 0.19 + (((tickAnim - 210) / 13) * (3.33749-(0.19)));
            zz = 0 + (((tickAnim - 210) / 13) * (-0.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-70))*5-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 250) {
            xx = -5.03487 + (((tickAnim - 223) / 27) * (3.0329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*1-(-5.03487)));
            yy = 3.33749 + (((tickAnim - 223) / 27) * (9-(3.33749)));
            zz = -0.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-70))*5 + (((tickAnim - 223) / 27) * (0-(-0.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-70))*5)));
        }
        else if (tickAnim >= 250 && tickAnim < 310) {
            xx = 3.0329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*1 + (((tickAnim - 250) / 60) * (3.0329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*1-(3.0329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*1)));
            yy = 9 + (((tickAnim - 250) / 60) * (9-(9)));
            zz = 0 + (((tickAnim - 250) / 60) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 338) {
            xx = 3.0329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*1 + (((tickAnim - 310) / 28) * (-11.9671-(3.0329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*1)));
            yy = 9 + (((tickAnim - 310) / 28) * (9-(9)));
            zz = 0 + (((tickAnim - 310) / 28) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = -11.9671 + (((tickAnim - 338) / 36) * (-11.9671-(-11.9671)));
            yy = 9 + (((tickAnim - 338) / 36) * (9-(9)));
            zz = 0 + (((tickAnim - 338) / 36) * (0-(0)));
        }
        else if (tickAnim >= 374 && tickAnim < 425) {
            xx = -11.9671 + (((tickAnim - 374) / 51) * (-11.9671-(-11.9671)));
            yy = 9 + (((tickAnim - 374) / 51) * (9-(9)));
            zz = 0 + (((tickAnim - 374) / 51) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 446) {
            xx = -11.9671 + (((tickAnim - 425) / 21) * (-5.5171-(-11.9671)));
            yy = 9 + (((tickAnim - 425) / 21) * (9-(9)));
            zz = 0 + (((tickAnim - 425) / 21) * (0-(0)));
        }
        else if (tickAnim >= 446 && tickAnim < 460) {
            xx = -5.5171 + (((tickAnim - 446) / 14) * (-0.4671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(-5.5171)));
            yy = 9 + (((tickAnim - 446) / 14) * (9-(9)));
            zz = 0 + (((tickAnim - 446) / 14) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 479) {
            xx = -0.4671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 460) / 19) * (-0.4671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(-0.4671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 9 + (((tickAnim - 460) / 19) * (9-(9)));
            zz = 0 + (((tickAnim - 460) / 19) * (0-(0)));
        }
        else if (tickAnim >= 479 && tickAnim < 500) {
            xx = -0.4671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 479) / 21) * (-0.4671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(-0.4671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 9 + (((tickAnim - 479) / 21) * (9-(9)));
            zz = 0 + (((tickAnim - 479) / 21) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 561) {
            xx = -0.4671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 500) / 61) * (-11.9671-(-0.4671+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 9 + (((tickAnim - 500) / 61) * (9-(9)));
            zz = 0 + (((tickAnim - 500) / 61) * (0-(0)));
        }
        else if (tickAnim >= 561 && tickAnim < 680) {
            xx = -11.9671 + (((tickAnim - 561) / 119) * (-11.9671-(-11.9671)));
            yy = 9 + (((tickAnim - 561) / 119) * (9-(9)));
            zz = 0 + (((tickAnim - 561) / 119) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 706) {
            xx = -11.9671 + (((tickAnim - 680) / 26) * (-7.07246-(-11.9671)));
            yy = 9 + (((tickAnim - 680) / 26) * (-8.18808-(9)));
            zz = 0 + (((tickAnim - 680) / 26) * (1.01232-(0)));
        }
        else if (tickAnim >= 706 && tickAnim < 720) {
            xx = -7.07246 + (((tickAnim - 706) / 14) * (-1.32246-(-7.07246)));
            yy = -8.18808 + (((tickAnim - 706) / 14) * (-8.18808-(-8.18808)));
            zz = 1.01232 + (((tickAnim - 706) / 14) * (1.01232-(1.01232)));
        }
        else if (tickAnim >= 720 && tickAnim < 740) {
            xx = -1.32246 + (((tickAnim - 720) / 20) * (0-(-1.32246)));
            yy = -8.18808 + (((tickAnim - 720) / 20) * (0-(-8.18808)));
            zz = 1.01232 + (((tickAnim - 720) / 20) * (0-(1.01232)));
        }
        else if (tickAnim >= 740 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 740) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 740) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0.15-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 196) {
            xx = 0 + (((tickAnim - 70) / 126) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 126) * (0-(0)));
            zz = 0.15 + (((tickAnim - 70) / 126) * (0.15-(0.15)));
        }
        else if (tickAnim >= 196 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 196) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 196) / 14) * (0-(0)));
            zz = 0.15 + (((tickAnim - 196) / 14) * (0.325-(0.15)));
        }
        else if (tickAnim >= 210 && tickAnim < 338) {
            xx = 0 + (((tickAnim - 210) / 128) * (0-(0)));
            yy = 0 + (((tickAnim - 210) / 128) * (0.25-(0)));
            zz = 0.325 + (((tickAnim - 210) / 128) * (0.33-(0.325)));
        }
        else if (tickAnim >= 338 && tickAnim < 720) {
            xx = 0 + (((tickAnim - 338) / 382) * (0-(0)));
            yy = 0.25 + (((tickAnim - 338) / 382) * (0.25-(0.25)));
            zz = 0.33 + (((tickAnim - 338) / 382) * (0.33-(0.33)));
        }
        else if (tickAnim >= 720 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 720) / 40) * (0-(0)));
            yy = 0.25 + (((tickAnim - 720) / 40) * (0-(0.25)));
            zz = 0.33 + (((tickAnim - 720) / 40) * (0-(0.33)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (3.75-(0)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 100) {
            xx = 3.75 + (((tickAnim - 70) / 30) * (0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(3.75)));
            yy = 0 + (((tickAnim - 70) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 30) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 196) {
            xx = 0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 100) / 96) * (3.75-(0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 100) / 96) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 96) * (0-(0)));
        }
        else if (tickAnim >= 196 && tickAnim < 210) {
            xx = 3.75 + (((tickAnim - 196) / 14) * (14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(3.75)));
            yy = 0 + (((tickAnim - 196) / 14) * (0.19-(0)));
            zz = 0 + (((tickAnim - 196) / 14) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 226) {
            xx = 14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 210) / 16) * (0-(14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0.19 + (((tickAnim - 210) / 16) * (0-(0.19)));
            zz = 0 + (((tickAnim - 210) / 16) * (0-(0)));
        }
        else if (tickAnim >= 226 && tickAnim < 452) {
            xx = 0 + (((tickAnim - 226) / 226) * (0-(0)));
            yy = 0 + (((tickAnim - 226) / 226) * (0-(0)));
            zz = 0 + (((tickAnim - 226) / 226) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 471) {
            xx = 0 + (((tickAnim - 452) / 19) * (5.25-(0)));
            yy = 0 + (((tickAnim - 452) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 19) * (0-(0)));
        }
        else if (tickAnim >= 471 && tickAnim < 498) {
            xx = 5.25 + (((tickAnim - 471) / 27) * (0-(5.25)));
            yy = 0 + (((tickAnim - 471) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 471) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Eye, Eye.rotateAngleX + (float) Math.toRadians(0), Eye.rotateAngleY + (float) Math.toRadians(0), Eye.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 1 + (((tickAnim - 0) / 100) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 100) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 100) * (1-(1)));
        }
        else if (tickAnim >= 100 && tickAnim < 136) {
            xx = 1 + (((tickAnim - 100) / 36) * (1-(1)));
            yy = 1 + (((tickAnim - 100) / 36) * (0.115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*0.5-(1)));
            zz = 1 + (((tickAnim - 100) / 36) * (1-(1)));
        }
        else if (tickAnim >= 136 && tickAnim < 182) {
            xx = 1 + (((tickAnim - 136) / 46) * (1-(1)));
            yy = 0.115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*0.5 + (((tickAnim - 136) / 46) * (1-(0.115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*0.5)));
            zz = 1 + (((tickAnim - 136) / 46) * (1-(1)));
        }
        else if (tickAnim >= 182 && tickAnim < 196) {
            xx = 1 + (((tickAnim - 182) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 182) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 182) / 14) * (1-(1)));
        }
        else if (tickAnim >= 196 && tickAnim < 210) {
            xx = 1 + (((tickAnim - 196) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 196) / 14) * (0.9925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1-(1)));
            zz = 1 + (((tickAnim - 196) / 14) * (1-(1)));
        }
        else if (tickAnim >= 210 && tickAnim < 226) {
            xx = 1 + (((tickAnim - 210) / 16) * (1-(1)));
            yy = 0.9925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1 + (((tickAnim - 210) / 16) * (1-(0.9925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1)));
            zz = 1 + (((tickAnim - 210) / 16) * (1-(1)));
        }
        else if (tickAnim >= 226 && tickAnim < 310) {
            xx = 1 + (((tickAnim - 226) / 84) * (1-(1)));
            yy = 1 + (((tickAnim - 226) / 84) * (1-(1)));
            zz = 1 + (((tickAnim - 226) / 84) * (1-(1)));
        }
        else if (tickAnim >= 310 && tickAnim < 338) {
            xx = 1 + (((tickAnim - 310) / 28) * (1-(1)));
            yy = 1 + (((tickAnim - 310) / 28) * (0.9125-(1)));
            zz = 1 + (((tickAnim - 310) / 28) * (1-(1)));
        }
        else if (tickAnim >= 338 && tickAnim < 374) {
            xx = 1 + (((tickAnim - 338) / 36) * (1-(1)));
            yy = 0.9125 + (((tickAnim - 338) / 36) * (0-(0.9125)));
            zz = 1 + (((tickAnim - 338) / 36) * (1-(1)));
        }
        else if (tickAnim >= 374 && tickAnim < 425) {
            xx = 1 + (((tickAnim - 374) / 51) * (1-(1)));
            yy = 0 + (((tickAnim - 374) / 51) * (0-(0)));
            zz = 1 + (((tickAnim - 374) / 51) * (1-(1)));
        }
        else if (tickAnim >= 425 && tickAnim < 446) {
            xx = 1 + (((tickAnim - 425) / 21) * (1-(1)));
            yy = 0 + (((tickAnim - 425) / 21) * (0.2675-(0)));
            zz = 1 + (((tickAnim - 425) / 21) * (1-(1)));
        }
        else if (tickAnim >= 446 && tickAnim < 460) {
            xx = 1 + (((tickAnim - 446) / 14) * (1-(1)));
            yy = 0.2675 + (((tickAnim - 446) / 14) * (0.315-(0.2675)));
            zz = 1 + (((tickAnim - 446) / 14) * (1-(1)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 1 + (((tickAnim - 460) / 40) * (1-(1)));
            yy = 0.315 + (((tickAnim - 460) / 40) * (0.39-(0.315)));
            zz = 1 + (((tickAnim - 460) / 40) * (1-(1)));
        }
        else if (tickAnim >= 500 && tickAnim < 561) {
            xx = 1 + (((tickAnim - 500) / 61) * (1-(1)));
            yy = 0.39 + (((tickAnim - 500) / 61) * (0-(0.39)));
            zz = 1 + (((tickAnim - 500) / 61) * (1-(1)));
        }
        else if (tickAnim >= 561 && tickAnim < 680) {
            xx = 1 + (((tickAnim - 561) / 119) * (1-(1)));
            yy = 0 + (((tickAnim - 561) / 119) * (0-(0)));
            zz = 1 + (((tickAnim - 561) / 119) * (1-(1)));
        }
        else if (tickAnim >= 680 && tickAnim < 706) {
            xx = 1 + (((tickAnim - 680) / 26) * (1-(1)));
            yy = 0 + (((tickAnim - 680) / 26) * (1-(0)));
            zz = 1 + (((tickAnim - 680) / 26) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;

        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0), legleft.rotateAngleY + (float) Math.toRadians(0), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(0), legleft3.rotateAngleY + (float) Math.toRadians(0), legleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0), legright.rotateAngleY + (float) Math.toRadians(0), legright.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 0) / 141) * (-0.08261-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*-3 + (((tickAnim - 0) / 141) * (-1.001+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*-3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 0) / 141) * (-1.7501+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 0) / 141) * (0.1062-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*-5 + (((tickAnim - 0) / 141) * (-0.0011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5 + (((tickAnim - 0) / 141) * (1.2545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 0) / 141) * (-0.8904-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-8 + (((tickAnim - 0) / 141) * (2.4021+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-8)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5 + (((tickAnim - 0) / 141) * (-9.098+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 0) / 141) * (1.27859-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-150))*-8 + (((tickAnim - 0) / 141) * (3.6153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-150))*-8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-150))*-8)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5 + (((tickAnim - 0) / 141) * (-9.9861+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 0) / 141) * (-0.28058-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-140))*-10 + (((tickAnim - 0) / 141) * (-0.014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-140))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-140))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*8 + (((tickAnim - 0) / 141) * (-5.7569+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -2.5 + (((tickAnim - 68) / 52) * (-2.5-(-2.5)));
            yy = -1.25 + (((tickAnim - 68) / 52) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -2.5 + (((tickAnim - 120) / 21) * (0-(-2.5)));
            yy = -1.25 + (((tickAnim - 120) / 21) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -2.25 + (((tickAnim - 68) / 52) * (-2.25-(-2.25)));
            yy = -0.75 + (((tickAnim - 68) / 52) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -2.25 + (((tickAnim - 120) / 21) * (0-(-2.25)));
            yy = -0.75 + (((tickAnim - 120) / 21) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (9.17361-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-2.00694-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 9.17361 + (((tickAnim - 14) / 16) * (14.25-(9.17361)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = -2.00694 + (((tickAnim - 14) / 16) * (-4.25-(-2.00694)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 14.25 + (((tickAnim - 30) / 38) * (11.5-(14.25)));
            yy = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            zz = -4.25 + (((tickAnim - 30) / 38) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 11.5 + (((tickAnim - 68) / 52) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = -4.25 + (((tickAnim - 68) / 52) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 11.5 + (((tickAnim - 120) / 10) * (2.23221-(11.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (2.6523-(0)));
            zz = -4.25 + (((tickAnim - 120) / 10) * (-15.47534-(-4.25)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 2.23221 + (((tickAnim - 130) / 11) * (0-(2.23221)));
            yy = 2.6523 + (((tickAnim - 130) / 11) * (0-(2.6523)));
            zz = -15.47534 + (((tickAnim - 130) / 11) * (0-(-15.47534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 0.275 + (((tickAnim - 14) / 16) * (-0.275-(0.275)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            yy = -0.275 + (((tickAnim - 30) / 38) * (-0.305-(-0.275)));
            zz = 0 + (((tickAnim - 30) / 38) * (0.25-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = -0.305 + (((tickAnim - 68) / 52) * (-0.305-(-0.305)));
            zz = 0.25 + (((tickAnim - 68) / 52) * (0.25-(0.25)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            yy = -0.305 + (((tickAnim - 120) / 10) * (0.09-(-0.305)));
            zz = 0.25 + (((tickAnim - 120) / 10) * (0.13-(0.25)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            yy = 0.09 + (((tickAnim - 130) / 11) * (0-(0.09)));
            zz = 0.13 + (((tickAnim - 130) / 11) * (0-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (2.71528-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -19.25 + (((tickAnim - 14) / 16) * (10.24349-(-19.25)));
            yy = 0 + (((tickAnim - 14) / 16) * (0.53138-(0)));
            zz = 2.71528 + (((tickAnim - 14) / 16) * (4.34726-(2.71528)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 10.24349 + (((tickAnim - 30) / 38) * (18.99349-(10.24349)));
            yy = 0.53138 + (((tickAnim - 30) / 38) * (0.53138-(0.53138)));
            zz = 4.34726 + (((tickAnim - 30) / 38) * (4.34726-(4.34726)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 18.99349 + (((tickAnim - 68) / 52) * (18.99349-(18.99349)));
            yy = 0.53138 + (((tickAnim - 68) / 52) * (0.53138-(0.53138)));
            zz = 4.34726 + (((tickAnim - 68) / 52) * (4.34726-(4.34726)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 18.99349 + (((tickAnim - 120) / 10) * (-25.37947-(18.99349)));
            yy = 0.53138 + (((tickAnim - 120) / 10) * (-5.15952-(0.53138)));
            zz = 4.34726 + (((tickAnim - 120) / 10) * (14.08477-(4.34726)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = -25.37947 + (((tickAnim - 130) / 11) * (0-(-25.37947)));
            yy = -5.15952 + (((tickAnim - 130) / 11) * (0-(-5.15952)));
            zz = 14.08477 + (((tickAnim - 130) / 11) * (0-(14.08477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 38) * (-0.455-(-0.5)));
            zz = 0 + (((tickAnim - 30) / 38) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = -0.455 + (((tickAnim - 68) / 52) * (-0.455-(-0.455)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = -0.455 + (((tickAnim - 120) / 21) * (0-(-0.455)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (75.96-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 75.96 + (((tickAnim - 14) / 16) * (-17.5-(75.96)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = -17.5 + (((tickAnim - 30) / 38) * (-27.75-(-17.5)));
            yy = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 38) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -27.75 + (((tickAnim - 68) / 52) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -27.75 + (((tickAnim - 120) / 10) * (72.57-(-27.75)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 72.57 + (((tickAnim - 130) / 11) * (0-(72.57)));
            yy = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            yy = 0.25 + (((tickAnim - 30) / 38) * (0.22-(0.25)));
            zz = 0 + (((tickAnim - 30) / 38) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0.22 + (((tickAnim - 68) / 52) * (0.22-(0.22)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = 0.22 + (((tickAnim - 120) / 21) * (0-(0.22)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 2.75 + (((tickAnim - 68) / 52) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 2.75 + (((tickAnim - 120) / 21) * (0-(2.75)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0.15-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0.15 + (((tickAnim - 68) / 52) * (0.15-(0.15)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0.15 + (((tickAnim - 120) / 21) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (-4-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 12.75 + (((tickAnim - 68) / 52) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = -4 + (((tickAnim - 68) / 52) * (-4-(-4)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 12.75 + (((tickAnim - 120) / 21) * (0-(12.75)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = -4 + (((tickAnim - 120) / 21) * (0-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 0) / 141) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 141) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -7.75 + (((tickAnim - 68) / 52) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -7.75 + (((tickAnim - 120) / 21) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-2.92675-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-11.2256-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.74535-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -2.92675 + (((tickAnim - 30) / 15) * (-1.92675-(-2.92675)));
            yy = -11.2256 + (((tickAnim - 30) / 15) * (-11.2256-(-11.2256)));
            zz = -0.74535 + (((tickAnim - 30) / 15) * (-0.74535-(-0.74535)));
        }
        else if (tickAnim >= 45 && tickAnim < 62) {
            xx = -1.92675 + (((tickAnim - 45) / 17) * (-2.92675-(-1.92675)));
            yy = -11.2256 + (((tickAnim - 45) / 17) * (-11.2256-(-11.2256)));
            zz = -0.74535 + (((tickAnim - 45) / 17) * (-0.74535-(-0.74535)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -2.92675 + (((tickAnim - 62) / 6) * (-2.42675-(-2.92675)));
            yy = -11.2256 + (((tickAnim - 62) / 6) * (-11.2256-(-11.2256)));
            zz = -0.74535 + (((tickAnim - 62) / 6) * (-0.74535-(-0.74535)));
        }
        else if (tickAnim >= 68 && tickAnim < 88) {
            xx = -2.42675 + (((tickAnim - 68) / 20) * (0.45745-(-2.42675)));
            yy = -11.2256 + (((tickAnim - 68) / 20) * (-2.36727-(-11.2256)));
            zz = -0.74535 + (((tickAnim - 68) / 20) * (1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*620-10))*4-(-0.74535)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = 0.45745 + (((tickAnim - 88) / 22) * (0.34028-(0.45745)));
            yy = -2.36727 + (((tickAnim - 88) / 22) * (3.9911-(-2.36727)));
            zz = 1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*620-10))*4 + (((tickAnim - 88) / 22) * (3.00443-(1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*620-10))*4)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0.34028 + (((tickAnim - 110) / 10) * (-2.90835-(0.34028)));
            yy = 3.9911 + (((tickAnim - 110) / 10) * (6.49105-(3.9911)));
            zz = 3.00443 + (((tickAnim - 110) / 10) * (3.01937-(3.00443)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -2.90835 + (((tickAnim - 120) / 21) * (0-(-2.90835)));
            yy = 6.49105 + (((tickAnim - 120) / 21) * (0-(6.49105)));
            zz = 3.01937 + (((tickAnim - 120) / 21) * (0-(3.01937)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.6-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 30) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 32) * (0-(0)));
            zz = 0.6 + (((tickAnim - 30) / 32) * (0.6-(0.6)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 0.6 + (((tickAnim - 62) / 6) * (0.6-(0.6)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0.6 + (((tickAnim - 68) / 52) * (0.6-(0.6)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0.6 + (((tickAnim - 120) / 21) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-6.71488-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-12.21133-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-3.00807-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -6.71488 + (((tickAnim - 30) / 15) * (-7.96488-(-6.71488)));
            yy = -12.21133 + (((tickAnim - 30) / 15) * (-12.21133-(-12.21133)));
            zz = -3.00807 + (((tickAnim - 30) / 15) * (-3.00807-(-3.00807)));
        }
        else if (tickAnim >= 45 && tickAnim < 62) {
            xx = -7.96488 + (((tickAnim - 45) / 17) * (-6.71488-(-7.96488)));
            yy = -12.21133 + (((tickAnim - 45) / 17) * (-12.21133-(-12.21133)));
            zz = -3.00807 + (((tickAnim - 45) / 17) * (-3.00807-(-3.00807)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -6.71488 + (((tickAnim - 62) / 6) * (-7.71488-(-6.71488)));
            yy = -12.21133 + (((tickAnim - 62) / 6) * (-12.21133-(-12.21133)));
            zz = -3.00807 + (((tickAnim - 62) / 6) * (-3.00807-(-3.00807)));
        }
        else if (tickAnim >= 68 && tickAnim < 88) {
            xx = -7.71488 + (((tickAnim - 68) / 20) * (-7.50574-(-7.71488)));
            yy = -12.21133 + (((tickAnim - 68) / 20) * (-1.43362-(-12.21133)));
            zz = -3.00807 + (((tickAnim - 68) / 20) * (1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*6-(-3.00807)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = -7.50574 + (((tickAnim - 88) / 22) * (-7.74238-(-7.50574)));
            yy = -1.43362 + (((tickAnim - 88) / 22) * (7.79017-(-1.43362)));
            zz = 1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*6 + (((tickAnim - 88) / 22) * (-0.55152-(1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*6)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -7.74238 + (((tickAnim - 110) / 10) * (-3.8551-(-7.74238)));
            yy = 7.79017 + (((tickAnim - 110) / 10) * (9.6713-(7.79017)));
            zz = -0.55152 + (((tickAnim - 110) / 10) * (2.25774-(-0.55152)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -3.8551 + (((tickAnim - 120) / 21) * (0-(-3.8551)));
            yy = 9.6713 + (((tickAnim - 120) / 21) * (0-(9.6713)));
            zz = 2.25774 + (((tickAnim - 120) / 21) * (0-(2.25774)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.15-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 30) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 32) * (0-(0)));
            zz = 0.15 + (((tickAnim - 30) / 32) * (0.15-(0.15)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 0.15 + (((tickAnim - 62) / 6) * (0.15-(0.15)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0.15 + (((tickAnim - 68) / 52) * (0.15-(0.15)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0.15 + (((tickAnim - 120) / 21) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.99525-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-10.70437-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-5.34324-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0.99525 + (((tickAnim - 30) / 15) * (-4.00475-(0.99525)));
            yy = -10.70437 + (((tickAnim - 30) / 15) * (-10.70437-(-10.70437)));
            zz = -5.34324 + (((tickAnim - 30) / 15) * (-5.34324-(-5.34324)));
        }
        else if (tickAnim >= 45 && tickAnim < 62) {
            xx = -4.00475 + (((tickAnim - 45) / 17) * (0.99525-(-4.00475)));
            yy = -10.70437 + (((tickAnim - 45) / 17) * (-10.70437-(-10.70437)));
            zz = -5.34324 + (((tickAnim - 45) / 17) * (-5.34324-(-5.34324)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0.99525 + (((tickAnim - 62) / 6) * (0.99525-(0.99525)));
            yy = -10.70437 + (((tickAnim - 62) / 6) * (-10.70437-(-10.70437)));
            zz = -5.34324 + (((tickAnim - 62) / 6) * (-5.34324-(-5.34324)));
        }
        else if (tickAnim >= 68 && tickAnim < 88) {
            xx = 0.99525 + (((tickAnim - 68) / 20) * (5.08248-(0.99525)));
            yy = -10.70437 + (((tickAnim - 68) / 20) * (1.02226-(-10.70437)));
            zz = -5.34324 + (((tickAnim - 68) / 20) * (1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*8-(-5.34324)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = 5.08248 + (((tickAnim - 88) / 22) * (0.16695-(5.08248)));
            yy = 1.02226 + (((tickAnim - 88) / 22) * (7.49891-(1.02226)));
            zz = 1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*8 + (((tickAnim - 88) / 22) * (0.7533-(1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*8)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0.16695 + (((tickAnim - 110) / 10) * (9.1697-(0.16695)));
            yy = 7.49891 + (((tickAnim - 110) / 10) * (12.74889-(7.49891)));
            zz = 0.7533 + (((tickAnim - 110) / 10) * (0.76896-(0.7533)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 9.1697 + (((tickAnim - 120) / 21) * (0-(9.1697)));
            yy = 12.74889 + (((tickAnim - 120) / 21) * (0-(12.74889)));
            zz = 0.76896 + (((tickAnim - 120) / 21) * (0-(0.76896)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 0) / 45) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 45) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 45) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 57) {
            xx = 1 + (((tickAnim - 45) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 45) / 12) * (0.05-(1)));
            zz = 1 + (((tickAnim - 45) / 12) * (1-(1)));
        }
        else if (tickAnim >= 57 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 57) / 11) * (1-(1)));
            yy = 0.05 + (((tickAnim - 57) / 11) * (1-(0.05)));
            zz = 1 + (((tickAnim - 57) / 11) * (1-(1)));
        }
        else if (tickAnim >= 68 && tickAnim < 110) {
            xx = 1 + (((tickAnim - 68) / 42) * (1-(1)));
            yy = 1 + (((tickAnim - 68) / 42) * (1-(1)));
            zz = 1 + (((tickAnim - 68) / 42) * (1-(1)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 1 + (((tickAnim - 110) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 110) / 5) * (0.1475-(1)));
            zz = 1 + (((tickAnim - 110) / 5) * (1-(1)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 115) / 5) * (1-(1)));
            yy = 0.1475 + (((tickAnim - 115) / 5) * (1-(0.1475)));
            zz = 1 + (((tickAnim - 115) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -8.25 + (((tickAnim - 0) / 6) * (1.89-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1.89 + (((tickAnim - 6) / 7) * (15.2-(1.89)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 15.2 + (((tickAnim - 13) / 9) * (36.2892+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75))*3-(15.2)));
            yy = 0 + (((tickAnim - 13) / 9) * (-2.18464-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (-2.05655-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 36.2892+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75))*3 + (((tickAnim - 22) / 9) * (1.97265-(36.2892+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75))*3)));
            yy = -2.18464 + (((tickAnim - 22) / 9) * (-2.6676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-2.18464)));
            zz = -2.05655 + (((tickAnim - 22) / 9) * (-1.45626-(-2.05655)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 1.97265 + (((tickAnim - 31) / 6) * (-13.5-(1.97265)));
            yy = -2.6676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 31) / 6) * (0-(-2.6676+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
            zz = -1.45626 + (((tickAnim - 31) / 6) * (0-(-1.45626)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -13.5 + (((tickAnim - 37) / 3) * (-8.25-(-13.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.8 + (((tickAnim - 0) / 3) * (-0.98+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.15-(-0.8)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.98+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.15 + (((tickAnim - 3) / 3) * (-0.8-(-0.98+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 6) / 16) * (0-(0)));
            yy = -0.8 + (((tickAnim - 6) / 16) * (-0.2-(-0.8)));
            zz = 0 + (((tickAnim - 6) / 16) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            yy = -0.2 + (((tickAnim - 22) / 9) * (-0.25-(-0.2)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 31) / 6) * (-0.8-(-0.25)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = -0.8 + (((tickAnim - 37) / 3) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 7.23624 + (((tickAnim - 0) / 13) * (2.80199-(7.23624)));
            yy = 0.01828 + (((tickAnim - 0) / 13) * (-0.22568-(0.01828)));
            zz = -0.29773 + (((tickAnim - 0) / 13) * (-1.37083-(-0.29773)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 2.80199 + (((tickAnim - 13) / 4) * (8.04053-(2.80199)));
            yy = -0.22568 + (((tickAnim - 13) / 4) * (-0.25191-(-0.22568)));
            zz = -1.37083 + (((tickAnim - 13) / 4) * (1.37907-(-1.37083)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 8.04053 + (((tickAnim - 17) / 6) * (21.944-(8.04053)));
            yy = -0.25191 + (((tickAnim - 17) / 6) * (-0.99734-(-0.25191)));
            zz = 1.37907 + (((tickAnim - 17) / 6) * (2.61121-(1.37907)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 21.944 + (((tickAnim - 23) / 8) * (2.96903-(21.944)));
            yy = -0.99734 + (((tickAnim - 23) / 8) * (1.19755-(-0.99734)));
            zz = 2.61121 + (((tickAnim - 23) / 8) * (0.59033-(2.61121)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 2.96903 + (((tickAnim - 31) / 6) * (-0.76376-(2.96903)));
            yy = 1.19755 + (((tickAnim - 31) / 6) * (0.01828-(1.19755)));
            zz = 0.59033 + (((tickAnim - 31) / 6) * (-0.29773-(0.59033)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.76376 + (((tickAnim - 37) / 3) * (7.23624-(-0.76376)));
            yy = 0.01828 + (((tickAnim - 37) / 3) * (0.01828-(0.01828)));
            zz = -0.29773 + (((tickAnim - 37) / 3) * (-0.29773-(-0.29773)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 3) * (0.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.3))*0.25-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.3))*0.25 + (((tickAnim - 3) / 1) * (0.075-(0.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.3))*0.25)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 4) / 4) * (0.3-(0.075)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 5) * (0.4-(0.3)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 13) / 4) * (0.125-(0.4)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.125 + (((tickAnim - 17) / 6) * (0.81-(0.125)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0.81 + (((tickAnim - 23) / 8) * (0.95-(0.81)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = 0.95 + (((tickAnim - 31) / 6) * (-0.25-(0.95)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 37) / 3) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.75 + (((tickAnim - 0) / 4) * (-4-(0.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -4 + (((tickAnim - 4) / 3) * (-8.21984-(-4)));
            yy = 0 + (((tickAnim - 4) / 3) * (0.62964-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0.86699-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -8.21984 + (((tickAnim - 7) / 1) * (-8.94973-(-8.21984)));
            yy = 0.62964 + (((tickAnim - 7) / 1) * (1.0494-(0.62964)));
            zz = 0.86699 + (((tickAnim - 7) / 1) * (1.44499-(0.86699)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -8.94973 + (((tickAnim - 8) / 5) * (-17.47406-(-8.94973)));
            yy = 1.0494 + (((tickAnim - 8) / 5) * (1.46916-(1.0494)));
            zz = 1.44499 + (((tickAnim - 8) / 5) * (2.02299-(1.44499)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -17.47406 + (((tickAnim - 13) / 4) * (-8.47406-(-17.47406)));
            yy = 1.46916 + (((tickAnim - 13) / 4) * (1.46916-(1.46916)));
            zz = 2.02299 + (((tickAnim - 13) / 4) * (2.02299-(2.02299)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -8.47406 + (((tickAnim - 17) / 6) * (27.465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-3-(-8.47406)));
            yy = 1.46916 + (((tickAnim - 17) / 6) * (0-(1.46916)));
            zz = 2.02299 + (((tickAnim - 17) / 6) * (0-(2.02299)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 27.465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-3 + (((tickAnim - 23) / 8) * (-15.75-(27.465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-3)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -15.75 + (((tickAnim - 31) / 4) * (-1.15-(-15.75)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -1.15 + (((tickAnim - 35) / 2) * (15.25-(-1.15)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 15.25 + (((tickAnim - 37) / 3) * (0.75-(15.25)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 0) / 3) * (0.8-(0.925)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.8 + (((tickAnim - 3) / 1) * (0.995-(0.8)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.995 + (((tickAnim - 4) / 3) * (0.59-(0.995)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.59 + (((tickAnim - 7) / 1) * (0.41-(0.59)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.41 + (((tickAnim - 8) / 5) * (0.03-(0.41)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 13) / 24) * (0-(0)));
            yy = 0.03 + (((tickAnim - 13) / 24) * (0.375-(0.03)));
            zz = 0 + (((tickAnim - 13) / 24) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 37) / 3) * (0.925-(0.375)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -2.88992 + (((tickAnim - 0) / 7) * (-30.6927-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-2.88992)));
            yy = -10.94029 + (((tickAnim - 0) / 7) * (-0.1875-(-10.94029)));
            zz = -18.35467 + (((tickAnim - 0) / 7) * (-29.789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-18.35467)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -30.6927-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 7) / 6) * (-30-(-30.6927-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -0.1875 + (((tickAnim - 7) / 6) * (0-(-0.1875)));
            zz = -29.789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 7) / 6) * (0-(-29.789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -30 + (((tickAnim - 13) / 10) * (-9.69008-(-30)));
            yy = 0 + (((tickAnim - 13) / 10) * (-5.67771-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-0.65598-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -9.69008 + (((tickAnim - 23) / 9) * (7.03369-(-9.69008)));
            yy = -5.67771 + (((tickAnim - 23) / 9) * (-10.48193-(-5.67771)));
            zz = -0.65598 + (((tickAnim - 23) / 9) * (-1.21105-(-0.65598)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 7.03369 + (((tickAnim - 32) / 4) * (9.06425-(7.03369)));
            yy = -10.48193 + (((tickAnim - 32) / 4) * (-10.66528-(-10.48193)));
            zz = -1.21105 + (((tickAnim - 32) / 4) * (-8.0685-(-1.21105)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 9.06425 + (((tickAnim - 36) / 4) * (-2.88992-(9.06425)));
            yy = -10.66528 + (((tickAnim - 36) / 4) * (-10.94029-(-10.66528)));
            zz = -8.0685 + (((tickAnim - 36) / 4) * (-18.35467-(-8.0685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 7) * (1.175-(0.75)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 1.175 + (((tickAnim - 7) / 6) * (-0.1-(1.175)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 4) * (-0.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.1))*0.35-(-0.1)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -0.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.1))*0.35 + (((tickAnim - 17) / 6) * (0.15-(-0.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.1))*0.35)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0.15 + (((tickAnim - 23) / 9) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 32) / 4) * (0.52-(0.15)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.52 + (((tickAnim - 36) / 4) * (0.75-(0.52)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -35.97372 + (((tickAnim - 0) / 7) * (-31.41449-(-35.97372)));
            yy = 1.07468 + (((tickAnim - 0) / 7) * (-1.70123-(1.07468)));
            zz = 2.80107 + (((tickAnim - 0) / 7) * (10.74539-(2.80107)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -31.41449 + (((tickAnim - 7) / 6) * (-2.5-(-31.41449)));
            yy = -1.70123 + (((tickAnim - 7) / 6) * (0-(-1.70123)));
            zz = 10.74539 + (((tickAnim - 7) / 6) * (0-(10.74539)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -2.5 + (((tickAnim - 13) / 10) * (-3-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -3 + (((tickAnim - 23) / 9) * (5.75-(-3)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 5.75 + (((tickAnim - 32) / 8) * (-35.97372-(5.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (1.07468-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (2.80107-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 13) * (-0.13-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.13 + (((tickAnim - 13) / 4) * (-0.505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.75-(-0.13)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.75 + (((tickAnim - 17) / 2) * (-0.095-(-0.505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.75)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -0.095 + (((tickAnim - 19) / 4) * (-0.15-(-0.095)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 23) / 9) * (-0.42-(-0.15)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = -0.42 + (((tickAnim - 32) / 8) * (-0.175-(-0.42)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 84 + (((tickAnim - 0) / 7) * (74.96-(84)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 74.96 + (((tickAnim - 7) / 4) * (25.8-(74.96)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 25.8 + (((tickAnim - 11) / 2) * (31.75-(25.8)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 31.75 + (((tickAnim - 13) / 10) * (13.5-(31.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 13.5 + (((tickAnim - 23) / 4) * (1.5-(13.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 1.5 + (((tickAnim - 27) / 5) * (-3.37552-(1.5)));
            yy = 0 + (((tickAnim - 27) / 5) * (0.14868-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (-1.25492-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.37552 + (((tickAnim - 32) / 8) * (84-(-3.37552)));
            yy = 0.14868 + (((tickAnim - 32) / 8) * (0-(0.14868)));
            zz = -1.25492 + (((tickAnim - 32) / 8) * (0-(-1.25492)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0.075-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0.075 + (((tickAnim - 27) / 13) * (0-(0.075)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 26.25 + (((tickAnim - 0) / 4) * (32-(26.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 32 + (((tickAnim - 4) / 8) * (2.89644-(32)));
            yy = 0 + (((tickAnim - 4) / 8) * (5.2982+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-250))*0.5-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (1.95427-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 2.89644 + (((tickAnim - 12) / 6) * (-13.5-(2.89644)));
            yy = 5.2982+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-250))*0.5 + (((tickAnim - 12) / 6) * (0-(5.2982+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-250))*0.5)));
            zz = 1.95427 + (((tickAnim - 12) / 6) * (0-(1.95427)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -13.5 + (((tickAnim - 18) / 5) * (-2.13-(-13.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -2.13 + (((tickAnim - 23) / 17) * (26.25-(-2.13)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0.525 + (((tickAnim - 12) / 6) * (-0.4-(0.525)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.4 + (((tickAnim - 18) / 2) * (-0.195+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*0.35-(-0.4)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.195+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*0.35 + (((tickAnim - 20) / 3) * (0.125-(-0.195+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*0.35)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 23) / 5) * (-0.23-(0.125)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -0.23 + (((tickAnim - 28) / 12) * (0-(-0.23)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10.18085 + (((tickAnim - 0) / 4) * (14.41085-(10.18085)));
            yy = 1.95337 + (((tickAnim - 0) / 4) * (1.73854-(1.95337)));
            zz = -4.05471 + (((tickAnim - 0) / 4) * (-2.33428-(-4.05471)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 14.41085 + (((tickAnim - 4) / 7) * (3.53685-(14.41085)));
            yy = 1.73854 + (((tickAnim - 4) / 7) * (1.48073-(1.73854)));
            zz = -2.33428 + (((tickAnim - 4) / 7) * (-0.26976-(-2.33428)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 3.53685 + (((tickAnim - 11) / 4) * (-7.55497-(3.53685)));
            yy = 1.48073 + (((tickAnim - 11) / 4) * (0.94561-(1.48073)));
            zz = -0.26976 + (((tickAnim - 11) / 4) * (-0.17227-(-0.26976)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -7.55497 + (((tickAnim - 15) / 3) * (0-(-7.55497)));
            yy = 0.94561 + (((tickAnim - 15) / 3) * (0-(0.94561)));
            zz = -0.17227 + (((tickAnim - 15) / 3) * (0-(-0.17227)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0.09823-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.5209-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-1.08126-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0.09823 + (((tickAnim - 23) / 10) * (-0.4146-(0.09823)));
            yy = 0.5209 + (((tickAnim - 23) / 10) * (1.51418-(0.5209)));
            zz = -1.08126 + (((tickAnim - 23) / 10) * (-3.14307-(-1.08126)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.4146 + (((tickAnim - 33) / 7) * (10.18085-(-0.4146)));
            yy = 1.51418 + (((tickAnim - 33) / 7) * (1.95337-(1.51418)));
            zz = -3.14307 + (((tickAnim - 33) / 7) * (-4.05471-(-3.14307)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.185-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.01-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1.185 + (((tickAnim - 11) / 4) * (0.82-(1.185)));
            zz = 0.01 + (((tickAnim - 11) / 4) * (0-(0.01)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.82 + (((tickAnim - 15) / 3) * (-0.05-(0.82)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 18) / 2) * (0.055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.35-(-0.05)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.35 + (((tickAnim - 20) / 3) * (-0.025-(0.055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = -0.025 + (((tickAnim - 23) / 10) * (0.22-(-0.025)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.22 + (((tickAnim - 33) / 7) * (0-(0.22)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.75 + (((tickAnim - 0) / 4) * (29.98-(2.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 29.98 + (((tickAnim - 4) / 7) * (8.75-(29.98)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 8.75 + (((tickAnim - 11) / 4) * (-7.31-(8.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -7.31 + (((tickAnim - 15) / 3) * (13.75-(-7.31)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 13.75 + (((tickAnim - 18) / 5) * (2.35-(13.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 2.35 + (((tickAnim - 23) / 5) * (-8.58-(2.35)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -8.58 + (((tickAnim - 28) / 5) * (-12.85-(-8.58)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -12.85 + (((tickAnim - 33) / 7) * (2.75-(-12.85)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.15-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 18) / 2) * (0.25-(0.15)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 20) / 3) * (0.15-(0.25)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 23) / 5) * (0.315-(0.15)));
            zz = 0 + (((tickAnim - 23) / 5) * (0.22-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0.315 + (((tickAnim - 28) / 5) * (-0.2-(0.315)));
            zz = 0.22 + (((tickAnim - 28) / 5) * (0.4-(0.22)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 33) / 7) * (0-(-0.2)));
            zz = 0.4 + (((tickAnim - 33) / 7) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9.73194 + (((tickAnim - 0) / 10) * (2.70876-(-9.73194)));
            yy = 5.20281 + (((tickAnim - 0) / 10) * (11.24956-(5.20281)));
            zz = 0.92971 + (((tickAnim - 0) / 10) * (1.92303-(0.92971)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 2.70876 + (((tickAnim - 10) / 6) * (7.39901-(2.70876)));
            yy = 11.24956 + (((tickAnim - 10) / 6) * (4.86486-(11.24956)));
            zz = 1.92303 + (((tickAnim - 10) / 6) * (10.18541-(1.92303)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 7.39901 + (((tickAnim - 16) / 7) * (-34.2349+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(7.39901)));
            yy = 4.86486 + (((tickAnim - 16) / 7) * (-1.62128-(4.86486)));
            zz = 10.18541 + (((tickAnim - 16) / 7) * (16.78775-(10.18541)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -34.2349+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 23) / 7) * (-35.00801-(-34.2349+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -1.62128 + (((tickAnim - 23) / 7) * (-0.12069-(-1.62128)));
            zz = 16.78775 + (((tickAnim - 23) / 7) * (0.25493-(16.78775)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -35.00801 + (((tickAnim - 30) / 10) * (-9.73194-(-35.00801)));
            yy = -0.12069 + (((tickAnim - 30) / 10) * (5.20281-(-0.12069)));
            zz = 0.25493 + (((tickAnim - 30) / 10) * (0.92971-(0.25493)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 10) * (-0.3-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -0.3 + (((tickAnim - 10) / 6) * (0.19-(-0.3)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.19 + (((tickAnim - 16) / 7) * (1.225-(0.19)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 1.225 + (((tickAnim - 23) / 7) * (-0.4-(1.225)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = -0.4 + (((tickAnim - 30) / 4) * (0.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.1))*0.35-(-0.4)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.1))*0.35 + (((tickAnim - 34) / 6) * (-0.05-(0.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.1))*0.35)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -6 + (((tickAnim - 0) / 10) * (5.75-(-6)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 5.75 + (((tickAnim - 10) / 6) * (-26.97784-(5.75)));
            yy = 0 + (((tickAnim - 10) / 6) * (-0.74218-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (-3.4205-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -26.97784 + (((tickAnim - 16) / 7) * (-28.47784-(-26.97784)));
            yy = -0.74218 + (((tickAnim - 16) / 7) * (-0.74218-(-0.74218)));
            zz = -3.4205 + (((tickAnim - 16) / 7) * (-3.4205-(-3.4205)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -28.47784 + (((tickAnim - 23) / 7) * (5.5-(-28.47784)));
            yy = -0.74218 + (((tickAnim - 23) / 7) * (0-(-0.74218)));
            zz = -3.4205 + (((tickAnim - 23) / 7) * (0-(-3.4205)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5.5 + (((tickAnim - 30) / 10) * (-6-(5.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 10) * (0.02-(0.1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0.02 + (((tickAnim - 10) / 13) * (0-(0.02)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0.25-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 30) / 4) * (0.655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.75-(0.25)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0.655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.75 + (((tickAnim - 34) / 4) * (-0.075-(0.655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.3))*-0.75)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.075 + (((tickAnim - 38) / 2) * (0.1-(-0.075)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 16.75 + (((tickAnim - 0) / 10) * (-9.75-(16.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -9.75 + (((tickAnim - 10) / 6) * (86-(-9.75)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 86 + (((tickAnim - 16) / 7) * (94.5-(86)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 94.5 + (((tickAnim - 23) / 5) * (26.31-(94.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 26.31 + (((tickAnim - 28) / 2) * (32.25-(26.31)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 32.25 + (((tickAnim - 30) / 10) * (16.75-(32.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0.05 + (((tickAnim - 10) / 13) * (0-(0.05)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0.375-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.375 + (((tickAnim - 30) / 10) * (0-(0.375)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-2), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3), main.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3.5));

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 0) / 9) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 0) / 6) * (-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 6) * (-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 0) / 6) * (-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = -0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 6) / 13) * (-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 6) / 13) * (-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 6) / 13) * (-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 19) / 5) * (-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 19) / 5) * (-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 19) / 5) * (2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 24) / 8) * (-3.35325-(-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 24) / 8) * (-4.59467-(-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 24) / 8) * (0.91332-(2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.35325 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-3.35325)));
            yy = -4.59467 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-4.59467)));
            zz = 0.91332 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0.91332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*7.5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*3), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(xx);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(yy);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*12), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*5));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail5.rotationPointX = this.Tail5.rotationPointX + (float)(xx);
        this.Tail5.rotationPointY = this.Tail5.rotationPointY - (float)(yy);
        this.Tail5.rotationPointZ = this.Tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 0) / 4) * (-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999)));
        }
        else if (tickAnim >= 4 && tickAnim < 40) {
            xx = -0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 4) / 36) * (-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*-3.051), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-2.878), Chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+99))*-3.62));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 4) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 26) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*5), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDracopelta entity = (EntityPrehistoricFloraDracopelta) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-10))*2.5), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3.5), main.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -11.75 + (((tickAnim - 0) / 8) * (48.75-(-11.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 48.75 + (((tickAnim - 8) / 4) * (14.66343-(48.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (-8.46921-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-2.20693-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 14.66343 + (((tickAnim - 12) / 3) * (-11.75-(14.66343)));
            yy = -8.46921 + (((tickAnim - 12) / 3) * (0-(-8.46921)));
            zz = -2.20693 + (((tickAnim - 12) / 3) * (0-(-2.20693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 12) * (0.83-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.83 + (((tickAnim - 12) / 3) * (-0.525-(0.83)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10.5 + (((tickAnim - 0) / 8) * (7.25-(-10.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 7.25 + (((tickAnim - 8) / 4) * (21.62-(7.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 21.62 + (((tickAnim - 12) / 3) * (-10.5-(21.62)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.82-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.82 + (((tickAnim - 3) / 1) * (-0.125-(0.82)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = -0.125 + (((tickAnim - 4) / 8) * (1.14-(-0.125)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.14 + (((tickAnim - 12) / 3) * (0-(1.14)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 22.25 + (((tickAnim - 0) / 4) * (-17.75-(22.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -17.75 + (((tickAnim - 4) / 4) * (39-(-17.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 39 + (((tickAnim - 8) / 4) * (15.75-(39)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 15.75 + (((tickAnim - 12) / 2) * (-24.63-(15.75)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -24.63 + (((tickAnim - 14) / 1) * (22.25-(-24.63)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 44 + (((tickAnim - 0) / 5) * (7.92046-(44)));
            yy = 0 + (((tickAnim - 0) / 5) * (8.27456-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.68521-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7.92046 + (((tickAnim - 5) / 3) * (-4.25-(7.92046)));
            yy = 8.27456 + (((tickAnim - 5) / 3) * (0-(8.27456)));
            zz = 2.68521 + (((tickAnim - 5) / 3) * (0-(2.68521)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -4.25 + (((tickAnim - 8) / 7) * (44-(-4.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.675 + (((tickAnim - 5) / 3) * (0-(0.675)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 26.18722 + (((tickAnim - 0) / 5) * (3.20988-(26.18722)));
            yy = 1.52135 + (((tickAnim - 0) / 5) * (0.88788-(1.52135)));
            zz = -6.25242 + (((tickAnim - 0) / 5) * (-5.17458-(-6.25242)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 3.20988 + (((tickAnim - 5) / 3) * (-8.20188-(3.20988)));
            yy = 0.88788 + (((tickAnim - 5) / 3) * (1.02457-(0.88788)));
            zz = -5.17458 + (((tickAnim - 5) / 3) * (1.91234-(-5.17458)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -8.20188 + (((tickAnim - 8) / 3) * (0.19403-(-8.20188)));
            yy = 1.02457 + (((tickAnim - 8) / 3) * (1.21086-(1.02457)));
            zz = 1.91234 + (((tickAnim - 8) / 3) * (-1.14945-(1.91234)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.19403 + (((tickAnim - 11) / 4) * (26.18722-(0.19403)));
            yy = 1.21086 + (((tickAnim - 11) / 4) * (1.52135-(1.21086)));
            zz = -1.14945 + (((tickAnim - 11) / 4) * (-6.25242-(-1.14945)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.2 + (((tickAnim - 0) / 5) * (0-(0.2)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.225-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.225 + (((tickAnim - 5) / 3) * (0-(1.225)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0.07-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.07 + (((tickAnim - 11) / 4) * (0.2-(0.07)));
            yy = -0.175 + (((tickAnim - 11) / 4) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.25 + (((tickAnim - 0) / 5) * (3.75-(19.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 3.75 + (((tickAnim - 5) / 3) * (-16.37-(3.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -16.37 + (((tickAnim - 8) / 0) * (12-(-16.37)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 12 + (((tickAnim - 8) / 3) * (-15.03-(12)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -15.03 + (((tickAnim - 11) / 4) * (19.25-(-15.03)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.545-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.545 + (((tickAnim - 8) / 3) * (0.225-(0.545)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);

        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-3), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-10), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-3), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-5), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-15), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+10))*-3), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);

        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.14482 + (((tickAnim - 0) / 3) * (-6.63644-(27.14482)));
            yy = -12.48101 + (((tickAnim - 0) / 3) * (8.88031-(-12.48101)));
            zz = -3.71297 + (((tickAnim - 0) / 3) * (-18.49374-(-3.71297)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -6.63644 + (((tickAnim - 3) / 4) * (-50-(-6.63644)));
            yy = 8.88031 + (((tickAnim - 3) / 4) * (0-(8.88031)));
            zz = -18.49374 + (((tickAnim - 3) / 4) * (0-(-18.49374)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -50 + (((tickAnim - 7) / 5) * (-6.26984-(-50)));
            yy = 0 + (((tickAnim - 7) / 5) * (-9.19613-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-2.53318-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -6.26984 + (((tickAnim - 12) / 3) * (27.14482-(-6.26984)));
            yy = -9.19613 + (((tickAnim - 12) / 3) * (-12.48101-(-9.19613)));
            zz = -2.53318 + (((tickAnim - 12) / 3) * (-3.71297-(-2.53318)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.625 + (((tickAnim - 3) / 4) * (-0.9-(0.625)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.9 + (((tickAnim - 7) / 5) * (-0.005-(-0.9)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17 + (((tickAnim - 0) / 3) * (-45.94-(-17)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -45.94 + (((tickAnim - 3) / 4) * (14-(-45.94)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 14 + (((tickAnim - 7) / 5) * (9.68669-(14)));
            yy = 0 + (((tickAnim - 7) / 5) * (-0.41769-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.9086-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 9.68669 + (((tickAnim - 12) / 3) * (-17-(9.68669)));
            yy = -0.41769 + (((tickAnim - 12) / 3) * (0-(-0.41769)));
            zz = 0.9086 + (((tickAnim - 12) / 3) * (0-(0.9086)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0.375-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-0.275-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 12) / 3) * (0-(0.375)));
            zz = -0.275 + (((tickAnim - 12) / 3) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 91.5 + (((tickAnim - 0) / 3) * (102.31-(91.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 102.31 + (((tickAnim - 3) / 3) * (1.52-(102.31)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 1.52 + (((tickAnim - 6) / 1) * (35-(1.52)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 35 + (((tickAnim - 7) / 5) * (0.77414-(35)));
            yy = 0 + (((tickAnim - 7) / 5) * (0.65305-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-4.117-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0.77414 + (((tickAnim - 12) / 3) * (91.5-(0.77414)));
            yy = 0.65305 + (((tickAnim - 12) / 3) * (0-(0.65305)));
            zz = -4.117 + (((tickAnim - 12) / 3) * (0-(-4.117)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.05 + (((tickAnim - 0) / 7) * (0-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 7) / 2) * (1.16-(0.25)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.16 + (((tickAnim - 9) / 3) * (0.075-(1.16)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (-0.05-(0)));
            yy = 0.075 + (((tickAnim - 12) / 3) * (0-(0.075)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -38.75 + (((tickAnim - 0) / 4) * (-6.37-(-38.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -6.37 + (((tickAnim - 4) / 4) * (27.75-(-6.37)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 27.75 + (((tickAnim - 8) / 4) * (-20.04152-(27.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (-13.12539-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (16.19546-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -20.04152 + (((tickAnim - 12) / 3) * (-38.75-(-20.04152)));
            yy = -13.12539 + (((tickAnim - 12) / 3) * (0-(-13.12539)));
            zz = 16.19546 + (((tickAnim - 12) / 3) * (0-(16.19546)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 8) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (1.025-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.025 + (((tickAnim - 12) / 3) * (-0.1-(1.025)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 3.75 + (((tickAnim - 0) / 4) * (5.75-(3.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.75 + (((tickAnim - 4) / 4) * (-33.25-(5.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -33.25 + (((tickAnim - 8) / 4) * (-35.44-(-33.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -35.44 + (((tickAnim - 12) / 3) * (3.75-(-35.44)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0.375 + (((tickAnim - 4) / 11) * (0-(0.375)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 36.97828 + (((tickAnim - 0) / 4) * (3.73278-(36.97828)));
            yy = -1.43852 + (((tickAnim - 0) / 4) * (-0.35917-(-1.43852)));
            zz = 1.73026 + (((tickAnim - 0) / 4) * (5.4883-(1.73026)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 3.73278 + (((tickAnim - 4) / 4) * (89-(3.73278)));
            yy = -0.35917 + (((tickAnim - 4) / 4) * (0-(-0.35917)));
            zz = 5.4883 + (((tickAnim - 4) / 4) * (0-(5.4883)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 89 + (((tickAnim - 8) / 4) * (101.81-(89)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 101.81 + (((tickAnim - 12) / 1) * (12.91-(101.81)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.91 + (((tickAnim - 13) / 2) * (36.97828-(12.91)));
            yy = 0 + (((tickAnim - 13) / 2) * (-1.43852-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (1.73026-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.02-(0)));
            yy = 0.275 + (((tickAnim - 0) / 2) * (0.85-(0.275)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0.02 + (((tickAnim - 2) / 2) * (0.06-(0.02)));
            yy = 0.85 + (((tickAnim - 2) / 2) * (0.165-(0.85)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.06 + (((tickAnim - 4) / 4) * (0.1-(0.06)));
            yy = 0.165 + (((tickAnim - 4) / 4) * (0-(0.165)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.1 + (((tickAnim - 8) / 7) * (0-(0.1)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.275-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-3), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*-5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(10.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-6), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDracopelta e = (EntityPrehistoricFloraDracopelta) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
