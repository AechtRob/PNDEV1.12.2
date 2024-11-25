package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCaerorhachis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCaerorhachis extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer armrw;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armr3w;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armlw;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer arml3w;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r26;

    private ModelAnimator animator;

    public ModelCaerorhachis() {
        this.textureWidth = 48;
        this.textureHeight = 40;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 20.725F, 4.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.575F, 0.25F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 26, -1.0F, -1.0F, -1.0F, 2, 1, 4, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 2.425F, 0.2F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 14, -2.0F, -2.0F, -1.0F, 3, 2, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.425F, 3.2F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3054F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 8, -1.0F, -0.25F, -0.35F, 2, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 4.75F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 15, -0.5F, 0.0F, -0.35F, 1, 1, 5, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 0, -0.5F, -0.5F, -0.35F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.75F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 20, -0.5F, -0.4995F, -0.3282F, 1, 1, 5, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0005F, 4.6718F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0349F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 21, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.5F, 1.675F, 1.95F);
        this.hips.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -0.3491F, -0.0873F);
        this.legright.cubeList.add(new ModelBox(legright, 20, 6, -2.0F, -0.5F, -0.75F, 3, 1, 1, 0.0F, false));
        this.legright.cubeList.add(new ModelBox(legright, 34, 30, -2.0F, -0.5F, -0.25F, 3, 1, 1, -0.01F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-2.0F, -0.5F, 0.0F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.0F, 0.3927F);
        this.legright2.cubeList.add(new ModelBox(legright2, 6, 36, 0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.0F, -0.288F);
        this.legright3.cubeList.add(new ModelBox(legright3, 28, 12, -2.0F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.5F, 1.675F, 1.95F);
        this.hips.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.3491F, 0.0873F);
        this.legleft.cubeList.add(new ModelBox(legleft, 20, 6, -1.0F, -0.5F, -0.75F, 3, 1, 1, 0.0F, true));
        this.legleft.cubeList.add(new ModelBox(legleft, 34, 30, -1.0F, -0.5F, -0.25F, 3, 1, 1, -0.01F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(2.0F, -0.5F, 0.0F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.0F, -0.3927F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 6, 36, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.0F, 0.288F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 28, 12, -1.0F, 0.0F, -1.5F, 3, 0, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.25F, -0.5F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.077F, 0.35F, -5.506F, 4, 2, 6, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 27, -1.577F, -0.875F, -2.556F, 3, 2, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.423F, 0.325F, -4.406F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 20, -2.0F, -1.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(-0.077F, 1.0F, -5.506F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 14, 8, -1.5F, -0.65F, -3.0F, 3, 2, 4, -0.01F, false));
        this.chest.cubeList.add(new ModelBox(chest, 28, 6, -1.875F, -0.65F, -3.0F, 1, 2, 4, -0.02F, false));
        this.chest.cubeList.add(new ModelBox(chest, 28, 6, 0.875F, -0.65F, -3.0F, 1, 2, 4, -0.02F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.45F, -2.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0611F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 25, -1.0F, -1.0F, -1.0F, 2, 1, 4, -0.01F, false));

        this.armrw = new AdvancedModelRenderer(this);
        this.armrw.setRotationPoint(-1.75F, 0.65F, -1.9F);
        this.chest.addChild(armrw);


        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armrw.addChild(armright);
        this.setRotateAngle(armright, -0.1309F, 0.1309F, -0.2443F);
        this.armright.cubeList.add(new ModelBox(armright, 34, 32, -1.75F, -0.5F, -0.5F, 2, 1, 1, 0.01F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-1.75F, -0.5F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, 0.0F, -0.8727F);
        this.armright2.cubeList.add(new ModelBox(armright2, 0, 38, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.armright2.cubeList.add(new ModelBox(armright2, 38, 6, -1.5F, 0.0F, -0.5F, 1, 1, 1, -0.01F, false));

        this.armr3w = new AdvancedModelRenderer(this);
        this.armr3w.setRotationPoint(-1.5F, 0.2F, -0.25F);
        this.armright2.addChild(armr3w);


        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armr3w.addChild(armright3);
        this.setRotateAngle(armright3, 0.6109F, 0.1134F, -0.48F);
        this.armright3.cubeList.add(new ModelBox(armright3, 30, 34, 0.025F, -1.25F, -1.5F, 0, 2, 3, 0.0F, false));

        this.armlw = new AdvancedModelRenderer(this);
        this.armlw.setRotationPoint(1.75F, 0.65F, -1.9F);
        this.chest.addChild(armlw);


        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armlw.addChild(armleft);
        this.setRotateAngle(armleft, -0.1309F, -0.1309F, 0.2443F);
        this.armleft.cubeList.add(new ModelBox(armleft, 34, 32, -0.25F, -0.5F, -0.5F, 2, 1, 1, 0.01F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(1.75F, -0.5F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, 0.0F, 0.8727F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 0, 38, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, true));
        this.armleft2.cubeList.add(new ModelBox(armleft2, 38, 6, 0.5F, 0.0F, -0.5F, 1, 1, 1, -0.01F, true));

        this.arml3w = new AdvancedModelRenderer(this);
        this.arml3w.setRotationPoint(1.5F, 0.2F, -0.25F);
        this.armleft2.addChild(arml3w);


        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arml3w.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.6109F, -0.1134F, 0.48F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 30, 34, -0.025F, -1.25F, -1.5F, 0, 2, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.5F, -2.5F);
        this.chest.addChild(neck);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.75F, -2.1F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 34, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.75F, 1.725F, -1.1F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 14, -1.0F, -2.0F, -1.0F, 1, 2, 2, -0.01F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 14, -3.5F, -2.0F, -1.0F, 1, 2, 2, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 31, -3.25F, -2.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 3, -1.5F, -0.6F, -2.125F, 3, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 23, -0.5F, -1.0F, -4.5F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 15, -1.0F, -1.0F, -3.525F, 2, 1, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, -4.5F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6981F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 25, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.125F, 0.0F, -3.75F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 27, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.725F, 0.0F, -0.85F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0436F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 36, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.475F, 0.0F, -2.825F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 35, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.725F, 0.0F, -0.85F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0436F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 36, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.475F, 0.0F, -2.825F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.1309F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 35, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.125F, 0.0F, -3.75F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3491F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 27, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.0F, -4.5F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.6981F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 25, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.225F, -2.65F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2138F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 21, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.25F, -1.85F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0393F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 32, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -0.05F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 37, -0.5F, 0.0F, -4.45F, 1, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 30, -1.0F, 0.0F, -3.475F, 2, 1, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 0, -1.5F, -0.6F, -1.975F, 3, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.725F, 1.0F, -0.8F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.0436F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 19, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.475F, 1.0F, -2.775F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1309F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 35, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 1.0F, -4.45F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.6981F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 37, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.125F, 1.0F, -3.7F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3491F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 36, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.725F, 1.0F, -0.8F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0436F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 19, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.475F, 1.0F, -2.775F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.1309F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 35, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.125F, 1.0F, -3.7F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.3491F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 36, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.0F, -4.45F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.6981F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 37, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.25F, -1.2F, -2.2F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, 0.0F, 0.1745F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 1.0F, 0.25F);
        this.eyeright.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.2182F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 34, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.25F, -1.2F, -2.2F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.0F, -0.1745F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 1.0F, 0.25F);
        this.eyeleft.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.2182F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 34, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

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
        //Rotations, positions and sizing:
        this.hips.offsetY = -2.0F;
        this.hips.offsetX = -1.338F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 1.63F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraCaerorhachis entitySilesaurus = (EntityPrehistoricFloraCaerorhachis) e;
        ((EntityPrehistoricFloraCaerorhachis)e).tailBuffer.applyChainSwingBuffer(Tail);

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
        EntityPrehistoricFloraCaerorhachis ee = (EntityPrehistoricFloraCaerorhachis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCaerorhachis entity = (EntityPrehistoricFloraCaerorhachis) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 6.21214 + (((tickAnim - 0) / 13) * (57.83849-(6.21214)));
            yy = -38.7964 + (((tickAnim - 0) / 13) * (71.66789-(-38.7964)));
            zz = -7.2524 + (((tickAnim - 0) / 13) * (43.72662-(-7.2524)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 57.83849 + (((tickAnim - 13) / 8) * (2.23411-(57.83849)));
            yy = 71.66789 + (((tickAnim - 13) / 8) * (10.37449-(71.66789)));
            zz = 43.72662 + (((tickAnim - 13) / 8) * (24.98342-(43.72662)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 2.23411 + (((tickAnim - 21) / 7) * (6.21214-(2.23411)));
            yy = 10.37449 + (((tickAnim - 21) / 7) * (-38.7964-(10.37449)));
            zz = 24.98342 + (((tickAnim - 21) / 7) * (-7.2524-(24.98342)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1.67513 + (((tickAnim - 0) / 13) * (-81.0924-(1.67513)));
            yy = 4.3575 + (((tickAnim - 0) / 13) * (-68.7299-(4.3575)));
            zz = 1.4132 + (((tickAnim - 0) / 13) * (73.7122-(1.4132)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -81.0924 + (((tickAnim - 13) / 4) * (-49-(-81.0924)));
            yy = -68.7299 + (((tickAnim - 13) / 4) * (-71-(-68.7299)));
            zz = 73.7122 + (((tickAnim - 13) / 4) * (26.75-(73.7122)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -49 + (((tickAnim - 17) / 3) * (-49-(-49)));
            yy = -71 + (((tickAnim - 17) / 3) * (-71-(-71)));
            zz = 26.75 + (((tickAnim - 17) / 3) * (26.75-(26.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -49 + (((tickAnim - 20) / 3) * (3.89495-(-49)));
            yy = -71 + (((tickAnim - 20) / 3) * (-64.58933-(-71)));
            zz = 26.75 + (((tickAnim - 20) / 3) * (-5.05961-(26.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 3.89495 + (((tickAnim - 23) / 5) * (1.67513-(3.89495)));
            yy = -64.58933 + (((tickAnim - 23) / 5) * (4.3575-(-64.58933)));
            zz = -5.05961 + (((tickAnim - 23) / 5) * (1.4132-(-5.05961)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.02 + (((tickAnim - 0) / 13) * (0.5-(-0.02)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.075-(0)));
            zz = -0.02 + (((tickAnim - 0) / 13) * (-0.2-(-0.02)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.5 + (((tickAnim - 13) / 4) * (0.35-(0.5)));
            yy = 0.075 + (((tickAnim - 13) / 4) * (0.075-(0.075)));
            zz = -0.2 + (((tickAnim - 13) / 4) * (-0.425-(-0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0.35 + (((tickAnim - 17) / 3) * (0.35-(0.35)));
            yy = 0.075 + (((tickAnim - 17) / 3) * (-0.075-(0.075)));
            zz = -0.425 + (((tickAnim - 17) / 3) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.35 + (((tickAnim - 20) / 3) * (0.295-(0.35)));
            yy = -0.075 + (((tickAnim - 20) / 3) * (0-(-0.075)));
            zz = -0.425 + (((tickAnim - 20) / 3) * (-0.68-(-0.425)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0.295 + (((tickAnim - 23) / 5) * (-0.02-(0.295)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = -0.68 + (((tickAnim - 23) / 5) * (-0.02-(-0.68)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.1457 + (((tickAnim - 0) / 2) * (3.42203-(9.1457)));
            yy = -29.14734 + (((tickAnim - 0) / 2) * (-39.02916-(-29.14734)));
            zz = -5.98686 + (((tickAnim - 0) / 2) * (-12.19553-(-5.98686)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 3.42203 + (((tickAnim - 2) / 1) * (-4.68035-(3.42203)));
            yy = -39.02916 + (((tickAnim - 2) / 1) * (-37.11548-(-39.02916)));
            zz = -12.19553 + (((tickAnim - 2) / 1) * (-8.35061-(-12.19553)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.68035 + (((tickAnim - 3) / 2) * (-7.02817-(-4.68035)));
            yy = -37.11548 + (((tickAnim - 3) / 2) * (-30.30722-(-37.11548)));
            zz = -8.35061 + (((tickAnim - 3) / 2) * (-7.68157-(-8.35061)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.02817 + (((tickAnim - 5) / 3) * (-17.67778-(-7.02817)));
            yy = -30.30722 + (((tickAnim - 5) / 3) * (-29.75073-(-30.30722)));
            zz = -7.68157 + (((tickAnim - 5) / 3) * (-14.5297-(-7.68157)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -17.67778 + (((tickAnim - 8) / 5) * (0-(-17.67778)));
            yy = -29.75073 + (((tickAnim - 8) / 5) * (0-(-29.75073)));
            zz = -14.5297 + (((tickAnim - 8) / 5) * (-42.25-(-14.5297)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0.79766-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.96631-(0)));
            zz = -42.25 + (((tickAnim - 13) / 5) * (-91.16313-(-42.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.79766 + (((tickAnim - 18) / 5) * (-4.60037-(0.79766)));
            yy = 0.96631 + (((tickAnim - 18) / 5) * (-4.43911-(0.96631)));
            zz = -91.16313 + (((tickAnim - 18) / 5) * (-18.53911-(-91.16313)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -4.60037 + (((tickAnim - 23) / 5) * (9.1457-(-4.60037)));
            yy = -4.43911 + (((tickAnim - 23) / 5) * (-29.14734-(-4.43911)));
            zz = -18.53911 + (((tickAnim - 23) / 5) * (-5.98686-(-18.53911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.275-(0)));
            yy = 0.6 + (((tickAnim - 0) / 2) * (0.375-(0.6)));
            zz = -0.15 + (((tickAnim - 0) / 2) * (-0.2-(-0.15)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.275 + (((tickAnim - 2) / 1) * (0.22-(0.275)));
            yy = 0.375 + (((tickAnim - 2) / 1) * (0.035-(0.375)));
            zz = -0.2 + (((tickAnim - 2) / 1) * (-0.18-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.22 + (((tickAnim - 3) / 2) * (0.22-(0.22)));
            yy = 0.035 + (((tickAnim - 3) / 2) * (-0.165-(0.035)));
            zz = -0.18 + (((tickAnim - 3) / 2) * (-0.18-(-0.18)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.22 + (((tickAnim - 5) / 3) * (0.225-(0.22)));
            yy = -0.165 + (((tickAnim - 5) / 3) * (-0.225-(-0.165)));
            zz = -0.18 + (((tickAnim - 5) / 3) * (-0.15-(-0.18)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.225 + (((tickAnim - 8) / 5) * (0.55-(0.225)));
            yy = -0.225 + (((tickAnim - 8) / 5) * (0.65-(-0.225)));
            zz = -0.15 + (((tickAnim - 8) / 5) * (0-(-0.15)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0.55 + (((tickAnim - 13) / 5) * (0.41-(0.55)));
            yy = 0.65 + (((tickAnim - 13) / 5) * (0.72-(0.65)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0.41 + (((tickAnim - 18) / 3) * (0.3-(0.41)));
            yy = 0.72 + (((tickAnim - 18) / 3) * (0.95-(0.72)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0.3 + (((tickAnim - 21) / 7) * (0-(0.3)));
            yy = 0.95 + (((tickAnim - 21) / 7) * (0.6-(0.95)));
            zz = 0 + (((tickAnim - 21) / 7) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 28.6178 + (((tickAnim - 0) / 4) * (2.23411-(28.6178)));
            yy = -35.22069 + (((tickAnim - 0) / 4) * (-10.3745-(-35.22069)));
            zz = -23.71554 + (((tickAnim - 0) / 4) * (-24.9834-(-23.71554)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 2.23411 + (((tickAnim - 4) / 7) * (6.21214-(2.23411)));
            yy = -10.3745 + (((tickAnim - 4) / 7) * (38.7964-(-10.3745)));
            zz = -24.9834 + (((tickAnim - 4) / 7) * (7.2524-(-24.9834)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 6.21214 + (((tickAnim - 11) / 13) * (38.36219-(6.21214)));
            yy = 38.7964 + (((tickAnim - 11) / 13) * (-60.30211-(38.7964)));
            zz = 7.2524 + (((tickAnim - 11) / 13) * (-27.82524-(7.2524)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 38.36219 + (((tickAnim - 24) / 4) * (28.6178-(38.36219)));
            yy = -60.30211 + (((tickAnim - 24) / 4) * (-35.22069-(-60.30211)));
            zz = -27.82524 + (((tickAnim - 24) / 4) * (-23.71554-(-27.82524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 81.0924 + (((tickAnim - 0) / 4) * (-49-(81.0924)));
            yy = 68.72987 + (((tickAnim - 0) / 4) * (71-(68.72987)));
            zz = 73.71215 + (((tickAnim - 0) / 4) * (-26.75-(73.71215)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -49 + (((tickAnim - 4) / 4) * (-49-(-49)));
            yy = 71 + (((tickAnim - 4) / 4) * (71-(71)));
            zz = -26.75 + (((tickAnim - 4) / 4) * (-26.75-(-26.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -49 + (((tickAnim - 8) / 3) * (1.67513-(-49)));
            yy = 71 + (((tickAnim - 8) / 3) * (-4.35748-(71)));
            zz = -26.75 + (((tickAnim - 8) / 3) * (-1.41317-(-26.75)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 1.67513 + (((tickAnim - 11) / 13) * (69.7802-(1.67513)));
            yy = -4.35748 + (((tickAnim - 11) / 13) * (80.64671-(-4.35748)));
            zz = -1.41317 + (((tickAnim - 11) / 13) * (62.04939-(-1.41317)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 69.7802 + (((tickAnim - 24) / 4) * (81.0924-(69.7802)));
            yy = 80.64671 + (((tickAnim - 24) / 4) * (68.72987-(80.64671)));
            zz = 62.04939 + (((tickAnim - 24) / 4) * (73.71215-(62.04939)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.5 + (((tickAnim - 0) / 4) * (-0.35-(-0.5)));
            yy = -0.375 + (((tickAnim - 0) / 4) * (0.075-(-0.375)));
            zz = -0.425 + (((tickAnim - 0) / 4) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.35 + (((tickAnim - 4) / 4) * (-0.35-(-0.35)));
            yy = 0.075 + (((tickAnim - 4) / 4) * (0.075-(0.075)));
            zz = -0.425 + (((tickAnim - 4) / 4) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.35 + (((tickAnim - 8) / 3) * (-0.02-(-0.35)));
            yy = 0.075 + (((tickAnim - 8) / 3) * (0-(0.075)));
            zz = -0.425 + (((tickAnim - 8) / 3) * (-0.02-(-0.425)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = -0.02 + (((tickAnim - 11) / 13) * (-0.5-(-0.02)));
            yy = 0 + (((tickAnim - 11) / 13) * (-0.375-(0)));
            zz = -0.02 + (((tickAnim - 11) / 13) * (-0.425-(-0.02)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -0.5 + (((tickAnim - 24) / 4) * (-0.5-(-0.5)));
            yy = -0.375 + (((tickAnim - 24) / 4) * (-0.375-(-0.375)));
            zz = -0.425 + (((tickAnim - 24) / 4) * (-0.425-(-0.425)));
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
            xx = 31.83908 + (((tickAnim - 0) / 4) * (13.17529-(31.83908)));
            yy = 18.2999 + (((tickAnim - 0) / 4) * (-0.03864-(18.2999)));
            zz = 64.17607 + (((tickAnim - 0) / 4) * (86.92598-(64.17607)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 13.17529 + (((tickAnim - 4) / 4) * (3.64198-(13.17529)));
            yy = -0.03864 + (((tickAnim - 4) / 4) * (-14.27043-(-0.03864)));
            zz = 86.92598 + (((tickAnim - 4) / 4) * (11.1386-(86.92598)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.64198 + (((tickAnim - 8) / 3) * (4.31664-(3.64198)));
            yy = -14.27043 + (((tickAnim - 8) / 3) * (35.12524-(-14.27043)));
            zz = 11.1386 + (((tickAnim - 8) / 3) * (14.52428-(11.1386)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 4.31664 + (((tickAnim - 11) / 2) * (-21.57439-(4.31664)));
            yy = 35.12524 + (((tickAnim - 11) / 2) * (49.5328-(35.12524)));
            zz = 14.52428 + (((tickAnim - 11) / 2) * (-19.43753-(14.52428)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -21.57439 + (((tickAnim - 13) / 1) * (-41.63938-(-21.57439)));
            yy = 49.5328 + (((tickAnim - 13) / 1) * (34.80167-(49.5328)));
            zz = -19.43753 + (((tickAnim - 13) / 1) * (-43.75351-(-19.43753)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -41.63938 + (((tickAnim - 14) / 2) * (-24.94235-(-41.63938)));
            yy = 34.80167 + (((tickAnim - 14) / 2) * (24.03364-(34.80167)));
            zz = -43.75351 + (((tickAnim - 14) / 2) * (-32.21605-(-43.75351)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -24.94235 + (((tickAnim - 16) / 4) * (-27.87706-(-24.94235)));
            yy = 24.03364 + (((tickAnim - 16) / 4) * (22.70913-(24.03364)));
            zz = -32.21605 + (((tickAnim - 16) / 4) * (-13.41711-(-32.21605)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -27.87706 + (((tickAnim - 20) / 4) * (-37.85948-(-27.87706)));
            yy = 22.70913 + (((tickAnim - 20) / 4) * (28.39456-(22.70913)));
            zz = -13.41711 + (((tickAnim - 20) / 4) * (5.04249-(-13.41711)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -37.85948 + (((tickAnim - 24) / 4) * (31.83908-(-37.85948)));
            yy = 28.39456 + (((tickAnim - 24) / 4) * (18.2999-(28.39456)));
            zz = 5.04249 + (((tickAnim - 24) / 4) * (64.17607-(5.04249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.6 + (((tickAnim - 0) / 4) * (-0.5-(-0.6)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.5 + (((tickAnim - 4) / 4) * (0-(-0.5)));
            yy = 1.075 + (((tickAnim - 4) / 4) * (0.6-(1.075)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 8) / 3) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.425-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-0.275-(0)));
            yy = 0.6 + (((tickAnim - 11) / 2) * (0.65-(0.6)));
            zz = -0.425 + (((tickAnim - 11) / 2) * (-0.25-(-0.425)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -0.275 + (((tickAnim - 13) / 1) * (-0.22-(-0.275)));
            yy = 0.65 + (((tickAnim - 13) / 1) * (0.46-(0.65)));
            zz = -0.25 + (((tickAnim - 13) / 1) * (-0.33-(-0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -0.22 + (((tickAnim - 14) / 2) * (-0.11-(-0.22)));
            yy = 0.46 + (((tickAnim - 14) / 2) * (0.38-(0.46)));
            zz = -0.33 + (((tickAnim - 14) / 2) * (0-(-0.33)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.11 + (((tickAnim - 16) / 4) * (-0.275-(-0.11)));
            yy = 0.38 + (((tickAnim - 16) / 4) * (0.425-(0.38)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -0.275 + (((tickAnim - 20) / 4) * (0-(-0.275)));
            yy = 0.425 + (((tickAnim - 20) / 4) * (0.475-(0.425)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (-0.6-(0)));
            yy = 0.475 + (((tickAnim - 24) / 4) * (0-(0.475)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
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
            xx = 28.81893 + (((tickAnim - 0) / 7) * (4.03789-(28.81893)));
            yy = 59.0041 + (((tickAnim - 0) / 7) * (5.4025-(59.0041)));
            zz = 31.1335 + (((tickAnim - 0) / 7) * (31.7949-(31.1335)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 4.03789 + (((tickAnim - 7) / 6) * (18.46315-(4.03789)));
            yy = 5.4025 + (((tickAnim - 7) / 6) * (-59.4183-(5.4025)));
            zz = 31.7949 + (((tickAnim - 7) / 6) * (-2.4881-(31.7949)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 18.46315 + (((tickAnim - 13) / 15) * (28.81893-(18.46315)));
            yy = -59.4183 + (((tickAnim - 13) / 15) * (59.0041-(-59.4183)));
            zz = -2.4881 + (((tickAnim - 13) / 15) * (31.1335-(-2.4881)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.25 + (((tickAnim - 0) / 3) * (15.14545-(25.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-6.59695-(0)));
            zz = -21.5 + (((tickAnim - 0) / 3) * (-36.949-(-21.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 15.14545 + (((tickAnim - 3) / 4) * (0-(15.14545)));
            yy = -6.59695 + (((tickAnim - 3) / 4) * (-6-(-6.59695)));
            zz = -36.949 + (((tickAnim - 3) / 4) * (-30.13-(-36.949)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-4.51168-(0)));
            yy = -6 + (((tickAnim - 7) / 4) * (-10.013-(-6)));
            zz = -30.13 + (((tickAnim - 7) / 4) * (-29.48879-(-30.13)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -4.51168 + (((tickAnim - 11) / 2) * (0-(-4.51168)));
            yy = -10.013 + (((tickAnim - 11) / 2) * (0-(-10.013)));
            zz = -29.48879 + (((tickAnim - 11) / 2) * (0-(-29.48879)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (25.25-(0)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (-21.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.025 + (((tickAnim - 3) / 4) * (0-(-0.025)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -0.2 + (((tickAnim - 3) / 4) * (0-(-0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-0.425-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0.05-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.425 + (((tickAnim - 11) / 2) * (0-(-0.425)));
            yy = 0.05 + (((tickAnim - 11) / 2) * (0-(0.05)));
            zz = 0.1 + (((tickAnim - 11) / 2) * (0-(0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 18.46315 + (((tickAnim - 0) / 14) * (28.81893-(18.46315)));
            yy = 59.41832 + (((tickAnim - 0) / 14) * (-59.0041-(59.41832)));
            zz = 2.48805 + (((tickAnim - 0) / 14) * (-31.1335-(2.48805)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 28.81893 + (((tickAnim - 14) / 7) * (4.03789-(28.81893)));
            yy = -59.0041 + (((tickAnim - 14) / 7) * (-5.40251-(-59.0041)));
            zz = -31.1335 + (((tickAnim - 14) / 7) * (-31.79488-(-31.1335)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 4.03789 + (((tickAnim - 21) / 7) * (18.46315-(4.03789)));
            yy = -5.40251 + (((tickAnim - 21) / 7) * (59.41832-(-5.40251)));
            zz = -31.79488 + (((tickAnim - 21) / 7) * (2.48805-(-31.79488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (21.5-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 25.25 + (((tickAnim - 14) / 4) * (15.14545-(25.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (-6.59695-(0)));
            zz = 21.5 + (((tickAnim - 14) / 4) * (36.94896-(21.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 15.14545 + (((tickAnim - 18) / 3) * (0-(15.14545)));
            yy = -6.59695 + (((tickAnim - 18) / 3) * (0-(-6.59695)));
            zz = 36.94896 + (((tickAnim - 18) / 3) * (30.13-(36.94896)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (-4.51168-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (10.01297-(0)));
            zz = 30.13 + (((tickAnim - 21) / 4) * (-29.48879-(30.13)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -4.51168 + (((tickAnim - 25) / 3) * (0-(-4.51168)));
            yy = 10.01297 + (((tickAnim - 25) / 3) * (0-(10.01297)));
            zz = -29.48879 + (((tickAnim - 25) / 3) * (0-(-29.48879)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0.2-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (-0.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0.2 + (((tickAnim - 18) / 3) * (0-(0.2)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = -0.2 + (((tickAnim - 18) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (-0.425-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0.05-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -0.425 + (((tickAnim - 25) / 3) * (0-(-0.425)));
            yy = 0.05 + (((tickAnim - 25) / 3) * (0-(0.05)));
            zz = 0.1 + (((tickAnim - 25) / 3) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-40))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-6), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*4));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+50))*-0.35 + (((tickAnim - 0) / 6) * (0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+50))*-0.35)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2 + (((tickAnim - 0) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*-0.1 + (((tickAnim - 6) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+60))*-0.2-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*-0.1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2 + (((tickAnim - 6) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+60))*-0.2 + (((tickAnim - 10) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+60))*-0.15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+60))*-0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2 + (((tickAnim - 10) / 4) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+60))*-0.15 + (((tickAnim - 14) / 6) * (0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+60))*-0.15)));
            zz = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2 + (((tickAnim - 14) / 6) * (0.24-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.1 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+130))*-0.35-(0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.1)));
            zz = 0.24 + (((tickAnim - 20) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-60))*0.2-(0.24)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-50))*-1.8), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-4), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-190))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-200))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+50))*6), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-20))*-2.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-120))*10), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+100))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-250))*-10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-10), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-4.61421-(0)));
            yy = 2.25 + (((tickAnim - 0) / 2) * (11.73611-(2.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.0689-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -4.61421 + (((tickAnim - 2) / 1) * (10.89357-(-4.61421)));
            yy = 11.73611 + (((tickAnim - 2) / 1) * (15.57379-(11.73611)));
            zz = -1.0689 + (((tickAnim - 2) / 1) * (2.3402-(-1.0689)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 10.89357 + (((tickAnim - 3) / 11) * (70.94248-(10.89357)));
            yy = 15.57379 + (((tickAnim - 3) / 11) * (9.2937-(15.57379)));
            zz = 2.3402 + (((tickAnim - 3) / 11) * (-25.58679-(2.3402)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 70.94248 + (((tickAnim - 14) / 4) * (134.84957-(70.94248)));
            yy = 9.2937 + (((tickAnim - 14) / 4) * (-73.08982-(9.2937)));
            zz = -25.58679 + (((tickAnim - 14) / 4) * (-72.41068-(-25.58679)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 134.84957 + (((tickAnim - 18) / 3) * (48.35111-(134.84957)));
            yy = -73.08982 + (((tickAnim - 18) / 3) * (-73.05388-(-73.08982)));
            zz = -72.41068 + (((tickAnim - 18) / 3) * (3.01234-(-72.41068)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 48.35111 + (((tickAnim - 21) / 7) * (0-(48.35111)));
            yy = -73.05388 + (((tickAnim - 21) / 7) * (2.25-(-73.05388)));
            zz = 3.01234 + (((tickAnim - 21) / 7) * (0-(3.01234)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml3w, arml3w.rotateAngleX + (float) Math.toRadians(xx), arml3w.rotateAngleY + (float) Math.toRadians(yy), arml3w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.075 + (((tickAnim - 0) / 3) * (-0.15-(-0.075)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = -0.15 + (((tickAnim - 3) / 11) * (0-(-0.15)));
            yy = -0.1 + (((tickAnim - 3) / 11) * (-0.425-(-0.1)));
            zz = 0 + (((tickAnim - 3) / 11) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 14) / 4) * (-0.38-(-0.425)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.465-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = -0.38 + (((tickAnim - 18) / 3) * (-0.325-(-0.38)));
            zz = 0.465 + (((tickAnim - 18) / 3) * (0.375-(0.465)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (-0.075-(0)));
            yy = -0.325 + (((tickAnim - 21) / 7) * (0-(-0.325)));
            zz = 0.375 + (((tickAnim - 21) / 7) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arml3w.rotationPointX = this.arml3w.rotationPointX + (float)(xx);
        this.arml3w.rotationPointY = this.arml3w.rotationPointY - (float)(yy);
        this.arml3w.rotationPointZ = this.arml3w.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 70.94248 + (((tickAnim - 0) / 3) * (134.84957-(70.94248)));
            yy = 9.2937 + (((tickAnim - 0) / 3) * (73.0898-(9.2937)));
            zz = 25.5868 + (((tickAnim - 0) / 3) * (72.4107-(25.5868)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 134.84957 + (((tickAnim - 3) / 4) * (48.35111-(134.84957)));
            yy = 73.0898 + (((tickAnim - 3) / 4) * (73.0539-(73.0898)));
            zz = 72.4107 + (((tickAnim - 3) / 4) * (-3.0123-(72.4107)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 48.35111 + (((tickAnim - 7) / 6) * (0-(48.35111)));
            yy = 73.0539 + (((tickAnim - 7) / 6) * (-6.25-(73.0539)));
            zz = -3.0123 + (((tickAnim - 7) / 6) * (0-(-3.0123)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (20.1286-(0)));
            yy = -6.25 + (((tickAnim - 13) / 6) * (-33.08036-(-6.25)));
            zz = 0 + (((tickAnim - 13) / 6) * (-4.58219-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 20.1286 + (((tickAnim - 19) / 9) * (70.94248-(20.1286)));
            yy = -33.08036 + (((tickAnim - 19) / 9) * (9.2937-(-33.08036)));
            zz = -4.58219 + (((tickAnim - 19) / 9) * (25.5868-(-4.58219)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr3w, armr3w.rotateAngleX + (float) Math.toRadians(xx), armr3w.rotateAngleY + (float) Math.toRadians(yy), armr3w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 3) * (-0.38-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.465-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.38 + (((tickAnim - 3) / 4) * (-0.325-(-0.38)));
            zz = 0.465 + (((tickAnim - 3) / 4) * (0.375-(0.465)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0.46-(0)));
            yy = -0.325 + (((tickAnim - 7) / 3) * (-0.16-(-0.325)));
            zz = 0.375 + (((tickAnim - 7) / 3) * (0.19-(0.375)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.46 + (((tickAnim - 10) / 3) * (-0.075-(0.46)));
            yy = -0.16 + (((tickAnim - 10) / 3) * (0-(-0.16)));
            zz = 0.19 + (((tickAnim - 10) / 3) * (0-(0.19)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.075 + (((tickAnim - 13) / 3) * (0.19-(-0.075)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.09-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0.19 + (((tickAnim - 16) / 3) * (0.16-(0.19)));
            yy = -0.09 + (((tickAnim - 16) / 3) * (-0.18-(-0.09)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0.16 + (((tickAnim - 19) / 9) * (0-(0.16)));
            yy = -0.18 + (((tickAnim - 19) / 9) * (-0.425-(-0.18)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armr3w.rotationPointX = this.armr3w.rotationPointX + (float)(xx);
        this.armr3w.rotationPointY = this.armr3w.rotationPointY - (float)(yy);
        this.armr3w.rotationPointZ = this.armr3w.rotationPointZ + (float)(zz);

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCaerorhachis entity = (EntityPrehistoricFloraCaerorhachis) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-30))*14), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(12), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*10), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-12), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-80))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*29), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-2));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(64.68148), legright.rotateAngleY + (float) Math.toRadians(73.2557+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*5), legright.rotateAngleZ + (float) Math.toRadians(-14.7456));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(25.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+200))*-10));
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(0), legright3.rotateAngleY + (float) Math.toRadians(0), legright3.rotateAngleZ + (float) Math.toRadians(-71.5));
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(0.325);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(0);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(0);
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(64.68148), legleft.rotateAngleY + (float) Math.toRadians(-73.2557+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*5), legleft.rotateAngleZ + (float) Math.toRadians(14.74561));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(-25.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*10));
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(0), legleft3.rotateAngleY + (float) Math.toRadians(0), legleft3.rotateAngleZ + (float) Math.toRadians(71.5));
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(-0.325);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(0);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-80))*-15), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*9), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-2));
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(70.75), armright.rotateAngleY + (float) Math.toRadians(44+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*10), armright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0), armright2.rotateAngleY + (float) Math.toRadians(0), armright2.rotateAngleZ + (float) Math.toRadians(9.5));
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(-29.75), armright3.rotateAngleY + (float) Math.toRadians(0), armright3.rotateAngleZ + (float) Math.toRadians(-49.5));
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(0);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(0);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(0.2);
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(70.75), armleft.rotateAngleY + (float) Math.toRadians(-44+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*10), armleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0), armleft2.rotateAngleY + (float) Math.toRadians(0), armleft2.rotateAngleZ + (float) Math.toRadians(-9.5));
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(-29.75), armleft3.rotateAngleY + (float) Math.toRadians(0), armleft3.rotateAngleZ + (float) Math.toRadians(49.5));
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(0);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(0);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(0.2);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*9), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-9), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCaerorhachis entity = (EntityPrehistoricFloraCaerorhachis) entitylivingbaseIn;


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaerorhachis entity = (EntityPrehistoricFloraCaerorhachis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.24767-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.0763-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.49917-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1.24767 + (((tickAnim - 8) / 4) * (-5.25-(1.24767)));
            yy = 0.0763 + (((tickAnim - 8) / 4) * (0-(0.0763)));
            zz = -3.49917 + (((tickAnim - 8) / 4) * (2.5-(-3.49917)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -5.25 + (((tickAnim - 12) / 4) * (-0.5-(-5.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 2.5 + (((tickAnim - 12) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 16) / 4) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 2.5 + (((tickAnim - 16) / 4) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-4.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.25 + (((tickAnim - 8) / 4) * (-9.25-(4.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -4.75 + (((tickAnim - 8) / 4) * (0-(-4.75)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -9.25 + (((tickAnim - 12) / 4) * (-21.5-(-9.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -21.5 + (((tickAnim - 16) / 4) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 8) / 4) * (0-(17.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (27-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 27 + (((tickAnim - 16) / 2) * (0-(27)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCaerorhachis e = (EntityPrehistoricFloraCaerorhachis) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
